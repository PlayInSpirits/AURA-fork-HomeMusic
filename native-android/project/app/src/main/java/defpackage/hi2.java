package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hi2 extends yg2 {
    public final float g;
    public final float h;
    public final float i;

    public hi2(View r2) {
        super(r2);
        Resources r3 = r2.getResources();
        this.g = r3.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = r3.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = r3.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b() {
        if (a() != null) goto L5;
        return;
    L5:
        AnimatorSet r0 = new AnimatorSet();
        View r6 = this.b;
        r0.playTogether(new Animator[]{ObjectAnimator.ofFloat(r6, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(r6, View.SCALE_Y, new float[]{1.0f})});
        if ((r6 instanceof ViewGroup) == false) goto L11;
        ViewGroup r7 = (ViewGroup) r6;
        int r1 = 0;
    L9:
        if (r1 >= r7.getChildCount()) goto L11;
        r0.playTogether(new Animator[]{ObjectAnimator.ofFloat(r7.getChildAt(r1), View.SCALE_Y, new float[]{1.0f})});
        r1 = r1 + 1;
    L11:
        r0.setDuration(this.e);
        r0.start();
    }

    public final void c(oo r9, int r10, AnimatorListenerAdapter r11, ValueAnimator.AnimatorUpdateListener r12) {
        if (r9.d != 0) goto L5;
        boolean r0 = true;
    L6:
        WeakHashMap r3 = j65.a;
        View r4 = this.b;
        if ((Gravity.getAbsoluteGravity(r10, r4.getLayoutDirection()) & 3) != 3) goto L9;
        boolean r5 = true;
    L10:
        float r6 = r4.getScaleX() * r4.getWidth();
        ViewGroup.LayoutParams r7 = r4.getLayoutParams();
        if ((r7 instanceof ViewGroup.MarginLayoutParams) == false) goto L16;
        ViewGroup.MarginLayoutParams r8 = (ViewGroup.MarginLayoutParams) r7;
        if (r5 == false) goto L15;
        int r13 = r8.leftMargin;
    L17:
        float r14 = r6 + r13;
        Property r15 = View.TRANSLATION_X;
        if (r5 == false) goto L20;
        r14 = -r14;
    L20:
        ObjectAnimator r2 = ObjectAnimator.ofFloat(r4, r15, new float[]{r14});
        if (r12 == null) goto L23;
        r2.addUpdateListener(r12);
    L23:
        r2.setInterpolator(new a61(1));
        r2.setDuration(yd.c(this.c, r9.c, this.d));
        r2.addListener(new gi2(this, r0, r10));
        r2.addListener(r11);
        r2.start();
        return;
    L15:
        r13 = r8.rightMargin;
        goto L17
    L16:
        r13 = 0;
        goto L17
    L9:
        r5 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public final void d(float r10, int r11, boolean r12) {
        float r13 = this.a.getInterpolation(r10);
        WeakHashMap r0 = j65.a;
        View r1 = this.b;
        int r2 = 0;
        boolean r3 = true;
        if ((Gravity.getAbsoluteGravity(r11, r1.getLayoutDirection()) & 3) != 3) goto L5;
        boolean r14 = true;
    L6:
        if (r12 == r14) goto L9;
        r3 = false;
    L9:
        int r15 = r1.getWidth();
        int r4 = r1.getHeight();
        float r5 = r15;
        if (r5 <= 0.0f) goto L39;
        float r6 = r4;
        if (r6 <= 0.0f) goto L44;
        float r7 = this.g / r5;
        float r8 = this.h / r5;
        float r9 = this.i / r6;
        if (r14 == false) goto L17;
        r5 = 0.0f;
    L17:
        r1.setPivotX(r5);
        if (r3 == true) goto L21;
        r8 = -r7;
    L21:
        float r16 = yd.a(0.0f, r8, r13);
        float r17 = r16 + 1.0f;
        r1.setScaleX(r17);
        float r18 = 1.0f - yd.a(0.0f, r9, r13);
        r1.setScaleY(r18);
        if ((r1 instanceof ViewGroup) == false) goto L43;
        ViewGroup r19 = (ViewGroup) r1;
    L25:
        if (r2 >= r19.getChildCount()) goto L45;
        View r110 = r19.getChildAt(r2);
        if (r14 == false) goto L29;
        float r20 = r110.getWidth() + (r15 - r110.getRight());
    L30:
        r110.setPivotX(r20);
        r110.setPivotY(-r110.getTop());
        if (r3 == false) goto L33;
        float r21 = 1.0f - r16;
    L35:
        if (r18 == 0.0f) goto L37;
        float r22 = (r17 / r18) * r21;
    L38:
        r110.setScaleX(r21);
        r110.setScaleY(r22);
        r2 = r2 + 1;
        goto L25
    L37:
        r22 = 1.0f;
        goto L38
    L33:
        r21 = 1.0f;
        goto L35
    L29:
        r20 = -r110.getLeft();
        goto L30
    L45:
        return;
    L43:
        return;
    L44:
        return;
    L39:
        return;
    L5:
        r14 = false;
        goto L6
    }
}
