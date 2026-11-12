package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends jx1 {
    public final transient bx1 q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    public iy3(bx1 r1, Object[] r2, int r3, int r4) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
    }

    @Override // defpackage.rw1
    public final int b(int r1, Object[] r2) {
        return a().b(r1, r2);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L10;
        Map.Entry r4 = (Map.Entry) r3;
        Object r0 = r4.getKey();
        Object r5 = r4.getValue();
        if (r5 == null) goto L10;
        if (r5.equals(this.q.get(r0)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return a().m(0);
    }

    @Override // defpackage.jx1
    public final yw1 l() {
        return new hy3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
