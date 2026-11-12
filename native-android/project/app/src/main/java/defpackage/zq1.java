package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 implements Closeable {
    public static final Logger s = null;
    public final ew n;
    public final tv o;
    public int p;
    public boolean q;
    public final zp1 r;

    static {
        s = Logger.getLogger(iq1.class.getName());
    }

    public zq1(ew r2) {
        r2.getClass();
        this.n = r2;
        tv r3 = new tv();
        this.o = r3;
        this.p = 16384;
        this.r = new zp1(r3);
    }

    public final synchronized void b(pb4 r6) {
        monitor-enter(this);
        r6.getClass();     // Catch: Throwable -> L27
        if (this.q == true) goto L33;
        int r0 = this.p;     // Catch: Throwable -> L27
        int r1 = r6.a;     // Catch: Throwable -> L27
        if ((r1 & 32) == 0) goto L8;
        r0 = r6.b[5];     // Catch: Throwable -> L27
    L8:
        this.p = r0;     // Catch: Throwable -> L27
        int r2 = -1;
        if ((r1 & 2) == 0) goto L11;
        int r3 = r6.b[1];     // Catch: Throwable -> L27
    L13:
        if (r3 == (-1)) goto L29;
        zp1 r4 = this.r;     // Catch: Throwable -> L27
        if ((r1 & 2) == 0) goto L17;
        r2 = r6.b[1];     // Catch: Throwable -> L27
    L17:
        r4.getClass();     // Catch: Throwable -> L27
        int r7 = Math.min(r2, 16384);     // Catch: Throwable -> L27
        int r5 = r4.d;     // Catch: Throwable -> L27
        if (r5 == r7) goto L29;
        if (r7 >= r5) goto L22;
        r4.b = Math.min(r4.b, r7);     // Catch: Throwable -> L27
    L22:
        r4.c = true;     // Catch: Throwable -> L27
        r4.d = r7;     // Catch: Throwable -> L27
        int r8 = r4.h;     // Catch: Throwable -> L27
        if (r7 >= r8) goto L29;
        if (r7 != 0) goto L26;
        pl1[] r9 = r4.e;     // Catch: Throwable -> L27
        ti.f0(0, r9.length, null, r9);     // Catch: Throwable -> L27
        r4.f = r4.e.length - 1;     // Catch: Throwable -> L27
        r4.g = 0;     // Catch: Throwable -> L27
        r4.h = 0;     // Catch: Throwable -> L27
        goto L29
    L26:
        r4.a(r8 - r7);     // Catch: Throwable -> L27
    L29:
        j(0, 0, 4, 1);     // Catch: Throwable -> L27
        this.n.flush();     // Catch: Throwable -> L27
        monitor-exit(this);
        return;
    L11:
        r3 = -1;
        goto L13
    L33:
        throw new IOException("closed");     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
        this.q = true;     // Catch: Throwable -> L7
        this.n.close();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final synchronized void f(boolean r3, int r4, tv r5, int r6) {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L11;
        j(r4, r6, 0, r3 ? 1 : 0);     // Catch: Throwable -> L12
        if (r6 <= 0) goto L8;
        ew r7 = this.n;     // Catch: Throwable -> L12
        r5.getClass();     // Catch: Throwable -> L12
        r7.L(r5, r6);     // Catch: Throwable -> L12
    L8:
        monitor-exit(this);
        return;
    L11:
        throw new IOException("closed");     // Catch: Throwable -> L12
    }

    public final synchronized void flush() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L11;
        this.n.flush();     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IOException("closed");     // Catch: Throwable -> L8
    }

    public final void j(int r3, int r4, int r5, int r6) {
        if (r5 == 8) goto L8;
        Level r0 = Level.FINE;
        Logger r1 = s;
        if (r1.isLoggable(r0) == false) goto L8;
        r1.fine(iq1.b(false, r3, r4, r5, r6));
    L8:
        if (r4 > this.p) goto L16;
        if ((Integer.MIN_VALUE & r3) != 0) goto L13;
        byte[] r2 = xe5.a;
        ew r7 = this.n;
        r7.getClass();
        r7.writeByte((r4 >>> 16) & 255);
        r7.writeByte((r4 >>> 8) & 255);
        r7.writeByte(r4 & 255);
        r7.writeByte(r5 & 255);
        r7.writeByte(r6 & 255);
        r7.writeInt(r3 & Integer.MAX_VALUE);
        return;
    L13:
        kf2.e(f34.f(r3, "reserved bit set: "));
        return;
    L16:
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.p + ": " + r4).toString());
    }

    public final synchronized void n(int r4, b21 r5, byte[] r6) {
        monitor-enter(this);
    L14:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L19;
        if (r5.n == (-1)) goto L17;
        j(0, r6.length + 8, 7, 0);     // Catch: Throwable -> L14
        this.n.writeInt(r4);     // Catch: Throwable -> L14
        this.n.writeInt(r5.n);     // Catch: Throwable -> L14
        if (r6.length == 0) goto L11;
        this.n.write(r6);     // Catch: Throwable -> L14
    L11:
        this.n.flush();     // Catch: Throwable -> L14
        monitor-exit(this);
        return;
    L17:
        throw new IllegalArgumentException("errorCode.httpCode == -1");     // Catch: Throwable -> L14
    L19:
        throw new IOException("closed");     // Catch: Throwable -> L14
    }

    public final synchronized void q(boolean r9, int r10, ArrayList r11) {
        monitor-enter(this);
    L24:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L27;
        this.r.d(r11);     // Catch: Throwable -> L24
        long r0 = this.o.o;     // Catch: Throwable -> L24
        long r2 = Math.min(this.p, r0);     // Catch: Throwable -> L24
        if (r0 != r2) goto L8;
        int r6 = 4;
    L9:
        if (r9 == false) goto L11;
        r6 = r6 | 1;     // Catch: Throwable -> L24
    L11:
        j(r10, (int) r2, 1, r6);     // Catch: Throwable -> L24
        this.n.L(this.o, r2);     // Catch: Throwable -> L24
        if (r0 <= r2) goto L22;
        long r1 = r0 - r2;     // Catch: Throwable -> L24
    L15:
        if (r1 <= 0) goto L22;
        long r7 = Math.min(this.p, r1);     // Catch: Throwable -> L24
        r1 = r1 - r7;     // Catch: Throwable -> L24
        int r12 = (int) r7;     // Catch: Throwable -> L24
        if (r1 != 0) goto L19;
        int r13 = 4;
    L20:
        j(r10, r12, 9, r13);     // Catch: Throwable -> L24
        this.n.L(this.o, r7);     // Catch: Throwable -> L24
        goto L15
    L19:
        r13 = 0;
    L22:
        monitor-exit(this);
        return;
    L8:
        r6 = 0;
        goto L9
    L27:
        throw new IOException("closed");     // Catch: Throwable -> L24
    }

    public final synchronized void s(int r4, int r5, boolean r6) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L11;
        j(0, 8, 6, r6 ? 1 : 0);     // Catch: Throwable -> L8
        this.n.writeInt(r4);     // Catch: Throwable -> L8
        this.n.writeInt(r5);     // Catch: Throwable -> L8
        this.n.flush();     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IOException("closed");     // Catch: Throwable -> L8
    }

    public final synchronized void u(int r4, b21 r5) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.q == true) goto L15;
        if (r5.n == (-1)) goto L13;
        j(r4, 4, 3, 0);     // Catch: Throwable -> L10
        this.n.writeInt(r5.n);     // Catch: Throwable -> L10
        this.n.flush();     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L13:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L10
    L15:
        throw new IOException("closed");     // Catch: Throwable -> L10
    }

    public final synchronized void v(int r5, long r6) {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.q == true) goto L21;
        if (r6 == 0) goto L19;
        if (r6 > 2147483647L) goto L19;
        Logger r0 = s;     // Catch: Throwable -> L13
        if (r0.isLoggable(Level.FINE) == false) goto L15;
        r0.fine(iq1.c(r5, 4, r6, false));     // Catch: Throwable -> L13
    L15:
        j(r5, 4, 8, 0);     // Catch: Throwable -> L13
        this.n.writeInt((int) r6);     // Catch: Throwable -> L13
        this.n.flush();     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L19:
        throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + r6).toString());     // Catch: Throwable -> L13
    L21:
        throw new IOException("closed");     // Catch: Throwable -> L13
    }
}
