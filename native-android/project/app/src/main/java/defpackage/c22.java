package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ c22(int r1) {
        this.a = r1;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r2) {
        switch(this.a) {
            case 0: goto L7;
            case 1: goto L4;
            case 2: goto L4;
            default: goto L4;
        };
    L4:
        float r3 = r2 - 1.0f;
        return ((((r3 * r3) * r3) * r3) * r3) + 1.0f;
    L7:
        return (((r2 * r2) * r2) * r2) * r2;
    }
}
