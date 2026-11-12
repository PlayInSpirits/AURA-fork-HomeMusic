package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra3 extends e22 {
    public static final ra3 f = null;

    static {
        f = new ra3(1, 0, 2);
    }

    @Override // defpackage.e22
    public final void d(x20 r2, bi r3, lg4 r4, uy3 r5, wa3 r6) {
        int r1 = r2.c(0);
        int r7 = r4.v;
        int r8 = r4.N(r4.b, r4.r(r7));
        int r9 = r4.g(r4.b, r4.r(r7 + 1));
        int r10 = Math.max(r8, r9 - r1);
    L3:
        if (r10 >= r9) goto L12;
        Object r11 = r4.c[r4.h(r10)];
        if ((r11 instanceof wg1) == false) goto L8;
        r5.e((wg1) r11);
    L10:
        r10 = r10 + 1;
        goto L3
    L8:
        if ((r11 instanceof lv3) == false) goto L10;
        ((lv3) r11).c();
        goto L10
    L12:
        if (r1 > 0) goto L15;
        l80.a("Check failed");
    L15:
        int r12 = r4.v;
        int r13 = r4.N(r4.b, r4.r(r12));
        int r14 = r4.g(r4.b, r4.r(r12 + 1)) - r1;
        if (r14 >= r13) goto L19;
        l80.a("Check failed");
    L19:
        r4.J(r14, r1, r12);
        int r15 = r4.i;
        if (r15 < r13) goto L27;
        r4.i = r15 - r1;
        return;
    }
}
