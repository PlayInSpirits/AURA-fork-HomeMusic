package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ly2 {
    public final int a;
    public final int b;
    public final float c;

    public ly2(int i, float f, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static ly2 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new ly2(i2, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ly2)) {
            return false;
        }
        ly2 ly2Var = (ly2) obj;
        return this.a == ly2Var.a && this.b == ly2Var.b && Float.compare(this.c, ly2Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
