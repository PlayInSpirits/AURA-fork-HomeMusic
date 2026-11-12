package defpackage;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p43 implements ou2, r83 {
    public final /* synthetic */ NavigationView n;

    public /* synthetic */ p43(NavigationView navigationView) {
        this.n = navigationView;
    }

    @Override // defpackage.ou2
    public boolean m(qu2 qu2Var, MenuItem menuItem) {
        q43 q43Var = this.n.w;
        return q43Var != null && q43Var.a(menuItem);
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        NavigationView navigationView = this.n;
        if (navigationView.o == null) {
            navigationView.o = new Rect();
        }
        Rect rect = navigationView.o;
        int iB = pb5Var.b();
        mb5 mb5Var = pb5Var.a;
        rect.set(iB, pb5Var.d(), pb5Var.c(), pb5Var.a());
        l43 l43Var = navigationView.v;
        l43Var.getClass();
        int iD = pb5Var.d();
        if (l43Var.M != iD) {
            l43Var.M = iD;
            int i = (l43Var.o.getChildCount() <= 0 && l43Var.K) ? l43Var.M : 0;
            NavigationMenuView navigationMenuView = l43Var.n;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = l43Var.n;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, pb5Var.a());
        j65.b(l43Var.o, pb5Var);
        navigationView.setWillNotDraw(mb5Var.m().equals(vz1.e) || navigationView.n == null);
        navigationView.postInvalidateOnAnimation();
        return mb5Var.c();
    }

    @Override // defpackage.ou2
    public void y(qu2 qu2Var) {
    }
}
