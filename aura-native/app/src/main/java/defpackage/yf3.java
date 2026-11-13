package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yf3 extends b1 {
    public final Object[] p;
    public final wx4 q;

    public yf3(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.p = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.q = new wx4(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        wx4 wx4Var = this.q;
        if (wx4Var.hasNext()) {
            this.n++;
            return wx4Var.next();
        }
        int i = this.n;
        this.n = i + 1;
        return this.p[i - wx4Var.o];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            tb4.k();
            return null;
        }
        int i = this.n;
        wx4 wx4Var = this.q;
        int i2 = wx4Var.o;
        if (i <= i2) {
            this.n = i - 1;
            return wx4Var.previous();
        }
        int i3 = i - 1;
        this.n = i3;
        return this.p[i3 - i2];
    }
}
