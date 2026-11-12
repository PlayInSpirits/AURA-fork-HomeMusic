package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o84 {
    public static final o84 c = null;
    public final long a;
    public final long b;

    static {
        c = new o84(0, 0);
    }

    public o84(long r1, long r3) {
        this.a = r1;
        this.b = r3;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L15:
        return false;
    L8:
        if (o84.class != r7.getClass()) goto L15;
        o84 r8 = (o84) r7;
        if (this.a != r8.a) goto L15;
        if (this.b != r8.b) goto L15;
        return true;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[timeUs=");
        r0.append(this.a);
        r0.append(", position=");
        return b11.p(r0, this.b, "]");
    }
}
