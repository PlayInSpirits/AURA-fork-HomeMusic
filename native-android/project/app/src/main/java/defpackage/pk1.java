package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends jc0 {
    public float p0;
    public int q0;
    public int r0;
    public hb0 s0;
    public int t0;
    public boolean u0;

    public pk1() {
        this.p0 = -1.0f;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = this.I;
        int r0 = 0;
        this.t0 = 0;
        this.Q.clear();
        this.Q.add(this.s0);
        int r1 = this.P.length;
    L3:
        if (r0 >= r1) goto L5;
        this.P[r0] = this.s0;
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.jc0
    public final void M(eb2 r3, boolean r4) {
        if (this.S != null) goto L5;
        return;
    L5:
        hb0 r5 = this.s0;
        r3.getClass();
        int r6 = eb2.n(r5);
        if (this.t0 != 1) goto L9;
        this.X = r6;
        this.Y = 0;
        H(this.S.i());
        K(0);
        return;
    L9:
        this.X = 0;
        this.Y = r6;
        K(this.S.o());
        H(0);
    }

    public final void N(int r2) {
        this.s0.i(r2);
        this.u0 = true;
    }

    public final void O(int r4) {
        if (this.t0 == r4) goto L12;
        this.t0 = r4;
        ArrayList r5 = this.Q;
        r5.clear();
        if (this.t0 != 1) goto L8;
        this.s0 = this.H;
    L9:
        r5.add(this.s0);
        hb0[] r6 = this.P;
        int r0 = r6.length;
        int r1 = 0;
    L10:
        if (r1 >= r0) goto L14;
        r6[r1] = this.s0;
        r1 = r1 + 1;
        goto L10
    L14:
        return;
    L8:
        this.s0 = this.I;
        goto L9
    }

    @Override // defpackage.jc0
    public final void b(eb2 r9, boolean r10) {
        kc0 r11 = (kc0) this.S;
        if (r11 == null) goto L53;
        Object r1 = r11.g(2);
        Object r2 = r11.g(4);
        jc0 r3 = this.S;
        boolean r4 = true;
        if (r3 != null) goto L8;
    L10:
        boolean r5 = false;
    L12:
        if (this.t0 != 0) goto L21;
        r1 = r11.g(3);
        r2 = r11.g(5);
        jc0 r12 = this.S;
        if (r12 != null) goto L16;
    L18:
        r4 = false;
    L19:
        r5 = r4;
        goto L21
    L16:
        if (r12.o0[1] != 2) goto L18;
    L21:
        if (this.u0 == false) goto L35;
        hb0 r13 = this.s0;
        if (r13.c == false) goto L35;
        ai4 r14 = r9.k(r13);
        r9.d(r14, this.s0.c());
        if (this.q0 == (-1)) goto L29;
        if (r5 == false) goto L32;
        r9.f(r9.k(r2), r14, 0, 5);
    L32:
        this.u0 = false;
        return;
    L29:
        if (this.r0 == (-1)) goto L32;
        if (r5 == false) goto L32;
        ai4 r0 = r9.k(r2);
        r9.f(r14, r9.k(r1), 0, 5);
        r9.f(r0, r14, 0, 5);
    L35:
        if (this.q0 == (-1)) goto L41;
        ai4 r15 = r9.k(this.s0);
        r9.e(r15, r9.k(r1), this.q0, 8);
        if (r5 == false) goto L50;
        r9.f(r9.k(r2), r15, 0, 5);
        return;
    L50:
        return;
    L41:
        if (this.r0 == (-1)) goto L47;
        ai4 r16 = r9.k(this.s0);
        ai4 r6 = r9.k(r2);
        r9.e(r16, r6, -this.r0, 8);
        if (r5 == false) goto L51;
        r9.f(r16, r9.k(r1), 0, 5);
        r9.f(r6, r16, 0, 5);
        return;
    L51:
        return;
    L47:
        if (this.p0 == (-1.0f)) goto L52;
        ai4 r17 = r9.k(this.s0);
        ai4 r7 = r9.k(r2);
        float r8 = this.p0;
        pi r18 = r9.l();
        r18.d.g(r17, -1.0f);
        r18.d.g(r7, r8);
        r9.c(r18);
        return;
    L52:
        return;
    L8:
        if (r3.o0[0] != 2) goto L10;
        r5 = true;
        goto L12
    }

    @Override // defpackage.jc0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jc0
    public final hb0 g(int r3) {
        int r4 = xa3.w(r3);
        if (r4 == 1) goto L16;
        if (r4 == 2) goto L12;
        if (r4 == 3) goto L16;
        if (r4 == 4) goto L12;
        return null;
    L12:
        if (this.t0 == 0) goto L14;
        return null;
    L14:
        return this.s0;
    L16:
        if (this.t0 == 1) goto L18;
        return null;
    L18:
        return this.s0;
    }

    @Override // defpackage.jc0
    public final boolean y() {
        return this.u0;
    }

    @Override // defpackage.jc0
    public final boolean z() {
        return this.u0;
    }
}
