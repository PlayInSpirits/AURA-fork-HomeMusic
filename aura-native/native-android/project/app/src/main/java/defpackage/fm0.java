package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements l83 {
    public final k83 n;
    public final long o;
    public final long p;
    public final im4 q;
    public int r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    public fm0(im4 im4Var, long j, long j2, long j3, long j4, boolean z) {
        rr2.l(j >= 0 && j2 > j);
        this.q = im4Var;
        this.o = j;
        this.p = j2;
        if (j3 == j2 - j || z) {
            this.s = j4;
            this.r = 4;
        } else {
            this.r = 0;
        }
        this.n = new k83();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.l83
    public final long b(l51 l51Var) throws IOException {
        long j;
        long jK;
        int i = this.r;
        long j2 = this.p;
        k83 k83Var = this.n;
        if (i == 0) {
            long position = l51Var.getPosition();
            this.t = position;
            this.r = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.v == this.w) {
                    jK = -1;
                } else {
                    long position2 = l51Var.getPosition();
                    if (k83Var.b(l51Var, this.w)) {
                        k83Var.a(l51Var, false);
                        l51Var.k();
                        long j4 = this.u;
                        long j5 = k83Var.b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = k83Var.d + k83Var.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.w = position2;
                                this.y = j5;
                            } else {
                                this.v = l51Var.getPosition() + ((long) i2);
                                this.x = k83Var.b;
                            }
                            long j7 = this.w;
                            long j8 = this.v;
                            if (j7 - j8 < 100000) {
                                this.w = j8;
                                jK = j8;
                            } else {
                                long position3 = l51Var.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.w;
                                long j10 = this.v;
                                jK = f35.k((((j9 - j10) * j6) / (this.y - this.x)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jK = -1;
                        }
                    } else {
                        jK = this.v;
                        if (jK == position2) {
                            mj0.i("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jK != -1) {
                        return jK;
                    }
                    this.r = 3;
                }
                j = 2;
                if (jK != -1) {
                    return jK;
                }
                this.r = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    tb4.a();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                k83Var.b(l51Var, -1L);
                k83Var.a(l51Var, false);
                if (k83Var.b > this.u) {
                    l51Var.k();
                    this.r = 4;
                    return -(this.x + j);
                }
                l51Var.l(k83Var.d + k83Var.e);
                this.v = l51Var.getPosition();
                this.x = k83Var.b;
            }
        }
        k83Var.a = 0;
        k83Var.b = 0L;
        k83Var.c = 0;
        k83Var.d = 0;
        k83Var.e = 0;
        if (!k83Var.b(l51Var, -1L)) {
            throw new EOFException();
        }
        k83Var.a(l51Var, false);
        l51Var.l(k83Var.d + k83Var.e);
        long j11 = k83Var.b;
        while ((k83Var.a & 4) != 4 && k83Var.b(l51Var, -1L) && l51Var.getPosition() < j2 && k83Var.a(l51Var, true)) {
            try {
                l51Var.l(k83Var.d + k83Var.e);
                j11 = k83Var.b;
            } catch (EOFException unused) {
            }
        }
        this.s = j11;
        this.r = 4;
        return this.t;
    }

    @Override // defpackage.l83
    public final m84 e() {
        if (this.s != 0) {
            return new em0(this);
        }
        return null;
    }

    @Override // defpackage.l83
    public final void g(long j) {
        this.u = f35.k(j, 0L, this.s - 1);
        this.r = 2;
        this.v = this.o;
        this.w = this.p;
        this.x = 0L;
        this.y = this.s;
    }
}
