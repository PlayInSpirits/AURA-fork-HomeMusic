package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb5 {
    public final hu a;
    public final float b;

    public zb5(Rect r2, float r3) {
        this.a = new hu(r2);
        this.b = r3;
    }

    public final Rect a() {
        hu r4 = this.a;
        r4.getClass();
        return new Rect(r4.a, r4.b, r4.c, r4.d);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (zb5.class.equals(r1) == true) goto L11;
        return false;
    L11:
        r5.getClass();
        zb5 r6 = (zb5) r5;
        if (h12.c(this.a, r6.a) == true) goto L15;
        return false;
    L15:
        if (this.b != r6.b) goto L17;
        return true;
    L17:
        return false;
    L7:
        r1 = null;
        goto L9
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public zb5(hu r1, float r2) {
        this.a = r1;
        this.b = r2;
    }
}
