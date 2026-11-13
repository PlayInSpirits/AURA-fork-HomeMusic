package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y23 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public y23(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y23)) {
            return false;
        }
        y23 y23Var = (y23) obj;
        return this.a == y23Var.a && this.b == y23Var.b && this.c == y23Var.c && this.d == y23Var.d && this.e == y23Var.e && this.f == y23Var.f && this.g == y23Var.g && this.h == y23Var.h && this.i == y23Var.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y23.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
