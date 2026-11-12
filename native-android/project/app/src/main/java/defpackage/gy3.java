package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gy3 extends yw1 {
    public static final gy3 r = null;
    public final transient Object[] p;
    public final transient int q;

    static {
        r = new gy3(0, new Object[0]);
    }

    public gy3(int r1, Object[] r2) {
        this.p = r2;
        this.q = r1;
    }

    @Override // defpackage.yw1, defpackage.rw1
    public final int b(int r3, Object[] r4) {
        Object[] r0 = this.p;
        int r2 = this.q;
        System.arraycopy(r0, 0, r4, r3, r2);
        return r3 + r2;
    }

    @Override // defpackage.rw1
    public final Object[] d() {
        return this.p;
    }

    @Override // defpackage.rw1
    public final int e() {
        return this.q;
    }

    @Override // defpackage.rw1
    public final int f() {
        return 0;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        rr2.q(r2, this.q);
        Object r1 = this.p[r2];
        Objects.requireNonNull(r1);
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
