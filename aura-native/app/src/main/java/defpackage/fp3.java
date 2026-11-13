package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fp3 {
    public final String a;
    public final Long b;

    public fp3(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp3)) {
            return false;
        }
        fp3 fp3Var = (fp3) obj;
        return this.a.equals(fp3Var.a) && this.b.equals(fp3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
