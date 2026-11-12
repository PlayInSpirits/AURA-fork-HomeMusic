package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public ms(long r1, long r3, long r5, long r7, long r9, long r11) {
        this.a = r1;
        this.b = r3;
        this.d = 0;
        this.e = r5;
        this.f = r7;
        this.g = r9;
        this.c = r11;
        this.h = a(r3, 0, r5, r7, r9, r11);
    }

    public static long a(long r4, long r6, long r8, long r10, long r12, long r14) {
        if ((r10 + 1) < r12) goto L5;
    L9:
        return r10;
    L5:
        if ((r6 + 1) >= r8) goto L9;
        long r5 = (long) ((r4 - r6) * ((r12 - r10) / (r8 - r6)));
        return f35.k(((r5 + r10) - r14) - (r5 / 20), r10, r12 - 1);
    }
}
