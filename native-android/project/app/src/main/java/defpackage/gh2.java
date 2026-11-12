package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import app.homemusic.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gh2 {
    public final MaterialButton a;
    public bc4 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public fi2 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public RippleDrawable s;
    public int t;

    public gh2(MaterialButton r2, bc4 r3) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = true;
        this.a = r2;
        this.b = r3;
    }

    public final lc4 a() {
        RippleDrawable r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.getNumberOfLayers() <= 1) goto L14;
        int r1 = this.s.getNumberOfLayers();
        RippleDrawable r3 = this.s;
        if (r1 <= 2) goto L11;
        return (lc4) r3.getDrawable(2);
    L11:
        return (lc4) r3.getDrawable(1);
    L14:
        return null;
    }

    public final fi2 b(boolean r2) {
        RippleDrawable r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.getNumberOfLayers() > 0) goto L7;
        return null;
    L7:
        return (fi2) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!r2 ? 1 : 0);
    }

    public final void c(bc4 r3) {
        this.b = r3;
        if (b(false) == null) goto L6;
        b(false).setShapeAppearanceModel(r3);
    L6:
        if (b(true) == null) goto L9;
        b(true).setShapeAppearanceModel(r3);
    L9:
        if (a() == null) goto L12;
        a().setShapeAppearanceModel(r3);
        return;
    }

    public final void d(int r9, int r10) {
        WeakHashMap r0 = j65.a;
        MaterialButton r1 = this.a;
        int r2 = r1.getPaddingStart();
        int r3 = r1.getPaddingTop();
        int r4 = r1.getPaddingEnd();
        int r5 = r1.getPaddingBottom();
        int r6 = this.e;
        int r7 = this.f;
        this.f = r10;
        this.e = r9;
        if (this.o == true) goto L5;
        e();
    L5:
        r1.setPaddingRelative(r2, (r3 + r9) - r6, r4, (r5 + r10) - r7);
    }

    public final void e() {
        fi2 r0 = new fi2(this.b);
        MaterialButton r1 = this.a;
        r0.j(r1.getContext());
        r0.setTintList(this.j);
        PorterDuff.Mode r2 = this.i;
        if (r2 == null) goto L5;
        r0.setTintMode(r2);
    L5:
        float r3 = this.h;
        ColorStateList r4 = this.k;
        r0.r(r3);
        r0.q(r4);
        fi2 r5 = new fi2(this.b);
        r5.setTint(0);
        float r6 = this.h;
        if (this.n == false) goto L8;
        int r7 = g12.t(r1, R.attr.colorSurface);
    L9:
        r5.r(r6);
        r5.q(ColorStateList.valueOf(r7));
        fi2 r8 = new fi2(this.b);
        this.m = r8;
        r8.setTint(-1);
        RippleDrawable r9 = new RippleDrawable(l24.c(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{r5, r0}), this.c, this.e, this.d, this.f), this.m);
        this.s = r9;
        r1.setInternalBackground(r9);
        fi2 r10 = b(false);
        if (r10 == null) goto L13;
        r10.l(this.t);
        r10.setState(r1.getDrawableState());
        return;
    L13:
        return;
    L8:
        r7 = 0;
        goto L9
    }

    public final void f() {
        int r0 = 0;
        fi2 r1 = b(false);
        fi2 r2 = b(true);
        if (r1 == null) goto L11;
        float r3 = this.h;
        ColorStateList r4 = this.k;
        r1.r(r3);
        r1.q(r4);
        if (r2 == null) goto L12;
        float r5 = this.h;
        if (this.n == false) goto L9;
        r0 = g12.t(this.a, R.attr.colorSurface);
    L9:
        r2.r(r5);
        r2.q(ColorStateList.valueOf(r0));
        return;
    L12:
        return;
    }
}
