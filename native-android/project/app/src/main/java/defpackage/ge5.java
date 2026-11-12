package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge5 implements q84 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public ge5(long r1, int r3, long r4, int r6, long r7, long[] r9) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
        this.d = r6;
        this.e = r7;
        this.g = r9;
        long r5 = -1;
        if (r7 == (-1)) goto L6;
        r5 = r1 + r7;
    L6:
        this.f = r5;
    }

    @Override // defpackage.q84
    public final long a() {
        return this.f;
    }

    @Override // defpackage.m84
    public final boolean b() {
        if (this.g == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.q84
    public final long c(long r13) {
        long r14 = r13 - this.a;
        if (b() == true) goto L5;
        return 0;
    L5:
        if (r14 <= this.b) goto L19;
        long[] r0 = this.g;
        r0.getClass();
        double r15 = (r14 * 256.0d) / this.e;
        int r1 = f35.f(r0, (long) r15, true);
        long r4 = this.c;
        long r2 = (((long) r1) * r4) / 100;
        long r8 = r0[r1];
        int r12 = r1 + 1;
        long r5 = (r4 * ((long) r12)) / 100;
        if (r1 != 99) goto L10;
        long r3 = 256;
    L12:
        if (r8 != r3) goto L14;
        double r16 = 0.0d;
    L16:
        return Math.round(r16 * (r5 - r2)) + r2;
    L14:
        r16 = (r15 - r8) / (r3 - r8);
        goto L16
    L10:
        r3 = r0[r12];
        goto L12
    L19:
        return 0;
    }

    @Override // defpackage.m84
    public final l84 e(long r20) {
        boolean r1 = b();
        int r2 = this.b;
        long r3 = this.a;
        if (r1 == true) goto L6;
        o84 r4 = new o84(0, r3 + ((long) r2));
        return new l84(r4, r4);
    L6:
        long r5 = f35.k(r20, 0, this.c);
        double r7 = (r5 * 100.0d) / this.c;
        double r11 = 0.0d;
        if (r7 > 0.0d) goto L10;
        double r21 = 256.0d;
    L17:
        long r0 = this.e;
        o84 r8 = new o84(r5, r3 + f35.k(Math.round((r11 / r21) * r0), r2, r0 - 1));
        return new l84(r8, r8);
    L10:
        if (r7 < 100.0d) goto L12;
        r21 = 256.0d;
        r11 = 256.0d;
        goto L17
    L12:
        int r6 = (int) r7;
        long[] r9 = this.g;
        r9.getClass();
        double r10 = r9[r6];
        if (r6 != 99) goto L15;
        r21 = 256.0d;
        double r12 = 256.0d;
    L16:
        r11 = ((r12 - r10) * (r7 - ((double) r6))) + r10;
        goto L17
    L15:
        r21 = 256.0d;
        r12 = r9[r6 + 1];
        goto L16
    }

    @Override // defpackage.q84
    public final int f() {
        return this.d;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
