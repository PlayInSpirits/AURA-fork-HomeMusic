package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s10 extends q10 {
    public final char n;
    public final char o;

    public s10(char c, char c2) {
        this.n = c;
        this.o = c2;
    }

    @Override // defpackage.u10
    public final boolean c(char c) {
        return c == this.n || c == this.o;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + u10.a(this.n) + u10.a(this.o) + "\")";
    }
}
