package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i83 implements k51 {
    public m51 a;
    public im4 b;
    public boolean c;

    static {
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r21, t71 r22) {
        this.a.getClass();
        if (this.b != null) goto L10;
        if (g(r21) == false) goto L8;
        r21.k();
        goto L10
    L8:
        throw ParserException.a(null, "Failed to determine bitstream type");
    L10:
        if (this.c == true) goto L12;
        wv4 r2 = this.a.t(0, 1);
        this.a.p();
        im4 r5 = this.b;
        r5.c = this.a;
        r5.b = r2;
        r5.d(true);
        this.c = true;
    L12:
        im4 r8 = this.b;
        bl0 r0 = r8.a;
        r8.b.getClass();
        String r3 = f35.a;
        int r4 = r8.h;
        if (r4 == 0) goto L46;
        if (r4 == 1) goto L44;
        if (r4 == 2) goto L20;
        if (r4 != 3) goto L18;
        return -1;
    L18:
        tb4.a();
        return 0;
    L20:
        long r10 = r8.d.b(r21);
        if (r10 < 0) goto L25;
        r22.a = r10;
        return 1;
    L25:
        if (r10 >= (-1)) goto L28;
        r8.a(-(r10 + 2));
    L28:
        if (r8.l == true) goto L31;
        m84 r6 = r8.d.e();
        r6.getClass();
        r8.c.w(r6);
        r8.b.d(r6.g());
        r8.l = true;
    L31:
        if (r8.k <= 0) goto L33;
    L37:
        r8.k = 0;
        be3 r1 = (be3) r0.r;
        long r7 = r8.b(r1);
        if (r7 < 0) goto L42;
        long r9 = r8.g;
        if ((r9 + r7) < r8.e) goto L42;
        long r14 = (r9 * 1000000) / ((long) r8.i);
        r8.b.e(r1.c, r1);
        r8.b.a(r14, 1, r1.c, 0, null);
        r8.e = -1;
    L42:
        r8.g += r7;
        return 0;
    L33:
        if (r0.b(r21) == true) goto L37;
        r8.h = 3;
        return -1;
    L44:
        r21.l((int) r8.f);
        r8.h = 2;
        return 0;
    L46:
        boolean r11 = r0.b(r21);
        be3 r12 = (be3) r0.r;
        if (r11 == false) goto L48;
        long r13 = r21.getPosition();
        long r15 = r8.f;
        r8.k = r13 - r15;
        if (r8.c(r12, r15, r8.j) == false) goto L53;
        r8.f = r21.getPosition();
        goto L46
    L53:
        tb1 r16 = (tb1) r8.j.n;
        r8.i = r16.G;
        if (r8.m == true) goto L56;
        r8.b.g(r16);
        r8.m = true;
    L56:
        ru r17 = (ru) r8.j.o;
        if (r17 == null) goto L61;
        r8.d = r17;
    L68:
        r8.h = 2;
        byte[] r18 = r12.a;
        if (r18.length != 65025) goto L71;
        return 0;
    L71:
        r12.L(r12.c, Arrays.copyOf(r18, Math.max(65025, r12.c)));
        return 0;
    L61:
        if (r21.getLength() != (-1)) goto L63;
        r8.d = new xi4(9);
        goto L68
    L63:
        k83 r19 = (k83) r0.q;
        if ((r19.a & 4) == 0) goto L66;
        boolean r110 = true;
    L67:
        r8.d = new fm0(r8, r8.f, r21.getLength(), r19.d + r19.e, r19.b, r110);
        goto L68
    L66:
        r110 = false;
        goto L67
    L48:
        r8.h = 3;
        return -1;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r1) {
        return g(r1);
    L4:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r6, long r8) {
        im4 r5 = this.b;
        if (r5 == null) goto L12;
        bl0 r0 = r5.a;
        k83 r1 = (k83) r0.q;
        r1.a = 0;
        r1.b = 0;
        r1.c = 0;
        r1.d = 0;
        r1.e = 0;
        ((be3) r0.r).K(0);
        r0.n = -1;
        r0.p = false;
        if (r6 != 0) goto L9;
        r5.d(!r5.l);
        return;
    L9:
        if (r5.h == 0) goto L13;
        long r7 = (((long) r5.i) * r8) / 1000000;
        r5.e = r7;
        l83 r9 = r5.d;
        String r10 = f35.a;
        r9.g(r7);
        r5.h = 2;
        return;
    L13:
        return;
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.a = r1;
    }

    public final boolean g(l51 r9) {
        k83 r0 = new k83();
        if (r0.a(r9, true) == true) goto L5;
    L25:
        return false;
    L5:
        if ((r0.a & 2) != 2) goto L25;
        int r1 = Math.min(r0.e, 8);
        be3 r2 = new be3(r1);
        r9.n(r2.a, 0, r1);
        r2.N(0);
        if (r2.a() >= 5) goto L10;
    L15:
        r2.N(0);
        boolean r10 = zz1.N(1, r2, true);     // Catch: ParserException -> L18
    L19:
        if (r10 == false) goto L21;
        this.b = new s85();
    L24:
        return true;
    L21:
        r2.N(0);
        if (eb3.e(r2, eb3.o) == false) goto L25;
        this.b = new eb3();
    L18:
        r10 = false;
        goto L19
    L10:
        if (r2.A() != 127) goto L15;
        if (r2.C() != 1179402563) goto L15;
        this.b = new u71();
        return true;
    }
}
