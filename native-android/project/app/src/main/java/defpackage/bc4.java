package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc4 {
    public static final oy3 m = new oy3(0.5f);
    public su3 a = new m34();
    public su3 b = new m34();
    public su3 c = new m34();
    public su3 d = new m34();
    public ke0 e = new m(0.0f);
    public ke0 f = new m(0.0f);
    public ke0 g = new m(0.0f);
    public ke0 h = new m(0.0f);
    public fz0 i;
    public fz0 j;
    public fz0 k;
    public fz0 l;

    public bc4() {
        int i = 0;
        this.i = new fz0(i);
        this.j = new fz0(i);
        this.k = new fz0(i);
        this.l = new fz0(i);
    }

    public static zc1 a(Context context, int i, int i2) {
        return b(context, i, i2, new m(0.0f));
    }

    public static zc1 b(Context context, int i, int i2, ke0 ke0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ht3.P);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            ke0 ke0VarE = e(typedArrayObtainStyledAttributes, 5, ke0Var);
            ke0 ke0VarE2 = e(typedArrayObtainStyledAttributes, 8, ke0VarE);
            ke0 ke0VarE3 = e(typedArrayObtainStyledAttributes, 9, ke0VarE);
            ke0 ke0VarE4 = e(typedArrayObtainStyledAttributes, 7, ke0VarE);
            ke0 ke0VarE5 = e(typedArrayObtainStyledAttributes, 6, ke0VarE);
            zc1 zc1Var = new zc1();
            zc1Var.a = ji2.v(i4);
            zc1Var.e = ke0VarE2;
            zc1Var.b = ji2.v(i5);
            zc1Var.f = ke0VarE3;
            zc1Var.c = ji2.v(i6);
            zc1Var.g = ke0VarE4;
            zc1Var.d = ji2.v(i7);
            zc1Var.h = ke0VarE5;
            return zc1Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static zc1 c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new m(0.0f));
    }

    public static zc1 d(Context context, AttributeSet attributeSet, int i, int i2, ke0 ke0Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.D, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, ke0Var);
    }

    public static ke0 e(TypedArray typedArray, int i, ke0 ke0Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new m(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new oy3(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ke0Var;
    }

    public final boolean f(RectF rectF) {
        boolean z = this.l.getClass().equals(fz0.class) && this.j.getClass().equals(fz0.class) && this.i.getClass().equals(fz0.class) && this.k.getClass().equals(fz0.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof m34) && (this.a instanceof m34) && (this.c instanceof m34) && (this.d instanceof m34));
    }

    public final zc1 g() {
        zc1 zc1Var = new zc1();
        zc1Var.a = this.a;
        zc1Var.b = this.b;
        zc1Var.c = this.c;
        zc1Var.d = this.d;
        zc1Var.e = this.e;
        zc1Var.f = this.f;
        zc1Var.g = this.g;
        zc1Var.h = this.h;
        zc1Var.i = this.i;
        zc1Var.j = this.j;
        zc1Var.k = this.k;
        zc1Var.l = this.l;
        return zc1Var;
    }
}
