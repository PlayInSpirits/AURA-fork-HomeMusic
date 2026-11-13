package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zf extends ContentFrameLayout {
    public final /* synthetic */ bg v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(bg bgVar, ud0 ud0Var) {
        super(ud0Var);
        this.v = bgVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.v.z(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                bg bgVar = this.v;
                bgVar.w(bgVar.F(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(zz1.r(getContext(), i));
    }
}
