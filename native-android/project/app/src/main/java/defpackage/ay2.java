package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay2 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public ay2(long r2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = r2;
        this.b = 150;
    }

    public final void a(ObjectAnimator r3) {
        r3.setStartDelay(this.a);
        r3.setDuration(this.b);
        r3.setInterpolator(b());
        r3.setRepeatCount(this.d);
        r3.setRepeatMode(this.e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator r0 = this.c;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return yd.b;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof ay2) == true) goto L8;
        return false;
    L8:
        ay2 r8 = (ay2) r7;
        if (this.a == r8.a) goto L12;
        return false;
    L12:
        if (this.b == r8.b) goto L15;
        return false;
    L15:
        if (this.d == r8.d) goto L18;
        return false;
    L18:
        if (this.e == r8.e) goto L21;
        return false;
    L21:
        return b().getClass().equals(r8.b().getClass());
    }

    public final int hashCode() {
        long r0 = this.a;
        int r1 = ((int) (r0 ^ (r0 >>> 32))) * 31;
        long r3 = this.b;
        int r2 = (r1 + ((int) ((r3 >>> 32) ^ r3))) * 31;
        return ((((b().getClass().hashCode() + r2) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n");
        r0.append(ay2.class.getName());
        r0.append('{');
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" delay: ");
        r0.append(this.a);
        r0.append(" duration: ");
        r0.append(this.b);
        r0.append(" interpolator: ");
        r0.append(b().getClass());
        r0.append(" repeatCount: ");
        r0.append(this.d);
        r0.append(" repeatMode: ");
        return f34.i(r0, this.e, "}\n");
    }
}
