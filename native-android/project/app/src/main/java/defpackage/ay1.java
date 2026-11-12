package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ cy1 e;

    public ay1(cy1 r1, int r2, TextView r3, int r4, TextView r5) {
        this.e = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        int r5 = this.a;
        cy1 r0 = this.e;
        r0.n = r5;
        r0.l = null;
        TextView r1 = this.b;
        if (r1 == null) goto L9;
        r1.setVisibility(4);
        if (this.c != 1) goto L9;
        mh r2 = r0.r;
        if (r2 == null) goto L9;
        r2.setText(null);
    L9:
        TextView r3 = this.d;
        if (r3 == null) goto L13;
        r3.setTranslationY(0.0f);
        r3.setAlpha(1.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        TextView r0 = this.d;
        if (r0 == null) goto L6;
        r0.setVisibility(0);
        r0.setAlpha(0.0f);
        return;
    }
}
