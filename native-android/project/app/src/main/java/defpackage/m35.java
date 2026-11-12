package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m35 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ n35 o;

    public /* synthetic */ m35(n35 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r10) {
        int r0 = this.n;
        j15 r1 = j15.a;
        n35 r9 = this.o;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        sv0 r11 = (sv0) r10;
        gk1 r2 = r9.b;
        float r3 = r9.k;
        float r12 = r9.l;
        i61 r4 = r11.O();
        long r5 = r4.j();
        r4.g().e();
        ((zg5) r4.o).B(r3, r12, 0);     // Catch: Throwable -> L8
        r2.a(r11);     // Catch: Throwable -> L8
        r4.g().k();
        r4.t(r5);
        return r1;
    L8:
        th = move-exception;
        r4.g().k();
        r4.t(r5);
        throw th;
    L11:
        i35 r13 = (i35) r10;
        r9.d = true;
        r9.f.invoke();
        return r1;
    }
}
