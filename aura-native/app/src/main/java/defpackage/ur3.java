package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ur3 implements k51 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public r71 i;
    public m51 j;
    public boolean k;
    public final iu4 a = new iu4(0);
    public final be3 c = new be3(4096);
    public final SparseArray b = new SparseArray();
    public final sr3 d = new sr3(0);

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        char c;
        int i;
        int i2;
        mz0 mz0Var;
        long j;
        this.j.getClass();
        long length = l51Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = -9223372036854775807L;
        sr3 sr3Var = this.d;
        if (i3 != 0) {
            c = 3;
            if (!sr3Var.d) {
                iu4 iu4Var = sr3Var.b;
                be3 be3Var = sr3Var.c;
                if (!sr3Var.f) {
                    long length2 = l51Var.getLength();
                    int min = (int) Math.min(20000L, length2);
                    long j3 = length2 - min;
                    if (l51Var.getPosition() != j3) {
                        t71Var.a = j3;
                        return 1;
                    }
                    be3Var.K(min);
                    l51Var.k();
                    l51Var.n(be3Var.a, 0, min);
                    int i4 = be3Var.b;
                    int i5 = be3Var.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (sr3.b(i5, be3Var.a) == 442) {
                            be3Var.N(i5 + 4);
                            long c2 = sr3.c(be3Var);
                            if (c2 != -9223372036854775807L) {
                                j2 = c2;
                                break;
                            }
                        }
                        i5--;
                    }
                    sr3Var.h = j2;
                    sr3Var.f = true;
                    return 0;
                }
                if (sr3Var.h == -9223372036854775807L) {
                    sr3Var.a(l51Var);
                    return 0;
                }
                if (sr3Var.e) {
                    long j4 = sr3Var.g;
                    if (j4 == -9223372036854775807L) {
                        sr3Var.a(l51Var);
                        return 0;
                    }
                    sr3Var.i = iu4Var.c(sr3Var.h) - iu4Var.b(j4);
                    sr3Var.a(l51Var);
                    return 0;
                }
                int min2 = (int) Math.min(20000L, l51Var.getLength());
                if (l51Var.getPosition() != 0) {
                    t71Var.a = 0L;
                    return 1;
                }
                be3Var.K(min2);
                l51Var.k();
                l51Var.n(be3Var.a, 0, min2);
                int i6 = be3Var.b;
                int i7 = be3Var.c;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    if (sr3.b(i6, be3Var.a) == 442) {
                        be3Var.N(i6 + 4);
                        long c3 = sr3.c(be3Var);
                        if (c3 != -9223372036854775807L) {
                            j = c3;
                            break;
                        }
                    }
                    i6++;
                }
                sr3Var.g = j;
                sr3Var.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j5 = sr3Var.i;
            if (j5 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                r71 r71Var = new r71(new pa(18), new xc5(sr3Var.b), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = r71Var;
                this.j.w(r71Var.a);
            } else {
                i = i3;
                i2 = 4;
                this.j.w(new bo(j5));
            }
        }
        r71 r71Var2 = this.i;
        if (r71Var2 != null && r71Var2.c != null) {
            return r71Var2.b(l51Var, t71Var);
        }
        l51Var.k();
        long f = i != 0 ? length - l51Var.f() : -1L;
        if (f != -1 && f < 4) {
            return -1;
        }
        be3 be3Var2 = this.c;
        if (!l51Var.e(be3Var2.a, 0, i2, true)) {
            return -1;
        }
        be3Var2.N(0);
        int m = be3Var2.m();
        if (m == 441) {
            return -1;
        }
        if (m == 442) {
            l51Var.n(be3Var2.a, 0, 10);
            be3Var2.N(9);
            l51Var.l((be3Var2.A() & 7) + 14);
            return 0;
        }
        if (m == 443) {
            l51Var.n(be3Var2.a, 0, 2);
            be3Var2.N(0);
            l51Var.l(be3Var2.H() + 6);
            return 0;
        }
        if (((m & (-256)) >> 8) != 1) {
            l51Var.l(1);
            return 0;
        }
        int i8 = m & 255;
        SparseArray sparseArray = this.b;
        tr3 tr3Var = (tr3) sparseArray.get(i8);
        if (!this.e) {
            if (tr3Var == null) {
                if (i8 == 189) {
                    mz0Var = new s2("video/mp2p");
                    this.f = true;
                    this.h = l51Var.getPosition();
                } else if ((m & 224) == 192) {
                    mz0Var = new vy2(0, null, "video/mp2p");
                    this.f = true;
                    this.h = l51Var.getPosition();
                } else if ((m & 240) == 224) {
                    mz0Var = new vk1(null, "video/mp2p");
                    this.g = true;
                    this.h = l51Var.getPosition();
                } else {
                    mz0Var = null;
                }
                if (mz0Var != null) {
                    mz0Var.f(this.j, new sy4(i8, 256));
                    tr3Var = new tr3(mz0Var, this.a);
                    sparseArray.put(i8, tr3Var);
                }
            }
            if (l51Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.p();
            }
        }
        l51Var.n(be3Var2.a, 0, 2);
        be3Var2.N(0);
        int H = be3Var2.H() + 6;
        if (tr3Var == null) {
            l51Var.l(H);
            return 0;
        }
        be3Var2.K(H);
        l51Var.readFully(be3Var2.a, 0, H);
        be3Var2.N(6);
        mz0 mz0Var2 = tr3Var.a;
        h00 h00Var = tr3Var.c;
        be3Var2.k(h00Var.b, 0, 3);
        h00Var.q(0);
        h00Var.t(8);
        tr3Var.d = h00Var.h();
        tr3Var.e = h00Var.h();
        h00Var.t(6);
        be3Var2.k(h00Var.b, 0, h00Var.i(8));
        h00Var.q(0);
        iu4 iu4Var2 = tr3Var.b;
        tr3Var.g = 0L;
        if (tr3Var.d) {
            h00Var.t(4);
            h00Var.t(1);
            h00Var.t(1);
            long i9 = (h00Var.i(3) << 30) | (h00Var.i(15) << 15) | h00Var.i(15);
            h00Var.t(1);
            if (!tr3Var.f && tr3Var.e) {
                h00Var.t(4);
                h00Var.t(1);
                h00Var.t(1);
                h00Var.t(1);
                iu4Var2.b((h00Var.i(3) << 30) | (h00Var.i(15) << 15) | h00Var.i(15));
                tr3Var.f = true;
            }
            tr3Var.g = iu4Var2.b(i9);
        }
        mz0Var2.e(4, tr3Var.g);
        mz0Var2.a(be3Var2);
        mz0Var2.d(false);
        be3Var2.M(be3Var2.a.length);
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        byte[] bArr = new byte[14];
        rk0 rk0Var = (rk0) l51Var;
        rk0Var.e(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            rk0Var.o(bArr[13] & 7, false);
            rk0Var.e(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        iu4 iu4Var = this.a;
        synchronized (iu4Var) {
            j3 = iu4Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long d = iu4Var.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            iu4Var.f(j2);
        }
        r71 r71Var = this.i;
        if (r71Var != null) {
            r71Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            tr3 tr3Var = (tr3) sparseArray.valueAt(i);
            tr3Var.f = false;
            tr3Var.a.c();
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.j = m51Var;
    }

    @Override // defpackage.k51
    public final void a() {
    }
}
