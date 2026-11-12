package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import java.lang.reflect.Array;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;

    public lo(int i) {
        this.a = new boolean[256];
        this.b = new byte[256];
        this.c = new byte[18002];
        this.d = new byte[18002];
        this.g = new int[256];
        Class cls = Integer.TYPE;
        this.k = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.l = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.m = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.h = new int[6];
        this.i = new int[257];
        this.n = new char[256];
        this.o = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        this.e = new byte[6];
        this.f = new byte[i * 100000];
    }

    public static void a(lo loVar, float f) {
        ActionMenuView actionMenuViewY;
        ((ImageButton) loVar.j).setAlpha(f);
        ((View) loVar.k).setAlpha(f);
        ((TouchObserverFrameLayout) loVar.l).setAlpha(f);
        if (!((SearchView) loVar.a).J || (actionMenuViewY = gb.y((MaterialToolbar) loVar.f)) == null) {
            return;
        }
        actionMenuViewY.setAlpha(f);
    }

    public void b(AnimatorSet animatorSet) {
        ImageButton imageButtonF = gb.F((MaterialToolbar) this.f);
        if (imageButtonF == null) {
            return;
        }
        Drawable drawable = imageButtonF.getDrawable();
        if (!((SearchView) this.a).I) {
            if (drawable instanceof dw0) {
                ((dw0) drawable).setProgress(1.0f);
            }
            if (drawable instanceof v51) {
                ((v51) drawable).a(1.0f);
                return;
            }
            return;
        }
        if (drawable instanceof dw0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new cn0(5, (dw0) drawable));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawable instanceof v51) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new cn0(6, (v51) drawable));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public AnimatorSet c(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = (MaterialToolbar) this.f;
        ImageButton imageButtonF = gb.F(materialToolbar);
        if (imageButtonF != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f(imageButtonF), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new c30(new zr2(28), new View[]{imageButtonF}));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(c30.a(imageButtonF));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewY = gb.y(materialToolbar);
        if (actionMenuViewY != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(e(actionMenuViewY), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new c30(new zr2(28), new View[]{actionMenuViewY}));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(g(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(c30.a(actionMenuViewY));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(d24.a(z, yd.b));
        return animatorSet;
    }

    public AnimatorSet d(boolean z) {
        Toolbar toolbar = (Toolbar) this.g;
        SearchView searchView = (SearchView) this.a;
        AnimatorSet animatorSet = new AnimatorSet();
        if (((AnimatorSet) this.n) == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z ? 300L : 250L);
            animatorSet2.setInterpolator(d24.a(z, yd.b));
            animatorSet.playTogether(animatorSet2, c(z));
        }
        TimeInterpolator timeInterpolator = z ? yd.a : yd.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(d24.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new c30(new nz2(1), new View[]{(View) this.b}));
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) this.c;
        ci2 ci2Var = (ci2) this.m;
        Rect rect = ci2Var.j;
        Rect rectC = ci2Var.k;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        if (rectC == null) {
            rectC = vr1.c(clippableRoundedCornerLayout, (SearchBar) this.o);
        }
        final Rect rect2 = new Rect(rectC);
        final float cornerSize = ((SearchBar) this.o).getCornerSize();
        final float fMax = Math.max(clippableRoundedCornerLayout.getCornerRadius(), ci2Var.c());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new i81(rect2), rectC, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a84
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fA = yd.a(cornerSize, fMax, valueAnimator.getAnimatedFraction());
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = (ClippableRoundedCornerLayout) this.a.c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fA);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        a61 a61Var = yd.b;
        valueAnimatorOfObject.setInterpolator(d24.a(z, a61Var));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = yd.a;
        valueAnimatorOfFloat2.setInterpolator(d24.a(z, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new c30(new nz2(1), new View[]{(ImageButton) this.j}));
        View view = (View) this.k;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) this.l;
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(d24.a(z, linearInterpolator));
        valueAnimatorOfFloat3.addUpdateListener(new c30(new nz2(1), new View[]{view, touchObserverFrameLayout}));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(d24.a(z, a61Var));
        valueAnimatorOfFloat4.addUpdateListener(c30.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(d24.a(z, a61Var));
        valueAnimatorOfFloat5.addUpdateListener(new c30(new nz2(0), new View[]{touchObserverFrameLayout}));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        Animator animatorI = i(z, false, (FrameLayout) this.d);
        Animator animatorI2 = i(z, false, toolbar);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(d24.a(z, a61Var));
        if (searchView.J) {
            valueAnimatorOfFloat6.addUpdateListener(new w51(gb.y(toolbar), gb.y((MaterialToolbar) this.f)));
        }
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animatorI, animatorI2, valueAnimatorOfFloat6, i(z, true, (EditText) this.i), i(z, true, (TextView) this.h));
        animatorSet.addListener(new d61(this, z));
        return animatorSet;
    }

    public int e(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        boolean z = vr1.z((SearchBar) this.o);
        SearchBar searchBar = (SearchBar) this.o;
        return z ? searchBar.getLeft() - marginEnd : (searchBar.getRight() - ((SearchView) this.a).getWidth()) + marginEnd;
    }

    public int f(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        SearchBar searchBar = (SearchBar) this.o;
        WeakHashMap weakHashMap = j65.a;
        int paddingStart = searchBar.getPaddingStart();
        boolean z = vr1.z((SearchBar) this.o);
        SearchBar searchBar2 = (SearchBar) this.o;
        return z ? ((searchBar2.getWidth() - ((SearchBar) this.o).getRight()) + marginStart) - paddingStart : (searchBar2.getLeft() - marginStart) + paddingStart;
    }

    public int g() {
        FrameLayout frameLayout = (FrameLayout) this.e;
        return ((((SearchBar) this.o).getBottom() + ((SearchBar) this.o).getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public AnimatorSet h(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) this.c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(c30.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(d24.a(z, yd.b));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public AnimatorSet i(boolean z, boolean z2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z2 ? f(view) : e(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new c30(new zr2(28), new View[]{view}));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(c30.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(d24.a(z, yd.b));
        return animatorSet;
    }

    public AnimatorSet j() {
        SearchBar searchBar = (SearchBar) this.o;
        SearchView searchView = (SearchView) this.a;
        if (searchBar != null) {
            if (searchView.h()) {
                searchView.f();
            }
            AnimatorSet animatorSetD = d(false);
            animatorSetD.addListener(new c84(this, 1));
            animatorSetD.start();
            return animatorSetD;
        }
        if (searchView.h()) {
            searchView.f();
        }
        AnimatorSet animatorSetH = h(false);
        animatorSetH.addListener(new c84(this, 3));
        animatorSetH.start();
        return animatorSetH;
    }

    public lo(SearchView searchView) {
        this.a = searchView;
        this.b = searchView.n;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.o;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.r;
        this.e = searchView.s;
        this.f = searchView.t;
        this.g = searchView.u;
        this.h = searchView.v;
        this.i = searchView.w;
        this.j = searchView.x;
        this.k = searchView.y;
        this.l = searchView.z;
        this.m = new ci2(clippableRoundedCornerLayout);
    }

    public lo(ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, TextView textView, TextView textView2, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ImageView imageView8, ImageView imageView9) {
        this.a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = imageView4;
        this.g = imageView5;
        this.h = imageView6;
        this.i = imageView7;
        this.j = textView;
        this.k = textView2;
        this.l = linearLayout;
        this.m = constraintLayout2;
        this.n = imageView8;
        this.o = imageView9;
    }
}
