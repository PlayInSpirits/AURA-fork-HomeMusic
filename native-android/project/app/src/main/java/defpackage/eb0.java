package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 implements q84, m84 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public eb0(long r5, long r7, int r9, int r10, boolean r11, boolean r12) {
        this.a = r5;
        this.b = r7;
        if (r10 != (-1)) goto L5;
        int r0 = 1;
    L6:
        this.c = r0;
        this.e = r9;
        this.g = r11;
        this.h = r12;
        if (r5 != (-1)) goto L9;
        this.d = -1;
        this.f = -9223372036854775807L;
    L10:
        this.i = r7;
        this.j = r9;
        this.k = r10;
        this.l = r11;
        if (r5 != (-1)) goto L14;
        r5 = -1;
    L14:
        this.m = r5;
        return;
    L9:
        long r1 = r5 - r7;
        this.d = r1;
        this.f = (Math.max(0, r1) * 8000000) / ((long) r9);
        goto L10
    L5:
        r0 = r10;
        goto L6
    }

    @Override // defpackage.q84
    public final long a() {
        return this.m;
    }

    @Override // defpackage.m84
    public final boolean b() {
        if (this.d == (-1)) goto L5;
        return true;
    L5:
        if (this.g == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.q84
    public final long c(long r5) {
        return (Math.max(0, r5 - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.m84
    public final boolean d() {
        return this.h;
    }

    @Override // defpackage.m84
    public final l84 e(long r18) {
        long r3 = this.d;
        long r5 = this.b;
        if (r3 == (-1)) goto L5;
    L8:
        int r2 = this.e;
        long r13 = this.c;
        long r9 = (((((long) r2) * r18) / 8000000) / r13) * r13;
        if (r3 == (-1)) goto L11;
        r9 = Math.min(r9, r3 - r13);
    L11:
        long r4 = Math.max(r9, 0) + r5;
        long r10 = (Math.max(0, r4 - r5) * 8000000) / ((long) r2);
        o84 r11 = new o84(r10, r4);
        if (r3 == (-1)) goto L21;
        if (r10 >= r18) goto L21;
        long r6 = r4 + r13;
        if (r6 >= this.a) goto L21;
        return new l84(r11, new o84((Math.max(0, r6 - r5) * 8000000) / ((long) r2), r6));
    L21:
        return new l84(r11, r11);
    L5:
        if (this.g == true) goto L8;
        o84 r1 = new o84(0, r5);
        return new l84(r1, r1);
    }

    @Override // defpackage.q84
    public final int f() {
        return this.j;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.f;
    }
}
