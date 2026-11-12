package defpackage;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og5 {
    public ld2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Executor f;
    public volatile qk g;
    public volatile qk h;
    public final Semaphore i;
    public final Set j;

    public og5(SignInHubActivity r4, Set r5) {
        ThreadPoolExecutor r0 = qk.u;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        r4.getApplicationContext();
        this.f = r0;
        this.i = new Semaphore(0);
        this.j = r5;
    }

    public final void a() {
        if (this.g != null) goto L5;
        return;
    L5:
        if (this.b == true) goto L7;
        this.e = true;
    L7:
        qk r0 = this.h;
        qk r2 = this.g;
        if (r0 == null) goto L11;
        r2.getClass();
        this.g = null;
        return;
    L11:
        r2.getClass();
        qk r1 = this.g;
        r1.q.set(true);
        if (r1.o.cancel(false) == false) goto L14;
        this.h = this.g;
    L14:
        this.g = null;
    }

    public final void b() {
        if (this.h == null) goto L5;
        return;
    L5:
        if (this.g == null) goto L20;
        this.g.getClass();
        qk r0 = this.g;
        Executor r4 = this.f;
        if (r0.p == 1) goto L17;
        int r5 = xa3.w(r0.p);
        if (r5 == 1) goto L15;
        if (r5 == 2) goto L13;
        kf2.o("We should never reach this state");
        return;
    L13:
        kf2.o("Cannot execute task: the task has already been executed (a task can be executed only once)");
        return;
    L15:
        kf2.o("Cannot execute task: the task is already running.");
        return;
    L17:
        r0.p = 2;
        r0.n.getClass();
        r4.execute(r0.o);
        return;
    }

    public final void c() {
        Iterator r0 = this.j.iterator();
        if (r0.hasNext() == false) goto L11;
        ((if5) r0.next()).getClass();
        throw new UnsupportedOperationException();
    L11:
        this.i.tryAcquire(0, 5, TimeUnit.SECONDS);     // Catch: InterruptedException -> L6
        return;
    L6:
        e = move-exception;
        Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
        Thread.currentThread().interrupt();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(64);
        gh0.c(this, r0);
        r0.append(" id=");
        r0.append(0);
        r0.append("}");
        return r0.toString();
    }
}
