package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vo extends cx2 implements rv0, b83, g94 {
    public long B;
    public sp1 C;
    public long D;
    public r62 E;
    public ya4 F;
    public sp1 G;
    public ya4 H;

    @Override // defpackage.b83
    public final void Q() {
        this.D = 9205357640488583168L;
        this.E = null;
        this.F = null;
        this.G = null;
        jz4.z(this);
    }

    @Override // defpackage.rv0
    public final void S(e72 r29) {
        e72 r1 = r29;
        mz r2 = r1.n;
        c71 r7 = c71.d;
        if (this.C != kb4.b) goto L9;
        if (x40.c(this.B, x40.g) == true) goto L7;
        sv0.l(r29, this.B, 0, 126);
        r1 = r29;
    L7:
        e72 r0 = r1;
    L32:
        r0.a();
        return;
    L9:
        if (qf4.a(r2.P(), this.D) == true) goto L11;
    L15:
        j51.F(this, new fa(2, this, r1));
        ya4 r3 = this.H;
        this.H = null;
    L16:
        this.F = r3;
        this.D = r2.P();
        this.E = r1.getLayoutDirection();
        this.G = this.C;
        r3.getClass();
        if (x40.c(this.B, x40.g) == true) goto L7;
        long r4 = this.B;
        if ((r3 instanceof nb3) == false) goto L21;
        wv3 r5 = ((nb3) r3).f;
        float r6 = r5.a;
        float r8 = r5.b;
        long r10 = Float.floatToRawIntBits(r6);
        long r9 = ((long) Float.floatToRawIntBits(r8)) & 4294967295L;
        long r11 = jz4.L(r5);
        r0 = r29;
        r0.H(r4, r9 | (r10 << 32), r11, r7, 3);
        goto L32
    L21:
        r0 = r1;
        if ((r3 instanceof ob3) == false) goto L28;
        ob3 r12 = (ob3) r3;
        nc r13 = r12.g;
        if (r13 == null) goto L26;
    L25:
        r0.c(r13, r4, r7);
        goto L32
    L26:
        g34 r14 = r12.f;
        float r15 = r14.b;
        float r16 = r14.a;
        float r17 = Float.intBitsToFloat((int) (r14.h >> 32));
        long r18 = (Float.floatToRawIntBits(r16) << 32) | (((long) Float.floatToRawIntBits(r15)) & 4294967295L);
        float r19 = r14.c - r16;
        float r20 = r14.d - r15;
        long r110 = Float.floatToRawIntBits(r19);
        long r21 = (((long) Float.floatToRawIntBits(r20)) & 4294967295L) | (r110 << 32);
        long r111 = Float.floatToRawIntBits(r17);
        long r112 = (((long) Float.floatToRawIntBits(r17)) & 4294967295L) | (r111 << 32);
        int r22 = (int) (r18 >> 32);
        int r113 = (int) (r18 & 4294967295L);
        r2.n.c.d(Float.intBitsToFloat(r22), Float.intBitsToFloat(r113), Float.intBitsToFloat((int) (r21 >> 32)) + Float.intBitsToFloat(r22), Float.intBitsToFloat((int) (r21 & 4294967295L)) + Float.intBitsToFloat(r113), Float.intBitsToFloat((int) (r112 >> 32)), Float.intBitsToFloat((int) (r112 & 4294967295L)), mz.a(r2, r4, r7, 3));
        goto L32
    L28:
        if ((r3 instanceof mb3) == false) goto L30;
        r13 = ((mb3) r3).f;
        goto L25
    L30:
        er1.n();
        return;
    L11:
        if (r1.getLayoutDirection() != this.E) goto L15;
        if (h12.c(this.G, this.C) == false) goto L15;
        r3 = this.F;
        r3.getClass();
        goto L16
    }

    @Override // defpackage.g94
    public final boolean c() {
        return false;
    }

    @Override // defpackage.g94
    public final void c0(q94 r1) {
        o94.b(r1, this.C);
    }
}
