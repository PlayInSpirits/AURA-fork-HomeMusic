package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s62 {
    public final int a;
    public final int b;
    public final boolean c;

    public s62(int r1, int r2, boolean r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s62) == true) goto L8;
        return false;
    L8:
        s62 r6 = (s62) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        int r1 = f34.d(this.b, r0, 31);
        return Boolean.hashCode(this.c) + r1;
    }

    public final String toString() {
        StringBuilder r0 = b11.t("BidiRun(start=", ", end=", this.a, this.b, ", isRtl=");
        r0.append(this.c);
        r0.append(")");
        return r0.toString();
    }
}
