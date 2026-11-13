package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ay1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ cy1 e;

    public ay1(cy1 cy1Var, int i, TextView textView, int i2, TextView textView2) {
        this.e = cy1Var;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mh mhVar;
        int i = this.a;
        cy1 cy1Var = this.e;
        cy1Var.n = i;
        cy1Var.l = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (mhVar = cy1Var.r) != null) {
                mhVar.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
