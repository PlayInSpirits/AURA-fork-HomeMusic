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

    public tn0(e55 r3, f55 r4, vp4 r5) {
        this.a = r3;
        this.b = r4;
        r3.l = r5;
        this.c = new l55(new gp3(6, this), r3, r4);
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
        Surface r0 = this.e;
        r0.getClass();
        return r0;
    }

    @Override // defpackage.r55
    public final boolean c() {
        l55 r4 = this.c;
        long r0 = r4.j;
        if (r0 != (-9223372036854775807L)) goto L5;
        return false;
    L5:
        if (r4.i != r0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.r55
    public final void d() {
        this.b.b();
        e55 r3 = this.a;
        r3.d = false;
        r3.i = -9223372036854775807L;
        k55 r4 = r3.b;
        r4.d = false;
        g55 r0 = r4.c;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        r4.a();
    }

    @Override // defpackage.r55
    public final void e(float r1) {
        this.a.h(r1);
    }

    @Override // defpackage.r55
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.r55
    public final void g(tb1 r11, long r12, int r14, List r15) {
        rr2.w(r15.isEmpty());
        int r16 = r11.u;
        int r0 = r11.v;
        tb1 r1 = this.f;
        int r2 = r1.u;
        l55 r7 = this.c;
        if (r16 == r2) goto L5;
    L6:
        tu r3 = r7.d;
        long r8 = r7.h;
        if (r8 != (-9223372036854775807L)) goto L9;
        long r9 = 0;
    L10:
        r3.a(r9, new s55(r16, r0));
    L11:
        float r17 = r11.y;
        if (r17 == this.f.y) goto L14;
        this.a.f(r17);
    L14:
        this.f = r11;
        if (r12 != this.g) goto L17;
        return;
    L17:
        if (r7.f.p != 0) goto L19;
        r7.b.e(r14);
        r7.l = r12;
    L24:
        this.g = r12;
        return;
    L19:
        tu r13 = r7.e;
        long r18 = r7.h;
        if (r18 != (-9223372036854775807L)) goto L22;
        long r19 = -4611686018427387904L;
    L23:
        r13.a(r19, Long.valueOf(r12));
        goto L24
    L22:
        r19 = r18 + 1;
        goto L23
    L9:
        r9 = r8 + 1;
        goto L10
    L5:
        if (r0 == r1.v) goto L11;
        goto L6
    }

    @Override // defpackage.r55
    public final void h(long r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void i() {
        l55 r4 = this.c;
        if (r4.h != (-9223372036854775807L)) goto L5;
        r4.h = Long.MIN_VALUE;
        r4.i = Long.MIN_VALUE;
    L5:
        r4.j = r4.h;
    }

    @Override // defpackage.r55
    public final void j(int r2) {
        k55 r1 = this.a.b;
        if (r1.j != r2) goto L5;
        return;
    L5:
        r1.j = r2;
        r1.d(true);
    }

    @Override // defpackage.r55
    public final void k() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.r55
    public final void l(kk2 r1) {
        this.h = r1;
        this.i = gq0.n;
    }

    @Override // defpackage.r55
    public final boolean m(long r9, lk2 r11) {
        this.d.add(r11);
        l55 r12 = this.c;
        uu r0 = r12.f;
        int r1 = r0.p;
        long[] r2 = (long[]) r0.r;
        if (r1 != r2.length) goto L9;
        int r3 = r2.length << 1;
        if (r3 < 0) goto L7;
        long[] r5 = new long[r3];
        int r6 = r2.length;
        int r7 = r0.n;
        int r8 = r6 - r7;
        System.arraycopy(r2, r7, r5, 0, r8);
        System.arraycopy((long[]) r0.r, 0, r5, r8, r7);
        r0.n = 0;
        r0.o = r0.p - 1;
        r0.r = r5;
        r0.q = r3 - 1;
        goto L9
    L7:
        tb4.a();
        return false;
    L9:
        int r4 = (r0.o + 1) & r0.q;
        r0.o = r4;
        ((long[]) r0.r)[r4] = r9;
        r0.p++;
        r12.h = r9;
        r12.j = -9223372036854775807L;
        this.i.execute(new a0(21, this));
        return true;
    }

    @Override // defpackage.r55
    public final boolean n(tb1 r1) {
        return true;
    }

    @Override // defpackage.r55
    public final void o(boolean r8) {
        if (r8 == false) goto L5;
        e55 r9 = this.a;
        r9.b.b();
        r9.h = -9223372036854775807L;
        r9.f = -9223372036854775807L;
        r9.e = Math.min(r9.e, 1);
        r9.i = -9223372036854775807L;
    L5:
        this.b.b();
        l55 r10 = this.c;
        tu r3 = r10.d;
        uu r4 = r10.f;
        boolean r5 = false;
        r4.n = 0;
        r4.o = -1;
        r4.p = 0;
        r10.h = -9223372036854775807L;
        r10.i = -9223372036854775807L;
        r10.j = -9223372036854775807L;
        tu r0 = r10.e;
        if (r0.h() <= 0) goto L17;
        if (r0.h() <= 0) goto L10;
        boolean r1 = true;
    L11:
        rr2.l(r1);
    L13:
        if (r0.h() <= 1) goto L15;
        r0.e();
        goto L13
    L15:
        Object r2 = r0.e();
        r2.getClass();
        r10.l = ((Long) r2).longValue();
        goto L17
    L10:
        r1 = false;
    L17:
        if (r3.h() > 0) goto L19;
    L26:
        this.d.clear();
        return;
    L19:
        if (r3.h() <= 0) goto L21;
        r5 = true;
    L21:
        rr2.l(r5);
    L23:
        if (r3.h() <= 1) goto L25;
        r3.e();
        goto L23
    L25:
        Object r11 = r3.e();
        r11.getClass();
        r3.a(0, (s55) r11);
        goto L26
    }

    @Override // defpackage.r55
    public final void p(List r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void q(long r2, long r4) {
        this.c.a(r2, r4);     // Catch: ExoPlaybackException -> L4
        return;
    L4:
        e = move-exception;
        throw new VideoSink$VideoSinkException(e, this.f);
    }

    @Override // defpackage.r55
    public final void r(boolean r1) {
        this.a.c(r1);
    }

    @Override // defpackage.r55
    public final boolean s(boolean r1) {
        return this.a.b(r1);
    }

    @Override // defpackage.r55
    public final void t(c55 r1) {
        this.j = r1;
    }

    @Override // defpackage.r55
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r55
    public final void v(Surface r1, pf4 r2) {
        this.e = r1;
        this.a.g(r1);
    }

    @Override // defpackage.r55
    public final boolean w() {
        return true;
    }

    @Override // defpackage.r55
    public final void x() {
        e55 r1 = this.a;
        if (r1.e != 0) goto L6;
        r1.e = 1;
        return;
    }
}
