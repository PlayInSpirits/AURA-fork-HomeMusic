package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nd implements Drawable.Callback {
    public final /* synthetic */ qd n;

    public nd(qd r1) {
        this.n = r1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        this.n.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        this.n.scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        this.n.unscheduleSelf(r2);
    }
}
