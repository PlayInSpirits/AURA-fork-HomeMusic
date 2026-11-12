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

    public hh1(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hh1.class != obj.getClass()) {
            return false;
        }
        hh1 hh1Var = (hh1) obj;
        return Objects.equals(this.b, hh1Var.b) && this.c.equals(hh1Var.c) && this.d.equals(hh1Var.d) && Arrays.equals(this.e, hh1Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + f34.e(this.d, f34.e(this.c, (527 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
