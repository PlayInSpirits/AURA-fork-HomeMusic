package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m45 {
    public final boolean a;
    public final l45 b;
    public final int c;
    public final vh0[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public m45(boolean z, l45 l45Var) {
        int i;
        this.a = z;
        this.b = l45Var;
        if (z && l45Var.equals(l45.n)) {
            kf2.o("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = l45Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                er1.n();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new vh0[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        vh0[] vh0VarArr = this.d;
        vh0 vh0Var = vh0VarArr[i];
        if (vh0Var != null) {
            vh0Var.a = j;
            vh0Var.b = f;
        } else {
            vh0 vh0Var2 = new vh0();
            vh0Var2.a = j;
            vh0Var2.b = f;
            vh0VarArr[i] = vh0Var2;
        }
    }

    public final float b(float f) {
        l45 l45Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            cz1.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        vh0[] vh0VarArr = this.d;
        vh0 vh0Var = vh0VarArr[i2];
        if (vh0Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            vh0 vh0Var2 = vh0Var;
            while (true) {
                vh0 vh0Var3 = vh0VarArr[i2];
                boolean z2 = this.a;
                l45Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (vh0Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = vh0Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = vh0Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - vh0Var2.a);
                vh0Var2 = (l45Var == l45.n || z) ? vh0Var3 : vh0Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = vh0Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = l45Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        xl.G(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        er1.n();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ m45() {
        this(false, l45.n);
    }

    public m45(int i) {
        this(true, l45.o);
    }
}
