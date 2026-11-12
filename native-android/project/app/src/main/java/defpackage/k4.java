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
    public boolean f;

    public k4(df r2, DrawerLayout r3, Toolbar r4) {
        this.f = false;
        if (r4 == null) goto L5;
        this.a = new c12(r4);
        r4.setNavigationOnClickListener(new i4(1, this));
    L8:
        this.b = r3;
        this.d = R.string.toolbar_navigation_drawer_open;
        this.e = R.string.toolbar_navigation_drawer_closed;
        this.c = new dw0(this.a.h());
        this.a.t();
        return;
    L5:
        if (r2 == null) goto L7;
        bg r5 = (bg) r2.m();
        r5.getClass();
        this.a = new d34(7, r5);
        goto L8
    L7:
        this.a = new hg3(3, r2);
        goto L8
    }

    @Override // defpackage.gw0
    public final void a(float r3) {
        d(Math.min(1.0f, Math.max(0.0f, r3)));
    }

    @Override // defpackage.gw0
    public final void b(View r1) {
        d(1.0f);
        int r2 = this.e;
        this.a.u(r2);
    }

    @Override // defpackage.gw0
    public final void c(View r1) {
        d(0.0f);
        int r2 = this.d;
        this.a.u(r2);
    }

    public final void d(float r3) {
        dw0 r2 = this.c;
        if (r3 != 1.0f) goto L8;
        if (r2.i == true) goto L12;
        r2.i = true;
        r2.invalidateSelf();
    L12:
        r2.setProgress(r3);
        return;
    L8:
        if (r3 != 0.0f) goto L12;
        if (r2.i == false) goto L12;
        r2.i = false;
        r2.invalidateSelf();
        goto L12
    }

    public final void e() {
        DrawerLayout r0 = this.b;
        View r2 = r0.f(8388611);
        boolean r3 = false;
        if (r2 == null) goto L5;
        boolean r4 = DrawerLayout.m(r2);
    L6:
        if (r4 == false) goto L8;
        d(1.0f);
    L9:
        View r1 = r0.f(8388611);
        if (r1 == null) goto L12;
        r3 = DrawerLayout.m(r1);
    L12:
        if (r3 == false) goto L14;
        int r5 = this.e;
    L15:
        boolean r6 = this.f;
        j4 r7 = this.a;
        if (r6 == false) goto L18;
    L20:
        r7.q(this.c, r5);
        return;
    L18:
        if (r7.e() == true) goto L20;
        Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
        this.f = true;
        goto L20
    L14:
        r5 = this.d;
        goto L15
    L8:
        d(0.0f);
        goto L9
    L5:
        r4 = false;
        goto L6
    }
}
