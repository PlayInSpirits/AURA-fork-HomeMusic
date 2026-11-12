package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w14 extends u22 {
    public final x22 u;

    public w14(x22 r1) {
        this.u = r1;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return false;
    }

    @Override // defpackage.u22
    public final void s(Throwable r2) {
        Object r3 = q().H();
        boolean r0 = r3 instanceof a70;
        x22 r1 = this.u;
        if (r0 == false) goto L6;
        r1.resumeWith(kb4.o(((a70) r3).a));
        return;
    L6:
        r1.resumeWith(zz1.M(r3));
    }
}
