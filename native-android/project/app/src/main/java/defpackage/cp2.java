package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 extends View {
    public static final SparseArray B = null;
    public static final int[] C = null;
    public static final int[] D = null;
    public boolean A;
    public final yq2 n;
    public final ap2 o;
    public rq2 p;
    public tp2 q;
    public boolean r;
    public bp2 s;
    public Drawable t;
    public int u;
    public int v;
    public int w;
    public final ColorStateList x;
    public final int y;
    public final int z;

    static {
        B = new SparseArray(2);
        C = new int[]{R.attr.state_checked};
        D = new int[]{R.attr.state_checkable};
    }

    public cp2(Context r9) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(r9, fu.z(r9));
        int r10 = fu.B(r0, app.homemusic.R.attr.mediaRouteTheme);
        if (r10 == 0) goto L5;
        r0 = new ContextThemeWrapper(r0, r10);
    L5:
        super(r0, null, app.homemusic.R.attr.mediaRouteButtonStyle);
        this.p = rq2.c;
        this.q = tp2.a;
        Context r2 = getContext();
        int[] r3 = qt3.a;
        int r11 = 0;
        TypedArray r5 = r2.obtainStyledAttributes(null, r3, app.homemusic.R.attr.mediaRouteButtonStyle, 0);
        j65.n(this, r2, r3, null, r5, app.homemusic.R.attr.mediaRouteButtonStyle, 0);
        if (isInEditMode() == false) goto L9;
        this.n = null;
        this.o = null;
        this.t = zz1.r(r2, r5.getResourceId(3, 0));
        return;
    L9:
        this.n = yq2.d(r2);
        this.o = new ap2(this, r11);
        yq2.b();
        wq2 r8 = yq2.c().g();
        if (r8.d() == true) goto L12;
        int r12 = r8.i;
    L13:
        this.w = r12;
        this.v = r12;
        this.x = r5.getColorStateList(4);
        this.y = r5.getDimensionPixelSize(0, 0);
        this.z = r5.getDimensionPixelSize(1, 0);
        int r1 = r5.getResourceId(3, 0);
        this.u = r5.getResourceId(2, 0);
        r5.recycle();
        int r4 = this.u;
        SparseArray r6 = B;
        if (r4 == 0) goto L19;
        Drawable.ConstantState r7 = (Drawable.ConstantState) r6.get(r4);
        if (r7 == null) goto L19;
        setRemoteIndicatorDrawable(r7.newDrawable());
    L19:
        if (this.t != null) goto L26;
        if (r1 == 0) goto L25;
        Drawable.ConstantState r13 = (Drawable.ConstantState) r6.get(r1);
        if (r13 == null) goto L24;
        setRemoteIndicatorDrawableInternal(r13.newDrawable());
        goto L26
    L24:
        bp2 r14 = new bp2(this, r1, getContext());
        this.s = r14;
        r14.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        goto L26
    L25:
        a();
    L26:
        d();
        setClickable(true);
        return;
    L12:
        r12 = 0;
        goto L13
    }

    private Activity getActivity() {
        Context r1 = getContext();
    L4:
        if ((r1 instanceof ContextWrapper) == false) goto L10;
        if ((r1 instanceof Activity) == true) goto L8;
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L4
    L8:
        return (Activity) r1;
    L10:
        return null;
    }

    private ld1 getFragmentManager() {
        Activity r1 = getActivity();
        if ((r1 instanceof nc1) == true) goto L5;
        return null;
    L5:
        return ((nc1) r1).k();
    }

    public final void a() {
        if (this.u <= 0) goto L9;
        bp2 r0 = this.s;
        if (r0 == null) goto L7;
        r0.cancel(false);
    L7:
        bp2 r1 = new bp2(this, this.u, getContext());
        this.s = r1;
        this.u = 0;
        r1.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        return;
    }

    public final void b() {
        this.n.getClass();
        yq2.b();
        wq2 r0 = yq2.c().g();
        if (r0.d() == true) goto L5;
        int r1 = r0.i;
    L7:
        if (this.w == r1) goto L10;
        this.w = r1;
        d();
        refreshDrawableState();
    L10:
        if (r1 != 1) goto L13;
        a();
        return;
    L13:
        return;
    L5:
        r1 = 0;
        goto L7
    }

    public final boolean c() {
        if (this.r == true) goto L5;
        return false;
    L5:
        yq2 r0 = this.n;
        r0.getClass();
        yq2.b();
        yq2.c().getClass();
        ld1 r2 = getFragmentManager();
        if (r2 == null) goto L62;
        r0.getClass();
        yq2.b();
        if (yq2.c().g().d() == false) goto L31;
        if (r2.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) goto L13;
        Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
        return false;
    L13:
        this.q.getClass();
        fp2 r5 = new fp2();
        rq2 r9 = this.p;
        if (r9 == null) goto L28;
        r5.n0();
        if (r5.D0.equals(r9) == true) goto L26;
        r5.D0 = r9;
        Bundle r3 = r5.s;
        if (r3 != null) goto L20;
        r3 = new Bundle();
    L20:
        r3.putBundle("selector", r9.a);
        r5.c0(r3);
        dg r4 = r5.C0;
        if (r4 == null) goto L26;
        if (r5.B0 == false) goto L25;
        ((aq2) r4).j(r9);
        goto L26
    L25:
        ((ep2) r4).k(r9);
    L26:
        po r10 = new po(r2);
        r10.g(0, r5, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
        r10.e(true);
        return true;
    L28:
        kf2.n("selector must not be null");
        return false;
    L31:
        if (r2.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) goto L34;
        Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
        return false;
    L34:
        this.q.getClass();
        rp2 r6 = new rp2();
        rq2 r11 = this.p;
        if (r11 != null) goto L37;
        kf2.n("selector must not be null");
        return false;
    L37:
        if (r6.D0 != null) goto L49;
        Bundle r7 = r6.s;
        if (r7 == null) goto L46;
        Bundle r8 = r7.getBundle("selector");
        rq2 r12 = null;
        if (r8 == null) goto L43;
        r12 = new rq2(r8, null);
    L44:
        r6.D0 = r12;
        goto L46
    L43:
        rq2 r13 = rq2.c;
    L46:
        if (r6.D0 != null) goto L49;
        r6.D0 = rq2.c;
    L49:
        if (r6.D0.equals(r11) == true) goto L58;
        r6.D0 = r11;
        Bundle r14 = r6.s;
        if (r14 != null) goto L53;
        r14 = new Bundle();
    L53:
        r14.putBundle("selector", r11.a);
        r6.c0(r14);
        dg r15 = r6.C0;
        if (r15 == null) goto L58;
        if (r6.B0 == false) goto L58;
        ((lq2) r15).l(r11);
    L58:
        po r16 = new po(r2);
        r16.g(0, r6, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        r16.e(true);
        return true;
    L62:
        kf2.o("The activity must be a subclass of FragmentActivity");
        return false;
    }

    public final void d() {
        int r0 = this.w;
        if (r0 != 1) goto L5;
        int r1 = app.homemusic.R.string.mr_cast_button_connecting;
    L9:
        String r2 = getContext().getString(r1);
        setContentDescription(r2);
        if (this.A == true) goto L12;
    L14:
        r2 = null;
    L15:
        e35.S(this, r2);
        return;
    L12:
        if (TextUtils.isEmpty(r2) == true) goto L14;
    L5:
        if (r0 == 2) goto L7;
        r1 = app.homemusic.R.string.mr_cast_button_disconnected;
        goto L9
    L7:
        r1 = app.homemusic.R.string.mr_cast_button_connected;
        goto L9
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.t == null) goto L20;
        int[] r0 = getDrawableState();
        this.t.setState(r0);
        if ((this.t.getCurrent() instanceof AnimationDrawable) == false) goto L19;
        AnimationDrawable r1 = (AnimationDrawable) this.t.getCurrent();
        int r2 = this.w;
        if (r2 == 1) goto L17;
        if (this.v != r2) goto L17;
        if (r2 != 2) goto L19;
        if (r1.isRunning() == true) goto L19;
        r1.selectDrawable(r1.getNumberOfFrames() - 1);
    L17:
        if (r1.isRunning() == true) goto L19;
        r1.start();
    L19:
        invalidate();
    L20:
        this.v = this.w;
    }

    public tp2 getDialogFactory() {
        return this.q;
    }

    public rq2 getRouteSelector() {
        return this.p;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.t;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() == false) goto L5;
        return;
    L5:
        this.r = true;
        if (this.p.c() == true) goto L8;
        rq2 r0 = this.p;
        ap2 r1 = this.o;
        this.n.a(r0, r1, 0);
    L8:
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int r3) {
        int[] r4 = super.onCreateDrawableState(r3 + 1);
        if (this.n == null) goto L9;
        int r2 = this.w;
        if (r2 != 1) goto L8;
        View.mergeDrawableStates(r4, D);
        return r4;
    L8:
        if (r2 != 2) goto L9;
        View.mergeDrawableStates(r4, C);
        return r4;
    L9:
        return r4;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (isInEditMode() == true) goto L7;
        this.r = false;
        if (this.p.c() == true) goto L7;
        this.n.e(this.o);
    L7:
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r7) {
        super.onDraw(r7);
        if (this.t == null) goto L6;
        int r0 = getPaddingLeft();
        int r1 = getWidth() - getPaddingRight();
        int r2 = getPaddingTop();
        int r3 = getHeight() - getPaddingBottom();
        int r4 = this.t.getIntrinsicWidth();
        int r5 = this.t.getIntrinsicHeight();
        int r6 = (((r1 - r0) - r4) / 2) + r0;
        int r8 = (((r3 - r2) - r5) / 2) + r2;
        this.t.setBounds(r6, r8, r4 + r6, r5 + r8);
        this.t.draw(r7);
        return;
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
        int r0 = View.MeasureSpec.getSize(r7);
        int r1 = View.MeasureSpec.getSize(r8);
        int r9 = View.MeasureSpec.getMode(r7);
        int r10 = View.MeasureSpec.getMode(r8);
        Drawable r2 = this.t;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = getPaddingRight() + (getPaddingLeft() + r2.getIntrinsicWidth());
    L6:
        int r5 = Math.max(this.y, r4);
        Drawable r6 = this.t;
        if (r6 == null) goto L9;
        r3 = getPaddingBottom() + (getPaddingTop() + r6.getIntrinsicHeight());
    L9:
        int r11 = Math.max(this.z, r3);
        if (r9 == Integer.MIN_VALUE) goto L13;
        if (r9 == 1073741824) goto L14;
        r0 = r5;
    L14:
        if (r10 == Integer.MIN_VALUE) goto L17;
        if (r10 == 1073741824) goto L18;
        r1 = r11;
    L18:
        setMeasuredDimension(r0, r1);
        return;
    L17:
        r1 = Math.min(r1, r11);
        goto L18
    L13:
        r0 = Math.min(r0, r5);
        goto L14
    L5:
        r4 = 0;
        goto L6
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean r0 = super.performClick();
        if (r0 == true) goto L5;
        playSoundEffect(0);
    L5:
        a();
        if (this.r == false) goto L34;
        this.n.getClass();
        yq2.b();
        yq2.c().getClass();
        ld1 r2 = getFragmentManager();
        if (r2 == null) goto L65;
        yq2.b();
        if (yq2.c().g().d() == false) goto L32;
        if (r2.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) goto L15;
        Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
        goto L34
    L15:
        this.q.getClass();
        fp2 r1 = new fp2();
        rq2 r9 = this.p;
        if (r9 == null) goto L29;
        r1.n0();
        if (r1.D0.equals(r9) == true) goto L28;
        r1.D0 = r9;
        Bundle r5 = r1.s;
        if (r5 != null) goto L22;
        r5 = new Bundle();
    L22:
        r5.putBundle("selector", r9.a);
        r1.c0(r5);
        dg r6 = r1.C0;
        if (r6 == null) goto L28;
        if (r1.B0 == false) goto L27;
        ((aq2) r6).j(r9);
        goto L28
    L27:
        ((ep2) r6).k(r9);
    L28:
        po r10 = new po(r2);
        r10.g(0, r1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
        r10.e(true);
    L62:
        return true;
    L29:
        kf2.n("selector must not be null");
        return false;
    L32:
        if (r2.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) goto L37;
        Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
        goto L34
    L37:
        this.q.getClass();
        rp2 r3 = new rp2();
        rq2 r11 = this.p;
        if (r11 != null) goto L40;
        kf2.n("selector must not be null");
        return false;
    L40:
        if (r3.D0 != null) goto L52;
        Bundle r7 = r3.s;
        if (r7 == null) goto L49;
        Bundle r8 = r7.getBundle("selector");
        rq2 r12 = null;
        if (r8 == null) goto L46;
        r12 = new rq2(r8, null);
    L47:
        r3.D0 = r12;
        goto L49
    L46:
        rq2 r13 = rq2.c;
    L49:
        if (r3.D0 != null) goto L52;
        r3.D0 = rq2.c;
    L52:
        if (r3.D0.equals(r11) == true) goto L61;
        r3.D0 = r11;
        Bundle r14 = r3.s;
        if (r14 != null) goto L56;
        r14 = new Bundle();
    L56:
        r14.putBundle("selector", r11.a);
        r3.c0(r14);
        dg r15 = r3.C0;
        if (r15 == null) goto L61;
        if (r3.B0 == false) goto L61;
        ((lq2) r15).l(r11);
    L61:
        po r16 = new po(r2);
        r16.g(0, r3, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        r16.e(true);
        goto L62
    L65:
        kf2.o("The activity must be a subclass of FragmentActivity");
        return false;
    L34:
        if (r0 == true) goto L62;
        return false;
    }

    @Deprecated
    public void setAlwaysVisible(boolean r1) {
    }

    public void setCheatSheetEnabled(boolean r2) {
        if (r2 == this.A) goto L6;
        this.A = r2;
        d();
        return;
    }

    public void setDialogFactory(tp2 r1) {
        if (r1 == null) goto L5;
        this.q = r1;
        return;
    L5:
        kf2.n("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable r2) {
        this.u = 0;
        setRemoteIndicatorDrawableInternal(r2);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable r4) {
        bp2 r0 = this.s;
        if (r0 == null) goto L5;
        r0.cancel(false);
    L5:
        Drawable r1 = this.t;
        if (r1 == null) goto L8;
        r1.setCallback(null);
        unscheduleDrawable(this.t);
    L8:
        if (r4 == null) goto L17;
        ColorStateList r2 = this.x;
        if (r2 == null) goto L12;
        r4 = r4.mutate();
        r4.setTintList(r2);
    L12:
        r4.setCallback(this);
        r4.setState(getDrawableState());
        if (getVisibility() != 0) goto L15;
        boolean r3 = true;
    L16:
        r4.setVisible(r3, false);
        goto L17
    L15:
        r3 = false;
    L17:
        this.t = r4;
        refreshDrawableState();
    }

    public void setRouteSelector(rq2 r4) {
        if (r4 != null) goto L4;
        kf2.n("selector must not be null");
        return;
    L4:
        if (this.p.equals(r4) == false) goto L6;
        return;
    L6:
        if (this.r == false) goto L13;
        boolean r0 = this.p.c();
        ap2 r1 = this.o;
        yq2 r2 = this.n;
        if (r0 == true) goto L11;
        r2.e(r1);
    L11:
        if (r4.c() == true) goto L13;
        r2.a(r4, r1, 0);
    L13:
        this.p = r4;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        super.setVisibility(r2);
        Drawable r1 = this.t;
        if (r1 != null) goto L5;
        return;
    L5:
        if (r2 != 0) goto L7;
        boolean r3 = true;
    L8:
        r1.setVisible(r3, false);
        return;
    L7:
        r3 = false;
        goto L8
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.t) goto L11;
        return false;
    L11:
        return true;
    }
}
