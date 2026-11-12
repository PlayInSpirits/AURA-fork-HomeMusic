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

    public og5(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = qk.u;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        signInHubActivity.getApplicationContext();
        this.f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.b) {
                this.e = true;
            }
            qk qkVar = this.h;
            qk qkVar2 = this.g;
            if (qkVar != null) {
                qkVar2.getClass();
                this.g = null;
                return;
            }
            qkVar2.getClass();
            qk qkVar3 = this.g;
            qkVar3.q.set(true);
            if (qkVar3.o.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        qk qkVar = this.g;
        Executor executor = this.f;
        if (qkVar.p == 1) {
            qkVar.p = 2;
            qkVar.n.getClass();
            executor.execute(qkVar.o);
            return;
        }
        int iW = xa3.w(qkVar.p);
        if (iW == 1) {
            kf2.o("Cannot execute task: the task is already running.");
        } else if (iW != 2) {
            kf2.o("We should never reach this state");
        } else {
            kf2.o("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void c() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((if5) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        gh0.c(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
