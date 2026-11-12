package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zx4 extends yx4 {
    public final /* synthetic */ int q;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.q) {
            case 0:
                int i = this.p;
                this.p = i + 2;
                Object[] objArr = this.n;
                return new dg2(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.p;
                this.p = i2 + 2;
                return this.n[i2];
            default:
                int i3 = this.p;
                this.p = i3 + 2;
                return this.n[i3 + 1];
        }
    }
}
