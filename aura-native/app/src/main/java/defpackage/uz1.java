/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class uz1
implements View.OnTouchListener {
    public final Dialog n;
    public final int o;
    public final int p;
    public final int q;

    public uz1(Dialog dialog, Rect rect) {
        this.n = dialog;
        this.o = rect.left;
        this.p = rect.top;
        this.q = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object object = view.findViewById(0x1020002);
        int n16 = this.o;
        int n17 = ((View)object).getLeft() + n16;
        n16 = ((View)object).getWidth();
        int n18 = this.p;
        int n19 = ((View)object).getTop() + n18;
        if (new RectF(n17, n19, n16 + n17, (n18 = ((View)object).getHeight()) + n19).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        object = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            ((MotionEvent)object).setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            ((MotionEvent)object).setAction(0);
            float f16 = -this.q - 1;
            ((MotionEvent)object).setLocation(f16, f16);
        }
        view.performClick();
        return this.n.onTouchEvent((MotionEvent)object);
    }
}

