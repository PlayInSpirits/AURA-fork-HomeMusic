package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc3 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ad3 o;

    public /* synthetic */ vc3(ad3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        ad3 r4 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        int r5 = r4.n();
    L6:
        return Integer.valueOf(r5);
    L7:
        boolean r1 = r4.k.a();
        wd3 r2 = r4.q;
        if (r1 == true) goto L11;
        int r3 = r4.k();
    L20:
        r5 = r4.j(r3);
        goto L6
    L11:
        if (r2.g() == (-1)) goto L13;
        r3 = r2.g();
        goto L20
    L13:
        float r6 = Math.abs(r4.l());
        oo0 r7 = r4.n;
        dd3 r8 = ed3.a;
        if (r6 < Math.abs(Math.min(r7.M(56.0f), r4.o() / 2.0f) / r4.o())) goto L19;
        boolean r9 = ((Boolean) r4.E.getValue()).booleanValue();
        int r10 = r4.e;
        if (r9 == false) goto L18;
        r3 = r10 + 1;
        goto L20
    L18:
        r3 = r10;
        goto L20
    L19:
        r3 = r4.k();
        goto L20
    }
}
