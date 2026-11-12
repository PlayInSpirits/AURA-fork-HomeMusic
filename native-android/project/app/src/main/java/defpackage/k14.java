package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k14 implements Closeable {
    public final gf1 A;
    public ix B;
    public final boolean C;
    public final oz3 n;
    public final pr3 o;
    public final String p;
    public final int q;
    public final jl1 r;
    public final tl1 s;
    public final n14 t;
    public final k14 u;
    public final k14 v;
    public final k14 w;
    public final long x;
    public final long y;
    public final y10 z;

    public k14(oz3 r1, pr3 r2, String r3, int r4, jl1 r5, tl1 r6, n14 r7, k14 r8, k14 r9, k14 r10, long r11, long r13, y10 r15, gf1 r16) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r7.getClass();
        r16.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        this.w = r10;
        this.x = r11;
        this.y = r13;
        this.z = r15;
        this.A = r16;
        boolean r12 = false;
        if (200 <= r4) goto L5;
    L7:
        this.C = r12;
        return;
    L5:
        if (r4 >= 300) goto L7;
        r12 = true;
        goto L7
    }

    public final ix b() {
        ix r0 = this.B;
        if (r0 != null) goto L6;
        int r1 = ix.n;
        ix r2 = au0.O(this.s);
        this.B = r2;
        return r2;
    L6:
        return r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.close();
    }

    public final j14 f() {
        j14 r0 = new j14();
        r0.c = -1;
        r0.g = xe5.e;
        r0.n = gq1.q;
        r0.a = this.n;
        r0.b = this.o;
        r0.c = this.q;
        r0.d = this.p;
        r0.e = this.r;
        r0.f = this.s.d();
        r0.g = this.t;
        r0.h = this.u;
        r0.i = this.v;
        r0.j = this.w;
        r0.k = this.x;
        r0.l = this.y;
        r0.m = this.z;
        r0.n = this.A;
        return r0;
    }

    public final String toString() {
        return "Response{protocol=" + this.o + ", code=" + this.q + ", message=" + this.p + ", url=" + this.n.a + '}';
    }
}
