package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 implements Cloneable {
    public /* synthetic */ boolean n;
    public /* synthetic */ long[] o;
    public /* synthetic */ Object[] p;
    public /* synthetic */ int q;

    public xe2(int i) {
        if (i == 0) {
            this.o = su3.b;
            this.p = su3.c;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.o = new long[i5];
        this.p = new Object[i5];
    }

    public final void a() {
        int i = this.q;
        Object[] objArr = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.q = 0;
        this.n = false;
    }

    public final Object b(long j) {
        Object obj;
        int i = su3.i(this.o, this.q, j);
        if (i < 0 || (obj = this.p[i]) == ud3.b) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.n) {
            int i = this.q;
            long[] jArr = this.o;
            Object[] objArr = this.p;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ud3.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.n = false;
            this.q = i2;
        }
        return su3.i(this.o, this.q, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        xe2 xe2Var = (xe2) objClone;
        xe2Var.o = (long[]) this.o.clone();
        xe2Var.p = (Object[]) this.p.clone();
        return xe2Var;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.q)) {
            kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.n) {
            long[] jArr = this.o;
            Object[] objArr = this.p;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ud3.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.n = false;
            this.q = i3;
        }
        return this.o[i];
    }

    public final void f(long j, Object obj) {
        Object obj2 = ud3.b;
        int i = su3.i(this.o, this.q, j);
        if (i >= 0) {
            this.p[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.q;
        if (i2 < i3) {
            Object[] objArr = this.p;
            if (objArr[i2] == obj2) {
                this.o[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.n) {
            long[] jArr = this.o;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.p;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.n = false;
                this.q = i4;
                i2 = ~su3.i(this.o, i4, j);
            }
        }
        int i6 = this.q;
        if (i6 >= this.o.length) {
            int i7 = (i6 + 1) * 8;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 8;
            this.o = Arrays.copyOf(this.o, i10);
            this.p = Arrays.copyOf(this.p, i10);
        }
        int i11 = this.q;
        if (i11 - i2 != 0) {
            long[] jArr2 = this.o;
            int i12 = i2 + 1;
            ti.a0(jArr2, jArr2, i12, i2, i11);
            Object[] objArr3 = this.p;
            ti.Z(i12, i2, this.q, objArr3, objArr3);
        }
        this.o[i2] = j;
        this.p[i2] = obj;
        this.q++;
    }

    public final void g(long j) {
        int i = su3.i(this.o, this.q, j);
        if (i >= 0) {
            Object[] objArr = this.p;
            Object obj = objArr[i];
            Object obj2 = ud3.b;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.n = true;
            }
        }
    }

    public final int h() {
        if (this.n) {
            int i = this.q;
            long[] jArr = this.o;
            Object[] objArr = this.p;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ud3.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.n = false;
            this.q = i2;
        }
        return this.q;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.q)) {
            kf2.n(f34.f(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.n) {
            long[] jArr = this.o;
            Object[] objArr = this.p;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ud3.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.n = false;
            this.q = i3;
        }
        return this.p[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.q * 28);
        sb.append('{');
        int i = this.q;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ xe2(Object obj) {
        this(10);
    }
}
