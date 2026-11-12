package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yu4 implements gv2 {
    public qu2 n;
    public tu2 o;
    public final /* synthetic */ Toolbar p;

    public yu4(Toolbar toolbar) {
        this.p = toolbar;
    }

    @Override // defpackage.gv2
    public final void a(qu2 qu2Var, boolean z) {
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        if (this.o != null) {
            qu2 qu2Var = this.n;
            if (qu2Var != null) {
                int size = qu2Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.n.getItem(i) == this.o) {
                        return;
                    }
                }
            }
            g(this.o);
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 tu2Var) {
        Toolbar toolbar = this.p;
        KeyEvent.Callback callback = toolbar.v;
        if (callback instanceof j40) {
            ((j40) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.v);
        toolbar.removeView(toolbar.u);
        toolbar.v = null;
        ArrayList arrayList = toolbar.R;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.o = null;
        toolbar.requestLayout();
        tu2Var.C = false;
        tu2Var.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 tu2Var) {
        Toolbar toolbar = this.p;
        toolbar.c();
        ViewParent parent = toolbar.u.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.u);
            }
            toolbar.addView(toolbar.u);
        }
        View actionView = tu2Var.getActionView();
        toolbar.v = actionView;
        this.o = tu2Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.v);
            }
            zu4 zu4VarH = Toolbar.h();
            zu4VarH.a = (toolbar.A & 112) | 8388611;
            zu4VarH.b = 2;
            toolbar.v.setLayoutParams(zu4VarH);
            toolbar.addView(toolbar.v);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((zu4) childAt.getLayoutParams()).b != 2 && childAt != toolbar.n) {
                toolbar.removeViewAt(childCount);
                toolbar.R.add(childAt);
            }
        }
        toolbar.requestLayout();
        tu2Var.C = true;
        tu2Var.n.p(false);
        KeyEvent.Callback callback = toolbar.v;
        if (callback instanceof j40) {
            ((j40) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.gv2
    public final void l(Context context, qu2 qu2Var) {
        tu2 tu2Var;
        qu2 qu2Var2 = this.n;
        if (qu2Var2 != null && (tu2Var = this.o) != null) {
            qu2Var2.d(tu2Var);
        }
        this.n = qu2Var;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }
}
