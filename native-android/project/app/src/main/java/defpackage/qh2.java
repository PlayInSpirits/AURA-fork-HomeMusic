package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import app.homemusic.R;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh2 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public final MaterialCardView a;
    public final fi2 c;
    public final fi2 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public bc4 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public fi2 q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public qh2(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        fi2 fi2Var = new fi2(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.c = fi2Var;
        fi2Var.j(materialCardView.getContext());
        fi2Var.o();
        zc1 zc1VarG = fi2Var.n.a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ht3.g, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            zc1VarG.b(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new fi2();
        h(zc1VarG.a());
        this.u = g12.O(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
        this.v = g12.N(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = g12.N(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(su3 su3Var, float f) {
        if (su3Var instanceof m34) {
            return (float) ((1.0d - y) * ((double) f));
        }
        if (su3Var instanceof ch0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        su3 su3Var = this.m.a;
        fi2 fi2Var = this.c;
        return Math.max(Math.max(b(su3Var, fi2Var.h()), b(this.m.b, fi2Var.n.a.f.a(fi2Var.g()))), Math.max(b(this.m.c, fi2Var.n.a.g.a(fi2Var.g())), b(this.m.d, fi2Var.n.a.h.a(fi2Var.g()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            int[] iArr = l24.a;
            this.q = new fi2(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final ph2 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new ph2(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            boolean z2 = (i5 & 8388613) == 8388613;
            int i6 = this.e;
            int i7 = z2 ? ((i - i6) - this.f) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f) - iCeil;
            }
            int i10 = i6;
            WeakHashMap weakHashMap = j65.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.p.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.x;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new cn0(3, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.a.v, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(bc4 bc4Var) {
        this.m = bc4Var;
        fi2 fi2Var = this.c;
        fi2Var.setShapeAppearanceModel(bc4Var);
        fi2Var.I = !fi2Var.k();
        fi2 fi2Var2 = this.d;
        if (fi2Var2 != null) {
            fi2Var2.setShapeAppearanceModel(bc4Var);
        }
        fi2 fi2Var3 = this.q;
        if (fi2Var3 != null) {
            fi2Var3.setShapeAppearanceModel(bc4Var);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.k() && materialCardView.getUseCompatPadding();
    }

    public final void j() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.k()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.p.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        rf2 rf2Var = materialCardView.r;
        CardView cardView = (CardView) rf2Var.o;
        if (!cardView.getUseCompatPadding()) {
            rf2Var.l(0, 0, 0, 0);
            return;
        }
        h34 h34Var = (h34) rf2Var.n;
        float f = h34Var.e;
        float f2 = h34Var.a;
        int iCeil = (int) Math.ceil(i34.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(i34.b(f, f2, cardView.getPreventCornerOverlap()));
        rf2Var.l(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void k() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
