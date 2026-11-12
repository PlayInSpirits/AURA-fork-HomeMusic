package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jg extends ImageView {
    public final c6 n;
    public final ue1 o;
    public boolean p;

    public jg(Context r1, AttributeSet r2, int r3) {
        ju4.a(r1);
        super(r1, r2, r3);
        this.p = false;
        gt4.a(this, getContext());
        c6 r4 = new c6(this);
        this.n = r4;
        r4.n(r2, r3);
        ue1 r5 = new ue1(this);
        this.o = r5;
        r5.t(r2, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 r0 = this.n;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        ue1 r1 = this.o;
        if (r1 == null) goto L9;
        r1.b();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.k();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.l();
    }

    public ColorStateList getSupportImageTintList() {
        ue1 r1 = this.o;
        if (r1 == null) goto L8;
        la0 r2 = (la0) r1.q;
        if (r2 == null) goto L8;
        return (ColorStateList) r2.p;
    L8:
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ue1 r1 = this.o;
        if (r1 == null) goto L8;
        la0 r2 = (la0) r1.q;
        if (r2 == null) goto L8;
        return (PorterDuff.Mode) r2.q;
    L8:
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.o.p).getBackground() instanceof RippleDrawable) == false) goto L5;
        return false;
    L5:
        if (super.hasOverlappingRendering() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.p();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
        super.setBackgroundResource(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.q(r1);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        ue1 r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        ue1 r0 = this.o;
        if (r0 == null) goto L8;
        if (r3 == null) goto L8;
        if (this.p == true) goto L8;
        r0.o = r3.getLevel();
    L8:
        super.setImageDrawable(r3);
        if (r0 == null) goto L16;
        r0.b();
        if (this.p == true) goto L17;
        ImageView r2 = (ImageView) r0.p;
        if (r2.getDrawable() == null) goto L18;
        r2.getDrawable().setLevel(r0.o);
        return;
    L18:
        return;
    L17:
        return;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
        super.setImageLevel(r1);
        this.p = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
        ue1 r0 = this.o;
        if (r0 == null) goto L6;
        r0.z(r1);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        ue1 r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.y(r1);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.z(r1);
        return;
    }

    public void setSupportImageTintList(ColorStateList r2) {
        ue1 r1 = this.o;
        if (r1 != null) goto L5;
        return;
    L5:
        if (((la0) r1.q) != null) goto L7;
        r1.q = new la0();
    L7:
        la0 r0 = (la0) r1.q;
        r0.p = r2;
        r0.o = true;
        r1.b();
    }

    public void setSupportImageTintMode(PorterDuff.Mode r2) {
        ue1 r1 = this.o;
        if (r1 != null) goto L5;
        return;
    L5:
        if (((la0) r1.q) != null) goto L7;
        r1.q = new la0();
    L7:
        la0 r0 = (la0) r1.q;
        r0.q = r2;
        r0.n = true;
        r1.b();
    }
}
