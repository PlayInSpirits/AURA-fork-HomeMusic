package defpackage;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ xu2 b;

    public wu2(xu2 r1, MenuItem.OnActionExpandListener r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem r2) {
        MenuItem r3 = this.b.h(r2);
        return this.a.onMenuItemActionCollapse(r3);
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem r2) {
        MenuItem r3 = this.b.h(r2);
        return this.a.onMenuItemActionExpand(r3);
    }
}
