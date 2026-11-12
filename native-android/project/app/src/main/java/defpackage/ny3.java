package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends jx1 {
    public static final Object[] v;
    public static final ny3 w;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] objArr = new Object[0];
        v = objArr;
        w = new ny3(0, 0, 0, objArr, objArr);
    }

    public ny3(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.q = objArr;
        this.r = i;
        this.s = objArr2;
        this.t = i2;
        this.u = i3;
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.q;
        int i2 = this.u;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.s;
            if (objArr.length != 0) {
                int iU = g12.U(obj);
                while (true) {
                    int i = iU & this.t;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iU = i + 1;
                }
            }
        }
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
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.jx1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.r;
    }

    @Override // defpackage.jx1
    public final yw1 l() {
        return yw1.i(this.u, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.u;
    }
}
