package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jk3 {
    public static final jk3 c = new jk3(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public jk3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk3)) {
            return false;
        }
        jk3 jk3Var = (jk3) obj;
        return this.a == jk3Var.a && this.b == jk3Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
