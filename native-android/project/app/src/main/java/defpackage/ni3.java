package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni3 {
    public final w71 a;

    public ni3(w71 r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof ni3) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((ni3) r2).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
