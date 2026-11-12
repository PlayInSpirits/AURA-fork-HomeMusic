package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jy3 extends jx1 {
    public final transient bx1 q;
    public final transient ky3 r;

    public jy3(bx1 r1, ky3 r2) {
        this.q = r1;
        this.r = r2;
    }

    @Override // defpackage.jx1, defpackage.rw1
    public final yw1 a() {
        return this.r;
    }

    @Override // defpackage.rw1
    public final int b(int r1, Object[] r2) {
        return this.r.b(r1, r2);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r1) {
        if (this.q.get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return this.r.m(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.q.size();
    }
}
