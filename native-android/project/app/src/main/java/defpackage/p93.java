package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p93 extends e22 {
    public static final p93 f = null;

    static {
        f = new p93(0, 2, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r3, bi r4, lg4 r5, uy3 r6, wa3 r7) {
        mg1 r2 = (mg1) r3.d(0);
        Object r8 = r3.d(1);
        if ((r8 instanceof wg1) == false) goto L6;
        wg1 r9 = (wg1) r8;
        r6.e.b(r9);
        r6.d.a(r9);
    L6:
        if (r5.n == 0) goto L9;
        l80.a("Can only append a slot if not current inserting");
    L9:
        int r10 = r5.i;
        int r11 = r5.j;
        int r12 = r5.c(r2);
        int r0 = r5.g(r5.b, r5.r(r12 + 1));
        r5.i = r0;
        r5.j = r0;
        r5.x(1, r12);
        if (r10 < r0) goto L12;
        r10 = r10 + 1;
        r11 = r11 + 1;
    L12:
        r5.c[r0] = r8;
        r5.i = r10;
        r5.j = r11;
    }
}
