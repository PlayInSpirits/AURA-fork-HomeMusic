package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 implements Iterator, x32 {
    public final Iterator o;
    public Object q;
    public final /* synthetic */ aa4 r;
    public final /* synthetic */ int n = 0;
    public int p = -1;

    public g71(tq4 tq4Var) {
        this.r = tq4Var;
        this.o = ((aa4) tq4Var.b).iterator();
    }

    public void a() {
        Object next;
        h71 h71Var = (h71) this.r;
        do {
            Iterator it = this.o;
            if (!it.hasNext()) {
                this.p = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) h71Var.c.invoke(next)).booleanValue() != h71Var.b);
        this.q = next;
        this.p = 1;
    }

    public void b() {
        Iterator it = this.o;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((tq4) this.r).c.invoke(next)).booleanValue()) {
                this.p = 1;
                this.q = next;
                return;
            }
        }
        this.p = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.n) {
            case 0:
                if (this.p == -1) {
                    a();
                }
                return this.p == 1;
            default:
                if (this.p == -1) {
                    b();
                }
                return this.p == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.n) {
            case 0:
                if (this.p == -1) {
                    a();
                }
                if (this.p == 0) {
                    tb4.k();
                    return null;
                }
                Object obj = this.q;
                this.q = null;
                this.p = -1;
                return obj;
            default:
                if (this.p == -1) {
                    b();
                }
                if (this.p == 0) {
                    tb4.k();
                    return null;
                }
                Object obj2 = this.q;
                this.q = null;
                this.p = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g71(h71 h71Var) {
        this.r = h71Var;
        this.o = h71Var.a.iterator();
    }
}
