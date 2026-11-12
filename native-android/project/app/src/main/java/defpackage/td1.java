package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ td1(int r1, String r2) {
        this.n = r1;
        this.o = r2;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        String r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        kd3 r3 = (kd3) r2;
        r3.getClass();
        return Boolean.valueOf(h12.c(r3.n, r1));
    L5:
        return Boolean.valueOf(h12.c((String) r2, r1));
    }
}
