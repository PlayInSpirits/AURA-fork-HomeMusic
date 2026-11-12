package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 extends q10 {
    public final /* synthetic */ int n;
    public final char o;

    public /* synthetic */ r10(char r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.u10
    public final boolean c(char r2) {
        switch(this.n) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (r2 == this.o) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r2 != this.o) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.q10, defpackage.u10
    public final u10 d() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        char r2 = this.o;
        return new r10(r2, 0);
    L6:
        char r3 = this.o;
        return new r10(r3, 1);
    }

    public final String toString() {
        int r0 = this.n;
        char r3 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return "CharMatcher.isNot('" + u10.a(r3) + "')";
    L7:
        return "CharMatcher.is('" + u10.a(r3) + "')";
    }
}
