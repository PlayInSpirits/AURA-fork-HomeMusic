package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pl1 {
    public static final yw d = null;
    public static final yw e = null;
    public static final yw f = null;
    public static final yw g = null;
    public static final yw h = null;
    public static final yw i = null;
    public final yw a;
    public final yw b;
    public final int c;

    static {
        yw r0 = yw.q;
        d = pa.t(":");
        e = pa.t(":status");
        f = pa.t(":method");
        g = pa.t(":path");
        h = pa.t(":scheme");
        i = pa.t(":authority");
    }

    public pl1(yw r1, yw r2) {
        r1.getClass();
        r2.getClass();
        this.a = r1;
        this.b = r2;
        int r3 = r1.d() + 32;
        this.c = r2.d() + r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof pl1) == true) goto L8;
        return false;
    L8:
        pl1 r6 = (pl1) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        return this.a.q() + ": " + this.b.q();
    }

    public pl1(String r2, String r3) {
        yw r0 = yw.q;
        this(pa.t(r2), pa.t(r3));
    }

    public pl1(yw r2, String r3) {
        r2.getClass();
        r3.getClass();
        yw r0 = yw.q;
        this(r2, pa.t(r3));
    }
}
