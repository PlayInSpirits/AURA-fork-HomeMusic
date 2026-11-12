package defpackage;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements r55 {
    public final e55 a;
    public final f55 b;
    public final l55 c;
    public final ArrayDeque d;
    public Surface e;
    public tb1 f;
    public long g;
    public q55 h;
    public Executor i;
    public c55 j;

    public tn0(e55 e55Var, f55 f55Var, vp4 vp4Var) {
        this.a = e55Var;
        this.b = f55Var;
        e55Var.l = vp4Var;
        this.c = new l55(new gp3(6, this), e55Var, f55Var);
        this.d = new ArrayDeque();
        this.f = new tb1(new sb1());
        this.g = -9223372036854775807L;
        this.h = q55.a;
        this.i = new di(1);
        this.j = new rn0();
    }

    @Override // defpackage.r55
    public final void a() {
    }

    @Override // defpackage.r55
    public final Surface b() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.r55
    public final boolean c() {
        l55 l55Var = this.c;
        long j = l55Var.j;
        return j != -9223372036854775807L && l55Var.i == j;
    }

    @Override // defpackage.r55
    public final void d() {
        this.b.b();
        e55 e55Var = this.a;
        e55Var.d = false;
        e55Var.i = -9223372036854775807L;
        k55 k55Var = e55Var.b;
        k55Var.d = false;
        g55 g55Var = k55Var.c;
        if (g55Var != null) {
            g55Var.b();
        }
        k55Var.a();
    }

    @Override // defpackage.r55
    public final void e(float f) {
        this.a.h(f);
    }

    @Override // defpackage.r55
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.r55
    public final void g(tb1 tb1Var, long j, int i, List list) {
        rr2.w(list.isEmpty());
        int i2 = tb1Var.u;
        int i3 = tb1Var.v;
        tb1 tb1Var2 = this.f;
        int i4 = tb1Var2.u;
        l55 l55Var = this.c;
        if (i2 != i4 || i3 != tb1Var2.v) {
            tu tuVar = l55Var.d;
            long j2 = l55Var.h;
            tuVar.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new s55(i2, i3));
        }
        float f = tb1Var.y;
        if (f != this.f.y) {
            this.a.f(f);
        }
        this.f = tb1Var;
        if (j != this.g) {
            if (l55Var.f.p == 0) {
                l55Var.b.e(i);
                l55Var.l = j;
            } else {
                tu tuVar2 = l55Var.e;
                long j3 = l55Var.h;
                tuVar2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.r55
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void i() {
        l55 l55Var = this.c;
        if (l55Var.h == -9223372036854775807L) {
            l55Var.h = Long.MIN_VALUE;
            l55Var.i = Long.MIN_VALUE;
        }
        l55Var.j = l55Var.h;
    }

    @Override // defpackage.r55
    public final void j(int i) {
        k55 k55Var = this.a.b;
        if (k55Var.j == i) {
            return;
        }
        k55Var.j = i;
        k55Var.d(true);
    }

    @Override // defpackage.r55
    public final void k() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.r55
    public final void l(kk2 kk2Var) {
        this.h = kk2Var;
        this.i = gq0.n;
    }

    @Override // defpackage.r55
    public final boolean m(long j, lk2 lk2Var) {
        this.d.add(lk2Var);
        l55 l55Var = this.c;
        uu uuVar = l55Var.f;
        int i = uuVar.p;
        long[] jArr = (long[]) uuVar.r;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                tb4.a();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = uuVar.n;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) uuVar.r, 0, jArr2, i3, i2);
            uuVar.n = 0;
            uuVar.o = uuVar.p - 1;
            uuVar.r = jArr2;
            uuVar.q = length - 1;
        }
        int i4 = (uuVar.o + 1) & uuVar.q;
        uuVar.o = i4;
        ((long[]) uuVar.r)[i4] = j;
        uuVar.p++;
        l55Var.h = j;
        l55Var.j = -9223372036854775807L;
        this.i.execute(new a0(21, this));
        return true;
    }

    @Override // defpackage.r55
    public final boolean n(tb1 tb1Var) {
        return true;
    }

    @Override // defpackage.r55
    public final void o(boolean z) {
        if (z) {
            e55 e55Var = this.a;
            e55Var.b.b();
            e55Var.h = -9223372036854775807L;
            e55Var.f = -9223372036854775807L;
            e55Var.e = Math.min(e55Var.e, 1);
            e55Var.i = -9223372036854775807L;
        }
        this.b.b();
        l55 l55Var = this.c;
        tu tuVar = l55Var.d;
        uu uuVar = l55Var.f;
        uuVar.n = 0;
        uuVar.o = -1;
        uuVar.p = 0;
        l55Var.h = -9223372036854775807L;
        l55Var.i = -9223372036854775807L;
        l55Var.j = -9223372036854775807L;
        tu tuVar2 = l55Var.e;
        if (tuVar2.h() > 0) {
            rr2.l(tuVar2.h() > 0);
            while (tuVar2.h() > 1) {
                tuVar2.e();
            }
            Object objE = tuVar2.e();
            objE.getClass();
            l55Var.l = ((Long) objE).longValue();
        }
        if (tuVar.h() > 0) {
            rr2.l(tuVar.h() > 0);
            while (tuVar.h() > 1) {
                tuVar.e();
            }
            Object objE2 = tuVar.e();
            objE2.getClass();
            tuVar.a(0L, (s55) objE2);
        }
        this.d.clear();
    }

    @Override // defpackage.r55
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void q(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.c.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.f);
        }
    }

    @Override // defpackage.r55
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.r55
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.r55
    public final void t(c55 c55Var) {
        this.j = c55Var;
    }

    @Override // defpackage.r55
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void v(Surface surface, pf4 pf4Var) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.r55
    public final boolean w() {
        return true;
    }

    @Override // defpackage.r55
    public final void x() {
        e55 e55Var = this.a;
        if (e55Var.e == 0) {
            e55Var.e = 1;
        }
    }
}
