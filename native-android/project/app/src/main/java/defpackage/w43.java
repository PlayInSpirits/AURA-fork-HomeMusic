package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w43 extends a13 {
    public final a13 o;
    public boolean p;

    public w43(long j, gh4 gh4Var, if1 if1Var, if1 if1Var2, a13 a13Var) {
        super(j, gh4Var, if1Var, if1Var2);
        this.o = a13Var;
        a13Var.k();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.a13
    public final jz4 w() {
        w43 w43Var;
        a13 a13Var = this.o;
        if (a13Var.m || a13Var.c) {
            return new dh4(this);
        }
        x03 x03Var = this.h;
        long j = this.b;
        HashMap mapB = x03Var != null ? jh4.b(a13Var.g(), this, this.o.d()) : null;
        Object obj = jh4.c;
        synchronized (obj) {
            try {
                jh4.c(this);
                if (x03Var == null || x03Var.d == 0) {
                    w43Var = this;
                    w43Var.a();
                } else {
                    w43Var = this;
                    jz4 jz4VarZ = w43Var.z(this.o.g(), x03Var, mapB, this.o.d());
                    if (!jz4VarZ.equals(eh4.j)) {
                        return jz4VarZ;
                    }
                    x03 x03VarX = w43Var.o.x();
                    if (x03VarX != null) {
                        x03VarX.j(x03Var);
                    } else {
                        w43Var.o.B(x03Var);
                        w43Var.h = null;
                    }
                }
                if (h12.k(w43Var.o.g(), j) < 0) {
                    w43Var.o.v();
                }
                a13 a13Var2 = w43Var.o;
                a13Var2.r(a13Var2.d().b(j).a(w43Var.j));
                w43Var.o.A(j);
                a13 a13Var3 = w43Var.o;
                int i = w43Var.d;
                w43Var.d = -1;
                if (i >= 0) {
                    int[] iArr = a13Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    a13Var3.k = iArrCopyOf;
                } else {
                    a13Var3.getClass();
                }
                a13 a13Var4 = w43Var.o;
                gh4 gh4Var = w43Var.j;
                a13Var4.getClass();
                synchronized (obj) {
                    a13Var4.j = a13Var4.j.e(gh4Var);
                    a13 a13Var5 = w43Var.o;
                    int[] iArr2 = w43Var.k;
                    a13Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = a13Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        a13Var5.k = iArr2;
                    }
                }
                w43Var.m = true;
                if (!w43Var.p) {
                    w43Var.p = true;
                    w43Var.o.l();
                }
                return eh4.j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
