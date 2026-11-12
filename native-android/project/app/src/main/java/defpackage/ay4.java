package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay4 extends yx4 {
    public final rf3 q;

    public ay4(rf3 rf3Var) {
        this.q = rf3Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.p;
        this.p = i + 2;
        Object[] objArr = this.n;
        return new o03(this.q, objArr[i], objArr[i + 1]);
    }
}
