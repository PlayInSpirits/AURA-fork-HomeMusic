package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 implements tb3 {
    public int A;
    public ya4 C;
    public boolean D;
    public boolean E;
    public sj1 n;
    public final rj1 o;
    public final ra p;
    public wf1 q;
    public gf1 r;
    public boolean t;
    public float[] v;
    public boolean w;
    public long s = 9223372034707292159L;
    public final float[] u = ya4.h();
    public oo0 x = new ro0(1.0f, 1.0f);
    public r62 y = r62.n;
    public final mz z = new mz();
    public long B = tw4.a;
    public boolean F = true;
    public final x G = new x(14, this);

    public vj1(sj1 sj1Var, rj1 rj1Var, ra raVar, wf1 wf1Var, gf1 gf1Var) {
        this.n = sj1Var;
        this.o = rj1Var;
        this.p = raVar;
        this.q = wf1Var;
        this.r = gf1Var;
    }

    public final float[] a() {
        float[] fArrH = this.v;
        if (fArrH == null) {
            fArrH = ya4.h();
            this.v = fArrH;
        }
        if (this.E) {
            this.E = false;
            float[] fArrB = b();
            if (this.F) {
                return fArrB;
            }
            if (!q05.q(fArrB, fArrH)) {
                fArrH[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrH[0])) {
            return null;
        }
        return fArrH;
    }

    public final float[] b() {
        boolean z = this.D;
        float[] fArr = this.u;
        if (z) {
            sj1 sj1Var = this.n;
            long jQ = sj1Var.z;
            uj1 uj1Var = sj1Var.a;
            if ((9223372034707292159L & jQ) == 9205357640488583168L) {
                jQ = h12.q(l93.o0(this.s));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ & 4294967295L));
            float fD = uj1Var.D();
            float fU = uj1Var.u();
            float fG = uj1Var.G();
            float fL = uj1Var.l();
            float fN = uj1Var.n();
            float fC = uj1Var.c();
            float fN2 = uj1Var.N();
            double d = ((double) fG) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fU * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fU * fSin);
            double d2 = ((double) fL) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fD * fCos2);
            float f10 = (f3 * fCos2) + ((-fD) * fSin2);
            double d3 = ((double) fN) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fC;
            float f16 = f14 * fC;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fC;
            float f18 = f12 * fN2;
            float f19 = fCos * fCos3 * fN2;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fN2;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.D = false;
            this.F = jz4.B(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.w || this.t) {
            return;
        }
        this.p.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = ra.l();
        ra raVar = this.p;
        if (zL) {
            raVar.J(-4.0f);
        }
        sj1 sj1Var = this.n;
        if (!g02.a(sj1Var.t, j)) {
            sj1Var.t = j;
            sj1Var.a.k((int) (j >> 32), (int) (j & 4294967295L), sj1Var.u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            raVar.invalidate();
            return;
        }
        ViewParent parent = raVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(raVar, raVar);
        }
    }

    public final void e(long j) {
        if (n02.a(j, this.s)) {
            return;
        }
        if (ra.l()) {
            this.p.J(-4.0f);
        }
        this.s = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.w) {
            this.w = z;
            ra raVar = this.p;
            q03 q03Var = raVar.N;
            boolean z2 = raVar.P;
            if (!z) {
                if (z2) {
                    return;
                }
                q03Var.j(this);
                q03 q03Var2 = raVar.O;
                if (q03Var2 != null) {
                    q03Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                q03Var.a(this);
                return;
            }
            q03 q03Var3 = raVar.O;
            if (q03Var3 == null) {
                q03Var3 = new q03();
                raVar.O = q03Var3;
            }
            q03Var3.a(this);
        }
    }

    public final void g() {
        ra.l();
        if (this.w) {
            if (this.B != tw4.a && !n02.a(this.n.u, this.s)) {
                sj1 sj1Var = this.n;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.B >> 32)) * ((int) (this.s >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.B & 4294967295L)) * ((int) (this.s & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!g83.b(sj1Var.z, jFloatToRawIntBits)) {
                    sj1Var.z = jFloatToRawIntBits;
                    sj1Var.a.o(jFloatToRawIntBits);
                }
            }
            sj1 sj1Var2 = this.n;
            oo0 oo0Var = this.x;
            r62 r62Var = this.y;
            long j = this.s;
            long j2 = sj1Var2.u;
            uj1 uj1Var = sj1Var2.a;
            if (!n02.a(j2, j)) {
                sj1Var2.u = j;
                long j3 = sj1Var2.t;
                uj1Var.k((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (sj1Var2.i == 9205357640488583168L) {
                    sj1Var2.g = true;
                    sj1Var2.a();
                }
            }
            sj1Var2.b = oo0Var;
            sj1Var2.c = r62Var;
            sj1Var2.d = this.G;
            uj1Var.q(oo0Var, r62Var, sj1Var2, sj1Var2.e);
            f(false);
        }
    }
}
