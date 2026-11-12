package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d24 implements TimeInterpolator {
    public final TimeInterpolator a;

    public d24(TimeInterpolator r1) {
        this.a = r1;
    }

    public static TimeInterpolator a(boolean r0, TimeInterpolator r1) {
        if (r0 == false) goto L5;
        return r1;
    L5:
        return new d24(r1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r1) {
        return 1.0f - this.a.getInterpolation(r1);
    }
}
