package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends bq {
    public final xk0 h;
    public final zh0 i;
    public final i80 j;
    public final ww0 k;
    public final i80 l;
    public final boolean m;
    public final int n;
    public final al0 o;
    public final long p;
    public an2 q;
    public rw4 r;
    public gn2 s;

    static {
        hn2.a("media3.exoplayer.hls");
    }

    public zm1(gn2 r1, zh0 r2, xk0 r3, i80 r4, ww0 r5, i80 r6, al0 r7, long r8, boolean r10, int r11) {
        this.s = r1;
        this.q = r1.c;
        this.i = r2;
        this.h = r3;
        this.j = r4;
        this.k = r5;
        this.l = r6;
        this.o = r7;
        this.p = r8;
        this.m = r10;
        this.n = r11;
    }

    public static tm1 t(long r6, List r8) {
        tm1 r0 = null;
        int r1 = 0;
    L4:
        if (r1 >= r8.size()) goto L14;
        tm1 r2 = (tm1) r8.get(r1);
        long r3 = r2.r;
        if (r3 > r6) goto L11;
        if (r2.y == false) goto L11;
        r0 = r2;
    L13:
        r1 = r1 + 1;
    L11:
        if (r3 <= r6) goto L13;
    L14:
        return r0;
    }

    @Override // defpackage.bq
    public final boolean a(gn2 r5) {
        gn2 r4 = h();
        bn2 r0 = r4.b;
        r0.getClass();
        bn2 r1 = r5.b;
        if (r1 != null) goto L5;
        return false;
    L5:
        if (r1.a.equals(r0.a) == true) goto L7;
        return false;
    L7:
        if (r1.e.equals(r0.e) == true) goto L9;
        return false;
    L9:
        if (Objects.equals(r1.c, r0.c) == true) goto L11;
        return false;
    L11:
        if (r4.c.equals(r5.c) == false) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // defpackage.bq
    public final no2 b(mt2 r15, n9 r16, long r17) {
        ue1 r8 = new ue1((CopyOnWriteArrayList) this.c.q, 0, r15, 8);
        sw0 r6 = new sw0(this.d.c, 0, r15);
        rw4 r4 = this.r;
        ik3 r13 = this.g;
        r13.getClass();
        return new pm1(this.h, this.o, this.i, r4, this.k, r6, this.l, r8, r16, this.j, this.m, this.n, r13);
    }

    @Override // defpackage.bq
    public final synchronized gn2 h() {
        monitor-enter(this);
        gn2 r0 = this.s;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.bq
    public final void j() {
        al0 r3 = this.o;
        i61 r0 = r3.t;
        if (r0 == null) goto L15;
        IOException r1 = (IOException) r0.q;
        if (r1 != null) goto L14;
        id2 r2 = (id2) r0.p;
        if (r2 == null) goto L15;
        int r4 = r2.n;
        IOException r5 = r2.r;
        if (r5 == null) goto L15;
        if (r2.s <= r4) goto L15;
        throw r5;
    L14:
        throw r1;
    L15:
        Uri r6 = r3.x;
        if (r6 == null) goto L32;
        zk0 r7 = (zk0) r3.q.get(r6);
        i61 r8 = r7.o;
        IOException r9 = (IOException) r8.q;
        if (r9 != null) goto L31;
        id2 r10 = (id2) r8.p;
        if (r10 == null) goto L27;
        int r11 = r10.n;
        IOException r12 = r10.r;
        if (r12 == null) goto L27;
        if (r10.s <= r11) goto L27;
        throw r12;
    L27:
        IOException r13 = r7.w;
        if (r13 == null) goto L33;
        throw r13;
    L33:
        return;
    L31:
        throw r9;
    }

    @Override // defpackage.bq
    public final void l(rw4 r20) {
        this.r = r20;
        Looper r1 = Looper.myLooper();
        r1.getClass();
        ik3 r2 = this.g;
        r2.getClass();
        ww0 r3 = this.k;
        r3.e(r1, r2);
        r3.b();
        boolean r4 = false;
        ue1 r5 = new ue1((CopyOnWriteArrayList) this.c.q, 0, null, 8);
        bn2 r6 = h().b;
        r6.getClass();
        Uri r7 = r6.a;
        al0 r8 = this.o;
        r8.getClass();
        r8.u = f35.p(null);
        r8.s = r5;
        r8.v = this;
        Map r12 = Collections.EMPTY_MAP;
        rr2.s(r7, "The uri must be set.");
        ii0 r9 = new ii0(r7, 0, 1, null, r12, 0, -1, null, 1);
        de3 r0 = new de3(((bi0) r8.n.o).m(), r9, r8.o.g());
        if (r8.t != null) goto L5;
        r4 = true;
    L5:
        rr2.w(r4);
        i61 r10 = new i61("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        r8.t = r10;
        r10.u(r0, r8, r8.p.D(r0.c));
    }

    @Override // defpackage.bq
    public final void n(no2 r12) {
        pm1 r13 = (pm1) r12;
        r13.o.r.remove(r13);
        ln1[] r11 = r13.G;
        int r0 = r11.length;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L17;
        ln1 r4 = r11[r2];
        if (r4.Q == false) goto L13;
        kn1[] r5 = r4.I;
        int r6 = r5.length;
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L13;
        kn1 r8 = r5[r7];
        r8.j();
        pw0 r9 = r8.h;
        if (r9 == null) goto L12;
        r9.d(r8.e);
        r8.h = null;
        r8.g = null;
    L12:
        r7 = r7 + 1;
    L13:
        km1 r10 = r4.q;
        int r14 = r10.r.l();
        al0 r15 = r10.g;
        zk0 r16 = (zk0) r15.q.get(r10.e[r14]);
        if (r16 == null) goto L16;
        r16.x = false;
    L16:
        r10.n = null;
        r4.w.p(r4);
        r4.E.removeCallbacksAndMessages(null);
        r4.U = true;
        r4.F.clear();
        r2 = r2 + 1;
        goto L4
    L17:
        r13.D = null;
    }

    @Override // defpackage.bq
    public final void p() {
        al0 r0 = this.o;
        r0.x = null;
        r0.y = null;
        r0.w = null;
        r0.A = -9223372036854775807L;
        r0.t.p(null);
        r0.t = null;
        HashMap r2 = r0.q;
        Iterator r3 = r2.values().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        ((zk0) r3.next()).o.p(null);
        goto L4
    L6:
        r0.u.removeCallbacksAndMessages(null);
        r0.u = null;
        r2.clear();
        this.k.a();
    }

    @Override // defpackage.bq
    public final synchronized void s(gn2 r1) {
        monitor-enter(this);
        this.s = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final void u(ym1 r40) {
        boolean r2 = r40.p;
        boolean r3 = r40.g;
        yw1 r4 = r40.r;
        long r5 = r40.u;
        long r7 = r40.e;
        int r9 = r40.d;
        long r10 = r40.h;
        if (r2 == false) goto L5;
        long r19 = f35.i0(r10);
    L7:
        if (r9 == 2) goto L11;
        if (r9 == 1) goto L11;
        long r17 = -9223372036854775807L;
    L12:
        al0 r12 = this.o;
        r12.w.getClass();
        y41 r15 = new y41(26);
        long r23 = 0;
        if (r12.z == false) goto L83;
        xm1 r13 = r40.v;
        long r25 = r10 - r12.A;
        boolean r14 = r40.o;
        if (r14 == false) goto L17;
        long r16 = r25 + r5;
    L19:
        if (r40.p == false) goto L21;
        long r35 = f35.Q(f35.B(this.p)) - (r10 + r5);
    L22:
        long r6 = this.q.a;
        if (r6 == (-9223372036854775807L)) goto L27;
        long r8 = f35.Q(r6);
    L39:
        long r37 = r5 + r35;
        long r11 = f35.k(r8, r35, r37);
        an2 r18 = h().c;
        if (r18.d == (-3.4028235E38f)) goto L42;
    L48:
        boolean r20 = false;
    L49:
        zm2 r21 = this.q.a();
        r21.a = f35.i0(r11);
        float r22 = 1.0f;
        if (r20 == false) goto L52;
        float r24 = 1.0f;
    L53:
        r21.d = r24;
        if (r20 == true) goto L57;
        r22 = this.q.e;
    L57:
        r21.e = r22;
        an2 r26 = new an2(r21);
        this.q = r26;
        if (r7 != (-9223372036854775807L)) goto L61;
        r7 = r37 - f35.Q(r26.a);
    L61:
        if (r3 == false) goto L64;
        r23 = r7;
    L75:
        if (r9 == 2) goto L77;
    L79:
        boolean r31 = false;
    L80:
        bf4 r110 = new bf4(r17, r19, r16, r40.u, r25, r23, true, !r14, r31, r15, h(), this.q);
    L95:
        m(r110);
        return;
    L77:
        if (r40.f == false) goto L79;
        r31 = true;
        goto L80
    L64:
        tm1 r27 = t(r7, r40.s);
        if (r27 == null) goto L69;
        long r28 = r27.r;
    L67:
        r23 = r28;
        goto L75
    L69:
        if (r4.isEmpty() == true) goto L75;
        vm1 r29 = (vm1) r4.get(f35.d(r4, Long.valueOf(r7), true));
        tm1 r30 = t(r7, r29.z);
        if (r30 == null) goto L74;
        r28 = r30.r;
        goto L67
    L74:
        r28 = r29.r;
        goto L67
    L52:
        r24 = this.q.d;
        goto L53
    L42:
        if (r18.e != (-3.4028235E38f)) goto L48;
        if (r13.c != (-9223372036854775807L)) goto L48;
        if (r13.d != (-9223372036854775807L)) goto L48;
        r20 = true;
        goto L49
    L27:
        if (r7 == (-9223372036854775807L)) goto L29;
        long r32 = r5 - r7;
    L38:
        r8 = r32 + r35;
        goto L39
    L29:
        r32 = r13.d;
        if (r32 != (-9223372036854775807L)) goto L32;
    L34:
        r32 = r13.c;
        if (r32 != (-9223372036854775807L)) goto L38;
        r32 = 3 * r40.m;
        goto L38
    L32:
        if (r40.n == (-9223372036854775807L)) goto L34;
    L21:
        r35 = 0;
        goto L22
    L17:
        r16 = -9223372036854775807L;
        goto L19
    L83:
        if (r7 != (-9223372036854775807L)) goto L85;
    L93:
        long r210 = 0;
    L94:
        long r1 = r40.u;
        r110 = new bf4(r17, r19, r1, r1, 0, r210, true, false, true, r15, h(), null);
        goto L95
    L85:
        if (r4.isEmpty() == true) goto L93;
        if (r3 == false) goto L89;
    L92:
        r210 = r7;
        goto L94
    L89:
        if (r7 == r5) goto L92;
        r7 = ((vm1) r4.get(f35.d(r4, Long.valueOf(r7), true))).r;
    L11:
        r17 = r19;
        goto L12
    L5:
        r19 = -9223372036854775807L;
        goto L7
    }
}
