package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y33 extends e35 {
    public final t33 p;

    public y33(t33 r1) {
        r1.getClass();
        this.p = r1;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L15;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (y33.class == r3.getClass()) goto L9;
        return false;
    L9:
        if (h12.c(this.p, ((y33) r3).p) == false) goto L17;
        return true;
    L17:
        return false;
    L15:
        return true;
    }

    public final int hashCode() {
        return this.p.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.p + ", direction=-1)";
    }
}
