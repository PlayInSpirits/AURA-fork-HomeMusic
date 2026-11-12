package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l10 extends nv1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final nv1[] g;

    public l10(String r2, int r3, int r4, long r5, long r7, nv1[] r9) {
        super("CHAP");
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r7;
        this.g = r9;
    }

    public final boolean equals(Object r5) {
        if (this == r5) goto L24;
        if (r5 != null) goto L6;
        return false;
    L6:
        if (l10.class != r5.getClass()) goto L31;
        l10 r6 = (l10) r5;
        if (this.c == r6.c) goto L11;
        return false;
    L11:
        if (this.d == r6.d) goto L13;
        return false;
    L13:
        if (this.e == r6.e) goto L15;
        return false;
    L15:
        if (this.f == r6.f) goto L17;
        return false;
    L17:
        if (this.b.equals(r6.b) == true) goto L19;
        return false;
    L19:
        if (Arrays.equals(this.g, r6.g) == false) goto L30;
        return true;
    L30:
        return false;
    L31:
        return false;
    L24:
        return true;
    }

    public final int hashCode() {
        int r0 = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        return this.b.hashCode() + r0;
    }
}
