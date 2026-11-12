package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 implements bb1 {
    public final float[] a;
    public final float[] b;

    static {
    }

    public db1(float[] r3, float[] r4) {
        if (r3.length == r4.length) goto L5;
    L8:
        kf2.n("Array lengths must match and be nonzero");
        throw null;
    L5:
        if (r3.length == 0) goto L8;
        this.a = r3;
        this.b = r4;
    }

    @Override // defpackage.bb1
    public final float a(float r2) {
        return y41.e(r2, this.b, this.a);
    }

    @Override // defpackage.bb1
    public final float b(float r2) {
        return y41.e(r2, this.a, this.b);
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L17;
        if (r3 != null) goto L7;
        return false;
    L7:
        if ((r3 instanceof db1) == false) goto L20;
        db1 r4 = (db1) r3;
        float[] r0 = r4.a;
        if (Arrays.equals(this.a, r0) == true) goto L12;
        return false;
    L12:
        if (Arrays.equals(this.b, r4.b) == false) goto L18;
        return true;
    L18:
        return false;
    L20:
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = Arrays.hashCode(this.a) * 31;
        return Arrays.hashCode(this.b) + r0;
    }

    public final String toString() {
        String r0 = Arrays.toString(this.a);
        r0.getClass();
        String r3 = Arrays.toString(this.b);
        r3.getClass();
        return "FontScaleConverter{fromSpValues=" + r0 + ", toDpValues=" + r3 + "}";
    }
}
