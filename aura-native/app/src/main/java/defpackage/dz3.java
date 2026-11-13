package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dz3 {
    public static final dz3 c = new dz3(0, false);
    public final int a;
    public final boolean b;

    public dz3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dz3.class == obj.getClass()) {
            dz3 dz3Var = (dz3) obj;
            if (this.a == dz3Var.a && this.b == dz3Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
