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

    public ls(ns r1, long r2, long r4, long r6, long r8, long r10) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r6;
        this.e = r8;
        this.f = r10;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r14) {
        long r1 = this.a.e(r14);
        long r9 = this.e;
        long r11 = this.f;
        o84 r2 = new o84(r14, ms.a(r1, 0, this.c, this.d, r9, r11));
        return new l84(r2, r2);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.b;
    }
}
