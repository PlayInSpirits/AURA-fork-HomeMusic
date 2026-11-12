package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 {
    public static final vz1 e = new vz1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vz1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static vz1 a(vz1 vz1Var, vz1 vz1Var2) {
        return b(Math.max(vz1Var.a, vz1Var2.a), Math.max(vz1Var.b, vz1Var2.b), Math.max(vz1Var.c, vz1Var2.c), Math.max(vz1Var.d, vz1Var2.d));
    }

    public static vz1 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new vz1(i, i2, i3, i4);
    }

    public static vz1 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return yh.j(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vz1.class != obj.getClass()) {
            return false;
        }
        vz1 vz1Var = (vz1) obj;
        return this.d == vz1Var.d && this.a == vz1Var.a && this.c == vz1Var.c && this.b == vz1Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
