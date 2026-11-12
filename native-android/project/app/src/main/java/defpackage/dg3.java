package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dg3 implements pv2 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public dg3(int r1, String r2, String r3, int r4, int r5, int r6, int r7, byte[] r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
    }

    public static dg3 d(be3 r10) {
        int r1 = r10.m();
        String r2 = lw2.m(r10.y(r10.m(), StandardCharsets.US_ASCII));
        String r3 = r10.y(r10.m(), StandardCharsets.UTF_8);
        int r4 = r10.m();
        int r5 = r10.m();
        int r6 = r10.m();
        int r7 = r10.m();
        int r0 = r10.m();
        byte[] r8 = new byte[r0];
        r10.k(r8, 0, r0);
        return new dg3(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    @Override // defpackage.pv2
    public final void b(co2 r2) {
        byte[] r0 = this.h;
        r2.a(this.a, r0);
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L28;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (dg3.class != r3.getClass()) goto L37;
        dg3 r4 = (dg3) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L13;
        return false;
    L13:
        if (this.c.equals(r4.c) == true) goto L15;
        return false;
    L15:
        if (this.d == r4.d) goto L17;
        return false;
    L17:
        if (this.e == r4.e) goto L19;
        return false;
    L19:
        if (this.f == r4.f) goto L21;
        return false;
    L21:
        if (this.g == r4.g) goto L23;
        return false;
    L23:
        if (Arrays.equals(this.h, r4.h) == false) goto L36;
        return true;
    L36:
        return false;
    L37:
        return false;
    L28:
        return true;
    }

    public final int hashCode() {
        int r0 = (527 + this.a) * 31;
        int r1 = f34.e(this.b, r0, 31);
        int r2 = (((((((f34.e(this.c, r1, 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
        return Arrays.hashCode(this.h) + r2;
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
