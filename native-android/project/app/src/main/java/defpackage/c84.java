package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c84 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;

    public /* synthetic */ c84(lo r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        int r5 = this.a;
        y74 r0 = y74.q;
        y74 r1 = y74.o;
        lo r3 = this.b;
        switch(r5) {
            case 0: goto L19;
            case 1: goto L14;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        ((ClippableRoundedCornerLayout) r3.c).setVisibility(8);
        SearchView r6 = (SearchView) r3.a;
        if (r6.h() == true) goto L7;
        r6.f();
    L7:
        r6.setTransitionState(r1);
        return;
    L9:
        SearchView r7 = (SearchView) r3.a;
        SearchView r8 = (SearchView) r3.a;
        if (r7.h() == true) goto L12;
        r8.j();
    L12:
        r8.setTransitionState(r0);
        return;
    L14:
        ((ClippableRoundedCornerLayout) r3.c).setVisibility(8);
        SearchView r9 = (SearchView) r3.a;
        if (r9.h() == true) goto L17;
        r9.f();
    L17:
        r9.setTransitionState(r1);
        return;
    L19:
        SearchView r10 = (SearchView) r3.a;
        SearchView r11 = (SearchView) r3.a;
        if (r10.h() == true) goto L22;
        r11.j();
    L22:
        r11.setTransitionState(r0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r3) {
        int r4 = this.a;
        y74 r1 = y74.n;
        lo r2 = this.b;
        switch(r4) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((SearchView) r2.a).setTransitionState(r1);
        return;
    L6:
        ((ClippableRoundedCornerLayout) r2.c).setVisibility(0);
        ((SearchView) r2.a).setTransitionState(y74.p);
        return;
    L8:
        ((SearchView) r2.a).setTransitionState(r1);
        return;
    L10:
        ((ClippableRoundedCornerLayout) r2.c).setVisibility(0);
        SearchBar r5 = (SearchBar) r2.o;
        r5.n0.getClass();
        View r6 = r5.getCenterView();
        if (r6 == null) goto L14;
        r6.setAlpha(0.0f);
        return;
    }
}
