package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {
    public static final m62 a = null;

    static {
        m62 r0 = new m62();
        if (ku0.a(0.0f, 0.0f) >= 0) goto L5;
    L11:
        bz1.a("Layer outsets must be non-negative");
    L12:
        a = r0;
        return;
    L5:
        if (ku0.a(0.0f, 0.0f) < 0) goto L11;
        if (ku0.a(0.0f, 0.0f) < 0) goto L11;
        if (ku0.a(0.0f, 0.0f) < 0) goto L11;
        goto L11
    }

    public final boolean equals(Object r1) {
        if (this != r1) goto L5;
        return true;
    L5:
        if ((r1 instanceof m62) == true) goto L8;
        return false;
    L8:
        if (ku0.b(0.0f, 0.0f) == true) goto L11;
        return false;
    L11:
        if (ku0.b(0.0f, 0.0f) == true) goto L14;
        return false;
    L14:
        if (ku0.b(0.0f, 0.0f) == true) goto L17;
        return false;
    L17:
        if (ku0.b(0.0f, 0.0f) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
        return Float.hashCode(0.0f) + r0;
    }

    public final String toString() {
        String r0 = ku0.c(0.0f);
        String r1 = ku0.c(0.0f);
        String r2 = ku0.c(0.0f);
        String r6 = ku0.c(0.0f);
        StringBuilder r3 = b11.u("LayerOutsets(left=", r0, ", top=", r1, ", right=");
        r3.append(r2);
        r3.append(", bottom=");
        r3.append(r6);
        r3.append(")");
        return r3.toString();
    }
}
