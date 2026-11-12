package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j72 implements ln4 {
    public r62 n;
    public float o;
    public float p;
    public final /* synthetic */ o72 q;

    public j72(o72 r1) {
        this.q = r1;
        this.n = r62.o;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.p;
    }

    @Override // defpackage.wi2
    public final boolean K() {
        y62 r1 = this.q.n.R.d;
        if (r1 != y62.q) goto L5;
        return true;
    L5:
        if (r1 == y62.o) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.wi2
    public final vi2 T(int r10, int r11, Map r12, if1 r13, if1 r14) {
        if ((r10 & (-16777216)) == 0) goto L5;
    L7:
        cz1.b("Size(" + r10 + " x " + r11 + ") is out of range. Each dimension must be between 0 and 16777215.");
    L9:
        return new i72(r10, r11, r12, r13, this, this.q, r14);
    L5:
        if (((-16777216) & r11) != 0) goto L7;
        goto L7
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.o;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.n;
    }

    @Override // defpackage.ln4
    public final List m(wf1 r11, Object r12) {
        o72 r10 = this.q;
        r10.h();
        c72 r0 = r10.n;
        y62 r1 = r0.R.d;
        y62 r2 = y62.p;
        y62 r3 = y62.n;
        if (r1 == r3) goto L11;
        if (r1 == r2) goto L11;
        if (r1 == y62.o) goto L11;
        if (r1 == y62.q) goto L11;
        cz1.b("subcompose can only be used inside the measure or layout blocks");
    L11:
        w03 r4 = r10.t;
        Object r5 = r4.g(r12);
        if (r5 != null) goto L24;
        r5 = (c72) r10.w.j(r12);
        if (r5 == null) goto L20;
        h72 r8 = (h72) r10.s.g(r5);
        if (r10.B > 0) goto L19;
        cz1.b("Check failed.");
    L19:
        r10.B--;
    L23:
        r4.l(r12, r5);
        goto L24
    L20:
        r5 = r10.n(r12);
        if (r5 != null) goto L23;
        int r6 = r10.q;
        c72 r9 = new c72(2);
        r0.C = true;
        r0.A(r6, r9);
        r0.C = false;
        r5 = r9;
    L24:
        c72 r7 = (c72) r5;
        if (q40.y0(r0.o(), r10.q) == r7) goto L33;
        int r13 = ((c13) r0.o()).n.i(r7);
        if (r13 >= r10.q) goto L30;
        cz1.a("Key \"" + r12 + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
    L30:
        int r14 = r10.q;
        if (r14 == r13) goto L33;
        r10.j(r13, r14);
    L33:
        r10.q++;
        r10.m(r7, r12, false, r11);
        if (r1 == r3) goto L40;
        if (r1 == r2) goto L40;
        return r7.m();
    L40:
        return r7.R.p.S();
    }
}
