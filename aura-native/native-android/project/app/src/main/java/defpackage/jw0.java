package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 extends hw {
    public final int j;
    public o65 k;
    public final g5 l = new g5(8, this);
    public final /* synthetic */ DrawerLayout m;

    public jw0(DrawerLayout drawerLayout, int i) {
        this.m = drawerLayout;
        this.j = i;
    }

    @Override // defpackage.hw
    public final void A(View view, int i, int i2) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.m;
        float width2 = (drawerLayout.b(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.s(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // defpackage.hw
    public final void B(View view, float f, float f2) {
        int i;
        int[] iArr = DrawerLayout.P;
        float f3 = ((hw0) view.getLayoutParams()).b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.m;
        if (drawerLayout.b(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.k.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.hw
    public final boolean Q(View view, int i) {
        if (!DrawerLayout.n(view)) {
            return false;
        }
        int i2 = this.j;
        DrawerLayout drawerLayout = this.m;
        return drawerLayout.b(view, i2) && drawerLayout.i(view) == 0;
    }

    @Override // defpackage.hw
    public final int d(View view, int i) {
        DrawerLayout drawerLayout = this.m;
        if (drawerLayout.b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.hw
    public final int e(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.hw
    public final int o(View view) {
        if (DrawerLayout.n(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.hw
    public final void v(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.m;
        View viewF = i3 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
        if (viewF == null || drawerLayout.i(viewF) != 0) {
            return;
        }
        this.k.b(viewF, i2);
    }

    @Override // defpackage.hw
    public final void w() {
        this.m.postDelayed(this.l, 160L);
    }

    @Override // defpackage.hw
    public final void y(View view, int i) {
        ((hw0) view.getLayoutParams()).c = false;
        int i2 = this.j == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.m;
        View viewF = drawerLayout.f(i2);
        if (viewF != null) {
            drawerLayout.c(viewF, true);
        }
    }

    @Override // defpackage.hw
    public final void z(int i) {
        this.m.v(this.k.t, i);
    }
}
