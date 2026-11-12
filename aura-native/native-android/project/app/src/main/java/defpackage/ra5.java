package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra5 extends sa5 {
    public final WindowInsetsAnimation e;

    public ra5(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.sa5
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.sa5
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.sa5
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.sa5
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.sa5
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
