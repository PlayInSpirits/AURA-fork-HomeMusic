package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.e35;
import defpackage.hv2;
import defpackage.mh;
import defpackage.pu2;
import defpackage.qu2;
import defpackage.r4;
import defpackage.s4;
import defpackage.st3;
import defpackage.tu2;
import defpackage.z4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends mh implements hv2, View.OnClickListener, z4 {
    public boolean A;
    public boolean B;
    public final int C;
    public int D;
    public final int E;
    public tu2 u;
    public CharSequence v;
    public Drawable w;
    public pu2 x;
    public r4 y;
    public s4 z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.A = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.c, i, 0);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.E = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.z4
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.z4
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.u.getIcon() == null;
    }

    @Override // defpackage.hv2
    public final void c(tu2 tu2Var) {
        this.u = tu2Var;
        setIcon(tu2Var.getIcon());
        setTitle(tu2Var.getTitleCondensed());
        setId(tu2Var.a);
        setVisibility(tu2Var.isVisible() ? 0 : 8);
        setEnabled(tu2Var.isEnabled());
        if (tu2Var.hasSubMenu() && this.y == null) {
            this.y = new r4(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.hv2
    public tu2 getItemData() {
        return this.u;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v);
        if (this.w != null && ((this.u.y & 4) != 4 || (!this.A && !this.B))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.v : null);
        CharSequence charSequence = this.u.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.u.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.u.r;
        if (TextUtils.isEmpty(charSequence2)) {
            e35.S(this, z3 ? null : this.u.e);
        } else {
            e35.S(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pu2 pu2Var = this.x;
        if (pu2Var != null) {
            pu2Var.a(this.u);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A = g();
        h();
    }

    @Override // defpackage.mh, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.D) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.C;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.w == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.w.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r4 r4Var;
        if (this.u.hasSubMenu() && (r4Var = this.y) != null && r4Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B != z) {
            this.B = z;
            tu2 tu2Var = this.u;
            if (tu2Var != null) {
                qu2 qu2Var = tu2Var.n;
                qu2Var.k = true;
                qu2Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(pu2 pu2Var) {
        this.x = pu2Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.D = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(s4 s4Var) {
        this.z = s4Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.v = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
