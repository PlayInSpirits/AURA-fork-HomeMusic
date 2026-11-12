package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed3 {
    public static final dd3 a = null;
    public static final qc3 b = null;

    static {
        dd3 r10 = new dd3(0);
        a = r10;
        int r5 = 0;
        int r6 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        b = new qc3(r1, r2, r3, r4, r5, r6, rv2.C, new cd3(), te5.a(q01.n), r10, qc0.b(0, 0, 15));
    }

    public static final long a(qc3 r6, int r7) {
        int r0 = r6.c;
        long r2 = (((((long) r7) * ((long) (r6.b + r0))) + ((long) (-r6.f))) + ((long) r6.d)) - ((long) r0);
        if (r6.e != hb3.o) goto L6;
        long r1 = r6.i() >> 32;
    L5:
        int r8 = (int) r1;
        r6.n.getClass();
        long r3 = r2 - ((long) (r8 - gb.m(0, 0, r8)));
        if (r3 >= 0) goto L10;
        return 0;
    L10:
        return r3;
    L6:
        r1 = r6.i() & 4294967295L;
        goto L5
    }
}
