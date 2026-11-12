package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my3 extends hx1 {
    public static final my3 u = null;
    public final transient q73 r;
    public final transient int s;
    public transient gx1 t;

    static {
        q73 r1 = new q73();
        r1.d(3);
        u = new my3(r1);
    }

    public my3(q73 r6) {
        this.r = r6;
        long r0 = 0;
        int r2 = 0;
    L3:
        int r3 = r6.c;
        if (r2 >= r3) goto L6;
        rr2.q(r2, r3);
        r0 = r0 + ((long) r6.b[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        this.s = jz4.I(r0);
    }

    @Override // defpackage.rw1
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.hx1
    public final jx1 i() {
        gx1 r0 = this.t;
        if (r0 != null) goto L6;
        gx1 r1 = new gx1(this, 1);
        this.t = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.s;
    }
}
