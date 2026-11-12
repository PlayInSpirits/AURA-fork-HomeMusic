package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ci2 extends yg2 {
    public final float g;
    public final float h;
    public float i;
    public Rect j;
    public Rect k;
    public Integer l;

    public ci2(View r2) {
        super(r2);
        Resources r3 = r2.getResources();
        this.g = r3.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.h = r3.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet b(View r10) {
        AnimatorSet r0 = new AnimatorSet();
        View r9 = this.b;
        r0.playTogether(new Animator[]{ObjectAnimator.ofFloat(r9, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(r9, View.SCALE_Y, new float[]{1.0f}), ObjectAnimator.ofFloat(r9, View.TRANSLATION_X, new float[]{0.0f}), ObjectAnimator.ofFloat(r9, View.TRANSLATION_Y, new float[]{0.0f})});
        r0.addListener(new l4(12, r10));
        return r0;
    }

    public final int c() {
        if (this.l != null) goto L28;
        int[] r1 = new int[2];
        View r2 = this.b;
        r2.getLocationOnScreen(r1);
        int r4 = 0;
        if (r1[1] == 0) goto L7;
    L26:
        this.l = Integer.valueOf(r4);
        goto L28
    L7:
        if (Build.VERSION.SDK_INT < 31) goto L26;
        WindowInsets r3 = r2.getRootWindowInsets();
        if (r3 == null) goto L26;
        RoundedCorner r5 = hd0.o(r3, 0);
        if (r5 == null) goto L13;
        int r6 = go2.A(r5);
    L14:
        RoundedCorner r7 = hd0.o(r3, 1);
        if (r7 == null) goto L17;
        int r8 = go2.A(r7);
    L18:
        int r9 = Math.max(r6, r8);
        RoundedCorner r10 = hd0.o(r3, 3);
        if (r10 == null) goto L21;
        int r11 = go2.A(r10);
    L22:
        RoundedCorner r0 = hd0.o(r3, 2);
        if (r0 == null) goto L25;
        r4 = go2.A(r0);
    L25:
        r4 = Math.max(r9, Math.max(r11, r4));
        goto L26
    L21:
        r11 = 0;
        goto L22
    L17:
        r8 = 0;
        goto L18
    L13:
        r6 = 0;
    L28:
        return this.l.intValue();
    }
}
