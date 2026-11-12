package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 extends zf2 implements Iterator, x32 {
    public final /* synthetic */ int r;

    public xf2(ag2 ag2Var, int i) {
        this.r = i;
        ag2Var.getClass();
        this.q = ag2Var;
        this.o = -1;
        this.p = ag2Var.u;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.r) {
            case 0:
                b();
                int i = this.n;
                ag2 ag2Var = (ag2) this.q;
                if (i >= ag2Var.s) {
                    tb4.k();
                    return null;
                }
                this.n = i + 1;
                this.o = i;
                yf2 yf2Var = new yf2(ag2Var, i);
                e();
                return yf2Var;
            case 1:
                b();
                int i2 = this.n;
                ag2 ag2Var2 = (ag2) this.q;
                if (i2 >= ag2Var2.s) {
                    tb4.k();
                    return null;
                }
                this.n = i2 + 1;
                this.o = i2;
                Object obj = ag2Var2.n[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.n;
                ag2 ag2Var3 = (ag2) this.q;
                if (i3 >= ag2Var3.s) {
                    tb4.k();
                    return null;
                }
                this.n = i3 + 1;
                this.o = i3;
                Object[] objArr = ag2Var3.o;
                objArr.getClass();
                Object obj2 = objArr[this.o];
                e();
                return obj2;
        }
    }
}
