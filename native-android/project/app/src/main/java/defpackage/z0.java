package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a1 implements RandomAccess {
    public final a1 n;
    public final int o;
    public final int p;

    public z0(a1 r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        h12.g(r2, r3, r1.a());
        this.p = r3 - r2;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        int r0 = this.p;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        int r1 = this.o + r3;
        return this.n.get(r1);
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int r3, int r4) {
        h12.g(r3, r4, this.p);
        int r1 = this.o;
        a1 r2 = this.n;
        return new z0(r2, r3 + r1, r1 + r4);
    }
}
