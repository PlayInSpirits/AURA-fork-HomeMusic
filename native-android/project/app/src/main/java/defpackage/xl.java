package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import androidx.media3.common.ParserException;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xl {
    public static AudioManager a;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final String[] d = null;
    public static final f01 e = null;
    public static final f01 f = null;
    public static final int[] g = null;
    public static long h;
    public static Method i;
    public static Method j;
    public static Method k;

    static {
        b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
        d = new String[]{"standard", "accelerate", "decelerate", "linear"};
        e = new f01(1, "NULL");
        f = new f01(1, "UNINITIALIZED");
        g = new int[]{R.attr.stateListAnimator};
    }

    public static final boolean A(ad3 r1, float r2) {
        r1.m().getClass();
        if (r1.r() == false) goto L5;
        float r3 = -r2;
    L7:
        if (r3 <= 0.0f) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == true) goto L12;
        return true;
    L12:
        return false;
    L9:
        r4 = false;
        goto L10
    L5:
        r3 = k(r1);
        goto L7
    }

    public static final boolean B(i94 r5) {
        boolean r1 = false;
        if (r5.o() == true) goto L9;
        List r0 = i94.j(4, r5);
        int r2 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L11;
        if (fh0.p((i94) r0.get(r3)) == false) goto L9;
        r3 = r3 + 1;
        goto L6
    L11:
        c72 r6 = r5.c.t();
    L13:
        if (r6 == null) goto L20;
        e94 r4 = r6.v();
        if (r4 == null) goto L19;
        if (r4.p != true) goto L19;
    L21:
        if (r6 == null) goto L24;
        r1 = true;
    L24:
        return !r1;
    L19:
        r6 = r6.t();
        goto L13
    L20:
        r6 = null;
    L9:
        return false;
    }

    public static float C(EdgeEffect r2, float r3, float r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        r2.onPull(r3, r4);
        return r3;
    L5:
        return ty0.c(r2, r3, r4);
    }

    public static g D(h00 r11, boolean r12) {
        int r1 = r11.i(5);
        if (r1 != 31) goto L5;
        r1 = r11.i(6) + 32;
    L5:
        int r4 = u(r11);
        int r6 = r11.i(4);
        String r7 = f34.f(r1, "mp4a.40.");
        if (r1 != 5) goto L8;
    L9:
        r4 = u(r11);
        int r0 = r11.i(5);
        if (r0 != 31) goto L12;
        r0 = r11.i(6) + 32;
    L12:
        r1 = r0;
        if (r1 != 22) goto L15;
        r6 = r11.i(4);
    L15:
        if (r12 == true) goto L17;
    L61:
        int r13 = c[r6];
        if (r13 == (-1)) goto L66;
        return new g(r7, r4, r13);
    L66:
        throw ParserException.a(null, null);
    L17:
        if (r1 == 1) goto L29;
        if (r1 == 2) goto L29;
        if (r1 == 3) goto L29;
        if (r1 == 4) goto L29;
        if (r1 == 6) goto L29;
        if (r1 == 7) goto L29;
        if (r1 == 17) goto L29;
        switch(r1) {
            case 19: goto L29;
            case 20: goto L29;
            case 21: goto L29;
            case 22: goto L29;
            case 23: goto L29;
            default: goto L27;
        };
    L27:
        throw ParserException.c("Unsupported audio object type: " + r1);
    L29:
        if (r11.h() == false) goto L32;
        l93.q0("AacUtil", "Unexpected frameLengthFlag = 1");
    L32:
        if (r11.h() == false) goto L34;
        r11.t(14);
    L34:
        boolean r5 = r11.h();
        if (r6 == 0) goto L60;
        if (r1 == 6) goto L39;
        if (r1 == 20) goto L39;
    L40:
        if (r5 == false) goto L51;
        if (r1 != 22) goto L43;
        r11.t(16);
    L43:
        if (r1 != 17) goto L45;
    L49:
        r11.t(3);
    L50:
        r11.t(1);
        goto L51
    L45:
        if (r1 == 19) goto L49;
        if (r1 == 20) goto L49;
        if (r1 != 23) goto L50;
    L51:
        switch(r1) {
            case 17: goto L53;
            case 18: goto L61;
            case 19: goto L53;
            case 20: goto L53;
            case 21: goto L53;
            case 22: goto L53;
            case 23: goto L53;
            default: goto L61;
        };
    L53:
        int r14 = r11.i(2);
        if (r14 == 2) goto L58;
        if (r14 != 3) goto L61;
    L58:
        throw ParserException.c("Unsupported epConfig: " + r14);
    L39:
        r11.t(3);
        goto L40
    L60:
        throw new UnsupportedOperationException();
    L8:
        if (r1 != 29) goto L15;
        goto L9
    }

    public static final Object E(s24 r6, boolean r7, boolean r8, if1 r9) {
        r6.getClass();
        r6.a();
        r6.b();
        return g12.Q(new jh0(null, r9, r6, r7, r8));
    }

    public static final Object F(s24 r7, boolean r8, if1 r9, wd0 r10) {
        if ((r10 instanceof lh0) == false) goto L7;
        lh0 r0 = (lh0) r10;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r11 = r0.q;
        int r2 = r0.r;
        Object r6 = xe0.n;
        if (r2 == 0) goto L20;
        if (r2 == 1) goto L18;
        if (r2 == 2) goto L17;
        if (r2 != 3) goto L15;
        kb4.X(r11);
        return r11;
    L15:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L17:
        r8 = r0.p;
        r9 = r0.o;
        r7 = r0.n;
        kb4.X(r11);
    L33:
        kh0 r3 = new kh0(null, r9, r7, r8);
        r0.n = null;
        r0.o = null;
        r0.r = 3;
        Object r12 = fu.P((ne0) r11, r3, r0);
        if (r12 != r6) goto L36;
    L35:
        return r6;
    L36:
        return r12;
    L18:
        kb4.X(r11);
        return r11;
    L20:
        kb4.X(r11);
        if (r7.m() == true) goto L23;
    L30:
        r0.n = r7;
        r0.o = r9;
        r0.p = r8;
        r0.r = 2;
        r11 = o(r7, r0);
        if (r11 != r6) goto L33;
    L23:
        if (r7.q() == false) goto L30;
        if (r7.n() == false) goto L30;
        mh0 r13 = new mh0(null, r9, r7, r8);
        r0.r = 1;
        Object r14 = r7.u(r8, r13, r0);
        if (r14 == r6) goto L35;
        return r14;
    L7:
        r0 = new lh0(r10);
        goto L8
    }

    public static final void G(float[] r16, float[] r17, int r18, float[] r19) {
        if (r18 != 0) goto L5;
        cz1.a("At least one point must be provided");
    L5:
        int r1 = 2;
        if (2 < r18) goto L8;
        r1 = r18 - 1;
    L8:
        int r2 = r1 + 1;
        float[][] r3 = new float[r2][];
        int r5 = 0;
    L9:
        if (r5 >= r2) goto L11;
        r3[r5] = new float[r18];
        r5 = r5 + 1;
        goto L9
    L11:
        int r6 = 0;
    L13:
        if (r6 >= r18) goto L18;
        r3[0][r6] = 1.0f;
        int r7 = 1;
    L15:
        if (r7 >= r2) goto L17;
        r3[r7][r6] = r3[r7 - 1][r6] * r16[r6];
        r7 = r7 + 1;
        goto L15
    L17:
        r6 = r6 + 1;
        goto L13
    L18:
        float[][] r8 = new float[r2][];
        int r9 = 0;
    L19:
        if (r9 >= r2) goto L21;
        r8[r9] = new float[r18];
        r9 = r9 + 1;
        goto L19
    L21:
        float[][] r10 = new float[r2][];
        int r11 = 0;
    L22:
        if (r11 >= r2) goto L24;
        r10[r11] = new float[r2];
        r11 = r11 + 1;
        goto L22
    L24:
        int r12 = 0;
    L25:
        if (r12 >= r2) goto L45;
        float[] r13 = r8[r12];
        float[] r14 = r3[r12];
        r14.getClass();
        r13.getClass();
        System.arraycopy(r14, 0, r13, 0, r18);
        int r15 = 0;
    L27:
        if (r15 >= r12) goto L32;
        float[] r110 = r8[r15];
        float r111 = j(r13, r110);
        int r112 = 0;
    L29:
        if (r112 >= r18) goto L31;
        r13[r112] = r13[r112] - (r110[r112] * r111);
        r112 = r112 + 1;
        goto L29
    L31:
        r15 = r15 + 1;
        goto L27
    L32:
        float r113 = (float) Math.sqrt(j(r13, r13));
        if (r113 >= 1.0E-6f) goto L35;
        r113 = 1.0E-6f;
    L35:
        float r114 = 1.0f / r113;
        int r115 = 0;
    L36:
        if (r115 >= r18) goto L38;
        r13[r115] = r13[r115] * r114;
        r115 = r115 + 1;
        goto L36
    L38:
        float[] r116 = r10[r12];
        int r117 = 0;
    L39:
        if (r117 >= r2) goto L44;
        if (r117 >= r12) goto L42;
        float r118 = 0.0f;
    L43:
        r116[r117] = r118;
        r117 = r117 + 1;
        goto L39
    L42:
        r118 = j(r13, r3[r117]);
        goto L43
    L44:
        r12 = r12 + 1;
        goto L25
    L45:
        int r0 = r1;
    L47:
        if ((-1) >= r0) goto L55;
        float r4 = j(r8[r0], r17);
        float[] r20 = r10[r0];
        int r21 = r0 + 1;
        if (r21 > r1) goto L54;
        int r22 = r1;
    L51:
        r4 = r4 - (r20[r22] * r19[r22]);
        if (r22 == r21) goto L54;
        r22 = r22 - 1;
    L54:
        r19[r0] = r4 / r20[r0];
        r0 = r0 - 1;
        goto L47
    }

    public static final Cursor H(s24 r0, wo4 r1) {
        r0.getClass();
        r0.a();
        r0.b();
        return r0.j().z().F(r1);
    }

    public static final void I(Object[] r1, int r2, int r3) {
        r1.getClass();
    L3:
        if (r2 >= r3) goto L5;
        r1[r2] = null;
        r2 = r2 + 1;
        goto L3
    }

    public static String J(String r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        int r0 = qm4.r0(r3, '#', 0, 6);
        if (r0 < 0) goto L10;
        String r4 = r3.substring(r0 + 1);
        if (r4.length() == 0) goto L10;
        return r4;
    L10:
        return "/";
    }

    public static void K(AppBarLayout r11, float r12) {
        int r0 = r11.getResources().getInteger(app.homemusic.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator r1 = new StateListAnimator();
        long r9 = r0;
        r1.addState(new int[]{R.attr.state_enabled, app.homemusic.R.attr.state_liftable, -app.homemusic.R.attr.state_lifted}, ObjectAnimator.ofFloat(r11, "elevation", new float[]{0.0f}).setDuration(r9));
        r1.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(r11, "elevation", new float[]{r12}).setDuration(r9));
        r1.addState(new int[0], ObjectAnimator.ofFloat(r11, "elevation", new float[]{0.0f}).setDuration(0));
        r11.setStateListAnimator(r1);
    }

    public static final String L(Object r2) {
        if (r2.getClass().isAnonymousClass() == false) goto L5;
        String r0 = r2.getClass().getName();
    L7:
        return b11.o(r0, "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(r2))}, 1)));
    L5:
        r0 = r2.getClass().getSimpleName();
        goto L7
    }

    public static final k14 M(k14 r5) {
        r5.getClass();
        j14 r0 = r5.f();
        n14 r6 = r5.t;
        r0.g = new r15(r6.contentType(), r6.contentLength());
        return r0.a();
    }

    public static String N(String r2) {
        if (r2.length() > 127) goto L6;
        return r2;
    L6:
        return r2.substring(0, 127);
    }

    public static final int O(int r3) {
        int r0 = 306783378 & r3;
        int r1 = 613566756 & r3;
        return ((r3 & (-920350135)) | ((r1 >> 1) | r0)) | ((r0 << 1) & r1);
    }

    public static final t33 a(BackEvent r7) {
        float r3 = v22.a(r7);
        float r4 = v22.g(r7);
        float r2 = v22.h(r7);
        int r1 = v22.c(r7);
        if (Build.VERSION.SDK_INT < 36) goto L5;
        long r5 = no.d(r7);
    L7:
        return new t33(r1, r2, r3, r4, r5);
    L5:
        r5 = 0;
        goto L7
    }

    public static final boolean b(i94 r1) {
        e94 r2 = r1.k();
        return !r2.n.c(n94.j);
    }

    public static final String c(Object[] r3, int r4, int r5, v1 r6) {
        StringBuilder r0 = new StringBuilder((r5 * 3) + 2);
        r0.append("[");
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L11;
        if (r1 <= 0) goto L6;
        r0.append(", ");
    L6:
        Object r2 = r3[r4 + r1];
        if (r2 != r6) goto L9;
        r0.append("(this Collection)");
    L10:
        r1 = r1 + 1;
        goto L3
    L9:
        r0.append(r2);
        goto L10
    L11:
        r0.append("]");
        return r0.toString();
    }

    public static void d(SpannableStringBuilder r6, Object r7, int r8, int r9) {
        Object[] r0 = r6.getSpans(r8, r9, r7.getClass());
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L13;
        Object r4 = r0[r2];
        if (r6.getSpanStart(r4) != r8) goto L12;
        if (r6.getSpanEnd(r4) != r9) goto L12;
        if (r6.getSpanFlags(r4) != 33) goto L12;
        r6.removeSpan(r4);
    L12:
        r2 = r2 + 1;
        goto L4
    L13:
        r6.setSpan(r7, r8, r9, 33);
    }

    public static final void e(rm2 r16, on3 r17) {
        qf2 r0 = (qf2) r16.o;
        r0.getClass();
        m45 r2 = r0.b;
        m45 r3 = r0.a;
        boolean r4 = gi1.g(r17);
        long r5 = r17.b;
        if (r4 == false) goto L6;
        ti.h0(r3.d, null);
        r3.e = 0;
        ti.h0(r2.d, null);
        r2.e = 0;
        r0.c = 0;
    L6:
        if (gi1.i(r17) == true) goto L12;
        List r6 = r17.b();
        int r11 = r6.size();
        int r12 = 0;
    L8:
        if (r12 >= r11) goto L10;
        bm1 r13 = (bm1) r6.get(r12);
        r0.a(r13.a, g83.e(r13.e, 0));
        r12 = r12 + 1;
        goto L8
    L10:
        r0.a(r5, g83.e(r17.n, 0));
    L12:
        if (gi1.i(r17) == true) goto L14;
    L16:
        r0.c = r5;
        return;
    L14:
        if ((r5 - r0.c) <= 40) goto L16;
        ti.h0(r3.d, null);
        r3.e = 0;
        ti.h0(r2.d, null);
        r2.e = 0;
        r0.c = 0;
        goto L16
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    public static final Object f(hp4 r7, ln3 r8, jp r9) {
        if ((r9 instanceof jb1) == false) goto L7;
        jb1 r0 = (jb1) r9;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r10 = r0.p;
        int r2 = r0.q;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        ln3 r11 = r0.o;
        hp4 r12 = r0.n;
        kb4.X(r10);
        r8 = r11;
        r7 = r12;
    L21:
        List r13 = ((kn3) r10).a;
        int r3 = r13.size();
        int r4 = 0;
    L22:
        if (r4 >= r3) goto L29;
        if (((on3) r13.get(r4)).d == true) goto L18;
        r4 = r4 + 1;
    L18:
        r0.n = r7;
        r0.o = r8;
        r0.q = 1;
        r10 = r7.a(r8, r0);
        xe0 r5 = xe0.n;
        if (r10 != r5) goto L21;
        return r5;
    L29:
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r10);
        List r14 = r7.s.F.a;
        int r6 = r14.size();
        int r15 = 0;
    L15:
        if (r15 >= r6) goto L29;
        if (((on3) r14.get(r15)).d == true) goto L18;
        r15 = r15 + 1;
    L7:
        r0 = new jb1(r9);
        goto L8
    }

    public static final Object g(sn3 r3, wf1 r4, vd0 r5) {
        kb1 r1 = new kb1(r5.getContext(), r4, null);
        ip4 r6 = (ip4) r3;
        r6.getClass();
        cz r7 = new cz(1, ya4.x(r5));
        r7.u();
        hp4 r8 = new hp4(r6, r7);
        f13 r0 = r6.H;
        monitor-enter(r0);
        r6.G.b(r8);     // Catch: Throwable -> L10
        vd0 r2 = ya4.x(ya4.i(r8, r8, r1));     // Catch: Throwable -> L10
        xe0 r9 = xe0.n;     // Catch: Throwable -> L10
        d44 r10 = new d44(r2);     // Catch: Throwable -> L10
        j15 r11 = j15.a;     // Catch: Throwable -> L10
        r10.resumeWith(r11);     // Catch: Throwable -> L10
        monitor-exit(r0);
        r7.w(new kv(3, r8));
        Object r12 = r7.q();
        if (r12 != r9) goto L9;
        return r12;
    L9:
        return r11;
    L10:
        th = move-exception;
        throw th;
    }

    public static final Object h(eo0 r10, jo r11, ep4 r12) {
        if (((cx2) r10).n.A == false) goto L56;
        cx2 r0 = (cx2) r10;
        if (r0.n.A == true) goto L8;
        cz1.b("visitAncestors called on an unattached node");
    L8:
        cx2 r1 = r0.n.r;
        c72 r2 = j51.O(r10);
    L9:
        Object r3 = null;
        if (r2 == null) goto L49;
        if ((((cx2) r2.Q.g).q & 524288) == 0) goto L43;
    L13:
        if (r1 == null) goto L43;
        if ((r1.p & 524288) == 0) goto L42;
        cx2 r4 = r1;
        f13 r5 = null;
    L17:
        if (r4 == null) goto L42;
        if ((r4 instanceof zu) == true) goto L20;
        if ((r4.p & 524288) == 0) goto L41;
        if ((r4 instanceof fo0) == false) goto L41;
        cx2 r6 = ((fo0) r4).C;
        int r7 = 0;
    L27:
        if (r6 == null) goto L39;
        if ((r6.p & 524288) == 0) goto L38;
        r7 = r7 + 1;
        if (r7 != 1) goto L33;
        r4 = r6;
        goto L38
    L33:
        if (r5 != null) goto L35;
        r5 = new f13(new cx2[16]);
    L35:
        if (r4 == null) goto L37;
        r5.b(r4);
        r4 = null;
    L37:
        r5.b(r6);
    L38:
        r6 = r6.s;
        goto L27
    L39:
        if (r7 == 1) goto L17;
    L41:
        r4 = j51.c(r5);
        goto L17
    L20:
        r3 = r4;
    L42:
        r1 = r1.r;
    L43:
        r2 = r2.t();
        if (r2 == null) goto L48;
        w12 r8 = r2.Q;
        if (r8 == null) goto L48;
        r1 = (sq4) r8.f;
    L48:
        r1 = null;
    L49:
        zu r9 = (zu) r3;
        if (r9 == null) goto L56;
        f63 r13 = j51.N(r10);
        Object r14 = r9.k(r13, new fa(3, r11, r13), r12);
        if (r14 != xe0.n) goto L56;
        return r14;
    L56:
        return j15.a;
    }

    public static final void i(String r1, k14 r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.u == null) goto L6;
        kf2.e(r1.concat(".networkResponse != null"));
        return;
    L6:
        if (r2.v == null) goto L8;
        kf2.e(r1.concat(".cacheResponse != null"));
        return;
    L8:
        if (r2.w == null) goto L17;
        kf2.e(r1.concat(".priorResponse != null"));
        return;
    }

    public static final float j(float[] r5, float[] r6) {
        int r0 = r5.length;
        float r1 = 0.0f;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1 = r1 + (r5[r2] * r6[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final float k(ad3 r4) {
        if (r4.m().e != hb3.o) goto L7;
        return Float.intBitsToFloat((int) (r4.q() >> 32));
    L7:
        return Float.intBitsToFloat((int) (r4.q() & 4294967295L));
    }

    public static final void l(x34 r4) {
        r4.getClass();
        qb2 r0 = gb.r();
        z34 r1 = r4.U("SELECT name FROM sqlite_master WHERE type = 'trigger'");
    L20:
    L7:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        ud3.e(r1, th);
        throw th;
    L4:
        if (r1.O() == false) goto L9;
        r0.add(r1.D(0));     // Catch: Throwable -> L7
        goto L20
    L9:
        ud3.e(r1, null);
        ListIterator r2 = gb.f(r0).listIterator(0);
    L10:
        dm1 r3 = (dm1) r2;
        if (r3.hasNext() == false) goto L15;
        String r5 = (String) r3.next();
        if (xm4.k0(r5, "room_fts_content_sync_", false) == false) goto L10;
        h12.n(r4, "DROP TRIGGER IF EXISTS ".concat(r5));
        goto L10
    }

    public static final boolean m(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static synchronized AudioManager n(Context r5) {
        monitor-enter(xl.class);
        Context r6 = r5.getApplicationContext();     // Catch: Throwable -> L7
        if (r6 == null) goto L9;
        a = null;     // Catch: Throwable -> L7
    L9:
        AudioManager r1 = a;     // Catch: Throwable -> L7
        if (r1 == null) goto L13;
        monitor-exit(xl.class);
        return r1;
    L13:
        Looper r2 = Looper.myLooper();     // Catch: Throwable -> L7
        if (r2 != null) goto L16;
    L21:
        AudioManager r7 = (AudioManager) r6.getSystemService("audio");     // Catch: Throwable -> L7
        a = r7;     // Catch: Throwable -> L7
        r7.getClass();     // Catch: Throwable -> L7
        monitor-exit(xl.class);
        return r7;
    L16:
        if (r2 == Looper.getMainLooper()) goto L21;
        q90 r3 = new q90();     // Catch: Throwable -> L7
        uo.t().execute(new k6(4, r6, r3));     // Catch: Throwable -> L7
        r3.b();     // Catch: Throwable -> L7
        AudioManager r8 = a;     // Catch: Throwable -> L7
        r8.getClass();     // Catch: Throwable -> L7
        monitor-exit(xl.class);
        return r8;
    L7:
        th = move-exception;
        throw th;
    }

    public static final ne0 o(s24 r1, wd0 r2) {
        if (r1.m() == false) goto L15;
        if (r2.getContext().K(kw4.n) != null) goto L12;
        td0 r3 = r1.a;
        if (r3 != null) goto L9;
        h12.Q("coroutineScope");
        throw null;
    L9:
        return r3.n;
    L12:
        kf2.k();
        return null;
    L15:
        return ((td0) r1.h()).n;
    }

    public static int p(Context r4) {
        DisplayMetrics r0 = r4.getResources().getDisplayMetrics();
        if (r0.widthPixels >= r0.heightPixels) goto L5;
        boolean r1 = true;
    L6:
        TypedValue r2 = new TypedValue();
        Resources r5 = r4.getResources();
        if (r1 == false) goto L9;
        int r3 = app.homemusic.R.dimen.mr_dialog_fixed_width_minor;
    L10:
        r5.getValue(r3, r2, true);
        int r6 = r2.type;
        if (r6 != 5) goto L16;
        float r7 = r2.getDimension(r0);
    L14:
        return (int) r7;
    L16:
        if (r6 != 6) goto L18;
        int r8 = r0.widthPixels;
        r7 = r2.getFraction(r8, r8);
        goto L14
    L18:
        return -2;
    L9:
        r3 = app.homemusic.R.dimen.mr_dialog_fixed_width_major;
        goto L10
    L5:
        r1 = false;
        goto L6
    }

    public static float q(EdgeEffect r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return ty0.b(r2);
    }

    public static final boolean r(i94 r4) {
        e94 r0 = r4.d;
        Object r1 = r0.n.g(n94.H);
        Object r2 = null;
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        qu4 r3 = (qu4) r1;
        w03 r5 = r4.d.n;
        Object r6 = r5.g(n94.w);
        if (r6 != null) goto L8;
        r6 = null;
    L8:
        m24 r7 = (m24) r6;
        if (r3 == null) goto L11;
        boolean r8 = true;
    L12:
        Object r9 = r5.g(n94.G);
        if (r9 == null) goto L17;
        r2 = r9;
    L17:
        if (((Boolean) r2) == null) goto L19;
        return true;
    L19:
        return r8;
    L11:
        r8 = false;
        goto L12
    }

    public static final String s(i94 r7, Resources r8) {
        e94 r0 = r7.d;
        e94 r1 = r7.d;
        Object r2 = r0.n.g(n94.b);
        String r3 = null;
        if (r2 != null) goto L5;
        r2 = null;
    L5:
        w03 r4 = r1.n;
        Object r5 = r4.g(n94.H);
        if (r5 != null) goto L8;
        r5 = null;
    L8:
        qu4 r6 = (qu4) r5;
        Object r9 = r4.g(n94.w);
        if (r9 != null) goto L11;
        r9 = null;
    L11:
        m24 r10 = (m24) r9;
        if (r6 == null) goto L22;
        int r11 = r6.ordinal();
        if (r11 == 0) goto L22;
        if (r11 == 1) goto L22;
        if (r11 != 2) goto L20;
        if (r2 != null) goto L22;
        r2 = r8.getString(app.homemusic.R.string.indeterminate);
        goto L22
    L20:
        er1.n();
        return null;
    L22:
        Object r12 = r4.g(n94.G);
        if (r12 != null) goto L25;
        r12 = null;
    L25:
        Boolean r13 = (Boolean) r12;
        if (r13 == null) goto L32;
        boolean r14 = r13.booleanValue();
        if (r2 != null) goto L32;
        if (r14 == false) goto L31;
        r2 = r8.getString(app.homemusic.R.string.selected);
        goto L32
    L31:
        r2 = r8.getString(app.homemusic.R.string.not_selected);
    L32:
        Object r15 = r4.g(n94.c);
        if (r15 != null) goto L35;
        r15 = null;
    L35:
        xq3 r16 = (xq3) r15;
        if (r16 != null) goto L38;
    L43:
        p94 r17 = n94.D;
        if (r4.c(r17) == false) goto L69;
        w03 r18 = new i94(r7.a, true, r7.c, r1).k().n;
        Object r19 = r18.g(n94.a);
        if (r19 != null) goto L48;
        r19 = null;
    L48:
        Collection r20 = (Collection) r19;
        if (r20 != null) goto L51;
    L52:
        Object r21 = r18.g(n94.z);
        if (r21 != null) goto L55;
        r21 = null;
    L55:
        Collection r22 = (Collection) r21;
        if (r22 != null) goto L58;
    L59:
        Object r23 = r18.g(r17);
        if (r23 != null) goto L62;
        r23 = null;
    L62:
        CharSequence r24 = (CharSequence) r23;
        if (r24 != null) goto L65;
    L66:
        r3 = r8.getString(app.homemusic.R.string.state_empty);
    L67:
        r2 = r3;
        goto L69
    L65:
        if (r24.length() != 0) goto L67;
    L58:
        if (r22.isEmpty() == false) goto L67;
    L51:
        if (r20.isEmpty() == false) goto L67;
    L69:
        return (String) r2;
    L38:
        if (r16 == xq3.b) goto L41;
        if (r2 != null) goto L43;
        r2 = r8.getString(app.homemusic.R.string.template_percent, new Object[]{0});
        goto L43
    L41:
        if (r2 != null) goto L43;
        r2 = r8.getString(app.homemusic.R.string.in_progress);
        goto L43
    }

    public static final he t(i94 r3) {
        e94 r0 = r3.d;
        Object r1 = r0.n.g(n94.D);
        he r2 = null;
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        he r4 = (he) r1;
        e94 r5 = r3.d;
        Object r6 = r5.n.g(n94.z);
        if (r6 != null) goto L8;
        r6 = null;
    L8:
        List r7 = (List) r6;
        if (r7 == null) goto L11;
        r2 = (he) q40.x0(r7);
    L11:
        if (r4 != null) goto L13;
        return r2;
    L13:
        return r4;
    }

    public static int u(h00 r3) {
        int r0 = r3.i(4);
        if (r0 != 15) goto L11;
        if (r3.b() < 24) goto L9;
        return r3.i(24);
    L9:
        throw ParserException.a(null, "AAC header insufficient data");
    L11:
        if (r0 >= 13) goto L15;
        return b[r0];
    L15:
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final u84 v(Object r1) {
        if (r1 != ud3.a) goto L5;
        kf2.o("Does not contain segment");
        return null;
    L5:
        return (u84) r1;
    }

    public static void w(String r2, Exception r3) {
        if ((r3 instanceof InvocationTargetException) == false) goto L10;
        Throwable r4 = r3.getCause();
        if ((r4 instanceof RuntimeException) == true) goto L9;
        er1.m(r4);
        return;
    L9:
        throw ((RuntimeException) r4);
    L10:
        Log.v("Trace", "Unable to call " + r2 + " via reflection", r3);
    }

    public static final boolean x(Object r1) {
        if (r1 != ud3.a) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean y() {
        if (Build.VERSION.SDK_INT < 29) goto L16;
        return nv4.c();
    L16:
    L10:
        e = move-exception;
        w("isTagEnabled", e);
        return false;
    L8:
        if (i != null) goto L12;
        h = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L10
        i = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L10
    L12:
        return ((Boolean) i.invoke(null, new Object[]{Long.valueOf(h)})).booleanValue();
    }

    public static final boolean z(i94 r2, Resources r3) {
        if (wr1.H(r2) == true) goto L29;
        e94 r0 = r2.d;
        if (r0.p == true) goto L27;
        Object r1 = r0.n.g(n94.a);
        String r4 = null;
        if (r1 != null) goto L11;
        r1 = null;
    L11:
        List r5 = (List) r1;
        if (r5 == null) goto L14;
        r4 = (String) q40.x0(r5);
    L14:
        if (r4 != null) goto L22;
        if (t(r2) != null) goto L22;
        if (s(r2, r3) != null) goto L22;
        if (r(r2) == true) goto L22;
        return false;
    L22:
        if (B(r2) == false) goto L28;
        return true;
    L28:
        return false;
    L27:
        return true;
    L29:
        return false;
    }
}
