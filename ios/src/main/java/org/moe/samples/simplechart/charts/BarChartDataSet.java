package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IBarChartDataSet;
import org.moe.samples.simplechart.charts.protocol.IChartValueFormatter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts15BarChartDataSet")
@ObjCClassBinding
public class BarChartDataSet extends BarLineScatterCandleBubbleChartDataSet implements IBarChartDataSet {
    static {
        NatJ.register();
    }

    @Generated
    protected BarChartDataSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addColor:")
    public native void addColor(UIColor color);

    @Generated
    @Selector("addEntry:")
    public native boolean addEntry(ChartDataEntry e);

    @Generated
    @Selector("addEntryOrdered:")
    public native boolean addEntryOrdered(ChartDataEntry e);

    @Generated
    @Owned
    @Selector("alloc")
    public static native BarChartDataSet alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BarChartDataSet allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("axisDependency")
    public native long axisDependency();

    @Generated
    @Selector("barBorderColor")
    public native UIColor barBorderColor();

    @Generated
    @Selector("barBorderWidth")
    public native double barBorderWidth();

    @Generated
    @Selector("barShadowColor")
    public native UIColor barShadowColor();

    @Generated
    @Selector("calcMinMax")
    public native void calcMinMax();

    @Generated
    @Selector("calcMinMaxYFromX:toX:")
    public native void calcMinMaxYFromXToX(double fromX, double toX);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clear")
    public native void clear();

    @Generated
    @Selector("colorAtIndex:")
    public native UIColor colorAtIndex(long atIndex);

    @Generated
    @Selector("colors")
    public native NSArray<? extends UIColor> colors();

    @Generated
    @Selector("contains:")
    public native boolean contains(ChartDataEntry e);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("drawIconsEnabled")
    public native boolean drawIconsEnabled();

    @Generated
    @Selector("drawValuesEnabled")
    public native boolean drawValuesEnabled();

    @Generated
    @Selector("entriesForXValue:")
    public native NSArray<? extends ChartDataEntry> entriesForXValue(double xValue);

    @Generated
    @Selector("entryCount")
    public native long entryCount();

    /**
     * The overall entry count, including counting each stack-value individually
     */
    @Generated
    @Selector("entryCountStacks")
    public native long entryCountStacks();

    @Generated
    @Selector("entryForIndex:")
    public native ChartDataEntry entryForIndex(long i);

    @Generated
    @Selector("entryForXValue:closestToY:")
    public native ChartDataEntry entryForXValueClosestToY(double xValue, double yValue);

    @Generated
    @Selector("entryForXValue:closestToY:rounding:")
    public native ChartDataEntry entryForXValueClosestToYRounding(double xValue, double yValue, long rounding);

    @Generated
    @Selector("entryIndexWithEntry:")
    public native long entryIndexWithEntry(ChartDataEntry e);

    @Generated
    @Selector("entryIndexWithX:closestToY:rounding:")
    public native long entryIndexWithXClosestToYRounding(double xValue, double yValue, long rounding);

    @Generated
    @Selector("form")
    public native long form();

    @Generated
    @Selector("formLineDashLengths")
    public native NSArray<? extends NSNumber> formLineDashLengths();

    @Generated
    @Selector("formLineDashPhase")
    public native double formLineDashPhase();

    @Generated
    @Selector("formLineWidth")
    public native double formLineWidth();

    @Generated
    @Selector("formSize")
    public native double formSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("highlightAlpha")
    public native double highlightAlpha();

    @Generated
    @Selector("highlightColor")
    public native UIColor highlightColor();

    @Generated
    @Selector("highlightEnabled")
    public native boolean highlightEnabled();

    @Generated
    @Selector("highlightLineDashLengths")
    public native NSArray<? extends NSNumber> highlightLineDashLengths();

    @Generated
    @Selector("highlightLineDashPhase")
    public native double highlightLineDashPhase();

    @Generated
    @Selector("highlightLineWidth")
    public native double highlightLineWidth();

    @Generated
    @Selector("iconsOffset")
    @ByValue
    public native CGPoint iconsOffset();

    @Generated
    @Selector("init")
    public native BarChartDataSet init();

    @Generated
    @Selector("initWithEntries:")
    public native BarChartDataSet initWithEntries(NSArray<? extends ChartDataEntry> entries);

    @Generated
    @Selector("initWithEntries:label:")
    public native BarChartDataSet initWithEntriesLabel(NSArray<? extends ChartDataEntry> entries, String label);

    @Generated
    @Selector("initWithLabel:")
    public native BarChartDataSet initWithLabel(String label);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isDrawIconsEnabled")
    public native boolean isDrawIconsEnabled();

    @Generated
    @Selector("isDrawValuesEnabled")
    public native boolean isDrawValuesEnabled();

    @Generated
    @Selector("isHighlightEnabled")
    public native boolean isHighlightEnabled();

    @Generated
    @Selector("isStacked")
    public native boolean isStacked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isVisible")
    public native boolean isVisible();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Selector("needsFormatter")
    public native boolean needsFormatter();

    @Generated
    @Owned
    @Selector("new")
    public static native BarChartDataSet new_objc();

    @Generated
    @Selector("notifyDataSetChanged")
    public native void notifyDataSetChanged();

    @Generated
    @Selector("removeEntry:")
    public native boolean removeEntry(ChartDataEntry entry);

    @Generated
    @Selector("removeEntryWithIndex:")
    public native boolean removeEntryWithIndex(long index);

    @Generated
    @Selector("removeEntryWithX:")
    public native boolean removeEntryWithX(double x);

    @Generated
    @Selector("removeFirst")
    public native boolean removeFirst();

    @Generated
    @Selector("removeLast")
    public native boolean removeLast();

    @Generated
    @Selector("resetColors")
    public native void resetColors();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setBarBorderColor:")
    public native void setBarBorderColor(UIColor value);

    @Generated
    @Selector("setBarBorderWidth:")
    public native void setBarBorderWidth(double value);

    @Generated
    @Selector("setBarShadowColor:")
    public native void setBarShadowColor(UIColor value);

    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor color);

    @Generated
    @Selector("setDrawIconsEnabled:")
    public native void setDrawIconsEnabled(boolean value);

    @Generated
    @Selector("setDrawValuesEnabled:")
    public native void setDrawValuesEnabled(boolean value);

    @Generated
    @Selector("setHighlightAlpha:")
    public native void setHighlightAlpha(double value);

    @Generated
    @Selector("setHighlightColor:")
    public native void setHighlightColor(UIColor value);

    @Generated
    @Selector("setHighlightEnabled:")
    public native void setHighlightEnabled(boolean value);

    @Generated
    @Selector("setHighlightLineDashLengths:")
    public native void setHighlightLineDashLengths(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setHighlightLineDashPhase:")
    public native void setHighlightLineDashPhase(double value);

    @Generated
    @Selector("setHighlightLineWidth:")
    public native void setHighlightLineWidth(double value);

    @Generated
    @Selector("setIconsOffset:")
    public native void setIconsOffset(@ByValue CGPoint value);

    @Generated
    @Selector("setStackLabels:")
    public native void setStackLabels(NSArray<String> value);

    @Generated
    @Selector("setValueFont:")
    public native void setValueFont(UIFont value);

    @Generated
    @Selector("setValueFormatter:")
    public native void setValueFormatter(@Mapped(ObjCObjectMapper.class) IChartValueFormatter value);

    @Generated
    @Selector("setValueTextColor:")
    public native void setValueTextColor(UIColor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("setVisible:")
    public native void setVisible(boolean value);

    @Generated
    @Selector("stackLabels")
    public native NSArray<String> stackLabels();

    @Generated
    @Selector("stackSize")
    public native long stackSize();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("valueColors")
    public native NSArray<? extends UIColor> valueColors();

    @Generated
    @Selector("valueFont")
    public native UIFont valueFont();

    @Generated
    @Selector("valueFormatter")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartValueFormatter valueFormatter();

    @Generated
    @Selector("valueTextColor")
    public native UIColor valueTextColor();

    @Generated
    @Selector("valueTextColorAt:")
    public native UIColor valueTextColorAt(long index);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("visible")
    public native boolean visible();

    @Generated
    @Selector("xMax")
    public native double xMax();

    @Generated
    @Selector("xMin")
    public native double xMin();

    @Generated
    @Selector("yMax")
    public native double yMax();

    @Generated
    @Selector("yMin")
    public native double yMin();
}