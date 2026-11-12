package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements l83 {
    public final k83 n;
    public final long o;
    public final long p;
    public final im4 q;
    public int r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    public fm0(im4 r3, long r4, long r6, long r8, long r10, boolean r12) {
        if (r4 >= 0) goto L5;
    L7:
        boolean r0 = false;
    L8:
        rr2.l(r0);
        this.q = r3;
        this.o = r4;
        this.p = r6;
        if (r8 == (r6 - r4)) goto L13;
        if (r12 == true) goto L13;
        this.r = 0;
    L14:
        this.n = new k83();
        return;
    L13:
        this.s = r10;
        this.r = 4;
        goto L14
    L5:
        if (r6 <= r4) goto L7;
        r0 = true;
        goto L8
    }

    @Override // defpackage.l83
    public final long b(l51 r28) {
        int r2 = this.r;
        long r5 = this.p;
        k83 r8 = this.n;
        if (r2 == 0) goto L51;
        if (r2 == 1) goto L54;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L12;
        if (r2 != 4) goto L10;
        return -1;
    L10:
        tb4.a();
        return 0;
    L12:
        long r19 = 2;
    L45:
        r8.b(r28, -1);
        r8.a(r28, false);
        if (r8.b > this.u) goto L47;
        r28.l(r8.d + r8.e);
        this.v = r28.getPosition();
        this.x = r8.b;
        goto L45
    L47:
        r28.k();
        this.r = 4;
        return -(this.x + r19);
    L14:
        if (this.v != this.w) goto L17;
        long r4 = -1;
    L16:
        r19 = 2;
    L42:
        if (r4 == (-1)) goto L44;
        return r4;
    L44:
        this.r = 3;
        goto L45
    L17:
        long r3 = r28.getPosition();
        if (r8.b(r28, this.w) == true) goto L24;
        r4 = this.v;
        if (r4 != r3) goto L16;
        mj0.i("No ogg page can be found.");
        return 0;
    L24:
        r8.a(r28, false);
        r28.k();
        long r6 = this.u;
        long r13 = r8.b;
        long r7 = r6 - r13;
        r19 = 2;
        int r9 = r8.d + r8.e;
        if (0 > r7) goto L30;
        if (r7 >= 72000) goto L30;
        r4 = -1;
    L30:
        if (r7 >= 0) goto L32;
        this.w = r3;
        this.y = r13;
    L33:
        long r10 = this.w;
        long r14 = this.v;
        if ((r10 - r14) >= 100000) goto L36;
        this.w = r14;
        r4 = r14;
        goto L42
    L36:
        long r11 = r9;
        if (r7 > 0) goto L39;
        long r15 = 2;
    L40:
        long r16 = r28.getPosition() - (r11 * r15);
        long r12 = this.w;
        long r17 = this.v;
        r4 = f35.k((((r12 - r17) * r7) / (this.y - this.x)) + r16, r17, r12 - 1);
        goto L42
    L39:
        r15 = 1;
        goto L40
    L32:
        this.v = r28.getPosition() + ((long) r9);
        this.x = r8.b;
    L54:
        r8.a = 0;
        r8.b = 0;
        r8.c = 0;
        r8.d = 0;
        r8.e = 0;
        if (r8.b(r28, -1) == false) goto L71;
        r8.a(r28, false);
        r28.l(r8.d + r8.e);
        long r18 = r8.b;
    L58:
        if ((r8.a & 4) == 4) goto L68;
        if (r8.b(r28, -1) == false) goto L68;
        if (r28.getPosition() >= r5) goto L68;
        if (r8.a(r28, true) == false) goto L68;
        r28.l(r8.d + r8.e);     // Catch: EOFException -> L72
        r18 = r8.b;
    L68:
        this.s = r18;
        this.r = 4;
        return this.t;
    L71:
        throw new EOFException();
    L51:
        long r20 = r28.getPosition();
        this.t = r20;
        this.r = 1;
        long r110 = r5 - 65307;
        if (r110 <= r20) goto L54;
        return r110;
    }

    @Override // defpackage.l83
    public final m84 e() {
        if (this.s != 0) goto L5;
        return null;
    L5:
        return new em0(this);
    }

    @Override // defpackage.l83
    public final void g(long r11) {
        this.u = f35.k(r11, 0, this.s - 1);
        this.r = 2;
        this.v = this.o;
        this.w = this.p;
        this.x = 0;
        this.y = this.s;
    }
}
