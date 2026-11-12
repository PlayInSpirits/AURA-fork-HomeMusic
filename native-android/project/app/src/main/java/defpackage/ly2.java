package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ly2 {
    public final int a;
    public final int b;
    public final float c;

    public ly2(int r1, float r2, int r3) {
        this.a = r1;
        this.b = r3;
        this.c = r2;
    }

    public static ly2 a(int r3) {
        int r0 = (r3 >> 13) & 7;
        if (r0 != 0) goto L6;
        return null;
    L6:
        int r1 = (r3 >> 10) & 7;
        int r2 = r3 & 511;
        if ((r3 & 512) == 0) goto L9;
        int r4 = -1;
    L11:
        return new ly2(r0, (r2 * r4) / 10.0f, r1);
    L9:
        r4 = 1;
        goto L11
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof ly2) == true) goto L5;
        return false;
    L5:
        ly2 r5 = (ly2) r4;
        if (this.a == r5.a) goto L8;
    L13:
        return false;
    L8:
        if (this.b != r5.b) goto L13;
        if (Float.compare(this.c, r5.c) != 0) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.a * 31) + this.b) * 31;
        return Float.hashCode(this.c) + r0;
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
