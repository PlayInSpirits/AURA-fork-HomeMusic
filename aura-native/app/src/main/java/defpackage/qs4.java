package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qs4 {
    public static final qs4 c = new qs4(2, false);
    public static final qs4 d = new qs4(1, true);
    public final int a;
    public final boolean b;

    public qs4(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs4)) {
            return false;
        }
        qs4 qs4Var = (qs4) obj;
        return this.a == qs4Var.a && this.b == qs4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
