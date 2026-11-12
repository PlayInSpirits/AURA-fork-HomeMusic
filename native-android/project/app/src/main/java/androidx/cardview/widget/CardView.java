package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.h12;
import defpackage.h34;
import defpackage.jt3;
import defpackage.rf2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] s = {R.attr.colorBackground};
    public boolean n;
    public boolean o;
    public final Rect p;
    public final Rect q;
    public final rf2 r;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.p = rect;
        this.q = new Rect();
        rf2 rf2Var = new rf2();
        rf2Var.o = this;
        this.r = rf2Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jt3.a, i, app.homemusic.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(s);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(app.homemusic.R.color.cardview_light_background) : getResources().getColor(app.homemusic.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.n = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        h34 h34Var = new h34(colorStateListValueOf, dimension);
        rf2Var.n = h34Var;
        setBackgroundDrawable(h34Var);
        setClipToOutline(true);
        setElevation(dimension2);
        h12.N(rf2Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((h34) this.r.n).h;
    }

    public float getCardElevation() {
        return ((CardView) this.r.o).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.p.bottom;
    }

    public int getContentPaddingLeft() {
        return this.p.left;
    }

    public int getContentPaddingRight() {
        return this.p.right;
    }

    public int getContentPaddingTop() {
        return this.p.top;
    }

    public float getMaxCardElevation() {
        return ((h34) this.r.n).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.o;
    }

    public float getRadius() {
        return ((h34) this.r.n).a;
    }

    public boolean getUseCompatPadding() {
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        h34 h34Var = (h34) this.r.n;
        if (colorStateListValueOf == null) {
            h34Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        h34Var.h = colorStateListValueOf;
        h34Var.b.setColor(colorStateListValueOf.getColorForState(h34Var.getState(), h34Var.h.getDefaultColor()));
        h34Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.r.o).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        h12.N(this.r, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.o) {
            this.o = z;
            rf2 rf2Var = this.r;
            h12.N(rf2Var, ((h34) rf2Var.n).e);
        }
    }

    public void setRadius(float f) {
        h34 h34Var = (h34) this.r.n;
        if (f == h34Var.a) {
            return;
        }
        h34Var.a = f;
        h34Var.b(null);
        h34Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.n != z) {
            this.n = z;
            rf2 rf2Var = this.r;
            h12.N(rf2Var, ((h34) rf2Var.n).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        h34 h34Var = (h34) this.r.n;
        if (colorStateList == null) {
            h34Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        h34Var.h = colorStateList;
        h34Var.b.setColor(colorStateList.getColorForState(h34Var.getState(), h34Var.h.getDefaultColor()));
        h34Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
