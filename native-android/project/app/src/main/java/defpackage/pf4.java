package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pf4 {
    public static final pf4 c = null;
    public final int a;
    public final int b;

    static {
        c = new pf4(-1, -1);
        new pf4(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public pf4(int r2, int r3) {
        if (r2 == (-1)) goto L5;
        if (r2 >= 0) goto L5;
    L8:
        boolean r0 = false;
    L10:
        rr2.l(r0);
        this.a = r2;
        this.b = r3;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        if (r3 < 0) goto L8;
    L9:
        r0 = true;
        goto L10
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof pf4) == false) goto L15;
        pf4 r6 = (pf4) r5;
        if (this.a != r6.a) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    L15:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a;
        int r1 = r0 << 16;
        int r2 = this.b;
        return r2 ^ ((r0 >>> 16) | r1);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
