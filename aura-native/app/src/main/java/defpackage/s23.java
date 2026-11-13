package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s23 implements Iterator, x32 {
    public int n = -1;
    public boolean o;
    public final /* synthetic */ t23 p;

    public s23(t23 t23Var) {
        this.p = t23Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n + 1 < this.p.x.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        this.o = true;
        mj4 mj4Var = this.p.x;
        int i = this.n + 1;
        this.n = i;
        return (r23) mj4Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.o) {
            kf2.o("You must call next() before you can remove an element");
            return;
        }
        mj4 mj4Var = this.p.x;
        ((r23) mj4Var.f(this.n)).o = null;
        int i = this.n;
        Object[] objArr = mj4Var.p;
        Object obj = objArr[i];
        Object obj2 = su3.f;
        if (obj != obj2) {
            objArr[i] = obj2;
            mj4Var.n = true;
        }
        this.n = i - 1;
        this.o = false;
    }
}
