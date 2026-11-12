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
    public final PriorityQueue o;
    public boolean p;
    public final Choreographer q;
    public final yn4 r;
    public boolean s;
    public long t;

    public sc(View r6) {
        this.n = r6;
        this.o = new PriorityQueue(11, new n7(1));
        this.q = Choreographer.getInstance();
        this.r = new yn4();
        if (u != 0) goto L12;
        Display r0 = r6.getDisplay();
        if (r6.isInEditMode() == true) goto L10;
        if (r0 == null) goto L10;
        float r1 = r0.getRefreshRate();
        if (r1 < 30.0f) goto L10;
    L11:
        u = (long) (1.0E9f / r1);
    L10:
        r1 = 60.0f;
    L12:
        r6.addOnAttachStateChangeListener(this);
        if (r6.isAttachedToWindow() == false) goto L16;
        this.s = true;
        return;
    }

    @Override // defpackage.wp3
    public final void a(vp3 r3) {
        gq3 r0 = new gq3(1, r3);
        this.o.add(r0);
        if (this.p == true) goto L6;
        this.p = true;
        this.n.post(this);
        return;
    }

    public final boolean b() {
        yn4 r0 = this.r;
        long r1 = r0.a();
        si0.R("compose:lazy:prefetch:available_time_nanos", r1);
        boolean r2 = true;
        if (r1 <= 0) goto L9;
        PriorityQueue r5 = this.o;
        Object r3 = r5.peek();
        r3.getClass();
        if (((gq3) r3).b.c(r0) == true) goto L8;
        r5.poll();
        r2 = false;
    L8:
        r0.a = false;
    L9:
        return r2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
        if (this.s == false) goto L6;
        this.t = r2;
        this.n.post(this);
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.s = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
        this.s = false;
        this.n.removeCallbacks(this);
        this.q.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue r0 = this.o;
        if (r0.isEmpty() == false) goto L5;
    L33:
        this.p = false;
        return;
    L5:
        if (this.p == false) goto L33;
        if (this.s == false) goto L33;
        View r1 = this.n;
        if (r1.getWindowVisibility() != 0) goto L33;
        long r3 = TimeUnit.MILLISECONDS.toNanos(r1.getDrawingTime());
        if (System.nanoTime() <= ((2 * u) + r3)) goto L14;
        boolean r2 = true;
    L15:
        yn4 r5 = this.r;
        r5.a = r2;
        r5.b = Math.max(this.t, r3) + u;
        boolean r4 = false;
    L17:
        if (r0.isEmpty() == true) goto L28;
        if (r4 == true) goto L28;
        if (r5.a == true) goto L21;
        r4 = b();
        goto L17
    L21:
        Trace.beginSection("compose:lazy:prefetch:idle_frame");
        r4 = b();     // Catch: Throwable -> L24
        Trace.endSection();
    L24:
        th = move-exception;
        Trace.endSection();
        throw th;
    L28:
        if (r4 == false) goto L30;
        this.q.postFrameCallback(this);
    L31:
        si0.R("compose:lazy:prefetch:available_time_nanos", 0);
        return;
    L30:
        this.p = false;
        goto L31
    L14:
        r2 = false;
        goto L15
    }
}
