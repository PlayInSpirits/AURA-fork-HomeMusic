package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q73 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int[] d;
    public transient long[] e;
    public transient float f;
    public transient int g;

    public final void a(int r2) {
        if (r2 <= this.e.length) goto L6;
        f(r2);
    L6:
        if (r2 < this.g) goto L9;
        g(Math.max(2, Integer.highestOneBit(r2 - 1) << 1));
        return;
    }

    public final int b(Object r2) {
        int r3 = c(r2);
        if (r3 != (-1)) goto L7;
        return 0;
    L7:
        return this.b[r3];
    }

    public final int c(Object r8) {
        int r0 = g12.U(r8);
        int[] r1 = this.d;
        int r2 = r1[(r1.length - 1) & r0];
    L4:
        if (r2 == (-1)) goto L11;
        long r3 = this.e[r2];
        if (((int) (r3 >>> 32)) != r0) goto L10;
        if (si0.s(r8, this.a[r2]) == false) goto L10;
        return r2;
    L10:
        r2 = (int) r3;
        goto L4
    L11:
        return -1;
    }

    public final void d(int r8) {
        if (r8 < 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.k("Initial capacity must be non-negative", r1);
        int r2 = Math.max(r8, 2);
        int r3 = Integer.highestOneBit(r2);
        if (r2 <= ((int) (1.0d * ((double) r3)))) goto L12;
        r3 = r3 << 1;
        if (r3 > 0) goto L12;
        r3 = 1073741824;
    L12:
        int[] r4 = new int[r3];
        Arrays.fill(r4, -1);
        this.d = r4;
        this.f = 1.0f;
        this.a = new Object[r8];
        this.b = new int[r8];
        long[] r9 = new long[r8];
        Arrays.fill(r9, -1);
        this.e = r9;
        this.g = Math.max(1, (int) (r3 * 1.0f));
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void e(int r19, Object r20) {
        if (r19 <= 0) goto L33;
        long[] r3 = this.e;
        Object[] r4 = this.a;
        int[] r5 = this.b;
        int r6 = g12.U(r20);
        int[] r7 = this.d;
        int r8 = (r7.length - 1) & r6;
        int r10 = this.c;
        int r11 = r7[r8];
        if (r11 != (-1)) goto L7;
        r7[r8] = r10;
        long r16 = 4294967295L;
    L16:
        int r9 = Integer.MAX_VALUE;
        if (r10 == Integer.MAX_VALUE) goto L30;
        int r12 = r10 + 1;
        int r13 = this.e.length;
        if (r12 <= r13) goto L26;
        int r14 = Math.max(1, r13 >>> 1) + r13;
        if (r14 < 0) goto L24;
        r9 = r14;
    L24:
        if (r9 == r13) goto L26;
        f(r9);
    L26:
        this.e[r10] = (((long) r6) << 32) | r16;
        this.a[r10] = r20;
        this.b[r10] = r19;
        this.c = r12;
        if (r10 < this.g) goto L37;
        g(this.d.length * 2);
        return;
    L37:
        return;
    L30:
        kf2.o("Cannot contain more than Integer.MAX_VALUE elements!");
        return;
    L7:
        long r15 = r3[r11];
        r16 = 4294967295L;
        if (((int) (r15 >>> 32)) == r6) goto L10;
    L13:
        int r17 = (int) r15;
        if (r17 == (-1)) goto L15;
        r11 = r17;
        goto L7
    L15:
        r3[r11] = ((-4294967296L) & r15) | (((long) r10) & 4294967295L);
        goto L16
    L10:
        if (si0.s(r20, r4[r11]) == false) goto L13;
        int r0 = r5[r11];
        r5[r11] = r19;
        return;
    L33:
        kf2.n(f34.f(r19, "count must be positive but was: "));
    }

    public final void f(int r5) {
        this.a = Arrays.copyOf(this.a, r5);
        this.b = Arrays.copyOf(this.b, r5);
        long[] r0 = this.e;
        int r1 = r0.length;
        long[] r2 = Arrays.copyOf(r0, r5);
        if (r5 <= r1) goto L5;
        Arrays.fill(r2, r1, r5, -1);
    L5:
        this.e = r2;
    }

    public final void g(int r11) {
        if (this.d.length < 1073741824) goto L6;
        this.g = Integer.MAX_VALUE;
        return;
    L6:
        int r0 = ((int) (r11 * this.f)) + 1;
        int[] r1 = new int[r11];
        Arrays.fill(r1, -1);
        long[] r2 = this.e;
        int r12 = r11 - 1;
        int r3 = 0;
    L8:
        if (r3 >= this.c) goto L10;
        int r4 = (int) (r2[r3] >>> 32);
        int r5 = r4 & r12;
        int r7 = r1[r5];
        r1[r5] = r3;
        r2[r3] = (((long) r4) << 32) | (((long) r7) & 4294967295L);
        r3 = r3 + 1;
        goto L8
    L10:
        this.g = r0;
        this.d = r1;
    }
}
