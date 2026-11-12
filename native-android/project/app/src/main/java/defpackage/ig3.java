package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig3 implements oo0 {
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ig3 r1, jg3 r2) {
        r1.getClass();
        if ((r2 instanceof yx2) == false) goto L6;
        ((yx2) r2).x(r1.n);
        return;
    }

    public static void f(ig3 r4, jg3 r5, int r6, int r7) {
        r4.getClass();
        long r0 = ((long) r6) << 32;
        a(r4, r5);
        r5.N(g02.c((((long) r7) & 4294967295L) | r0, r5.r), 0.0f, null);
    }

    public static void j(ig3 r2, jg3 r3, long r4) {
        r2.getClass();
        a(r2, r3);
        r3.N(g02.c(r4, r3.r), 0.0f, null);
    }

    public static void k(ig3 r6, jg3 r7) {
        if (r6.c() != r62.n) goto L5;
    L9:
        a(r6, r7);
        r7.N(g02.c(0, r7.r), 0.0f, null);
        return;
    L5:
        if (r6.e() == 0) goto L9;
        long r0 = ((long) (r6.e() - r7.n)) << 32;
        a(r6, r7);
        r7.N(g02.c(r0, r7.r), 0.0f, null);
    }

    public static void n(ig3 r6, jg3 r7) {
        k52 r0 = kg3.a;
        if (r6.c() != r62.n) goto L5;
    L9:
        a(r6, r7);
        r7.N(g02.c(0, r7.r), 0.0f, r0);
        return;
    L5:
        if (r6.e() == 0) goto L9;
        long r1 = ((long) (r6.e() - r7.n)) << 32;
        a(r6, r7);
        r7.N(g02.c(r1, r7.r), 0.0f, r0);
    }

    public static void q(ig3 r4, jg3 r5, if1 r6) {
        r4.getClass();
        a(r4, r5);
        r5.N(g02.c(0, r5.r), 0.0f, r6);
    }

    public float b(rp1 r1) {
        return Float.NaN;
    }

    public abstract r62 c();

    public abstract int e();
}
