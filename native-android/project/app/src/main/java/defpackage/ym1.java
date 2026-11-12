package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ym1 extends dn1 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final ow0 q;
    public final yw1 r;
    public final yw1 s;
    public final bx1 t;
    public final long u;
    public final xm1 v;
    public final yw1 w;

    public ym1(int r5, String r6, List r7, long r8, boolean r10, long r11, boolean r13, int r14, long r15, int r17, long r18, long r20, boolean r22, boolean r23, boolean r24, ow0 r25, List r26, List r27, xm1 r28, Map r29, List r30) {
        super(r6, r7, r22);
        this.d = r5;
        this.h = r11;
        this.g = r10;
        this.i = r13;
        this.j = r14;
        this.k = r15;
        this.l = r17;
        this.m = r18;
        this.n = r20;
        this.o = r23;
        this.p = r24;
        this.q = r25;
        this.r = yw1.k(r26);
        this.s = yw1.k(r27);
        this.t = bx1.b(r29);
        this.w = yw1.k(r30);
        if (r27.isEmpty() == true) goto L6;
        tm1 r9 = (tm1) te5.w(r27);
        this.u = r9.r + r9.p;
    L9:
        long r0 = -9223372036854775807L;
        if (r8 == (-9223372036854775807L)) goto L16;
        long r1 = this.u;
        if (r8 < 0) goto L15;
        r0 = Math.min(r1, r8);
        goto L16
    L15:
        r0 = Math.max(0, r1 + r8);
    L16:
        this.e = r0;
        if (r8 < 0) goto L19;
        boolean r12 = true;
    L20:
        this.f = r12;
        this.v = r28;
        return;
    L19:
        r12 = false;
        goto L20
    L6:
        if (r26.isEmpty() == true) goto L8;
        vm1 r16 = (vm1) te5.w(r26);
        this.u = r16.r + r16.p;
        goto L9
    L8:
        this.u = 0;
        goto L9
    }

    @Override // defpackage.dn1
    public final Object a(List r1) {
        return this;
    }
}
