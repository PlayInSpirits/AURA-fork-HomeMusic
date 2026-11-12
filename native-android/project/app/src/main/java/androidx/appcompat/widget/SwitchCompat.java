package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.aw0;
import defpackage.e85;
import defpackage.gt4;
import defpackage.hw;
import defpackage.ig;
import defpackage.ih;
import defpackage.j65;
import defpackage.jv3;
import defpackage.l9;
import defpackage.pp4;
import defpackage.r00;
import defpackage.st3;
import defpackage.tz0;
import defpackage.ud3;
import defpackage.w55;
import defpackage.ya4;
import defpackage.zz1;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final r00 h0 = new r00(Float.class, "thumbPos", 14);
    public static final int[] i0 = {R.attr.state_checked};
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public int G;
    public final int H;
    public float I;
    public float J;
    public final VelocityTracker K;
    public final int L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final TextPaint V;
    public final ColorStateList W;
    public StaticLayout a0;
    public StaticLayout b0;
    public final l9 c0;
    public ObjectAnimator d0;
    public ig e0;
    public pp4 f0;
    public final Rect g0;
    public Drawable n;
    public ColorStateList o;
    public PorterDuff.Mode p;
    public boolean q;
    public boolean r;
    public Drawable s;
    public ColorStateList t;
    public PorterDuff.Mode u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.o = null;
        this.p = null;
        this.q = false;
        this.r = false;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = false;
        this.K = VelocityTracker.obtain();
        this.U = true;
        this.g0 = new Rect();
        gt4.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.V = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = st3.x;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        j65.n(this, context, iArr, attributeSet, typedArray, i, 0);
        Drawable drawableC = jv3VarF.c(2);
        this.n = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        Drawable drawableC2 = jv3VarF.c(11);
        this.s = drawableC2;
        if (drawableC2 != null) {
            drawableC2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.F = typedArray.getBoolean(3, true);
        this.x = typedArray.getDimensionPixelSize(8, 0);
        this.y = typedArray.getDimensionPixelSize(5, 0);
        this.z = typedArray.getDimensionPixelSize(6, 0);
        this.A = typedArray.getBoolean(4, false);
        ColorStateList colorStateListB = jv3VarF.b(9);
        if (colorStateListB != null) {
            this.o = colorStateListB;
            this.q = true;
        }
        PorterDuff.Mode modeC = aw0.c(typedArray.getInt(10, -1), null);
        if (this.p != modeC) {
            this.p = modeC;
            this.r = true;
        }
        if (this.q || this.r) {
            a();
        }
        ColorStateList colorStateListB2 = jv3VarF.b(12);
        if (colorStateListB2 != null) {
            this.t = colorStateListB2;
            this.v = true;
        }
        PorterDuff.Mode modeC2 = aw0.c(typedArray.getInt(13, -1), null);
        if (this.u != modeC2) {
            this.u = modeC2;
            this.w = true;
        }
        if (this.v || this.w) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, st3.y);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = ud3.n(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.W = colorStateList;
            } else {
                this.W = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                l9 l9Var = new l9();
                l9Var.n = context2.getResources().getConfiguration().locale;
                this.c0 = l9Var;
            } else {
                this.c0 = null;
            }
            setTextOnInternal(this.B);
            setTextOffInternal(this.D);
            typedArrayObtainStyledAttributes.recycle();
        }
        new ih(this).f(attributeSet, i);
        jv3VarF.g();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.H = viewConfiguration.getScaledTouchSlop();
        this.L = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private ig getEmojiTextViewHelper() {
        if (this.e0 == null) {
            this.e0 = new ig(this);
        }
        return this.e0;
    }

    private boolean getTargetCheckedState() {
        return this.M > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = e85.a;
        int layoutDirection = getLayoutDirection();
        float f = this.M;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.s;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.g0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.n;
        Rect rectB = drawable2 != null ? aw0.b(drawable2) : aw0.c;
        return ((((this.N - this.P) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.D = charSequence;
        TransformationMethod transformationMethodR = ((hw) getEmojiTextViewHelper().b.o).R(this.c0);
        if (transformationMethodR != null) {
            charSequence = transformationMethodR.getTransformation(charSequence, this);
        }
        this.E = charSequence;
        this.b0 = null;
        if (this.F) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.B = charSequence;
        TransformationMethod transformationMethodR = ((hw) getEmojiTextViewHelper().b.o).R(this.c0);
        if (transformationMethodR != null) {
            charSequence = transformationMethodR.getTransformation(charSequence, this);
        }
        this.C = charSequence;
        this.a0 = null;
        if (this.F) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.n;
        if (drawable != null) {
            if (this.q || this.r) {
                Drawable drawableMutate = drawable.mutate();
                this.n = drawableMutate;
                if (this.q) {
                    drawableMutate.setTintList(this.o);
                }
                if (this.r) {
                    this.n.setTintMode(this.p);
                }
                if (this.n.isStateful()) {
                    this.n.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.s;
        if (drawable != null) {
            if (this.v || this.w) {
                Drawable drawableMutate = drawable.mutate();
                this.s = drawableMutate;
                if (this.v) {
                    drawableMutate.setTintList(this.t);
                }
                if (this.w) {
                    this.s.setTintMode(this.u);
                }
                if (this.s.isStateful()) {
                    this.s.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.B);
        setTextOffInternal(this.D);
        requestLayout();
    }

    public final void d() {
        if (this.f0 == null && ((hw) this.e0.b.o).r() && tz0.c()) {
            tz0 tz0VarA = tz0.a();
            int iB = tz0VarA.b();
            if (iB == 3 || iB == 0) {
                pp4 pp4Var = new pp4(this);
                this.f0 = pp4Var;
                tz0VarA.g(pp4Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.Q;
        int i4 = this.R;
        int i5 = this.S;
        int i6 = this.T;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.n;
        Rect rectB = drawable != null ? aw0.b(drawable) : aw0.c;
        Drawable drawable2 = this.s;
        Rect rect = this.g0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.s.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.s.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.P + rect.right;
            this.n.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.n;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.s;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = e85.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.N;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.z : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = e85.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.N;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.z : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.F;
    }

    public boolean getSplitTrack() {
        return this.A;
    }

    public int getSwitchMinWidth() {
        return this.y;
    }

    public int getSwitchPadding() {
        return this.z;
    }

    public CharSequence getTextOff() {
        return this.D;
    }

    public CharSequence getTextOn() {
        return this.B;
    }

    public Drawable getThumbDrawable() {
        return this.n;
    }

    public final float getThumbPosition() {
        return this.M;
    }

    public int getThumbTextPadding() {
        return this.x;
    }

    public ColorStateList getThumbTintList() {
        return this.o;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.p;
    }

    public Drawable getTrackDrawable() {
        return this.s;
    }

    public ColorStateList getTrackTintList() {
        return this.t;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.u;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.d0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.d0.end();
        this.d0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, i0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.s;
        Rect rect = this.g0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.R;
        int i2 = this.T;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.n;
        if (drawable != null) {
            if (!this.A || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = aw0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.a0 : this.b0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.V;
            ColorStateList colorStateList = this.W;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.B : this.D;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.n != null) {
            Drawable drawable = this.s;
            Rect rect = this.g0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = aw0.b(this.n);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = e85.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.N + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.N) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.O;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.O + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.O;
        }
        this.Q = paddingLeft;
        this.R = paddingTop;
        this.T = height;
        this.S = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.F) {
            StaticLayout staticLayout = this.a0;
            TextPaint textPaint = this.V;
            if (staticLayout == null) {
                CharSequence charSequence = this.C;
                this.a0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.b0 == null) {
                CharSequence charSequence2 = this.E;
                this.b0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.n;
        Rect rect = this.g0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.n.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.n.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.F) {
            iMax = (this.x * 2) + Math.max(this.a0.getWidth(), this.b0.getWidth());
        } else {
            iMax = 0;
        }
        this.P = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.s.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            Rect rectB = aw0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.U;
        int iMax4 = this.y;
        if (z) {
            iMax4 = Math.max(iMax4, (this.P * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.N = iMax4;
        this.O = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.B : this.D;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.K;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.H;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.G == 2) {
                    this.G = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.L) {
                            boolean z2 = e85.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.G = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.G;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.I) > f3 || Math.abs(y - this.J) > f3) {
                        this.G = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.I = x;
                        this.J = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.I;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = e85.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.M;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.I = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.G == 2) {
                    this.G = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.L) {
                            boolean z4 = e85.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.G = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.n != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.n;
                Rect rect = this.g0;
                drawable.getPadding(rect);
                int i3 = this.R - i;
                int i4 = (this.Q + thumbOffset) - i;
                int i5 = this.P + i4 + rect.left + rect.right + i;
                int i6 = this.T + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.G = 1;
                    this.I = x3;
                    this.J = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.B;
                if (string == null) {
                    string = getResources().getString(app.homemusic.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = j65.a;
                new w55(app.homemusic.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.D;
            if (string2 == null) {
                string2 = getResources().getString(app.homemusic.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = j65.a;
            new w55(app.homemusic.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.d0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, h0, zIsChecked ? 1.0f : 0.0f);
        this.d0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.d0.setAutoCancel(true);
        this.d0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ya4.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.B);
        setTextOffInternal(this.D);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.U = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.F != z) {
            this.F = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.A = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.y = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.z = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.V;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.D;
        if (string == null) {
            string = getResources().getString(app.homemusic.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = j65.a;
        new w55(app.homemusic.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.B;
        if (string == null) {
            string = getResources().getString(app.homemusic.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = j65.a;
        new w55(app.homemusic.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.M = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(zz1.r(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.x = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(zz1.r(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n || drawable == this.s;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
