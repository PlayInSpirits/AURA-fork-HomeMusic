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

    public gi3(ki3 r1, Context r2) {
        this.f = r1;
        f35.M(r2);
        vw1 r3 = yw1.o;
        this.a = gy3.r;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.r55
    public final void a() {
        ki3 r2 = this.f;
        if (r2.n != 2) goto L5;
        return;
    L5:
        yp4 r0 = r2.k;
        if (r0 == null) goto L8;
        r0.e();
    L8:
        r2.l = null;
        r2.n = 2;
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
        ki3 r1 = this.f;
        if (r1.d == false) goto L6;
        r1.e.d();
        return;
    }

    @Override // defpackage.r55
    public final void e(float r2) {
        ki3 r1 = this.f;
        r1.i.c(r2);
        r1.e.e(r2);
    }

    @Override // defpackage.r55
    public final void f() {
        ki3 r1 = this.f;
        if (r1.d == false) goto L6;
        r1.e.f();
        return;
    }

    @Override // defpackage.r55
    public final void g(tb1 r1, long r2, int r4, List r5) {
        rr2.w(false);
        this.a = yw1.k(r5);
        this.b = r1;
        sb1 r0 = r1.a();
        c50 r3 = r1.D;
        if (r3 != null) goto L5;
    L7:
        r3 = c50.h;
    L8:
        r0.C = r3;
        r0.a();
        throw null;
    L5:
        if (r3.d() == false) goto L7;
        goto L7
    }

    @Override // defpackage.r55
    public final void h(long r1) {
        this.c = r1;
    }

    @Override // defpackage.r55
    public final void i() {
        long r0 = this.d;
        ki3 r4 = this.f;
        if (r4.o < r0) goto L6;
        r4.e.i();
        return;
    }

    @Override // defpackage.r55
    public final void j(int r1) {
        this.f.e.j(r1);
    }

    @Override // defpackage.r55
    public final void k() {
        int r0 = pf4.c.a;
        this.f.l = null;
    }

    @Override // defpackage.r55
    public final void l(kk2 r1) {
    }

    @Override // defpackage.r55
    public final boolean m(long r10, lk2 r12) {
        rr2.w(false);
        long r11 = r10 + this.c;
        ki3 r1 = this.f;
        f55 r2 = r1.i;
        long r3 = r2.a;
        if (r3 != (-9223372036854775807L)) goto L5;
        long r13 = -9223372036854775807L;
    L7:
        if (r13 == (-9223372036854775807L)) goto L16;
        long r4 = r1.h;
        if (r4 == (-9223372036854775807L)) goto L16;
        if (r13 >= r4) goto L16;
        int r14 = this.e;
        if (r14 >= 2) goto L16;
        this.e = r14 + 1;
        ok2 r9 = r12.c;
        ak2 r15 = r12.a;
        int r16 = r12.b;
        Trace.beginSection("dropVideoBuffer");
        r15.g(r16);
        Trace.endSection();
        r9.S0(0, 1);
        return true;
    L16:
        int r17 = r1.p;
        if (r17 == (-1)) goto L22;
        if (r17 != 0) goto L22;
        throw null;
    L22:
        return false;
    L5:
        r13 = (long) (((r11 - r3) * r2.c) + r2.b);
        goto L7
    }

    @Override // defpackage.r55
    public final boolean n(tb1 r10) {
        ki3 r9 = this.f;
        boolean r2 = true;
        if (r9.n != 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        c50 r3 = r10.D;
        if (r3 != null) goto L9;
    L11:
        r3 = c50.h;
    L12:
        int r4 = r3.c;
        if (r4 != 7) goto L27;
        int r7 = Build.VERSION.SDK_INT;     // Catch: GlUtil$GlException -> L20
        if (r7 >= 34) goto L27;
        if (r7 >= 33) goto L18;
    L22:
        boolean r8 = false;
    L23:
        if (r8 == false) goto L27;
    L46:
        vp4 r0 = r9.f;
        Looper r5 = Looper.myLooper();
        r5.getClass();
        r9.k = r0.a(r5, null);
        r9.b.a();     // Catch: VideoFrameProcessingException -> L49
        throw null;
    L49:
        e = move-exception;
        throw new VideoSink$VideoSinkException(e, r10);
    L18:
        if (j51.D("EGL_EXT_gl_colorspace_bt2020_pq") == false) goto L22;
        r8 = true;
    L20:
        e = move-exception;
        throw new VideoSink$VideoSinkException(e, r10);
    L27:
        if (r4 == 6) goto L29;
        if (r4 != 7) goto L36;
        r2 = j51.D("EGL_EXT_gl_colorspace_bt2020_hlg");     // Catch: GlUtil$GlException -> L20
    L36:
        if (r2 == true) goto L42;
        if (Build.VERSION.SDK_INT < 29) goto L42;
        Locale r6 = Locale.US;     // Catch: GlUtil$GlException -> L20
        l93.q0("PlaybackVidGraphWrapper", "Color transfer " + r4 + " is not supported. Falling back to OpenGl tone mapping.");     // Catch: GlUtil$GlException -> L20
        c50 r11 = c50.h;     // Catch: GlUtil$GlException -> L20
    L42:
        if (r4 != 2) goto L44;
    L45:
        c50 r12 = c50.h;     // Catch: GlUtil$GlException -> L20
        goto L46
    L44:
        if (r4 != 10) goto L46;
    L29:
        if (Build.VERSION.SDK_INT >= 33) goto L31;
    L33:
        r2 = false;
        goto L36
    L31:
        if (j51.D("EGL_EXT_gl_colorspace_bt2020_pq") == false) goto L33;
    L9:
        if (r3.d() == false) goto L11;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.r55
    public final void o(boolean r6) {
        this.d = -9223372036854775807L;
        ki3 r5 = this.f;
        tn0 r2 = r5.e;
        if (r5.n != 1) goto L13;
        r5.m++;
        r2.o(r6);
    L5:
        int r7 = r5.j.h();
        tu r3 = r5.j;
        if (r7 <= 1) goto L9;
        r3.e();
        goto L5
    L9:
        if (r3.h() == 1) goto L11;
        r5.o = -9223372036854775807L;
        yp4 r8 = r5.k;
        r8.getClass();
        r8.d(new qa1(25, r5));
        return;
    L11:
        ((ji3) r5.j.e()).getClass();
        throw null;
    }

    @Override // defpackage.r55
    public final void p(List r2) {
        if (this.a.equals(r2) == true) goto L16;
        this.a = yw1.k(r2);
        tb1 r1 = this.b;
        if (r1 != null) goto L8;
        return;
    L8:
        sb1 r3 = r1.a();
        c50 r4 = r1.D;
        if (r4 != null) goto L11;
    L13:
        r4 = c50.h;
    L14:
        r3.C = r4;
        r3.a();
        throw null;
    L11:
        if (r4.d() == false) goto L13;
    }

    @Override // defpackage.r55
    public final void q(long r3, long r5) {
        long r4 = r3 + this.c;
        this.f.e.q(r4, r5);
    }

    @Override // defpackage.r55
    public final void r(boolean r2) {
        ki3 r1 = this.f;
        if (r1.d == false) goto L6;
        r1.e.r(r2);
        return;
    }

    @Override // defpackage.r55
    public final boolean s(boolean r1) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.r55
    public final void t(c55 r1) {
        this.f.e.j = r1;
    }

    @Override // defpackage.r55
    public final void u() {
    }

    @Override // defpackage.r55
    public final void v(Surface r2, pf4 r3) {
        ki3 r1 = this.f;
        Pair r0 = r1.l;
        if (r0 != null) goto L5;
    L9:
        r1.l = Pair.create(r2, r3);
        int r4 = r3.a;
        return;
    L5:
        if (((Surface) r0.first).equals(r2) == false) goto L9;
        if (((pf4) r1.l.second).equals(r3) == false) goto L9;
    }

    @Override // defpackage.r55
    public final boolean w() {
        return false;
    }

    @Override // defpackage.r55
    public final void x() {
        ki3 r2 = this.f;
        if (r2.j.h() != 0) goto L6;
        r2.e.x();
        return;
    L6:
        tu r0 = new tu();
        if (r2.j.h() > 0) goto L10;
        r2.j = r0;
        return;
    L10:
        ((ji3) r2.j.e()).getClass();
        throw null;
    }
}
