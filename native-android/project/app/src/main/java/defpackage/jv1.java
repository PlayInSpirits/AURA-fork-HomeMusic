package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements pv2 {
    public final byte[] a;
    public final String b;
    public final String c;

    public jv1(byte[] r1, String r2, String r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.pv2
    public final void b(co2 r1) {
        String r0 = this.b;
        if (r0 == null) goto L6;
        r1.a = r0;
        return;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (jv1.class == r3.getClass()) goto L10;
        return false;
    L10:
        return Arrays.equals(this.a, ((jv1) r3).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        int r0 = this.a.length;
        return f34.i(b11.u("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), r0, "\"");
    }
}
