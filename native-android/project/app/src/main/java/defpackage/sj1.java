package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 {
    public boolean A;
    public RectF B;
    public final uj1 a;
    public Outline f;
    public float j;
    public ya4 k;
    public nc l;
    public nc m;
    public boolean n;
    public mz o;
    public gc p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public oo0 b = gb.b;
    public r62 c = r62.n;
    public if1 d = k5.q;
    public final ir0 e = new ir0(2, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final jw r = new jw();

    static {
        h12.c(Build.FINGERPRINT, "robolectric");
    }

    public sj1(uj1 uj1Var) {
        this.a = uj1Var;
        uj1Var.F(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            uj1 uj1Var = this.a;
            if (z || uj1Var.M() > 0.0f) {
                nc ncVar = this.l;
                if (ncVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = ncVar instanceof nc;
                    if (!z2) {
                        er1.l("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ncVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                er1.l("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                er1.l("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = ncVar;
                    if (outline != null) {
                        outline.setAlpha(uj1Var.b());
                        outline2 = outline;
                    }
                    uj1Var.d(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        uj1Var.F(false);
                        uj1Var.f();
                    } else {
                        uj1Var.F(this.A);
                    }
                } else {
                    uj1Var.F(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jO0 = l93.o0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jO0 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jO0 >> 32);
                    int i5 = (int) (jO0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(uj1Var.b());
                    uj1Var.d(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                uj1Var.F(false);
                uj1Var.d(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            jw jwVar = this.r;
            sj1 sj1Var = (sj1) jwVar.o;
            if (sj1Var != null) {
                sj1Var.e();
                jwVar.o = null;
            }
            x03 x03Var = (x03) jwVar.q;
            if (x03Var != null) {
                Object[] objArr = x03Var.b;
                long[] jArr = x03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((sj1) objArr[(i << 3) + i3]).e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                x03Var.b();
            }
            this.a.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[LOOP:0: B:20:0x0053->B:30:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[EDGE_INSN: B:34:0x008d->B:31:0x008d BREAK  A[LOOP:0: B:20:0x0053->B:30:0x008a], SYNTHETIC] */
    public final void c(sv0 sv0Var) {
        jw jwVar = this.r;
        jwVar.p = (sj1) jwVar.o;
        x03 x03Var = (x03) jwVar.q;
        if (x03Var != null && x03Var.h()) {
            x03 x03Var2 = (x03) jwVar.r;
            if (x03Var2 == null) {
                x03 x03Var3 = w54.a;
                x03Var2 = new x03();
                jwVar.r = x03Var2;
            }
            x03Var2.j(x03Var);
            x03Var.b();
        }
        jwVar.n = true;
        this.d.invoke(sv0Var);
        jwVar.n = false;
        sj1 sj1Var = (sj1) jwVar.p;
        if (sj1Var != null) {
            sj1Var.e();
        }
        x03 x03Var4 = (x03) jwVar.r;
        if (x03Var4 == null || !x03Var4.h()) {
            return;
        }
        Object[] objArr = x03Var4.b;
        long[] jArr = x03Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((sj1) objArr[(i << 3) + i3]).e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        x03Var4.b();
    }

    public final ya4 d() {
        ya4 nb3Var;
        ya4 ya4Var = this.k;
        nc ncVar = this.l;
        if (ya4Var != null) {
            return ya4Var;
        }
        if (ncVar != null) {
            mb3 mb3Var = new mb3(ncVar);
            this.k = mb3Var;
            return mb3Var;
        }
        long jO0 = l93.o0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jO0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jO0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jO0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            nb3Var = new ob3(wr1.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            nb3Var = new nb3(new wv3(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = nb3Var;
        return nb3Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(long j, long j2, float f) {
        float f2 = this.v;
        long jE = g83.e(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (g83.b(this.h, jE) && qf4.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
