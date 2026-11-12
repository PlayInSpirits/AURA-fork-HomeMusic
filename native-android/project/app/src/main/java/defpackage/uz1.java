package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 implements View.OnTouchListener {
    public final Dialog n;
    public final int o;
    public final int p;
    public final int q;

    public uz1(Dialog r2, Rect r3) {
        this.n = r2;
        this.o = r3.left;
        this.p = r3.top;
        this.q = ViewConfiguration.get(r2.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        View r0 = r6.findViewById(R.id.content);
        int r2 = r0.getLeft() + this.o;
        int r1 = r0.getWidth() + r2;
        int r4 = r0.getTop() + this.p;
        if (new RectF(r2, r4, r1, r0.getHeight() + r4).contains(r7.getX(), r7.getY()) == false) goto L5;
        return false;
    L5:
        MotionEvent r3 = MotionEvent.obtain(r7);
        if (r7.getAction() != 1) goto L9;
        r3.setAction(4);
    L9:
        if (Build.VERSION.SDK_INT >= 28) goto L11;
        r3.setAction(0);
        float r8 = (-this.q) - 1;
        r3.setLocation(r8, r8);
    L11:
        r6.performClick();
        return this.n.onTouchEvent(r3);
    }
}
