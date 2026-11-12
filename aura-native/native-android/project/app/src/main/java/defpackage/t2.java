package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements k51 {
    public final s2 a = new s2(0, 1, null, "audio/ac4");
    public final be3 b = new be3(16384);
    public boolean c;

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        be3 be3Var = this.b;
        int i = l51Var.read(be3Var.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        be3Var.N(0);
        be3Var.M(i);
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
        int i;
        be3 be3Var = new be3(10);
        int i2 = 0;
        while (true) {
            rk0Var = (rk0) l51Var;
            rk0Var.e(be3Var.a, 0, 10, false);
            be3Var.N(0);
            if (be3Var.D() != 4801587) {
                break;
            }
            be3Var.O(3);
            int iZ = be3Var.z();
            i2 += iZ + 10;
            rk0Var.o(iZ, false);
        }
        rk0Var.s = 0;
        rk0Var.o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            rk0Var.e(be3Var.a, 0, 7, false);
            be3Var.N(0);
            int iH = be3Var.H();
            if (iH == 44096 || iH == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = be3Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iH == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                rk0Var.o(i - 7, false);
            } else {
                rk0Var.s = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                rk0Var.o(i4, false);
                i3 = 0;
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
}
