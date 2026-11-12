package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends jx1 {
    public final transient bx1 q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    public iy3(bx1 bx1Var, Object[] objArr, int i, int i2) {
        this.q = bx1Var;
        this.r = objArr;
        this.s = i;
        this.t = i2;
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.q.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return a().listIterator(0);
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
