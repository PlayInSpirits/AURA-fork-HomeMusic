package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn4 {
    public static final xi4 a = null;
    public static final Object b = null;

    static {
        a = new xi4(11);
        b = new Object();
    }

    public static final void a(kn4 r14, dx2 r15, wf1 r16, rg1 r17, int r18) {
        r17.S(-511989831);
        if (r17.g(r14) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r18 | r0;
        if (r17.e(r15) == false) goto L9;
        int r2 = 32;
    L10:
        int r3 = r1 | r2;
        if (r17.g(r16) == false) goto L13;
        int r4 = 256;
    L14:
        int r5 = r3 | r4;
        if ((r5 & 147) == 146) goto L17;
        boolean r6 = true;
    L19:
        if (r17.K(r5 & 1, r6) == false) goto L42;
        int r7 = Long.hashCode(r17.T);
        r17.P(206, l80.e);
        if (r17.S == false) goto L23;
        lg4.z(r17.I);
    L23:
        Object r8 = r17.z();
        if ((r8 instanceof wg1) == false) goto L26;
        wg1 r9 = (wg1) r8;
    L27:
        if (r9 != null) goto L29;
        r9 = new a24(new og1(new pg1(r17, r17.T, r17.q, r17.C, r17.h.G)), -1);
        r17.c0(r9);
    L29:
        vy3 r10 = r9.a;
        r10.getClass();
        pg1 r11 = ((og1) r10).n;
        r11.f.setValue(r17.k());
        r17.o(false);
        dx2 r12 = j51.E(r17, r15);
        mf3 r13 = r17.k();
        r17.U();
        if (r17.S == false) goto L32;
        r17.j();
    L33:
        l93.c0(r14.c, r17, r14);
        l93.c0(r14.d, r17, r11);
        l93.c0(r14.e, r17, r16);
        e80.e.getClass();
        l93.c0(fz0.H, r17, r13);
        l93.a0(r17);
        l93.c0(fz0.G, r17, r12);
        l93.c0(fz0.J, r17, Integer.valueOf(r7));
        r17.o(true);
        if (r17.w() == true) goto L41;
        r17.R(-1259245908);
        boolean r19 = r17.g(r14);
        Object r20 = r17.H();
        if (r19 == false) goto L38;
    L39:
        r20 = new wc(27, r14);
        r17.b0(r20);
    L40:
        ya3 r21 = r17.M.b.n;
        r21.x0(ma3.f);
        rr2.R(r21, 0, (gf1) r20);
        r17.o(false);
    L43:
        lv3 r22 = r17.p();
        if (r22 == null) goto L47;
        r22.d = new d90(r14, r15, r16, r18, 2);
        return;
    L47:
        return;
    L38:
        if (r20 != j80.a) goto L40;
    L41:
        r17.R(-1259187287);
        r17.o(false);
        goto L43
    L32:
        r17.e0();
        goto L33
    L26:
        r9 = null;
        goto L27
    L42:
        r17.N();
        goto L43
    L17:
        r6 = false;
        goto L19
    L13:
        r4 = 128;
        goto L14
    L9:
        r2 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }
}
