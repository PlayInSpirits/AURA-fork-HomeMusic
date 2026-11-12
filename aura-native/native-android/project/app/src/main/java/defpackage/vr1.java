package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Looper
 *  android.text.Layout
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.webkit.MimeTypeMap
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public abstract class vr1 {
    public static final f01 a = new f01(1, "RESUME_TOKEN");
    public static final byte[] b = new byte[4096];

    public vr1() {
        new ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static yc4 A(ContentResolver object, Uri object2, String string, String object3) {
        long l16;
        Object object4;
        Object var12_4;
        block44: {
            block43: {
                block42: {
                    block41: {
                        Object object5;
                        block40: {
                            block36: {
                                long l17;
                                block35: {
                                    Cursor cursor;
                                    block38: {
                                        block39: {
                                            block37: {
                                                int n16;
                                                object2.getClass();
                                                var12_4 = null;
                                                l17 = -1L;
                                                try {
                                                    cursor = object.query((Uri)object2, new String[]{"_display_name", "_size"}, null, null, null);
                                                    if (cursor == null) break block35;
                                                }
                                                catch (Exception exception) {
                                                    object4 = null;
                                                    l16 = l17;
                                                    break block36;
                                                }
                                                try {
                                                    if (cursor.moveToFirst()) {
                                                        int n17 = cursor.getColumnIndex("_display_name");
                                                        n16 = cursor.getColumnIndex("_size");
                                                        object5 = n17 >= 0 ? cursor.getString(n17) : null;
                                                    }
                                                    break block37;
                                                }
                                                catch (Throwable throwable) {
                                                    object4 = null;
                                                    break block38;
                                                }
                                                l16 = l17;
                                                object4 = object5;
                                                if (n16 >= 0) {
                                                    l16 = l17;
                                                    object4 = object5;
                                                    try {
                                                        if (!cursor.isNull(n16)) {
                                                            l16 = cursor.getLong(n16);
                                                            object4 = object5;
                                                        }
                                                        break block39;
                                                    }
                                                    catch (Throwable throwable) {
                                                        object4 = object5;
                                                        object5 = throwable;
                                                        break block38;
                                                    }
                                                }
                                                break block39;
                                            }
                                            object4 = null;
                                            l16 = l17;
                                        }
                                        try {
                                            cursor.close();
                                            object5 = object4;
                                            break block40;
                                        }
                                        catch (Exception exception) {
                                            break block36;
                                        }
                                    }
                                    try {
                                        throw object5;
                                    }
                                    catch (Throwable throwable) {
                                        try {
                                            q05.h((Closeable)cursor, (Throwable)object5);
                                            throw throwable;
                                        }
                                        catch (Exception exception) {
                                            l16 = l17;
                                            break block36;
                                        }
                                    }
                                }
                                object5 = null;
                                l16 = l17;
                                break block40;
                            }
                            StringBuilder stringBuilder = new StringBuilder("Cannot query ");
                            stringBuilder.append(object2);
                            Log.w((String)"SharedFile", (String)stringBuilder.toString(), (Throwable)object5);
                            object5 = object4;
                        }
                        if (object5 == null) break block41;
                        object4 = object5;
                        if (!qm4.u0((CharSequence)object5)) break block42;
                    }
                    object4 = (object4 = object2.getLastPathSegment()) != null ? qm4.G0((String)object4, '/', (String)object4) : null;
                }
                object = object2 = object.getType((Uri)object2);
                if (object2 != null) break block43;
                object2 = MimeTypeMap.getSingleton();
                if (object4 != null) {
                    object = qm4.G0((String)object4, '.', "").toLowerCase(Locale.ROOT);
                    object.getClass();
                } else {
                    object = null;
                }
                object = object2 = object2.getMimeTypeFromExtension((String)object);
                if (object2 == null) break block44;
            }
            string = object;
        }
        object = object3;
        if (object4 != null) {
            object = var12_4;
            if (!qm4.u0((CharSequence)object4)) {
                object = object4;
            }
            if (object == null) {
                object = object3;
            }
        }
        object3 = object;
        if (!qm4.n0((CharSequence)object, '.')) {
            object2 = object3 = (String)yc4.d.get(string);
            if (object3 == null) {
                object2 = MimeTypeMap.getSingleton().getExtensionFromMimeType((String)string);
            }
            object3 = object;
            if (object2 != null) {
                object3 = b11.o((String)object, ".", (String)object2);
            }
        }
        return new yc4((String)object3, l16, (String)string);
    }

    public static PorterDuff.Mode B(int n16, PorterDuff.Mode mode) {
        if (n16 != 3) {
            if (n16 != 5) {
                if (n16 != 9) {
                    switch (n16) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final Object C(mf3 mf32, qr3 qr32) {
        Object object;
        qr32.getClass();
        Object object2 = object = mf32.get(qr32);
        if (object == null) {
            object2 = qr32.b();
        }
        return ((j35)object2).a(mf32);
    }

    public static int D(InputStream inputStream, byte[] byArray, int n16, int n17) {
        if (n17 >= 0 && n16 >= 0 && n17 + n16 <= byArray.length) {
            int n18;
            int n19;
            for (n18 = 0; n18 != n17 && (n19 = inputStream.read(byArray, n16 + n18, n17 - n18)) != -1; n18 += n19) {
            }
            return n18;
        }
        throw new IndexOutOfBoundsException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int E(InputStream inputStream) {
        byte[] byArray = new byte[8];
        if (inputStream.read(byArray) >= 8) {
            byte by = byArray[7];
            int n16 = (((((((by & 0x7F) * 256 + (byArray[6] & 0xFF)) * 256 + (byArray[5] & 0xFF)) * 256 + (byArray[4] & 0xFF)) * 256 + (byArray[3] & 0xFF)) * 256 + (byArray[2] & 0xFF)) * 256 + (byArray[1] & 0xFF)) * 256 + (byArray[0] & 0xFF);
            if (n16 >= 0) {
                if ((by & 0x80) == 0) return n16;
                return -n16;
            }
            mj0.i("Integer overflow: 64-bit offsets not supported.");
            return 0;
        }
        mj0.i("Could not read offset.");
        return 0;
    }

    public static final dx2 F(dx2 dx22, lm0 lm02, tb tb6, boolean bl5, gd3 gd32, rm2 rm22, ec3 ec32) {
        sp1 sp12 = sp1.b;
        return dx22.c(au0.G(ax2.a, sp12, 1042431)).c(new r64(lm02, bl5, gd32, rm22, ec32, tb6));
    }

    public static long G(InputStream inputStream, long l16) {
        long l17;
        long l18 = l16;
        while (true) {
            l17 = l18;
            if (l18 <= 0L) break;
            l17 = inputStream.skip(l18);
            if (l17 == 0L) {
                l17 = l18;
                break;
            }
            l18 -= l17;
        }
        while (l17 > 0L) {
            int n16 = (int)Math.min(l17, 4096L);
            if ((n16 = vr1.D(inputStream, b, 0, n16)) < 1) break;
            l17 -= (long)n16;
        }
        return l16 - l17;
    }

    public static String H(long l16) {
        StringBuilder stringBuilder = new StringBuilder("PointerId(value=");
        stringBuilder.append(l16);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final mf3 I(rr3[] rr3Array, mf3 mf32, mf3 mf33) {
        lf3 lf32 = new lf3(mf3.q);
        for (rr3 rr32 : rr3Array) {
            qr3 qr32 = rr32.a;
            if (!rr32.g && mf32.containsKey(qr32)) continue;
            lf32.put(qr32, qr32.d(rr32, (j35)mf33.get(qr32)));
        }
        return lf32.a();
    }

    /*
     * Exception decompiling
     */
    public static final ak5 J(ck5 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [10 : 169->180)] java.lang.RuntimeException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static final void K(byte by, long l16) {
        block6: {
            switch (by) {
                default: {
                    break;
                }
                case 27: {
                    if (l16 >= 0x100000000L) break;
                    tb4.b(l16, " after add info could have been represented in 0-4 additional bytes, but used 8");
                    return;
                }
                case 26: {
                    if (l16 >= 65536L) break;
                    tb4.b(l16, " after add info could have been represented in 0-2 additional bytes, but used 4");
                    return;
                }
                case 25: {
                    if (l16 >= 256L) break;
                    tb4.b(l16, " after add info could have been represented in 0-1 additional bytes, but used 2");
                    return;
                }
                case 24: {
                    if (l16 < 24L) break block6;
                }
            }
            return;
        }
        tb4.b(l16, " after add info could have been represented in 0 additional bytes, but used 1");
    }

    public static Rect c(View view, View view2) {
        int[] nArray = new int[2];
        view2.getLocationOnScreen(nArray);
        int n16 = nArray[0];
        int n17 = nArray[1];
        nArray = new int[2];
        view.getLocationOnScreen(nArray);
        int n18 = nArray[0];
        int n19 = nArray[1];
        n18 = n16 - n18;
        return new Rect(n18, n17 -= n19, view2.getWidth() + n18, view2.getHeight() + n17);
    }

    public static void d(boolean bl5) {
        if (bl5) {
            return;
        }
        nz2.c();
    }

    public static final q24 i(Context context, Class clazz, String string) {
        context.getClass();
        if (!qm4.u0(string)) {
            if (!string.equals(":memory:")) {
                return new q24(context, clazz, string);
            }
            kf2.n("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        kf2.n("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final boolean j(String string, String string2) {
        block9: {
            string.getClass();
            if (string.equals(string2)) {
                return true;
            }
            if (string.length() != 0) {
                int n16;
                int n17 = 0;
                int n18 = n16 = 0;
                while (n17 < string.length()) {
                    int n19 = string.charAt(n17);
                    if (n18 == 0 && n19 != 40) break block9;
                    if (n19 != 40) {
                        if (n19 == 41) {
                            n16 = n19 = n16 - 1;
                            if (n19 == 0) {
                                n16 = n19;
                                if (n18 != string.length() - 1) {
                                    break block9;
                                }
                            }
                        }
                    } else {
                        ++n16;
                    }
                    ++n17;
                    ++n18;
                }
                if (n16 == 0) {
                    return h12.c(((Object)qm4.K0(string.substring(1, string.length() - 1))).toString(), string2);
                }
            }
        }
        return false;
    }

    public static void k(View view, b85 b852) {
        Object object = j65.a;
        int n16 = view.getPaddingStart();
        int n17 = view.getPaddingTop();
        int n18 = view.getPaddingEnd();
        int n19 = view.getPaddingBottom();
        object = new Object();
        ((c85)object).a = n16;
        ((c85)object).b = n17;
        ((c85)object).c = n18;
        ((c85)object).d = n19;
        a65.c(view, new gp3(22, b852, object));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
            return;
        }
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new Object());
    }

    public static float l(Context context, int n16) {
        context = context.getResources();
        return TypedValue.applyDimension((int)1, (float)n16, (DisplayMetrics)context.getDisplayMetrics());
    }

    public static Map m(kk1 object4) {
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        Iterator iterator = object4.sourceIterator();
        while (iterator.hasNext()) {
            Object object2 = object4.keyOf(iterator.next());
            Object v16 = linkedHashMap.get(object2);
            Object object3 = v16;
            if (v16 == null) {
                object3 = v16;
                if (!linkedHashMap.containsKey(object2)) {
                    object3 = new Object();
                }
            }
            object3 = (hx3)object3;
            ++((hx3)object3).n;
            linkedHashMap.put(object2, object3);
        }
        for (Object object4 : (Iterable)linkedHashMap.entrySet()) {
            object4.getClass();
            if (object4 instanceof x32 && !(object4 instanceof z32)) {
                jz4.M(object4, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            object4.setValue(((hx3)object4.getValue()).n);
        }
        return jz4.f(linkedHashMap);
    }

    public static final boolean n(long l16, long l17) {
        return l16 == l17;
    }

    public static boolean o(Object object, Map map) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            object = (Map)object;
            return map.entrySet().equals(object.entrySet());
        }
        return false;
    }

    public static ib1 p(ib1[] ib1Array, int n16) {
        int n17 = (n16 & 1) == 0 ? 400 : 700;
        boolean bl5 = (n16 & 2) != 0;
        int n18 = ib1Array.length;
        ib1 ib12 = null;
        int n19 = Integer.MAX_VALUE;
        for (n16 = 0; n16 < n18; ++n16) {
            int n26;
            block4: {
                int n27;
                ib1 ib13;
                block3: {
                    ib13 = ib1Array[n16];
                    n27 = Math.abs(ib13.c - n17);
                    n26 = ib13.d == bl5 ? 0 : 1;
                    n27 = n27 * 2 + n26;
                    if (ib12 == null) break block3;
                    n26 = n19;
                    if (n19 <= n27) break block4;
                }
                ib12 = ib13;
                n26 = n27;
            }
            n19 = n26;
        }
        return ib12;
    }

    public static ol1 q(ol1 ol12) {
        double d16 = Math.round(ol12.a);
        boolean bl5 = false;
        boolean bl6 = d16 >= 90.0 && (double)Math.round(ol12.a) <= 111.0;
        boolean bl7 = (double)Math.round(ol12.b) > 16.0;
        if ((double)Math.round(ol12.c) < 65.0) {
            bl5 = true;
        }
        ol1 ol13 = ol12;
        if (bl6) {
            ol13 = ol12;
            if (bl7) {
                ol13 = ol12;
                if (bl5) {
                    ol13 = ol1.a(ol12.a, ol12.b, 70.0);
                }
            }
        }
        return ol13;
    }

    public static final String r(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return rm4.b0(q40.B0(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    public static ViewGroup s(View view) {
        View view2 = view.getRootView();
        ViewGroup viewGroup = (ViewGroup)view2.findViewById(0x1020002);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (view2 != view && view2 instanceof ViewGroup) {
            return (ViewGroup)view2;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float t(Layout layout, int n16, Paint paint) {
        float f16 = layout.getLineLeft(n16);
        ThreadLocal threadLocal = ns4.a;
        if (layout.getEllipsisCount(n16) <= 0 || layout.getParagraphDirection(n16) != 1 || !(f16 < 0.0f)) return 0.0f;
        int n17 = layout.getLineStart(n16);
        float f17 = layout.getPrimaryHorizontal(layout.getEllipsisStart(n16) + n17);
        f17 = paint.measureText("\u2026") + (f17 - f16);
        paint = layout.getParagraphAlignment(n16);
        if ((n16 = paint == null ? -1 : qx1.a[paint.ordinal()]) == 1) {
            f16 = Math.abs(f16);
            f17 = ((float)layout.getWidth() - f17) / 2.0f;
            return f17 + f16;
        }
        f16 = Math.abs(f16);
        f17 = (float)layout.getWidth() - f17;
        return f17 + f16;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float u(Layout layout, int n16, Paint paint) {
        ThreadLocal threadLocal = ns4.a;
        if (layout.getEllipsisCount(n16) <= 0) return 0.0f;
        int n17 = layout.getParagraphDirection(n16);
        int n18 = -1;
        if (n17 != -1) return 0.0f;
        if (!((float)layout.getWidth() < layout.getLineRight(n16))) return 0.0f;
        n17 = layout.getLineStart(n16);
        float f16 = layout.getPrimaryHorizontal(layout.getEllipsisStart(n16) + n17);
        float f17 = layout.getLineRight(n16);
        f16 = paint.measureText("\u2026") + (f17 - f16);
        paint = layout.getParagraphAlignment(n16);
        if (paint != null) {
            n18 = qx1.a[paint.ordinal()];
        }
        if (n18 == 1) {
            f17 = (float)layout.getWidth() - layout.getLineRight(n16);
            f16 = ((float)layout.getWidth() - f16) / 2.0f;
            return f17 - f16;
        }
        f17 = (float)layout.getWidth() - layout.getLineRight(n16);
        f16 = (float)layout.getWidth() - f16;
        return f17 - f16;
    }

    public static ry v(py object) {
        Exception exception2;
        ry ry5;
        block4: {
            block3: {
                Object object2 = new Object();
                ((oy)object2).c = new Object();
                ((oy)object2).b = ry5 = new ry((oy)object2);
                ((oy)object2).a = object.getClass();
                try {
                    object = object.k((oy)object2);
                    if (object == null) break block3;
                }
                catch (Exception exception2) {}
                ((oy)object2).a = object;
                return ry5;
                break block4;
            }
            return ry5;
        }
        ry5.o.i(exception2);
        return ry5;
    }

    public static final int w(Layout layout, int n16, boolean bl5) {
        int n17;
        block9: {
            block7: {
                block8: {
                    if (n16 <= 0) {
                        return 0;
                    }
                    if (n16 >= layout.getText().length()) {
                        return layout.getLineCount() - 1;
                    }
                    n17 = layout.getLineForOffset(n16);
                    int n18 = layout.getLineStart(n17);
                    int n19 = layout.getLineEnd(n17);
                    if (n18 != n16 && n19 != n16) break block7;
                    if (n18 != n16) break block8;
                    if (bl5) {
                        return n17 - 1;
                    }
                    break block7;
                }
                if (!bl5) break block9;
            }
            return n17;
        }
        return n17 + 1;
    }

    public static final ed x(ne0 ne02) {
        if ((ne02 = (ed)ne02.K(rv2.p)) != null) {
            return ne02;
        }
        kf2.o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void y(rg1 rg12, wf1 wf12) {
        wf12.getClass();
        jz4.j(2, wf12);
        wf12.invoke(rg12, 1);
    }

    public static boolean z(View view) {
        WeakHashMap weakHashMap = j65.a;
        return view.getLayoutDirection() == 1;
    }

    public me a(Context context, Looper looper, ml3 ml32, Object object, gj1 gj12, hj1 hj12) {
        return this.b(context, looper, ml32, object, (gf5)gj12, (gf5)hj12);
    }

    public me b(Context context, Looper looper, ml3 ml32, Object object, gf5 gf52, gf5 gf53) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface e(Context var1, ya1 var2, Resources var3, int var4);

    public abstract Typeface f(Context var1, ib1[] var2, int var3);

    public Typeface g(Context context, List list, int n16) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface h(Context object, Resources resources, int n16, String string, int n17) {
        block6: {
            if ((object = wr1.C((Context)object)) == null) {
                return null;
            }
            boolean bl5 = wr1.k((File)object, resources, n16);
            if (bl5) break block6;
            ((File)object).delete();
            return null;
        }
        try {
            resources = Typeface.createFromFile((String)((File)object).getPath());
            return resources;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            ((File)object).delete();
        }
    }
}

