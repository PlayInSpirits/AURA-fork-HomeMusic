package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import defpackage.a65;
import defpackage.ah2;
import defpackage.av4;
import defpackage.ce0;
import defpackage.ci2;
import defpackage.cn0;
import defpackage.d24;
import defpackage.de0;
import defpackage.dw0;
import defpackage.g12;
import defpackage.gb;
import defpackage.ht3;
import defpackage.j65;
import defpackage.ji2;
import defpackage.lo;
import defpackage.m74;
import defpackage.n74;
import defpackage.nz0;
import defpackage.o74;
import defpackage.oo;
import defpackage.p74;
import defpackage.pb5;
import defpackage.pn1;
import defpackage.qp4;
import defpackage.s7;
import defpackage.su3;
import defpackage.uc5;
import defpackage.v51;
import defpackage.vr1;
import defpackage.w74;
import defpackage.xa3;
import defpackage.y74;
import defpackage.yd;
import defpackage.zg2;
import defpackage.zl2;
import defpackage.zz1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements ce0, zg2 {
    public static final /* synthetic */ int Q = 0;
    public final boolean A;
    public final lo B;
    public final qp4 C;
    public final boolean D;
    public final nz0 E;
    public final LinkedHashSet F;
    public SearchBar G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int L;
    public boolean M;
    public boolean N;
    public y74 O;
    public HashMap P;
    public final View n;
    public final ClippableRoundedCornerLayout o;
    public final View p;
    public final View q;
    public final FrameLayout r;
    public final FrameLayout s;
    public final MaterialToolbar t;
    public final Toolbar u;
    public final TextView v;
    public final EditText w;
    public final ImageButton x;
    public final View y;
    public final TouchObserverFrameLayout z;

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.C = new qp4(this, this);
        this.F = new LinkedHashSet();
        this.H = 16;
        this.O = y74.o;
        Context context2 = getContext();
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.O, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.L = typedArrayD.getColor(11, 0);
        int resourceId = typedArrayD.getResourceId(16, -1);
        int resourceId2 = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(3);
        String string2 = typedArrayD.getString(4);
        String string3 = typedArrayD.getString(24);
        boolean z = typedArrayD.getBoolean(27, false);
        this.I = typedArrayD.getBoolean(8, true);
        this.J = typedArrayD.getBoolean(7, true);
        boolean z2 = typedArrayD.getBoolean(17, false);
        this.K = typedArrayD.getBoolean(9, true);
        this.D = typedArrayD.getBoolean(10, true);
        typedArrayD.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.A = true;
        this.n = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.o = clippableRoundedCornerLayout;
        this.p = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.q = viewFindViewById;
        this.r = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.s = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.t = materialToolbar;
        this.u = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.v = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.w = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.x = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.y = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.z = touchObserverFrameLayout;
        this.B = new lo(this);
        this.E = new nz0(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new p74());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new n74(this, 2));
            if (z) {
                dw0 dw0Var = new dw0(getContext());
                int iT = g12.t(this, R.attr.colorOnSurface);
                Paint paint = dw0Var.a;
                if (iT != paint.getColor()) {
                    paint.setColor(iT);
                    dw0Var.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(dw0Var);
            }
        }
        imageButton.setOnClickListener(new n74(this, 0));
        editText.addTextChangedListener(new pn1(4, this));
        touchObserverFrameLayout.setOnTouchListener(new s7(9, this));
        vr1.k(materialToolbar, new o74(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        zl2 zl2Var = new zl2(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, marginLayoutParams);
        WeakHashMap weakHashMap = j65.a;
        a65.c(viewFindViewById2, zl2Var);
        setUpStatusBarSpacer(getStatusBarHeight());
        a65.c(viewFindViewById, new o74(this));
    }

    public static /* synthetic */ void e(SearchView searchView, pb5 pb5Var) {
        int iD = pb5Var.d();
        searchView.setUpStatusBarSpacer(iD);
        if (searchView.N) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(iD > 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.G;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        View view;
        nz0 nz0Var = this.E;
        if (nz0Var == null || (view = this.p) == null) {
            return;
        }
        view.setBackgroundColor(nz0Var.b(this.L, f));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.r;
            frameLayout.addView(layoutInflaterFrom.inflate(i, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i) {
        View view = this.q;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    @Override // defpackage.zg2
    public final void a() {
        if (i()) {
            return;
        }
        lo loVar = this.B;
        ci2 ci2Var = (ci2) loVar.m;
        oo ooVar = ci2Var.f;
        ci2Var.f = null;
        if (Build.VERSION.SDK_INT < 34 || this.G == null || ooVar == null) {
            g();
            return;
        }
        long totalDuration = loVar.j().getTotalDuration();
        ci2 ci2Var2 = (ci2) loVar.m;
        AnimatorSet animatorSetB = ci2Var2.b((SearchBar) loVar.o);
        animatorSetB.setDuration(totalDuration);
        animatorSetB.start();
        ci2Var2.i = 0.0f;
        ci2Var2.j = null;
        ci2Var2.k = null;
        if (((AnimatorSet) loVar.n) != null) {
            loVar.c(false).start();
            ((AnimatorSet) loVar.n).resume();
        }
        loVar.n = null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.A) {
            this.z.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // defpackage.zg2
    public final void b(oo ooVar) {
        if (i() || this.G == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        lo loVar = this.B;
        SearchView searchView = (SearchView) loVar.a;
        float f = ooVar.c;
        if (f <= 0.0f) {
            return;
        }
        ci2 ci2Var = (ci2) loVar.m;
        SearchBar searchBar = (SearchBar) loVar.o;
        float cornerSize = searchBar.getCornerSize();
        if (ci2Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        oo ooVar2 = ci2Var.f;
        ci2Var.f = ooVar;
        if (ooVar2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = ooVar.d == 0;
            float f2 = ooVar.b;
            float f3 = ci2Var.g;
            View view = ci2Var.b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float fA = yd.a(1.0f, 0.9f, f);
                float fA2 = yd.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f3), f) * (z ? 1 : -1);
                float fMin = Math.min(Math.max(0.0f, ((height - (fA * height)) / 2.0f) - f3), ci2Var.h);
                float f4 = f2 - ci2Var.i;
                float fA3 = yd.a(0.0f, fMin, Math.abs(f4) / height) * Math.signum(f4);
                view.setScaleX(fA);
                view.setScaleY(fA);
                view.setTranslationX(fA2);
                view.setTranslationY(fA3);
                if (view instanceof ClippableRoundedCornerLayout) {
                    ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                    clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), yd.a(ci2Var.c(), cornerSize, f));
                }
            }
        }
        AnimatorSet animatorSet = (AnimatorSet) loVar.n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        if (searchView.h()) {
            searchView.f();
        }
        if (searchView.I) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            loVar.b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(d24.a(false, yd.b));
            loVar.n = animatorSet2;
            animatorSet2.start();
            ((AnimatorSet) loVar.n).pause();
        }
    }

    @Override // defpackage.zg2
    public final void c(oo ooVar) {
        if (i() || this.G == null) {
            return;
        }
        lo loVar = this.B;
        ci2 ci2Var = (ci2) loVar.m;
        SearchBar searchBar = (SearchBar) loVar.o;
        ci2Var.f = ooVar;
        float f = ooVar.b;
        View view = ci2Var.b;
        ci2Var.j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar != null) {
            ci2Var.k = vr1.c(view, searchBar);
        }
        ci2Var.i = f;
    }

    @Override // defpackage.zg2
    public final void d() {
        if (i() || this.G == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        lo loVar = this.B;
        ci2 ci2Var = (ci2) loVar.m;
        SearchBar searchBar = (SearchBar) loVar.o;
        if (ci2Var.a() != null) {
            AnimatorSet animatorSetB = ci2Var.b(searchBar);
            View view = ci2Var.b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), ci2Var.c());
                valueAnimatorOfFloat.addUpdateListener(new cn0(4, clippableRoundedCornerLayout));
                animatorSetB.playTogether(valueAnimatorOfFloat);
            }
            animatorSetB.setDuration(ci2Var.e);
            animatorSetB.start();
            ci2Var.i = 0.0f;
            ci2Var.j = null;
            ci2Var.k = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) loVar.n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        loVar.n = null;
    }

    public final void f() {
        this.w.post(new m74(this, 0));
    }

    public final void g() {
        if (this.O.equals(y74.o) || this.O.equals(y74.n)) {
            return;
        }
        this.B.j();
    }

    public ci2 getBackHelper() {
        return (ci2) this.B.m;
    }

    @Override // defpackage.ce0
    public de0 getBehavior() {
        return new Behavior();
    }

    public y74 getCurrentTransitionState() {
        return this.O;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.w;
    }

    public CharSequence getHint() {
        return this.w.getHint();
    }

    public TextView getSearchPrefix() {
        return this.v;
    }

    public CharSequence getSearchPrefixText() {
        return this.v.getText();
    }

    public int getSoftInputMode() {
        return this.H;
    }

    public Editable getText() {
        return this.w.getText();
    }

    public Toolbar getToolbar() {
        return this.t;
    }

    public final boolean h() {
        return this.H == 48;
    }

    public final boolean i() {
        return this.O.equals(y74.o) || this.O.equals(y74.n);
    }

    public final void j() {
        if (this.K) {
            this.w.postDelayed(new m74(this, 1), 100L);
        }
    }

    public final void k(y74 y74Var, boolean z) {
        ah2 ah2Var;
        if (this.O.equals(y74Var)) {
            return;
        }
        y74 y74Var2 = y74.o;
        y74 y74Var3 = y74.q;
        if (z) {
            if (y74Var == y74Var3) {
                setModalForAccessibility(true);
            } else if (y74Var == y74Var2) {
                setModalForAccessibility(false);
            }
        }
        this.O = y74Var;
        Iterator it = new LinkedHashSet(this.F).iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        if (this.G == null || !this.D) {
            return;
        }
        boolean zEquals = y74Var.equals(y74Var3);
        qp4 qp4Var = this.C;
        if (zEquals) {
            ah2 ah2Var2 = (ah2) qp4Var.a;
            if (ah2Var2 != null) {
                ah2Var2.b((zg2) qp4Var.b, (View) qp4Var.c, false);
                return;
            }
            return;
        }
        if (!y74Var.equals(y74Var2) || (ah2Var = (ah2) qp4Var.a) == null) {
            return;
        }
        ah2Var.c((View) qp4Var.c);
    }

    public final void l() {
        if (this.O.equals(y74.q)) {
            return;
        }
        y74 y74Var = this.O;
        y74 y74Var2 = y74.p;
        if (y74Var.equals(y74Var2)) {
            return;
        }
        final lo loVar = this.B;
        SearchView searchView = (SearchView) loVar.a;
        SearchBar searchBar = (SearchBar) loVar.o;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) loVar.c;
        if (searchBar == null) {
            if (searchView.h()) {
                searchView.postDelayed(new m74(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            final int i = 1;
            clippableRoundedCornerLayout.post(new Runnable() { // from class: b84
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    lo loVar2 = loVar;
                    switch (i2) {
                        case 0:
                            AnimatorSet animatorSetD = loVar2.d(true);
                            animatorSetD.addListener(new c84(loVar2, 0));
                            animatorSetD.start();
                            break;
                        default:
                            ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = (ClippableRoundedCornerLayout) loVar2.c;
                            clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                            AnimatorSet animatorSetH = loVar2.h(true);
                            animatorSetH.addListener(new c84(loVar2, 2));
                            animatorSetH.start();
                            break;
                    }
                }
            });
            return;
        }
        EditText editText = (EditText) loVar.i;
        if (searchView.h()) {
            searchView.j();
        }
        searchView.setTransitionState(y74Var2);
        Toolbar toolbar = (Toolbar) loVar.g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        final int i2 = 0;
        if (((SearchBar) loVar.o).getMenuResId() == -1 || !searchView.J) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(((SearchBar) loVar.o).getMenuResId());
            ActionMenuView actionMenuViewY = gb.y(toolbar);
            if (actionMenuViewY != null) {
                for (int i3 = 0; i3 < actionMenuViewY.getChildCount(); i3++) {
                    View childAt = actionMenuViewY.getChildAt(i3);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(((SearchBar) loVar.o).getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new Runnable() { // from class: b84
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                lo loVar2 = loVar;
                switch (i4) {
                    case 0:
                        AnimatorSet animatorSetD = loVar2.d(true);
                        animatorSetD.addListener(new c84(loVar2, 0));
                        animatorSetD.start();
                        break;
                    default:
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = (ClippableRoundedCornerLayout) loVar2.c;
                        clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                        AnimatorSet animatorSetH = loVar2.h(true);
                        animatorSetH.addListener(new c84(loVar2, 2));
                        animatorSetH.start();
                        break;
                }
            }
        });
    }

    public final void m(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.o.getId()) != null) {
                    m((ViewGroup) childAt, z);
                } else {
                    HashMap map = this.P;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = j65.a;
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.P.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = j65.a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
        }
    }

    public final void n() {
        ImageButton imageButtonF = gb.F(this.t);
        if (imageButtonF == null) {
            return;
        }
        int i = this.o.getVisibility() == 0 ? 1 : 0;
        Drawable drawable = imageButtonF.getDrawable();
        if (drawable instanceof dw0) {
            ((dw0) drawable).setProgress(i);
        }
        if (drawable instanceof v51) {
            ((v51) drawable).a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.P(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.H = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w74)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w74 w74Var = (w74) parcelable;
        super.onRestoreInstanceState(w74Var.n);
        setText(w74Var.p);
        setVisible(w74Var.q == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w74 w74Var = new w74(super.onSaveInstanceState());
        Editable text = getText();
        w74Var.p = text == null ? null : text.toString();
        w74Var.q = this.o.getVisibility();
        return w74Var;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.I = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.K = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.w.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.J = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.P = new HashMap(viewGroup.getChildCount());
        }
        m(viewGroup, z);
        if (z) {
            return;
        }
        this.P = null;
    }

    public void setOnMenuItemClickListener(av4 av4Var) {
        this.t.setOnMenuItemClickListener(av4Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.v;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.N = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    public void setText(CharSequence charSequence) {
        this.w.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.t.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(y74 y74Var) {
        k(y74Var, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.M = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.o;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        n();
        k(z ? y74.q : y74.o, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.G = searchBar;
        this.B.o = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new n74(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new m74(this, 2));
                    this.w.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.t;
        if (materialToolbar != null && !(materialToolbar.getNavigationIcon() instanceof dw0)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.G == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = zz1.r(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new v51(this.G.getNavigationIcon(), drawableMutate));
                n();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class Behavior extends de0 {
        public Behavior() {
        }

        @Override // defpackage.de0
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.G != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public void setHint(int i) {
        this.w.setHint(i);
    }

    public void setText(int i) {
        this.w.setText(i);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
