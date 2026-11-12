package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg2 extends e9 {
    public final fi2 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public vg2(Context context, int i) {
        TypedValue typedValueD = zz1.D(context, R.attr.materialAlertDialogTheme);
        int i2 = typedValueD == null ? 0 : typedValueD.data;
        Context contextH = su3.H(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextH = i2 != 0 ? new ud0(contextH, i2) : contextH;
        TypedValue typedValueD2 = zz1.D(context, R.attr.materialAlertDialogTheme);
        super(contextH, typedValueD2 == null ? 0 : typedValueD2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        uc5.c(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = ht3.t;
        uc5.g(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iR = g12.r(R.attr.colorSurface, context2, vg2.class.getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iR);
        typedArrayObtainStyledAttributes2.recycle();
        fi2 fi2Var = new fi2(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        fi2Var.j(context2);
        fi2Var.m(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                zc1 zc1VarG = fi2Var.n.a.g();
                zc1VarG.b(dimension);
                fi2Var.setShapeAppearanceModel(zc1VarG.a());
            }
        }
        this.c = fi2Var;
    }

    @Override // defpackage.e9
    public final e9 a() {
        this.a.m = false;
        return this;
    }

    @Override // defpackage.e9
    public final e9 b(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    @Override // defpackage.e9
    public final void c(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    @Override // defpackage.e9
    public final f9 create() {
        f9 f9VarCreate = super.create();
        Window window = f9VarCreate.getWindow();
        View decorView = window.getDecorView();
        fi2 fi2Var = this.c;
        if (fi2Var != null) {
            WeakHashMap weakHashMap = j65.a;
            fi2Var.l(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) fi2Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new uz1(f9VarCreate, rect));
        return f9VarCreate;
    }

    @Override // defpackage.e9
    public final e9 d(CharSequence charSequence, ip3 ip3Var) {
        super.d(charSequence, ip3Var);
        return this;
    }

    @Override // defpackage.e9
    public final e9 e(int i, DialogInterface.OnClickListener onClickListener) {
        super.e(R.string.customactivityoncrash_error_activity_error_details_copy, onClickListener);
        return this;
    }

    @Override // defpackage.e9
    public final e9 f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequence, onClickListener);
        return this;
    }

    public final void i(int i) {
        a9 a9Var = this.a;
        a9Var.f = a9Var.a.getText(i);
    }

    public final vg2 j(int i, DialogInterface.OnClickListener onClickListener) {
        return (vg2) super.setNegativeButton(i, onClickListener);
    }

    public final void k(int i, DialogInterface.OnClickListener onClickListener) {
        super.e(i, onClickListener);
    }

    public final vg2 l(int i, DialogInterface.OnClickListener onClickListener) {
        return (vg2) super.setPositiveButton(i, onClickListener);
    }

    public final void m(String str, rn1 rn1Var) {
        super.f(str, rn1Var);
    }

    public final void n(CharSequence[] charSequenceArr, wf4 wf4Var) {
        super.g(charSequenceArr, -1, wf4Var);
    }

    public final vg2 o(CharSequence charSequence) {
        return (vg2) super.setTitle(charSequence);
    }

    public final void p(int i) {
        a9 a9Var = this.a;
        a9Var.d = a9Var.a.getText(i);
    }

    public final vg2 q(View view) {
        return (vg2) super.setView(view);
    }

    @Override // defpackage.e9
    public final e9 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (vg2) super.setNegativeButton(i, onClickListener);
    }

    @Override // defpackage.e9
    public final e9 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (vg2) super.setPositiveButton(i, onClickListener);
    }

    @Override // defpackage.e9
    public final e9 setTitle(CharSequence charSequence) {
        return (vg2) super.setTitle(charSequence);
    }

    @Override // defpackage.e9
    public final e9 setView(View view) {
        return (vg2) super.setView(view);
    }
}
