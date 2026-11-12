package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag3 implements ty4 {
    public final mz0 a;
    public final h00 b = new h00(10, new byte[10]);
    public int c = 0;
    public int d;
    public iu4 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public ag3(mz0 mz0Var) {
        this.a = mz0Var;
    }

    @Override // defpackage.ty4
    public final void a(int i, be3 be3Var) {
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        mz0 mz0Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    l93.q0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        tb4.a();
                        return;
                    }
                    if (this.j != -1) {
                        l93.q0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    mz0Var.d(be3Var.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (be3Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                h00 h00Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(be3Var, h00Var.b, Math.min(10, this.i)) && d(be3Var, null, this.i)) {
                            h00Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                h00Var.t(4);
                                long jI = ((long) h00Var.i(3)) << 30;
                                h00Var.t(1);
                                long jI2 = ((long) (h00Var.i(15) << 15)) | jI;
                                h00Var.t(1);
                                long jI3 = jI2 | ((long) h00Var.i(15));
                                h00Var.t(1);
                                if (!this.h && this.g) {
                                    h00Var.t(4);
                                    long jI4 = ((long) h00Var.i(3)) << 30;
                                    h00Var.t(1);
                                    long jI5 = jI4 | ((long) (h00Var.i(15) << 15));
                                    h00Var.t(1);
                                    long jI6 = jI5 | ((long) h00Var.i(15));
                                    h00Var.t(1);
                                    this.e.b(jI6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jI3);
                            }
                            i6 |= this.k ? 4 : 0;
                            mz0Var.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            tb4.a();
                            return;
                        }
                        int iA = be3Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            be3Var.M(be3Var.b + iA);
                        }
                        mz0Var.a(be3Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                mz0Var.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(be3Var, h00Var.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                be3Var.O(be3Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.ty4
    public final void b(iu4 iu4Var, m51 m51Var, sy4 sy4Var) {
        this.e = iu4Var;
        this.a.f(m51Var, sy4Var);
    }

    @Override // defpackage.ty4
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(be3 be3Var, byte[] bArr, int i) {
        int iMin = Math.min(be3Var.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            be3Var.O(iMin);
        } else {
            be3Var.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        h00 h00Var = this.b;
        h00Var.q(0);
        int i = h00Var.i(24);
        if (i != 1) {
            xa3.m(i, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        h00Var.t(8);
        int i2 = h00Var.i(16);
        h00Var.t(5);
        this.k = h00Var.h();
        h00Var.t(2);
        this.f = h00Var.h();
        this.g = h00Var.h();
        h00Var.t(6);
        int i3 = h00Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
            return true;
        }
        int i4 = (i2 - 3) - i3;
        this.j = i4;
        if (i4 < 0) {
            l93.q0("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
