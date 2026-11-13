package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c84 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;

    public /* synthetic */ c84(lo loVar, int i) {
        this.a = i;
        this.b = loVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        y74 y74Var = y74.q;
        y74 y74Var2 = y74.o;
        lo loVar = this.b;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) loVar.a;
                SearchView searchView2 = (SearchView) loVar.a;
                if (!searchView.h()) {
                    searchView2.j();
                }
                searchView2.setTransitionState(y74Var);
                break;
            case 1:
                ((ClippableRoundedCornerLayout) loVar.c).setVisibility(8);
                SearchView searchView3 = (SearchView) loVar.a;
                if (!searchView3.h()) {
                    searchView3.f();
                }
                searchView3.setTransitionState(y74Var2);
                break;
            case 2:
                SearchView searchView4 = (SearchView) loVar.a;
                SearchView searchView5 = (SearchView) loVar.a;
                if (!searchView4.h()) {
                    searchView5.j();
                }
                searchView5.setTransitionState(y74Var);
                break;
            default:
                ((ClippableRoundedCornerLayout) loVar.c).setVisibility(8);
                SearchView searchView6 = (SearchView) loVar.a;
                if (!searchView6.h()) {
                    searchView6.f();
                }
                searchView6.setTransitionState(y74Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        y74 y74Var = y74.n;
        lo loVar = this.b;
        switch (i) {
            case 0:
                ((ClippableRoundedCornerLayout) loVar.c).setVisibility(0);
                SearchBar searchBar = (SearchBar) loVar.o;
                searchBar.n0.getClass();
                View centerView = searchBar.getCenterView();
                if (centerView != null) {
                    centerView.setAlpha(0.0f);
                    break;
                }
                break;
            case 1:
                ((SearchView) loVar.a).setTransitionState(y74Var);
                break;
            case 2:
                ((ClippableRoundedCornerLayout) loVar.c).setVisibility(0);
                ((SearchView) loVar.a).setTransitionState(y74.p);
                break;
            default:
                ((SearchView) loVar.a).setTransitionState(y74Var);
                break;
        }
    }
}
