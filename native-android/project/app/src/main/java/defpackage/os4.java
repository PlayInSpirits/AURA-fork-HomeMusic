package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class os4 {
    public final ij4 a;
    public final ij4 b;
    public final ij4 c;
    public final ij4 d;

    public os4(ij4 r1, ij4 r2, ij4 r3, ij4 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if ((r5 instanceof os4) == false) goto L23;
        os4 r6 = (os4) r5;
        ij4 r2 = r6.a;
        if (h12.c(this.a, r2) == true) goto L14;
        return false;
    L14:
        if (h12.c(this.b, r6.b) == true) goto L17;
        return false;
    L17:
        if (h12.c(this.c, r6.c) == true) goto L20;
        return false;
    L20:
        if (h12.c(this.d, r6.d) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        ij4 r1 = this.a;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = r2 * 31;
        ij4 r4 = this.b;
        if (r4 == null) goto L9;
        int r5 = r4.hashCode();
    L10:
        int r6 = (r3 + r5) * 31;
        ij4 r7 = this.c;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int r9 = (r6 + r8) * 31;
        ij4 r10 = this.d;
        if (r10 == null) goto L18;
        r0 = r10.hashCode();
    L18:
        return r9 + r0;
    L13:
        r8 = 0;
        goto L14
    L9:
        r5 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }
}
