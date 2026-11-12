package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e95 implements m84 {
    public final uu a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e95(uu r1, int r2, long r3, long r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        long r6 = (r5 - r3) / ((long) r1.p);
        this.d = r6;
        this.e = h(r6);
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r15) {
        uu r0 = this.a;
        long r5 = (((long) r0.o) * r15) / (((long) this.b) * 1000000);
        long r9 = this.d - 1;
        long r1 = f35.k(r5, 0, r9);
        int r2 = r0.p;
        long r7 = this.c;
        long r11 = h(r1);
        o84 r13 = new o84(r11, (((long) r2) * r1) + r7);
        if (r11 >= r15) goto L10;
        if (r1 == r9) goto L10;
        long r3 = r1 + 1;
        long r4 = (((long) r2) * r3) + r7;
        return new l84(r13, new o84(h(r3), r4));
    L10:
        return new l84(r13, r13);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.e;
    }

    public final long h(long r10) {
        long r2 = r10 * ((long) this.b);
        long r6 = this.a.o;
        String r9 = f35.a;
        return f35.a0(r2, 1000000, r6, RoundingMode.DOWN);
    }
}
