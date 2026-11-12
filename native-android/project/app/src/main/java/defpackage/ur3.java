package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        char c;
        int i;
        mz0 vk1Var;
        long j;
        this.j.getClass();
        long length = l51Var.getLength();
        long j2 = -9223372036854775807L;
        sr3 sr3Var = this.d;
        if (length != -1) {
            c = 3;
            if (!sr3Var.d) {
                iu4 iu4Var = sr3Var.b;
                be3 be3Var = sr3Var.c;
                if (!sr3Var.f) {
                    long length2 = l51Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (l51Var.getPosition() != j3) {
                        t71Var.a = j3;
                        return 1;
                    }
                    be3Var.K(iMin);
                    l51Var.k();
                    l51Var.n(be3Var.a, 0, iMin);
                    int i2 = be3Var.b;
                    for (int i3 = be3Var.c - 4; i3 >= i2; i3--) {
                        if (sr3.b(i3, be3Var.a) == 442) {
                            be3Var.N(i3 + 4);
                            long jC = sr3.c(be3Var);
                            if (jC != -9223372036854775807L) {
                                j2 = jC;
                                break;
                            }
                        }
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
                int iMin2 = (int) Math.min(20000L, l51Var.getLength());
                if (l51Var.getPosition() != 0) {
                    t71Var.a = 0L;
                    return 1;
                }
                be3Var.K(iMin2);
                l51Var.k();
                l51Var.n(be3Var.a, 0, iMin2);
                int i4 = be3Var.c;
                for (int i5 = be3Var.b; i5 < i4 - 3; i5++) {
                    if (sr3.b(i5, be3Var.a) == 442) {
                        be3Var.N(i5 + 4);
                        long jC2 = sr3.c(be3Var);
                        if (jC2 != -9223372036854775807L) {
                            j = jC2;
                            sr3Var.g = j;
                            sr3Var.e = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                sr3Var.g = j;
                sr3Var.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = 4;
        } else {
            this.k = true;
            long j5 = sr3Var.i;
            if (j5 != -9223372036854775807L) {
                i = 4;
                r71 r71Var = new r71(new pa(18), new xc5(sr3Var.b), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = r71Var;
                this.j.w(r71Var.a);
            } else {
                i = 4;
                this.j.w(new bo(j5));
            }
        }
        r71 r71Var2 = this.i;
        if (r71Var2 != null && r71Var2.c != null) {
            return r71Var2.b(l51Var, t71Var);
        }
        l51Var.k();
        long jF = length != -1 ? length - l51Var.f() : -1L;
        if (jF != -1 && jF < 4) {
            return -1;
        }
        be3 be3Var2 = this.c;
        if (!l51Var.e(be3Var2.a, 0, i, true)) {
            return -1;
        }
        be3Var2.N(0);
        int iM = be3Var2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            l51Var.n(be3Var2.a, 0, 10);
            be3Var2.N(9);
            l51Var.l((be3Var2.A() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            l51Var.n(be3Var2.a, 0, 2);
            be3Var2.N(0);
            l51Var.l(be3Var2.H() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            l51Var.l(1);
            return 0;
        }
        int i6 = iM & 255;
        SparseArray sparseArray = this.b;
        tr3 tr3Var = (tr3) sparseArray.get(i6);
        if (!this.e) {
            if (tr3Var == null) {
                if (i6 == 189) {
                    vk1Var = new s2("video/mp2p");
                    this.f = true;
                    this.h = l51Var.getPosition();
                } else if ((iM & 224) == 192) {
                    vk1Var = new vy2(0, null, "video/mp2p");
                    this.f = true;
                    this.h = l51Var.getPosition();
                } else if ((iM & 240) == 224) {
                    vk1Var = new vk1(null, "video/mp2p");
                    this.g = true;
                    this.h = l51Var.getPosition();
                } else {
                    vk1Var = null;
                }
                if (vk1Var != null) {
                    vk1Var.f(this.j, new sy4(i6, 256));
                    tr3Var = new tr3(vk1Var, this.a);
                    sparseArray.put(i6, tr3Var);
                }
            }
            if (l51Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.p();
            }
        }
        l51Var.n(be3Var2.a, 0, 2);
        be3Var2.N(0);
        int iH = be3Var2.H() + 6;
        if (tr3Var == null) {
            l51Var.l(iH);
            return 0;
        }
        be3Var2.K(iH);
        l51Var.readFully(be3Var2.a, 0, iH);
        be3Var2.N(6);
        mz0 mz0Var = tr3Var.a;
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
            long jI = ((long) h00Var.i(3)) << 30;
            h00Var.t(1);
            long jI2 = jI | ((long) (h00Var.i(15) << 15));
            h00Var.t(1);
            long jI3 = jI2 | ((long) h00Var.i(15));
            h00Var.t(1);
            if (!tr3Var.f && tr3Var.e) {
                h00Var.t(4);
                long jI4 = ((long) h00Var.i(3)) << 30;
                h00Var.t(1);
                long jI5 = jI4 | ((long) (h00Var.i(15) << 15));
                h00Var.t(1);
                long jI6 = jI5 | ((long) h00Var.i(15));
                h00Var.t(1);
                iu4Var2.b(jI6);
                tr3Var.f = true;
            }
            tr3Var.g = iu4Var2.b(jI3);
        }
        mz0Var.e(4, tr3Var.g);
        mz0Var.a(be3Var2);
        mz0Var.d(false);
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
            long jD = iu4Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
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
}
