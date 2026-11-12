package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia5 extends l93 implements n4 {
    public static final AccelerateInterpolator B = null;
    public static final DecelerateInterpolator C = null;
    public final oz4 A;
    public Context d;
    public Context e;
    public ActionBarOverlayLayout f;
    public ActionBarContainer g;
    public fj0 h;
    public ActionBarContextView i;
    public final View j;
    public boolean k;
    public ha5 l;
    public ha5 m;
    public rm3 n;
    public boolean o;
    public final ArrayList p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public t75 v;
    public boolean w;
    public boolean x;
    public final ga5 y;
    public final ga5 z;

    static {
        B = new AccelerateInterpolator();
        C = new DecelerateInterpolator();
    }

    public ia5(Activity r4, boolean r5) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new ga5(this, 0);
        this.z = new ga5(this, 1);
        this.A = new oz4(this);
        View r6 = r4.getWindow().getDecorView();
        v0(r6);
        if (r5 == true) goto L6;
        this.j = r6.findViewById(R.id.content);
        return;
    }

    @Override // defpackage.l93
    public final void D(boolean r2) {
        if (r2 == this.o) goto L10;
        this.o = r2;
        ArrayList r1 = this.p;
        if (r1.size() > 0) goto L8;
        return;
    L8:
        r1.get(0).getClass();
        kf2.k();
        return;
    }

    @Override // defpackage.l93
    public final int I() {
        return ((gv4) this.h).b;
    }

    @Override // defpackage.l93
    public final Context J() {
        if (this.e != null) goto L9;
        TypedValue r0 = new TypedValue();
        this.d.getTheme().resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, r0, true);
        int r1 = r0.resourceId;
        if (r1 == 0) goto L7;
        this.e = new ContextThemeWrapper(this.d, r1);
        goto L9
    L7:
        this.e = this.d;
    L9:
        return this.e;
    }

    @Override // defpackage.l93
    public final void N() {
        w0(this.d.getResources().getBoolean(app.homemusic.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.l93
    public final boolean P(int r4, KeyEvent r5) {
        ha5 r3 = this.l;
        if (r3 == null) goto L13;
        qu2 r6 = r3.q;
        if (r6 == null) goto L13;
        boolean r2 = true;
        if (KeyCharacterMap.load(r5.getDeviceId()).getKeyboardType() != 1) goto L11;
        r2 = false;
    L11:
        r6.setQwertyMode(r2);
        return r6.performShortcut(r4, r5, 0);
    L13:
        return false;
    }

    @Override // defpackage.l93
    public final void e0(boolean r2) {
        if (this.k == true) goto L6;
        f0(r2);
        return;
    }

    @Override // defpackage.l93
    public final void f0(boolean r5) {
        if (r5 == false) goto L5;
        int r6 = 4;
    L6:
        gv4 r1 = (gv4) this.h;
        int r2 = r1.b;
        this.k = true;
        r1.a((r6 & 4) | (r2 & (-5)));
        return;
    L5:
        r6 = 0;
        goto L6
    }

    @Override // defpackage.l93
    public final void g0() {
        gv4 r2 = (gv4) this.h;
        r2.a((r2.b & (-3)) | 2);
    }

    @Override // defpackage.l93
    public final void h0(int r1) {
        ((gv4) this.h).b(r1);
    }

    @Override // defpackage.l93
    public final void i0(Drawable r3) {
        gv4 r2 = (gv4) this.h;
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
        this.w = r1;
        if (r1 == true) goto L8;
        t75 r0 = this.v;
        if (r0 == null) goto L9;
        r0.a();
        return;
    L9:
        return;
    }

    @Override // defpackage.l93
    public final void k0(String r3) {
        gv4 r2 = (gv4) this.h;
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
        gv4 r2 = (gv4) this.h;
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
    public final d5 n0(rm3 r3) {
        ha5 r0 = this.l;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        this.f.setHideOnContentScrollEnabled(false);
        this.i.e();
        ha5 r1 = new ha5(this, this.i.getContext(), r3);
        qu2 r4 = r1.q;
        r4.y();
        boolean r2 = ((bq4) r1.r.n).s(r1, r4);     // Catch: Throwable -> L13
        r4.x();
        if (r2 == false) goto L11;
        this.l = r1;
        r1.g();
        this.i.c(r1);
        u0(true);
        return r1;
    L11:
        return null;
    L13:
        th = move-exception;
        r4.x();
        throw th;
    }

    @Override // defpackage.l93
    public final boolean s() {
        fj0 r1 = this.h;
        if (r1 == null) goto L16;
        yu4 r0 = ((gv4) r1).a.c0;
        if (r0 != null) goto L7;
        return false;
    L7:
        if (r0.o == null) goto L20;
        yu4 r2 = ((gv4) r1).a.c0;
        if (r2 != null) goto L11;
        tu2 r3 = null;
    L12:
        if (r3 == null) goto L18;
        r3.collapseActionView();
        return true;
    L18:
        return true;
    L11:
        r3 = r2.o;
        goto L12
    L20:
        return false;
    L16:
        return false;
    }

    public final void u0(boolean r11) {
        boolean r0 = this.t;
        if (r11 == false) goto L9;
        if (r0 == true) goto L14;
        this.t = true;
        ActionBarOverlayLayout r2 = this.f;
        if (r2 == null) goto L8;
        r2.setShowingForActionMode(true);
    L8:
        x0(false);
    L14:
        boolean r1 = this.g.isLaidOut();
        fj0 r3 = this.h;
        if (r1 == true) goto L17;
        if (r11 == false) goto L32;
        ((gv4) r3).a.setVisibility(4);
        this.i.setVisibility(0);
        return;
    L32:
        ((gv4) r3).a.setVisibility(0);
        this.i.setVisibility(8);
        return;
    L17:
        if (r11 == false) goto L19;
        gv4 r4 = (gv4) r3;
        s75 r12 = j65.a(r4.a);
        r12.a(0.0f);
        r12.c(100);
        r12.d(new fv4(r4, 4));
        s75 r10 = this.i.i(0, 200);
    L20:
        t75 r5 = new t75();
        ArrayList r6 = r5.a;
        r6.add(r12);
        View r13 = (View) r12.a.get();
        if (r13 == null) goto L23;
        long r7 = r13.animate().getDuration();
    L24:
        View r14 = (View) r10.a.get();
        if (r14 == null) goto L27;
        r14.animate().setStartDelay(r7);
    L27:
        r6.add(r10);
        r5.b();
        return;
    L23:
        r7 = 0;
        goto L24
    L19:
        gv4 r8 = (gv4) r3;
        s75 r15 = j65.a(r8.a);
        r15.a(1.0f);
        r15.c(200);
        r15.d(new fv4(r8, 0));
        r12 = this.i.i(8, 100);
        r10 = r15;
        goto L20
    L9:
        if (r0 == false) goto L14;
        this.t = false;
        ActionBarOverlayLayout r9 = this.f;
        if (r9 == null) goto L13;
        r9.setShowingForActionMode(false);
    L13:
        x0(false);
        goto L14
    }

    public final void v0(View r7) {
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) r7.findViewById(app.homemusic.R.id.decor_content_parent);
        this.f = r0;
        if (r0 == null) goto L5;
        r0.setActionBarVisibilityCallback(this);
    L5:
        KeyEvent.Callback r1 = r7.findViewById(app.homemusic.R.id.action_bar);
        if ((r1 instanceof fj0) == false) goto L9;
        fj0 r2 = (fj0) r1;
    L11:
        this.h = r2;
        this.i = (ActionBarContextView) r7.findViewById(app.homemusic.R.id.action_context_bar);
        ActionBarContainer r8 = (ActionBarContainer) r7.findViewById(app.homemusic.R.id.action_bar_container);
        this.g = r8;
        fj0 r3 = this.h;
        if (r3 != null) goto L14;
    L34:
        kf2.o(ia5.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        return;
    L14:
        if (this.i == null) goto L34;
        if (r8 == null) goto L34;
        Context r9 = ((gv4) r3).a.getContext();
        this.d = r9;
        if ((((gv4) this.h).b & 4) == 0) goto L19;
        boolean r4 = true;
    L20:
        if (r4 == false) goto L22;
        this.k = true;
    L22:
        int r5 = r9.getApplicationInfo().targetSdkVersion;
        this.h.getClass();
        w0(r9.getResources().getBoolean(app.homemusic.R.bool.abc_action_bar_embed_tabs));
        TypedArray r10 = this.d.obtainStyledAttributes(null, st3.a, app.homemusic.R.attr.actionBarStyle, 0);
        if (r10.getBoolean(14, false) == false) goto L29;
        ActionBarOverlayLayout r6 = this.f;
        if (r6.t == false) goto L27;
        this.x = true;
        r6.setHideOnContentScrollEnabled(true);
        goto L29
    L27:
        kf2.o("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        return;
    L29:
        int r11 = r10.getDimensionPixelSize(12, 0);
        if (r11 == 0) goto L32;
        ActionBarContainer r12 = this.g;
        WeakHashMap r13 = j65.a;
        r12.setElevation(r11);
    L32:
        r10.recycle();
        return;
    L19:
        r4 = false;
        goto L20
    L9:
        if ((r1 instanceof Toolbar) == false) goto L37;
        r2 = ((Toolbar) r1).getWrapper();
        goto L11
    L37:
        if (r1 == null) goto L39;
        String r14 = r1.getClass().getSimpleName();
    L41:
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(r14));
    L39:
        r14 = "null";
        goto L41
    }

    public final void w0(boolean r2) {
        if (r2 == true) goto L5;
        ((gv4) this.h).getClass();
        this.g.setTabContainer(null);
    L6:
        gv4 r3 = (gv4) this.h;
        r3.getClass();
        r3.a.setCollapsible(false);
        this.f.setHasNonEmbeddedTabs(false);
        return;
    L5:
        this.g.setTabContainer(null);
        ((gv4) this.h).getClass();
        goto L6
    }

    public final void x0(boolean r13) {
        boolean r0 = this.s;
        if (this.t == true) goto L7;
        if (r0 == false) goto L7;
        boolean r1 = false;
    L8:
        boolean r2 = this.u;
        int r4 = 2;
        xe r7 = null;
        oz4 r9 = this.A;
        View r10 = this.j;
        if (r1 == false) goto L53;
        if (r2 == true) goto L90;
        this.u = true;
        t75 r3 = this.v;
        if (r3 == null) goto L14;
        r3.a();
    L14:
        this.g.setVisibility(0);
        int r5 = this.q;
        ga5 r6 = this.z;
        if (r5 == 0) goto L17;
    L44:
        this.g.setAlpha(1.0f);
        this.g.setTranslationY(0.0f);
        if (this.r == false) goto L48;
        if (r10 == null) goto L48;
        r10.setTranslationY(0.0f);
    L48:
        r6.c();
    L49:
        ActionBarOverlayLayout r12 = this.f;
        if (r12 == null) goto L91;
        WeakHashMap r14 = j65.a;
        r12.requestApplyInsets();
        return;
    L91:
        return;
    L17:
        if (this.w == true) goto L19;
        if (r13 == false) goto L44;
    L19:
        this.g.setTranslationY(0.0f);
        float r8 = -this.g.getHeight();
        if (r13 == false) goto L22;
        int[] r15 = {0, 0};
        this.g.getLocationInWindow(r15);
        r8 = r8 - r15[1];
    L22:
        this.g.setTranslationY(r8);
        t75 r16 = new t75();
        s75 r11 = j65.a(this.g);
        r11.e(0.0f);
        View r17 = (View) r11.a.get();
        if (r17 == null) goto L27;
        if (r9 == null) goto L26;
        r7 = new xe(r4, r9, r17);
    L26:
        r17.animate().setUpdateListener(r7);
    L27:
        boolean r18 = r16.e;
        ArrayList r19 = r16.a;
        if (r18 == true) goto L31;
        r19.add(r11);
    L31:
        if (this.r == false) goto L36;
        if (r10 == null) goto L36;
        r10.setTranslationY(r8);
        s75 r20 = j65.a(r10);
        r20.e(0.0f);
        if (r16.e == true) goto L36;
        r19.add(r20);
    L36:
        boolean r21 = r16.e;
        if (r21 == true) goto L39;
        r16.c = C;
    L39:
        if (r21 == true) goto L41;
        r16.b = 250;
    L41:
        if (r21 == true) goto L43;
        r16.d = r6;
    L43:
        this.v = r16;
        r16.b();
        goto L49
    L90:
        return;
    L53:
        if (r2 == false) goto L92;
        this.u = false;
        t75 r22 = this.v;
        if (r22 == null) goto L57;
        r22.a();
    L57:
        int r23 = this.q;
        ga5 r24 = this.y;
        if (r23 == 0) goto L60;
    L88:
        r24.c();
        return;
    L60:
        if (this.w == true) goto L62;
        if (r13 == false) goto L88;
    L62:
        this.g.setAlpha(1.0f);
        this.g.setTransitioning(true);
        t75 r25 = new t75();
        float r26 = -this.g.getHeight();
        if (r13 == false) goto L65;
        int[] r110 = {0, 0};
        this.g.getLocationInWindow(r110);
        r26 = r26 - r110[1];
    L65:
        s75 r111 = j65.a(this.g);
        r111.e(r26);
        View r27 = (View) r111.a.get();
        if (r27 == null) goto L70;
        if (r9 == null) goto L69;
        r7 = new xe(r4, r9, r27);
    L69:
        r27.animate().setUpdateListener(r7);
    L70:
        boolean r28 = r25.e;
        ArrayList r29 = r25.a;
        if (r28 == true) goto L74;
        r29.add(r111);
    L74:
        if (this.r == false) goto L79;
        if (r10 == null) goto L79;
        s75 r112 = j65.a(r10);
        r112.e(r26);
        if (r25.e == true) goto L79;
        r29.add(r112);
    L79:
        boolean r113 = r25.e;
        if (r113 == true) goto L82;
        r25.c = B;
    L82:
        if (r113 == true) goto L84;
        r25.b = 250;
    L84:
        if (r113 == true) goto L86;
        r25.d = r24;
    L86:
        this.v = r25;
        r25.b();
        return;
    L92:
        return;
    L7:
        r1 = true;
        goto L8
    }

    public ia5(Dialog r3) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new ga5(this, 0);
        this.z = new ga5(this, 1);
        this.A = new oz4(this);
        v0(r3.getWindow().getDecorView());
    }
}
