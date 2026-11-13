package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hs {
    public final float a;
    public final float b;

    public hs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final long a(long j, long j2, r62 r62Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        r62 r62Var2 = r62.n;
        float f3 = this.a;
        if (r62Var != r62Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return Float.compare(this.a, hsVar.a) == 0 && Float.compare(this.b, hsVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xa3.f("BiasAlignment(horizontalBias=", this.a, ", verticalBias=", this.b, ")");
    }
}
