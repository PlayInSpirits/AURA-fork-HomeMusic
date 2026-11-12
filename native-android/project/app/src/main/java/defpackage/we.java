package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class we extends nv1 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public we(String r2, String r3, int r4, byte[] r5) {
        super("APIC");
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // defpackage.pv2
    public final void b(co2 r2) {
        byte[] r0 = this.e;
        r2.a(this.d, r0);
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L20;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (we.class != r3.getClass()) goto L25;
        we r4 = (we) r3;
        if (this.d == r4.d) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L13;
        return false;
    L13:
        if (Objects.equals(this.c, r4.c) == true) goto L15;
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
        int r0 = (527 + this.d) * 31;
        int r1 = f34.e(this.b, r0, 31);
        String r2 = this.c;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r4 = Arrays.hashCode(this.e);
        return r4 + ((r1 + r3) * 31);
    L5:
        r3 = 0;
        goto L6
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
