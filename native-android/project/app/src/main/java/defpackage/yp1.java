package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 {
    public final xu3 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public pl1[] d = new pl1[8];
    public int e = 7;

    public yp1(tq1 tq1Var) {
        this.c = new xu3(tq1Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                pl1 pl1Var = this.d[length];
                pl1Var.getClass();
                int i4 = pl1Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            pl1[] pl1VarArr = this.d;
            System.arraycopy(pl1VarArr, i2 + 1, pl1VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final yw b(int i) throws IOException {
        if (i >= 0) {
            pl1[] pl1VarArr = aq1.a;
            if (i <= pl1VarArr.length - 1) {
                return pl1VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - aq1.a.length);
        if (length >= 0) {
            pl1[] pl1VarArr2 = this.d;
            if (length < pl1VarArr2.length) {
                pl1 pl1Var = pl1VarArr2[length];
                pl1Var.getClass();
                return pl1Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(pl1 pl1Var) {
        this.b.add(pl1Var);
        int i = pl1Var.c;
        int i2 = this.a;
        if (i > i2) {
            pl1[] pl1VarArr = this.d;
            ti.f0(0, pl1VarArr.length, null, pl1VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        pl1[] pl1VarArr2 = this.d;
        if (i3 > pl1VarArr2.length) {
            pl1[] pl1VarArr3 = new pl1[pl1VarArr2.length * 2];
            System.arraycopy(pl1VarArr2, 0, pl1VarArr3, pl1VarArr2.length, pl1VarArr2.length);
            this.e = this.d.length - 1;
            this.d = pl1VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = pl1Var;
        this.f++;
        this.g += i;
    }

    public final yw d() {
        xu3 xu3Var = this.c;
        byte b = xu3Var.readByte();
        byte[] bArr = xe5.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return xu3Var.g(jE);
        }
        tv tvVar = new tv();
        int[] iArr = yt1.a;
        xu3Var.getClass();
        j83 j83Var = yt1.c;
        j83 j83Var2 = j83Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = xu3Var.readByte();
            byte[] bArr2 = xe5.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                j83[] j83VarArr = (j83[]) j83Var2.p;
                j83VarArr.getClass();
                j83Var2 = j83VarArr[(i2 >>> (i3 - 8)) & 255];
                j83Var2.getClass();
                if (((j83[]) j83Var2.p) == null) {
                    tvVar.Y(j83Var2.n);
                    i3 -= j83Var2.o;
                    j83Var2 = j83Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            j83[] j83VarArr2 = (j83[]) j83Var2.p;
            j83VarArr2.getClass();
            j83 j83Var3 = j83VarArr2[(i2 << (8 - i3)) & 255];
            j83Var3.getClass();
            int i4 = j83Var3.o;
            if (((j83[]) j83Var3.p) != null || i4 > i3) {
                break;
            }
            tvVar.Y(j83Var3.n);
            i3 -= i4;
            j83Var2 = j83Var;
        }
        return tvVar.g(tvVar.o);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = xe5.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
