package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d24 implements TimeInterpolator {
    public final TimeInterpolator a;

    public d24(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new d24(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
