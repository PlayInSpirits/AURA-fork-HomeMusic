package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hx1 extends rw1 implements Collection {
    public static final /* synthetic */ int q = 0;
    public transient gy3 o;
    public transient jx1 p;

    @Override // defpackage.rw1
    public final yw1 a() {
        gy3 gy3Var = this.o;
        if (gy3Var != null) {
            return gy3Var;
        }
        yw1 yw1VarA = super.a();
        this.o = (gy3) yw1VarA;
        return yw1VarA;
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        o15 it = j().iterator();
        while (it.hasNext()) {
            p73 p73Var = (p73) it.next();
            Arrays.fill(objArr, i, p73Var.a() + i, p73Var.a);
            i += p73Var.a();
        }
        return i;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((my3) this).r.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hx1)) {
            return false;
        }
        hx1 hx1Var = (hx1) obj;
        my3 my3Var = (my3) this;
        if (my3Var.size() != hx1Var.size() || j().size() != hx1Var.j().size()) {
            return false;
        }
        for (p73 p73Var : hx1Var.j()) {
            if (my3Var.r.b(p73Var.a) != p73Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return new ex1(j().iterator());
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j51.x(j());
    }

    public abstract jx1 i();

    public final jx1 j() {
        jx1 gx1Var = this.p;
        if (gx1Var == null) {
            gx1Var = isEmpty() ? ny3.w : new gx1(this, 0);
            this.p = gx1Var;
        }
        return gx1Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
