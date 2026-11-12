package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 implements a64, c93, w21 {
    public static final String B = null;
    public final na4 A;
    public final Context n;
    public final HashMap o;
    public final do0 p;
    public boolean q;
    public final Object r;
    public final qr2 s;
    public final pq3 t;
    public final rm3 u;
    public final r90 v;
    public final HashMap w;
    public Boolean x;
    public final c52 y;
    public final bq4 z;

    static {
        B = cx.i("GreedyScheduler");
    }

    public dk1(Context r3, r90 r4, z40 r5, pq3 r6, rm3 r7, bq4 r8) {
        this.o = new HashMap();
        this.r = new Object();
        this.s = new qr2(new nh0(1));
        this.w = new HashMap();
        this.n = r3;
        hg3 r9 = r4.g;
        this.p = new do0(this, r9, r4.d);
        r9.getClass();
        na4 r0 = new na4();
        r0.n = r9;
        r0.o = r7;
        r0.p = new Object();
        r0.q = new LinkedHashMap();
        this.A = r0;
        this.z = r8;
        this.y = new c52(r5);
        this.v = r4;
        this.t = r6;
        this.u = r7;
    }

    @Override // defpackage.c93
    public final void a(dd5 r7, tc0 r8) {
        rc5 r9 = q05.m(r7);
        boolean r0 = r8 instanceof rc0;
        rm3 r1 = this.u;
        na4 r2 = this.A;
        String r3 = B;
        qr2 r6 = this.s;
        if (r0 == true) goto L5;
        cx.f().b(r3, "Constraints not met: Cancelling work ID " + r9);
        gl4 r10 = r6.s(r9);
        if (r10 == null) goto L13;
        r2.i(r10);
        int r11 = ((sc0) r8).a;
        r1.getClass();
        r1.R(r10, r11);
        return;
    L13:
        return;
    L5:
        if (r6.e(r9) == true) goto L12;
        cx.f().b(r3, "Constraints met: Scheduling work ID " + r9);
        gl4 r12 = r6.w(r9);
        r2.R(r12);
        r1.getClass();
        r1.Q(r12, null);
        return;
    }

    @Override // defpackage.w21
    public final void b(rc5 r6, boolean r7) {
        gl4 r0 = this.s.s(r6);
        if (r0 == null) goto L5;
        this.A.i(r0);
    L5:
        Object r1 = this.r;
        monitor-enter(r1);
        s22 r2 = (s22) this.o.remove(r6);     // Catch: Throwable -> L21
        monitor-exit(r1);     // Catch: Throwable -> L21
        if (r2 == null) goto L11;
        cx.f().b(B, "Stopping tracking for " + r6);
        r2.f(null);
    L11:
        if (r7 == true) goto L20;
        Object r8 = this.r;
        monitor-enter(r8);
        this.w.remove(r6);     // Catch: Throwable -> L17
        monitor-exit(r8);     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        throw th;
    L20:
        return;
    L21:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.a64
    public final boolean c() {
        return false;
    }

    @Override // defpackage.a64
    public final void d(String r5) {
        if (this.x != null) goto L5;
        this.x = Boolean.valueOf(nq3.a(this.n, this.v));
    L5:
        boolean r0 = this.x.booleanValue();
        String r1 = B;
        if (r0 == true) goto L10;
        cx.f().g(r1, "Ignoring schedule request in non-main process");
        return;
    L10:
        if (this.q == true) goto L12;
        this.t.a(this);
        this.q = true;
    L12:
        cx.f().b(r1, "Cancelling work ID " + r5);
        do0 r2 = this.p;
        if (r2 == null) goto L17;
        Runnable r3 = (Runnable) r2.d.remove(r5);
        if (r3 == null) goto L17;
        ((Handler) r2.b.o).removeCallbacks(r3);
    L17:
        Iterator r6 = this.s.t(r5).iterator();
    L19:
        if (r6.hasNext() == false) goto L21;
        gl4 r4 = (gl4) r6.next();
        this.A.i(r4);
        rm3 r7 = this.u;
        r7.getClass();
        r7.R(r4, -512);
        goto L19
    }

    @Override // defpackage.a64
    public final void e(dd5... r18) {
        if (this.x != null) goto L6;
        this.x = Boolean.valueOf(nq3.a(this.n, this.v));
    L6:
        if (this.x.booleanValue() == true) goto L10;
        cx.f().g(B, "Ignoring schedule request in a secondary process");
        return;
    L10:
        if (this.q == true) goto L12;
        this.t.a(this);
        this.q = true;
    L12:
        HashSet r2 = new HashSet();
        HashSet r4 = new HashSet();
        int r5 = r18.length;
        int r7 = 0;
    L13:
        if (r7 >= r5) goto L51;
        dd5 r8 = r18[r7];
        if (this.s.e(q05.m(r8)) == true) goto L48;
        Object r9 = this.r;
        monitor-enter(r9);
        rc5 r10 = q05.m(r8);     // Catch: Throwable -> L22
        ck1 r11 = (ck1) this.w.get(r10);     // Catch: Throwable -> L22
        if (r11 != null) goto L24;
        int r12 = r8.k;     // Catch: Throwable -> L22
        this.v.d.getClass();     // Catch: Throwable -> L22
        r11 = new ck1(r12, System.currentTimeMillis());     // Catch: Throwable -> L22
        this.w.put(r10, r11);     // Catch: Throwable -> L22
    L24:
        long r13 = (((long) Math.max((r8.k - r11.a) - 5, 0)) * 30000) + r11.b;     // Catch: Throwable -> L22
        monitor-exit(r9);     // Catch: Throwable -> L22
        long r14 = Math.max(r8.a(), r13);
        this.v.d.getClass();
        long r15 = System.currentTimeMillis();
        if (r8.b != 1) goto L48;
        if (r15 >= r14) goto L37;
        do0 r16 = this.p;
        if (r16 == null) goto L48;
        hg3 r17 = r16.b;
        HashMap r19 = r16.d;
        Runnable r110 = (Runnable) r19.remove(r8.a);
        if (r110 == null) goto L35;
        ((Handler) r17.o).removeCallbacks(r110);
    L35:
        lg1 r111 = new lg1(r16, r8, false, 8);
        r19.put(r8.a, r111);
        r16.c.getClass();
        ((Handler) r17.o).postDelayed(r111, r14 - System.currentTimeMillis());
        goto L48
    L37:
        if (r8.c() == false) goto L46;
        mc0 r20 = r8.j;
        if (r20.d == false) goto L42;
        cx.f().b(B, "Ignoring " + r8 + ". Requires device idle.");
        goto L48
    L42:
        if (r20.i.isEmpty() == true) goto L44;
        cx.f().b(B, "Ignoring " + r8 + ". Requires ContentUri triggers.");
        goto L48
    L44:
        r2.add(r8);
        r4.add(r8.a);
        goto L48
    L46:
        if (this.s.e(q05.m(r8)) == true) goto L48;
        cx.f().b(B, "Starting work for " + r8.a);
        qr2 r21 = this.s;
        r21.getClass();
        gl4 r22 = r21.w(q05.m(r8));
        this.A.R(r22);
        rm3 r23 = this.u;
        r23.getClass();
        r23.Q(r22, null);
    L22:
        th = move-exception;
        throw th;
    L48:
        r7 = r7 + 1;
        goto L13
    L51:
        Object r1 = this.r;
        monitor-enter(r1);
    L61:
        th = move-exception;
        throw th;
    L54:
        if (r2.isEmpty() == true) goto L63;
        String r3 = TextUtils.join(",", r4);     // Catch: Throwable -> L61
        cx.f().b(B, "Starting tracking for " + r3);     // Catch: Throwable -> L61
        Iterator r6 = r2.iterator();     // Catch: Throwable -> L61
    L57:
        if (r6.hasNext() == false) goto L63;
        dd5 r24 = (dd5) r6.next();     // Catch: Throwable -> L61
        rc5 r25 = q05.m(r24);     // Catch: Throwable -> L61
        if (this.o.containsKey(r25) == true) goto L57;
        this.o.put(r25, lc5.a(this.y, r24, (pe0) this.z.o, this));     // Catch: Throwable -> L61
    L63:
        monitor-exit(r1);     // Catch: Throwable -> L61
    }
}
