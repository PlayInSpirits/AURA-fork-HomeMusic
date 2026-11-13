package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jv1 implements pv2 {
    public final byte[] a;
    public final String b;
    public final String c;

    public jv1(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        String str = this.b;
        if (str != null) {
            co2Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jv1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((jv1) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return f34.i(b11.u("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
