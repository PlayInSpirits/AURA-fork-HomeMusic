package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw4 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public sw4(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        this.a = r2;
        this.b = r4;
        this.c = r6;
        this.d = r8;
        this.e = r10;
        this.f = r12;
        this.g = r14;
        if (Double.isNaN(r4) == false) goto L5;
    L65:
        kf2.n("Parameters cannot be NaN");
        throw null;
    L5:
        if (Double.isNaN(r6) == true) goto L65;
        if (Double.isNaN(r8) == true) goto L65;
        if (Double.isNaN(r10) == true) goto L65;
        if (Double.isNaN(r12) == true) goto L65;
        if (Double.isNaN(r14) == true) goto L65;
        if (Double.isNaN(r2) == true) goto L65;
        if (r2 != (-2.0d)) goto L20;
        return;
    L20:
        if (r2 != (-3.0d)) goto L23;
        return;
    L23:
        if (r10 < 0.0d) goto L64;
        if (r10 > 1.0d) goto L64;
        if (r10 != 0.0d) goto L36;
        if (r4 != 0.0d) goto L31;
    L33:
        kf2.n("Parameter a or g is zero, the transfer function is constant");
        throw null;
    L31:
        if (r2 == 0.0d) goto L33;
    L36:
        if (r10 < 1.0d) goto L43;
        if (r8 != 0.0d) goto L43;
        kf2.n("Parameter c is zero, the transfer function is constant");
        throw null;
    L43:
        if (r4 == 0.0d) goto L48;
        if (r2 == 0.0d) goto L48;
    L53:
        if (r8 >= 0.0d) goto L55;
        kf2.n("The transfer function must be increasing");
        throw null;
    L55:
        if (r4 >= 0.0d) goto L57;
    L59:
        kf2.n("The transfer function must be positive or increasing");
        throw null;
    L57:
        if (r2 < 0.0d) goto L59;
        return;
    L48:
        if (r8 != 0.0d) goto L53;
        kf2.n("Parameter a or g is zero, and c is zero, the transfer function is constant");
        throw null;
    L64:
        throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + r10);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof sw4) == true) goto L8;
        return false;
    L8:
        sw4 r9 = (sw4) r8;
        if (Double.compare(this.a, r9.a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.b, r9.b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.c, r9.c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r9.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.e, r9.e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f, r9.f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.g, r9.g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final int hashCode() {
        int r0 = Double.hashCode(this.a) * 31;
        int r1 = (Double.hashCode(this.b) + r0) * 31;
        int r2 = (Double.hashCode(this.c) + r1) * 31;
        int r3 = (Double.hashCode(this.d) + r2) * 31;
        int r4 = (Double.hashCode(this.e) + r3) * 31;
        int r5 = (Double.hashCode(this.f) + r4) * 31;
        return Double.hashCode(this.g) + r5;
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ")";
    }

    public /* synthetic */ sw4(double r16, double r18, double r20, double r22, double r24) {
        this(r16, r18, r20, r22, r24, 0.0d, 0.0d);
    }
}
