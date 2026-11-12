package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends Drawable implements Drawable.Callback {
    public Drawable n;
    public boolean o;

    public final void a(Canvas r1) {
        this.n.draw(r1);
    }

    public final void b(float r1, float r2) {
        this.n.setHotspot(r1, r2);
    }

    public final void c(int r1, int r2, int r3, int r4) {
        this.n.setHotspotBounds(r1, r2, r3, r4);
    }

    public final boolean d(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.n.setVisible(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        if (this.o == false) goto L6;
        a(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.n.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.n.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r1) {
        return this.n.getPadding(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.n.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.n.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.n.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.n.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.n.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        this.n.setBounds(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r1) {
        return this.n.setLevel(r1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
        this.n.setAlpha(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r1) {
        this.n.setAutoMirrored(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r1) {
        this.n.setChangingConfigurations(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
        this.n.setColorFilter(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r1) {
        this.n.setDither(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r1) {
        this.n.setFilterBitmap(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        if (this.o == false) goto L6;
        b(r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        if (this.o == false) goto L6;
        c(r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        if (this.o == true) goto L5;
        return false;
    L5:
        return this.n.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
        this.n.setTint(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r1) {
        this.n.setTintList(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r1) {
        this.n.setTintMode(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        if (this.o == true) goto L5;
        return false;
    L5:
        return d(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }
}
