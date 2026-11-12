package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 extends fh0 {
    public boolean n;
    public final int o;
    public final tu p;
    public final tu q;
    public int r;
    public byte[] s;
    public int t;
    public final /* synthetic */ cu1 u;

    public zt1(cu1 r2, int r3, int[] r4, int[] r5) {
        this.u = r2;
        this.n = false;
        this.r = 0;
        this.s = new byte[0];
        this.t = 0;
        this.o = r3;
        this.p = cu1.b(r4);
        this.q = cu1.b(r5);
    }

    @Override // defpackage.fh0
    public final int e() {
        return this.t - this.r;
    }

    @Override // defpackage.fh0
    public final boolean o() {
        return !this.n;
    }

    @Override // defpackage.fh0
    public final int r(byte[] r19, int r20, int r21) {
        int r4 = 0;
        if (r21 != 0) goto L6;
        return 0;
    L6:
        if (this.n == false) goto L9;
        return -1;
    L9:
        int r5 = this.t - this.r;
        if (r5 <= 0) goto L12;
        int r6 = Math.min(r21, r5);
        System.arraycopy(this.s, this.r, r19, r20, r6);
        this.r += r6;
    L13:
        if (r6 >= r21) goto L54;
        cu1 r7 = this.u;
        qs r8 = r7.p;
        i r9 = r7.r;
        byte[] r10 = (byte[]) r9.c;
        int r11 = cu1.f(r8, this.p);
        int r12 = 65535;
        if (r11 >= 256) goto L22;
        int r13 = r6 + 1;
        int r14 = r6 + r20;
        byte r15 = (byte) r11;
        int r16 = r9.a;
        r10[r16] = r15;
        int r17 = (r16 + 1) & 65535;
        if (r9.b == true) goto L20;
        if (r17 >= r16) goto L20;
        r9.b = true;
    L20:
        r9.a = r17;
        r19[r14] = r15;
        int r18 = r4;
    L21:
        r6 = r13;
        r4 = r18;
        goto L13
    L22:
        if (r11 <= 256) goto L53;
        short r22 = cu1.s[r11 - 257];
        long r110 = cu1.j(r7.p, r22 & 31);
        int r23 = (int) (r110 + ((long) (r22 >>> 5)));
        int r111 = cu1.t[cu1.f(r7.p, this.q)];
        long r112 = cu1.j(r7.p, r111 & 15);
        int r24 = (int) (r112 + ((long) (r111 >>> 4)));
        if (this.s.length >= r23) goto L26;
        this.s = new byte[r23];
    L26:
        this.t = r23;
        this.r = r4;
        byte[] r113 = this.s;
        if (r24 > r10.length) goto L51;
        int r114 = r9.a;
        int r115 = (r114 - r24) & 65535;
        if (r9.b == true) goto L34;
        if (r115 < r114) goto L34;
        kf2.o(f34.f(r24, "Attempt to read beyond memory: dist="));
        return r4;
    L34:
        int r25 = r4;
    L35:
        if (r25 >= r23) goto L45;
        byte r116 = r10[r115];
        int r117 = r9.a;
        r10[r117] = r116;
        int r118 = r4;
        int r26 = (r117 + 1) & r12;
        int r119 = r12;
        if (r9.b == true) goto L40;
        if (r26 >= r117) goto L40;
        r9.b = true;
    L40:
        r9.a = r26;
        r113[r25] = r116;
        r25 = r25 + 1;
        int r27 = (r115 + 1) & r119;
        if (r9.b == true) goto L44;
        if (r27 >= r115) goto L44;
        r9.b = true;
    L44:
        r115 = r27;
        r12 = r119;
        r4 = r118;
        goto L35
    L45:
        r18 = r4;
        int r28 = r20 + r6;
        int r29 = r21 - r6;
        int r30 = this.t - this.r;
        if (r30 <= 0) goto L48;
        int r31 = Math.min(r29, r30);
        System.arraycopy(this.s, this.r, r19, r28, r31);
        this.r += r31;
    L49:
        r13 = r31 + r6;
        goto L21
    L48:
        r31 = r18;
        goto L49
    L51:
        int r120 = r4;
        kf2.o(f34.f(r24, "Illegal distance parameter: "));
        return r120;
    L53:
        this.n = true;
    L54:
        return r6;
    L12:
        r6 = 0;
        goto L13
    }

    @Override // defpackage.fh0
    public final int x() {
        if (this.n == false) goto L7;
        return 1;
    L7:
        return this.o;
    }
}
