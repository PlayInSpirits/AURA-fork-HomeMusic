package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dz3 {
    public static final dz3 c = null;
    public final int a;
    public final boolean b;

    static {
        c = new dz3(0, false);
    }

    public dz3(int r1, boolean r2) {
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
        if (dz3.class != r5.getClass()) goto L15;
        dz3 r6 = (dz3) r5;
        if (this.a != r6.a) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
