package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay4 extends yx4 {
    public final rf3 q;

    public ay4(rf3 r1) {
        this.q = r1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.p;
        this.p = r0 + 2;
        Object[] r2 = this.n;
        Object r3 = r2[r0];
        Object r1 = r2[r0 + 1];
        return new o03(this.q, r3, r1);
    }
}
