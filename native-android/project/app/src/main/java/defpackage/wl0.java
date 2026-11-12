package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements cd2 {
    public static final gy3 r = null;
    public final bu4 a;
    public final zt4 b;
    public final gj0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final bx1 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        vw1 r0 = yw1.o;
        Object[] r1 = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        gh0.f(6, r1);
        r = yw1.i(6, r1);
    }

    public wl0(gj0 r15, int r16, int r17, int r18, int r19, int r20, boolean r21, Map r22) {
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(r20, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        k(r16, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(r17, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        k(r16, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(r17, r20, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        k(r18, r16, "maxBufferMs", "minBufferMs");
        k(r19, r17, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.a = new bu4();
        this.b = new zt4();
        this.c = r15;
        this.d = f35.Q(r16);
        this.e = f35.Q(r17);
        this.f = f35.Q(r18);
        this.g = f35.Q(r19);
        long r0 = f35.Q(1000);
        this.h = r0;
        this.i = r0;
        this.j = f35.Q(2000);
        this.k = f35.Q(r20);
        this.l = -1;
        this.m = r21;
        this.n = f35.Q(0);
        this.p = new ConcurrentHashMap();
        this.o = bx1.b(r22);
        this.q = -1;
    }

    public static void k(int r0, int r1, String r2, String r3) {
        if (r0 < r1) goto L4;
        boolean r4 = true;
    L5:
        rr2.p(r4, "%s cannot be less than %s", r2, r3);
        return;
    L4:
        r4 = false;
        goto L5
    }

    @Override // defpackage.cd2
    public final boolean a(ik3 r1, cu4 r2, mt2 r3, long r4) {
        Iterator r0 = this.p.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (((vl0) r0.next()).b == false) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // defpackage.cd2
    public final void b(ik3 r3) {
        m(r3);
        if (this.p.isEmpty() == false) goto L6;
        this.q = -1;
        return;
    }

    @Override // defpackage.cd2
    public final void c(ik3 r1) {
        m(r1);
    }

    @Override // defpackage.cd2
    public final boolean d(ik3 r1) {
        return false;
    }

    @Override // defpackage.cd2
    public final void e(ik3 r8) {
        long r0 = Thread.currentThread().getId();
        long r2 = this.q;
        if (r2 != (-1)) goto L5;
    L8:
        boolean r3 = true;
    L9:
        rr2.v("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", r3);
        this.q = r0;
        ConcurrentHashMap r1 = this.p;
        vl0 r4 = (vl0) r1.get(r8);
        if (r4 != null) goto L12;
        vl0 r5 = new vl0();
        r5.a = 1;
        r1.put(r8, r5);
    L13:
        vl0 r6 = (vl0) r1.get(r8);
        r6.getClass();
        Integer r9 = (Integer) this.o.get(r8.a);
        if (r9 != null) goto L16;
    L18:
        int r7 = this.l;
    L19:
        if (r7 != (-1)) goto L22;
        r7 = 13107200;
    L22:
        r6.c = r7;
        r6.b = false;
        return;
    L16:
        if (r9.intValue() == (-1)) goto L18;
        r7 = r9.intValue();
        goto L19
    L12:
        r4.a++;
        goto L13
    L5:
        if (r2 == r0) goto L8;
        r3 = false;
        goto L9
    }

    @Override // defpackage.cd2
    public final void f(bd2 r8, tv4 r9, t41[] r10) {
        ik3 r11 = r8.a;
        Integer r0 = (Integer) this.o.get(r11.a);
        if (r0 != null) goto L5;
    L7:
        int r1 = this.l;
    L8:
        vl0 r12 = (vl0) this.p.get(r11);
        r12.getClass();
        if (r1 != (-1)) goto L29;
        boolean r13 = l(r8);
        int r2 = r10.length;
        int r3 = 0;
        int r4 = 0;
    L11:
        int r5 = 13107200;
        if (r3 >= r2) goto L28;
        t41 r6 = r10[r3];
        if (r6 == null) goto L27;
        switch(r6.c().c) {
            case -2: goto L25;
            case -1: goto L26;
            case 0: goto L24;
            case 1: goto L26;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L19;
            default: goto L17;
        };
    L19:
        r5 = 131072;
        goto L26
    L20:
        r5 = 26214400;
        goto L26
    L21:
        if (r13 == false) goto L23;
        r5 = 19660800;
        goto L26
    L23:
        r5 = 131072000;
        goto L26
    L24:
        r5 = 144310272;
        goto L26
    L25:
        r5 = 0;
    L26:
        r4 = r4 + r5;
        goto L27
    L17:
        nz2.c();
        return;
    L27:
        r3 = r3 + 1;
        goto L11
    L28:
        r1 = f35.j(r4, 13107200, 210239488);
    L29:
        r12.c = r1;
        n();
        return;
    L5:
        if (r0.intValue() == (-1)) goto L7;
        r1 = r0.intValue();
        goto L8
    }

    @Override // defpackage.cd2
    public final r20 g(ik3 r2) {
        return new r20(this, r2);
    }

    @Override // defpackage.cd2
    public final boolean h(bd2 r15) {
        ik3 r0 = r15.a;
        long r1 = r15.e;
        vl0 r3 = (vl0) this.p.get(r0);
        r3.getClass();
        vl0 r4 = (vl0) this.p.get(r0);
        r4.getClass();
        monitor-enter(r4);
        int r5 = r4.d;     // Catch: Throwable -> L43
        monitor-exit(r4);
        int r6 = r5 * this.c.o;
        vl0 r7 = (vl0) this.p.get(r0);
        r7.getClass();
        boolean r8 = false;
        if (r6 < r7.c) goto L9;
        boolean r9 = true;
    L11:
        if (r0.equals(ik3.d) == true) goto L13;
        boolean r2 = l(r15);
        if (r2 == false) goto L17;
        long r10 = this.e;
    L18:
        if (r2 == false) goto L20;
        long r11 = this.g;
    L21:
        float r16 = r15.f;
        if (r16 <= 1.0f) goto L25;
        r10 = Math.min(f35.A(r10, r16), r11);
    L25:
        if (r1 >= Math.max(r10, 500000)) goto L38;
        if (r2 == false) goto L28;
        boolean r14 = this.m;
    L29:
        if (r14 == true) goto L31;
        if (r9 == false) goto L31;
    L32:
        r3.b = r8;
        if (r8 == true) goto L42;
        if (r1 >= 500000) goto L42;
        l93.q0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
    L42:
        return r3.b;
    L31:
        r8 = true;
        goto L32
    L28:
        r14 = false;
        goto L29
    L38:
        if (r1 >= r11) goto L40;
        if (r9 == false) goto L42;
    L40:
        r3.b = false;
        goto L42
    L20:
        r11 = this.f;
        goto L21
    L17:
        r10 = this.d;
        goto L18
    L13:
        return !r9;
    L9:
        r9 = false;
    L43:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.cd2
    public final long i(ik3 r1) {
        return this.n;
    }

    @Override // defpackage.cd2
    public final boolean j(bd2 r11) {
        boolean r0 = l(r11);
        ik3 r1 = r11.a;
        long r2 = f35.E(r11.e, r11.f);
        if (r11.g == false) goto L7;
        if (r0 == false) goto L6;
        long r4 = this.k;
    L10:
        long r6 = r11.h;
        if (r6 == (-9223372036854775807L)) goto L14;
        r4 = Math.min(r6 / 2, r4);
    L14:
        if (r4 > 0) goto L16;
        return true;
    L16:
        if (r2 < r4) goto L18;
        return true;
    L18:
        if (r0 == false) goto L20;
        boolean r3 = this.m;
    L21:
        if (r3 == true) goto L32;
        vl0 r5 = (vl0) this.p.get(r1);
        r5.getClass();
        monitor-enter(r5);
        int r7 = r5.d;     // Catch: Throwable -> L29
        monitor-exit(r5);
        int r8 = r7 * this.c.o;
        vl0 r10 = (vl0) this.p.get(r1);
        r10.getClass();
        if (r8 < r10.c) goto L32;
        return true;
    L29:
        th = move-exception;
        throw th;
    L32:
        return false;
    L20:
        r3 = false;
        goto L21
    L6:
        r4 = this.j;
        goto L10
    L7:
        if (r0 == false) goto L9;
        r4 = this.i;
        goto L10
    L9:
        r4 = this.h;
        goto L10
    }

    public final boolean l(bd2 r4) {
        cu4 r0 = r4.b;
        bn2 r3 = r0.m(r0.g(r4.c.a, this.b).c, this.a, 0).b.b;
        if (r3 == null) goto L14;
        String r5 = r3.a.getScheme();
        if (TextUtils.isEmpty(r5) == false) goto L8;
        return true;
    L8:
        if (r.contains(r5) == true) goto L15;
        return false;
    L15:
        return true;
    L14:
        return false;
    }

    public final void m(ik3 r4) {
        ConcurrentHashMap r0 = this.p;
        vl0 r1 = (vl0) r0.get(r4);
        if (r1 == null) goto L8;
        int r2 = r1.a - 1;
        r1.a = r2;
        if (r2 != 0) goto L9;
        r0.remove(r4);
        n();
        return;
    L9:
        return;
    }

    public final void n() {
        boolean r0 = this.p.isEmpty();
        gj0 r1 = this.c;
        int r2 = 0;
        if (r0 == false) goto L15;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L6:
        if (r1.n == false) goto L11;
        r1.b(0);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);
        return;
    L15:
        Iterator r3 = this.p.values().iterator();
    L17:
        if (r3.hasNext() == false) goto L19;
        r2 = r2 + ((vl0) r3.next()).c;
        goto L17
    L19:
        r1.b(r2);
    }
}
