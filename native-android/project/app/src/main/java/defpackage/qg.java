package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg extends wo0 {
    public final pg q;
    public Drawable r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public boolean u;
    public boolean v;

    public qg(pg r2) {
        super(r2);
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.q = r2;
    }

    @Override // defpackage.wo0
    public final void C(AttributeSet r10, int r11) {
        super.C(r10, r11);
        pg r0 = this.q;
        Context r1 = r0.getContext();
        int[] r2 = st3.g;
        jv3 r7 = jv3.f(r1, r10, r2, r11);
        TypedArray r8 = (TypedArray) r7.o;
        j65.n(r0, r0.getContext(), r2, r10, (TypedArray) r7.o, r11, 0);
        Drawable r12 = r7.d(0);
        if (r12 == null) goto L5;
        r0.setThumb(r12);
    L5:
        Drawable r13 = r7.c(1);
        Drawable r3 = this.r;
        if (r3 == null) goto L8;
        r3.setCallback(null);
    L8:
        this.r = r13;
        if (r13 == null) goto L14;
        r13.setCallback(r0);
        r13.setLayoutDirection(r0.getLayoutDirection());
        if (r13.isStateful() == false) goto L13;
        r13.setState(r0.getDrawableState());
    L13:
        K();
    L14:
        r0.invalidate();
        if (r8.hasValue(3) == false) goto L18;
        this.t = aw0.c(r8.getInt(3, -1), this.t);
        this.v = true;
    L18:
        if (r8.hasValue(2) == false) goto L20;
        this.s = r7.b(2);
        this.u = true;
    L20:
        r7.g();
        K();
    }

    public final void K() {
        Drawable r0 = this.r;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.u == false) goto L7;
    L8:
        Drawable r1 = r0.mutate();
        this.r = r1;
        if (this.u == false) goto L12;
        r1.setTintList(this.s);
    L12:
        if (this.v == false) goto L15;
        this.r.setTintMode(this.t);
    L15:
        if (this.r.isStateful() == false) goto L20;
        this.r.setState(this.q.getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.v == true) goto L8;
    }

    public final void L(Canvas r8) {
        if (this.r == null) goto L18;
        pg r0 = this.q;
        int r1 = r0.getMax();
        int r2 = 1;
        if (r1 <= 1) goto L19;
        int r3 = this.r.getIntrinsicWidth();
        int r4 = this.r.getIntrinsicHeight();
        if (r3 < 0) goto L9;
        int r5 = r3 / 2;
    L10:
        if (r4 < 0) goto L12;
        r2 = r4 / 2;
    L12:
        this.r.setBounds(-r5, -r2, r5, r2);
        float r6 = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / r1;
        int r7 = r8.save();
        r8.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
        int r9 = 0;
    L13:
        if (r9 > r1) goto L15;
        this.r.draw(r8);
        r8.translate(r6, 0.0f);
        r9 = r9 + 1;
        goto L13
    L15:
        r8.restoreToCount(r7);
        return;
    L9:
        r5 = 1;
        goto L10
    L19:
        return;
    }
}
