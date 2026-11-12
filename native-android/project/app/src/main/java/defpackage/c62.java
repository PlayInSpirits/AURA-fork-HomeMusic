package defpackage;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c62 {
    public final NsdServiceInfo a;
    public final long b;

    public c62(NsdServiceInfo nsdServiceInfo, long j) {
        this.a = nsdServiceInfo;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c62)) {
            return false;
        }
        c62 c62Var = (c62) obj;
        return this.a.equals(c62Var.a) && this.b == c62Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FoundDevice(info=" + this.a + ", foundAt=" + this.b + ")";
    }
}
