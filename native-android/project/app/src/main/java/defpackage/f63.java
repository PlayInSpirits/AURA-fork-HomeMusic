package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f63 extends cf2 implements pi2, q62 {
    public static final k52 h0 = null;
    public static final k52 i0 = null;
    public static final b24 j0 = null;
    public static final n62 k0 = null;
    public static final d63 l0 = null;
    public static final tv1 m0 = null;
    public final c72 H;
    public f63 I;
    public f63 J;
    public boolean K;
    public boolean L;
    public if1 M;
    public oo0 N;
    public r62 O;
    public float P;
    public vi2 Q;
    public p03 R;
    public long S;
    public float T;
    public v03 U;
    public n62 V;
    public ac4 W;
    public wv3 X;
    public wv3 Y;
    public boolean Z;
    public boolean a0;
    public sj1 b0;
    public jz c0;
    public ib d0;
    public final c63 e0;
    public boolean f0;
    public tb3 g0;

    static {
        h0 = new k52(13);
        i0 = new k52(14);
        j0 = new b24();
        k0 = new n62();
        l0 = new d63();
        m0 = new tv1();
    }

    public f63(c72 r3) {
        this.H = r3;
        this.N = r3.J;
        this.O = r3.K;
        this.P = 0.8f;
        this.S = 0;
        this.W = kb4.b;
        wv3 r4 = wv3.e;
        this.X = r4;
        this.Y = r4;
        this.e0 = new c63(this, 1);
    }

    @Override // defpackage.q62
    public final long A(q62 r4, long r5) {
        boolean r0 = r4 instanceof ff2;
        if (r0 == false) goto L6;
        ff2 r6 = (ff2) r4;
        r6.n.H.L0();
        return r6.A(this, r5 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
    L6:
        if (r0 == false) goto L8;
        ff2 r1 = (ff2) r4;
    L9:
        if (r1 == null) goto L12;
        f63 r2 = r1.n.H;
        if (r2 == null) goto L12;
    L13:
        r2.L0();
        f63 r7 = w0(r2);
    L14:
        if (r2 == r7) goto L23;
        tb3 r3 = r2.g0;
        if (r3 == null) goto L21;
        vj1 r8 = (vj1) r3;
        float[] r9 = r8.b();
        if (r8.F == true) goto L21;
        r5 = ya4.A(r5, r9);
    L21:
        r5 = ji2.z(r5, r2.S);
        r2 = r2.J;
        r2.getClass();
        goto L14
    L23:
        return q0(r7, r5);
    L12:
        r4.getClass();
        r2 = (f63) r4;
        goto L13
    L8:
        r1 = null;
        goto L9
    }

    public abstract cx2 A0();

    public final boolean B0() {
        if (this.Z == true) goto L5;
        return false;
    L5:
        if (this.X.d() == true) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.q62
    public final wv3 C(q62 r8, boolean r9) {
        if (A0().A == true) goto L6;
        cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
    L6:
        if (r8.f() == true) goto L9;
        cz1.b("LayoutCoordinates " + r8 + " is not attached!");
    L9:
        if ((r8 instanceof ff2) == false) goto L11;
        ff2 r0 = (ff2) r8;
    L12:
        if (r0 == null) goto L15;
        f63 r1 = r0.n.H;
        if (r1 == null) goto L15;
    L16:
        r1.L0();
        f63 r2 = w0(r1);
        v03 r3 = this.U;
        if (r3 != null) goto L19;
        r3 = new v03();
        this.U = r3;
    L19:
        r3.b = 0.0f;
        r3.c = 0.0f;
        r3.d = (int) (r8.k() >> 32);
        r3.e = (int) (r8.k() & 4294967295L);
    L20:
        if (r1 == r2) goto L26;
        r1.T0(r3, r9, false);
        if (r3.c() == true) goto L24;
        r1 = r1.J;
        r1.getClass();
        goto L20
    L24:
        return wv3.e;
    L26:
        p0(r2, r3, r9);
        return new wv3(r3.b, r3.c, r3.d, r3.e);
    L15:
        r1 = (f63) r8;
        goto L16
    L11:
        r0 = null;
        goto L12
    }

    public final cx2 C0(int r3) {
        boolean r0 = g63.f(r3);
        cx2 r1 = A0();
        if (r0 == true) goto L8;
        r1 = r1.r;
        if (r1 != null) goto L8;
        return null;
    L8:
        cx2 r2 = D0(r0);
    L9:
        if (r2 == null) goto L23;
        if ((r2.q & r3) == 0) goto L24;
        if ((r2.p & r3) != 0) goto L14;
        if (r2 == r1) goto L25;
        r2 = r2.s;
        goto L9
    L25:
        return null;
    L14:
        return r2;
    L24:
        return null;
    L23:
        return null;
    }

    public final cx2 D0(boolean r3) {
        w12 r0 = this.H.Q;
        if (((f63) r0.e) == this) goto L5;
        f63 r2 = this.J;
        if (r3 == false) goto L13;
        if (r2 == null) goto L16;
        cx2 r4 = r2.A0();
        if (r4 != null) goto L12;
        return null;
    L12:
        return r4.s;
    L16:
        return null;
    L13:
        if (r2 != null) goto L15;
        return null;
    L15:
        return r2.A0();
    L5:
        return (cx2) r0.g;
    }

    public final void E0(cx2 r8, e63 r9, long r10, fm1 r12, int r13, boolean r14) {
        if (r8 != null) goto L6;
        H0(r9, r10, r12, r13, r14);
        return;
    L6:
        if (r9.f(r8) == true) goto L9;
        E0(fh0.c(r8, r9.d()), r9, r10, r12, r13, r14);
        return;
    L9:
        int r0 = r12.p;
        q03 r1 = r12.n;
        r12.b(r0 + 1, r1.b);
        r12.p++;
        r1.a(r8);
        r12.o.a(rr2.c(-1.0f, r14, false));
        E0(fh0.c(r8, r9.d()), r9, r10, r12, r13, r14);
        r12.p = r0;
    }

    public final void F0(cx2 r12, e63 r13, long r14, fm1 r16, int r17, boolean r18, float r19) {
        if (r12 != null) goto L6;
        H0(r13, r14, r16, r17, r18);
        return;
    L6:
        if (r13.f(r12) == true) goto L9;
        F0(fh0.c(r12, r13.d()), r13, r14, r16, r17, r18, r19);
        return;
    L9:
        int r10 = r16.p;
        q03 r0 = r16.n;
        r16.b(r10 + 1, r0.b);
        r16.p++;
        r0.a(r12);
        r16.o.a(rr2.c(r19, r18, false));
        Q0(fh0.c(r12, r13.d()), r13, r14, r16, r17, r18, r19, true);
        r16.p = r10;
    }

    public final void G0(e63 r15, long r16, fm1 r18, int r19, boolean r20) {
        cx2 r1 = C0(r15.d());
        if (a1(r16) == true) goto L14;
        if (r19 != 1) goto L44;
        float r0 = s0(r16, z0());
        if ((Float.floatToRawIntBits(r0) & Integer.MAX_VALUE) < 2139095040) goto L8;
        return;
    L8:
        if (r18.p != (r18.n.b - 1)) goto L11;
    L12:
        F0(r1, r15, r16, r18, r19, false, r0);
        return;
    L11:
        if (g12.k(r18.a(), rr2.c(r0, false, false)) > 0) goto L12;
        return;
    L44:
        return;
    L14:
        if (r1 != null) goto L17;
        H0(r15, r16, r18, r19, r20);
        return;
    L17:
        float r2 = Float.intBitsToFloat((int) (r16 >> 32));
        float r3 = Float.intBitsToFloat((int) (r16 & 4294967295L));
        if (r2 < 0.0f) goto L28;
        if (r3 < 0.0f) goto L28;
        if (r2 >= G()) goto L28;
        if (r3 >= F()) goto L28;
        E0(r1, r15, r16, r18, r19, r20);
        return;
    L28:
        if (r19 != 1) goto L30;
        float r4 = s0(r16, z0());
    L32:
        if ((Float.floatToRawIntBits(r4) & Integer.MAX_VALUE) < 2139095040) goto L34;
        boolean r7 = r20;
    L41:
        boolean r9 = false;
    L42:
        Q0(r1, r15, r16, r18, r19, r7, r4, r9);
        return;
    L34:
        if (r18.p != (r18.n.b - 1)) goto L36;
        r7 = r20;
    L38:
        r9 = true;
        goto L42
    L36:
        r7 = r20;
        if (g12.k(r18.a(), rr2.c(r4, r7, false)) <= 0) goto L41;
    L30:
        r4 = Float.POSITIVE_INFINITY;
        goto L32
    }

    public void H0(e63 r1, long r2, fm1 r4, int r5, boolean r6) {
        f63 r0 = this.I;
        if (r0 == null) goto L6;
        r0.G0(r1, r0.x0(r2), r4, r5, r6);
        return;
    }

    public final void I0() {
        tb3 r0 = this.g0;
        if (r0 == null) goto L6;
        ((vj1) r0).c();
        return;
    L6:
        f63 r1 = this.J;
        if (r1 == null) goto L10;
        r1.I0();
        return;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.H.J.J();
    }

    public final boolean J0() {
        if (this.g0 != null) goto L5;
    L8:
        f63 r2 = this.J;
        if (r2 != null) goto L11;
        return false;
    L11:
        return r2.J0();
    L5:
        if (this.P > 0.0f) goto L8;
        return true;
    }

    public final long K0(long r5) {
        if (A0().A == true) goto L5;
        cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
    L5:
        L0();
    L6:
        if (this == null) goto L22;
        c72 r0 = this.H;
        if (this == ((f63) r0.Q.e)) goto L10;
    L15:
        tb3 r1 = this.g0;
        if (r1 == null) goto L21;
        vj1 r2 = (vj1) r1;
        float[] r3 = r2.b();
        if (r2.F == true) goto L21;
        r5 = ya4.A(r5, r3);
    L21:
        r5 = ji2.z(r5, this.S);
        f63 this = this.J;
        goto L6
    L10:
        if (r0.p == true) goto L15;
        long r4 = ((ra) h12.L(r0)).getRectManager().b(r0);
        if (g02.a(r4, 9223372034707292159L) == true) goto L15;
        return ji2.z(r5, r4);
    L22:
        return r5;
    }

    public final void L0() {
        this.H.R.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v7, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void M0() {
        boolean r1 = g63.f(128);
        cx2 r2 = D0(r1);
        if (r2 != null) goto L5;
        return;
    L5:
        if ((r2.n.q & 128) == 0) goto L76;
        ch4 r3 = ya4.t();
        if (r3 == null) goto L9;
        if1 r4 = r3.e();
    L10:
        ch4 r5 = ya4.z(r3);
        if (r1 == false) goto L15;
        cx2 r6 = A0();     // Catch: Throwable -> L13
    L18:
        cx2 r7 = D0(r1);     // Catch: Throwable -> L13
    L19:
        if (r7 == null) goto L53;
        if ((r7.q & 128) == 0) goto L53;
        if ((r7.p & 128) == 0) goto L50;
        ?? r8 = r7;
        ?? r9 = 0;
    L25:
        if (r8 == 0) goto L50;
        if ((r8 instanceof yi2) == true) goto L28;
        if ((r8.p & 128) == 0) goto L49;
        if ((r8 instanceof fo0) == false) goto L49;
        cx2 r10 = ((fo0) r8).C;     // Catch: Throwable -> L13
        int r11 = 0;
        r8 = r8;
        r9 = r9;
    L35:
        if (r10 == null) goto L47;
        if ((r10.p & 128) == 0) goto L46;
        r11 = r11 + 1;     // Catch: Throwable -> L13
        r9 = r9;
        if (r11 != 1) goto L41;
        r8 = r10;
        goto L46
    L41:
        if (r9 != 0) goto L43;
        r9 = new f13(new cx2[16]);     // Catch: Throwable -> L13
    L43:
        if (r8 == 0) goto L45;
        r9.b(r8);     // Catch: Throwable -> L13
        r8 = 0;
    L45:
        r9.b(r10);     // Catch: Throwable -> L13
    L46:
        r10 = r10.s;     // Catch: Throwable -> L13
        r8 = r8;
        r9 = r9;
        goto L35
    L47:
        if (r11 == 1) goto L25;
    L49:
        r8 = j51.c(r9);     // Catch: Throwable -> L13
        goto L25
    L28:
        ((yi2) r8).a(this.p);     // Catch: Throwable -> L13
    L50:
        if (r7 == r6) goto L53;
        r7 = r7.s;     // Catch: Throwable -> L13
    L53:
        ya4.H(r3, r5, r4);
        return;
    L15:
        r6 = A0().r;     // Catch: Throwable -> L13
        if (r6 != null) goto L18;
    L13:
        th = move-exception;
        ya4.H(r3, r5, r4);
        throw th;
    L9:
        r4 = null;
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void N0() {
        boolean r1 = g63.f(4194304);
        cx2 r2 = A0();
        if (r1 == true) goto L8;
        r2 = r2.r;
        if (r2 != null) goto L8;
        return;
    L8:
        cx2 r3 = D0(r1);
    L9:
        if (r3 == null) goto L58;
        if ((r3.q & 4194304) == 0) goto L59;
        if ((r3.p & 4194304) == 0) goto L40;
        ?? r4 = r3;
        ?? r5 = 0;
    L15:
        if (r4 == 0) goto L40;
        if ((r4 instanceof o62) == true) goto L18;
        if ((r4.p & 4194304) == 0) goto L39;
        if ((r4 instanceof fo0) == false) goto L39;
        cx2 r6 = ((fo0) r4).C;
        int r7 = 0;
        r4 = r4;
        r5 = r5;
    L25:
        if (r6 == null) goto L37;
        if ((r6.p & 4194304) == 0) goto L36;
        r7 = r7 + 1;
        r5 = r5;
        if (r7 != 1) goto L31;
        r4 = r6;
        goto L36
    L31:
        if (r5 != 0) goto L33;
        r5 = new f13(new cx2[16]);
    L33:
        if (r4 == 0) goto L35;
        r5.b(r4);
        r4 = 0;
    L35:
        r5.b(r6);
    L36:
        r6 = r6.s;
        r4 = r4;
        r5 = r5;
        goto L25
    L37:
        if (r7 == 1) goto L15;
    L39:
        r4 = j51.c(r5);
        goto L15
    L18:
        ((o62) r4).e(this);
    L40:
        if (r3 == r2) goto L60;
        r3 = r3.s;
        goto L9
    L60:
        return;
    L59:
        return;
    }

    public final void O0() {
        this.K = true;
        this.e0.invoke();
        U0();
        if (g02.a(this.S, 0) == true) goto L6;
        this.H.M(this);
        return;
    }

    public final void P0() {
        boolean r1 = g63.f(1048576);
        cx2 r2 = D0(r1);
        if (r2 != null) goto L5;
        return;
    L5:
        if ((r2.n.q & 1048576) == 0) goto L62;
        cx2 r3 = A0();
        if (r1 == true) goto L12;
        r3 = r3.r;
        if (r3 != null) goto L12;
        return;
    L12:
        cx2 r9 = D0(r1);
    L13:
        if (r9 == null) goto L64;
        if ((r9.q & 1048576) == 0) goto L65;
        if ((r9.p & 1048576) == 0) goto L44;
        cx2 r4 = r9;
        f13 r5 = null;
    L19:
        if (r4 == null) goto L44;
        if ((r4 instanceof ba1) == true) goto L22;
        if ((r4.p & 1048576) == 0) goto L43;
        if ((r4 instanceof fo0) == false) goto L43;
        cx2 r6 = ((fo0) r4).C;
        int r7 = 0;
    L29:
        if (r6 == null) goto L41;
        if ((r6.p & 1048576) == 0) goto L40;
        r7 = r7 + 1;
        if (r7 != 1) goto L35;
        r4 = r6;
        goto L40
    L35:
        if (r5 != null) goto L37;
        r5 = new f13(new cx2[16]);
    L37:
        if (r4 == null) goto L39;
        r5.b(r4);
        r4 = null;
    L39:
        r5.b(r6);
    L40:
        r6 = r6.s;
        goto L29
    L41:
        if (r7 == 1) goto L19;
    L43:
        r4 = j51.c(r5);
        goto L19
    L22:
        ba1 r8 = (ba1) r4;
    L44:
        if (r9 == r3) goto L66;
        r9 = r9.s;
        goto L13
    L66:
        return;
    L65:
        return;
    L64:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v27, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [f13] */
    public final void Q0(cx2 r19, e63 r20, long r21, fm1 r23, int r24, boolean r25, float r26, boolean r27) {
        if (r19 != null) goto L7;
        H0(r20, r21, r23, r24, r25);
        return;
    L7:
        if (r20.f(r19) == true) goto L10;
        Q0(fh0.c(r19, r20.d()), r20, r21, r23, r24, r25, r26, r27);
        return;
    L10:
        int r6 = r24;
        char r1 = 3;
        if (r6 != 3) goto L14;
    L15:
        ?? r3 = r19;
        ?? r4 = 0;
    L16:
        if (r3 == 0) goto L74;
        int r9 = 0;
        if ((r3 instanceof rn3) == true) goto L19;
        char r8 = r1;
        if ((r3.p & 16) != 0) goto L57;
    L73:
        ?? r5 = j51.c(r4);
    L72:
        r6 = r24;
        r1 = r8;
        r3 = r5;
        r4 = r4;
        goto L16
    L57:
        if ((r3 instanceof fo0) == false) goto L73;
        cx2 r2 = ((fo0) r3).C;
        r5 = r3;
        r4 = r4;
    L59:
        if (r2 == null) goto L71;
        if ((r2.p & 16) == 0) goto L70;
        r9 = r9 + 1;
        r4 = r4;
        if (r9 != 1) goto L65;
        r5 = r2;
        goto L70
    L65:
        if (r4 != 0) goto L67;
        r4 = new f13(new cx2[16]);
    L67:
        if (r5 == 0) goto L69;
        r4.b(r5);
        r5 = 0;
    L69:
        r4.b(r2);
    L70:
        r2 = r2.s;
        r5 = r5;
        r4 = r4;
        goto L59
    L71:
        if (r9 != 1) goto L73;
    L19:
        rn3 r7 = (rn3) r3;
        int r10 = e35.o;
        long r11 = e35.n;
        int r12 = (int) (r21 >> 32);
        float r13 = Float.intBitsToFloat(r12);
        c72 r14 = this.H;
        r62 r15 = r14.K;
        long r16 = Long.MIN_VALUE & Long.MIN_VALUE;
        r62 r17 = r62.n;
        if (r16 == 0) goto L24;
        if (r15 == r17) goto L24;
        int r18 = xi4.i(2, Long.MIN_VALUE);
    L26:
        if (r13 < (-r18)) goto L74;
        float r22 = Float.intBitsToFloat(r12);
        int r28 = G();
        r62 r29 = r14.K;
        if (r16 == 0) goto L32;
        if (r29 == r17) goto L32;
        int r30 = xi4.i(0, Long.MIN_VALUE);
    L34:
        if (r22 >= (r28 + r30)) goto L74;
        int r31 = (int) (r21 & 4294967295L);
        if (Float.intBitsToFloat(r31) < (-xi4.i(1, Long.MIN_VALUE))) goto L74;
        if (Float.intBitsToFloat(r31) >= (xi4.i(3, Long.MIN_VALUE) + F())) goto L74;
        l03 r32 = r23.o;
        q03 r33 = r23.n;
        int r110 = r23.p;
        int r34 = r33.b;
        if (r110 != (r34 - 1)) goto L43;
        r23.b(r110 + 1, r34);
        r23.p++;
        r33.a(r19);
        r32.a(rr2.c(0.0f, r25, true));
        Q0(fh0.c(r19, r20.d()), r20, r21, r23, r6, r25, r26, r27);
        r23.p = r110;
        return;
    L43:
        long r35 = r23.a();
        int r111 = r23.p;
        if (g12.D(r35) == false) goto L51;
        int r36 = r33.b;
        int r112 = r36 - 1;
        r23.p = r112;
        r23.b(r36, r33.b);
        r23.p++;
        r33.a(r19);
        r32.a(rr2.c(0.0f, r25, true));
        Q0(fh0.c(r19, r20.d()), r20, r21, r23, r24, r25, r26, r27);
        r23.p = r112;
        if (g12.u(r23.a()) >= 0.0f) goto L48;
        r23.b(r111 + 1, r23.p + 1);
    L48:
        r23.p = r111;
        return;
    L51:
        if (g12.u(r35) <= 0.0f) goto L87;
        int r113 = r23.p;
        r23.b(r113 + 1, r33.b);
        r23.p++;
        r33.a(r19);
        r32.a(rr2.c(0.0f, r25, true));
        Q0(fh0.c(r19, r20.d()), r20, r21, r23, r24, r25, r26, r27);
        r23.p = r113;
        return;
    L87:
        return;
    L32:
        r30 = xi4.i(2, Long.MIN_VALUE);
    L24:
        r18 = xi4.i(0, Long.MIN_VALUE);
    L74:
        if (r27 == false) goto L77;
        F0(r19, r20, r21, r23, r24, r25, r26);
        return;
    L77:
        W0(r19, r20, r21, r23, r24, r25, r26);
        return;
    L14:
        if (r6 != 4) goto L74;
        goto L15
    }

    public abstract void R0(jz r1, sj1 r2);

    public final void S0(long r3, float r5, if1 r6) {
        Y0(r6, false);
        boolean r7 = g02.a(this.S, r3);
        c72 r0 = this.H;
        if (r7 == true) goto L13;
        ((ra) h12.L(r0)).J(-4.0f);
        this.S = r3;
        tb3 r8 = this.g0;
        if (r8 == null) goto L7;
        ((vj1) r8).d(r3);
    L10:
        r0.M(this);
        cf2.l0(this);
        ub3 r4 = r0.A;
        if (r4 == null) goto L13;
        ((ra) r4).t(r0);
        goto L13
    L7:
        f63 r9 = this.J;
        if (r9 == null) goto L10;
        r9.I0();
    L13:
        this.T = r5;
        if (this != ((f63) r0.Q.e)) goto L17;
        ((ra) h12.L(r0)).getRectManager().h(r0);
    L17:
        if (this.B == true) goto L20;
        b0(h0());
        return;
    }

    public final void T0(v03 r13, boolean r14, boolean r15) {
        tb3 r0 = this.g0;
        if (r0 != null) goto L5;
    L41:
        long r16 = this.S;
        float r12 = (int) (r16 >> 32);
        r13.b += r12;
        r13.d += r12;
        float r17 = (int) (r16 & 4294967295L);
        r13.c += r17;
        r13.e += r17;
        return;
    L5:
        if (this.L == false) goto L36;
        if (r15 == false) goto L31;
        long r18 = z0();
        float r4 = r13.b;
        float r6 = r13.c;
        if (r13.d < 0.0f) goto L29;
        long r7 = this.p;
        if (r4 > ((int) (r7 >> 32))) goto L29;
        if (r13.e < 0.0f) goto L29;
        if (r6 > ((int) (r7 & 4294967295L))) goto L29;
        float r8 = Float.intBitsToFloat((int) (r18 >> 32));
        float r9 = Float.intBitsToFloat((int) (r18 & 4294967295L));
        float r10 = (r8 - (r13.d - r13.b)) / 2.0f;
        if (r10 <= 0.0f) goto L19;
        r4 = r4 - r10;
    L22:
        float r11 = (r9 - (r13.e - r13.c)) / 2.0f;
        if (r11 <= 0.0f) goto L25;
        r6 = r6 - r11;
    L28:
        long r19 = (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r6) & 4294967295L);
    L30:
        float r5 = Float.intBitsToFloat((int) (r19 >> 32));
        float r20 = Float.intBitsToFloat((int) (r19 & 4294967295L));
        long r21 = this.p;
        float r22 = (int) (r21 >> 32);
        int r23 = (int) (r18 >> 32);
        float r24 = (int) (r21 & 4294967295L);
        int r110 = (int) (r18 & 4294967295L);
        r13.b(r5, r20, Math.min(Float.intBitsToFloat(r23) + r22, Math.max(r22, Float.intBitsToFloat(r23) + r5)), Math.min(Float.intBitsToFloat(r110) + r24, Math.max(r24, Float.intBitsToFloat(r110) + r20)));
    L34:
        if (r13.c() == false) goto L36;
        return;
    L25:
        float r25 = (-r9) / 2.0f;
        if (r6 >= r25) goto L28;
        r6 = r25;
        goto L28
    L19:
        float r26 = (-r8) / 2.0f;
        if (r4 >= r26) goto L22;
        r4 = r26;
    L29:
        r19 = 0;
        goto L30
    L31:
        if (r14 == false) goto L34;
        long r111 = this.p;
        r13.b(0.0f, 0.0f, (int) (r111 >> 32), (int) (r111 & 4294967295L));
    L36:
        vj1 r1 = (vj1) r0;
        float[] r112 = r1.b();
        if (r1.F == true) goto L41;
        if (r112 != null) goto L40;
        r13.b = 0.0f;
        r13.c = 0.0f;
        r13.d = 0.0f;
        r13.e = 0.0f;
        goto L41
    L40:
        ya4.B(r112, r13);
        goto L41
    }

    public final void U0() {
        if (this.g0 == null) goto L6;
        Y0(null, false);
        this.H.V(false);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [f13] */
    public final void V0(vi2 r20) {
        vi2 r2 = this.Q;
        if (r20 == r2) goto L103;
        this.Q = r20;
        c72 r3 = this.H;
        int r4 = 0;
        if (r2 != null) goto L7;
    L10:
        int r5 = r20.d();
        int r6 = r20.b();
        tb3 r7 = this.g0;
        if (r7 == null) goto L14;
        ((vj1) r7).e((((long) r5) << 32) | (((long) r6) & 4294967295L));
    L18:
        Q((((long) r6) & 4294967295L) | (((long) r5) << 32));
        if (this.M == null) goto L21;
        Z0(false);
    L21:
        boolean r8 = g63.f(4);
        cx2 r9 = A0();
        if (r8 == true) goto L27;
        r9 = r9.r;
        if (r9 != null) goto L27;
    L61:
        ub3 r10 = r3.A;
        if (r10 == null) goto L64;
        ((ra) r10).t(r3);
    L64:
        r3.M(this);
    L65:
        p03 r11 = this.R;
        if (r11 == null) goto L71;
        if (r11.e == 0) goto L71;
    L72:
        p03 r12 = this.R;
        Map r13 = r20.a();
        if (r12 != null) goto L76;
    L92:
        r3.R.p.H.f();
        p03 r14 = this.R;
        if (r14 != null) goto L95;
        p03 r15 = r73.a;
        r14 = new p03();
        this.R = r14;
    L95:
        r14.a();
        Iterator r0 = r20.a().entrySet().iterator();
    L97:
        if (r0.hasNext() == false) goto L131;
        Map.Entry r1 = (Map.Entry) r0.next();
        r14.g(((Number) r1.getValue()).intValue(), r1.getKey());
        goto L97
    L131:
        return;
    L76:
        if (r12.e != r13.size()) goto L92;
        Object[] r16 = r12.b;
        int[] r17 = r12.c;
        long[] r18 = r12.a;
        int r19 = r18.length - 2;
        if (r19 < 0) goto L128;
        int r21 = 0;
    L81:
        long r110 = r18[r21];
        if (((((~r110) << 7) & r110) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L101;
        int r111 = 8 - ((~(r21 - r19)) >>> 31);
        int r112 = r4;
    L84:
        if (r112 >= r111) goto L100;
        if ((255 & r110) >= 128) goto L99;
        int r113 = (r21 << 3) + r112;
        Object r114 = r16[r113];
        int r115 = r17[r113];
        Integer r22 = (Integer) r13.get((pp1) r114);
        if (r22 == null) goto L92;
        if (r22.intValue() != r115) goto L92;
    L99:
        r110 = r110 >> 8;
        r112 = r112 + 1;
        goto L84
    L100:
        if (r111 == 8) goto L101;
        return;
    L101:
        if (r21 == r19) goto L130;
        r21 = r21 + 1;
        r4 = 0;
        goto L81
    L130:
        return;
    L128:
        return;
    L71:
        if (r20.a().isEmpty() == false) goto L72;
        return;
    L27:
        cx2 r23 = D0(r8);
    L28:
        if (r23 == null) goto L61;
        if ((r23.q & 4) == 0) goto L61;
        if ((r23.p & 4) == 0) goto L59;
        ?? r24 = r23;
        ?? r25 = 0;
    L34:
        if (r24 == 0) goto L59;
        if ((r24 instanceof rv0) == true) goto L37;
        if ((r24.p & 4) == 0) goto L58;
        if ((r24 instanceof fo0) == false) goto L58;
        cx2 r116 = ((fo0) r24).C;
        int r117 = 0;
        r24 = r24;
        r25 = r25;
    L44:
        if (r116 == null) goto L56;
        if ((r116.p & 4) == 0) goto L55;
        r117 = r117 + 1;
        r25 = r25;
        if (r117 != 1) goto L50;
        r24 = r116;
        goto L55
    L50:
        if (r25 != 0) goto L52;
        r25 = new f13(new cx2[16]);
    L52:
        if (r24 == 0) goto L54;
        r25.b(r24);
        r24 = 0;
    L54:
        r25.b(r116);
    L55:
        r116 = r116.s;
        r24 = r24;
        r25 = r25;
        goto L44
    L56:
        if (r117 == 1) goto L34;
    L58:
        r24 = j51.c(r25);
        goto L34
    L37:
        ((rv0) r24).y();
    L59:
        if (r23 == r9) goto L61;
        r23 = r23.s;
        goto L28
    L14:
        if (r3.H() == false) goto L18;
        f63 r26 = this.J;
        if (r26 == null) goto L18;
        r26.I0();
        goto L18
    L7:
        if (r20.d() != r2.d()) goto L10;
        if (r20.b() == r2.b()) goto L65;
    }

    public final void W0(cx2 r17, e63 r18, long r19, fm1 r21, int r22, boolean r23, float r24) {
        if (r17 != null) goto L7;
        H0(r18, r19, r21, r22, r23);
        return;
    L7:
        if (r18.f(r17) == true) goto L11;
        W0(fh0.c(r17, r18.d()), r18, r19, r21, r22, r23, r24);
        return;
    L11:
        if (r18.a(r17) == false) goto L43;
        l03 r10 = r21.o;
        q03 r11 = r21.n;
        int r12 = r21.p;
        int r1 = r11.b;
        if (r12 != (r1 - 1)) goto L31;
        int r13 = r12 + 1;
        r21.b(r13, r1);
        r21.p++;
        r11.a(r17);
        r10.a(rr2.c(r24, r23, false));
        Q0(fh0.c(r17, r18.d()), r18, r19, r21, r22, r23, r24, false);
        r21.p = r12;
        if (r13 != (r11.b - 1)) goto L17;
    L20:
        int r0 = r21.p;
        int r2 = r0 + 1;
        r11.k(r2);
        if (r2 < 0) goto L29;
        int r3 = r10.b;
        if (r2 >= r3) goto L29;
        long[] r4 = r10.a;
        long r5 = r4[r2];
        if (r2 == (r3 - 1)) goto L27;
        ti.a0(r4, r4, r2, r0 + 2, r3);
    L27:
        r10.b--;
        return;
    L29:
        kf2.h("Index must be between 0 and size");
        return;
    L17:
        if (g12.D(r21.a()) == true) goto L20;
        return;
    L31:
        long r14 = r21.a();
        int r15 = r21.p;
        int r6 = r11.b;
        int r16 = r6 - 1;
        r21.p = r16;
        r21.b(r6, r11.b);
        r21.p++;
        r11.a(r17);
        r10.a(rr2.c(r24, r23, false));
        Q0(fh0.c(r17, r18.d()), r18, r19, r21, r22, r23, r24, false);
        r21.p = r16;
        long r7 = r21.a();
        if ((r21.p + 1) < (r11.b - 1)) goto L34;
    L40:
        r21.b(r21.p + 1, r11.b);
    L41:
        r21.p = r15;
        return;
    L34:
        if (g12.k(r14, r7) <= 0) goto L40;
        int r8 = r15 + 1;
        boolean r9 = g12.D(r7);
        int r20 = r21.p;
        if (r9 == false) goto L38;
        int r25 = r20 + 2;
    L39:
        r21.b(r8, r25);
        goto L41
    L38:
        r25 = r20 + 1;
        goto L39
    L43:
        Q0(fh0.c(r17, r18.d()), r18, r19, r21, r22, r23, r24, false);
    }

    public final wv3 X0() {
        if (A0().A == false) goto L28;
        q62 r0 = wr1.n(this);
        v03 r1 = this.U;
        if (r1 != null) goto L8;
        r1 = new v03();
        this.U = r1;
    L8:
        long r2 = r0(z0());
        float r5 = 0.0f;
        if (B0() == false) goto L11;
        float r4 = this.X.a;
    L13:
        if (B0() == false) goto L16;
        r5 = this.X.b;
    L16:
        if (B0() == false) goto L18;
        float r6 = this.X.c;
    L20:
        if (B0() == false) goto L22;
        float r7 = this.X.d;
    L23:
        int r8 = (int) (r2 >> 32);
        r1.b = r4 - Float.intBitsToFloat(r8);
        int r3 = (int) (r2 & 4294967295L);
        r1.c = r5 - Float.intBitsToFloat(r3);
        r1.d = Float.intBitsToFloat(r8) + r6;
        r1.e = Float.intBitsToFloat(r3) + r7;
    L24:
        if (this == r0) goto L31;
        this.T0(r1, false, true);
        if (r1.c() == true) goto L28;
        f63 this = this.J;
        this.getClass();
        goto L24
    L31:
        return new wv3(r1.b, r1.c, r1.d, r1.e);
    L22:
        r7 = F();
        goto L23
    L18:
        r6 = G();
        goto L20
    L11:
        r4 = 0.0f;
    L28:
        return wv3.e;
    }

    public final void Y0(if1 r13, boolean r14) {
        c72 r0 = this.H;
        int r1 = 0;
        if (r14 == false) goto L5;
    L12:
        boolean r15 = true;
    L13:
        this.N = r0.J;
        this.O = r0.K;
        if (r0.G() == false) goto L52;
        if (r13 == null) goto L52;
        this.M = r13;
        if (this.g0 != null) goto L49;
        ub3 r16 = h12.L(r0);
        ib r17 = this.d0;
        if (r17 != null) goto L21;
        ib r3 = new ib(6, this, new c63(this, r1));
        this.d0 = r3;
        ib r10 = r3;
    L22:
        c63 r11 = this.e0;
        ra r9 = (ra) r16;
        hd5 r18 = r9.B0;
    L23:
        ReferenceQueue r19 = (ReferenceQueue) r18.p;
        f13 r4 = (f13) r18.o;
        Reference r110 = r19.poll();
        if (r110 == null) goto L26;
        r4.j(r110);
    L26:
        if (r110 != null) goto L23;
    L27:
        int r111 = r4.p;
        if (r111 == 0) goto L32;
        Object r112 = ((Reference) r4.k(r111 - 1)).get();
        if (r112 == null) goto L27;
    L33:
        tb3 r113 = (tb3) r112;
        if (r113 == null) goto L46;
        vj1 r114 = (vj1) r113;
        rj1 r5 = r114.o;
        if (r5 == null) goto L45;
        if (r114.n.s == true) goto L40;
        cz1.a("layer should have been released before reuse");
    L40:
        r114.n = ((jw) r5).m();
        r114.t = false;
        r114.q = r10;
        r114.r = r11;
        r114.D = false;
        r114.E = false;
        r114.F = true;
        ya4.G(r114.u);
        float[] r6 = r114.v;
        if (r6 == null) goto L43;
        ya4.G(r6);
    L43:
        r114.B = tw4.a;
        r114.s = 9223372034707292159L;
        r114.C = null;
        r114.A = 0;
    L47:
        vj1 r115 = (vj1) r113;
        r115.e(this.p);
        r115.d(this.S);
        this.g0 = r113;
        Z0(true);
        r0.U = true;
        this.e0.invoke();
        return;
    L45:
        throw xa3.l("currently reuse is only supported when we manage the layer lifecycle");
    L46:
        r113 = new vj1(((jw) r9.getGraphicsContext()).m(), r9.getGraphicsContext(), r9, r10, r11);
        goto L47
    L32:
        r112 = null;
        goto L33
    L21:
        r10 = r17;
        goto L22
    L49:
        if (r15 == false) goto L97;
        Z0(true);
        return;
    L97:
        return;
    L52:
        this.M = null;
        tb3 r116 = this.g0;
        if (r116 == null) goto L82;
        vj1 r117 = (vj1) r116;
        if (jz4.B(r117.b()) == true) goto L57;
        r0.M(this);
    L57:
        r117.q = null;
        r117.r = null;
        r117.t = true;
        r117.f(false);
        rj1 r118 = r117.o;
        if (r118 == null) goto L75;
        sj1 r7 = r117.n;
        Object r119 = ((jw) r118).p;
        monitor-enter(r119);
    L71:
        th = move-exception;
        throw th;
    L62:
        if (r7.s == true) goto L64;
        r7.s = true;     // Catch: Throwable -> L71
        r7.b();     // Catch: Throwable -> L71
    L64:
        monitor-exit(r119);
        ra r8 = r117.p;
        hd5 r12 = r8.B0;
    L66:
        Reference r120 = ((ReferenceQueue) r12.p).poll();
        if (r120 == null) goto L69;
        ((f13) r12.o).j(r120);
    L69:
        if (r120 != null) goto L66;
        ((f13) r12.o).b(new WeakReference(r117, (ReferenceQueue) r12.p));
        r8.N.j(r117);
    L75:
        this.g0 = null;
        r0.U = true;
        this.e0.invoke();
        if (A0().A == false) goto L82;
        if (r0.H() == false) goto L82;
        ub3 r121 = r0.A;
        if (r121 == null) goto L82;
        ((ra) r121).t(r0);
    L82:
        this.f0 = false;
        return;
    L5:
        if (this.M != r13) goto L12;
        if (h12.c(this.N, r0.J) == false) goto L12;
        if (this.O != r0.K) goto L12;
        r15 = false;
        goto L13
    }

    public final void Z0(boolean r31) {
        tb3 r1 = this.g0;
        if1 r2 = this.M;
        if (r1 == null) goto L202;
        if (r2 == null) goto L201;
        b24 r3 = j0;
        r3.a();
        c72 r4 = this.H;
        r3.z = r4.J;
        r3.A = r4.K;
        r3.x = l93.o0(this.p);
        fx3 r5 = new fx3();
        wb3 r6 = ((ra) h12.L(r4)).getSnapshotObserver();
        r6.a.e(this, h0, new jo(r2, this, r5, 7));
        n62 r7 = this.V;
        if (r7 != null) goto L8;
        r7 = new n62();
        this.V = r7;
    L8:
        n62 r8 = k0;
        r8.getClass();
        r8.a = r7.a;
        r8.b = r7.b;
        r8.c = r7.c;
        r8.d = r7.d;
        r7.a = r3.o;
        r7.b = r3.p;
        r7.c = r3.t;
        r7.d = r3.u;
        vj1 r9 = (vj1) r1;
        ra r10 = r9.p;
        int r11 = r3.n | r9.A;
        r9.y = r3.A;
        oo0 r12 = r3.z;
        r9.x = r12;
        if ((1048576 & r11) == 0) goto L11;
        sj1 r13 = r9.n;
        r3.y.getClass();
        int r14 = r12.V(0.0f);
        r3.y.getClass();
        int r15 = r12.V(0.0f);
        r3.y.getClass();
        int r16 = r12.V(0.0f);
        r3.y.getClass();
        int r17 = r12.V(0.0f);
        r13.v = r14;
        r13.w = r15;
        r13.x = r16;
        r13.y = r17;
        r13.a.t(r14, r15, r16, r17);
        r9.c();
    L11:
        int r18 = r11 & 4096;
        if (r18 == 0) goto L15;
        r9.B = r3.u;
    L15:
        if ((r11 & 1) == 0) goto L21;
        sj1 r19 = r9.n;
        float r110 = r3.o;
        uj1 r111 = r19.a;
        if (r111.c() == r110) goto L21;
        r111.A(r110);
    L21:
        if ((r11 & 2) == 0) goto L27;
        sj1 r112 = r9.n;
        float r113 = r3.p;
        uj1 r114 = r112.a;
        if (r114.N() == r113) goto L27;
        r114.j(r113);
    L27:
        if ((r11 & 4) == 0) goto L33;
        sj1 r115 = r9.n;
        float r116 = r3.q;
        uj1 r117 = r115.a;
        if (r117.b() == r116) goto L33;
        r117.s(r116);
    L33:
        if ((r11 & 8) == 0) goto L39;
        uj1 r118 = r9.n.a;
        if (r118.D() == 0.0f) goto L39;
        r118.E();
    L39:
        if ((r11 & 16) == 0) goto L45;
        uj1 r119 = r9.n.a;
        if (r119.u() == 0.0f) goto L45;
        r119.v();
    L45:
        if ((r11 & 32) == 0) goto L51;
        sj1 r120 = r9.n;
        uj1 r121 = r120.a;
        if (r121.M() == 0.0f) goto L51;
        r121.C();
        r120.g = true;
        r120.a();
    L51:
        if ((r11 & 64) == 0) goto L55;
        sj1 r122 = r9.n;
        long r123 = r3.r;
        uj1 r124 = r122.a;
        float r125 = 0.0f;
        if (x40.c(r123, r124.p()) == true) goto L57;
        r124.y(r123);
    L57:
        if ((r11 & 128) == 0) goto L62;
        sj1 r126 = r9.n;
        long r127 = r3.s;
        uj1 r128 = r126.a;
        if (x40.c(r127, r128.x()) == true) goto L62;
        r128.J(r127);
    L62:
        if ((r11 & 1024) == 0) goto L68;
        uj1 r129 = r9.n.a;
        if (r129.n() == r125) goto L68;
        r129.I();
    L68:
        if ((r11 & 256) == 0) goto L74;
        uj1 r130 = r9.n.a;
        if (r130.G() == r125) goto L74;
        r130.r();
    L74:
        if ((r11 & 512) == 0) goto L80;
        uj1 r131 = r9.n.a;
        if (r131.l() == r125) goto L80;
        r131.w();
    L80:
        if ((r11 & 2048) == 0) goto L86;
        sj1 r132 = r9.n;
        float r133 = r3.t;
        uj1 r134 = r132.a;
        if (r134.B() == r133) goto L86;
        r134.L(r133);
    L86:
        if (r18 == 0) goto L100;
        long r135 = r9.B;
        if (r135 != tw4.a) goto L90;
        boolean r20 = true;
    L91:
        sj1 r136 = r9.n;
        if (r20 == true) goto L94;
        float r21 = Float.intBitsToFloat((int) (r135 >> 32)) * ((int) (r9.s >> 32));
        float r137 = Float.intBitsToFloat((int) (r9.B & 4294967295L)) * ((int) (r9.s & 4294967295L));
        long r138 = Float.floatToRawIntBits(r21);
        long r22 = (((long) Float.floatToRawIntBits(r137)) & 4294967295L) | (r138 << 32);
        if (g83.b(r136.z, r22) == true) goto L100;
        r136.z = r22;
        r136.a.o(r22);
        goto L100
    L94:
        if (g83.b(r136.z, 9205357640488583168L) == true) goto L100;
        r136.z = 9205357640488583168L;
        r136.a.o(9205357640488583168L);
        goto L100
    L90:
        r20 = false;
    L100:
        if ((r11 & 16384) == 0) goto L105;
        sj1 r23 = r9.n;
        boolean r139 = r3.w;
        if (r23.A == r139) goto L105;
        r23.A = r139;
        r23.g = true;
        r23.a();
    L105:
        if ((131072 & r11) == 0) goto L108;
        uj1 r24 = r9.n.a;
    L108:
        if ((262144 & r11) == 0) goto L113;
        uj1 r25 = r9.n.a;
        if (h12.c(r25.i(), null) == true) goto L113;
        r25.z();
    L113:
        if ((524288 & r11) == 0) goto L119;
        sj1 r26 = r9.n;
        int r140 = r3.B;
        uj1 r27 = r26.a;
        if (r27.O() == r140) goto L119;
        r27.e(r140);
    L119:
        if ((32768 & r11) == 0) goto L125;
        uj1 r28 = r9.n.a;
        if (r28.h() == 0) goto L125;
        r28.H(0);
    L125:
        if ((r11 & 7963) == 0) goto L128;
        r9.D = true;
        r9.E = true;
    L128:
        if (h12.c(r9.C, r3.C) == true) goto L159;
        ya4 r29 = r3.C;
        r9.C = r29;
        if (r29 != null) goto L132;
        r4 = r4;
        r5 = r5;
    L156:
        boolean r141 = true;
    L160:
        r9.A = r3.n;
        if (r11 != 0) goto L164;
        if (r141 == true) goto L164;
    L172:
        boolean r30 = this.L;
        boolean r32 = r3.w;
        this.L = r32;
        this.P = r3.q;
        if (r8.a == r7.a) goto L175;
    L181:
        boolean r142 = false;
    L182:
        if (r31 == false) goto L188;
        if (r142 == false) goto L187;
        if (r30 != r32) goto L187;
        if (r5.n == false) goto L188;
    L187:
        c72 r33 = r4;
        ub3 r34 = r33.A;
        if (r34 == null) goto L192;
        ((ra) r34).t(r33);
    L192:
        if (r142 == true) goto L203;
        r33.M(this);
        if (r33.Y <= 0) goto L206;
        ra r0 = (ra) h12.L(r33);
        rm3 r35 = r0.f0.e;
        r35.getClass();
        if (r33.Y <= 0) goto L198;
        ((f13) r35.n).b(r33);
        r33.X = true;
    L198:
        r0.D(null);
        return;
    L206:
        return;
    L203:
        return;
    L188:
        r33 = r4;
        goto L192
    L175:
        if (r8.b != r7.b) goto L181;
        if (r8.c != r7.c) goto L181;
        if (r8.d != r7.d) goto L181;
        r142 = true;
    L164:
        if (Build.VERSION.SDK_INT < 26) goto L168;
        ViewParent r36 = r10.getParent();
        if (r36 == null) goto L170;
        rg3.k(r36, r10, r10);
    L170:
        if (ra.l() == false) goto L172;
        r10.J(0.0f);
        goto L172
    L168:
        r10.invalidate();
        goto L170
    L132:
        sj1 r143 = r9.n;
        if ((r29 instanceof nb3) == false) goto L137;
        wv3 r144 = ((nb3) r29).f;
        float r145 = r144.a;
        float r146 = r144.b;
        long r210 = (Float.floatToRawIntBits(r145) << 32) | (((long) Float.floatToRawIntBits(r146)) & 4294967295L);
        float r147 = r144.c - r145;
        float r148 = r144.d - r146;
        r143.f(r210, (Float.floatToRawIntBits(r147) << 32) | (((long) Float.floatToRawIntBits(r148)) & 4294967295L), 0.0f);
    L146:
        if (Build.VERSION.SDK_INT >= 33) goto L156;
        if ((r29 instanceof mb3) == false) goto L150;
    L153:
        gf1 r37 = r9.r;
        if (r37 == null) goto L156;
        r37.invoke();
        goto L156
    L150:
        if ((r29 instanceof ob3) == false) goto L156;
        if (wr1.K(((ob3) r29).f) == true) goto L156;
    L137:
        if ((r29 instanceof mb3) == false) goto L140;
        nc r149 = ((mb3) r29).f;
        r143.k = null;
        r143.i = 9205357640488583168L;
        r143.h = 0;
        r143.j = 0.0f;
        r143.g = true;
        r143.n = false;
        r143.l = r149;
        r143.a();
        goto L146
    L140:
        if ((r29 instanceof ob3) == false) goto L157;
        ob3 r150 = (ob3) r29;
        nc r151 = r150.g;
        if (r151 == null) goto L144;
        r143.k = null;
        r143.i = 9205357640488583168L;
        r143.h = 0;
        r143.j = 0.0f;
        r143.g = true;
        r143.n = false;
        r143.l = r151;
        r143.a();
        goto L146
    L144:
        g34 r38 = r150.f;
        float r152 = r38.b;
        float r153 = r38.a;
        long r211 = (Float.floatToRawIntBits(r153) << 32) | (((long) Float.floatToRawIntBits(r152)) & 4294967295L);
        float r39 = r38.c - r153;
        float r154 = r38.d - r152;
        r143.f(r211, (Float.floatToRawIntBits(r39) << 32) | (Float.floatToRawIntBits(r154) & 4294967295L), Float.intBitsToFloat((int) (r38.h >> 32)));
        goto L146
    L157:
        er1.n();
        return;
    L159:
        r4 = r4;
        r5 = r5;
        r141 = false;
        goto L160
    L55:
        r125 = 0.0f;
        goto L57
    L201:
        throw xa3.l("updateLayerParameters requires a non-null layerBlock");
    L202:
        if (r2 == null) goto L207;
        cz1.b("null layer with a non-null layerBlock");
        return;
    }

    public final boolean a1(long r24) {
        if ((((9187343241974906880L ^ (r24 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) goto L74;
        tb3 r1 = this.g0;
        if (r1 != null) goto L7;
    L72:
        return true;
    L7:
        if (this.L == false) goto L72;
        float r5 = Float.intBitsToFloat((int) (r24 >> 32));
        float r4 = Float.intBitsToFloat((int) (r24 & 4294967295L));
        sj1 r2 = ((vj1) r1).n;
        if (r2.A == false) goto L69;
        ya4 r3 = r2.d();
        if ((r3 instanceof nb3) == false) goto L23;
        wv3 r0 = ((nb3) r3).f;
        if (r0.a <= r5) goto L15;
    L21:
        boolean r16 = false;
        boolean r17 = true;
    L63:
        boolean r6 = r16;
    L70:
        if (r6 == false) goto L77;
        return r17;
    L77:
        return r16;
    L15:
        if (r5 >= r0.c) goto L21;
        if (r0.b > r4) goto L21;
        if (r4 >= r0.d) goto L21;
    L23:
        if ((r3 instanceof ob3) == false) goto L64;
        g34 r7 = ((ob3) r3).f;
        float r8 = r7.c;
        float r9 = r7.b;
        float r10 = r7.d;
        float r11 = r7.a;
        long r12 = r7.f;
        long r14 = r7.h;
        r16 = false;
        r17 = true;
        long r13 = r7.g;
        long r15 = r7.e;
        if (r5 < r11) goto L63;
        if (r5 >= r8) goto L63;
        if (r4 < r9) goto L63;
        if (r4 >= r10) goto L63;
        int r18 = (int) (r15 >> 32);
        float r19 = Float.intBitsToFloat(r18);
        int r20 = (int) (r12 >> 32);
        if ((Float.intBitsToFloat(r20) + r19) > (r8 - r11)) goto L62;
        int r21 = (int) (r14 >> 32);
        float r22 = Float.intBitsToFloat(r21);
        int r23 = (int) (r13 >> 32);
        if ((Float.intBitsToFloat(r23) + r22) > (r8 - r11)) goto L62;
        int r25 = (int) (r15 & 4294967295L);
        float r26 = Float.intBitsToFloat(r25);
        int r27 = (int) (r14 & 4294967295L);
        if ((Float.intBitsToFloat(r27) + r26) > (r10 - r9)) goto L62;
        int r28 = (int) (r12 & 4294967295L);
        float r110 = Float.intBitsToFloat(r28);
        int r29 = (int) (r13 & 4294967295L);
        if ((Float.intBitsToFloat(r29) + r110) > (r10 - r9)) goto L62;
        float r30 = Float.intBitsToFloat(r18) + r11;
        float r31 = Float.intBitsToFloat(r25) + r9;
        float r111 = r8 - Float.intBitsToFloat(r20);
        float r32 = Float.intBitsToFloat(r28) + r9;
        float r33 = r8 - Float.intBitsToFloat(r23);
        float r34 = r10 - Float.intBitsToFloat(r29);
        float r112 = r10 - Float.intBitsToFloat(r27);
        float r35 = Float.intBitsToFloat(r21) + r11;
        if (r5 >= r30) goto L47;
        if (r4 >= r31) goto L47;
        r6 = gi1.C(r5, r4, r30, r31, r7.e);
    L47:
        if (r5 >= r35) goto L52;
        if (r4 <= r112) goto L52;
        r6 = gi1.C(r5, r4, r35, r112, r7.h);
    L52:
        if (r5 <= r111) goto L57;
        if (r4 >= r32) goto L57;
        r6 = gi1.C(r5, r4, r111, r32, r7.f);
    L57:
        if (r5 > r33) goto L59;
    L61:
        r6 = r17;
        goto L70
    L59:
        if (r4 <= r34) goto L61;
        r6 = gi1.C(r5, r4, r33, r34, r7.g);
    L62:
        nc r36 = pc.a();
        nc.b(r36, r7);
        r6 = gi1.y(r5, r4, r36);
        goto L70
    L64:
        r16 = false;
        r17 = true;
        if ((r3 instanceof mb3) == false) goto L67;
        r6 = gi1.y(r5, r4, ((mb3) r3).f);
        goto L70
    L67:
        er1.n();
        return false;
    L69:
        r16 = false;
        r17 = true;
        goto L61
    L74:
        return false;
    }

    @Override // defpackage.q62
    public final long b(long r1) {
        long r2 = K0(r1);
        ra r0 = (ra) h12.L(this.H);
        r0.y();
        return ya4.A(r2, r0.k0);
    }

    @Override // defpackage.cf2
    public final cf2 d0() {
        return this.I;
    }

    @Override // defpackage.cf2
    public final q62 e0() {
        return this;
    }

    @Override // defpackage.q62
    public final boolean f() {
        return A0().A;
    }

    @Override // defpackage.cf2
    public final boolean f0() {
        if (this.Q == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.H.J.g();
    }

    @Override // defpackage.cf2
    public final c72 g0() {
        return this.H;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.H.K;
    }

    @Override // defpackage.cf2
    public final vi2 h0() {
        vi2 r0 = this.Q;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.cf2
    public final cf2 i0() {
        return this.J;
    }

    @Override // defpackage.cf2, defpackage.vb3
    public final boolean j() {
        if (this.g0 != null) goto L5;
        return false;
    L5:
        if (this.K == false) goto L7;
        return false;
    L7:
        if (this.H.G() == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.cf2
    public final long j0() {
        return this.S;
    }

    @Override // defpackage.q62
    public final long k() {
        return this.p;
    }

    @Override // defpackage.cf2
    public final void n0() {
        N(this.S, this.T, this.M);
    }

    public final void p0(f63 r6, v03 r7, boolean r8) {
        if (r6 == this) goto L22;
        f63 r0 = this.J;
        if (r0 == null) goto L7;
        r0.p0(r6, r7, r8);
    L7:
        long r1 = this.S;
        float r2 = (int) (r1 >> 32);
        r7.b -= r2;
        r7.d -= r2;
        float r3 = (int) (r1 & 4294967295L);
        r7.c -= r3;
        r7.e -= r3;
        tb3 r4 = this.g0;
        if (r4 == null) goto L19;
        vj1 r5 = (vj1) r4;
        float[] r9 = r5.a();
        if (r5.F == true) goto L15;
        if (r9 != null) goto L13;
        r7.b = 0.0f;
        r7.c = 0.0f;
        r7.d = 0.0f;
        r7.e = 0.0f;
        goto L15
    L13:
        ya4.B(r9, r7);
    L15:
        if (this.L == false) goto L20;
        if (r8 == false) goto L21;
        long r10 = this.p;
        r7.b(0.0f, 0.0f, (int) (r10 >> 32), (int) (r10 & 4294967295L));
        return;
    L21:
        return;
    L20:
        return;
    L19:
        return;
    }

    @Override // defpackage.q62
    public final long q(long r2) {
        if (A0().A == true) goto L5;
        cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
    L5:
        long r3 = K0(r2);
        return ((ra) h12.L(this.H)).p(r3);
    }

    public final long q0(f63 r3, long r4) {
        if (r3 != this) goto L4;
        return r4;
    L4:
        f63 r0 = this.J;
        if (r0 == null) goto L12;
        if (h12.c(r3, r0) == true) goto L12;
        return x0(r0.q0(r3, r4));
    L12:
        return x0(r4);
    }

    public final long r0(long r6) {
        if (B0() == false) goto L5;
        wv3 r0 = this.X;
        float r1 = r0.c - r0.a;
    L7:
        if (B0() == false) goto L9;
        wv3 r5 = this.X;
        float r2 = r5.d - r5.b;
    L10:
        float r3 = Float.intBitsToFloat((int) (r6 >> 32)) - r1;
        float r7 = Float.intBitsToFloat((int) (r6 & 4294967295L)) - r2;
        float r4 = Math.max(0.0f, r3 / 2.0f);
        float r8 = Math.max(0.0f, r7 / 2.0f);
        long r9 = Float.floatToRawIntBits(r4);
        return (((long) Float.floatToRawIntBits(r8)) & 4294967295L) | (r9 << 32);
    L9:
        r2 = F();
        goto L10
    L5:
        r1 = G();
        goto L7
    }

    public final float s0(long r9, long r11) {
        if (G() >= Float.intBitsToFloat((int) (r11 >> 32))) goto L5;
    L7:
        long r12 = r0(r11);
        float r0 = Float.intBitsToFloat((int) (r12 >> 32));
        float r13 = Float.intBitsToFloat((int) (r12 & 4294967295L));
        float r14 = Float.intBitsToFloat((int) (r9 >> 32));
        if (r14 >= 0.0f) goto L10;
        float r15 = -r14;
    L11:
        float r16 = Math.max(0.0f, r15);
        float r10 = Float.intBitsToFloat((int) (r9 & 4294967295L));
        if (r10 >= 0.0f) goto L14;
        float r8 = -r10;
    L15:
        float r17 = Math.max(0.0f, r8);
        long r18 = (Float.floatToRawIntBits(r16) << 32) | (Float.floatToRawIntBits(r17) & 4294967295L);
        if (r0 <= 0.0f) goto L18;
    L19:
        int r19 = (int) (r18 >> 32);
        if (Float.intBitsToFloat(r19) > r0) goto L25;
        int r20 = (int) (r18 & 4294967295L);
        if (Float.intBitsToFloat(r20) > r13) goto L25;
        float r21 = Float.intBitsToFloat(r19);
        float r22 = Float.intBitsToFloat(r20);
        return (r22 * r22) + (r21 * r21);
    L25:
        return Float.POSITIVE_INFINITY;
    L18:
        if (r13 <= 0.0f) goto L25;
    L14:
        r8 = r10 - F();
        goto L15
    L10:
        r15 = r14 - G();
        goto L11
    L5:
        if (F() < Float.intBitsToFloat((int) (r11 & 4294967295L))) goto L7;
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        c72 r0 = this.H;
        if (r0.Q.d(64) == false) goto L36;
        A0();
        cx2 r8 = (sq4) r0.Q.f;
    L5:
        if (r8 == null) goto L36;
        if ((r8.p & 64) == 0) goto L35;
        cx2 r1 = r8;
        f13 r2 = null;
    L9:
        if (r1 == null) goto L35;
        if ((r1 instanceof xo) == true) goto L33;
        if ((r1.p & 64) == 0) goto L32;
        if ((r1 instanceof fo0) == false) goto L32;
        cx2 r4 = ((fo0) r1).C;
        int r5 = 0;
    L18:
        if (r4 == null) goto L30;
        if ((r4.p & 64) == 0) goto L29;
        r5 = r5 + 1;
        if (r5 != 1) goto L24;
        r1 = r4;
        goto L29
    L24:
        if (r2 != null) goto L26;
        r2 = new f13(new cx2[16]);
    L26:
        if (r1 == null) goto L28;
        r2.b(r1);
        r1 = null;
    L28:
        r2.b(r4);
    L29:
        r4 = r4.s;
        goto L18
    L30:
        if (r5 == 1) goto L9;
    L32:
        r1 = j51.c(r2);
        goto L9
    L33:
        ((xo) r1).B.getClass();
        kf2.k();
        return null;
    L35:
        r8 = r8.r;
    L36:
        return null;
    }

    public final void t0(jz r20, sj1 r21) {
        tb3 r2 = this.g0;
        if (r2 == null) goto L95;
        vj1 r3 = (vj1) r2;
        mz r0 = r3.z;
        r3.g();
        r3.n.a.M();
        i61 r6 = r0.o;
        i61 r1 = r0.o;
        r6.q(r20);
        r6.p = r21;
        sj1 r4 = r3.n;
        jz r5 = r1.g();
        sj1 r7 = (sj1) r1.p;
        uj1 r8 = r4.a;
        if (r4.s == false) goto L7;
        return;
    L7:
        long r9 = r4.h;
        Canvas r10 = ba.a(r5);
        boolean r15 = r10.isHardwareAccelerated();
        if (r15 == true) goto L24;
        long r11 = r4.t;
        float r13 = (int) (r11 >> 32);
        float r14 = r13 - r4.v;
        float r12 = (int) (r11 & 4294967295L);
        float r16 = r12 - r4.w;
        long r17 = r4.u;
        float r18 = (r13 + ((int) (r17 >> 32))) + r4.x;
        float r19 = (r12 + ((int) (r17 & 4294967295L))) + r4.y;
        float r22 = r8.b();
        dt r23 = r8.i();
        int r24 = r8.O();
        if (r22 >= 1.0f) goto L12;
    L18:
        Canvas r25 = r10;
        int r26 = 1;
    L19:
        gc r110 = r4.p;
        if (r110 != null) goto L22;
        r110 = fh0.b();
        r4.p = r110;
    L22:
        r110.d(r22);
        r110.e(r24);
        r110.g(r23);
        Paint r27 = (Paint) r110.b;
        float r111 = r16;
        float r112 = r14;
        int r28 = r26;
        r10 = r25;
        r10.saveLayer(r112, r111, r18, r19, r27);
    L23:
        r10.translate(r112, r111);
        Matrix r29 = r8.K();
        r29.preTranslate(r4.v, r4.w);
        r10.concat(r29);
        long r30 = r4.h;
        float r113 = r4.v;
        float r114 = r4.w;
        long r115 = Float.floatToRawIntBits(r113);
        r4.h = g83.d(r30, (((long) Float.floatToRawIntBits(r114)) & 4294967295L) | (r115 << 32));
    L25:
        r4.a();
        if (r8.m() == false) goto L100;
    L28:
        int r116 = 0;
        if (r8.M() <= 0.0f) goto L31;
        int r31 = r28;
    L32:
        if (r31 == 0) goto L34;
        r5.n();
    L34:
        if (r15 == false) goto L36;
    L38:
        int r32 = 0;
    L39:
        if (r32 == 0) goto L55;
        r5.e();
        ya4 r117 = r4.d();
        if ((r117 instanceof nb3) == false) goto L44;
        wv3 r118 = ((nb3) r117).f;
        r5.m(r118.a, r118.b, r118.c, r118.d);
        goto L55
    L44:
        if ((r117 instanceof ob3) == false) goto L51;
        nc r119 = r4.m;
        if (r119 == null) goto L48;
        r119.a.rewind();
    L49:
        nc.b(r119, ((ob3) r117).f);
        r5.i(r119);
        goto L55
    L48:
        r119 = pc.a();
        r4.m = r119;
        goto L49
    L51:
        if ((r117 instanceof mb3) == false) goto L53;
        r5.i(((mb3) r117).f);
        goto L55
    L53:
        er1.n();
        return;
    L55:
        if (r7 == null) goto L76;
        jw r33 = r7.r;
        if (r33.n == true) goto L59;
        bz1.a("Only add dependencies during a tracking");
    L59:
        x03 r120 = (x03) r33.q;
        if (r120 == null) goto L63;
        r120.a(r4);
    L66:
        x03 r121 = (x03) r33.r;
        if (r121 == null) goto L70;
        r116 = !r121.l(r4) ? 1 : 0;
    L73:
        if (r116 == 0) goto L76;
        r4.q += r28;
        goto L76
    L70:
        if (((sj1) r33.p) == r4) goto L72;
        r116 = r28;
        goto L73
    L72:
        r33.p = null;
        goto L73
    L63:
        if (((sj1) r33.o) == null) goto L65;
        x03 r122 = w54.a;
        x03 r123 = new x03();
        Object r124 = (sj1) r33.o;
        r124.getClass();
        r123.a(r124);
        r123.a(r4);
        r33.q = r123;
        r33.o = null;
        goto L66
    L65:
        r33.o = r4;
    L76:
        if (((aa) r5).a.isHardwareAccelerated() == true) goto L86;
        mz r34 = r4.o;
        if (r34 != null) goto L80;
        r34 = new mz();
        r4.o = r34;
    L80:
        i61 r35 = r34.o;
        oo0 r36 = r4.b;
        r62 r125 = r4.c;
        long r126 = l93.o0(r4.u);
        oo0 r127 = r35.h();
        r62 r128 = r35.i();
        jz r37 = r35.g();
        long r38 = r35.j();
        sj1 r39 = (sj1) r35.p;
        r35.r(r36);
        r35.s(r125);
        r35.q(r5);
        r35.t(r126);
        r35.p = r4;
        r5.e();
        r4.c(r34);     // Catch: Throwable -> L83
        r5.k();
        r35.r(r127);
        r35.s(r128);
        r35.q(r37);
        r35.t(r38);
        r35.p = r39;
    L87:
        if (r32 == 0) goto L89;
        r5.k();
    L89:
        if (r31 == 0) goto L91;
        r5.f();
    L91:
        if (r15 == true) goto L93;
        r10.restore();
    L93:
        r4.h = r9;
        return;
    L83:
        th = move-exception;
        r5.k();
        r35.r(r127);
        r35.s(r128);
        r35.q(r37);
        r35.t(r38);
        r35.p = r39;
        throw th;
    L86:
        r8.g(r5);
        goto L87
    L36:
        if (r4.A == false) goto L38;
        r32 = r28;
        goto L39
    L31:
        r31 = 0;
        goto L32
    L100:
        r4.a.q(r4.b, r4.c, r4, r4.e);     // Catch: Throwable -> L97
        goto L28
    L12:
        if (r24 != 3) goto L18;
        if (r23 != null) goto L18;
        r25 = r10;
        r26 = 1;
        if (r8.h() == 1) goto L19;
        r25.save();
        r28 = 1;
        r111 = r16;
        r112 = r14;
        r10 = r25;
        goto L23
    L24:
        r28 = 1;
        goto L25
    L95:
        long r40 = this.S;
        float r41 = (int) (r40 >> 32);
        float r42 = (int) (r40 & 4294967295L);
        r20.j(r41, r42);
        u0(r20, r21);
        r20.j(-r41, -r42);
    }

    @Override // defpackage.q62
    public final q62 u() {
        boolean r0 = A0().A;
        c72 r1 = this.H;
        if (r0 == true) goto L8;
        StringBuilder r2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
        c72 r3 = r1;
    L5:
        if (r3 == null) goto L7;
        r2.append("\n|");
        r2.append(r3);
        r2.append(" isAttached=");
        r2.append(r3.G());
        r2.append(" modifier=");
        r2.append(r3.V);
        r2.append(" tail=");
        r2.append(A0());
        r3 = r3.t();
        goto L5
    L7:
        cz1.b(r2.toString());
    L8:
        L0();
        return ((f63) r1.Q.e).J;
    }

    public final void u0(jz r12, sj1 r13) {
        cx2 r1 = C0(4);
        if (r1 != null) goto L6;
        R0(r12, r13);
        return;
    L6:
        c72 r2 = this.H;
        r2.getClass();
        e72 r3 = ((ra) h12.L(r2)).getSharedDrawScope();
        long r5 = l93.o0(this.p);
        r3.getClass();
        f13 r10 = null;
    L7:
        if (r1 == null) goto L32;
        if ((r1 instanceof rv0) == false) goto L11;
        f63 r7 = this;
        jz r4 = r12;
        sj1 r9 = r13;
        r3.b(r4, r5, r7, (rv0) r1, r9);
    L31:
        r1 = j51.c(r10);
    L30:
        r12 = r4;
        f63 this = r7;
        r13 = r9;
        goto L7
    L11:
        r7 = this;
        r4 = r12;
        r9 = r13;
        if ((r1.p & 4) == 0) goto L31;
        if ((r1 instanceof fo0) == false) goto L31;
        cx2 r11 = ((fo0) r1).C;
        int r14 = 0;
    L17:
        if (r11 == null) goto L29;
        if ((r11.p & 4) == 0) goto L28;
        r14 = r14 + 1;
        if (r14 != 1) goto L23;
        r1 = r11;
        goto L28
    L23:
        if (r10 != null) goto L25;
        r10 = new f13(new cx2[16]);
    L25:
        if (r1 == null) goto L27;
        r10.b(r1);
        r1 = null;
    L27:
        r10.b(r11);
    L28:
        r11 = r11.s;
        goto L17
    L29:
        if (r14 != 1) goto L31;
    }

    public abstract void v0();

    public final f63 w0(f63 r6) {
        c72 r0 = r6.H;
        c72 r1 = this.H;
        if (r0 != r1) goto L15;
        cx2 r2 = r6.A0();
        cx2 r3 = A0();
        if (r3.n.A == true) goto L7;
        cz1.b("visitLocalAncestors called on an unattached node");
    L7:
        cx2 r4 = r3.n.r;
    L8:
        if (r4 == null) goto L29;
        if ((r4.p & 2) == 0) goto L13;
        if (r4 != r2) goto L13;
    L32:
        return r6;
    L13:
        r4 = r4.r;
    L29:
        return this;
    L15:
        if (r0.B <= r1.B) goto L17;
        r0 = r0.t();
        r0.getClass();
        goto L15
    L17:
        c72 r5 = r1;
    L19:
        if (r5.B <= r0.B) goto L21;
        r5 = r5.t();
        r5.getClass();
    L21:
        if (r0 == r5) goto L28;
        r0 = r0.t();
        r5 = r5.t();
        if (r0 == null) goto L26;
        if (r5 != null) goto L21;
    L26:
        kf2.n("layouts are not part of the same hierarchy");
        return null;
    L28:
        if (r5 == r1) goto L29;
        if (r0 == r6.H) goto L32;
        return (iz1) r0.Q.d;
    }

    public final long x0(long r7) {
        long r0 = this.S;
        float r3 = Float.intBitsToFloat((int) (r7 >> 32)) - ((int) (r0 >> 32));
        float r8 = Float.intBitsToFloat((int) (r7 & 4294967295L)) - ((int) (r0 & 4294967295L));
        long r1 = Float.floatToRawIntBits(r3);
        long r9 = (((long) Float.floatToRawIntBits(r8)) & 4294967295L) | (r1 << 32);
        tb3 r6 = this.g0;
        if (r6 == null) goto L13;
        vj1 r10 = (vj1) r6;
        float[] r2 = r10.a();
        if (r2 != null) goto L9;
        return 9187343241974906880L;
    L9:
        if (r10.F == true) goto L13;
        return ya4.A(r9, r2);
    L13:
        return r9;
    }

    public abstract ef2 y0();

    @Override // defpackage.q62
    public final long z(q62 r1, long r2) {
        return A(r1, r2);
    }

    public final long z0() {
        return this.N.Y(this.H.L.a());
    }
}
