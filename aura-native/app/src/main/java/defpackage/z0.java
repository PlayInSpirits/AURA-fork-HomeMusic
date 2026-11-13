package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z0 extends a1 implements RandomAccess {
    public final a1 n;
    public final int o;
    public final int p;

    public z0(a1 a1Var, int i, int i2) {
        this.n = a1Var;
        this.o = i;
        h12.g(i, i2, a1Var.a());
        this.p = i2 - i;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.p;
        if (i < 0 || i >= i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.n.get(this.o + i);
    }

    @Override // defpackage.a1, java.util.List
    public final List subList(int i, int i2) {
        h12.g(i, i2, this.p);
        int i3 = this.o;
        return new z0(this.n, i + i3, i3 + i2);
    }
}
