package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends e5 implements ActionProvider.VisibilityListener {
    public om1 c;
    public final ActionProvider d;

    public uu2(xu2 r1, Context r2, ActionProvider r3) {
        super(r2);
        this.d = r3;
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
    public final View d(tu2 r1) {
        return this.d.onCreateActionView(r1);
    }

    @Override // defpackage.e5
    public final boolean e() {
        return this.d.onPerformDefaultAction();
    }

    @Override // defpackage.e5
    public final void f(en4 r1) {
        this.d.onPrepareSubMenu(r1);
    }

    @Override // defpackage.e5
    public final boolean g() {
        return this.d.overridesItemVisibility();
    }

    @Override // defpackage.e5
    public final void h(om1 r1) {
        this.c = r1;
        this.d.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r1) {
        om1 r0 = this.c;
        if (r0 == null) goto L6;
        qu2 r2 = ((tu2) r0.o).n;
        r2.h = true;
        r2.p(true);
        return;
    }
}
