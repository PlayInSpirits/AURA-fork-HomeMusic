package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ks extends nv1 {
    public final byte[] b;

    public ks(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ks.class != obj.getClass()) {
            return false;
        }
        ks ksVar = (ks) obj;
        return this.a.equals(ksVar.a) && Arrays.equals(this.b, ksVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + f34.e(this.a, 527, 31);
    }
}
