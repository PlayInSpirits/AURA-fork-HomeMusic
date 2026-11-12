package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ls implements m84 {
    public final ns a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ls(ns nsVar, long j, long j2, long j3, long j4, long j5) {
        this.a = nsVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        o84 o84Var = new o84(j, ms.a(this.a.e(j), 0L, this.c, this.d, this.e, this.f));
        return new l84(o84Var, o84Var);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.b;
    }
}
