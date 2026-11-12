package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vv4 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vv4(int r1, int r2, int r3, byte[] r4) {
        this.a = r1;
        this.b = r4;
        this.c = r2;
        this.d = r3;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L20;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (vv4.class != r3.getClass()) goto L25;
        vv4 r4 = (vv4) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.c == r4.c) goto L13;
        return false;
    L13:
        if (this.d == r4.d) goto L15;
        return false;
    L15:
        if (Arrays.equals(this.b, r4.b) == false) goto L24;
        return true;
    L24:
        return false;
    L25:
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a * 31;
        return ((((Arrays.hashCode(this.b) + r0) * 31) + this.c) * 31) + this.d;
    }
}
