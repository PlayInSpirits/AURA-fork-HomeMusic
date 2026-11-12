package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o71 extends ac1 {
    public final long n;
    public final boolean o;
    public long p;

    public o71(ej4 r1, long r2, boolean r4) {
        super(r1);
        this.n = r2;
        this.o = r4;
    }

    @Override // defpackage.ac1, defpackage.ej4
    public final long read(tv r10, long r11) {
        r10.getClass();
        long r0 = this.p;
        long r2 = this.n;
        if (r0 <= r2) goto L6;
        r11 = 0;
    L11:
        long r12 = super.read(r10, r11);
        if (r12 == (-1)) goto L14;
        this.p += r12;
    L14:
        long r4 = this.p;
        if (r4 >= r2) goto L17;
        if (r12 != (-1)) goto L17;
    L19:
        if (r12 <= 0) goto L23;
        if (r4 <= r2) goto L23;
        long r13 = r10.o - (r4 - r2);
        tv r1 = new tv();
        r1.p(r10);
        r10.L(r1, r13);
        r1.b();
    L23:
        throw new IOException("expected " + r2 + " bytes but got " + this.p);
    L17:
        if (r4 > r2) goto L19;
        return r12;
    L6:
        if (this.o == false) goto L11;
        long r3 = r2 - r0;
        if (r3 != 0) goto L10;
        return -1;
    L10:
        r11 = Math.min(r11, r3);
        goto L11
    }
}
