package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class p44 implements wv4 {
    public tb1 A;
    public tb1 B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final m44 a;
    public final cw1 b;
    public final ue1 c;
    public final ww0 d;
    public final sw0 e;
    public o44 f;
    public tb1 g;
    public pw0 h;
    public int i;
    public long[] j;
    public long[] k;
    public int[] l;
    public int[] m;
    public long[] n;
    public vv4[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public p44(n9 r1, ww0 r2, sw0 r3) {
        this.d = r2;
        this.e = r3;
        this.a = new m44(r1);
        this.b = new cw1();
        this.i = 1000;
        this.j = new long[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new vv4[1000];
        this.c = new ue1(new nz2(25));
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
        this.D = true;
    }

    public final synchronized void A(int r3) {
        monitor-enter(this);
        if (r3 >= 0) goto L15;
    L9:
        boolean r0 = false;
    L10:
        rr2.l(r0);     // Catch: Throwable -> L7
        this.s += r3;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    L15:
        if ((this.s + r3) > this.p) goto L9;
        r0 = true;
        goto L10
    }

    @Override // defpackage.wv4
    public void a(long r17, int r19, int r20, int r21, vv4 r22) {
        if (this.z == false) goto L5;
        tb1 r2 = this.A;
        r2.getClass();
        g(r2);
    L5:
        int r3 = r19 & 1;
        if (r3 == 0) goto L8;
        boolean r5 = true;
    L10:
        if (this.x == false) goto L14;
        if (r5 == false) goto L128;
        this.x = false;
        goto L14
    L128:
        return;
    L14:
        long r6 = r17 + this.F;
        if (this.D == true) goto L17;
    L24:
        int r4 = r19;
    L26:
        if (this.G == false) goto L67;
        if (r5 == false) goto L66;
        monitor-enter(this);
    L38:
        th = move-exception;
        throw th;
    L30:
        if (this.p == 0) goto L33;
        monitor-enter(this);     // Catch: Throwable -> L38
        long r10 = Math.max(this.u, n(this.s));     // Catch: Throwable -> L61
        monitor-exit(this);     // Catch: Throwable -> L38
        if (r10 < r6) goto L47;
        monitor-exit(this);
        boolean r7 = false;
    L58:
        if (r7 == false) goto L130;
        this.G = false;
        goto L67
    L130:
        return;
    L47:
        int r8 = this.p;     // Catch: Throwable -> L38
        int r9 = p(r8 - 1);     // Catch: Throwable -> L38
    L49:
        if (r8 <= this.s) goto L55;
        if (this.n[r9] < r6) goto L55;
        r8 = r8 - 1;     // Catch: Throwable -> L38
        r9 = r9 - 1;     // Catch: Throwable -> L38
        if (r9 != (-1)) goto L49;
        r9 = this.i - 1;     // Catch: Throwable -> L38
    L55:
        k(this.q + r8);     // Catch: Throwable -> L38
        monitor-exit(this);
        r7 = true;
        goto L58
    L61:
        th = move-exception;
        throw th;     // Catch: Throwable -> L38
    L33:
        if (r6 <= this.u) goto L35;
        r7 = true;
    L36:
        monitor-exit(this);
        goto L58
    L35:
        r7 = false;
        goto L36
    L66:
        return;
    L67:
        long r11 = (this.a.g - ((long) r20)) - ((long) r21);
        monitor-enter(this);
        int r12 = this.p;     // Catch: Throwable -> L76
        if (r12 <= 0) goto L79;
        int r13 = p(r12 - 1);     // Catch: Throwable -> L76
        if ((this.k[r13] + ((long) this.l[r13])) > r11) goto L74;
        boolean r14 = true;
    L75:
        rr2.l(r14);     // Catch: Throwable -> L76
        goto L79
    L74:
        r14 = false;
    L79:
        if ((536870912 & r4) == 0) goto L81;
        boolean r15 = true;
    L82:
        this.w = r15;     // Catch: Throwable -> L76
        this.v = Math.max(this.v, r6);     // Catch: Throwable -> L76
        int r16 = p(this.p);     // Catch: Throwable -> L76
        this.n[r16] = r6;     // Catch: Throwable -> L76
        this.k[r16] = r11;     // Catch: Throwable -> L76
        this.l[r16] = r20;     // Catch: Throwable -> L76
        this.m[r16] = r4;     // Catch: Throwable -> L76
        this.o[r16] = r22;     // Catch: Throwable -> L76
        this.j[r16] = this.C;     // Catch: Throwable -> L76
        if (((SparseArray) this.c.p).size() != 0) goto L85;
        boolean r0 = true;
    L86:
        if (r0 == true) goto L89;
        SparseArray r1 = (SparseArray) this.c.p;     // Catch: Throwable -> L76
        if (((n44) r1.valueAt(r1.size() - 1)).a.equals(this.B) == false) goto L89;
    L110:
        int r18 = this.p + 1;     // Catch: Throwable -> L76
        this.p = r18;     // Catch: Throwable -> L76
        int r23 = this.i;     // Catch: Throwable -> L76
        if (r18 != r23) goto L113;
        int r24 = r23 + 1000;     // Catch: Throwable -> L76
        long[] r25 = new long[r24];     // Catch: Throwable -> L76
        long[] r26 = new long[r24];     // Catch: Throwable -> L76
        long[] r27 = new long[r24];     // Catch: Throwable -> L76
        int[] r28 = new int[r24];     // Catch: Throwable -> L76
        int[] r29 = new int[r24];     // Catch: Throwable -> L76
        vv4[] r30 = new vv4[r24];     // Catch: Throwable -> L76
        int r110 = this.r;     // Catch: Throwable -> L76
        int r31 = r23 - r110;     // Catch: Throwable -> L76
        System.arraycopy(this.k, r110, r26, 0, r31);     // Catch: Throwable -> L76
        System.arraycopy(this.n, this.r, r27, 0, r31);     // Catch: Throwable -> L76
        System.arraycopy(this.m, this.r, r28, 0, r31);     // Catch: Throwable -> L76
        System.arraycopy(this.l, this.r, r29, 0, r31);     // Catch: Throwable -> L76
        System.arraycopy(this.o, this.r, r30, 0, r31);     // Catch: Throwable -> L76
        System.arraycopy(this.j, this.r, r25, 0, r31);     // Catch: Throwable -> L76
        int r111 = this.r;     // Catch: Throwable -> L76
        System.arraycopy(this.k, 0, r26, r31, r111);     // Catch: Throwable -> L76
        System.arraycopy(this.n, 0, r27, r31, r111);     // Catch: Throwable -> L76
        System.arraycopy(this.m, 0, r28, r31, r111);     // Catch: Throwable -> L76
        System.arraycopy(this.l, 0, r29, r31, r111);     // Catch: Throwable -> L76
        System.arraycopy(this.o, 0, r30, r31, r111);     // Catch: Throwable -> L76
        System.arraycopy(this.j, 0, r25, r31, r111);     // Catch: Throwable -> L76
        this.k = r26;     // Catch: Throwable -> L76
        this.n = r27;     // Catch: Throwable -> L76
        this.m = r28;     // Catch: Throwable -> L76
        this.l = r29;     // Catch: Throwable -> L76
        this.o = r30;     // Catch: Throwable -> L76
        this.j = r25;     // Catch: Throwable -> L76
        this.r = 0;     // Catch: Throwable -> L76
        this.i = r24;     // Catch: Throwable -> L76
    L113:
        monitor-exit(this);
        return;
    L89:
        tb1 r32 = this.B;     // Catch: Throwable -> L76
        r32.getClass();     // Catch: Throwable -> L76
        ww0 r33 = this.d;     // Catch: Throwable -> L76
        if (r33 == null) goto L92;
        vw0 r34 = r33.d(this.e, r32);     // Catch: Throwable -> L76
    L93:
        ue1 r35 = this.c;     // Catch: Throwable -> L76
        int r36 = this.q + this.p;     // Catch: Throwable -> L76
        n44 r37 = new n44(r32, r34);     // Catch: Throwable -> L76
        SparseArray r38 = (SparseArray) r35.p;     // Catch: Throwable -> L76
        if (r35.o != (-1)) goto L101;
        if (r38.size() != 0) goto L98;
        boolean r39 = true;
    L99:
        rr2.w(r39);     // Catch: Throwable -> L76
        r35.o = 0;     // Catch: Throwable -> L76
        goto L101
    L98:
        r39 = false;
    L101:
        if (r38.size() <= 0) goto L109;
        int r40 = r38.keyAt(r38.size() - 1);     // Catch: Throwable -> L76
        if (r36 < r40) goto L105;
        boolean r41 = true;
    L106:
        rr2.l(r41);     // Catch: Throwable -> L76
        if (r40 != r36) goto L109;
        ((nz2) r35.q).accept(r38.valueAt(r38.size() - 1));     // Catch: Throwable -> L76
        goto L109
    L105:
        r41 = false;
    L109:
        r38.append(r36, r37);     // Catch: Throwable -> L76
        goto L110
    L92:
        r34 = vw0.h;     // Catch: Throwable -> L76
        goto L93
    L85:
        r0 = false;
        goto L86
    L81:
        r15 = false;
    L76:
        th = move-exception;
        throw th;
    L17:
        if (r6 < this.t) goto L129;
        if (r3 != 0) goto L24;
        if (this.E == true) goto L23;
        l93.q0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
        this.E = true;
    L23:
        r4 = r19 | 1;
        goto L26
    L129:
        return;
    L8:
        r5 = false;
        goto L10
    }

    @Override // defpackage.wv4
    public final void b(be3 r9, int r10, int r11) {
    L2:
        m44 r12 = this.a;
        if (r10 <= 0) goto L7;
        int r0 = r12.b(r10);
        ru r1 = r12.f;
        m9 r2 = (m9) r1.p;
        r9.k(r2.a, ((int) (r12.g - r1.n)) + r2.b, r0);
        r10 = r10 - r0;
        long r3 = r12.g + ((long) r0);
        r12.g = r3;
        ru r4 = r12.f;
        if (r3 != r4.o) goto L2;
        r12.f = (ru) r4.q;
        goto L2
    L7:
        r12.getClass();
    }

    @Override // defpackage.wv4
    public final int c(wh0 r8, int r9, boolean r10) {
        m44 r7 = this.a;
        int r11 = r7.b(r9);
        ru r0 = r7.f;
        m9 r1 = (m9) r0.p;
        int r12 = r8.read(r1.a, ((int) (r7.g - r0.n)) + r1.b, r11);
        if (r12 != (-1)) goto L8;
        if (r10 == false) goto L7;
        return -1;
    L7:
        throw new EOFException();
    L8:
        long r13 = r7.g + ((long) r12);
        r7.g = r13;
        ru r2 = r7.f;
        if (r13 != r2.o) goto L11;
        r7.f = (ru) r2.q;
    L11:
        return r12;
    }

    @Override // defpackage.wv4
    public final void g(tb1 r5) {
        tb1 r0 = m(r5);
        boolean r1 = false;
        this.z = false;
        this.A = r5;
        monitor-enter(this);
        this.y = false;     // Catch: Throwable -> L16
        if (Objects.equals(r0, this.B) == false) goto L9;
        monitor-exit(this);
    L22:
        o44 r4 = this.f;
        if (r4 == null) goto L31;
        if (r1 == false) goto L32;
        r4.r();
        return;
    L32:
        return;
    L31:
        return;
    L9:
        if (((SparseArray) this.c.p).size() != 0) goto L11;
        boolean r6 = true;
    L12:
        if (r6 == true) goto L18;
        SparseArray r7 = (SparseArray) this.c.p;     // Catch: Throwable -> L16
        if (((n44) r7.valueAt(r7.size() - 1)).a.equals(r0) == false) goto L18;
        SparseArray r8 = (SparseArray) this.c.p;     // Catch: Throwable -> L16
        this.B = ((n44) r8.valueAt(r8.size() - 1)).a;     // Catch: Throwable -> L16
    L19:
        boolean r9 = this.D;     // Catch: Throwable -> L16
        tb1 r2 = this.B;     // Catch: Throwable -> L16
        this.D = r9 & lw2.a(r2.n, r2.k);     // Catch: Throwable -> L16
        this.E = false;     // Catch: Throwable -> L16
        monitor-exit(this);
        r1 = true;
    L18:
        this.B = r0;     // Catch: Throwable -> L16
        goto L19
    L11:
        r6 = false;
    L16:
        th = move-exception;
        throw th;
    }

    public final long h(int r7) {
        this.u = Math.max(this.u, n(r7));
        this.p -= r7;
        int r0 = this.q + r7;
        this.q = r0;
        int r1 = this.r + r7;
        this.r = r1;
        int r2 = this.i;
        if (r1 < r2) goto L5;
        this.r = r1 - r2;
    L5:
        int r3 = this.s - r7;
        this.s = r3;
        int r8 = 0;
        if (r3 >= 0) goto L8;
        this.s = 0;
    L8:
        ue1 r4 = this.c;
        SparseArray r5 = (SparseArray) r4.p;
    L10:
        if (r8 >= (r5.size() - 1)) goto L18;
        int r6 = r8 + 1;
        if (r0 < r5.keyAt(r6)) goto L18;
        ((nz2) r4.q).accept(r5.valueAt(r8));
        r5.removeAt(r8);
        int r9 = r4.o;
        if (r9 <= 0) goto L16;
        r4.o = r9 - 1;
    L16:
        r8 = r6;
    L18:
        if (this.p != 0) goto L25;
        int r10 = this.r;
        if (r10 != 0) goto L22;
        r10 = this.i;
    L22:
        int r11 = r10 - 1;
        return this.k[r11] + ((long) this.l[r11]);
    L25:
        return this.k[this.r];
    }

    public final void i(long r12, boolean r14, boolean r15) {
        m44 r0 = this.a;
        monitor-enter(this);
        int r1 = this.p;     // Catch: Throwable -> L27
        long r2 = -1;
        if (r1 == 0) goto L29;
        long[] r4 = this.n;     // Catch: Throwable -> L27
        int r6 = this.r;     // Catch: Throwable -> L27
        if (r12 < r4[r6]) goto L29;
        if (r15 == false) goto L17;
        int r16 = this.s;     // Catch: Throwable -> L15
        if (r16 == r1) goto L17;
        r1 = r16 + 1;
    L15:
        th = move-exception;
        Throwable r13 = th;
    L32:
        monitor-exit(this);     // Catch: Throwable -> L25
        throw r13;
    L17:
        int r11 = l(r6, r1, r12, r14);     // Catch: Throwable -> L25
        if (r11 != (-1)) goto L22;
        monitor-exit(this);
    L30:
        r0.a(r2);
        return;
    L22:
        r2 = h(r11);     // Catch: Throwable -> L25
        monitor-exit(this);
    L29:
        monitor-exit(this);
    L25:
        th = th;
    L26:
        r13 = th;
    L27:
        th = th;
        goto L26
    }

    public final void j() {
        m44 r0 = this.a;
        monitor-enter(this);
        int r1 = this.p;     // Catch: Throwable -> L12
        if (r1 != 0) goto L8;
        monitor-exit(this);
        long r2 = -1;
    L10:
        r0.a(r2);
        return;
    L8:
        r2 = h(r1);     // Catch: Throwable -> L12
        monitor-exit(this);
    L12:
        th = move-exception;
        throw th;
    }

    public final long k(int r9) {
        int r0 = this.q;
        int r1 = this.p;
        int r2 = (r0 + r1) - r9;
        boolean r3 = false;
        if (r2 >= 0) goto L5;
    L7:
        boolean r4 = false;
    L8:
        rr2.l(r4);
        int r5 = this.p - r2;
        this.p = r5;
        this.v = Math.max(this.u, n(r5));
        if (r2 == 0) goto L11;
    L13:
        this.w = r3;
        ue1 r6 = this.c;
        SparseArray r7 = (SparseArray) r6.p;
        int r8 = r7.size() - 1;
    L14:
        if (r8 < 0) goto L19;
        if (r9 >= r7.keyAt(r8)) goto L19;
        ((nz2) r6.q).accept(r7.valueAt(r8));
        r7.removeAt(r8);
        r8 = r8 - 1;
    L19:
        if (r7.size() <= 0) goto L21;
        int r10 = Math.min(r6.o, r7.size() - 1);
    L22:
        r6.o = r10;
        int r11 = this.p;
        if (r11 == 0) goto L26;
        int r12 = p(r11 - 1);
        return this.k[r12] + ((long) this.l[r12]);
    L26:
        return 0;
    L21:
        r10 = -1;
        goto L22
    L11:
        if (this.w == false) goto L13;
        r3 = true;
        goto L13
    L5:
        if (r2 > (r1 - this.s)) goto L7;
        r4 = true;
        goto L8
    }

    public final int l(int r7, int r8, long r9, boolean r11) {
        int r0 = -1;
        int r2 = 0;
    L3:
        if (r2 >= r8) goto L17;
        long r4 = this.n[r7];
        if (r4 > r9) goto L17;
        if (r11 == false) goto L10;
        if ((this.m[r7] & 1) != 0) goto L10;
    L13:
        r7 = r7 + 1;
        if (r7 != this.i) goto L16;
        r7 = 0;
    L16:
        r2 = r2 + 1;
    L10:
        if (r4 == r9) goto L11;
        r0 = r2;
        goto L13
    L11:
        return r2;
    L17:
        return r0;
    }

    public tb1 m(tb1 r5) {
        if (this.F != 0) goto L5;
    L8:
        return r5;
    L5:
        if (r5.s == Long.MAX_VALUE) goto L8;
        sb1 r0 = r5.a();
        r0.r = r5.s + this.F;
        return new tb1(r0);
    }

    public final long n(int r8) {
        long r0 = Long.MIN_VALUE;
        if (r8 != 0) goto L5;
        return Long.MIN_VALUE;
    L5:
        int r2 = p(r8 - 1);
        int r3 = 0;
    L6:
        if (r3 >= r8) goto L14;
        r0 = Math.max(r0, this.n[r2]);
        if ((this.m[r2] & 1) != 0) goto L9;
        r2 = r2 - 1;
        if (r2 != (-1)) goto L13;
        r2 = this.i - 1;
    L13:
        r3 = r3 + 1;
        goto L6
    L9:
        return r0;
    L14:
        return r0;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int r2) {
        int r0 = this.r + r2;
        int r1 = this.i;
        if (r0 >= r1) goto L6;
        return r0;
    L6:
        return r0 - r1;
    }

    public final synchronized int q(boolean r9, long r10) {
        monitor-enter(this);
        int r2 = p(this.s);     // Catch: Throwable -> L28
        int r0 = this.s;     // Catch: Throwable -> L28
        int r1 = this.p;     // Catch: Throwable -> L28
        if (r0 == r1) goto L6;
        boolean r3 = true;
    L7:
        if (r3 == false) goto L30;
        if (r10 < this.n[r2]) goto L30;
        if (r10 <= this.v) goto L19;
        if (r9 == false) goto L19;
        int r4 = r1 - r0;
        monitor-exit(this);
        return r4;
    L19:
        int r8 = l(r2, r1 - r0, r10, true);     // Catch: Throwable -> L26
        if (r8 != (-1)) goto L24;
        monitor-exit(this);
        return 0;
    L24:
        monitor-exit(this);
        return r8;
    L30:
        monitor-exit(this);
        return 0;
    L6:
        r3 = false;
    L26:
        th = th;
    L27:
        Throwable r11 = th;
        monitor-exit(this);     // Catch: Throwable -> L26
        throw r11;
    L28:
        th = th;
        goto L27
    }

    public final synchronized tb1 r() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.y == false) goto L6;
        tb1 r0 = null;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = this.B;     // Catch: Throwable -> L9
        goto L7
    }

    public final synchronized boolean s(boolean r5) {
        monitor-enter(this);
        boolean r2 = false;
        if (this.s == this.p) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == true) goto L22;
        if (r5 == false) goto L10;
    L18:
        r2 = true;
    L19:
        monitor-exit(this);
        return r2;
    L10:
        if (this.w == true) goto L18;
        tb1 r6 = this.B;     // Catch: Throwable -> L16
        if (r6 == null) goto L19;
        if (r6 == this.g) goto L19;
    L22:
        if (((n44) this.c.l(o())).a == this.g) goto L25;
        monitor-exit(this);
        return true;
    L25:
        boolean r7 = t(p(this.s));     // Catch: Throwable -> L16
        monitor-exit(this);
        return r7;
    L6:
        r0 = false;
    L16:
        th = move-exception;
        throw th;
    }

    public final boolean t(int r3) {
        pw0 r0 = this.h;
        if (r0 != null) goto L5;
        return true;
    L5:
        if (r0.getState() != 4) goto L7;
        return true;
    L7:
        if ((this.m[r3] & 1073741824) == 0) goto L9;
        return false;
    L9:
        if (this.h.c() == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final void u(tb1 r7, gp3 r8) {
        tb1 r0 = this.g;
        if (r0 != null) goto L5;
        boolean r1 = true;
    L6:
        if (r0 != null) goto L8;
        ow0 r2 = null;
    L9:
        this.g = r7;
        ow0 r3 = r7.r;
        ww0 r4 = this.d;
        if (r4 == null) goto L12;
        int r5 = r4.f(r7);
        sb1 r6 = r7.a();
        r6.N = r5;
        tb1 r9 = new tb1(r6);
    L13:
        r8.p = r9;
        r8.o = this.h;
        if (r4 == null) goto L25;
        if (r1 == false) goto L18;
    L20:
        pw0 r10 = this.h;
        sw0 r11 = this.e;
        pw0 r12 = r4.c(r11, r7);
        this.h = r12;
        r8.o = r12;
        if (r10 == null) goto L24;
        r10.d(r11);
        return;
    L24:
        return;
    L18:
        if (Objects.equals(r2, r3) == false) goto L20;
        return;
    L25:
        return;
    L12:
        r9 = r7;
        goto L13
    L8:
        r2 = r0.r;
        goto L9
    L5:
        r1 = false;
        goto L6
    }

    public final synchronized long v() {
        monitor-enter(this);
        int r0 = p(this.s);     // Catch: Throwable -> L9
        if (this.s == this.p) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L11;
        long r2 = this.j[r0];     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
        return r2;
    L11:
        r2 = this.C;     // Catch: Throwable -> L9
        goto L12
    L6:
        r1 = false;
    L9:
        th = move-exception;
        throw th;
    }

    public final int w(gp3 r11, cj0 r12, int r13, boolean r14) {
        boolean r1 = false;
        if ((r13 & 2) == 0) goto L5;
        boolean r0 = true;
    L6:
        cw1 r3 = this.b;
        monitor-enter(this);
        r12.s = false;     // Catch: Throwable -> L24
        if (this.s == this.p) goto L11;
        boolean r4 = true;
    L12:
        int r7 = -3;
        if (r4 == true) goto L34;
        if (r14 == false) goto L16;
    L31:
        r12.o = 4;     // Catch: Throwable -> L24
        r12.t = Long.MIN_VALUE;     // Catch: Throwable -> L24
        monitor-exit(this);
    L33:
        r7 = -4;
    L56:
        if (r7 == (-4)) goto L58;
    L70:
        return r7;
    L58:
        if (r12.d(4) == true) goto L70;
        if ((r13 & 1) == 0) goto L63;
        r1 = true;
    L63:
        if ((r13 & 4) != 0) goto L68;
        m44 r15 = this.a;
        cw1 r16 = this.b;
        if (r1 == false) goto L67;
        m44.e(r15.e, r12, r16, r15.c);
        goto L68
    L67:
        r15.e = m44.e(r15.e, r12, r16, r15.c);
    L68:
        if (r1 == true) goto L70;
        this.s++;
        goto L70
    L16:
        if (this.w == true) goto L31;
        tb1 r17 = this.B;     // Catch: Throwable -> L24
        if (r17 == null) goto L29;
        if (r0 == false) goto L22;
    L26:
        u(r17, r11);     // Catch: Throwable -> L24
        monitor-exit(this);
    L28:
        r7 = -5;
        goto L56
    L22:
        if (r17 != this.g) goto L26;
    L29:
        monitor-exit(this);
        goto L56
    L34:
        tb1 r5 = ((n44) this.c.l(o())).a;     // Catch: Throwable -> L24
        if (r0 == false) goto L37;
    L53:
        u(r5, r11);     // Catch: Throwable -> L24
        monitor-exit(this);
        goto L28
    L37:
        if (r5 != this.g) goto L53;
        int r18 = p(this.s);     // Catch: Throwable -> L24
        if (t(r18) == true) goto L44;
        r12.s = true;     // Catch: Throwable -> L24
        monitor-exit(this);
        goto L56
    L44:
        r12.o = this.m[r18];     // Catch: Throwable -> L24
        if (this.s != (this.p - 1)) goto L50;
        if (r14 == false) goto L48;
    L49:
        r12.a(536870912);     // Catch: Throwable -> L24
        goto L50
    L48:
        if (this.w == true) goto L49;
    L50:
        r12.t = this.n[r18];     // Catch: Throwable -> L24
        r3.a = this.l[r18];     // Catch: Throwable -> L24
        r3.b = this.k[r18];     // Catch: Throwable -> L24
        r3.c = this.o[r18];     // Catch: Throwable -> L24
        monitor-exit(this);
        goto L33
    L11:
        r4 = false;
    L24:
        th = move-exception;
        throw th;
    L5:
        r0 = false;
        goto L6
    }

    public final void x(boolean r13) {
        m44 r0 = this.a;
        ru r1 = r0.d;
        n9 r2 = r0.a;
        if (((m9) r1.p) == null) goto L6;
        r2.a(r1);
        r1.p = null;
        r1.q = null;
    L6:
        ru r3 = r0.d;
        int r4 = r0.b;
        int r6 = 0;
        if (((m9) r3.p) != null) goto L9;
        boolean r5 = true;
    L10:
        rr2.w(r5);
        r3.n = 0;
        r3.o = r4;
        ru r7 = r0.d;
        r0.e = r7;
        r0.f = r7;
        r0.g = 0;
        r2.h();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        ue1 r8 = this.c;
        SparseArray r9 = (SparseArray) r8.p;
    L12:
        if (r6 >= r9.size()) goto L14;
        ((nz2) r8.q).accept(r9.valueAt(r6));
        r6 = r6 + 1;
        goto L12
    L14:
        r8.o = -1;
        r9.clear();
        if (r13 == false) goto L19;
        this.A = null;
        this.B = null;
        this.y = true;
        this.D = true;
        return;
    L19:
        return;
    L9:
        r5 = false;
        goto L10
    }

    public final synchronized boolean y(int r5) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L16
        this.s = 0;     // Catch: Throwable -> L20
        m44 r1 = this.a;     // Catch: Throwable -> L20
        r1.e = r1.d;     // Catch: Throwable -> L20
        monitor-exit(this);     // Catch: Throwable -> L16
        int r2 = this.q;     // Catch: Throwable -> L16
        if (r5 >= r2) goto L10;
    L18:
        monitor-exit(this);
        return false;
    L10:
        if (r5 > (this.p + r2)) goto L18;
        this.t = Long.MIN_VALUE;     // Catch: Throwable -> L16
        this.s = r5 - r2;     // Catch: Throwable -> L16
        monitor-exit(this);
        return true;
    L20:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    public final synchronized boolean z(boolean r12, long r13) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L52
        this.s = 0;     // Catch: Throwable -> L57
        m44 r1 = this.a;     // Catch: Throwable -> L57
        r1.e = r1.d;     // Catch: Throwable -> L57
        monitor-exit(this);     // Catch: Throwable -> L55
        int r4 = p(0);     // Catch: Throwable -> L48
        int r2 = this.s;     // Catch: Throwable -> L52
        int r3 = this.p;     // Catch: Throwable -> L52
        if (r2 == r3) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L50;
        if (r13 < this.n[r4]) goto L50;
        if (r13 <= this.v) goto L20;
        if (r12 == false) goto L50;
    L20:
        if (this.D == false) goto L38;
        int r6 = r3 - r2;
        int r7 = 0;
    L24:
        if (r7 >= r6) goto L34;
    L32:
        th = move-exception;
        Throwable r14 = th;
        p44 this = this;
    L66:
        monitor-exit(this);     // Catch: Throwable -> L46
        throw r14;
    L26:
        if (this.n[r4] >= r13) goto L27;
        r4 = r4 + 1;     // Catch: Throwable -> L32
        if (r4 != this.i) goto L31;
        r4 = 0;
    L31:
        r7 = r7 + 1;
        goto L24
    L27:
        r6 = r7;
    L37:
        p44 r8 = this;
        long r9 = r13;
    L40:
        if (r6 != (-1)) goto L43;
        monitor-exit(r8);
        return false;
    L43:
        r8.t = r9;     // Catch: Throwable -> L46
        r8.s += r6;     // Catch: Throwable -> L46
        monitor-exit(r8);
        return true;
    L34:
        if (r12 == true) goto L37;
        r6 = -1;
        goto L37
    L38:
        r8 = this;
        r9 = r13;
        r6 = r8.l(r4, r3 - r2, r9, true);     // Catch: Throwable -> L46
    L50:
        monitor-exit(this);
        return false;
    L12:
        r5 = false;
    L48:
        th = th;
        this = this;
    L47:
        r14 = th;
    L55:
        th = th;
    L54:
        r14 = th;
    L57:
        th = th;
    L70:
        throw th;     // Catch: Throwable -> L62
    L62:
        th = th;
    L64:
        th = th;
    L52:
        th = th;
    L46:
        th = th;
        goto L47
    }
}
