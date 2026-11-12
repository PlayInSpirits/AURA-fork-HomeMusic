package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.LegacyConversions$ConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class im2 implements rk2 {
    public final Context a;
    public final sk2 b;
    public final cb4 c;
    public final tc2 d;
    public final gm2 e;
    public final xs f;
    public final Bundle g;
    public final long h;
    public wo0 i;
    public jj2 j;
    public boolean k;
    public boolean l;
    public hm2 m;
    public hm2 n;
    public boolean o;
    public ml3 p;
    public long q;
    public long r;

    public im2(Context r4, sk2 r5, cb4 r6, Bundle r7, Looper r8, xs r9) {
        this.m = new hm2();
        this.n = new hm2();
        this.p = new ml3(12);
        em2 r1 = new em2(this);
        this.d = new tc2(r8, vp4.a, r1);
        this.a = r4;
        this.b = r5;
        this.e = new gm2(this, r8);
        this.c = r6;
        this.g = r7;
        this.f = r9;
        this.h = 100;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        gy3 r3 = gy3.r;
    }

    public static List X0(ArrayList r4) {
        if (r4 == null) goto L4;
        hd5 r0 = ju2.a;
        ArrayList r1 = new ArrayList();
        int r2 = r4.size();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L10;
        Object r5 = r4.get(r3);
        r3 = r3 + 1;
        if (r5 == null) goto L6;
        r1.add(r5);
        goto L6
    L10:
        return r1;
    L4:
        return Collections.EMPTY_LIST;
    }

    public static ei3 Y0(ei3 r20) {
        if (r20 != null) goto L7;
        return null;
    L7:
        if (r20.q > 0.0f) goto L13;
        l93.q0("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList r1 = new ArrayList();
        long r7 = r20.p;
        long r10 = r20.r;
        int r12 = r20.s;
        CharSequence r13 = r20.t;
        List r2 = r20.v;
        if (r2 == null) goto L11;
        r1.addAll(r2);
    L11:
        long r3 = r20.w;
        Bundle r4 = r20.x;
        return new ei3(r20.n, r20.o, r7, 1.0f, r10, r12, r13, r20.u, r1, r3, r4);
    L13:
        return r20;
    }

    public static pi3 Z0(int r12, gn2 r13, long r14, boolean r16) {
        if (r16 == false) goto L5;
        int r10 = 0;
    L6:
        if (r16 == false) goto L8;
        int r11 = 0;
    L10:
        return new pi3(null, r12, r13, null, r12, r14, r14, r10, r11);
    L8:
        r11 = -1;
        goto L10
    L5:
        r10 = -1;
        goto L6
    }

    @Override // defpackage.rk2
    public final void A() {
        ((MediaController.TransportControls) this.i.A().o).skipToPrevious();
    }

    @Override // defpackage.rk2
    public final void A0() {
        l93.q0("MCImplLegacy", "Session doesn't support muting the player");
    }

    @Override // defpackage.rk2
    public final float B() {
        return 1.0f;
    }

    @Override // defpackage.rk2
    public final void B0(gn2 r1) {
        s0(r1);
    }

    @Override // defpackage.rk2
    public final void C() {
        f1(o0(), 0);
    }

    @Override // defpackage.rk2
    public final void C0() {
        J(1);
    }

    @Override // defpackage.rk2
    public final il D() {
        return ((lk3) this.p.a).q;
    }

    @Override // defpackage.rk2
    public final boolean D0() {
        return ((lk3) this.p.a).i;
    }

    @Override // defpackage.rk2
    public final void E(int r9, boolean r10) {
        if (r10 == y0()) goto L5;
        int r0 = j();
        lk3 r2 = ((lk3) this.p.a).c(r0, r10);
        ml3 r1 = this.p;
        h1(new ml3(r2, (wa4) r1.b, (mi3) r1.c, (yw1) r1.d, (Bundle) r1.e, null), null, null);
    L5:
        if (r10 == false) goto L7;
        int r11 = -100;
    L8:
        ((xk2) this.i.n).a.adjustVolume(r11, r9);
        return;
    L7:
        r11 = 100;
        goto L8
    }

    @Override // defpackage.rk2
    public final cw4 E0() {
        return cw4.J;
    }

    @Override // defpackage.rk2
    public final hp0 F() {
        return ((lk3) this.p.a).s;
    }

    @Override // defpackage.rk2
    public final long F0() {
        return b0();
    }

    @Override // defpackage.rk2
    public final void G() {
        d0(1);
    }

    @Override // defpackage.rk2
    public final void G0(int r2) {
        H(r2, 1);
    }

    @Override // defpackage.rk2
    public final void H(int r9, int r10) {
        hp0 r0 = F();
        int r1 = r0.b;
        int r2 = r0.c;
        if (r1 > r9) goto L7;
        if (r2 == 0) goto L6;
        if (r9 > r2) goto L7;
    L6:
        boolean r3 = y0();
        lk3 r4 = ((lk3) this.p.a).c(r9, r3);
        ml3 r5 = this.p;
        h1(new ml3(r4, (wa4) r5.b, (mi3) r5.c, (yw1) r5.d, (Bundle) r5.e, null), null, null);
    L7:
        ((xk2) this.i.n).a.setVolumeTo(r9, r10);
    }

    @Override // defpackage.rk2
    public final void H0() {
        ((MediaController.TransportControls) this.i.A().o).skipToNext();
    }

    @Override // defpackage.rk2
    public final boolean I() {
        return this.l;
    }

    @Override // defpackage.rk2
    public final void I0() {
        ((MediaController.TransportControls) this.i.A().o).fastForward();
    }

    @Override // defpackage.rk2
    public final void J(int r11) {
        int r0 = j();
        int r1 = F().c;
        if (r1 != 0) goto L5;
    L6:
        boolean r2 = y0();
        lk3 r4 = ((lk3) this.p.a).c(r0 + 1, r2);
        ml3 r3 = this.p;
        h1(new ml3(r4, (wa4) r3.b, (mi3) r3.c, (yw1) r3.d, (Bundle) r3.e, null), null, null);
    L7:
        ((xk2) this.i.n).a.adjustVolume(1, r11);
        return;
    L5:
        if ((r0 + 1) > r1) goto L7;
        goto L6
    }

    @Override // defpackage.rk2
    public final void J0() {
        ((MediaController.TransportControls) this.i.A().o).rewind();
    }

    @Override // defpackage.rk2
    public final int K() {
        return -1;
    }

    @Override // defpackage.rk2
    public final do2 K0() {
        gn2 r0 = ((lk3) this.p.a).s();
        if (r0 != null) goto L7;
        return do2.K;
    L7:
        return r0.d;
    }

    @Override // defpackage.rk2
    public final void L(int r2, int r3, List r4) {
        if (r2 < 0) goto L5;
        if (r2 > r3) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        int r1 = ((xs3) ((lk3) this.p.a).j).o();
        if (r2 <= r1) goto L9;
        return;
    L9:
        int r5 = Math.min(r3, r1);
        N0(r4, r5);
        P(r2, r5);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.rk2
    public final void L0(List r4) {
        T(r4, 0, -9223372036854775807L);
    }

    @Override // defpackage.rk2
    public final void M(cw4 r1) {
    }

    @Override // defpackage.rk2
    public final long M0() {
        long r0 = ju2.c((lk3) this.p.a, this.q, this.r, a1().g);
        this.q = r0;
        return r0;
    }

    @Override // defpackage.rk2
    public final void N(int r2) {
        P(r2, r2 + 1);
    }

    @Override // defpackage.rk2
    public final void N0(List r11, int r12) {
        if (r12 < 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        if (r11.isEmpty() == true) goto L22;
        xs3 r2 = (xs3) ((lk3) this.p.a).j;
        if (r2.p() == false) goto L13;
        T(r11, 0, -9223372036854775807L);
        return;
    L13:
        int r13 = Math.min(r12, x0().o());
        xs3 r0 = r2.q(r11, r13);
        int r3 = o0();
        int r4 = r11.size();
        if (r3 < r13) goto L17;
        r3 = r3 + r4;
    L17:
        lk3 r5 = ((lk3) this.p.a).m(r0, r3);
        ml3 r6 = this.p;
        h1(new ml3(r5, (wa4) r6.b, (mi3) r6.c, (yw1) r6.d, (Bundle) r6.e, null), null, null);
        if (d1() == false) goto L21;
        W0(r11, r13);
        return;
    L21:
        return;
    L22:
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.rk2
    public final void O(long r2) {
        f1(o0(), r2);
    }

    @Override // defpackage.rk2
    public final long O0() {
        return ((lk3) this.p.a).C;
    }

    @Override // defpackage.rk2
    public final void P(int r13, int r14) {
        if (r13 < 0) goto L6;
        if (r14 < r13) goto L6;
        boolean r2 = true;
    L7:
        rr2.l(r2);
        int r3 = x0().o();
        int r15 = Math.min(r14, r3);
        if (r13 >= r3) goto L25;
        if (r13 == r15) goto L29;
        xs3 r4 = (xs3) ((lk3) this.p.a).j;
        r4.getClass();
        uw1 r5 = new uw1(4);
        yw1 r6 = r4.e;
        r5.d(r6.r(0, r13));
        r5.d(r6.r(r15, r6.size()));
        xs3 r7 = new xs3(r5.f(), r4.f);
        int r8 = o0();
        int r9 = r15 - r13;
        if (r8 < r13) goto L17;
        if (r8 >= r15) goto L16;
        r8 = -1;
        goto L17
    L16:
        r8 = r8 - r9;
    L17:
        if (r8 != (-1)) goto L19;
        r8 = f35.j(r13, 0, r7.o() - 1);
        l93.q0("MCImplLegacy", "Currently playing item is removed. Assumes item at " + r8 + " is the new current item");
    L19:
        lk3 r10 = ((lk3) this.p.a).m(r7, r8);
        ml3 r0 = this.p;
        h1(new ml3(r10, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
        if (d1() == false) goto L28;
    L21:
        if (r13 >= r15) goto L30;
        if (r13 >= this.m.a.size()) goto L31;
        this.i.I(((or2) this.m.a.get(r13)).n);
        r13 = r13 + 1;
        goto L21
    L31:
        return;
    L30:
        return;
    L28:
        return;
    L29:
        return;
    L25:
        return;
    L6:
        r2 = false;
        goto L7
    }

    @Override // defpackage.rk2
    public wa4 P0() {
        return (wa4) this.p.b;
    }

    @Override // defpackage.rk2
    public final void Q(SurfaceHolder r1) {
        l93.q0("MCImplLegacy", "Session doesn't support setting SurfaceHolder");
    }

    @Override // defpackage.rk2
    public final yw1 Q0() {
        return (yw1) this.p.d;
    }

    @Override // defpackage.rk2
    public final void R(float r1) {
        l93.q0("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.rk2
    public final void R0() {
        cb4 r0 = this.c;
        if (r0.a.getType() != 0) goto L6;
        Object r1 = r0.a.c();
        r1.getClass();
        int r3 = 13;
        a1().a1(new ws1(r3, this, (pr2) r1));
        a1().f.postDelayed(new dm2(this, 0), 500);
        return;
    L6:
        a1().a1(new dm2(this, 1));
    }

    @Override // defpackage.rk2
    public final void S() {
        ((MediaController.TransportControls) this.i.A().o).skipToPrevious();
    }

    @Override // defpackage.rk2
    public final Bundle S0() {
        return this.g;
    }

    @Override // defpackage.rk2
    public final void T(List r26, int r27, long r28) {
        if (r26.isEmpty() == false) goto L6;
        r();
        return;
    L6:
        xs3 r1 = xs3.g.q(r26, 0);
        if (r28 != (-9223372036854775807L)) goto L9;
        long r4 = 0;
    L10:
        lk3 r9 = ((lk3) this.p.a).n(r1, new za4(Z0(r27, (gn2) r26.get(r27), r4, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0), 0);
        ml3 r2 = this.p;
        h1(new ml3(r9, (wa4) r2.b, (mi3) r2.c, (yw1) r2.d, (Bundle) r2.e, null), null, null);
        if (d1() == false) goto L14;
        c1();
        return;
    L14:
        return;
    L9:
        r4 = r28;
        goto L10
    }

    @Override // defpackage.rk2
    public ic2 T0(va4 r3, Bundle r4) {
        Bundle r0 = r3.c;
        if (this.i == null) goto L14;
        if (r4.isEmpty() == false) goto L8;
        r4 = r0;
    L11:
        this.i.A().I(r3.b, r4);
        return new mw1(new ab4(0));
    L8:
        if (r0.isEmpty() == true) goto L11;
        Bundle r1 = new Bundle(r0);
        r1.putAll(r4);
        r4 = r1;
        goto L11
    L14:
        return new mw1(new ab4(-100));
    }

    @Override // defpackage.rk2
    public final PlaybackException U() {
        return ((lk3) this.p.a).a;
    }

    @Override // defpackage.rk2
    public final void U0(gn2 r2) {
        N0(Collections.singletonList(r2), Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final void V(boolean r10) {
        lk3 r1 = (lk3) this.p.a;
        if (r1.v == r10) goto L17;
        this.q = ju2.c(r1, this.q, this.r, a1().g);
        this.r = SystemClock.elapsedRealtime();
        lk3 r3 = ((lk3) this.p.a).d(1, 0, r10);
        ml3 r0 = this.p;
        h1(new ml3(r3, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
        if (d1() == true) goto L8;
        return;
    L8:
        if (((lk3) this.p.a).j.p() == true) goto L16;
        wo0 r9 = this.i;
        if (r10 == false) goto L13;
        ((MediaController.TransportControls) r9.A().o).play();
        return;
    L13:
        ((MediaController.TransportControls) r9.A().o).pause();
        return;
    L16:
        return;
    }

    @Override // defpackage.rk2
    public final void V0(List r1) {
        L0(r1);
    }

    @Override // defpackage.rk2
    public final void W(int r3) {
        f1(r3, 0);
    }

    public final void W0(List r9, int r10) {
        ArrayList r4 = new ArrayList();
        int r7 = 0;
        fm2 r0 = new fm2(this, new AtomicInteger(0), r9, r4, r10, 0);
    L4:
        if (r7 >= r9.size()) goto L10;
        byte[] r8 = ((gn2) r9.get(r7)).d.k;
        if (r8 != null) goto L8;
        r4.add(null);
        r0.run();
    L9:
        r7 = r7 + 1;
        goto L4
    L8:
        ic2 r11 = this.f.j(r8);
        r4.add(r11);
        Handler r12 = a1().f;
        Objects.requireNonNull(r12);
        r11.f(r0, new ym(r12, 1));
        goto L9
    }

    @Override // defpackage.rk2
    public final long X() {
        return ((lk3) this.p.a).D;
    }

    @Override // defpackage.rk2
    public final boolean Y() {
        return this.l;
    }

    @Override // defpackage.rk2
    public final long Z() {
        return M0();
    }

    @Override // defpackage.rk2
    public void a() {
        if (this.k == false) goto L5;
        return;
    L5:
        this.k = true;
        jj2 r0 = this.j;
        if (r0 == null) goto L8;
        r0.a();
        this.j = null;
    L8:
        wo0 r1 = this.i;
        if (r1 == null) goto L19;
        Set r2 = (Set) r1.o;
        gm2 r3 = this.e;
        if (r2.remove(r3) == true) goto L21;
        l93.q0("MediaControllerCompat", "the callback has never been registered");
    L15:
        r3.d.removeCallbacksAndMessages(null);
        this.i = null;
        goto L19
    L21:
        ((xk2) r1.n).b(r3);     // Catch: Throwable -> L16
        r3.d(null);
    L16:
        th = move-exception;
        r3.d(null);
        throw th;
    L19:
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.rk2
    public final void a0() {
        l93.q0("MCImplLegacy", "Session doesn't support unmuting the player");
    }

    public sk2 a1() {
        return this.b;
    }

    @Override // defpackage.rk2
    public final void b() {
        lk3 r0 = (lk3) this.p.a;
        if (r0.A == 1) goto L6;
        return;
    L6:
        if (r0.j.p() == false) goto L8;
        int r1 = 4;
    L9:
        lk3 r4 = r0.f(r1, null);
        ml3 r2 = this.p;
        h1(new ml3(r4, (wa4) r2.b, (mi3) r2.c, (yw1) r2.d, (Bundle) r2.e, null), null, null);
        if (((lk3) this.p.a).j.p() == true) goto L13;
        c1();
        return;
    L13:
        return;
    L8:
        r1 = 2;
        goto L9
    }

    @Override // defpackage.rk2
    public final long b0() {
        return ((lk3) this.p.a).c.e;
    }

    public final void b1(boolean r79, hm2 r80) {
        if (this.k == false) goto L5;
        return;
    L5:
        if (this.l == false) goto L472;
        hm2 r1 = this.m;
        ml3 r3 = this.p;
        String r4 = ((xk2) this.i.n).a.getPackageName();
        long r5 = ((xk2) this.i.n).a.getFlags();
        if (((xk2) this.i.n).e.a() == null) goto L10;
        boolean r7 = true;
    L11:
        int r10 = ((xk2) this.i.n).a.getRatingType();
        long r11 = a1().g;
        boolean r13 = this.o;
        eo2 r14 = (eo2) r1.f;
        ei3 r15 = (ei3) r1.e;
        List r8 = r1.a;
        if (r14 == null) goto L27;
        eo2 r9 = (eo2) r80.f;
        if (r9 == null) goto L27;
        long r18 = r5;
        if (r14.p == null) goto L28;
        Bitmap r6 = r9.b();
        if (r6 == null) goto L28;
        Bitmap r12 = r14.b();
        if (r12 == null) goto L28;
        if (r6.sameAs(r12) == false) goto L28;
        r9.p = r14.p;
    L28:
        List r16 = r80.a;
        Bundle r17 = (Bundle) r80.h;
        ei3 r19 = (ei3) r80.e;
        eo2 r110 = (eo2) r80.f;
        boolean r20 = r7;
        fg4 r21 = (fg4) r80.d;
        if (r8 == r16) goto L60;
        HashMap r111 = new HashMap();
        int r22 = 0;
    L32:
        if (r22 >= r8.size()) goto L38;
        or2 r112 = (or2) r8.get(r22);
        if (r112.n.r == null) goto L37;
        r111.put(Long.valueOf(r112.o), r112);
    L37:
        r22 = r22 + 1;
        r17 = r17;
        r21 = r21;
        goto L32
    L38:
        Bundle r113 = r17;
        fg4 r25 = r21;
        int r23 = 0;
    L40:
        if (r23 >= r16.size()) goto L59;
        or2 r24 = (or2) r16.get(r23);
        if (r24.n.r == null) goto L57;
        Bundle r26 = r113;
        or2 r114 = (or2) r111.get(Long.valueOf(r24.o));
        if (r114 == null) goto L56;
        pm2 r27 = r24.n;
        pm2 r115 = r114.n;
        r27.getClass();
        if (r115.s == null) goto L56;
        Bitmap r116 = r27.r;
        if (r116 == null) goto L56;
        int r28 = r23;
        Bitmap r29 = r115.r;
        if (r29 == null) goto L58;
        if (r116.sameAs(r29) == false) goto L58;
        r27.s = r115.s;
    L58:
        r23 = r28 + 1;
        r113 = r26;
    L56:
        r28 = r23;
        goto L58
    L57:
        r28 = r23;
        r26 = r113;
        goto L58
    L59:
        Bundle r30 = r113;
    L61:
        if (r8 == r16) goto L63;
        boolean r31 = true;
    L65:
        if (r31 == false) goto L75;
        xs3 r117 = xs3.g;
        uc5.f(4, "initialCapacity");
        Object[] r118 = new Object[4];
        int r32 = 0;
        int r119 = 0;
    L68:
        if (r119 >= r16.size()) goto L74;
        or2 r33 = (or2) r16.get(r119);
        jx1 r210 = f92.a;
        boolean r211 = r31;
        Bundle r34 = r30;
        ws3 r212 = new ws3(f92.j(r33.n), r33.o, -9223372036854775807L);
        int r35 = r32 + 1;
        int r36 = qw1.b(r118.length, r35);
        if (r36 <= r118.length) goto L73;
        r118 = Arrays.copyOf(r118, r36);
    L73:
        r118[r32] = r212;
        r119 = r119 + 1;
        r32 = r35;
        r31 = r211;
        r30 = r34;
        goto L68
    L74:
        boolean r213 = r31;
        Bundle r37 = r30;
        xs3 r38 = new xs3(yw1.i(r32, r118), null);
    L77:
        if (((eo2) r1.f) != r110) goto L81;
        if (r79 == true) goto L81;
        boolean r39 = false;
    L82:
        if (r15 != null) goto L84;
        long r120 = -1;
    L85:
        if (r19 != null) goto L87;
        long r40 = -1;
        long r310 = -1;
    L89:
        if (r120 != r40) goto L93;
        if (r79 == true) goto L93;
        boolean r121 = false;
    L94:
        long r311 = f92.d(r110);
        if (r39 == true) goto L98;
        if (r121 == true) goto L98;
        if (r213 == true) goto L98;
        lk3 r41 = (lk3) r3.a;
        int r42 = r41.c.a.b;
        do2 r67 = r41.B;
        String r214 = "MCImplLegacy";
    L158:
        if (r25 == null) goto L160;
        fg4 r43 = r25;
        int r44 = r43.c;
    L161:
        xk0 r45 = new xk0(2);
        if (r19 != null) goto L164;
        long r122 = 0;
        long r312 = 0;
    L165:
        if (r19 != null) goto L168;
    L166:
        boolean r123 = false;
    L172:
        if (f92.y(r122, 4) == false) goto L174;
        if (r123 == true) goto L174;
        long r313 = 4;
    L183:
        r45.b(1);
    L185:
        if (f92.y(r122, 16384) == false) goto L188;
        r45.b(2);
    L188:
        if (f92.y(r122, 32768) == false) goto L192;
        if (f92.y(r122, 1024) == false) goto L192;
    L199:
        r45.d(new int[]{31, 2});
    L201:
        if (f92.y(r122, 8) == false) goto L204;
        r45.b(11);
    L204:
        if (f92.y(r122, 64) == false) goto L207;
        r45.b(12);
    L207:
        if (f92.y(r122, 256) == false) goto L210;
        r45.d(new int[]{5, 4});
    L210:
        if (f92.y(r122, 32) == false) goto L213;
        r45.d(new int[]{9, 8});
    L213:
        if (f92.y(r122, 16) == false) goto L216;
        r45.d(new int[]{7, 6});
    L216:
        if (f92.y(r122, 4194304) == false) goto L219;
        r45.b(13);
    L219:
        if (f92.y(r122, 1) == false) goto L222;
        r45.b(3);
    L222:
        if (r44 != 1) goto L226;
        r45.d(new int[]{26, 34});
    L228:
        r45.d(new int[]{23, 17, 18, 16, 21, 32});
        if ((r18 & r313) == r312) goto L233;
        r45.b(20);
        if (f92.y(r122, 4096) == false) goto L233;
        r45.b(10);
    L233:
        if (r20 == true) goto L235;
    L240:
        mi3 r46 = new mi3(r45.f());
        CharSequence r2 = (CharSequence) r1.g;
        CharSequence r47 = (CharSequence) r80.g;
        if (r2 != r47) goto L244;
        do2 r48 = ((lk3) r3.a).m;
    L243:
        do2 r52 = r48;
        int r49 = f92.s(r80.b);
        boolean r50 = f92.u(r80.c);
        if (r15 != r19) goto L252;
        if (r13 == true) goto L252;
        wa4 r51 = (wa4) r3.b;
        yw1 r53 = (yw1) r3.d;
        int r124 = r49;
        boolean r125 = r50;
    L304:
        Context r54 = this.a;
        PlaybackException r55 = f92.o(r19, r54);
        if (r19 != null) goto L307;
    L306:
        xa4 r126 = null;
    L319:
        long r56 = f92.c(r19, r110, r11);
        long r410 = f92.b(r19, r110, r11);
        wa4 r127 = r51;
        yw1 r215 = r53;
        xa4 r216 = r126;
        int r411 = ju2.b(f92.b(r19, r110, r11), f92.d(r110));
        long r412 = f92.b(r19, r110, r11) - f92.c(r19, r110, r11);
        if (r110 != null) goto L323;
    L321:
        boolean r57 = false;
    L325:
        if (r19 != null) goto L327;
        qh3 r58 = qh3.d;
    L328:
        if (r43 != 0) goto L330;
        il r59 = il.i;
        fg4 r128 = r43;
    L331:
        if (r19 != null) goto L334;
    L332:
        boolean r61 = false;
    L337:
        if (r19 != null) goto L440;
    L338:
        r46 = r46;
    L339:
        int r60 = 1;
    L360:
        int r64 = r60;
        if (r19 != null) goto L366;
    L364:
        boolean r65 = false;
    L368:
        if (r128 != null) goto L372;
        hp0 r62 = hp0.e;
    L370:
        hp0 r510 = r62;
        if (r128 != null) goto L384;
        int r511 = 0;
    L385:
        if (r128 != null) goto L388;
    L386:
        boolean r63 = false;
    L390:
        lk3 r66 = (lk3) r3.a;
        long r129 = r66.C;
        long r130 = r66.D;
        long r131 = r66.E;
        Bundle r68 = (Bundle) r80.h;
        int r69 = r42;
        if (r69 < r38.o()) goto L393;
        gn2 r70 = null;
    L394:
        za4 r314 = new za4(Z0(r69, r70, r56, r57), r57, SystemClock.elapsedRealtime(), r311, r410, r411, r412, -9223372036854775807L, r311, r410);
        pi3 r413 = za4.k;
        qh3 r414 = r58;
        int r415 = r124;
        boolean r416 = r125;
        lk3 r315 = new lk3(r55, 0, r314, r413, r413, 0, r414, r415, r416, s55.d, r38, 0, r52, 1.0f, 1.0f, r59, 0, jg0.d, r510, r511, r63, r61, 1, 0, r64, r65, false, r67, r129, r130, r131, jw4.b, cw4.J);
        ml3 r71 = new ml3(r315, r127, r46, r215, r68, r216);
        hm2 r72 = this.m;
        ml3 r73 = this.p;
        long r74 = a1().g;
        Integer r132 = 3;
        boolean r133 = ((lk3) r73.a).j.p();
        boolean r134 = r38.p();
        if (r133 == false) goto L399;
        if (r134 == false) goto L399;
        Integer r75 = null;
        r132 = null;
    L398:
        boolean r135 = true;
    L431:
        Pair r76 = Pair.create(r75, r132);
        g1(r79, r80, true, r71, (Integer) r76.first, (Integer) r76.second);
        if (this.o == false) goto L471;
        this.o = false;
        sk2 r0 = a1();
        r0.getClass();
        if (Looper.myLooper() != r0.f.getLooper()) goto L436;
        boolean r77 = r135;
    L437:
        rr2.w(r77);
        r0.e.getClass();
        return;
    L436:
        r77 = false;
        goto L437
    L471:
        return;
    L399:
        if (r133 == false) goto L402;
        if (r134 == true) goto L402;
        r75 = 0;
    L402:
        gn2 r78 = ((lk3) r73.a).s();
        r78.getClass();
        ws3 r136 = r38.f;
        if (r136 != null) goto L405;
    L407:
        int r137 = 0;
    L408:
        yw1 r138 = r38.e;
        if (r137 >= r138.size()) goto L414;
        if (r78.equals(((ws3) r138.get(r137)).a) == true) goto L412;
        r137 = r137 + 1;
    L412:
        boolean r81 = true;
    L415:
        if (r81 == true) goto L418;
        r75 = 4;
        goto L398
    L418:
        if (r78.equals(r315.s()) == false) goto L430;
        long r82 = f92.c((ei3) r72.e, (eo2) r72.f, r74);
        long r83 = f92.c(r19, r110, r74);
        if (r83 != r312) goto L425;
        if (r415 != 1) goto L425;
        r75 = 0;
        Integer r217 = null;
    L429:
        r132 = r217;
    L425:
        if (Math.abs(r82 - r83) <= 100) goto L428;
        r75 = 5;
    L427:
        r217 = null;
        goto L429
    L428:
        r75 = null;
        goto L427
    L430:
        r135 = true;
        r132 = 1;
        r75 = 0;
        goto L431
    L414:
        r81 = false;
        goto L415
    L405:
        if (r78.equals(r136.a) == false) goto L407;
    L393:
        r70 = r38.s(r69).a;
        goto L394
    L388:
        if (r128.e != 0) goto L386;
        r63 = true;
        goto L390
    L384:
        r511 = r128.e;
        goto L385
    L372:
        if (r128.b != 2) goto L374;
        int r139 = 1;
    L375:
        x20 r84 = new x20(r139);
        r84.c = r128.d;
        String r140 = (String) r128.g;
        if (r139 != 0) goto L380;
        if (r140 == null) goto L380;
        boolean r141 = false;
    L381:
        rr2.l(r141);
        r84.d = r140;
        r62 = r84.b();
    L380:
        r141 = true;
        goto L381
    L374:
        r139 = 0;
        goto L375
    L366:
        if (r19.n != 3) goto L364;
        r65 = true;
        goto L368
    L440:
        int r142 = r19.n;     // Catch: LegacyConversions$ConversionException -> L361
        long r316 = f92.d(r110);     // Catch: LegacyConversions$ConversionException -> L361
        if (r316 != (-9223372036854775807L)) goto L344;
    L342:
        boolean r143 = false;
    L346:
        switch(r142) {
            case 0: goto L338;
            case 1: goto L357;
            case 2: goto L354;
            case 3: goto L352;
            case 4: goto L351;
            case 5: goto L351;
            case 6: goto L351;
            case 7: goto L338;
            case 8: goto L338;
            case 9: goto L351;
            case 10: goto L351;
            case 11: goto L351;
            default: goto L347;
        };     // Catch: LegacyConversions$ConversionException -> L361
    L347:
        throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + r142);     // Catch: LegacyConversions$ConversionException -> L439
        goto L362
    L351:
        r46 = r46;
        r60 = 2;
        goto L360
    L352:
        r46 = r46;
    L353:
        r60 = 3;
        goto L360
    L354:
        r46 = r46;
        if (r143 == false) goto L353;
    L356:
        r60 = 4;
        goto L360
    L357:
        r46 = r46;
        if (r143 == false) goto L339;
    L344:
        if (f92.c(r19, r110, r11) < r316) goto L342;
        r143 = true;
    L362:
        l93.F(r214, "Received invalid playback state " + r19.n + " from package " + r4 + ". Keeping the previous state.");
        r60 = ((lk3) r3.a).A;
        goto L360
    L334:
        switch(r19.n) {
            case 3: goto L336;
            case 4: goto L336;
            case 5: goto L336;
            case 6: goto L336;
            case 7: goto L332;
            case 8: goto L332;
            case 9: goto L336;
            case 10: goto L336;
            case 11: goto L336;
            default: goto L332;
        };
    L336:
        r61 = true;
        goto L337
    L330:
        r128 = r43;
        r59 = (il) r128.f;
        goto L331
    L327:
        r58 = new qh3(r19.q);
        goto L328
    L323:
        if (r110.a("android.media.metadata.ADVERTISEMENT") == r312) goto L321;
        r57 = true;
        goto L325
    L307:
        int r144 = r19.n;
        int r145 = r19.s;
        CharSequence r146 = r19.t;
        Bundle r147 = r19.x;
        if (r144 == 7) goto L306;
        if (r145 == 0) goto L306;
        int r148 = f92.t(r145);
        if (r146 == null) goto L314;
        String r85 = r146.toString();
    L315:
        if (r147 != null) goto L318;
        r147 = Bundle.EMPTY;
    L318:
        r126 = new xa4(r85, r148, r147);
        goto L319
    L314:
        r85 = f92.x(r54, r148);
    L252:
        HashSet r86 = new HashSet();
        gy3 r149 = va4.d;
        int r150 = 0;
    L254:
        if (r150 >= r149.q) goto L256;
        r86.add(new va4(((Integer) r149.get(r150)).intValue()));
        r150 = r150 + 1;
        goto L254
    L256:
        if (r20 == true) goto L263;
        Iterator r151 = r86.iterator();
    L259:
        if (r151.hasNext() == false) goto L263;
        va4 r152 = (va4) r151.next();
        if (r152.a != 40010) goto L259;
        r86.remove(r152);
    L263:
        if (r19 == null) goto L271;
        Iterator r153 = r19.v.iterator();
    L266:
        if (r153.hasNext() == false) goto L271;
        di3 r154 = (di3) r153.next();
        String r155 = r154.n;
        Bundle r156 = r154.q;
        if (r156 != null) goto L270;
        r156 = Bundle.EMPTY;
    L270:
        r86.add(new va4(r155, r156));
    L271:
        wa4 r157 = new wa4(r86);
        if (r19 != null) goto L274;
        vw1 r87 = yw1.o;
        r124 = r49;
        r125 = r50;
        r53 = gy3.r;
    L303:
        r51 = r157;
        goto L304
    L274:
        List r88 = r19.v;
        uc5.f(4, "initialCapacity");
        Object[] r158 = new Object[4];
        Iterator r89 = r88.iterator();
        int r90 = 0;
    L276:
        if (r89.hasNext() == false) goto L302;
        di3 r159 = (di3) r89.next();
        String r160 = r159.n;
        Bundle r161 = r159.q;
        if (r161 == null) goto L280;
        int r91 = r161.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
    L281:
        Iterator r218 = r89;
        i60 r92 = new i60(r91, r159.p);
        if (r161 != null) goto L284;
        Bundle r93 = Bundle.EMPTY;
    L285:
        r92.d(new va4(r160, r93));
        r92.f = r159.o;
        r92.h = true;
        if (r161 == null) goto L288;
        r92.g = new Bundle(r161);
    L288:
        if (r161 == null) goto L290;
        String r94 = r161.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
    L291:
        if (r94 == null) goto L297;
        Uri r95 = Uri.parse(r94);
        String r96 = r95.getScheme();
        if (Objects.equals(r96, "content") == false) goto L295;
    L296:
        r92.b(r95);
        goto L297
    L295:
        if (Objects.equals(r96, "android.resource") == true) goto L296;
    L297:
        j60 r97 = r92.a();
        int r98 = r90 + 1;
        int r99 = qw1.b(r158.length, r98);
        if (r99 <= r158.length) goto L301;
        r158 = Arrays.copyOf(r158, r99);
    L301:
        r158[r90] = r97;
        r90 = r98;
        r49 = r49;
        r50 = r50;
        r89 = r218;
        goto L276
    L290:
        r94 = null;
        goto L291
    L284:
        r93 = r161;
        goto L285
    L280:
        r91 = 0;
        goto L281
    L302:
        r124 = r49;
        r125 = r50;
        r53 = j60.k(yw1.i(r90, r158), r46, r37);
        goto L303
    L244:
        if (r47 != null) goto L246;
        r48 = do2.K;
        goto L243
    L246:
        co2 r100 = new co2();
        r100.a = r47;
        r48 = new do2(r100);
        goto L243
    L235:
        if (f92.y(r122, 262144) == false) goto L238;
        r45.b(15);
    L238:
        if (f92.y(r122, 2097152) == false) goto L240;
        r45.b(14);
        goto L240
    L226:
        if (r44 != 2) goto L228;
        r45.d(new int[]{26, 34, 25, 33});
    L192:
        if (f92.y(r122, 65536) == false) goto L196;
        if (f92.y(r122, 2048) == true) goto L199;
    L196:
        if (f92.y(r122, 131072) == false) goto L201;
        if (f92.y(r122, 8192) == false) goto L201;
    L174:
        r313 = 4;
        if (f92.y(r122, 2) == false) goto L181;
        if (r123 == true) goto L183;
    L181:
        if (f92.y(r122, 512) == false) goto L185;
    L168:
        switch(r19.n) {
            case 3: goto L170;
            case 4: goto L170;
            case 5: goto L170;
            case 6: goto L170;
            case 7: goto L166;
            case 8: goto L166;
            case 9: goto L170;
            case 10: goto L170;
            case 11: goto L170;
            default: goto L166;
        };
    L170:
        r123 = true;
        goto L172
    L164:
        r312 = 0;
        r122 = r19.r;
        goto L165
    L160:
        r43 = r25;
        r44 = 0;
    L98:
        boolean r219 = r39;
        if (r16 != null) goto L102;
    L111:
        r42 = -1;
    L112:
        if (r110 == null) goto L114;
        boolean r101 = true;
    L115:
        if (r101 == false) goto L118;
        if (r219 == false) goto L118;
        do2 r102 = f92.m(r110, r10);
    L125:
        yw1 r103 = r38.e;
        int r162 = -1;
        if (r42 != (-1)) goto L138;
        if (r219 == false) goto L137;
        if (r101 == false) goto L135;
        l93.q0("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
        CharSequence r104 = r110.n.getCharSequence("android.media.metadata.MEDIA_ID");
        if (r104 == null) goto L132;
        String r105 = r104.toString();
    L133:
        r38 = new xs3(r103, new ws3(f92.k(r105, r110, r10), -1, r311));
        r42 = r38.o() - 1;
    L134:
        r214 = "MCImplLegacy";
    L157:
        r67 = r102;
        goto L158
    L132:
        r105 = null;
        goto L133
    L135:
        r38 = new xs3(r103, null);
    L136:
        r214 = "MCImplLegacy";
        r42 = 0;
        goto L157
    L137:
        r162 = -1;
    L138:
        if (r42 == r162) goto L136;
        r38 = new xs3(r103, null);
        if (r101 == false) goto L134;
        if (r42 < r38.o()) goto L144;
        gn2 r106 = null;
    L145:
        r106.getClass();
        gn2 r317 = f92.k(r106.a, r110, r10);
        yw1 r107 = r38.e;
        int r108 = r107.size();
        ws3 r109 = r38.f;
        if (r42 >= r108) goto L148;
    L152:
        boolean r163 = true;
    L153:
        rr2.l(r163);
        if (r42 != r107.size()) goto L156;
        r38 = new xs3(r107, new ws3(r317, -1, r311));
        goto L134
    L156:
        long r164 = ((ws3) r107.get(r42)).b;
        uw1 r165 = new uw1(4);
        r214 = "MCImplLegacy";
        r165.d(r107.r(0, r42));
        r165.c(new ws3(r317, r164, r311));
        r165.d(r107.r(r42 + 1, r107.size()));
        r38 = new xs3(r165.f(), r109);
        goto L157
    L148:
        if (r42 != r107.size()) goto L151;
        if (r109 != null) goto L152;
    L151:
        r163 = false;
        goto L153
    L144:
        r106 = r38.s(r42).a;
    L118:
        if (r101 == true) goto L124;
        if (r121 == false) goto L124;
        if (r42 != (-1)) goto L123;
        r102 = do2.K;
        goto L125
    L123:
        r102 = f92.l(((or2) r16.get(r42)).n, r10);
    L124:
        r102 = ((lk3) r3.a).B;
        goto L125
    L114:
        r101 = false;
        goto L115
    L102:
        if (r40 == r310) goto L111;
        long r318 = r40;
        r42 = 0;
    L106:
        if (r42 >= r16.size()) goto L111;
        if (((or2) r16.get(r42)).o == r318) goto L112;
        r42 = r42 + 1;
    L93:
        r121 = true;
        goto L94
    L87:
        r310 = -1;
        r40 = r19.w;
        goto L89
    L84:
        r120 = r15.w;
    L81:
        r39 = true;
        goto L82
    L75:
        r213 = r31;
        r37 = r30;
        xs3 r166 = (xs3) ((lk3) r3.a).j;
        r38 = new xs3(r166.e, r166.f);
        goto L77
    L63:
        r31 = false;
        goto L65
    L60:
        r25 = r21;
        r30 = r17;
    L27:
        r18 = r5;
        goto L28
    L10:
        r7 = false;
        goto L11
    }

    @Override // defpackage.rk2
    public final void c() {
        V(false);
    }

    @Override // defpackage.rk2
    public final void c0() {
        ((MediaController.TransportControls) this.i.A().o).skipToNext();
    }

    public final void c1() {
        bu4 r0 = new bu4();
        if (d1() == true) goto L5;
    L7:
        boolean r1 = false;
    L8:
        rr2.w(r1);
        lk3 r2 = (lk3) this.p.a;
        xs3 r3 = (xs3) r2.j;
        int r4 = r2.c.a.b;
        r3.m(r4, r0, 0);
        gn2 r6 = r0.b;
        if (r3.r(r4) == (-1)) goto L14;
        boolean r7 = ((lk3) this.p.a).v;
        wo0 r8 = this.i;
        if (r7 == false) goto L13;
        ((MediaController.TransportControls) r8.A().o).play();
    L49:
        if (((lk3) this.p.a).c.a.f == 0) goto L52;
        pz1 r9 = this.i.A();
        ((MediaController.TransportControls) r9.o).seekTo(((lk3) this.p.a).c.a.f);
    L52:
        if (((mi3) this.p.c).a(20) == false) goto L68;
        ArrayList r10 = new ArrayList();
        int r11 = 0;
    L55:
        if (r11 >= r3.o()) goto L62;
        if (r11 == r4) goto L61;
        if (r3.r(r11) != (-1)) goto L61;
        r3.m(r11, r0, 0);
        r10.add(r0.b);
    L61:
        r11 = r11 + 1;
        goto L55
    L62:
        W0(r10, 0);
        return;
    L68:
        return;
    L13:
        ((MediaController.TransportControls) r8.A().o).prepare();
        goto L49
    L14:
        cn2 r12 = r6.f;
        String r13 = r6.a;
        if (r12.a == null) goto L26;
        boolean r14 = ((lk3) this.p.a).v;
        wo0 r15 = this.i;
        if (r14 == false) goto L22;
        pz1 r16 = r15.A();
        Uri r17 = r12.a;
        Bundle r18 = r12.c;
        if (r18 != null) goto L21;
        r18 = Bundle.EMPTY;
    L21:
        ((MediaController.TransportControls) r16.o).playFromUri(r17, r18);
        goto L49
    L22:
        pz1 r19 = r15.A();
        Uri r20 = r12.a;
        Bundle r21 = r12.c;
        if (r21 != null) goto L25;
        r21 = Bundle.EMPTY;
    L25:
        ((MediaController.TransportControls) r19.o).prepareFromUri(r20, r21);
        goto L49
    L26:
        String r22 = r12.b;
        ml3 r110 = this.p;
        if (r22 == null) goto L38;
        boolean r23 = ((lk3) r110.a).v;
        wo0 r24 = this.i;
        if (r23 == false) goto L34;
        pz1 r25 = r24.A();
        String r26 = r12.b;
        Bundle r27 = r12.c;
        if (r27 != null) goto L33;
        r27 = Bundle.EMPTY;
    L33:
        ((MediaController.TransportControls) r25.o).playFromSearch(r26, r27);
        goto L49
    L34:
        pz1 r28 = r24.A();
        String r29 = r12.b;
        Bundle r30 = r12.c;
        if (r30 != null) goto L37;
        r30 = Bundle.EMPTY;
    L37:
        ((MediaController.TransportControls) r28.o).prepareFromSearch(r29, r30);
        goto L49
    L38:
        boolean r31 = ((lk3) r110.a).v;
        wo0 r111 = this.i;
        if (r31 == false) goto L44;
        pz1 r32 = r111.A();
        Bundle r33 = r12.c;
        if (r33 != null) goto L43;
        r33 = Bundle.EMPTY;
    L43:
        ((MediaController.TransportControls) r32.o).playFromMediaId(r13, r33);
        goto L49
    L44:
        pz1 r34 = r111.A();
        Bundle r35 = r12.c;
        if (r35 != null) goto L47;
        r35 = Bundle.EMPTY;
    L47:
        ((MediaController.TransportControls) r34.o).prepareFromMediaId(r13, r35);
        goto L49
    L5:
        if (((lk3) this.p.a).j.p() == true) goto L7;
        r1 = true;
        goto L8
    }

    @Override // defpackage.rk2
    public final void d(qh3 r9) {
        if (r9.equals(i()) == true) goto L5;
        lk3 r2 = ((lk3) this.p.a).e(r9);
        ml3 r0 = this.p;
        h1(new ml3(r2, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
    L5:
        this.i.A().J(r9.a);
    }

    @Override // defpackage.rk2
    public final void d0(int r10) {
        int r0 = j() - 1;
        if (r0 < F().b) goto L5;
        lk3 r3 = ((lk3) this.p.a).c(r0, y0());
        ml3 r1 = this.p;
        h1(new ml3(r3, (wa4) r1.b, (mi3) r1.c, (yw1) r1.d, (Bundle) r1.e, null), null, null);
    L5:
        ((xk2) this.i.n).a.adjustVolume(-1, r10);
    }

    public final boolean d1() {
        if (((lk3) this.p.a).A == 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.rk2
    public final void e(float r9) {
        if (r9 == i().a) goto L5;
        lk3 r2 = ((lk3) this.p.a).e(new qh3(r9));
        ml3 r0 = this.p;
        h1(new ml3(r2, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
    L5:
        this.i.A().J(r9);
    }

    @Override // defpackage.rk2
    public final jw4 e0() {
        return jw4.b;
    }

    public final void e1() {
        if (this.k == false) goto L5;
        return;
    L5:
        if (this.l == true) goto L39;
        this.l = true;
        fg4 r3 = this.i.y();
        ei3 r4 = Y0(this.i.z());
        MediaMetadata r0 = ((xk2) this.i.n).a.getMetadata();
        ArrayList r5 = null;
        if (r0 == null) goto L10;
        oi r6 = eo2.q;
        Parcel r7 = Parcel.obtain();
        r0.writeToParcel(r7, 0);
        r7.setDataPosition(0);
        eo2 r8 = eo2.CREATOR.createFromParcel(r7);
        r7.recycle();
        r8.o = r0;
    L11:
        List<MediaSession.QueueItem> r1 = ((xk2) this.i.n).a.getQueue();
        if (r1 == null) goto L14;
        r5 = or2.a(r1);
    L14:
        List r9 = X0(r5);
        CharSequence r10 = ((xk2) this.i.n).a.getQueueTitle();
        qu1 r2 = ((xk2) this.i.n).e.a();
        int r11 = -1;
        if (r2 == null) goto L23;
        r11 = r2.h();     // Catch: Throwable -> L18 RemoteException -> L20
    L18:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in getRepeatMode.", e);
    L23:
        qu1 r12 = ((xk2) this.i.n).e.a();
        if (r12 != null) goto L34;
    L31:
        int r13 = -1;
    L32:
        b1(true, new hm2(r3, r4, r8, r9, r10, r11, r13, f35.n(((xk2) this.i.n).a.getExtras())));
        return;
    L34:
        r13 = r12.V();     // Catch: Throwable -> L27 RemoteException -> L29
    L27:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in getShuffleMode.", e);
        goto L31
    L10:
        r8 = null;
        goto L11
    }

    @Override // defpackage.rk2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.rk2
    public final boolean f0() {
        return this.l;
    }

    public final void f1(int r38, long r39) {
        int r1 = r38;
        long r2 = r39;
        if (r1 < 0) goto L5;
        boolean r6 = true;
    L6:
        rr2.l(r6);
        int r7 = o0();
        cu4 r8 = ((lk3) this.p.a).j;
        if (r8.p() == true) goto L11;
        if (r1 < r8.o()) goto L11;
        return;
    L11:
        if (k() == false) goto L14;
        return;
    L14:
        if (r1 == r7) goto L19;
        long r10 = ((xs3) ((lk3) this.p.a).j).r(r1);
        if (r10 == (-1)) goto L18;
        ((MediaController.TransportControls) this.i.A().o).skipToQueueItem(r10);
        Integer r9 = 2;
    L20:
        long r11 = M0();
        if (r2 != (-9223372036854775807L)) goto L24;
        r2 = r11;
        Integer r14 = null;
    L26:
        if (r9 != null) goto L36;
        long r12 = b0();
        long r17 = getDuration();
        if (r2 >= r11) goto L30;
        long r13 = r2;
    L32:
        if (r17 != (-9223372036854775807L)) goto L34;
        int r15 = 0;
    L35:
        long r26 = r13;
        int r28 = r15;
        long r29 = r13 - r2;
        long r24 = r17;
    L38:
        if (r8.p() == true) goto L40;
        gn2 r16 = r8.m(r1, new bu4(), 0).b;
    L41:
        lk3 r3 = ((lk3) this.p.a).j(new za4(Z0(r1, r16, r2, false), false, SystemClock.elapsedRealtime(), r24, r26, r28, r29, -9223372036854775807L, r24, r26));
        if (r3.A == 1) goto L44;
        r3 = r3.f(2, null);
    L44:
        lk3 r18 = r3;
        ml3 r4 = this.p;
        h1(new ml3(r18, (wa4) r4.b, (mi3) r4.c, (yw1) r4.d, (Bundle) r4.e, null), r14, r9);
        return;
    L40:
        r16 = null;
        goto L41
    L34:
        r15 = (int) ((100 * r13) / r17);
        goto L35
    L30:
        r13 = Math.max(r2, r12);
        goto L32
    L36:
        r28 = 0;
        r26 = 0;
        r29 = 0;
        r24 = -9223372036854775807L;
        goto L38
    L24:
        ((MediaController.TransportControls) this.i.A().o).seekTo(r2);
        r14 = 1;
        goto L26
    L18:
        xa3.m(r1, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
    L19:
        r1 = r7;
        r9 = null;
        goto L20
    L5:
        r6 = false;
        goto L6
    }

    @Override // defpackage.rk2
    public final int g() {
        return ((lk3) this.p.a).A;
    }

    @Override // defpackage.rk2
    public final do2 g0() {
        return ((lk3) this.p.a).m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(boolean r17, hm2 r18, boolean r19, final ml3 r20, Integer r21, Integer r22) {
        yw1 r5 = (yw1) r20.d;
        hm2 r6 = this.m;
        ml3 r7 = this.p;
        if (r6 == r18) goto L5;
        this.m = new hm2(r18);
    L5:
        if (r19 == false) goto L7;
        this.n = this.m;
    L7:
        this.p = r20;
        if (r17 == false) goto L13;
        a1().X0();
        if (((yw1) r7.d).equals(r5) == true) goto L112;
        a1().f.post(new dm2(this, r20));
        return;
    L112:
        return;
    L13:
        lk3 r8 = (lk3) r7.a;
        cu4 r9 = r8.j;
        lk3 r10 = (lk3) r20.a;
        xa4 r11 = (xa4) r20.f;
        boolean r12 = r9.equals(r10.j);
        final int r13 = 4;
        tc2 r14 = this.d;
        if (r12 == true) goto L16;
        r14.c(0, new cm2(r20, r13));
    L16:
        CharSequence r15 = (CharSequence) r6.g;
        CharSequence r16 = (CharSequence) r18.g;
        ei3 r110 = (ei3) r18.e;
        boolean r23 = TextUtils.equals(r15, r16);
        final int r111 = 5;
        if (r23 == true) goto L20;
        r14.c(15, new cm2(r20, r111));
    L20:
        if (r21 == null) goto L23;
        r14.c(11, new eg0(r7, r20, r21, r111));
    L23:
        if (r22 == null) goto L25;
        r14.c(1, new ef0(17, r20, r22));
    L25:
        ei3 r4 = (ei3) r6.e;
        hd5 r24 = ju2.a;
        if (r4 != null) goto L28;
    L30:
        boolean r112 = false;
    L31:
        if (r110 != null) goto L33;
    L35:
        boolean r3 = false;
    L36:
        final int r113 = 3;
        final int r25 = 10;
        if (r112 == false) goto L44;
        if (r3 == false) goto L44;
        String r26 = f35.a;
        if (r4.s == r110.s) goto L42;
    L46:
        PlaybackException r27 = f92.o(r110, this.a);
        r14.c(10, new hj0(3, r27));
        if (r27 == null) goto L50;
        r14.c(10, new hj0(4, r27));
    L50:
        if (((eo2) r6.f) == ((eo2) r18.f)) goto L53;
        r14.c(14, new em2(this));
    L53:
        if (r8.A == r10.A) goto L56;
        final int r28 = 6;
        r14.c(4, new cm2(r20, r28));
    L56:
        if (r8.v == r10.v) goto L58;
        final int r29 = 7;
        r14.c(5, new cm2(r20, r29));
    L59:
        final int r30 = 8;
        if (r8.x == r10.x) goto L62;
        r14.c(r29, new cm2(r20, r30));
    L62:
        final int r31 = 9;
        final int r32 = 12;
        if (r8.g.equals(r10.g) == true) goto L66;
        r14.c(12, new cm2(r20, r31));
    L66:
        if (r8.h == r10.h) goto L69;
        r14.c(8, new cm2(r20, r25));
    L69:
        if (r8.i == r10.i) goto L72;
        final int r33 = 11;
        r14.c(9, new cm2(r20, r33));
    L72:
        if (r8.q.equals(r10.q) == true) goto L75;
        r14.c(20, new cm2(r20, r32));
    L75:
        if (r8.p == r10.p) goto L77;
        final int r34 = 0;
        r14.c(21, new cm2(r20, r34));
    L79:
        if (r8.s.equals(r10.s) == true) goto L81;
        final int r35 = 1;
        r14.c(29, new cm2(r20, r35));
    L83:
        if (r8.t == r10.t) goto L85;
    L86:
        final int r36 = 2;
        r14.c(30, new cm2(r20, r36));
    L88:
        if (((mi3) r7.c).equals((mi3) r20.c) == true) goto L91;
        r14.c(13, new cm2(r20, r113));
    L91:
        if (((wa4) r7.b).equals((wa4) r20.b) == true) goto L98;
        sk2 r1 = a1();
        r1.getClass();
        if (Looper.myLooper() != r1.f.getLooper()) goto L95;
        boolean r2 = r35;
    L96:
        rr2.w(r2);
        r1.e.l();
        goto L98
    L95:
        r2 = r34;
    L98:
        if (((yw1) r7.d).equals(r5) == true) goto L104;
        sk2 r37 = a1();
        r37.getClass();
        if (Looper.myLooper() != r37.f.getLooper()) goto L102;
        boolean r38 = r35;
    L103:
        rr2.w(r38);
        qk2 r39 = r37.e;
        r39.getClass();
        new ab4(-6);
        r39.u();
        goto L104
    L102:
        r38 = r34;
    L104:
        if (r11 == null) goto L110;
        sk2 r0 = a1();
        r0.getClass();
        if (Looper.myLooper() != r0.f.getLooper()) goto L108;
        boolean r114 = r35;
    L109:
        rr2.w(r114);
        r0.e.getClass();
        goto L110
    L108:
        r114 = r34;
    L110:
        r14.b();
        return;
    L85:
        if (r8.u == r10.u) goto L88;
    L81:
        r35 = 1;
        goto L83
    L77:
        r34 = 0;
        goto L79
    L58:
        r29 = 7;
        goto L59
    L42:
        if (TextUtils.equals(r4.t, r110.t) == false) goto L46;
    L44:
        if (r112 != r3) goto L46;
    L33:
        if (r110.n != 7) goto L35;
        r3 = true;
        goto L36
    L28:
        if (r4.n != 7) goto L30;
        r112 = true;
        goto L31
    }

    @Override // defpackage.rk2
    public final long getDuration() {
        return ((lk3) this.p.a).c.d;
    }

    @Override // defpackage.rk2
    public final int h() {
        return ((lk3) this.p.a).h;
    }

    @Override // defpackage.rk2
    public final boolean h0() {
        return ((lk3) this.p.a).x;
    }

    public final void h1(ml3 r8, Integer r9, Integer r10) {
        g1(false, this.m, false, r8, r9, r10);
    }

    @Override // defpackage.rk2
    public final qh3 i() {
        return ((lk3) this.p.a).g;
    }

    @Override // defpackage.rk2
    public final jg0 i0() {
        l93.q0("MCImplLegacy", "Session doesn't support getting Cue");
        return jg0.d;
    }

    @Override // defpackage.rk2
    public final int j() {
        lk3 r0 = (lk3) this.p.a;
        if (r0.s.a == 1) goto L5;
        wo0 r3 = this.i;
        if (r3 == null) goto L13;
        fg4 r4 = r3.y();
        jx1 r1 = f92.a;
        if (r4 != null) goto L12;
        return 0;
    L12:
        return r4.e;
    L13:
        return 0;
    L5:
        return r0.t;
    }

    @Override // defpackage.rk2
    public final int j0() {
        return -1;
    }

    @Override // defpackage.rk2
    public final boolean k() {
        return ((lk3) this.p.a).c.b;
    }

    @Override // defpackage.rk2
    public final void k0(il r1, boolean r2) {
        l93.q0("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.rk2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.rk2
    public final void l0(do2 r1) {
        l93.q0("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.rk2
    public final long m() {
        return ((lk3) this.p.a).c.g;
    }

    @Override // defpackage.rk2
    public final void m0() {
        V(true);
    }

    @Override // defpackage.rk2
    public final void n(int r1, long r2) {
        f1(r1, r2);
    }

    @Override // defpackage.rk2
    public final int n0() {
        return -1;
    }

    @Override // defpackage.rk2
    public final mi3 o() {
        return (mi3) this.p.c;
    }

    @Override // defpackage.rk2
    public final int o0() {
        return ((lk3) this.p.a).c.a.b;
    }

    @Override // defpackage.rk2
    public final void p(gn2 r2, long r3) {
        T(yw1.o(r2), 0, r3);
    }

    @Override // defpackage.rk2
    public final void p0(int r9) {
        if (r9 == h()) goto L5;
        lk3 r2 = ((lk3) this.p.a).i(r9);
        ml3 r0 = this.p;
        h1(new ml3(r2, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
    L5:
        pz1 r8 = this.i.A();
        int r10 = f92.p(r9);
        Bundle r1 = new Bundle();
        r1.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", r10);
        r8.I("android.support.v4.media.session.action.SET_REPEAT_MODE", r1);
    }

    @Override // defpackage.rk2
    public final boolean q() {
        return ((lk3) this.p.a).v;
    }

    @Override // defpackage.rk2
    public final void q0(boolean r2) {
        E(1, r2);
    }

    @Override // defpackage.rk2
    public final void r() {
        P(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final void r0(oi3 r1) {
        this.d.e(r1);
    }

    @Override // defpackage.rk2
    public final void s(boolean r9) {
        if (r9 == D0()) goto L5;
        lk3 r2 = ((lk3) this.p.a).k(r9);
        ml3 r0 = this.p;
        h1(new ml3(r2, (wa4) r0.b, (mi3) r0.c, (yw1) r0.d, (Bundle) r0.e, null), null, null);
    L5:
        pz1 r8 = this.i.A();
        jx1 r1 = f92.a;
        Bundle r3 = new Bundle();
        r3.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", r9 ? 1 : 0);
        r8.I("android.support.v4.media.session.action.SET_SHUFFLE_MODE", r3);
    }

    @Override // defpackage.rk2
    public final void s0(gn2 r3) {
        p(r3, -9223372036854775807L);
    }

    @Override // defpackage.rk2
    public final void stop() {
        lk3 r1 = (lk3) this.p.a;
        if (r1.A != 1) goto L5;
        return;
    L5:
        za4 r2 = r1.c;
        pi3 r5 = r2.a;
        boolean r6 = r2.b;
        long r9 = r2.d;
        long r11 = r5.f;
        int r13 = ju2.b(r11, r9);
        lk3 r3 = r1.j(new za4(r5, r6, SystemClock.elapsedRealtime(), r9, r11, r13, 0, -9223372036854775807L, r9, r11));
        lk3 r4 = (lk3) this.p.a;
        if (r4.A == 1) goto L8;
        r3 = r3.f(1, r4.a);
    L8:
        lk3 r7 = r3;
        ml3 r8 = this.p;
        h1(new ml3(r7, (wa4) r8.b, (mi3) r8.c, (yw1) r8.d, (Bundle) r8.e, null), null, null);
        ((MediaController.TransportControls) this.i.A().o).stop();
    }

    @Override // defpackage.rk2
    public final int t() {
        return ((lk3) this.p.a).c.f;
    }

    @Override // defpackage.rk2
    public final void t0(int r2, int r3) {
        u0(r2, r2 + 1, r3);
    }

    @Override // defpackage.rk2
    public final long u() {
        return ((lk3) this.p.a).E;
    }

    @Override // defpackage.rk2
    public final void u0(int r12, int r13, int r14) {
        int r0 = 0;
        if (r12 < 0) goto L7;
        if (r12 > r13) goto L7;
        if (r14 < 0) goto L7;
        boolean r1 = true;
    L8:
        rr2.l(r1);
        xs3 r2 = (xs3) ((lk3) this.p.a).j;
        int r3 = r2.o();
        int r15 = Math.min(r13, r3);
        int r4 = r15 - r12;
        int r5 = r3 - r4;
        int r6 = r5 - 1;
        int r16 = Math.min(r14, r5);
        if (r12 >= r3) goto L32;
        if (r12 == r15) goto L35;
        if (r12 == r16) goto L37;
        int r7 = o0();
        if (r7 < r12) goto L19;
        if (r7 >= r15) goto L18;
        r7 = -1;
        goto L19
    L18:
        r7 = r7 - r4;
    L19:
        if (r7 != (-1)) goto L21;
        r7 = f35.j(r12, 0, r6);
        l93.q0("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + r7 + " would be the new current item");
    L21:
        if (r7 < r16) goto L24;
        r7 = r7 + r4;
    L24:
        ArrayList r8 = new ArrayList(r2.e);
        f35.P(r8, r12, r15, r16);
        lk3 r9 = ((lk3) this.p.a).m(new xs3(yw1.k(r8), r2.f), r7);
        ml3 r17 = this.p;
        h1(new ml3(r9, (wa4) r17.b, (mi3) r17.c, (yw1) r17.d, (Bundle) r17.e, null), null, null);
        if (d1() == false) goto L36;
        ArrayList r18 = new ArrayList();
        int r10 = 0;
    L27:
        if (r10 >= r4) goto L30;
        r18.add((or2) this.m.a.get(r12));
        this.i.I(((or2) this.m.a.get(r12)).n);
        r10 = r10 + 1;
    L30:
        if (r0 >= r18.size()) goto L38;
        this.i.a(((or2) r18.get(r0)).n, r0 + r16);
        r0 = r0 + 1;
        goto L30
    L38:
        return;
    L36:
        return;
    L37:
        return;
    L35:
        return;
    L32:
        return;
    L7:
        r1 = false;
        goto L8
    }

    @Override // defpackage.rk2
    public final void v(oi3 r1) {
        this.d.a(r1);
    }

    @Override // defpackage.rk2
    public final int v0() {
        return 0;
    }

    @Override // defpackage.rk2
    public final int w() {
        return -1;
    }

    @Override // defpackage.rk2
    public final void w0(List r2) {
        N0(r2, Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final long x() {
        return getDuration();
    }

    @Override // defpackage.rk2
    public final cu4 x0() {
        return ((lk3) this.p.a).j;
    }

    @Override // defpackage.rk2
    public final int y() {
        return o0();
    }

    @Override // defpackage.rk2
    public final boolean y0() {
        lk3 r0 = (lk3) this.p.a;
        if (r0.s.a == 1) goto L5;
        wo0 r3 = this.i;
        if (r3 == null) goto L14;
        fg4 r4 = r3.y();
        jx1 r1 = f92.a;
        if (r4 != null) goto L12;
        return false;
    L12:
        if (r4.e != 0) goto L16;
        return true;
    L16:
        return false;
    L14:
        return false;
    L5:
        return r0.u;
    }

    @Override // defpackage.rk2
    public final s55 z() {
        l93.q0("MCImplLegacy", "Session doesn't support getting VideoSize");
        return s55.d;
    }

    @Override // defpackage.rk2
    public final void z0(int r2, gn2 r3) {
        L(r2, r2 + 1, yw1.o(r3));
    }
}
