package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr3 {
    public final int a;
    public final boolean b;

    public gr3(int r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (gr3.class != r3.getClass()) goto L19;
        gr3 r4 = (gr3) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b != r4.b) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
