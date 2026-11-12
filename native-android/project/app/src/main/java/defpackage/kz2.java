package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 extends rp {
    public final w03 b;
    public final ArrayList c;
    public final w03 d;
    public final ss2 e;

    public kz2() {
        super(4);
        this.b = te5.i();
        this.c = new ArrayList();
        this.d = new w03();
        z r0 = new z(8, this);
        jh4.e(jh4.a);
        Object r1 = jh4.c;
        monitor-enter(r1);
        jh4.h = q40.F0(r0, jh4.h);     // Catch: Throwable -> L8
        monitor-exit(r1);
        this.e = new ss2(18, r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final void e(y94 r2) {
        iz2 r0 = new iz2(r2);
        this.c.add(r0);
    }

    @Override // defpackage.rp
    public final void f() {
        Object r0 = this.a;
        monitor-enter(r0);
        ArrayList r1 = this.c;     // Catch: Throwable -> L9
        int r2 = r1.size();     // Catch: Throwable -> L9
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L17;
        jz2 r4 = (jz2) r1.get(r3);     // Catch: Throwable -> L9
        if ((r4 instanceof hz2) == false) goto L12;
        te5.b(this.b, ((hz2) r4).a, ((hz2) r4).b);     // Catch: Throwable -> L9
    L14:
        r3 = r3 + 1;     // Catch: Throwable -> L9
        goto L5
    L12:
        if ((r4 instanceof iz2) == false) goto L16;
        te5.J(this.b, ((iz2) r4).a);     // Catch: Throwable -> L9
        goto L14
    L16:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L9
    L17:
        monitor-exit(r0);
        this.c.clear();
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final void h() {
        this.e.d();
        this.c.clear();
        this.d.a();
        Object r0 = this.a;
        monitor-enter(r0);
        this.b.a();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final if1 m(y94 r5) {
        w03 r0 = this.d;
        if1 r1 = (if1) r0.g(r5);
        if (r1 != null) goto L8;
        r1 = new o(19, this, r5);
        int r4 = r0.f(r5);
        if (r4 >= 0) goto L7;
        r4 = ~r4;
    L7:
        Object[] r2 = r0.c;
        Object r3 = r2[r4];
        r0.b[r4] = r5;
        r2[r4] = r1;
    L8:
        return r1;
    }

    @Override // defpackage.rp
    public final void n(y00 r2) {
        this.d.j(r2);
        e(r2);
        f();
    }
}
