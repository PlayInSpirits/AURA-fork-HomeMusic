package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final View b;
    public boolean c;

    public p51(View view) {
        this.a = 1;
        this.c = false;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                if (!this.c) {
                    view.setVisibility(4);
                }
                break;
            default:
                d85.a.R(view, 1.0f);
                if (this.c) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                if (this.c) {
                    view.setVisibility(0);
                }
                break;
            default:
                WeakHashMap weakHashMap = j65.a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.c = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
        }
    }

    public p51(View view, boolean z) {
        this.a = 0;
        this.c = z;
        this.b = view;
    }
}
