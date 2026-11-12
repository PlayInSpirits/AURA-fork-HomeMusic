package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qv implements as4 {
    public final pv n;
    public final float o;

    public qv(pv pvVar, float f) {
        this.n = pvVar;
        this.o = f;
    }

    @Override // defpackage.as4
    public final float b() {
        return this.o;
    }

    @Override // defpackage.as4
    public final long c() {
        int i = x40.h;
        return x40.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return h12.c(this.n, qvVar.n) && Float.compare(this.o, qvVar.o) == 0;
    }

    @Override // defpackage.as4
    public final uo f() {
        return this.n;
    }

    public final int hashCode() {
        return Float.hashCode(this.o) + (this.n.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.n + ", alpha=" + this.o + ")";
    }
}
