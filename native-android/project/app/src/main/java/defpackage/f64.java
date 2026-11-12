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
    public final void draw(Canvas r9) {
        Rect r0 = this.p;
        super.draw(r9);
        int r1 = getWidth();
        int r2 = getHeight();
        if (this.o != null) goto L5;
        return;
    L5:
        if (this.n == null) goto L21;
        int r3 = r9.save();
        r9.translate(getScrollX(), getScrollY());
        if (this.q == false) goto L10;
        r0.set(0, 0, r1, this.o.top);
        this.n.setBounds(r0);
        this.n.draw(r9);
    L10:
        if (this.r == false) goto L13;
        r0.set(0, r2 - this.o.bottom, r1, r2);
        this.n.setBounds(r0);
        this.n.draw(r9);
    L13:
        if (this.s == false) goto L16;
        Rect r4 = this.o;
        r0.set(0, r4.top, r4.left, r2 - r4.bottom);
        this.n.setBounds(r0);
        this.n.draw(r9);
    L16:
        if (this.t == false) goto L18;
        Rect r5 = this.o;
        r0.set(r1 - r5.right, r5.top, r1, r2 - r5.bottom);
        this.n.setBounds(r0);
        this.n.draw(r9);
    L18:
        r9.restoreToCount(r3);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setCallback(this);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable r1 = this.n;
        if (r1 == null) goto L6;
        r1.setCallback(null);
        return;
    }

    public void setDrawBottomInsetForeground(boolean r1) {
        this.r = r1;
    }

    public void setDrawLeftInsetForeground(boolean r1) {
        this.s = r1;
    }

    public void setDrawRightInsetForeground(boolean r1) {
        this.t = r1;
    }

    public void setDrawTopInsetForeground(boolean r1) {
        this.q = r1;
    }

    public void setScrimInsetForeground(Drawable r1) {
        this.n = r1;
    }
}
