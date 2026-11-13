package defpackage;

import java.util.TreeSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d92 implements mx {
    public final long a;
    public final TreeSet b = new TreeSet(new n7(17));
    public long c;

    public d92(long j) {
        this.a = j;
    }

    @Override // defpackage.mx
    public final void a(se4 se4Var, long j) {
        if (j != -1) {
            f(se4Var, j);
        }
    }

    @Override // defpackage.mx
    public final void b(se4 se4Var, te4 te4Var) {
        this.b.add(te4Var);
        this.c += te4Var.p;
        f(se4Var, 0L);
    }

    @Override // defpackage.mx
    public final void c(se4 se4Var, te4 te4Var, te4 te4Var2) {
        d(te4Var);
        b(se4Var, te4Var2);
    }

    @Override // defpackage.mx
    public final void d(te4 te4Var) {
        this.b.remove(te4Var);
        this.c -= te4Var.p;
    }

    @Override // defpackage.mx
    public final boolean e() {
        return true;
    }

    public final void f(se4 se4Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            te4 te4Var = (te4) this.b.first();
            synchronized (se4Var) {
                se4Var.n(te4Var);
            }
        }
    }
}
