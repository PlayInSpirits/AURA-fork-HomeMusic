package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq3 extends nv1 {
    public final String b;
    public final byte[] c;

    public hq3(String r2, byte[] r3) {
        super("PRIV");
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (hq3.class != r3.getClass()) goto L19;
        hq3 r4 = (hq3) r3;
        if (this.b.equals(r4.b) == true) goto L11;
        return false;
    L11:
        if (Arrays.equals(this.c, r4.c) == false) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.b, 527, 31);
        return Arrays.hashCode(this.c) + r0;
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
