package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zw1 extends qp implements vb2, Serializable {
    public final transient ly3 r;
    public final transient int s;

    public zw1(ly3 ly3Var, int i) {
        this.r = ly3Var;
        this.s = i;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final Collection a() {
        return (rw1) super.a();
    }

    @Override // defpackage.qz2
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u1
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // defpackage.u1
    public final Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.u1
    public final Collection f() {
        return new dx1(this);
    }

    @Override // defpackage.u1
    public final Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.qz2
    public final Collection get(Object obj) {
        yw1 yw1Var = (yw1) this.r.get(obj);
        if (yw1Var != null) {
            return yw1Var;
        }
        vw1 vw1Var = yw1.o;
        return gy3.r;
    }

    @Override // defpackage.u1
    public final Iterator h() {
        return new cx1(this);
    }

    @Override // defpackage.u1, defpackage.qz2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public bx1 b() {
        return this.r;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final Set keySet() {
        ly3 ly3Var = this.r;
        jx1 jx1Var = ly3Var.o;
        if (jx1Var != null) {
            return jx1Var;
        }
        jy3 jy3VarD = ly3Var.d();
        ly3Var.o = jy3VarD;
        return jy3VarD;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qz2
    public final int size() {
        return this.s;
    }
}
