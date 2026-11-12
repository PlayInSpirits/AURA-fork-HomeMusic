package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 extends u10 {
    public final u10 n;
    public final u10 o;

    public n10(u10 r1, u10 r2) {
        r1.getClass();
        this.n = r1;
        r2.getClass();
        this.o = r2;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r1) {
        return c(((Character) r1).charValue());
    }

    @Override // defpackage.u10
    public final boolean c(char r2) {
        if (this.n.c(r2) == true) goto L5;
        return false;
    L5:
        if (this.o.c(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.n + ", " + this.o + ")";
    }
}
