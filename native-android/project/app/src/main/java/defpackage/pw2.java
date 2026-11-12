package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pw2 extends nv1 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public pw2(int r2, int r3, int r4, int[] r5, int[] r6) {
        super("MLLT");
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L22;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (pw2.class != r3.getClass()) goto L28;
        pw2 r4 = (pw2) r3;
        if (this.b == r4.b) goto L11;
        return false;
    L11:
        if (this.c == r4.c) goto L13;
        return false;
    L13:
        if (this.d == r4.d) goto L15;
        return false;
    L15:
        if (Arrays.equals(this.e, r4.e) == true) goto L17;
        return false;
    L17:
        if (Arrays.equals(this.f, r4.f) == false) goto L27;
        return true;
    L27:
        return false;
    L28:
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        int r0 = (((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31;
        int r1 = (Arrays.hashCode(this.e) + r0) * 31;
        return Arrays.hashCode(this.f) + r1;
    }
}
