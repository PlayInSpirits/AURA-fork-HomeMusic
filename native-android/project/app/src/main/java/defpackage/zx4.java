package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zx4 extends yx4 {
    public final /* synthetic */ int q;

    public /* synthetic */ zx4(int r1) {
        this.q = r1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.q) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.p;
        this.p = r0 + 2;
        return this.n[r0 + 1];
    L6:
        int r1 = this.p;
        this.p = r1 + 2;
        return this.n[r1];
    L8:
        int r2 = this.p;
        this.p = r2 + 2;
        Object[] r3 = this.n;
        return new dg2(0, r3[r2], r3[r2 + 1]);
    }
}
