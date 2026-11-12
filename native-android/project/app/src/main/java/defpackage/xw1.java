package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends a1 {
    public final y1 n;
    public final int o;
    public final int p;

    public xw1(y1 r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        uo.j(r2, r3, r1.a());
        this.p = r3 - r2;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        uo.e(r2, this.p);
        int r0 = this.o + r2;
        return this.n.get(r0);
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int r3, int r4) {
        uo.j(r3, r4, this.p);
        int r1 = this.o;
        y1 r2 = this.n;
        return new xw1(r2, r3 + r1, r1 + r4);
    }
}
