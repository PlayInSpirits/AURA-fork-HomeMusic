package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr3 implements no2, m51, hd2, kd2, o44 {
    public static final Map e0 = null;
    public static final tb1 f0 = null;
    public final z05 A;
    public final q90 B;
    public final ar3 C;
    public final ar3 D;
    public final Handler E;
    public mo2 F;
    public iv1 G;
    public dr3[] H;
    public p44[] I;
    public gr3[] J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ss0 O;
    public m84 P;
    public long Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public long Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public final Uri n;
    public final ci0 o;
    public final ww0 p;
    public final i80 q;
    public final ue1 r;
    public final sw0 s;
    public final kr3 t;
    public final n9 u;
    public final String v;
    public final long w;
    public final tb1 x;
    public final long y;
    public final i61 z;

    static {
        HashMap r0 = new HashMap();
        r0.put("Icy-MetaData", "1");
        e0 = Collections.unmodifiableMap(r0);
        sb1 r1 = new sb1();
        r1.a = "icy";
        r1.m = lw2.m("application/x-icy");
        f0 = new tb1(r1);
    }

    public hr3(Uri r2, ci0 r3, z05 r4, ww0 r5, sw0 r6, i80 r7, ue1 r8, kr3 r9, n9 r10, String r11, int r12, tb1 r13, long r14, ty3 r16) {
        this.n = r2;
        this.o = r3;
        this.p = r5;
        this.s = r6;
        this.q = r7;
        this.r = r8;
        this.t = r9;
        this.u = r10;
        this.v = r11;
        this.w = r12;
        this.x = r13;
        if (r16 == null) goto L5;
        i61 r15 = new i61(r16);
    L6:
        this.z = r15;
        this.A = r4;
        this.y = r14;
        this.B = new q90();
        this.C = new ar3(this, 1);
        this.D = new ar3(this, 2);
        this.E = f35.p(null);
        this.J = new gr3[0];
        this.I = new p44[0];
        this.H = new dr3[0];
        this.Z = -9223372036854775807L;
        this.S = 1;
        return;
    L5:
        r15 = new i61("ProgressiveMediaPeriod");
        goto L6
    }

    public final void A() {
        long r0 = this.y;
        if (this.d0 == false) goto L5;
        return;
    L5:
        if (this.L == false) goto L7;
        return;
    L7:
        if (this.K == true) goto L9;
        return;
    L9:
        if (this.P == null) goto L80;
        p44[] r2 = this.I;
        int r3 = r2.length;
        int r5 = 0;
    L12:
        if (r5 >= r3) goto L17;
        if (r2[r5].r() == null) goto L81;
        r5 = r5 + 1;
        goto L12
    L81:
        return;
    L17:
        q90 r4 = this.B;
        monitor-enter(r4);
        r4.b = false;     // Catch: Throwable -> L63
        monitor-exit(r4);
        int r6 = this.I.length;
        sv4[] r7 = new sv4[r6];
        boolean[] r8 = new boolean[r6];
        int r9 = 0;
    L23:
        if (r9 >= r6) goto L56;
        tb1 r10 = this.I[r9].r();
        r10.getClass();
        String r11 = r10.n;
        boolean r12 = lw2.i(r11);
        if (r12 == false) goto L27;
    L30:
        boolean r13 = true;
    L31:
        r8[r9] = r13;
        this.M = r13 | this.M;
        boolean r14 = lw2.j(r11);
        if (r0 == (-9223372036854775807L)) goto L36;
        if (r6 != 1) goto L36;
        if (r14 == false) goto L36;
        boolean r15 = true;
    L37:
        this.N = r15;
        iv1 r16 = this.G;
        if (r16 == null) goto L55;
        int r17 = r16.a;
        if (r12 == false) goto L42;
    L43:
        qv2 r18 = r10.l;
        if (r18 != null) goto L46;
        qv2 r19 = new qv2(new pv2[]{r16});
    L47:
        sb1 r20 = r10.a();
        r20.k = r19;
        r10 = new tb1(r20);
    L48:
        if (r12 == false) goto L55;
        if (r10.h != (-1)) goto L55;
        if (r10.i != (-1)) goto L55;
        if (r17 == (-1)) goto L55;
        sb1 r21 = r10.a();
        r21.h = r17;
        r10 = new tb1(r21);
        goto L55
    L46:
        r19 = r18.a(new pv2[]{r16});
        goto L47
    L42:
        if (this.J[r9].b == false) goto L48;
    L55:
        int r22 = this.p.f(r10);
        sb1 r23 = r10.a();
        r23.N = r22;
        tb1 r24 = new tb1(r23);
        r7[r9] = new sv4(Integer.toString(r9), new tb1[]{r24});
        this.V = r24.t | this.V;
        r9 = r9 + 1;
    L36:
        r15 = false;
        goto L37
    L27:
        if (lw2.l(r11) == true) goto L30;
        r13 = false;
        goto L31
    L56:
        tv4 r25 = new tv4(r7);
        ss0 r26 = new ss0();
        r26.n = r25;
        r26.o = r8;
        int r27 = r25.a;
        r26.p = new boolean[r27];
        r26.q = new boolean[r27];
        this.O = r26;
        if (this.N == true) goto L59;
    L61:
        this.t.u(this.Q, this.P, this.R);
        this.L = true;
        mo2 r1 = this.F;
        r1.getClass();
        r1.b(this);
        return;
    L59:
        if (this.Q != (-9223372036854775807L)) goto L61;
        this.Q = r0;
        this.P = new br3(this, this.P);
    L63:
        th = move-exception;
        throw th;
    }

    public final void B(int r14) {
        v();
        ss0 r0 = this.O;
        boolean[] r1 = (boolean[]) r0.q;
        if (r1[r14] == true) goto L6;
        tb1 r6 = ((tv4) r0.n).a(r14).d[0];
        un2 r3 = new un2(1, lw2.h(r6.n), r6, 0, null, f35.i0(this.Y), -9223372036854775807L);
        ue1 r13 = this.r;
        r13.i(new bt2(r13, r3));
        r1[r14] = true;
        return;
    }

    public final void C(int r5) {
        v();
        if (this.a0 == true) goto L5;
        return;
    L5:
        if (this.M == false) goto L9;
        if (((boolean[]) this.O.o)[r5] == true) goto L9;
        return;
    L9:
        if (this.I[r5].s(false) == true) goto L19;
        this.Z = 0;
        this.a0 = false;
        this.U = true;
        this.Y = 0;
        this.b0 = 0;
        p44[] r6 = this.I;
        int r1 = r6.length;
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L14;
        r6[r2].x(false);
        r2 = r2 + 1;
        goto L12
    L14:
        mo2 r7 = this.F;
        r7.getClass();
        r7.j(this);
        return;
    }

    public final wv4 D(gr3 r6) {
        int r0 = this.I.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        if (r6.equals(this.J[r1]) == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return this.I[r1];
    L10:
        if (this.K == false) goto L13;
        l93.q0("ProgressiveMediaPeriod", "Extractor added new track (id=" + r6.a + ") after finishing tracks.");
        return new tq0();
    L13:
        ww0 r2 = this.p;
        r2.getClass();
        p44 r3 = new p44(this.u, r2, this.s);
        dr3 r4 = new dr3(r3);
        r3.f = this;
        int r5 = r0 + 1;
        gr3[] r7 = (gr3[]) Arrays.copyOf(this.J, r5);
        r7[r0] = r6;
        this.J = r7;
        p44[] r8 = (p44[]) Arrays.copyOf(this.I, r5);
        r8[r0] = r3;
        this.I = r8;
        dr3[] r9 = (dr3[]) Arrays.copyOf(this.H, r5);
        r9[r0] = r4;
        this.H = r9;
        return r4;
    }

    public final void E(m84 r7) {
        if (this.G != null) goto L5;
        m84 r0 = r7;
    L6:
        this.P = r0;
        this.Q = r7.g();
        int r3 = 1;
        if (this.X == false) goto L9;
    L11:
        boolean r1 = false;
    L12:
        this.R = r1;
        if (r1 == false) goto L15;
        r3 = 7;
    L15:
        this.S = r3;
        if (this.L == false) goto L19;
        this.t.u(this.Q, r7, r1);
        return;
    L19:
        A();
        return;
    L9:
        if (r7.g() != (-9223372036854775807L)) goto L11;
        r1 = true;
        goto L12
    L5:
        r0 = new bo(-9223372036854775807L);
        goto L6
    }

    public final void F() {
        z05 r4 = this.A;
        q90 r6 = this.B;
        er3 r0 = new er3(this, this.n, this.o, r4, this, r6);
        if (this.L == false) goto L14;
        rr2.w(z());
        long r2 = this.Q;
        if (r2 != (-9223372036854775807L)) goto L7;
    L10:
        m84 r9 = this.P;
        r9.getClass();
        long r3 = r9.e(this.Z).a.b;
        long r7 = this.Z;
        r0.f.a = r3;
        r0.i = r7;
        r0.h = true;
        int r10 = 0;
        r0.l = false;
        p44[] r5 = this.I;
        int r8 = r5.length;
    L11:
        if (r10 >= r8) goto L13;
        p44 r11 = r5[r10];
        r11.t = this.Z;
        r10 = r10 + 1;
        goto L11
    L13:
        this.Z = -9223372036854775807L;
        goto L14
    L7:
        if (this.Z <= r2) goto L10;
        this.c0 = true;
        this.Z = -9223372036854775807L;
        return;
    L14:
        this.b0 = x();
        int r12 = this.q.D(this.S);
        this.z.u(r0, this, r12);
    }

    public final boolean G() {
        if (this.U == false) goto L5;
        return true;
    L5:
        if (z() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.kd2
    public final void a() {
        p44[] r0 = this.I;
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L9;
        p44 r4 = r0[r2];
        r4.x(true);
        pw0 r5 = r4.h;
        if (r5 == null) goto L8;
        r5.d(r4.e);
        r4.h = null;
        r4.g = null;
    L8:
        r2 = r2 + 1;
        goto L4
    L9:
        z05 r7 = this.A;
        k51 r3 = (k51) r7.p;
        if (r3 == null) goto L12;
        r3.a();
        r7.p = null;
    L12:
        r7.q = null;
    }

    @Override // defpackage.hd2
    public final void b(jd2 r13, long r14, long r16, boolean r18) {
        er3 r15 = (er3) r13;
        yl4 r0 = r15.b;
        ed2 r1 = new ed2(r15.j, r0.p, r0.q, r14, r16, r0.o);
        this.q.getClass();
        this.r.q(r1, 1, -1, null, 0, null, r15.i, this.Q);
        if (r18 == true) goto L12;
        p44[] r17 = this.I;
        int r2 = r17.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L8;
        r17[r3].x(false);
        r3 = r3 + 1;
        goto L5
    L8:
        if (this.W <= 0) goto L13;
        mo2 r19 = this.F;
        r19.getClass();
        r19.j(this);
        return;
    L13:
        return;
    }

    @Override // defpackage.no2
    public final long c(t41[] r9, boolean[] r10, q44[] r11, boolean[] r12, long r13) {
        v();
        ss0 r0 = this.O;
        tv4 r1 = (tv4) r0.n;
        boolean[] r2 = (boolean[]) r0.p;
        int r3 = this.W;
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r9.length) goto L14;
        q44 r6 = r11[r5];
        if (r6 == null) goto L12;
        if (r9[r5] != null) goto L10;
    L11:
        int r7 = ((fr3) r6).n;
        rr2.w(r2[r7]);
        this.W--;
        r2[r7] = false;
        r11[r5] = null;
        goto L12
    L10:
        if (r10[r5] == false) goto L11;
    L12:
        r5 = r5 + 1;
        goto L4
    L14:
        if (this.T == false) goto L19;
        if (r3 != 0) goto L17;
    L16:
        boolean r14 = true;
    L23:
        int r8 = 0;
    L25:
        if (r8 >= r9.length) goto L48;
        if (r11[r8] != null) goto L46;
        t41 r15 = r9[r8];
        if (r15 == null) goto L46;
        if (r15.length() != 1) goto L33;
        boolean r16 = true;
    L34:
        rr2.w(r16);
        if (r15.i(0) != 0) goto L37;
        boolean r17 = true;
    L38:
        rr2.w(r17);
        int r18 = r1.b(r15.c());
        rr2.w(!r2[r18]);
        this.W++;
        r2[r18] = true;
        this.V = r15.m().t | this.V;
        r11[r8] = new fr3(this, r18);
        r12[r8] = true;
        if (r14 == true) goto L46;
        p44 r19 = this.I[r18];
        if (r19.o() != 0) goto L43;
    L45:
        r14 = false;
        goto L46
    L43:
        if (r19.z(true, r13) == true) goto L45;
        r14 = true;
        goto L46
    L37:
        r17 = false;
        goto L38
    L33:
        r16 = false;
    L46:
        r8 = r8 + 1;
        goto L25
    L48:
        if (this.W != 0) goto L58;
        this.a0 = false;
        this.U = false;
        this.V = false;
        i61 r20 = this.z;
        if (r20.l() == false) goto L55;
        p44[] r110 = this.I;
        int r111 = r110.length;
    L52:
        if (r4 >= r111) goto L54;
        r110[r4].j();
        r4 = r4 + 1;
        goto L52
    L54:
        r20.d();
    L66:
        this.T = true;
        return r13;
    L55:
        this.c0 = false;
        p44[] r21 = this.I;
        int r112 = r21.length;
        int r113 = 0;
    L56:
        if (r113 >= r112) goto L66;
        r21[r113].x(false);
        r113 = r113 + 1;
        goto L56
    L58:
        if (r14 == false) goto L66;
        r13 = i(r13);
    L61:
        if (r4 >= r11.length) goto L66;
        if (r11[r4] == null) goto L65;
        r12[r4] = true;
    L65:
        r4 = r4 + 1;
    L17:
        r14 = false;
        goto L23
    L19:
        if (r13 == 0) goto L17;
        if (this.N == true) goto L17;
        goto L17
    }

    @Override // defpackage.da4
    public final long d() {
        return q();
    }

    @Override // defpackage.no2
    public final long e(long r9, n84 r11) {
        v();
        if (this.P.b() == true) goto L6;
        return 0;
    L6:
        l84 r8 = this.P.e(r9);
        return r11.a(r9, r8.a.a, r8.b.a);
    }

    @Override // defpackage.da4
    public final boolean f() {
        if (this.z.l() == false) goto L14;
        q90 r1 = this.B;
        monitor-enter(r1);
        boolean r0 = r1.b;     // Catch: Throwable -> L11
        monitor-exit(r1);
        if (r0 == false) goto L18;
        return true;
    L18:
        return false;
    L11:
        th = move-exception;
        throw th;
    L14:
        return false;
    }

    @Override // defpackage.hd2
    public final void g(jd2 r14, long r15, long r17) {
        er3 r16 = (er3) r14;
        if (this.Q == (-9223372036854775807L)) goto L5;
    L11:
        yl4 r0 = r16.b;
        ed2 r2 = new ed2(r16.j, r0.p, r0.q, r15, r17, r0.o);
        this.q.getClass();
        long r9 = r16.i;
        long r11 = this.Q;
        this.r.r(r2, 1, -1, null, 0, null, r9, r11);
        this.c0 = true;
        mo2 r18 = this.F;
        r18.getClass();
        r18.j(this);
        return;
    L5:
        if (this.P == null) goto L11;
        long r3 = y(true);
        if (r3 != Long.MIN_VALUE) goto L9;
        long r4 = 0;
    L10:
        this.Q = r4;
        m84 r1 = this.P;
        boolean r5 = this.R;
        this.t.u(r4, r1, r5);
        goto L11
    L9:
        r4 = r3 + 10000;
        goto L10
    }

    @Override // defpackage.no2
    public final void h() {
        int r0 = this.q.D(this.S);
        i61 r1 = this.z;
        IOException r2 = (IOException) r1.q;
        if (r2 != null) goto L23;
        id2 r3 = (id2) r1.p;
        if (r3 == null) goto L16;
        if (r0 != Integer.MIN_VALUE) goto L9;
        r0 = r3.n;
    L9:
        IOException r4 = r3.r;
        if (r4 == null) goto L16;
        if (r3.s <= r0) goto L16;
        throw r4;
    L16:
        if (this.c0 == true) goto L18;
        return;
    L18:
        if (this.L == false) goto L21;
        return;
    L21:
        throw ParserException.a(null, "Loading finished before preparation is complete.");
    L23:
        throw r2;
    }

    @Override // defpackage.no2
    public final long i(long r10) {
        v();
        boolean[] r0 = (boolean[]) this.O.o;
        if (this.P.b() == true) goto L6;
        r10 = 0;
    L6:
        int r1 = 0;
        this.U = false;
        if (this.Y != r10) goto L9;
        boolean r2 = true;
    L10:
        this.Y = r10;
        if (z() == false) goto L14;
        this.Z = r10;
        return r10;
    L14:
        int r3 = this.S;
        i61 r5 = this.z;
        if (r3 != 7) goto L17;
    L39:
        this.a0 = false;
        this.Z = r10;
        this.c0 = false;
        this.V = false;
        if (r5.l() == false) goto L46;
        p44[] r9 = this.I;
        int r4 = r9.length;
    L42:
        if (r1 >= r4) goto L44;
        r9[r1].j();
        r1 = r1 + 1;
        goto L42
    L44:
        r5.d();
        return r10;
    L46:
        r5.q = null;
        p44[] r11 = this.I;
        int r6 = r11.length;
        int r7 = 0;
    L47:
        if (r7 >= r6) goto L49;
        r11[r7].x(false);
        r7 = r7 + 1;
    L49:
        return r10;
    L17:
        if (this.c0 == false) goto L19;
    L20:
        int r8 = this.I.length;
        int r12 = 0;
    L21:
        if (r12 >= r8) goto L49;
        p44 r13 = this.I[r12];
        if (this.H[r12].d.get() != cr3.n) goto L38;
        if (r13.o() != 0) goto L29;
        if (r2 == true) goto L38;
    L29:
        if (this.N == false) goto L31;
        boolean r14 = r13.y(r13.q);
    L32:
        if (r14 == true) goto L38;
        if (r0[r12] == true) goto L39;
        if (this.M == true) goto L38;
    L31:
        r14 = r13.z(this.c0, r10);
    L38:
        r12 = r12 + 1;
        goto L21
    L19:
        if (r5.l() == false) goto L39;
    L9:
        r2 = false;
        goto L10
    }

    @Override // defpackage.hd2
    public final void j(jd2 r18, long r19, long r21, int r23) {
        er3 r1 = (er3) r18;
        yl4 r2 = r1.b;
        if (r23 != 0) goto L5;
        ed2 r6 = new ed2(r19, r1.j);
    L6:
        long r12 = r1.i;
        long r14 = this.Q;
        this.r.u(r6, 1, -1, null, 0, null, r12, r14, r23);
        return;
    L5:
        r6 = new ed2(r1.j, r2.p, r2.q, r19, r21, r2.o);
        goto L6
    }

    @Override // defpackage.no2
    public final void k(boolean r6, long r7) {
        if (this.N == true) goto L11;
        v();
        if (z() == true) goto L13;
        boolean[] r0 = (boolean[]) this.O.p;
        int r1 = this.I.length;
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L14;
        this.I[r2].i(r7, r6, r0[r2]);
        r2 = r2 + 1;
        goto L9
    L14:
        return;
    L13:
        return;
    }

    @Override // defpackage.no2
    public final long l() {
        if (this.V == false) goto L7;
        this.V = false;
        return this.Y;
    L7:
        if (this.U == true) goto L9;
        return -9223372036854775807L;
    L9:
        if (this.c0 == false) goto L11;
    L12:
        this.U = false;
        return this.Y;
    L11:
        if (x() > this.b0) goto L12;
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 r6, long r7) {
        this.F = r6;
        tb1 r8 = this.x;
        if (r8 == null) goto L6;
        t(0, 3).g(r8);
        E(new ux1(-9223372036854775807L, new long[]{0}, new long[]{0}));
        p();
        this.Z = r7;
        return;
    L6:
        this.B.d();
        F();
    }

    @Override // defpackage.no2
    public final tv4 n() {
        v();
        return (tv4) this.O.n;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r2) {
        if (this.c0 == true) goto L21;
        i61 r3 = this.z;
        if (((IOException) r3.q) == null) goto L8;
        return false;
    L8:
        if (this.a0 == false) goto L10;
        return false;
    L10:
        if (this.L == true) goto L14;
        if (this.x != null) goto L14;
    L16:
        boolean r0 = this.B.d();
        if (r3.l() == true) goto L20;
        F();
        return true;
    L20:
        return r0;
    L14:
        if (this.W != 0) goto L16;
        return false;
    L21:
        return false;
    }

    @Override // defpackage.m51
    public final void p() {
        this.K = true;
        this.E.post(this.C);
    }

    @Override // defpackage.da4
    public final long q() {
        v();
        if (this.c0 == false) goto L5;
    L45:
        return Long.MIN_VALUE;
    L5:
        if (this.W == 0) goto L45;
        if (z() == false) goto L12;
        return this.Z;
    L12:
        if (this.M == false) goto L36;
        int r0 = this.I.length;
        int r6 = 0;
        long r7 = Long.MAX_VALUE;
    L14:
        if (r6 >= r0) goto L38;
        ss0 r9 = this.O;
        if (((boolean[]) r9.o)[r6] == false) goto L35;
        if (((boolean[]) r9.p)[r6] == false) goto L35;
        p44 r10 = this.I[r6];
        monitor-enter(r10);
        boolean r11 = r10.w;     // Catch: Throwable -> L32
        monitor-exit(r10);
        if (r11 == true) goto L35;
        p44 r12 = this.I[r6];
        monitor-enter(r12);
        long r13 = r12.v;     // Catch: Throwable -> L29
        monitor-exit(r12);
        r7 = Math.min(r7, r13);
    L29:
        th = move-exception;
        throw th;
    L32:
        th = move-exception;
        throw th;
    L35:
        r6 = r6 + 1;
    L38:
        if (r7 != Long.MAX_VALUE) goto L41;
        r7 = y(false);
    L41:
        if (r7 == Long.MIN_VALUE) goto L43;
        return r7;
    L43:
        return this.Y;
    L36:
        r7 = Long.MAX_VALUE;
        goto L38
    }

    @Override // defpackage.o44
    public final void r() {
        this.E.post(this.C);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 r17, long r18, long r20, IOException r22, int r23) {
        er3 r1 = (er3) r17;
        yl4 r2 = r1.b;
        ed2 r3 = new ed2(r1.j, r2.p, r2.q, r18, r20, r2.o);
        String r4 = f35.a;
        this.q.getClass();
        Throwable r5 = r22;
    L4:
        if (r5 == null) goto L20;
        if ((r5 instanceof ParserException) == true) goto L19;
        if ((r5 instanceof FileNotFoundException) == true) goto L19;
        if ((r5 instanceof HttpDataSource$CleartextNotPermittedException) == true) goto L19;
        if ((r5 instanceof Loader$UnexpectedLoaderException) == true) goto L19;
        if ((r5 instanceof DataSourceException) == false) goto L18;
        if (((DataSourceException) r5).n == 2008) goto L19;
    L18:
        r5 = r5.getCause();
    L19:
        long r7 = -9223372036854775807L;
    L21:
        boolean r9 = false;
        if (r7 != (-9223372036854775807L)) goto L24;
        dd2 r6 = i61.t;
    L46:
        int r8 = r6.a;
        if (r8 == 0) goto L49;
        if (r8 == 1) goto L49;
    L50:
        long r10 = r1.i;
        long r12 = this.Q;
        this.r.s(r3, 1, -1, null, 0, null, r10, r12, r22, !r9);
        return r6;
    L49:
        r9 = true;
        goto L50
    L24:
        int r11 = x();
        if (r11 <= this.b0) goto L27;
        int r13 = 1;
    L29:
        if (this.X == true) goto L44;
        m84 r14 = this.P;
        if (r14 == null) goto L36;
        if (r14.g() != (-9223372036854775807L)) goto L44;
    L36:
        if (this.L == true) goto L38;
    L40:
        this.U = this.L;
        this.Y = 0;
        this.b0 = 0;
        p44[] r15 = this.I;
        int r16 = r15.length;
        int r19 = 0;
    L41:
        if (r19 >= r16) goto L43;
        r15[r19].x(false);
        r19 = r19 + 1;
        goto L41
    L43:
        r1.f.a = 0;
        r1.i = 0;
        r1.h = true;
        r1.l = false;
    L45:
        r6 = new dd2(r13, r7, false);
        goto L46
    L38:
        if (G() == true) goto L40;
        this.a0 = true;
        r6 = i61.s;
    L44:
        this.b0 = r11;
        goto L45
    L27:
        r13 = 0;
        goto L29
    L20:
        r7 = Math.min((r23 - 1) * 1000, SmartSession.MAX_SONGS);
        goto L21
    }

    @Override // defpackage.m51
    public final wv4 t(int r2, int r3) {
        return D(new gr3(r2, false));
    }

    @Override // defpackage.da4
    public final void u(long r1) {
    }

    public final void v() {
        rr2.w(this.L);
        this.O.getClass();
        this.P.getClass();
    }

    @Override // defpackage.m51
    public final void w(m84 r3) {
        ur2 r0 = new ur2(13, this, r3);
        this.E.post(r0);
    }

    public final int x() {
        p44[] r5 = this.I;
        int r0 = r5.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        p44 r3 = r5[r1];
        r2 = r2 + (r3.q + r3.p);
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public final long y(boolean r7) {
        long r0 = Long.MIN_VALUE;
        int r2 = 0;
    L4:
        if (r2 >= this.I.length) goto L17;
        if (r7 == true) goto L8;
        ss0 r3 = this.O;
        r3.getClass();
        if (((boolean[]) r3.p)[r2] == true) goto L8;
    L13:
        r2 = r2 + 1;
    L8:
        p44 r4 = this.I[r2];
        monitor-enter(r4);
        long r5 = r4.v;     // Catch: Throwable -> L14
        monitor-exit(r4);
        r0 = Math.max(r0, r5);
    L14:
        th = move-exception;
        throw th;
    L17:
        return r0;
    }

    public final boolean z() {
        if (this.Z == (-9223372036854775807L)) goto L6;
        return true;
    L6:
        return false;
    }
}
