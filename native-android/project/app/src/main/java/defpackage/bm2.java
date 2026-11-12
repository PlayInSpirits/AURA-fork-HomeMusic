package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bm2 implements rk2 {
    public Surface A;
    public SurfaceHolder B;
    public pf4 C;
    public pu1 D;
    public MediaController E;
    public long F;
    public long G;
    public lk3 H;
    public Bundle I;
    public final sk2 a;
    public final yk b;
    public final mm2 c;
    public final Context d;
    public final cb4 e;
    public final Bundle f;
    public final il2 g;
    public final am2 h;
    public final tc2 i;
    public final rf2 j;
    public final qi k;
    public final SparseArray l;
    public final Handler m;
    public cb4 n;
    public yl2 o;
    public boolean p;
    public lk3 q;
    public PendingIntent r;
    public yw1 s;
    public yw1 t;
    public gy3 u;
    public gy3 v;
    public wa4 w;
    public mi3 x;
    public mi3 y;
    public mi3 z;

    /* JADX WARN: Type inference failed for: r4v4, types: [il2] */
    public bm2(Context r4, sk2 r5, cb4 r6, Bundle r7, Looper r8) {
        this.q = lk3.H;
        this.C = pf4.c;
        this.w = wa4.b;
        gy3 r0 = gy3.r;
        this.s = r0;
        this.t = r0;
        this.u = r0;
        this.v = r0;
        mi3 r1 = mi3.b;
        this.x = r1;
        this.y = r1;
        this.z = Y0(r1, r1);
        cl2 r2 = new cl2(this, 17);
        this.i = new tc2(r8, vp4.a, r2);
        this.m = new Handler(r8);
        this.a = r5;
        rr2.s(r4, "context must not be null");
        rr2.s(r6, "token must not be null");
        this.d = r4;
        this.b = new yk();
        this.c = new mm2(this);
        this.k = new qi(0);
        this.e = r6;
        this.f = r7;
        this.g = new il2(this);
        this.h = new am2(this);
        this.I = Bundle.EMPTY;
        if (r6.a.getType() != 0) goto L5;
        yl2 r9 = null;
    L6:
        this.o = r9;
        rf2 r10 = new rf2();
        r10.o = this;
        r10.n = new Handler(r8, new gt0(2, r10));
        this.j = r10;
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.l = new SparseArray();
        return;
    L5:
        r9 = new yl2(this, r7);
        goto L6
    }

    public static mi3 Y0(mi3 r2, mi3 r3) {
        mi3 r4 = ju2.d(r2, r3);
        if (r4.a(32) == false) goto L5;
        return r4;
    L5:
        xk0 r0 = new xk0(2);
        r0.c(r4.a);
        r0.b(32);
        return new mi3(r0.f());
    }

    public static au4 Z0(ArrayList r4, ArrayList r5) {
        uw1 r1 = new uw1(4);
        r1.d(r4);
        gy3 r2 = r1.f();
        uw1 r3 = new uw1(4);
        r3.d(r5);
        gy3 r6 = r3.f();
        int r7 = r4.size();
        hd5 r8 = ju2.a;
        int[] r9 = new int[r7];
        int r10 = 0;
    L3:
        if (r10 >= r7) goto L6;
        r9[r10] = r10;
        r10 = r10 + 1;
        goto L3
    L6:
        return new au4(r2, r6, r9);
    }

    public static int e1(lk3 r0) {
        return r0.c.a.b;
    }

    public static lk3 i1(lk3 r32, int r33, List r34, long r35, long r37) {
        cu4 r2 = r32.j;
        za4 r3 = r32.c;
        ArrayList r4 = new ArrayList();
        ArrayList r5 = new ArrayList();
        int r6 = 0;
        int r7 = 0;
    L4:
        if (r7 >= r2.o()) goto L6;
        r4.add(r2.m(r7, new bu4(), 0));
        r7 = r7 + 1;
        goto L4
    L6:
        int r8 = 0;
    L8:
        if (r8 >= r34.size()) goto L10;
        gn2 r13 = (gn2) r34.get(r8);
        bu4 r11 = new bu4();
        r11.b(0, r13, null, 0, 0, 0, true, false, null, 0, -9223372036854775807L, -1, -1, 0);
        r4.add(r8 + r33, r11);
        r8 = r8 + 1;
        goto L8
    L10:
        q1(r2, r4, r5);
        au4 r9 = Z0(r4, r5);
        if (r32.j.p() == false) goto L13;
        int r10 = 0;
    L23:
        return k1(r32, r9, r6, r10, r35, r37, 5);
    L13:
        int r12 = r3.a.b;
        if (r12 < r33) goto L16;
        r6 = r34.size() + r12;
    L17:
        int r14 = r3.a.e;
        if (r14 < r33) goto L20;
        int r1 = r34.size() + r14;
    L21:
        r10 = r1;
        goto L23
    L20:
        r1 = r14;
        goto L21
    L16:
        r6 = r12;
        goto L17
    }

    public static lk3 j1(lk3 r35, int r36, int r37, boolean r38, long r39, long r41) {
        cu4 r11 = r35.j;
        boolean r1 = r35.i;
        ArrayList r2 = new ArrayList();
        ArrayList r3 = new ArrayList();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r11.o()) goto L9;
        if (r5 < r36) goto L7;
        if (r5 >= r37) goto L7;
    L8:
        r5 = r5 + 1;
    L7:
        r2.add(r11.m(r5, new bu4(), 0));
        goto L8
    L9:
        q1(r11, r2, r3);
        au4 r6 = Z0(r2, r3);
        pi3 r7 = r35.c.a;
        int r12 = r7.b;
        int r8 = r7.e;
        bu4 r9 = new bu4();
        if (r12 < r36) goto L13;
        if (r12 >= r37) goto L13;
        boolean r10 = true;
    L15:
        if (r6.p() == false) goto L17;
        r8 = 0;
        int r13 = -1;
        int r16 = 1;
    L44:
        if (r10 == false) goto L50;
        if (r13 != (-1)) goto L47;
        lk3 r0 = l1(r35, r6, za4.k, za4.l, 4);
    L51:
        int r14 = r0.A;
        if (r14 == r16) goto L68;
        if (r14 == 4) goto L69;
        if (r36 < r37) goto L56;
        return r0;
    L56:
        if (r37 != r11.o()) goto L71;
        if (r12 >= r36) goto L59;
        return r0;
    L59:
        return r0.f(4, null);
    L71:
        return r0;
    L69:
        return r0;
    L68:
        return r0;
    L47:
        if (r38 == false) goto L49;
        r0 = k1(r35, r6, r13, r8, r39, r41, 4);
        goto L51
    L49:
        int r15 = r13;
        bu4 r17 = new bu4();
        r6.m(r15, r17, 0);
        long r24 = f35.i0(r17.k);
        long r18 = f35.i0(r17.l);
        pi3 r19 = new pi3(null, r15, r17.b, null, r8, r24, r24, -1, -1);
        r0 = l1(r35, r6, r19, new za4(r19, false, SystemClock.elapsedRealtime(), r18, r24, ju2.b(r24, r18), 0, -9223372036854775807L, r18, r24), 4);
        goto L51
    L50:
        r0 = k1(r35, r6, r13, r8, r39, r41, 4);
        goto L51
    L17:
        if (r10 == false) goto L34;
        int r20 = r35.h;
        int r110 = r11.o();
        r13 = r12;
        r16 = 1;
    L19:
        if (r4 >= r110) goto L27;
        r13 = r11.e(r13, r20, r1);
        if (r13 == (-1)) goto L27;
        if (r13 < r36) goto L28;
        if (r13 >= r37) goto L28;
        r4 = r4 + 1;
    L28:
        if (r13 != (-1)) goto L30;
        r13 = r6.a(r1);
    L32:
        r6.m(r13, r9, 0);
        int r21 = r9.m;
    L33:
        r8 = r21;
        goto L44
    L30:
        if (r13 < r37) goto L32;
        r13 = r13 - (r37 - r36);
    L27:
        r13 = -1;
        goto L28
    L34:
        r16 = 1;
        if (r12 < r37) goto L42;
        r13 = r12 - (r37 - r36);
        if (r8 != (-1)) goto L39;
    L38:
        r21 = r8;
        goto L33
    L39:
        int r22 = r36;
    L40:
        if (r22 >= r37) goto L38;
        bu4 r23 = new bu4();
        r11.n(r22, r23);
        r8 = r8 - ((r23.n - r23.m) + 1);
        r22 = r22 + 1;
        goto L40
    L42:
        r13 = r12;
    L13:
        r10 = false;
        goto L15
    }

    public static lk3 k1(lk3 r20, au4 r21, int r22, int r23, long r24, long r26, int r28) {
        bu4 r3 = new bu4();
        r21.m(r22, r3, 0);
        gn2 r5 = r3.b;
        pi3 r4 = r20.c.a;
        pi3 r2 = new pi3(null, r22, r5, null, r23, r24, r26, r4.h, r4.i);
        za4 r6 = r20.c;
        return l1(r20, r21, r2, new za4(r2, r6.b, SystemClock.elapsedRealtime(), r6.d, r6.e, r6.f, r6.g, r6.h, r6.i, r6.j), r28);
    }

    public static lk3 l1(lk3 r37, cu4 r38, pi3 r39, za4 r40, int r41) {
        PlaybackException r1 = r37.a;
        int r2 = r37.b;
        za4 r3 = r37.c;
        qh3 r7 = r37.g;
        int r8 = r37.h;
        boolean r9 = r37.i;
        int r12 = r37.k;
        s55 r10 = r37.l;
        do2 r13 = r37.m;
        float r14 = r37.n;
        float r15 = r37.o;
        int r4 = r37.p;
        il r5 = r37.q;
        jg0 r6 = r37.r;
        hp0 r11 = r37.s;
        int r16 = r37.t;
        boolean r17 = r37.u;
        boolean r18 = r37.v;
        int r19 = r37.w;
        boolean r20 = r37.x;
        boolean r21 = r37.y;
        int r22 = r37.z;
        int r23 = r37.A;
        do2 r24 = r37.B;
        long r25 = r37.C;
        long r26 = r37.D;
        long r27 = r37.E;
        jw4 r28 = r37.F;
        cw4 r0 = r37.G;
        pi3 r29 = r3.a;
        if (r38.p() == true) goto L8;
        za4 r30 = r40;
        cw4 r36 = r0;
        jw4 r35 = r28;
        if (r30.a.b < r38.o()) goto L9;
        boolean r31 = false;
    L10:
        rr2.w(r31);
        return new lk3(r1, r2, r30, r29, r39, r41, r7, r8, r9, r10, r38, r12, r13, r14, r15, r5, r4, r6, r11, r16, r17, r18, r19, r22, r23, r20, r21, r24, r25, r26, r27, r35, r36);
    L9:
        r31 = true;
        goto L10
    L8:
        r30 = r40;
        r36 = r0;
        r35 = r28;
        goto L9
    }

    public static void q1(cu4 r11, ArrayList r12, ArrayList r13) {
        int r4 = 0;
    L4:
        if (r4 >= r12.size()) goto L14;
        bu4 r1 = (bu4) r12.get(r4);
        int r2 = r1.m;
        int r3 = r1.n;
        if (r2 == (-1)) goto L12;
        if (r3 == (-1)) goto L12;
        r1.m = r13.size();
        r1.n = (r3 - r2) + r13.size();
    L10:
        if (r2 > r3) goto L13;
        zt4 r5 = new zt4();
        r11.f(r2, r5, false);
        r5.c = r4;
        r13.add(r5);
        r2 = r2 + 1;
    L13:
        r4 = r4 + 1;
    L12:
        r1.m = r13.size();
        r1.n = r13.size();
        zt4 r6 = new zt4();
        r6.i(null, null, r4, -9223372036854775807L, 0, z5.f, true);
        r13.add(r6);
        goto L13
    }

    public static gy3 t1(gy3 r2, List r3, Bundle r4, wa4 r5, mi3 r6) {
        if (r3.isEmpty() == false) goto L5;
        boolean r7 = false;
        if (r4.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") == false) goto L9;
    L11:
        boolean r8 = false;
    L13:
        if (r4.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT") == true) goto L18;
        if (r6.a.a(new int[]{8, 9}) == true) goto L18;
        r7 = true;
    L18:
        return j60.j(r2, r8, r7);
    L9:
        if (r6.a.a(new int[]{6, 7}) == true) goto L11;
        r8 = true;
        goto L13
    L5:
        return j60.g(r3, r5, r6);
    }

    public static gy3 u1(List r1, List r2, wa4 r3, mi3 r4, Bundle r5) {
        if (r1.isEmpty() == false) goto L6;
        r1 = j60.k(r2, r4, r5);
    L6:
        return j60.g(r1, r3, r4);
    }

    @Override // defpackage.rk2
    public final void A() {
        if (h1(6) == false) goto L10;
        b1(new cl2(this, 7));
        if (w() == (-1)) goto L9;
        v1(w(), -9223372036854775807L);
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void A0() {
        if (h1(24) == false) goto L10;
        b1(new cl2(this, 13));
        lk3 r0 = this.q;
        if (r0.n == 0.0f) goto L9;
        this.q = r0.p(0.0f);
        er1 r1 = new er1(20);
        tc2 r3 = this.i;
        r3.c(22, r1);
        r3.b();
        return;
    L9:
        return;
    }

    public final void A1(lk3 r8, Integer r9, Integer r10, Integer r11, Integer r12) {
        lk3 r1 = this.q;
        this.q = r8;
        n1(r1, r8, r9, r10, r11, r12);
    }

    @Override // defpackage.rk2
    public final float B() {
        return this.q.n;
    }

    @Override // defpackage.rk2
    public final void B0(gn2 r9) {
        if (h1(31) == true) goto L5;
        return;
    L5:
        b1(new gl2(this, r9, 0));
        x1(Collections.singletonList(r9), -1, -9223372036854775807L, true);
    }

    @Override // defpackage.rk2
    public final void C() {
        if (h1(4) == true) goto L5;
        return;
    L5:
        b1(new cl2(this, 9));
        v1(e1(this.q), -9223372036854775807L);
    }

    @Override // defpackage.rk2
    public final void C0() {
        if (h1(26) == false) goto L12;
        b1(new cl2(this, 12));
        lk3 r0 = this.q;
        int r1 = r0.t + 1;
        int r2 = r0.s.c;
        if (r2 == 0) goto L10;
        if (r1 <= r2) goto L10;
        return;
    L10:
        this.q = r0.c(r1, r0.u);
        kl2 r3 = new kl2(this, r1, 4);
        tc2 r4 = this.i;
        r4.c(30, r3);
        r4.b();
        return;
    }

    @Override // defpackage.rk2
    public final il D() {
        return this.q.q;
    }

    @Override // defpackage.rk2
    public final boolean D0() {
        return this.q.i;
    }

    @Override // defpackage.rk2
    public final void E(final int r2, final boolean r3) {
        if (h1(34) == false) goto L10;
        b1(new tl2(this, r3, r2));
        lk3 r4 = this.q;
        if (r4.u == r3) goto L9;
        this.q = r4.c(r4.t, r3);
        jl2 r5 = new jl2(this, r3, 1);
        tc2 r1 = this.i;
        r1.c(30, r5);
        r1.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final cw4 E0() {
        return this.q.G;
    }

    @Override // defpackage.rk2
    public final hp0 F() {
        return this.q.s;
    }

    @Override // defpackage.rk2
    public final long F0() {
        return this.q.c.j;
    }

    @Override // defpackage.rk2
    public final void G() {
        if (h1(26) == false) goto L10;
        b1(new cl2(this, 15));
        lk3 r0 = this.q;
        int r1 = r0.t - 1;
        if (r1 < r0.s.b) goto L9;
        this.q = r0.c(r1, r0.u);
        kl2 r2 = new kl2(this, r1, 9);
        tc2 r3 = this.i;
        r3.c(30, r2);
        r3.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void G0(int r4) {
        if (h1(25) == false) goto L17;
        b1(new kl2(this, r4, 7));
        lk3 r0 = this.q;
        hp0 r1 = r0.s;
        if (r0.t != r4) goto L8;
        return;
    L8:
        if (r1.b > r4) goto L15;
        int r2 = r1.c;
        if (r2 == 0) goto L12;
        if (r4 <= r2) goto L12;
        return;
    L12:
        this.q = r0.c(r4, r0.u);
        kl2 r3 = new kl2(this, r4, 8);
        tc2 r5 = this.i;
        r5.c(30, r3);
        r5.b();
        return;
    L15:
        return;
    }

    @Override // defpackage.rk2
    public final void H(int r3, int r4) {
        if (h1(33) == false) goto L17;
        b1(new nl2(this, r3, r4, 1));
        lk3 r5 = this.q;
        hp0 r0 = r5.s;
        if (r5.t != r3) goto L8;
        return;
    L8:
        if (r0.b > r3) goto L15;
        int r1 = r0.c;
        if (r1 == 0) goto L12;
        if (r3 <= r1) goto L12;
        return;
    L12:
        this.q = r5.c(r3, r5.u);
        kl2 r6 = new kl2(this, r3, 3);
        tc2 r2 = this.i;
        r2.c(30, r6);
        r2.b();
        return;
    L15:
        return;
    }

    @Override // defpackage.rk2
    public final void H0() {
        if (h1(9) == false) goto L23;
        b1(new cl2(this, 0));
        cu4 r0 = this.q.j;
        if (r0.p() == false) goto L8;
        return;
    L8:
        if (k() == false) goto L11;
        return;
    L11:
        if (f0() == false) goto L14;
        v1(j0(), -9223372036854775807L);
        return;
    L14:
        bu4 r1 = r0.m(e1(this.q), new bu4(), 0);
        if (r1.h == true) goto L17;
        return;
    L17:
        if (r1.a() == false) goto L22;
        v1(e1(this.q), -9223372036854775807L);
        return;
    L22:
        return;
    }

    @Override // defpackage.rk2
    public final boolean I() {
        if (w() == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.rk2
    public final void I0() {
        if (h1(12) == true) goto L5;
        return;
    L5:
        b1(new cl2(this, 8));
        w1(this.q.D);
    }

    @Override // defpackage.rk2
    public final void J(int r3) {
        if (h1(34) == false) goto L12;
        b1(new kl2(this, r3, 5));
        lk3 r4 = this.q;
        int r0 = r4.t + 1;
        int r1 = r4.s.c;
        if (r1 == 0) goto L10;
        if (r0 <= r1) goto L10;
        return;
    L10:
        this.q = r4.c(r0, r4.u);
        kl2 r5 = new kl2(this, r0, 6);
        tc2 r2 = this.i;
        r2.c(30, r5);
        r2.b();
        return;
    }

    @Override // defpackage.rk2
    public final void J0() {
        if (h1(11) == true) goto L5;
        return;
    L5:
        b1(new cl2(this, 11));
        w1(-this.q.C);
    }

    @Override // defpackage.rk2
    public final int K() {
        return this.q.c.a.i;
    }

    @Override // defpackage.rk2
    public final do2 K0() {
        return this.q.B;
    }

    @Override // defpackage.rk2
    public final void L(int r8, int r9, List r10) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r8 < 0) goto L8;
        if (r8 > r9) goto L8;
        boolean r0 = true;
    L9:
        rr2.l(r0);
        b1(new hl2(this, r10, r8, r9, 0));
        s1(r8, r9, r10);
        return;
    L8:
        r0 = false;
        goto L9
    }

    @Override // defpackage.rk2
    public final void L0(List r10) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        int r2 = 11;
        b1(new ef0(r2, this, (ArrayList) r10));
        x1(r10, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.rk2
    public final void M(cw4 r3) {
        if (h1(29) == false) goto L10;
        b1(new ef0(16, this, r3));
        lk3 r0 = this.q;
        if (r3 == r0.G) goto L9;
        this.q = r0.o(r3);
        y31 r1 = new y31(r3, 1);
        tc2 r2 = this.i;
        r2.c(19, r1);
        r2.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final long M0() {
        long r0 = ju2.c(this.q, this.F, this.G, f1().g);
        this.F = r0;
        return r0;
    }

    @Override // defpackage.rk2
    public final void N(int r3) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r3 < 0) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        b1(new kl2(this, r3, 11));
        r1(r3, r3 + 1);
        return;
    L7:
        r0 = false;
        goto L8
    }

    @Override // defpackage.rk2
    public final void N0(List r3, int r4) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r4 < 0) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        b1(new vl2(this, r4, r3, 0));
        W0(r3, r4);
        return;
    L7:
        r0 = false;
        goto L8
    }

    @Override // defpackage.rk2
    public final void O(long r2) {
        if (h1(5) == true) goto L5;
        return;
    L5:
        b1(new ll2(r2, this));
        v1(e1(this.q), r2);
    }

    @Override // defpackage.rk2
    public final long O0() {
        return this.q.C;
    }

    @Override // defpackage.rk2
    public final void P(int r3, int r4) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r3 < 0) goto L8;
        if (r4 < r3) goto L8;
        boolean r0 = true;
    L9:
        rr2.l(r0);
        b1(new nl2(this, r3, r4, 0));
        r1(r3, r4);
        return;
    L8:
        r0 = false;
        goto L9
    }

    @Override // defpackage.rk2
    public final wa4 P0() {
        return this.w;
    }

    @Override // defpackage.rk2
    public final void Q(SurfaceHolder r5) {
        if (h1(27) == true) goto L6;
        return;
    L6:
        if (r5 != null) goto L13;
        if (h1(27) == false) goto L24;
        X0();
        z1(null, 0, 0);
        p1(0, 0);
        return;
    L24:
        return;
    L13:
        if (this.B != r5) goto L15;
        return;
    L15:
        X0();
        this.B = r5;
        r5.addCallback(this.h);
        Surface r0 = r5.getSurface();
        if (r0 != null) goto L18;
    L21:
        this.A = null;
        z1(null, 0, 0);
        p1(0, 0);
        return;
    L18:
        if (r0.isValid() == false) goto L21;
        this.A = r0;
        Rect r6 = r5.getSurfaceFrame();
        z1(r0, r6.width(), r6.height());
        p1(r6.width(), r6.height());
    }

    @Override // defpackage.rk2
    public final yw1 Q0() {
        return this.u;
    }

    @Override // defpackage.rk2
    public final void R(float r4) {
        if (h1(24) == false) goto L10;
        b1(new rl2(this, r4, 1));
        lk3 r0 = this.q;
        if (r0.n == r4) goto L9;
        this.q = r0.p(r4);
        w31 r1 = new w31(1, r4);
        tc2 r3 = this.i;
        r3.c(22, r1);
        r3.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void R0() {
        cb4 r0 = this.e;
        bb4 r1 = r0.a;
        bb4 r2 = r0.a;
        int r3 = r1.getType();
        Context r4 = this.d;
        Bundle r5 = this.f;
        if (r3 != 0) goto L15;
        this.o = null;
        Object r6 = r2.c();
        r6.getClass();
        IBinder r7 = (IBinder) r6;
        int r8 = kt2.k;
        IInterface r9 = r7.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (r9 != null) goto L7;
    L9:
        nu1 r10 = new nu1();
        r10.e = r7;
        pu1 r11 = r10;
    L10:
        int r12 = this.b.s();
        String r13 = r4.getPackageName();
        int r14 = Process.myPid();
        this.a.getClass();
        r11.n0(this.c, r12, new ja0(r13, r14, r5).b());     // Catch: RemoteException -> L13
        return;
    L13:
        e = move-exception;
        l93.r0("MCImplBase", "Failed to call connection request.", e);
    L27:
        sk2 r15 = f1();
        sk2 r16 = f1();
        Objects.requireNonNull(r16);
        r15.a1(new qa1(18, r16));
        return;
    L7:
        if ((r9 instanceof pu1) == false) goto L9;
        r11 = (pu1) r9;
        goto L10
    L15:
        this.o = new yl2(this, r5);
        if (Build.VERSION.SDK_INT < 29) goto L18;
        int r17 = 4097;
    L19:
        Intent r18 = new Intent("androidx.media3.session.MediaSessionService");
        r18.setClassName(r2.g(), r2.d());
    L25:
        e = move-exception;
        l93.r0("MCImplBase", "bind to " + r0 + " not allowed", e);
        goto L27
    L21:
        if (r4.bindService(r18, this.o, r17) == false) goto L23;
        return;
    L23:
        l93.q0("MCImplBase", "bind to " + r0 + " failed");     // Catch: SecurityException -> L25
        goto L27
    L18:
        r17 = 1;
        goto L19
    }

    @Override // defpackage.rk2
    public final void S() {
        if (h1(7) == false) goto L26;
        b1(new cl2(this, 16));
        cu4 r0 = this.q.j;
        if (r0.p() == false) goto L8;
        return;
    L8:
        if (k() == true) goto L27;
        boolean r1 = I();
        bu4 r2 = r0.m(e1(this.q), new bu4(), 0);
        if (r2.h == true) goto L13;
    L17:
        if (r1 == true) goto L19;
    L22:
        v1(e1(this.q), 0);
        return;
    L19:
        if (M0() > this.q.E) goto L22;
        v1(w(), -9223372036854775807L);
        return;
    L13:
        if (r2.a() == false) goto L17;
        if (r1 == false) goto L25;
        v1(w(), -9223372036854775807L);
        return;
    L25:
        return;
    L27:
        return;
    }

    @Override // defpackage.rk2
    public final Bundle S0() {
        return this.f;
    }

    @Override // defpackage.rk2
    public final void T(final List r9, final int r10, final long r11) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        b1(new ml2(this, r9, r10, r11));
        x1(r9, r10, r11, false);
    }

    @Override // defpackage.rk2
    public final ic2 T0(final va4 r3, final Bundle r4) {
        cb4 r0 = this.n;
        r0.getClass();
        if (r0.a.f() < 7) goto L10;
        cb4 r1 = this.n;
        r1.getClass();
        if (r1.a.f() < 7) goto L7;
        final int r2 = 0;
        return d1(r3, new dl2(this, r3, r4, r2));
    L7:
        return T0(r3, r4);
    L10:
        final int r5 = 1;
        return d1(r3, new dl2(this, r3, r4, r5));
    }

    @Override // defpackage.rk2
    public final PlaybackException U() {
        return this.q.a;
    }

    @Override // defpackage.rk2
    public final void U0(gn2 r3) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        b1(new gl2(this, r3, 2));
        int r0 = this.q.j.o();
        W0(Collections.singletonList(r3), r0);
    }

    @Override // defpackage.rk2
    public final void V(boolean r3) {
        if (h1(1) == true) goto L7;
        if (r3 == false) goto L9;
        l93.q0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        return;
    L9:
        return;
    L7:
        b1(new jl2(this, r3, 0));
        y1(r3);
    }

    @Override // defpackage.rk2
    public final void V0(List r9) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        b1(new fl2(this, r9, 0));
        x1(r9, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.rk2
    public final void W(int r3) {
        if (h1(10) == true) goto L5;
        return;
    L5:
        if (r3 < 0) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        b1(new kl2(this, r3, 10));
        v1(r3, -9223372036854775807L);
        return;
    L7:
        r0 = false;
        goto L8
    }

    public final void W0(List r14, int r15) {
        if (r14.isEmpty() == false) goto L6;
        return;
    L6:
        if (this.q.j.p() == false) goto L9;
        x1(r14, -1, -9223372036854775807L, false);
        return;
    L9:
        int r3 = Math.min(r15, this.q.j.o());
        lk3 r8 = i1(this.q, r3, r14, M0(), Z());
        if (this.q.j.p() == false) goto L13;
        Integer r13 = 3;
    L14:
        A1(r8, 0, null, null, r13);
        return;
    L13:
        r13 = null;
        goto L14
    }

    @Override // defpackage.rk2
    public final long X() {
        return this.q.D;
    }

    public final void X0() {
        SurfaceHolder r0 = this.B;
        if (r0 == null) goto L6;
        r0.removeCallback(this.h);
        this.B = null;
    L6:
        if (this.A == null) goto L9;
        this.A = null;
        return;
    }

    @Override // defpackage.rk2
    public final boolean Y() {
        if (this.D == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.rk2
    public final long Z() {
        za4 r0 = this.q.c;
        if (r0.b == true) goto L7;
        return M0();
    L7:
        return r0.a.g;
    }

    @Override // defpackage.rk2
    public final void a() {
        pu1 r0 = this.D;
        if (this.p == true) goto L33;
        this.p = true;
        this.n = null;
        this.m.removeCallbacksAndMessages(null);
        X0();
        rf2 r3 = this.j;
        Handler r4 = (Handler) r3.n;
        if (r4.hasMessages(1) == true) goto L31;
    L10:
        r4.removeCallbacksAndMessages(null);
        this.D = null;
        int r1 = 0;
        if (r0 == null) goto L14;
        int r5 = this.b.s();
        r0.asBinder().unlinkToDeath(this.g, 0);     // Catch: RemoteException -> L26
        r0.j0(this.c, r5);     // Catch: RemoteException -> L26
    L14:
        this.i.d();
        yk r2 = this.b;
        sl2 r6 = new sl2(this, r1);
        Object r7 = r2.q;
        monitor-enter(r7);
        Handler r8 = f35.p(null);     // Catch: Throwable -> L19
        r2.t = r8;     // Catch: Throwable -> L19
        r2.s = r6;     // Catch: Throwable -> L19
        if (((oi) r2.r).isEmpty() == false) goto L21;
        r2.a();     // Catch: Throwable -> L19
    L22:
        monitor-exit(r7);     // Catch: Throwable -> L19
        return;
    L21:
        r8.postDelayed(new jq3(6, r2), 30000);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    L31:
        bm2 r9 = (bm2) r3.o;     // Catch: RemoteException -> L9
        r9.D.p0(r9.c);     // Catch: RemoteException -> L9
    L9:
        l93.q0("MCImplBase", "Error in sending flushCommandQueue");
        goto L10
    }

    @Override // defpackage.rk2
    public final void a0() {
        if (h1(24) == false) goto L13;
        float r0 = this.q.o;
        b1(new rl2(this, r0, 2));
        lk3 r1 = this.q;
        float r3 = r1.n;
        if (r3 != r1.o) goto L8;
        return;
    L8:
        if (r3 != 0.0f) goto L12;
        this.q = r1.p(r0);
        w31 r2 = new w31(2, r0);
        tc2 r5 = this.i;
        r5.c(22, r2);
        r5.b();
        return;
    L12:
        return;
    }

    public final ic2 a1(pu1 r5, xl2 r6, boolean r7) {
        if (r5 == null) goto L20;
        if (Build.VERSION.SDK_INT < 31) goto L8;
        MediaController r0 = this.E;
        if (r0 == null) goto L8;
        r0.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", null);
    L8:
        ab4 r1 = new ab4(1);
        yk r2 = this.b;
        ea4 r3 = r2.j(r1);
        int r4 = r3.u;
        qi r8 = this.k;
        if (r7 == true) goto L11;
    L21:
        r6.d(r5, r4);     // Catch: RemoteException -> L16
        return r3;
    L16:
        e = move-exception;
        l93.r0("MCImplBase", "Cannot connect to the service or the session is gone", e);
        r8.remove(Integer.valueOf(r4));
        r2.y(r4, new ab4(-100));
        return r3;
    L11:
        if (r8.isEmpty() == false) goto L13;
        this.H = this.q;
    L13:
        r8.add(Integer.valueOf(r4));
        goto L21
    L20:
        return new mw1(new ab4(-4));
    }

    @Override // defpackage.rk2
    public final void b() {
        int r0 = 2;
        if (h1(2) == false) goto L13;
        b1(new cl2(this, 6));
        lk3 r1 = this.q;
        if (r1.A == 1) goto L8;
        return;
    L8:
        if (r1.j.p() == false) goto L10;
        r0 = 4;
    L10:
        A1(r1.f(r0, null), null, null, null, null);
        return;
    }

    @Override // defpackage.rk2
    public final long b0() {
        return this.q.c.e;
    }

    public final void b1(xl2 r4) {
        rf2 r0 = this.j;
        Handler r1 = (Handler) r0.n;
        if (((bm2) r0.o).D != null) goto L5;
    L7:
        a1(this.D, r4, true);
        return;
    L5:
        if (r1.hasMessages(1) == true) goto L7;
        r1.sendEmptyMessage(1);
        goto L7
    }

    @Override // defpackage.rk2
    public final void c() {
        if (h1(1) == true) goto L5;
        return;
    L5:
        b1(new cl2(this, 3));
        y1(false);
    }

    @Override // defpackage.rk2
    public final void c0() {
        if (h1(8) == false) goto L10;
        b1(new cl2(this, 14));
        if (j0() == (-1)) goto L9;
        v1(j0(), -9223372036854775807L);
        return;
    L9:
        return;
    }

    public final void c1(xl2 r4) {
        rf2 r0 = this.j;
        Handler r1 = (Handler) r0.n;
        if (((bm2) r0.o).D != null) goto L5;
    L7:
        ic2 r5 = a1(this.D, r4, true);
        f92.v(r5);     // Catch: TimeoutException -> L10 ExecutionException -> L16
        return;
    L16:
        e = move-exception;
        throw new IllegalStateException(e);
    L10:
        e = move-exception;
        if ((r5 instanceof ea4) == false) goto L14;
        int r6 = ((ea4) r5).u;
        this.k.remove(Integer.valueOf(r6));
        ab4 r2 = new ab4(-1);
        this.b.y(r6, r2);
    L14:
        l93.r0("MCImplBase", "Synchronous command takes too long on the session side.", e);
        return;
    L5:
        if (r1.hasMessages(1) == true) goto L7;
        r1.sendEmptyMessage(1);
        goto L7
    }

    @Override // defpackage.rk2
    public final void d(qh3 r3) {
        if (h1(13) == false) goto L10;
        b1(new ef0(14, this, r3));
        if (this.q.g.equals(r3) == true) goto L9;
        this.q = this.q.e(r3);
        ql2 r0 = new ql2(r3, 0);
        tc2 r2 = this.i;
        r2.c(12, r0);
        r2.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void d0(int r3) {
        if (h1(34) == false) goto L10;
        b1(new kl2(this, r3, 1));
        lk3 r4 = this.q;
        int r0 = r4.t - 1;
        if (r0 < r4.s.b) goto L9;
        this.q = r4.c(r0, r4.u);
        kl2 r5 = new kl2(this, r0, 2);
        tc2 r2 = this.i;
        r2.c(30, r5);
        r2.b();
        return;
    L9:
        return;
    }

    public final ic2 d1(va4 r4, xl2 r5) {
        int r0 = r4.a;
        String r1 = r4.b;
        if (r0 != 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (this.w.a.contains(r4) == false) goto L9;
    L11:
        pu1 r6 = this.D;
    L13:
        return a1(r6, r5, false);
    L9:
        if (j60.n(r1) == true) goto L11;
        l93.q0("MCImplBase", "Controller isn't allowed to call custom session command:".concat(r1));
        r6 = null;
        goto L13
    L5:
        r2 = false;
        goto L6
    }

    @Override // defpackage.rk2
    public final void e(float r3) {
        if (h1(13) == false) goto L10;
        b1(new rl2(this, r3, 0));
        qh3 r0 = this.q.g;
        if (r0.a == r3) goto L9;
        qh3 r1 = new qh3(r3, r0.b);
        this.q = this.q.e(r1);
        ql2 r4 = new ql2(r1, 1);
        tc2 r2 = this.i;
        r2.c(12, r4);
        r2.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final jw4 e0() {
        return this.q.F;
    }

    @Override // defpackage.rk2
    public final boolean f() {
        return this.q.y;
    }

    @Override // defpackage.rk2
    public final boolean f0() {
        if (j0() == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public sk2 f1() {
        return this.a;
    }

    @Override // defpackage.rk2
    public final int g() {
        return this.q.A;
    }

    @Override // defpackage.rk2
    public final do2 g0() {
        return this.q.m;
    }

    public final dd2 g1(int r6, long r7, cu4 r9) {
        if (r9.p() == true) goto L29;
        bu4 r0 = new bu4();
        zt4 r1 = new zt4();
        if (r6 != (-1)) goto L8;
    L9:
        r6 = r9.a(this.q.i);
        r7 = f35.i0(r9.m(r6, r0, 0).k);
    L10:
        long r8 = f35.Q(r7);
        rr2.q(r6, r9.o());
        r9.n(r6, r0);
        if (r8 != (-9223372036854775807L)) goto L16;
        r8 = r0.k;
        if (r8 != (-9223372036854775807L)) goto L16;
        return null;
    L16:
        int r5 = r0.m;
        r9.f(r5, r1, false);
    L18:
        if (r5 >= r0.n) goto L24;
        if (r1.e == r8) goto L24;
        int r2 = r5 + 1;
        if (r9.f(r2, r1, false).e > r8) goto L24;
        r5 = r2;
    L24:
        r9.f(r5, r1, false);
        return new dd2(r5, r8 - r1.e, false);
    L8:
        if (r6 < r9.o()) goto L10;
    L29:
        return null;
    }

    @Override // defpackage.rk2
    public final long getDuration() {
        return this.q.c.d;
    }

    @Override // defpackage.rk2
    public final int h() {
        return this.q.h;
    }

    @Override // defpackage.rk2
    public final boolean h0() {
        return this.q.x;
    }

    public final boolean h1(int r2) {
        if (this.z.a(r2) == true) goto L6;
        xa3.m(r2, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    L6:
        return true;
    }

    @Override // defpackage.rk2
    public final qh3 i() {
        return this.q.g;
    }

    @Override // defpackage.rk2
    public final jg0 i0() {
        return this.q.r;
    }

    @Override // defpackage.rk2
    public final int j() {
        return this.q.t;
    }

    @Override // defpackage.rk2
    public final int j0() {
        if (this.q.j.p() == false) goto L6;
        return -1;
    L6:
        lk3 r0 = this.q;
        cu4 r1 = r0.j;
        int r2 = e1(r0);
        lk3 r4 = this.q;
        int r3 = r4.h;
        if (r3 != 1) goto L10;
        r3 = 0;
    L10:
        return r1.e(r2, r3, r4.i);
    }

    @Override // defpackage.rk2
    public final boolean k() {
        return this.q.c.b;
    }

    @Override // defpackage.rk2
    public final void k0(final il r2, final boolean r3) {
        if (h1(35) == false) goto L10;
        b1(new wl2(this, r2, r3));
        if (this.q.q.equals(r2) == true) goto L9;
        this.q = this.q.a(r2);
        x31 r4 = new x31(r2, 1);
        tc2 r1 = this.i;
        r1.c(20, r4);
        r1.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final long l() {
        return this.q.c.h;
    }

    @Override // defpackage.rk2
    public final void l0(do2 r3) {
        if (h1(19) == false) goto L10;
        b1(new ef0(13, this, r3));
        if (this.q.m.equals(r3) == true) goto L9;
        this.q = this.q.g(r3);
        r31 r0 = new r31(r3, 1);
        tc2 r2 = this.i;
        r2.c(15, r0);
        r2.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final long m() {
        return this.q.c.g;
    }

    @Override // defpackage.rk2
    public final void m0() {
        if (h1(1) == true) goto L6;
        l93.q0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        return;
    L6:
        b1(new cl2(this, 4));
        y1(true);
    }

    public final void m1(int r21, int r22, int r23) {
        cu4 r2 = this.q.j;
        int r3 = r2.o();
        int r4 = Math.min(r22, r3);
        int r5 = r4 - r21;
        int r6 = Math.min(r23, r3 - r5);
        if (r21 >= r3) goto L28;
        if (r21 == r4) goto L29;
        if (r21 == r6) goto L31;
        ArrayList r7 = new ArrayList();
        ArrayList r8 = new ArrayList();
        int r10 = 0;
    L9:
        if (r10 >= r3) goto L11;
        r7.add(r2.m(r10, new bu4(), 0));
        r10 = r10 + 1;
        goto L9
    L11:
        f35.P(r7, r21, r4, r6);
        q1(r2, r7, r8);
        au4 r9 = Z0(r7, r8);
        if (r9.p() == true) goto L30;
        int r11 = e1(this.q);
        if (r11 < r21) goto L18;
        if (r11 >= r4) goto L18;
        int r1 = (r11 - r21) + r6;
    L17:
        int r13 = r1;
    L25:
        bu4 r12 = new bu4();
        int r14 = this.q.c.a.e - r2.m(r11, r12, 0).m;
        r9.m(r13, r12, 0);
        A1(k1(this.q, r9, r13, r12.m + r14, M0(), Z(), 5), 0, null, null, null);
        return;
    L18:
        if (r4 > r11) goto L21;
        if (r6 <= r11) goto L21;
        r1 = r11 - r5;
    L21:
        if (r4 <= r11) goto L24;
        if (r6 > r11) goto L24;
        r1 = r11 + r5;
    L24:
        r13 = r11;
        goto L25
    L30:
        return;
    L31:
        return;
    L29:
        return;
    }

    @Override // defpackage.rk2
    public final void n(int r2, long r3) {
        if (h1(10) == true) goto L5;
        return;
    L5:
        if (r2 < 0) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        b1(new lj0(r3, this, r2));
        v1(r2, r3);
        return;
    L7:
        r0 = false;
        goto L8
    }

    @Override // defpackage.rk2
    public final int n0() {
        return this.q.c.a.h;
    }

    public final void n1(lk3 r17, final lk3 r18, final Integer r19, final Integer r20, final Integer r21, Integer r22) {
        final int r6 = 0;
        tc2 r7 = this.i;
        if (r19 == null) goto L5;
        r7.c(0, new ol2(r18, r19, r6));
    L5:
        final int r8 = 1;
        if (r21 == null) goto L8;
        r7.c(11, new ol2(r18, r21, r8));
    L8:
        gn2 r4 = r18.s();
        final int r9 = 15;
        if (r22 == null) goto L11;
        r7.c(1, new ef0(r9, r4, r22));
    L11:
        PlaybackException r5 = r17.a;
        PlaybackException r10 = r18.a;
        final int r11 = 2;
        final int r12 = 10;
        if (r5 == r10) goto L20;
        if (r5 != null) goto L15;
    L17:
        r7.c(10, new hj0(1, r10));
        if (r10 == null) goto L20;
        r7.c(10, new hj0(2, r10));
        goto L20
    L15:
        if (r5.a(r10) == false) goto L17;
    L20:
        final int r13 = 18;
        if (r17.F.equals(r18.F) == true) goto L23;
        r7.c(2, new pl2(r18, r13));
    L23:
        final int r14 = 19;
        if (r17.B.equals(r18.B) == true) goto L26;
        r7.c(14, new pl2(r18, r14));
    L26:
        final int r15 = 20;
        final int r16 = 3;
        if (r17.y == r18.y) goto L29;
        r7.c(3, new pl2(r18, r15));
    L29:
        final int r23 = 21;
        final int r110 = 4;
        if (r17.A == r18.A) goto L32;
        r7.c(4, new pl2(r18, r23));
    L32:
        final int r24 = 5;
        if (r20 == null) goto L35;
        r7.c(5, new ol2(r18, r20, r11));
    L35:
        final int r2 = 6;
        if (r17.z == r18.z) goto L38;
        r7.c(6, new pl2(r18, r6));
    L38:
        final int r111 = 7;
        if (r17.x == r18.x) goto L41;
        r7.c(7, new pl2(r18, r8));
    L41:
        final int r25 = 12;
        if (r17.g.equals(r18.g) == true) goto L44;
        r7.c(12, new pl2(r18, r11));
    L44:
        final int r112 = 8;
        if (r17.h == r18.h) goto L47;
        r7.c(8, new pl2(r18, r16));
    L47:
        final int r113 = 9;
        if (r17.i == r18.i) goto L51;
        r7.c(9, new pl2(r18, r110));
    L51:
        if (r17.m.equals(r18.m) == true) goto L54;
        r7.c(15, new pl2(r18, r24));
    L54:
        if (r17.n == r18.n) goto L57;
        r7.c(22, new pl2(r18, r2));
    L57:
        if (r17.q.equals(r18.q) == true) goto L60;
        r7.c(20, new pl2(r18, r111));
    L60:
        if (r17.p == r18.p) goto L63;
        r7.c(21, new pl2(r18, r112));
    L63:
        if (r17.r.a.equals(r18.r.a) == true) goto L66;
        r7.c(27, new pl2(r18, r113));
        r7.c(27, new pl2(r18, r12));
    L66:
        if (r17.s.equals(r18.s) == true) goto L69;
        final int r3 = 11;
        r7.c(29, new pl2(r18, r3));
    L69:
        if (r17.t == r18.t) goto L71;
    L72:
        r7.c(30, new pl2(r18, r25));
    L74:
        if (r17.l.equals(r18.l) == true) goto L76;
        final int r26 = 13;
        r7.c(25, new pl2(r18, r26));
    L76:
        final int r27 = 16;
        if (r17.C == r18.C) goto L79;
        final int r28 = 14;
        r7.c(16, new pl2(r18, r28));
    L79:
        final int r29 = 17;
        if (r17.D == r18.D) goto L83;
        r7.c(17, new pl2(r18, r9));
    L83:
        if (r17.E == r18.E) goto L86;
        r7.c(18, new pl2(r18, r27));
    L86:
        if (r17.G.equals(r18.G) == true) goto L88;
        r7.c(19, new pl2(r18, r29));
    L88:
        r7.b();
        return;
    L71:
        if (r17.u == r18.u) goto L74;
        goto L72
    }

    @Override // defpackage.rk2
    public final mi3 o() {
        return this.z;
    }

    @Override // defpackage.rk2
    public final int o0() {
        return e1(this.q);
    }

    public final void o1(lk3 r14, jk3 r15) {
        if (Y() == false) goto L41;
        cb4 r0 = this.n;
        r0.getClass();
        if (r0.a.f() >= 6) goto L9;
        boolean r1 = true;
    L8:
        boolean r5 = r1;
        lk3 r2 = this.H;
        Integer r3 = null;
        if (r2 == null) goto L15;
        mi3 r4 = this.z;
        cb4 r6 = this.n;
        r6.getClass();
        this.H = ju2.e(r2, r14, r15, r4, r5, r6);
        if (this.k.isEmpty() == false) goto L16;
        r14 = this.H;
        r15 = jk3.c;
        this.H = null;
        goto L15
    L16:
        return;
    L15:
        lk3 r7 = r14;
        jk3 r8 = r15;
        lk3 r9 = this.q;
        mi3 r10 = this.z;
        cb4 r11 = this.n;
        r11.getClass();
        lk3 r12 = ju2.e(r9, r7, r8, r10, r5, r11);
        this.q = r12;
        if (r9.d.equals(r7.d) == true) goto L20;
    L23:
        Integer r13 = Integer.valueOf(r12.f);
    L25:
        if (Objects.equals(r9.s(), r12.s()) == true) goto L27;
        Integer r16 = Integer.valueOf(r12.b);
    L29:
        if (r9.j.equals(r12.j) == true) goto L31;
        Integer r17 = Integer.valueOf(r12.k);
    L32:
        int r18 = r9.w;
        int r19 = r12.w;
        if (r18 == r19) goto L35;
    L38:
        r3 = Integer.valueOf(r19);
    L39:
        n1(r9, r12, r17, r3, r13, r16);
        return;
    L35:
        if (r9.v == r12.v) goto L39;
    L31:
        r17 = null;
        goto L32
    L27:
        r16 = null;
        goto L29
    L20:
        if (r9.e.equals(r7.e) == false) goto L23;
        r13 = null;
        goto L25
    L9:
        r1 = false;
        goto L8
    }

    @Override // defpackage.rk2
    public final void p(final gn2 r8, final long r9) {
        if (h1(31) == true) goto L5;
        return;
    L5:
        b1(new el2(this, r8, r9));
        x1(Collections.singletonList(r8), -1, r9, false);
    }

    @Override // defpackage.rk2
    public final void p0(int r3) {
        if (h1(15) == false) goto L10;
        b1(new kl2(this, r3, 0));
        lk3 r0 = this.q;
        if (r0.h == r3) goto L9;
        this.q = r0.i(r3);
        ij0 r1 = new ij0(r3, 4);
        tc2 r2 = this.i;
        r2.c(8, r1);
        r2.b();
        return;
    L9:
        return;
    }

    public final void p1(int r3, int r4) {
        pf4 r0 = this.C;
        if (r0.a == r3) goto L5;
    L8:
        this.C = new pf4(r3, r4);
        v31 r1 = new v31(r3, r4, 1);
        this.i.f(24, r1);
        return;
    L5:
        if (r0.b != r4) goto L8;
    }

    @Override // defpackage.rk2
    public final boolean q() {
        return this.q.v;
    }

    @Override // defpackage.rk2
    public final void q0(boolean r3) {
        if (h1(26) == false) goto L10;
        b1(new jl2(this, r3, 3));
        lk3 r0 = this.q;
        if (r0.u == r3) goto L9;
        this.q = r0.c(r0.t, r3);
        jl2 r1 = new jl2(this, r3, 4);
        tc2 r2 = this.i;
        r2.c(30, r1);
        r2.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void r() {
        if (h1(20) == true) goto L5;
        return;
    L5:
        b1(new cl2(this, 10));
        r1(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final void r0(oi3 r1) {
        this.i.e(r1);
    }

    public final void r1(int r13, int r14) {
        int r1 = this.q.j.o();
        int r3 = Math.min(r14, r1);
        if (r13 >= r1) goto L26;
        if (r13 == r3) goto L27;
        if (r1 == 0) goto L28;
        boolean r9 = true;
        if (e1(this.q) >= r13) goto L10;
    L12:
        boolean r11 = false;
    L13:
        lk3 r2 = j1(this.q, r13, r3, false, M0(), Z());
        int r4 = this.q.c.a.b;
        if (r4 < r13) goto L17;
        if (r4 >= r3) goto L17;
    L18:
        Integer r5 = null;
        if (r11 == false) goto L21;
        Integer r6 = 4;
    L22:
        if (r9 == false) goto L24;
        r5 = 3;
    L24:
        A1(r2, 0, null, r6, r5);
        return;
    L21:
        r6 = null;
    L17:
        r9 = false;
        goto L18
    L10:
        if (e1(this.q) >= r3) goto L12;
        r11 = true;
        goto L13
    L28:
        return;
    L27:
        return;
    }

    @Override // defpackage.rk2
    public final void s(boolean r4) {
        if (h1(14) == false) goto L10;
        b1(new jl2(this, r4, 2));
        lk3 r0 = this.q;
        if (r0.i == r4) goto L9;
        this.q = r0.k(r4);
        t31 r1 = new t31(2, r4);
        tc2 r3 = this.i;
        r3.c(9, r1);
        r3.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final void s0(gn2 r9) {
        if (h1(31) == true) goto L5;
        return;
    L5:
        b1(new gl2(this, r9, 1));
        x1(Collections.singletonList(r9), -1, -9223372036854775807L, true);
    }

    public final void s1(int r17, int r18, List r19) {
        int r2 = this.q.j.o();
        if (r17 <= r2) goto L6;
        return;
    L6:
        if (this.q.j.p() == false) goto L9;
        x1(r19, -1, -9223372036854775807L, false);
        return;
    L9:
        int r3 = Math.min(r18, r2);
        lk3 r0 = j1(i1(this.q, r3, r19, M0(), Z()), r17, r3, true, M0(), Z());
        int r4 = this.q.c.a.b;
        if (r4 < r17) goto L13;
        if (r4 >= r3) goto L13;
        boolean r1 = true;
    L14:
        Integer r5 = null;
        if (r1 == false) goto L17;
        Integer r6 = 4;
    L18:
        if (r1 == false) goto L20;
        r5 = 3;
    L20:
        A1(r0, 0, null, r6, r5);
        return;
    L17:
        r6 = null;
    L13:
        r1 = false;
        goto L14
    }

    @Override // defpackage.rk2
    public final void stop() {
        if (h1(3) == false) goto L10;
        b1(new cl2(this, 5));
        lk3 r1 = this.q;
        za4 r3 = this.q.c;
        pi3 r4 = r3.a;
        boolean r5 = r3.b;
        long r6 = SystemClock.elapsedRealtime();
        za4 r7 = this.q.c;
        long r8 = r7.d;
        long r10 = r7.a.f;
        int r11 = ju2.b(r10, r8);
        za4 r9 = this.q.c;
        lk3 r2 = r1.j(new za4(r4, r5, r6, r8, r10, r11, 0, r9.h, r9.i, r9.a.f));
        this.q = r2;
        if (r2.A == 1) goto L9;
        this.q = r2.f(1, r2.a);
        er1 r12 = new er1(19);
        tc2 r0 = this.i;
        r0.c(4, r12);
        r0.b();
        return;
    L9:
        return;
    }

    @Override // defpackage.rk2
    public final int t() {
        return this.q.c.f;
    }

    @Override // defpackage.rk2
    public final void t0(int r3, int r4) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r3 < 0) goto L8;
        if (r4 < 0) goto L8;
        boolean r0 = true;
    L9:
        rr2.l(r0);
        b1(new nl2(this, r3, r4, 2));
        m1(r3, r3 + 1, r4);
        return;
    L8:
        r0 = false;
        goto L9
    }

    @Override // defpackage.rk2
    public final long u() {
        return this.q.E;
    }

    @Override // defpackage.rk2
    public final void u0(final int r2, final int r3, final int r4) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r2 < 0) goto L9;
        if (r2 > r3) goto L9;
        if (r4 < 0) goto L9;
        boolean r0 = true;
    L10:
        rr2.l(r0);
        b1(new ul2(this, r2, r3, r4));
        m1(r2, r3, r4);
        return;
    L9:
        r0 = false;
        goto L10
    }

    @Override // defpackage.rk2
    public final void v(oi3 r1) {
        this.i.a(r1);
    }

    @Override // defpackage.rk2
    public final int v0() {
        return this.q.z;
    }

    public final void v1(int r54, long r55) {
        cu4 r1 = this.q.j;
        if (r1.p() == true) goto L7;
        if (r54 < r1.o()) goto L7;
        return;
    L7:
        if (k() == true) goto L72;
        lk3 r2 = this.q;
        if (r2.A != 1) goto L12;
        int r4 = 1;
    L13:
        lk3 r3 = r2.f(r4, r2.a);
        dd2 r5 = g1(r54, r55, r1);
        long r7 = 0;
        if (r5 != null) goto L32;
        long r9 = 0;
        if (r55 == (-9223372036854775807L)) goto L20;
        r7 = r55;
    L20:
        if (r55 == (-9223372036854775807L)) goto L23;
        r9 = r55;
    L23:
        int r15 = 1;
        int r34 = 2;
        pi3 r6 = new pi3(null, r54, null, null, r54, r7, r9, -1, -1);
        lk3 r8 = this.q;
        cu4 r10 = r8.j;
        boolean r11 = this.q.c.b;
        long r19 = SystemClock.elapsedRealtime();
        za4 r12 = this.q.c;
        long r13 = r12.d;
        if (r55 != (-9223372036854775807L)) goto L26;
        long r23 = 0;
    L27:
        long r14 = r12.h;
        long r16 = r12.i;
        if (r55 != (-9223372036854775807L)) goto L30;
        long r32 = 0;
    L31:
        lk3 r17 = l1(r8, r10, r6, new za4(r6, r11, r19, r13, r23, 0, 0, r14, r16, r32), 1);
    L53:
        za4 r18 = r17.c;
        if (this.q.j.p() == false) goto L56;
    L58:
        int r20 = 0;
    L59:
        if (r20 == 0) goto L61;
    L64:
        Integer r21 = Integer.valueOf(r15);
        if (r20 == 0) goto L68;
        Integer r22 = Integer.valueOf(r34);
    L69:
        A1(r17, null, null, r21, r22);
        return;
    L68:
        r22 = null;
        goto L69
    L61:
        if (r18.a.f != this.q.c.a.f) goto L64;
        return;
    L56:
        if (r18.a.b == this.q.c.a.b) goto L58;
        r20 = r15;
        goto L59
    L30:
        r32 = r55;
        goto L31
    L26:
        r23 = r55;
        goto L27
    L32:
        r15 = 1;
        r34 = 2;
        za4 r24 = r3.c;
        pi3 r25 = r24.a;
        pi3 r26 = r24.a;
        int r27 = r25.e;
        int r28 = r5.a;
        zt4 r29 = new zt4();
        r1.f(r27, r29, false);
        zt4 r30 = new zt4();
        r1.f(r28, r30, false);
        if (r27 == r28) goto L35;
        boolean r31 = true;
    L36:
        long r110 = r5.b;
        long r111 = f35.Q(M0()) - r29.e;
        if (r31 == true) goto L42;
        if (r110 != r111) goto L42;
    L52:
        r17 = r3;
    L42:
        if (r26.h != (-1)) goto L44;
        boolean r33 = true;
    L45:
        rr2.w(r33);
        pi3 r112 = new pi3(null, r29.c, r26.c, null, r27, f35.i0(r29.e + r111), f35.i0(r29.e + r111), -1, -1);
        r1.f(r28, r30, false);
        bu4 r35 = new bu4();
        r1.n(r30.c, r35);
        long r210 = f35.i0(r30.e + r110);
        pi3 r36 = new pi3(null, r30.c, r35.b, null, r28, r210, r210, -1, -1);
        lk3 r37 = r3.h(r112, r36, 1);
        if (r31 == true) goto L51;
        if (r110 < r111) goto L51;
        long r38 = Math.max(0, f35.Q(r37.c.g) - (r110 - r111));
        long r39 = f35.i0((r30.e + r110) + r38);
        r3 = r37.j(new za4(r36, false, SystemClock.elapsedRealtime(), f35.i0(r35.l), r39, ju2.b(r39, f35.i0(r35.l)), f35.i0(r38), -9223372036854775807L, -9223372036854775807L, r39));
    L51:
        r3 = r37.j(new za4(r36, false, SystemClock.elapsedRealtime(), f35.i0(r35.l), r210, ju2.b(r210, f35.i0(r35.l)), 0, -9223372036854775807L, -9223372036854775807L, r210));
        goto L52
    L44:
        r33 = false;
        goto L45
    L35:
        r31 = false;
        goto L36
    L12:
        r4 = 2;
        goto L13
    }

    @Override // defpackage.rk2
    public final int w() {
        if (this.q.j.p() == false) goto L6;
        return -1;
    L6:
        lk3 r0 = this.q;
        cu4 r1 = r0.j;
        int r2 = e1(r0);
        lk3 r4 = this.q;
        int r3 = r4.h;
        if (r3 != 1) goto L10;
        r3 = 0;
    L10:
        return r1.k(r2, r3, r4.i);
    }

    @Override // defpackage.rk2
    public final void w0(List r3) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        b1(new fl2(this, r3, 1));
        W0(r3, this.q.j.o());
    }

    public final void w1(long r5) {
        long r0 = M0() + r5;
        long r6 = getDuration();
        if (r6 == (-9223372036854775807L)) goto L5;
        r0 = Math.min(r0, r6);
    L5:
        long r7 = Math.max(r0, 0);
        v1(e1(this.q), r7);
    }

    @Override // defpackage.rk2
    public final long x() {
        return this.q.c.i;
    }

    @Override // defpackage.rk2
    public final cu4 x0() {
        return this.q.j;
    }

    public final void x1(List r33, int r34, long r35, boolean r37) {
        ArrayList r3 = new ArrayList();
        ArrayList r4 = new ArrayList();
        int r11 = 0;
    L4:
        if (r11 >= r33.size()) goto L6;
        gn2 r8 = (gn2) r33.get(r11);
        jx1 r6 = f92.a;
        bu4 r7 = new bu4();
        int r23 = r11;
        r7.b(0, r8, null, 0, 0, 0, true, false, null, 0, -9223372036854775807L, r23, r23, 0);
        r3.add(r7);
        zt4 r9 = new zt4();
        r9.i(null, null, r23, -9223372036854775807L, 0, z5.f, true);
        r4.add(r9);
        r11 = r23 + 1;
        goto L4
    L6:
        au4 r5 = Z0(r3, r4);
        yw1 r10 = r5.e;
        if (r5.p() == true) goto L14;
        if (r34 < r10.size()) goto L14;
        throw new IllegalSeekPositionException();
    L14:
        if (r37 == true) goto L16;
        if (r34 != (-1)) goto L27;
        pi3 r2 = this.q.c.a;
        int r12 = r2.b;
        long r13 = r2.f;
        if (r5.p() == false) goto L24;
    L26:
        boolean r14 = false;
        long r15 = r13;
        int r16 = r12;
    L28:
        dd2 r17 = g1(r16, r15, r5);
        if (r17 == null) goto L31;
        long r18 = r17.b;
        pi3 r19 = new pi3(null, r16, (gn2) r33.get(r16), null, r17.a, f35.i0(r18), f35.i0(r18), -1, -1);
        za4 r110 = new za4(r19, false, SystemClock.elapsedRealtime(), -9223372036854775807L, f35.i0(r18), 0, 0, -9223372036854775807L, -9223372036854775807L, f35.i0(r18));
    L46:
        lk3 r1 = l1(this.q, r5, r19, r110, 4);
        int r20 = r1.A;
        if (r16 == (-1)) goto L55;
        if (r20 == 1) goto L55;
        if (r5.p() == true) goto L54;
        if (r14 == true) goto L54;
        r20 = 2;
    L54:
        r20 = 4;
    L55:
        lk3 r21 = r1.f(r20, this.q.a);
        Integer r22 = null;
        if (this.q.j.p() == true) goto L58;
        Integer r24 = 4;
    L60:
        if (this.q.j.p() == true) goto L62;
    L65:
        r22 = 3;
    L66:
        A1(r21, 0, null, r24, r22);
        return;
    L62:
        if (r21.j.p() == true) goto L66;
    L58:
        r24 = null;
        goto L60
    L31:
        if (r15 != (-9223372036854775807L)) goto L33;
        long r111 = 0;
    L34:
        if (r15 != (-9223372036854775807L)) goto L36;
        long r112 = 0;
    L37:
        r19 = new pi3(null, r16, null, null, r16, r111, r112, -1, -1);
        long r113 = SystemClock.elapsedRealtime();
        if (r15 != (-9223372036854775807L)) goto L40;
        long r25 = 0;
    L41:
        if (r15 != (-9223372036854775807L)) goto L43;
        long r30 = 0;
    L44:
        r110 = new za4(r19, false, r113, -9223372036854775807L, r25, 0, 0, -9223372036854775807L, -9223372036854775807L, r30);
        goto L46
    L43:
        r30 = r15;
        goto L44
    L40:
        r25 = r15;
        goto L41
    L36:
        r112 = r15;
        goto L37
    L33:
        r111 = r15;
        goto L34
    L24:
        if (r12 < r10.size()) goto L26;
        r16 = r5.a(this.q.i);
        r15 = -9223372036854775807L;
        r14 = true;
        goto L28
    L27:
        r16 = r34;
        r14 = false;
        r15 = r35;
        goto L28
    L16:
        if (r5.p() == false) goto L18;
        int r26 = 0;
    L19:
        r16 = r26;
        r14 = false;
        r15 = -9223372036854775807L;
        goto L28
    L18:
        r26 = r5.a(this.q.i);
        goto L19
    }

    @Override // defpackage.rk2
    public final int y() {
        return this.q.c.a.e;
    }

    @Override // defpackage.rk2
    public final boolean y0() {
        return this.q.u;
    }

    public final void y1(boolean r10) {
        lk3 r0 = this.q;
        int r1 = r0.z;
        if (r1 != 1) goto L5;
        int r8 = 0;
    L7:
        if (r0.v != r10) goto L10;
        if (r1 != r8) goto L10;
        return;
    L10:
        this.F = ju2.c(r0, this.F, this.G, f1().g);
        this.G = SystemClock.elapsedRealtime();
        A1(this.q.d(1, r8, r10), null, 1, null, null);
        return;
    L5:
        r8 = r1;
        goto L7
    }

    @Override // defpackage.rk2
    public final s55 z() {
        return this.q.l;
    }

    @Override // defpackage.rk2
    public final void z0(int r3, gn2 r4) {
        if (h1(20) == true) goto L5;
        return;
    L5:
        if (r3 < 0) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        b1(new vl2(this, r3, r4, 1));
        s1(r3, r3 + 1, yw1.o(r4));
        return;
    L7:
        r0 = false;
        goto L8
    }

    public final void z1(Surface r9, int r10, int r11) {
        if (Y() == true) goto L5;
        return;
    L5:
        cb4 r0 = this.n;
        r0.getClass();
        if (r0.a.f() < 8) goto L9;
        c1(new hl2(this, r9, r10, r11, 1));
        return;
    L9:
        c1(new ef0(12, this, r9));
    }
}
