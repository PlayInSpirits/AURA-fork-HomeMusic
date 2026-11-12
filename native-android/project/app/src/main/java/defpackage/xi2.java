package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final fs e;
    public final gs f;
    public final r62 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int[] k;
    public int l;
    public int m;

    public xi2(int r1, int r2, List r3, long r4, Object r6, hb3 r7, fs r8, gs r9, r62 r10, boolean r11) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
        this.d = r6;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r11;
        int r5 = 0;
        if (r7 != hb3.n) goto L5;
        boolean r12 = true;
    L6:
        this.i = r12;
        int r13 = r3.size();
        int r14 = 0;
    L7:
        if (r5 >= r13) goto L13;
        jg3 r15 = (jg3) r3.get(r5);
        if (this.i == true) goto L11;
        int r16 = r15.o;
    L12:
        r14 = Math.max(r14, r16);
        r5 = r5 + 1;
        goto L7
    L11:
        r16 = r15.n;
        goto L12
    L13:
        this.j = r14;
        this.k = new int[this.b.size() * 2];
        this.m = Integer.MIN_VALUE;
        return;
    L5:
        r12 = false;
        goto L6
    }

    public final void a(int r7) {
        this.l += r7;
        int[] r0 = this.k;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        boolean r3 = this.i;
        if (r3 == true) goto L7;
    L8:
        if (r3 == true) goto L12;
        if ((r2 % 2) != 0) goto L12;
    L11:
        r0[r2] = r0[r2] + r7;
    L12:
        r2 = r2 + 1;
        goto L3
    L7:
        if ((r2 % 2) == 1) goto L11;
    }

    public final void b(int r11, int r12, int r13) {
        this.l = r11;
        boolean r0 = this.i;
        if (r0 == false) goto L5;
        int r1 = r13;
    L6:
        this.m = r1;
        List r2 = this.b;
        int r3 = r2.size();
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L25;
        jg3 r5 = (jg3) r2.get(r4);
        int r6 = r4 * 2;
        int[] r7 = this.k;
        if (r0 == false) goto L16;
        fs r8 = this.e;
        if (r8 == null) goto L14;
        r7[r6] = r8.a(r5.n, r12, this.g);
        r7[r6 + 1] = r11;
        int r9 = r5.o;
    L13:
        r11 = r11 + r9;
        r4 = r4 + 1;
        goto L7
    L14:
        fz1.b("null horizontalAlignment");
        er1.a();
        return;
    L16:
        r7[r6] = r11;
        int r10 = r6 + 1;
        gs r14 = this.f;
        if (r14 == null) goto L20;
        r7[r10] = Math.round((1.0f + r14.a) * ((r13 - r5.o) / 2.0f));
        r9 = r5.n;
        goto L13
    L20:
        fz1.b("null verticalAlignment");
        er1.a();
        return;
    L25:
        return;
    L5:
        r1 = r12;
        goto L6
    }
}
