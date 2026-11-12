package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pf3 extends of3 {
    public final lf3 q;
    public Object r;
    public boolean s;
    public int t;

    public pf3(lf3 lf3Var, yx4[] yx4VarArr) {
        super(lf3Var.o, yx4VarArr);
        this.q = lf3Var;
        this.t = lf3Var.q;
    }

    public final void c(int i, xx4 xx4Var, Object obj, int i2) {
        int i3 = i2 * 5;
        yx4[] yx4VarArr = this.n;
        if (i3 <= 30) {
            int iA = 1 << si0.A(i, i3);
            if (xx4Var.h(iA)) {
                yx4VarArr[i2].a(xx4Var.d, Integer.bitCount(xx4Var.a) * 2, xx4Var.f(iA));
                this.o = i2;
                return;
            } else {
                int iT = xx4Var.t(iA);
                xx4 xx4VarS = xx4Var.s(iT);
                yx4VarArr[i2].a(xx4Var.d, Integer.bitCount(xx4Var.a) * 2, iT);
                c(i, xx4VarS, obj, i2 + 1);
                return;
            }
        }
        yx4 yx4Var = yx4VarArr[i2];
        Object[] objArr = xx4Var.d;
        yx4Var.a(objArr, objArr.length, 0);
        while (true) {
            yx4 yx4Var2 = yx4VarArr[i2];
            if (h12.c(yx4Var2.n[yx4Var2.p], obj)) {
                this.o = i2;
                return;
            } else {
                yx4VarArr[i2].p += 2;
            }
        }
    }

    @Override // defpackage.of3, java.util.Iterator
    public final Object next() {
        if (this.q.q != this.t) {
            kf2.c();
            return null;
        }
        if (!this.p) {
            tb4.k();
            return null;
        }
        yx4 yx4Var = this.n[this.o];
        this.r = yx4Var.n[yx4Var.p];
        this.s = true;
        return super.next();
    }

    @Override // defpackage.of3, java.util.Iterator
    public final void remove() {
        if (!this.s) {
            tb4.a();
            return;
        }
        boolean z = this.p;
        lf3 lf3Var = this.q;
        if (!z) {
            jz4.f(lf3Var).remove(this.r);
        } else {
            if (!z) {
                tb4.k();
                return;
            }
            yx4 yx4Var = this.n[this.o];
            Object obj = yx4Var.n[yx4Var.p];
            jz4.f(lf3Var).remove(this.r);
            c(obj != null ? obj.hashCode() : 0, lf3Var.o, obj, 0);
        }
        this.r = null;
        this.s = false;
        this.t = lf3Var.q;
    }
}
