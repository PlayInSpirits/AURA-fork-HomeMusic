package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w24 implements wo4, vo4 {
    public static final TreeMap v = null;
    public final int n;
    public volatile String o;
    public final long[] p;
    public final double[] q;
    public final String[] r;
    public final byte[][] s;
    public final int[] t;
    public int u;

    static {
        v = new TreeMap();
    }

    public w24(int r2) {
        this.n = r2;
        int r3 = r2 + 1;
        this.t = new int[r3];
        this.p = new long[r3];
        this.q = new double[r3];
        this.r = new String[r3];
        this.s = new byte[r3][];
    }

    public static final w24 b(int r3, String r4) {
        TreeMap r0 = v;
        monitor-enter(r0);
        Map.Entry r1 = r0.ceilingEntry(Integer.valueOf(r3));     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        r0.remove(r1.getKey());     // Catch: Throwable -> L9
        w24 r2 = (w24) r1.getValue();     // Catch: Throwable -> L9
        r2.getClass();     // Catch: Throwable -> L9
        r2.o = r4;     // Catch: Throwable -> L9
        r2.u = r3;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r2;
    L11:
        monitor-exit(r0);
        w24 r5 = new w24(r3);
        r5.o = r4;
        r5.u = r3;
        return r5;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.vo4
    public final void c(int r3, long r4) {
        this.t[r3] = 2;
        this.p[r3] = r4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.vo4
    public final void d(double r3, int r5) {
        this.t[r5] = 3;
        this.q[r5] = r3;
    }

    @Override // defpackage.vo4
    public final void e(int r2) {
        this.t[r2] = 1;
    }

    @Override // defpackage.wo4
    public final String f() {
        String r0 = this.o;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("Required value was null.");
        return null;
    }

    @Override // defpackage.vo4
    public final void h(int r3, String r4) {
        r4.getClass();
        this.t[r3] = 4;
        this.r[r3] = r4;
    }

    public final void j() {
        TreeMap r0 = v;
        monitor-enter(r0);
        r0.put(Integer.valueOf(this.n), this);     // Catch: Throwable -> L13
        if (r0.size() <= 15) goto L11;
        int r3 = r0.size() - 10;     // Catch: Throwable -> L13
        Iterator r1 = r0.descendingKeySet().iterator();     // Catch: Throwable -> L13
        r1.getClass();     // Catch: Throwable -> L13
    L7:
        int r2 = r3 - 1;     // Catch: Throwable -> L13
        if (r3 <= 0) goto L11;
        r1.next();     // Catch: Throwable -> L13
        r1.remove();     // Catch: Throwable -> L13
        r3 = r2;
    L11:
        monitor-exit(r0);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wo4
    public final void n(vo4 r7) {
        int r0 = this.u;
        if (1 > r0) goto L31;
        int r2 = 1;
    L5:
        int r3 = this.t[r2];
        if (r3 != 1) goto L8;
        r7.e(r2);
    L29:
        if (r2 == r0) goto L35;
        r2 = r2 + 1;
        goto L5
    L35:
        return;
    L8:
        if (r3 != 2) goto L10;
        r7.c(r2, this.p[r2]);
        goto L29
    L10:
        if (r3 != 3) goto L12;
        r7.d(this.q[r2], r2);
        goto L29
    L12:
        if (r3 != 4) goto L14;
        String r4 = this.r[r2];
        if (r4 == null) goto L24;
        r7.h(r2, r4);
        goto L29
    L24:
        kf2.n("Required value was null.");
        return;
    L14:
        if (r3 != 5) goto L29;
        byte[] r5 = this.s[r2];
        if (r5 == null) goto L19;
        r7.x(r2, r5);
        goto L29
    L19:
        kf2.n("Required value was null.");
        return;
    }

    @Override // defpackage.vo4
    public final void x(int r3, byte[] r4) {
        this.t[r3] = 5;
        this.s[r3] = r4;
    }
}
