package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u93 extends e22 {
    public static final u93 f = null;

    static {
        f = new u93(0, 2, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r7, bi r8, lg4 r9, uy3 r10, wa3 r11) {
        l02 r12 = (l02) r7.d(0);
        int r13 = r9.c((mg1) r7.d(1));
        if (r9.t < r13) goto L6;
        l80.a("Check failed");
    L6:
        ji2.A(r9, r8, r13);
        int r0 = r9.t;
        int r2 = r9.v;
    L7:
        if (r2 < 0) goto L11;
        if (r9.y(r2) == true) goto L11;
        r2 = r9.E(r9.b, r2);
    L11:
        int r3 = r2 + 1;
        int r4 = 0;
    L12:
        if (r3 >= r0) goto L24;
        if (r9.v(r0, r3) == true) goto L16;
        if (r9.y(r3) == false) goto L22;
        int r5 = 1;
    L23:
        r4 = r4 + r5;
        r3 = r3 + r9.u(r3);
        goto L12
    L22:
        r5 = r9.b[(r9.r(r3) * 5) + 1] & 67108863;
        goto L23
    L16:
        if (r9.y(r3) == false) goto L18;
        r4 = 0;
    L18:
        r3 = r3 + 1;
    L24:
        int r1 = r9.t;
        if (r1 >= r13) goto L35;
        if (r9.v(r13, r1) == true) goto L28;
        r4 = r4 + r9.L();
        goto L24
    L28:
        int r6 = r9.t;
        if (r6 < r9.u) goto L31;
    L33:
        r9.P();
        goto L24
    L31:
        if ((r9.b[(r9.r(r6) * 5) + 1] & 1073741824) == 0) goto L33;
        r8.b(r9.D(r9.t));
        r4 = 0;
        goto L33
    L35:
        if (r1 == r13) goto L38;
        l80.a("Check failed");
    L38:
        r12.a = r4;
    }
}
