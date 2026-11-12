package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ot4 {
    public final int a;
    public final ho b;
    public final o c;
    public ot4 d;
    public long e;
    public long f;
    public long g;
    public final /* synthetic */ pt4 h;

    public ot4(pt4 r1, int r2, ho r3, o r4) {
        this.h = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.g = Long.MIN_VALUE;
    }

    public final void a(long r16, long r18, long r20, long r22, float[] r24) {
        long r11 = this.h.f;
        ho r14 = this.b;
        f63 r1 = j51.M(r14, 2);
        c72 r2 = j51.O(r14);
        boolean r3 = r2.H();
        w12 r4 = r2.Q;
        if (r3 == true) goto L6;
        qy3 r5 = null;
    L10:
        if (r5 != null) goto L12;
        return;
    L12:
        this.c.invoke(r5);
        return;
    L6:
        if (((f63) r4.e) == r1) goto L9;
        long r8 = Float.floatToRawIntBits((int) (r16 >> 32));
        long r6 = (Float.floatToRawIntBits((int) (r16 & 4294967295L)) & 4294967295L) | (r8 << 32);
        long r7 = r1.p;
        f63 r9 = (f63) r4.e;
        r9.getClass();
        long r10 = ji2.K(r9.A(r1, r6));
        long r12 = 4294967295L & ((long) (((int) (r10 & 4294967295L)) + ((int) (r7 & 4294967295L))));
        qy3 r13 = new qy3(r10, r12 | (((long) (((int) (r10 >> 32)) + ((int) (r7 >> 32)))) << 32), r20, r22, r11, r24, r14);
    L8:
        r5 = r13;
        goto L10
    L9:
        r13 = new qy3(r16, r18, r20, r22, r11, r24, r14);
        goto L8
    }

    public final void b() {
        pt4 r0 = this.h;
        i03 r1 = r0.a;
        int r2 = this.a;
        ot4 r3 = (ot4) r1.g(r2);
        if (r3 == null) goto L9;
        if (r3 == this) goto L28;
        int r5 = r1.d(r2);
        Object[] r6 = r1.c;
        Object r7 = r6[r5];
        r1.b[r5] = r2;
        r6[r5] = r3;
    L7:
        ot4 r4 = r3.d;
        if (r4 == null) goto L9;
        if (r4 == this) goto L25;
        r3 = r4;
        goto L7
    L25:
        r3.d = this.d;
        this.d = null;
        return;
    L28:
        ot4 r8 = this.d;
        this.d = null;
        if (r8 == null) goto L32;
        int r9 = r1.d(r2);
        Object[] r10 = r1.c;
        Object r11 = r10[r9];
        r1.b[r9] = r2;
        r10[r9] = r8;
        return;
    L32:
        c72 r12 = j51.O(this.b.n);
        if (r12.G() == false) goto L43;
        yv3 r13 = ((ra) h12.L(r12)).getRectManager();
        r13.getClass();
        if (r12.t == (-4)) goto L44;
        ue1 r14 = r13.c;
        int r15 = r13.e(r12);
        long[] r16 = (long[]) r14.p;
        int r17 = r15 + 2;
        r16[r17] = r16[r17] & 8070450532247928831L;
        return;
    L44:
        return;
    L43:
        return;
    L9:
        ot4 r18 = r0.b;
        if (r18 != this) goto L13;
        r0.b = r18.d;
        this.d = null;
        return;
    L13:
        if (r18 == null) goto L15;
        ot4 r19 = r18.d;
    L16:
        ot4 r20 = r18;
        r18 = r19;
        if (r18 == null) goto L45;
        if (r18 == this) goto L19;
        r19 = r18.d;
        goto L16
    L19:
        if (r20 == null) goto L21;
        r20.d = r18.d;
    L21:
        this.d = null;
        return;
    L45:
        return;
    L15:
        r19 = null;
        goto L16
    }
}
