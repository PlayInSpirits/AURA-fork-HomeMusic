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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public gh2(MaterialButton materialButton, bc4 bc4Var) {
        this.a = materialButton;
        this.b = bc4Var;
    }

    public final lc4 a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.s;
        return numberOfLayers > 2 ? (lc4) rippleDrawable2.getDrawable(2) : (lc4) rippleDrawable2.getDrawable(1);
    }

    public final fi2 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (fi2) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(bc4 bc4Var) {
        this.b = bc4Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(bc4Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(bc4Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(bc4Var);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = j65.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        fi2 fi2Var = new fi2(this.b);
        MaterialButton materialButton = this.a;
        fi2Var.j(materialButton.getContext());
        fi2Var.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            fi2Var.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        fi2Var.r(f);
        fi2Var.q(colorStateList);
        fi2 fi2Var2 = new fi2(this.b);
        fi2Var2.setTint(0);
        float f2 = this.h;
        int t = this.n ? g12.t(materialButton, R.attr.colorSurface) : 0;
        fi2Var2.r(f2);
        fi2Var2.q(ColorStateList.valueOf(t));
        fi2 fi2Var3 = new fi2(this.b);
        this.m = fi2Var3;
        fi2Var3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(l24.c(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fi2Var2, fi2Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        fi2 b = b(false);
        if (b != null) {
            b.l(this.t);
            b.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        fi2 b = b(false);
        fi2 b2 = b(true);
        if (b != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            b.r(f);
            b.q(colorStateList);
            if (b2 != null) {
                float f2 = this.h;
                int t = this.n ? g12.t(this.a, R.attr.colorSurface) : 0;
                b2.r(f2);
                b2.q(ColorStateList.valueOf(t));
            }
        }
    }
}
