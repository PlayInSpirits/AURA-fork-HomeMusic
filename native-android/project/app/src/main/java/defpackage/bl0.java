package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements bi0 {
    public int n;
    public int o;
    public boolean p;
    public final Object q;
    public Object r;

    public bl0(int i) {
        switch (i) {
            case 1:
                this.q = new k83();
                this.r = new be3(0, new byte[65025]);
                this.n = -1;
                break;
            default:
                this.q = new qr2(10);
                this.n = 8000;
                this.o = 8000;
                break;
        }
    }

    public int a(int i) {
        int i2;
        int i3 = 0;
        this.o = 0;
        do {
            int i4 = this.o;
            int i5 = i + i4;
            k83 k83Var = (k83) this.q;
            if (i5 >= k83Var.c) {
                break;
            }
            int[] iArr = k83Var.f;
            this.o = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public boolean b(l51 l51Var) {
        int i;
        k83 k83Var = (k83) this.q;
        be3 be3Var = (be3) this.r;
        rr2.w(l51Var != null);
        if (this.p) {
            this.p = false;
            be3Var.K(0);
        }
        while (!this.p) {
            if (this.n < 0) {
                if (k83Var.b(l51Var, -1L) && k83Var.a(l51Var, true)) {
                    int iA = k83Var.d;
                    if ((k83Var.a & 1) == 1 && be3Var.c == 0) {
                        iA += a(0);
                        i = this.o;
                    } else {
                        i = 0;
                    }
                    try {
                        l51Var.l(iA);
                        this.n = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.n);
            int i2 = this.n + this.o;
            if (iA2 > 0) {
                be3Var.c(be3Var.c + iA2);
                try {
                    l51Var.readFully(be3Var.a, be3Var.c, iA2);
                    be3Var.M(be3Var.c + iA2);
                    this.p = k83Var.f[i2 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i2 == k83Var.c) {
                i2 = -1;
            }
            this.n = i2;
        }
        return true;
    }

    @Override // defpackage.bi0
    public ci0 m() {
        el0 el0Var = new el0(this.n, this.o, this.p, (qr2) this.q);
        rw4 rw4Var = (rw4) this.r;
        if (rw4Var != null) {
            el0Var.c(rw4Var);
        }
        return el0Var;
    }
}
