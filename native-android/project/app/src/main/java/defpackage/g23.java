package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g23 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ v23 o;

    public /* synthetic */ g23(v23 r1, int r2) {
        this.n = r2;
        this.o = r1;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        v23 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r23 r3 = (r23) r2;
        r3.getClass();
        return Boolean.valueOf(!r1.l.containsKey(Integer.valueOf(r3.u)));
    L6:
        r23 r4 = (r23) r2;
        r4.getClass();
        return Boolean.valueOf(!r1.l.containsKey(Integer.valueOf(r4.u)));
    }
}
