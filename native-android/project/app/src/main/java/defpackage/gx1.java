package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 extends jx1 {
    public final /* synthetic */ int q;
    public final /* synthetic */ hx1 r;

    public /* synthetic */ gx1(hx1 hx1Var, int i) {
        this.q = i;
        this.r = hx1Var;
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.q;
        hx1 hx1Var = this.r;
        switch (i) {
            case 0:
                if (obj instanceof p73) {
                    p73 p73Var = (p73) obj;
                    if (p73Var.a() > 0) {
                        if (((my3) hx1Var).r.b(p73Var.a) == p73Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((my3) hx1Var).contains(obj);
        }
    }

    @Override // defpackage.rw1
    public final boolean g() {
        switch (this.q) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.jx1, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.q) {
            case 0:
                return this.r.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.jx1
    public final yw1 l() {
        return new xx1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.q;
        hx1 hx1Var = this.r;
        switch (i) {
            case 0:
                return hx1Var.i().size();
            default:
                return ((my3) hx1Var).r.c;
        }
    }
}
