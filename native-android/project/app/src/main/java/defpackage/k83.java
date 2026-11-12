package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k83 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final be3 g = new be3(255);

    public final boolean a(l51 l51Var, boolean z) throws ParserException, EOFException {
        boolean zE;
        boolean zE2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        be3 be3Var = this.g;
        be3Var.K(27);
        try {
            zE = l51Var.e(be3Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zE = false;
        }
        if (zE && be3Var.C() == 1332176723) {
            if (be3Var.A() == 0) {
                this.a = be3Var.A();
                this.b = be3Var.p();
                be3Var.r();
                be3Var.r();
                be3Var.r();
                int iA = be3Var.A();
                this.c = iA;
                this.d = iA + 27;
                be3Var.K(iA);
                try {
                    zE2 = l51Var.e(be3Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zE2 = false;
                }
                if (zE2) {
                    for (int i = 0; i < this.c; i++) {
                        int iA2 = be3Var.A();
                        this.f[i] = iA2;
                        this.e += iA2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(l51 l51Var, long j) {
        boolean zE;
        rr2.l(l51Var.getPosition() == l51Var.f());
        be3 be3Var = this.g;
        be3Var.K(4);
        while (true) {
            if (j != -1 && l51Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zE = l51Var.e(be3Var.a, 0, 4, true);
            } catch (EOFException unused) {
                zE = false;
            }
            if (!zE) {
                break;
            }
            be3Var.N(0);
            if (be3Var.C() == 1332176723) {
                l51Var.k();
                return true;
            }
            l51Var.l(1);
        }
        do {
            if (j != -1 && l51Var.getPosition() >= j) {
                break;
            }
        } while (l51Var.h(1) != -1);
        return false;
    }
}
