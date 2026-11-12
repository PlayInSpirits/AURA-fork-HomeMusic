package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ki implements Iterator, x32 {
    public int n;
    public int o;
    public boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ki(oi oiVar, int i) {
        this(oiVar.p);
        this.q = i;
        switch (i) {
            case 1:
                this.r = oiVar;
                this(oiVar.p);
                break;
            default:
                this.r = oiVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o < this.n;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        int i = this.o;
        int i2 = this.q;
        Object obj = this.r;
        switch (i2) {
            case 0:
                objF = ((oi) obj).f(i);
                break;
            case 1:
                objF = ((oi) obj).j(i);
                break;
            default:
                objF = ((qi) obj).o[i];
                break;
        }
        this.o++;
        this.p = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.p) {
            kf2.o("Call next() before removing an element.");
            return;
        }
        int i = this.o - 1;
        this.o = i;
        int i2 = this.q;
        Object obj = this.r;
        switch (i2) {
            case 0:
                ((oi) obj).h(i);
                break;
            case 1:
                ((oi) obj).h(i);
                break;
            default:
                ((qi) obj).a(i);
                break;
        }
        this.n--;
        this.p = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ki(qi qiVar) {
        this(qiVar.p);
        this.q = 2;
        this.r = qiVar;
    }

    public ki(int i) {
        this.n = i;
    }
}
