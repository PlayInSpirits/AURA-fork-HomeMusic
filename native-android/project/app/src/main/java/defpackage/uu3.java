package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uu3 extends ch4 {
    public final if1 e;
    public int f;

    public uu3(long j, gh4 gh4Var, if1 if1Var) {
        super(j, gh4Var);
        this.e = if1Var;
        this.f = 1;
    }

    @Override // defpackage.ch4
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (jh4.c) {
            o();
        }
    }

    @Override // defpackage.ch4
    public final if1 e() {
        return this.e;
    }

    @Override // defpackage.ch4
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ch4
    public final if1 i() {
        return null;
    }

    @Override // defpackage.ch4
    public final void k() {
        this.f++;
    }

    @Override // defpackage.ch4
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ch4
    public final void m() {
    }

    @Override // defpackage.ch4
    public final void n(rl4 rl4Var) {
        o54 o54Var = jh4.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ch4
    public final ch4 u(if1 if1Var) {
        jh4.c(this);
        return new x43(this.b, this.a, jh4.k(if1Var, this.e, true), this);
    }
}
