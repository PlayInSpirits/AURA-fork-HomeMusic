package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xw1 extends a1 {
    public final y1 n;
    public final int o;
    public final int p;

    public xw1(y1 y1Var, int i, int i2) {
        this.n = y1Var;
        this.o = i;
        uo.j(i, i2, y1Var.a());
        this.p = i2 - i;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        uo.e(i, this.p);
        return this.n.get(this.o + i);
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int i, int i2) {
        uo.j(i, i2, this.p);
        int i3 = this.o;
        return new xw1(this.n, i + i3, i3 + i2);
    }
}
