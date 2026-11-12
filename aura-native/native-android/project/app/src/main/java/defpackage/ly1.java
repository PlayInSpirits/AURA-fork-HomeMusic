package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 implements mv0 {
    public final z64 n;
    public gy1 o;
    public jy1 p;
    public iy1 q;
    public hy1 r;
    public wr1 s;
    public rm2 t;
    public e20 u;
    public final x7 v;
    public final x7 w;

    public ly1(z64 z64Var) {
        this.n = z64Var;
        x7 x7Var = new x7(7, false);
        x7Var.p = new q03();
        this.v = x7Var;
        x7 x7Var2 = new x7(10, false);
        x7Var2.p = new l03();
        this.w = x7Var2;
    }

    public static void c(ly1 ly1Var, ey1 ey1Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        z64 z64Var = ly1Var.n;
        iy1 iy1Var = ly1Var.q;
        if (iy1Var == null) {
            iy1Var = new iy1();
            iy1Var.j = null;
            iy1Var.k = Long.MAX_VALUE;
            iy1Var.l = false;
            ly1Var.q = iy1Var;
        }
        iy1Var.j = ey1Var;
        iy1Var.k = j;
        e20 e20Var = ly1Var.u;
        hb3 hb3Var = z64Var.D;
        if (e20Var == null) {
            ly1Var.u = new e20(hb3Var, 0);
        } else {
            e20Var.p = hb3Var;
            e20Var.o = j2;
        }
        iy1Var.l = false;
        ly1Var.s = iy1Var;
    }

    @Override // defpackage.ih1
    public final String A() {
        wr1 wr1Var = this.s;
        if (wr1Var instanceof gy1) {
            return ((gy1) wr1Var).l ? "waiting" : "idle";
        }
        if ((wr1Var instanceof iy1) || (wr1Var instanceof hy1)) {
            return "waiting";
        }
        return wr1Var instanceof jy1 ? "recognized" : "idle";
    }

    @Override // defpackage.mv0
    public final hb3 F() {
        return this.n.D;
    }

    public final void a() {
        gy1 gy1Var = this.o;
        fy1 fy1Var = fy1.p;
        if (gy1Var == null) {
            gy1Var = new gy1();
            gy1Var.j = fy1Var;
            gy1Var.k = false;
            gy1Var.l = false;
            this.o = gy1Var;
        }
        gy1Var.j = fy1Var;
        gy1Var.k = false;
        gy1Var.l = false;
        this.s = gy1Var;
    }

    public final void b(ey1 ey1Var, long j, e20 e20Var) {
        hy1 hy1Var = this.r;
        if (hy1Var == null) {
            hy1Var = new hy1();
            hy1Var.j = null;
            hy1Var.k = Long.MAX_VALUE;
            this.r = hy1Var;
        }
        hy1Var.j = ey1Var;
        hy1Var.k = j;
        e20Var.o = 0L;
        this.s = hy1Var;
    }

    public final rm2 d() {
        rm2 rm2Var = this.t;
        if (rm2Var != null) {
            return rm2Var;
        }
        kf2.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(ey1 ey1Var, dy1 dy1Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = ey1Var.c;
        z64 z64Var = this.n;
        hb3 hb3Var = z64Var.D;
        hb3Var.getClass();
        int i = ov0.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (hb3Var == hb3.n ? j & 4294967295L : j >> 32))) > 2.0f) {
            rm2 rm2VarD = d();
            hb3 hb3Var2 = z64Var.D;
            x7 x7Var = this.v;
            q03 q03Var = (q03) x7Var.p;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (zz1.h(ey1Var)) {
                x7Var.o = 0;
                q03Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (zz1.b(ey1Var) || zz1.h(ey1Var)) {
                j2 = 4294967295L;
            } else {
                if (q03Var.b == 3) {
                    int i2 = x7Var.o;
                    x7Var.o = i2 + 1;
                    q03Var.n(i2, ey1Var);
                } else {
                    q03Var.a(ey1Var);
                }
                if (x7Var.o == 3) {
                    x7Var.o = 0;
                }
                Object[] objArr = q03Var.a;
                int i3 = q03Var.b;
                int i4 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i4 < i3) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ey1) objArr[i4]).c >> 32));
                    i4++;
                    j4 = j4;
                }
                j2 = j4;
                int i5 = q03Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i5;
                Object[] objArr2 = q03Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((ey1) objArr2[i6]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / q03Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (hb3Var2 != null) {
                int i7 = dy1Var.a;
                if (i7 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i7 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = hb3Var2 == hb3.o ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((qf2) rm2VarD.o).a(ey1Var.b, jFloatToRawIntBits);
            x7 x7Var2 = this.w;
            l03 l03Var = (l03) x7Var2.p;
            int i8 = l03Var.b;
            if (i8 == 3) {
                int i9 = x7Var2.o;
                x7Var2.o = i9 + 1;
                if (i9 < 0 || i9 >= i8) {
                    kf2.h("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = l03Var.a;
                    long j5 = jArr[i9];
                    jArr[i9] = j;
                }
            } else {
                l03Var.a(j);
            }
            if (x7Var2.o == 3) {
                x7Var2.o = 0;
            }
            long[] jArr2 = l03Var.a;
            int i10 = l03Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i11] >> 32));
            }
            int i12 = l03Var.b;
            float f = fIntBitsToFloat7 / i12;
            long[] jArr3 = l03Var.a;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i13] & j2)) + fIntBitsToFloat4;
            }
            z64Var.A0(new xu0(true, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / l03Var.b)) & j2)));
        }
    }

    public final void f(ey1 ey1Var, ey1 ey1Var2, dy1 dy1Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.t == null) {
            this.t = new rm2(28);
        }
        rm2 rm2VarD = d();
        z64 z64Var = this.n;
        hb3 hb3Var = z64Var.D;
        x7 x7Var = this.v;
        q03 q03Var = (q03) x7Var.p;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ey1Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (ey1Var.c & 4294967295L));
        if (zz1.h(ey1Var)) {
            x7Var.o = 0;
            q03Var.d();
        }
        if (zz1.b(ey1Var) || zz1.h(ey1Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (q03Var.b == 3) {
                int i = x7Var.o;
                x7Var.o = i + 1;
                q03Var.n(i, ey1Var);
            } else {
                q03Var.a(ey1Var);
            }
            if (x7Var.o == 3) {
                x7Var.o = 0;
            }
            Object[] objArr = q03Var.a;
            int i2 = q03Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((ey1) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = q03Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = q03Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ey1) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / q03Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (hb3Var != null) {
            int i6 = dy1Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = hb3Var == hb3.o ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((qf2) rm2VarD.o).a(ey1Var.b, jFloatToRawIntBits);
        long jD = g83.d(zz1.B(ey1Var2, z64Var.D, dy1Var), j);
        z64Var.E.getClass();
        z64Var.A0(new yu0(jD));
        x7 x7Var2 = this.w;
        x7Var2.o = 0;
        ((l03) x7Var2.p).b = 0;
    }
}
