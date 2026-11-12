package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 implements Runnable {
    public static final ThreadLocal r = null;
    public static final ca1 s = null;
    public final ArrayList n;
    public long o;
    public long p;
    public final ArrayList q;

    static {
        r = new ThreadLocal();
        s = new ca1(18);
    }

    public yg1() {
        this.n = new ArrayList();
        this.q = new ArrayList();
    }

    public static cx3 c(RecyclerView r5, int r6, long r7) {
        int r0 = r5.s.k();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        cx3 r3 = RecyclerView.N(r5.s.j(r2));
        if (r3.c != r6) goto L10;
        if (r3.h() == true) goto L10;
        return null;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        hm2 r1 = r5.p;
        if (r7 == Long.MAX_VALUE) goto L30;
    L18:
        r5.V();     // Catch: Throwable -> L16
        cx3 r8 = r1.k(r6, r7);     // Catch: Throwable -> L16
        if (r8 != null) goto L21;
    L26:
        r5.W(false);
        Trace.endSection();
        return r8;
    L21:
        if (r8.g() == true) goto L23;
    L25:
        r1.a(r8, false);     // Catch: Throwable -> L16
        goto L26
    L23:
        if (r8.h() == true) goto L25;
        r1.h(r8.a);     // Catch: Throwable -> L16
        goto L26
    L30:
    L16:
        th = move-exception;
        r5.W(false);
        Trace.endSection();
        throw th;
    L14:
        if (ov4.a() == false) goto L18;
        Trace.beginSection("RV Prefetch forced - needed next frame");     // Catch: Throwable -> L16
        goto L18
    }

    public final void a(RecyclerView r5, int r6, int r7) {
        if (r5.F == true) goto L5;
    L14:
        b30 r4 = r5.t0;
        r4.a = r6;
        r4.b = r7;
        return;
    L5:
        if (RecyclerView.P0 == false) goto L12;
        if (this.n.contains(r5) == true) goto L12;
        kf2.o("attempting to post unregistered view!");
        return;
    L12:
        if (this.o != 0) goto L14;
        this.o = r5.getNanoTime();
        r5.post(this);
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long r17) {
        ArrayList r3 = this.n;
        int r4 = r3.size();
        boolean r5 = false;
        int r6 = 0;
        int r7 = 0;
    L3:
        if (r6 >= r4) goto L8;
        RecyclerView r8 = (RecyclerView) r3.get(r6);
        int r9 = r8.getWindowVisibility();
        b30 r10 = r8.t0;
        if (r9 != 0) goto L7;
        r10.c(r8, false);
        r7 = r7 + r10.d;
    L7:
        r6 = r6 + 1;
        goto L3
    L8:
        ArrayList r0 = this.q;
        r0.ensureCapacity(r7);
        int r11 = 0;
        int r12 = 0;
    L10:
        if (r11 >= r4) goto L26;
        RecyclerView r13 = (RecyclerView) r3.get(r11);
        if (r13.getWindowVisibility() != 0) goto L25;
        b30 r14 = r13.t0;
        int r15 = Math.abs(r14.b) + Math.abs(r14.a);
        ?? r16 = r5;
    L16:
        if (r16 >= (r14.d * 2)) goto L25;
        if (r12 < r0.size()) goto L20;
        xg1 r18 = new xg1();
        r0.add(r18);
    L21:
        int[] r19 = r14.c;
        int r110 = r19[r16 + 1];
        if (r110 > r15) goto L24;
        r5 = true;
    L24:
        r18.a = r5;
        r18.b = r15;
        r18.c = r110;
        r18.d = r13;
        r18.e = r19[r16];
        r12 = r12 + 1;
        r5 = false;
        r16 = r16 + 2;
        goto L16
    L20:
        r18 = (xg1) r0.get(r12);
    L25:
        r11 = r11 + 1;
        r5 = false;
        goto L10
    L26:
        Collections.sort(r0, s);
        int r20 = 0;
    L28:
        if (r20 >= r0.size()) goto L75;
        xg1 r21 = (xg1) r0.get(r20);
        RecyclerView r22 = r21.d;
        if (r22 == null) goto L89;
        if (r21.a == false) goto L35;
        long r23 = Long.MAX_VALUE;
    L36:
        cx3 r24 = c(r22, r21.e, r23);
        if (r24 == null) goto L74;
        if (r24.b == null) goto L74;
        if (r24.g() == false) goto L74;
        if (r24.h() == true) goto L74;
        RecyclerView r25 = (RecyclerView) r24.b.get();
        if (r25 == null) goto L74;
        if (r25.Q == true) goto L50;
    L58:
        b30 r26 = r25.t0;
        r26.c(r25, true);
        if (r26.d == 0) goto L74;
        if (r17 != Long.MAX_VALUE) goto L63;
        String r27 = "RV Nested Prefetch";
    L76:
        Trace.beginSection(r27);     // Catch: Throwable -> L71
        yw3 r28 = r25.u0;     // Catch: Throwable -> L71
        dw3 r29 = r25.z;     // Catch: Throwable -> L71
        r28.d = 1;     // Catch: Throwable -> L71
        r28.e = r29.a();     // Catch: Throwable -> L71
        r28.g = false;     // Catch: Throwable -> L71
        r28.h = false;     // Catch: Throwable -> L71
        r28.i = false;     // Catch: Throwable -> L71
        int r30 = 0;
    L66:
        if (r30 >= (r26.d * 2)) goto L69;
        c(r25, r26.c[r30], r17);     // Catch: Throwable -> L71
        r30 = r30 + 2;
        goto L66
    L69:
        Trace.endSection();
    L71:
        th = move-exception;
        Trace.endSection();
        throw th;
    L63:
        r27 = "RV Nested Prefetch forced - needed next frame";
        goto L76
    L50:
        if (r25.s.k() == 0) goto L58;
        hm2 r31 = r25.p;
        jw3 r32 = r25.c0;
        if (r32 == null) goto L54;
        r32.e();
    L54:
        mw3 r33 = r25.A;
        if (r33 == null) goto L57;
        r33.l0(r31);
        r25.A.m0(r31);
    L57:
        ((ArrayList) r31.d).clear();
        r31.f();
    L74:
        r21.a = false;
        r21.b = 0;
        r21.c = 0;
        r21.d = null;
        r21.e = 0;
        r20 = r20 + 1;
        goto L28
    L35:
        r23 = r17;
        goto L36
    L89:
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList r0 = this.n;
        Trace.beginSection("RV Prefetch");     // Catch: Throwable -> L12
        if (r0.isEmpty() == false) goto L7;
    L5:
        this.o = 0;
        Trace.endSection();
        return;
    L7:
        int r3 = r0.size();     // Catch: Throwable -> L12
        int r4 = 0;
        long r5 = 0;
    L8:
        if (r4 >= r3) goto L16;
        RecyclerView r7 = (RecyclerView) r0.get(r4);     // Catch: Throwable -> L12
        if (r7.getWindowVisibility() != 0) goto L14;
        r5 = Math.max(r7.getDrawingTime(), r5);     // Catch: Throwable -> L12
    L14:
        r4 = r4 + 1;     // Catch: Throwable -> L12
        goto L8
    L16:
        if (r5 == 0) goto L5;
        b(TimeUnit.MILLISECONDS.toNanos(r5) + this.p);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        this.o = 0;
        Trace.endSection();
        throw th;
    }
}
