package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pi5 extends ei5 {
    public static final pi5 r = null;
    public final transient Object[] p;
    public final transient int q;

    static {
        r = new pi5(0, new Object[0]);
    }

    public pi5(int r1, Object[] r2) {
        this.p = r2;
        this.q = r1;
    }

    @Override // defpackage.ei5, defpackage.wh5
    public final int a(Object[] r3) {
        Object[] r0 = this.p;
        int r2 = this.q;
        System.arraycopy(r0, 0, r3, 0, r2);
        return r2;
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.q;
    }

    @Override // defpackage.wh5
    public final int d() {
        return 0;
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        fu.Q(r2, this.q);
        Object r1 = this.p[r2];
        Objects.requireNonNull(r1);
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
