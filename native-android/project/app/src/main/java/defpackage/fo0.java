package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo0 extends cx2 {
    public final int B;
    public cx2 C;

    public fo0() {
        this.B = g63.d(this);
    }

    @Override // defpackage.cx2
    public final void g0() {
        super.g0();
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L8;
        r0.p0(this.u);
        if (r0.A == true) goto L7;
        r0.g0();
    L7:
        r0 = r0.s;
        goto L3
    }

    @Override // defpackage.cx2
    public final void h0() {
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.h0();
        r0 = r0.s;
        goto L3
    L5:
        super.h0();
    }

    @Override // defpackage.cx2
    public final void l0() {
        super.l0();
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.l0();
        r0 = r0.s;
        goto L3
    }

    @Override // defpackage.cx2
    public final void m0() {
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.m0();
        r0 = r0.s;
        goto L3
    L5:
        super.m0();
    }

    @Override // defpackage.cx2
    public final void n0() {
        super.n0();
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.n0();
        r0 = r0.s;
        goto L3
    }

    @Override // defpackage.cx2
    public final void o0(cx2 r1) {
        this.n = r1;
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.o0(r1);
        r0 = r0.s;
        goto L3
    }

    @Override // defpackage.cx2
    public final void p0(f63 r1) {
        this.u = r1;
        cx2 r0 = this.C;
    L3:
        if (r0 == null) goto L5;
        r0.p0(r1);
        r0 = r0.s;
        goto L3
    }

    public final eo0 q0(eo0 r8) {
        cx2 r0 = ((cx2) r8).n;
        if (r0 == r8) goto L19;
        if ((r8 instanceof cx2) == false) goto L7;
        cx2 r2 = (cx2) r8;
    L8:
        if (r2 == null) goto L10;
        cx2 r3 = r2.r;
    L12:
        if (r0 == this.n) goto L14;
    L16:
        kf2.o("Cannot delegate to an already delegated node");
        return null;
    L14:
        if (h12.c(r3, this) == false) goto L16;
    L40:
        return r8;
    L10:
        r3 = null;
        goto L12
    L7:
        r2 = null;
        goto L8
    L19:
        if (r0.A == false) goto L21;
        cz1.b("Cannot delegate to an already attached node");
    L21:
        r0.o0(this.n);
        int r4 = this.p;
        int r5 = g63.e(r0);
        r0.p = r5;
        int r6 = this.p;
        int r7 = r5 & 2;
        if (r7 != 0) goto L24;
    L28:
        r0.s = this.C;
        this.C = r0;
        r0.r = this;
        s0(r5 | this.p, false);
        if (this.A == false) goto L40;
        if (r7 != 0) goto L32;
    L35:
        p0(this.u);
    L36:
        r0.g0();
        r0.m0();
        if (r0.A == true) goto L39;
        cz1.b("autoInvalidateInsertedNode called on unattached node");
    L39:
        g63.a(r0, -1, 1);
        goto L40
    L32:
        if ((r4 & 2) != 0) goto L35;
        w12 r9 = j51.O(this).Q;
        this.n.p0(null);
        r9.g();
        goto L36
    L24:
        if ((r6 & 2) == 0) goto L28;
        if ((this instanceof u62) == true) goto L28;
        cz1.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + r0);
        goto L28
    }

    public final void r0(eo0 r7) {
        cx2 r0 = this.C;
        cx2 r2 = null;
    L3:
        if (r0 == null) goto L25;
        if (r0 == r7) goto L5;
        r2 = r0;
        r0 = r0.s;
        goto L3
    L5:
        boolean r8 = r0.A;
        if (r8 == false) goto L11;
        p03 r4 = g63.a;
        if (r8 == true) goto L10;
        cz1.b("autoInvalidateRemovedNode called on unattached node");
    L10:
        g63.a(r0, -1, 2);
        r0.n0();
        r0.h0();
    L11:
        r0.o0(r0);
        r0.q = 0;
        cx2 r9 = r0.s;
        if (r2 != null) goto L14;
        this.C = r9;
    L15:
        r0.s = null;
        r0.r = null;
        int r10 = this.p;
        int r1 = g63.e(this);
        s0(r1, true);
        if (this.A == true) goto L18;
        return;
    L18:
        if ((r10 & 2) != 0) goto L20;
        return;
    L20:
        if ((r1 & 2) != 0) goto L31;
        w12 r11 = j51.O(this).Q;
        this.n.p0(null);
        r11.g();
        return;
    L31:
        return;
    L14:
        r2.s = r9;
        goto L15
    L25:
        mj0.g(r7, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void s0(int r3, boolean r4) {
        int r0 = this.p;
        this.p = r3;
        if (r0 == r3) goto L24;
        cx2 r1 = this.n;
        if (r1 != this) goto L7;
        this.q = r3;
    L7:
        boolean r2 = this.A;
        ?? r5 = this;
        if (r2 == false) goto L28;
    L9:
        if (r5 == 0) goto L13;
        r3 = r3 | r5.p;
        r5.p = r3;
        if (r5 == r1) goto L13;
        r5 = r5.r;
    L13:
        if (r4 == false) goto L16;
        if (r5 != r1) goto L16;
        r3 = g63.e(r1);
        r1.p = r3;
    L16:
        if (r5 == 0) goto L20;
        cx2 r6 = r5.s;
        if (r6 == null) goto L20;
        int r7 = r6.q;
    L21:
        int r8 = r3 | r7;
        ?? r9 = r5;
    L22:
        if (r9 == 0) goto L29;
        r8 = r8 | r9.p;
        r9.q = r8;
        r9 = r9.r;
        goto L22
    L29:
        return;
    L20:
        r7 = 0;
        goto L21
    L28:
        return;
    }
}
