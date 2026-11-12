package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements oo0 {
    public final float n;
    public final float o;

    public ro0(float r1, float r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ro0) == true) goto L8;
        return false;
    L8:
        ro0 r6 = (ro0) r5;
        if (Float.compare(this.n, r6.n) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.o, r6.o) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.n) * 31;
        return Float.hashCode(this.o) + r0;
    }

    public final String toString() {
        return xa3.f("DensityImpl(density=", this.n, ", fontScale=", this.o, ")");
    }
}
