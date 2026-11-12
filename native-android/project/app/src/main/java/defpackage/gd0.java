package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends cx2 implements a90, yi2 {
    public hb3 B;
    public final g74 C;
    public boolean D;
    public fv E;
    public final x64 F;
    public final zg5 G;
    public boolean H;
    public long I;
    public boolean J;

    public gd0(hb3 r1, g74 r2, boolean r3, fv r4, x64 r5) {
        this.B = r1;
        this.C = r2;
        this.D = r3;
        this.E = r4;
        this.F = r5;
        this.G = new zg5(11);
        this.I = -1;
    }

    public static final float q0(gd0 r19, fv r20, long r21) {
        long r2 = r19.I;
        f13 r4 = (f13) r19.G.n;
        int r5 = r4.p - 1;
        Object[] r6 = r4.n;
        wv3 r12 = null;
        if (r5 >= r6.length) goto L22;
        wv3 r7 = null;
    L5:
        if (r5 < 0) goto L21;
        wv3 r13 = (wv3) ((cd0) r6[r5]).a.invoke();
        if (r13 == null) goto L20;
        long r14 = r13.b();
        long r16 = l93.o0(r19.r0());
        float r18 = 0.0f;
        int r8 = r19.B.ordinal();
        if (r8 == 0) goto L14;
        if (r8 != 1) goto L12;
        int r9 = Float.compare(Float.intBitsToFloat((int) (r14 >> 32)), Float.intBitsToFloat((int) (r16 >> 32)));
    L15:
        if (r9 > 0) goto L17;
        r7 = r13;
        goto L20
    L17:
        if (r7 != null) goto L23;
        r7 = r13;
    L23:
        if (r7 == null) goto L25;
    L30:
        long r3 = l93.o0(r2);
        int r0 = r19.B.ordinal();
        if (r0 == 0) goto L37;
        if (r0 != 1) goto L35;
        float r1 = r7.a;
        return r20.a(r1 - ((int) (r21 >> 32)), r7.c - r1, Float.intBitsToFloat((int) (r3 >> 32)));
    L35:
        er1.n();
        return r18;
    L37:
        float r10 = r7.b;
        return r20.a(r10 - ((int) (r21 & 4294967295L)), r7.d - r10, Float.intBitsToFloat((int) (r3 & 4294967295L)));
    L25:
        if (r19.H == false) goto L27;
        r12 = (wv3) r19.F.invoke();
    L27:
        if (r12 != null) goto L29;
        return r18;
    L29:
        r7 = r12;
        goto L30
    L12:
        er1.n();
        return 0.0f;
    L14:
        r9 = Float.compare(Float.intBitsToFloat((int) (r14 & 4294967295L)), Float.intBitsToFloat((int) (r16 & 4294967295L)));
    L20:
        r5 = r5 - 1;
        goto L5
    L21:
        r18 = 0.0f;
        goto L23
    L22:
        r18 = 0.0f;
        r7 = null;
        goto L23
    }

    public static boolean s0(gd0 r6, wv3 r7, long r8, long r10, int r12) {
        if ((r12 & 1) == 0) goto L5;
        r8 = r6.r0();
    L5:
        long r2 = r8;
        if ((r12 & 2) == 0) goto L8;
        r10 = 0;
    L8:
        long r9 = r6.u0(r7, r2, r10);
        if (Math.abs(Float.intBitsToFloat((int) (r9 >> 32))) <= 0.5f) goto L11;
        return false;
    L11:
        if (Math.abs(Float.intBitsToFloat((int) (r9 & 4294967295L))) > 0.5f) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.yi2
    public final void a(long r13) {
        long r3 = r0();
        this.I = r13;
        int r5 = this.B.ordinal();
        if (r5 == 0) goto L8;
        if (r5 != 1) goto L6;
        int r6 = h12.j((int) (r13 >> 32), (int) (r3 >> 32));
    L9:
        if (r6 < 0) goto L12;
        return;
    L12:
        if (this.D == false) goto L14;
        long r1 = 0;
    L16:
        long r8 = r1;
        wv3 r2 = (wv3) this.F.invoke();
        if (r2 != null) goto L22;
        return;
    L22:
        if (this.J == false) goto L24;
        return;
    L24:
        if (this.H == false) goto L26;
        return;
    L26:
        if (s0(this, r2, r3, 0, 2) == true) goto L28;
        return;
    L28:
        if (s0(this, r2, 0, r8, 1) == true) goto L35;
        this.H = true;
        t0(r8);
        return;
    L35:
        return;
    L14:
        if (this.B != hb3.n) goto L17;
        r1 = ((long) (((int) (r3 & 4294967295L)) - ((int) (r13 & 4294967295L)))) & 4294967295L;
        goto L16
    L17:
        r1 = ((long) (((int) (r3 >> 32)) - ((int) (r13 >> 32)))) << 32;
        goto L16
    L6:
        er1.n();
        return;
    L8:
        r6 = h12.j((int) (r13 & 4294967295L), (int) (r3 & 4294967295L));
        goto L9
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final long r0() {
        long r0 = this.I;
        if (n02.a(r0, -1) == false) goto L6;
        return 0;
    L6:
        return r0;
    }

    public final void t0(long r9) {
        fv r0 = this.E;
        if (r0 != null) goto L5;
        r0 = (fv) kb4.q(this, hv.a);
    L5:
        fv r4 = r0;
        if (this.J == false) goto L8;
        fz1.c("launchAnimation called when previous animation was running");
    L8:
        fv r1 = this.E;
        if (r1 != null) goto L11;
        r1 = (fv) kb4.q(this, hv.a);
    L11:
        r1.getClass();
        fv.a.getClass();
        b25 r3 = new b25(ev.b);
        we0 r2 = e0();
        fd0 r5 = new fd0(this, r3, r4, r9, null);
        fu.G(r2, null, ze0.q, r5, 1);
    }

    public final long u0(wv3 r7, long r8, long r10) {
        long r9 = l93.o0(r8);
        int r0 = this.B.ordinal();
        if (r0 != 0) goto L5;
        fv r1 = this.E;
        if (r1 != null) goto L16;
        r1 = (fv) kb4.q(this, hv.a);
    L16:
        float r6 = r7.b;
        float r11 = r1.a(r6 - ((int) (r10 & 4294967295L)), r7.d - r6, Float.intBitsToFloat((int) (r9 & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r11) & 4294967295L);
    L5:
        if (r0 != 1) goto L11;
        fv r2 = this.E;
        if (r2 != null) goto L9;
        r2 = (fv) kb4.q(this, hv.a);
    L9:
        float r12 = r7.a;
        return (Float.floatToRawIntBits(r2.a(r12 - ((int) (r10 >> 32)), r7.c - r12, Float.intBitsToFloat((int) (r9 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    L11:
        er1.n();
        return 0;
    }
}
