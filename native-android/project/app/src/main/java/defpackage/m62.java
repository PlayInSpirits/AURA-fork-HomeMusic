package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {
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
        String strC = ku0.c(0.0f);
        String strC2 = ku0.c(0.0f);
        String strC3 = ku0.c(0.0f);
        String strC4 = ku0.c(0.0f);
        StringBuilder sbU = b11.u("LayerOutsets(left=", strC, ", top=", strC2, ", right=");
        sbU.append(strC3);
        sbU.append(", bottom=");
        sbU.append(strC4);
        sbU.append(")");
        return sbU.toString();
    }
}
