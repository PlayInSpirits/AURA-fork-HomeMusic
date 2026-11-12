package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xn {
    public final boolean equals(Object r2) {
        if (this == r2) goto L14;
        if (r2 != null) goto L6;
        return false;
    L6:
        if (xn.class != r2.getClass()) goto L16;
        xn r3 = (xn) r2;
        if (Float.compare(0.0f, 0.0f) != 0) goto L15;
        return true;
    L15:
        return false;
    L16:
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
