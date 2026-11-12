package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ya3 extends l93 {
    public int e;
    public int g;
    public int i;
    public e22[] d = new e22[16];
    public int[] f = new int[16];
    public Object[] h = new Object[16];

    public final void u0() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, (Object) null);
        this.i = 0;
    }

    public final void v0(bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        if (this.e != 0) {
            x20 x20Var = new x20();
            x20Var.d = this;
            ya3 ya3Var = (ya3) x20Var.d;
            while (true) {
                e22 e22Var = ya3Var.d[x20Var.a];
                mg1 mg1VarE = e22Var.e(x20Var);
                bi biVar2 = biVar;
                lg4 lg4Var2 = lg4Var;
                uy3 uy3Var2 = uy3Var;
                wa3 wa3Var2 = wa3Var;
                try {
                    e22Var.d(x20Var, biVar2, lg4Var2, uy3Var2, wa3Var2);
                    int i = x20Var.a;
                    int i2 = ya3Var.e;
                    if (i < i2) {
                        e22 e22Var2 = ya3Var.d[i];
                        x20Var.b += e22Var2.b;
                        x20Var.c += e22Var2.c;
                        int i3 = i + 1;
                        x20Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        biVar = biVar2;
                        lg4Var = lg4Var2;
                        uy3Var = uy3Var2;
                        wa3Var = wa3Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (wa3Var2 == null) {
                        throw th;
                    }
                    si0.T(th, new jo(mg1VarE, lg4Var2, wa3Var2, 8));
                    throw th;
                }
            }
        }
        u0();
    }

    public final boolean w0() {
        return this.e == 0;
    }

    public final void x0(e22 e22Var) {
        int i = this.e;
        e22[] e22VarArr = this.d;
        if (i == e22VarArr.length) {
            e22[] e22VarArr2 = new e22[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(e22VarArr, 0, e22VarArr2, 0, i);
            this.d = e22VarArr2;
        }
        int i2 = this.g;
        int i3 = e22Var.b;
        int i4 = e22Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.f;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ti.Y(0, 0, length, iArr, iArr2);
            this.f = iArr2;
        }
        int i7 = this.i + i4;
        Object[] objArr = this.h;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.h = objArr2;
        }
        e22[] e22VarArr3 = this.d;
        int i9 = this.e;
        this.e = i9 + 1;
        e22VarArr3[i9] = e22Var;
        this.g += e22Var.b;
        this.i += i4;
    }
}
