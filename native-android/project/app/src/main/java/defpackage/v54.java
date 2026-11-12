package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v54 {
    public static final long[] a = null;

    static {
        a = new long[]{-9187201950435737345L, -1};
        new w03(0);
    }

    public static final int a(int r1) {
        if (r1 != 7) goto L7;
        return 6;
    L7:
        return r1 - (r1 / 8);
    }

    public static final int b(int r0) {
        if (r0 != 0) goto L6;
        return 6;
    L6:
        return (r0 * 2) + 1;
    }

    public static final int c(int r1) {
        if (r1 > 0) goto L4;
        return 0;
    L4:
        return (-1) >>> Integer.numberOfLeadingZeros(r1);
    }

    public static final int d(int r2) {
        if (r2 != 7) goto L7;
        return 8;
    L7:
        return ((r2 - 1) / 7) + r2;
    }
}
