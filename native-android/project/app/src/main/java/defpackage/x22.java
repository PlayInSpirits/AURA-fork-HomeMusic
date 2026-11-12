package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 extends cz {
    public final x60 x;

    public x22(vd0 r2, x60 r3) {
        super(1, r2);
        this.x = r3;
    }

    @Override // defpackage.cz
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.cz
    public final Throwable o(a32 r2) {
        Object r1 = this.x.H();
        if ((r1 instanceof z22) == false) goto L8;
        Throwable r0 = ((z22) r1).e();
        if (r0 == null) goto L8;
        return r0;
    L8:
        if ((r1 instanceof a70) == false) goto L12;
        return ((a70) r1).a;
    L12:
        return r2.q();
    }
}
