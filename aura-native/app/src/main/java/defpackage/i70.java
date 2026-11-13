package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i70 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long n = SystemClock.uptimeMillis() + 10000;
    public Runnable o;
    public boolean p;
    public final /* synthetic */ nc1 q;

    public i70(nc1 nc1Var) {
        this.q = nc1Var;
    }

    public final void a(View view) {
        if (this.p) {
            return;
        }
        this.p = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.o = runnable;
        View decorView = this.q.getWindow().getDecorView();
        decorView.getClass();
        if (!this.p) {
            decorView.postOnAnimation(new a0(13, this));
        } else if (h12.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.o;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.n) {
                this.p = false;
                this.q.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.o = null;
        ff1 ff1Var = (ff1) this.q.t.getValue();
        synchronized (ff1Var.a) {
            z = ff1Var.b;
        }
        if (z) {
            this.p = false;
            this.q.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
