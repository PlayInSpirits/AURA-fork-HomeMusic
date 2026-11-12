package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz3 implements zz3, Future, wq4 {
    public final int n;
    public final int o;
    public Object p;
    public pz3 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public GlideException u;

    static {
    }

    public yz3(int r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.zz3
    public final synchronized boolean a(GlideException r2) {
        monitor-enter(this);
        this.t = true;     // Catch: Throwable -> L8
        this.u = r2;     // Catch: Throwable -> L8
        notifyAll();     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wq4
    public final void b(cf4 r1) {
    }

    @Override // defpackage.wq4
    public final synchronized void c(Object r1, cx4 r2) {
        monitor-enter(this);
        monitor-exit(this);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r3) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (isDone() == true) goto L6;
        this.r = true;     // Catch: Throwable -> L8
        notifyAll();     // Catch: Throwable -> L8
        pz3 r1 = null;
        if (r3 == false) goto L13;
        pz3 r4 = this.q;     // Catch: Throwable -> L8
        this.q = null;     // Catch: Throwable -> L8
        r1 = r4;
    L13:
        monitor-exit(this);     // Catch: Throwable -> L8
        if (r1 == null) goto L16;
        r1.clear();
    L16:
        return true;
    L6:
        monitor-exit(this);     // Catch: Throwable -> L8
        return false;
    }

    @Override // defpackage.wq4
    public final void d(cf4 r2) {
        r2.m(this.n, this.o);
    }

    @Override // defpackage.wq4
    public final synchronized void e(pz3 r1) {
        monitor-enter(this);
        this.q = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.zz3
    public final synchronized void g(Object r2) {
        monitor-enter(this);
        this.s = true;     // Catch: Throwable -> L7
        this.p = r2;     // Catch: Throwable -> L7
        notifyAll();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return o(null);
    L5:
        e = move-exception;
        throw new AssertionError(e);
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final synchronized void i(Drawable r1) {
        monitor-enter(this);
        monitor-exit(this);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        monitor-enter(this);
        boolean r0 = this.r;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.r == false) goto L6;
    L13:
        boolean r0 = true;
    L14:
        monitor-exit(this);
        return r0;
    L6:
        if (this.s == true) goto L13;
        if (this.t == true) goto L13;
        r0 = false;
        goto L14
    }

    @Override // defpackage.z92
    public final void j() {
    }

    @Override // defpackage.wq4
    public final void k(Drawable r1) {
    }

    @Override // defpackage.wq4
    public final synchronized pz3 l() {
        monitor-enter(this);
        pz3 r0 = this.q;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wq4
    public final void m(Drawable r1) {
    }

    @Override // defpackage.z92
    public final void n() {
    }

    public final synchronized Object o(Long r5) {
        monitor-enter(this);
    L22:
        th = move-exception;
        throw th;
    L4:
        if (isDone() == true) goto L14;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == false) goto L14;
        throw new IllegalArgumentException("You must call this method on a background thread");     // Catch: Throwable -> L22
    L8:
        r0 = false;
    L14:
        if (this.r == true) goto L57;
        if (this.t == true) goto L55;
        if (this.s == false) goto L25;
        Object r6 = this.p;     // Catch: Throwable -> L22
        monitor-exit(this);
        return r6;
    L25:
        if (r5 != null) goto L28;
        wait(0);     // Catch: Throwable -> L22
    L36:
        if (Thread.interrupted() == true) goto L53;
        if (this.t == true) goto L51;
        if (this.r == true) goto L49;
        if (this.s == false) goto L47;
        Object r7 = this.p;     // Catch: Throwable -> L22
        monitor-exit(this);
        return r7;
    L47:
        throw new TimeoutException();     // Catch: Throwable -> L22
    L49:
        throw new CancellationException();     // Catch: Throwable -> L22
    L51:
        throw new ExecutionException(this.u);     // Catch: Throwable -> L22
    L53:
        throw new InterruptedException();     // Catch: Throwable -> L22
    L28:
        if (r5.longValue() <= 0) goto L36;
        long r1 = System.currentTimeMillis();     // Catch: Throwable -> L22
        long r2 = r5.longValue() + r1;     // Catch: Throwable -> L22
    L31:
        if (isDone() == true) goto L36;
        if (r1 >= r2) goto L36;
        wait(r2 - r1);     // Catch: Throwable -> L22
        r1 = System.currentTimeMillis();     // Catch: Throwable -> L22
        goto L31
    L55:
        throw new ExecutionException(this.u);     // Catch: Throwable -> L22
    L57:
        throw new CancellationException();     // Catch: Throwable -> L22
    }

    public final String toString() {
        String r0 = b11.q(new StringBuilder(), super.toString(), "[status=");
        monitor-enter(this);
        pz3 r2 = null;
        if (this.r == false) goto L10;
        String r1 = "CANCELLED";
    L16:
        monitor-exit(this);     // Catch: Throwable -> L7
        if (r2 == null) goto L21;
        return r0 + r1 + ", request=[" + r2 + "]]";
    L21:
        return b11.o(r0, r1, "]");
    L10:
        if (this.t == false) goto L13;
        r1 = "FAILURE";
        goto L16
    L13:
        if (this.s == false) goto L15;
        r1 = "SUCCESS";
        goto L16
    L15:
        r1 = "PENDING";
        r2 = this.q;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r1, TimeUnit r3) {
        return o(Long.valueOf(r3.toMillis(r1)));
    }
}
