package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lc2 extends nc2 {
    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
        return false;
    L7:
        if (lc2.class != r2.getClass()) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return lc2.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
