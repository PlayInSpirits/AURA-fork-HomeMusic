package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eb0 implements q84, m84 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public eb0(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.q84
    public final long a() {
        return this.m;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.q84
    public final long c(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.m84
    public final boolean d() {
        return this.h;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            o84 o84Var = new o84(0L, j3);
            return new l84(o84Var, o84Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        o84 o84Var2 = new o84(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new l84(o84Var2, new o84((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new l84(o84Var2, o84Var2);
    }

    @Override // defpackage.q84
    public final int f() {
        return this.j;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.f;
    }
}
