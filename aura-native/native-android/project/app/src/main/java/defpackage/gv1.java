package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 implements ci0 {
    public final ci0 n;
    public final int o;
    public final er3 p;
    public final byte[] q;
    public int r;

    public gv1(ci0 ci0Var, int i, er3 er3Var) {
        rr2.l(i > 0);
        this.n = ci0Var;
        this.o = i;
        this.p = er3Var;
        this.q = new byte[1];
        this.r = i;
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.r;
        ci0 ci0Var = this.n;
        if (i3 == 0) {
            byte[] bArr2 = this.q;
            int i4 = 0;
            if (ci0Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = ci0Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        be3 be3Var = new be3(i5, bArr3);
                        er3 er3Var = this.p;
                        long jMax = !er3Var.l ? er3Var.i : Math.max(er3Var.m.y(true), er3Var.i);
                        int iA = be3Var.a();
                        wv4 wv4Var = er3Var.k;
                        wv4Var.getClass();
                        wv4Var.e(iA, be3Var);
                        wv4Var.a(jMax, 1, iA, 0, null);
                        er3Var.l = true;
                    }
                }
                this.r = this.o;
            }
            return -1;
        }
        int i8 = ci0Var.read(bArr, i, Math.min(this.r, i2));
        if (i8 != -1) {
            this.r -= i8;
        }
        return i8;
    }
}
