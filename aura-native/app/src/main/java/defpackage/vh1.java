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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vh1 extends Drawable implements Animatable {
    public final pd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int s;
    public boolean u;
    public Paint v;
    public Rect w;
    public boolean r = true;
    public final int t = -1;

    public vh1(pd pdVar) {
        this.n = pdVar;
    }

    public final void a() {
        h12.d("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.q);
        bi1 bi1Var = (bi1) this.n.b;
        if (bi1Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = bi1Var.c;
        if (bi1Var.j) {
            kf2.o("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            kf2.o("Cannot subscribe twice in a row");
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !bi1Var.f) {
            bi1Var.f = true;
            bi1Var.j = false;
            bi1Var.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.q) {
            return;
        }
        if (this.u) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.w == null) {
                this.w = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.w);
            this.u = false;
        }
        bi1 bi1Var = (bi1) this.n.b;
        zh1 zh1Var = bi1Var.i;
        Bitmap bitmap = zh1Var != null ? zh1Var.t : bi1Var.l;
        if (this.w == null) {
            this.w = new Rect();
        }
        Rect rect = this.w;
        if (this.v == null) {
            this.v = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.v);
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
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.u = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.v == null) {
            this.v = new Paint(2);
        }
        this.v.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.v == null) {
            this.v = new Paint(2);
        }
        this.v.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        h12.d("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.q);
        this.r = z;
        if (!z) {
            this.o = false;
            bi1 bi1Var = (bi1) this.n.b;
            ArrayList arrayList = bi1Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                bi1Var.f = false;
            }
        } else if (this.p) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.p = true;
        this.s = 0;
        if (this.r) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.p = false;
        this.o = false;
        bi1 bi1Var = (bi1) this.n.b;
        ArrayList arrayList = bi1Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            bi1Var.f = false;
        }
    }
}
