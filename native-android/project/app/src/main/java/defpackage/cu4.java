package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cu4 {
    public static final yt4 a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;

    static {
        a = new yt4();
        String r0 = f35.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean r1) {
        if (p() == false) goto L6;
        return -1;
    L6:
        return 0;
    }

    public abstract int b(Object r1);

    public int c(boolean r1) {
        if (p() == false) goto L7;
        return -1;
    L7:
        return o() - 1;
    }

    public final int d(int r4, zt4 r5, bu4 r6, int r7, boolean r8) {
        int r9 = f(r4, r5, false).c;
        if (m(r9, r6, 0).n != r4) goto L10;
        int r10 = e(r9, r7, r8);
        if (r10 != (-1)) goto L8;
        return -1;
    L8:
        return m(r10, r6, 0).m;
    L10:
        return r4 + 1;
    }

    public int e(int r3, int r4, boolean r5) {
        if (r4 == 0) goto L17;
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r4 == 2) goto L8;
        tb4.a();
        return 0;
    L8:
        if (r3 != c(r5)) goto L12;
        return a(r5);
    L12:
        return r3 + 1;
    L17:
        if (r3 != c(r5)) goto L21;
        return -1;
    L21:
        return r3 + 1;
    }

    public boolean equals(Object r11) {
        if (this != r11) goto L6;
    L38:
        return true;
    L6:
        if ((r11 instanceof cu4) == false) goto L39;
        cu4 r12 = (cu4) r11;
        if (r12.o() != o()) goto L39;
        if (r12.h() != h()) goto L39;
        bu4 r1 = new bu4();
        zt4 r3 = new zt4();
        bu4 r4 = new bu4();
        zt4 r5 = new zt4();
        int r6 = 0;
    L15:
        if (r6 >= o()) goto L20;
        if (m(r6, r1, 0).equals(r12.m(r6, r4, 0)) == false) goto L39;
        r6 = r6 + 1;
        goto L15
    L20:
        int r2 = 0;
    L22:
        if (r2 >= h()) goto L27;
        if (f(r2, r3, true).equals(r12.f(r2, r5, true)) == false) goto L39;
        r2 = r2 + 1;
        goto L22
    L27:
        int r7 = a(true);
        if (r7 != r12.a(true)) goto L39;
        int r8 = c(true);
        if (r8 != r12.c(true)) goto L39;
    L33:
        if (r7 == r8) goto L38;
        int r9 = e(r7, 0, true);
        if (r9 != r12.e(r7, 0, true)) goto L39;
        r7 = r9;
    L39:
        return false;
    }

    public abstract zt4 f(int r1, zt4 r2, boolean r3);

    public zt4 g(Object r2, zt4 r3) {
        return f(b(r2), r3, true);
    }

    public abstract int h();

    public int hashCode() {
        bu4 r0 = new bu4();
        zt4 r1 = new zt4();
        int r2 = o() + 217;
        int r4 = 0;
    L4:
        if (r4 >= o()) goto L6;
        r2 = (r2 * 31) + m(r4, r0, 0).hashCode();
        r4 = r4 + 1;
        goto L4
    L6:
        int r3 = h() + (r2 * 31);
        int r5 = 0;
    L8:
        if (r5 >= h()) goto L10;
        r3 = (r3 * 31) + f(r5, r1, true).hashCode();
        r5 = r5 + 1;
        goto L8
    L10:
        int r6 = a(true);
    L12:
        if (r6 == (-1)) goto L14;
        r3 = (r3 * 31) + r6;
        r6 = e(r6, 0, true);
        goto L12
    L14:
        return r3;
    }

    public final Pair i(bu4 r9, zt4 r10, int r11, long r12) {
        Pair r8 = j(r9, r10, r11, r12, 0);
        r8.getClass();
        return r8;
    }

    public final Pair j(bu4 r5, zt4 r6, int r7, long r8, long r10) {
        rr2.q(r7, o());
        m(r7, r5, r10);
        if (r8 != (-9223372036854775807L)) goto L8;
        r8 = r5.k;
        if (r8 != (-9223372036854775807L)) goto L8;
        return null;
    L8:
        int r9 = r5.m;
        f(r9, r6, false);
    L10:
        if (r9 >= r5.n) goto L16;
        if (r6.e == r8) goto L16;
        int r1 = r9 + 1;
        if (f(r1, r6, false).e > r8) goto L16;
        r9 = r1;
    L16:
        f(r9, r6, true);
        long r11 = r8 - r6.e;
        long r4 = r6.d;
        if (r4 == (-9223372036854775807L)) goto L19;
        r11 = Math.min(r11, r4 - 1);
    L19:
        long r12 = Math.max(0, r11);
        Object r13 = r6.b;
        r13.getClass();
        return Pair.create(r13, Long.valueOf(r12));
    }

    public int k(int r3, int r4, boolean r5) {
        if (r4 == 0) goto L17;
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r4 == 2) goto L8;
        tb4.a();
        return 0;
    L8:
        if (r3 != a(r5)) goto L12;
        return c(r5);
    L12:
        return r3 - 1;
    L17:
        if (r3 != a(r5)) goto L21;
        return -1;
    L21:
        return r3 - 1;
    }

    public abstract Object l(int r1);

    public abstract bu4 m(int r1, bu4 r2, long r3);

    public final void n(int r3, bu4 r4) {
        m(r3, r4, 0);
    }

    public abstract int o();

    public final boolean p() {
        if (o() != 0) goto L6;
        return true;
    L6:
        return false;
    }
}
