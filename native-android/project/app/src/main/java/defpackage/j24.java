package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j24 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ k24 o;

    public /* synthetic */ j24(k24 r1, int r2) {
        this.n = r2;
        this.o = r1;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r9) {
        int r0 = this.n;
        k24 r8 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Double.valueOf(gb.k(r8.k.b(((Number) r9).doubleValue()), r8.e, r8.f));
    L7:
        return Double.valueOf(r8.n.b(gb.k(((Number) r9).doubleValue(), r8.e, r8.f)));
    }
}
