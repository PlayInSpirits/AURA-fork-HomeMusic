package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i11 {
    public static final boolean h = false;
    public final gp3 a;
    public final om0 b;
    public final pf2 c;
    public final lv4 d;
    public final xk0 e;
    public final ue1 f;
    public final ns3 g;

    static {
        h = Log.isLoggable("Engine", 2);
    }

    public i11(pf2 r10, e20 r11, li1 r12, li1 r13, li1 r14, li1 r15) {
        this.c = r10;
        sd0 r0 = new sd0(r11);
        ns3 r16 = new ns3(1);
        this.g = r16;
        monitor-enter(this);
        monitor-enter(r16);     // Catch: Throwable -> L10
        r16.q = this;     // Catch: Throwable -> L13
        monitor-exit(r16);     // Catch: Throwable -> L13
        monitor-exit(this);     // Catch: Throwable -> L10
        this.b = new om0(26);
        this.a = new gp3(12);
        this.d = new lv4(r12, r13, r14, r15, this, this);
        this.f = new ue1(r0);
        this.e = new xk0(6);
        r10.d = this;
        return;
    L13:
        th = th;
    L25:
        throw th;     // Catch: Throwable -> L18
    L20:
        th = th;
    L18:
        th = th;
    L12:
        Throwable r9 = th;
        monitor-exit(this);     // Catch: Throwable -> L18
        throw r9;
    L10:
        th = th;
        goto L12
    }

    public static void c(String r1, long r2, n11 r4) {
        StringBuilder r3 = b11.s(r1, " in ");
        r3.append(ee2.a(r2));
        r3.append("ms, key: ");
        r3.append(r4);
        Log.v("Engine", r3.toString());
    }

    public static void f(q04 r1) {
        if ((r1 instanceof o11) == false) goto L6;
        ((o11) r1).c();
        return;
    L6:
        kf2.n("Cannot release anything but an EngineResource");
    }

    public final z05 a(ii1 r25, Object r26, f42 r27, int r28, int r29, Class r30, Class r31, eq3 r32, xq0 r33, yx r34, boolean r35, boolean r36, db3 r37, boolean r38, boolean r39, boolean r40, cf4 r41, Executor r42) {
        if (h == false) goto L5;
        int r0 = ee2.b;
        long r1 = SystemClock.elapsedRealtimeNanos();
    L6:
        this.b.getClass();
        n11 r4 = new n11(r26, r27, r28, r29, r34, r30, r31, r37);
        monitor-enter(this);
        o11 r5 = b(r4, r38, r1);     // Catch: Throwable -> L14
        if (r5 != null) goto L17;
        z05 r2 = g(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r4, r1);     // Catch: Throwable -> L14
        monitor-exit(this);     // Catch: Throwable -> L14
        return r2;
    L17:
        monitor-exit(this);     // Catch: Throwable -> L14
        r41.i(r5, 5);
        return null;
    L14:
        th = move-exception;
        throw th;
    L5:
        r1 = 0;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o11 b(n11 r8, boolean r9, long r10) {
        if (r9 == false) goto L47;
        ns3 r11 = this.g;
        monitor-enter(r11);
        i5 r1 = (i5) ((HashMap) r11.o).get(r8);     // Catch: Throwable -> L15
        if (r1 != null) goto L11;
        monitor-exit(r11);
        o11 r2 = null;
    L18:
        if (r2 == null) goto L20;
        r2.a();
    L20:
        if (r2 != null) goto L22;
        pf2 r3 = this.c;
        monitor-enter(r3);
        of2 r12 = (of2) ((LinkedHashMap) r3.c).remove(r8);     // Catch: Throwable -> L48
        if (r12 != null) goto L31;
        monitor-exit(r3);
        Object r13 = null;
    L33:
        q04 r4 = (q04) r13;
        if (r4 != null) goto L37;
        i11 r6 = this;
        n11 r5 = r8;
        o11 r7 = null;
    L40:
        if (r7 == null) goto L42;
        r7.a();
        r6.g.a(r5, r7);
    L42:
        if (r7 == null) goto L47;
        if (h == false) goto L46;
        c("Loaded resource from cache", r10, r5);
    L46:
        return r7;
    L37:
        if ((r4 instanceof o11) == false) goto L39;
        r7 = (o11) r4;
        r6 = this;
        r5 = r8;
        goto L40
    L39:
        r6 = this;
        r5 = r8;
        r7 = new o11(r4, true, true, r5, r6);
        goto L40
    L31:
        r3.b -= (long) r12.b;     // Catch: Throwable -> L48
        r13 = r12.a;     // Catch: Throwable -> L48
        monitor-exit(r3);
    L48:
        th = move-exception;
        throw th;
    L22:
        if (h == false) goto L24;
        c("Loaded resource from active resources", r10, r8);
    L24:
        return r2;
    L11:
        r2 = (o11) r1.get();     // Catch: Throwable -> L15
        if (r2 != null) goto L17;
        r11.b(r1);     // Catch: Throwable -> L15
    L17:
        monitor-exit(r11);
    L15:
        th = move-exception;
        throw th;
    L47:
        return null;
    }

    public final synchronized void d(m11 r2, n11 r3, o11 r4) {
        monitor-enter(this);
        if (r4 != null) goto L22;
    L9:
        gp3 r5 = this.a;     // Catch: Throwable -> L7
        r5.getClass();     // Catch: Throwable -> L7
        if (r2.A == false) goto L13;
        Object r6 = r5.p;     // Catch: Throwable -> L7
    L12:
        HashMap r7 = (HashMap) r6;     // Catch: Throwable -> L7
        if (r2 != r7.get(r3)) goto L18;
        r7.remove(r3);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    L18:
        monitor-exit(this);
        return;
    L13:
        r6 = r5.o;     // Catch: Throwable -> L7
        goto L12
    L22:
        if (r4.n == false) goto L9;
        this.g.a(r3, r4);     // Catch: Throwable -> L7
        goto L9
    }

    public final void e(f42 r4, o11 r5) {
        ns3 r0 = this.g;
        monitor-enter(r0);
        i5 r1 = (i5) ((HashMap) r0.o).remove(r4);     // Catch: Throwable -> L14
        if (r1 == null) goto L7;
        r1.c = null;     // Catch: Throwable -> L14
        r1.clear();     // Catch: Throwable -> L14
    L7:
        monitor-exit(r0);
        if (r5.n == false) goto L12;
        q04 r3 = (q04) this.c.d(r4, r5);
        return;
    L12:
        this.e.k(r5, false);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    public final z05 g(ii1 r17, Object r18, f42 r19, int r20, int r21, Class r22, Class r23, eq3 r24, xq0 r25, Map r26, boolean r27, boolean r28, db3 r29, boolean r30, boolean r31, boolean r32, cf4 r33, Executor r34, n11 r35, long r36) {
        gp3 r15 = this.a;
        if (r32 == false) goto L6;
        Object r16 = r15.p;
    L7:
        m11 r110 = (m11) ((HashMap) r16).get(r35);
        if (r110 == null) goto L14;
        r110.a(r33, r34);
        if (h == false) goto L13;
        c("Added to existing load", r36, r35);
    L13:
        return new z05(this, r33, r110);
    L14:
        m11 r111 = (m11) ((i61) this.d.t).b();
        monitor-enter(r111);
        r111.x = r35;     // Catch: Throwable -> L45
        r111.y = r30;     // Catch: Throwable -> L45
        r111.z = r31;     // Catch: Throwable -> L45
        r111.A = r32;     // Catch: Throwable -> L45
        monitor-exit(r111);
        ue1 r13 = this.f;
        xi0 r14 = (xi0) ((i61) r13.q).b();
        int r10 = r13.o;
        r13.o = r10 + 1;
        wi0 r11 = r14.n;
        sd0 r112 = r14.q;
        r11.c = r17;
        r11.d = r18;
        r11.n = r19;
        r11.e = r20;
        r11.f = r21;
        r11.p = r25;
        r11.g = r22;
        r11.h = r112;
        r11.k = r23;
        r11.o = r24;
        r11.i = r29;
        r11.j = r26;
        r11.q = r27;
        r11.r = r28;
        r14.u = r17;
        r14.v = r19;
        r14.w = r24;
        r14.x = r35;
        r14.y = r20;
        r14.z = r21;
        r14.A = r25;
        r14.F = r32;
        r14.B = r29;
        r14.C = r111;
        r14.D = r10;
        r14.R = 1;
        r14.G = r18;
        gp3 r2 = this.a;
        r2.getClass();
        if (r111.A == false) goto L22;
        Object r3 = r2.p;
    L23:
        ((HashMap) r3).put(r35, r111);
        r111.a(r33, r34);
        monitor-enter(r111);
        r111.H = r14;     // Catch: Throwable -> L42
        int r0 = r14.h(1);     // Catch: Throwable -> L42
        if (r0 != 2) goto L28;
    L34:
        li1 r1 = r111.t;     // Catch: Throwable -> L42
    L35:
        r1.execute(r14);     // Catch: Throwable -> L42
        monitor-exit(r111);
        if (h == false) goto L41;
        c("Started new load", r36, r35);
    L41:
        return new z05(this, r33, r111);
    L28:
        if (r0 == 3) goto L34;
        if (r111.z == false) goto L33;
        r1 = r111.v;     // Catch: Throwable -> L42
        goto L35
    L33:
        r1 = r111.u;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        throw th;
    L22:
        r3 = r2.o;
    L45:
        th = move-exception;
        throw th;
    L6:
        r16 = r15.o;
        goto L7
    }
}
