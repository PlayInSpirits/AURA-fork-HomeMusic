package defpackage;

import android.view.MenuItem;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wu2 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ xu2 b;

    public wu2(xu2 xu2Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = xu2Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.h(menuItem));
    }
}
