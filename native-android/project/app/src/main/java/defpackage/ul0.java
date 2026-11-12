package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 {
    public final long a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public long n;

    public ul0(long r1, long r3) {
        this.a = r1;
        this.b = r3;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.j = 0.97f;
        this.i = 1.03f;
        this.k = 1.0f;
        this.l = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public final void a() {
        long r0 = this.c;
        if (r0 == (-9223372036854775807L)) goto L18;
        long r4 = this.d;
        if (r4 != (-9223372036854775807L)) goto L20;
        long r5 = this.f;
        if (r5 != (-9223372036854775807L)) goto L10;
    L12:
        r4 = this.g;
        if (r4 != (-9223372036854775807L)) goto L15;
    L17:
        r4 = r0;
        goto L20
    L15:
        if (r0 <= r4) goto L17;
    L10:
        if (r0 >= r5) goto L12;
        r0 = r5;
    L20:
        if (this.e != r4) goto L22;
        return;
    L22:
        this.e = r4;
        this.h = r4;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
        return;
    L18:
        r4 = -9223372036854775807L;
        goto L20
    }
}
