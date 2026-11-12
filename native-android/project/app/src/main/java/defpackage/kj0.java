package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kj0 implements qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ s55 o;

    public /* synthetic */ kj0(q9 r1, s55 r2) {
        this.n = 0;
        this.o = r2;
    }

    @Override // defpackage.qc2
    public final void invoke(Object r6) {
        int r0 = this.n;
        s55 r5 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r6).a(r5);
        return;
    L6:
        ho2 r7 = (ho2) r6;
        ue1 r1 = r7.p;
        if (r1 == null) goto L11;
        tb1 r2 = (tb1) r1.p;
        if (r2.v != (-1)) goto L11;
        sb1 r3 = r2.a();
        r3.t = r5.a;
        r3.u = r5.b;
        tb1 r4 = new tb1(r3);
        int r8 = 6;
        r7.p = new ue1(r1.o, r8, r4, (String) r1.q);
    L11:
        int r9 = r5.a;
    }

    public /* synthetic */ kj0(s55 r2) {
        this.n = 1;
        this.o = r2;
    }
}
