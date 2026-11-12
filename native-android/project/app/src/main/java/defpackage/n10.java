package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 extends u10 {
    public final u10 n;
    public final u10 o;

    public n10(u10 u10Var, u10 u10Var2) {
        u10Var.getClass();
        this.n = u10Var;
        u10Var2.getClass();
        this.o = u10Var2;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.u10
    public final boolean c(char c) {
        return this.n.c(c) && this.o.c(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.n + ", " + this.o + ")";
    }
}
