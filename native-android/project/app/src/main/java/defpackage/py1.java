package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements wd {
    public final yy4 a;
    public final hz3 b;

    public py1(yy4 yy4Var, hz3 hz3Var) {
        this.a = yy4Var;
        this.b = hz3Var;
        if (yy4Var.a != 0) {
            return;
        }
        kf2.n("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.wd
    public final g45 a() {
        yy4 yy4Var = this.a;
        x7 x7Var = new x7(yy4Var.a, yy4Var.b);
        ru ruVar = new ru();
        ruVar.p = x7Var;
        ruVar.q = this.b;
        ruVar.n = ((long) x7Var.o) * 1000000;
        ruVar.o = 0L;
        return ruVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof py1)) {
            return false;
        }
        py1 py1Var = (py1) obj;
        return py1Var.a.equals(this.a) && py1Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
