package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Comparable r0, Comparable r1) {
        if (((Number) r0).floatValue() > ((Number) r1).floatValue()) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean equals(Object r1) {
        if ((r1 instanceof g40) == false) goto L6;
        return true;
    L6:
        return false;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(0.0f) * 31;
        return Float.hashCode(0.0f) + r0;
    }

    public final String toString() {
        return "0.0..0.0";
    }
}
