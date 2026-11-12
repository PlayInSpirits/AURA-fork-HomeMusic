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
    public static final double y = 0.0d;
    public static final ColorDrawable z = null;
    public final MaterialCardView a;
    public final Rect b;
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
    public boolean r;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public float x;

    static {
        y = Math.cos(Math.toRadians(45.0d));
        if (Build.VERSION.SDK_INT > 28) goto L5;
        ColorDrawable r0 = new ColorDrawable();
    L6:
        z = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public qh2(MaterialCardView r6, AttributeSet r7, int r8) {
        this.b = new Rect();
        this.r = false;
        this.x = 0.0f;
        this.a = r6;
        fi2 r1 = new fi2(r6.getContext(), r7, r8, R.style.Widget_MaterialComponents_CardView);
        this.c = r1;
        r1.j(r6.getContext());
        r1.o();
        zc1 r2 = r1.n.a.g();
        TypedArray r9 = r6.getContext().obtainStyledAttributes(r7, ht3.g, r8, R.style.CardView);
        if (r9.hasValue(3) == false) goto L5;
        r2.b(r9.getDimension(3, 0.0f));
    L5:
        this.d = new fi2();
        h(r2.a());
        this.u = g12.O(r6.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
        this.v = g12.N(r6.getContext(), R.attr.motionDurationShort2, 300);
        this.w = g12.N(r6.getContext(), R.attr.motionDurationShort1, 300);
        r9.recycle();
    }

    public static float b(su3 r4, float r5) {
        if ((r4 instanceof m34) == false) goto L7;
        return (float) ((1.0d - y) * ((double) r5));
    L7:
        if ((r4 instanceof ch0) == true) goto L9;
        return 0.0f;
    L9:
        return r5 / 2.0f;
    }

    public final float a() {
        su3 r0 = this.m.a;
        fi2 r1 = this.c;
        return Math.max(Math.max(b(r0, r1.h()), b(this.m.b, r1.n.a.f.a(r1.g()))), Math.max(b(this.m.c, r1.n.a.g.a(r1.g())), b(this.m.d, r1.n.a.h.a(r1.g()))));
    }

    public final LayerDrawable c() {
        if (this.o != null) goto L6;
        int[] r0 = l24.a;
        this.q = new fi2(this.m);
        this.o = new RippleDrawable(this.k, null, this.q);
    L6:
        if (this.p != null) goto L9;
        LayerDrawable r1 = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
        this.p = r1;
        r1.setId(2, R.id.mtrl_card_checked_layer_id);
    L9:
        return this.p;
    }

    public final ph2 d(Drawable r9) {
        MaterialCardView r0 = this.a;
        if (r0.getUseCompatPadding() == false) goto L12;
        float r1 = r0.getMaxCardElevation() * 1.5f;
        float r3 = 0.0f;
        if (i() == false) goto L7;
        float r2 = a();
    L8:
        int r4 = (int) Math.ceil(r1 + r2);
        float r5 = r0.getMaxCardElevation();
        if (i() == false) goto L11;
        r3 = a();
    L11:
        int r6 = (int) Math.ceil(r5 + r3);
        int r7 = r4;
    L14:
        return new ph2(r9, r6, r7, r6, r7);
    L7:
        r2 = 0.0f;
        goto L8
    L12:
        r6 = 0;
        r7 = 0;
        goto L14
    }

    public final void e(int r19, int r20) {
        if (this.p == null) goto L48;
        MaterialCardView r1 = this.a;
        boolean r3 = false;
        if (r1.getUseCompatPadding() == false) goto L14;
        float r2 = r1.getMaxCardElevation() * 1.5f;
        float r5 = 0.0f;
        if (i() == false) goto L9;
        float r4 = a();
    L10:
        int r6 = (int) Math.ceil((r2 + r4) * 2.0f);
        float r7 = r1.getMaxCardElevation();
        if (i() == false) goto L13;
        r5 = a();
    L13:
        int r8 = (int) Math.ceil((r7 + r5) * 2.0f);
    L15:
        int r9 = this.g;
        if ((r9 & 8388613) != 8388613) goto L18;
        boolean r10 = true;
    L19:
        int r11 = this.e;
        if (r10 == false) goto L22;
        int r12 = ((r19 - r11) - this.f) - r8;
    L24:
        if ((r9 & 80) != 80) goto L26;
        boolean r13 = true;
    L27:
        if (r13 == false) goto L29;
        int r17 = r11;
    L31:
        if ((r9 & 8388613) != 8388613) goto L33;
        boolean r14 = true;
    L34:
        if (r14 == false) goto L36;
        int r15 = r11;
    L38:
        if ((r9 & 80) != 80) goto L40;
        r3 = true;
    L40:
        if (r3 == false) goto L42;
        r11 = ((r20 - r11) - this.f) - r6;
    L42:
        int r16 = r11;
        WeakHashMap r18 = j65.a;
        if (r1.getLayoutDirection() != 1) goto L45;
        int r110 = r15;
        int r111 = r12;
    L46:
        this.p.setLayerInset(2, r110, r16, r111, r17);
        return;
    L45:
        r111 = r15;
        r110 = r12;
        goto L46
    L36:
        r15 = ((r19 - r11) - this.f) - r8;
        goto L38
    L33:
        r14 = false;
        goto L34
    L29:
        r17 = ((r20 - r11) - this.f) - r6;
        goto L31
    L26:
        r13 = false;
        goto L27
    L22:
        r12 = r11;
        goto L24
    L18:
        r10 = false;
        goto L19
    L9:
        r4 = 0.0f;
        goto L10
    L14:
        r6 = 0;
        r8 = 0;
        goto L15
    }

    public final void f(boolean r5, boolean r6) {
        Drawable r0 = this.j;
        if (r0 == null) goto L28;
        int r1 = 0;
        float r2 = 0.0f;
        if (r6 == false) goto L21;
        if (r5 == false) goto L8;
        r2 = 1.0f;
    L8:
        float r7 = this.x;
        if (r5 == false) goto L11;
        r7 = 1.0f - r7;
    L11:
        ValueAnimator r3 = this.t;
        if (r3 == null) goto L14;
        r3.cancel();
        this.t = null;
    L14:
        ValueAnimator r4 = ValueAnimator.ofFloat(new float[]{this.x, r2});
        this.t = r4;
        r4.addUpdateListener(new cn0(3, this));
        this.t.setInterpolator(this.u);
        ValueAnimator r8 = this.t;
        if (r5 == false) goto L18;
        int r9 = this.v;
    L19:
        r8.setDuration((long) (r9 * r7));
        this.t.start();
        return;
    L18:
        r9 = this.w;
        goto L19
    L21:
        if (r5 == false) goto L23;
        r1 = 255;
    L23:
        r0.setAlpha(r1);
        if (r5 == false) goto L26;
        r2 = 1.0f;
    L26:
        this.x = r2;
        return;
    }

    public final void g(Drawable r2) {
        if (r2 == null) goto L4;
        Drawable r3 = r2.mutate();
        this.j = r3;
        r3.setTintList(this.l);
        f(this.a.v, false);
    L5:
        LayerDrawable r4 = this.p;
        if (r4 == null) goto L9;
        r4.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        return;
    L9:
        return;
    L4:
        this.j = z;
        goto L5
    }

    public final void h(bc4 r3) {
        this.m = r3;
        fi2 r0 = this.c;
        r0.setShapeAppearanceModel(r3);
        r0.I = !r0.k();
        fi2 r1 = this.d;
        if (r1 == null) goto L5;
        r1.setShapeAppearanceModel(r3);
    L5:
        fi2 r2 = this.q;
        if (r2 == null) goto L9;
        r2.setShapeAppearanceModel(r3);
        return;
    }

    public final boolean i() {
        MaterialCardView r0 = this.a;
        if (r0.getPreventCornerOverlap() == true) goto L5;
        return false;
    L5:
        if (this.c.k() == true) goto L7;
        return false;
    L7:
        if (r0.getUseCompatPadding() == false) goto L13;
        return true;
    L13:
        return false;
    }

    public final void j() {
        MaterialCardView r0 = this.a;
        float r2 = 0.0f;
        if (r0.getPreventCornerOverlap() == false) goto L8;
        if (this.c.k() == true) goto L8;
    L9:
        float r1 = a();
    L12:
        if (r0.getPreventCornerOverlap() == true) goto L14;
    L16:
        int r3 = (int) (r1 - r2);
        Rect r6 = this.b;
        r0.p.set(r6.left + r3, r6.top + r3, r6.right + r3, r6.bottom + r3);
        rf2 r7 = r0.r;
        CardView r4 = (CardView) r7.o;
        if (r4.getUseCompatPadding() == true) goto L20;
        r7.l(0, 0, 0, 0);
        return;
    L20:
        h34 r5 = (h34) r7.n;
        float r8 = r5.e;
        float r9 = r5.a;
        int r10 = (int) Math.ceil(i34.a(r8, r9, r4.getPreventCornerOverlap()));
        int r11 = (int) Math.ceil(i34.b(r8, r9, r4.getPreventCornerOverlap()));
        r7.l(r10, r11, r10, r11);
        return;
    L14:
        if (r0.getUseCompatPadding() == false) goto L16;
        r2 = (float) ((1.0d - y) * ((double) r0.getCardViewRadius()));
    L8:
        if (i() == true) goto L9;
        r1 = 0.0f;
        goto L12
    }

    public final void k() {
        boolean r0 = this.r;
        MaterialCardView r1 = this.a;
        if (r0 == true) goto L5;
        r1.setBackgroundInternal(d(this.c));
    L5:
        r1.setForeground(d(this.i));
    }
}
