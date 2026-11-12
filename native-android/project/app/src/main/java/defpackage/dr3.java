package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr3 implements wv4 {
    public final p44 a;
    public final p44 b;
    public final tq0 c;
    public final AtomicReference d;

    public dr3(p44 r2) {
        this.a = r2;
        this.b = r2;
        this.c = new tq0();
        this.d = new AtomicReference(cr3.n);
    }

    @Override // defpackage.wv4
    public final void a(long r8, int r10, int r11, int r12, vv4 r13) {
        h().a(r8, r10, r11, r12, r13);
        AtomicReference r9 = this.d;
        if (r9.get() != cr3.o) goto L6;
        this.b.x(false);
        r9.set(cr3.p);
        return;
    }

    @Override // defpackage.wv4
    public final void b(be3 r1, int r2, int r3) {
        h().b(r1, r2, r3);
    }

    @Override // defpackage.wv4
    public final int c(wh0 r1, int r2, boolean r3) {
        return h().c(r1, r2, r3);
    }

    @Override // defpackage.wv4
    public final void d(long r1) {
    }

    @Override // defpackage.wv4
    public final void e(int r1, be3 r2) {
        h().e(r1, r2);
    }

    @Override // defpackage.wv4
    public final int f(wh0 r1, int r2, boolean r3) {
        return h().f(r1, r2, r3);
    }

    @Override // defpackage.wv4
    public final void g(tb1 r1) {
        this.a.g(r1);
    }

    public final wv4 h() {
        if (this.d.get() != cr3.p) goto L7;
        return this.c;
    L7:
        return this.b;
    }
}
