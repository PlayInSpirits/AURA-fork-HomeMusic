package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u20 {
    public final fo a;
    public final wv4 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public u20(int r12, fo r13, wv4 r14) {
        int r0 = r13.d;
        this.a = r13;
        int r1 = r13.a();
        boolean r3 = true;
        if (r1 == 1) goto L7;
        if (r1 == 2) goto L7;
        r3 = false;
    L7:
        rr2.l(r3);
        if (r1 != 2) goto L10;
        int r4 = 1667497984;
    L11:
        int r15 = (((r12 % 10) + 48) << 8) | ((r12 / 10) + 48);
        this.c = r4 | r15;
        long r6 = ((long) r13.b) * 1000000;
        long r8 = r13.c;
        String r16 = f35.a;
        this.e = f35.a0(r0, r6, r8, RoundingMode.DOWN);
        this.b = r14;
        if (r1 != 2) goto L14;
        int r17 = r15 | 1650720768;
    L15:
        this.d = r17;
        this.l = -1;
        this.m = new long[512];
        this.n = new int[512];
        this.f = r0;
        return;
    L14:
        r17 = -1;
        goto L15
    L10:
        r4 = 1651965952;
        goto L11
    }

    public final o84 a(int r8) {
        return new o84((this.e / this.f) * this.n[r8], this.m[r8]);
    }

    public final l84 b(long r5) {
        if (this.k != 0) goto L6;
        o84 r6 = new o84(0, this.l);
        return new l84(r6, r6);
    L6:
        int r7 = (int) (r5 / (this.e / this.f));
        int r8 = f35.e(this.n, r7, true, true);
        if (this.n[r8] != r7) goto L10;
        o84 r4 = a(r8);
        return new l84(r4, r4);
    L10:
        o84 r9 = a(r8);
        int r10 = r8 + 1;
        if (r10 >= this.m.length) goto L15;
        return new l84(r9, a(r10));
    L15:
        return new l84(r9, r9);
    }
}
