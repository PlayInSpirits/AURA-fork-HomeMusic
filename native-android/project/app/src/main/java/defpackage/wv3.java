package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wv3 {
    public static final wv3 e = null;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
        e = new wv3(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public wv3(float r1, float r2, float r3, float r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final long a() {
        float r0 = this.c;
        float r1 = this.a;
        float r2 = ((r0 - r1) / 2.0f) + r1;
        float r3 = this.d;
        float r6 = this.b;
        long r4 = Float.floatToRawIntBits(r2);
        return (((long) Float.floatToRawIntBits(((r3 - r6) / 2.0f) + r6)) & 4294967295L) | (r4 << 32);
    }

    public final long b() {
        float r0 = this.c - this.a;
        float r1 = this.d - this.b;
        long r2 = Float.floatToRawIntBits(r0);
        return (((long) Float.floatToRawIntBits(r1)) & 4294967295L) | (r2 << 32);
    }

    public final wv3 c(wv3 r6) {
        return new wv3(Math.max(this.a, r6.a), Math.max(this.b, r6.b), Math.min(this.c, r6.c), Math.min(this.d, r6.d));
    }

    public final boolean d() {
        boolean r1 = false;
        if (this.a < this.c) goto L5;
        boolean r0 = true;
    L7:
        if (this.b < this.d) goto L10;
        r1 = true;
    L10:
        return r0 | r1;
    L5:
        r0 = false;
        goto L7
    }

    public final wv3 e(float r5, float r6) {
        return new wv3(this.a + r5, this.b + r6, this.c + r5, this.d + r6);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof wv3) == true) goto L8;
        return false;
    L8:
        wv3 r6 = (wv3) r5;
        if (Float.compare(this.a, r6.a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.b, r6.b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.c, r6.c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r6.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final wv3 f(long r6) {
        int r1 = (int) (r6 >> 32);
        float r2 = Float.intBitsToFloat(r1) + this.a;
        int r7 = (int) (r6 & 4294967295L);
        float r8 = Float.intBitsToFloat(r7) + this.b;
        float r3 = this.c;
        float r4 = Float.intBitsToFloat(r1) + r3;
        float r5 = this.d;
        return new wv3(r2, r8, r4, Float.intBitsToFloat(r7) + r5);
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        return Float.hashCode(this.d) + r0;
    }

    public final String toString() {
        String r0 = gh0.F(this.a);
        String r1 = gh0.F(this.b);
        String r2 = gh0.F(this.c);
        String r5 = gh0.F(this.d);
        StringBuilder r3 = b11.u("Rect.fromLTRB(", r0, ", ", r1, ", ");
        r3.append(r2);
        r3.append(", ");
        r3.append(r5);
        r3.append(")");
        return r3.toString();
    }
}
