package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends e5 implements ActionProvider.VisibilityListener {
    public om1 c;
    public final ActionProvider d;

    public uu2(xu2 xu2Var, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = actionProvider;
    }

    @Override // defpackage.e5
    public final boolean a() {
        return this.d.hasSubMenu();
    }

    @Override // defpackage.e5
    public final boolean b() {
        return this.d.isVisible();
    }

    @Override // defpackage.e5
    public final View c() {
        return this.d.onCreateActionView();
    }

    @Override // defpackage.e5
    public final View d(tu2 tu2Var) {
        return this.d.onCreateActionView(tu2Var);
    }

    @Override // defpackage.e5
    public final boolean e() {
        return this.d.onPerformDefaultAction();
    }

    @Override // defpackage.e5
    public final void f(en4 en4Var) {
        this.d.onPrepareSubMenu(en4Var);
    }

    @Override // defpackage.e5
    public final boolean g() {
        return this.d.overridesItemVisibility();
    }

    @Override // defpackage.e5
    public final void h(om1 om1Var) {
        this.c = om1Var;
        this.d.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        om1 om1Var = this.c;
        if (om1Var != null) {
            qu2 qu2Var = ((tu2) om1Var.o).n;
            qu2Var.h = true;
            qu2Var.p(true);
        }
    }
}
