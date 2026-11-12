package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x64 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ z64 o;

    public /* synthetic */ x64(z64 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        z64 r4 = this.o;
        switch(r0) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        ba1 r5 = r4.g0;
        if (r5.n.A == false) goto L29;
        z91 r1 = r5.v0();
        int r2 = r1.ordinal();
        if (r2 == 0) goto L18;
        if (r2 == 1) goto L18;
        if (r2 == 2) goto L18;
        if (r2 == 3) goto L30;
        er1.n();
        return null;
    L30:
        return null;
    L18:
        if (r1.a() == true) goto L27;
        ba1 r3 = ((ey) ((ra) j51.P(r5)).getFocusOwner()).f();
        if (r3 != null) goto L23;
        return null;
    L23:
        return r3.t0(j51.N(r5));
    L27:
        return r5.t0(null);
    L29:
        return null;
    L25:
        return Boolean.valueOf(r4.A);
    }
}
