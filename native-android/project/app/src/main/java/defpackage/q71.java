package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q71 implements ps {
    public final v71 n;
    public final int o;
    public final t71 p;

    public q71(v71 r1, int r2) {
        this.n = r1;
        this.o = r2;
        this.p = new t71();
    }

    public final long a(l51 r14) {
    L2:
        long r0 = r14.f();
        long r2 = r14.getLength() - 6;
        t71 r1 = this.p;
        v71 r3 = this.n;
        if (r0 >= r2) goto L18;
        long r6 = r14.f();
        be3 r4 = new be3(17);
        int r8 = 0;
        boolean r9 = false;
        r14.n(r4.a, 0, 2);
        char r5 = r4.g(0, ByteOrder.BIG_ENDIAN);
        int r10 = this.o;
        if (r5 == r10) goto L7;
        r14.k();
        r14.g((int) (r6 - r14.getPosition()));
    L15:
        if (r9 == true) goto L18;
        r14.g(1);
        goto L2
    L7:
        byte[] r7 = r4.a;
    L9:
        if (r8 >= 15) goto L14;
        int r11 = r14.i(r7, 2 + r8, 15 - r8);
        if (r11 == (-1)) goto L14;
        r8 = r8 + r11;
    L14:
        r4.M(r8 + 2);
        r14.k();
        r14.g((int) (r6 - r14.getPosition()));
        r9 = rr2.h(r4, r3, r10, r1);
    L18:
        if (r14.f() < (r14.getLength() - 6)) goto L22;
        r14.g((int) (r14.getLength() - r14.f()));
        return r3.j;
    L22:
        return r1.a;
    }

    @Override // defpackage.ps
    public final os c(l51 r19, long r20) {
        long r4 = r19.getPosition();
        long r2 = a(r19);
        long r10 = r19.f();
        r19.g(Math.max(6, this.n.c));
        long r14 = a(r19);
        long r16 = r19.f();
        if (r2 > r20) goto L9;
        if (r14 <= r20) goto L9;
        return new os(0, -9223372036854775807L, r10);
    L9:
        if (r14 > r20) goto L13;
        return new os(-2, r14, r16);
    L13:
        return new os(-1, r2, r4);
    }
}
