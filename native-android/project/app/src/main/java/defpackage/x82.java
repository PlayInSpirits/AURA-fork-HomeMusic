package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 extends cx2 implements g94 {
    public gf1 B;
    public s82 C;
    public boolean D;
    public h64 E;
    public final u82 F;
    public u82 G;

    public x82(gf1 r1, s82 r2, boolean r3) {
        this.B = r1;
        this.C = r2;
        this.D = r3;
        this.F = new u82(this, 0);
        q0();
    }

    @Override // defpackage.g94
    public final void c0(q94 r8) {
        c42[] r0 = o94.a;
        p94 r1 = n94.m;
        c42[] r2 = o94.a;
        c42 r3 = r2[6];
        Boolean r4 = Boolean.TRUE;
        r1.getClass();
        r8.a(r1, r4);
        u82 r5 = this.F;
        r8.a(n94.L, r5);
        h64 r6 = this.E;
        if (r6 == null) goto L13;
        p94 r7 = n94.u;
        c42 r9 = r2[12];
        r7.getClass();
        r8.a(r7, r6);
        u82 r10 = this.G;
        if (r10 == null) goto L7;
        r8.a(d94.f, new w2(null, r10));
    L7:
        v82 r11 = new v82(this, 2);
        r8.a(d94.B, new w2(null, new kl3(7, r11)));
        s82 r12 = this.C;
        boolean r13 = r12.b;
        lm0 r14 = r12.a;
        if (r13 == false) goto L10;
        o40 r15 = new o40(r14.n(), 1);
    L11:
        p94 r16 = n94.f;
        c42 r17 = r2[24];
        r16.getClass();
        r8.a(r16, r15);
        return;
    L10:
        r15 = new o40(1, r14.n());
        goto L11
    L13:
        h12.Q("scrollAxisRange");
        throw null;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final void q0() {
        this.E = new h64(new v82(this, 0), new v82(this, 1));
        if (this.D == false) goto L5;
        u82 r0 = new u82(this, 1);
    L6:
        this.G = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
