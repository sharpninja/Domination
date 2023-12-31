// Yura Mamyrin, Group D

package net.yura.domination.ui.swinggui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import net.yura.domination.engine.Risk;
import net.yura.domination.guishared.RiskUIUtil;
import net.yura.domination.engine.core.Card;
import net.yura.domination.engine.core.Country;
import net.yura.domination.engine.core.RiskGame;
import net.yura.swing.GraphicsUtil;
import net.yura.domination.guishared.PicturePanel;
import net.yura.domination.engine.translation.TranslationBundle;

/**
 * <p> Cards Dialog for Swing GUI </p>
 * @author Yura Mamyrin
 */
public class CardsDialog extends JDialog {

    private Risk myrisk;
    private JPanel CardsPanel;
    private JPanel TradePanel;
    private JScrollPane CardsPlane;
    private BufferedImage Infantry;
    private BufferedImage Cavalry;
    private BufferedImage Artillery;
    private BufferedImage Wildcard;
    private JButton tradeButton;
    private boolean canTrade;
    private JLabel getNum;
    private PicturePanel pp;

    java.util.ResourceBundle resb = null;

    /**
     * Creates a new CardsDialog
     * @param parent decides the parent of the frame
     * @param modal
     * @param r the risk main program
     */
    public CardsDialog(Frame parent, PicturePanel p, boolean modal, Risk r) {
        super(parent, modal);
	myrisk = r;
	pp=p;

	resb = TranslationBundle.getBundle();

	tradeButton = new JButton(resb.getString("cards.trade"));

	// Toolkit.getDefaultToolkit().getImage( "" );

        Infantry = RiskUIUtil.getUIImage( this.getClass(),"infantry.gif" );
        Cavalry = RiskUIUtil.getUIImage( this.getClass(),"cavalry.gif" );
        Artillery = RiskUIUtil.getUIImage( this.getClass(),"artillery.gif" );
        Wildcard = RiskUIUtil.getUIImage( this.getClass(),"wildcard.gif" );

	CardsPanel = new JPanel();
	CardsPanel.setLayout(GraphicsUtil.newFlowLayout(java.awt.FlowLayout.LEFT));

	TradePanel = new JPanel();
	TradePanel.setLayout(GraphicsUtil.newFlowLayout(java.awt.FlowLayout.LEFT));

        initGUI();
        pack();
    }

    /** This method is called from within the constructor to initialize the dialog. */
    private void initGUI() {
        setTitle(resb.getString("cards.title"));
        setResizable(false);

	getNum = new JLabel();
	getNum.setText( getNumArmies() );

	JTextArea note = new JTextArea(resb.getString("cards.note"));
        note.setLineWrap(true);
        note.setWrapStyleWord(true);
        note.setBackground(RiskUIUtil.getColorFromColorUIResource(getNum.getBackground()));
        note.setForeground(getNum.getForeground());
        note.setFont((new JLabel()).getFont());
        note.setEditable(false);
	note.setOpaque(false);
        note.setBorder(null); // for nimbus        

        // this is needed for windows, as the font is a lot thinner and 15em is too small
        note.setColumns(GraphicsUtil.scale(190) / note.getFontMetrics(note.getFont()).charWidth('m')); // 15 or sometimes mores

        // we need to trigger JTextArea to work out its height for JDialog.pack() to work
        // we can pass any number as the height, it will get re-calculated
        note.setSize(note.getPreferredSize());

	JButton okButton = new JButton(resb.getString("cards.done"));
	okButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    dispose();
                }
            }
	);

	tradeButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {

		    myrisk.parser("trade "+((CardPanel)TradePanel.getComponent(0)).getCardName() + " " + ((CardPanel)TradePanel.getComponent(1)).getCardName() + " " + ((CardPanel)TradePanel.getComponent(2)).getCardName() );

		    TradePanel.remove(TradePanel.getComponent(2));
		    TradePanel.remove(TradePanel.getComponent(1));
		    TradePanel.remove(TradePanel.getComponent(0));

		    TradePanel.repaint();
		    TradePanel.validate();

		    getNum.setText( getNumArmies() );
		    tradeButton.setEnabled(false);
                }
            }
	);


	CardsPlane = new JScrollPane();
        CardsPlane.setOpaque(false); // this is needed as without it, the colors looks wrong on os x

	CardsPlane.getViewport().add(CardsPanel);

	Dimension CardsPlaneSize = GraphicsUtil.newDimension(540, 200);
	CardsPlane.setBorder(javax.swing.BorderFactory.createTitledBorder(resb.getString("cards.yourcards")));
        setPanelSize(CardsPlane, CardsPlaneSize);

	Dimension TradePlaneSize = GraphicsUtil.newDimension(320, 180);
	TradePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resb.getString("cards.trade")));
        setPanelSize(TradePanel, TradePlaneSize);

	JPanel other = new JPanel(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.insets = GraphicsUtil.newInsets(3, 3, 3, 3);
        //c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 1.0; // this is needed for the buttons on Linux, not sure why
        c.weighty = 1.0;

        c.gridx = 0; // col
        c.gridy = 0; // row
        c.gridwidth = 2; // width
        c.gridheight = 1; // height
	other.add(note, c);

        c.gridx = 0; // col
        c.gridy = 1; // row
        c.gridwidth = 2; // width
        c.gridheight = 1; // height
        c.anchor = GridBagConstraints.SOUTH;
	other.add(getNum, c);

        c.gridx = 0; // col
        c.gridy = 2; // row
        c.gridwidth = 1; // width
        c.gridheight = 1; // height
        c.anchor = GridBagConstraints.EAST;
	other.add(tradeButton, c);

        c.gridx = 1; // col
        c.gridy = 2; // row
        c.gridwidth = 1; // width
        c.gridheight = 1; // height
        c.anchor = GridBagConstraints.WEST;
	other.add(okButton, c);


        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 0.0;
        getContentPane().setLayout(new GridBagLayout());

        c.gridx = 0; // col
        c.gridy = 0; // row
        c.gridwidth = 2; // width
        c.gridheight = 1; // height
        getContentPane().add(CardsPlane, c);

        c.gridx = 0; // col
        c.gridy = 1; // row
        c.gridwidth = 1; // width
        c.gridheight = 1; // height
        getContentPane().add(TradePanel, c);

        c.gridx = 1; // col
        c.gridy = 1; // row
        c.gridwidth = 1; // width
        c.gridheight = 1; // height
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(other, c);

        addWindowListener(
            new java.awt.event.WindowAdapter() {
                public void windowClosing(WindowEvent evt) {
                    closeDialog(evt);
                }
            }
	);
    }
    
    private static void setPanelSize(JComponent panel, Dimension size) {
        Insets border = panel.getInsets();
        Dimension newSize = new Dimension(size.width + border.left + border.right, size.height + border.top + border.bottom);
        panel.setPreferredSize(newSize);
	panel.setMinimumSize(newSize);
	panel.setMaximumSize(newSize);
    }

    public void populate(List cards, boolean ct) {
        canTrade = ct;
        tradeButton.setEnabled(false);
	for (int c=0; c < cards.size(); c++) {
	    JPanel cp = new CardPanel( (Card)cards.get(c) );
	    CardsPanel.add(cp);
	}
    }

    public String getNumArmies() {
	// return " Next trade recieve " + myrisk.getNewCardState() + " troops";
	if (myrisk.getGame().getCardMode()==RiskGame.CARD_FIXED_SET) {
            return resb.getString("cards.fixed");
	}
        else if (myrisk.getGame().getCardMode()==RiskGame.CARD_ITALIANLIKE_SET) {
            return resb.getString("cards.italianlike");
	}
	else {
            return resb.getString("cards.nexttrade").replaceAll( "\\{0\\}", "" + myrisk.getNewCardState());
	}
    }

    class CardPanel extends JPanel implements MouseListener {

	private Card card;
	private BufferedImage grayImage;
	private BufferedImage highlightImage;
	private boolean select;

	public CardPanel (Card c) {
	    card=c;

	    this.addMouseListener(this);

	    int cardWidth=100;
	    int cardHeight=170;

	    select=false;

	    Dimension CardSize = GraphicsUtil.newDimension(cardWidth, cardHeight);
	    this.setPreferredSize( CardSize );
	    this.setMinimumSize( CardSize );
	    this.setMaximumSize( CardSize );

	    this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));

	    grayImage = new BufferedImage(CardSize.width, CardSize.height, java.awt.image.BufferedImage.TYPE_INT_RGB );
	    Graphics2D g2 = grayImage.createGraphics();

	    g2.setColor( Color.lightGray );
	    g2.fillRect(0, 0, grayImage.getWidth(), grayImage.getHeight());

            g2.setFont(getFont());
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // this is NEEDED for mac or its REALLY ugly

	    if (!(card.getName().equals("wildcard"))) {

		g2.setColor( Color.black );
                String countryName = card.getCountry().getName();
                // as we use SwingGUI for debugging, allow the display of broken game state
                GraphicsUtil.drawStringCenteredAt(g2, countryName == null ? "ERROR" : countryName, cardWidth / 2, 15);

                int countryId = card.getCountry().getColor();
                if (countryId > 0) { // this should never happen unless there is a broken game state
                    BufferedImage pictureB = pp.getCountryImage(countryId, false);

                    int width = pictureB.getWidth();
                    int height = pictureB.getHeight();

                    if (width > 50) { width=50; }
                    if (height > 50) { height=50; }

                    Image i = pictureB.getScaledInstance(width,height, java.awt.Image.SCALE_SMOOTH );

                    GraphicsUtil.drawImage(g2, i, 25 + (25 - (i.getWidth(this) / 2)), 25 + (25 - (i.getHeight(this) / 2)), null);
                }

		if (card.getName().equals("Infantry")) {
		    GraphicsUtil.drawImage(g2, Infantry, 15, 85, null);
		}
		else if (card.getName().equals("Cavalry")) {
		    GraphicsUtil.drawImage(g2, Cavalry, 15, 85, null);
		}
		else if (card.getName().equals("Cannon")) {
		    GraphicsUtil.drawImage(g2, Artillery, 15, 85, null);
		}

	    }
	    else {
                GraphicsUtil.drawImage(g2, Wildcard, 20, 8, null);
	    }

	    g2.setColor( Color.black );
            GraphicsUtil.drawStringCenteredAt(g2, card.getName(), cardWidth / 2, 160);

	    highlightImage = new BufferedImage(grayImage.getWidth(), grayImage.getHeight(), java.awt.image.BufferedImage.TYPE_INT_RGB );

	    RescaleOp HighLight = new RescaleOp(1.5f, 1.0f, null);
	    HighLight.filter( grayImage , highlightImage );

	    g2.dispose();
	}

	public void paintComponent(Graphics g) {

	    super.paintComponent(g);

	    if (select) { g.drawImage( highlightImage ,0 ,0 ,this ); }
	    else { g.drawImage( grayImage ,0 ,0 ,this ); }
	}

	public String getCardName() {

	    if (!(card.getName().equals( Card.WILDCARD ))) { return ((Country)card.getCountry()).getColor()+""; }
	    else { return card.getName(); }
	}

	//**********************************************************************
	//                     MouseListener Interface
	//**********************************************************************

	public void mouseClicked(MouseEvent e) {

	    if ( this.getParent() == CardsPanel ) {
		if (TradePanel.getComponentCount() < 3) {
                    CardsPanel.remove(this); 
                    select=false;
                    TradePanel.add(this);
		}
		if (TradePanel.getComponentCount() == 3 && canTrade && myrisk.canTrade( ((CardPanel)TradePanel.getComponent(0)).getCardName() , ((CardPanel)TradePanel.getComponent(1)).getCardName(), ((CardPanel)TradePanel.getComponent(2)).getCardName() ) ) {
                    tradeButton.setEnabled(true);
		}
	    }
	    else if ( this.getParent() == TradePanel ) {
		TradePanel.remove(this); select=false; CardsPanel.add(this);
		tradeButton.setEnabled(false);
	    }

	    CardsPanel.repaint();
	    TradePanel.repaint();

	    CardsPanel.validate();
	    TradePanel.validate();

	    CardsPlane.validate();
	}

	public void mouseEntered(MouseEvent e) {
	    select=true;
	    this.repaint();
	}

	public void mouseExited(MouseEvent e) {
	    select=false;
	    this.repaint();
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
    }

    /** Closes the dialog */
    private void closeDialog(WindowEvent evt) {
        setVisible(false);
        dispose();
    }
}
