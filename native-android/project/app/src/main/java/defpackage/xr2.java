package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xr2 implements oi3 {
    public final WeakReference n;
    public final WeakReference o;

    public xr2(tn2 r2, al3 r3) {
        this.n = new WeakReference(r2);
        this.o = new WeakReference(r3);
    }

    @Override // defpackage.oi3
    public final void A(jw4 r3) {
        tn2 r0 = c();
        if (r0 == null) goto L10;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.b(r3);
        r0.c.a(true, false);
        r0.f(new er1(27));
        return;
    }

    @Override // defpackage.oi3
    public final void C(int r3, boolean r4) {
        tn2 r0 = c();
        if (r0 == null) goto L21;
        r0.F();
        if (((al3) this.o.get()) == null) goto L22;
        r0.r = r0.r.c(r3, r4);
        r0.c.a(true, true);
        is2 r2 = ((ls2) r0.h.i.r).p;     // Catch: RemoteException -> L15
        if (r2 == null) goto L20;
        if (r4 == false) goto L13;
        r3 = 0;
    L13:
        r2.d = r3;     // Catch: RemoteException -> L15
        r2.a().setCurrentVolume(r3);     // Catch: RemoteException -> L15
        return;
    L20:
        return;
    L15:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L22:
        return;
    }

    @Override // defpackage.oi3
    public final void E(long r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        jg0 r19 = r1.r;
        hp0 r20 = r1.s;
        int r21 = r1.t;
        boolean r22 = r1.u;
        boolean r23 = r1.v;
        int r24 = r1.w;
        boolean r25 = r1.x;
        boolean r26 = r1.y;
        int r27 = r1.z;
        int r28 = r1.A;
        do2 r29 = r1.B;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r27, r28, r25, r26, r29, r40, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.getClass();     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void F(do2 r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        jg0 r19 = r1.r;
        hp0 r20 = r1.s;
        int r21 = r1.t;
        boolean r22 = r1.u;
        boolean r23 = r1.v;
        int r24 = r1.w;
        boolean r25 = r1.x;
        boolean r26 = r1.y;
        int r27 = r1.z;
        int r28 = r1.A;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r27, r28, r25, r26, r40, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.x();     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void G(do2 r3) {
        tn2 r2 = c();
        if (r2 != null) goto L5;
        return;
    L5:
        r2.F();
        r2.r = r2.r.g(r3);
        r2.c.a(true, true);
        r2.h.i.q(r3);     // Catch: RemoteException -> L8
        return;
    L8:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
    }

    @Override // defpackage.oi3
    public final void H(long r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        jg0 r19 = r1.r;
        hp0 r20 = r1.s;
        int r21 = r1.t;
        boolean r22 = r1.u;
        boolean r23 = r1.v;
        int r24 = r1.w;
        boolean r25 = r1.x;
        boolean r26 = r1.y;
        int r27 = r1.z;
        int r28 = r1.A;
        do2 r29 = r1.B;
        long r30 = r1.C;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r27, r28, r25, r26, r29, r30, r40, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.getClass();     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void I(cu4 r3, int r4) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        al3 r2 = (al3) this.o.get();
        if (r2 != null) goto L8;
        return;
    L8:
        r0.r = r0.r.n(r3, r2.X0(), r4);
        r0.c.a(false, true);
        r0.h.i.w(r3);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void J() {
        tn2 r6 = c();
        if (r6 == null) goto L9;
        r6.F();
        na4 r0 = r6.g.f;
        yw1 r1 = r0.u();
        int r2 = 0;
    L7:
        if (r2 >= r1.size()) goto L11;
        fr2 r3 = (fr2) r1.get(r2);
        r0.A(r3);
        r6.e(r3, new er1(29));
        r2 = r2 + 1;
        goto L7
    L11:
        return;
    }

    @Override // defpackage.oi3
    public final void N(qh3 r2) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.e(r2);
        r0.c.a(true, true);
        ls2 r1 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L11
        r1.P(r1.g.s);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void O(mi3 r2) {
        tn2 r0 = c();
        if (r0 == null) goto L10;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.h(r2);
        return;
    }

    @Override // defpackage.oi3
    public final void Q(hp0 r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        jg0 r19 = r1.r;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r40, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.j();     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void R(long r40) {
        tn2 r0 = c();
        if (r0 == null) goto L17;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        jg0 r19 = r1.r;
        hp0 r20 = r1.s;
        int r21 = r1.t;
        boolean r22 = r1.u;
        boolean r23 = r1.v;
        int r24 = r1.w;
        boolean r25 = r1.x;
        boolean r26 = r1.y;
        int r27 = r1.z;
        int r28 = r1.A;
        do2 r29 = r1.B;
        long r30 = r1.C;
        long r31 = r1.D;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r27, r28, r25, r26, r29, r30, r31, r40, r32, r33);
        r0.c.a(true, true);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r3 = r1.o;
        int r16 = r1.p;
        il r17 = r1.q;
        jg0 r18 = r1.r;
        hp0 r19 = r1.s;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r40, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r3, r17, r16, r18, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        ls2 r35 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L18
        r35.P(r35.g.s);     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void T(int r3, int r4) {
        tn2 r0 = c();
        if (r0 == null) goto L10;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.f(new v31(r3, r4, 3));
        return;
    }

    @Override // defpackage.oi3
    public final void V(boolean r40) {
        tn2 r1 = c();
        if (r1 == null) goto L24;
        r1.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r0 = r1.r;
        PlaybackException r3 = r0.a;
        int r4 = r0.b;
        za4 r5 = r0.c;
        pi3 r6 = r0.d;
        pi3 r7 = r0.e;
        int r8 = r0.f;
        qh3 r9 = r0.g;
        int r10 = r0.h;
        boolean r11 = r0.i;
        cu4 r13 = r0.j;
        int r14 = r0.k;
        s55 r12 = r0.l;
        do2 r15 = r0.m;
        float r2 = r0.n;
        float r16 = r0.o;
        int r17 = r0.p;
        il r18 = r0.q;
        jg0 r19 = r0.r;
        hp0 r20 = r0.s;
        int r21 = r0.t;
        boolean r22 = r0.u;
        boolean r23 = r0.v;
        int r24 = r0.w;
        boolean r25 = r0.y;
        int r26 = r0.z;
        int r27 = r0.A;
        do2 r28 = r0.B;
        long r29 = r0.C;
        long r30 = r0.D;
        long r31 = r0.E;
        jw4 r32 = r0.F;
        cw4 r33 = r0.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r1.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r26, r27, r40, r25, r28, r29, r30, r31, r32, r33);
        r1.c.a(true, true);
        ls2 r35 = (ls2) r1.h.i.r;     // Catch: RemoteException -> L18
        r35.P(r35.g.s);     // Catch: RemoteException -> L18
    L20:
        r1.C();
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        goto L20
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void a(s55 r40) {
        tn2 r0 = c();
        if (r0 != null) goto L5;
        return;
    L5:
        r0.F();
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r12 = r1.o;
        int r16 = r1.p;
        il r17 = r1.q;
        jg0 r18 = r1.r;
        hp0 r19 = r1.s;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L8;
    L11:
        boolean r34 = true;
    L12:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r40, r13, r14, r15, r2, r12, r17, r16, r18, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.getClass();     // Catch: RemoteException -> L15
        return;
    L15:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L8:
        if (r5.a.b < r13.o()) goto L11;
        r34 = false;
        goto L12
    }

    @Override // defpackage.oi3
    public final void b(int r40) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        il r17 = r1.q;
        jg0 r18 = r1.r;
        hp0 r19 = r1.s;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r40, r18, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.getClass();     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    public final tn2 c() {
        return (tn2) this.n.get();
    }

    @Override // defpackage.oi3
    public final void e(jg0 r40) {
        tn2 r0 = c();
        if (r0 == null) goto L17;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        int r4 = r1.b;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r16 = r1.o;
        int r17 = r1.p;
        il r18 = r1.q;
        hp0 r19 = r1.s;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r40, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void f(int r3) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.i(r3);
        r0.c.a(true, true);
        r0.h.i.s(r3);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void g(int r4) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r3 = r0.r;
        boolean r1 = r3.v;
        r0.r = r3.d(r3.w, r4, r1);
        r0.c.a(true, true);
        ls2 r5 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L11
        r5.P(r5.g.s);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void k(pi3 r2, pi3 r3, int r4) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.h(r2, r3, r4);
        r0.c.a(true, true);
        ls2 r1 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L11
        r1.P(r1.g.s);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void n(il r3) {
        tn2 r0 = c();
        if (r0 == null) goto L19;
        r0.F();
        if (((al3) this.o.get()) == null) goto L20;
        r0.r = r0.r.a(r3);
        r0.c.a(true, true);
        ls2 r2 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L13
        if (r2.g.s.F().a != 0) goto L18;
        ((kr2) r2.m.o).a.setPlaybackToLocal(r3.c());     // Catch: RemoteException -> L13
        return;
    L18:
        return;
    L13:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L20:
        return;
    }

    @Override // defpackage.oi3
    public final void o(cw4 r2) {
        tn2 r0 = c();
        if (r0 == null) goto L10;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.o(r2);
        r0.c.a(true, true);
        r0.f(new er1(28));
        return;
    }

    @Override // defpackage.oi3
    public final void q(boolean r40) {
        tn2 r1 = c();
        if (r1 == null) goto L24;
        r1.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r0 = r1.r;
        PlaybackException r3 = r0.a;
        int r4 = r0.b;
        za4 r5 = r0.c;
        pi3 r6 = r0.d;
        pi3 r7 = r0.e;
        int r8 = r0.f;
        qh3 r9 = r0.g;
        int r10 = r0.h;
        boolean r11 = r0.i;
        cu4 r13 = r0.j;
        int r14 = r0.k;
        s55 r12 = r0.l;
        do2 r15 = r0.m;
        float r2 = r0.n;
        float r16 = r0.o;
        int r17 = r0.p;
        il r18 = r0.q;
        jg0 r19 = r0.r;
        hp0 r20 = r0.s;
        int r21 = r0.t;
        boolean r22 = r0.u;
        boolean r23 = r0.v;
        int r24 = r0.w;
        boolean r25 = r0.x;
        int r26 = r0.z;
        int r27 = r0.A;
        do2 r28 = r0.B;
        long r29 = r0.C;
        long r30 = r0.D;
        long r31 = r0.E;
        jw4 r32 = r0.F;
        cw4 r33 = r0.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r1.r = new lk3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r18, r17, r19, r20, r21, r22, r23, r24, r26, r27, r25, r40, r28, r29, r30, r31, r32, r33);
        r1.c.a(true, true);
        r1.h.i.getClass();     // Catch: RemoteException -> L18
    L20:
        r1.C();
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        goto L20
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void r(int r3, boolean r4) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r2 = r0.r;
        r0.r = r2.d(r3, r2.z, r4);
        r0.c.a(true, true);
        ls2 r5 = (ls2) r0.h.i.r;     // Catch: RemoteException -> L11
        r5.P(r5.g.s);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void s(float r2) {
        tn2 r1 = c();
        if (r1 != null) goto L5;
        return;
    L5:
        r1.F();
        r1.r = r1.r.p(r2);
        r1.c.a(true, true);
        r1.h.i.getClass();     // Catch: RemoteException -> L8
        return;
    L8:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
    }

    @Override // defpackage.oi3
    public final void t(int r40, gn2 r41) {
        tn2 r0 = c();
        if (r0 == null) goto L23;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        lk3 r1 = r0.r;
        PlaybackException r3 = r1.a;
        za4 r5 = r1.c;
        pi3 r6 = r1.d;
        pi3 r7 = r1.e;
        int r8 = r1.f;
        qh3 r9 = r1.g;
        int r10 = r1.h;
        boolean r11 = r1.i;
        cu4 r13 = r1.j;
        int r14 = r1.k;
        s55 r12 = r1.l;
        do2 r15 = r1.m;
        float r2 = r1.n;
        float r4 = r1.o;
        int r16 = r1.p;
        il r17 = r1.q;
        jg0 r18 = r1.r;
        hp0 r19 = r1.s;
        int r20 = r1.t;
        boolean r21 = r1.u;
        boolean r22 = r1.v;
        int r23 = r1.w;
        boolean r24 = r1.x;
        boolean r25 = r1.y;
        int r26 = r1.z;
        int r27 = r1.A;
        do2 r28 = r1.B;
        long r29 = r1.C;
        long r30 = r1.D;
        long r31 = r1.E;
        jw4 r32 = r1.F;
        cw4 r33 = r1.G;
        if (r13.p() == false) goto L11;
    L14:
        boolean r34 = true;
    L15:
        rr2.w(r34);
        r0.r = new lk3(r3, r40, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r4, r17, r16, r18, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r32, r33);
        r0.c.a(true, true);
        r0.h.i.n(r41);     // Catch: RemoteException -> L18
        return;
    L18:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L11:
        if (r5.a.b < r13.o()) goto L14;
        r34 = false;
        goto L15
    }

    @Override // defpackage.oi3
    public final void v(int r4) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        al3 r3 = (al3) this.o.get();
        if (r3 != null) goto L8;
        return;
    L8:
        r0.r = r0.r.f(r4, r3.U());
        r0.c.a(true, true);
        lr0 r5 = r0.h.i;     // Catch: RemoteException -> L11
        r3.U();     // Catch: RemoteException -> L11
        ls2 r6 = (ls2) r5.r;     // Catch: RemoteException -> L11
        r6.P(r6.g.s);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }

    @Override // defpackage.oi3
    public final void x(boolean r3) {
        tn2 r0 = c();
        if (r0 == null) goto L16;
        r0.F();
        if (((al3) this.o.get()) != null) goto L8;
        return;
    L8:
        r0.r = r0.r.k(r3);
        r0.c.a(true, true);
        r0.h.i.u(r3);     // Catch: RemoteException -> L11
        return;
    L11:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    }
}
