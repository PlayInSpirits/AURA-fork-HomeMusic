package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends jx1 {
    public static final Object[] v = null;
    public static final ny3 w = null;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] r5 = new Object[0];
        v = r5;
        w = new ny3(0, 0, 0, r5, r5);
    }

    public ny3(int r1, int r2, int r3, Object[] r4, Object[] r5) {
        this.q = r4;
        this.r = r1;
        this.s = r5;
        this.t = r2;
        this.u = r3;
    }

    @Override // defpackage.rw1
    public final int b(int r3, Object[] r4) {
        Object[] r0 = this.q;
        int r2 = this.u;
        System.arraycopy(r0, 0, r4, r3, r2);
        return r3 + r2;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r5) {
        if (r5 == null) goto L16;
        Object[] r1 = this.s;
        if (r1.length == 0) goto L16;
        int r2 = g12.U(r5);
    L8:
        int r3 = r2 & this.t;
        Object r4 = r1[r3];
        if (r4 == null) goto L10;
        if (r4.equals(r5) == true) goto L13;
        r2 = r3 + 1;
        goto L8
    L13:
        return true;
    L10:
        return false;
    L16:
        return false;
    }

    @Override // defpackage.rw1
    public final Object[] d() {
        return this.q;
    }

    @Override // defpackage.rw1
    public final int e() {
        return this.u;
    }

    @Override // defpackage.rw1
    public final int f() {
        return 0;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return a().m(0);
    }

    @Override // defpackage.jx1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.r;
    }

    @Override // defpackage.jx1
    public final yw1 l() {
        Object[] r0 = this.q;
        return yw1.i(this.u, r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.u;
    }
}
