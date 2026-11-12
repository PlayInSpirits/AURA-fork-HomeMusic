package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements oo0 {
    public final float n;
    public final float o;
    public final bb1 p;

    public so0(float r1, float r2, bb1 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof so0) == false) goto L19;
        so0 r4 = (so0) r3;
        if (Float.compare(this.n, r4.n) == 0) goto L11;
        return false;
    L11:
        if (Float.compare(this.o, r4.o) == 0) goto L14;
        return false;
    L14:
        if (this.p.equals(r4.p) == true) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n;
    }

    @Override // defpackage.oo0
    public final long h(float r3) {
        return su3.z(4294967296L, this.p.a(r3));
    }

    public final int hashCode() {
        int r0 = b11.d(Float.hashCode(this.n) * 31, this.o, 31);
        return this.p.hashCode() + r0;
    }

    @Override // defpackage.oo0
    public final float o(long r5) {
        if (ct4.a(bt4.b(r5), 4294967296L) == true) goto L5;
        kf2.o("Only Sp can convert to Px");
        return 0.0f;
    L5:
        return this.p.b(bt4.c(r5));
    }

    public final String toString() {
        StringBuilder r0 = b11.r("DensityWithConverter(density=", this.n, ", fontScale=", this.o, ", converter=");
        r0.append(this.p);
        r0.append(")");
        return r0.toString();
    }
}
