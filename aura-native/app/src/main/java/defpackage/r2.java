package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r2 implements k51 {
    public final s2 a = new s2("audio/ac3");
    public final be3 b = new be3(2786);
    public boolean c;

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        be3 be3Var = this.b;
        int read = l51Var.read(be3Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        be3Var.N(0);
        be3Var.M(read);
        boolean z = this.c;
        s2 s2Var = this.a;
        if (!z) {
            s2Var.o = 0L;
            this.c = true;
        }
        s2Var.a(be3Var);
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        rk0 rk0Var;
        int t;
        be3 be3Var = new be3(10);
        int i = 0;
        while (true) {
            rk0Var = (rk0) l51Var;
            rk0Var.e(be3Var.a, 0, 10, false);
            be3Var.N(0);
            if (be3Var.D() != 4801587) {
                break;
            }
            be3Var.O(3);
            int z = be3Var.z();
            i += z + 10;
            rk0Var.o(z, false);
        }
        rk0Var.s = 0;
        rk0Var.o(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            rk0Var.e(be3Var.a, 0, 6, false);
            be3Var.N(0);
            if (be3Var.H() != 2935) {
                rk0Var.s = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                rk0Var.o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = be3Var.a;
                if (bArr.length < 6) {
                    t = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    t = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    t = fu.t((b & 192) >> 6, b & 63);
                }
                if (t == -1) {
                    break;
                }
                rk0Var.o(t - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.a.f(m51Var, new sy4(0, 1));
        m51Var.p();
        m51Var.w(new bo(-9223372036854775807L));
    }

    @Override // defpackage.k51
    public final void a() {
    }
}
