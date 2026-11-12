package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ac3 {
    public final float a;
    public final float b;

    public ac3(float f, float f2) {
        this.a = f;
        this.b = f2;
        if (!(f >= 0.0f) || !(f2 >= 0.0f)) {
            az1.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ac3)) {
            return false;
        }
        ac3 ac3Var = (ac3) obj;
        return ku0.b(this.a, ac3Var.a) && ku0.b(0.0f, 0.0f) && ku0.b(this.b, ac3Var.b) && ku0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + b11.d(b11.d(Float.hashCode(this.a) * 31, 0.0f, 31), this.b, 31);
    }

    public final String toString() {
        String strC = ku0.c(this.a);
        String strC2 = ku0.c(0.0f);
        String strC3 = ku0.c(this.b);
        String strC4 = ku0.c(0.0f);
        StringBuilder sbU = b11.u("PaddingValues(start=", strC, ", top=", strC2, ", end=");
        sbU.append(strC3);
        sbU.append(", bottom=");
        sbU.append(strC4);
        sbU.append(")");
        return sbU.toString();
    }
}
