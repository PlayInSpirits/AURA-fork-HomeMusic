package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m62 {
    public m62() {
        super();
    }

    public static final m62 a;

    static {
        m62 m62Var = new m62();
        if (ku0.a(0.0f, 0.0f) < 0 || ku0.a(0.0f, 0.0f) < 0 || ku0.a(0.0f, 0.0f) < 0 || ku0.a(0.0f, 0.0f) < 0) {
            bz1.a("Layer outsets must be non-negative");
        }
        a = m62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m62) && ku0.b(0.0f, 0.0f) && ku0.b(0.0f, 0.0f) && ku0.b(0.0f, 0.0f) && ku0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + b11.d(b11.d(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    public final String toString() {
        String c = ku0.c(0.0f);
        String c2 = ku0.c(0.0f);
        String c3 = ku0.c(0.0f);
        String c4 = ku0.c(0.0f);
        StringBuilder u = b11.u("LayerOutsets(left=", c, ", top=", c2, ", right=");
        u.append(c3);
        u.append(", bottom=");
        u.append(c4);
        u.append(")");
        return u.toString();
    }
}
