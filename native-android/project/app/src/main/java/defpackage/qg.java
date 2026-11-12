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

    public qg(pg pgVar) {
        super(pgVar);
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.q = pgVar;
    }

    @Override // defpackage.wo0
    public final void C(AttributeSet attributeSet, int i) {
        super.C(attributeSet, i);
        pg pgVar = this.q;
        Context context = pgVar.getContext();
        int[] iArr = st3.g;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        j65.n(pgVar, pgVar.getContext(), iArr, attributeSet, (TypedArray) jv3VarF.o, i, 0);
        Drawable drawableD = jv3VarF.d(0);
        if (drawableD != null) {
            pgVar.setThumb(drawableD);
        }
        Drawable drawableC = jv3VarF.c(1);
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.r = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(pgVar);
            drawableC.setLayoutDirection(pgVar.getLayoutDirection());
            if (drawableC.isStateful()) {
                drawableC.setState(pgVar.getDrawableState());
            }
            K();
        }
        pgVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.t = aw0.c(typedArray.getInt(3, -1), this.t);
            this.v = true;
        }
        if (typedArray.hasValue(2)) {
            this.s = jv3VarF.b(2);
            this.u = true;
        }
        jv3VarF.g();
        K();
    }

    public final void K() {
        Drawable drawable = this.r;
        if (drawable != null) {
            if (this.u || this.v) {
                Drawable drawableMutate = drawable.mutate();
                this.r = drawableMutate;
                if (this.u) {
                    drawableMutate.setTintList(this.s);
                }
                if (this.v) {
                    this.r.setTintMode(this.t);
                }
                if (this.r.isStateful()) {
                    this.r.setState(this.q.getDrawableState());
                }
            }
        }
    }

    public final void L(Canvas canvas) {
        if (this.r != null) {
            pg pgVar = this.q;
            int max = pgVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.r.getIntrinsicWidth();
                int intrinsicHeight = this.r.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.r.setBounds(-i, -i2, i, i2);
                float width = ((pgVar.getWidth() - pgVar.getPaddingLeft()) - pgVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(pgVar.getPaddingLeft(), pgVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.r.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
