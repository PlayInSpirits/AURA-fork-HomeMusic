package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ix {
    public static final /* synthetic */ int n = 0;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        om0 r0 = mx0.n;
        ox0 r1 = ox0.q;
        long r2 = mx0.c(e35.V(Integer.MAX_VALUE), r1);
        if (r2 < 0) goto L5;
        return;
    L5:
        kf2.e(b11.k("maxStale < 0: ", r2));
    }

    public ix(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, String r13) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
    }

    public final String toString() {
        String r0 = this.m;
        if (r0 != null) goto L46;
        StringBuilder r1 = new StringBuilder();
        if (this.a == false) goto L8;
        r1.append("no-cache, ");
    L8:
        if (this.b == false) goto L10;
        r1.append("no-store, ");
    L10:
        int r3 = this.c;
        if (r3 == (-1)) goto L13;
        r1.append("max-age=");
        r1.append(r3);
        r1.append(", ");
    L13:
        int r4 = this.d;
        if (r4 == (-1)) goto L17;
        r1.append("s-maxage=");
        r1.append(r4);
        r1.append(", ");
    L17:
        if (this.e == false) goto L20;
        r1.append("private, ");
    L20:
        if (this.f == false) goto L23;
        r1.append("public, ");
    L23:
        if (this.g == false) goto L25;
        r1.append("must-revalidate, ");
    L25:
        int r5 = this.h;
        if (r5 == (-1)) goto L28;
        r1.append("max-stale=");
        r1.append(r5);
        r1.append(", ");
    L28:
        int r6 = this.i;
        if (r6 == (-1)) goto L32;
        r1.append("min-fresh=");
        r1.append(r6);
        r1.append(", ");
    L32:
        if (this.j == false) goto L35;
        r1.append("only-if-cached, ");
    L35:
        if (this.k == false) goto L38;
        r1.append("no-transform, ");
    L38:
        if (this.l == false) goto L41;
        r1.append("immutable, ");
    L41:
        if (r1.length() != 0) goto L44;
        return "";
    L44:
        r1.delete(r1.length() - 2, r1.length()).getClass();
        String r2 = r1.toString();
        this.m = r2;
        return r2;
    L46:
        return r0;
    }
}
