package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia5 extends l93 implements n4 {
    public static final AccelerateInterpolator B = new AccelerateInterpolator();
    public static final DecelerateInterpolator C = new DecelerateInterpolator();
    public final oz4 A;
    public Context d;
    public Context e;
    public ActionBarOverlayLayout f;
    public ActionBarContainer g;
    public fj0 h;
    public ActionBarContextView i;
    public final View j;
    public boolean k;
    public ha5 l;
    public ha5 m;
    public rm3 n;
    public boolean o;
    public final ArrayList p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public t75 v;
    public boolean w;
    public boolean x;
    public final ga5 y;
    public final ga5 z;

    public ia5(Activity activity, boolean z) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new ga5(this, 0);
        this.z = new ga5(this, 1);
        this.A = new oz4(this);
        View decorView = activity.getWindow().getDecorView();
        v0(decorView);
        if (z) {
            return;
        }
        this.j = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.l93
    public final void D(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        ArrayList arrayList = this.p;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        kf2.k();
    }

    @Override // defpackage.l93
    public final int I() {
        return ((gv4) this.h).b;
    }

    @Override // defpackage.l93
    public final Context J() {
        if (this.e == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.e = new ContextThemeWrapper(this.d, i);
            } else {
                this.e = this.d;
            }
        }
        return this.e;
    }

    @Override // defpackage.l93
    public final void N() {
        w0(this.d.getResources().getBoolean(app.homemusic.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.l93
    public final boolean P(int i, KeyEvent keyEvent) {
        qu2 qu2Var;
        ha5 ha5Var = this.l;
        if (ha5Var == null || (qu2Var = ha5Var.q) == null) {
            return false;
        }
        qu2Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return qu2Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.l93
    public final void e0(boolean z) {
        if (this.k) {
            return;
        }
        f0(z);
    }

    @Override // defpackage.l93
    public final void f0(boolean z) {
        int i = z ? 4 : 0;
        gv4 gv4Var = (gv4) this.h;
        int i2 = gv4Var.b;
        this.k = true;
        gv4Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.l93
    public final void g0() {
        gv4 gv4Var = (gv4) this.h;
        gv4Var.a((gv4Var.b & (-3)) | 2);
    }

    @Override // defpackage.l93
    public final void h0(int i) {
        ((gv4) this.h).b(i);
    }

    @Override // defpackage.l93
    public final void i0(Drawable drawable) {
        gv4 gv4Var = (gv4) this.h;
        gv4Var.f = drawable;
        int i = gv4Var.b & 4;
        Toolbar toolbar = gv4Var.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = gv4Var.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.l93
    public final void j0(boolean z) {
        t75 t75Var;
        this.w = z;
        if (z || (t75Var = this.v) == null) {
            return;
        }
        t75Var.a();
    }

    @Override // defpackage.l93
    public final void k0(String str) {
        gv4 gv4Var = (gv4) this.h;
        gv4Var.g = true;
        Toolbar toolbar = gv4Var.a;
        gv4Var.h = str;
        if ((gv4Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (gv4Var.g) {
                j65.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.l93
    public final void l0(CharSequence charSequence) {
        gv4 gv4Var = (gv4) this.h;
        if (gv4Var.g) {
            return;
        }
        Toolbar toolbar = gv4Var.a;
        gv4Var.h = charSequence;
        if ((gv4Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (gv4Var.g) {
                j65.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.l93
    public final d5 n0(rm3 rm3Var) {
        ha5 ha5Var = this.l;
        if (ha5Var != null) {
            ha5Var.a();
        }
        this.f.setHideOnContentScrollEnabled(false);
        this.i.e();
        ha5 ha5Var2 = new ha5(this, this.i.getContext(), rm3Var);
        qu2 qu2Var = ha5Var2.q;
        qu2Var.y();
        try {
            boolean zS = ((bq4) ha5Var2.r.n).s(ha5Var2, qu2Var);
            qu2Var.x();
            if (!zS) {
                return null;
            }
            this.l = ha5Var2;
            ha5Var2.g();
            this.i.c(ha5Var2);
            u0(true);
            return ha5Var2;
        } catch (Throwable th) {
            qu2Var.x();
            throw th;
        }
    }

    @Override // defpackage.l93
    public final boolean s() {
        yu4 yu4Var;
        fj0 fj0Var = this.h;
        if (fj0Var == null || (yu4Var = ((gv4) fj0Var).a.c0) == null || yu4Var.o == null) {
            return false;
        }
        yu4 yu4Var2 = ((gv4) fj0Var).a.c0;
        tu2 tu2Var = yu4Var2 == null ? null : yu4Var2.o;
        if (tu2Var == null) {
            return true;
        }
        tu2Var.collapseActionView();
        return true;
    }

    public final void u0(boolean z) {
        s75 s75VarI;
        s75 s75VarI2;
        boolean z2 = this.t;
        if (z) {
            if (!z2) {
                this.t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x0(false);
            }
        } else if (z2) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x0(false);
        }
        boolean zIsLaidOut = this.g.isLaidOut();
        fj0 fj0Var = this.h;
        if (!zIsLaidOut) {
            if (z) {
                ((gv4) fj0Var).a.setVisibility(4);
                this.i.setVisibility(0);
                return;
            } else {
                ((gv4) fj0Var).a.setVisibility(0);
                this.i.setVisibility(8);
                return;
            }
        }
        if (z) {
            gv4 gv4Var = (gv4) fj0Var;
            s75VarI = j65.a(gv4Var.a);
            s75VarI.a(0.0f);
            s75VarI.c(100L);
            s75VarI.d(new fv4(gv4Var, 4));
            s75VarI2 = this.i.i(0, 200L);
        } else {
            gv4 gv4Var2 = (gv4) fj0Var;
            s75 s75VarA = j65.a(gv4Var2.a);
            s75VarA.a(1.0f);
            s75VarA.c(200L);
            s75VarA.d(new fv4(gv4Var2, 0));
            s75VarI = this.i.i(8, 100L);
            s75VarI2 = s75VarA;
        }
        t75 t75Var = new t75();
        ArrayList arrayList = t75Var.a;
        arrayList.add(s75VarI);
        View view = (View) s75VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) s75VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(s75VarI2);
        t75Var.b();
    }

    public final void v0(View view) {
        fj0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(app.homemusic.R.id.decor_content_parent);
        this.f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(app.homemusic.R.id.action_bar);
        if (callbackFindViewById instanceof fj0) {
            wrapper = (fj0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.h = wrapper;
        this.i = (ActionBarContextView) view.findViewById(app.homemusic.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(app.homemusic.R.id.action_bar_container);
        this.g = actionBarContainer;
        fj0 fj0Var = this.h;
        if (fj0Var == null || this.i == null || actionBarContainer == null) {
            kf2.o(ia5.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((gv4) fj0Var).a.getContext();
        this.d = context;
        if ((((gv4) this.h).b & 4) != 0) {
            this.k = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.h.getClass();
        w0(context.getResources().getBoolean(app.homemusic.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.d.obtainStyledAttributes(null, st3.a, app.homemusic.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f;
            if (!actionBarOverlayLayout2.t) {
                kf2.o("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.x = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.g;
            WeakHashMap weakHashMap = j65.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w0(boolean z) {
        if (z) {
            this.g.setTabContainer(null);
            ((gv4) this.h).getClass();
        } else {
            ((gv4) this.h).getClass();
            this.g.setTabContainer(null);
        }
        gv4 gv4Var = (gv4) this.h;
        gv4Var.getClass();
        gv4Var.a.setCollapsible(false);
        this.f.setHasNonEmbeddedTabs(false);
    }

    public final void x0(boolean z) {
        boolean z2 = this.t || !this.s;
        boolean z3 = this.u;
        int i = 2;
        oz4 oz4Var = this.A;
        View view = this.j;
        if (!z2) {
            if (z3) {
                this.u = false;
                t75 t75Var = this.v;
                if (t75Var != null) {
                    t75Var.a();
                }
                int i2 = this.q;
                ga5 ga5Var = this.y;
                if (i2 != 0 || (!this.w && !z)) {
                    ga5Var.c();
                    return;
                }
                this.g.setAlpha(1.0f);
                this.g.setTransitioning(true);
                t75 t75Var2 = new t75();
                float f = -this.g.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.g.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                s75 s75VarA = j65.a(this.g);
                s75VarA.e(f);
                View view2 = (View) s75VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(oz4Var != null ? new xe(i, oz4Var, view2) : null);
                }
                boolean z4 = t75Var2.e;
                ArrayList arrayList = t75Var2.a;
                if (!z4) {
                    arrayList.add(s75VarA);
                }
                if (this.r && view != null) {
                    s75 s75VarA2 = j65.a(view);
                    s75VarA2.e(f);
                    if (!t75Var2.e) {
                        arrayList.add(s75VarA2);
                    }
                }
                boolean z5 = t75Var2.e;
                if (!z5) {
                    t75Var2.c = B;
                }
                if (!z5) {
                    t75Var2.b = 250L;
                }
                if (!z5) {
                    t75Var2.d = ga5Var;
                }
                this.v = t75Var2;
                t75Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.u = true;
        t75 t75Var3 = this.v;
        if (t75Var3 != null) {
            t75Var3.a();
        }
        this.g.setVisibility(0);
        int i3 = this.q;
        ga5 ga5Var2 = this.z;
        if (i3 == 0 && (this.w || z)) {
            this.g.setTranslationY(0.0f);
            float f2 = -this.g.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.g.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.g.setTranslationY(f2);
            t75 t75Var4 = new t75();
            s75 s75VarA3 = j65.a(this.g);
            s75VarA3.e(0.0f);
            View view3 = (View) s75VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(oz4Var != null ? new xe(i, oz4Var, view3) : null);
            }
            boolean z6 = t75Var4.e;
            ArrayList arrayList2 = t75Var4.a;
            if (!z6) {
                arrayList2.add(s75VarA3);
            }
            if (this.r && view != null) {
                view.setTranslationY(f2);
                s75 s75VarA4 = j65.a(view);
                s75VarA4.e(0.0f);
                if (!t75Var4.e) {
                    arrayList2.add(s75VarA4);
                }
            }
            boolean z7 = t75Var4.e;
            if (!z7) {
                t75Var4.c = C;
            }
            if (!z7) {
                t75Var4.b = 250L;
            }
            if (!z7) {
                t75Var4.d = ga5Var2;
            }
            this.v = t75Var4;
            t75Var4.b();
        } else {
            this.g.setAlpha(1.0f);
            this.g.setTranslationY(0.0f);
            if (this.r && view != null) {
                view.setTranslationY(0.0f);
            }
            ga5Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = j65.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public ia5(Dialog dialog) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new ga5(this, 0);
        this.z = new ga5(this, 1);
        this.A = new oz4(this);
        v0(dialog.getWindow().getDecorView());
    }
}
