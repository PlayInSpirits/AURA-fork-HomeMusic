package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h6 implements k51 {
    public final be3 c;
    public final h00 d;
    public m51 e;
    public long f;
    public boolean h;
    public boolean i;
    public final i6 a = new i6(null, 0, "audio/mp4a-latm", true);
    public final be3 b = new be3(2048);
    public long g = -1;

    public h6(int i) {
        be3 be3Var = new be3(10);
        this.c = be3Var;
        byte[] bArr = be3Var.a;
        this.d = new h00(bArr.length, bArr);
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        this.e.getClass();
        l51Var.getLength();
        be3 be3Var = this.b;
        int read = l51Var.read(be3Var.a, 0, 2048);
        boolean z = read == -1;
        if (!this.i) {
            this.e.w(new bo(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        be3Var.N(0);
        be3Var.M(read);
        boolean z2 = this.h;
        i6 i6Var = this.a;
        if (!z2) {
            i6Var.u = this.f;
            this.h = true;
        }
        i6Var.a(be3Var);
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        be3 be3Var;
        int i = 0;
        while (true) {
            be3Var = this.c;
            l51Var.n(be3Var.a, 0, 10);
            be3Var.N(0);
            if (be3Var.D() != 4801587) {
                break;
            }
            be3Var.O(3);
            int z = be3Var.z();
            i += z + 10;
            l51Var.g(z);
        }
        l51Var.k();
        l51Var.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            rk0 rk0Var = (rk0) l51Var;
            rk0Var.e(be3Var.a, 0, 2, false);
            be3Var.N(0);
            if ((be3Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                rk0Var.e(be3Var.a, 0, 4, false);
                h00 h00Var = this.d;
                h00Var.q(14);
                int i5 = h00Var.i(13);
                if (i5 <= 6) {
                    i4++;
                    rk0Var.s = 0;
                    rk0Var.o(i4, false);
                } else {
                    rk0Var.o(i5 - 6, false);
                    i3 += i5;
                }
            } else {
                i4++;
                rk0Var.s = 0;
                rk0Var.o(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.e = m51Var;
        this.a.f(m51Var, new sy4(0, 1));
        m51Var.p();
    }

    @Override // defpackage.k51
    public final void a() {
    }
}
