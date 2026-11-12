package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements Closeable, Flushable {
    public static final ux3 G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public final fr4 E;
    public final gr0 F;
    public final ge3 n;
    public final hr0 o;
    public final long p;
    public final ge3 q;
    public final ge3 r;
    public final ge3 s;
    public long t;
    public wu3 u;
    public final LinkedHashMap v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        G = new ux3("[a-z0-9_-]{1,120}");
        H = "CLEAN";
        I = "DIRTY";
        J = "REMOVE";
        K = "READ";
    }

    public jr0(b71 r4, ge3 r5, gr4 r6) {
        r4.getClass();
        r6.getClass();
        this.n = r5;
        this.o = new hr0(r4);
        this.p = 10485760;
        this.v = new LinkedHashMap(0, 0.75f, true);
        this.E = r6.e();
        String r7 = b11.q(new StringBuilder(), ze5.c, " Cache");
        this.F = new gr0(this, r7, 0);
        this.q = r5.d("journal");
        this.r = r5.d("journal.tmp");
        this.s = r5.d("journal.bkp");
    }

    public static void R(String r1) {
        if (G.a(r1) == false) goto L5;
        return;
    L5:
        er1.k(r1, "keys must match regex [a-z0-9_-]{1,120}: \"");
    }

    public final void F() {
        ej4 r2 = this.o.k(this.q);
        r2.getClass();
        xu3 r3 = new xu3(r2);
        String r4 = r3.t(Long.MAX_VALUE);     // Catch: Throwable -> L16
        String r6 = r3.t(Long.MAX_VALUE);     // Catch: Throwable -> L16
        String r7 = r3.t(Long.MAX_VALUE);     // Catch: Throwable -> L16
        String r8 = r3.t(Long.MAX_VALUE);     // Catch: Throwable -> L16
        String r9 = r3.t(Long.MAX_VALUE);     // Catch: Throwable -> L16
        if ("libcore.io.DiskLruCache".equals(r4) == false) goto L30;
        if ("1".equals(r6) == false) goto L30;
        if (h12.c(String.valueOf(201105), r7) == false) goto L30;
        if (h12.c(String.valueOf(2), r8) == false) goto L30;
        if (r9.length() > 0) goto L30;
        int r0 = 0;
    L43:
        H(r3.t(Long.MAX_VALUE));     // Catch: Throwable -> L16 EOFException -> L18
        r0 = r0 + 1;
        goto L43
    L18:
        this.w = r0 - this.v.size();     // Catch: Throwable -> L16
        if (r3.l() == true) goto L21;
        J();     // Catch: Throwable -> L16
    L41:
        r3.close();     // Catch: Throwable -> L27
        th = null;
    L35:
        if (th != null) goto L37;
        return;
    L37:
        throw th;
    L27:
        th = th;
        goto L35
    L21:
        wu3 r1 = this.u;     // Catch: Throwable -> L16
        if (r1 == null) goto L24;
        xe5.b(r1);     // Catch: Throwable -> L16
    L24:
        this.u = u();     // Catch: Throwable -> L16
    L30:
        throw new IOException("unexpected journal header: [" + r4 + ", " + r6 + ", " + r8 + ", " + r9 + ']');     // Catch: Throwable -> L16
    L16:
        th = th;
        r3.close();     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        j51.d(th, th);
        goto L35
    }

    public final void H(String r11) {
        int r2 = 0;
        int r0 = qm4.r0(r11, ' ', 0, 6);
        if (r0 == (-1)) goto L46;
        int r5 = r0 + 1;
        int r6 = qm4.r0(r11, ' ', r5, 4);
        LinkedHashMap r7 = this.v;
        if (r6 != (-1)) goto L12;
        String r8 = r11.substring(r5);
        String r9 = J;
        if (r0 == r9.length()) goto L9;
    L13:
        dr0 r10 = (dr0) r7.get(r8);
        if (r10 != null) goto L16;
        r10 = new dr0(this, r8);
        r7.put(r8, r10);
    L16:
        if (r6 == (-1)) goto L31;
        String r12 = H;
        if (r0 != r12.length()) goto L31;
        if (xm4.k0(r11, r12, false) == false) goto L31;
        List r13 = qm4.D0(r11.substring(r6 + 1), new char[]{' '});
        r10.e = true;
        r10.g = null;
        int r14 = r13.size();
        r10.j.getClass();
        if (r14 == 2) goto L48;
        tb4.d(r13, "unexpected journal line: ");
        return;
    L48:
        int r15 = r13.size();     // Catch: NumberFormatException -> L27
    L24:
        if (r2 >= r15) goto L51;
        r10.b[r2] = Long.parseLong((String) r13.get(r2));     // Catch: NumberFormatException -> L27
        r2 = r2 + 1;
        goto L24
    L51:
        return;
    L27:
        tb4.d(r13, "unexpected journal line: ");
        return;
    L31:
        if (r6 != (-1)) goto L38;
        String r1 = I;
        if (r0 != r1.length()) goto L38;
        if (xm4.k0(r11, r1, false) == false) goto L38;
        r10.g = new ll(this, r10);
        return;
    L38:
        if (r6 != (-1)) goto L44;
        String r16 = K;
        if (r0 != r16.length()) goto L44;
        if (xm4.k0(r11, r16, false) == false) goto L44;
        return;
    L44:
        mj0.i("unexpected journal line: ".concat(r11));
        return;
    L9:
        if (xm4.k0(r11, r9, false) == false) goto L13;
        r7.remove(r8);
        return;
    L12:
        r8 = r11.substring(r5, r6);
        goto L13
    L46:
        mj0.i("unexpected journal line: ".concat(r11));
    }

    public final synchronized void J() {
        monitor-enter(this);
        wu3 r0 = this.u;     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        r0.close();     // Catch: Throwable -> L6
    L8:
        of4 r1 = this.o.j(this.r);     // Catch: Throwable -> L6
        r1.getClass();     // Catch: Throwable -> L6
        wu3 r2 = new wu3(r1);     // Catch: Throwable -> L6
        r2.y("libcore.io.DiskLruCache");     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        r2.y("1");     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        r2.Q(201105);     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        r2.Q(2);     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        Iterator r3 = this.v.values().iterator();     // Catch: Throwable -> L16
    L11:
        if (r3.hasNext() == false) goto L49;
        dr0 r4 = (dr0) r3.next();     // Catch: Throwable -> L16
        if (r4.g != null) goto L15;
        r2.y(H);     // Catch: Throwable -> L16
        r2.writeByte(32);     // Catch: Throwable -> L16
        r2.y(r4.a);     // Catch: Throwable -> L16
        long[] r5 = r4.b;     // Catch: Throwable -> L16
        int r6 = r5.length;     // Catch: Throwable -> L16
        int r7 = 0;
    L19:
        if (r7 >= r6) goto L21;
        long r8 = r5[r7];     // Catch: Throwable -> L16
        r2.writeByte(32);     // Catch: Throwable -> L16
        r2.Q(r8);     // Catch: Throwable -> L16
        r7 = r7 + 1;     // Catch: Throwable -> L16
        goto L19
    L21:
        r2.writeByte(10);     // Catch: Throwable -> L16
        goto L11
    L15:
        r2.y(I);     // Catch: Throwable -> L16
        r2.writeByte(32);     // Catch: Throwable -> L16
        r2.y(r4.a);     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        goto L11
    L49:
        r2.close();     // Catch: Throwable -> L25
        Throwable th = null;
    L32:
        if (th != null) goto L44;
        boolean r9 = this.o.e(this.q);     // Catch: Throwable -> L6
        hr0 r10 = this.o;
        if (r9 == false) goto L37;
        r10.b(this.q, this.s);     // Catch: Throwable -> L6
        this.o.b(this.r, this.q);     // Catch: Throwable -> L6
        xe5.d(this.o, this.s);     // Catch: Throwable -> L6
    L38:
        wu3 r11 = this.u;     // Catch: Throwable -> L6
        if (r11 == null) goto L41;
        xe5.b(r11);     // Catch: Throwable -> L6
    L41:
        this.u = u();     // Catch: Throwable -> L6
        this.x = false;     // Catch: Throwable -> L6
        this.C = false;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L37:
        r10.b(this.r, this.q);     // Catch: Throwable -> L6
        goto L38
    L44:
        throw th;     // Catch: Throwable -> L6
    L25:
        th = th;
        goto L32
    L16:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L29
    L31:
        th = th;
        goto L32
    L29:
        th = move-exception;
        j51.d(th, th);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public final void K(dr0 r11) {
        String r0 = r11.a;
        if (this.y == false) goto L5;
    L15:
        ll r1 = r11.g;
        if (r1 == null) goto L18;
        r1.d();
    L18:
        int r2 = 0;
    L20:
        if (r2 >= 2) goto L22;
        xe5.d(this.o, (ge3) r11.c.get(r2));
        long r5 = this.t;
        long[] r7 = r11.b;
        this.t = r5 - r7[r2];
        r7[r2] = 0;
        r2 = r2 + 1;
        goto L20
    L22:
        this.w++;
        wu3 r12 = this.u;
        if (r12 == null) goto L25;
        r12.y(J);
        r12.writeByte(32);
        r12.y(r0);
        r12.writeByte(10);
    L25:
        this.v.remove(r0);
        if (s() == false) goto L30;
        fr4.e(this.E, this.F);
        return;
    L30:
        return;
    L5:
        if (r11.h <= 0) goto L10;
        wu3 r3 = this.u;
        if (r3 == null) goto L10;
        r3.y(I);
        r3.writeByte(32);
        r3.y(r0);
        r3.writeByte(10);
        r3.flush();
    L10:
        if (r11.h <= 0) goto L12;
    L13:
        r11.f = true;
        return;
    L12:
        if (r11.g == null) goto L15;
        goto L13
    }

    public final void M() {
    L3:
        if (this.t <= this.p) goto L11;
        Iterator r0 = this.v.values().iterator();
    L6:
        if (r0.hasNext() == false) goto L10;
        dr0 r1 = (dr0) r0.next();
        if (r1.f == true) goto L6;
        K(r1);
        goto L3
    L10:
        return;
    L11:
        this.B = false;
    }

    public final synchronized void b() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.A == true) goto L8;
        monitor-exit(this);
        return;
    L8:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (this.z == true) goto L6;
    L22:
        this.A = true;     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L6:
        if (this.A == true) goto L22;
        Collection r0 = this.v.values();     // Catch: Throwable -> L13
        r0.getClass();     // Catch: Throwable -> L13
        int r2 = 0;
        dr0[] r1 = (dr0[]) r0.toArray(new dr0[0]);     // Catch: Throwable -> L13
        int r3 = r1.length;     // Catch: Throwable -> L13
    L9:
        if (r2 >= r3) goto L16;
        ll r4 = r1[r2].g;     // Catch: Throwable -> L13
        if (r4 == null) goto L15;
        r4.d();     // Catch: Throwable -> L13
    L15:
        r2 = r2 + 1;     // Catch: Throwable -> L13
        goto L9
    L16:
        M();     // Catch: Throwable -> L13
        wu3 r5 = this.u;     // Catch: Throwable -> L13
        if (r5 == null) goto L19;
        xe5.b(r5);     // Catch: Throwable -> L13
    L19:
        this.u = null;     // Catch: Throwable -> L13
        this.A = true;     // Catch: Throwable -> L13
        monitor-exit(this);
    }

    public final synchronized void f(ll r10, boolean r11) {
        monitor-enter(this);
        dr0 r0 = (dr0) r10.p;     // Catch: Throwable -> L18
        if (h12.c(r0.g, r10) == false) goto L62;
        int r2 = 0;
        if (r11 == true) goto L8;
    L23:
        int r12 = 0;
    L24:
        if (r12 >= 2) goto L38;
        ge3 r3 = (ge3) r0.d.get(r12);     // Catch: Throwable -> L18
        if (r11 == true) goto L28;
    L36:
        xe5.d(this.o, r3);     // Catch: Throwable -> L18
    L37:
        r12 = r12 + 1;     // Catch: Throwable -> L18
        goto L24
    L28:
        if (r0.f == true) goto L36;
        if (this.o.e(r3) == false) goto L37;
        ge3 r4 = (ge3) r0.c.get(r12);     // Catch: Throwable -> L18
        this.o.b(r3, r4);     // Catch: Throwable -> L18
        long r5 = r0.b[r12];     // Catch: Throwable -> L18
        Long r6 = (Long) this.o.g(r4).e;     // Catch: Throwable -> L18
        if (r6 == null) goto L34;
        long r7 = r6.longValue();     // Catch: Throwable -> L18
    L35:
        r0.b[r12] = r7;     // Catch: Throwable -> L18
        this.t = (this.t - r5) + r7;     // Catch: Throwable -> L18
        goto L37
    L34:
        r7 = 0;
        goto L35
    L38:
        r0.g = null;     // Catch: Throwable -> L18
        if (r0.f == false) goto L43;
        K(r0);     // Catch: Throwable -> L18
        monitor-exit(this);
        return;
    L43:
        this.w++;     // Catch: Throwable -> L18
        wu3 r13 = this.u;     // Catch: Throwable -> L18
        r13.getClass();     // Catch: Throwable -> L18
        if (r0.e == true) goto L48;
        if (r11 == true) goto L48;
        this.v.remove(r0.a);     // Catch: Throwable -> L18
        r13.y(J);     // Catch: Throwable -> L18
        r13.writeByte(32);     // Catch: Throwable -> L18
        r13.y(r0.a);     // Catch: Throwable -> L18
        r13.writeByte(10);     // Catch: Throwable -> L18
    L54:
        r13.flush();     // Catch: Throwable -> L18
        if (this.t <= this.p) goto L57;
    L58:
        fr4.e(this.E, this.F);     // Catch: Throwable -> L18
    L59:
        monitor-exit(this);
        return;
    L57:
        if (s() == false) goto L59;
    L48:
        r0.e = true;     // Catch: Throwable -> L18
        r13.y(H);     // Catch: Throwable -> L18
        r13.writeByte(32);     // Catch: Throwable -> L18
        r13.y(r0.a);     // Catch: Throwable -> L18
        long[] r1 = r0.b;     // Catch: Throwable -> L18
        int r8 = r1.length;     // Catch: Throwable -> L18
    L49:
        if (r2 >= r8) goto L51;
        long r9 = r1[r2];     // Catch: Throwable -> L18
        r13.writeByte(32);     // Catch: Throwable -> L18
        r13.Q(r9);     // Catch: Throwable -> L18
        r2 = r2 + 1;     // Catch: Throwable -> L18
        goto L49
    L51:
        r13.writeByte(10);     // Catch: Throwable -> L18
        if (r11 == false) goto L54;
        long r14 = this.D;     // Catch: Throwable -> L18
        this.D = 1 + r14;     // Catch: Throwable -> L18
        r0.i = r14;     // Catch: Throwable -> L18
        goto L54
    L8:
        if (r0.e == true) goto L23;
        int r15 = 0;
    L10:
        if (r15 >= 2) goto L23;
        boolean[] r16 = (boolean[]) r10.q;     // Catch: Throwable -> L18
        r16.getClass();     // Catch: Throwable -> L18
        if (r16[r15] == false) goto L21;
        if (this.o.e((ge3) r0.d.get(r15)) == false) goto L15;
        r15 = r15 + 1;
        goto L10
    L15:
        r10.a();     // Catch: Throwable -> L18
        monitor-exit(this);
        return;
    L21:
        r10.a();     // Catch: Throwable -> L18
        throw new IllegalStateException("Newly created entry didn't create value for index " + r15);     // Catch: Throwable -> L18
    L62:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.z == true) goto L7;
        monitor-exit(this);
        return;
    L7:
        b();     // Catch: Throwable -> L10
        M();     // Catch: Throwable -> L10
        wu3 r0 = this.u;     // Catch: Throwable -> L10
        r0.getClass();     // Catch: Throwable -> L10
        r0.flush();     // Catch: Throwable -> L10
        monitor-exit(this);
    }

    public final synchronized ll j(String r6, long r7) {
        monitor-enter(this);
        r6.getClass();     // Catch: Throwable -> L10
        q();     // Catch: Throwable -> L10
        b();     // Catch: Throwable -> L10
        R(r6);     // Catch: Throwable -> L10
        dr0 r0 = (dr0) this.v.get(r6);     // Catch: Throwable -> L10
        if (r7 == (-1)) goto L14;
        if (r0 != null) goto L8;
    L12:
        monitor-exit(this);
        return null;
    L8:
        if (r0.i != r7) goto L12;
    L14:
        if (r0 == null) goto L17;
        ll r8 = r0.g;     // Catch: Throwable -> L10
    L18:
        if (r8 == null) goto L21;
        monitor-exit(this);
        return null;
    L21:
        if (r0 == null) goto L27;
        if (r0.h == 0) goto L27;
        monitor-exit(this);
        return null;
    L27:
        if (this.B == false) goto L29;
    L40:
        fr4.e(this.E, this.F);     // Catch: Throwable -> L10
        monitor-exit(this);
        return null;
    L29:
        if (this.C == true) goto L40;
        wu3 r9 = this.u;     // Catch: Throwable -> L10
        r9.getClass();     // Catch: Throwable -> L10
        r9.y(I);     // Catch: Throwable -> L10
        r9.writeByte(32);     // Catch: Throwable -> L10
        r9.y(r6);     // Catch: Throwable -> L10
        r9.writeByte(10);     // Catch: Throwable -> L10
        r9.flush();     // Catch: Throwable -> L10
        if (this.x == false) goto L35;
        monitor-exit(this);
        return null;
    L35:
        if (r0 != null) goto L37;
        r0 = new dr0(this, r6);     // Catch: Throwable -> L10
        this.v.put(r6, r0);     // Catch: Throwable -> L10
    L37:
        ll r10 = new ll(this, r0);     // Catch: Throwable -> L10
        r0.g = r10;     // Catch: Throwable -> L10
        monitor-exit(this);
        return r10;
    L17:
        r8 = null;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized fr0 n(String r4) {
        monitor-enter(this);
        r4.getClass();     // Catch: Throwable -> L16
        q();     // Catch: Throwable -> L16
        b();     // Catch: Throwable -> L16
        R(r4);     // Catch: Throwable -> L16
        dr0 r0 = (dr0) this.v.get(r4);     // Catch: Throwable -> L16
        if (r0 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        fr0 r1 = r0.a();     // Catch: Throwable -> L16
        if (r1 != null) goto L12;
        monitor-exit(this);
        return null;
    L12:
        this.w++;     // Catch: Throwable -> L16
        wu3 r2 = this.u;     // Catch: Throwable -> L16
        r2.getClass();     // Catch: Throwable -> L16
        r2.y(K);     // Catch: Throwable -> L16
        r2.writeByte(32);     // Catch: Throwable -> L16
        r2.y(r4);     // Catch: Throwable -> L16
        r2.writeByte(10);     // Catch: Throwable -> L16
        if (s() == false) goto L18;
        fr4.e(this.E, this.F);     // Catch: Throwable -> L16
    L18:
        monitor-exit(this);
        return r1;
    L16:
        th = move-exception;
        throw th;
    }

    public final synchronized void q() {
        monitor-enter(this);
        tl1 r1 = ze5.a;     // Catch: Throwable -> L15
        if (this.z == false) goto L9;
        monitor-exit(this);
        return;
    L9:
        if (this.o.e(this.s) == false) goto L17;
        boolean r2 = this.o.e(this.q);     // Catch: Throwable -> L15
        hr0 r3 = this.o;
        ge3 r4 = this.s;
        if (r2 == false) goto L14;
        r3.getClass();     // Catch: Throwable -> L15
        r4.getClass();     // Catch: Throwable -> L15
        r3.d(r4);     // Catch: Throwable -> L15
        goto L17
    L14:
        r3.b(r4, this.q);     // Catch: Throwable -> L15
    L17:
        hr0 r5 = this.o;     // Catch: Throwable -> L15
        ge3 r6 = this.s;     // Catch: Throwable -> L15
        r5.getClass();     // Catch: Throwable -> L15
        r6.getClass();     // Catch: Throwable -> L15
        of4 r7 = r5.j(r6);     // Catch: Throwable -> L15
        r5.c.d(r6);     // Catch: Throwable -> L23 IOException -> L30
        if (r7 != null) goto L57;
    L22:
        boolean r8 = true;
    L38:
        this.y = r8;     // Catch: Throwable -> L15
        if (this.o.e(this.q) == true) goto L59;
    L50:
        J();     // Catch: Throwable -> L15
        this.z = true;     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L59:
        F();     // Catch: Throwable -> L15 IOException -> L43
        v();     // Catch: Throwable -> L15 IOException -> L43
        this.z = true;     // Catch: Throwable -> L15 IOException -> L43
        monitor-exit(this);
        return;
    L43:
        e = move-exception;
        qg3 r9 = qg3.a;     // Catch: Throwable -> L15
        qg3 r10 = qg3.a;     // Catch: Throwable -> L15
        String r0 = "DiskLruCache " + this.n + " is corrupt: " + e.getMessage() + ", removing";     // Catch: Throwable -> L15
        r10.getClass();     // Catch: Throwable -> L15
        qg3.i(r0, 5, e);     // Catch: Throwable -> L15
        close();     // Catch: Throwable -> L47
        xe5.c(this.o, this.n);     // Catch: Throwable -> L47
        this.A = false;     // Catch: Throwable -> L15
        goto L50
    L47:
        th = move-exception;
        this.A = false;     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L57:
        r7.close();     // Catch: Throwable -> L56
        goto L22
    L30:
        if (r7 != null) goto L62;
    L35:
        th = null;
    L34:
        th = th;
    L36:
        if (th != null) goto L53;
        r5.c.d(r6);     // Catch: Throwable -> L15
        r8 = false;
        goto L38
    L53:
        throw th;     // Catch: Throwable -> L15
    L62:
        r7.close();     // Catch: Throwable -> L33
    L33:
        th = th;
    L23:
        th = th;
        if (r7 == null) goto L36;
        r7.close();     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        j51.d(th, th);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }

    public final boolean s() {
        int r0 = this.w;
        if (r0 >= 2000) goto L5;
        return false;
    L5:
        if (r0 < this.v.size()) goto L10;
        return true;
    L10:
        return false;
    }

    public final wu3 u() {
        hr0 r0 = this.o;
        r0.getClass();
        ge3 r1 = this.q;
        r1.getClass();
        return new wu3(new f61(r0.c.a(r1), new ir0(0, this)));
    }

    public final void v() {
        ge3 r0 = this.r;
        hr0 r1 = this.o;
        xe5.d(r1, r0);
        Iterator r2 = this.v.values().iterator();
    L4:
        if (r2.hasNext() == false) goto L13;
        Object r3 = r2.next();
        r3.getClass();
        dr0 r4 = (dr0) r3;
        int r5 = 0;
        if (r4.g == null) goto L7;
        r4.g = null;
    L10:
        if (r5 >= 2) goto L12;
        xe5.d(r1, (ge3) r4.c.get(r5));
        xe5.d(r1, (ge3) r4.d.get(r5));
        r5 = r5 + 1;
        goto L10
    L12:
        r2.remove();
    L7:
        if (r5 >= 2) goto L4;
        this.t += r4.b[r5];
        r5 = r5 + 1;
        goto L7
    }
}
