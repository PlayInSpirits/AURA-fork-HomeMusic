package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c63 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ f63 o;

    public /* synthetic */ c63(f63 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        j15 r1 = j15.a;
        f63 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        f63 r4 = r3.J;
        if (r4 == null) goto L7;
        r4.I0();
    L7:
        return r1;
    L8:
        jz r2 = r3.c0;
        r2.getClass();
        r3.u0(r2, r3.b0);
        return r1;
    }
}
