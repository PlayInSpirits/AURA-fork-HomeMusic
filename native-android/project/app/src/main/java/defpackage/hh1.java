package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh1 extends nv1 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public hh1(String r2, String r3, String r4, byte[] r5) {
        super("GEOB");
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L20;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (hh1.class != r3.getClass()) goto L25;
        hh1 r4 = (hh1) r3;
        if (Objects.equals(this.b, r4.b) == true) goto L11;
        return false;
    L11:
        if (this.c.equals(r4.c) == true) goto L13;
        return false;
    L13:
        if (this.d.equals(r4.d) == true) goto L15;
        return false;
    L15:
        if (Arrays.equals(this.e, r4.e) == false) goto L24;
        return true;
    L24:
        return false;
    L25:
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        String r0 = this.b;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L6:
        String r2 = this.c;
        int r3 = f34.e(r2, (527 + r1) * 31, 31);
        int r4 = f34.e(this.d, r3, 31);
        return Arrays.hashCode(this.e) + r4;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
