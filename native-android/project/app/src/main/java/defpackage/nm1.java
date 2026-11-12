package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 extends s20 {
    public static final AtomicInteger M = null;
    public final boolean A;
    public final boolean B;
    public jw C;
    public ln1 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public yw1 I;
    public boolean J;
    public long K;
    public boolean L;
    public final long j;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final ci0 p;
    public final ii0 q;
    public final jw r;
    public final boolean s;
    public final boolean t;
    public final iu4 u;
    public final xk0 v;
    public final List w;
    public final ow0 x;
    public final mv1 y;
    public final be3 z;

    static {
        M = new AtomicInteger();
    }

    public nm1(xk0 r13, ci0 r14, ii0 r15, tb1 r16, boolean r17, ci0 r18, ii0 r19, boolean r20, Uri r21, List r22, int r23, Object r24, long r25, long r27, long r29, int r31, boolean r32, int r33, boolean r34, boolean r35, iu4 r36, ow0 r37, jw r38, mv1 r39, be3 r40, boolean r41, boolean r42, ik3 r43) {
        super(r14, r15, 1, r16, r23, r24, r25, r27);
        r16.getClass();
        this.j = r29;
        this.A = r17;
        this.o = r31;
        if (r32 == false) goto L5;
        long r110 = r27 - r25;
    L6:
        this.K = r110;
        this.l = r33;
        this.q = r19;
        this.p = r18;
        if (r19 == null) goto L9;
        boolean r111 = true;
    L10:
        this.F = r111;
        this.B = r20;
        this.m = r21;
        this.s = r35;
        this.u = r36;
        this.t = r34;
        this.v = r13;
        this.w = r22;
        this.x = r37;
        this.r = r38;
        this.y = r39;
        this.z = r40;
        this.L = r41;
        this.n = r42;
        vw1 r112 = yw1.o;
        this.I = gy3.r;
        this.k = M.getAndIncrement();
        return;
    L9:
        r111 = false;
        goto L10
    L5:
        r110 = -9223372036854775807L;
        goto L6
    }

    public static byte[] d(String r4) {
        if (rr2.U(r4).startsWith("0x") == false) goto L5;
        r4 = r4.substring(2);
    L5:
        byte[] r5 = new BigInteger(r4, 16).toByteArray();
        byte[] r0 = new byte[16];
        if (r5.length <= 16) goto L8;
        int r2 = r5.length - 16;
    L9:
        System.arraycopy(r5, r2, r0, (16 - r5.length) + r2, r5.length - r2);
        return r0;
    L8:
        r2 = 0;
        goto L9
    }

    @Override // defpackage.jd2
    public final void a() {
        this.D.getClass();
        if (this.C != null) goto L11;
        jw r0 = this.r;
        if (r0 == null) goto L11;
        k51 r2 = (k51) r0.o;
        if ((r2 instanceof qy4) == false) goto L9;
    L10:
        this.C = r0;
        this.F = false;
        goto L11
    L9:
        if ((r2 instanceof oe1) == true) goto L10;
    L11:
        ii0 r1 = this.q;
        ci0 r3 = this.p;
        if (this.F == false) goto L16;
        r3.getClass();
        r1.getClass();
        c(r3, r1, this.B, false);
        this.E = 0;
        this.F = false;
    L16:
        if (this.G == false) goto L18;
        return;
    L18:
        if (this.t == true) goto L20;
        c(this.i, this.b, this.A, true);
    L20:
        this.H = !this.G;
    }

    @Override // defpackage.jd2
    public final void b() {
        this.G = true;
    }

    public final void c(ci0 r9, ii0 r10, boolean r11, boolean r12) {
        int r0 = this.E;
        if (r11 == false) goto L8;
        if (r0 == 0) goto L6;
        boolean r13 = true;
    L7:
        boolean r1 = r13;
        ii0 r14 = r10;
    L45:
        rk0 r15 = g(r9, r14, r12);     // Catch: Throwable -> L17
        if (r1 == false) goto L43;
        r15.d(this.E, false);     // Catch: Throwable -> L17
    L43:
    L26:
        e = move-exception;
        if ((this.d.f & 16384) == 0) goto L38;
        ((k51) this.C.o).d(0, 0);     // Catch: Throwable -> L24
        long r16 = r15.q;     // Catch: Throwable -> L17
    L35:
        this.E = (int) (r16 - r10.f);     // Catch: Throwable -> L17
        fu.k(r9);
        return;
    L38:
        throw e;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        this.E = (int) (r15.q - r10.f);     // Catch: Throwable -> L17
        throw th;     // Catch: Throwable -> L17
    L20:
        if (this.G == true) goto L28;
        if (((k51) this.C.o).b(r15, jw.s) != 0) goto L28;
    L28:
        r16 = r15.q;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        fu.k(r9);
        throw th;
    L6:
        r13 = false;
        goto L7
    L8:
        long r2 = r0;
        long r4 = r10.g;
        long r6 = -1;
        if (r4 == (-1)) goto L12;
        r6 = r4 - r2;
    L12:
        r14 = r10.b(r2, r6);
        r1 = false;
        goto L45
    }

    public final int e(int r2) {
        rr2.w(!this.L);
        if (r2 < this.I.size()) goto L7;
        return 0;
    L7:
        return ((Integer) this.I.get(r2)).intValue();
    }

    public final boolean f() {
        if (this.K == (-9223372036854775807L)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, k51] */
    /* JADX WARN: Type inference failed for: r19v2, types: [k51] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k51] */
    public final rk0 g(ci0 r34, ii0 r35, boolean r36) {
        long r6 = r34.b(r35);
        long r8 = this.g;
        iu4 r10 = this.u;
        if (r36 == true) goto L213;
    L11:
        rk0 r2 = new rk0(r34, r35.f, r6);
        if (this.C != null) goto L197;
        be3 r3 = this.z;
        r2.s = 0;
        r3.K(10);     // Catch: EOFException -> L40
        r2.e(r3.a, 0, 10, false);     // Catch: EOFException -> L40
        if (r3.D() == 4801587) goto L18;
        rk0 r37 = null;
        long r11 = -9223372036854775807L;
        long r16 = -9223372036854775807L;
    L41:
        r2.s = 0;
        jw r4 = this.r;
        if (r4 == null) goto L70;
        k51 r1 = (k51) r4.o;
        if ((r1 instanceof qy4) == false) goto L46;
    L49:
        boolean r7 = true;
    L50:
        rr2.w(!r7);
        if ((r1 instanceof x95) == false) goto L55;
        k51 r5 = new x95(((tb1) r4.p).d, (iu4) r4.q, (xn4) r4.r, r4.n);
    L66:
        jw r18 = new jw(r5, (tb1) r4.p, (iu4) r4.q, (xn4) r4.r, r4.n);
        r8 = r8;
        int r9 = 0;
    L67:
        jw r12 = r18;
        this.C = r12;
        k51 r13 = (k51) r12.o;
        if ((r13 instanceof h6) == false) goto L170;
    L184:
        ln1 r14 = this.D;
        if (r11 == r16) goto L187;
        long r15 = r10.b(r11);
    L189:
        if (r14.i0 == r15) goto L196;
        r14.i0 = r15;
        kn1[] r17 = r14.I;
        int r19 = r17.length;
        int r20 = r9;
    L191:
        if (r20 >= r19) goto L196;
        kn1 r21 = r17[r20];
        if (r21.F == r15) goto L195;
        r21.F = r15;
        r21.z = true;
    L195:
        r20 = r20 + 1;
    L196:
        this.D.K.clear();
        jw r22 = this.C;
        ((k51) r22.o).f(this.D);
    L198:
        ln1 r23 = this.D;
        ow0 r24 = r23.j0;
        ow0 r0 = this.x;
        if (Objects.equals(r24, r0) == true) goto L208;
        r23.j0 = r0;
        int r25 = r9;
    L201:
        kn1[] r26 = r23.I;
        if (r25 >= r26.length) goto L208;
        if (r23.b0[r25] == false) goto L207;
        kn1 r27 = r26[r25];
        r27.I = r0;
        r27.z = true;
    L207:
        r25 = r25 + 1;
    L208:
        return r2;
    L187:
        r15 = r8;
        goto L189
    L170:
        if ((r13 instanceof r2) == true) goto L184;
        if ((r13 instanceof t2) == true) goto L184;
        if ((r13 instanceof ky2) == true) goto L184;
        ln1 r28 = this.D;
        if (r28.i0 == 0) goto L196;
        r28.i0 = 0;
        kn1[] r29 = r28.I;
        int r30 = r29.length;
        int r31 = r9;
    L179:
        if (r31 >= r30) goto L196;
        kn1 r32 = r29[r31];
        if (r32.F == 0) goto L183;
        r32.F = 0;
        r32.z = true;
    L183:
        r31 = r31 + 1;
        goto L179
    L55:
        if ((r1 instanceof h6) == false) goto L58;
        r5 = new h6(0);
        goto L66
    L58:
        if ((r1 instanceof r2) == false) goto L61;
        r5 = new r2();
        goto L66
    L61:
        if ((r1 instanceof t2) == false) goto L64;
        r5 = new t2();
        goto L66
    L64:
        if ((r1 instanceof ky2) == false) goto L68;
        r5 = new ky2(0);
        goto L66
    L68:
        kf2.o("Unexpected extractor type for recreation: ".concat(r1.getClass().getSimpleName()));
        return r37;
    L46:
        if ((r1 instanceof oe1) == true) goto L49;
        r7 = false;
        goto L50
    L70:
        Uri r33 = r35.a;
        Map r38 = r34.j();
        xk0 r39 = this.v;
        r39.getClass();
        tb1 r110 = this.d;
        int r111 = h12.x(r110.n);
        List r40 = (List) r38.get("Content-Type");
        if (r40 != null) goto L73;
    L76:
        ?? r41 = r37;
    L77:
        int r42 = h12.x(r41);
        int r43 = h12.y(r33);
        int r44 = 7;
        ArrayList r112 = new ArrayList(7);
        xk0.e(r111, r112);
        xk0.e(r42, r112);
        xk0.e(r43, r112);
        int r45 = 0;
    L78:
        if (r45 >= r44) goto L80;
        xk0.e(xk0.q[r45], r112);
        r45 = r45 + 1;
        r44 = 7;
        goto L78
    L80:
        r2.s = 0;
        ?? r113 = r37;
        int r46 = 0;
    L81:
        int r47 = r112.size();
        iu4 r48 = this.u;
        if (r46 >= r47) goto L166;
        int r49 = ((Integer) r112.get(r46)).intValue();
        int r210 = r46;
        if (r49 != 0) goto L86;
        iu4 r50 = r48;
        ?? r51 = new r2();
    L148:
        r51.getClass();
        boolean r52 = r51.c(r2);     // Catch: Throwable -> L151 EOFException -> L154
        r9 = 0;
        r2.s = 0;
    L155:
        if (r52 == true) goto L156;
        tb1 r211 = r110;
        if (r113 != 0) goto L165;
        if (r49 == r111) goto L164;
        if (r49 == r42) goto L164;
        if (r49 == r43) goto L164;
        if (r49 != 11) goto L165;
    L164:
        r113 = r51;
    L165:
        r46 = r210 + 1;
        r110 = r211;
        r112 = r112;
        r8 = r8;
        r113 = r113;
        goto L81
    L156:
        ?? r114 = r51;
        tb1 r212 = r110;
        r18 = new jw(r114, r212, r50, (om0) r39.p, r39.o);
        goto L67
    L154:
        r9 = 0;
        r2.s = 0;
        r52 = false;
    L151:
        th = move-exception;
        r2.s = 0;
        throw th;
    L86:
        if (r49 != 1) goto L88;
        r50 = r48;
        r51 = new t2();
        goto L148
    L88:
        if (r49 != 2) goto L90;
        r50 = r48;
        r51 = new h6(0);
        goto L148
    L90:
        if (r49 == 7) goto L144;
        List r53 = this.w;
        xi4 r213 = xn4.m;
        if (r49 != 8) goto L94;
        r50 = r48;
        om0 r54 = (om0) r39.p;
        boolean r55 = r39.o;
        qv2 r56 = r110.l;
        if (r56 != null) goto L121;
        om0 r214 = r54;
        boolean r215 = r55;
    L135:
        int r57 = 0;
    L136:
        if (r215 == true) goto L138;
        r57 = r57 | 32;
        xn4 r58 = r213;
    L140:
        if (r53 == null) goto L142;
        List r115 = r53;
    L143:
        r51 = new oe1(r58, r57, r50, r115);
        goto L148
    L142:
        r115 = gy3.r;
        goto L143
    L138:
        r58 = r214;
        goto L140
    L121:
        pv2[] r59 = r56.a;
        int r116 = r59.length;
        r214 = r54;
        int r60 = 0;
    L122:
        if (r60 >= r116) goto L132;
        int r216 = r60;
        pv2 r61 = r59[r216];
        r215 = r55;
        pv2[] r217 = r59;
        if (nn1.class.isAssignableFrom(r61.getClass()) == false) goto L128;
        pv2 r62 = (pv2) nn1.class.cast(r61);
        boolean r63 = ((nn1) r62).c.isEmpty();
        Object r64 = r62;
        if (r63 == true) goto L128;
    L129:
        if (r64 != null) goto L133;
        r60 = r216 + 1;
        r55 = r215;
        r59 = r217;
    L133:
        if (r64 == null) goto L135;
        r57 = 4;
    L128:
        r64 = r37;
        goto L129
    L132:
        r215 = r55;
        r64 = r37;
        goto L133
    L94:
        if (r49 != 11) goto L96;
        om0 r65 = (om0) r39.p;
        boolean r66 = r39.o;
        if (r53 == null) goto L103;
        int r117 = 48;
        List r67 = r53;
    L104:
        String r68 = r110.k;
        if (TextUtils.isEmpty(r68) == false) goto L107;
    L114:
        if (r66 == true) goto L116;
        xn4 r218 = r213;
    L117:
        r50 = r48;
        r51 = new qy4(2, !r66 ? 1 : 0, r218, r48, new qn0(r67, r117));
        goto L148
    L116:
        r218 = r65;
        goto L117
    L107:
        if (lw2.b(r68, "audio/mp4a-latm") != null) goto L111;
        r117 = r117 | 2;
    L111:
        if (lw2.b(r68, "video/avc") != null) goto L114;
        r117 = r117 | 4;
        goto L114
    L103:
        sb1 r69 = new sb1();
        r69.m = lw2.m("application/cea-608");
        r67 = Collections.singletonList(new tb1(r69));
        r117 = 16;
        goto L104
    L96:
        if (r49 == 13) goto L98;
        r50 = r48;
        r51 = r37;
        goto L148
    L98:
        r51 = new x95(r110.d, r48, (om0) r39.p, r39.o);
        r50 = r48;
        goto L148
    L144:
        r50 = r48;
        r51 = new ky2(0);
        goto L148
    L166:
        r8 = r8;
        r9 = 0;
        r113.getClass();
        r18 = new jw(r113, r110, r48, (om0) r39.p, r39.o);
        goto L67
    L73:
        if (r40.isEmpty() == true) goto L76;
        r41 = (String) r40.get(0);
        goto L77
    L18:
        r3.O(3);
        int r118 = r3.z();
        int r119 = r118 + 10;
        r37 = null;
        byte[] r70 = r3.a;
        r16 = -9223372036854775807L;
        if (r119 <= r70.length) goto L21;
        r3.K(r119);
        System.arraycopy(r70, 0, r3.a, 0, 10);
    L21:
        r2.e(r3.a, 10, r118, false);
        qv2 r71 = this.y.O(r118, r3.a);
        if (r71 != null) goto L24;
    L23:
        r11 = r16;
        goto L41
    L24:
        pv2[] r72 = r71.a;
        int r120 = r72.length;
        int r121 = 0;
    L25:
        if (r121 >= r120) goto L35;
        pv2 r122 = r72[r121];
        if (hq3.class.isAssignableFrom(r122.getClass()) == false) goto L31;
        pv2 r123 = (pv2) hq3.class.cast(r122);
        if (((hq3) r123).b.equals("com.apple.streaming.transportStreamTimestamp") == false) goto L31;
    L32:
        if (r123 != null) goto L36;
        r121 = r121 + 1;
    L36:
        hq3 r124 = (hq3) r123;
        if (r124 == null) goto L23;
        System.arraycopy(r124.c, 0, r3.a, 0, 8);
        r3.N(0);
        r3.M(8);
        r11 = r3.u() & 8589934591L;
    L31:
        r123 = null;
        goto L32
    L35:
        r123 = null;
    L40:
        r37 = null;
        r16 = -9223372036854775807L;
        goto L23
    L197:
        r9 = 0;
        goto L198
    L213:
        r10.g(this.s, r8);     // Catch: TimeoutException -> L6 InterruptedException -> L9
    L6:
        e = move-exception;
        throw new IOException(e);
    L10:
        throw new InterruptedIOException();
    }
}
