package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy3 extends d0 implements qe0 {
    public final /* synthetic */ x80 o;
    public final /* synthetic */ yy3 p;

    public xy3(x80 r2, yy3 r3) {
        fz0 r0 = fz0.S;
        this.o = r2;
        this.p = r3;
        super(r0);
    }

    @Override // defpackage.qe0
    public final void n(ne0 r4, Throwable r5) {
        x80 r2 = this.o;
        yy3 r3 = this.p;
        si0.T(r5, new fa(4, r2, r3));
        fz0 r0 = fz0.S;
        qe0 r6 = (qe0) r3.n.K(r0);
        if (r6 == null) goto L6;
        r6.n(r4, r5);
        return;
    L6:
        throw r5;
    }
}
