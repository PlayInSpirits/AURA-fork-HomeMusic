package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 implements tb3 {
    public int A;
    public long B;
    public ya4 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final x G;
    public sj1 n;
    public final rj1 o;
    public final ra p;
    public wf1 q;
    public gf1 r;
    public long s;
    public boolean t;
    public final float[] u;
    public float[] v;
    public boolean w;
    public oo0 x;
    public r62 y;
    public final mz z;

    public vj1(sj1 r1, rj1 r2, ra r3, wf1 r4, gf1 r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = 9223372034707292159L;
        this.u = ya4.h();
        this.x = new ro0(1.0f, 1.0f);
        this.y = r62.n;
        this.z = new mz();
        this.B = tw4.a;
        this.F = true;
        this.G = new x(14, this);
    }

    public final float[] a() {
        float[] r0 = this.v;
        if (r0 != null) goto L6;
        r0 = ya4.h();
        this.v = r0;
    L6:
        if (this.E == false) goto L8;
        this.E = false;
        float[] r1 = b();
        if (this.F == false) goto L14;
        return r1;
    L14:
        if (q05.q(r1, r0) == false) goto L16;
    L15:
        return r0;
    L16:
        r0[0] = Float.NaN;
        return null;
    L8:
        if (Float.isNaN(r0[0]) == false) goto L15;
        return null;
    }

    public final float[] b() {
        boolean r1 = this.D;
        float[] r2 = this.u;
        if (r1 == false) goto L12;
        sj1 r3 = this.n;
        long r4 = r3.z;
        uj1 r5 = r3.a;
        if ((9223372034707292159L & r4) != 9205357640488583168L) goto L7;
        r4 = h12.q(l93.o0(this.s));
    L7:
        float r6 = Float.intBitsToFloat((int) (r4 >> 32));
        float r7 = Float.intBitsToFloat((int) (r4 & 4294967295L));
        float r8 = r5.D();
        float r9 = r5.u();
        float r10 = r5.G();
        float r11 = r5.l();
        float r12 = r5.n();
        float r13 = r5.c();
        float r14 = r5.N();
        double r15 = ((double) r10) * 0.017453292519943295d;
        float r16 = (float) Math.sin(r15);
        float r17 = (float) Math.cos(r15);
        float r18 = -r16;
        float r19 = (r9 * r17) - (0.0f * r16);
        float r110 = 0.0f * r17;
        float r111 = r110 + (r9 * r16);
        double r112 = ((double) r11) * 0.017453292519943295d;
        float r20 = (float) Math.sin(r112);
        float r21 = (float) Math.cos(r112);
        float r113 = -r20;
        float r114 = r16 * r20;
        float r22 = r16 * r21;
        float r23 = r17 * r20;
        float r24 = r17 * r21;
        float r25 = r111 * r20;
        float r26 = r25 + (r8 * r21);
        float r115 = r111 * r21;
        float r116 = r115 + ((-r8) * r20);
        double r27 = ((double) r12) * 0.017453292519943295d;
        float r28 = (float) Math.sin(r27);
        float r29 = (float) Math.cos(r27);
        float r30 = -r28;
        float r117 = r29 * r114;
        float r118 = r117 + (r30 * r21);
        float r119 = r114 * r28;
        float r120 = r119 + (r21 * r29);
        float r31 = r28 * r17;
        float r121 = r17 * r29;
        float r122 = r29 * r22;
        float r32 = r28 * r22;
        float r123 = r120 * r13;
        float r33 = r31 * r13;
        float r34 = (r32 + (r29 * r113)) * r13;
        float r124 = r118 * r14;
        float r125 = r121 * r14;
        float r126 = (r122 + (r30 * r113)) * r14;
        float r210 = r23 * 1.0f;
        float r127 = r18 * 1.0f;
        float r211 = r24 * 1.0f;
        if (r2.length < 16) goto L11;
        r2[0] = r123;
        r2[1] = r33;
        r2[2] = r34;
        r2[3] = 0.0f;
        r2[4] = r124;
        r2[5] = r125;
        r2[6] = r126;
        r2[7] = 0.0f;
        r2[8] = r210;
        r2[9] = r127;
        r2[10] = r211;
        r2[11] = 0.0f;
        float r35 = -r6;
        r2[12] = (((r123 * r35) - (r7 * r124)) + r26) + r6;
        r2[13] = (((r33 * r35) - (r7 * r125)) + r19) + r7;
        r2[14] = ((r35 * r34) - (r7 * r126)) + r116;
        r2[15] = 1.0f;
    L11:
        this.D = false;
        this.F = jz4.B(r2);
    L12:
        return r2;
    }

    public final void c() {
        if (this.w == false) goto L5;
        return;
    L5:
        if (this.t == true) goto L9;
        this.p.invalidate();
        f(true);
        return;
    }

    public final void d(long r7) {
        boolean r0 = ra.l();
        ra r1 = this.p;
        if (r0 == false) goto L5;
        r1.J(-4.0f);
    L5:
        sj1 r6 = this.n;
        if (g02.a(r6.t, r7) == true) goto L9;
        r6.t = r7;
        long r2 = r6.u;
        r6.a.k((int) (r7 >> 32), (int) (r7 & 4294967295L), r2);
    L9:
        if (Build.VERSION.SDK_INT < 26) goto L14;
        ViewParent r8 = r1.getParent();
        if (r8 == null) goto L16;
        rg3.k(r8, r1, r1);
        return;
    L16:
        return;
    L14:
        r1.invalidate();
    }

    public final void e(long r3) {
        if (n02.a(r3, this.s) == false) goto L5;
        return;
    L5:
        if (ra.l() == false) goto L7;
        this.p.J(-4.0f);
    L7:
        this.s = r3;
        c();
    }

    public final void f(boolean r4) {
        if (r4 == this.w) goto L19;
        this.w = r4;
        ra r0 = this.p;
        q03 r1 = r0.N;
        boolean r2 = r0.P;
        if (r4 == true) goto L11;
        if (r2 == true) goto L20;
        r1.j(this);
        q03 r5 = r0.O;
        if (r5 == null) goto L21;
        r5.j(this);
        return;
    L21:
        return;
    L20:
        return;
    L11:
        if (r2 == true) goto L14;
        r1.a(this);
        return;
    L14:
        q03 r6 = r0.O;
        if (r6 != null) goto L17;
        r6 = new q03();
        r0.O = r6;
    L17:
        r6.a(this);
        return;
    }

    public final void g() {
        ra.l();
        if (this.w == true) goto L5;
        return;
    L5:
        if (this.B != tw4.a) goto L8;
    L12:
        sj1 r0 = this.n;
        oo0 r4 = this.x;
        r62 r5 = this.y;
        long r6 = this.s;
        long r8 = r0.u;
        uj1 r10 = r0.a;
        if (n02.a(r8, r6) == true) goto L17;
        r0.u = r6;
        long r9 = r0.t;
        r10.k((int) (r9 >> 32), (int) (4294967295L & r9), r6);
        if (r0.i != 9205357640488583168L) goto L17;
        r0.g = true;
        r0.a();
    L17:
        r0.b = r4;
        r0.c = r5;
        r0.d = this.G;
        r10.q(r4, r5, r0, r0.e);
        f(false);
        return;
    L8:
        if (n02.a(this.n.u, this.s) == true) goto L12;
        sj1 r1 = this.n;
        float r7 = Float.intBitsToFloat((int) (this.B >> 32)) * ((int) (this.s >> 32));
        float r11 = Float.intBitsToFloat((int) (this.B & 4294967295L)) * ((int) (this.s & 4294967295L));
        long r12 = Float.floatToRawIntBits(r7);
        long r13 = (((long) Float.floatToRawIntBits(r11)) & 4294967295L) | (r12 << 32);
        if (g83.b(r1.z, r13) == true) goto L12;
        r1.z = r13;
        r1.a.o(r13);
        goto L12
    }
}
