package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc implements wp3, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long u;
    public final View n;
    public boolean p;
    public boolean s;
    public long t;
    public final PriorityQueue o = new PriorityQueue(11, new n7(1));
    public final Choreographer q = Choreographer.getInstance();
    public final yn4 r = new yn4();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public sc(View view) {
        float refreshRate;
        this.n = view;
        if (u == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            u = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.s = true;
        }
    }

    @Override // defpackage.wp3
    public final void a(vp3 vp3Var) {
        this.o.add(new gq3(1, vp3Var));
        if (this.p) {
            return;
        }
        this.p = true;
        this.n.post(this);
    }

    public final boolean b() {
        yn4 yn4Var = this.r;
        long jA = yn4Var.a();
        si0.R("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.o;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((gq3) objPeek).b.c(yn4Var)) {
                priorityQueue.poll();
                z = false;
            }
            yn4Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.s) {
            this.t = j;
            this.n.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.s = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.s = false;
        this.n.removeCallbacks(this);
        this.q.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.o;
        if (!priorityQueue.isEmpty() && this.p && this.s) {
            View view = this.n;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * u) + nanos;
                yn4 yn4Var = this.r;
                yn4Var.a = z;
                yn4Var.b = Math.max(this.t, nanos) + u;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (yn4Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.q.postFrameCallback(this);
                } else {
                    this.p = false;
                }
                si0.R("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.p = false;
    }
}
