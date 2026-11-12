package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua2 implements bb1 {
    public final float a;

    public ua2(float r1) {
        this.a = r1;
    }

    @Override // defpackage.bb1
    public final float a(float r1) {
        return r1 / this.a;
    }

    @Override // defpackage.bb1
    public final float b(float r1) {
        return r1 * this.a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ua2) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.a, ((ua2) r4).a) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
