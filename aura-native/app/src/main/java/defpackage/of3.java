package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class of3 implements Iterator, x32 {
    public final yx4[] n;
    public int o;
    public boolean p = true;

    public of3(xx4 xx4Var, yx4[] yx4VarArr) {
        this.n = yx4VarArr;
        yx4VarArr[0].a(xx4Var.d, Integer.bitCount(xx4Var.a) * 2, 0);
        this.o = 0;
        a();
    }

    public final void a() {
        int i = this.o;
        yx4[] yx4VarArr = this.n;
        yx4 yx4Var = yx4VarArr[i];
        if (yx4Var.p < yx4Var.o) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                yx4 yx4Var2 = yx4VarArr[i];
                int i2 = yx4Var2.p;
                Object[] objArr = yx4Var2.n;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    yx4Var2.p = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.o = b;
                return;
            }
            if (i > 0) {
                yx4 yx4Var3 = yx4VarArr[i - 1];
                int i3 = yx4Var3.p;
                int length2 = yx4Var3.n.length;
                yx4Var3.p = i3 + 1;
            }
            yx4VarArr[i].a(xx4.e.d, 0, 0);
            i--;
        }
        this.p = false;
    }

    public final int b(int i) {
        yx4[] yx4VarArr = this.n;
        yx4 yx4Var = yx4VarArr[i];
        int i2 = yx4Var.p;
        if (i2 < yx4Var.o) {
            return i;
        }
        Object[] objArr = yx4Var.n;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        xx4 xx4Var = (xx4) obj;
        if (i == 6) {
            yx4 yx4Var2 = yx4VarArr[i + 1];
            Object[] objArr2 = xx4Var.d;
            yx4Var2.a(objArr2, objArr2.length, 0);
        } else {
            yx4VarArr[i + 1].a(xx4Var.d, Integer.bitCount(xx4Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.p) {
            tb4.k();
            return null;
        }
        Object next = this.n[this.o].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
