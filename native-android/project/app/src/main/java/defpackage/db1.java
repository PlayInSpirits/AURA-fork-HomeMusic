package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 implements bb1 {
    public final float[] a;
    public final float[] b;

    public db1(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            kf2.n("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.bb1
    public final float a(float f) {
        return y41.e(f, this.b, this.a);
    }

    @Override // defpackage.bb1
    public final float b(float f) {
        return y41.e(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        return Arrays.equals(this.a, db1Var.a) && Arrays.equals(this.b, db1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        string.getClass();
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }
}
