package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vh1 extends Drawable implements Animatable {
    public final pd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public final int t;
    public boolean u;
    public Paint v;
    public Rect w;

    public vh1(pd r2) {
        this.r = true;
        this.t = -1;
        this.n = r2;
    }

    public final void a() {
        h12.d("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.q);
        bi1 r0 = (bi1) this.n.b;
        if (r0.a.l.c != 1) goto L7;
        invalidateSelf();
        return;
    L7:
        if (this.o == true) goto L24;
        this.o = true;
        ArrayList r2 = r0.c;
        if (r0.j == false) goto L11;
        kf2.o("Cannot subscribe to a cleared frame loader");
        return;
    L11:
        if (r2.contains(this) == true) goto L20;
        boolean r3 = r2.isEmpty();
        r2.add(this);
        if (r3 == true) goto L15;
    L18:
        invalidateSelf();
        return;
    L15:
        if (r0.f == true) goto L18;
        r0.f = true;
        r0.j = false;
        r0.a();
        goto L18
    L20:
        kf2.o("Cannot subscribe twice in a row");
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r6) {
        if (this.q == false) goto L6;
        return;
    L6:
        if (this.u == false) goto L11;
        int r0 = getIntrinsicWidth();
        int r1 = getIntrinsicHeight();
        Rect r2 = getBounds();
        if (this.w != null) goto L10;
        this.w = new Rect();
    L10:
        Gravity.apply(119, r0, r1, r2, this.w);
        this.u = false;
    L11:
        bi1 r3 = (bi1) this.n.b;
        zh1 r4 = r3.i;
        if (r4 == null) goto L14;
        Bitmap r5 = r4.t;
    L16:
        if (this.w != null) goto L18;
        this.w = new Rect();
    L18:
        Rect r7 = this.w;
        if (this.v != null) goto L21;
        this.v = new Paint(2);
    L21:
        r6.drawBitmap(r5, null, r7, this.v);
        return;
    L14:
        r5 = r3.l;
        goto L16
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((bi1) this.n.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((bi1) this.n.b).o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        super.onBoundsChange(r1);
        this.u = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
        if (this.v != null) goto L5;
        this.v = new Paint(2);
    L5:
        this.v.setAlpha(r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r3) {
        if (this.v != null) goto L5;
        this.v = new Paint(2);
    L5:
        this.v.setColorFilter(r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r4, boolean r5) {
        h12.d("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.q);
        this.r = r4;
        if (r4 == true) goto L8;
        this.o = false;
        bi1 r1 = (bi1) this.n.b;
        ArrayList r2 = r1.c;
        r2.remove(this);
        if (r2.isEmpty() == false) goto L11;
        r1.f = false;
    L11:
        return super.setVisible(r4, r5);
    L8:
        if (this.p == false) goto L11;
        a();
        goto L11
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.p = true;
        this.s = 0;
        if (this.r == false) goto L6;
        a();
        return;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.p = false;
        this.o = false;
        bi1 r1 = (bi1) this.n.b;
        ArrayList r2 = r1.c;
        r2.remove(this);
        if (r2.isEmpty() == false) goto L6;
        r1.f = false;
        return;
    }
}
