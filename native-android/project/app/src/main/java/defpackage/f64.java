package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f64 extends FrameLayout {
    public Drawable n;
    public Rect o;
    public Rect p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.p;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.o == null || this.n == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.q) {
            rect.set(0, 0, width, this.o.top);
            this.n.setBounds(rect);
            this.n.draw(canvas);
        }
        if (this.r) {
            rect.set(0, height - this.o.bottom, width, height);
            this.n.setBounds(rect);
            this.n.draw(canvas);
        }
        if (this.s) {
            Rect rect2 = this.o;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.n.setBounds(rect);
            this.n.draw(canvas);
        }
        if (this.t) {
            Rect rect3 = this.o;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.n.setBounds(rect);
            this.n.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.r = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.s = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.t = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.q = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.n = drawable;
    }
}
