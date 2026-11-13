package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class en4 extends qu2 implements SubMenu {
    public final tu2 A;
    public final qu2 z;

    public en4(Context context, qu2 qu2Var, tu2 tu2Var) {
        super(context);
        this.z = qu2Var;
        this.A = tu2Var;
    }

    @Override // defpackage.qu2
    public final boolean d(tu2 tu2Var) {
        return this.z.d(tu2Var);
    }

    @Override // defpackage.qu2
    public final boolean e(qu2 qu2Var, MenuItem menuItem) {
        return super.e(qu2Var, menuItem) || this.z.e(qu2Var, menuItem);
    }

    @Override // defpackage.qu2
    public final boolean f(tu2 tu2Var) {
        return this.z.f(tu2Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.qu2
    public final String j() {
        tu2 tu2Var = this.A;
        int i = tu2Var != null ? tu2Var.a : 0;
        if (i == 0) {
            return null;
        }
        return f34.f(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.qu2
    public final qu2 k() {
        return this.z.k();
    }

    @Override // defpackage.qu2
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.qu2
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.qu2
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.qu2, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.qu2, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }
}
