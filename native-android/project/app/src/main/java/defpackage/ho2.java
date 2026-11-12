package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho2 {
    public int A;
    public boolean B;
    public final Context a;
    public final Executor b;
    public final nm0 c;
    public final PlaybackSession d;
    public final long e;
    public final bu4 f;
    public final zt4 g;
    public final HashMap h;
    public final HashMap i;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public int m;
    public int n;
    public PlaybackException o;
    public ue1 p;
    public ue1 q;
    public ue1 r;
    public tb1 s;
    public tb1 t;
    public tb1 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public ho2(Context r1, PlaybackSession r2) {
        this.a = r1.getApplicationContext();
        this.d = r2;
        this.b = uo.t();
        this.f = new bu4();
        this.g = new zt4();
        this.i = new HashMap();
        this.h = new HashMap();
        this.e = SystemClock.elapsedRealtime();
        this.m = 0;
        this.n = 0;
        nm0 r3 = new nm0();
        this.c = r3;
        r3.d = this;
    }

    public final boolean a(ue1 r2) {
        if (r2 == null) goto L14;
        String r3 = (String) r2.q;
        nm0 r1 = this.c;
        monitor-enter(r1);
        String r0 = r1.f;     // Catch: Throwable -> L11
        monitor-exit(r1);
        if (r3.equals(r0) == false) goto L18;
        return true;
    L18:
        return false;
    L11:
        th = move-exception;
        throw th;
    L14:
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder r0 = this.k;
        if (r0 != null) goto L5;
    L21:
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
        return;
    L5:
        if (this.B == false) goto L21;
        fo2.w(r0, this.A);
        fo2.y(this.k, this.y);
        fo2.A(this.k, this.z);
        Long r1 = (Long) this.h.get(this.j);
        PlaybackMetrics.Builder r2 = this.k;
        if (r1 != null) goto L9;
        long r5 = 0;
    L10:
        fo2.p(r2, r5);
        Long r3 = (Long) this.i.get(this.j);
        PlaybackMetrics.Builder r4 = this.k;
        if (r3 != null) goto L13;
        long r6 = 0;
    L14:
        fo2.x(r4, r6);
        PlaybackMetrics.Builder r7 = this.k;
        if (r3 != null) goto L17;
    L19:
        int r8 = 0;
    L20:
        fo2.B(r7, r8);
        this.b.execute(new ws1(26, this, fo2.i(this.k)));
        goto L21
    L17:
        if (r3.longValue() <= 0) goto L19;
        r8 = 1;
        goto L20
    L13:
        r6 = r3.longValue();
        goto L14
    L9:
        r5 = r1.longValue();
        goto L10
    }

    public final void c(cu4 r9, mt2 r10) {
        PlaybackMetrics.Builder r0 = this.k;
        if (r10 == null) goto L34;
        int r11 = r9.b(r10.a);
        if (r11 != (-1)) goto L8;
        return;
    L8:
        zt4 r1 = this.g;
        int r2 = 0;
        r9.f(r11, r1, false);
        int r12 = r1.c;
        bu4 r3 = this.f;
        r9.n(r12, r3);
        bn2 r13 = r3.b.b;
        int r14 = 2;
        if (r13 == null) goto L19;
        int r15 = f35.J(r13.a, r13.b);
        if (r15 == 0) goto L18;
        if (r15 == 1) goto L17;
        if (r15 == 2) goto L16;
        r2 = 1;
        goto L19
    L16:
        r2 = 4;
        goto L19
    L17:
        r2 = 5;
        goto L19
    L18:
        r2 = 3;
    L19:
        fo2.C(r0, r2);
        if (r3.l == (-9223372036854775807L)) goto L29;
        if (r3.j == true) goto L29;
        if (r3.h == true) goto L29;
        if (r3.a() == true) goto L29;
        fo2.z(r0, f35.i0(r3.l));
    L29:
        if (r3.a() == true) goto L32;
        r14 = 1;
    L32:
        fo2.D(r0, r14);
        this.B = true;
        return;
    }

    public final void d(q9 r1, String r2) {
        mt2 r3 = r1.d;
        if (r3 == null) goto L7;
        if (r3.b() == false) goto L7;
    L10:
        this.h.remove(r2);
        this.i.remove(r2);
        return;
    L7:
        if (r2.equals(this.j) == false) goto L10;
        b();
        goto L10
    }

    public final void e(int r3, long r4, tb1 r6, int r7) {
        TrackChangeEvent.Builder r5 = fo2.n(go2.g(r3), r4 - this.e);
        if (r6 == null) goto L48;
        hd0.r(r5);
        if (r7 == 1) goto L11;
        int r0 = 3;
        if (r7 == 2) goto L12;
        if (r7 == 3) goto L10;
        r0 = 1;
        goto L12
    L10:
        r0 = 4;
    L12:
        hd0.s(r5, r0);
        String r8 = r6.m;
        if (r8 == null) goto L15;
        hd0.t(r5, r8);
    L15:
        String r9 = r6.n;
        if (r9 == null) goto L18;
        hd0.z(r5, r9);
    L18:
        String r10 = r6.k;
        if (r10 == null) goto L21;
        hd0.B(r5, r10);
    L21:
        int r11 = r6.j;
        if (r11 == (-1)) goto L24;
        hd0.y(r5, r11);
    L24:
        int r12 = r6.u;
        if (r12 == (-1)) goto L27;
        hd0.A(r5, r12);
    L27:
        int r13 = r6.v;
        if (r13 == (-1)) goto L30;
        hd0.C(r5, r13);
    L30:
        int r14 = r6.F;
        if (r14 == (-1)) goto L33;
        hd0.D(r5, r14);
    L33:
        int r15 = r6.G;
        if (r15 == (-1)) goto L36;
        go2.p(r5, r15);
    L36:
        String r16 = r6.d;
        if (r16 == null) goto L45;
        String r1 = f35.a;
        String[] r17 = r16.split("-", -1);
        String r2 = r17[0];
        if (r17.length < 2) goto L41;
        String r18 = r17[1];
    L42:
        Pair r19 = Pair.create(r2, r18);
        go2.q(r5, (String) r19.first);
        Object r20 = r19.second;
        if (r20 == null) goto L45;
        go2.C(r5, (String) r20);
        goto L45
    L41:
        r18 = null;
    L45:
        float r21 = r6.y;
        if (r21 == (-1.0f)) goto L49;
        go2.o(r5, r21);
    L49:
        this.B = true;
        this.b.execute(new ws1(23, this, hd0.l(r5)));
        return;
    L11:
        r0 = 2;
        goto L12
    L48:
        go2.n(r5);
        goto L49
    }
}
