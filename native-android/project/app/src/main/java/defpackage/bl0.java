package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements bi0 {
    public int n;
    public int o;
    public boolean p;
    public final Object q;
    public Object r;

    public bl0(int r3) {
        switch(r3) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.q = new qr2(10);
        this.n = 8000;
        this.o = 8000;
        return;
    L5:
        this.q = new k83();
        this.r = new be3(0, new byte[65025]);
        this.n = -1;
    }

    public int a(int r6) {
        int r0 = 0;
        this.o = 0;
    L3:
        int r1 = this.o;
        int r2 = r6 + r1;
        k83 r3 = (k83) this.q;
        if (r2 >= r3.c) goto L7;
        int[] r4 = r3.f;
        this.o = r1 + 1;
        int r5 = r4[r2];
        r0 = r0 + r5;
        if (r5 == 255) goto L3;
    L7:
        return r0;
    }

    public boolean b(l51 r9) {
        k83 r0 = (k83) this.q;
        be3 r1 = (be3) this.r;
        if (r9 == null) goto L5;
        boolean r4 = true;
    L6:
        rr2.w(r4);
        if (this.p == false) goto L10;
        this.p = false;
        r1.K(0);
    L10:
        if (this.p == true) goto L41;
        if (this.n < 0) goto L14;
    L27:
        int r5 = a(this.n);
        int r6 = this.n + this.o;
        if (r5 <= 0) goto L38;
        r1.c(r1.c + r5);
        r9.readFully(r1.a, r1.c, r5);     // Catch: EOFException -> L36
        r1.M(r1.c + r5);
        if (r0.f[r6 - 1] == 255) goto L34;
        boolean r7 = true;
    L35:
        this.p = r7;
        goto L38
    L34:
        r7 = false;
    L36:
        return false;
    L38:
        if (r6 != r0.c) goto L40;
        r6 = -1;
    L40:
        this.n = r6;
        goto L10
    L14:
        if (r0.b(r9, -1) == false) goto L26;
        if (r0.a(r9, true) == false) goto L26;
        int r8 = r0.d;
        if ((r0.a & 1) == 1) goto L21;
    L23:
        int r10 = 0;
    L45:
        r9.l(r8);     // Catch: EOFException -> L42
        this.n = r10;
        goto L27
    L21:
        if (r1.c != 0) goto L23;
        r8 = r8 + a(0);
        r10 = this.o;
    L26:
        return false;
    L41:
        return true;
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.bi0
    public ci0 m() {
        el0 r0 = new el0(this.n, this.o, this.p, (qr2) this.q);
        rw4 r5 = (rw4) this.r;
        if (r5 == null) goto L5;
        r0.c(r5);
    L5:
        return r0;
    }
}
