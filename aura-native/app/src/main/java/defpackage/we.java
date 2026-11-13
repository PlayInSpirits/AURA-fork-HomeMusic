package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class we extends nv1 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public we(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        co2Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || we.class != obj.getClass()) {
            return false;
        }
        we weVar = (we) obj;
        return this.d == weVar.d && this.b.equals(weVar.b) && Objects.equals(this.c, weVar.c) && Arrays.equals(this.e, weVar.e);
    }

    public final int hashCode() {
        int e = f34.e(this.b, (527 + this.d) * 31, 31);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
