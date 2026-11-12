package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 extends yg2 {
    public final float g;
    public final float h;

    public dh2(View r2) {
        super(r2);
        Resources r3 = r2.getResources();
        this.g = r3.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = r3.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet b() {
        AnimatorSet r0 = new AnimatorSet();
        View r8 = this.b;
        r0.playTogether(new Animator[]{ObjectAnimator.ofFloat(r8, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(r8, View.SCALE_Y, new float[]{1.0f})});
        if ((r8 instanceof ViewGroup) == false) goto L8;
        ViewGroup r9 = (ViewGroup) r8;
        int r1 = 0;
    L6:
        if (r1 >= r9.getChildCount()) goto L8;
        r0.playTogether(new Animator[]{ObjectAnimator.ofFloat(r9.getChildAt(r1), View.SCALE_Y, new float[]{1.0f})});
        r1 = r1 + 1;
    L8:
        r0.setInterpolator(new a61(1));
        return r0;
    }

    public final void c(float r7) {
        float r8 = this.a.getInterpolation(r7);
        View r0 = this.b;
        float r1 = r0.getWidth();
        float r2 = r0.getHeight();
        if (r1 > 0.0f) goto L5;
        return;
    L5:
        if (r2 <= 0.0f) goto L22;
        float r4 = this.g / r1;
        float r6 = this.h / r2;
        float r3 = 1.0f - yd.a(0.0f, r4, r8);
        float r9 = 1.0f - yd.a(0.0f, r6, r8);
        r0.setScaleX(r3);
        r0.setPivotY(r2);
        r0.setScaleY(r9);
        if ((r0 instanceof ViewGroup) == false) goto L21;
        ViewGroup r5 = (ViewGroup) r0;
        int r10 = 0;
    L11:
        if (r10 >= r5.getChildCount()) goto L23;
        View r11 = r5.getChildAt(r10);
        r11.setPivotY(-r11.getTop());
        if (r9 == 0.0f) goto L15;
        float r12 = r3 / r9;
    L16:
        r11.setScaleY(r12);
        r10 = r10 + 1;
        goto L11
    L15:
        r12 = 1.0f;
        goto L16
    L23:
        return;
    L21:
        return;
    }
}
