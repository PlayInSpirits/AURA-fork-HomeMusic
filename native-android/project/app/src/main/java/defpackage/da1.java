package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da1 extends ig1 implements wf1 {
    @Override // defpackage.wf1
    public final Object invoke(Object r5, Object r6) {
        z91 r7 = (z91) r5;
        z91 r8 = (z91) r6;
        ea1 r4 = (ea1) this.receiver;
        if (r4.A == false) goto L36;
        boolean r9 = r8.a();
        if (r9 == r7.a()) goto L36;
        q r10 = r4.E;
        if (r10 == null) goto L11;
        r10.invoke(Boolean.valueOf(r9));
    L11:
        vd0 r11 = null;
        if (r9 == false) goto L22;
        fu.G(r4.e0(), null, ze0.q, new ac0(r4, r11, 3), 1);
        jx3 r0 = new jx3();
        j51.F(r4, new fa(6, r0, r4));
        l82 r1 = (l82) r0.n;
        if (r1 == null) goto L16;
        r1.a();
    L17:
        r4.G = r1;
        f63 r2 = r4.H;
        if (r2 != null) goto L20;
    L26:
        fu.C(r4);
        rm2 r3 = r4.D;
        if (r3 == null) goto L36;
        p91 r12 = r4.F;
        if (r9 == false) goto L33;
        if (r12 == null) goto L32;
        r4.t0(r3, new q91());
        r4.F = null;
    L32:
        p91 r13 = new p91();
        r4.t0(r3, r13);
        r4.F = r13;
        goto L36
    L33:
        if (r12 == null) goto L36;
        r4.t0(r3, new q91());
        r4.F = null;
        goto L36
    L20:
        if (r2.A0().A == false) goto L26;
        r4.u0();
        goto L26
    L16:
        r1 = null;
        goto L17
    L22:
        l82 r14 = r4.G;
        if (r14 == null) goto L25;
        r14.b();
    L25:
        r4.G = null;
        r4.u0();
    L36:
        return j15.a;
    }
}
