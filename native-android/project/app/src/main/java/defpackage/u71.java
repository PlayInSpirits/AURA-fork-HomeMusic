package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 extends im4 {
    public v71 n;
    public ru o;

    @Override // defpackage.im4
    public final long b(be3 r4) {
        byte[] r3 = r4.a;
        if (r3[0] != (-1)) goto L11;
        int r5 = (r3[2] & 255) >> 4;
        if (r5 != 6) goto L7;
    L8:
        r4.O(4);
        r4.I();
    L9:
        int r6 = rr2.P(r5, r4);
        r4.N(0);
        return r6;
    L7:
        if (r5 != 7) goto L9;
    L11:
        return -1;
    }

    @Override // defpackage.im4
    public final boolean c(be3 r22, long r23, rf2 r25) {
        byte[] r3 = r22.a;
        v71 r4 = this.n;
        if (r4 != null) goto L6;
        v71 r5 = new v71(17, r3);
        this.n = r5;
        sb1 r0 = r5.c(Arrays.copyOfRange(r3, 9, r22.c), null).a();
        r0.l = lw2.m("audio/ogg");
        r25.n = new tb1(r0);
        return true;
    L6:
        byte r6 = r3[0];
        if ((r6 & 127) != 3) goto L11;
        rm3 r19 = l93.Y(r22);
        v71 r9 = new v71(r4.a, r4.b, r4.c, r4.d, r4.e, r4.g, r4.h, r4.j, r19, r4.l);
        this.n = r9;
        ru r2 = new ru();
        r2.p = r9;
        r2.q = r19;
        r2.n = -1;
        r2.o = -1;
        this.o = r2;
        return true;
    L11:
        if (r6 != (-1)) goto L17;
        ru r1 = this.o;
        if (r1 == null) goto L15;
        r1.n = r23;
        r25.o = r1;
    L15:
        ((tb1) r25.n).getClass();
        return false;
    L17:
        return true;
    }

    @Override // defpackage.im4
    public final void d(boolean r1) {
        super.d(r1);
        if (r1 == false) goto L6;
        this.n = null;
        this.o = null;
        return;
    }
}
