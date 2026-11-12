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

    public vg2(Context r14, int r15) {
        TypedValue r0 = zz1.D(r14, R.attr.materialAlertDialogTheme);
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        Context r5 = su3.H(r14, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        if (r1 == 0) goto L10;
        r5 = new ud0(r5, r1);
    L10:
        TypedValue r16 = zz1.D(r14, R.attr.materialAlertDialogTheme);
        if (r16 != null) goto L13;
        int r17 = 0;
    L14:
        super(r5, r17);
        Context r6 = getContext();
        Resources.Theme r18 = r6.getTheme();
        uc5.c(r6, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] r8 = ht3.t;
        uc5.g(r6, null, r8, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray r19 = r6.obtainStyledAttributes(null, r8, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int r2 = r19.getDimensionPixelSize(2, r6.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int r7 = r19.getDimensionPixelSize(3, r6.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int r9 = r19.getDimensionPixelSize(1, r6.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int r3 = r19.getDimensionPixelSize(0, r6.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        r19.recycle();
        if (r6.getResources().getConfiguration().getLayoutDirection() != 1) goto L17;
        r9 = r2;
        r2 = r9;
    L17:
        this.d = new Rect(r2, r7, r9, r3);
        int r110 = g12.r(R.attr.colorSurface, r6, vg2.class.getCanonicalName());
        TypedArray r4 = r6.obtainStyledAttributes(null, r8, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int r111 = r4.getColor(4, r110);
        r4.recycle();
        fi2 r10 = new fi2(r6, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        r10.j(r6);
        r10.m(ColorStateList.valueOf(r111));
        if (Build.VERSION.SDK_INT < 28) goto L24;
        TypedValue r112 = new TypedValue();
        r18.resolveAttribute(android.R.attr.dialogCornerRadius, r112, true);
        float r113 = r112.getDimension(getContext().getResources().getDisplayMetrics());
        if (r112.type != 5) goto L24;
        if (r113 < 0.0f) goto L24;
        zc1 r114 = r10.n.a.g();
        r114.b(r113);
        r10.setShapeAppearanceModel(r114.a());
    L24:
        this.c = r10;
        return;
    L13:
        r17 = r16.data;
        goto L14
    L5:
        r1 = r0.data;
        goto L6
    }

    @Override // defpackage.e9
    public final e9 a() {
        this.a.m = false;
        return this;
    }

    @Override // defpackage.e9
    public final e9 b(Drawable r2) {
        this.a.c = r2;
        return this;
    }

    @Override // defpackage.e9
    public final void c(CharSequence r1) {
        this.a.f = r1;
    }

    @Override // defpackage.e9
    public final f9 create() {
        f9 r0 = super.create();
        Window r1 = r0.getWindow();
        View r2 = r1.getDecorView();
        fi2 r4 = this.c;
        if (r4 == null) goto L5;
        WeakHashMap r3 = j65.a;
        r4.l(r2.getElevation());
    L5:
        Rect r9 = this.d;
        r1.setBackgroundDrawable(new InsetDrawable(r4, r9.left, r9.top, r9.right, r9.bottom));
        r2.setOnTouchListener(new uz1(r0, r9));
        return r0;
    }

    @Override // defpackage.e9
    public final e9 d(CharSequence r1, ip3 r2) {
        super.d(r1, r2);
        return this;
    }

    @Override // defpackage.e9
    public final e9 e(int r1, DialogInterface.OnClickListener r2) {
        super.e(R.string.customactivityoncrash_error_activity_error_details_copy, r2);
        return this;
    }

    @Override // defpackage.e9
    public final e9 f(CharSequence r1, DialogInterface.OnClickListener r2) {
        super.f(r1, r2);
        return this;
    }

    public final void i(int r2) {
        a9 r1 = this.a;
        r1.f = r1.a.getText(r2);
    }

    public final vg2 j(int r1, DialogInterface.OnClickListener r2) {
        return (vg2) super.setNegativeButton(r1, r2);
    }

    public final void k(int r1, DialogInterface.OnClickListener r2) {
        super.e(r1, r2);
    }

    public final vg2 l(int r1, DialogInterface.OnClickListener r2) {
        return (vg2) super.setPositiveButton(r1, r2);
    }

    public final void m(String r1, rn1 r2) {
        super.f(r1, r2);
    }

    public final void n(CharSequence[] r2, wf4 r3) {
        super.g(r2, -1, r3);
    }

    public final vg2 o(CharSequence r1) {
        return (vg2) super.setTitle(r1);
    }

    public final void p(int r2) {
        a9 r1 = this.a;
        r1.d = r1.a.getText(r2);
    }

    public final vg2 q(View r1) {
        return (vg2) super.setView(r1);
    }

    @Override // defpackage.e9
    public final e9 setNegativeButton(int r1, DialogInterface.OnClickListener r2) {
        return (vg2) super.setNegativeButton(r1, r2);
    }

    @Override // defpackage.e9
    public final e9 setPositiveButton(int r1, DialogInterface.OnClickListener r2) {
        return (vg2) super.setPositiveButton(r1, r2);
    }

    @Override // defpackage.e9
    public final e9 setTitle(CharSequence r1) {
        return (vg2) super.setTitle(r1);
    }

    @Override // defpackage.e9
    public final e9 setView(View r1) {
        return (vg2) super.setView(r1);
    }
}
