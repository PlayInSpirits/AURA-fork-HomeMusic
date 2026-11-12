package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ac3 {
    public final float a;
    public final float b;

    public ac3(float r3, float r4) {
        this.a = r3;
        this.b = r4;
        boolean r0 = false;
        if (r3 < 0.0f) goto L5;
        boolean r5 = true;
    L7:
        if (r4 < 0.0f) goto L10;
        r0 = true;
    L10:
        if ((r5 & r0) == true) goto L13;
        az1.a("Padding must be non-negative");
        return;
    L13:
        return;
    L5:
        r5 = false;
        goto L7
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ac3) == false) goto L20;
        ac3 r4 = (ac3) r3;
        float r0 = r4.a;
        if (ku0.b(this.a, r0) == true) goto L8;
        return false;
    L8:
        if (ku0.b(0.0f, 0.0f) == true) goto L10;
        return false;
    L10:
        if (ku0.b(this.b, r4.b) == true) goto L12;
        return false;
    L12:
        if (ku0.b(0.0f, 0.0f) == false) goto L19;
        return true;
    L19:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        int r3 = b11.d(b11.d(Float.hashCode(this.a) * 31, 0.0f, 31), this.b, 31);
        return Float.hashCode(0.0f) + r3;
    }

    public final String toString() {
        String r0 = ku0.c(this.a);
        String r2 = ku0.c(0.0f);
        String r6 = ku0.c(this.b);
        String r1 = ku0.c(0.0f);
        StringBuilder r3 = b11.u("PaddingValues(start=", r0, ", top=", r2, ", end=");
        r3.append(r6);
        r3.append(", bottom=");
        r3.append(r1);
        r3.append(")");
        return r3.toString();
    }
}
