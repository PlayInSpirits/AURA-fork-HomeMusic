package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 {
    public static int k;
    public static final tv1 l = null;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final b45 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    static {
        l = new tv1();
    }

    public fw1(String r4, float r5, float r6, float r7, float r8, b45 r9, long r10, int r12, boolean r13) {
        tv1 r0 = l;
        monitor-enter(r0);
        int r1 = k;     // Catch: Throwable -> L8
        k = r1 + 1;     // Catch: Throwable -> L8
        monitor-exit(r0);
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r12;
        this.i = r13;
        this.j = r1;
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof fw1) == false) goto L38;
        fw1 r6 = (fw1) r5;
        String r0 = r6.a;
        if (h12.c(this.a, r0) == true) goto L11;
        return false;
    L11:
        if (ku0.b(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        if (ku0.b(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        if (this.d == r6.d) goto L19;
        return false;
    L19:
        if (this.e == r6.e) goto L21;
        return false;
    L21:
        if (this.f.equals(r6.f) == true) goto L24;
        return false;
    L24:
        if (x40.c(this.g, r6.g) == true) goto L27;
        return false;
    L27:
        if (this.h == r6.h) goto L29;
        return false;
    L29:
        if (this.i != r6.i) goto L44;
        return true;
    L44:
        return false;
    L38:
        return false;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(b11.d(b11.d(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
        int r2 = (this.f.hashCode() + r0) * 31;
        int r1 = x40.h;
        int r3 = xa3.b(r2, 31, this.g);
        int r4 = f34.d(this.h, r3, 31);
        return Boolean.hashCode(this.i) + r4;
    }
}
