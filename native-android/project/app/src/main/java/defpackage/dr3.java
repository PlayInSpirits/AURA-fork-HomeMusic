package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr3 implements wv4 {
    public final p44 a;
    public final p44 b;
    public final tq0 c = new tq0();
    public final AtomicReference d = new AtomicReference(cr3.n);

    public dr3(p44 p44Var) {
        this.a = p44Var;
        this.b = p44Var;
    }

    @Override // defpackage.wv4
    public final void a(long j, int i, int i2, int i3, vv4 vv4Var) {
        h().a(j, i, i2, i3, vv4Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == cr3.o) {
            this.b.x(false);
            atomicReference.set(cr3.p);
        }
    }

    @Override // defpackage.wv4
    public final void b(be3 be3Var, int i, int i2) {
        h().b(be3Var, i, i2);
    }

    @Override // defpackage.wv4
    public final int c(wh0 wh0Var, int i, boolean z) {
        return h().c(wh0Var, i, z);
    }

    @Override // defpackage.wv4
    public final void d(long j) {
    }

    @Override // defpackage.wv4
    public final void e(int i, be3 be3Var) {
        h().e(i, be3Var);
    }

    @Override // defpackage.wv4
    public final int f(wh0 wh0Var, int i, boolean z) {
        return h().f(wh0Var, i, z);
    }

    @Override // defpackage.wv4
    public final void g(tb1 tb1Var) {
        this.a.g(tb1Var);
    }

    public final wv4 h() {
        return this.d.get() == cr3.p ? this.c : this.b;
    }
}
