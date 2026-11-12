package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements View.OnTouchListener {
    public final /* synthetic */ bc2 n;

    public ac2(bc2 r1) {
        this.n = r1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r5, MotionEvent r6) {
        bc2 r4 = this.n;
        yb2 r7 = r4.E;
        Handler r0 = r4.I;
        lg r8 = r4.M;
        int r1 = r6.getAction();
        int r2 = (int) r6.getX();
        int r9 = (int) r6.getY();
        if (r1 != 0) goto L15;
        if (r8 == null) goto L15;
        if (r8.isShowing() == false) goto L15;
        if (r2 < 0) goto L15;
        if (r2 >= r8.getWidth()) goto L15;
        if (r9 < 0) goto L15;
        if (r9 >= r8.getHeight()) goto L15;
        r0.postDelayed(r7, 250);
        return false;
    L15:
        if (r1 != 1) goto L20;
        r0.removeCallbacks(r7);
        return false;
    L20:
        return false;
    }
}
