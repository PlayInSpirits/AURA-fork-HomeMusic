package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t24 extends ad2 {
    public final s24 l;
    public final hd5 m;
    public final y24 n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final ne0 r;
    public final if1 s;

    public t24(s24 r1, hd5 r2, String[] r3, if1 r4) {
        r2.getClass();
        this.l = r1;
        this.m = r2;
        this.n = new y24(r3, this);
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        if (r1.m() == false) goto L9;
        td0 r5 = r1.a;
        if (r5 == null) goto L7;
        ne0 r6 = r5.n;
    L10:
        this.r = r6;
        this.s = r4;
        return;
    L7:
        h12.Q("coroutineScope");
        throw null;
    L9:
        r6 = q01.n;
        goto L10
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ac -> B:42:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e4 -> B:57:0x00e5). Please report as a decompilation issue!!! */
    public static final Object l(t24 r11, wd0 r12) {
        if ((r12 instanceof z24) == false) goto L7;
        z24 r0 = (z24) r12;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.p;
        int r2 = r0.r;
        vd0 r3 = null;
        int r4 = 0;
        if (r2 == 0) goto L20;
        if (r2 != 1) goto L18;
        int r14 = r0.o;
        t24 r5 = r0.n;
        kb4.X(r13);     // Catch: Throwable -> L14 Exception -> L16
    L43:
        if (r5.o.compareAndSet(true, false) == false) goto L51;
        r0.n = r5;     // Catch: Throwable -> L14 Exception -> L16
        r0.o = 1;     // Catch: Throwable -> L14 Exception -> L16
        r0.r = 1;     // Catch: Throwable -> L14 Exception -> L16
        r13 = xl.F(r5.l, true, r5.s, r0);     // Catch: Throwable -> L14 Exception -> L16
        xe0 r15 = xe0.n;
        if (r13 == r15) goto L47;
        r14 = 1;
        goto L43
    L47:
        return r15;
    L51:
        if (r14 == 0) goto L53;
        r5.i(r13);     // Catch: Throwable -> L14
    L53:
        r5.p.set(false);
    L57:
        if (r14 == 0) goto L63;
        if (r5.o.get() == false) goto L63;
        r11 = r5;
    L39:
        r5 = r11;
        if (r11.p.compareAndSet(false, true) == false) goto L56;
        r13 = null;
        r14 = 0;
        goto L43
    L56:
        r14 = 0;
    L63:
        return j15.a;
    L16:
        e = move-exception;
        throw new RuntimeException("Exception while computing database live data.", e);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r5.p.set(false);
        throw th;
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        kb4.X(r13);
        if (r11.q.compareAndSet(false, true) == false) goto L39;
        s12 r16 = r11.l.i();
        y24 r6 = r11.n;
        r6.getClass();
        f95 r7 = new f95(r16, r6);
        LinkedHashMap r8 = r16.c;
        jy4 r9 = r16.b;
        kd3 r10 = r9.g(r7.a);
        String[] r17 = (String[]) r10.n;
        int[] r18 = (int[]) r10.o;
        d83 r19 = new d83(r7, r18, r17);
        ReentrantLock r20 = r16.d;
        r20.lock();
    L26:
        th = move-exception;
        r20.unlock();
        throw th;
    L24:
        if (r8.containsKey(r7) == false) goto L28;
        d83 r21 = (d83) lg2.V(r7, r8);     // Catch: Throwable -> L26
    L29:
        r20.unlock();
        if (r21 == null) goto L32;
    L34:
        boolean r22 = false;
    L35:
        if (r22 == false) goto L39;
        g12.Q(new r12(r16, r3, r4));
        goto L39
    L32:
        if (r9.h.j(r18) == false) goto L34;
        r22 = true;
        goto L35
    L28:
        r21 = (d83) r8.put(r7, r19);     // Catch: Throwable -> L26
    L7:
        r0 = new z24(r11, r12);
        goto L8
    }

    @Override // defpackage.ad2
    public final void g() {
        hd5 r0 = this.m;
        r0.getClass();
        ((Set) r0.p).add(this);
        we0 r1 = this.l.h();
        vd0 r3 = null;
        x24 r2 = new x24(this, r3, 1);
        fu.G(r1, this.r, null, r2, 2);
    }

    @Override // defpackage.ad2
    public final void h() {
        hd5 r0 = this.m;
        r0.getClass();
        ((Set) r0.p).remove(this);
    }
}
