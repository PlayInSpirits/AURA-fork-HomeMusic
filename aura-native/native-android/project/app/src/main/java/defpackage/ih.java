package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih {
    public final TextView a;
    public la0 b;
    public la0 c;
    public la0 d;
    public la0 e;
    public la0 f;
    public la0 g;
    public la0 h;
    public final rh i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ih(TextView textView) {
        this.a = textView;
        this.i = new rh(textView);
    }

    public static la0 c(Context context, fg fgVar, int i) {
        ColorStateList colorStateListG;
        synchronized (fgVar) {
            colorStateListG = fgVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        la0 la0Var = new la0();
        la0Var.o = true;
        la0Var.p = colorStateListG;
        return la0Var;
    }

    public final void a(Drawable drawable, la0 la0Var) {
        if (drawable == null || la0Var == null) {
            return;
        }
        fg.e(drawable, la0Var, this.a.getDrawableState());
    }

    public final void b() {
        la0 la0Var = this.b;
        TextView textView = this.a;
        if (la0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        la0 la0Var = this.h;
        if (la0Var != null) {
            return (ColorStateList) la0Var.p;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        la0 la0Var = this.h;
        if (la0Var != null) {
            return (PorterDuff.Mode) la0Var.q;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x039f  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:237:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        fg fgVarA = fg.a();
        int[] iArr = st3.h;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, i);
        j65.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) jv3VarF.o, i, 0);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, fgVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, fgVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, fgVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, fgVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, fgVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, fgVarA, typedArray.getResourceId(6, 0));
        }
        jv3VarF.g();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = st3.y;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            jv3 jv3Var = new jv3(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, jv3Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            jv3Var.g();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        jv3 jv3Var2 = new jv3(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, jv3Var2);
        jv3Var2.g();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            gh.d(textView, string);
        }
        if (string2 != null) {
            fh.b(textView, fh.a(string2));
        }
        rh rhVar = this.i;
        Context context2 = rhVar.j;
        int[] iArr3 = st3.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = rhVar.i;
        j65.n(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            rhVar.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                rhVar.f = rh.b(iArr4);
                rhVar.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!rhVar.j()) {
            rhVar.a = 0;
        } else if (rhVar.a == 1) {
            if (!rhVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                rhVar.k(dimension2, f, dimension);
            }
            rhVar.h();
        }
        if (e85.c && rhVar.a != 0) {
            int[] iArr5 = rhVar.f;
            if (iArr5.length > 0) {
                if (gh.a(textView) != -1.0f) {
                    gh.b(textView, Math.round(rhVar.d), Math.round(rhVar.e), Math.round(rhVar.c), 0);
                } else {
                    gh.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? fgVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? fgVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? fgVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? fgVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? fgVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? fgVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = ud3.n(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(aw0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i6 = typedValuePeekValue.data;
                int i7 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
                i3 = i7;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                ya4.I(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                ya4.J(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    ya4.K(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    a3.o(textView, i3, dimensionPixelSize);
                } else {
                    ya4.K(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            ya4.I(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            ya4.J(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                ya4.K(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                a3.o(textView, i3, dimensionPixelSize);
            } else {
                ya4.K(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, st3.y);
        jv3 jv3Var = new jv3(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, jv3Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            gh.d(textView, string);
        }
        jv3Var.g();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        rh rhVar = this.i;
        if (rhVar.j()) {
            DisplayMetrics displayMetrics = rhVar.j.getResources().getDisplayMetrics();
            rhVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (rhVar.h()) {
                rhVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        rh rhVar = this.i;
        if (rhVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = rhVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                rhVar.f = rh.b(iArrCopyOf);
                if (!rhVar.i()) {
                    kf2.l(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                rhVar.g = false;
            }
            if (rhVar.h()) {
                rhVar.a();
            }
        }
    }

    public final void j(int i) {
        rh rhVar = this.i;
        if (rhVar.j()) {
            if (i == 0) {
                rhVar.a = 0;
                rhVar.d = -1.0f;
                rhVar.e = -1.0f;
                rhVar.c = -1.0f;
                rhVar.f = new int[0];
                rhVar.b = false;
                return;
            }
            if (i != 1) {
                kf2.n(f34.f(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = rhVar.j.getResources().getDisplayMetrics();
            rhVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (rhVar.h()) {
                rhVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new la0();
        }
        la0 la0Var = this.h;
        la0Var.p = colorStateList;
        la0Var.o = colorStateList != null;
        this.b = la0Var;
        this.c = la0Var;
        this.d = la0Var;
        this.e = la0Var;
        this.f = la0Var;
        this.g = la0Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new la0();
        }
        la0 la0Var = this.h;
        la0Var.q = mode;
        la0Var.n = mode != null;
        this.b = la0Var;
        this.c = la0Var;
        this.d = la0Var;
        this.e = la0Var;
        this.f = la0Var;
        this.g = la0Var;
    }

    public final void m(Context context, jv3 jv3Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) jv3Var.o;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceE = jv3Var.e(i5, this.j, new dh(this, i6, i7, new WeakReference(this.a)));
                if (typefaceE != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceE;
                    } else {
                        this.l = hh.a(Typeface.create(typefaceE, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = hh.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
