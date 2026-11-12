package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import app.homemusic.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf implements Window.Callback {
    public final Window.Callback n;
    public om1 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final /* synthetic */ bg s;

    public xf(bg bgVar, Window.Callback callback) {
        this.s = bgVar;
        if (callback != null) {
            this.n = callback;
        } else {
            kf2.n("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.p = true;
            callback.onContentChanged();
        } finally {
            this.p = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.n.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.n.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        ea5.a(this.n, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.n.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.q;
        Window.Callback callback = this.n;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.s.z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.n.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            bg bgVar = this.s;
            bgVar.G();
            l93 l93Var = bgVar.A;
            if (l93Var == null || !l93Var.P(keyCode, keyEvent)) {
                ag agVar = bgVar.Z;
                if (agVar == null || !bgVar.L(agVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (bgVar.Z == null) {
                        ag agVarF = bgVar.F(0);
                        bgVar.M(agVarF, keyEvent);
                        boolean zL = bgVar.L(agVarF, keyEvent.getKeyCode(), keyEvent);
                        agVarF.k = false;
                        if (zL) {
                        }
                    }
                    return false;
                }
                ag agVar2 = bgVar.Z;
                if (agVar2 != null) {
                    agVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.n.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.n.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.n.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.n.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.n.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.p) {
            this.n.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof qu2)) {
            return this.n.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        om1 om1Var = this.o;
        if (om1Var != null) {
            View view = i == 0 ? new View(((cv4) om1Var.o).d.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.n.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.n.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.n.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            bg bgVar = this.s;
            bgVar.G();
            l93 l93Var = bgVar.A;
            if (l93Var != null) {
                l93Var.D(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.r) {
            this.n.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        bg bgVar = this.s;
        if (i == 108) {
            bgVar.G();
            l93 l93Var = bgVar.A;
            if (l93Var != null) {
                l93Var.D(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ag agVarF = bgVar.F(i);
            if (agVarF.m) {
                bgVar.w(agVarF, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        fa5.a(this.n, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        qu2 qu2Var = menu instanceof qu2 ? (qu2) menu : null;
        if (i == 0 && qu2Var == null) {
            return false;
        }
        if (qu2Var != null) {
            qu2Var.x = true;
        }
        om1 om1Var = this.o;
        if (om1Var != null && i == 0) {
            cv4 cv4Var = (cv4) om1Var.o;
            if (!cv4Var.g) {
                cv4Var.d.l = true;
                cv4Var.g = true;
            }
        }
        boolean zOnPreparePanel = this.n.onPreparePanel(i, view, menu);
        if (qu2Var != null) {
            qu2Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        qu2 qu2Var = this.s.F(0).h;
        if (qu2Var != null) {
            d(list, qu2Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return da5.a(this.n, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.n.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.n.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        bg bgVar = this.s;
        Context context = bgVar.x;
        if (!bgVar.L || i != 0) {
            return da5.b(this.n, callback, i);
        }
        bq4 bq4Var = new bq4(context, callback);
        d5 d5Var = bgVar.G;
        if (d5Var != null) {
            d5Var.a();
        }
        rm3 rm3Var = new rm3(bgVar, bq4Var);
        bgVar.G();
        l93 l93Var = bgVar.A;
        if (l93Var != null) {
            bgVar.G = l93Var.n0(rm3Var);
        }
        if (bgVar.G == null) {
            s75 s75Var = bgVar.K;
            if (s75Var != null) {
                s75Var.b();
            }
            d5 d5Var2 = bgVar.G;
            if (d5Var2 != null) {
                d5Var2.a();
            }
            int i2 = 1;
            if (bgVar.H == null) {
                if (bgVar.V) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        ud0 ud0Var = new ud0(context, 0);
                        ud0Var.getTheme().setTo(themeNewTheme);
                        context = ud0Var;
                    }
                    bgVar.H = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    bgVar.I = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    bgVar.I.setContentView(bgVar.H);
                    bgVar.I.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    bgVar.H.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    bgVar.I.setHeight(-2);
                    bgVar.J = new qf(bgVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) bgVar.N.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(bgVar.D()));
                        bgVar.H = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (bgVar.H != null) {
                s75 s75Var2 = bgVar.K;
                if (s75Var2 != null) {
                    s75Var2.b();
                }
                bgVar.H.e();
                Context context2 = bgVar.H.getContext();
                ActionBarContextView actionBarContextView = bgVar.H;
                rk4 rk4Var = new rk4();
                rk4Var.p = context2;
                rk4Var.q = actionBarContextView;
                rk4Var.r = rm3Var;
                qu2 qu2Var = new qu2(actionBarContextView.getContext());
                qu2Var.l = 1;
                rk4Var.u = qu2Var;
                qu2Var.e = rk4Var;
                if (((bq4) rm3Var.n).s(rk4Var, qu2Var)) {
                    rk4Var.g();
                    bgVar.H.c(rk4Var);
                    bgVar.G = rk4Var;
                    boolean z = bgVar.M && (viewGroup = bgVar.N) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = bgVar.H;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        s75 s75VarA = j65.a(bgVar.H);
                        s75VarA.a(1.0f);
                        bgVar.K = s75VarA;
                        s75VarA.d(new sf(i2, bgVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        bgVar.H.setVisibility(0);
                        if (bgVar.H.getParent() instanceof View) {
                            View view = (View) bgVar.H.getParent();
                            WeakHashMap weakHashMap = j65.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (bgVar.I != null) {
                        bgVar.y.getDecorView().post(bgVar.J);
                    }
                } else {
                    bgVar.G = null;
                }
            }
            bgVar.O();
            bgVar.G = bgVar.G;
        }
        bgVar.O();
        d5 d5Var3 = bgVar.G;
        if (d5Var3 != null) {
            return bq4Var.i(d5Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.n.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
