package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fy3 extends bx1 {
    public static final fy3 v = null;
    public final transient Object q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;
    public final transient fy3 u;

    static {
        v = new fy3();
    }

    public fy3(int r5, Object[] r6) {
        this.r = r6;
        this.t = r5;
        this.s = 0;
        if (r5 < 2) goto L5;
        int r2 = jx1.i(r5);
    L6:
        Object r0 = ly3.h(r6, r5, r2, 0);
        if ((r0 instanceof Object[]) == true) goto L15;
        this.q = r0;
        Object r1 = ly3.h(r6, r5, r2, 1);
        if ((r1 instanceof Object[]) == true) goto L13;
        this.u = new fy3(r1, r6, r5, this);
        return;
    L13:
        throw ((ax1) ((Object[]) r1)[2]).a();
    L15:
        throw ((ax1) ((Object[]) r0)[2]).a();
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.bx1
    public final iy3 c() {
        int r1 = this.s;
        int r2 = this.t;
        return new iy3(this, this.r, r1, r2);
    }

    @Override // defpackage.bx1
    public final jy3 d() {
        int r1 = this.s;
        int r2 = this.t;
        return new jy3(this, new ky3(this.r, r1, r2));
    }

    @Override // defpackage.bx1
    public final rw1 e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.bx1
    public final rw1 f() {
        fy3 r1 = this.u;
        jx1 r0 = r1.o;
        if (r0 != null) goto L6;
        jy3 r2 = r1.d();
        r1.o = r2;
        return r2;
    L6:
        return r0;
    }

    @Override // defpackage.bx1, java.util.Map
    public final Object get(Object r4) {
        int r0 = this.t;
        int r1 = this.s;
        Object r3 = ly3.i(this.q, this.r, r0, r1, r4);
        if (r3 != null) goto L6;
        return null;
    L6:
        return r3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.t;
    }

    @Override // defpackage.bx1, java.util.Map
    public final Collection values() {
        fy3 r1 = this.u;
        jx1 r0 = r1.o;
        if (r0 != null) goto L6;
        jy3 r2 = r1.d();
        r1.o = r2;
        return r2;
    L6:
        return r0;
    }

    public fy3() {
        this.q = null;
        this.r = new Object[0];
        this.s = 0;
        this.t = 0;
        this.u = this;
    }

    public fy3(Object r1, Object[] r2, int r3, fy3 r4) {
        this.q = r1;
        this.r = r2;
        this.s = 1;
        this.t = r3;
        this.u = r4;
    }
}
