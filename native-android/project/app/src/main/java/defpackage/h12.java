package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebView;
import androidx.cardview.widget.CardView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h12 {
    public static final double[][] a = null;
    public static final double[] b = null;
    public static final ro0 c = null;
    public static final long[] d = null;

    static {
        a = new double[][]{new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
        b = new double[]{95.047d, 100.0d, 108.883d};
        c = new ro0(1.0f, 1.0f);
        d = new long[0];
    }

    public static final boolean A(c72 r1) {
        if (r1.u == null) goto L13;
        c72 r0 = r1.t();
        if (r0 == null) goto L7;
        c72 r2 = r0.u;
    L8:
        if (r2 != null) goto L10;
        return true;
    L10:
        if (r1.R.b == false) goto L16;
        return true;
    L16:
        return false;
    L7:
        r2 = null;
        goto L8
    L13:
        return false;
    }

    public static double B(double r2) {
        if (r2 <= 0.008856451679035631d) goto L7;
        return Math.pow(r2, 0.3333333333333333d);
    L7:
        return ((r2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] C(int r18) {
        double r1 = E((r18 >> 16) & 255);
        double r3 = E((r18 >> 8) & 255);
        double r5 = E(r18 & 255);
        double[][] r0 = a;
        double[] r8 = r0[0];
        double r14 = (r8[2] * r5) + ((r8[1] * r3) + (r8[0] * r1));
        double[] r9 = r0[1];
        double r12 = (r9[2] * r5) + ((r9[1] * r3) + (r9[0] * r1));
        double[] r2 = r0[2];
        double r4 = (r2[2] * r5) + ((r2[1] * r3) + (r2[0] * r1));
        double[] r6 = b;
        double r15 = r14 / r6[0];
        double r13 = r12 / r6[1];
        double r7 = r4 / r6[2];
        double r10 = B(r15);
        double r11 = B(r13);
        return new double[]{(116.0d * r11) - 16.0d, (r10 - r11) * 500.0d, (r11 - B(r7)) * 200.0d};
    }

    public static final rv2 D(i80 r9, String r10, Executor r11, gf1 r12) {
        j15 r0 = j15.a;
        r9.getClass();
        r11.getClass();
        k03 r5 = new k03(rv2.w);
        oy r6 = new oy();
        r6.c = new n04();
        ry r8 = new ry(r6);
        r6.b = r8;
        r6.a = xa3.class;
        r11.execute(new mr(r9, r10, r12, r5, r6, 9));     // Catch: Exception -> L5
        r6.a = r0;     // Catch: Exception -> L5
    L8:
        return new rv2(7);
    L5:
        e = move-exception;
        r8.o.i(e);
        goto L8
    }

    public static double E(int r6) {
        double r0 = ((double) r6) / 255.0d;
        if (r0 > 0.040449936d) goto L7;
        double r1 = r0 / 12.92d;
    L6:
        return r1 * 100.0d;
    L7:
        r1 = Math.pow((r0 + 0.055d) / 1.055d, 2.4d);
        goto L6
    }

    public static int F(int r4) {
        RoundingMode r0 = RoundingMode.UNNECESSARY;
        if (r4 <= 0) goto L23;
        boolean r1 = true;
        switch(d02.a[r0.ordinal()]) {
            case 1: goto L13;
            case 2: goto L22;
            case 3: goto L22;
            case 4: goto L11;
            case 5: goto L11;
            case 6: goto L8;
            case 7: goto L8;
            case 8: goto L8;
            default: goto L7;
        };
    L8:
        int r2 = Integer.numberOfLeadingZeros(r4);
        return (31 - r2) + ((~(~(((-1257966797) >>> r2) - r4))) >>> 31);
    L7:
        throw new AssertionError();
    L11:
        return 32 - Integer.numberOfLeadingZeros(r4 - 1);
    L13:
        if (r4 <= 0) goto L15;
        boolean r3 = true;
    L17:
        if (((r4 - 1) & r4) == 0) goto L20;
        r1 = false;
    L20:
        l93.n(r3 & r1);
        goto L22
    L15:
        r3 = false;
    L22:
        return 31 - Integer.numberOfLeadingZeros(r4);
    L23:
        kf2.n(b11.j(r4, "x (", ") must be > 0"));
        return 0;
    }

    public static tl1 G(String... r7) {
        String[] r8 = (String[]) Arrays.copyOf(r7, r7.length);
        if ((r8.length % 2) != 0) goto L18;
        String[] r0 = (String[]) Arrays.copyOf(r8, r8.length);
        int r3 = r0.length;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L11;
        if (r0[r5] == null) goto L9;
        r0[r5] = qm4.K0(r8[r5]).toString();
        r5 = r5 + 1;
        goto L5
    L9:
        kf2.n("Headers cannot be null");
        return null;
    L11:
        int r9 = q05.n(0, r0.length - 1, 2);
        if (r9 < 0) goto L17;
    L13:
        String r1 = r0[r4];
        String r2 = r0[r4 + 1];
        e35.G(r1);
        e35.H(r2, r1);
        if (r4 == r9) goto L17;
        r4 = r4 + 2;
    L17:
        return new tl1(r0);
    L18:
        kf2.n("Expected alternating header names and values");
        return null;
    }

    public static long J(Context r8, Uri r9, String r10, long r11) {
        ContentResolver r2 = r8.getContentResolver();
        Cursor r12 = null;
        r12 = r2.query(r9, new String[]{r10}, null, null, null);     // Catch: Throwable -> L10 Exception -> L12
        if (r12.moveToFirst() == true) goto L6;
    L14:
        i(r12);
        return r11;
    L6:
        if (r12.isNull(0) == true) goto L14;
        long r13 = r12.getLong(0);     // Catch: Throwable -> L10 Exception -> L12
        i(r12);
        return r13;
    L12:
        e = move-exception;
        Log.w("DocumentFile", "Failed query: " + e);     // Catch: Throwable -> L10
        i(r12);
        return r11;
    L10:
        th = move-exception;
        i(r12);
        throw th;
    }

    public static String K(Context r9, Uri r10, String r11) {
        Cursor r12 = r9.getContentResolver().query(r10, new String[]{r11}, null, null, null);     // Catch: Throwable -> L17 Exception -> L19
    L13:
        e = move-exception;
        Exception r13 = e;
    L21:
        Log.w("DocumentFile", "Failed query: " + r13);     // Catch: Throwable -> L11
        i(r12);
        return null;
    L11:
        th = move-exception;
        Throwable r14 = th;
    L24:
        i(r12);
        throw r14;
    L5:
        if (r12.moveToFirst() == true) goto L7;
    L15:
        i(r12);
        return null;
    L7:
        if (r12.isNull(0) == true) goto L15;
        String r15 = r12.getString(0);     // Catch: Throwable -> L11 Exception -> L13
        i(r12);
        return r15;
    L19:
        e = move-exception;
        r13 = e;
        r12 = null;
    L17:
        th = move-exception;
        r12 = null;
        r14 = th;
        goto L24
    }

    public static final ub3 L(c72 r0) {
        ub3 r1 = r0.A;
        if (r1 == null) goto L6;
        return r1;
    L6:
        throw xa3.l("LayoutNode should be attached to an owner");
    }

    public static void M(RuntimeException r5, String r6) {
        StackTraceElement[] r0 = r5.getStackTrace();
        int r1 = r0.length;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r6.equals(r0[r3].getClassName()) == false) goto L7;
        r2 = r3;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r0, r2 + 1, r1));
    }

    public static void N(rf2 r5, float r6) {
        h34 r0 = (h34) r5.n;
        CardView r1 = (CardView) r5.o;
        boolean r2 = r1.getUseCompatPadding();
        boolean r3 = r1.getPreventCornerOverlap();
        if (r6 == r0.e) goto L5;
    L9:
        r0.e = r6;
        r0.f = r2;
        r0.g = r3;
        r0.b(null);
        r0.invalidateSelf();
    L11:
        if (r1.getUseCompatPadding() == true) goto L14;
        r5.l(0, 0, 0, 0);
        return;
    L14:
        h34 r7 = (h34) r5.n;
        float r4 = r7.e;
        float r8 = r7.a;
        int r9 = (int) Math.ceil(i34.a(r4, r8, r1.getPreventCornerOverlap()));
        int r10 = (int) Math.ceil(i34.b(r4, r8, r1.getPreventCornerOverlap()));
        r5.l(r9, r10, r9, r10);
        return;
    L5:
        if (r0.f != r2) goto L9;
        if (r0.g != r3) goto L9;
        goto L9
    }

    public static final Object O(e64 r1, e64 r2, wf1 r3) {
        jz4.j(2, r3);     // Catch: Throwable -> L5
        Object r4 = r3.invoke(r2, r1);     // Catch: Throwable -> L5
    L7:
        xe0 r5 = xe0.n;
        if (r4 == r5) goto L21;
        Object r6 = r1.S(r4);
        if (r6 != zz1.e) goto L14;
        return r5;
    L14:
        if ((r6 instanceof a70) == true) goto L18;
        return zz1.M(r6);
    L18:
        throw ((a70) r6).a;
    L21:
        return r5;
    L5:
        th = move-exception;
        r4 = new a70(th, false);
        goto L7
    }

    public static final void P(int r3, String r4) {
        StringBuilder r0 = new StringBuilder();
        r0.append("Error code: " + r3);
        r0.append(", message: ".concat(r4));
        throw new SQLException(r0.toString());
    }

    public static void Q(String r2) {
        UninitializedPropertyAccessException r0 = new UninitializedPropertyAccessException(xa3.h("lateinit property ", r2, " has not been initialized"));
        M(r0, h12.class.getName());
        throw r0;
    }

    public static double R(double r8) {
        double r9 = (r8 + 16.0d) / 116.0d;
        double r4 = (r9 * r9) * r9;
        if (r4 > 0.008856451679035631d) goto L7;
        r4 = ((r9 * 116.0d) - 16.0d) / 903.2962962962963d;
    L7:
        return r4 * 100.0d;
    }

    public static final nb a(String r1) {
        return new nb(kb4.S(r1));
    }

    public static final boolean b(float r1) {
        if (Float.isNaN(r1) == false) goto L5;
        return true;
    L5:
        if (Math.abs(r1) < 0.5f) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean c(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    public static void d(String r0, boolean r1) {
        if (r1 == false) goto L4;
        return;
    L4:
        kf2.n(r0);
    }

    public static void e(Object r1) {
        f(r1, "Argument must not be null");
    }

    public static void f(Object r0, String r1) {
        if (r0 == null) goto L4;
        return;
    L4:
        nz2.n(r1);
    }

    public static void g(int r4, int r5, int r6) {
        if (r4 < 0) goto L9;
        if (r5 > r6) goto L9;
        if (r4 > r5) goto L7;
        return;
    L7:
        kf2.n(xa3.e(r4, r5, "fromIndex: ", " > toIndex: "));
        return;
    L9:
        StringBuilder r7 = b11.t("fromIndex: ", ", toIndex: ", r4, r5, ", size: ");
        r7.append(r6);
        throw new IndexOutOfBoundsException(r7.toString());
    }

    public static int h(int r5, int r6) {
        long r0 = ((long) r5) + ((long) r6);
        int r2 = (int) r0;
        if (r0 != r2) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return r2;
    L9:
        throw new ArithmeticException(b11.n("overflow: checkedAdd(", ", ", r5, r6, ")"));
    L5:
        r1 = false;
        goto L6
    }

    public static void i(Cursor r0) {
        if (r0 != null) goto L9;
        return;
    L9:
        xa3.p(r0);     // Catch: RuntimeException -> L5 Exception -> L8
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static int j(int r0, int r1) {
        if (r0 >= r1) goto L5;
        return -1;
    L5:
        if (r0 != r1) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static int k(long r0, long r2) {
        if (r0 >= r2) goto L6;
        return -1;
    L6:
        if (r0 != r2) goto L9;
        return 0;
    L9:
        return 1;
    }

    public static int l(double r2) {
        double r3 = r2 / 100.0d;
        if (r3 > 0.0031308d) goto L5;
        double r4 = r3 * 12.92d;
    L6:
        int r5 = (int) Math.round(r4 * 255.0d);
        if (r5 >= 0) goto L11;
        return 0;
    L11:
        if (r5 <= 255) goto L13;
        return 255;
    L13:
        return r5;
    L5:
        r4 = (Math.pow(r3, 0.4166666666666667d) * 1.055d) - 0.055d;
        goto L6
    }

    public static int m(int r5, int r6) {
        RoundingMode r0 = RoundingMode.CEILING;
        r0.getClass();
        if (r6 == 0) goto L27;
        int r1 = r5 / r6;
        int r2 = r5 - (r6 * r1);
        if (r2 == 0) goto L33;
        boolean r3 = true;
        int r7 = ((r5 ^ r6) >> 31) | 1;
        switch(d02.a[r0.ordinal()]) {
            case 1: goto L21;
            case 2: goto L28;
            case 3: goto L18;
            case 4: goto L20;
            case 5: goto L16;
            case 6: goto L11;
            case 7: goto L11;
            case 8: goto L11;
            default: goto L10;
        };
    L11:
        int r4 = Math.abs(r2);
        int r8 = r4 - (Math.abs(r6) - r4);
        if (r8 != 0) goto L14;
        RoundingMode r9 = RoundingMode.HALF_UP;
        RoundingMode r10 = RoundingMode.HALF_EVEN;
        return r1;
    L14:
        if (r8 > 0) goto L20;
        return r1;
    L16:
        if (r7 > 0) goto L20;
        return r1;
    L18:
        if (r7 < 0) goto L20;
        return r1;
    L21:
        if (r2 == 0) goto L24;
        r3 = false;
    L24:
        l93.n(r3);
        return r1;
    L28:
        return r1;
    L10:
        throw new AssertionError();
    L20:
        return r1 + r7;
    L33:
        return r1;
    L27:
        throw new ArithmeticException("/ by zero");
    }

    public static final void n(x34 r1, String r2) {
        r1.getClass();
        z34 r3 = r1.U(r2);
        r3.O();     // Catch: Throwable -> L6
        ud3.e(r3, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        ud3.e(r3, th);
        throw th;
    }

    public static boolean o(Context r9, Uri r10) {
        ContentResolver r2 = r9.getContentResolver();
        boolean r11 = false;
        Cursor r8 = null;
        r8 = r2.query(r10, new String[]{"document_id"}, null, null, null);     // Catch: Throwable -> L8 Exception -> L10
        if (r8.getCount() <= 0) goto L6;
        r11 = true;
    L6:
        i(r8);
        return r11;
    L8:
        th = move-exception;
        i(r8);
        throw th;
    L10:
        e = move-exception;
        Log.w("DocumentFile", "Failed query: " + e);     // Catch: Throwable -> L8
        i(r8);
        return false;
    }

    public static InvocationHandler p() {
        if (Build.VERSION.SDK_INT < 28) goto L16;
        ClassLoader r0 = i3.m();
    L8:
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, r0).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    L16:
        Method r1 = WebView.class.getDeclaredMethod("getFactory", null);     // Catch: IllegalAccessException -> L9 Throwable -> L11 NoSuchMethodException -> L13
        r1.setAccessible(true);     // Catch: IllegalAccessException -> L9 Throwable -> L11 NoSuchMethodException -> L13
        r0 = r1.invoke(null, null).getClass().getClassLoader();
    L11:
        e = move-exception;
        er1.m(e);
        return null;
    }

    public static final long q(long r5) {
        float r1 = Float.intBitsToFloat((int) (r5 >> 32)) / 2.0f;
        float r6 = Float.intBitsToFloat((int) (r5 & 4294967295L)) / 2.0f;
        long r2 = Float.floatToRawIntBits(r1);
        return (((long) Float.floatToRawIntBits(r6)) & 4294967295L) | (r2 << 32);
    }

    public static ColorStateList r(Context r2, jv3 r3, int r4) {
        TypedArray r0 = (TypedArray) r3.o;
        if (r0.hasValue(r4) == false) goto L10;
        int r1 = r0.getResourceId(r4, 0);
        if (r1 == 0) goto L10;
        ColorStateList r5 = ud3.n(r2, r1);
        if (r5 == null) goto L10;
        return r5;
    L10:
        return r3.b(r4);
    }

    public static ColorStateList s(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        ColorStateList r4 = ud3.n(r1, r0);
        if (r4 == null) goto L10;
        return r4;
    L10:
        return r2.getColorStateList(r3);
    }

    public static final String[] t(qd0 r1) {
        r1.getClass();
        return (String[]) ((nb) r1).b.toArray(new String[0]);
    }

    public static int u(Context r3, TypedArray r4, int r5, int r6) {
        TypedValue r0 = new TypedValue();
        if (r4.getValue(r5, r0) == false) goto L10;
        if (r0.type != 2) goto L10;
        TypedArray r7 = r3.getTheme().obtainStyledAttributes(new int[]{r0.data});
        int r8 = r7.getDimensionPixelSize(0, r6);
        r7.recycle();
        return r8;
    L10:
        return r4.getDimensionPixelSize(r5, r6);
    }

    public static Drawable v(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        Drawable r4 = zz1.r(r1, r0);
        if (r4 == null) goto L10;
        return r4;
    L10:
        return r2.getDrawable(r3);
    }

    public static final int w(qi r4, Object r5, int r6) {
        int r0 = r4.p;
        if (r0 != 0) goto L32;
        return -1;
    L32:
        int r1 = su3.h(r0, r6, r4.n);     // Catch: IndexOutOfBoundsException -> L30
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (c(r5, r4.o[r1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (r4.n[r2] != r6) goto L20;
        if (c(r5, r4.o[r2]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r3 = r1 - 1;
    L21:
        if (r3 < 0) goto L29;
        if (r4.n[r3] != r6) goto L29;
        if (c(r5, r4.o[r3]) == true) goto L26;
        r3 = r3 - 1;
        goto L21
    L26:
        return r3;
    L29:
        return ~r2;
    L30:
        kf2.c();
        return 0;
    }

    public static int x(String r24) {
        if (r24 != null) goto L5;
        return -1;
    L5:
        String r1 = lw2.m(r24);
        r1.getClass();
        switch(r1.hashCode()) {
            case -2123537834: goto L133;
            case -1662384011: goto L129;
            case -1662384007: goto L125;
            case -1662095187: goto L121;
            case -1606874997: goto L117;
            case -1487656890: goto L113;
            case -1487464693: goto L109;
            case -1487464690: goto L105;
            case -1487394660: goto L101;
            case -1487018032: goto L97;
            case -1248337486: goto L93;
            case -1079884372: goto L89;
            case -1004728940: goto L85;
            case -879272239: goto L81;
            case -879258763: goto L77;
            case -387023398: goto L73;
            case -43467528: goto L69;
            case 13915911: goto L65;
            case 187078296: goto L61;
            case 187078297: goto L57;
            case 187078669: goto L53;
            case 187090232: goto L49;
            case 187091926: goto L45;
            case 187099443: goto L41;
            case 1331848029: goto L37;
            case 1503095341: goto L33;
            case 1504578661: goto L29;
            case 1504619009: goto L25;
            case 1504824762: goto L21;
            case 1504831518: goto L17;
            case 1505118770: goto L13;
            case 2039520277: goto L9;
            default: goto L7;
        };
    L7:
        byte r2 = -1;
    L136:
        switch(r2) {
            case 0: goto L158;
            case 1: goto L157;
            case 2: goto L156;
            case 3: goto L155;
            case 4: goto L154;
            case 5: goto L153;
            case 6: goto L152;
            case 7: goto L152;
            case 8: goto L151;
            case 9: goto L150;
            case 10: goto L149;
            case 11: goto L148;
            case 12: goto L147;
            case 13: goto L146;
            case 14: goto L145;
            case 15: goto L155;
            case 16: goto L155;
            case 17: goto L144;
            case 18: goto L158;
            case 19: goto L143;
            case 20: goto L154;
            case 21: goto L149;
            case 22: goto L142;
            case 23: goto L141;
            case 24: goto L149;
            case 25: goto L154;
            case 26: goto L158;
            case 27: goto L140;
            case 28: goto L139;
            case 29: goto L138;
            case 30: goto L155;
            case 31: goto L155;
            default: goto L137;
        };
    L137:
        return -1;
    L138:
        return 7;
    L139:
        return 15;
    L140:
        return 4;
    L141:
        return 12;
    L142:
        return 9;
    L143:
        return 1;
    L144:
        return 5;
    L145:
        return 17;
    L146:
        return 19;
    L147:
        return 13;
    L148:
        return 16;
    L149:
        return 8;
    L150:
        return 18;
    L151:
        return 14;
    L152:
        return 20;
    L153:
        return 21;
    L154:
        return 3;
    L155:
        return 6;
    L156:
        return 11;
    L157:
        return 10;
    L158:
        return 0;
    L9:
        if (r1.equals("video/x-matroska") == false) goto L159;
        r2 = 31;
        goto L136
    L159:
        r2 = -1;
        goto L136
    L13:
        if (r1.equals("audio/webm") == false) goto L160;
        r2 = 30;
        goto L136
    L160:
        r2 = -1;
        goto L136
    L17:
        if (r1.equals("audio/mpeg") == false) goto L161;
        r2 = 29;
        goto L136
    L161:
        r2 = -1;
        goto L136
    L21:
        if (r1.equals("audio/midi") == false) goto L162;
        r2 = 28;
        goto L136
    L162:
        r2 = -1;
        goto L136
    L25:
        if (r1.equals("audio/flac") == false) goto L163;
        r2 = 27;
        goto L136
    L163:
        r2 = -1;
        goto L136
    L29:
        if (r1.equals("audio/eac3") == false) goto L164;
        r2 = 26;
        goto L136
    L164:
        r2 = -1;
        goto L136
    L33:
        if (r1.equals("audio/3gpp") == false) goto L165;
        r2 = 25;
        goto L136
    L165:
        r2 = -1;
        goto L136
    L37:
        if (r1.equals("video/mp4") == false) goto L166;
        r2 = 24;
        goto L136
    L166:
        r2 = -1;
        goto L136
    L41:
        if (r1.equals("audio/wav") == false) goto L167;
        r2 = 23;
        goto L136
    L167:
        r2 = -1;
        goto L136
    L45:
        if (r1.equals("audio/ogg") == false) goto L168;
        r2 = 22;
        goto L136
    L168:
        r2 = -1;
        goto L136
    L49:
        if (r1.equals("audio/mp4") == false) goto L169;
        r2 = 21;
        goto L136
    L169:
        r2 = -1;
        goto L136
    L53:
        if (r1.equals("audio/amr") == false) goto L170;
        r2 = 20;
        goto L136
    L170:
        r2 = -1;
        goto L136
    L57:
        if (r1.equals("audio/ac4") == false) goto L171;
        r2 = 19;
        goto L136
    L171:
        r2 = -1;
        goto L136
    L61:
        if (r1.equals("audio/ac3") == false) goto L172;
        r2 = 18;
        goto L136
    L172:
        r2 = -1;
        goto L136
    L65:
        if (r1.equals("video/x-flv") == false) goto L173;
        r2 = 17;
        goto L136
    L173:
        r2 = -1;
        goto L136
    L69:
        if (r1.equals("application/webm") == false) goto L174;
        r2 = 16;
        goto L136
    L174:
        r2 = -1;
        goto L136
    L73:
        if (r1.equals("audio/x-matroska") == false) goto L175;
        r2 = 15;
        goto L136
    L175:
        r2 = -1;
        goto L136
    L77:
        if (r1.equals("image/png") == false) goto L176;
        r2 = 14;
        goto L136
    L176:
        r2 = -1;
        goto L136
    L81:
        if (r1.equals("image/bmp") == false) goto L177;
        r2 = 13;
        goto L136
    L177:
        r2 = -1;
        goto L136
    L85:
        if (r1.equals("text/vtt") == false) goto L178;
        r2 = 12;
        goto L136
    L178:
        r2 = -1;
        goto L136
    L89:
        if (r1.equals("video/x-msvideo") == false) goto L179;
        r2 = 11;
        goto L136
    L179:
        r2 = -1;
        goto L136
    L93:
        if (r1.equals("application/mp4") == false) goto L180;
        r2 = 10;
        goto L136
    L180:
        r2 = -1;
        goto L136
    L97:
        if (r1.equals("image/webp") == false) goto L181;
        r2 = 9;
        goto L136
    L181:
        r2 = -1;
        goto L136
    L101:
        if (r1.equals("image/jpeg") == false) goto L182;
        r2 = 8;
        goto L136
    L182:
        r2 = -1;
        goto L136
    L105:
        if (r1.equals("image/heif") == false) goto L183;
        r2 = 7;
        goto L136
    L183:
        r2 = -1;
        goto L136
    L109:
        if (r1.equals("image/heic") == false) goto L184;
        r2 = 6;
        goto L136
    L184:
        r2 = -1;
        goto L136
    L113:
        if (r1.equals("image/avif") == false) goto L185;
        r2 = 5;
        goto L136
    L185:
        r2 = -1;
        goto L136
    L117:
        if (r1.equals("audio/amr-wb") == false) goto L186;
        r2 = 4;
        goto L136
    L186:
        r2 = -1;
        goto L136
    L121:
        if (r1.equals("video/webm") == false) goto L187;
        r2 = 3;
        goto L136
    L187:
        r2 = -1;
        goto L136
    L125:
        if (r1.equals("video/mp2t") == false) goto L188;
        r2 = 2;
        goto L136
    L188:
        r2 = -1;
        goto L136
    L129:
        if (r1.equals("video/mp2p") == false) goto L189;
        r2 = 1;
        goto L136
    L189:
        r2 = -1;
        goto L136
    L133:
        if (r1.equals("audio/eac3-joc") == false) goto L190;
        r2 = 0;
        goto L136
    L190:
        r2 = -1;
        goto L136
    }

    public static int y(Uri r6) {
        String r7 = r6.getLastPathSegment();
        if (r7 != null) goto L6;
        return -1;
    L6:
        if (r7.endsWith(".ac3") == false) goto L8;
        return 0;
    L8:
        if (r7.endsWith(".ec3") == false) goto L11;
        return 0;
    L11:
        if (r7.endsWith(".ac4") == false) goto L15;
        return 1;
    L15:
        if (r7.endsWith(".adts") == false) goto L17;
        return 2;
    L17:
        if (r7.endsWith(".aac") == false) goto L20;
        return 2;
    L20:
        if (r7.endsWith(".amr") == false) goto L24;
        return 3;
    L24:
        if (r7.endsWith(".flac") == false) goto L27;
        return 4;
    L27:
        if (r7.endsWith(".flv") == false) goto L30;
        return 5;
    L30:
        if (r7.endsWith(".mid") == false) goto L32;
        return 15;
    L32:
        if (r7.endsWith(".midi") == false) goto L34;
        return 15;
    L34:
        if (r7.endsWith(".smf") == false) goto L37;
        return 15;
    L37:
        if (r7.startsWith(".mk", r7.length() - 4) == false) goto L39;
        return 6;
    L39:
        if (r7.endsWith(".webm") == false) goto L42;
        return 6;
    L42:
        if (r7.endsWith(".mp3") == false) goto L46;
        return 7;
    L46:
        if (r7.endsWith(".mp4") == false) goto L48;
        return 8;
    L48:
        if (r7.startsWith(".m4", r7.length() - 4) == false) goto L50;
        return 8;
    L50:
        if (r7.startsWith(".mp4", r7.length() - 5) == false) goto L52;
        return 8;
    L52:
        if (r7.startsWith(".cmf", r7.length() - 5) == false) goto L55;
        return 8;
    L55:
        if (r7.startsWith(".og", r7.length() - 4) == false) goto L57;
        return 9;
    L57:
        if (r7.endsWith(".opus") == false) goto L60;
        return 9;
    L60:
        if (r7.endsWith(".ps") == false) goto L62;
        return 10;
    L62:
        if (r7.endsWith(".mpeg") == false) goto L64;
        return 10;
    L64:
        if (r7.endsWith(".mpg") == false) goto L66;
        return 10;
    L66:
        if (r7.endsWith(".m2p") == false) goto L69;
        return 10;
    L69:
        if (r7.endsWith(".ts") == false) goto L71;
        return 11;
    L71:
        if (r7.startsWith(".ts", r7.length() - 4) == false) goto L74;
        return 11;
    L74:
        if (r7.endsWith(".wav") == false) goto L76;
        return 12;
    L76:
        if (r7.endsWith(".wave") == false) goto L79;
        return 12;
    L79:
        if (r7.endsWith(".vtt") == false) goto L81;
        return 13;
    L81:
        if (r7.endsWith(".webvtt") == false) goto L84;
        return 13;
    L84:
        if (r7.endsWith(".jpg") == false) goto L86;
        return 14;
    L86:
        if (r7.endsWith(".jpeg") == false) goto L89;
        return 14;
    L89:
        if (r7.endsWith(".avi") == false) goto L93;
        return 16;
    L93:
        if (r7.endsWith(".png") == false) goto L97;
        return 17;
    L97:
        if (r7.endsWith(".webp") == false) goto L101;
        return 18;
    L101:
        if (r7.endsWith(".bmp") == false) goto L103;
        return 19;
    L103:
        if (r7.endsWith(".dib") == false) goto L106;
        return 19;
    L106:
        if (r7.endsWith(".heic") == false) goto L108;
        return 20;
    L108:
        if (r7.endsWith(".heif") == false) goto L111;
        return 20;
    L111:
        if (r7.endsWith(".avif") == false) goto L114;
        return 21;
    L114:
        return -1;
    }

    public static boolean z(Context r1) {
        if (r1.getResources().getConfiguration().fontScale < 1.3f) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract void H(int r1);

    public abstract void I(Typeface r1, boolean r2);
}
