package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv4 {
    public final pv4 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public xv4(pv4 r5, long[] r6, int[] r7, int r8, long[] r9, int[] r10, int[] r11, boolean r12, long r13, int r15) {
        boolean r2 = false;
        if (r7.length != r9.length) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        if (r6.length != r9.length) goto L9;
        boolean r1 = true;
    L10:
        rr2.l(r1);
        if (r10.length != r9.length) goto L13;
        r2 = true;
    L13:
        rr2.l(r2);
        this.a = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r11;
        this.j = r12;
        this.i = r13;
        this.b = r15;
        if (r10.length <= 0) goto L17;
        int r4 = r10.length - 1;
        r10[r4] = r10[r4] | 536870912;
        return;
    L17:
        return;
    L9:
        r1 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public final int a(long r9) {
        boolean r0 = this.j;
        int r1 = 0;
        long[] r2 = this.f;
        if (r0 == true) goto L5;
        int[] r8 = this.h;
        int r3 = r8.length - 1;
        int r4 = -1;
    L7:
        if (r1 > r3) goto L12;
        int r5 = ((r3 - r1) / 2) + r1;
        if (r2[r8[r5]] <= r9) goto L10;
        r3 = r5 - 1;
        goto L7
    L10:
        r1 = r5 + 1;
        r4 = r5;
        goto L7
    L12:
        if (r4 != (-1)) goto L14;
        return -1;
    L14:
        long r6 = r2[r8[r4]];
        if (r6 != r9) goto L21;
    L16:
        if (r4 <= 0) goto L21;
        if (r2[r8[r4 - 1]] != r6) goto L21;
        r4 = r4 - 1;
    L21:
        return r8[r4];
    L5:
        return f35.f(r2, r9, false);
    }

    public final int b(long r10) {
        boolean r0 = this.j;
        long[] r1 = this.f;
        if (r0 == true) goto L5;
        int[] r9 = this.h;
        int r2 = r9.length - 1;
        int r3 = 0;
        int r5 = -1;
    L7:
        if (r3 > r2) goto L12;
        int r6 = ((r2 - r3) / 2) + r3;
        if (r1[r9[r6]] >= r10) goto L10;
        r3 = r6 + 1;
        goto L7
    L10:
        r2 = r6 - 1;
        r5 = r6;
        goto L7
    L12:
        if (r5 != (-1)) goto L14;
        return -1;
    L14:
        long r4 = r1[r9[r5]];
        if (r4 != r10) goto L22;
    L17:
        if (r5 >= (r9.length - 1)) goto L22;
        int r11 = r5 + 1;
        if (r1[r9[r11]] != r4) goto L22;
        r5 = r11;
    L22:
        return r9[r5];
    L5:
        return f35.b(r1, r10, true);
    }
}
