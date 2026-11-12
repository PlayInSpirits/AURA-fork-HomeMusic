package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ky3 extends yw1 {
    public final transient Object[] p;
    public final transient int q;
    public final transient int r;

    public ky3(Object[] objArr, int i, int i2) {
        this.p = objArr;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rr2.q(i, this.r);
        Object obj = this.p[(i * 2) + this.q];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
