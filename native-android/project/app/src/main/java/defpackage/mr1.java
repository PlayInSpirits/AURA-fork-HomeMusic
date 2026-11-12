package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ wz2 o;

    public /* synthetic */ mr1(wz2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        wz2 r3 = this.o;
        String r5 = (String) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        nz3 r1 = b11.f(r5);
        r1.d(r5.concat("/api/uploads"));
        r1.b("POST", r3);
        return new oz3(r1);
    L6:
        nz3 r2 = b11.f(r5);
        r2.d(r5.concat("/api/assistant/tasks"));
        r2.b("POST", r3);
        return new oz3(r2);
    }
}
