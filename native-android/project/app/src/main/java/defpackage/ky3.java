package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ky3 extends yw1 {
    public final transient Object[] p;
    public final transient int q;
    public final transient int r;

    public ky3(Object[] r1, int r2, int r3) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        rr2.q(r2, this.r);
        int r3 = (r2 * 2) + this.q;
        Object r1 = this.p[r3];
        Objects.requireNonNull(r1);
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
