package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartAxisRendererBase extends ChartRenderer {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartAxisRendererBase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartAxisRendererBase alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ChartAxisRendererBase allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * base axis this axis renderer works with
     */
    @Generated
    @Selector("axis")
    public native ChartAxisBase axis();

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

    /**
     * Sets up the axis values. Computes the desired number of labels between the two given extremes.
     */
    @Generated
    @Selector("computeAxisValuesWithMin:max:")
    public native void computeAxisValuesWithMinMax(double min, double max);

    /**
     * Computes the axis values.
     * \param min the minimum value in the data object for this axis
     * 
     * \param max the maximum value in the data object for this axis
     */
    @Generated
    @Selector("computeAxisWithMin:max:inverted:")
    public native void computeAxisWithMinMaxInverted(double min, double max, boolean inverted);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartAxisRendererBase init();

    @Generated
    @Selector("initWithViewPortHandler:")
    public native ChartAxisRendererBase initWithViewPortHandler(ChartViewPortHandler viewPortHandler);

    @Generated
    @Selector("initWithViewPortHandler:transformer:axis:")
    public native ChartAxisRendererBase initWithViewPortHandlerTransformerAxis(ChartViewPortHandler viewPortHandler,
            ChartTransformer transformer, ChartAxisBase axis);

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ChartAxisRendererBase new_objc();

    /**
     * Draws the axis labels on the specified context
     */
    @Generated
    @Selector("renderAxisLabelsWithContext:")
    public native void renderAxisLabelsWithContext(CGContextRef context);

    /**
     * Draws the line that goes alongside the axis.
     */
    @Generated
    @Selector("renderAxisLineWithContext:")
    public native void renderAxisLineWithContext(CGContextRef context);

    /**
     * Draws the grid lines belonging to the axis.
     */
    @Generated
    @Selector("renderGridLinesWithContext:")
    public native void renderGridLinesWithContext(CGContextRef context);

    /**
     * Draws the LimitLines associated with this axis to the screen.
     */
    @Generated
    @Selector("renderLimitLinesWithContext:")
    public native void renderLimitLinesWithContext(CGContextRef context);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * base axis this axis renderer works with
     */
    @Generated
    @Selector("setAxis:")
    public native void setAxis(ChartAxisBase value);

    /**
     * transformer to transform values to screen pixels and return
     */
    @Generated
    @Selector("setTransformer:")
    public native void setTransformer(ChartTransformer value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * transformer to transform values to screen pixels and return
     */
    @Generated
    @Selector("transformer")
    public native ChartTransformer transformer();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}