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
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bm2 implements rk2 {
    public Surface A;
    public SurfaceHolder B;
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
    public PendingIntent r;
    public yw1 s;
    public yw1 t;
    public gy3 u;
    public gy3 v;
    public mi3 x;
    public mi3 y;
    public mi3 z;
    public lk3 q = lk3.H;
    public pf4 C = pf4.c;
    public wa4 w = wa4.b;

    /* JADX WARN: Type inference failed for: r4v4, types: [il2] */
    public bm2(Context context, sk2 sk2Var, cb4 cb4Var, Bundle bundle, Looper looper) {
        gy3 gy3Var = gy3.r;
        this.s = gy3Var;
        this.t = gy3Var;
        this.u = gy3Var;
        this.v = gy3Var;
        mi3 mi3Var = mi3.b;
        this.x = mi3Var;
        this.y = mi3Var;
        this.z = Y0(mi3Var, mi3Var);
        this.i = new tc2(looper, vp4.a, new cl2(this, 17));
        this.m = new Handler(looper);
        this.a = sk2Var;
        rr2.s(context, "context must not be null");
        rr2.s(cb4Var, "token must not be null");
        this.d = context;
        this.b = new yk();
        this.c = new mm2(this);
        this.k = new qi(0);
        this.e = cb4Var;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: il2
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                bm2 bm2Var = this.a;
                sk2 sk2VarF1 = bm2Var.f1();
                sk2 sk2VarF2 = bm2Var.f1();
                Objects.requireNonNull(sk2VarF2);
                sk2VarF1.a1(new qa1(18, sk2VarF2));
            }
        };
        this.h = new am2(this);
        this.I = Bundle.EMPTY;
        this.o = cb4Var.a.getType() == 0 ? null : new yl2(this, bundle);
        rf2 rf2Var = new rf2();
        rf2Var.o = this;
        rf2Var.n = new Handler(looper, new gt0(2, rf2Var));
        this.j = rf2Var;
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.l = new SparseArray();
    }

    public static mi3 Y0(mi3 mi3Var, mi3 mi3Var2) {
        mi3 mi3VarD = ju2.d(mi3Var, mi3Var2);
        if (mi3VarD.a(32)) {
            return mi3VarD;
        }
        xk0 xk0Var = new xk0(2);
        xk0Var.c(mi3VarD.a);
        xk0Var.b(32);
        return new mi3(xk0Var.f());
    }

    public static au4 Z0(ArrayList arrayList, ArrayList arrayList2) {
        uw1 uw1Var = new uw1(4);
        uw1Var.d(arrayList);
        gy3 gy3VarF = uw1Var.f();
        uw1 uw1Var2 = new uw1(4);
        uw1Var2.d(arrayList2);
        gy3 gy3VarF2 = uw1Var2.f();
        int size = arrayList.size();
        hd5 hd5Var = ju2.a;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new au4(gy3VarF, gy3VarF2, iArr);
    }

    public static int e1(lk3 lk3Var) {
        return lk3Var.c.a.b;
    }

    public static lk3 i1(lk3 lk3Var, int i, List list, long j, long j2) {
        int size;
        cu4 cu4Var = lk3Var.j;
        za4 za4Var = lk3Var.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < cu4Var.o(); i2++) {
            arrayList.add(cu4Var.m(i2, new bu4(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            gn2 gn2Var = (gn2) list.get(i3);
            bu4 bu4Var = new bu4();
            bu4Var.b(0, gn2Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, bu4Var);
        }
        q1(cu4Var, arrayList, arrayList2);
        au4 au4VarZ0 = Z0(arrayList, arrayList2);
        if (lk3Var.j.p()) {
            size = 0;
        } else {
            int i4 = za4Var.a.b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = za4Var.a.e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return k1(lk3Var, au4VarZ0, size2, size, j, j2, 5);
    }

    public static lk3 j1(lk3 lk3Var, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iA;
        int i4;
        lk3 lk3VarK1;
        cu4 cu4Var = lk3Var.j;
        boolean z2 = lk3Var.i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < cu4Var.o(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(cu4Var.m(i6, new bu4(), 0L));
            }
        }
        q1(cu4Var, arrayList, arrayList2);
        au4 au4VarZ0 = Z0(arrayList, arrayList2);
        pi3 pi3Var = lk3Var.c.a;
        int i7 = pi3Var.b;
        int i8 = pi3Var.e;
        bu4 bu4Var = new bu4();
        boolean z3 = i7 >= i && i7 < i2;
        if (au4VarZ0.p()) {
            i8 = 0;
            iA = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i9 = lk3Var.h;
                int iO = cu4Var.o();
                iA = i7;
                i3 = 1;
                while (true) {
                    if (i5 < iO) {
                        iA = cu4Var.e(iA, i9, z2);
                        if (iA != -1) {
                            if (iA < i || iA >= i2) {
                                break;
                            }
                            i5++;
                        }
                    }
                    iA = -1;
                    break;
                }
                if (iA == -1) {
                    iA = au4VarZ0.a(z2);
                } else if (iA >= i2) {
                    iA -= i2 - i;
                }
                au4VarZ0.m(iA, bu4Var, 0L);
                i4 = bu4Var.m;
            } else {
                i3 = 1;
                if (i7 >= i2) {
                    iA = i7 - (i2 - i);
                    if (i8 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            bu4 bu4Var2 = new bu4();
                            cu4Var.n(i10, bu4Var2);
                            i8 -= (bu4Var2.n - bu4Var2.m) + 1;
                        }
                    }
                    i4 = i8;
                } else {
                    iA = i7;
                }
            }
            i8 = i4;
        }
        if (!z3) {
            lk3VarK1 = k1(lk3Var, au4VarZ0, iA, i8, j, j2, 4);
        } else if (iA == -1) {
            lk3VarK1 = l1(lk3Var, au4VarZ0, za4.k, za4.l, 4);
        } else if (z) {
            lk3VarK1 = k1(lk3Var, au4VarZ0, iA, i8, j, j2, 4);
        } else {
            int i11 = iA;
            bu4 bu4Var3 = new bu4();
            au4VarZ0.m(i11, bu4Var3, 0L);
            long jI0 = f35.i0(bu4Var3.k);
            long jI1 = f35.i0(bu4Var3.l);
            pi3 pi3Var2 = new pi3(null, i11, bu4Var3.b, null, i8, jI0, jI0, -1, -1);
            lk3VarK1 = l1(lk3Var, au4VarZ0, pi3Var2, new za4(pi3Var2, false, SystemClock.elapsedRealtime(), jI1, jI0, ju2.b(jI0, jI1), 0L, -9223372036854775807L, jI1, jI0), 4);
        }
        int i12 = lk3VarK1.A;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != cu4Var.o() || i7 < i) ? lk3VarK1 : lk3VarK1.f(4, null);
    }

    public static lk3 k1(lk3 lk3Var, au4 au4Var, int i, int i2, long j, long j2, int i3) {
        bu4 bu4Var = new bu4();
        au4Var.m(i, bu4Var, 0L);
        gn2 gn2Var = bu4Var.b;
        pi3 pi3Var = lk3Var.c.a;
        pi3 pi3Var2 = new pi3(null, i, gn2Var, null, i2, j, j2, pi3Var.h, pi3Var.i);
        za4 za4Var = lk3Var.c;
        return l1(lk3Var, au4Var, pi3Var2, new za4(pi3Var2, za4Var.b, SystemClock.elapsedRealtime(), za4Var.d, za4Var.e, za4Var.f, za4Var.g, za4Var.h, za4Var.i, za4Var.j), i3);
    }

    public static lk3 l1(lk3 lk3Var, cu4 cu4Var, pi3 pi3Var, za4 za4Var, int i) {
        za4 za4Var2;
        cw4 cw4Var;
        jw4 jw4Var;
        boolean z;
        PlaybackException playbackException = lk3Var.a;
        int i2 = lk3Var.b;
        za4 za4Var3 = lk3Var.c;
        qh3 qh3Var = lk3Var.g;
        int i3 = lk3Var.h;
        boolean z2 = lk3Var.i;
        int i4 = lk3Var.k;
        s55 s55Var = lk3Var.l;
        do2 do2Var = lk3Var.m;
        float f = lk3Var.n;
        float f2 = lk3Var.o;
        int i5 = lk3Var.p;
        il ilVar = lk3Var.q;
        jg0 jg0Var = lk3Var.r;
        hp0 hp0Var = lk3Var.s;
        int i6 = lk3Var.t;
        boolean z3 = lk3Var.u;
        boolean z4 = lk3Var.v;
        int i7 = lk3Var.w;
        boolean z5 = lk3Var.x;
        boolean z6 = lk3Var.y;
        int i8 = lk3Var.z;
        int i9 = lk3Var.A;
        do2 do2Var2 = lk3Var.B;
        long j = lk3Var.C;
        long j2 = lk3Var.D;
        long j3 = lk3Var.E;
        jw4 jw4Var2 = lk3Var.F;
        cw4 cw4Var2 = lk3Var.G;
        pi3 pi3Var2 = za4Var3.a;
        if (!cu4Var.p()) {
            za4Var2 = za4Var;
            cw4Var = cw4Var2;
            jw4Var = jw4Var2;
            if (za4Var2.a.b >= cu4Var.o()) {
                z = false;
            }
            rr2.w(z);
            return new lk3(playbackException, i2, za4Var2, pi3Var2, pi3Var, i, qh3Var, i3, z2, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z3, z4, i7, i8, i9, z5, z6, do2Var2, j, j2, j3, jw4Var, cw4Var);
        }
        za4Var2 = za4Var;
        cw4Var = cw4Var2;
        jw4Var = jw4Var2;
        z = true;
        rr2.w(z);
        return new lk3(playbackException, i2, za4Var2, pi3Var2, pi3Var, i, qh3Var, i3, z2, s55Var, cu4Var, i4, do2Var, f, f2, ilVar, i5, jg0Var, hp0Var, i6, z3, z4, i7, i8, i9, z5, z6, do2Var2, j, j2, j3, jw4Var, cw4Var);
    }

    public static void q1(cu4 cu4Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            bu4 bu4Var = (bu4) arrayList.get(i);
            int i2 = bu4Var.m;
            int i3 = bu4Var.n;
            if (i2 == -1 || i3 == -1) {
                bu4Var.m = arrayList2.size();
                bu4Var.n = arrayList2.size();
                zt4 zt4Var = new zt4();
                zt4Var.i(null, null, i, -9223372036854775807L, 0L, z5.f, true);
                arrayList2.add(zt4Var);
            } else {
                bu4Var.m = arrayList2.size();
                bu4Var.n = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    zt4 zt4Var2 = new zt4();
                    cu4Var.f(i2, zt4Var2, false);
                    zt4Var2.c = i;
                    arrayList2.add(zt4Var2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static gy3 t1(gy3 gy3Var, List list, Bundle bundle, wa4 wa4Var, mi3 mi3Var) {
        boolean z;
        if (!list.isEmpty()) {
            return j60.g(list, wa4Var, mi3Var);
        }
        boolean z2 = false;
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            z = false;
        } else {
            if (mi3Var.a.a(6, 7)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            if (!mi3Var.a.a(8, 9)) {
                z2 = true;
            }
        }
        return j60.j(gy3Var, z, z2);
    }

    public static gy3 u1(List list, List list2, wa4 wa4Var, mi3 mi3Var, Bundle bundle) {
        if (list.isEmpty()) {
            list = j60.k(list2, mi3Var, bundle);
        }
        return j60.g(list, wa4Var, mi3Var);
    }

    @Override // defpackage.rk2
    public final void A() {
        if (h1(6)) {
            b1(new cl2(this, 7));
            if (w() != -1) {
                v1(w(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.rk2
    public final void A0() {
        if (h1(24)) {
            b1(new cl2(this, 13));
            lk3 lk3Var = this.q;
            if (lk3Var.n != 0.0f) {
                this.q = lk3Var.p(0.0f);
                er1 er1Var = new er1(20);
                tc2 tc2Var = this.i;
                tc2Var.c(22, er1Var);
                tc2Var.b();
            }
        }
    }

    public final void A1(lk3 lk3Var, Integer num, Integer num2, Integer num3, Integer num4) {
        lk3 lk3Var2 = this.q;
        this.q = lk3Var;
        n1(lk3Var2, lk3Var, num, num2, num3, num4);
    }

    @Override // defpackage.rk2
    public final float B() {
        return this.q.n;
    }

    @Override // defpackage.rk2
    public final void B0(gn2 gn2Var) {
        if (h1(31)) {
            b1(new gl2(this, gn2Var, 0));
            x1(Collections.singletonList(gn2Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.rk2
    public final void C() {
        if (h1(4)) {
            b1(new cl2(this, 9));
            v1(e1(this.q), -9223372036854775807L);
        }
    }

    @Override // defpackage.rk2
    public final void C0() {
        if (h1(26)) {
            b1(new cl2(this, 12));
            lk3 lk3Var = this.q;
            int i = lk3Var.t + 1;
            int i2 = lk3Var.s.c;
            if (i2 == 0 || i <= i2) {
                this.q = lk3Var.c(i, lk3Var.u);
                kl2 kl2Var = new kl2(this, i, 4);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
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
    public final void E(final int i, final boolean z) {
        if (h1(34)) {
            b1(new xl2() { // from class: tl2
                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i2) {
                    pu1Var.x0(this.n.c, i2, z, i);
                }
            });
            lk3 lk3Var = this.q;
            if (lk3Var.u != z) {
                this.q = lk3Var.c(lk3Var.t, z);
                jl2 jl2Var = new jl2(this, z, 1);
                tc2 tc2Var = this.i;
                tc2Var.c(30, jl2Var);
                tc2Var.b();
            }
        }
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
        if (h1(26)) {
            b1(new cl2(this, 15));
            lk3 lk3Var = this.q;
            int i = lk3Var.t - 1;
            if (i >= lk3Var.s.b) {
                this.q = lk3Var.c(i, lk3Var.u);
                kl2 kl2Var = new kl2(this, i, 9);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void G0(int i) {
        if (h1(25)) {
            b1(new kl2(this, i, 7));
            lk3 lk3Var = this.q;
            hp0 hp0Var = lk3Var.s;
            if (lk3Var.t == i || hp0Var.b > i) {
                return;
            }
            int i2 = hp0Var.c;
            if (i2 == 0 || i <= i2) {
                this.q = lk3Var.c(i, lk3Var.u);
                kl2 kl2Var = new kl2(this, i, 8);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void H(int i, int i2) {
        if (h1(33)) {
            b1(new nl2(this, i, i2, 1));
            lk3 lk3Var = this.q;
            hp0 hp0Var = lk3Var.s;
            if (lk3Var.t == i || hp0Var.b > i) {
                return;
            }
            int i3 = hp0Var.c;
            if (i3 == 0 || i <= i3) {
                this.q = lk3Var.c(i, lk3Var.u);
                kl2 kl2Var = new kl2(this, i, 3);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void H0() {
        if (h1(9)) {
            b1(new cl2(this, 0));
            cu4 cu4Var = this.q.j;
            if (cu4Var.p() || k()) {
                return;
            }
            if (f0()) {
                v1(j0(), -9223372036854775807L);
                return;
            }
            bu4 bu4VarM = cu4Var.m(e1(this.q), new bu4(), 0L);
            if (bu4VarM.h && bu4VarM.a()) {
                v1(e1(this.q), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.rk2
    public final boolean I() {
        return w() != -1;
    }

    @Override // defpackage.rk2
    public final void I0() {
        if (h1(12)) {
            b1(new cl2(this, 8));
            w1(this.q.D);
        }
    }

    @Override // defpackage.rk2
    public final void J(int i) {
        if (h1(34)) {
            b1(new kl2(this, i, 5));
            lk3 lk3Var = this.q;
            int i2 = lk3Var.t + 1;
            int i3 = lk3Var.s.c;
            if (i3 == 0 || i2 <= i3) {
                this.q = lk3Var.c(i2, lk3Var.u);
                kl2 kl2Var = new kl2(this, i2, 6);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void J0() {
        if (h1(11)) {
            b1(new cl2(this, 11));
            w1(-this.q.C);
        }
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
    public final void L(int i, int i2, List list) {
        if (h1(20)) {
            rr2.l(i >= 0 && i <= i2);
            b1(new hl2(this, list, i, i2, 0));
            s1(i, i2, list);
        }
    }

    @Override // defpackage.rk2
    public final void L0(List list) {
        if (h1(20)) {
            b1(new ef0(11, this, (ArrayList) list));
            x1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.rk2
    public final void M(cw4 cw4Var) {
        if (h1(29)) {
            b1(new ef0(16, this, cw4Var));
            lk3 lk3Var = this.q;
            if (cw4Var != lk3Var.G) {
                this.q = lk3Var.o(cw4Var);
                y31 y31Var = new y31(cw4Var, 1);
                tc2 tc2Var = this.i;
                tc2Var.c(19, y31Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final long M0() {
        long jC = ju2.c(this.q, this.F, this.G, f1().g);
        this.F = jC;
        return jC;
    }

    @Override // defpackage.rk2
    public final void N(int i) {
        if (h1(20)) {
            rr2.l(i >= 0);
            b1(new kl2(this, i, 11));
            r1(i, i + 1);
        }
    }

    @Override // defpackage.rk2
    public final void N0(List list, int i) {
        if (h1(20)) {
            rr2.l(i >= 0);
            b1(new vl2(this, i, list, 0));
            W0(list, i);
        }
    }

    @Override // defpackage.rk2
    public final void O(long j) {
        if (h1(5)) {
            b1(new ll2(j, this));
            v1(e1(this.q), j);
        }
    }

    @Override // defpackage.rk2
    public final long O0() {
        return this.q.C;
    }

    @Override // defpackage.rk2
    public final void P(int i, int i2) {
        if (h1(20)) {
            rr2.l(i >= 0 && i2 >= i);
            b1(new nl2(this, i, i2, 0));
            r1(i, i2);
        }
    }

    @Override // defpackage.rk2
    public final wa4 P0() {
        return this.w;
    }

    @Override // defpackage.rk2
    public final void Q(SurfaceHolder surfaceHolder) {
        if (h1(27)) {
            if (surfaceHolder == null) {
                if (h1(27)) {
                    X0();
                    z1(null, 0, 0);
                    p1(0, 0);
                    return;
                }
                return;
            }
            if (this.B == surfaceHolder) {
                return;
            }
            X0();
            this.B = surfaceHolder;
            surfaceHolder.addCallback(this.h);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.A = null;
                z1(null, 0, 0);
                p1(0, 0);
            } else {
                this.A = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                z1(surface, surfaceFrame.width(), surfaceFrame.height());
                p1(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // defpackage.rk2
    public final yw1 Q0() {
        return this.u;
    }

    @Override // defpackage.rk2
    public final void R(float f) {
        if (h1(24)) {
            b1(new rl2(this, f, 1));
            lk3 lk3Var = this.q;
            if (lk3Var.n != f) {
                this.q = lk3Var.p(f);
                w31 w31Var = new w31(1, f);
                tc2 tc2Var = this.i;
                tc2Var.c(22, w31Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void R0() {
        pu1 pu1Var;
        cb4 cb4Var = this.e;
        bb4 bb4Var = cb4Var.a;
        bb4 bb4Var2 = cb4Var.a;
        int type = bb4Var.getType();
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.o = null;
            Object objC = bb4Var2.c();
            objC.getClass();
            IBinder iBinder = (IBinder) objC;
            int i = kt2.k;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pu1)) {
                nu1 nu1Var = new nu1();
                nu1Var.e = iBinder;
                pu1Var = nu1Var;
            } else {
                pu1Var = (pu1) iInterfaceQueryLocalInterface;
            }
            int iS = this.b.s();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            this.a.getClass();
            try {
                pu1Var.n0(this.c, iS, new ja0(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e) {
                l93.r0("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.o = new yl2(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(bb4Var2.g(), bb4Var2.d());
            try {
                if (context.bindService(intent, this.o, i2)) {
                    return;
                }
                l93.q0("MCImplBase", "bind to " + cb4Var + " failed");
            } catch (SecurityException e2) {
                l93.r0("MCImplBase", "bind to " + cb4Var + " not allowed", e2);
            }
        }
        sk2 sk2VarF1 = f1();
        sk2 sk2VarF2 = f1();
        Objects.requireNonNull(sk2VarF2);
        sk2VarF1.a1(new qa1(18, sk2VarF2));
    }

    @Override // defpackage.rk2
    public final void S() {
        if (h1(7)) {
            b1(new cl2(this, 16));
            cu4 cu4Var = this.q.j;
            if (cu4Var.p() || k()) {
                return;
            }
            boolean zI = I();
            bu4 bu4VarM = cu4Var.m(e1(this.q), new bu4(), 0L);
            if (bu4VarM.h && bu4VarM.a()) {
                if (zI) {
                    v1(w(), -9223372036854775807L);
                }
            } else if (!zI || M0() > this.q.E) {
                v1(e1(this.q), 0L);
            } else {
                v1(w(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.rk2
    public final Bundle S0() {
        return this.f;
    }

    @Override // defpackage.rk2
    public final void T(final List list, final int i, final long j) {
        if (h1(20)) {
            b1(new xl2() { // from class: ml2
                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i2) {
                    mm2 mm2Var = this.n.c;
                    uw1 uw1VarJ = yw1.j();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            pu1Var.u(mm2Var, i2, new iw(uw1VarJ.f()), i, j);
                            return;
                        } else {
                            uw1VarJ.c(((gn2) list2.get(i3)).c(true));
                            i3++;
                        }
                    }
                }
            });
            x1(list, i, j, false);
        }
    }

    @Override // defpackage.rk2
    public final ic2 T0(final va4 va4Var, final Bundle bundle) {
        cb4 cb4Var = this.n;
        cb4Var.getClass();
        if (cb4Var.a.f() < 7) {
            final int i = 1;
            return d1(va4Var, new xl2(this) { // from class: dl2
                public final /* synthetic */ bm2 o;

                {
                    this.o = this;
                }

                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i2) {
                    int i3 = i;
                    va4 va4Var2 = va4Var;
                    bm2 bm2Var = this.o;
                    switch (i3) {
                        case 0:
                            pu1Var.s(bm2Var.c, i2, va4Var2.b(), bundle, false);
                            break;
                        default:
                            pu1Var.t0(bm2Var.c, i2, va4Var2.b(), bundle);
                            break;
                    }
                }
            });
        }
        cb4 cb4Var2 = this.n;
        cb4Var2.getClass();
        if (cb4Var2.a.f() < 7) {
            return T0(va4Var, bundle);
        }
        final int i2 = 0;
        return d1(va4Var, new xl2(this) { // from class: dl2
            public final /* synthetic */ bm2 o;

            {
                this.o = this;
            }

            @Override // defpackage.xl2
            public final void d(pu1 pu1Var, int i3) {
                int i4 = i2;
                va4 va4Var2 = va4Var;
                bm2 bm2Var = this.o;
                switch (i4) {
                    case 0:
                        pu1Var.s(bm2Var.c, i3, va4Var2.b(), bundle, false);
                        break;
                    default:
                        pu1Var.t0(bm2Var.c, i3, va4Var2.b(), bundle);
                        break;
                }
            }
        });
    }

    @Override // defpackage.rk2
    public final PlaybackException U() {
        return this.q.a;
    }

    @Override // defpackage.rk2
    public final void U0(gn2 gn2Var) {
        if (h1(20)) {
            b1(new gl2(this, gn2Var, 2));
            W0(Collections.singletonList(gn2Var), this.q.j.o());
        }
    }

    @Override // defpackage.rk2
    public final void V(boolean z) {
        if (h1(1)) {
            b1(new jl2(this, z, 0));
            y1(z);
        } else if (z) {
            l93.q0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // defpackage.rk2
    public final void V0(List list) {
        if (h1(20)) {
            b1(new fl2(this, list, 0));
            x1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.rk2
    public final void W(int i) {
        if (h1(10)) {
            rr2.l(i >= 0);
            b1(new kl2(this, i, 10));
            v1(i, -9223372036854775807L);
        }
    }

    public final void W0(List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        if (this.q.j.p()) {
            x1(list, -1, -9223372036854775807L, false);
        } else {
            A1(i1(this.q, Math.min(i, this.q.j.o()), list, M0(), Z()), 0, null, null, this.q.j.p() ? 3 : null);
        }
    }

    @Override // defpackage.rk2
    public final long X() {
        return this.q.D;
    }

    public final void X0() {
        SurfaceHolder surfaceHolder = this.B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
    }

    @Override // defpackage.rk2
    public final boolean Y() {
        return this.D != null;
    }

    @Override // defpackage.rk2
    public final long Z() {
        za4 za4Var = this.q.c;
        return !za4Var.b ? M0() : za4Var.a.g;
    }

    @Override // defpackage.rk2
    public final void a() {
        pu1 pu1Var = this.D;
        if (this.p) {
            return;
        }
        this.p = true;
        this.n = null;
        this.m.removeCallbacksAndMessages(null);
        X0();
        rf2 rf2Var = this.j;
        Handler handler = (Handler) rf2Var.n;
        if (handler.hasMessages(1)) {
            try {
                bm2 bm2Var = (bm2) rf2Var.o;
                bm2Var.D.p0(bm2Var.c);
            } catch (RemoteException unused) {
                l93.q0("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.D = null;
        int i = 0;
        if (pu1Var != null) {
            int iS = this.b.s();
            try {
                pu1Var.asBinder().unlinkToDeath(this.g, 0);
                pu1Var.j0(this.c, iS);
            } catch (RemoteException unused2) {
            }
        }
        this.i.d();
        yk ykVar = this.b;
        sl2 sl2Var = new sl2(this, i);
        synchronized (ykVar.q) {
            try {
                Handler handlerP = f35.p(null);
                ykVar.t = handlerP;
                ykVar.s = sl2Var;
                if (((oi) ykVar.r).isEmpty()) {
                    ykVar.a();
                } else {
                    handlerP.postDelayed(new jq3(6, ykVar), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rk2
    public final void a0() {
        if (h1(24)) {
            float f = this.q.o;
            b1(new rl2(this, f, 2));
            lk3 lk3Var = this.q;
            float f2 = lk3Var.n;
            if (f2 == lk3Var.o || f2 != 0.0f) {
                return;
            }
            this.q = lk3Var.p(f);
            w31 w31Var = new w31(2, f);
            tc2 tc2Var = this.i;
            tc2Var.c(22, w31Var);
            tc2Var.b();
        }
    }

    public final ic2 a1(pu1 pu1Var, xl2 xl2Var, boolean z) {
        MediaController mediaController;
        if (pu1Var == null) {
            return new mw1(new ab4(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.E) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        ab4 ab4Var = new ab4(1);
        yk ykVar = this.b;
        ea4 ea4VarJ = ykVar.j(ab4Var);
        int i = ea4VarJ.u;
        qi qiVar = this.k;
        if (z) {
            if (qiVar.isEmpty()) {
                this.H = this.q;
            }
            qiVar.add(Integer.valueOf(i));
        }
        try {
            xl2Var.d(pu1Var, i);
            return ea4VarJ;
        } catch (RemoteException e) {
            l93.r0("MCImplBase", "Cannot connect to the service or the session is gone", e);
            qiVar.remove(Integer.valueOf(i));
            ykVar.y(i, new ab4(-100));
            return ea4VarJ;
        }
    }

    @Override // defpackage.rk2
    public final void b() {
        if (h1(2)) {
            b1(new cl2(this, 6));
            lk3 lk3Var = this.q;
            if (lk3Var.A == 1) {
                A1(lk3Var.f(lk3Var.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.rk2
    public final long b0() {
        return this.q.c.e;
    }

    public final void b1(xl2 xl2Var) {
        rf2 rf2Var = this.j;
        Handler handler = (Handler) rf2Var.n;
        if (((bm2) rf2Var.o).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        a1(this.D, xl2Var, true);
    }

    @Override // defpackage.rk2
    public final void c() {
        if (h1(1)) {
            b1(new cl2(this, 3));
            y1(false);
        }
    }

    @Override // defpackage.rk2
    public final void c0() {
        if (h1(8)) {
            b1(new cl2(this, 14));
            if (j0() != -1) {
                v1(j0(), -9223372036854775807L);
            }
        }
    }

    public final void c1(xl2 xl2Var) {
        rf2 rf2Var = this.j;
        Handler handler = (Handler) rf2Var.n;
        if (((bm2) rf2Var.o).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        ic2 ic2VarA1 = a1(this.D, xl2Var, true);
        try {
            f92.v(ic2VarA1);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (ic2VarA1 instanceof ea4) {
                int i = ((ea4) ic2VarA1).u;
                this.k.remove(Integer.valueOf(i));
                this.b.y(i, new ab4(-1));
            }
            l93.r0("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.rk2
    public final void d(qh3 qh3Var) {
        if (h1(13)) {
            b1(new ef0(14, this, qh3Var));
            if (this.q.g.equals(qh3Var)) {
                return;
            }
            this.q = this.q.e(qh3Var);
            ql2 ql2Var = new ql2(qh3Var, 0);
            tc2 tc2Var = this.i;
            tc2Var.c(12, ql2Var);
            tc2Var.b();
        }
    }

    @Override // defpackage.rk2
    public final void d0(int i) {
        if (h1(34)) {
            b1(new kl2(this, i, 1));
            lk3 lk3Var = this.q;
            int i2 = lk3Var.t - 1;
            if (i2 >= lk3Var.s.b) {
                this.q = lk3Var.c(i2, lk3Var.u);
                kl2 kl2Var = new kl2(this, i2, 2);
                tc2 tc2Var = this.i;
                tc2Var.c(30, kl2Var);
                tc2Var.b();
            }
        }
    }

    public final ic2 d1(va4 va4Var, xl2 xl2Var) {
        pu1 pu1Var;
        int i = va4Var.a;
        String str = va4Var.b;
        rr2.l(i == 0);
        if (this.w.a.contains(va4Var) || j60.n(str)) {
            pu1Var = this.D;
        } else {
            l93.q0("MCImplBase", "Controller isn't allowed to call custom session command:".concat(str));
            pu1Var = null;
        }
        return a1(pu1Var, xl2Var, false);
    }

    @Override // defpackage.rk2
    public final void e(float f) {
        if (h1(13)) {
            b1(new rl2(this, f, 0));
            qh3 qh3Var = this.q.g;
            if (qh3Var.a != f) {
                qh3 qh3Var2 = new qh3(f, qh3Var.b);
                this.q = this.q.e(qh3Var2);
                ql2 ql2Var = new ql2(qh3Var2, 1);
                tc2 tc2Var = this.i;
                tc2Var.c(12, ql2Var);
                tc2Var.b();
            }
        }
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
        return j0() != -1;
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

    public final dd2 g1(int i, long j, cu4 cu4Var) {
        if (cu4Var.p()) {
            return null;
        }
        bu4 bu4Var = new bu4();
        zt4 zt4Var = new zt4();
        if (i == -1 || i >= cu4Var.o()) {
            i = cu4Var.a(this.q.i);
            j = f35.i0(cu4Var.m(i, bu4Var, 0L).k);
        }
        long jQ = f35.Q(j);
        rr2.q(i, cu4Var.o());
        cu4Var.n(i, bu4Var);
        if (jQ == -9223372036854775807L) {
            jQ = bu4Var.k;
            if (jQ == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = bu4Var.m;
        cu4Var.f(i2, zt4Var, false);
        while (i2 < bu4Var.n && zt4Var.e != jQ) {
            int i3 = i2 + 1;
            if (cu4Var.f(i3, zt4Var, false).e > jQ) {
                break;
            }
            i2 = i3;
        }
        cu4Var.f(i2, zt4Var, false);
        return new dd2(i2, jQ - zt4Var.e, false);
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

    public final boolean h1(int i) {
        if (this.z.a(i)) {
            return true;
        }
        xa3.m(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
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
        if (this.q.j.p()) {
            return -1;
        }
        lk3 lk3Var = this.q;
        cu4 cu4Var = lk3Var.j;
        int iE1 = e1(lk3Var);
        lk3 lk3Var2 = this.q;
        int i = lk3Var2.h;
        if (i == 1) {
            i = 0;
        }
        return cu4Var.e(iE1, i, lk3Var2.i);
    }

    @Override // defpackage.rk2
    public final boolean k() {
        return this.q.c.b;
    }

    @Override // defpackage.rk2
    public final void k0(final il ilVar, final boolean z) {
        if (h1(35)) {
            b1(new xl2() { // from class: wl2
                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i) {
                    pu1Var.b(this.n.c, i, ilVar.d(), z);
                }
            });
            if (this.q.q.equals(ilVar)) {
                return;
            }
            this.q = this.q.a(ilVar);
            x31 x31Var = new x31(ilVar, 1);
            tc2 tc2Var = this.i;
            tc2Var.c(20, x31Var);
            tc2Var.b();
        }
    }

    @Override // defpackage.rk2
    public final long l() {
        return this.q.c.h;
    }

    @Override // defpackage.rk2
    public final void l0(do2 do2Var) {
        if (h1(19)) {
            b1(new ef0(13, this, do2Var));
            if (this.q.m.equals(do2Var)) {
                return;
            }
            this.q = this.q.g(do2Var);
            r31 r31Var = new r31(do2Var, 1);
            tc2 tc2Var = this.i;
            tc2Var.c(15, r31Var);
            tc2Var.b();
        }
    }

    @Override // defpackage.rk2
    public final long m() {
        return this.q.c.g;
    }

    @Override // defpackage.rk2
    public final void m0() {
        if (!h1(1)) {
            l93.q0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            b1(new cl2(this, 4));
            y1(true);
        }
    }

    public final void m1(int i, int i2, int i3) {
        int i4;
        int i5;
        cu4 cu4Var = this.q.j;
        int iO = cu4Var.o();
        int iMin = Math.min(i2, iO);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iO - i6);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iO; i7++) {
            arrayList.add(cu4Var.m(i7, new bu4(), 0L));
        }
        f35.P(arrayList, i, iMin, iMin2);
        q1(cu4Var, arrayList, arrayList2);
        au4 au4VarZ0 = Z0(arrayList, arrayList2);
        if (au4VarZ0.p()) {
            return;
        }
        int iE1 = e1(this.q);
        if (iE1 >= i && iE1 < iMin) {
            i5 = (iE1 - i) + iMin2;
        } else {
            if (iMin > iE1 || iMin2 <= iE1) {
                if (iMin <= iE1 || iMin2 > iE1) {
                    i4 = iE1;
                } else {
                    i5 = iE1 + i6;
                }
                bu4 bu4Var = new bu4();
                int i8 = this.q.c.a.e - cu4Var.m(iE1, bu4Var, 0L).m;
                au4VarZ0.m(i4, bu4Var, 0L);
                A1(k1(this.q, au4VarZ0, i4, bu4Var.m + i8, M0(), Z(), 5), 0, null, null, null);
            }
            i5 = iE1 - i6;
        }
        i4 = i5;
        bu4 bu4Var2 = new bu4();
        int i9 = this.q.c.a.e - cu4Var.m(iE1, bu4Var2, 0L).m;
        au4VarZ0.m(i4, bu4Var2, 0L);
        A1(k1(this.q, au4VarZ0, i4, bu4Var2.m + i9, M0(), Z(), 5), 0, null, null, null);
    }

    @Override // defpackage.rk2
    public final void n(int i, long j) {
        if (h1(10)) {
            rr2.l(i >= 0);
            b1(new lj0(j, this, i));
            v1(i, j);
        }
    }

    @Override // defpackage.rk2
    public final int n0() {
        return this.q.c.a.h;
    }

    public final void n1(lk3 lk3Var, final lk3 lk3Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        final int i = 0;
        tc2 tc2Var = this.i;
        if (num != null) {
            tc2Var.c(0, new qc2() { // from class: ol2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i2 = i;
                    Integer num5 = num;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i2) {
                        case 0:
                            oi3Var.I(lk3Var3.j, num5.intValue());
                            break;
                        case 1:
                            oi3Var.k(lk3Var3.d, lk3Var3.e, num5.intValue());
                            break;
                        default:
                            oi3Var.r(num5.intValue(), lk3Var3.v);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        if (num3 != null) {
            tc2Var.c(11, new qc2() { // from class: ol2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i3 = i2;
                    Integer num5 = num3;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i3) {
                        case 0:
                            oi3Var.I(lk3Var3.j, num5.intValue());
                            break;
                        case 1:
                            oi3Var.k(lk3Var3.d, lk3Var3.e, num5.intValue());
                            break;
                        default:
                            oi3Var.r(num5.intValue(), lk3Var3.v);
                            break;
                    }
                }
            });
        }
        gn2 gn2VarS = lk3Var2.s();
        final int i3 = 15;
        if (num4 != null) {
            tc2Var.c(1, new ef0(i3, gn2VarS, num4));
        }
        PlaybackException playbackException = lk3Var.a;
        PlaybackException playbackException2 = lk3Var2.a;
        final int i4 = 2;
        final int i5 = 10;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            tc2Var.c(10, new hj0(1, playbackException2));
            if (playbackException2 != null) {
                tc2Var.c(10, new hj0(2, playbackException2));
            }
        }
        final int i6 = 18;
        if (!lk3Var.F.equals(lk3Var2.F)) {
            tc2Var.c(2, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i7 = i6;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i7) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i7 = 19;
        if (!lk3Var.B.equals(lk3Var2.B)) {
            tc2Var.c(14, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i8 = i7;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i8) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i8 = 20;
        final int i9 = 3;
        if (lk3Var.y != lk3Var2.y) {
            tc2Var.c(3, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i10 = i8;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i10) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i10 = 21;
        final int i11 = 4;
        if (lk3Var.A != lk3Var2.A) {
            tc2Var.c(4, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i12 = i10;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i12) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i12 = 5;
        if (num2 != null) {
            tc2Var.c(5, new qc2() { // from class: ol2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i13 = i4;
                    Integer num5 = num2;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i13) {
                        case 0:
                            oi3Var.I(lk3Var3.j, num5.intValue());
                            break;
                        case 1:
                            oi3Var.k(lk3Var3.d, lk3Var3.e, num5.intValue());
                            break;
                        default:
                            oi3Var.r(num5.intValue(), lk3Var3.v);
                            break;
                    }
                }
            });
        }
        final int i13 = 6;
        if (lk3Var.z != lk3Var2.z) {
            tc2Var.c(6, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i14 = i;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i14) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i14 = 7;
        if (lk3Var.x != lk3Var2.x) {
            tc2Var.c(7, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i15 = i2;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i15) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i15 = 12;
        if (!lk3Var.g.equals(lk3Var2.g)) {
            tc2Var.c(12, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i16 = i4;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i16) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i16 = 8;
        if (lk3Var.h != lk3Var2.h) {
            tc2Var.c(8, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i17 = i9;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i17) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i17 = 9;
        if (lk3Var.i != lk3Var2.i) {
            tc2Var.c(9, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i11;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.m.equals(lk3Var2.m)) {
            tc2Var.c(15, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i12;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (lk3Var.n != lk3Var2.n) {
            tc2Var.c(22, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i13;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.q.equals(lk3Var2.q)) {
            tc2Var.c(20, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i14;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (lk3Var.p != lk3Var2.p) {
            tc2Var.c(21, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i16;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.r.a.equals(lk3Var2.r.a)) {
            tc2Var.c(27, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i17;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
            tc2Var.c(27, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i18 = i5;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i18) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.s.equals(lk3Var2.s)) {
            final int i18 = 11;
            tc2Var.c(29, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i19 = i18;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i19) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (lk3Var.t != lk3Var2.t || lk3Var.u != lk3Var2.u) {
            tc2Var.c(30, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i19 = i15;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i19) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.l.equals(lk3Var2.l)) {
            final int i19 = 13;
            tc2Var.c(25, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i110 = i19;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i110) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i20 = 16;
        if (lk3Var.C != lk3Var2.C) {
            final int i21 = 14;
            tc2Var.c(16, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i110 = i21;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i110) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        final int i22 = 17;
        if (lk3Var.D != lk3Var2.D) {
            tc2Var.c(17, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i110 = i3;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i110) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (lk3Var.E != lk3Var2.E) {
            tc2Var.c(18, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i110 = i20;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i110) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.G.equals(lk3Var2.G)) {
            tc2Var.c(19, new qc2() { // from class: pl2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i110 = i22;
                    lk3 lk3Var3 = lk3Var2;
                    oi3 oi3Var = (oi3) obj;
                    switch (i110) {
                        case 0:
                            oi3Var.g(lk3Var3.z);
                            break;
                        case 1:
                            oi3Var.V(lk3Var3.x);
                            break;
                        case 2:
                            oi3Var.N(lk3Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.f(lk3Var3.h);
                            break;
                        case 4:
                            oi3Var.x(lk3Var3.i);
                            break;
                        case 5:
                            oi3Var.G(lk3Var3.m);
                            break;
                        case 6:
                            oi3Var.s(lk3Var3.n);
                            break;
                        case 7:
                            oi3Var.n(lk3Var3.q);
                            break;
                        case 8:
                            oi3Var.b(lk3Var3.p);
                            break;
                        case 9:
                            oi3Var.K(lk3Var3.r.a);
                            break;
                        case 10:
                            oi3Var.e(lk3Var3.r);
                            break;
                        case 11:
                            oi3Var.Q(lk3Var3.s);
                            break;
                        case 12:
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case 13:
                            oi3Var.a(lk3Var3.l);
                            break;
                        case 14:
                            oi3Var.E(lk3Var3.C);
                            break;
                        case 15:
                            oi3Var.H(lk3Var3.D);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.R(lk3Var3.E);
                            break;
                        case 17:
                            oi3Var.o(lk3Var3.G);
                            break;
                        case 18:
                            oi3Var.A(lk3Var3.F);
                            break;
                        case 19:
                            oi3Var.F(lk3Var3.B);
                            break;
                        case 20:
                            oi3Var.q(lk3Var3.y);
                            break;
                        default:
                            oi3Var.v(lk3Var3.A);
                            break;
                    }
                }
            });
        }
        tc2Var.b();
    }

    @Override // defpackage.rk2
    public final mi3 o() {
        return this.z;
    }

    @Override // defpackage.rk2
    public final int o0() {
        return e1(this.q);
    }

    public final void o1(lk3 lk3Var, jk3 jk3Var) {
        if (Y()) {
            cb4 cb4Var = this.n;
            cb4Var.getClass();
            boolean z = cb4Var.a.f() < 6;
            lk3 lk3Var2 = this.H;
            if (lk3Var2 != null) {
                mi3 mi3Var = this.z;
                cb4 cb4Var2 = this.n;
                cb4Var2.getClass();
                this.H = ju2.e(lk3Var2, lk3Var, jk3Var, mi3Var, z, cb4Var2);
                if (!this.k.isEmpty()) {
                    return;
                }
                lk3Var = this.H;
                jk3Var = jk3.c;
                this.H = null;
            }
            lk3 lk3Var3 = lk3Var;
            jk3 jk3Var2 = jk3Var;
            lk3 lk3Var4 = this.q;
            mi3 mi3Var2 = this.z;
            cb4 cb4Var3 = this.n;
            cb4Var3.getClass();
            lk3 lk3VarE = ju2.e(lk3Var4, lk3Var3, jk3Var2, mi3Var2, z, cb4Var3);
            this.q = lk3VarE;
            Integer numValueOf = (lk3Var4.d.equals(lk3Var3.d) && lk3Var4.e.equals(lk3Var3.e)) ? null : Integer.valueOf(lk3VarE.f);
            Integer numValueOf2 = !Objects.equals(lk3Var4.s(), lk3VarE.s()) ? Integer.valueOf(lk3VarE.b) : null;
            Integer numValueOf3 = !lk3Var4.j.equals(lk3VarE.j) ? Integer.valueOf(lk3VarE.k) : null;
            int i = lk3Var4.w;
            int i2 = lk3VarE.w;
            n1(lk3Var4, lk3VarE, numValueOf3, (i == i2 && lk3Var4.v == lk3VarE.v) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    @Override // defpackage.rk2
    public final void p(final gn2 gn2Var, final long j) {
        if (h1(31)) {
            b1(new xl2() { // from class: el2
                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i) {
                    pu1Var.l(this.n.c, i, gn2Var.c(true), j);
                }
            });
            x1(Collections.singletonList(gn2Var), -1, j, false);
        }
    }

    @Override // defpackage.rk2
    public final void p0(int i) {
        if (h1(15)) {
            b1(new kl2(this, i, 0));
            lk3 lk3Var = this.q;
            if (lk3Var.h != i) {
                this.q = lk3Var.i(i);
                ij0 ij0Var = new ij0(i, 4);
                tc2 tc2Var = this.i;
                tc2Var.c(8, ij0Var);
                tc2Var.b();
            }
        }
    }

    public final void p1(int i, int i2) {
        pf4 pf4Var = this.C;
        if (pf4Var.a == i && pf4Var.b == i2) {
            return;
        }
        this.C = new pf4(i, i2);
        this.i.f(24, new v31(i, i2, 1));
    }

    @Override // defpackage.rk2
    public final boolean q() {
        return this.q.v;
    }

    @Override // defpackage.rk2
    public final void q0(boolean z) {
        if (h1(26)) {
            b1(new jl2(this, z, 3));
            lk3 lk3Var = this.q;
            if (lk3Var.u != z) {
                this.q = lk3Var.c(lk3Var.t, z);
                jl2 jl2Var = new jl2(this, z, 4);
                tc2 tc2Var = this.i;
                tc2Var.c(30, jl2Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void r() {
        if (h1(20)) {
            b1(new cl2(this, 10));
            r1(0, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.rk2
    public final void r0(oi3 oi3Var) {
        this.i.e(oi3Var);
    }

    public final void r1(int i, int i2) {
        int iO = this.q.j.o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin || iO == 0) {
            return;
        }
        boolean z = e1(this.q) >= i && e1(this.q) < iMin;
        lk3 lk3VarJ1 = j1(this.q, i, iMin, false, M0(), Z());
        int i3 = this.q.c.a.b;
        A1(lk3VarJ1, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    @Override // defpackage.rk2
    public final void s(boolean z) {
        if (h1(14)) {
            b1(new jl2(this, z, 2));
            lk3 lk3Var = this.q;
            if (lk3Var.i != z) {
                this.q = lk3Var.k(z);
                t31 t31Var = new t31(2, z);
                tc2 tc2Var = this.i;
                tc2Var.c(9, t31Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final void s0(gn2 gn2Var) {
        if (h1(31)) {
            b1(new gl2(this, gn2Var, 1));
            x1(Collections.singletonList(gn2Var), -1, -9223372036854775807L, true);
        }
    }

    public final void s1(int i, int i2, List list) {
        int iO = this.q.j.o();
        if (i > iO) {
            return;
        }
        if (this.q.j.p()) {
            x1(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iO);
        lk3 lk3VarJ1 = j1(i1(this.q, iMin, list, M0(), Z()), i, iMin, true, M0(), Z());
        int i3 = this.q.c.a.b;
        boolean z = i3 >= i && i3 < iMin;
        A1(lk3VarJ1, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // defpackage.rk2
    public final void stop() {
        if (h1(3)) {
            b1(new cl2(this, 5));
            lk3 lk3Var = this.q;
            za4 za4Var = this.q.c;
            pi3 pi3Var = za4Var.a;
            boolean z = za4Var.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            za4 za4Var2 = this.q.c;
            long j = za4Var2.d;
            long j2 = za4Var2.a.f;
            int iB = ju2.b(j2, j);
            za4 za4Var3 = this.q.c;
            lk3 lk3VarJ = lk3Var.j(new za4(pi3Var, z, jElapsedRealtime, j, j2, iB, 0L, za4Var3.h, za4Var3.i, za4Var3.a.f));
            this.q = lk3VarJ;
            if (lk3VarJ.A != 1) {
                this.q = lk3VarJ.f(1, lk3VarJ.a);
                er1 er1Var = new er1(19);
                tc2 tc2Var = this.i;
                tc2Var.c(4, er1Var);
                tc2Var.b();
            }
        }
    }

    @Override // defpackage.rk2
    public final int t() {
        return this.q.c.f;
    }

    @Override // defpackage.rk2
    public final void t0(int i, int i2) {
        if (h1(20)) {
            rr2.l(i >= 0 && i2 >= 0);
            b1(new nl2(this, i, i2, 2));
            m1(i, i + 1, i2);
        }
    }

    @Override // defpackage.rk2
    public final long u() {
        return this.q.E;
    }

    @Override // defpackage.rk2
    public final void u0(final int i, final int i2, final int i3) {
        if (h1(20)) {
            rr2.l(i >= 0 && i <= i2 && i3 >= 0);
            b1(new xl2() { // from class: ul2
                @Override // defpackage.xl2
                public final void d(pu1 pu1Var, int i4) {
                    pu1Var.E0(this.n.c, i4, i, i2, i3);
                }
            });
            m1(i, i2, i3);
        }
    }

    @Override // defpackage.rk2
    public final void v(oi3 oi3Var) {
        this.i.a(oi3Var);
    }

    @Override // defpackage.rk2
    public final int v0() {
        return this.q.z;
    }

    public final void v1(int i, long j) {
        int i2;
        int i3;
        lk3 lk3VarL1;
        cu4 cu4Var = this.q.j;
        if ((cu4Var.p() || i < cu4Var.o()) && !k()) {
            lk3 lk3Var = this.q;
            lk3 lk3VarF = lk3Var.f(lk3Var.A == 1 ? 1 : 2, lk3Var.a);
            dd2 dd2VarG1 = g1(i, j, cu4Var);
            if (dd2VarG1 == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                pi3 pi3Var = new pi3(null, i, null, null, i, j3, j2, -1, -1);
                lk3 lk3Var2 = this.q;
                cu4 cu4Var2 = lk3Var2.j;
                boolean z = this.q.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                za4 za4Var = this.q.c;
                lk3VarL1 = l1(lk3Var2, cu4Var2, pi3Var, new za4(pi3Var, z, jElapsedRealtime, za4Var.d, j == -9223372036854775807L ? 0L : j, 0, 0L, za4Var.h, za4Var.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                za4 za4Var2 = lk3VarF.c;
                pi3 pi3Var2 = za4Var2.a;
                pi3 pi3Var3 = za4Var2.a;
                int i4 = pi3Var2.e;
                int i5 = dd2VarG1.a;
                zt4 zt4Var = new zt4();
                cu4Var.f(i4, zt4Var, false);
                zt4 zt4Var2 = new zt4();
                cu4Var.f(i5, zt4Var2, false);
                boolean z2 = i4 != i5;
                long j4 = dd2VarG1.b;
                long jQ = f35.Q(M0()) - zt4Var.e;
                if (z2 || j4 != jQ) {
                    rr2.w(pi3Var3.h == -1);
                    pi3 pi3Var4 = new pi3(null, zt4Var.c, pi3Var3.c, null, i4, f35.i0(zt4Var.e + jQ), f35.i0(zt4Var.e + jQ), -1, -1);
                    cu4Var.f(i5, zt4Var2, false);
                    bu4 bu4Var = new bu4();
                    cu4Var.n(zt4Var2.c, bu4Var);
                    long jI0 = f35.i0(zt4Var2.e + j4);
                    pi3 pi3Var5 = new pi3(null, zt4Var2.c, bu4Var.b, null, i5, jI0, jI0, -1, -1);
                    lk3 lk3VarH = lk3VarF.h(pi3Var4, pi3Var5, 1);
                    if (z2 || j4 < jQ) {
                        lk3VarF = lk3VarH.j(new za4(pi3Var5, false, SystemClock.elapsedRealtime(), f35.i0(bu4Var.l), jI0, ju2.b(jI0, f35.i0(bu4Var.l)), 0L, -9223372036854775807L, -9223372036854775807L, jI0));
                    } else {
                        long jMax = Math.max(0L, f35.Q(lk3VarH.c.g) - (j4 - jQ));
                        long jI1 = f35.i0(zt4Var2.e + j4 + jMax);
                        lk3VarF = lk3VarH.j(new za4(pi3Var5, false, SystemClock.elapsedRealtime(), f35.i0(bu4Var.l), jI1, ju2.b(jI1, f35.i0(bu4Var.l)), f35.i0(jMax), -9223372036854775807L, -9223372036854775807L, jI1));
                    }
                }
                lk3VarL1 = lk3VarF;
            }
            za4 za4Var3 = lk3VarL1.c;
            int i6 = (this.q.j.p() || za4Var3.a.b == this.q.c.a.b) ? 0 : i2;
            if (i6 == 0 && za4Var3.a.f == this.q.c.a.f) {
                return;
            }
            A1(lk3VarL1, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.rk2
    public final int w() {
        if (this.q.j.p()) {
            return -1;
        }
        lk3 lk3Var = this.q;
        cu4 cu4Var = lk3Var.j;
        int iE1 = e1(lk3Var);
        lk3 lk3Var2 = this.q;
        int i = lk3Var2.h;
        if (i == 1) {
            i = 0;
        }
        return cu4Var.k(iE1, i, lk3Var2.i);
    }

    @Override // defpackage.rk2
    public final void w0(List list) {
        if (h1(20)) {
            b1(new fl2(this, list, 1));
            W0(list, this.q.j.o());
        }
    }

    public final void w1(long j) {
        long jM0 = M0() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jM0 = Math.min(jM0, duration);
        }
        v1(e1(this.q), Math.max(jM0, 0L));
    }

    @Override // defpackage.rk2
    public final long x() {
        return this.q.c.i;
    }

    @Override // defpackage.rk2
    public final cu4 x0() {
        return this.q.j;
    }

    public final void x1(List list, int i, long j, boolean z) {
        int iA;
        boolean z2;
        long j2;
        pi3 pi3Var;
        za4 za4Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            gn2 gn2Var = (gn2) list.get(i2);
            jx1 jx1Var = f92.a;
            bu4 bu4Var = new bu4();
            int i3 = i2;
            bu4Var.b(0, gn2Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i3, i3, 0L);
            arrayList.add(bu4Var);
            zt4 zt4Var = new zt4();
            zt4Var.i(null, null, i3, -9223372036854775807L, 0L, z5.f, true);
            arrayList2.add(zt4Var);
            i2 = i3 + 1;
        }
        au4 au4VarZ0 = Z0(arrayList, arrayList2);
        yw1 yw1Var = au4VarZ0.e;
        if (!au4VarZ0.p() && i >= yw1Var.size()) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iA = au4VarZ0.p() ? 0 : au4VarZ0.a(this.q.i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            pi3 pi3Var2 = this.q.c.a;
            int i4 = pi3Var2.b;
            long j3 = pi3Var2.f;
            if (au4VarZ0.p() || i4 < yw1Var.size()) {
                z2 = false;
                j2 = j3;
                iA = i4;
            } else {
                iA = au4VarZ0.a(this.q.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iA = i;
            z2 = false;
            j2 = j;
        }
        dd2 dd2VarG1 = g1(iA, j2, au4VarZ0);
        if (dd2VarG1 == null) {
            pi3Var = new pi3(null, iA, null, null, iA, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            za4Var = new za4(pi3Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = dd2VarG1.b;
            pi3Var = new pi3(null, iA, (gn2) list.get(iA), null, dd2VarG1.a, f35.i0(j4), f35.i0(j4), -1, -1);
            za4Var = new za4(pi3Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, f35.i0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, f35.i0(j4));
        }
        lk3 lk3VarL1 = l1(this.q, au4VarZ0, pi3Var, za4Var, 4);
        int i5 = lk3VarL1.A;
        if (iA != -1 && i5 != 1) {
            i5 = (au4VarZ0.p() || z2) ? 4 : 2;
        }
        lk3 lk3VarF = lk3VarL1.f(i5, this.q.a);
        A1(lk3VarF, 0, null, !this.q.j.p() ? 4 : null, (this.q.j.p() && lk3VarF.j.p()) ? null : 3);
    }

    @Override // defpackage.rk2
    public final int y() {
        return this.q.c.a.e;
    }

    @Override // defpackage.rk2
    public final boolean y0() {
        return this.q.u;
    }

    public final void y1(boolean z) {
        lk3 lk3Var = this.q;
        int i = lk3Var.z;
        int i2 = i == 1 ? 0 : i;
        if (lk3Var.v == z && i == i2) {
            return;
        }
        this.F = ju2.c(lk3Var, this.F, this.G, f1().g);
        this.G = SystemClock.elapsedRealtime();
        A1(this.q.d(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.rk2
    public final s55 z() {
        return this.q.l;
    }

    @Override // defpackage.rk2
    public final void z0(int i, gn2 gn2Var) {
        if (h1(20)) {
            rr2.l(i >= 0);
            b1(new vl2(this, i, gn2Var, 1));
            s1(i, i + 1, yw1.o(gn2Var));
        }
    }

    public final void z1(Surface surface, int i, int i2) {
        if (Y()) {
            cb4 cb4Var = this.n;
            cb4Var.getClass();
            if (cb4Var.a.f() >= 8) {
                c1(new hl2(this, surface, i, i2, 1));
            } else {
                c1(new ef0(12, this, surface));
            }
        }
    }
}
