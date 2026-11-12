package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y35 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public y35(Drawable.ConstantState r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        z35 r0 = new z35();
        r0.n = (VectorDrawable) this.a.newDrawable();
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r2) {
        z35 r0 = new z35();
        r0.n = (VectorDrawable) this.a.newDrawable(r2);
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r2, Resources.Theme r3) {
        z35 r0 = new z35();
        r0.n = (VectorDrawable) this.a.newDrawable(r2, r3);
        return r0;
    }
}
