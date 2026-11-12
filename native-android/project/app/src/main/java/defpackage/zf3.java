package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf3 extends b1 {
    public final xf3 p;
    public int q;
    public wx4 r;
    public int s;

    public zf3(xf3 xf3Var, int i) {
        super(i, xf3Var.u);
        this.p = xf3Var;
        this.q = xf3Var.f();
        this.s = -1;
        b();
    }

    public final void a() {
        if (this.q == this.p.f()) {
            return;
        }
        kf2.c();
    }

    @Override // defpackage.b1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.n;
        xf3 xf3Var = this.p;
        xf3Var.add(i, obj);
        this.n++;
        this.o = xf3Var.a();
        this.q = xf3Var.f();
        this.s = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        xf3 xf3Var = this.p;
        Object[] objArr = xf3Var.s;
        if (objArr == null) {
            this.r = null;
            return;
        }
        int i = (xf3Var.u - 1) & (-32);
        int i2 = this.n;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (xf3Var.q / 5) + 1;
        wx4 wx4Var = this.r;
        if (wx4Var == null) {
            this.r = new wx4(objArr, i2, i, i3);
            return;
        }
        wx4Var.n = i2;
        wx4Var.o = i;
        wx4Var.p = i3;
        if (wx4Var.q.length < i3) {
            wx4Var.q = new Object[i3];
        }
        wx4Var.q[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        wx4Var.r = r0;
        wx4Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        int i = this.n;
        this.s = i;
        wx4 wx4Var = this.r;
        xf3 xf3Var = this.p;
        if (wx4Var == null) {
            Object[] objArr = xf3Var.t;
            this.n = i + 1;
            return objArr[i];
        }
        if (wx4Var.hasNext()) {
            this.n++;
            return wx4Var.next();
        }
        Object[] objArr2 = xf3Var.t;
        int i2 = this.n;
        this.n = i2 + 1;
        return objArr2[i2 - wx4Var.o];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            tb4.k();
            return null;
        }
        int i = this.n;
        this.s = i - 1;
        wx4 wx4Var = this.r;
        xf3 xf3Var = this.p;
        if (wx4Var == null) {
            Object[] objArr = xf3Var.t;
            int i2 = i - 1;
            this.n = i2;
            return objArr[i2];
        }
        int i3 = wx4Var.o;
        if (i <= i3) {
            this.n = i - 1;
            return wx4Var.previous();
        }
        Object[] objArr2 = xf3Var.t;
        int i4 = i - 1;
        this.n = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.b1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.s;
        if (i == -1) {
            tb4.a();
            return;
        }
        xf3 xf3Var = this.p;
        xf3Var.b(i);
        int i2 = this.s;
        if (i2 < this.n) {
            this.n = i2;
        }
        this.o = xf3Var.a();
        this.q = xf3Var.f();
        this.s = -1;
        b();
    }

    @Override // defpackage.b1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.s;
        if (i == -1) {
            tb4.a();
            return;
        }
        xf3 xf3Var = this.p;
        xf3Var.set(i, obj);
        this.q = xf3Var.f();
        b();
    }
}
