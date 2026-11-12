package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import app.homemusic.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf implements Window.Callback {
    public final Window.Callback n;
    public om1 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final /* synthetic */ bg s;

    public xf(bg r1, Window.Callback r2) {
        this.s = r1;
        if (r2 == null) goto L6;
        this.n = r2;
        return;
    L6:
        kf2.n("Window callback may not be null");
        throw null;
    }

    public final void a(Window.Callback r3) {
        this.p = true;     // Catch: Throwable -> L6
        r3.onContentChanged();     // Catch: Throwable -> L6
        this.p = false;
        return;
    L6:
        th = move-exception;
        this.p = false;
        throw th;
    }

    public final boolean b(int r1, Menu r2) {
        return this.n.onMenuOpened(r1, r2);
    }

    public final void c(int r1, Menu r2) {
        this.n.onPanelClosed(r1, r2);
    }

    public final void d(List r1, Menu r2, int r3) {
        ea5.a(this.n, r1, r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r1) {
        return this.n.dispatchGenericMotionEvent(r1);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r3) {
        boolean r0 = this.q;
        Window.Callback r1 = this.n;
        if (r0 == false) goto L7;
        return r1.dispatchKeyEvent(r3);
    L7:
        if (this.s.z(r3) == false) goto L9;
        return true;
    L9:
        if (r1.dispatchKeyEvent(r3) == true) goto L15;
        return false;
    L15:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r5) {
        if (this.n.dispatchKeyShortcutEvent(r5) == true) goto L23;
        int r0 = r5.getKeyCode();
        bg r4 = this.s;
        r4.G();
        l93 r2 = r4.A;
        if (r2 != null) goto L7;
    L9:
        ag r1 = r4.Z;
        if (r1 == null) goto L18;
        if (r4.L(r1, r5.getKeyCode(), r5) == false) goto L18;
        ag r6 = r4.Z;
        if (r6 == null) goto L23;
        r6.l = true;
        return true;
    L18:
        if (r4.Z != null) goto L22;
        ag r3 = r4.F(0);
        r4.M(r3, r5);
        boolean r7 = r4.L(r3, r5.getKeyCode(), r5);
        r3.k = false;
        if (r7 == true) goto L23;
    L22:
        return false;
    L7:
        if (r2.P(r0, r5) == false) goto L9;
    L23:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return this.n.dispatchPopulateAccessibilityEvent(r1);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r1) {
        return this.n.dispatchTouchEvent(r1);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r1) {
        return this.n.dispatchTrackballEvent(r1);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r1) {
        this.n.onActionModeFinished(r1);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r1) {
        this.n.onActionModeStarted(r1);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.n.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.p == false) goto L6;
        this.n.onContentChanged();
        return;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        if (r2 != 0) goto L8;
        if ((r3 instanceof qu2) == true) goto L8;
        return false;
    L8:
        return this.n.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r3) {
        om1 r0 = this.o;
        if (r0 == null) goto L10;
        if (r3 != 0) goto L6;
        View r1 = new View(((cv4) r0.o).d.a.getContext());
    L7:
        if (r1 == null) goto L10;
        return r1;
    L6:
        r1 = null;
    L10:
        return this.n.onCreatePanelView(r3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.n.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, MenuItem r2) {
        return this.n.onMenuItemSelected(r1, r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, Menu r3) {
        b(r2, r3);
        if (r2 != 108) goto L7;
        bg r1 = this.s;
        r1.G();
        l93 r4 = r1.A;
        if (r4 == null) goto L7;
        r4.D(true);
    L7:
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, Menu r3) {
        if (this.r == false) goto L6;
        this.n.onPanelClosed(r2, r3);
        return;
    L6:
        c(r2, r3);
        bg r1 = this.s;
        if (r2 != 108) goto L12;
        r1.G();
        l93 r4 = r1.A;
        if (r4 == null) goto L17;
        r4.D(false);
        return;
    L17:
        return;
    L12:
        if (r2 != 0) goto L18;
        ag r5 = r1.F(r2);
        if (r5.m == false) goto L19;
        r1.w(r5, false);
        return;
    L19:
        return;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r1) {
        fa5.a(this.n, r1);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r6, View r7, Menu r8) {
        if ((r8 instanceof qu2) == false) goto L5;
        qu2 r0 = (qu2) r8;
    L7:
        if (r6 != 0) goto L11;
        if (r0 != null) goto L11;
        return false;
    L11:
        if (r0 == null) goto L13;
        r0.x = true;
    L13:
        om1 r3 = this.o;
        if (r3 == null) goto L19;
        if (r6 != 0) goto L19;
        cv4 r4 = (cv4) r3.o;
        if (r4.g == true) goto L19;
        r4.d.l = true;
        r4.g = true;
    L19:
        boolean r5 = this.n.onPreparePanel(r6, r7, r8);
        if (r0 == null) goto L22;
        r0.x = false;
    L22:
        return r5;
    L5:
        r0 = null;
        goto L7
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List r3, Menu r4, int r5) {
        qu2 r0 = this.s.F(0).h;
        if (r0 == null) goto L6;
        d(r3, r0, r5);
        return;
    L6:
        d(r3, r4, r5);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r1) {
        return da5.a(this.n, r1);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r1) {
        this.n.onWindowAttributesChanged(r1);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r1) {
        this.n.onWindowFocusChanged(r1);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r8, int r9) {
        bg r0 = this.s;
        Context r1 = r0.x;
        if (r0.L == false) goto L62;
        if (r9 != 0) goto L62;
        bq4 r7 = new bq4(r1, r8);
        d5 r10 = r0.G;
        if (r10 == null) goto L9;
        r10.a();
    L9:
        rm3 r11 = new rm3(r0, r7);
        r0.G();
        l93 r12 = r0.A;
        if (r12 == null) goto L13;
        r0.G = r12.n0(r11);
    L13:
        if (r0.G != null) goto L57;
        s75 r13 = r0.K;
        if (r13 == null) goto L17;
        r13.b();
    L17:
        d5 r14 = r0.G;
        if (r14 == null) goto L20;
        r14.a();
    L20:
        int r3 = 1;
        if (r0.H != null) goto L32;
        if (r0.V == false) goto L28;
        TypedValue r15 = new TypedValue();
        Resources.Theme r5 = r1.getTheme();
        r5.resolveAttribute(R.attr.actionBarTheme, r15, true);
        if (r15.resourceId == 0) goto L27;
        Resources.Theme r6 = r1.getResources().newTheme();
        r6.setTo(r5);
        r6.applyStyle(r15.resourceId, true);
        ud0 r16 = new ud0(r1, 0);
        r16.getTheme().setTo(r6);
        r1 = r16;
    L27:
        r0.H = new ActionBarContextView(r1);
        PopupWindow r17 = new PopupWindow(r1, null, R.attr.actionModePopupWindowStyle);
        r0.I = r17;
        r17.setWindowLayoutType(2);
        r0.I.setContentView(r0.H);
        r0.I.setWidth(-1);
        r1.getTheme().resolveAttribute(R.attr.actionBarSize, r15, true);
        r0.H.setContentHeight(TypedValue.complexToDimensionPixelSize(r15.data, r1.getResources().getDisplayMetrics()));
        r0.I.setHeight(-2);
        r0.J = new qf(r0, r3);
        goto L32
    L28:
        ViewStubCompat r18 = (ViewStubCompat) r0.N.findViewById(R.id.action_mode_bar_stub);
        if (r18 == null) goto L32;
        r18.setLayoutInflater(LayoutInflater.from(r0.D()));
        r0.H = (ActionBarContextView) r18.a();
    L32:
        if (r0.H == null) goto L56;
        s75 r19 = r0.K;
        if (r19 == null) goto L36;
        r19.b();
    L36:
        r0.H.e();
        Context r2 = r0.H.getContext();
        ActionBarContextView r20 = r0.H;
        rk4 r21 = new rk4();
        r21.p = r2;
        r21.q = r20;
        r21.r = r11;
        qu2 r4 = new qu2(r20.getContext());
        r4.l = 1;
        r21.u = r4;
        r4.e = r21;
        if (((bq4) r11.n).s(r21, r4) == false) goto L55;
        r21.g();
        r0.H.c(r21);
        r0.G = r21;
        if (r0.M == false) goto L45;
        ViewGroup r22 = r0.N;
        if (r22 == null) goto L45;
        if (r22.isLaidOut() == false) goto L45;
        boolean r23 = true;
    L46:
        ActionBarContextView r24 = r0.H;
        if (r23 == false) goto L49;
        r24.setAlpha(0.0f);
        s75 r25 = j65.a(r0.H);
        r25.a(1.0f);
        r0.K = r25;
        r25.d(new sf(r3, r0));
    L53:
        if (r0.I == null) goto L56;
        r0.y.getDecorView().post(r0.J);
        goto L56
    L49:
        r24.setAlpha(1.0f);
        r0.H.setVisibility(0);
        if ((r0.H.getParent() instanceof View) == false) goto L53;
        View r26 = (View) r0.H.getParent();
        WeakHashMap r27 = j65.a;
        r26.requestApplyInsets();
    L45:
        r23 = false;
        goto L46
    L55:
        r0.G = null;
    L56:
        r0.O();
        r0.G = r0.G;
    L57:
        r0.O();
        d5 r28 = r0.G;
        if (r28 != null) goto L60;
        return null;
    L60:
        return r7.i(r28);
    L62:
        return da5.b(this.n, r8, r9);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.n.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r1) {
        return null;
    }
}
