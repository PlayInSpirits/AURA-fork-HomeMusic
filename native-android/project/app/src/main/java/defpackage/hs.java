package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hs {
    public final float a;
    public final float b;

    public hs(float r1, float r2) {
        this.a = r1;
        this.b = r2;
    }

    public final long a(long r6, long r8, r62 r10) {
        float r1 = (((int) (r8 >> 32)) - ((int) (r6 >> 32))) / 2.0f;
        float r7 = (((int) (r8 & 4294967295L)) - ((int) (r6 & 4294967295L))) / 2.0f;
        r62 r9 = r62.n;
        float r11 = this.a;
        if (r10 == r9) goto L6;
        r11 = r11 * (-1.0f);
    L6:
        float r12 = (1.0f + this.b) * r7;
        int r5 = Math.round((r11 + 1.0f) * r1);
        int r13 = Math.round(r12);
        return (((long) r13) & 4294967295L) | (((long) r5) << 32);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof hs) == true) goto L8;
        return false;
    L8:
        hs r6 = (hs) r5;
        if (Float.compare(this.a, r6.a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.b, r6.b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.a) * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return xa3.f("BiasAlignment(horizontalBias=", this.a, ", verticalBias=", this.b, ")");
    }
}
