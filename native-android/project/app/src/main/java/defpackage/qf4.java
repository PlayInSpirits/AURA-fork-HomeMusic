package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf4 {
    public final long a;

    public /* synthetic */ qf4(long r1) {
        this.a = r1;
    }

    public static final boolean a(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean b(long r7) {
        boolean r1 = false;
        if (r7 != 9205357640488583168L) goto L5;
        boolean r0 = true;
    L7:
        if (Float.intBitsToFloat((int) (r7 >> 32)) > 0.0f) goto L9;
        boolean r3 = true;
    L10:
        boolean r2 = r0 | r3;
        if (Float.intBitsToFloat((int) (r7 & 4294967295L)) > 0.0f) goto L14;
        r1 = true;
    L14:
        return r2 | r1;
    L9:
        r3 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public static String c(long r3) {
        if (r3 != 9205357640488583168L) goto L5;
        return "Size.Unspecified";
    L5:
        return f34.h("Size(", gh0.F(Float.intBitsToFloat((int) (r3 >> 32))), ", ", gh0.F(Float.intBitsToFloat((int) (r3 & 4294967295L))), ")");
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof qf4) == false) goto L11;
        long r0 = ((qf4) r3).a;
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
        return c(this.a);
    }
}
