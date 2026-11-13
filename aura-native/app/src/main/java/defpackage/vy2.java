package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vy2 implements mz0 {
    public final be3 a;
    public final wy2 b;
    public final String c;
    public final int d;
    public final String e;
    public wv4 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public vy2(int i, String str, String str2) {
        be3 be3Var = new be3(4);
        this.a = be3Var;
        be3Var.a[0] = -1;
        this.b = new wy2();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        this.f.getClass();
        while (be3Var.a() > 0) {
            int i = this.h;
            be3 be3Var2 = this.a;
            if (i == 0) {
                byte[] bArr = be3Var.a;
                int i2 = be3Var.b;
                int i3 = be3Var.c;
                while (true) {
                    if (i2 >= i3) {
                        be3Var.N(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        be3Var.N(i2 + 1);
                        this.k = false;
                        be3Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(be3Var.a(), 4 - this.i);
                be3Var.k(be3Var2.a, this.i, min);
                int i4 = this.i + min;
                this.i = i4;
                if (i4 >= 4) {
                    be3Var2.N(0);
                    int m = be3Var2.m();
                    wy2 wy2Var = this.b;
                    if (wy2Var.a(m)) {
                        this.m = wy2Var.b;
                        if (!this.j) {
                            this.l = (wy2Var.f * 1000000) / wy2Var.c;
                            sb1 sb1Var = new sb1();
                            sb1Var.a = this.g;
                            sb1Var.l = lw2.m(this.e);
                            sb1Var.m = lw2.m((String) wy2Var.g);
                            sb1Var.n = 4096;
                            sb1Var.E = wy2Var.d;
                            sb1Var.F = wy2Var.c;
                            sb1Var.d = this.c;
                            sb1Var.f = this.d;
                            this.f.g(new tb1(sb1Var));
                            this.j = true;
                        }
                        be3Var2.N(0);
                        this.f.e(4, be3Var2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    tb4.a();
                    return;
                }
                int min2 = Math.min(be3Var.a(), this.m - this.i);
                this.f.e(min2, be3Var);
                int i5 = this.i + min2;
                this.i = i5;
                if (i5 >= this.m) {
                    rr2.w(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.g = sy4Var.e;
        sy4Var.b();
        this.f = m51Var.t(sy4Var.d, 1);
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
    }
}
