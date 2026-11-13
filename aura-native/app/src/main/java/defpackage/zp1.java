package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        int d = ywVar.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < d; i++) {
            byte i2 = ywVar.i(i);
            byte[] bArr = xe5.a;
            j2 += yt1.b[i2 & 255];
        }
        int i3 = (int) ((j2 + 7) >> 3);
        int d2 = ywVar.d();
        tv tvVar = this.a;
        if (i3 >= d2) {
            e(ywVar.d(), 127, 0);
            tvVar.X(ywVar);
            return;
        }
        tv tvVar2 = new tv();
        int[] iArr2 = yt1.a;
        int d3 = ywVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d3; i5++) {
            byte i6 = ywVar.i(i5);
            byte[] bArr2 = xe5.a;
            int i7 = i6 & 255;
            int i8 = yt1.a[i7];
            byte b = yt1.b[i7];
            j = (j << b) | i8;
            i4 += b;
            while (i4 >= 8) {
                i4 -= 8;
                tvVar2.Y((int) (j >> i4));
            }
        }
        if (i4 > 0) {
            tvVar2.Y((int) ((j << (8 - i4)) | (255 >>> i4)));
        }
        yw g = tvVar2.g(tvVar2.o);
        e(g.d(), 127, 128);
        tvVar.X(g);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            pl1 pl1Var = (pl1) arrayList.get(i4);
            yw p = pl1Var.a.p();
            yw ywVar = pl1Var.b;
            Integer num = (Integer) aq1.b.get(p);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    pl1[] pl1VarArr = aq1.a;
                    if (h12.c(pl1VarArr[intValue].b, ywVar)) {
                        i = i2;
                    } else if (h12.c(pl1VarArr[i2].b, ywVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    pl1 pl1Var2 = this.e[i5];
                    pl1Var2.getClass();
                    if (h12.c(pl1Var2.a, p)) {
                        pl1 pl1Var3 = this.e[i5];
                        pl1Var3.getClass();
                        if (h12.c(pl1Var3.b, ywVar)) {
                            i2 = aq1.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + aq1.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.Y(64);
                c(p);
                c(ywVar);
                b(pl1Var);
            } else {
                yw ywVar2 = pl1.d;
                p.getClass();
                ywVar2.getClass();
                if (!p.m(0, ywVar2, ywVar2.d()) || h12.c(pl1.i, p)) {
                    e(i, 63, 64);
                    c(ywVar);
                    b(pl1Var);
                } else {
                    e(i, 15, 0);
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
