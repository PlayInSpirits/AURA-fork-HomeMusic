package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ty2 implements pv2 {
    public final float a;
    public final float b;

    public ty2(float r3, float r4) {
        if (r3 >= (-90.0f)) goto L5;
    L11:
        boolean r0 = false;
    L12:
        rr2.k("Invalid latitude or longitude", r0);
        this.a = r3;
        this.b = r4;
        return;
    L5:
        if (r3 > 90.0f) goto L11;
        if (r4 < (-180.0f)) goto L11;
        if (r4 > 180.0f) goto L11;
        r0 = true;
        goto L12
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (ty2.class != r5.getClass()) goto L15;
        ty2 r6 = (ty2) r5;
        if (this.a != r6.a) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = (Float.valueOf(this.a).hashCode() + 527) * 31;
        return Float.valueOf(this.b).hashCode() + r0;
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
