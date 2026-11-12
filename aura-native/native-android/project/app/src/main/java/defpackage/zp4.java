package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zp4 {
    public final String a;
    public final int b;
    public final int c;

    public zp4(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp4)) {
            return false;
        }
        zp4 zp4Var = (zp4) obj;
        return h12.c(this.a, zp4Var.a) && this.b == zp4Var.b && this.c == zp4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f34.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
