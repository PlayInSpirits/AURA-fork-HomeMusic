package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements th0, Runnable, Comparable, r51 {
    public xq0 A;
    public db3 B;
    public m11 C;
    public int D;
    public long E;
    public boolean F;
    public Object G;
    public Thread H;
    public f42 I;
    public f42 J;
    public Object K;
    public sh0 L;
    public volatile uh0 M;
    public volatile boolean N;
    public volatile boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public final wi0 n;
    public final ArrayList o;
    public final ul4 p;
    public final sd0 q;
    public final io3 r;
    public final jv3 s;
    public final yl t;
    public ii1 u;
    public f42 v;
    public eq3 w;
    public n11 x;
    public int y;
    public int z;

    public xi0(sd0 r2, i61 r3) {
        this.n = new wi0();
        this.o = new ArrayList();
        this.p = new ul4();
        this.s = new jv3();
        this.t = new yl();
        this.q = r2;
        this.r = r3;
    }

    @Override // defpackage.th0
    public final void a(f42 r1, Object r2, sh0 r3, int r4, f42 r5) {
        this.I = r1;
        this.K = r2;
        this.L = r3;
        this.S = r4;
        this.J = r5;
        boolean r6 = false;
        if (r1 == this.n.a().get(0)) goto L5;
        r6 = true;
    L5:
        this.P = r6;
        if (Thread.currentThread() == this.H) goto L13;
        this.R = 3;
        m11 r7 = this.C;
        if (r7.z == false) goto L10;
        li1 r8 = r7.v;
    L11:
        r8.execute(this);
        return;
    L10:
        r8 = r7.u;
        goto L11
    L13:
        f();
    }

    @Override // defpackage.th0
    public final void b(f42 r3, Exception r4, sh0 r5, int r6) {
        r5.c();
        GlideException r0 = new GlideException("Fetching data failed", Collections.singletonList(r4));
        Class r7 = r5.a();
        r0.o = r3;
        r0.p = r6;
        r0.q = r7;
        this.o.add(r0);
        if (Thread.currentThread() == this.H) goto L10;
        this.R = 2;
        m11 r8 = this.C;
        if (r8.z == false) goto L7;
        li1 r9 = r8.v;
    L8:
        r9.execute(this);
        return;
    L7:
        r9 = r8.u;
        goto L8
    L10:
        l();
    }

    @Override // defpackage.r51
    public final ul4 c() {
        return this.p;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        xi0 r4 = (xi0) r3;
        int r0 = this.w.ordinal() - r4.w.ordinal();
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return this.D - r4.D;
    }

    public final q04 d(sh0 r6, Object r7, int r8) {
        if (r7 != null) goto L16;
        r6.c();
        return null;
    L16:
        int r2 = ee2.b;     // Catch: Throwable -> L10
        long r3 = SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L10
        q04 r9 = e(r8, r7);     // Catch: Throwable -> L10
        if (Log.isLoggable("DecodeJob", 2) == false) goto L12;
        i("Decoded result " + r9, r3, null);     // Catch: Throwable -> L10
    L12:
        r6.c();
        return r9;
    L10:
        th = move-exception;
        r6.c();
        throw th;
    }

    public final q04 e(int r9, Object r10) {
        Class<?> r0 = r10.getClass();
        wi0 r1 = this.n;
        fd2 r2 = r1.c(r0);
        db3 r3 = this.B;
        if (Build.VERSION.SDK_INT >= 26) goto L6;
    L4:
        db3 r7 = r3;
        yh0 r6 = this.u.a().g(r10);
        q04 r8 = r2.a(this.y, this.z, new x7(r9, 5, this), r6, r7);     // Catch: Throwable -> L23
        r6.c();
        return r8;
    L23:
        th = move-exception;
        r6.c();
        throw th;
    L6:
        if (r9 != 4) goto L8;
    L11:
        boolean r4 = true;
    L12:
        ab3 r5 = iu0.i;
        Boolean r11 = (Boolean) r3.c(r5);
        if (r11 != null) goto L15;
    L18:
        r3 = new db3();
        yx r12 = this.B.b;
        yx r13 = r3.b;
        r13.g(r12);
        r13.put(r5, Boolean.valueOf(r4));
        goto L4
    L15:
        if (r11.booleanValue() == false) goto L4;
        if (r4 == false) goto L18;
    L8:
        if (r1.r == true) goto L11;
        r4 = false;
        goto L12
    }

    public final void f() {
        if (Log.isLoggable("DecodeJob", 2) == false) goto L5;
        i("Retrieved data", this.E, "data: " + this.K + ", cache key: " + this.I + ", fetcher: " + this.L);
    L5:
        de2 r2 = null;
        q04 r0 = d(this.L, this.K, this.S);     // Catch: GlideException -> L8
    L10:
        if (r0 == null) goto L77;
        int r3 = this.S;
        if ((r0 instanceof xy1) == false) goto L14;
        ((xy1) r0).a();
    L14:
        boolean r5 = false;
        int r6 = 1;
        if (((de2) this.s.p) == null) goto L17;
        r2 = (de2) de2.r.b();
        r2.q = false;
        r2.p = true;
        r2.o = r0;
        r0 = r2;
    L17:
        n();
        m11 r4 = this.C;
        monitor-enter(r4);
        r4.B = r0;     // Catch: Throwable -> L73
        r4.C = r3;     // Catch: Throwable -> L73
        monitor-exit(r4);     // Catch: Throwable -> L73
        monitor-enter(r4);
        r4.o.a();     // Catch: Throwable -> L27
        if (r4.I == false) goto L30;
        r4.B.b();     // Catch: Throwable -> L27
        r4.f();     // Catch: Throwable -> L27
        monitor-exit(r4);     // Catch: Throwable -> L27
    L39:
        this.Q = 5;
        jv3 r7 = this.s;     // Catch: Throwable -> L50
        if (((de2) r7.p) == null) goto L43;
        r5 = true;
    L43:
        if (r5 == true) goto L87;
    L52:
        if (r2 == null) goto L54;
        r2.a();
    L54:
        yl r1 = this.t;
        monitor-enter(r1);
        r1.b = true;     // Catch: Throwable -> L60
        boolean r8 = r1.b();     // Catch: Throwable -> L60
        monitor-exit(r1);
        if (r8 == false) goto L91;
        k();
        return;
    L91:
        return;
    L60:
        th = move-exception;
        throw th;
    L87:
        this.q.a().M((f42) r7.n, new ns3((w04) r7.o, (de2) r7.p, this.B, 2));     // Catch: Throwable -> L47
        ((de2) r7.p).a();     // Catch: Throwable -> L50
        goto L52
    L47:
        th = move-exception;
        ((de2) r7.p).a();     // Catch: Throwable -> L50
        throw th;     // Catch: Throwable -> L50
    L50:
        th = move-exception;
        if (r2 == null) goto L90;
        r2.a();
        throw th;
    L90:
        throw th;
    L30:
        if (r4.n.n.isEmpty() == true) goto L70;
        if (r4.D == true) goto L68;
        om0 r9 = r4.r;     // Catch: Throwable -> L27
        q04 r10 = r4.B;     // Catch: Throwable -> L27
        boolean r11 = r4.y;     // Catch: Throwable -> L27
        n11 r12 = r4.x;     // Catch: Throwable -> L27
        i11 r13 = r4.p;     // Catch: Throwable -> L27
        r9.getClass();     // Catch: Throwable -> L27
        r4.G = new o11(r10, r11, true, r12, r13);     // Catch: Throwable -> L27
        r4.D = true;     // Catch: Throwable -> L27
        l11 r14 = r4.n;     // Catch: Throwable -> L27
        r14.getClass();     // Catch: Throwable -> L27
        ArrayList r15 = new ArrayList(r14.n);     // Catch: Throwable -> L27
        r4.d(r15.size() + 1);     // Catch: Throwable -> L27
        n11 r16 = r4.x;     // Catch: Throwable -> L27
        o11 r17 = r4.G;     // Catch: Throwable -> L27
        monitor-exit(r4);     // Catch: Throwable -> L27
        r4.s.d(r4, r16, r17);
        int r18 = r15.size();
        int r19 = 0;
    L36:
        if (r19 >= r18) goto L38;
        Object r20 = r15.get(r19);
        r19 = r19 + 1;
        k11 r21 = (k11) r20;
        r21.b.execute(new j11(r4, r21.a, r6));
        goto L36
    L38:
        r4.b();
        goto L39
    L68:
        throw new IllegalStateException("Already have resource");     // Catch: Throwable -> L27
    L70:
        throw new IllegalStateException("Received a resource without any callbacks to notify");     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;
    L73:
        th = move-exception;
        throw th;
    L77:
        l();
        return;
    L8:
        e = move-exception;
        f42 r22 = this.J;
        int r23 = this.S;
        e.o = r22;
        e.p = r23;
        e.q = null;
        this.o.add(e);
        r0 = null;
        goto L10
    }

    public final uh0 g() {
        int r0 = xa3.w(this.Q);
        wi0 r2 = this.n;
        if (r0 == 1) goto L18;
        if (r0 == 2) goto L16;
        if (r0 == 3) goto L14;
        if (r0 != 5) goto L11;
        return null;
    L11:
        kf2.o("Unrecognized stage: ".concat(xa3.y(this.Q)));
        return null;
    L14:
        return new fj4(r2, this);
    L16:
        return new ph0(r2.a(), r2, this);
    L18:
        return new r04(r2, this);
    }

    public final int h(int r6) {
        int r0 = xa3.w(r6);
        boolean r1 = false;
        if (r0 == 0) goto L27;
        if (r0 == 1) goto L20;
        if (r0 == 2) goto L14;
        if (r0 != 3) goto L9;
        return 6;
    L9:
        if (r0 == 5) goto L34;
        kf2.n("Unrecognized stage: ".concat(xa3.y(r6)));
        return 0;
    L34:
        return 6;
    L14:
        if (this.F == true) goto L33;
        return 4;
    L33:
        return 6;
    L20:
        switch(this.A.a) {
            case 0: goto L21;
            case 1: goto L22;
            case 2: goto L21;
            default: goto L21;
        };
    L21:
        r1 = true;
    L22:
        if (r1 == false) goto L25;
        return 3;
    L25:
        return h(3);
    L27:
        switch(this.A.a) {
            case 0: goto L28;
            case 1: goto L29;
            case 2: goto L29;
            default: goto L28;
        };
    L28:
        r1 = true;
    L29:
        if (r1 == false) goto L32;
        return 2;
    L32:
        return h(2);
    }

    public final void i(String r2, long r3, String r5) {
        StringBuilder r4 = b11.s(r2, " in ");
        r4.append(ee2.a(r3));
        r4.append(", load key: ");
        r4.append(this.x);
        if (r5 == null) goto L5;
        String r1 = ", ".concat(r5);
    L6:
        r4.append(r1);
        r4.append(", thread: ");
        r4.append(Thread.currentThread().getName());
        Log.v("DecodeJob", r4.toString());
        return;
    L5:
        r1 = "";
        goto L6
    }

    public final void j() {
        n();
        GlideException r0 = new GlideException("Failed to load resource", new ArrayList(this.o));
        m11 r1 = this.C;
        monitor-enter(r1);
        r1.E = r0;     // Catch: Throwable -> L40
        monitor-exit(r1);     // Catch: Throwable -> L40
        monitor-enter(r1);
        r1.o.a();     // Catch: Throwable -> L12
        if (r1.I == false) goto L15;
        r1.f();     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
    L24:
        yl r2 = this.t;
        monitor-enter(r2);
        r2.c = true;     // Catch: Throwable -> L31
        boolean r3 = r2.b();     // Catch: Throwable -> L31
        monitor-exit(r2);
        if (r3 == false) goto L49;
        k();
        return;
    L49:
        return;
    L31:
        th = move-exception;
        throw th;
    L15:
        if (r1.n.n.isEmpty() == true) goto L37;
        if (r1.F == true) goto L35;
        r1.F = true;     // Catch: Throwable -> L12
        n11 r4 = r1.x;     // Catch: Throwable -> L12
        l11 r5 = r1.n;     // Catch: Throwable -> L12
        r5.getClass();     // Catch: Throwable -> L12
        ArrayList r6 = new ArrayList(r5.n);     // Catch: Throwable -> L12
        r1.d(r6.size() + 1);     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
        r1.s.d(r1, r4, null);
        int r7 = r6.size();
        int r8 = 0;
        int r9 = 0;
    L21:
        if (r9 >= r7) goto L23;
        Object r10 = r6.get(r9);
        r9 = r9 + 1;
        k11 r11 = (k11) r10;
        r11.b.execute(new j11(r1, r11.a, r8));
        goto L21
    L23:
        r1.b();
        goto L24
    L35:
        throw new IllegalStateException("Already failed once");     // Catch: Throwable -> L12
    L37:
        throw new IllegalStateException("Received an exception without any callbacks to notify");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    L40:
        th = move-exception;
        throw th;
    }

    public final void k() {
        yl r0 = this.t;
        monitor-enter(r0);
        r0.b = false;     // Catch: Throwable -> L9
        r0.a = false;     // Catch: Throwable -> L9
        r0.c = false;     // Catch: Throwable -> L9
        monitor-exit(r0);
        jv3 r1 = this.s;
        r1.n = null;
        r1.o = null;
        r1.p = null;
        wi0 r2 = this.n;
        r2.c = null;
        r2.d = null;
        r2.n = null;
        r2.g = null;
        r2.k = null;
        r2.i = null;
        r2.o = null;
        r2.j = null;
        r2.p = null;
        r2.a.clear();
        r2.l = false;
        r2.b.clear();
        r2.m = false;
        this.N = false;
        this.u = null;
        this.v = null;
        this.B = null;
        this.w = null;
        this.x = null;
        this.C = null;
        this.Q = 0;
        this.M = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.S = 0;
        this.L = null;
        this.E = 0;
        this.O = false;
        this.G = null;
        this.o.clear();
        this.r.a(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final void l() {
        this.H = Thread.currentThread();
        int r0 = ee2.b;
        this.E = SystemClock.elapsedRealtimeNanos();
        boolean r1 = false;
    L4:
        if (this.O == true) goto L18;
        if (this.M == null) goto L18;
        r1 = this.M.c();
        if (r1 == true) goto L18;
        this.Q = h(this.Q);
        this.M = g();
        if (this.Q != 4) goto L4;
        this.R = 2;
        m11 r2 = this.C;
        if (r2.z == false) goto L14;
        li1 r3 = r2.v;
    L15:
        r3.execute(this);
        return;
    L14:
        r3 = r2.u;
    L18:
        if (this.Q != 6) goto L20;
    L21:
        if (r1 == true) goto L30;
        j();
        return;
    L30:
        return;
    L20:
        if (this.O == true) goto L21;
    }

    public final void m() {
        int r0 = xa3.w(this.R);
        if (r0 == 0) goto L23;
        if (r0 != 1) goto L6;
        l();
        return;
    L6:
        if (r0 != 2) goto L9;
        f();
        return;
    L9:
        int r2 = this.R;
        if (r2 != 1) goto L12;
        String r3 = "INITIALIZE";
    L19:
        kf2.o("Unrecognized run reason: ".concat(r3));
        return;
    L12:
        if (r2 != 2) goto L14;
        r3 = "SWITCH_TO_SOURCE_SERVICE";
        goto L19
    L14:
        if (r2 == 3) goto L16;
        r3 = "null";
        goto L19
    L16:
        r3 = "DECODE_DATA";
        goto L19
    L23:
        this.Q = h(1);
        this.M = g();
        l();
    }

    public final void n() {
        this.p.a();
        if (this.N == true) goto L5;
        this.N = true;
        return;
    L5:
        if (this.o.isEmpty() == false) goto L7;
        Throwable r2 = null;
    L8:
        mj0.j("Already notified", r2);
        return;
    L7:
        ArrayList r3 = this.o;
        r2 = (Throwable) r3.get(r3.size() - 1);
        goto L8
    }

    @Override // java.lang.Runnable
    public final void run() {
        sh0 r2 = this.L;
    L21:
        th = move-exception;
        if (r2 == null) goto L33;
        r2.c();
    L33:
        throw th;
    L11:
        e = move-exception;
        throw e;     // Catch: Throwable -> L21
    L9:
        th = move-exception;
        if (Log.isLoggable("DecodeJob", 3) == false) goto L24;
        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.O + ", stage: " + xa3.y(this.Q), th);     // Catch: Throwable -> L21
    L24:
        if (this.Q == 5) goto L27;
        this.o.add(th);     // Catch: Throwable -> L21
        j();     // Catch: Throwable -> L21
    L27:
        if (this.O == true) goto L29;
        throw th;     // Catch: Throwable -> L21
    L29:
        throw th;     // Catch: Throwable -> L21
    L4:
        if (this.O == false) goto L13;
        j();     // Catch: Throwable -> L9 ly -> L11
        if (r2 == null) goto L35;
        r2.c();
        return;
    L35:
        return;
    L13:
        m();     // Catch: Throwable -> L9 ly -> L11
        if (r2 == null) goto L36;
        r2.c();
        return;
    }
}
