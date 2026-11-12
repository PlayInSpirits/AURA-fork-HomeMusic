package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz extends yu2 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public fv2 J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context o;
    public final int p;
    public final int q;
    public final boolean r;
    public final Handler s;
    public final ArrayList t;
    public final ArrayList u;
    public final sg v;
    public final bc w;
    public final d34 x;
    public int y;
    public int z;

    public uz(Context r5, View r6, int r7, boolean r8) {
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new sg(2, this);
        int r2 = 1;
        this.w = new bc(r2, this);
        this.x = new d34(13, this);
        this.y = 0;
        this.z = 0;
        this.o = r5;
        this.A = r6;
        this.q = r7;
        this.r = r8;
        this.H = false;
        if (r6.getLayoutDirection() != 1) goto L5;
        r2 = 0;
    L5:
        this.C = r2;
        Resources r9 = r5.getResources();
        this.p = Math.max(r9.getDisplayMetrics().widthPixels / 2, r9.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = new Handler();
    }

    @Override // defpackage.gv2
    public final void a(qu2 r7, boolean r8) {
        ArrayList r0 = this.u;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r7 == ((tz) r0.get(r3)).b) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L43;
        int r2 = r3 + 1;
        if (r2 >= r0.size()) goto L14;
        ((tz) r0.get(r2)).b.c(false);
    L14:
        tz r4 = (tz) r0.remove(r3);
        qu2 r5 = r4.b;
        ev2 r6 = r4.a;
        lg r9 = r6.M;
        r5.r(this);
        if (this.M == false) goto L17;
        bv2.b(r9, null);
        r9.setAnimationStyle(0);
    L17:
        r6.dismiss();
        int r10 = r0.size();
        if (r10 <= 0) goto L21;
        this.C = ((tz) r0.get(r10 - 1)).c;
    L25:
        if (r10 != 0) goto L37;
        dismiss();
        fv2 r11 = this.J;
        if (r11 == null) goto L29;
        r11.a(r7, true);
    L29:
        ViewTreeObserver r12 = this.K;
        if (r12 != null) goto L32;
    L35:
        this.B.removeOnAttachStateChangeListener(this.w);
        this.L.onDismiss();
        return;
    L32:
        if (r12.isAlive() == false) goto L34;
        this.K.removeGlobalOnLayoutListener(this.v);
    L34:
        this.K = null;
        goto L35
    L37:
        if (r8 == false) goto L42;
        ((tz) r0.get(0)).b.c(false);
        return;
    L42:
        return;
    L21:
        if (this.A.getLayoutDirection() != 1) goto L23;
        int r13 = 0;
    L24:
        this.C = r13;
        goto L25
    L23:
        r13 = 1;
        goto L24
    L43:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // defpackage.nd4
    public final boolean b() {
        ArrayList r2 = this.u;
        if (r2.size() > 0) goto L5;
    L8:
        return false;
    L5:
        if (((tz) r2.get(0)).a.M.isShowing() == false) goto L8;
        return true;
    }

    @Override // defpackage.gv2
    public final void c(boolean r4) {
        ArrayList r3 = this.u;
        int r5 = r3.size();
        int r0 = 0;
    L3:
        if (r0 >= r5) goto L9;
        Object r1 = r3.get(r0);
        r0 = r0 + 1;
        ListAdapter r2 = ((tz) r1).a.p.getAdapter();
        if ((r2 instanceof HeaderViewListAdapter) == false) goto L8;
        r2 = ((HeaderViewListAdapter) r2).getWrappedAdapter();
    L8:
        ((nu2) r2).notifyDataSetChanged();
        goto L3
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r8) {
        ArrayList r0 = this.u;
        int r1 = r0.size();
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L10;
        Object r5 = r0.get(r3);
        r3 = r3 + 1;
        tz r6 = (tz) r5;
        if (r8 != r6.b) goto L4;
        r6.a.p.requestFocus();
        return true;
    L10:
        if (r8.hasVisibleItems() == false) goto L15;
        n(r8);
        fv2 r7 = this.J;
        if (r7 == null) goto L14;
        r7.w(r8);
    L14:
        return true;
    L15:
        return false;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        ArrayList r3 = this.u;
        int r0 = r3.size();
        if (r0 <= 0) goto L10;
        tz[] r4 = (tz[]) r3.toArray(new tz[r0]);
        int r1 = r0 - 1;
    L5:
        if (r1 < 0) goto L14;
        tz r2 = r4[r1];
        if (r2.a.M.isShowing() == false) goto L9;
        r2.a.dismiss();
    L9:
        r1 = r1 - 1;
        goto L5
    L14:
        return;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.nd4
    public final void f() {
        if (b() == true) goto L20;
        ArrayList r0 = this.t;
        int r1 = r0.size();
        boolean r2 = false;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        w((qu2) r4);
        goto L6
    L8:
        r0.clear();
        View r5 = this.A;
        this.B = r5;
        if (r5 != null) goto L11;
        return;
    L11:
        if (this.K != null) goto L13;
        r2 = true;
    L13:
        ViewTreeObserver r6 = r5.getViewTreeObserver();
        this.K = r6;
        if (r2 == false) goto L16;
        r6.addOnGlobalLayoutListener(this.v);
    L16:
        this.B.addOnAttachStateChangeListener(this.w);
        return;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r1) {
    }

    @Override // defpackage.gv2
    public final void i(fv2 r1) {
        this.J = r1;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        ArrayList r1 = this.u;
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return ((tz) r1.get(r1.size() - 1)).a.p;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.yu2
    public final void n(qu2 r2) {
        r2.b(this, this.o);
        if (b() == false) goto L6;
        w(r2);
        return;
    L6:
        this.t.add(r2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ArrayList r5 = this.u;
        int r0 = r5.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        tz r3 = (tz) r5.get(r2);
        if (r3.a.M.isShowing() == false) goto L9;
        r2 = r2 + 1;
    L9:
        if (r3 == null) goto L14;
        r3.b.c(false);
        return;
    L14:
        return;
    L8:
        r3 = null;
        goto L9
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
    public final void p(View r2) {
        if (this.A == r2) goto L6;
        this.A = r2;
        this.z = Gravity.getAbsoluteGravity(this.y, r2.getLayoutDirection());
        return;
    }

    @Override // defpackage.yu2
    public final void q(boolean r1) {
        this.H = r1;
    }

    @Override // defpackage.yu2
    public final void r(int r2) {
        if (this.y == r2) goto L6;
        this.y = r2;
        this.z = Gravity.getAbsoluteGravity(r2, this.A.getLayoutDirection());
        return;
    }

    @Override // defpackage.yu2
    public final void s(int r2) {
        this.D = true;
        this.F = r2;
    }

    @Override // defpackage.yu2
    public final void t(PopupWindow.OnDismissListener r1) {
        this.L = r1;
    }

    @Override // defpackage.yu2
    public final void u(boolean r1) {
        this.I = r1;
    }

    @Override // defpackage.yu2
    public final void v(int r2) {
        this.E = true;
        this.G = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(qu2 r20) {
        Context r2 = this.o;
        LayoutInflater r3 = LayoutInflater.from(r2);
        nu2 r4 = new nu2(r20, r3, this.r, R.layout.abc_cascading_menu_item_layout);
        if (b() == true) goto L8;
        if (this.H == false) goto L8;
        r4.p = true;
    L19:
        int r5 = yu2.o(r4, r2, this.p);
        ev2 r8 = new ev2(r2, null, this.q, 0);
        r8.P = this.x;
        r8.C = this;
        lg r6 = r8.M;
        r6.setOnDismissListener(this);
        r8.B = this.A;
        r8.y = this.z;
        r8.L = true;
        r6.setFocusable(true);
        r6.setInputMethodMode(2);
        r8.p(r4);
        r8.r(r5);
        r8.y = this.z;
        ArrayList r7 = this.u;
        if (r7.size() <= 0) goto L52;
        tz r11 = (tz) r7.get(r7.size() - 1);
        qu2 r12 = r11.b;
        int r13 = r12.f.size();
        int r14 = 0;
    L22:
        if (r14 >= r13) goto L29;
        MenuItem r15 = r12.getItem(r14);
        if (r15.hasSubMenu() == false) goto L28;
        if (r20 != r15.getSubMenu()) goto L28;
    L30:
        if (r15 != null) goto L32;
        char r17 = 0;
        View r9 = null;
    L53:
        if (r9 == null) goto L94;
        if (Build.VERSION.SDK_INT > 28) goto L62;
        Method r10 = ev2.Q;
        if (r10 == null) goto L63;
        Object[] r16 = new Object[1];     // Catch: Exception -> L61
        r16[r17] = Boolean.FALSE;     // Catch: Exception -> L61
        r10.invoke(r6, r16);     // Catch: Exception -> L61
    L61:
        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
    L63:
        bv2.a(r6, null);
        cx0 r18 = ((tz) r7.get(r7.size() - 1)).a.p;
        int[] r19 = new int[2];
        r18.getLocationOnScreen(r19);
        Rect r21 = new Rect();
        this.B.getWindowVisibleDisplayFrame(r21);
        if (this.C != 1) goto L71;
        if (((r18.getWidth() + r19[0]) + r5) <= r21.right) goto L69;
        int r22 = 0;
    L74:
        if (r22 != 1) goto L76;
        boolean r23 = true;
    L77:
        this.C = r22;
        if (Build.VERSION.SDK_INT < 26) goto L80;
        r8.B = r9;
        int r24 = 0;
        int r25 = 0;
    L85:
        if ((this.z & 5) != 5) goto L90;
        if (r23 == false) goto L88;
        int r26 = r25 + r5;
    L92:
        r8.s = r26;
        r8.x = true;
        r8.w = true;
        r8.j(r24);
    L104:
        r7.add(new tz(r8, r20, this.C));
        r8.f();
        cx0 r27 = r8.p;
        r27.setOnKeyListener(this);
        if (r11 == null) goto L107;
        return;
    L107:
        if (this.I == true) goto L109;
        return;
    L109:
        if (r20.m == null) goto L126;
        FrameLayout r0 = (FrameLayout) r3.inflate(R.layout.abc_popup_menu_header_item_layout, r27, false);
        TextView r28 = (TextView) r0.findViewById(android.R.id.title);
        r0.setEnabled(false);
        r28.setText(r20.m);
        r27.addHeaderView(r0, null, false);
        r8.f();
        return;
    L126:
        return;
    L88:
        r5 = r9.getWidth();
    L89:
        r26 = r25 - r5;
        goto L92
    L90:
        if (r23 == false) goto L89;
        r26 = r25 + r9.getWidth();
        goto L92
    L80:
        int[] r29 = new int[2];
        this.A.getLocationOnScreen(r29);
        int[] r30 = new int[2];
        r9.getLocationOnScreen(r30);
        if ((this.z & 7) != 5) goto L83;
        r29[0] = this.A.getWidth() + r29[0];
        r30[0] = r9.getWidth() + r30[0];
    L83:
        int r110 = r30[0] - r29[0];
        r24 = r30[1] - r29[1];
        r25 = r110;
        goto L85
    L76:
        r23 = false;
    L69:
        r22 = 1;
        goto L74
    L71:
        if ((r19[0] - r5) < 0) goto L69;
        r22 = 0;
        goto L74
    L62:
        cv2.a(r6, r17);
        goto L63
    L94:
        if (this.D == false) goto L97;
        r8.s = this.F;
    L97:
        if (this.E == false) goto L99;
        r8.j(this.G);
    L99:
        Rect r31 = this.n;
        if (r31 == null) goto L102;
        Rect r32 = new Rect(r31);
    L103:
        r8.K = r32;
        goto L104
    L102:
        r32 = null;
        goto L103
    L32:
        cx0 r33 = r11.a.p;
        ListAdapter r111 = r33.getAdapter();
        if ((r111 instanceof HeaderViewListAdapter) == false) goto L35;
        HeaderViewListAdapter r112 = (HeaderViewListAdapter) r111;
        int r113 = r112.getHeadersCount();
        nu2 r114 = (nu2) r112.getWrappedAdapter();
    L36:
        int r115 = r114.getCount();
        int r116 = 0;
        r17 = 0;
    L38:
        if (r116 >= r115) goto L43;
        if (r15 == r114.b(r116)) goto L44;
        r116 = r116 + 1;
    L44:
        if (r116 != (-1)) goto L46;
    L45:
        r9 = null;
        goto L53
    L46:
        int r117 = (r116 + r113) - r33.getFirstVisiblePosition();
        if (r117 < 0) goto L45;
        if (r117 >= r33.getChildCount()) goto L45;
        r9 = r33.getChildAt(r117);
        goto L53
    L43:
        r116 = -1;
        goto L44
    L35:
        r114 = (nu2) r111;
        r113 = 0;
    L28:
        r14 = r14 + 1;
        goto L22
    L29:
        r15 = null;
        goto L30
    L52:
        r17 = 0;
        r9 = null;
        r11 = null;
    L8:
        if (b() == false) goto L19;
        int r34 = r20.f.size();
        int r35 = 0;
    L10:
        if (r35 >= r34) goto L17;
        MenuItem r36 = r20.getItem(r35);
        if (r36.isVisible() == false) goto L16;
        if (r36.getIcon() == null) goto L16;
        boolean r37 = true;
    L18:
        r4.p = r37;
    L16:
        r35 = r35 + 1;
        goto L10
    L17:
        r37 = false;
        goto L18
    }
}
