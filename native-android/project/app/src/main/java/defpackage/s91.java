package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s91 {
    public final ey a;
    public final ra b;
    public final x03 c;
    public final x03 d;
    public boolean e;

    public s91(ey r1, ra r2) {
        this.a = r1;
        this.b = r2;
        x03 r3 = w54.a;
        this.c = new x03();
        this.d = new x03();
    }

    public final void a() {
        if (this.e == true) goto L10;
        int r2 = 0;
        Class<s91> r4 = s91.class;
        String r5 = "invalidateNodes";
        String r6 = "invalidateNodes()V";
        na r1 = new na(r2, this, r4, r5, r6, 0, 1);
        q03 r9 = this.b.C0;
        if (r9.g(r1) >= 0) goto L8;
        r9.a(r1);
    L8:
        this.e = true;
        return;
    }
}
