package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l60 extends nv1 {
    public final String b;
    public final String c;
    public final String d;

    public l60(String r2, String r3, String r4) {
        super("COMM");
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (l60.class != r3.getClass()) goto L22;
        l60 r4 = (l60) r3;
        if (this.c.equals(r4.c) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L13;
        return false;
    L13:
        if (Objects.equals(this.d, r4.d) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.b, 527, 31);
        int r1 = f34.e(this.c, r0, 31);
        String r3 = this.d;
        if (r3 == null) goto L5;
        int r4 = r3.hashCode();
    L7:
        return r1 + r4;
    L5:
        r4 = 0;
        goto L7
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
