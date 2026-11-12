package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements ln4, wi2 {
    public final /* synthetic */ j72 n;
    public final /* synthetic */ o72 o;

    public g72(o72 r1) {
        this.o = r1;
        this.n = r1.u;
    }

    @Override // defpackage.oo0
    public final float B(int r1) {
        return this.n.B(r1);
    }

    @Override // defpackage.oo0
    public final float D(float r1) {
        return r1 / this.n.g();
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.p;
    }

    @Override // defpackage.wi2
    public final boolean K() {
        return this.n.K();
    }

    @Override // defpackage.oo0
    public final float M(float r1) {
        return this.n.g() * r1;
    }

    @Override // defpackage.wi2
    public final vi2 T(int r1, int r2, Map r3, if1 r4, if1 r5) {
        return this.n.T(r1, r2, r3, r4, r5);
    }

    @Override // defpackage.oo0
    public final int V(float r1) {
        return this.n.V(r1);
    }

    @Override // defpackage.oo0
    public final long Y(long r1) {
        return this.n.Y(r1);
    }

    @Override // defpackage.oo0
    public final float a0(long r1) {
        return this.n.a0(r1);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.o;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.n.n;
    }

    @Override // defpackage.oo0
    public final long h(float r1) {
        return this.n.h(r1);
    }

    @Override // defpackage.oo0
    public final long i(long r1) {
        return this.n.i(r1);
    }

    @Override // defpackage.ln4
    public final List m(wf1 r10, Object r11) {
        o72 r9 = this.o;
        c72 r0 = r9.n;
        w03 r1 = r9.t;
        c72 r2 = (c72) r1.g(r11);
        if (r2 != null) goto L5;
    L8:
        w03 r3 = r9.y;
        w03 r4 = r9.w;
        f13 r5 = r9.z;
        if (r5.p >= r9.r) goto L12;
        cz1.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
    L12:
        c72 r6 = (c72) r1.g(r11);
        int r7 = r5.p;
        int r8 = r9.r;
        if (r7 != r8) goto L15;
        r5.b(r11);
    L16:
        r9.r++;
        boolean r12 = r4.b(r11);
        int r13 = 0;
        if (r12 == true) goto L20;
        if (r6 != null) goto L20;
        r9.k(r11, r10, false);
        r3.l(r11, r9.f(r11));
    L37:
        c72 r14 = (c72) r4.g(r11);
        if (r14 == null) goto L44;
        List r15 = r14.R.p.S();
        c13 r16 = (c13) r15;
        int r17 = r16.n.p;
    L40:
        if (r13 >= r17) goto L42;
        ((ti2) r16.get(r13)).s.b = true;
        r13 = r13 + 1;
        goto L40
    L42:
        return r15;
    L44:
        return u01.n;
    L20:
        if (r12 == true) goto L25;
        if (r6 == null) goto L25;
        r9.j(((c13) r0.o()).n.i(r6), ((c13) r0.o()).n.p);
        r9.B++;
        r1.j(r11);
        r4.l(r11, r6);
        r3.l(r11, r9.f(r11));
        if (r0.G() == false) goto L25;
        r9.h();
    L25:
        c72 r18 = (c72) r4.g(r11);
        ef3 r19 = null;
        if (r18 == null) goto L28;
        h72 r20 = (h72) r9.s.g(r18);
    L29:
        if (r20 != null) goto L31;
    L33:
        if (r20 == null) goto L35;
        r19 = r20.f;
    L35:
        if (r19 == null) goto L37;
        r9.d(r20, true);
        goto L37
    L31:
        if (r20.d != true) goto L33;
        r9.m(r18, r11, false, r10);
        goto L33
    L28:
        r20 = null;
        goto L29
    L15:
        Object[] r21 = r5.n;
        Object r22 = r21[r8];
        r21[r8] = r11;
        goto L16
    L5:
        if (((c13) r0.o()).n.i(r2) >= r9.q) goto L8;
        return r2.R.p.S();
    }

    @Override // defpackage.oo0
    public final float o(long r1) {
        return this.n.o(r1);
    }

    @Override // defpackage.wi2
    public final vi2 v(int r7, int r8, Map r9, if1 r10) {
        return this.n.T(r7, r8, r9, null, r10);
    }

    @Override // defpackage.oo0
    public final long w(float r1) {
        return this.n.w(r1);
    }
}
