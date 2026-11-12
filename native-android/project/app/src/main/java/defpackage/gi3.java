package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gi3 implements r55 {
    public yw1 a;
    public tb1 b;
    public long c;
    public long d;
    public int e;
    public final /* synthetic */ ki3 f;

    public gi3(ki3 ki3Var, Context context) {
        this.f = ki3Var;
        f35.M(context);
        vw1 vw1Var = yw1.o;
        this.a = gy3.r;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.r55
    public final void a() {
        ki3 ki3Var = this.f;
        if (ki3Var.n == 2) {
            return;
        }
        yp4 yp4Var = ki3Var.k;
        if (yp4Var != null) {
            yp4Var.e();
        }
        ki3Var.l = null;
        ki3Var.n = 2;
    }

    @Override // defpackage.r55
    public final Surface b() {
        rr2.w(false);
        throw null;
    }

    @Override // defpackage.r55
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r55
    public final void d() {
        ki3 ki3Var = this.f;
        if (ki3Var.d) {
            ki3Var.e.d();
        }
    }

    @Override // defpackage.r55
    public final void e(float f) {
        ki3 ki3Var = this.f;
        ki3Var.i.c(f);
        ki3Var.e.e(f);
    }

    @Override // defpackage.r55
    public final void f() {
        ki3 ki3Var = this.f;
        if (ki3Var.d) {
            ki3Var.e.f();
        }
    }

    @Override // defpackage.r55
    public final void g(tb1 tb1Var, long j, int i, List list) {
        rr2.w(false);
        this.a = yw1.k(list);
        this.b = tb1Var;
        sb1 sb1VarA = tb1Var.a();
        c50 c50Var = tb1Var.D;
        if (c50Var == null || !c50Var.d()) {
            c50Var = c50.h;
        }
        sb1VarA.C = c50Var;
        sb1VarA.a();
        throw null;
    }

    @Override // defpackage.r55
    public final void h(long j) {
        this.c = j;
    }

    @Override // defpackage.r55
    public final void i() {
        long j = this.d;
        ki3 ki3Var = this.f;
        if (ki3Var.o >= j) {
            ki3Var.e.i();
        }
    }

    @Override // defpackage.r55
    public final void j(int i) {
        this.f.e.j(i);
    }

    @Override // defpackage.r55
    public final void k() {
        int i = pf4.c.a;
        this.f.l = null;
    }

    @Override // defpackage.r55
    public final void l(kk2 kk2Var) {
    }

    @Override // defpackage.r55
    public final boolean m(long j, lk2 lk2Var) {
        int i;
        rr2.w(false);
        long j2 = j + this.c;
        ki3 ki3Var = this.f;
        f55 f55Var = ki3Var.i;
        long j3 = f55Var.a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * f55Var.c) + f55Var.b);
        if (j4 != -9223372036854775807L) {
            long j5 = ki3Var.h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.e) < 2) {
                this.e = i + 1;
                ok2 ok2Var = lk2Var.c;
                ak2 ak2Var = lk2Var.a;
                int i2 = lk2Var.b;
                Trace.beginSection("dropVideoBuffer");
                ak2Var.g(i2);
                Trace.endSection();
                ok2Var.S0(0, 1);
                return true;
            }
        }
        int i3 = ki3Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0047 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0052 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x005a A[Catch: GlUtil$GlException -> 0x0036, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[Catch: GlUtil$GlException -> 0x0036, TRY_LEAVE, TryCatch #0 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003d, B:28:0x0043, B:30:0x0047, B:37:0x005a, B:40:0x0061, B:45:0x0083, B:35:0x0052), top: B:54:0x0026 }] */
    @Override // defpackage.r55
    public final boolean n(tb1 tb1Var) throws VideoSink$VideoSinkException {
        ki3 ki3Var = this.f;
        boolean zD = true;
        rr2.w(ki3Var.n == 0);
        c50 c50Var = tb1Var.D;
        if (c50Var == null || !c50Var.d()) {
            c50Var = c50.h;
        }
        int i = c50Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !j51.D("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zD = false;
                        }
                    } else if (i == 7) {
                        zD = j51.D("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zD && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        l93.q0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        c50 c50Var2 = c50.h;
                    } else if (i != 2 || i == 10) {
                        c50 c50Var3 = c50.h;
                    }
                } else {
                    if (!(i2 >= 33 && j51.D("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                zD = false;
                            } else {
                                zD = false;
                            }
                        } else if (i == 7) {
                            zD = j51.D("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (zD) {
                            if (i != 2) {
                                c50 c50Var4 = c50.h;
                            } else {
                                c50 c50Var5 = c50.h;
                            }
                        } else if (i != 2) {
                            c50 c50Var6 = c50.h;
                        } else {
                            c50 c50Var7 = c50.h;
                        }
                    }
                }
            } catch (GlUtil$GlException e) {
                throw new VideoSink$VideoSinkException(e, tb1Var);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zD = false;
                } else {
                    zD = false;
                }
            } else if (i == 7) {
                zD = j51.D("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zD) {
                if (i != 2) {
                    c50 c50Var8 = c50.h;
                } else {
                    c50 c50Var9 = c50.h;
                }
            } else if (i != 2) {
                c50 c50Var10 = c50.h;
            } else {
                c50 c50Var11 = c50.h;
            }
        }
        vp4 vp4Var = ki3Var.f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ki3Var.k = vp4Var.a(looperMyLooper, null);
        try {
            ki3Var.b.a();
            throw null;
        } catch (VideoFrameProcessingException e2) {
            throw new VideoSink$VideoSinkException(e2, tb1Var);
        }
    }

    @Override // defpackage.r55
    public final void o(boolean z) {
        tu tuVar;
        this.d = -9223372036854775807L;
        ki3 ki3Var = this.f;
        tn0 tn0Var = ki3Var.e;
        if (ki3Var.n == 1) {
            ki3Var.m++;
            tn0Var.o(z);
            while (true) {
                int iH = ki3Var.j.h();
                tuVar = ki3Var.j;
                if (iH <= 1) {
                    break;
                } else {
                    tuVar.e();
                }
            }
            if (tuVar.h() == 1) {
                ((ji3) ki3Var.j.e()).getClass();
                throw null;
            }
            ki3Var.o = -9223372036854775807L;
            yp4 yp4Var = ki3Var.k;
            yp4Var.getClass();
            yp4Var.d(new qa1(25, ki3Var));
        }
    }

    @Override // defpackage.r55
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = yw1.k(list);
        tb1 tb1Var = this.b;
        if (tb1Var == null) {
            return;
        }
        sb1 sb1VarA = tb1Var.a();
        c50 c50Var = tb1Var.D;
        if (c50Var == null || !c50Var.d()) {
            c50Var = c50.h;
        }
        sb1VarA.C = c50Var;
        sb1VarA.a();
        throw null;
    }

    @Override // defpackage.r55
    public final void q(long j, long j2) throws VideoSink$VideoSinkException {
        this.f.e.q(j + this.c, j2);
    }

    @Override // defpackage.r55
    public final void r(boolean z) {
        ki3 ki3Var = this.f;
        if (ki3Var.d) {
            ki3Var.e.r(z);
        }
    }

    @Override // defpackage.r55
    public final boolean s(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.r55
    public final void t(c55 c55Var) {
        this.f.e.j = c55Var;
    }

    @Override // defpackage.r55
    public final void u() {
    }

    @Override // defpackage.r55
    public final void v(Surface surface, pf4 pf4Var) {
        ki3 ki3Var = this.f;
        Pair pair = ki3Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((pf4) ki3Var.l.second).equals(pf4Var)) {
            return;
        }
        ki3Var.l = Pair.create(surface, pf4Var);
        int i = pf4Var.a;
    }

    @Override // defpackage.r55
    public final boolean w() {
        return false;
    }

    @Override // defpackage.r55
    public final void x() {
        ki3 ki3Var = this.f;
        if (ki3Var.j.h() == 0) {
            ki3Var.e.x();
            return;
        }
        tu tuVar = new tu();
        if (ki3Var.j.h() <= 0) {
            ki3Var.j = tuVar;
        } else {
            ((ji3) ki3Var.j.e()).getClass();
            throw null;
        }
    }
}
