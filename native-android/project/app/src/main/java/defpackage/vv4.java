package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vv4 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vv4(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vv4.class != obj.getClass()) {
            return false;
        }
        vv4 vv4Var = (vv4) obj;
        return this.a == vv4Var.a && this.c == vv4Var.c && this.d == vv4Var.d && Arrays.equals(this.b, vv4Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
