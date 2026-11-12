package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 extends n6 {
    public static final y82 A = null;
    public rw1 y;
    public f60 z;

    static {
        A = new y82(g60.class);
    }

    public g60(yw1 r5, zq0 r6) {
        int r0 = r5.size();
        Object r1 = null;
        this.u = null;
        this.v = r0;
        this.y = r5;
        this.z = new f60(this, r6);
        gq0 r7 = gq0.n;
        Objects.requireNonNull(this.y);
        if (this.y.isEmpty() == false) goto L11;
        f60 r4 = this.z;
        if (r4 != null) goto L19;
        return;
    L19:
        r4.p.getClass();     // Catch: RejectedExecutionException -> L8
        r4.run();     // Catch: RejectedExecutionException -> L8
        return;
    L8:
        e = move-exception;
        r4.q.m(e);
        return;
    L11:
        k6 r8 = new k6(0, this, r1);
        o15 r2 = this.y.h();
    L13:
        if (r2.hasNext() == false) goto L27;
        ic2 r3 = (ic2) r2.next();
        if (r3.isDone() == true) goto L16;
        r3.f(r8, r7);
        goto L13
    L16:
        q(null);
        goto L13
    }

    @Override // defpackage.u0
    public final void b() {
        rw1 r0 = this.y;
        this.y = null;
        this.z = null;
        boolean r1 = this.n instanceof f0;
        if (r0 == null) goto L5;
        boolean r2 = true;
    L7:
        if ((r1 & r2) == false) goto L12;
        boolean r3 = p();
        o15 r4 = r0.h();
    L10:
        if (r4.hasNext() == false) goto L14;
        ((Future) r4.next()).cancel(r3);
        goto L10
    L14:
        return;
    L12:
        return;
    L5:
        r2 = false;
        goto L7
    }

    @Override // defpackage.u0
    public final void i() {
        f60 r0 = this.z;
        if (r0 == null) goto L6;
        r0.c();
        return;
    }

    @Override // defpackage.u0
    public final String j() {
        rw1 r0 = this.y;
        if (r0 == null) goto L7;
        return "futures=" + r0;
    L7:
        return super.j();
    }

    public final void q(rw1 r6) {
        int r0 = n6.w.l(this);
        if (r0 < 0) goto L5;
        boolean r3 = true;
    L6:
        rr2.v("Less than 0 remaining futures", r3);
        if (r0 != 0) goto L53;
        if (r6 == null) goto L29;
        o15 r7 = r6.h();
    L11:
        if (r7.hasNext() == false) goto L29;
        Future r1 = (Future) r7.next();
        if (r1.isCancelled() == true) goto L11;
        boolean r4 = false;
    L39:
        r1.get();     // Catch: Throwable -> L22 InterruptedException -> L28
    L16:
        if (r4 == false) goto L11;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L18 ExecutionException -> L20
    L20:
        e = move-exception;
        r(e.getCause());
    L18:
        th = move-exception;
        r(th);
    L28:
        r4 = true;
    L22:
        th = move-exception;
        if (r4 == false) goto L25;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L18 ExecutionException -> L20
    L25:
        throw th;     // Catch: Throwable -> L18 ExecutionException -> L20
    L29:
        this.u = null;
        f60 r2 = this.z;
        if (r2 != null) goto L37;
    L35:
        this.y = null;
        return;
    L37:
        r2.p.getClass();     // Catch: RejectedExecutionException -> L33
        r2.run();     // Catch: RejectedExecutionException -> L33
    L33:
        e = move-exception;
        r2.q.m(e);
        goto L35
    L53:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public final void r(Throwable r3) {
        r3.getClass();
        if ((r3 instanceof Error) == false) goto L6;
        A.a().log(Level.SEVERE, "Input Future failed with Error", r3);
        return;
    }
}
