package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wk4 extends yu2 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public fv2 A;
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public int F = 0;
    public boolean G;
    public final Context o;
    public final qu2 p;
    public final nu2 q;
    public final boolean r;
    public final int s;
    public final int t;
    public final ev2 u;
    public final sg v;
    public final bc w;
    public PopupWindow.OnDismissListener x;
    public View y;
    public View z;

    public wk4(Context context, qu2 qu2Var, View view, int i, boolean z) {
        int i2 = 6;
        this.v = new sg(i2, this);
        this.w = new bc(i2, this);
        this.o = context;
        this.p = qu2Var;
        this.r = z;
        this.q = new nu2(qu2Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.t = i;
        Resources resources = context.getResources();
        this.s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = view;
        this.u = new ev2(context, null, i, 0);
        qu2Var.b(this, context);
    }

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
        if (qu2Var != this.p) {
            return;
        }
        dismiss();
        fv2 fv2Var = this.A;
        if (fv2Var != null) {
            fv2Var.a(qu2Var, z);
        }
    }

    @Override // defpackage.nd4
    public final boolean b() {
        return !this.C && this.u.M.isShowing();
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        this.D = false;
        nu2 nu2Var = this.q;
        if (nu2Var != null) {
            nu2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        boolean z;
        if (en4Var.hasVisibleItems()) {
            av2 av2Var = new av2(this.o, en4Var, this.z, this.r, this.t, 0);
            fv2 fv2Var = this.A;
            av2Var.h = fv2Var;
            yu2 yu2Var = av2Var.i;
            if (yu2Var != null) {
                yu2Var.i(fv2Var);
            }
            int size = en4Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = en4Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            av2Var.g = z;
            yu2 yu2Var2 = av2Var.i;
            if (yu2Var2 != null) {
                yu2Var2.q(z);
            }
            av2Var.j = this.x;
            this.x = null;
            this.p.c(false);
            ev2 ev2Var = this.u;
            int width = ev2Var.s;
            int iO = ev2Var.o();
            if ((Gravity.getAbsoluteGravity(this.F, this.y.getLayoutDirection()) & 7) == 5) {
                width += this.y.getWidth();
            }
            if (!av2Var.b()) {
                if (av2Var.e != null) {
                    av2Var.d(width, iO, true, true);
                }
            }
            fv2 fv2Var2 = this.A;
            if (fv2Var2 != null) {
                fv2Var2.w(en4Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        if (b()) {
            this.u.dismiss();
        }
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.nd4
    public final void f() {
        View view;
        if (b()) {
            return;
        }
        if (this.C || (view = this.y) == null) {
            kf2.o("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.z = view;
        ev2 ev2Var = this.u;
        lg lgVar = ev2Var.M;
        lg lgVar2 = ev2Var.M;
        lgVar.setOnDismissListener(this);
        ev2Var.C = this;
        ev2Var.L = true;
        lgVar2.setFocusable(true);
        View view2 = this.z;
        boolean z = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.v);
        }
        view2.addOnAttachStateChangeListener(this.w);
        ev2Var.B = view2;
        ev2Var.y = this.F;
        boolean z2 = this.D;
        Context context = this.o;
        nu2 nu2Var = this.q;
        if (!z2) {
            this.E = yu2.o(nu2Var, context, this.s);
            this.D = true;
        }
        ev2Var.r(this.E);
        lgVar2.setInputMethodMode(2);
        Rect rect = this.n;
        ev2Var.K = rect != null ? new Rect(rect) : null;
        ev2Var.f();
        cx0 cx0Var = ev2Var.p;
        cx0Var.setOnKeyListener(this);
        if (this.G) {
            qu2 qu2Var = this.p;
            if (qu2Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) cx0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(qu2Var.m);
                }
                frameLayout.setEnabled(false);
                cx0Var.addHeaderView(frameLayout, null, false);
            }
        }
        ev2Var.p(nu2Var);
        ev2Var.f();
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
    }

    @Override // defpackage.gv2
    public final void i(fv2 fv2Var) {
        this.A = fv2Var;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        return this.u.p;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.yu2
    public final void n(qu2 qu2Var) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.C = true;
        this.p.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.z.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.v);
            this.B = null;
        }
        this.z.removeOnAttachStateChangeListener(this.w);
        PopupWindow.OnDismissListener onDismissListener = this.x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.yu2
    public final void p(View view) {
        this.y = view;
    }

    @Override // defpackage.yu2
    public final void q(boolean z) {
        this.q.p = z;
    }

    @Override // defpackage.yu2
    public final void r(int i) {
        this.F = i;
    }

    @Override // defpackage.yu2
    public final void s(int i) {
        this.u.s = i;
    }

    @Override // defpackage.yu2
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.x = onDismissListener;
    }

    @Override // defpackage.yu2
    public final void u(boolean z) {
        this.G = z;
    }

    @Override // defpackage.yu2
    public final void v(int i) {
        this.u.j(i);
    }
}
