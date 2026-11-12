package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy4 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public sy4(int r4, int r5, int r6) {
        if (r4 == Integer.MIN_VALUE) goto L5;
        String r7 = r4 + "/";
    L6:
        this.a = r7;
        this.b = r5;
        this.c = r6;
        this.d = Integer.MIN_VALUE;
        this.e = "";
        return;
    L5:
        r7 = "";
        goto L6
    }

    public final void a() {
        int r0 = this.d;
        if (r0 != Integer.MIN_VALUE) goto L5;
        int r1 = this.b;
    L6:
        this.d = r1;
        this.e = this.a + this.d;
        return;
    L5:
        r1 = r0 + this.c;
        goto L6
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) goto L5;
        return;
    L5:
        kf2.o("generateNewId() must be called before retrieving ids.");
    }

    public sy4(int r2, int r3) {
        this(Integer.MIN_VALUE, r2, r3);
    }
}
