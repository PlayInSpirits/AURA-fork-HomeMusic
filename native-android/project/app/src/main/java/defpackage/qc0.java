package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc0 {
    public static final long a(int r4, int r5, int r6, int r7) {
        boolean r0 = false;
        if (r5 < r4) goto L5;
        boolean r2 = true;
    L6:
        if (r7 < r6) goto L8;
        boolean r3 = true;
    L9:
        boolean r8 = r2 & r3;
        if (r4 < 0) goto L12;
        boolean r9 = true;
    L13:
        boolean r10 = r8 & r9;
        if (r6 < 0) goto L17;
        r0 = true;
    L17:
        if ((r0 & r10) == true) goto L20;
        ez1.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
    L20:
        return g(r4, r5, r6, r7);
    L12:
        r9 = false;
        goto L13
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    public static /* synthetic */ long b(int r2, int r3, int r4) {
        if ((r4 & 2) == 0) goto L6;
        r2 = Integer.MAX_VALUE;
    L6:
        if ((r4 & 8) == 0) goto L9;
        r3 = Integer.MAX_VALUE;
    L9:
        return a(0, r2, 0, r3);
    }

    public static final int c(int r1) {
        if (r1 >= 8191) goto L7;
        return 13;
    L7:
        if (r1 >= 32767) goto L11;
        return 15;
    L11:
        if (r1 >= 65535) goto L15;
        return 16;
    L15:
        if (r1 >= 262143) goto L18;
        return 18;
    L18:
        return 255;
    }

    public static final long d(long r5, long r7) {
        int r1 = (int) (r7 >> 32);
        int r2 = nc0.j(r5);
        int r3 = nc0.h(r5);
        if (r1 >= r2) goto L5;
        r1 = r2;
    L5:
        if (r1 > r3) goto L8;
        r3 = r1;
    L8:
        int r8 = (int) (r7 & 4294967295L);
        int r9 = nc0.i(r5);
        int r6 = nc0.g(r5);
        if (r8 >= r9) goto L11;
        r8 = r9;
    L11:
        if (r8 > r6) goto L15;
        r6 = r8;
    L15:
        return (((long) r3) << 32) | (((long) r6) & 4294967295L);
    }

    public static final int e(int r1, long r2) {
        int r0 = nc0.i(r2);
        int r3 = nc0.g(r2);
        if (r1 >= r0) goto L5;
        r1 = r0;
    L5:
        if (r1 <= r3) goto L7;
        return r3;
    L7:
        return r1;
    }

    public static final int f(int r1, long r2) {
        int r0 = nc0.j(r2);
        int r3 = nc0.h(r2);
        if (r1 >= r0) goto L5;
        r1 = r0;
    L5:
        if (r1 <= r3) goto L7;
        return r3;
    L7:
        return r1;
    }

    public static final long g(int r6, int r7, int r8, int r9) {
        if (r9 != Integer.MAX_VALUE) goto L5;
        int r1 = r8;
    L6:
        int r2 = c(r1);
        if (r7 != Integer.MAX_VALUE) goto L9;
        int r0 = r6;
    L10:
        int r3 = c(r0);
        if ((r2 + r3) <= 31) goto L13;
        h(r0, r1);
    L13:
        int r10 = r7 + 1;
        int r11 = r10 & (~(r10 >> 31));
        int r12 = r9 + 1;
        int r4 = r3 - 13;
        int r5 = (r4 >> 1) + (r4 & 1);
        long r13 = ((long) r5) | (((long) r6) << 2);
        return (((((long) r11) << 33) | r13) | (((long) r8) << (r3 + 2))) | ((r12 & (~(r12 >> 31))) << (r3 + 33));
    L9:
        r0 = r7;
        goto L10
    L5:
        r1 = r9;
        goto L6
    }

    public static final void h(int r4, int r5) {
        throw new IllegalArgumentException(b11.n("Can't represent a width of ", " and height of ", r4, r5, " in Constraints"));
    }

    public static final Void i(int r3) {
        throw new IllegalArgumentException(b11.j(r3, "Can't represent a size of ", " in Constraints"));
    }
}
