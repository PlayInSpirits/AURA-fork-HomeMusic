package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w25 extends nv1 {
    public final String b;
    public final String c;

    public w25(String r1, String r2, String r3) {
        super(r1);
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (w25.class != r3.getClass()) goto L22;
        w25 r4 = (w25) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (Objects.equals(this.b, r4.b) == true) goto L13;
        return false;
    L13:
        if (this.c.equals(r4.c) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        String r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = this.c.hashCode();
        return r3 + ((r0 + r2) * 31);
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
