package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ u30 o;

    public /* synthetic */ n(u30 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        u30 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.y0();
        return Boolean.TRUE;
    L6:
        dk0 r1 = (dk0) kb4.q(r3, zx1.a);
        if ((r1 instanceof dk0) == true) goto L9;
        fz1.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + r1);
    L9:
        dk0 r2 = r3.I;
        r3.I = r1;
        if (r2 == null) goto L21;
        if (h12.c(r1, r2) == true) goto L21;
        ck0 r4 = r3.L;
        if (r4 == null) goto L16;
    L17:
        if (r4 == null) goto L19;
        r3.r0(r4);
    L19:
        r3.L = null;
        r3.x0();
        goto L21
    L16:
        if (r3.R == false) goto L17;
    L21:
        return j15.a;
    }
}
