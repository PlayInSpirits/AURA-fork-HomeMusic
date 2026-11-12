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
    public final ArrayList j;
    public final wu4 k;

    public cv4(Toolbar r4, CharSequence r5, xf r6) {
        this.j = new ArrayList();
        this.k = new wu4(1, this);
        rm2 r0 = new rm2(25, this);
        r4.getClass();
        gv4 r1 = new gv4(r4, false);
        this.d = r1;
        r6.getClass();
        this.e = r6;
        r1.k = r6;
        r4.setOnMenuItemClickListener(r0);
        if (r1.g == true) goto L9;
        r1.h = r5;
        if ((r1.b & 8) == 0) goto L9;
        r4.setTitle(r5);
        if (r1.g == false) goto L9;
        j65.p(r4.getRootView(), r5);
    L9:
        this.f = new om1(29, this);
    }

    @Override // defpackage.l93
    public final void D(boolean r2) {
        if (r2 == this.i) goto L10;
        this.i = r2;
        ArrayList r1 = this.j;
        if (r1.size() > 0) goto L8;
        return;
    L8:
        r1.get(0).getClass();
        kf2.k();
        return;
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
        gv4 r0 = this.d;
        Toolbar r1 = r0.a;
        wu4 r2 = this.k;
        r1.removeCallbacks(r2);
        Toolbar r3 = r0.a;
        WeakHashMap r4 = j65.a;
        r3.postOnAnimation(r2);
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
    public final boolean P(int r4, KeyEvent r5) {
        Menu r3 = u0();
        if (r3 == null) goto L10;
        boolean r2 = true;
        if (KeyCharacterMap.load(r5.getDeviceId()).getKeyboardType() != 1) goto L8;
        r2 = false;
    L8:
        r3.setQwertyMode(r2);
        return r3.performShortcut(r4, r5, 0);
    L10:
        return false;
    }

    @Override // defpackage.l93
    public final boolean Q(KeyEvent r2) {
        if (r2.getAction() != 1) goto L5;
        R();
    L5:
        return true;
    }

    @Override // defpackage.l93
    public final boolean R() {
        return this.d.a.v();
    }

    @Override // defpackage.l93
    public final void e0(boolean r1) {
    }

    @Override // defpackage.l93
    public final void f0(boolean r2) {
        gv4 r1 = this.d;
        r1.a((r1.b & (-5)) | 4);
    }

    @Override // defpackage.l93
    public final void g0() {
        gv4 r2 = this.d;
        r2.a((r2.b & (-3)) | 2);
    }

    @Override // defpackage.l93
    public final void h0(int r1) {
        this.d.b(r1);
    }

    @Override // defpackage.l93
    public final void i0(Drawable r3) {
        gv4 r2 = this.d;
        r2.f = r3;
        int r0 = r2.b & 4;
        Toolbar r1 = r2.a;
        if (r0 == 0) goto L9;
        if (r3 != null) goto L7;
        r3 = r2.o;
    L7:
        r1.setNavigationIcon(r3);
        return;
    L9:
        r1.setNavigationIcon(null);
    }

    @Override // defpackage.l93
    public final void j0(boolean r1) {
    }

    @Override // defpackage.l93
    public final void k0(String r3) {
        gv4 r2 = this.d;
        r2.g = true;
        Toolbar r0 = r2.a;
        r2.h = r3;
        if ((r2.b & 8) == 0) goto L8;
        r0.setTitle(r3);
        if (r2.g == false) goto L9;
        j65.p(r0.getRootView(), r3);
        return;
    L9:
        return;
    }

    @Override // defpackage.l93
    public final void l0(CharSequence r3) {
        gv4 r2 = this.d;
        if (r2.g == true) goto L10;
        Toolbar r0 = r2.a;
        r2.h = r3;
        if ((r2.b & 8) == 0) goto L11;
        r0.setTitle(r3);
        if (r2.g == false) goto L12;
        j65.p(r0.getRootView(), r3);
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.l93
    public final boolean q() {
        ActionMenuView r0 = this.d.a.n;
        if (r0 == null) goto L10;
        y4 r1 = r0.G;
        if (r1 != null) goto L7;
        return false;
    L7:
        if (r1.f() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // defpackage.l93
    public final boolean s() {
        yu4 r1 = this.d.a.c0;
        if (r1 == null) goto L12;
        tu2 r0 = r1.o;
        if (r0 == null) goto L15;
        if (r1 != null) goto L8;
        r0 = null;
    L8:
        if (r0 == null) goto L14;
        r0.collapseActionView();
        return true;
    L14:
        return true;
    L15:
        return false;
    L12:
        return false;
    }

    public final Menu u0() {
        boolean r0 = this.h;
        gv4 r1 = this.d;
        if (r0 == true) goto L9;
        xk0 r2 = new xk0(9, this);
        si1 r3 = new si1(28, this);
        Toolbar r4 = r1.a;
        r4.d0 = r2;
        r4.e0 = r3;
        ActionMenuView r5 = r4.n;
        if (r5 == null) goto L7;
        r5.H = r2;
        r5.I = r3;
    L7:
        this.h = true;
    L9:
        return r1.a.getMenu();
    }
}
