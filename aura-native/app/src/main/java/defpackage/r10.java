package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r10 extends q10 {
    public final /* synthetic */ int n;
    public final char o;

    public /* synthetic */ r10(char c, int i) {
        this.n = i;
        this.o = c;
    }

    @Override // defpackage.u10
    public final boolean c(char c) {
        switch (this.n) {
            case 0:
                if (c == this.o) {
                }
                break;
            default:
                if (c != this.o) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.q10, defpackage.u10
    public final u10 d() {
        switch (this.n) {
            case 0:
                return new r10(this.o, 1);
            default:
                return new r10(this.o, 0);
        }
    }

    public final String toString() {
        int i = this.n;
        char c = this.o;
        switch (i) {
            case 0:
                return "CharMatcher.is('" + u10.a(c) + "')";
            default:
                return "CharMatcher.isNot('" + u10.a(c) + "')";
        }
    }
}
