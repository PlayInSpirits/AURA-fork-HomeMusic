package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zp1 {
    public final tv a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public pl1[] e = new pl1[8];
    public int f = 7;

    public zp1(tv tvVar) {
        this.a = tvVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                pl1 pl1Var = this.e[length];
                pl1Var.getClass();
                i -= pl1Var.c;
                int i4 = this.h;
                pl1 pl1Var2 = this.e[length];
                pl1Var2.getClass();
                this.h = i4 - pl1Var2.c;
                this.g--;
                i3++;
                length--;
            }
            pl1[] pl1VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(pl1VarArr, i5, pl1VarArr, i5 + i3, this.g);
            pl1[] pl1VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(pl1VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(pl1 pl1Var) {
        int i = pl1Var.c;
        int i2 = this.d;
        if (i > i2) {
            pl1[] pl1VarArr = this.e;
            ti.f0(0, pl1VarArr.length, null, pl1VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        pl1[] pl1VarArr2 = this.e;
        if (i3 > pl1VarArr2.length) {
            pl1[] pl1VarArr3 = new pl1[pl1VarArr2.length * 2];
            System.arraycopy(pl1VarArr2, 0, pl1VarArr3, pl1VarArr2.length, pl1VarArr2.length);
            this.f = this.e.length - 1;
            this.e = pl1VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = pl1Var;
        this.g++;
        this.h += i;
    }

    public final void c(yw ywVar) {
        ywVar.getClass();
        int[] iArr = yt1.a;
        int iD = ywVar.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iD; i++) {
            byte bI = ywVar.i(i);
            byte[] bArr = xe5.a;
            j2 += (long) yt1.b[bI & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iD2 = ywVar.d();
        tv tvVar = this.a;
        if (i2 >= iD2) {
            e(ywVar.d(), 127, 0);
            tvVar.X(ywVar);
            return;
        }
        tv tvVar2 = new tv();
        int[] iArr2 = yt1.a;
        int iD3 = ywVar.d();
        int i3 = 0;
        for (int i4 = 0; i4 < iD3; i4++) {
            byte bI2 = ywVar.i(i4);
            byte[] bArr2 = xe5.a;
            int i5 = bI2 & 255;
            int i6 = yt1.a[i5];
            byte b = yt1.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                tvVar2.Y((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            tvVar2.Y((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        yw ywVarG = tvVar2.g(tvVar2.o);
        e(ywVarG.d(), 127, 128);
        tvVar.X(ywVarG);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pl1 pl1Var = (pl1) arrayList.get(i2);
            yw ywVarP = pl1Var.a.p();
            yw ywVar = pl1Var.b;
            Integer num = (Integer) aq1.b.get(ywVarP);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    pl1[] pl1VarArr = aq1.a;
                    if (h12.c(pl1VarArr[iIntValue].b, ywVar)) {
                        length = length2;
                    } else if (h12.c(pl1VarArr[length2].b, ywVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    pl1 pl1Var2 = this.e[i3];
                    pl1Var2.getClass();
                    if (h12.c(pl1Var2.a, ywVarP)) {
                        pl1 pl1Var3 = this.e[i3];
                        pl1Var3.getClass();
                        if (h12.c(pl1Var3.b, ywVar)) {
                            length2 = aq1.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + aq1.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.Y(64);
                c(ywVarP);
                c(ywVar);
                b(pl1Var);
            } else {
                yw ywVar2 = pl1.d;
                ywVarP.getClass();
                ywVar2.getClass();
                if (!ywVarP.m(0, ywVar2, ywVar2.d()) || h12.c(pl1.i, ywVarP)) {
                    e(length, 63, 64);
                    c(ywVar);
                    b(pl1Var);
                } else {
                    e(length, 15, 0);
                    c(ywVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        tv tvVar = this.a;
        if (i < i2) {
            tvVar.Y(i | i3);
            return;
        }
        tvVar.Y(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            tvVar.Y(128 | (i4 & 127));
            i4 >>>= 7;
        }
        tvVar.Y(i4);
    }
}
