package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf extends ContentFrameLayout {
    public final /* synthetic */ bg v;

    public zf(bg r1, ud0 r2) {
        this.v = r1;
        super(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (this.v.z(r2) == false) goto L5;
        return true;
    L5:
        if (super.dispatchKeyEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L14;
        int r0 = (int) r4.getX();
        int r1 = (int) r4.getY();
        if (r0 < (-5)) goto L11;
        if (r1 < (-5)) goto L11;
        if (r0 > (getWidth() + 5)) goto L11;
        if (r1 <= (getHeight() + 5)) goto L14;
    L11:
        bg r3 = this.v;
        r3.w(r3.F(0), true);
        return true;
    L14:
        return super.onInterceptTouchEvent(r4);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
        setBackgroundDrawable(zz1.r(getContext(), r2));
    }
}
