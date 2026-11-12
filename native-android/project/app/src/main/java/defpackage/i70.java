package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i70 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long n;
    public Runnable o;
    public boolean p;
    public final /* synthetic */ nc1 q;

    public i70(nc1 r5) {
        this.q = r5;
        this.n = SystemClock.uptimeMillis() + 10000;
    }

    public final void a(View r2) {
        if (this.p == true) goto L6;
        this.p = true;
        r2.getViewTreeObserver().addOnDrawListener(this);
        return;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        r3.getClass();
        this.o = r3;
        View r4 = this.q.getWindow().getDecorView();
        r4.getClass();
        if (this.p == true) goto L5;
        r4.postOnAnimation(new a0(13, this));
        return;
    L5:
        if (h12.c(Looper.myLooper(), Looper.getMainLooper()) == false) goto L8;
        r4.invalidate();
        return;
    L8:
        r4.postInvalidate();
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable r0 = this.o;
        if (r0 == null) goto L15;
        r0.run();
        this.o = null;
        ff1 r1 = (ff1) this.q.t.getValue();
        Object r2 = r1.a;
        monitor-enter(r2);
        boolean r3 = r1.b;     // Catch: Throwable -> L11
        monitor-exit(r2);
        if (r3 == false) goto L20;
        this.p = false;
        this.q.getWindow().getDecorView().post(this);
        return;
    L20:
        return;
    L11:
        th = move-exception;
        throw th;
    L15:
        if (SystemClock.uptimeMillis() <= this.n) goto L21;
        this.p = false;
        this.q.getWindow().getDecorView().post(this);
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
