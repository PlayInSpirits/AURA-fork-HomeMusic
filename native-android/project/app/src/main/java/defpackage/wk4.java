package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wk4 extends yu2 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public fv2 A;
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public final Context o;
    public final qu2 p;
    public final nu2 q;
    public final boolean r;
    public final int s;
    public final int t;
    public final ev2 u;
    public final sg v;
    public final bc w;
    public PopupWindow.OnDismissListener x;
    public View y;
    public View z;

    public wk4(Context r5, qu2 r6, View r7, int r8, boolean r9) {
        int r1 = 6;
        this.v = new sg(r1, this);
        this.w = new bc(r1, this);
        this.F = 0;
        this.o = r5;
        this.p = r6;
        this.r = r9;
        this.q = new nu2(r6, LayoutInflater.from(r5), r9, R.layout.abc_popup_menu_item_layout);
        this.t = r8;
        Resources r10 = r5.getResources();
        this.s = Math.max(r10.getDisplayMetrics().widthPixels / 2, r10.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = r7;
        this.u = new ev2(r5, null, r8, 0);
        r6.b(this, r5);
    }

    @Override // defpackage.gv2
    public final void a(qu2 r2, boolean r3) {
        if (r2 != this.p) goto L10;
        dismiss();
        fv2 r1 = this.A;
        if (r1 == null) goto L9;
        r1.a(r2, r3);
        return;
    L9:
        return;
    }

    @Override // defpackage.nd4
    public final boolean b() {
        if (this.C == false) goto L5;
        return false;
    L5:
        if (this.u.M.isShowing() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.gv2
    public final void c(boolean r1) {
        this.D = false;
        nu2 r0 = this.q;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r10) {
        if (r10.hasVisibleItems() == false) goto L34;
        av2 r2 = new av2(this.o, r10, this.z, this.r, this.t, 0);
        fv2 r11 = this.A;
        r2.h = r11;
        yu2 r0 = r2.i;
        if (r0 == null) goto L7;
        r0.i(r11);
    L7:
        int r12 = r10.f.size();
        int r1 = 0;
    L9:
        if (r1 >= r12) goto L16;
        MenuItem r5 = r10.getItem(r1);
        if (r5.isVisible() == false) goto L15;
        if (r5.getIcon() == null) goto L15;
        boolean r13 = true;
    L17:
        r2.g = r13;
        yu2 r3 = r2.i;
        if (r3 == null) goto L20;
        r3.q(r13);
    L20:
        r2.j = this.x;
        this.x = null;
        this.p.c(false);
        ev2 r14 = this.u;
        int r4 = r14.s;
        int r15 = r14.o();
        if ((Gravity.getAbsoluteGravity(this.F, this.y.getLayoutDirection()) & 7) != 5) goto L24;
        r4 = r4 + this.y.getWidth();
    L24:
        if (r2.b() == false) goto L27;
    L30:
        fv2 r9 = this.A;
        if (r9 == null) goto L33;
        r9.w(r10);
    L33:
        return true;
    L27:
        if (r2.e == null) goto L34;
        r2.d(r4, r15, true, true);
    L15:
        r1 = r1 + 1;
        goto L9
    L16:
        r13 = false;
    L34:
        return false;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        if (b() == false) goto L6;
        this.u.dismiss();
        return;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.nd4
    public final void f() {
        if (b() == false) goto L6;
        return;
    L6:
        if (this.C == true) goto L33;
        View r0 = this.y;
        if (r0 == null) goto L33;
        this.z = r0;
        ev2 r1 = this.u;
        lg r2 = r1.M;
        lg r3 = r1.M;
        r2.setOnDismissListener(this);
        r1.C = this;
        r1.L = true;
        r3.setFocusable(true);
        View r4 = this.z;
        if (this.B != null) goto L12;
        boolean r5 = true;
    L13:
        ViewTreeObserver r6 = r4.getViewTreeObserver();
        this.B = r6;
        if (r5 == false) goto L16;
        r6.addOnGlobalLayoutListener(this.v);
    L16:
        r4.addOnAttachStateChangeListener(this.w);
        r1.B = r4;
        r1.y = this.F;
        boolean r7 = this.D;
        Context r8 = this.o;
        nu2 r9 = this.q;
        if (r7 == true) goto L19;
        this.E = yu2.o(r9, r8, this.s);
        this.D = true;
    L19:
        r1.r(this.E);
        r3.setInputMethodMode(2);
        Rect r10 = this.n;
        if (r10 == null) goto L22;
        Rect r11 = new Rect(r10);
    L23:
        r1.K = r11;
        r1.f();
        cx0 r12 = r1.p;
        r12.setOnKeyListener(this);
        if (this.G == false) goto L31;
        qu2 r13 = this.p;
        if (r13.m == null) goto L31;
        FrameLayout r14 = (FrameLayout) LayoutInflater.from(r8).inflate(R.layout.abc_popup_menu_header_item_layout, r12, false);
        TextView r15 = (TextView) r14.findViewById(android.R.id.title);
        if (r15 == null) goto L30;
        r15.setText(r13.m);
    L30:
        r14.setEnabled(false);
        r12.addHeaderView(r14, null, false);
    L31:
        r1.p(r9);
        r1.f();
        return;
    L22:
        r11 = null;
        goto L23
    L12:
        r5 = false;
    L33:
        kf2.o("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r1) {
    }

    @Override // defpackage.gv2
    public final void i(fv2 r1) {
        this.A = r1;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        return this.u.p;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.yu2
    public final void n(qu2 r1) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.C = true;
        this.p.c(true);
        ViewTreeObserver r0 = this.B;
        if (r0 != null) goto L5;
    L8:
        this.z.removeOnAttachStateChangeListener(this.w);
        PopupWindow.OnDismissListener r2 = this.x;
        if (r2 == null) goto L12;
        r2.onDismiss();
        return;
    L12:
        return;
    L5:
        if (r0.isAlive() == true) goto L7;
        this.B = this.z.getViewTreeObserver();
    L7:
        this.B.removeGlobalOnLayoutListener(this.v);
        this.B = null;
        goto L8
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r1, int r2, KeyEvent r3) {
        if (r3.getAction() == 1) goto L5;
        return false;
    L5:
        if (r2 != 82) goto L10;
        dismiss();
        return true;
    L10:
        return false;
    }

    @Override // defpackage.yu2
    public final void p(View r1) {
        this.y = r1;
    }

    @Override // defpackage.yu2
    public final void q(boolean r1) {
        this.q.p = r1;
    }

    @Override // defpackage.yu2
    public final void r(int r1) {
        this.F = r1;
    }

    @Override // defpackage.yu2
    public final void s(int r1) {
        this.u.s = r1;
    }

    @Override // defpackage.yu2
    public final void t(PopupWindow.OnDismissListener r1) {
        this.x = r1;
    }

    @Override // defpackage.yu2
    public final void u(boolean r1) {
        this.G = r1;
    }

    @Override // defpackage.yu2
    public final void v(int r1) {
        this.u.j(r1);
    }
}
