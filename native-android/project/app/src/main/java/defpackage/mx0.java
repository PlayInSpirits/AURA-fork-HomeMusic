package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx0 implements Comparable {
    public static final om0 n = null;
    public static final long o = 0;
    public static final long p = 0;

    static {
        n = new om0(13);
        o = e35.u(4611686018427387903L);
        p = e35.u(-4611686018427387903L);
    }

    public static final long a(long r6, long r8) {
        long r2 = r8 / 1000000;
        long r7 = e35.i(r6, r2);
        if ((-4611686018426L) > r7) goto L9;
        if (r7 >= 4611686018427L) goto L9;
        long r9 = r7 * 1000000;
        long r10 = (r9 + (r8 - (r2 * 1000000))) << 1;
        int r11 = nx0.a;
        return r10;
    L9:
        return e35.u(r7);
    }

    public static final long b(long r10, long r12) {
        int r0 = ((int) r10) & 1;
        if (r0 == (((int) r12) & 1)) goto L5;
        if (r0 != 1) goto L37;
        return a(r10 >> 1, r12 >> 1);
    L37:
        return a(r12 >> 1, r10 >> 1);
    L5:
        if (r0 != 0) goto L14;
        long r11 = (r10 >> 1) + (r12 >> 1);
        if ((-4611686018426999999L) > r11) goto L13;
        if (r11 >= 4611686018427000000L) goto L13;
        long r13 = r11 << 1;
        int r14 = nx0.a;
        return r13;
    L13:
        return e35.u(r11 / 1000000);
    L14:
        long r4 = e35.i(r10 >> 1, r12 >> 1);
        if (r4 != 9223372036854759646L) goto L17;
        kf2.n("Summing infinite durations of different signs yields an undefined result.");
        return 0;
    L17:
        if (r4 == 4611686018427387903L) goto L30;
        if (r4 == (-4611686018427387903L)) goto L30;
        if ((-4611686018426L) > r4) goto L28;
        if (r4 >= 4611686018427L) goto L28;
        long r15 = (r4 * 1000000) << 1;
        int r16 = nx0.a;
        return r15;
    L28:
        return e35.u(gb.n(r4, -4611686018427387903L, 4611686018427387903L));
    L30:
        return e35.u(r4);
    }

    public static final long c(long r3, ox0 r5) {
        if (r3 != o) goto L7;
        return Long.MAX_VALUE;
    L7:
        if (r3 != p) goto L10;
        return Long.MIN_VALUE;
    L10:
        long r1 = r3 >> 1;
        if ((((int) r3) & 1) != 0) goto L13;
        ox0 r4 = ox0.o;
    L15:
        return r5.n.convert(r1, r4.n);
    L13:
        r4 = ox0.p;
        goto L15
    }
}
