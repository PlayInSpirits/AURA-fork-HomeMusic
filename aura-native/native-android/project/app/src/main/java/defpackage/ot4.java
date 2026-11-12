package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ot4 {
    public final int a;
    public final ho b;
    public final o c;
    public ot4 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ pt4 h;

    public ot4(pt4 pt4Var, int i, ho hoVar, o oVar) {
        this.h = pt4Var;
        this.a = i;
        this.b = hoVar;
        this.c = oVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) throws Exception {
        qy3 qy3Var;
        qy3 qy3Var2;
        long j5 = this.h.f;
        ho hoVar = this.b;
        f63 f63VarM = j51.M(hoVar, 2);
        c72 c72VarO = j51.O(hoVar);
        boolean zH = c72VarO.H();
        w12 w12Var = c72VarO.Q;
        if (zH) {
            if (((f63) w12Var.e) != f63VarM) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = f63VarM.p;
                f63 f63Var = (f63) w12Var.e;
                f63Var.getClass();
                long jK = ji2.K(f63Var.A(f63VarM, jFloatToRawIntBits));
                qy3Var = new qy3(jK, (4294967295L & ((long) (((int) (jK & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jK >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, hoVar);
            } else {
                qy3Var = new qy3(j, j2, j3, j4, j5, fArr, hoVar);
            }
            qy3Var2 = qy3Var;
        } else {
            qy3Var2 = null;
        }
        if (qy3Var2 == null) {
            return;
        }
        this.c.invoke(qy3Var2);
    }

    public final void b() {
        pt4 pt4Var = this.h;
        i03 i03Var = pt4Var.a;
        int i = this.a;
        ot4 ot4Var = (ot4) i03Var.g(i);
        if (ot4Var != null) {
            if (ot4Var == this) {
                ot4 ot4Var2 = this.d;
                this.d = null;
                if (ot4Var2 != null) {
                    int iD = i03Var.d(i);
                    Object[] objArr = i03Var.c;
                    Object obj = objArr[iD];
                    i03Var.b[iD] = i;
                    objArr[iD] = ot4Var2;
                    return;
                }
                c72 c72VarO = j51.O(this.b.n);
                if (c72VarO.G()) {
                    yv3 rectManager = ((ra) h12.L(c72VarO)).getRectManager();
                    rectManager.getClass();
                    if (c72VarO.t != -4) {
                        ue1 ue1Var = rectManager.c;
                        int iE = rectManager.e(c72VarO);
                        long[] jArr = (long[]) ue1Var.p;
                        int i2 = iE + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD2 = i03Var.d(i);
            Object[] objArr2 = i03Var.c;
            Object obj2 = objArr2[iD2];
            i03Var.b[iD2] = i;
            objArr2[iD2] = ot4Var;
            while (true) {
                ot4 ot4Var3 = ot4Var.d;
                if (ot4Var3 == null) {
                    break;
                }
                if (ot4Var3 == this) {
                    ot4Var.d = this.d;
                    this.d = null;
                    return;
                }
                ot4Var = ot4Var3;
            }
        }
        ot4 ot4Var4 = pt4Var.b;
        if (ot4Var4 == this) {
            pt4Var.b = ot4Var4.d;
            this.d = null;
            return;
        }
        ot4 ot4Var5 = ot4Var4 != null ? ot4Var4.d : null;
        while (true) {
            ot4 ot4Var6 = ot4Var4;
            ot4Var4 = ot4Var5;
            if (ot4Var4 == null) {
                return;
            }
            if (ot4Var4 == this) {
                if (ot4Var6 != null) {
                    ot4Var6.d = ot4Var4.d;
                }
                this.d = null;
                return;
            }
            ot4Var5 = ot4Var4.d;
        }
    }
}
