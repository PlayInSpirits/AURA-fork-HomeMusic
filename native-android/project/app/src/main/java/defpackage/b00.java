package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b00 {
    public static final b00 a = null;
    public static final rp4 b = null;
    public static final rp4 c = null;
    public static final ScheduledExecutorService d = null;
    public static final rp4 e = null;
    public static final LinkedHashMap f = null;
    public static String g;
    public static long h;
    public static boolean i;

    static {
        a = new b00();
        b = new rp4(new t5(8));
        c = new rp4(new t5(9));
        d = Executors.newSingleThreadScheduledExecutor();
        e = new rp4(new t5(10));
        f = new LinkedHashMap();
        h = -1;
    }

    public static String a() {
        kd3 r0 = b();
        if (r0 != null) goto L5;
        return null;
    L5:
        return (String) r0.n;
    }

    public static kd3 b() {
        String r0 = ud3.K();
        if (r0 != null) goto L5;
    L18:
        return null;
    L5:
        if (qm4.u0(r0) == false) goto L8;
        r0 = null;
    L8:
        if (r0 == null) goto L18;
        String r2 = e35.Q();
        if (qm4.u0(r2) == false) goto L14;
        r2 = null;
    L14:
        if (r2 == null) goto L18;
        return new kd3(b11.o(r2, "\n", r0), r0);
    }

    public final synchronized void c(String r14) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (h12.c(g, r14) == true) goto L7;
    L12:
        f.clear();     // Catch: Throwable -> L10
        ArrayList r0 = ((wz) c.getValue()).a(r14);     // Catch: Throwable -> L10
        int r1 = r0.size();     // Catch: Throwable -> L10
        int r2 = 0;
    L13:
        if (r2 >= r1) goto L15;
        Object r3 = r0.get(r2);     // Catch: Throwable -> L10
        r2 = r2 + 1;     // Catch: Throwable -> L10
        vz r4 = (vz) r3;     // Catch: Throwable -> L10
        f.put(r4.f, new a00("hub:" + r4.c, r4.e, r4.d, r4.f, r4.g, true));     // Catch: Throwable -> L10
        goto L13
    L15:
        g = r14;     // Catch: Throwable -> L10
        h = n61.d();     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L7:
        if (h != n61.d()) goto L12;
        monitor-exit(this);
    }

    public final synchronized void d(long r4) {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (i == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        i = true;     // Catch: Throwable -> L11
        d.schedule(new u6(2), r4, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L11
        monitor-exit(this);
    }

    public final synchronized void e() {
        monitor-enter(this);
        kd3 r0 = b();     // Catch: Throwable -> L10
        if (r0 != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        c((String) r0.n);     // Catch: Throwable -> L10
        d(0);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
