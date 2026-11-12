package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu4 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d;

    public iu4(long r2) {
        this.d = new ThreadLocal();
        f(r2);
    }

    public final synchronized long a(long r5) {
        monitor-enter(this);
        if (r5 != (-9223372036854775807L)) goto L21;
        monitor-exit(this);
        return -9223372036854775807L;
    L21:
    L12:
        th = move-exception;
        throw th;
    L8:
        if (e() == true) goto L15;
        long r0 = this.a;     // Catch: Throwable -> L12
        if (r0 != 9223372036854775806L) goto L14;
        Long r1 = (Long) this.d.get();     // Catch: Throwable -> L12
        r1.getClass();     // Catch: Throwable -> L12
        r0 = r1.longValue();     // Catch: Throwable -> L12
    L14:
        this.b = r0 - r5;     // Catch: Throwable -> L12
        notifyAll();     // Catch: Throwable -> L12
    L15:
        this.c = r5;     // Catch: Throwable -> L12
        long r6 = r5 + this.b;
        monitor-exit(this);
        return r6;
    }

    public final synchronized long b(long r11) {
        monitor-enter(this);
        if (r11 != (-9223372036854775807L)) goto L21;
        monitor-exit(this);
        return -9223372036854775807L;
    L21:
        long r3 = this.c;     // Catch: Throwable -> L14
        if (r3 == (-9223372036854775807L)) goto L13;
        String r0 = f35.a;     // Catch: Throwable -> L14
        long r1 = f35.a0(r3, 90000, 1000000, RoundingMode.DOWN);     // Catch: Throwable -> L14
        long r2 = (4294967296L + r1) / 8589934592L;     // Catch: Throwable -> L14
        long r6 = ((r2 - 1) * 8589934592L) + r11;     // Catch: Throwable -> L14
        long r4 = (r2 * 8589934592L) + r11;     // Catch: Throwable -> L14
        if (Math.abs(r6 - r1) >= Math.abs(r4 - r1)) goto L12;
        r11 = r6;
        goto L13
    L12:
        r11 = r4;
    L13:
        long r5 = r11;
        String r12 = f35.a;     // Catch: Throwable -> L14
        long r13 = a(f35.a0(r5, 1000000, 90000, RoundingMode.DOWN));     // Catch: Throwable -> L14
        monitor-exit(this);
        return r13;
    L14:
        th = move-exception;
        throw th;
    }

    public final synchronized long c(long r11) {
        monitor-enter(this);
        if (r11 != (-9223372036854775807L)) goto L21;
        monitor-exit(this);
        return -9223372036854775807L;
    L21:
        long r3 = this.c;     // Catch: Throwable -> L14
        if (r3 == (-9223372036854775807L)) goto L13;
        String r0 = f35.a;     // Catch: Throwable -> L14
        long r1 = f35.a0(r3, 90000, 1000000, RoundingMode.DOWN);     // Catch: Throwable -> L14
        long r4 = r1 / 8589934592L;     // Catch: Throwable -> L14
        long r6 = (r4 * 8589934592L) + r11;     // Catch: Throwable -> L14
        long r5 = ((r4 + 1) * 8589934592L) + r11;     // Catch: Throwable -> L14
        if (r6 < r1) goto L12;
        r11 = r6;
        goto L13
    L12:
        r11 = r5;
    L13:
        long r2 = r11;
        String r12 = f35.a;     // Catch: Throwable -> L14
        long r13 = a(f35.a0(r2, 1000000, 90000, RoundingMode.DOWN));     // Catch: Throwable -> L14
        monitor-exit(this);
        return r13;
    L14:
        th = move-exception;
        throw th;
    }

    public final synchronized long d() {
        monitor-enter(this);
        long r0 = this.a;     // Catch: Throwable -> L11
        if (r0 != Long.MAX_VALUE) goto L7;
    L8:
        r0 = -9223372036854775807L;
    L9:
        monitor-exit(this);
        return r0;
    L7:
        if (r0 != 9223372036854775806L) goto L9;
    L11:
        th = move-exception;
        throw th;
    }

    public final synchronized boolean e() {
        monitor-enter(this);
        if (this.b == (-9223372036854775807L)) goto L7;
        boolean r0 = true;
    L8:
        monitor-exit(this);
        return r0;
    L7:
        r0 = false;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized void f(long r3) {
        monitor-enter(this);
        this.a = r3;     // Catch: Throwable -> L10
        if (r3 != Long.MAX_VALUE) goto L6;
        long r4 = 0;
    L7:
        this.b = r4;     // Catch: Throwable -> L10
        this.c = -9223372036854775807L;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L6:
        r4 = -9223372036854775807L;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized void g(boolean r5, long r6) {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (this.a != 9223372036854775806L) goto L6;
        boolean r0 = true;
    L7:
        rr2.w(r0);     // Catch: Throwable -> L13
        if (e() == false) goto L11;
        monitor-exit(this);
        return;
    L11:
        if (r5 == false) goto L16;
        this.d.set(Long.valueOf(r6));     // Catch: Throwable -> L13
    L19:
        monitor-exit(this);
        return;
    L16:
        if (e() == true) goto L19;
        wait();     // Catch: Throwable -> L13
        goto L16
    L6:
        r0 = false;
        goto L7
    }
}
