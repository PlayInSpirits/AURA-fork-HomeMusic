package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 extends o15 {
    public int o;
    public Object p;
    public final /* synthetic */ int q;
    public final Iterator r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h22(gb4 gb4Var) {
        this();
        this.q = 1;
        this.s = gb4Var;
        this.r = gb4Var.n.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        rr2.w(this.o != 4);
        int iW = xa3.w(this.o);
        if (iW == 0) {
            return true;
        }
        if (iW != 2) {
            this.o = 4;
            int i = this.q;
            Object obj = null;
            Object obj2 = this.s;
            Iterator it = this.r;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.o = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((ro3) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.o = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((gb4) obj2).o.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.p = obj;
            if (this.o != 3) {
                this.o = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        this.o = 2;
        Object obj = this.p;
        this.p = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h22(Iterator it, ro3 ro3Var) {
        this();
        this.q = 0;
        this.r = it;
        this.s = ro3Var;
    }

    public h22() {
        super(0);
        this.o = 2;
    }
}
