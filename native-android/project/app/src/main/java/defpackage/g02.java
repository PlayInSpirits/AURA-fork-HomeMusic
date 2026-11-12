package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g02 {
    public final long a;

    public /* synthetic */ g02(long r1) {
        this.a = r1;
    }

    public static final boolean a(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final long b(long r4, long r6) {
        int r1 = ((int) (r4 >> 32)) - ((int) (r6 >> 32));
        int r5 = ((int) (r4 & 4294967295L)) - ((int) (r6 & 4294967295L));
        return (((long) r1) << 32) | (((long) r5) & 4294967295L);
    }

    public static final long c(long r4, long r6) {
        int r1 = ((int) (r4 >> 32)) + ((int) (r6 >> 32));
        int r5 = ((int) (r4 & 4294967295L)) + ((int) (r6 & 4294967295L));
        return (((long) r1) << 32) | (((long) r5) & 4294967295L);
    }

    public static String d(long r3) {
        return b11.n("(", ", ", (int) (r3 >> 32), (int) (r3 & 4294967295L), ")");
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof g02) == false) goto L11;
        long r0 = ((g02) r3).a;
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
        return d(this.a);
    }
}
