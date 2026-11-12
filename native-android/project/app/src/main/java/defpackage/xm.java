package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm implements qc2, wc0, ne4 {
    public final /* synthetic */ long n;

    public /* synthetic */ xm(long r1) {
        this.n = r1;
    }

    @Override // defpackage.wc0
    public void accept(Object r3) {
        al3 r4 = (al3) r3;
        r4.O(this.n);
    }

    @Override // defpackage.ne4
    public long get() {
        return this.n;
    }

    @Override // defpackage.qc2
    public void invoke(Object r3) {
        pj0 r4 = (pj0) r3;
        tj0 r0 = r4.b;
        if (r4 != r0.j) goto L10;
        rm r5 = r0.n;
        if (r5 == null) goto L9;
        r5.a(this.n);
        return;
    L9:
        return;
    }
}
