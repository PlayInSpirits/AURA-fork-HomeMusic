package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 extends q10 {
    public static final o10 p = null;
    public static final o10 q = null;
    public static final o10 r = null;
    public static final o10 s = null;
    public final String n;
    public final /* synthetic */ int o;

    static {
        p = new o10(0, "CharMatcher.any()");
        q = new o10(1, "CharMatcher.ascii()");
        r = new o10(2, "CharMatcher.javaIsoControl()");
        s = new o10(3, "CharMatcher.none()");
    }

    public o10(int r1, String r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.u10
    public final boolean c(char r1) {
        switch(this.o) {
            case 0: goto L21;
            case 1: goto L17;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return false;
    L21:
        return true;
    L7:
        if (r1 > 31) goto L9;
    L14:
        return true;
    L9:
        if (r1 >= 127) goto L11;
    L13:
        return false;
    L11:
        if (r1 > 159) goto L13;
    L17:
        if (r1 > 127) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // defpackage.q10, defpackage.u10
    public u10 d() {
        switch(this.o) {
            case 0: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.d();
    L7:
        return p;
    L9:
        return s;
    }

    public final String toString() {
        return this.n;
    }
}
