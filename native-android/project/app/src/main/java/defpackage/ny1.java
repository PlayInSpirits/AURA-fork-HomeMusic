package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ bk n;

    public ny1(bk r1) {
        this.n = r1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent r1) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent r3, MotionEvent r4, float r5, float r6) {
        bk r2 = this.n;
        ja r7 = (ja) r2.q;
        if (r2.p == true) goto L21;
        int r8 = r2.o;
        int r1 = 2;
        if (r8 == 1) goto L8;
        if (r8 != 2) goto L21;
        if (Math.abs(r6) <= Math.abs(r5)) goto L21;
        if (r6 <= 0.0f) goto L20;
        r1 = 1;
    L20:
        r7.invoke(new o91(r1));
        goto L21
    L8:
        if (Math.abs(r5) <= Math.abs(r6)) goto L21;
        if (r5 <= 0.0f) goto L12;
        r1 = 1;
    L12:
        r7.invoke(new o91(r1));
        return true;
    L21:
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent r1) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent r1, MotionEvent r2, float r3, float r4) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent r1) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent r1) {
        return true;
    }
}
