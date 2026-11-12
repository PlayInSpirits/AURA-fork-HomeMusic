package defpackage;

import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 implements gw0 {
    public final j4 a;
    public final DrawerLayout b;
    public final dw0 c;
    public final int d;
    public final int e;
    public boolean f = false;

    public k4(df dfVar, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.a = new c12(toolbar);
            toolbar.setNavigationOnClickListener(new i4(1, this));
        } else if (dfVar != null) {
            bg bgVar = (bg) dfVar.m();
            bgVar.getClass();
            this.a = new d34(7, bgVar);
        } else {
            this.a = new hg3(3, dfVar);
        }
        this.b = drawerLayout;
        this.d = R.string.toolbar_navigation_drawer_open;
        this.e = R.string.toolbar_navigation_drawer_closed;
        this.c = new dw0(this.a.h());
        this.a.t();
    }

    @Override // defpackage.gw0
    public final void a(float f) {
        d(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // defpackage.gw0
    public final void b(View view) {
        d(1.0f);
        this.a.u(this.e);
    }

    @Override // defpackage.gw0
    public final void c(View view) {
        d(0.0f);
        this.a.u(this.d);
    }

    public final void d(float f) {
        dw0 dw0Var = this.c;
        if (f == 1.0f) {
            if (!dw0Var.i) {
                dw0Var.i = true;
                dw0Var.invalidateSelf();
            }
        } else if (f == 0.0f && dw0Var.i) {
            dw0Var.i = false;
            dw0Var.invalidateSelf();
        }
        dw0Var.setProgress(f);
    }

    public final void e() {
        DrawerLayout drawerLayout = this.b;
        View viewF = drawerLayout.f(8388611);
        if (viewF != null ? DrawerLayout.m(viewF) : false) {
            d(1.0f);
        } else {
            d(0.0f);
        }
        View viewF2 = drawerLayout.f(8388611);
        int i = viewF2 != null ? DrawerLayout.m(viewF2) : false ? this.e : this.d;
        boolean z = this.f;
        j4 j4Var = this.a;
        if (!z && !j4Var.e()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f = true;
        }
        j4Var.q(this.c, i);
    }
}
