package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w20 extends ImageView {
    public Animation.AnimationListener n;
    public int o;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener r0 = this.n;
        if (r0 == null) goto L6;
        r0.onAnimationEnd(getAnimation());
        return;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener r0 = this.n;
        if (r0 == null) goto L6;
        r0.onAnimationStart(getAnimation());
        return;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        if ((getBackground() instanceof ShapeDrawable) == false) goto L6;
        ((ShapeDrawable) getBackground()).getPaint().setColor(r2);
        this.o = r2;
        return;
    }
}
