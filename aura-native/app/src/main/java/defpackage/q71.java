package defpackage;

import java.nio.ByteOrder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q71 implements ps {
    public final v71 n;
    public final int o;
    public final t71 p = new t71();

    public q71(v71 v71Var, int i) {
        this.n = v71Var;
        this.o = i;
    }

    public final long a(l51 l51Var) {
        t71 t71Var;
        v71 v71Var;
        int i;
        while (true) {
            long f = l51Var.f();
            long length = l51Var.getLength() - 6;
            t71Var = this.p;
            v71Var = this.n;
            if (f >= length) {
                break;
            }
            long f2 = l51Var.f();
            be3 be3Var = new be3(17);
            int i2 = 0;
            boolean h = false;
            l51Var.n(be3Var.a, 0, 2);
            char g = be3Var.g(0, ByteOrder.BIG_ENDIAN);
            int i3 = this.o;
            if (g != i3) {
                l51Var.k();
                l51Var.g((int) (f2 - l51Var.getPosition()));
            } else {
                byte[] bArr = be3Var.a;
                while (i2 < 15 && (i = l51Var.i(bArr, 2 + i2, 15 - i2)) != -1) {
                    i2 += i;
                }
                be3Var.M(i2 + 2);
                l51Var.k();
                l51Var.g((int) (f2 - l51Var.getPosition()));
                h = rr2.h(be3Var, v71Var, i3, t71Var);
            }
            if (h) {
                break;
            }
            l51Var.g(1);
        }
        if (l51Var.f() < l51Var.getLength() - 6) {
            return t71Var.a;
        }
        l51Var.g((int) (l51Var.getLength() - l51Var.f()));
        return v71Var.j;
    }

    @Override // defpackage.ps
    public final os c(l51 l51Var, long j) {
        long position = l51Var.getPosition();
        long a = a(l51Var);
        long f = l51Var.f();
        l51Var.g(Math.max(6, this.n.c));
        long a2 = a(l51Var);
        return (a > j || a2 <= j) ? a2 <= j ? new os(-2, a2, l51Var.f()) : new os(-1, a, position) : new os(0, -9223372036854775807L, f);
    }
}
