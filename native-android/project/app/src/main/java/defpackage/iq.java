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

    public iq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.t = false;
        this.u = 4;
        this.v = new gq(this, 0);
        this.w = new gq(this, 1);
        this.x = new hq(this, 0);
        this.y = new hq(this, 1);
        Context context2 = getContext();
        this.n = a(context2, attributeSet);
        uc5.c(context2, attributeSet, i, i2);
        int[] iArr = ht3.d;
        uc5.g(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        typedArrayObtainStyledAttributes.getInt(5, -1);
        this.r = Math.min(typedArrayObtainStyledAttributes.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.s = new ee();
        this.q = true;
    }

    private mw0 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().y;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().y;
    }

    public abstract jq a(Context context, AttributeSet attributeSet);

    public void b(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.o = i;
            this.p = z;
            this.t = true;
            if (getIndeterminateDrawable().isVisible()) {
                ee eeVar = this.s;
                ContentResolver contentResolver = getContext().getContentResolver();
                eeVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().z.i();
                    return;
                }
            }
            this.x.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = j65.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
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
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z.g(this.x);
        }
        gp0 progressDrawable = getProgressDrawable();
        hq hqVar = this.y;
        if (progressDrawable != null) {
            gp0 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.s == null) {
                progressDrawable2.s = new ArrayList();
            }
            if (!progressDrawable2.s.contains(hqVar)) {
                progressDrawable2.s.add(hqVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            sx1 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.s == null) {
                indeterminateDrawable.s = new ArrayList();
            }
            if (!indeterminateDrawable.s.contains(hqVar)) {
                indeterminateDrawable.s.add(hqVar);
            }
        }
        if (c()) {
            if (this.r > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.w);
        removeCallbacks(this.v);
        ((cw0) getCurrentDrawable()).e(false, false, false);
        sx1 indeterminateDrawable = getIndeterminateDrawable();
        hq hqVar = this.y;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(hqVar);
            getIndeterminateDrawable().z.k();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(hqVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            mw0 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.q) {
            ((cw0) getCurrentDrawable()).e(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.q) {
            ((cw0) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(ee eeVar) {
        this.s = eeVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().p = eeVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().p = eeVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.n.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            cw0 cw0Var = (cw0) getCurrentDrawable();
            if (cw0Var != null) {
                cw0Var.e(false, false, false);
            }
            super.setIndeterminate(z);
            cw0 cw0Var2 = (cw0) getCurrentDrawable();
            if (cw0Var2 != null) {
                cw0Var2.e(c(), false, false);
            }
            if ((cw0Var2 instanceof sx1) && c()) {
                ((sx1) cw0Var2).z.j();
            }
            this.t = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof sx1)) {
            kf2.n("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((cw0) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{g12.s(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.n.c = iArr;
        getIndeterminateDrawable().z.f();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (!(drawable instanceof gp0)) {
            kf2.n("Cannot set framework drawable as progress drawable.");
            return;
        }
        gp0 gp0Var = (gp0) drawable;
        gp0Var.e(false, false, false);
        super.setProgressDrawable(gp0Var);
        gp0Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
    }

    public void setShowAnimationBehavior(int i) {
        this.n.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        jq jqVar = this.n;
        if (jqVar.d != i) {
            jqVar.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        jq jqVar = this.n;
        if (jqVar.b != i) {
            jqVar.b = Math.min(i, jqVar.a / 2);
        }
    }

    public void setTrackThickness(int i) {
        jq jqVar = this.n;
        if (jqVar.a != i) {
            jqVar.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.u = i;
        } else {
            kf2.n("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }
}
