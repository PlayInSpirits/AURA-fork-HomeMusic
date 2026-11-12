package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aw4 {
    public static final aw4 d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        d = new aw4(new zv4());
        String r0 = f35.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public aw4(zv4 r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (aw4.class != r5.getClass()) goto L17;
        aw4 r6 = (aw4) r5;
        if (this.a != r6.a) goto L17;
        if (this.b != r6.b) goto L17;
        if (this.c != r6.c) goto L17;
        return true;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
