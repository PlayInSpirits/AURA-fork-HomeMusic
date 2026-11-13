package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u20 {
    public final fo a;
    public final wv4 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public u20(int i, fo foVar, wv4 wv4Var) {
        int i2 = foVar.d;
        this.a = foVar;
        int a = foVar.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        rr2.l(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = foVar.b * 1000000;
        long j2 = foVar.c;
        String str = f35.a;
        this.e = f35.a0(i2, j, j2, RoundingMode.DOWN);
        this.b = wv4Var;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final o84 a(int i) {
        return new o84((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final l84 b(long j) {
        if (this.k == 0) {
            o84 o84Var = new o84(0L, this.l);
            return new l84(o84Var, o84Var);
        }
        int i = (int) (j / (this.e / this.f));
        int e = f35.e(this.n, i, true, true);
        if (this.n[e] == i) {
            o84 a = a(e);
            return new l84(a, a);
        }
        o84 a2 = a(e);
        int i2 = e + 1;
        return i2 < this.m.length ? new l84(a2, a(i2)) : new l84(a2, a2);
    }
}
