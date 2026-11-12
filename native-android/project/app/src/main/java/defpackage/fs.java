package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fs {
    public final float a;

    public fs(float r1) {
        this.a = r1;
    }

    public final int a(int r1, int r2, r62 r3) {
        float r4 = (r2 - r1) / 2.0f;
        r62 r5 = r62.n;
        float r0 = this.a;
        if (r3 == r5) goto L7;
        r0 = r0 * (-1.0f);
    L7:
        return Math.round((1.0f + r0) * r4);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof fs) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.a, ((fs) r4).a) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
