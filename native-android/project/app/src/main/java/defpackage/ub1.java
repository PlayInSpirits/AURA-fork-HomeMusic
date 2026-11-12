package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vb1 o;

    public /* synthetic */ ub1(vb1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        vb1 r11 = this.o;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        r11.a();
        View r1 = r11.q;
        if (r1.isEnabled() == true) goto L7;
        return;
    L7:
        if (r1.isLongClickable() == false) goto L10;
        return;
    L10:
        if (r11.c() == false) goto L20;
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        long r3 = SystemClock.uptimeMillis();
        MotionEvent r2 = MotionEvent.obtain(r3, r3, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r2);
        r2.recycle();
        r11.t = true;
        return;
    L20:
        return;
    L14:
        ViewParent r12 = r11.q.getParent();
        if (r12 == null) goto L21;
        r12.requestDisallowInterceptTouchEvent(true);
        return;
    }
}
