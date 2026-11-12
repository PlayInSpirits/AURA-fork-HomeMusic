package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mt2 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public mt2(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final mt2 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new mt2(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt2)) {
            return false;
        }
        mt2 mt2Var = (mt2) obj;
        return this.a.equals(mt2Var.a) && this.b == mt2Var.b && this.c == mt2Var.c && this.d == mt2Var.d && this.e == mt2Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public mt2(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public mt2(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public mt2(Object obj) {
        this(-1L, obj);
    }
}
