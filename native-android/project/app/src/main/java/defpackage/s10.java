package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 extends q10 {
    public final char n;
    public final char o;

    public s10(char r1, char r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.u10
    public final boolean c(char r2) {
        if (r2 != this.n) goto L5;
        return true;
    L5:
        if (r2 == this.o) goto L11;
        return false;
    L11:
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + u10.a(this.n) + u10.a(this.o) + "\")";
    }
}
