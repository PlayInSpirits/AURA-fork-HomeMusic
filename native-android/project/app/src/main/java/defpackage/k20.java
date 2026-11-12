package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends fi2 implements Drawable.Callback, wr4 {
    public static final int[] S0 = {R.attr.state_enabled};
    public static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public int F0;
    public int G0;
    public ColorFilter H0;
    public PorterDuffColorFilter I0;
    public ColorStateList J0;
    public ColorStateList K;
    public PorterDuff.Mode K0;
    public ColorStateList L;
    public int[] L0;
    public float M;
    public ColorStateList M0;
    public float N;
    public WeakReference N0;
    public ColorStateList O;
    public TextUtils.TruncateAt O0;
    public float P;
    public boolean P0;
    public ColorStateList Q;
    public int Q0;
    public CharSequence R;
    public boolean R0;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public float V;
    public boolean W;
    public boolean X;
    public Drawable Y;
    public RippleDrawable Z;
    public ColorStateList a0;
    public float b0;
    public SpannableStringBuilder c0;
    public boolean d0;
    public boolean e0;
    public Drawable f0;
    public ColorStateList g0;
    public zx2 h0;
    public zx2 i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public final Context r0;
    public final Paint s0;
    public final Paint.FontMetrics t0;
    public final RectF u0;
    public final PointF v0;
    public final Path w0;
    public final xr4 x0;
    public int y0;
    public int z0;

    public k20(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        this.N = -1.0f;
        this.s0 = new Paint(1);
        this.t0 = new Paint.FontMetrics();
        this.u0 = new RectF();
        this.v0 = new PointF();
        this.w0 = new Path();
        this.G0 = 255;
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference(null);
        j(context);
        this.r0 = context;
        xr4 xr4Var = new xr4(this);
        this.x0 = xr4Var;
        this.R = "";
        xr4Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S0;
        setState(iArr);
        if (!Arrays.equals(this.L0, iArr)) {
            this.L0 = iArr;
            if (a0()) {
                D(getState(), iArr);
            }
        }
        this.P0 = true;
        int[] iArr2 = l24.a;
        T0.setTint(-1);
    }

    public static boolean A(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean B(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void C() {
        Chip chip = (Chip) this.N0.get();
        if (chip != null) {
            chip.c(chip.D);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean D(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.K;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.y0) : 0);
        boolean state = true;
        if (this.y0 != iC) {
            this.y0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.L;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.z0) : 0);
        if (this.z0 != iC2) {
            this.z0 = iC2;
            zOnStateChange = true;
        }
        int iG = v50.g(iC2, iC);
        if ((this.A0 != iG) | (this.n.c == null)) {
            this.A0 = iG;
            m(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.O;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.B0) : 0;
        if (this.B0 != colorForState) {
            this.B0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.M0 == null || !l24.d(iArr)) ? 0 : this.M0.getColorForState(iArr, this.C0);
        if (this.C0 != colorForState2) {
            this.C0 = colorForState2;
        }
        rr4 rr4Var = this.x0.g;
        int colorForState3 = (rr4Var == null || (colorStateList = rr4Var.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.D0);
        if (this.D0 != colorForState3) {
            this.D0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.d0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.E0 == z || this.f0 == null) {
            z2 = false;
        } else {
            float fX = x();
            this.E0 = z;
            if (fX != x()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.J0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.F0) : 0;
        if (this.F0 != colorForState4) {
            this.F0 = colorForState4;
            ColorStateList colorStateList6 = this.J0;
            PorterDuff.Mode mode = this.K0;
            this.I0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (B(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (B(this.f0)) {
            state |= this.f0.setState(iArr);
        }
        if (B(this.Y)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.Y.setState(iArr3);
        }
        int[] iArr4 = l24.a;
        if (B(this.Z)) {
            state |= this.Z.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            C();
        }
        return state;
    }

    public final void E(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            float fX = x();
            if (!z && this.E0) {
                this.E0 = false;
            }
            float fX2 = x();
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void F(Drawable drawable) {
        if (this.f0 != drawable) {
            float fX = x();
            this.f0 = drawable;
            float fX2 = x();
            b0(this.f0);
            v(this.f0);
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.g0 != colorStateList) {
            this.g0 = colorStateList;
            if (this.e0 && (drawable = this.f0) != null && this.d0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void H(boolean z) {
        if (this.e0 != z) {
            boolean zY = Y();
            this.e0 = z;
            boolean zY2 = Y();
            if (zY != zY2) {
                Drawable drawable = this.f0;
                if (zY2) {
                    v(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                C();
            }
        }
    }

    public final void I(float f) {
        if (this.N != f) {
            this.N = f;
            zc1 zc1VarG = this.n.a.g();
            zc1VarG.b(f);
            setShapeAppearanceModel(zc1VarG.a());
        }
    }

    public final void J(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fX = x();
            this.T = drawable != null ? drawable.mutate() : null;
            float fX2 = x();
            b0(drawable2);
            if (Z()) {
                v(this.T);
            }
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void K(float f) {
        if (this.V != f) {
            float fX = x();
            this.V = f;
            float fX2 = x();
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        this.W = true;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (Z()) {
                this.T.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.S != z) {
            boolean Z = Z();
            this.S = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.T;
                if (Z2) {
                    v(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                C();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (this.R0) {
                q(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(float f) {
        if (this.P != f) {
            this.P = f;
            this.s0.setStrokeWidth(f);
            if (this.R0) {
                r(f);
            }
            invalidateSelf();
        }
    }

    public final void P(Drawable drawable) {
        Drawable drawable2 = this.Y;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fY = y();
            this.Y = drawable != null ? drawable.mutate() : null;
            int[] iArr = l24.a;
            this.Z = new RippleDrawable(l24.c(this.Q), this.Y, T0);
            float fY2 = y();
            b0(drawable2);
            if (a0()) {
                v(this.Y);
            }
            invalidateSelf();
            if (fY != fY2) {
                C();
            }
        }
    }

    public final void Q(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            if (a0()) {
                C();
            }
        }
    }

    public final void R(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            if (a0()) {
                C();
            }
        }
    }

    public final void S(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            invalidateSelf();
            if (a0()) {
                C();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            if (a0()) {
                this.Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z) {
        if (this.X != z) {
            boolean zA0 = a0();
            this.X = z;
            boolean zA1 = a0();
            if (zA0 != zA1) {
                Drawable drawable = this.Y;
                if (zA1) {
                    v(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                C();
            }
        }
    }

    public final void V(float f) {
        if (this.l0 != f) {
            float fX = x();
            this.l0 = f;
            float fX2 = x();
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void W(float f) {
        if (this.k0 != f) {
            float fX = x();
            this.k0 = f;
            float fX2 = x();
            invalidateSelf();
            if (fX != fX2) {
                C();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            this.M0 = null;
            onStateChange(getState());
        }
    }

    public final boolean Y() {
        return this.e0 && this.f0 != null && this.E0;
    }

    public final boolean Z() {
        return this.S && this.T != null;
    }

    @Override // defpackage.fi2, defpackage.wr4
    public final void a() {
        C();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.X && this.Y != null;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.G0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.R0;
        Paint paint = this.s0;
        RectF rectF = this.u0;
        if (!z) {
            paint.setColor(this.y0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, z(), z(), paint);
        }
        if (!this.R0) {
            paint.setColor(this.z0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.H0;
            if (colorFilter == null) {
                colorFilter = this.I0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, z(), z(), paint);
        }
        if (this.R0) {
            super.draw(canvas);
        }
        if (this.P > 0.0f && !this.R0) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.R0) {
                ColorFilter colorFilter2 = this.H0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.I0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.P / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.N - (this.P / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.C0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.R0) {
            RectF rectF2 = new RectF(bounds);
            ei2 ei2Var = this.n;
            bc4 bc4Var = ei2Var.a;
            float f4 = ei2Var.i;
            pz1 pz1Var = this.D;
            fo1 fo1Var = this.E;
            Path path = this.w0;
            fo1Var.d(bc4Var, f4, rectF2, pz1Var, path);
            e(canvas2, paint, path, this.n.a, g());
        } else {
            canvas2.drawRoundRect(rectF, z(), z(), paint);
        }
        if (Z()) {
            w(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.T.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (Y()) {
            w(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f0.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.P0 && this.R != null) {
            PointF pointF = this.v0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.R;
            xr4 xr4Var = this.x0;
            if (charSequence != null) {
                float fX = x() + this.j0 + this.m0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fX;
                } else {
                    pointF.x = bounds.right - fX;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = xr4Var.a;
                Paint.FontMetrics fontMetrics = this.t0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.R != null) {
                float fX2 = x() + this.j0 + this.m0;
                float fY = y() + this.q0 + this.n0;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fX2;
                    rectF.right = bounds.right - fY;
                } else {
                    rectF.left = i3 + fY;
                    rectF.right = bounds.right - fX2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            rr4 rr4Var = xr4Var.g;
            TextPaint textPaint2 = xr4Var.a;
            if (rr4Var != null) {
                textPaint2.drawableState = getState();
                xr4Var.g.e(this.r0, textPaint2, xr4Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(xr4Var.a(this.R.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.R;
            if (z2 && this.O0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.O0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (a0()) {
            rectF.setEmpty();
            if (a0()) {
                float f9 = this.q0 + this.p0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.b0;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.b0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.b0;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.Y.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = l24.a;
            this.Z.setBounds(this.Y.getBounds());
            this.Z.jumpToCurrentState();
            this.Z.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.G0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(y() + this.x0.a(this.R.toString()) + x() + this.j0 + this.m0 + this.n0 + this.q0), this.Q0);
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.M, this.N);
        } else {
            outline.setRoundRect(bounds, this.N);
            outline2 = outline;
        }
        outline2.setAlpha(this.G0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (A(this.K) || A(this.L) || A(this.O)) {
            return true;
        }
        rr4 rr4Var = this.x0.g;
        if (rr4Var == null || (colorStateList = rr4Var.j) == null || !colorStateList.isStateful()) {
            return (this.e0 && this.f0 != null && this.d0) || B(this.T) || B(this.f0) || A(this.J0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            zOnLayoutDirectionChanged |= this.T.setLayoutDirection(i);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= this.f0.setLayoutDirection(i);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.Y.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (Z()) {
            zOnLevelChange |= this.T.setLevel(i);
        }
        if (Y()) {
            zOnLevelChange |= this.f0.setLevel(i);
        }
        if (a0()) {
            zOnLevelChange |= this.Y.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.R0) {
            super.onStateChange(iArr);
        }
        return D(iArr, this.L0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.G0 != i) {
            this.G0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.H0 != colorFilter) {
            this.H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            ColorStateList colorStateList = this.J0;
            this.I0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.f0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.Y.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Y) {
            if (drawable.isStateful()) {
                drawable.setState(this.L0);
            }
            drawable.setTintList(this.a0);
            return;
        }
        Drawable drawable2 = this.T;
        if (drawable == drawable2 && this.W) {
            drawable2.setTintList(this.U);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void w(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f = this.j0 + this.k0;
            Drawable drawable = this.E0 ? this.f0 : this.T;
            float intrinsicWidth = this.V;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.E0 ? this.f0 : this.T;
            float fCeil = this.V;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(vr1.l(this.r0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float x() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f = this.k0;
        Drawable drawable = this.E0 ? this.f0 : this.T;
        float intrinsicWidth = this.V;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.l0;
    }

    public final float y() {
        if (a0()) {
            return this.o0 + this.b0 + this.p0;
        }
        return 0.0f;
    }

    public final float z() {
        return this.R0 ? h() : this.N;
    }
}
