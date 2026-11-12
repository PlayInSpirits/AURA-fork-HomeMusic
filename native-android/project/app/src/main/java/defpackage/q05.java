package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.navigation.fragment.NavHostFragment;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q05 {
    public static final kr a = null;
    public static final f01 b = null;
    public static final o54 c = null;

    static {
        a = new kr();
        b = new f01(1, "NO_OWNER");
        c = new o54(17);
    }

    public static final BlendMode A(int r1) {
        if (r1 != 0) goto L6;
        return k3.a();
    L6:
        if (r1 != 1) goto L10;
        return k3.r();
    L10:
        if (r1 != 2) goto L14;
        return k3.l();
    L14:
        if (r1 != 3) goto L18;
        return k3.k();
    L18:
        if (r1 != 4) goto L22;
        return k3.m();
    L22:
        if (r1 != 5) goto L26;
        return k3.n();
    L26:
        if (r1 != 6) goto L30;
        return k3.o();
    L30:
        if (r1 != 7) goto L34;
        return k3.p();
    L34:
        if (r1 != 8) goto L38;
        return k3.q();
    L38:
        if (r1 != 9) goto L42;
        return k3.t();
    L42:
        if (r1 != 10) goto L46;
        return k3.i();
    L46:
        if (r1 != 11) goto L50;
        return k3.u();
    L50:
        if (r1 != 12) goto L54;
        return k3.v();
    L54:
        if (r1 != 13) goto L58;
        return z9.d();
    L58:
        if (r1 != 14) goto L62;
        return z9.z();
    L62:
        if (r1 != 15) goto L66;
        return z9.A();
    L66:
        if (r1 != 16) goto L70;
        return z9.B();
    L70:
        if (r1 != 17) goto L74;
        return z9.C();
    L74:
        if (r1 != 18) goto L78;
        return z9.D();
    L78:
        if (r1 != 19) goto L82;
        return k3.f();
    L82:
        if (r1 != 20) goto L86;
        return k3.w();
    L86:
        if (r1 != 21) goto L90;
        return k3.y();
    L90:
        if (r1 != 22) goto L94;
        return k3.z();
    L94:
        if (r1 != 23) goto L98;
        return k3.A();
    L98:
        if (r1 != 24) goto L102;
        return k3.B();
    L102:
        if (r1 != 25) goto L106;
        return k3.C();
    L106:
        if (r1 != 26) goto L110;
        return k3.D();
    L110:
        if (r1 != 27) goto L114;
        return k3.h();
    L114:
        if (r1 != 28) goto L118;
        return k3.j();
    L118:
        return k3.k();
    }

    public static final PorterDuff.Mode B(int r1) {
        if (r1 != 0) goto L6;
        return PorterDuff.Mode.CLEAR;
    L6:
        if (r1 != 1) goto L10;
        return PorterDuff.Mode.SRC;
    L10:
        if (r1 != 2) goto L14;
        return PorterDuff.Mode.DST;
    L14:
        if (r1 != 3) goto L18;
        return PorterDuff.Mode.SRC_OVER;
    L18:
        if (r1 != 4) goto L22;
        return PorterDuff.Mode.DST_OVER;
    L22:
        if (r1 != 5) goto L26;
        return PorterDuff.Mode.SRC_IN;
    L26:
        if (r1 != 6) goto L30;
        return PorterDuff.Mode.DST_IN;
    L30:
        if (r1 != 7) goto L34;
        return PorterDuff.Mode.SRC_OUT;
    L34:
        if (r1 != 8) goto L38;
        return PorterDuff.Mode.DST_OUT;
    L38:
        if (r1 != 9) goto L42;
        return PorterDuff.Mode.SRC_ATOP;
    L42:
        if (r1 != 10) goto L46;
        return PorterDuff.Mode.DST_ATOP;
    L46:
        if (r1 != 11) goto L50;
        return PorterDuff.Mode.XOR;
    L50:
        if (r1 != 12) goto L54;
        return PorterDuff.Mode.ADD;
    L54:
        if (r1 != 14) goto L58;
        return PorterDuff.Mode.SCREEN;
    L58:
        if (r1 != 15) goto L62;
        return PorterDuff.Mode.OVERLAY;
    L62:
        if (r1 != 16) goto L66;
        return PorterDuff.Mode.DARKEN;
    L66:
        if (r1 != 17) goto L70;
        return PorterDuff.Mode.LIGHTEN;
    L70:
        if (r1 != 13) goto L74;
        return PorterDuff.Mode.MULTIPLY;
    L74:
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void C(int r19, jc0 r20, nr3 r21) {
        if (r20.n == false) goto L6;
        return;
    L6:
        if ((r20 instanceof kc0) == false) goto L8;
    L12:
        hb0 r3 = r20.g(3);
        hb0 r4 = r20.g(5);
        int r5 = r3.c();
        int r6 = r4.c();
        HashSet r7 = r3.a;
        if (r7 != null) goto L15;
    L72:
        boolean r18 = true;
        r18 = true;
        r18 = true;
        if ((r20 instanceof pk1) == false) goto L75;
        return;
    L75:
        HashSet r8 = r4.a;
        if (r8 != null) goto L78;
    L134:
        hb0 r9 = r20.g(6);
        if (r9.a != null) goto L137;
    L160:
        r20.n = r18;
        return;
    L137:
        if (r9.c == false) goto L160;
        int r10 = r9.c();
        Iterator r11 = r9.a.iterator();
    L140:
        if (r11.hasNext() == false) goto L160;
        hb0 r12 = (hb0) r11.next();
        jc0 r13 = r12.d;
        int r14 = r19 + 1;
        boolean r15 = g(r13);
        hb0 r16 = r13.L;
        if (r13.x() == false) goto L146;
        if (r15 == false) goto L146;
        kc0.R(r13, r21, new kr());
    L146:
        if (r13.o0[r18 ? 1 : 0] != 3) goto L151;
        if (r15 == true) goto L151;
    L149:
        boolean r17 = r18 ? 1 : 0;
    L159:
        r18 = r17;
    L151:
        if (r13.x() == true) goto L140;
        if (r12 != r16) goto L149;
        int r22 = r12.d() + r10;
        if (r13.E == true) goto L157;
        r17 = r18 ? 1 : 0;
    L158:
        C(r14, r13, r21);
        goto L159
    L157:
        int r23 = r22 - r13.Z;
        int r24 = r13.U + r23;
        r13.Y = r23;
        r13.I.i(r23);
        r13.K.i(r24);
        r16.i(r22);
        r17 = r18 ? 1 : 0;
        r13.l = r17;
        goto L158
    L78:
        if (r4.c == false) goto L134;
        Iterator r25 = r8.iterator();
    L81:
        if (r25.hasNext() == false) goto L134;
        hb0 r26 = (hb0) r25.next();
        jc0 r27 = r26.d;
        int r28 = r19 + 1;
        boolean r29 = g(r27);
        hb0 r110 = r27.I;
        hb0 r111 = r27.K;
        if (r27.x() == false) goto L86;
        if (r29 == false) goto L86;
        kc0.R(r27, r21, new kr());
    L86:
        if (r26 != r110) goto L91;
        hb0 r112 = r111.f;
        if (r112 == null) goto L91;
        if (r112.c == false) goto L91;
    L96:
        boolean r113 = true;
    L98:
        int r114 = r27.o0[1];
        if (r114 != 3) goto L120;
        if (r29 == true) goto L120;
        if (r114 != 3) goto L81;
        if (r27.y < 0) goto L81;
        if (r27.x < 0) goto L81;
        if (r27.f0 == 8) goto L114;
        if (r27.s != 0) goto L81;
        if (r27.V != 0.0f) goto L81;
    L114:
        if (r27.w() == true) goto L81;
        if (r113 == false) goto L81;
        if (r27.w() == true) goto L81;
        y(r28, r20, r21, r27);
    L120:
        if (r27.x() == true) goto L81;
        if (r26 != r110) goto L126;
        if (r111.f != null) goto L126;
        int r30 = r110.d() + r6;
        r27.G(r30, r27.i() + r30);
        C(r28, r27, r21);
    L126:
        if (r26 != r111) goto L130;
        if (r110.f != null) goto L130;
        int r31 = r6 - r111.d();
        r27.G(r31 - r27.i(), r31);
        C(r28, r27, r21);
    L130:
        if (r113 == false) goto L81;
        if (r27.w() == true) goto L81;
        x(r28, r27, r21);
    L91:
        if (r26 != r111) goto L97;
        hb0 r115 = r110.f;
        if (r115 == null) goto L97;
        if (r115.c == true) goto L96;
    L97:
        r113 = false;
        goto L98
    L15:
        if (r3.c == false) goto L72;
        Iterator r32 = r7.iterator();
    L18:
        if (r32.hasNext() == false) goto L72;
        hb0 r33 = (hb0) r32.next();
        jc0 r116 = r33.d;
        int r117 = r19 + 1;
        boolean r118 = g(r116);
        hb0 r119 = r116.I;
        hb0 r34 = r116.K;
        if (r116.x() == false) goto L23;
        if (r118 == false) goto L23;
        kc0.R(r116, r21, new kr());
    L23:
        if (r33 != r119) goto L28;
        hb0 r120 = r34.f;
        if (r120 == null) goto L28;
        if (r120.c == false) goto L28;
    L33:
        boolean r121 = true;
    L36:
        int r122 = r116.o0[1];
        if (r122 != 3) goto L58;
        if (r118 == true) goto L58;
        if (r122 != 3) goto L18;
        if (r116.y < 0) goto L18;
        if (r116.x < 0) goto L18;
        if (r116.f0 == 8) goto L52;
        if (r116.s != 0) goto L18;
        if (r116.V != 0.0f) goto L18;
    L52:
        if (r116.w() == true) goto L18;
        if (r121 == false) goto L18;
        if (r116.w() == true) goto L18;
        y(r117, r20, r21, r116);
    L58:
        if (r116.x() == true) goto L18;
        if (r33 != r119) goto L64;
        if (r34.f != null) goto L64;
        int r35 = r119.d() + r5;
        r116.G(r35, r116.i() + r35);
        C(r117, r116, r21);
    L64:
        if (r33 != r34) goto L68;
        if (r119.f != null) goto L68;
        int r36 = r5 - r34.d();
        r116.G(r36 - r116.i(), r36);
        C(r117, r116, r21);
    L68:
        if (r121 == false) goto L18;
        if (r116.w() == true) goto L18;
        x(r117, r116, r21);
    L28:
        if (r33 != r34) goto L35;
        hb0 r123 = r119.f;
        if (r123 == null) goto L35;
        if (r123.c == true) goto L33;
    L35:
        r121 = false;
        goto L36
    L8:
        if (r20.x() == false) goto L12;
        if (g(r20) == false) goto L12;
        kc0.R(r20, r21, new kr());
        goto L12
    }

    public static final void a(r70 r11, rg1 r12, int r13) {
        r12.S(-709502251);
        byte r2 = 0;
        if ((r13 & 3) == 2) goto L5;
        boolean r0 = true;
    L6:
        int r1 = 6;
        if (r12.K(r13 & 1, r0) == false) goto L16;
        qr3 r3 = z44.a;
        Object r4 = (x44) r12.i(r3);
        r12.R(1967007413);
        Object[] r5 = new Object[0];
        Object r6 = r12.H();
        Object r7 = j80.a;
        if (r6 != r7) goto L11;
        r6 = new rd2(r1);
        r12.b0(r6);
    L11:
        w44 r8 = (w44) gh0.z(r5, w44.r, (gf1) r6, r12, 384);
        r8.p = (x44) r12.i(r3);
        r12.o(false);
        Object[] r9 = {r4};
        xc5 r10 = new xc5(19, new d60(14, r2), new o(16, r4, r8));
        boolean r14 = r12.g(r4) | r12.g(r8);
        Object r15 = r12.H();
        if (r14 == true) goto L14;
        if (r15 == r7) goto L14;
    L15:
        Object r16 = (z82) gh0.z(r9, r10, (gf1) r15, r12, 0);
        gi1.a(r3.a(r16), fh0.w(-412824043, new ib(5, r11, r16), r12), r12, 56);
    L17:
        lv3 r17 = r12.p();
        if (r17 == null) goto L21;
        r17.d = new z(r13, r1, r11);
        return;
    L21:
        return;
    L14:
        r15 = new fa(12, r4, r8);
        r12.b0(r15);
        goto L15
    L16:
        r12.N();
        goto L17
    L5:
        r0 = false;
        goto L6
    }

    public static ac3 b(int r1) {
        return new ac3(0.0f, 0.0f);
    }

    public static void c(df r2, int r3) {
        r2.getTheme().applyStyle(r3, true);
        Window r4 = r2.getWindow();
        if (r4 == null) goto L9;
        View r5 = r4.peekDecorView();
        if (r5 == null) goto L9;
        Context r6 = r5.getContext();
        if (r6 == null) goto L9;
        Resources.Theme r7 = r6.getTheme();
    L10:
        if (r7 == null) goto L13;
        r7.applyStyle(r3, true);
        return;
    L13:
        return;
    L9:
        r7 = null;
        goto L10
    }

    public static boolean d(int r9, Rect r10, Rect r11, Rect r12) {
        boolean r0 = e(r9, r10, r11);
        if (e(r9, r10, r12) == true) goto L42;
        if (r0 == false) goto L42;
        if (r9 == 17) goto L23;
        if (r9 == 33) goto L20;
        if (r9 == 66) goto L17;
        if (r9 == 130) goto L12;
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L12:
        if (r10.bottom <= r12.top) goto L24;
    L41:
        return true;
    L24:
        if (r9 == 17) goto L41;
        if (r9 == 66) goto L41;
        int r13 = s(r9, r10, r11);
        if (r9 == 17) goto L38;
        if (r9 == 33) goto L37;
        if (r9 == 66) goto L36;
        if (r9 != 130) goto L34;
        int r14 = r12.bottom;
        int r15 = r10.bottom;
    L40:
        if (r13 >= Math.max(1, r14 - r15)) goto L42;
    L34:
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L36:
        r14 = r12.right;
        r15 = r10.right;
        goto L40
    L37:
        r14 = r10.top;
        r15 = r12.top;
        goto L40
    L38:
        r14 = r10.left;
        r15 = r12.left;
        goto L40
    L17:
        if (r10.right > r12.left) goto L41;
    L20:
        if (r10.top < r12.bottom) goto L41;
    L23:
        if (r10.left < r12.right) goto L41;
    L42:
        return false;
    }

    public static boolean e(int r2, Rect r3, Rect r4) {
        if (r2 == 17) goto L19;
        if (r2 == 33) goto L14;
        if (r2 == 66) goto L19;
        if (r2 == 130) goto L14;
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L14:
        if (r4.right >= r3.left) goto L16;
    L24:
        return false;
    L16:
        if (r4.left > r3.right) goto L24;
        return true;
    L19:
        if (r4.bottom < r3.top) goto L24;
        if (r4.top > r3.bottom) goto L24;
        return true;
    }

    public static final int f(long[] r5, long r6) {
        int r0 = r5.length - 1;
        int r1 = 0;
    L3:
        if (r1 > r0) goto L11;
        int r2 = (r1 + r0) >>> 1;
        long r3 = r5[r2];
        if (r6 > r3) goto L6;
        if (r6 >= r3) goto L9;
        r0 = r2 - 1;
        goto L3
    L9:
        return r2;
    L6:
        r1 = r2 + 1;
        goto L3
    L11:
        return -(r1 + 1);
    }

    public static boolean g(jc0 r8) {
        int[] r0 = r8.o0;
        int r2 = r0[0];
        int r1 = r0[1];
        jc0 r4 = r8.S;
        if (r4 == null) goto L5;
        kc0 r5 = (kc0) r4;
    L6:
        if (r5 == null) goto L8;
        int r6 = r5.o0[0];
    L8:
        if (r5 == null) goto L11;
        int r7 = r5.o0[1];
    L11:
        if (r2 != 1) goto L13;
    L29:
        boolean r3 = true;
    L30:
        if (r1 != 1) goto L32;
    L48:
        boolean r9 = true;
    L50:
        if (r8.V <= 0.0f) goto L54;
        if (r3 == true) goto L56;
        if (r9 == false) goto L54;
    L56:
        return true;
    L54:
        if (r3 == false) goto L57;
        if (r9 == true) goto L56;
    L57:
        return false;
    L32:
        if (r8.z() == true) goto L48;
        if (r1 == 2) goto L48;
        if (r1 == 3) goto L36;
    L41:
        if (r1 == 3) goto L43;
    L47:
        r9 = false;
        goto L50
    L43:
        if (r8.s != 1) goto L47;
        if (r8.s(1, r8.i()) == false) goto L47;
    L36:
        if (r8.s != 0) goto L41;
        if (r8.V != 0.0f) goto L41;
        if (r8.r(1) == true) goto L48;
    L13:
        if (r8.y() == true) goto L29;
        if (r2 == 2) goto L29;
        if (r2 == 3) goto L17;
    L22:
        if (r2 == 3) goto L24;
    L28:
        r3 = false;
        goto L30
    L24:
        if (r8.r != 1) goto L28;
        if (r8.s(0, r8.o()) == false) goto L28;
    L17:
        if (r8.r != 0) goto L22;
        if (r8.V != 0.0f) goto L22;
        if (r8.r(0) == true) goto L29;
    L5:
        r5 = null;
        goto L6
    }

    public static final void h(Closeable r0, Throwable r1) {
        if (r0 == null) goto L13;
        if (r1 != null) goto L11;
        r0.close();
        return;
    L11:
        r0.close();     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        j51.d(r1, th);
        return;
    }

    public static boolean i(File r6) {
        if (r6.isDirectory() == false) goto L16;
        File[] r7 = r6.listFiles();
        if (r7 != null) goto L7;
        return false;
    L7:
        int r2 = r7.length;
        int r3 = 0;
        boolean r4 = true;
    L8:
        if (r3 >= r2) goto L15;
        if (i(r7[r3]) == false) goto L13;
        if (r4 == false) goto L13;
        r4 = true;
    L14:
        r3 = r3 + 1;
    L13:
        r4 = false;
        goto L14
    L15:
        return r4;
    L16:
        r6.delete();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b35] */
    public static b35 j(final Function r2) {
        final ConcurrentHashMap r0 = new ConcurrentHashMap();     // Catch: NullPointerException -> L4
        return new b35(r0, r2);
    L4:
        return null;
    }

    public static int k(boolean r4) {
        sb1 r1 = new sb1();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        r1.m = lw2.m("video/avc");     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        tb1 r2 = new tb1(r1);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        String r3 = r2.n;     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        if (r3 == null) goto L31;
        List r5 = jk2.e(r4, false, r3);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        String r6 = jk2.c(r2);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        if (r6 != null) goto L8;
        Iterable r7 = gy3.r;     // Catch: MediaCodecUtil$DecoderQueryException -> L32
    L9:
        uw1 r8 = yw1.j();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        r8.d(r5);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        r8.d(r7);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        gy3 r9 = r8.f();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        int r10 = 0;
    L11:
        if (r10 >= r9.q) goto L31;
        if (((dk2) r9.get(r10)).d == null) goto L30;
        MediaCodecInfo.VideoCapabilities r11 = ((dk2) r9.get(r10)).d.getVideoCapabilities();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        if (r11 == null) goto L30;
        List r12 = yj1.e(r11);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        if (r12 == null) goto L30;
        if (r12.isEmpty() == true) goto L30;
        ek2.m();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        MediaCodecInfo.VideoCapabilities.PerformancePoint r13 = ek2.g();     // Catch: MediaCodecUtil$DecoderQueryException -> L32
        int r14 = 0;
    L21:
        if (r14 >= r12.size()) goto L28;
        if (ek2.t(yj1.c(r12.get(r14)), r13) == true) goto L25;
        r14 = r14 + 1;
        goto L21
    L25:
        return 2;
    L28:
        return 1;
    L30:
        r10 = r10 + 1;
        goto L11
    L8:
        r7 = jk2.e(r4, false, r6);     // Catch: MediaCodecUtil$DecoderQueryException -> L32
    L31:
        return 0;
    }

    public static v23 l(kc1 r3) {
        r3.getClass();
        kc1 r0 = r3;
    L3:
        if (r0 == null) goto L13;
        if ((r0 instanceof NavHostFragment) == true) goto L7;
        kc1 r1 = r0.q().y;
        if ((r1 instanceof NavHostFragment) == true) goto L11;
        r0 = r0.I;
        goto L3
    L11:
        return ((NavHostFragment) r1).h0();
    L7:
        return ((NavHostFragment) r0).h0();
    L13:
        View r2 = r3.T;
        if (r2 == null) goto L18;
        return gb.x(r2);
    L18:
        if ((r3 instanceof pp0) == false) goto L20;
        pp0 r4 = (pp0) r3;
    L21:
        if (r4 == null) goto L27;
        Dialog r5 = r4.w0;
        if (r5 == null) goto L27;
        Window r6 = r5.getWindow();
        if (r6 == null) goto L27;
        View r7 = r6.getDecorView();
    L28:
        if (r7 != null) goto L30;
        kf2.o(b11.l("Fragment ", r3, " does not have a NavController set"));
        return null;
    L30:
        return gb.x(r7);
    L27:
        r7 = null;
        goto L28
    L20:
        r4 = null;
        goto L21
    }

    public static final rc5 m(dd5 r2) {
        r2.getClass();
        String r1 = r2.a;
        return new rc5(r2.t, r1);
    }

    public static final int n(int r1, int r2, int r3) {
        if (r3 <= 0) goto L19;
        if (r1 >= r2) goto L21;
        int r0 = r2 % r3;
        if (r0 >= 0) goto L9;
        r0 = r0 + r3;
    L9:
        int r4 = r1 % r3;
        if (r4 >= 0) goto L13;
        r4 = r4 + r3;
    L13:
        int r5 = (r0 - r4) % r3;
        if (r5 >= 0) goto L18;
        r5 = r5 + r3;
    L18:
        return r2 - r5;
    L21:
        return r2;
    L19:
        if (r3 >= 0) goto L36;
        if (r1 <= r2) goto L21;
        int r6 = -r3;
        int r7 = r1 % r6;
        if (r7 >= 0) goto L26;
        r7 = r7 + r6;
    L26:
        int r8 = r2 % r6;
        if (r8 >= 0) goto L30;
        r8 = r8 + r6;
    L30:
        int r9 = (r7 - r8) % r6;
        if (r9 >= 0) goto L35;
        r9 = r9 + r6;
    L35:
        return r9 + r2;
    L36:
        kf2.n("Step is zero.");
        return 0;
    }

    public static final void o(ne0 r4, Throwable r5) {
        Iterator r0 = re0.a.iterator();
    L4:
        if (r0.hasNext() == true) goto L20;
        j51.d(r5, new DiagnosticCoroutineContextException(r4));     // Catch: Throwable -> L17
    L15:
        Thread r6 = Thread.currentThread();
        r6.getUncaughtExceptionHandler().uncaughtException(r6, r5);
        return;
    L20:
        ((qe0) r0.next()).n(r4, r5);     // Catch: Throwable -> L8 ExceptionSuccessfullyProcessed -> L13
    L13:
        return;
    L8:
        th = move-exception;
        if (r5 != th) goto L11;
        Throwable r2 = r5;
    L12:
        Thread r1 = Thread.currentThread();
        r1.getUncaughtExceptionHandler().uncaughtException(r1, r2);
        goto L4
    L11:
        r2 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        j51.d(r2, r5);
        goto L12
    }

    public static void p(int r19, jc0 r20, nr3 r21, boolean r22) {
        if (r20.m == false) goto L6;
        return;
    L6:
        if ((r20 instanceof kc0) == false) goto L8;
    L12:
        hb0 r3 = r20.g(2);
        hb0 r4 = r20.g(4);
        int r5 = r3.c();
        int r6 = r4.c();
        HashSet r7 = r3.a;
        if (r7 == null) goto L73;
        if (r3.c == false) goto L73;
        Iterator r8 = r7.iterator();
    L18:
        if (r8.hasNext() == false) goto L73;
        hb0 r9 = (hb0) r8.next();
        jc0 r13 = r9.d;
        int r14 = r19 + 1;
        boolean r15 = g(r13);
        hb0 r10 = r13.H;
        hb0 r11 = r13.J;
        if (r13.x() == false) goto L23;
        if (r15 == false) goto L23;
        boolean r18 = true;
        kc0.R(r13, r21, new kr());
    L24:
        if (r9 != r10) goto L29;
        hb0 r12 = r11.f;
        if (r12 == null) goto L29;
        if (r12.c == false) goto L29;
    L34:
        boolean r16 = r18;
    L36:
        int r17 = r13.o0[0];
        if (r17 != 3) goto L58;
        if (r15 == true) goto L58;
        if (r17 != 3) goto L18;
        if (r13.v < 0) goto L18;
        if (r13.u < 0) goto L18;
        if (r13.f0 == 8) goto L52;
        if (r13.r != 0) goto L18;
        if (r13.V != 0.0f) goto L18;
    L52:
        if (r13.v() == true) goto L18;
        if (r16 == false) goto L18;
        if (r13.v() == true) goto L18;
        w(r14, r20, r21, r13, r22);
    L58:
        if (r13.x() == true) goto L18;
        if (r9 != r10) goto L64;
        if (r11.f != null) goto L64;
        int r23 = r10.d() + r5;
        r13.F(r23, r13.o() + r23);
        p(r14, r13, r21, r22);
    L64:
        if (r9 != r11) goto L68;
        if (r10.f != null) goto L68;
        int r24 = r5 - r11.d();
        r13.F(r24 - r13.o(), r24);
        p(r14, r13, r21, r22);
    L68:
        if (r16 == false) goto L18;
        if (r13.v() == true) goto L18;
        v(r14, r13, r21, r22);
    L29:
        if (r9 != r11) goto L35;
        hb0 r110 = r10.f;
        if (r110 == null) goto L35;
        if (r110.c == true) goto L34;
    L35:
        r16 = false;
    L23:
        r18 = true;
    L73:
        if ((r20 instanceof pk1) == false) goto L75;
        return;
    L75:
        HashSet r25 = r4.a;
        if (r25 != null) goto L78;
    L135:
        r20.m = true;
        return;
    L78:
        if (r4.c == false) goto L135;
        Iterator r26 = r25.iterator();
    L81:
        if (r26.hasNext() == false) goto L135;
        hb0 r27 = (hb0) r26.next();
        jc0 r28 = r27.d;
        int r111 = r19 + 1;
        boolean r29 = g(r28);
        hb0 r30 = r28.H;
        hb0 r31 = r28.J;
        if (r28.x() == false) goto L86;
        if (r29 == false) goto L86;
        kc0.R(r28, r21, new kr());
    L86:
        if (r27 != r30) goto L91;
        hb0 r112 = r31.f;
        if (r112 == null) goto L91;
        if (r112.c == false) goto L91;
    L96:
        boolean r113 = true;
    L98:
        int r114 = r28.o0[0];
        if (r114 != 3) goto L121;
        if (r29 == true) goto L121;
        if (r114 != 3) goto L81;
        if (r28.v < 0) goto L81;
        if (r28.u < 0) goto L81;
        if (r28.f0 == 8) goto L114;
        if (r28.r != 0) goto L81;
        if (r28.V != 0.0f) goto L81;
    L114:
        if (r28.v() == true) goto L81;
        if (r113 == false) goto L81;
        if (r28.v() == true) goto L81;
        w(r111, r20, r21, r28, r22);
    L121:
        if (r28.x() == true) goto L81;
        if (r27 != r30) goto L127;
        if (r31.f != null) goto L127;
        int r32 = r30.d() + r6;
        r28.F(r32, r28.o() + r32);
        p(r111, r28, r21, r22);
    L127:
        if (r27 != r31) goto L131;
        if (r30.f != null) goto L131;
        int r33 = r6 - r31.d();
        r28.F(r33 - r28.o(), r33);
        p(r111, r28, r21, r22);
    L131:
        if (r113 == false) goto L81;
        if (r28.v() == true) goto L81;
        v(r111, r28, r21, r22);
    L91:
        if (r27 != r31) goto L97;
        hb0 r115 = r30.f;
        if (r115 == null) goto L97;
        if (r115.c == true) goto L96;
    L97:
        r113 = false;
        goto L98
    L8:
        if (r20.x() == false) goto L12;
        if (g(r20) == false) goto L12;
        kc0.R(r20, r21, new kr());
        goto L12
    }

    public static final boolean q(float[] r49, float[] r50) {
        if (r49.length < 16) goto L16;
        if (r50.length < 16) goto L16;
        float r2 = r49[0];
        float r5 = r49[1];
        float r7 = r49[2];
        float r9 = r49[3];
        float r11 = r49[4];
        float r13 = r49[5];
        float r15 = r49[6];
        float r17 = r49[7];
        float r3 = r49[8];
        float r4 = r49[9];
        float r23 = r49[10];
        float r25 = r49[11];
        float r6 = r49[12];
        float r29 = r49[13];
        float r31 = r49[14];
        float r0 = r49[15];
        float r33 = (r2 * r13) - (r5 * r11);
        float r34 = (r2 * r15) - (r7 * r11);
        float r35 = (r2 * r17) - (r9 * r11);
        float r36 = (r5 * r15) - (r7 * r13);
        float r37 = (r5 * r17) - (r9 * r13);
        float r38 = (r7 * r17) - (r9 * r15);
        float r39 = (r3 * r29) - (r4 * r6);
        float r40 = (r3 * r31) - (r23 * r6);
        float r41 = (r3 * r0) - (r25 * r6);
        float r42 = (r4 * r31) - (r23 * r29);
        float r43 = (r4 * r0) - (r25 * r29);
        float r44 = (r23 * r0) - (r25 * r31);
        float r46 = (r38 * r39) + (((r36 * r41) + ((r35 * r42) + ((r33 * r44) - (r34 * r43)))) - (r37 * r40));
        if (r46 == 0.0f) goto L11;
        float r47 = 1.0f / r46;
        r50[0] = ((r17 * r42) + ((r13 * r44) - (r15 * r43))) * r47;
        r50[1] = (((r7 * r43) + ((-r5) * r44)) - (r9 * r42)) * r47;
        r50[2] = ((r0 * r36) + ((r29 * r38) - (r31 * r37))) * r47;
        r50[3] = (((r23 * r37) + ((-r4) * r38)) - (r25 * r36)) * r47;
        float r8 = -r11;
        r50[4] = (((r15 * r41) + (r8 * r44)) - (r17 * r40)) * r47;
        r50[5] = ((r9 * r40) + ((r44 * r2) - (r7 * r41))) * r47;
        float r10 = -r6;
        r50[6] = (((r31 * r35) + (r10 * r38)) - (r0 * r34)) * r47;
        r50[7] = ((r25 * r34) + ((r38 * r3) - (r23 * r35))) * r47;
        r50[8] = ((r17 * r39) + ((r11 * r43) - (r13 * r41))) * r47;
        r50[9] = (((r41 * r5) + ((-r2) * r43)) - (r9 * r39)) * r47;
        r50[10] = ((r0 * r33) + ((r6 * r37) - (r29 * r35))) * r47;
        r50[11] = (((r35 * r4) + ((-r3) * r37)) - (r25 * r33)) * r47;
        r50[12] = (((r13 * r40) + (r8 * r42)) - (r15 * r39)) * r47;
        r50[13] = ((r7 * r39) + ((r2 * r42) - (r5 * r40))) * r47;
        r50[14] = (((r29 * r34) + (r10 * r36)) - (r31 * r33)) * r47;
        r50[15] = ((r23 * r33) + ((r3 * r36) - (r4 * r34))) * r47;
    L11:
        if (r46 != 0.0f) goto L13;
        boolean r12 = true;
    L15:
        return !r12;
    L13:
        r12 = false;
    L16:
        return false;
    }

    public static boolean r(int r2, Rect r3, Rect r4) {
        if (r2 != 17) goto L5;
        int r5 = r3.right;
        int r0 = r4.right;
        if (r5 > r0) goto L38;
        if (r3.left >= r0) goto L38;
    L41:
        return false;
    L38:
        if (r3.left <= r4.left) goto L41;
        return true;
    L5:
        if (r2 != 33) goto L7;
        int r6 = r3.bottom;
        int r1 = r4.bottom;
        if (r6 > r1) goto L31;
        if (r3.top < r1) goto L41;
    L31:
        if (r3.top <= r4.top) goto L41;
        return true;
    L7:
        if (r2 != 66) goto L9;
        int r7 = r3.left;
        int r8 = r4.left;
        if (r7 < r8) goto L24;
        if (r3.right > r8) goto L41;
    L24:
        if (r3.right >= r4.right) goto L41;
        return true;
    L9:
        if (r2 != 130) goto L17;
        int r9 = r3.top;
        int r10 = r4.top;
        if (r9 < r10) goto L15;
        if (r3.bottom > r10) goto L41;
    L15:
        if (r3.bottom >= r4.bottom) goto L41;
        return true;
    L17:
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    }

    public static int s(int r2, Rect r3, Rect r4) {
        if (r2 != 17) goto L5;
        int r5 = r3.left;
        int r6 = r4.right;
    L18:
        return Math.max(0, r5 - r6);
    L5:
        if (r2 != 33) goto L7;
        r5 = r3.top;
        r6 = r4.bottom;
        goto L18
    L7:
        if (r2 != 66) goto L9;
        r5 = r4.left;
        r6 = r3.right;
        goto L18
    L9:
        if (r2 != 130) goto L12;
        r5 = r4.top;
        r6 = r3.bottom;
        goto L18
    L12:
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return 0;
    }

    public static int t(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
    L15:
        int r4 = r2.top;
        int r5 = (r2.height() / 2) + r4;
        int r6 = r3.top;
        return Math.abs(r5 - ((r3.height() / 2) + r6));
    L5:
        if (r1 != 33) goto L7;
    L13:
        int r7 = r2.left;
        int r8 = (r2.width() / 2) + r7;
        int r9 = r3.left;
        return Math.abs(r8 - ((r3.width() / 2) + r9));
    L7:
        if (r1 == 66) goto L15;
        if (r1 == 130) goto L13;
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return 0;
    }

    public static final void u(ViewGroup r10) {
        r10.getClass();
        int r0 = ji2.L(24.0f * r10.getResources().getDisplayMetrics().density);
        int r1 = r10.getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L20;
        View r4 = r10.getChildAt(r3);
        if ((r4 instanceof TextView) == false) goto L7;
        TextView r5 = (TextView) r4;
    L8:
        if (r5 == null) goto L19;
        Drawable[] r6 = r5.getCompoundDrawablesRelative();
        r6.getClass();
        Drawable r7 = r6[0];
        if (r7 == null) goto L19;
        Drawable r8 = r7.mutate();
        if (r8 == null) goto L19;
        r8.setBounds(0, 0, r0, r0);
        ColorStateList r9 = r5.getCompoundDrawableTintList();
        if (r9 == null) goto L18;
        r8.setTintList(r9);
    L18:
        r5.setCompoundDrawablesRelative(r8, r6[1], r6[2], r6[3]);
    L19:
        r3 = r3 + 1;
        goto L3
    L7:
        r5 = null;
        goto L8
    }

    public static void v(int r6, jc0 r7, nr3 r8, boolean r9) {
        float r0 = r7.c0;
        hb0 r1 = r7.H;
        int r2 = r1.f.c();
        hb0 r3 = r7.J;
        int r4 = r3.f.c();
        int r5 = r1.d() + r2;
        int r10 = r4 - r3.d();
        if (r2 != r4) goto L5;
        r0 = 0.5f;
    L6:
        int r11 = r7.o();
        int r12 = (r4 - r2) - r11;
        if (r2 <= r4) goto L9;
        r12 = (r2 - r4) - r11;
    L9:
        if (r12 <= 0) goto L12;
        float r13 = (r0 * r12) + 0.5f;
    L13:
        int r14 = ((int) r13) + r2;
        int r15 = r14 + r11;
        if (r2 <= r4) goto L16;
        r15 = r14 - r11;
    L16:
        r7.F(r14, r15);
        p(r6 + 1, r7, r8, r9);
        return;
    L12:
        r13 = r0 * r12;
        goto L13
    L5:
        r2 = r5;
        r4 = r10;
        goto L6
    }

    public static void w(int r7, jc0 r8, nr3 r9, jc0 r10, boolean r11) {
        float r0 = r10.c0;
        hb0 r1 = r10.H;
        int r2 = r1.d() + r1.f.c();
        hb0 r3 = r10.J;
        int r4 = r3.f.c() - r3.d();
        if (r4 < r2) goto L20;
        int r5 = r10.o();
        if (r10.f0 == 8) goto L18;
        int r6 = r10.r;
        if (r6 == 2) goto L9;
        if (r6 != 0) goto L15;
        r5 = r4 - r2;
    L15:
        r5 = Math.max(r10.u, r5);
        int r12 = r10.v;
        if (r12 <= 0) goto L18;
        r5 = Math.min(r12, r5);
        goto L18
    L9:
        if ((r8 instanceof kc0) == false) goto L11;
        int r13 = r8.o();
    L12:
        r5 = (int) ((r10.c0 * 0.5f) * r13);
        goto L15
    L11:
        r13 = r8.S.o();
    L18:
        int r14 = r2 + ((int) ((r0 * ((r4 - r2) - r5)) + 0.5f));
        r10.F(r14, r5 + r14);
        p(r7 + 1, r10, r9, r11);
        return;
    }

    public static void x(int r6, jc0 r7, nr3 r8) {
        float r0 = r7.d0;
        hb0 r1 = r7.I;
        int r2 = r1.f.c();
        hb0 r3 = r7.K;
        int r4 = r3.f.c();
        int r5 = r1.d() + r2;
        int r9 = r4 - r3.d();
        if (r2 != r4) goto L5;
        r0 = 0.5f;
    L6:
        int r10 = r7.i();
        int r11 = (r4 - r2) - r10;
        if (r2 <= r4) goto L9;
        r11 = (r2 - r4) - r10;
    L9:
        if (r11 <= 0) goto L12;
        float r12 = (r0 * r11) + 0.5f;
    L11:
        int r13 = (int) r12;
        int r14 = r2 + r13;
        int r15 = r14 + r10;
        if (r2 <= r4) goto L16;
        r14 = r2 - r13;
        r15 = r14 - r10;
    L16:
        r7.G(r14, r15);
        C(r6 + 1, r7, r8);
        return;
    L12:
        r12 = r0 * r11;
        goto L11
    L5:
        r2 = r5;
        r4 = r9;
        goto L6
    }

    public static void y(int r7, jc0 r8, nr3 r9, jc0 r10) {
        float r0 = r10.d0;
        hb0 r1 = r10.I;
        int r2 = r1.d() + r1.f.c();
        hb0 r3 = r10.K;
        int r4 = r3.f.c() - r3.d();
        if (r4 < r2) goto L20;
        int r5 = r10.i();
        if (r10.f0 == 8) goto L18;
        int r6 = r10.s;
        if (r6 == 2) goto L9;
        if (r6 != 0) goto L15;
        r5 = r4 - r2;
    L15:
        r5 = Math.max(r10.x, r5);
        int r11 = r10.y;
        if (r11 <= 0) goto L18;
        r5 = Math.min(r11, r5);
        goto L18
    L9:
        if ((r8 instanceof kc0) == false) goto L11;
        int r12 = r8.i();
    L12:
        r5 = (int) ((r0 * 0.5f) * r12);
        goto L15
    L11:
        r12 = r8.S.i();
    L18:
        int r13 = r2 + ((int) ((r0 * ((r4 - r2) - r5)) + 0.5f));
        r10.G(r13, r5 + r13);
        C(r7 + 1, r10, r9);
        return;
    }

    public static final long z(long r5, long r7) {
        float r2 = Float.intBitsToFloat((int) (r7 >> 32)) * Float.intBitsToFloat((int) (r5 >> 32));
        float r6 = Float.intBitsToFloat((int) (r7 & 4294967295L)) * Float.intBitsToFloat((int) (r5 & 4294967295L));
        long r8 = Float.floatToRawIntBits(r2);
        return (((long) Float.floatToRawIntBits(r6)) & 4294967295L) | (r8 << 32);
    }
}
