package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 implements q34 {
    public final p34 a;

    public x51(Throwable r3) {
        this.a = new p34(this, r3, 2);
    }

    @Override // defpackage.q34
    public final boolean c() {
        return false;
    }

    @Override // defpackage.q34
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.q34
    public final q34 d() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.q34
    public final cv3 e() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.q34
    public final p34 f() {
        return this.a;
    }

    @Override // defpackage.q34
    public final p34 g() {
        return this.a;
    }
}
