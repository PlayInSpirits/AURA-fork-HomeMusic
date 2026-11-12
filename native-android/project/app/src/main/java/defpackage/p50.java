package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p50 {
    public final String a;
    public final long b;
    public final int c;

    public p50(int r1, long r2, String r4) {
        this.a = r4;
        this.b = r2;
        this.c = r1;
        if (r4.length() != 0) goto L5;
        kf2.n("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    L5:
        if (r1 >= (-1)) goto L7;
    L9:
        kf2.n("The id must be between -1 and 63");
        throw null;
    L7:
        if (r1 > 63) goto L9;
    }

    public abstract float a(int r1);

    public abstract float b(int r1);

    public boolean c() {
        return false;
    }

    public abstract long d(float r1, float r2, float r3);

    public abstract float e(float r1, float r2, float r3);

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() != r3.getClass()) goto L19;
        p50 r4 = (p50) r3;
        if (this.c == r4.c) goto L13;
        return false;
    L13:
        if (this.a.equals(r4.a) == true) goto L16;
        return false;
    L16:
        return xl.m(this.b, r4.b);
    L19:
        return false;
    }

    public abstract long f(float r1, float r2, float r3, float r4, p50 r5);

    public int hashCode() {
        return xa3.b(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        long r2 = this.b;
        if (xl.m(r2, 12884901888L) == false) goto L6;
        String r0 = "Rgb";
    L16:
        return this.a + " (id=" + this.c + ", model=" + r0 + ")";
    L6:
        if (xl.m(r2, 12884901889L) == false) goto L9;
        r0 = "Xyz";
        goto L16
    L9:
        if (xl.m(r2, 12884901890L) == false) goto L12;
        r0 = "Lab";
        goto L16
    L12:
        if (xl.m(r2, 17179869187L) == false) goto L14;
        r0 = "Cmyk";
        goto L16
    L14:
        r0 = "Unknown";
        goto L16
    }
}
