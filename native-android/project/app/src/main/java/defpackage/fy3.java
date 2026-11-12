package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fy3 extends bx1 {
    public static final fy3 v = new fy3();
    public final transient Object q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;
    public final transient fy3 u;

    public fy3(int i, Object[] objArr) {
        this.r = objArr;
        this.t = i;
        this.s = 0;
        int i2 = i >= 2 ? jx1.i(i) : 0;
        Object objH = ly3.h(objArr, i, i2, 0);
        if (objH instanceof Object[]) {
            throw ((ax1) ((Object[]) objH)[2]).a();
        }
        this.q = objH;
        Object objH2 = ly3.h(objArr, i, i2, 1);
        if (objH2 instanceof Object[]) {
            throw ((ax1) ((Object[]) objH2)[2]).a();
        }
        this.u = new fy3(objH2, objArr, i, this);
    }

    @Override // defpackage.bx1
    public final iy3 c() {
        return new iy3(this, this.r, this.s, this.t);
    }

    @Override // defpackage.bx1
    public final jy3 d() {
        return new jy3(this, new ky3(this.r, this.s, this.t));
    }

    @Override // defpackage.bx1
    public final rw1 e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.bx1
    /* JADX INFO: renamed from: f */
    public final rw1 values() {
        fy3 fy3Var = this.u;
        jx1 jx1Var = fy3Var.o;
        if (jx1Var != null) {
            return jx1Var;
        }
        jy3 jy3VarD = fy3Var.d();
        fy3Var.o = jy3VarD;
        return jy3VarD;
    }

    @Override // defpackage.bx1, java.util.Map
    public final Object get(Object obj) {
        Object objI = ly3.i(this.q, this.r, this.t, this.s, obj);
        if (objI == null) {
            return null;
        }
        return objI;
    }

    @Override // java.util.Map
    public final int size() {
        return this.t;
    }

    @Override // defpackage.bx1, java.util.Map
    public final Collection values() {
        fy3 fy3Var = this.u;
        jx1 jx1Var = fy3Var.o;
        if (jx1Var != null) {
            return jx1Var;
        }
        jy3 jy3VarD = fy3Var.d();
        fy3Var.o = jy3VarD;
        return jy3VarD;
    }

    public fy3() {
        this.q = null;
        this.r = new Object[0];
        this.s = 0;
        this.t = 0;
        this.u = this;
    }

    public fy3(Object obj, Object[] objArr, int i, fy3 fy3Var) {
        this.q = obj;
        this.r = objArr;
        this.s = 1;
        this.t = i;
        this.u = fy3Var;
    }
}
