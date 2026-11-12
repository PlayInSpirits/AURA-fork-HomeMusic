package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qv implements as4 {
    public final pv n;
    public final float o;

    public qv(pv r1, float r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.as4
    public final float b() {
        return this.o;
    }

    @Override // defpackage.as4
    public final long c() {
        int r2 = x40.h;
        return x40.g;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof qv) == true) goto L8;
        return false;
    L8:
        qv r6 = (qv) r5;
        if (h12.c(this.n, r6.n) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.o, r6.o) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // defpackage.as4
    public final uo f() {
        return this.n;
    }

    public final int hashCode() {
        int r0 = this.n.hashCode() * 31;
        return Float.hashCode(this.o) + r0;
    }

    public final String toString() {
        return "BrushStyle(value=" + this.n + ", alpha=" + this.o + ")";
    }
}
