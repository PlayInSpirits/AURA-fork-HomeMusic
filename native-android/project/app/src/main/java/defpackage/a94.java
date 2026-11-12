package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a94 {
    public static final t84 a = null;
    public static final int b = 0;
    public static final AtomicReference[] c = null;

    static {
        int r1 = 0;
        a = new t84(new byte[0], 0, 0, false);
        int r0 = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = r0;
        AtomicReference[] r2 = new AtomicReference[r0];
    L3:
        if (r1 >= r0) goto L5;
        r2[r1] = new AtomicReference();
        r1 = r1 + 1;
        goto L3
    L5:
        c = r2;
    }

    public static final void a(t84 r6) {
        r6.getClass();
        if (r6.f == null) goto L5;
    L22:
        kf2.n("Failed requirement.");
        return;
    L5:
        if (r6.g != null) goto L22;
        if (r6.d == true) goto L24;
        AtomicReference r0 = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        t84 r1 = a;
        t84 r2 = (t84) r0.getAndSet(r1);
        if (r2 != r1) goto L13;
        return;
    L13:
        if (r2 == null) goto L15;
        int r3 = r2.c;
    L17:
        if (r3 < 65536) goto L20;
        r0.set(r2);
        return;
    L20:
        r6.f = r2;
        r6.b = 0;
        r6.c = r3 + 8192;
        r0.set(r6);
        return;
    L15:
        r3 = 0;
        goto L17
    }

    public static final t84 b() {
        int r0 = (int) (Thread.currentThread().getId() & (((long) b) - 1));
        AtomicReference r1 = c[r0];
        t84 r2 = a;
        t84 r3 = (t84) r1.getAndSet(r2);
        if (r3 != r2) goto L7;
        return new t84();
    L7:
        if (r3 != null) goto L10;
        r1.set(null);
        return new t84();
    L10:
        r1.set(r3.f);
        r3.f = null;
        r3.c = 0;
        return r3;
    }
}
