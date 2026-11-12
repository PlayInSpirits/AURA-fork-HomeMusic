package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import app.homemusic.R;
import defpackage.h4;
import defpackage.h74;
import defpackage.st3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean n;
    public View o;
    public View p;
    public Drawable q;
    public Drawable r;
    public Drawable s;
    public final boolean t;
    public boolean u;
    public final int v;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new h4(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.a);
        boolean z = false;
        this.q = typedArrayObtainStyledAttributes.getDrawable(0);
        this.r = typedArrayObtainStyledAttributes.getDrawable(2);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.t = true;
            this.s = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.t ? !(this.q != null || this.r != null) : this.s == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            this.q.setState(getDrawableState());
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            this.r.setState(getDrawableState());
        }
        Drawable drawable3 = this.s;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.s.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.s;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.o = findViewById(R.id.action_bar);
        this.p = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.t) {
            Drawable drawable = this.s;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.q == null) {
                z2 = false;
            } else if (this.o.getVisibility() == 0) {
                this.q.setBounds(this.o.getLeft(), this.o.getTop(), this.o.getRight(), this.o.getBottom());
            } else {
                View view = this.p;
                if (view == null || view.getVisibility() != 0) {
                    this.q.setBounds(0, 0, 0, 0);
                } else {
                    this.q.setBounds(this.p.getLeft(), this.p.getTop(), this.p.getRight(), this.p.getBottom());
                }
            }
            this.u = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.o == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.v) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.o == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.q);
        }
        this.q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.o;
            if (view != null) {
                this.q.setBounds(view.getLeft(), this.o.getTop(), this.o.getRight(), this.o.getBottom());
            }
        }
        boolean z = false;
        if (!this.t ? !(this.q != null || this.r != null) : this.s == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.s);
        }
        this.s = drawable;
        boolean z = this.t;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.s) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.q != null || this.r != null) : this.s == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.r);
        }
        this.r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.u && this.r != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.t ? !(this.q != null || this.r != null) : this.s == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(h74 h74Var) {
    }

    public void setTransitioning(boolean z) {
        this.n = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.s;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.q;
        boolean z = this.t;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.r && this.u) {
            return true;
        }
        return (drawable == this.s && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
