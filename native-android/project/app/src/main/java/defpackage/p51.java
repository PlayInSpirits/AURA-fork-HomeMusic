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

    public p51(View r2) {
        this.a = 1;
        this.c = false;
        this.b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        int r4 = this.a;
        View r0 = this.b;
        switch(r4) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        d85.a.R(r0, 1.0f);
        if (this.c == false) goto L12;
        r0.setLayerType(0, null);
        return;
    L12:
        return;
    L9:
        if (this.c == true) goto L13;
        r0.setVisibility(4);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        int r3 = this.a;
        View r0 = this.b;
        switch(r3) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        WeakHashMap r4 = j65.a;
        if (r0.hasOverlappingRendering() == true) goto L7;
        return;
    L7:
        if (r0.getLayerType() != 0) goto L15;
        this.c = true;
        r0.setLayerType(2, null);
        return;
    L15:
        return;
    L11:
        if (this.c == false) goto L16;
        r0.setVisibility(0);
        return;
    }

    public p51(View r2, boolean r3) {
        this.a = 0;
        this.c = r3;
        this.b = r2;
    }
}
