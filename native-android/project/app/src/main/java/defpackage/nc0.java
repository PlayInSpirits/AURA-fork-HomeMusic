package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc0 {
    public final long a;

    public /* synthetic */ nc0(long r1) {
        this.a = r1;
    }

    public static long a(int r1, int r2, long r3) {
        int r0 = h(r3);
        int r4 = g(r3);
        if (r0 < r1) goto L8;
        if (r4 < r2) goto L8;
        if (r1 < 0) goto L8;
        if (r2 < 0) goto L8;
    L10:
        return qc0.g(r1, r0, r2, r4);
    L8:
        ez1.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        goto L10
    }

    public static final boolean b(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean c(long r3) {
        int r0 = (int) (3 & r3);
        int r1 = (r0 & 1) << 1;
        int r2 = (((r0 & 2) >> 1) * 3) + r1;
        int r4 = (1 << (18 - r2)) - 1;
        if ((((int) (r3 >> (r2 + 46))) & r4) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean d(long r3) {
        int r0 = (int) (3 & r3);
        int r1 = (r0 & 1) << 1;
        int r4 = (int) (r3 >> 33);
        if ((r4 & ((1 << (((((r0 & 2) >> 1) * 3) + r1) + 13)) - 1)) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean e(long r5) {
        int r0 = (int) (3 & r5);
        int r1 = (r0 & 1) << 1;
        int r2 = (((r0 & 2) >> 1) * 3) + r1;
        int r3 = (1 << (18 - r2)) - 1;
        int r4 = ((int) (r5 >> (r2 + 15))) & r3;
        int r6 = ((int) (r5 >> (r2 + 46))) & r3;
        if (r6 != 0) goto L5;
        int r7 = Integer.MAX_VALUE;
    L6:
        if (r4 != r7) goto L8;
        return true;
    L8:
        return false;
    L5:
        r7 = r6 - 1;
        goto L6
    }

    public static final boolean f(long r5) {
        int r0 = (int) (3 & r5);
        int r1 = (r0 & 1) << 1;
        int r2 = (1 << (((((r0 & 2) >> 1) * 3) + r1) + 13)) - 1;
        int r3 = ((int) (r5 >> 2)) & r2;
        int r6 = ((int) (r5 >> 33)) & r2;
        if (r6 != 0) goto L5;
        int r7 = Integer.MAX_VALUE;
    L6:
        if (r3 != r7) goto L8;
        return true;
    L8:
        return false;
    L5:
        r7 = r6 - 1;
        goto L6
    }

    public static final int g(long r3) {
        int r0 = (int) (3 & r3);
        int r1 = (r0 & 1) << 1;
        int r2 = (((r0 & 2) >> 1) * 3) + r1;
        int r4 = (1 << (18 - r2)) - 1;
        int r5 = ((int) (r3 >> (r2 + 46))) & r4;
        if (r5 != 0) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return r5 - 1;
    }

    public static final int h(long r3) {
        int r0 = (int) (3 & r3);
        int r1 = (r0 & 1) << 1;
        int r4 = (int) (r3 >> 33);
        int r5 = r4 & ((1 << (((((r0 & 2) >> 1) * 3) + r1) + 13)) - 1);
        if (r5 != 0) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return r5 - 1;
    }

    public static final int i(long r3) {
        int r0 = (int) (3 & r3);
        int r1 = (r0 & 1) << 1;
        int r2 = (((r0 & 2) >> 1) * 3) + r1;
        int r4 = (1 << (18 - r2)) - 1;
        return ((int) (r3 >> (r2 + 15))) & r4;
    }

    public static final int j(long r4) {
        int r0 = (int) (3 & r4);
        int r1 = (r0 & 1) << 1;
        int r5 = (int) (r4 >> 2);
        return r5 & ((1 << (((((r0 & 2) >> 1) * 3) + r1) + 13)) - 1);
    }

    public static String k(long r4) {
        int r0 = h(r4);
        String r1 = "Infinity";
        if (r0 != Integer.MAX_VALUE) goto L5;
        String r2 = "Infinity";
    L6:
        int r3 = g(r4);
        if (r3 == Integer.MAX_VALUE) goto L11;
        r1 = String.valueOf(r3);
    L11:
        return "Constraints(minWidth = " + j(r4) + ", maxWidth = " + r2 + ", minHeight = " + i(r4) + ", maxHeight = " + r1 + ")";
    L5:
        r2 = String.valueOf(r0);
        goto L6
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof nc0) == false) goto L11;
        long r0 = ((nc0) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return k(this.a);
    }
}
