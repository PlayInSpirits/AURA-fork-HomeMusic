package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cv4 extends l93 {
    public final gv4 d;
    public final Window.Callback e;
    public final om1 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final wu4 k = new wu4(1, this);

    public cv4(Toolbar toolbar, CharSequence charSequence, xf xfVar) {
        rm2 rm2Var = new rm2(25, this);
        toolbar.getClass();
        gv4 gv4Var = new gv4(toolbar, false);
        this.d = gv4Var;
        xfVar.getClass();
        this.e = xfVar;
        gv4Var.k = xfVar;
        toolbar.setOnMenuItemClickListener(rm2Var);
        if (!gv4Var.g) {
            gv4Var.h = charSequence;
            if ((gv4Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (gv4Var.g) {
                    j65.p(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f = new om1(29, this);
    }

    @Override // defpackage.l93
    public final void D(boolean z) {
        if (z == this.i) {
            return;
        }
        this.i = z;
        ArrayList arrayList = this.j;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        kf2.k();
    }

    @Override // defpackage.l93
    public final int I() {
        return this.d.b;
    }

    @Override // defpackage.l93
    public final Context J() {
        return this.d.a.getContext();
    }

    @Override // defpackage.l93
    public final boolean L() {
        gv4 gv4Var = this.d;
        Toolbar toolbar = gv4Var.a;
        wu4 wu4Var = this.k;
        toolbar.removeCallbacks(wu4Var);
        Toolbar toolbar2 = gv4Var.a;
        WeakHashMap weakHashMap = j65.a;
        toolbar2.postOnAnimation(wu4Var);
        return true;
    }

    @Override // defpackage.l93
    public final void N() {
    }

    @Override // defpackage.l93
    public final void O() {
        this.d.a.removeCallbacks(this.k);
    }

    @Override // defpackage.l93
    public final boolean P(int i, KeyEvent keyEvent) {
        Menu menuU0 = u0();
        if (menuU0 == null) {
            return false;
        }
        menuU0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuU0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.l93
    public final boolean Q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            R();
        }
        return true;
    }

    @Override // defpackage.l93
    public final boolean R() {
        return this.d.a.v();
    }

    @Override // defpackage.l93
    public final void e0(boolean z) {
    }

    @Override // defpackage.l93
    public final void f0(boolean z) {
        gv4 gv4Var = this.d;
        gv4Var.a((gv4Var.b & (-5)) | 4);
    }

    @Override // defpackage.l93
    public final void g0() {
        gv4 gv4Var = this.d;
        gv4Var.a((gv4Var.b & (-3)) | 2);
    }

    @Override // defpackage.l93
    public final void h0(int i) {
        this.d.b(i);
    }

    @Override // defpackage.l93
    public final void i0(Drawable drawable) {
        gv4 gv4Var = this.d;
        gv4Var.f = drawable;
        int i = gv4Var.b & 4;
        Toolbar toolbar = gv4Var.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = gv4Var.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.l93
    public final void j0(boolean z) {
    }

    @Override // defpackage.l93
    public final void k0(String str) {
        gv4 gv4Var = this.d;
        gv4Var.g = true;
        Toolbar toolbar = gv4Var.a;
        gv4Var.h = str;
        if ((gv4Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (gv4Var.g) {
                j65.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.l93
    public final void l0(CharSequence charSequence) {
        gv4 gv4Var = this.d;
        if (gv4Var.g) {
            return;
        }
        Toolbar toolbar = gv4Var.a;
        gv4Var.h = charSequence;
        if ((gv4Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (gv4Var.g) {
                j65.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.l93
    public final boolean q() {
        y4 y4Var;
        ActionMenuView actionMenuView = this.d.a.n;
        return (actionMenuView == null || (y4Var = actionMenuView.G) == null || !y4Var.f()) ? false : true;
    }

    @Override // defpackage.l93
    public final boolean s() {
        tu2 tu2Var;
        yu4 yu4Var = this.d.a.c0;
        if (yu4Var == null || (tu2Var = yu4Var.o) == null) {
            return false;
        }
        if (yu4Var == null) {
            tu2Var = null;
        }
        if (tu2Var == null) {
            return true;
        }
        tu2Var.collapseActionView();
        return true;
    }

    public final Menu u0() {
        boolean z = this.h;
        gv4 gv4Var = this.d;
        if (!z) {
            xk0 xk0Var = new xk0(9, this);
            si1 si1Var = new si1(28, this);
            Toolbar toolbar = gv4Var.a;
            toolbar.d0 = xk0Var;
            toolbar.e0 = si1Var;
            ActionMenuView actionMenuView = toolbar.n;
            if (actionMenuView != null) {
                actionMenuView.H = xk0Var;
                actionMenuView.I = si1Var;
            }
            this.h = true;
        }
        return gv4Var.a.getMenu();
    }
}
