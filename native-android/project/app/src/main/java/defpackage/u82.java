package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u82 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ x82 o;

    public /* synthetic */ u82(x82 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        int r0 = this.n;
        int r1 = 0;
        x82 r4 = this.o;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        int r6 = ((Integer) r5).intValue();
        nc3 r2 = (nc3) r4.B.invoke();
        if (r6 >= 0) goto L7;
    L9:
        fz1.a("Can't scroll to index " + r6 + ", it is out of bounds [0, " + r2.b() + ")");
    L10:
        fu.G(r4.e0(), null, null, new w82(r4, r6, null, 0), 3);
        return Boolean.TRUE;
    L7:
        if (r6 >= r2.b()) goto L9;
    L12:
        nc3 r7 = (nc3) r4.B.invoke();
        int r3 = r7.b();
    L13:
        if (r1 >= r3) goto L18;
        if (r7.c(r1).equals(r5) == true) goto L20;
        r1 = r1 + 1;
    L20:
        return Integer.valueOf(r1);
    L18:
        r1 = -1;
        goto L20
    }
}
