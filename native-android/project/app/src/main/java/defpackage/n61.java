package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n61 {
    public static final HashMap a = null;
    public static final HashMap b = null;
    public static final HashMap c = null;
    public static long d;
    public static volatile mq e;
    public static final CopyOnWriteArrayList f = null;
    public static volatile er1 g;

    static {
        a = new HashMap();
        b = new HashMap();
        c = new HashMap();
        f = new CopyOnWriteArrayList();
    }

    public static synchronized void a(l61 r2) {
        monitor-enter(n61.class);
        if (r2 != null) goto L14;
        monitor-exit(n61.class);
        return;
    L14:
        r2.d = true;     // Catch: Throwable -> L11
        r2.e = false;     // Catch: Throwable -> L11
        c(r2.a);     // Catch: Throwable -> L11
        b();     // Catch: Throwable -> L11
        monitor-exit(n61.class);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public static void b() {
        mq r0 = e;
        if (r0 == null) goto L5;
        r0.run();
    L5:
        Iterator r1 = f.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        ((Runnable) r1.next()).run();
        goto L7
    }

    public static void c(String r11) {
        LinkedHashMap r0 = new LinkedHashMap();
        l61 r12 = (l61) a.get(r11);
    L4:
        if (r12 == null) goto L6;
        r0.merge(r12.f, Boolean.valueOf(true ^ r12.e), new j61(0));
        r12 = r12.c;
        goto L4
    L6:
        Iterator r13 = r0.entrySet().iterator();
    L8:
        if (r13.hasNext() == false) goto L20;
        Map.Entry r1 = (Map.Entry) r13.next();
        k61 r3 = (k61) r1.getKey();
        boolean r2 = ((Boolean) r1.getValue()).booleanValue();
        if (r2 == r3.f) goto L8;
        r3.f = r2;
        String r9 = r3.e;
        r3.e = UUID.randomUUID().toString();
        if (g == null) goto L8;
        er1 r4 = g;
        int r5 = r3.a;
        String r6 = r3.b;
        boolean r7 = r3.c;
        if (r2 == true) goto L19;
        if (r7 == true) goto L18;
        r7 = true;
        goto L19
    L18:
        r7 = false;
    L19:
        String r8 = r3.e;
        boolean r10 = !r9.equals(r3.d);
        r4.getClass();
        er1.p(r5, r6, r7, r8, r9, r10);
        goto L8
    }

    public static synchronized long d() {
        monitor-enter(n61.class);
        long r1 = d;     // Catch: Throwable -> L7
        monitor-exit(n61.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public static String e(int r2, String r3) {
        StringBuilder r0 = new StringBuilder();
        if (r2 != 1) goto L5;
        String r4 = "SONG";
    L13:
        r0.append(r4);
        r0.append(":");
        r0.append(r3);
        String r5 = r0.toString();
    L14:
        HashMap r6 = c;
        if (r6.containsKey(r5) == false) goto L17;
        r5 = (String) r6.get(r5);
        goto L14
    L17:
        return r5;
    L5:
        if (r2 != 2) goto L7;
        r4 = "ALBUM";
        goto L13
    L7:
        if (r2 != 3) goto L10;
        r4 = "ARTIST";
        goto L13
    L10:
        throw null;
    }

    public static synchronized boolean f(int r3, String r4, boolean r5) {
        monitor-enter(n61.class);
        if (r4 != null) goto L20;
        l61 r1 = null;
    L13:
        if (r1 == null) goto L15;
        boolean r6 = r1.b;     // Catch: Throwable -> L10
    L16:
        monitor-exit(n61.class);
        return r6;
    L15:
        r6 = ((Boolean) b.getOrDefault(e(r3, r4), Boolean.valueOf(r5))).booleanValue();     // Catch: Throwable -> L10
        goto L16
    L20:
        r1 = (l61) a.get(e(r3, r4));     // Catch: Throwable -> L10
    L6:
        if (r1 == null) goto L13;
        if (r1.e == false) goto L13;
        r1 = r1.c;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public static synchronized l61 g(int r3, String r4, boolean r5) {
        monitor-enter(n61.class);
        l61 r6 = h(r3, r4, r5, null, true);     // Catch: Throwable -> L8
        monitor-exit(n61.class);
        return r6;
    L8:
        th = move-exception;
        throw th;
    }

    public static synchronized l61 h(int r10, String r11, boolean r12, String r13, boolean r14) {
        monitor-enter(n61.class);
        if (r11 != null) goto L36;
        monitor-exit(n61.class);
        return null;
    L36:
        String r0 = e(r10, r11);     // Catch: Throwable -> L18
        HashMap r2 = a;     // Catch: Throwable -> L18
        l61 r3 = (l61) r2.get(r0);     // Catch: Throwable -> L18
    L9:
        if (r3 == null) goto L13;
        if (r3.e == false) goto L13;
        r3 = r3.c;     // Catch: Throwable -> L18
    L13:
        if (r3 != null) goto L15;
    L20:
        boolean r4 = true;
    L21:
        if (r4 == false) goto L25;
        if (r13 != null) goto L24;
        k61 r15 = new k61(r11, r10, UUID.randomUUID().toString(), r12);     // Catch: Throwable -> L18
    L26:
        l61 r5 = new l61(r0, r12, (l61) r2.get(r0), r15);     // Catch: Throwable -> L18
        r2.put(r0, r5);     // Catch: Throwable -> L18
        b();     // Catch: Throwable -> L18
        if (r14 == false) goto L32;
        if (r4 == false) goto L32;
        if (g == null) goto L32;
        er1 r16 = g;     // Catch: Throwable -> L18
        String r7 = r15.d;     // Catch: Throwable -> L18
        r16.getClass();     // Catch: Throwable -> L18
        er1.p(r10, r11, r12, r7, null, false);     // Catch: Throwable -> L18
    L32:
        monitor-exit(n61.class);
        return r5;
    L24:
        r15 = new k61(r11, r10, r13, r12);     // Catch: Throwable -> L18
        goto L26
    L25:
        r15 = r3.f;     // Catch: Throwable -> L18
        goto L26
    L15:
        if (r3.b != r12) goto L20;
        r4 = false;
    L18:
        th = move-exception;
        throw th;
    }

    public static synchronized void i(long r3, List r5) {
        monitor-enter(n61.class);
    L13:
        th = move-exception;
        throw th;
    L6:
        if (r3 == d) goto L9;
        monitor-exit(n61.class);
        return;
    L9:
        b.clear();     // Catch: Throwable -> L13
        Iterator r4 = r5.iterator();     // Catch: Throwable -> L13
    L11:
        if (r4.hasNext() == false) goto L15;
        m61 r6 = (m61) r4.next();     // Catch: Throwable -> L13
        b.putIfAbsent(e(r6.a, r6.b), Boolean.valueOf(r6.c));     // Catch: Throwable -> L13
        goto L11
    L15:
        b();     // Catch: Throwable -> L13
        monitor-exit(n61.class);
    }

    public static synchronized void j(l61 r4) {
        monitor-enter(n61.class);
        if (r4 != null) goto L7;
        monitor-exit(n61.class);
        return;
    L7:
        l61 r1 = r4;
    L8:
        if (r1 == null) goto L21;
    L19:
        th = move-exception;
        throw th;
    L10:
        if (r1.e == false) goto L13;
    L18:
        r1 = r1.c;     // Catch: Throwable -> L19
        goto L8
    L13:
        if (r1.d == true) goto L21;
        if (r1.b != r4.b) goto L21;
        r1.e = true;     // Catch: Throwable -> L19
    L21:
        c(r4.a);     // Catch: Throwable -> L19
        b();     // Catch: Throwable -> L19
        monitor-exit(n61.class);
    }

    public static synchronized void k(int r3, String r4, boolean r5) {
        monitor-enter(n61.class);
        if (r4 != null) goto L22;
        monitor-exit(n61.class);
        return;
    L22:
        l61 r1 = (l61) a.get(e(r3, r4));     // Catch: Throwable -> L14
    L8:
        if (r1 == null) goto L17;
        if (r1.d == true) goto L17;
        if (r1.b == r5) goto L16;
        r1.e = true;     // Catch: Throwable -> L14
    L16:
        r1 = r1.c;     // Catch: Throwable -> L14
    L17:
        c(e(r3, r4));     // Catch: Throwable -> L14
        b();     // Catch: Throwable -> L14
        monitor-exit(n61.class);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    public static synchronized void l(l61 r2) {
        monitor-enter(n61.class);
        if (r2 != null) goto L16;
    L14:
        monitor-exit(n61.class);
        return;
    L16:
    L11:
        th = move-exception;
        throw th;
    L6:
        if (r2.d == true) goto L14;
        r2.e = true;     // Catch: Throwable -> L11
        c(r2.a);     // Catch: Throwable -> L11
        b();     // Catch: Throwable -> L11
        monitor-exit(n61.class);
    }
}
