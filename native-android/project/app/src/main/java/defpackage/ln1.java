package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 implements hd2, kd2, da4, m51, o44 {
    public static final Set l0 = null;
    public final ArrayList A;
    public final List B;
    public final in1 C;
    public final in1 D;
    public final Handler E;
    public final ArrayList F;
    public final Map G;
    public s20 H;
    public kn1[] I;
    public int[] J;
    public final HashSet K;
    public final SparseIntArray L;
    public jn1 M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public tb1 S;
    public tb1 T;
    public boolean U;
    public tv4 V;
    public Set W;
    public int[] X;
    public int Y;
    public boolean Z;
    public boolean[] a0;
    public boolean[] b0;
    public long c0;
    public long d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public long i0;
    public ow0 j0;
    public nm1 k0;
    public final String n;
    public final int o;
    public final om1 p;
    public final km1 q;
    public final n9 r;
    public final tb1 s;
    public final ww0 t;
    public final sw0 u;
    public final i80 v;
    public final i61 w;
    public final ue1 x;
    public final int y;
    public final mf4 z;

    static {
        l0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [in1] */
    /* JADX WARN: Type inference failed for: r2v14, types: [in1] */
    public ln1(String r2, int r3, om1 r4, km1 r5, Map r6, n9 r7, long r8, tb1 r10, ww0 r11, sw0 r12, i80 r13, ue1 r14, int r15, ty3 r16) {
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
        this.G = r6;
        this.r = r7;
        this.s = r10;
        this.t = r11;
        this.u = r12;
        this.v = r13;
        this.x = r14;
        this.y = r15;
        if (r16 == null) goto L5;
        i61 r9 = new i61(r16);
    L6:
        this.w = r9;
        mf4 r17 = new mf4(4);
        r17.p = null;
        final int r18 = 0;
        r17.o = false;
        r17.q = null;
        this.z = r17;
        this.J = new int[0];
        Set r19 = l0;
        this.K = new HashSet(r19.size());
        this.L = new SparseIntArray(r19.size());
        this.I = new kn1[0];
        this.b0 = new boolean[0];
        this.a0 = new boolean[0];
        ArrayList r20 = new ArrayList();
        this.A = r20;
        this.B = Collections.unmodifiableList(r20);
        this.F = new ArrayList();
        this.C = new in1(this, r18);
        final int r21 = 1;
        this.D = new in1(this, r21);
        this.E = f35.p(null);
        this.c0 = r8;
        this.d0 = r8;
        return;
    L5:
        r9 = new i61("Loader:HlsSampleStreamWrapper");
        goto L6
    }

    public static tb1 A(tb1 r7, tb1 r8, boolean r9) {
        if (r7 != null) goto L4;
        return r8;
    L4:
        String r0 = r7.k;
        String r1 = r8.n;
        int r2 = lw2.h(r1);
        if (f35.u(r2, r0) != 1) goto L7;
        String r3 = f35.v(r2, r0);
        r1 = lw2.d(r3);
    L8:
        sb1 r4 = r8.a();
        r4.a = r7.a;
        r4.b = r7.b;
        r4.c = yw1.k(r7.c);
        r4.d = r7.d;
        r4.e = r7.e;
        r4.f = r7.f;
        if (r9 == false) goto L11;
        int r6 = r7.h;
    L12:
        r4.h = r6;
        if (r9 == false) goto L15;
        int r10 = r7.i;
    L16:
        r4.i = r10;
        r4.j = r3;
        if (r2 != 2) goto L19;
        r4.t = r7.u;
        r4.u = r7.v;
        r4.x = r7.y;
    L19:
        if (r1 == null) goto L21;
        r4.m = lw2.m(r1);
    L21:
        int r11 = r7.F;
        if (r11 == (-1)) goto L25;
        if (r2 != 1) goto L25;
        r4.E = r11;
    L25:
        qv2 r12 = r7.l;
        if (r12 == null) goto L32;
        qv2 r13 = r8.l;
        if (r13 == null) goto L30;
        r12 = r13.b(r12);
    L30:
        r4.k = r12;
    L32:
        return new tb1(r4);
    L15:
        r10 = -1;
        goto L16
    L11:
        r6 = -1;
        goto L12
    L7:
        r3 = lw2.b(r0, r1);
        goto L8
    }

    public static int D(int r3) {
        if (r3 != 1) goto L5;
        return 2;
    L5:
        if (r3 == 2) goto L10;
        if (r3 == 3) goto L9;
        return 0;
    L9:
        return 1;
    L10:
        return 3;
    }

    public static tq0 y(int r2, int r3) {
        l93.q0("HlsSampleStreamWrapper", "Unmapped track with id " + r2 + " of type " + r3);
        return new tq0();
    }

    public final void B(int r18) {
        boolean r2 = true;
        rr2.w(!this.w.l());
        int r1 = r18;
    L3:
        ArrayList r3 = this.A;
        if (r1 >= r3.size()) goto L9;
        if (x(r1) == true) goto L10;
        r1 = r1 + 1;
    L10:
        if (r1 != (-1)) goto L12;
        return;
    L12:
        long r4 = C().h;
        nm1 r6 = (nm1) r3.get(r1);
        f35.X(r3, r1, r3.size());
        int r7 = 0;
    L14:
        if (r7 >= this.I.length) goto L44;
        int r8 = r6.e(r7);
        kn1 r9 = this.I[r7];
        m44 r10 = r9.a;
        long r11 = r9.k(r8);
        int r12 = r10.b;
        n9 r13 = r10.a;
        if (r11 > r10.g) goto L18;
        boolean r14 = r2;
    L19:
        rr2.l(r14);
        r10.g = r11;
        if (r11 == 0) goto L37;
        ru r15 = r10.d;
        if (r11 == r15.n) goto L37;
    L24:
        long r5 = r10.g;
        long r16 = r15.o;
        ru r17 = (ru) r15.q;
        if (r5 <= r16) goto L27;
        r15 = r17;
        goto L24
    L27:
        r17.getClass();
        if (((m9) r17.p) == null) goto L31;
        r13.a(r17);
        r17.p = null;
        r17.q = null;
    L31:
        ru r19 = new ru(r12, r15.o);
        r15.q = r19;
        if (r10.g != r15.o) goto L34;
        r15 = r19;
    L34:
        r10.f = r15;
        if (r10.e != r17) goto L42;
        r10.e = r19;
    L42:
        r7 = r7 + 1;
        r2 = true;
    L37:
        ru r20 = r10.d;
        if (((m9) r20.p) == null) goto L41;
        r13.a(r20);
        r20.p = null;
        r20.q = null;
    L41:
        ru r21 = new ru(r12, r10.g);
        r10.d = r21;
        r10.e = r21;
        r10.f = r21;
        goto L42
    L18:
        r14 = false;
        goto L19
    L44:
        if (r3.isEmpty() == false) goto L47;
        this.d0 = this.c0;
    L48:
        this.g0 = false;
        un2 r22 = new un2(1, this.N, null, 3, null, f35.i0(r6.g), f35.i0(r4));
        ue1 r0 = this.x;
        mt2 r23 = (mt2) r0.p;
        r23.getClass();
        r0.i(new eg0(r0, r23, r22, 10));
        return;
    L47:
        ((nm1) te5.w(r3)).J = true;
        goto L48
    L9:
        r1 = -1;
        goto L10
    }

    public final nm1 C() {
        ArrayList r1 = this.A;
        return (nm1) r1.get(r1.size() - 1);
    }

    public final boolean E() {
        if (this.d0 == (-9223372036854775807L)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        if (this.U == false) goto L5;
        return;
    L5:
        if (this.X == null) goto L7;
        return;
    L7:
        if (this.P == false) goto L123;
        kn1[] r1 = this.I;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L10:
        if (r4 >= r2) goto L15;
        if (r1[r4].r() == null) goto L124;
        r4 = r4 + 1;
        goto L10
    L124:
        return;
    L15:
        tv4 r5 = this.V;
        if (r5 == null) goto L42;
        int r6 = r5.a;
        int[] r7 = new int[r6];
        this.X = r7;
        Arrays.fill(r7, -1);
        int r8 = 0;
    L18:
        if (r8 >= r6) goto L39;
        int r9 = 0;
    L20:
        kn1[] r10 = this.I;
        if (r9 >= r10.length) goto L38;
        tb1 r11 = r10[r9].r();
        r11.getClass();
        tb1 r12 = this.V.a(r8).d[0];
        String r13 = r11.n;
        String r14 = r12.n;
        int r15 = lw2.h(r13);
        if (r15 == 3) goto L28;
        if (r15 != lw2.h(r14)) goto L37;
    L36:
        this.X[r8] = r9;
    L37:
        r9 = r9 + 1;
        goto L20
    L28:
        if (Objects.equals(r13, r14) == false) goto L37;
        if ("application/cea-608".equals(r13) == true) goto L35;
        if ("application/cea-708".equals(r13) == false) goto L36;
    L35:
        if (r11.K != r12.K) goto L37;
    L38:
        r8 = r8 + 1;
        goto L18
    L39:
        ArrayList r0 = this.F;
        int r16 = r0.size();
    L40:
        if (r3 >= r16) goto L125;
        Object r17 = r0.get(r3);
        r3 = r3 + 1;
        ((hn1) r17).a();
        goto L40
    L125:
        return;
    L42:
        int r18 = this.I.length;
        int r19 = 0;
        int r20 = -1;
        int r21 = -2;
    L43:
        int r22 = 1;
        if (r19 >= r18) goto L62;
        tb1 r110 = this.I[r19].r();
        r110.getClass();
        String r111 = r110.n;
        if (lw2.l(r111) == false) goto L49;
        r22 = 2;
    L56:
        if (D(r22) <= D(r21)) goto L58;
        r20 = r19;
        r21 = r22;
    L61:
        r19 = r19 + 1;
        goto L43
    L58:
        if (r22 != r21) goto L61;
        if (r20 == (-1)) goto L61;
        r20 = -1;
        goto L61
    L49:
        if (lw2.i(r111) == true) goto L56;
        if (lw2.k(r111) == false) goto L54;
        r22 = 3;
        goto L56
    L54:
        r22 = -2;
        goto L56
    L62:
        sv4 r23 = this.q.h;
        int r24 = r23.a;
        this.Y = -1;
        this.X = new int[r18];
        int r25 = 0;
    L63:
        if (r25 >= r18) goto L65;
        this.X[r25] = r25;
        r25 = r25 + 1;
        goto L63
    L65:
        sv4[] r26 = new sv4[r18];
        int r27 = 0;
    L66:
        if (r27 >= r18) goto L91;
        tb1 r112 = this.I[r27].r();
        r112.getClass();
        String r113 = this.n;
        tb1 r114 = this.s;
        if (r27 != r20) goto L80;
        tb1[] r115 = new tb1[r24];
        int r116 = r3;
    L70:
        if (r116 >= r24) goto L79;
        tb1 r28 = r23.d[r116];
        if (r21 != 1) goto L75;
        if (r114 == null) goto L75;
        r28 = r28.d(r114);
    L75:
        if (r24 != 1) goto L77;
        tb1 r29 = r112.d(r28);
    L78:
        r115[r116] = r29;
        r116 = r116 + 1;
        goto L70
    L77:
        r29 = A(r28, r112, true);
        goto L78
    L79:
        r26[r27] = new sv4(r113, r115);
        this.Y = r27;
        int r117 = 0;
    L90:
        r27 = r27 + 1;
        r3 = r117;
        goto L66
    L80:
        if (r21 == 2) goto L82;
    L84:
        r114 = null;
    L85:
        StringBuilder r30 = b11.s(r113, ":muxed:");
        if (r27 >= r20) goto L88;
        int r118 = r27;
    L89:
        r30.append(r118);
        r117 = 0;
        r26[r27] = new sv4(r30.toString(), new tb1[]{A(r114, r112, false)});
        goto L90
    L88:
        r118 = r27 - 1;
        goto L89
    L82:
        if (lw2.i(r112.n) == false) goto L84;
    L91:
        int r119 = r3;
        this.V = z(r26);
        if (this.W != null) goto L94;
        boolean r31 = 1;
    L95:
        rr2.w(r31);
        this.W = Collections.EMPTY_SET;
        this.Q = true;
        this.p.k();
        return;
    L94:
        r31 = r119;
        goto L95
    }

    public final void G() {
        i61 r0 = this.w;
        IOException r1 = (IOException) r0.q;
        if (r1 != null) goto L35;
        id2 r2 = (id2) r0.p;
        if (r2 == null) goto L12;
        int r3 = r2.n;
        IOException r4 = r2.r;
        if (r4 == null) goto L12;
        if (r2.s <= r3) goto L12;
        throw r4;
    L12:
        km1 r5 = this.q;
        BehindLiveWindowException r6 = r5.n;
        if (r6 != null) goto L34;
        Uri r7 = r5.o;
        if (r7 != null) goto L17;
        return;
    L17:
        if (r7.equals(r5.p) == false) goto L36;
        al0 r8 = r5.g;
        Uri r9 = r5.o;
        zk0 r10 = (zk0) r8.q.get(r9);
        i61 r11 = r10.o;
        IOException r12 = (IOException) r11.q;
        if (r12 != null) goto L32;
        id2 r13 = (id2) r11.p;
        if (r13 == null) goto L28;
        int r14 = r13.n;
        IOException r15 = r13.r;
        if (r15 == null) goto L28;
        if (r13.s <= r14) goto L28;
        throw r15;
    L28:
        IOException r16 = r10.w;
        if (r16 == null) goto L37;
        throw r16;
    L37:
        return;
    L32:
        throw r12;
    L36:
        return;
    L34:
        throw r6;
    L35:
        throw r1;
    }

    public final void H(sv4[] r6, int... r7) {
        this.V = z(r6);
        this.W = new HashSet();
        int r8 = r7.length;
        int r1 = 0;
    L3:
        if (r1 >= r8) goto L5;
        this.W.add(this.V.a(r7[r1]));
        r1 = r1 + 1;
        goto L3
    L5:
        this.Y = 0;
        this.E.post(new qa1(3, this.p));
        this.Q = true;
    }

    public final void I() {
        kn1[] r0 = this.I;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r0[r3].x(this.e0);
        r3 = r3 + 1;
        goto L3
    L5:
        this.e0 = false;
    }

    public final boolean J(boolean r12, long r13) {
        this.c0 = r13;
        if (E() == false) goto L6;
        this.d0 = r13;
        return true;
    L6:
        boolean r0 = this.q.q;
        ArrayList r3 = this.A;
        int r4 = 0;
        if (r0 == false) goto L15;
        int r1 = 0;
    L10:
        if (r1 >= r3.size()) goto L15;
        nm1 r5 = (nm1) r3.get(r1);
        if (r5.g == r13) goto L17;
        r1 = r1 + 1;
    L17:
        if (this.P == false) goto L42;
        if (r12 == true) goto L42;
        if (r3.isEmpty() == true) goto L42;
        int r14 = this.I.length;
        int r2 = 0;
    L22:
        if (r2 >= r14) goto L41;
        kn1 r6 = this.I[r2];
        if (r5 == null) goto L26;
        boolean r7 = r6.y(r5.e(r2));
    L34:
        if (r7 == true) goto L40;
        if (this.b0[r2] == true) goto L42;
        if (this.Z == false) goto L42;
    L40:
        r2 = r2 + 1;
        goto L22
    L26:
        long r8 = d();
        if (r8 != Long.MIN_VALUE) goto L29;
    L32:
        boolean r9 = true;
    L33:
        r7 = r6.z(r9, r13);
        goto L34
    L29:
        if (r13 < r8) goto L32;
        r9 = false;
        goto L33
    L41:
        return false;
    L42:
        this.d0 = r13;
        this.g0 = false;
        r3.clear();
        i61 r15 = this.w;
        if (r15.l() == true) goto L45;
        r15.q = null;
        I();
        return true;
    L45:
        if (this.P == false) goto L49;
        kn1[] r11 = this.I;
        int r16 = r11.length;
    L47:
        if (r4 >= r16) goto L49;
        r11[r4].j();
        r4 = r4 + 1;
    L49:
        r15.d();
        return true;
    L15:
        r5 = null;
        goto L17
    }

    @Override // defpackage.kd2
    public final void a() {
        kn1[] r5 = this.I;
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        kn1 r2 = r5[r1];
        r2.x(true);
        pw0 r3 = r2.h;
        if (r3 == null) goto L7;
        r3.d(r2.e);
        r2.h = null;
        r2.g = null;
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.hd2
    public final void b(jd2 r13, long r14, long r16, boolean r18) {
        s20 r15 = (s20) r13;
        this.H = null;
        long r2 = r15.a;
        ii0 r3 = r15.b;
        yl4 r0 = r15.i;
        ed2 r1 = new ed2(r3, r0.p, r0.q, r14, r16, r0.o);
        this.v.getClass();
        int r4 = r15.c;
        tb1 r5 = r15.d;
        int r6 = r15.e;
        Object r7 = r15.f;
        long r8 = r15.g;
        long r10 = r15.h;
        this.x.q(r1, r4, this.o, r5, r6, r7, r8, r10);
        if (r18 == false) goto L5;
        return;
    L5:
        if (E() == false) goto L7;
    L8:
        I();
    L10:
        if (this.R <= 0) goto L14;
        this.p.j(this);
        return;
    L14:
        return;
    L7:
        if (this.R != 0) goto L10;
        goto L8
    }

    @Override // defpackage.da4
    public final long d() {
        if (E() == false) goto L7;
        return this.d0;
    L7:
        if (this.g0 == false) goto L11;
        return Long.MIN_VALUE;
    L11:
        return C().h;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.w.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hd2
    public final void g(jd2 r13, long r14, long r16) {
        s20 r15 = (s20) r13;
        this.H = null;
        if ((r15 instanceof gm1) == false) goto L5;
        gm1 r0 = (gm1) r15;
        byte[] r1 = r0.j;
        km1 r2 = this.q;
        r2.m = r1;
        zh0 r3 = r2.j;
        Uri r4 = r0.b.a;
        byte[] r5 = r0.l;
        r5.getClass();
        ef1 r6 = (ef1) r3.o;
        r4.getClass();
        byte[] r7 = (byte[]) r6.put(r4, r5);
    L5:
        long r8 = r15.a;
        ii0 r9 = r15.b;
        yl4 r10 = r15.i;
        ed2 r11 = new ed2(r9, r10.p, r10.q, r14, r16, r10.o);
        this.v.getClass();
        int r12 = r15.c;
        tb1 r17 = r15.d;
        int r18 = r15.e;
        Object r19 = r15.f;
        long r20 = r15.g;
        long r110 = r15.h;
        this.x.r(r11, r12, this.o, r17, r18, r19, r20, r110);
        if (this.Q == true) goto L9;
        od2 r111 = new od2();
        r111.a = this.c0;
        o(new pd2(r111));
        return;
    L9:
        this.p.j(this);
    }

    @Override // defpackage.hd2
    public final void j(jd2 r18, long r19, long r21, int r23) {
        s20 r1 = (s20) r18;
        if (r23 != 0) goto L5;
        long r3 = r1.a;
        ed2 r6 = new ed2(r19, r1.b);
    L6:
        int r7 = r1.c;
        tb1 r9 = r1.d;
        int r10 = r1.e;
        Object r11 = r1.f;
        long r12 = r1.g;
        long r14 = r1.h;
        this.x.u(r6, r7, this.o, r9, r10, r11, r12, r14, r23);
        return;
    L5:
        long r2 = r1.a;
        ii0 r5 = r1.b;
        yl4 r4 = r1.i;
        r6 = new ed2(r5, r4.p, r4.q, r19, r21, r4.o);
        goto L6
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.da4
    public final boolean o(pd2 r67) {
        ArrayList r1 = this.A;
        mf4 r2 = this.z;
        i61 r3 = this.w;
        if (this.g0 == true) goto L278;
        if (r3.l() == true) goto L278;
        if (((IOException) r3.q) == null) goto L9;
        return false;
    L9:
        long r6 = -9223372036854775807L;
        if (E() == false) goto L15;
        List r4 = Collections.EMPTY_LIST;
        long r8 = this.d0;
        kn1[] r10 = this.I;
        int r11 = r10.length;
        int r12 = 0;
    L12:
        if (r12 >= r11) goto L14;
        r10[r12].t = this.d0;
        r12 = r12 + 1;
        goto L12
    L14:
        List r13 = r4;
        long r16 = -9223372036854775807L;
        long r14 = r8;
        long r27 = r14;
    L40:
        r2.p = null;
        r2.o = false;
        r2.q = null;
        km1 r5 = this.q;
        if (this.Q == false) goto L43;
    L46:
        boolean r29 = true;
    L47:
        zh0 r7 = r5.j;
        Uri[] r9 = r5.e;
        al0 r15 = r5.g;
        if (r13.isEmpty() == false) goto L50;
        nm1 r17 = null;
    L51:
        if (r17 != null) goto L54;
        int r18 = -1;
    L53:
        List r20 = r13;
        long r19 = r67.a;
        long r22 = r14 - r19;
        int r24 = r18;
        long r21 = r5.s;
        if (r21 == r16) goto L58;
        long r23 = r21 - r19;
    L59:
        if (r17 != null) goto L61;
    L67:
        long r25 = r23;
        Uri[] r110 = r9;
        al0 r32 = r15;
    L66:
        long r26 = r22;
        long r28 = r25;
    L68:
        xj2[] r111 = r5.a(r17, r14);
        long r30 = r14;
        nm1 r210 = r17;
        Uri[] r31 = r110;
        al0 r33 = r32;
        ArrayList r34 = r1;
        r5.r.b(r19, r26, r28, r20, r111);
        int r35 = r5.r.l();
        if (r24 == r35) goto L71;
        boolean r211 = true;
    L72:
        Uri r36 = r31[r35];
        if (r33.d(r36) == true) goto L75;
        r2.q = r36;
        r5.p = r36;
        mf4 r37 = r2;
    L233:
        boolean r0 = r37.o;
        s20 r38 = (s20) r37.p;
        Uri r39 = (Uri) r37.q;
        if (r0 == false) goto L238;
        this.d0 = r16;
        this.g0 = true;
        return true;
    L238:
        if (r38 != null) goto L244;
        if (r39 == null) goto L242;
        ((zk0) ((pm1) this.p.o).o.q.get(r39)).d(true);
        return false;
    L242:
        return false;
    L244:
        if ((r38 instanceof nm1) == false) goto L275;
        nm1 r40 = (nm1) r38;
        if (r34.isEmpty() == false) goto L249;
    L247:
        ArrayList r41 = r34;
    L266:
        this.k0 = r40;
        this.S = r40.d;
        this.d0 = -9223372036854775807L;
        r41.add(r40);
        uw1 r42 = yw1.j();
        kn1[] r43 = this.I;
        int r44 = r43.length;
        int r45 = 0;
    L267:
        if (r45 >= r44) goto L269;
        kn1 r46 = r43[r45];
        r42.c(Integer.valueOf(r46.q + r46.p));
        r45 = r45 + 1;
        goto L267
    L269:
        gy3 r47 = r42.f();
        r40.D = this;
        r40.I = r47;
        kn1[] r48 = this.I;
        int r49 = r48.length;
        int r50 = 0;
    L270:
        if (r50 >= r49) goto L275;
        kn1 r51 = r48[r50];
        r51.getClass();
        r51.C = r40.k;
        if (r40.L == false) goto L274;
        r51.G = true;
    L274:
        r50 = r50 + 1;
        goto L270
    L249:
        if (C().f() == true) goto L253;
        B(r34.size() - 1);
    L253:
        if (r40.n == false) goto L247;
        if (r40.L == false) goto L247;
        int r52 = r34.size() - 1;
    L257:
        if (r52 < 0) goto L247;
        r41 = r34;
        long r53 = ((nm1) r41.get(r52)).g;
        long r54 = r40.g;
        if (r53 < r54) goto L266;
        if (r53 != r54) goto L265;
        if (x(r52) == false) goto L265;
        B(r52);
        r40.L = false;
    L265:
        r52 = r52 - 1;
        r34 = r41;
    L275:
        this.H = r38;
        r3.u(r38, this, this.v.D(r38.c));
        return true;
    L75:
        ym1 r55 = r33.a(true, r36);
        r55.getClass();
        r5.q = r55.c;
        if (r55.o == false) goto L78;
        long r56 = r16;
    L79:
        r5.s = r56;
        long r212 = r55.h - r33.A;
        Pair r57 = r5.c(r210, r211, r55, r212, r30);
        long r58 = ((Long) r57.first).longValue();
        int r59 = ((Integer) r57.second).intValue();
        if (r211 == false) goto L93;
        if (r210 == null) goto L93;
        if (r58 < r55.k) goto L92;
        jm1 r112 = km1.d(r55, r58, r59);
        if (r112 == null) goto L93;
        if ((r212 + r112.a.r) >= r27) goto L93;
    L92:
        r36 = r31[r24];
        ym1 r60 = r33.a(true, r36);
        r60.getClass();
        r212 = r60.h - r33.A;
        Pair r61 = r5.c(r210, false, r60, r212, r30);
        r58 = ((Long) r61.first).longValue();
        int r62 = ((Integer) r61.second).intValue();
        int r63 = r24;
        ym1 r64 = r60;
    L94:
        String r113 = r64.a;
        boolean r114 = r64.c;
        long r65 = r64.k;
        yw1 r66 = r64.r;
        if (r63 == r24) goto L102;
        if (r24 == (-1)) goto L102;
        zk0 r68 = (zk0) r33.q.get(r31[r24]);
        if (r68 == null) goto L102;
        r68.x = false;
    L102:
        if (r58 >= r65) goto L104;
        r5.n = new BehindLiveWindowException();
        r37 = r2;
        goto L233
    L104:
        jm1 r69 = km1.d(r64, r58, r62);
        if (r69 == null) goto L107;
        r37 = r2;
    L117:
        boolean r70 = r69.d;
        wm1 r71 = r69.a;
        r19.p = null;
        SystemClock.elapsedRealtime();
        vm1 r72 = r71.o;
        long r73 = r71.r;
        if (r72 == null) goto L124;
        String r74 = r72.t;
        if (r74 == null) goto L124;
        Uri r75 = jz4.H(r64.a, r74);
    L125:
        gm1 r76 = r19.e(r75, r63, true);
        r37.p = r76;
        if (r76 != null) goto L233;
        String r77 = r71.t;
        if (r77 != null) goto L132;
        Uri r78 = null;
    L133:
        gm1 r115 = r19.e(r78, r63, false);
        r37.p = r115;
        if (r115 != null) goto L233;
        if ((r71 instanceof tm1) == true) goto L139;
        boolean r610 = r114;
    L147:
        if (r210 != 0) goto L151;
        AtomicInteger r79 = nm1.M;
    L149:
        boolean r611 = false;
    L160:
        if (r611 == false) goto L163;
        if (r70 == true) goto L233;
    L163:
        xk0 r80 = r19.a;
        ci0 r116 = r19.b;
        tb1 r310 = r19.f[r63];
        List r81 = r19.i;
        int r410 = r19.r.n();
        Object r411 = r19.r.q();
        boolean r117 = r19.l;
        si1 r82 = r19.d;
        if (r78 != null) goto L166;
        r7.getClass();
        byte[] r83 = null;
    L167:
        if (r75 != null) goto L169;
        byte[] r84 = null;
    L170:
        ik3 r85 = r19.k;
        AtomicInteger r118 = nm1.M;
        Map r510 = Collections.EMPTY_MAP;
        Uri r119 = jz4.H(r113, r71.n);
        jm1 r120 = r69;
        long r86 = r71.v;
        long r87 = r71.w;
        if (r70 == false) goto L173;
        int r511 = 8;
    L174:
        rr2.s(r119, "The uri must be set.");
        ii0 r412 = new ii0(r119, 0, 1, null, r510, r86, r87, null, r511);
        if (r83 == null) goto L177;
        boolean r311 = true;
    L178:
        if (r311 == false) goto L180;
        String r88 = r71.u;
        r88.getClass();
        byte[] r89 = nm1.d(r88);
    L181:
        if (r83 == null) goto L183;
        r89.getClass();
        ci0 r312 = new j6(r116, r83, r89);
    L184:
        vm1 r90 = r71.o;
        if (r90 == null) goto L197;
        if (r84 == null) goto L188;
        boolean r91 = true;
    L189:
        if (r91 == false) goto L191;
        String r92 = r90.u;
        r92.getClass();
        byte[] r93 = nm1.d(r92);
    L192:
        Uri r121 = jz4.H(r113, r90.n);
        long r122 = r90.v;
        boolean r612 = r91;
        long r94 = r90.w;
        rr2.s(r121, "The uri must be set.");
        ii0 r413 = new ii0(r121, 0, 1, null, r510, r122, r94, null, 0);
        if (r84 == null) goto L195;
        r93.getClass();
        ci0 r95 = new j6(r116, r84, r93);
    L196:
        boolean r414 = r612;
        ci0 r313 = r95;
        ii0 r96 = r413;
    L198:
        long r415 = r212 + r73;
        long r416 = r415 + r71.p;
        int r97 = r64.j + r71.q;
        if (r210 == 0) goto L228;
        ii0 r98 = r210.q;
        if (r96 == r98) goto L210;
        if (r96 == null) goto L209;
        if (r98 == null) goto L209;
        if (r96.a.equals(r98.a) == false) goto L209;
        if (r96.f == r98.f) goto L210;
    L209:
        boolean r99 = false;
    L212:
        if (r36.equals(r210.m) == true) goto L214;
    L216:
        boolean r100 = false;
    L217:
        mv1 r101 = r210.y;
        be3 r123 = r210.z;
        if (r99 == false) goto L225;
        if (r100 == false) goto L225;
        if (r210.J == true) goto L225;
        if (r210.l != r97) goto L225;
        jw r124 = r210.C;
    L226:
        jw r512 = r124;
    L227:
        mv1 r613 = r101;
        be3 r614 = r123;
        long r125 = r120.b;
        int r102 = r120.c;
        boolean r513 = !r70;
        boolean r103 = r71.x;
        SparseArray r104 = (SparseArray) r82.o;
        iu4 r105 = (iu4) r104.get(r97);
        if (r105 != null) goto L232;
        r105 = new iu4(9223372036854775806L);
        r104.put(r97, r105);
    L232:
        ii0 r417 = r96;
        r37.p = new nm1(r80, r312, r412, r310, r311, r313, r417, r414, r36, r81, r410, r411, r415, r416, r125, r102, r513, r97, r103, r117, r105, r71.s, r512, r613, r614, r611, r610, r85);
    L225:
        r124 = null;
        goto L226
    L214:
        if (r210.H == false) goto L216;
        r100 = true;
    L210:
        r99 = true;
        goto L212
    L228:
        r101 = new mv1(null);
        r123 = new be3(10);
        r512 = null;
        goto L227
    L195:
        r95 = r116;
        goto L196
    L191:
        r93 = null;
        goto L192
    L188:
        r91 = false;
        goto L189
    L197:
        r96 = null;
        r313 = null;
        r414 = false;
        goto L198
    L183:
        r312 = r116;
        goto L184
    L180:
        r89 = null;
        goto L181
    L177:
        r311 = false;
        goto L178
    L173:
        r511 = 0;
        goto L174
    L169:
        r84 = (byte[]) ((ef1) r7.o).get(r75);
        goto L170
    L166:
        r83 = (byte[]) ((ef1) r7.o).get(r78);
        goto L167
    L151:
        if (r36.equals(r210.m) == true) goto L153;
    L155:
        long r213 = r212 + r73;
        if (r610 == true) goto L158;
    L159:
        r611 = true;
        goto L160
    L158:
        if (r213 >= r30) goto L149;
    L153:
        if (r210.H == false) goto L155;
    L139:
        if (((tm1) r71).y == false) goto L141;
    L145:
        r610 = true;
        goto L147
    L141:
        if (r69.c != 0) goto L144;
        if (r114 == true) goto L145;
    L144:
        r610 = false;
        goto L147
    L132:
        r78 = jz4.H(r64.a, r77);
    L124:
        r75 = null;
        goto L125
    L107:
        if (r64.o == true) goto L109;
        r37 = r2;
        r37.q = r36;
        r19.p = r36;
        goto L233
    L109:
        r37 = r2;
        if (r29 == true) goto L115;
        if (r66.isEmpty() == true) goto L115;
        r69 = new jm1((wm1) te5.w(r66), (r65 + ((long) r66.size())) - 1, -1);
    L115:
        r37.o = true;
    L93:
        r62 = r59;
        r64 = r55;
        r63 = r35;
        goto L94
    L78:
        r56 = (r55.h + r55.u) - r33.A;
        goto L79
    L71:
        r211 = false;
        goto L72
    L61:
        if (r5.q == true) goto L67;
        r25 = r23;
        long r106 = r17.h - r17.g;
        r110 = r9;
        r32 = r15;
        r22 = Math.max(0, r22 - r106);
        if (r25 == r16) goto L66;
        r28 = Math.max(0, r25 - r106);
        r26 = r22;
        goto L68
    L58:
        r23 = r16;
        goto L59
    L54:
        r18 = r5.h.b(r17.d);
        goto L53
    L50:
        r17 = (nm1) te5.w(r13);
        goto L51
    L43:
        if (r13.isEmpty() == false) goto L46;
        r29 = false;
        goto L47
    L15:
        List r107 = this.B;
        nm1 r108 = C();
        boolean r109 = r108.H;
        long r126 = r108.g;
        if (r109 == true) goto L18;
    L25:
        long r127 = Math.max(this.c0, r126);
    L26:
        long r128 = this.c0;
        if (this.P == false) goto L39;
        kn1[] r129 = this.I;
        int r130 = r129.length;
        int r131 = 0;
    L29:
        if (r131 >= r130) goto L39;
        kn1 r132 = r129[r131];
        monitor-enter(r132);
        long r133 = r6;
        List r134 = r107;
        long r135 = Math.max(r132.u, r132.n(r132.s));     // Catch: Throwable -> L36
        monitor-exit(r132);
        r128 = Math.max(r128, r135);
        r131 = r131 + 1;
        r6 = r133;
        r107 = r134;
    L36:
        th = move-exception;
        throw th;
    L39:
        r16 = r6;
        r14 = r127;
        r27 = r128;
        r13 = r107;
        goto L40
    L18:
        if (r108.f() == false) goto L25;
        long r136 = r108.K;
        if (r136 == (-9223372036854775807L)) goto L23;
        long r137 = r126 + r136;
    L24:
        r127 = r137;
        goto L26
    L23:
        r137 = -9223372036854775807L;
    L278:
        return false;
    }

    @Override // defpackage.m51
    public final void p() {
        this.h0 = true;
        this.E.post(this.D);
    }

    @Override // defpackage.da4
    public final long q() {
        ArrayList r0 = this.A;
        if (this.g0 == false) goto L7;
        return Long.MIN_VALUE;
    L7:
        if (E() == true) goto L9;
        long r1 = this.c0;
        nm1 r3 = C();
        if (r3.H == false) goto L14;
    L17:
        if (r3 == null) goto L20;
        r1 = Math.max(r1, r3.h);
    L20:
        if (this.P == false) goto L31;
        kn1[] r7 = this.I;
        int r2 = r7.length;
        int r4 = 0;
    L22:
        if (r4 >= r2) goto L31;
        kn1 r5 = r7[r4];
        monitor-enter(r5);
        long r6 = r5.v;     // Catch: Throwable -> L28
        monitor-exit(r5);
        r1 = Math.max(r1, r6);
        r4 = r4 + 1;
    L28:
        th = move-exception;
        throw th;
    L31:
        return r1;
    L14:
        if (r0.size() <= 1) goto L16;
        r3 = (nm1) r0.get(r0.size() - 2);
        goto L17
    L16:
        r3 = null;
        goto L17
    L9:
        return this.d0;
    }

    @Override // defpackage.o44
    public final void r() {
        this.E.post(this.C);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 r24, long r25, long r27, IOException r29, int r30) {
        s20 r1 = (s20) r24;
        boolean r2 = r1 instanceof nm1;
        if (r2 == true) goto L5;
    L14:
        long r3 = r1.i.o;
        ii0 r14 = r1.b;
        yl4 r5 = r1.i;
        ed2 r13 = new ed2(r14, r5.p, r5.q, r25, r27, r3);
        f35.i0(r1.g);
        f35.i0(r1.h);
        x7 r4 = new x7(r30, 8, r29);
        km1 r6 = this.q;
        n50 r7 = uo.n(r6.r);
        this.v.getClass();
        dd2 r8 = i80.C(r7, r4);
        if (r8 != null) goto L17;
    L19:
        boolean r15 = false;
    L21:
        if (r15 == false) goto L35;
        if (r2 == true) goto L24;
    L33:
        dd2 r9 = i61.s;
    L34:
        dd2 r16 = r9;
        int r10 = r16.a;
        if (r10 == 0) goto L44;
        if (r10 == 1) goto L44;
        boolean r17 = false;
    L45:
        int r11 = r1.c;
        tb1 r12 = r1.d;
        int r18 = r1.e;
        Object r19 = r1.f;
        long r20 = r1.g;
        long r110 = r1.h;
        this.x.s(r13, r11, this.o, r12, r18, r19, r20, r110, r29, !r17);
        if (r17 == true) goto L48;
        this.H = null;
    L48:
        if (r15 == true) goto L50;
    L54:
        return r16;
    L50:
        if (this.Q == true) goto L53;
        od2 r21 = new od2();
        r21.a = this.c0;
        o(new pd2(r21));
        return r16;
    L53:
        this.p.j(this);
    L44:
        r17 = true;
        goto L45
    L24:
        if (r3 != 0) goto L33;
        ArrayList r22 = this.A;
        if (((nm1) r22.remove(r22.size() - 1)) != r1) goto L28;
        boolean r23 = true;
    L29:
        rr2.w(r23);
        if (r22.isEmpty() == false) goto L32;
        this.d0 = this.c0;
        goto L33
    L32:
        ((nm1) te5.w(r22)).J = true;
        goto L33
    L28:
        r23 = false;
        goto L29
    L35:
        long r26 = i80.E(r4);
        if (r26 == (-9223372036854775807L)) goto L38;
        r9 = new dd2(0, r26, false);
        goto L34
    L38:
        r9 = i61.t;
        goto L34
    L17:
        if (r8.a != 2) goto L19;
        long r28 = r8.b;
        t41 r31 = r6.r;
        r15 = r31.o(r31.t(r6.h.b(r1.d)), r28);
        goto L21
    L5:
        if (((nm1) r1).f() == true) goto L14;
        if ((r29 instanceof HttpDataSource$InvalidResponseCodeException) == false) goto L14;
        int r32 = ((HttpDataSource$InvalidResponseCodeException) r29).p;
        if (r32 == 410) goto L13;
        if (r32 != 404) goto L14;
    L13:
        return i61.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [kn1[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kn1[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wv4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kn1, p44] */
    /* JADX WARN: Type inference failed for: r5v6, types: [tq0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.m51
    public final wv4 t(int r11, int r12) {
        Integer r0 = Integer.valueOf(r12);
        Set r1 = l0;
        boolean r2 = r1.contains(r0);
        boolean r3 = false;
        HashSet r4 = this.K;
        SparseIntArray r5 = this.L;
        ?? r6 = 0;
        r6 = 0;
        if (r2 == false) goto L14;
        rr2.l(r1.contains(Integer.valueOf(r12)));
        int r7 = r5.get(r12, -1);
        if (r7 != (-1)) goto L8;
    L21:
        if (r6 != 0) goto L45;
        if (this.h0 == true) goto L25;
        int r8 = this.I.length;
        if (r12 != 1) goto L29;
    L30:
        r3 = true;
    L31:
        r6 = new kn1(this.r, this.t, this.u, this.G);
        r6.t = this.c0;
        if (r3 == false) goto L34;
        r6.I = this.j0;
        r6.z = true;
    L34:
        long r9 = this.i0;
        if (r6.F == r9) goto L37;
        r6.F = r9;
        r6.z = true;
    L37:
        nm1 r10 = this.k0;
        if (r10 == null) goto L40;
        r6.C = r10.k;
    L40:
        r6.f = this;
        int r13 = r8 + 1;
        int[] r14 = Arrays.copyOf(this.J, r13);
        this.J = r14;
        r14[r8] = r11;
        kn1[] r15 = this.I;
        String r16 = f35.a;
        ?? r17 = Arrays.copyOf(r15, r15.length + 1);
        r17[r15.length] = r6;
        this.I = (kn1[]) r17;
        boolean[] r18 = Arrays.copyOf(this.b0, r13);
        this.b0 = r18;
        r18[r8] = r3;
        this.Z |= r3;
        r4.add(Integer.valueOf(r12));
        r5.append(r12, r8);
        if (D(r12) <= D(this.N)) goto L43;
        this.O = r8;
        this.N = r12;
    L43:
        this.a0 = Arrays.copyOf(this.a0, r13);
        goto L45
    L29:
        if (r12 != 2) goto L31;
    L25:
        return y(r11, r12);
    L45:
        if (r12 == 5) goto L47;
        return r6;
    L47:
        if (this.M != null) goto L50;
        this.M = new jn1(r6, this.y);
    L50:
        return this.M;
    L8:
        if (r4.add(Integer.valueOf(r12)) == false) goto L11;
        this.J[r7] = r11;
    L11:
        if (this.J[r7] != r11) goto L13;
        r6 = this.I[r7];
        goto L21
    L13:
        r6 = y(r11, r12);
        goto L21
    L14:
        int r19 = 0;
    L15:
        ?? r20 = this.I;
        if (r19 >= r20.length) goto L21;
        if (this.J[r19] == r11) goto L19;
        r19 = r19 + 1;
        goto L15
    L19:
        r6 = r20[r19];
        goto L21
    }

    @Override // defpackage.da4
    public final void u(long r6) {
        i61 r0 = this.w;
        if (((IOException) r0.q) == null) goto L6;
        return;
    L6:
        if (E() == true) goto L41;
        boolean r1 = r0.l();
        km1 r2 = this.q;
        List r3 = this.B;
        if (r1 == false) goto L17;
        this.H.getClass();
        s20 r5 = this.H;
        if (r2.n == null) goto L13;
        boolean r7 = false;
    L14:
        if (r7 == false) goto L39;
        r0.d();
        return;
    L39:
        return;
    L13:
        r7 = r2.r.e(r6, r5, r3);
        goto L14
    L17:
        int r4 = r3.size();
    L19:
        if (r4 <= 0) goto L24;
        if (r2.b((nm1) r3.get(r4 - 1)) != 2) goto L24;
        r4 = r4 - 1;
    L24:
        if (r4 >= r3.size()) goto L27;
        B(r4);
    L27:
        if (r2.n == null) goto L29;
    L32:
        int r8 = r3.size();
    L34:
        if (r8 >= this.A.size()) goto L40;
        B(r8);
        return;
    L40:
        return;
    L29:
        if (r2.r.length() < 2) goto L32;
        r8 = r2.r.j(r6, r3);
        goto L34
    }

    public final void v() {
        rr2.w(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    @Override // defpackage.m51
    public final void w(m84 r1) {
    }

    public final boolean x(int r5) {
        int r0 = r5;
    L3:
        ArrayList r1 = this.A;
        if (r0 >= r1.size()) goto L9;
        if (((nm1) r1.get(r0)).L == true) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return false;
    L9:
        nm1 r6 = (nm1) r1.get(r5);
        int r2 = 0;
    L11:
        if (r2 >= this.I.length) goto L16;
        if (this.I[r2].o() > r6.e(r2)) goto L14;
        r2 = r2 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    }

    public final tv4 z(sv4[] r8) {
        int r1 = 0;
    L4:
        if (r1 >= r8.length) goto L11;
        sv4 r2 = r8[r1];
        tb1[] r3 = new tb1[r2.a];
        int r4 = 0;
    L7:
        if (r4 >= r2.a) goto L9;
        tb1 r5 = r2.d[r4];
        int r6 = this.t.f(r5);
        sb1 r7 = r5.a();
        r7.N = r6;
        r3[r4] = new tb1(r7);
        r4 = r4 + 1;
        goto L7
    L9:
        r8[r1] = new sv4(r2.b, r3);
        r1 = r1 + 1;
        goto L4
    L11:
        return new tv4(r8);
    }
}
