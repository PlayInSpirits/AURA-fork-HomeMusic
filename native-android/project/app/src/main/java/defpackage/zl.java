package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zl {
    public static final zl d = null;
    public final boolean a;
    public final boolean b;
    public final boolean c;

    static {
        d = new yl().a();
    }

    public zl(yl r2) {
        this.a = r2.a;
        this.b = r2.b;
        this.c = r2.c;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (zl.class != r3.getClass()) goto L22;
        zl r4 = (zl) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L13;
        return false;
    L13:
        if (this.c != r4.c) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        return (((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1)) + (this.c ? 1 : 0);
    }
}
