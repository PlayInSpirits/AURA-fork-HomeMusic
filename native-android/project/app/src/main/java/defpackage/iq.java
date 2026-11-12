package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iq extends ProgressBar {
    public final jq n;
    public int o;
    public boolean p;
    public final boolean q;
    public final int r;
    public ee s;
    public boolean t;
    public int u;
    public final gq v;
    public final gq w;
    public final hq x;
    public final hq y;

    public iq(Context r9, AttributeSet r10, int r11, int r12) {
        super(su3.H(r9, r10, r11, R.style.Widget_MaterialComponents_ProgressIndicator), r10, r11);
        this.t = false;
        this.u = 4;
        this.v = new gq(this, 0);
        this.w = new gq(this, 1);
        this.x = new hq(this, 0);
        this.y = new hq(this, 1);
        Context r2 = getContext();
        this.n = a(r2, r10);
        uc5.c(r2, r10, r11, r12);
        int[] r4 = ht3.d;
        uc5.g(r2, r10, r4, r11, r12, new int[0]);
        TypedArray r13 = r2.obtainStyledAttributes(r10, r4, r11, r12);
        r13.getInt(5, -1);
        this.r = Math.min(r13.getInt(3, -1), 1000);
        r13.recycle();
        this.s = new ee();
        this.q = true;
    }

    private mw0 getCurrentDrawingDelegate() {
        if (isIndeterminate() == false) goto L10;
        if (getIndeterminateDrawable() != null) goto L8;
        return null;
    L8:
        return getIndeterminateDrawable().y;
    L10:
        if (getProgressDrawable() != null) goto L13;
        return null;
    L13:
        return getProgressDrawable().y;
    }

    public abstract jq a(Context r1, AttributeSet r2);

    public void b(int r2, boolean r3) {
        if (isIndeterminate() == true) goto L5;
        super.setProgress(r2);
        if (getProgressDrawable() == null) goto L21;
        if (r3 == true) goto L22;
        getProgressDrawable().jumpToCurrentState();
        return;
    L22:
        return;
    L21:
        return;
    L5:
        if (getProgressDrawable() == null) goto L20;
        this.o = r2;
        this.p = r3;
        this.t = true;
        if (getIndeterminateDrawable().isVisible() == false) goto L13;
        ee r4 = this.s;
        ContentResolver r5 = getContext().getContentResolver();
        r4.getClass();
        if (Settings.Global.getFloat(r5, "animator_duration_scale", 1.0f) == 0.0f) goto L13;
        getIndeterminateDrawable().z.i();
        return;
    L13:
        this.x.a(getIndeterminateDrawable());
        return;
    }

    public final boolean c() {
        WeakHashMap r0 = j65.a;
        if (isAttachedToWindow() == true) goto L5;
        return false;
    L5:
        if (getWindowVisibility() != 0) goto L26;
        View r1 = this;
    L8:
        if (r1.getVisibility() != 0) goto L28;
        Object r2 = r1.getParent();
        if (r2 == null) goto L13;
        if ((r2 instanceof View) == false) goto L25;
        r1 = (View) r2;
        goto L8
    L25:
        return true;
    L13:
        if (getWindowVisibility() != 0) goto L27;
        return true;
    L27:
        return false;
    L28:
        return false;
    L26:
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate() == false) goto L7;
        return getIndeterminateDrawable();
    L7:
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.n.f;
    }

    @Override // android.widget.ProgressBar
    public sx1 getIndeterminateDrawable() {
        return (sx1) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.n.c;
    }

    @Override // android.widget.ProgressBar
    public gp0 getProgressDrawable() {
        return (gp0) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.n.e;
    }

    public int getTrackColor() {
        return this.n.d;
    }

    public int getTrackCornerRadius() {
        return this.n.b;
    }

    public int getTrackThickness() {
        return this.n.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() == null) goto L6;
        getCurrentDrawable().invalidateSelf();
        return;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null) goto L5;
    L7:
        gp0 r0 = getProgressDrawable();
        hq r1 = this.y;
        if (r0 == null) goto L16;
        gp0 r2 = getProgressDrawable();
        if (r2.s != null) goto L13;
        r2.s = new ArrayList();
    L13:
        if (r2.s.contains(r1) == true) goto L16;
        r2.s.add(r1);
    L16:
        if (getIndeterminateDrawable() == null) goto L24;
        sx1 r3 = getIndeterminateDrawable();
        if (r3.s != null) goto L21;
        r3.s = new ArrayList();
    L21:
        if (r3.s.contains(r1) == true) goto L24;
        r3.s.add(r1);
    L24:
        if (c() == true) goto L26;
        return;
    L26:
        if (this.r <= 0) goto L28;
        SystemClock.uptimeMillis();
    L28:
        setVisibility(0);
        return;
    L5:
        if (getIndeterminateDrawable() == null) goto L7;
        getIndeterminateDrawable().z.g(this.x);
        goto L7
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.w);
        removeCallbacks(this.v);
        ((cw0) getCurrentDrawable()).e(false, false, false);
        sx1 r0 = getIndeterminateDrawable();
        hq r1 = this.y;
        if (r0 == null) goto L6;
        getIndeterminateDrawable().g(r1);
        getIndeterminateDrawable().z.k();
    L6:
        if (getProgressDrawable() == null) goto L8;
        getProgressDrawable().g(r1);
    L8:
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas r6) {
        monitor-enter(this);
        int r0 = r6.save();     // Catch: Throwable -> L8
        if (getPaddingLeft() == 0) goto L6;
    L10:
        r6.translate(getPaddingLeft(), getPaddingTop());     // Catch: Throwable -> L8
    L12:
        if (getPaddingRight() == 0) goto L14;
    L15:
        r6.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));     // Catch: Throwable -> L8
    L16:
        getCurrentDrawable().draw(r6);     // Catch: Throwable -> L8
        r6.restoreToCount(r0);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L14:
        if (getPaddingBottom() == 0) goto L16;
    L6:
        if (getPaddingTop() == 0) goto L12;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r3, int r4) {
        monitor-enter(this);
        mw0 r0 = getCurrentDrawingDelegate();     // Catch: Throwable -> L10
        if (r0 != null) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (r0.e() >= 0) goto L12;
        int r5 = View.getDefaultSize(getSuggestedMinimumWidth(), r3);     // Catch: Throwable -> L10
    L14:
        if (r0.d() >= 0) goto L16;
        int r6 = View.getDefaultSize(getSuggestedMinimumHeight(), r4);     // Catch: Throwable -> L10
    L17:
        setMeasuredDimension(r5, r6);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L16:
        r6 = (r0.d() + getPaddingTop()) + getPaddingBottom();     // Catch: Throwable -> L10
        goto L17
    L12:
        r5 = (r0.e() + getPaddingLeft()) + getPaddingRight();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View r2, int r3) {
        super.onVisibilityChanged(r2, r3);
        if (r3 != 0) goto L5;
        boolean r4 = true;
    L7:
        if (this.q == true) goto L9;
        return;
    L9:
        ((cw0) getCurrentDrawable()).e(c(), false, r4);
        return;
    L5:
        r4 = false;
        goto L7
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r2) {
        super.onWindowVisibilityChanged(r2);
        if (this.q == true) goto L5;
        return;
    L5:
        ((cw0) getCurrentDrawable()).e(c(), false, false);
    }

    public void setAnimatorDurationScaleProvider(ee r2) {
        this.s = r2;
        if (getProgressDrawable() == null) goto L6;
        getProgressDrawable().p = r2;
    L6:
        if (getIndeterminateDrawable() == null) goto L9;
        getIndeterminateDrawable().p = r2;
        return;
    }

    public void setHideAnimationBehavior(int r2) {
        this.n.f = r2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean r3) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (r3 != isIndeterminate()) goto L7;
        monitor-exit(this);
        return;
    L7:
        cw0 r0 = (cw0) getCurrentDrawable();     // Catch: Throwable -> L10
        if (r0 == null) goto L12;
        r0.e(false, false, false);     // Catch: Throwable -> L10
    L12:
        super.setIndeterminate(r3);     // Catch: Throwable -> L10
        cw0 r4 = (cw0) getCurrentDrawable();     // Catch: Throwable -> L10
        if (r4 == null) goto L16;
        r4.e(c(), false, false);     // Catch: Throwable -> L10
    L16:
        if ((r4 instanceof sx1) == true) goto L18;
    L20:
        this.t = false;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L18:
        if (c() == false) goto L20;
        ((sx1) r4).z.j();     // Catch: Throwable -> L10
        goto L20
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable r3) {
        if (r3 != null) goto L6;
        super.setIndeterminateDrawable(null);
        return;
    L6:
        if ((r3 instanceof sx1) == false) goto L9;
        ((cw0) r3).e(false, false, false);
        super.setIndeterminateDrawable(r3);
        return;
    L9:
        kf2.n("Cannot set framework drawable as indeterminate drawable.");
    }

    public void setIndicatorColor(int... r4) {
        if (r4.length != 0) goto L6;
        r4 = new int[]{g12.s(getContext(), R.attr.colorPrimary, -1)};
    L6:
        if (Arrays.equals(getIndicatorColor(), r4) == true) goto L9;
        this.n.c = r4;
        getIndeterminateDrawable().z.f();
        invalidate();
        return;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int r2) {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (isIndeterminate() == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        b(r2, false);     // Catch: Throwable -> L11
        monitor-exit(this);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable r2) {
        if (r2 != null) goto L6;
        super.setProgressDrawable(null);
        return;
    L6:
        if ((r2 instanceof gp0) == false) goto L9;
        gp0 r3 = (gp0) r2;
        r3.e(false, false, false);
        super.setProgressDrawable(r3);
        r3.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        return;
    L9:
        kf2.n("Cannot set framework drawable as progress drawable.");
    }

    public void setShowAnimationBehavior(int r2) {
        this.n.e = r2;
        invalidate();
    }

    public void setTrackColor(int r3) {
        jq r0 = this.n;
        if (r0.d == r3) goto L6;
        r0.d = r3;
        invalidate();
        return;
    }

    public void setTrackCornerRadius(int r2) {
        jq r1 = this.n;
        if (r1.b == r2) goto L6;
        r1.b = Math.min(r2, r1.a / 2);
        return;
    }

    public void setTrackThickness(int r3) {
        jq r0 = this.n;
        if (r0.a == r3) goto L6;
        r0.a = r3;
        requestLayout();
        return;
    }

    public void setVisibilityAfterHide(int r2) {
        if (r2 != 0) goto L4;
    L10:
        this.u = r2;
        return;
    L4:
        if (r2 == 4) goto L10;
        if (r2 == 8) goto L10;
        kf2.n("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getIndeterminateDrawable() {
        return getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getProgressDrawable() {
        return getProgressDrawable();
    }
}
