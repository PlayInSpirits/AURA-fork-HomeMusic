package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public tu(int r7, int r8, float[] r9, float[] r10) {
        this.a = r7;
        if ((((long) r9.length) * 2) != (((long) r10.length) * 3)) goto L5;
        boolean r11 = true;
    L6:
        rr2.l(r11);
        this.c = r9;
        this.d = r10;
        this.b = r8;
        return;
    L5:
        r11 = false;
        goto L6
    }

    public synchronized void a(long r5, Object r7) {
        monitor-enter(this);
        int r0 = this.b;     // Catch: Throwable -> L11
        if (r0 > 0) goto L6;
    L8:
        c();     // Catch: Throwable -> L11
        int r1 = this.a;     // Catch: Throwable -> L11
        int r2 = this.b;     // Catch: Throwable -> L11
        Object[] r3 = (Object[]) this.d;     // Catch: Throwable -> L11
        int r4 = (r1 + r2) % r3.length;     // Catch: Throwable -> L11
        ((long[]) this.c)[r4] = r5;     // Catch: Throwable -> L11
        r3[r4] = r7;     // Catch: Throwable -> L11
        this.b = r2 + 1;     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L6:
        if (r5 > ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) goto L8;
        b();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void b() {
        monitor-enter(this);
        this.a = 0;     // Catch: Throwable -> L7
        this.b = 0;     // Catch: Throwable -> L7
        Arrays.fill((Object[]) this.d, null);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void c() {
        int r0 = ((Object[]) this.d).length;
        if (this.b >= r0) goto L5;
        return;
    L5:
        int r1 = r0 * 2;
        long[] r2 = new long[r1];
        Object[] r3 = new Object[r1];
        int r4 = this.a;
        int r5 = r0 - r4;
        System.arraycopy((long[]) this.c, r4, r2, 0, r5);
        System.arraycopy((Object[]) this.d, this.a, r3, 0, r5);
        int r6 = this.a;
        if (r6 <= 0) goto L8;
        System.arraycopy((long[]) this.c, 0, r2, r5, r6);
        System.arraycopy((Object[]) this.d, 0, r3, r5, this.a);
    L8:
        this.c = r2;
        this.d = r3;
        this.a = 0;
    }

    public Object d(boolean r8, long r9) {
        Object r0 = null;
        long r1 = Long.MAX_VALUE;
    L4:
        if (this.b <= 0) goto L12;
        long r3 = r9 - ((long[]) this.c)[this.a];
        if (r3 >= 0) goto L11;
        if (r8 == true) goto L12;
        if ((-r3) >= r1) goto L12;
    L11:
        r0 = g();
        r1 = r3;
    L12:
        return r0;
    }

    public synchronized Object e() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.b != 0) goto L6;
        Object r0 = null;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = g();     // Catch: Throwable -> L9
        goto L7
    }

    public synchronized Object f(long r2) {
        monitor-enter(this);
        Object r3 = d(true, r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r3;
    L7:
        th = move-exception;
        throw th;
    }

    public Object g() {
        if (this.b <= 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        Object[] r1 = (Object[]) this.d;
        int r2 = this.a;
        Object r3 = r1[r2];
        r1[r2] = null;
        this.a = (r2 + 1) % r1.length;
        this.b--;
        return r3;
    L5:
        r0 = false;
        goto L6
    }

    public synchronized int h() {
        monitor-enter(this);
        int r0 = this.b;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public tu() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public tu(int r1, int r2) {
        switch(r2) {
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        this.c = new qv4[r1];
        this.b = 0;
        return;
    L5:
        this.b = -1;
        this.a = r1;
    }
}
