package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd3 extends cx2 implements u62, rv0 {
    public hd3 B;
    public boolean C;
    public hs D;
    public i80 E;
    public float F;
    public dt G;

    public static boolean q0(long r2) {
        if (qf4.a(r2, 9205357640488583168L) == false) goto L5;
        return false;
    L5:
        if ((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 & 4294967295L))) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean r0(long r2) {
        if (qf4.a(r2, 9205357640488583168L) == false) goto L5;
        return false;
    L5:
        if ((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 >> 32))) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.rv0
    public final void S(e72 r20) {
        mz r6 = r20.n;
        long r2 = this.B.d();
        if (r0(r2) == false) goto L5;
        float r4 = Float.intBitsToFloat((int) (r2 >> 32));
    L7:
        if (q0(r2) == false) goto L9;
        float r3 = Float.intBitsToFloat((int) (r2 & 4294967295L));
    L10:
        long r5 = (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r3) & 4294967295L);
        if (Float.intBitsToFloat((int) (r6.P() >> 32)) != 0.0f) goto L14;
    L15:
        long r7 = 0;
    L17:
        long r8 = this.D.a((((long) Math.round(Float.intBitsToFloat((int) (r7 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (r7 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (r6.P() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (r6.P() & 4294967295L)))) & 4294967295L), r20.getLayoutDirection());
        float r9 = (int) (r8 >> 32);
        float r10 = (int) (r8 & 4294967295L);
        ((zg5) r6.o.o).C(r9, r10);
        this.B.c(r20, r7, this.F, this.G);     // Catch: Throwable -> L21
        ((zg5) r6.o.o).C(-r9, -r10);
        r20.a();
        return;
    L21:
        th = move-exception;
        ((zg5) r6.o.o).C(-r9, -r10);
        throw th;
    L14:
        if (Float.intBitsToFloat((int) (r6.P() & 4294967295L)) == 0.0f) goto L15;
        r7 = q05.z(r5, this.E.h(r5, r6.P()));
        goto L17
    L9:
        r3 = Float.intBitsToFloat((int) (r6.P() & 4294967295L));
        goto L10
    L5:
        r4 = Float.intBitsToFloat((int) (r6.P() >> 32));
        goto L7
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r12, pi2 r13, long r14) {
        boolean r1 = false;
        if (nc0.d(r14) == true) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (nc0.f(r14) == false) goto L14;
        if (nc0.e(r14) == false) goto L14;
        r1 = true;
    L14:
        if (this.C == true) goto L16;
    L18:
        if (r0 == true) goto L49;
    L19:
        if (r1 == true) goto L49;
        long r2 = this.B.d();
        if (r0(r2) == false) goto L24;
        int r3 = Math.round(Float.intBitsToFloat((int) (r2 >> 32)));
    L26:
        if (q0(r2) == false) goto L28;
        int r4 = Math.round(Float.intBitsToFloat((int) (r2 & 4294967295L)));
    L29:
        int r5 = qc0.f(r3, r14);
        float r6 = qc0.e(r4, r14);
        long r7 = (Float.floatToRawIntBits(r5) << 32) | (Float.floatToRawIntBits(r6) & 4294967295L);
        if (this.C == true) goto L32;
    L48:
        long r15 = nc0.a(qc0.f(Math.round(Float.intBitsToFloat((int) (r7 >> 32))), r14), qc0.e(Math.round(Float.intBitsToFloat((int) (r7 & 4294967295L))), r14), r14);
    L50:
        jg3 r11 = r13.r(r15);
        return r12.v(r11.n, r11.o, v01.n, new la(r11, 3));
    L32:
        if (this.B.d() == 9205357640488583168L) goto L48;
        if (r0(this.B.d()) == true) goto L36;
        float r8 = Float.intBitsToFloat((int) (r7 >> 32));
    L38:
        if (q0(this.B.d()) == true) goto L40;
        float r9 = Float.intBitsToFloat((int) (r7 & 4294967295L));
    L41:
        long r10 = Float.floatToRawIntBits(r8);
        long r16 = (((long) Float.floatToRawIntBits(r9)) & 4294967295L) | (r10 << 32);
        if (Float.intBitsToFloat((int) (r7 >> 32)) != 0.0f) goto L45;
    L46:
        r7 = 0;
        goto L48
    L45:
        if (Float.intBitsToFloat((int) (r7 & 4294967295L)) == 0.0f) goto L46;
        r7 = q05.z(r16, this.E.h(r16, r7));
        goto L48
    L40:
        r9 = Float.intBitsToFloat((int) (this.B.d() & 4294967295L));
        goto L41
    L36:
        r8 = Float.intBitsToFloat((int) (this.B.d() >> 32));
        goto L38
    L28:
        r4 = nc0.i(r14);
        goto L29
    L24:
        r3 = nc0.j(r14);
    L49:
        r15 = nc0.a(nc0.h(r14), nc0.g(r14), r14);
        goto L50
    L16:
        if (this.B.d() == 9205357640488583168L) goto L18;
    L5:
        if (nc0.c(r14) == false) goto L7;
        r0 = true;
        goto L9
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.B + ", sizeToIntrinsics=" + this.C + ", alignment=" + this.D + ", alpha=" + this.F + ", colorFilter=" + this.G + ")";
    }
}
