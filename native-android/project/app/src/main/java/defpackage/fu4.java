package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {
    public static final eu4 d = null;
    public boolean a;
    public long b;
    public long c;

    static {
        d = new eu4();
    }

    public fu4 a() {
        this.a = false;
        return this;
    }

    public fu4 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a == true) goto L5;
        kf2.o("No deadline");
        return 0;
    L5:
        return this.b;
    }

    public fu4 d(long r2) {
        this.a = true;
        this.b = r2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted() == true) goto L13;
        if (this.a == true) goto L7;
        return;
    L7:
        if ((this.b - System.nanoTime()) <= 0) goto L10;
        return;
    L10:
        throw new InterruptedIOException("deadline reached");
    L13:
        throw new InterruptedIOException("interrupted");
    }

    public fu4 g(long r3, TimeUnit r5) {
        r5.getClass();
        if (r3 < 0) goto L6;
        this.c = r5.toNanos(r3);
        return this;
    L6:
        kf2.e(b11.k("timeout < 0: ", r3));
        return null;
    }
}
