package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 implements q62 {
    public final ef2 n;

    public ff2(ef2 r1) {
        this.n = r1;
    }

    @Override // defpackage.q62
    public final long A(q62 r10, long r11) {
        boolean r0 = r10 instanceof ff2;
        ef2 r1 = this.n;
        if (r0 == false) goto L10;
        ef2 r9 = ((ff2) r10).n;
        f63 r12 = r9.H;
        r12.L0();
        ef2 r13 = r1.H.w0(r12).y0();
        if (r13 == null) goto L8;
        long r14 = g02.b(g02.c(r9.s0(r13, false), ji2.K(r11)), r1.s0(r13, false));
        return (Float.floatToRawIntBits((int) (r14 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r14 & 4294967295L)) & 4294967295L);
    L8:
        ef2 r15 = au0.A(r9);
        long r16 = g02.c(g02.c(r9.s0(r15, false), r15.I), ji2.K(r11));
        ef2 r17 = au0.A(r1);
        long r18 = g02.b(r16, g02.c(r1.s0(r17, false), r17.I));
        long r2 = Float.floatToRawIntBits((int) (r18 >> 32));
        long r19 = ((long) Float.floatToRawIntBits((int) (r18 & 4294967295L))) & 4294967295L;
        f63 r20 = r17.H.J;
        r20.getClass();
        f63 r110 = r15.H.J;
        r110.getClass();
        return r20.A(r110, r19 | (r2 << 32));
    L10:
        ef2 r3 = au0.A(r1);
        f63 r4 = r3.H;
        long r111 = A(r3.K, r11);
        long r5 = r3.I;
        float r6 = (int) (r5 & 4294967295L);
        long r7 = Float.floatToRawIntBits((int) (r5 >> 32));
        long r112 = g83.d(r111, (4294967295L & ((long) Float.floatToRawIntBits(r6))) | (r7 << 32));
        if (r4.A0().A == true) goto L13;
        cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
    L13:
        r4.L0();
        f63 r21 = r4.J;
        if (r21 == null) goto L18;
        r4 = r21;
    L18:
        return g83.e(r112, r4.A(r10, 0));
    }

    @Override // defpackage.q62
    public final wv3 C(q62 r1, boolean r2) {
        return this.n.H.C(r1, r2);
    }

    public final long a() {
        ef2 r0 = this.n;
        ef2 r1 = au0.A(r0);
        return g83.d(A(r1.K, 0), r0.H.A(r1.H, 0));
    }

    @Override // defpackage.q62
    public final long b(long r4) {
        return this.n.H.b(g83.e(r4, a()));
    }

    @Override // defpackage.q62
    public final boolean f() {
        return this.n.H.A0().A;
    }

    @Override // defpackage.q62
    public final long k() {
        ef2 r6 = this.n;
        int r0 = r6.n;
        return (((long) r0) << 32) | (((long) r6.o) & 4294967295L);
    }

    @Override // defpackage.q62
    public final long q(long r5) {
        return this.n.H.q(g83.e(0, a()));
    }

    @Override // defpackage.q62
    public final q62 u() {
        if (f() == true) goto L5;
        cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
    L5:
        f63 r1 = ((f63) this.n.H.H.Q.e).J;
        if (r1 == null) goto L11;
        ef2 r2 = r1.y0();
        if (r2 != null) goto L10;
        return null;
    L10:
        return r2.K;
    L11:
        return null;
    }

    @Override // defpackage.q62
    public final long z(q62 r1, long r2) {
        return A(r1, r2);
    }
}
