package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new hu(0, 0, 0, 0);
    }

    public hu(int r1, int r2, int r3, int r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        if (r1 > r3) goto L8;
        if (r2 > r4) goto L6;
        return;
    L6:
        kf2.e(xa3.e(r2, r4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    L8:
        kf2.e(xa3.e(r1, r3, "Left must be less than or equal to right, left: ", ", right: "));
        throw null;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (hu.class.equals(r1) == true) goto L11;
        return false;
    L11:
        r5.getClass();
        hu r6 = (hu) r5;
        if (this.a == r6.a) goto L15;
        return false;
    L15:
        if (this.b == r6.b) goto L18;
        return false;
    L18:
        if (this.c == r6.c) goto L21;
        return false;
    L21:
        if (this.d == r6.d) goto L23;
        return false;
    L23:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(hu.class.getSimpleName());
        r0.append(" { [");
        r0.append(this.a);
        r0.append(',');
        r0.append(this.b);
        r0.append(',');
        r0.append(this.c);
        r0.append(',');
        return f34.i(r0, this.d, "] }");
    }

    public hu(Rect r4) {
        r4.getClass();
        this(r4.left, r4.top, r4.right, r4.bottom);
    }
}
