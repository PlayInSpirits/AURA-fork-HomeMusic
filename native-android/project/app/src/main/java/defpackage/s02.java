package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s02 extends nv1 {
    public final String b;
    public final String c;
    public final String d;

    public s02(String r2, String r3, String r4) {
        super("----");
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (s02.class != r3.getClass()) goto L22;
        s02 r4 = (s02) r3;
        if (this.c.equals(r4.c) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L13;
        return false;
    L13:
        if (this.d.equals(r4.d) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.b, 527, 31);
        int r1 = f34.e(this.c, r0, 31);
        return this.d.hashCode() + r1;
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
