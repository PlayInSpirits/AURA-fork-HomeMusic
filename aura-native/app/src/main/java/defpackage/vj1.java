package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        float[] fArr = this.v;
        if (fArr == null) {
            fArr = ya4.h();
            this.v = fArr;
        }
        if (this.E) {
            this.E = false;
            float[] b = b();
            if (this.F) {
                return b;
            }
            if (!q05.q(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.D;
        float[] fArr = this.u;
        if (z) {
            sj1 sj1Var = this.n;
            long j = sj1Var.z;
            uj1 uj1Var = sj1Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = h12.q(l93.o0(this.s));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float D = uj1Var.D();
            float u = uj1Var.u();
            float G = uj1Var.G();
            float l = uj1Var.l();
            float n = uj1Var.n();
            float c = uj1Var.c();
            float N = uj1Var.N();
            double d = G * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (u * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (u * sin);
            double d2 = l * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (D * cos2);
            float f10 = (f3 * cos2) + ((-D) * sin2);
            double d3 = n * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * c;
            float f14 = sin3 * cos * c;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * c;
            float f16 = f12 * N;
            float f17 = cos * cos3 * N;
            float f18 = ((cos3 * f6) + (f11 * f4)) * N;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
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
        boolean l = ra.l();
        ra raVar = this.p;
        if (l) {
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
                float intBitsToFloat = Float.intBitsToFloat((int) (this.B >> 32)) * ((int) (this.s >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.B & 4294967295L)) * ((int) (this.s & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!g83.b(sj1Var.z, floatToRawIntBits)) {
                    sj1Var.z = floatToRawIntBits;
                    sj1Var.a.o(floatToRawIntBits);
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
