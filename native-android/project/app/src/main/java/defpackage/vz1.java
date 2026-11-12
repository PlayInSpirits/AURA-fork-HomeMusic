package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 {
    public static final vz1 e = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        e = new vz1(0, 0, 0, 0);
    }

    public vz1(int r1, int r2, int r3, int r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public static vz1 a(vz1 r4, vz1 r5) {
        return b(Math.max(r4.a, r5.a), Math.max(r4.b, r5.b), Math.max(r4.c, r5.c), Math.max(r4.d, r5.d));
    }

    public static vz1 b(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        return e;
    L9:
        return new vz1(r1, r2, r3, r4);
    }

    public static vz1 c(Insets r3) {
        return b(kz.a(r3), yj1.a(r3), yj1.q(r3), yj1.v(r3));
    }

    public final Insets d() {
        int r0 = this.c;
        int r1 = this.d;
        return yh.j(this.a, this.b, r0, r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (vz1.class != r5.getClass()) goto L23;
        vz1 r6 = (vz1) r5;
        if (this.d == r6.d) goto L14;
        return false;
    L14:
        if (this.a == r6.a) goto L17;
        return false;
    L17:
        if (this.c == r6.c) goto L20;
        return false;
    L20:
        if (this.b == r6.b) goto L22;
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
