package defpackage;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d92 implements mx {
    public final long a;
    public final TreeSet b;
    public long c;

    public d92(long r2) {
        this.a = r2;
        this.b = new TreeSet(new n7(17));
    }

    @Override // defpackage.mx
    public final void a(se4 r3, long r4) {
        if (r4 == (-1)) goto L6;
        f(r3, r4);
        return;
    }

    @Override // defpackage.mx
    public final void b(se4 r5, te4 r6) {
        this.b.add(r6);
        this.c += r6.p;
        f(r5, 0);
    }

    @Override // defpackage.mx
    public final void c(se4 r1, te4 r2, te4 r3) {
        d(r2);
        b(r1, r3);
    }

    @Override // defpackage.mx
    public final void d(te4 r5) {
        this.b.remove(r5);
        this.c -= r5.p;
    }

    @Override // defpackage.mx
    public final boolean e() {
        return true;
    }

    public final void f(se4 r5, long r6) {
    L3:
        if ((this.c + r6) <= this.a) goto L14;
        if (this.b.isEmpty() == true) goto L19;
        te4 r0 = (te4) this.b.first();
        monitor-enter(r5);
        r5.n(r0);     // Catch: Throwable -> L11
        monitor-exit(r5);
    L11:
        th = move-exception;
        throw th;
    L19:
        return;
    }
}
