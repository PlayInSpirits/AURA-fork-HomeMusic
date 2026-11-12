package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pw2 extends nv1 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public pw2(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw2.class != obj.getClass()) {
            return false;
        }
        pw2 pw2Var = (pw2) obj;
        return this.b == pw2Var.b && this.c == pw2Var.c && this.d == pw2Var.d && Arrays.equals(this.e, pw2Var.e) && Arrays.equals(this.f, pw2Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
