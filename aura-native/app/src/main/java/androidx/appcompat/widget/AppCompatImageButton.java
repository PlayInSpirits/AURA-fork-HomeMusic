package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import app.homemusic.R;
import defpackage.c6;
import defpackage.gt4;
import defpackage.ju4;
import defpackage.la0;
import defpackage.ue1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final c6 n;
    public final ue1 o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        this.p = false;
        gt4.a(this, getContext());
        c6 c6Var = new c6(this);
        this.n = c6Var;
        c6Var.n(attributeSet, i);
        ue1 ue1Var = new ue1(this);
        this.o = ue1Var;
        ue1Var.t(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.b();
        }
        ue1 ue1Var = this.o;
        if (ue1Var != null) {
            ue1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.l();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        la0 la0Var;
        ue1 ue1Var = this.o;
        if (ue1Var == null || (la0Var = (la0) ue1Var.q) == null) {
            return null;
        }
        return (ColorStateList) la0Var.p;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        la0 la0Var;
        ue1 ue1Var = this.o;
        if (ue1Var == null || (la0Var = (la0) ue1Var.q) == null) {
            return null;
        }
        return (PorterDuff.Mode) la0Var.q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.o.p).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.q(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ue1 ue1Var = this.o;
        if (ue1Var != null) {
            ue1Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ue1 ue1Var = this.o;
        if (ue1Var != null && drawable != null && !this.p) {
            ue1Var.o = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (ue1Var != null) {
            ue1Var.b();
            if (this.p) {
                return;
            }
            ImageView imageView = (ImageView) ue1Var.p;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(ue1Var.o);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.p = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.z(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ue1 ue1Var = this.o;
        if (ue1Var != null) {
            ue1Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.z(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ue1 ue1Var = this.o;
        if (ue1Var != null) {
            if (((la0) ue1Var.q) == null) {
                ue1Var.q = new la0();
            }
            la0 la0Var = (la0) ue1Var.q;
            la0Var.p = colorStateList;
            la0Var.o = true;
            ue1Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ue1 ue1Var = this.o;
        if (ue1Var != null) {
            if (((la0) ue1Var.q) == null) {
                ue1Var.q = new la0();
            }
            la0 la0Var = (la0) ue1Var.q;
            la0Var.q = mode;
            la0Var.n = true;
            ue1Var.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
