package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k83 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final be3 g;

    public k83() {
        this.f = new int[255];
        this.g = new be3(255);
    }

    public final boolean a(l51 r7, boolean r8) {
        int r0 = 0;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        be3 r1 = this.g;
        r1.K(27);
        boolean r2 = r7.e(r1.a, 0, 27, r8);     // Catch: EOFException -> L5
    L8:
        if (r2 == true) goto L10;
    L32:
        return false;
    L10:
        if (r1.C() != 1332176723) goto L32;
        if (r1.A() == 0) goto L18;
        if (r8 == true) goto L32;
        throw ParserException.c("unsupported bit stream revision");
    L18:
        this.a = r1.A();
        this.b = r1.p();
        r1.r();
        r1.r();
        r1.r();
        int r3 = r1.A();
        this.c = r3;
        this.d = r3 + 27;
        r1.K(r3);
        boolean r9 = r7.e(r1.a, 0, this.c, r8);     // Catch: EOFException -> L21
    L24:
        if (r9 == false) goto L32;
    L27:
        if (r0 >= this.c) goto L29;
        int r10 = r1.A();
        this.f[r0] = r10;
        this.e += r10;
        r0 = r0 + 1;
        goto L27
    L29:
        return true;
    L21:
        e = move-exception;
        if (r8 == false) goto L31;
        r9 = false;
        goto L24
    L31:
        throw e;
    L5:
        e = move-exception;
        if (r8 == false) goto L33;
        r2 = false;
        goto L8
    L33:
        throw e;
    }

    public final boolean b(l51 r9, long r10) {
        if (r9.getPosition() != r9.f()) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        be3 r8 = this.g;
        r8.K(4);
    L8:
        if (r10 == (-1)) goto L28;
        if ((r9.getPosition() + 4) < r10) goto L28;
    L21:
        if (r10 == (-1)) goto L25;
        if (r9.getPosition() < r10) goto L25;
    L27:
        return false;
    L25:
        if (r9.h(1) == (-1)) goto L27;
    L28:
        boolean r4 = r9.e(r8.a, 0, 4, true);     // Catch: EOFException -> L14
    L15:
        if (r4 == false) goto L21;
        r8.N(0);
        if (r8.C() == 1332176723) goto L18;
        r9.l(1);
        goto L8
    L18:
        r9.k();
        return true;
    L14:
        r4 = false;
        goto L15
    L5:
        r0 = false;
        goto L6
    }
}
