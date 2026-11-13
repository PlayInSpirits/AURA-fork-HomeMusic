package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vv extends b1 {
    public final /* synthetic */ int p = 1;
    public final Object q;

    public vv(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.q = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.p;
        Object obj = this.q;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    tb4.k();
                    break;
                } else {
                    int i2 = this.n;
                    this.n = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    tb4.k();
                    break;
                } else {
                    this.n++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.p;
        Object obj = this.q;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    tb4.k();
                    break;
                } else {
                    int i2 = this.n - 1;
                    this.n = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    tb4.k();
                    break;
                } else {
                    this.n--;
                    break;
                }
        }
        return null;
    }

    public vv(int i, Object obj) {
        super(i, 1);
        this.q = obj;
    }
}
