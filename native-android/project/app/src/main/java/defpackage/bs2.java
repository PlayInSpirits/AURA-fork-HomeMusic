package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs2 implements ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ls2 o;

    public /* synthetic */ bs2(ls2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.ks2
    public final void b(fr2 r3) {
        int r0 = this.n;
        ls2 r2 = this.o;
        switch(r0) {
            case 0: goto L30;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            case 8: goto L8;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        r2.g.s.I0();
        return;
    L6:
        r2.g.s.c0();
        return;
    L8:
        r2.g.s.H0();
        return;
    L10:
        r2.g.s.stop();
        return;
    L12:
        r2.g.s.b();
        return;
    L14:
        r2.g.i(r3, true);
        return;
    L16:
        r2.g.s.J0();
        return;
    L18:
        r2.g.s.A();
        return;
    L20:
        r2.g.s.S();
        return;
    L22:
        tn2 r4 = r2.g;
        al3 r5 = r4.s;
        if (f35.d0(r5, r4.p) == false) goto L25;
        f35.I(r5);
        return;
    L25:
        if (r5 != null) goto L27;
        return;
    L27:
        if (r5.S0(1) == false) goto L38;
        r5.c();
        return;
    L38:
        return;
    L30:
        al3 r6 = r2.g.s;
        String r7 = f35.a;
        if (r6 != null) goto L33;
        return;
    L33:
        if (r6.S0(1) == false) goto L40;
        r6.c();
        return;
    }
}
