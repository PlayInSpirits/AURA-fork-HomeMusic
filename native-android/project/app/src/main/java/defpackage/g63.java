package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g63 {
    public static final p03 a = null;

    static {
        p03 r0 = r73.a;
        a = new p03();
    }

    public static final void a(cx2 r3, int r4, int r5) {
        if ((r3 instanceof fo0) == false) goto L8;
        fo0 r0 = (fo0) r3;
        int r1 = r0.B;
        b(r3, r1 & r4, r5);
        int r6 = (~r1) & r4;
        cx2 r7 = r0.C;
    L5:
        if (r7 == null) goto L7;
        a(r7, r6, r5);
        r7 = r7.s;
        goto L5
    L7:
        return;
    L8:
        b(r3, r4 & r3.p, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(cx2 r6, int r7, int r8) {
        if (r8 != 0) goto L7;
        if (r6.f0() == true) goto L7;
        return;
    L7:
        if ((r7 & 2) == 0) goto L14;
        if ((r6 instanceof u62) == false) goto L14;
        g12.A((u62) r6);
        if (r8 != 2) goto L14;
        j51.M(r6, 2).O0();
    L14:
        if ((r7 & 128) == 0) goto L18;
        if (r8 == 2) goto L18;
        j51.O(r6).D();
    L18:
        if ((4194304 & r7) == 0) goto L22;
        if (r8 == 2) goto L22;
        j51.O(r6).V(false);
    L22:
        if ((r7 & 256) == 0) goto L45;
        if ((r6 instanceof vi1) == false) goto L45;
        if (r8 == 1) goto L29;
        if (r8 != 2) goto L30;
        c72 r0 = j51.O(r6);
        r0.b0(r0.Y - 1);
    L30:
        if (r8 == 2) goto L45;
        c72 r1 = j51.O(r6);
        if (r1.Y == 0) goto L45;
        if (r1.p() == true) goto L45;
        if (r1.q() == true) goto L45;
        if (r1.X == true) goto L45;
        ra r3 = (ra) h12.L(r1);
        rm3 r4 = r3.f0.e;
        r4.getClass();
        if (r1.Y <= 0) goto L43;
        ((f13) r4.n).b(r1);
        r1.X = true;
    L43:
        r3.D(null);
        goto L45
    L29:
        c72 r2 = j51.O(r6);
        r2.b0(r2.Y + 1);
    L45:
        if ((r7 & 4) == 0) goto L50;
        if ((r6 instanceof rv0) == false) goto L50;
        jz4.z((rv0) r6);
    L50:
        if ((r7 & 8) == 0) goto L55;
        if ((r6 instanceof g94) == false) goto L55;
        j51.O(r6).D = true;
    L55:
        if ((r7 & 64) == 0) goto L60;
        if ((r6 instanceof xo) == false) goto L60;
        j51.O((xo) r6).R.p.getClass();
    L60:
        if ((r7 & 2048) == 0) goto L67;
        if ((r6 instanceof xo) == false) goto L67;
        bx2 r9 = ((xo) r6).B;
        cz1.b("applyFocusProperties called on wrong node");
        r9.getClass();
        kf2.k();
        return;
    L67:
        if ((r7 & 4096) == 0) goto L74;
        if ((r6 instanceof xo) == false) goto L74;
        xo r5 = (xo) r6;
        s91 r10 = (s91) ((ey) ((ra) j51.P(r5)).getFocusOwner()).d;
        if (r10.d.a(r5) == false) goto L74;
        r10.a();
    L74:
        if ((r7 & 2097152) != 0) goto L76;
        return;
    L76:
        if ((r6 instanceof my1) == false) goto L81;
        if (r8 != 2) goto L82;
        ((my1) r6).N();
        return;
    L82:
        return;
    }

    public static final void c(cx2 r2) {
        if (r2.A == true) goto L5;
        cz1.b("autoInvalidateUpdatedNode called on unattached node");
    L5:
        a(r2, -1, 0);
    }

    public static final int d(cx2 r4) {
        int r0 = r4.p;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        Class<?> r1 = r4.getClass();
        p03 r2 = a;
        int r3 = r2.d(r1);
        if (r3 < 0) goto L10;
        return r2.c[r3];
    L10:
        if ((r4 instanceof u62) == false) goto L12;
        int r5 = 3;
    L14:
        if ((r4 instanceof rv0) == false) goto L17;
        r5 = r5 | 4;
    L17:
        if ((r4 instanceof g94) == false) goto L20;
        r5 = r5 | 8;
    L20:
        if ((r4 instanceof rn3) == false) goto L23;
        r5 = r5 | 16;
    L23:
        if ((r4 instanceof fx2) == false) goto L26;
        r5 = r5 | 32;
    L26:
        if ((r4 instanceof xo) == false) goto L29;
        r5 = r5 | 64;
    L29:
        if ((r4 instanceof o62) == false) goto L32;
        r5 = r5 | 4194432;
    L35:
        if ((r4 instanceof vi1) == false) goto L38;
        r5 = r5 | 256;
    L38:
        if ((r4 instanceof ba1) == false) goto L40;
        r5 = r5 | 1024;
    L40:
        boolean r6 = r4 instanceof xo;
        if (r6 == false) goto L43;
        r5 = r5 | 2048;
    L43:
        if (r6 == false) goto L46;
        r5 = r5 | 4096;
    L46:
        if ((r4 instanceof j42) == false) goto L49;
        r5 = r5 | 8192;
    L49:
        if ((r4 instanceof ma) == false) goto L52;
        r5 = r5 | 16384;
    L52:
        if ((r4 instanceof a90) == false) goto L55;
        r5 = r5 | 32768;
    L55:
        if ((r4 instanceof rx4) == false) goto L58;
        r5 = r5 | 262144;
    L58:
        if ((r4 instanceof zu) == false) goto L61;
        r5 = r5 | 524288;
    L61:
        if ((r4 instanceof ba1) == false) goto L64;
        r5 = r5 | 1048576;
    L64:
        if ((r4 instanceof my1) == false) goto L67;
        r5 = r5 | 2097152;
    L67:
        if ((r4 instanceof z72) == false) goto L69;
        r5 = r5 | 8388608;
    L69:
        r2.g(r5, r1);
        return r5;
    L32:
        if ((r4 instanceof yi2) == false) goto L35;
        r5 = r5 | 128;
        goto L35
    L12:
        r5 = 1;
        goto L14
    }

    public static final int e(cx2 r2) {
        if ((r2 instanceof fo0) == false) goto L9;
        fo0 r3 = (fo0) r2;
        int r0 = r3.B;
        cx2 r4 = r3.C;
    L5:
        if (r4 == null) goto L7;
        r0 = r0 | e(r4);
        r4 = r4.s;
        goto L5
    L7:
        return r0;
    L9:
        return d(r2);
    }

    public static final boolean f(int r4) {
        boolean r1 = false;
        if ((r4 & 128) == 0) goto L5;
        boolean r0 = true;
    L7:
        if ((r4 & 4194304) == 0) goto L10;
        r1 = true;
    L10:
        return r0 | r1;
    L5:
        r0 = false;
        goto L7
    }
}
