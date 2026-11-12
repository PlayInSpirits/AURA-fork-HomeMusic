package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 implements k51 {
    public static final int[] q = null;
    public static final int[] r = null;
    public static final byte[] s = null;
    public static final byte[] t = null;
    public final byte[] a;
    public final tq0 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public m51 j;
    public wv4 k;
    public wv4 l;
    public m84 m;
    public boolean n;
    public long o;
    public boolean p;

    static {
        q = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        r = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String r0 = f35.a;
        Charset r1 = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(r1);
        t = "#!AMR-WB\n".getBytes(r1);
    }

    public p9() {
        this.a = new byte[1];
        this.g = -1;
        tq0 r0 = new tq0();
        this.b = r0;
        this.l = r0;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r18, t71 r19) {
        this.k.getClass();
        String r1 = f35.a;
        if (r18.getPosition() != 0) goto L10;
        if (h(r18) == true) goto L10;
        throw ParserException.a(null, "Could not find AMR header.");
    L10:
        if (this.p == true) goto L25;
        this.p = true;
        boolean r2 = this.c;
        String r5 = "audio/amr-wb";
        if (r2 == false) goto L14;
        String r6 = "audio/amr-wb";
    L15:
        if (r2 == true) goto L18;
        r5 = "audio/3gpp";
    L18:
        if (r2 == false) goto L20;
        int r7 = 16000;
    L21:
        if (r2 == false) goto L23;
        int r3 = r[8];
    L24:
        wv4 r8 = this.k;
        sb1 r9 = new sb1();
        r9.l = lw2.m(r6);
        r9.m = lw2.m(r5);
        r9.n = r3;
        r9.E = 1;
        r9.F = r7;
        f34.l(r9, r8);
        goto L25
    L23:
        r3 = q[7];
        goto L24
    L20:
        r7 = 8000;
        goto L21
    L14:
        r6 = "audio/amr";
    L25:
        int r10 = 0;
        if (this.f == 0) goto L71;
    L55:
        l51 r4 = r18;
        int r11 = this.l.f(r4, this.f, true);
        if (r11 == (-1)) goto L54;
        int r12 = this.f - r11;
        this.f = r12;
        if (r12 > 0) goto L62;
        this.l.a(this.d + this.i, 1, this.e, 0, null);
        this.d += 20000;
    L62:
        r4.getLength();
        if (this.m != null) goto L66;
        bo r13 = new bo(-9223372036854775807L);
        this.m = r13;
        this.j.w(r13);
    L66:
        if (r10 != (-1)) goto L70;
        m84 r14 = this.m;
        if ((r14 instanceof ux1) == false) goto L70;
        long r15 = this.i + this.d;
        ((ux1) r14).c = r15;
        this.j.w(r14);
        this.k.d(r15);
    L70:
        return r10;
    L54:
        r10 = -1;
        goto L62
    L71:
        int r16 = g(r18);     // Catch: EOFException -> L53
        this.e = r16;     // Catch: EOFException -> L53
        this.f = r16;
        if (this.g != (-1)) goto L32;
        r18.getPosition();
        this.g = this.e;
    L32:
        if (this.g != this.e) goto L34;
        this.h++;
    L34:
        m84 r17 = this.m;
        if ((r17 instanceof ux1) == false) goto L55;
        ux1 r20 = (ux1) r17;
        long r21 = (this.i + this.d) + 20000;
        long r110 = r18.getPosition() + ((long) this.e);
        te2 r111 = r20.b;
        int r112 = r111.b;
        if (r112 != 0) goto L40;
    L42:
        te2 r113 = r20.a;
        te2 r22 = r20.b;
        if (r22.b == 0) goto L45;
    L47:
        r113.a(r110);
        r22.a(r21);
    L49:
        if (this.n == false) goto L55;
        if (Math.abs(this.o - r21) >= 20000) goto L55;
        this.n = false;
        this.l = this.k;
        goto L55
    L45:
        if (r21 <= 0) goto L47;
        r113.a(0);
        r22.a(0);
        goto L47
    L40:
        if ((r21 - r111.d(r112 - 1)) >= 100000) goto L42;
    L53:
        r4 = r18;
        goto L54
    }

    @Override // defpackage.k51
    public final boolean c(l51 r1) {
        return h(r1);
    }

    @Override // defpackage.k51
    public final void d(long r5, long r7) {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.o = r7;
        m84 r8 = this.m;
        if ((r8 instanceof ux1) == false) goto L14;
        ux1 r9 = (ux1) r8;
        te2 r10 = r9.b;
        if (r10.b != 0) goto L7;
        long r6 = -9223372036854775807L;
    L8:
        this.i = r6;
        if (Math.abs(this.o - r6) >= 20000) goto L11;
        return;
    L11:
        this.n = true;
        this.l = this.b;
        return;
    L7:
        r6 = r10.d(f35.c(r9.a, r5));
        goto L8
    L14:
        if (r5 != 0) goto L16;
    L19:
        this.i = 0;
        return;
    L16:
        if ((r8 instanceof eb0) == false) goto L19;
        eb0 r11 = (eb0) r8;
        long r2 = r11.b;
        int r12 = r11.e;
        this.i = (Math.max(0, r5 - r2) * 8000000) / ((long) r12);
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        this.j = r3;
        wv4 r0 = r3.t(0, 1);
        this.k = r0;
        this.l = r0;
        r3.p();
    }

    public final int g(l51 r4) {
        r4.k();
        byte[] r1 = this.a;
        r4.n(r1, 0, 1);
        byte r5 = r1[0];
        if ((r5 & 131) > 0) goto L31;
        int r6 = (r5 >> 3) & 15;
        if (r6 < 0) goto L24;
        if (r6 > 15) goto L24;
        boolean r0 = this.c;
        if (r0 == true) goto L10;
    L14:
        if (r0 == true) goto L24;
        if (r6 >= 12) goto L18;
    L19:
        if (r0 == false) goto L23;
        return r[r6];
    L23:
        return q[r6];
    L18:
        if (r6 <= 14) goto L24;
    L10:
        if (r6 < 10) goto L19;
        if (r6 <= 13) goto L14;
    L24:
        StringBuilder r2 = new StringBuilder("Illegal AMR ");
        if (this.c == false) goto L27;
        String r3 = "WB";
    L28:
        r2.append(r3);
        r2.append(" frame type ");
        r2.append(r6);
        throw ParserException.a(null, r2.toString());
    L27:
        r3 = "NB";
        goto L28
    L31:
        throw ParserException.a(null, "Invalid padding bits for frame header " + r5);
    }

    public final boolean h(l51 r6) {
        r6.k();
        byte[] r0 = s;
        byte[] r1 = new byte[r0.length];
        r6.n(r1, 0, r0.length);
        if (Arrays.equals(r1, r0) == false) goto L6;
        this.c = false;
        r6.l(r0.length);
        return true;
    L6:
        r6.k();
        byte[] r2 = t;
        byte[] r3 = new byte[r2.length];
        r6.n(r3, 0, r2.length);
        if (Arrays.equals(r3, r2) == false) goto L10;
        this.c = true;
        r6.l(r2.length);
        return true;
    L10:
        return false;
    }
}
