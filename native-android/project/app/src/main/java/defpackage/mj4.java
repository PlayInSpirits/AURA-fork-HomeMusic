package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mj4 implements Cloneable {
    public /* synthetic */ boolean n;
    public /* synthetic */ int[] o;
    public /* synthetic */ Object[] p;
    public /* synthetic */ int q;

    public mj4(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.o = new int[i5];
        this.p = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mj4 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        mj4 mj4Var = (mj4) objClone;
        mj4Var.o = (int[]) this.o.clone();
        mj4Var.p = (Object[]) this.p.clone();
        return mj4Var;
    }

    public final Object b(int i) {
        Object obj;
        int iH = su3.h(this.q, i, this.o);
        if (iH < 0 || (obj = this.p[iH]) == su3.f) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.n) {
            su3.f(this);
        }
        return this.o[i];
    }

    public final void d(int i, Object obj) {
        int iH = su3.h(this.q, i, this.o);
        if (iH >= 0) {
            this.p[iH] = obj;
            return;
        }
        int i2 = ~iH;
        int i3 = this.q;
        if (i2 < i3) {
            Object[] objArr = this.p;
            if (objArr[i2] == su3.f) {
                this.o[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.n && i3 >= this.o.length) {
            su3.f(this);
            i2 = ~su3.h(this.q, i, this.o);
        }
        int i4 = this.q;
        if (i4 >= this.o.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.o = Arrays.copyOf(this.o, i8);
            this.p = Arrays.copyOf(this.p, i8);
        }
        int i9 = this.q;
        if (i9 - i2 != 0) {
            int[] iArr = this.o;
            int i10 = i2 + 1;
            ti.Y(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.p;
            ti.Z(i10, i2, this.q, objArr2, objArr2);
        }
        this.o[i2] = i;
        this.p[i2] = obj;
        this.q++;
    }

    public final int e() {
        if (this.n) {
            su3.f(this);
        }
        return this.q;
    }

    public final Object f(int i) {
        if (this.n) {
            su3.f(this);
        }
        Object[] objArr = this.p;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.q * 28);
        sb.append('{');
        int i = this.q;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object objF = f(i2);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
