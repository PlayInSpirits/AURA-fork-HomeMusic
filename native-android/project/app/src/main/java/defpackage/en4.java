package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class en4 extends qu2 implements SubMenu {
    public final tu2 A;
    public final qu2 z;

    public en4(Context r1, qu2 r2, tu2 r3) {
        super(r1);
        this.z = r2;
        this.A = r3;
    }

    @Override // defpackage.qu2
    public final boolean d(tu2 r1) {
        return this.z.d(r1);
    }

    @Override // defpackage.qu2
    public final boolean e(qu2 r2, MenuItem r3) {
        if (super.e(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.z.e(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.qu2
    public final boolean f(tu2 r1) {
        return this.z.f(r1);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.qu2
    public final String j() {
        tu2 r1 = this.A;
        if (r1 == null) goto L5;
        int r2 = r1.a;
    L6:
        if (r2 != 0) goto L10;
        return null;
    L10:
        return f34.f(r2, "android:menu:actionviewstates:");
    L5:
        r2 = 0;
        goto L6
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
    public final void setGroupDividerEnabled(boolean r1) {
        this.z.setGroupDividerEnabled(r1);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable r7) {
        w(0, null, 0, r7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence r7) {
        w(0, r7, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View r7) {
        w(0, null, 0, null, r7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable r2) {
        this.A.setIcon(r2);
        return this;
    }

    @Override // defpackage.qu2, android.view.Menu
    public final void setQwertyMode(boolean r1) {
        this.z.setQwertyMode(r1);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r2) {
        this.A.setIcon(r2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r7) {
        w(0, null, r7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r7) {
        w(r7, null, 0, null, null);
        return this;
    }
}
