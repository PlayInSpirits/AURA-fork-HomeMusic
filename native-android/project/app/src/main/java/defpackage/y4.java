package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements gv2 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final SparseBooleanArray F;
    public t4 G;
    public t4 H;
    public lg1 I;
    public u4 J;
    public final zg5 K;
    public int L;
    public final Context n;
    public Context o;
    public qu2 p;
    public final LayoutInflater q;
    public fv2 r;
    public final int s;
    public final int t;
    public iv2 u;
    public int v;
    public v4 w;
    public Drawable x;
    public boolean y;
    public boolean z;

    public y4(Context r1) {
        this.n = r1;
        this.q = LayoutInflater.from(r1);
        this.s = R.layout.abc_action_menu_layout;
        this.t = R.layout.abc_action_menu_item_layout;
        this.F = new SparseBooleanArray();
        this.K = new zg5(this);
    }

    @Override // defpackage.gv2
    public final void a(qu2 r3, boolean r4) {
        f();
        t4 r0 = this.H;
        if (r0 != null) goto L5;
    L7:
        fv2 r2 = this.r;
        if (r2 == null) goto L11;
        r2.a(r3, r4);
        return;
    L11:
        return;
    L5:
        if (r0.b() == false) goto L7;
        r0.i.dismiss();
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(tu2 r4, View r5, ViewGroup r6) {
        View r0 = r4.getActionView();
        int r1 = 0;
        if (r0 == null) goto L7;
        if (r4.e() == true) goto L7;
    L15:
        if (r4.C == false) goto L17;
        r1 = 8;
    L17:
        r0.setVisibility(r1);
        ViewGroup.LayoutParams r3 = r0.getLayoutParams();
        ((ActionMenuView) r6).getClass();
        if ((r3 instanceof a5) == true) goto L20;
        r0.setLayoutParams(ActionMenuView.k(r3));
    L20:
        return r0;
    L7:
        if ((r5 instanceof hv2) == false) goto L9;
        hv2 r7 = (hv2) r5;
    L10:
        r7.c(r4);
        ActionMenuItemView r2 = (ActionMenuItemView) r7;
        r2.setItemInvoker((ActionMenuView) this.u);
        if (this.J != null) goto L13;
        this.J = new u4(this);
    L13:
        r2.setPopupCallback(this.J);
        r0 = (View) r7;
        goto L15
    L9:
        r7 = (hv2) this.q.inflate(this.t, r6, false);
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv2
    public final void c(boolean r11) {
        ViewGroup r12 = (ViewGroup) this.u;
        ArrayList r0 = null;
        boolean r1 = false;
        if (r12 == null) goto L32;
        qu2 r2 = this.p;
        if (r2 == null) goto L25;
        r2.i();
        ArrayList r3 = this.p.l();
        int r4 = r3.size();
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r5 >= r4) goto L27;
        tu2 r7 = (tu2) r3.get(r5);
        if ((r7.x & 32) != 32) goto L24;
        View r8 = r12.getChildAt(r6);
        if ((r8 instanceof hv2) == false) goto L14;
        tu2 r9 = ((hv2) r8).getItemData();
    L15:
        View r10 = b(r7, r8, r12);
        if (r7 == r9) goto L18;
        r10.setPressed(false);
        r10.jumpDrawablesToCurrentState();
    L18:
        if (r10 == r8) goto L23;
        ViewGroup r13 = (ViewGroup) r10.getParent();
        if (r13 == null) goto L22;
        r13.removeView(r10);
    L22:
        ((ViewGroup) this.u).addView(r10, r6);
    L23:
        r6 = r6 + 1;
        goto L24
    L14:
        r9 = null;
    L24:
        r5 = r5 + 1;
    L27:
        if (r6 >= r12.getChildCount()) goto L32;
        if (r12.getChildAt(r6) == this.w) goto L30;
        r12.removeViewAt(r6);
        goto L27
    L30:
        r6 = r6 + 1;
        goto L27
    L25:
        r6 = 0;
    L32:
        ((View) this.u).requestLayout();
        qu2 r14 = this.p;
        if (r14 == null) goto L37;
        r14.i();
        ArrayList r15 = r14.i;
        int r16 = r15.size();
        int r17 = 0;
    L35:
        if (r17 >= r16) goto L37;
        e5 r18 = ((tu2) r15.get(r17)).A;
        r17 = r17 + 1;
    L37:
        qu2 r19 = this.p;
        if (r19 == null) goto L41;
        r19.i();
        r0 = r19.j;
    L41:
        if (this.z == false) goto L48;
        if (r0 == null) goto L48;
        int r110 = r0.size();
        if (r110 != 1) goto L46;
        r1 = !((tu2) r0.get(0)).C;
        goto L48
    L46:
        if (r110 <= 0) goto L48;
        r1 = true;
    L48:
        v4 r111 = this.w;
        if (r1 == false) goto L57;
        if (r111 != null) goto L52;
        this.w = new v4(this, this.n);
    L52:
        ViewGroup r112 = (ViewGroup) this.w.getParent();
        if (r112 == this.u) goto L61;
        if (r112 == null) goto L56;
        r112.removeView(this.w);
    L56:
        ActionMenuView r113 = (ActionMenuView) this.u;
        v4 r20 = this.w;
        r113.getClass();
        a5 r21 = ActionMenuView.j();
        r21.a = true;
        r113.addView(r20, r21);
    L61:
        ((ActionMenuView) this.u).setOverflowReserved(this.z);
        return;
    L57:
        if (r111 == null) goto L61;
        Object r114 = r111.getParent();
        Object r22 = this.u;
        if (r114 != r22) goto L61;
        ((ViewGroup) r22).removeView(this.w);
        goto L61
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv2
    public final boolean d(en4 r9) {
        if (r9.hasVisibleItems() == false) goto L21;
        en4 r0 = r9;
    L6:
        qu2 r2 = r0.z;
        if (r2 == this.p) goto L9;
        r0 = (en4) r2;
        goto L6
    L9:
        tu2 r1 = r0.A;
        ViewGroup r3 = (ViewGroup) this.u;
        View r4 = null;
        r4 = null;
        if (r3 == null) goto L20;
        int r5 = r3.getChildCount();
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L20;
        View r7 = r3.getChildAt(r6);
        if ((r7 instanceof hv2) == false) goto L19;
        if (((hv2) r7).getItemData() != r1) goto L19;
        r4 = r7;
    L19:
        r6 = r6 + 1;
    L20:
        if (r4 == null) goto L21;
        this.L = r9.A.a;
        int r8 = r9.f.size();
        int r10 = 0;
    L24:
        if (r10 >= r8) goto L31;
        MenuItem r11 = r9.getItem(r10);
        if (r11.isVisible() == false) goto L30;
        if (r11.getIcon() == null) goto L30;
        boolean r12 = true;
    L32:
        t4 r13 = new t4(this, this.o, r9, r4);
        this.H = r13;
        r13.g = r12;
        yu2 r14 = r13.i;
        if (r14 == null) goto L35;
        r14.q(r12);
    L35:
        t4 r15 = this.H;
        if (r15.b() == false) goto L39;
    L41:
        fv2 r16 = this.r;
        if (r16 == null) goto L44;
        r16.w(r9);
    L44:
        return true;
    L39:
        if (r15.e == null) goto L45;
        r15.d(0, 0, false, false);
        goto L41
    L45:
        kf2.o("MenuPopupHelper cannot be used without an anchor");
        return false;
    L30:
        r10 = r10 + 1;
        goto L24
    L31:
        r12 = false;
    L21:
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        y4 r0 = this;
        qu2 r1 = r0.p;
        if (r1 == null) goto L5;
        ArrayList r2 = r1.l();
        int r4 = r2.size();
    L6:
        int r5 = r0.D;
        int r6 = r0.C;
        int r7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup r8 = (ViewGroup) r0.u;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r12 = 0;
    L7:
        int r13 = 2;
        boolean r14 = true;
        if (r9 >= r4) goto L23;
        tu2 r15 = (tu2) r2.get(r9);
        int r3 = r15.y;
        if ((r3 & 2) != 2) goto L13;
        r11 = r11 + 1;
    L17:
        if (r0.E == false) goto L21;
        if (r15.C == false) goto L21;
        r5 = 0;
    L21:
        r9 = r9 + 1;
        goto L7
    L13:
        if ((r3 & 1) != 1) goto L15;
        r12 = r12 + 1;
        goto L17
    L15:
        r10 = true;
        goto L17
    L23:
        if (r0.z == false) goto L28;
        if (r10 == false) goto L26;
    L27:
        r5 = r5 - 1;
        goto L28
    L26:
        if ((r12 + r11) > r5) goto L27;
    L28:
        int r16 = r5 - r11;
        SparseBooleanArray r17 = r0.F;
        r17.clear();
        int r18 = 0;
        int r19 = 0;
    L29:
        if (r18 >= r4) goto L80;
        tu2 r110 = (tu2) r2.get(r18);
        int r111 = r110.y;
        if ((r111 & 2) != r13) goto L33;
        boolean r112 = r14;
    L34:
        int r113 = r110.b;
        if (r112 == false) goto L44;
        View r114 = r0.b(r110, null, r8);
        r114.measure(r7, r7);
        int r115 = r114.getMeasuredWidth();
        r6 = r6 - r115;
        if (r19 != 0) goto L39;
        r19 = r115;
    L39:
        if (r113 == 0) goto L41;
        r17.put(r113, r14);
    L41:
        r110.g(r14);
    L78:
        r18 = r18 + 1;
        r13 = 2;
        r0 = this;
        r14 = true;
        goto L29
    L44:
        if ((r111 & 1) != r14) goto L77;
        boolean r116 = r17.get(r113);
        if (r16 > 0) goto L48;
        if (r116 == true) goto L48;
    L50:
        boolean r117 = false;
    L52:
        if (r117 == false) goto L61;
        View r118 = r0.b(r110, null, r8);
        r118.measure(r7, r7);
        int r119 = r118.getMeasuredWidth();
        r6 = r6 - r119;
        if (r19 != 0) goto L57;
        r19 = r119;
    L57:
        if ((r6 + r19) <= 0) goto L59;
        boolean r120 = true;
    L60:
        r117 = r117 & r120;
        goto L61
    L59:
        r120 = false;
    L61:
        if (r117 == false) goto L64;
        if (r113 == 0) goto L64;
        r17.put(r113, true);
    L74:
        if (r117 == false) goto L76;
        r16 = r16 - 1;
    L76:
        r110.g(r117);
    L64:
        if (r116 == false) goto L74;
        r17.put(r113, false);
        int r121 = 0;
    L66:
        if (r121 >= r18) goto L74;
        tu2 r122 = (tu2) r2.get(r121);
        if (r122.b != r113) goto L73;
        if ((r122.x & 32) != 32) goto L72;
        r16 = r16 + 1;
    L72:
        r122.g(false);
    L73:
        r121 = r121 + 1;
    L48:
        if (r6 <= 0) goto L50;
        r117 = r14;
        goto L52
    L77:
        r110.g(false);
        goto L78
    L33:
        r112 = false;
        goto L34
    L80:
        return r14;
    L5:
        r4 = 0;
        r2 = null;
        goto L6
    }

    public final boolean f() {
        lg1 r0 = this.I;
        if (r0 == null) goto L8;
        Object r2 = this.u;
        if (r2 == null) goto L8;
        ((View) r2).removeCallbacks(r0);
        this.I = null;
        return true;
    L8:
        t4 r3 = this.G;
        if (r3 != null) goto L11;
        return false;
    L11:
        if (r3.b() == false) goto L13;
        r3.i.dismiss();
    L13:
        return true;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return this.v;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r2) {
        if ((r2 instanceof x4) == false) goto L13;
        int r3 = ((x4) r2).n;
        if (r3 <= 0) goto L11;
        MenuItem r4 = this.p.findItem(r3);
        if (r4 == null) goto L12;
        d((en4) r4.getSubMenu());
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.gv2
    public final void i(fv2 r1) {
        throw null;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r1) {
        return false;
    }

    public final boolean k() {
        t4 r0 = this.G;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.b() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context r5, qu2 r6) {
        this.o = r5;
        LayoutInflater.from(r5);
        this.p = r6;
        Resources r7 = r5.getResources();
        if (this.A == true) goto L5;
        this.z = true;
    L5:
        int r1 = 2;
        this.B = r5.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration r8 = r5.getResources().getConfiguration();
        int r0 = r8.screenWidthDp;
        int r2 = r8.screenHeightDp;
        if (r8.smallestScreenWidthDp > 600) goto L26;
        if (r0 > 600) goto L26;
        if (r0 <= 960) goto L11;
        if (r2 > 720) goto L26;
    L11:
        if (r0 <= 720) goto L15;
        if (r2 > 960) goto L26;
    L15:
        if (r0 < 500) goto L17;
    L25:
        r1 = 4;
    L27:
        this.D = r1;
        int r9 = this.B;
        if (this.z == true) goto L30;
        this.w = null;
    L37:
        this.C = r9;
        float r4 = r7.getDisplayMetrics().density;
        return;
    L30:
        if (this.w != null) goto L35;
        v4 r3 = new v4(this, this.n);
        this.w = r3;
        if (this.y == false) goto L34;
        r3.setImageDrawable(this.x);
        this.x = null;
        this.y = false;
    L34:
        int r10 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.w.measure(r10, r10);
    L35:
        r9 = r9 - this.w.getMeasuredWidth();
        goto L37
    L17:
        if (r0 <= 640) goto L19;
        if (r2 > 480) goto L25;
    L19:
        if (r0 <= 480) goto L23;
        if (r2 > 640) goto L25;
    L23:
        if (r0 < 360) goto L27;
        r1 = 3;
    L26:
        r1 = 5;
        goto L27
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        x4 r0 = new x4();
        r0.n = this.L;
        return r0;
    }

    public final boolean n() {
        boolean r1 = false;
        if (this.z == true) goto L5;
    L16:
        return false;
    L5:
        if (k() == true) goto L16;
        qu2 r0 = this.p;
        if (r0 == null) goto L16;
        if (this.u == null) goto L16;
        if (this.I != null) goto L16;
        r0.i();
        if (r0.j.isEmpty() == true) goto L16;
        lg1 r2 = new lg1(this, new t4(this, this.o, this.p, this.w), r1, 1);
        this.I = r2;
        ((View) this.u).post(r2);
        return true;
    }
}
