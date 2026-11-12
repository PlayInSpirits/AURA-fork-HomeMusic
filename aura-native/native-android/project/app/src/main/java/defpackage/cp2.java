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
    public static final SparseArray B = new SparseArray(2);
    public static final int[] C = {R.attr.state_checked};
    public static final int[] D = {R.attr.state_checkable};
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

    public cp2(Context context) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, fu.z(context));
        int iB = fu.B(contextThemeWrapper, app.homemusic.R.attr.mediaRouteTheme);
        super(iB != 0 ? new ContextThemeWrapper(contextThemeWrapper, iB) : contextThemeWrapper, null, app.homemusic.R.attr.mediaRouteButtonStyle);
        this.p = rq2.c;
        this.q = tp2.a;
        Context context2 = getContext();
        int[] iArr = qt3.a;
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, app.homemusic.R.attr.mediaRouteButtonStyle, 0);
        j65.n(this, context2, iArr, null, typedArrayObtainStyledAttributes, app.homemusic.R.attr.mediaRouteButtonStyle, 0);
        if (isInEditMode()) {
            this.n = null;
            this.o = null;
            this.t = zz1.r(context2, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.n = yq2.d(context2);
        this.o = new ap2(this, i);
        yq2.b();
        wq2 wq2VarG = yq2.c().g();
        int i2 = !wq2VarG.d() ? wq2VarG.i : 0;
        this.w = i2;
        this.v = i2;
        this.x = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = this.u;
        SparseArray sparseArray = B;
        if (i3 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i3)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.t == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    bp2 bp2Var = new bp2(this, resourceId, getContext());
                    this.s = bp2Var;
                    bp2Var.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        d();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private ld1 getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof nc1) {
            return ((nc1) activity).k();
        }
        return null;
    }

    public final void a() {
        if (this.u > 0) {
            bp2 bp2Var = this.s;
            if (bp2Var != null) {
                bp2Var.cancel(false);
            }
            bp2 bp2Var2 = new bp2(this, this.u, getContext());
            this.s = bp2Var2;
            this.u = 0;
            bp2Var2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.n.getClass();
        yq2.b();
        wq2 wq2VarG = yq2.c().g();
        int i = !wq2VarG.d() ? wq2VarG.i : 0;
        if (this.w != i) {
            this.w = i;
            d();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    public final boolean c() {
        if (!this.r) {
            return false;
        }
        yq2 yq2Var = this.n;
        yq2Var.getClass();
        yq2.b();
        yq2.c().getClass();
        ld1 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            kf2.o("The activity must be a subclass of FragmentActivity");
            return false;
        }
        yq2Var.getClass();
        yq2.b();
        if (yq2.c().g().d()) {
            if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.q.getClass();
            fp2 fp2Var = new fp2();
            rq2 rq2Var = this.p;
            if (rq2Var == null) {
                kf2.n("selector must not be null");
                return false;
            }
            fp2Var.n0();
            if (!fp2Var.D0.equals(rq2Var)) {
                fp2Var.D0 = rq2Var;
                Bundle bundle = fp2Var.s;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", rq2Var.a);
                fp2Var.c0(bundle);
                dg dgVar = fp2Var.C0;
                if (dgVar != null) {
                    if (fp2Var.B0) {
                        ((aq2) dgVar).j(rq2Var);
                    } else {
                        ((ep2) dgVar).k(rq2Var);
                    }
                }
            }
            po poVar = new po(fragmentManager);
            poVar.g(0, fp2Var, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            poVar.e(true);
            return true;
        }
        if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.q.getClass();
        rp2 rp2Var = new rp2();
        rq2 rq2Var2 = this.p;
        if (rq2Var2 == null) {
            kf2.n("selector must not be null");
            return false;
        }
        if (rp2Var.D0 == null) {
            Bundle bundle2 = rp2Var.s;
            if (bundle2 != null) {
                Bundle bundle3 = bundle2.getBundle("selector");
                rq2 rq2Var3 = null;
                if (bundle3 != null) {
                    rq2Var3 = new rq2(bundle3, null);
                } else {
                    rq2 rq2Var4 = rq2.c;
                }
                rp2Var.D0 = rq2Var3;
            }
            if (rp2Var.D0 == null) {
                rp2Var.D0 = rq2.c;
            }
        }
        if (!rp2Var.D0.equals(rq2Var2)) {
            rp2Var.D0 = rq2Var2;
            Bundle bundle4 = rp2Var.s;
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("selector", rq2Var2.a);
            rp2Var.c0(bundle4);
            dg dgVar2 = rp2Var.C0;
            if (dgVar2 != null && rp2Var.B0) {
                ((lq2) dgVar2).l(rq2Var2);
            }
        }
        po poVar2 = new po(fragmentManager);
        poVar2.g(0, rp2Var, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        poVar2.e(true);
        return true;
    }

    public final void d() {
        int i;
        int i2 = this.w;
        if (i2 != 1) {
            i = i2 != 2 ? app.homemusic.R.string.mr_cast_button_disconnected : app.homemusic.R.string.mr_cast_button_connected;
        } else {
            i = app.homemusic.R.string.mr_cast_button_connecting;
        }
        String string = getContext().getString(i);
        setContentDescription(string);
        if (!this.A || TextUtils.isEmpty(string)) {
            string = null;
        }
        e35.S(this, string);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.t != null) {
            this.t.setState(getDrawableState());
            if (this.t.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.t.getCurrent();
                int i = this.w;
                if (i == 1 || this.v != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
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
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.r = true;
        if (!this.p.c()) {
            this.n.a(this.p, this.o, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.n != null) {
            int i2 = this.w;
            if (i2 == 1) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, D);
                return iArrOnCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, C);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.r = false;
            if (!this.p.c()) {
                this.n.e(this.o);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.t != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.t.getIntrinsicWidth();
            int intrinsicHeight = this.t.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.t.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.t.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.t;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.y, paddingRight);
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.z, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[RETURN] */
    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        a();
        if (this.r) {
            this.n.getClass();
            yq2.b();
            yq2.c().getClass();
            ld1 fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                kf2.o("The activity must be a subclass of FragmentActivity");
                return false;
            }
            yq2.b();
            if (yq2.c().g().d()) {
                if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                    if (!zPerformClick) {
                        return false;
                    }
                } else {
                    this.q.getClass();
                    fp2 fp2Var = new fp2();
                    rq2 rq2Var = this.p;
                    if (rq2Var == null) {
                        kf2.n("selector must not be null");
                        return false;
                    }
                    fp2Var.n0();
                    if (!fp2Var.D0.equals(rq2Var)) {
                        fp2Var.D0 = rq2Var;
                        Bundle bundle = fp2Var.s;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("selector", rq2Var.a);
                        fp2Var.c0(bundle);
                        dg dgVar = fp2Var.C0;
                        if (dgVar != null) {
                            if (fp2Var.B0) {
                                ((aq2) dgVar).j(rq2Var);
                            } else {
                                ((ep2) dgVar).k(rq2Var);
                            }
                        }
                    }
                    po poVar = new po(fragmentManager);
                    poVar.g(0, fp2Var, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    poVar.e(true);
                }
            } else if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                if (!zPerformClick) {
                    return false;
                }
            } else {
                this.q.getClass();
                rp2 rp2Var = new rp2();
                rq2 rq2Var2 = this.p;
                if (rq2Var2 == null) {
                    kf2.n("selector must not be null");
                    return false;
                }
                if (rp2Var.D0 == null) {
                    Bundle bundle2 = rp2Var.s;
                    if (bundle2 != null) {
                        Bundle bundle3 = bundle2.getBundle("selector");
                        rq2 rq2Var3 = null;
                        if (bundle3 != null) {
                            rq2Var3 = new rq2(bundle3, null);
                        } else {
                            rq2 rq2Var4 = rq2.c;
                        }
                        rp2Var.D0 = rq2Var3;
                    }
                    if (rp2Var.D0 == null) {
                        rp2Var.D0 = rq2.c;
                    }
                }
                if (!rp2Var.D0.equals(rq2Var2)) {
                    rp2Var.D0 = rq2Var2;
                    Bundle bundle4 = rp2Var.s;
                    if (bundle4 == null) {
                        bundle4 = new Bundle();
                    }
                    bundle4.putBundle("selector", rq2Var2.a);
                    rp2Var.c0(bundle4);
                    dg dgVar2 = rp2Var.C0;
                    if (dgVar2 != null && rp2Var.B0) {
                        ((lq2) dgVar2).l(rq2Var2);
                    }
                }
                po poVar2 = new po(fragmentManager);
                poVar2.g(0, rp2Var, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                poVar2.e(true);
            }
        } else if (!zPerformClick) {
            return false;
        }
        return true;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.A) {
            this.A = z;
            d();
        }
    }

    public void setDialogFactory(tp2 tp2Var) {
        if (tp2Var != null) {
            this.q = tp2Var;
        } else {
            kf2.n("factory must not be null");
        }
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.u = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        bp2 bp2Var = this.s;
        if (bp2Var != null) {
            bp2Var.cancel(false);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.t);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.x;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.t = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(rq2 rq2Var) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (this.p.equals(rq2Var)) {
            return;
        }
        if (this.r) {
            boolean zC = this.p.c();
            ap2 ap2Var = this.o;
            yq2 yq2Var = this.n;
            if (!zC) {
                yq2Var.e(ap2Var);
            }
            if (!rq2Var.c()) {
                yq2Var.a(rq2Var, ap2Var, 0);
            }
        }
        this.p = rq2Var;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }
}
