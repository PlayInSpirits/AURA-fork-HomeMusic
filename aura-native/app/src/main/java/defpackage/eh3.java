package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eh3 {
    public final zg3 a;

    public eh3(zg3 zg3Var) {
        this.a = zg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eh3) {
            return h12.c(this.a, ((eh3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        zg3 zg3Var = this.a;
        if (zg3Var != null) {
            return zg3Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ")";
    }
}
