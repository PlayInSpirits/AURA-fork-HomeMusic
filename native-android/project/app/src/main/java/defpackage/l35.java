package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l35 implements q84 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public l35(long[] r1, long[] r2, long r3, long r5, long r7, int r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r7;
        this.e = r9;
    }

    @Override // defpackage.q84
    public final long a() {
        return this.d;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.q84
    public final long c(long r3) {
        int r4 = f35.f(this.b, r3, true);
        return this.a[r4];
    }

    @Override // defpackage.m84
    public final l84 e(long r9) {
        long[] r0 = this.a;
        int r2 = f35.f(r0, r9, true);
        long r4 = r0[r2];
        long[] r8 = this.b;
        o84 r3 = new o84(r4, r8[r2]);
        if (r4 >= r9) goto L10;
        if (r2 == (r0.length - 1)) goto L10;
        int r5 = r2 + 1;
        return new l84(r3, new o84(r0[r5], r8[r5]));
    L10:
        return new l84(r3, r3);
    }

    @Override // defpackage.q84
    public final int f() {
        return this.e;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
