package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ks extends nv1 {
    public final byte[] b;

    public ks(String r1, byte[] r2) {
        super(r1);
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (ks.class != r3.getClass()) goto L19;
        ks r4 = (ks) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (Arrays.equals(this.b, r4.b) == false) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        return Arrays.hashCode(this.b) + r0;
    }
}
