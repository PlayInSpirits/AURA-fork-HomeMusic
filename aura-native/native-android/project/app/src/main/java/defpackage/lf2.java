package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 implements xn3 {
    public final mf2 a;
    public int b;
    public Class c;

    public lf2(mf2 mf2Var) {
        this.a = mf2Var;
    }

    @Override // defpackage.xn3
    public final void a() {
        this.a.k(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lf2) {
            lf2 lf2Var = (lf2) obj;
            if (this.b == lf2Var.b && this.c == lf2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
