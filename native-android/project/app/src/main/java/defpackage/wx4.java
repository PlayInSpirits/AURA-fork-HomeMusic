package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx4 extends b1 {
    public int p;
    public Object[] q;
    public boolean r;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public wx4(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.p = i3;
        Object[] objArr2 = new Object[i3];
        this.q = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.r = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.n & 31;
        Object obj = this.q[this.p - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.p - i2) * 5;
        while (i2 < this.p) {
            Object[] objArr = this.q;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[uc5.t(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (uc5.t(this.n, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.n, ((this.p - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        Object objA = a();
        int i = this.n + 1;
        this.n = i;
        if (i == this.o) {
            this.r = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            tb4.k();
            return null;
        }
        this.n--;
        if (this.r) {
            this.r = false;
            return a();
        }
        c(31);
        return a();
    }
}
