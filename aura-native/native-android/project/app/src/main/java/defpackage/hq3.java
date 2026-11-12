package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq3 extends nv1 {
    public final String b;
    public final byte[] c;

    public hq3(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hq3.class != obj.getClass()) {
            return false;
        }
        hq3 hq3Var = (hq3) obj;
        return this.b.equals(hq3Var.b) && Arrays.equals(this.c, hq3Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + f34.e(this.b, 527, 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
