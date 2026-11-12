package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 extends EdgeEffect {
    public final float a;
    public float b;

    public aj1(Context r2) {
        super(r2);
        this.a = bu.a(r2).n * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int r2) {
        this.b = 0.0f;
        super.onAbsorb(r2);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2, float r3) {
        this.b = 0.0f;
        super.onPull(r2, r3);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2) {
        this.b = 0.0f;
        super.onPull(r2);
    }
}
