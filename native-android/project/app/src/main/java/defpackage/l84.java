package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l84 {
    public final o84 a;
    public final o84 b;

    public l84(o84 r1, o84 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (l84.class != r5.getClass()) goto L15;
        l84 r6 = (l84) r5;
        if (this.a.equals(r6.a) == false) goto L15;
        if (this.b.equals(r6.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        o84 r1 = this.a;
        r0.append(r1);
        o84 r3 = this.b;
        if (r1.equals(r3) == false) goto L5;
        String r4 = "";
    L7:
        return b11.q(r0, r4, "]");
    L5:
        r4 = ", " + r3;
        goto L7
    }
}
