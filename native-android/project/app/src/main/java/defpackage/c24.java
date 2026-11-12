package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c24 implements q34 {
    public final cv3 a;

    public c24(cv3 cv3Var) {
        this.a = cv3Var;
    }

    @Override // defpackage.q34
    public final boolean c() {
        return true;
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
        return this.a;
    }

    @Override // defpackage.q34
    public final p34 f() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.q34
    public final p34 g() {
        throw new IllegalStateException("already connected");
    }
}
