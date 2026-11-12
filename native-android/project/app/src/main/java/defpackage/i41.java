package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.eddyizm.tempus.service.MediaService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i41 extends fq implements ExoPlayer {
    public final y10 A;
    public final y10 B;
    public final long C;
    public final c6 D;
    public final w12 E;
    public final yc5 F;
    public final qr2 G;
    public final qr2 H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public jx1 O;
    public final i74 P;
    public pd4 Q;
    public mi3 R;
    public do2 S;
    public do2 T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public boolean X;
    public final int Y;
    public pf4 Z;
    public il a0;
    public float b0;
    public final ew4 c;
    public float c0;
    public final mi3 d;
    public boolean d0;
    public final q90 e;
    public jg0 e0;
    public final Context f;
    public final boolean f0;
    public final i41 g;
    public boolean g0;
    public final kq[] h;
    public final int h0;
    public final kq[] i;
    public boolean i0;
    public final pn0 j;
    public final hp0 j0;
    public final yp4 k;
    public s55 k0;
    public final u31 l;
    public final long l0;
    public final q41 m;
    public final long m0;
    public final tc2 n;
    public final long n0;
    public final CopyOnWriteArraySet o;
    public do2 o0;
    public final zt4 p;
    public ph3 p0;
    public final ArrayList q;
    public int q0;
    public final boolean r;
    public long r0;
    public final lt2 s;
    public final nj0 t;
    public final Looper u;
    public final cp v;
    public final vp4 w;
    public final d41 x;
    public final e41 y;
    public final ll z;

    static {
        hn2.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fq, i41, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [i41] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public i41(o31 r34) {
        Looper r0 = r34.h;
        MediaService r6 = r34.a;
        int r7 = 0;
        Integer r2 = 0;
        ?? r1 = new fq();
        r1.e = new q90();
        l93.K("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(r1)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");     // Catch: Throwable -> L11
        vp4 r3 = r34.b;     // Catch: Throwable -> L11
        r1.f = r6.getApplicationContext();     // Catch: Throwable -> L11
        r1.t = new nj0(r3);     // Catch: Throwable -> L11
        r1.h0 = r34.i;     // Catch: Throwable -> L11
        r1.a0 = r34.j;     // Catch: Throwable -> L11
        r1.Y = r34.o;     // Catch: Throwable -> L11
        r1.d0 = false;     // Catch: Throwable -> L11
        r1.C = r34.x;     // Catch: Throwable -> L11
        d41 r11 = new d41(r1);     // Catch: Throwable -> L11
        r1.x = r11;     // Catch: Throwable -> L11
        r1.y = new e41();     // Catch: Throwable -> L11
        kq[] r4 = ((pm0) r34.c.get()).b(new Handler(r0), r11, r11, r11, r11);     // Catch: Throwable -> L11
        r1.h = r4;     // Catch: Throwable -> L11
        if (r4.length <= 0) goto L6;
        boolean r5 = true;
    L7:
        rr2.w(r5);     // Catch: Throwable -> L11
        r1.i = new kq[r4.length];     // Catch: Throwable -> L11
        int r8 = 0;
    L8:
        kq[] r9 = r1.i;     // Catch: Throwable -> L11
        if (r8 >= r9.length) goto L13;
        int r10 = r1.h[r8].o;     // Catch: Throwable -> L11
        r9[r8] = null;     // Catch: Throwable -> L11
        r8 = r8 + 1;     // Catch: Throwable -> L11
        goto L8
    L13:
        pn0 r13 = (pn0) r34.e.get();     // Catch: Throwable -> L11
        r1.j = r13;     // Catch: Throwable -> L11
        r1.s = (lt2) r34.d.get();     // Catch: Throwable -> L11
        cp r12 = (cp) r34.g.get();     // Catch: Throwable -> L11
        r1.v = r12;     // Catch: Throwable -> L11
        r1.r = r34.p;     // Catch: Throwable -> L11
        n84 r14 = r34.q;     // Catch: Throwable -> L11
        r1.l0 = r34.s;     // Catch: Throwable -> L11
        r1.m0 = r34.t;     // Catch: Throwable -> L11
        r1.n0 = r34.u;     // Catch: Throwable -> L11
        r1.P = r34.r;     // Catch: Throwable -> L11
        r1.u = r0;     // Catch: Throwable -> L11
        r1.w = r3;     // Catch: Throwable -> L11
        r1.g = r1;     // Catch: Throwable -> L11
        r1.n = new tc2(r0, r3, new u31(r1, r7));     // Catch: Throwable -> L11
        CopyOnWriteArraySet r15 = new CopyOnWriteArraySet();     // Catch: Throwable -> L11
        r1.o = r15;     // Catch: Throwable -> L11
        r1.q = new ArrayList();     // Catch: Throwable -> L11
        r1.Q = new pd4();     // Catch: Throwable -> L11
        kq[] r16 = r1.h;     // Catch: Throwable -> L11
        ew4 r17 = new ew4(new dz3[r16.length], new t41[r16.length], jw4.b, null);     // Catch: Throwable -> L11
        r1.c = r17;     // Catch: Throwable -> L11
        r1.p = new zt4();     // Catch: Throwable -> L11
        SparseBooleanArray r18 = new SparseBooleanArray();     // Catch: Throwable -> L11
        int[] r19 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};     // Catch: Throwable -> L11
        int r110 = r19.length;     // Catch: Throwable -> L11
        int r111 = 0;
    L14:
        if (r111 >= r110) goto L16;
        int r20 = r19[r111];     // Catch: Throwable -> L11
        rr2.w(!false);     // Catch: Throwable -> L11
        r18.append(r20, true);     // Catch: Throwable -> L11
        r111 = r111 + 1;     // Catch: Throwable -> L11
        r2 = r2;
        goto L14
    L16:
        Integer r31 = r2;
        rr2.w(!false);     // Catch: Throwable -> L11
        r18.append(29, true);     // Catch: Throwable -> L11
        rr2.w(!false);     // Catch: Throwable -> L11
        w71 r21 = new w71(r18);     // Catch: Throwable -> L11
        r1.d = new mi3(r21);     // Catch: Throwable -> L11
        SparseBooleanArray r22 = new SparseBooleanArray();     // Catch: Throwable -> L11
        int r23 = 0;
    L18:
        if (r23 >= r21.a.size()) goto L20;
        int r112 = r21.b(r23);     // Catch: Throwable -> L11
        rr2.w(!false);     // Catch: Throwable -> L11
        r22.append(r112, true);     // Catch: Throwable -> L11
        r23 = r23 + 1;     // Catch: Throwable -> L11
        goto L18
    L20:
        rr2.w(!false);     // Catch: Throwable -> L11
        r22.append(4, true);     // Catch: Throwable -> L11
        rr2.w(!false);     // Catch: Throwable -> L11
        r22.append(10, true);     // Catch: Throwable -> L11
        rr2.w(!false);     // Catch: Throwable -> L11
        r1.R = new mi3(new w71(r22));     // Catch: Throwable -> L11
        r1.k = r3.a(r0, null);     // Catch: Throwable -> L11
        u31 r24 = new u31(r1, 1);     // Catch: Throwable -> L11
        r1.l = r24;     // Catch: Throwable -> L11
        r1.p0 = ph3.k(r17);     // Catch: Throwable -> L11
        r1.t.c0(r1, r0);     // Catch: Throwable -> L11
        ik3 r113 = new ik3(r34.E);     // Catch: Throwable -> L11
        q41 r25 = new q41(r1.f, r1.h, r1.i, r13, r17, (cd2) r34.f.get(), r12, r1.I, r1.J, r1.t, r14, r34.v, r34.w, r0, r3, r24, r113, r1.y, r34.F);     // Catch: Throwable -> L11
        yp4 r114 = r25.u;     // Catch: Throwable -> L11
        r1.m = r25;     // Catch: Throwable -> L11
        Looper r115 = r25.w;     // Catch: Throwable -> L11
        r1.b0 = 1.0f;     // Catch: Throwable -> L11
        r1.I = 0;     // Catch: Throwable -> L11
        do2 r26 = do2.K;     // Catch: Throwable -> L11
        r1.S = r26;     // Catch: Throwable -> L11
        r1.T = r26;     // Catch: Throwable -> L11
        r1.o0 = r26;     // Catch: Throwable -> L11
        r1.q0 = -1;     // Catch: Throwable -> L11
        r1.e0 = jg0.d;     // Catch: Throwable -> L11
        r1.f0 = true;     // Catch: Throwable -> L11
        r1.v(r1.t);     // Catch: Throwable -> L11
        r12.L(new Handler(r0), r1.t);     // Catch: Throwable -> L11
        r15.add(r1.x);     // Catch: Throwable -> L11
        int r116 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L11
        if (r116 >= 31) goto L85;
        Handler.Callback r117 = null;
        i41 r27 = r1;
    L37:
        u31 r28 = new u31(r27, 2);     // Catch: Throwable -> L11
        c6 r29 = new c6();     // Catch: Throwable -> L11
        r29.b = r3.a(r115, r117);     // Catch: Throwable -> L11
        r29.c = r3.a(r0, r117);     // Catch: Throwable -> L11
        r29.e = r31;     // Catch: Throwable -> L11
        r29.f = r31;     // Catch: Throwable -> L11
        r29.d = r28;     // Catch: Throwable -> L11
        r27.D = r29;     // Catch: Throwable -> L11
        r29.v(new a0(27, r27));     // Catch: Throwable -> L11
        i41 r30 = r27;
        ll r32 = new ll(r6, r115, r34.h, r27.x, r3);     // Catch: Throwable -> L51
        r30.z = r32;     // Catch: Throwable -> L51
        r32.l(r34.n);     // Catch: Throwable -> L51
        int r33 = r34.l;     // Catch: Throwable -> L51
        if (r34.m == false) goto L42;
    L54:
        y10 r35 = new y10(r6, r115, r3, 3);     // Catch: Throwable -> L51
        r30.A = r35;     // Catch: Throwable -> L51
        if (r33 == 0) goto L57;
        boolean r36 = true;
    L59:
        if (r35.b == r36) goto L62;
        r35.b = r36;     // Catch: Throwable -> L51
        r35.h(r36, r35.c);     // Catch: Throwable -> L51
    L62:
        y10 r37 = new y10(r6, r115, r3, 4);     // Catch: Throwable -> L51
        r30.B = r37;     // Catch: Throwable -> L51
        if (r33 != 2) goto L65;
        boolean r38 = true;
    L67:
        if (r37.b == r38) goto L70;
        r37.b = r38;     // Catch: Throwable -> L51
        r37.i(r38, r37.c);     // Catch: Throwable -> L51
    L70:
        r30.j0 = hp0.e;     // Catch: Throwable -> L51
        r30.k0 = s55.d;     // Catch: Throwable -> L51
        r30.Z = pf4.c;     // Catch: Throwable -> L51
        if (r116 < 34) goto L73;
        yc5 r39 = new yc5();     // Catch: Throwable -> L51
        r39.p = r30;     // Catch: Throwable -> L51
        r39.n = new WeakReference(r6);     // Catch: Throwable -> L51
        g41 r40 = new g41(0, r39);     // Catch: Throwable -> L51
        r39.o = r40;     // Catch: Throwable -> L51
        int r41 = 0;
        bn.y(r6, new h41(0, r30.w.a(r30.u, r117)), r40);     // Catch: Throwable -> L51
        yc5 r118 = r39;
    L74:
        r30.F = r118;     // Catch: Throwable -> L51
        r30.G = new qr2(8);     // Catch: Throwable -> L51
        r30.H = new qr2(8);     // Catch: Throwable -> L51
        int r310 = r41;
        r1 = r30;
        r1.E = new w12(r1, r30.x, r30.w, r34.y, r34.z, r34.A, r34.B);     // Catch: Throwable -> L11
        r114.b(38, r1.P).b();     // Catch: Throwable -> L11
        il r42 = r1.a0;     // Catch: Throwable -> L11
        boolean r43 = r34.k;     // Catch: Throwable -> L11
        r114.getClass();     // Catch: Throwable -> L11
        xp4 r44 = yp4.c();     // Catch: Throwable -> L11
        r44.a = r114.a.obtainMessage(31, r43 ? 1 : 0, r310, r42);     // Catch: Throwable -> L11
        r44.b();     // Catch: Throwable -> L11
        r1.q1(1, 3, r1.a0);     // Catch: Throwable -> L11
        r1.q1(2, 4, Integer.valueOf(r1.Y));     // Catch: Throwable -> L11
        r1.q1(2, 5, r31);     // Catch: Throwable -> L11
        r1.q1(1, 9, Boolean.valueOf(r1.d0));     // Catch: Throwable -> L11
        r1.q1(6, 8, r1.y);     // Catch: Throwable -> L11
        r1.q1(-1, 16, Integer.valueOf(r1.h0));     // Catch: Throwable -> L11
        r1.e.d();
        return;
    L73:
        r41 = 0;
        r118 = r117;
        goto L74
    L65:
        r38 = false;
        goto L67
    L57:
        r36 = false;
        goto L59
    L42:
        if (r34.y != Integer.MAX_VALUE) goto L44;
    L53:
        r33 = 0;
        goto L54
    L44:
        if (r34.z == Integer.MAX_VALUE) goto L53;
        if (r34.A == Integer.MAX_VALUE) goto L53;
        if (r34.B == Integer.MAX_VALUE) goto L53;
        r33 = 1;
    L51:
        th = th;
        i41 r45 = r30;
    L79:
        r45.e.d();
        throw th;
    L85:
        Context r46 = r1.f;     // Catch: Throwable -> L34
        boolean r47 = r34.C;     // Catch: Throwable -> L32
        yp4 r48 = r3.a(r25.w, null);     // Catch: Throwable -> L32
        r117 = null;
        b41 r49 = new b41(r46, r47, this, r113, 0);     // Catch: Throwable -> L30
        r27 = this;
        r48.d(r49);     // Catch: Throwable -> L11
    L30:
        th = th;
        r45 = this;
    L32:
        th = th;
        r45 = this;
    L34:
        th = th;
        r45 = r1;
        goto L79
    L6:
        r5 = false;
    L11:
        th = th;
        r45 = r1;
        goto L79
    }

    public static long j1(ph3 r6) {
        bu4 r0 = new bu4();
        zt4 r1 = new zt4();
        r6.a.g(r6.b.a, r1);
        long r2 = r6.c;
        if (r2 != (-9223372036854775807L)) goto L7;
        return r6.a.m(r1.c, r0, 0).k;
    L7:
        return r1.e + r2;
    }

    public static ph3 k1(ph3 r1, int r2) {
        ph3 r3 = r1.h(r2);
        if (r2 == 1) goto L9;
        if (r2 == 4) goto L9;
        return r3;
    L9:
        return r3.b(false);
    }

    @Override // defpackage.qi3
    public final void A0() {
        z1();
        if (this.b0 == 0.0f) goto L6;
        R(0.0f);
        return;
    }

    @Override // defpackage.qi3
    public final float B() {
        z1();
        return this.b0;
    }

    @Override // defpackage.qi3
    public final void C0() {
        z1();
    }

    @Override // defpackage.qi3
    public final il D() {
        z1();
        return this.a0;
    }

    @Override // defpackage.qi3
    public final boolean D0() {
        z1();
        return this.J;
    }

    @Override // defpackage.qi3
    public final void E(int r1, boolean r2) {
        z1();
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        z1();
        jn0 r0 = this.j.d();
        if (this.N == false) goto L6;
        r0.getClass();
        in0 r1 = new in0(r0);
        r1.m(this.O);
        return new jn0(r1);
    L6:
        return r0;
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        z1();
        return this.j0;
    }

    @Override // defpackage.qi3
    public final long F0() {
        z1();
        if (this.p0.a.p() == true) goto L5;
        ph3 r0 = this.p0;
        if (r0.k.d != r0.b.d) goto L9;
        long r1 = r0.q;
        if (this.p0.k.b() == false) goto L16;
        ph3 r2 = this.p0;
        zt4 r3 = r2.a.g(r2.k.a, this.p);
        long r4 = r3.d(this.p0.k.b);
        if (r4 != Long.MIN_VALUE) goto L15;
        r1 = r3.d;
        goto L16
    L15:
        r1 = r4;
    L16:
        ph3 r5 = this.p0;
        cu4 r6 = r5.a;
        Object r7 = r5.k.a;
        zt4 r8 = this.p;
        r6.g(r7, r8);
        return f35.i0(r1 + r8.e);
    L9:
        return f35.i0(r0.a.m(o0(), this.b, 0).l);
    L5:
        return this.r0;
    }

    @Override // defpackage.qi3
    public final void G() {
        z1();
    }

    @Override // defpackage.qi3
    public final void G0(int r1) {
        z1();
    }

    @Override // defpackage.qi3
    public final void H(int r1, int r2) {
        z1();
    }

    @Override // defpackage.qi3
    public final void J(int r1) {
        z1();
    }

    @Override // defpackage.qi3
    public final int K() {
        z1();
        if (k() == true) goto L5;
        return -1;
    L5:
        return this.p0.b.c;
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        z1();
        return this.S;
    }

    @Override // defpackage.qi3
    public final void L(int r11, int r12, List r13) {
        z1();
        boolean r5 = true;
        if (r11 < 0) goto L6;
        if (r12 < r11) goto L6;
        boolean r6 = true;
    L7:
        rr2.l(r6);
        ArrayList r7 = this.q;
        int r8 = r7.size();
        if (r11 <= r8) goto L10;
        return;
    L10:
        int r2 = Math.min(r12, r8);
        if ((r2 - r11) != r13.size()) goto L17;
        int r9 = r11;
    L14:
        if (r9 >= r2) goto L28;
        rg2 r10 = ((f41) r7.get(r9)).b;
        if (r10.k.a((gn2) r13.get(r9 - r11)) == false) goto L17;
        r9 = r9 + 1;
        goto L14
    L28:
        this.K++;
        yp4 r1 = this.m.u;
        r1.getClass();
        xp4 r4 = yp4.c();
        r4.a = r1.a.obtainMessage(27, r11, r2, r13);
        r4.b();
        int r3 = r11;
    L29:
        if (r3 >= r2) goto L35;
        f41 r14 = (f41) r7.get(r3);
        cu4 r15 = r14.c;
        gn2 r16 = (gn2) r13.get(r3 - r11);
        if ((r15 instanceof du4) == false) goto L33;
        du4 r17 = new du4(((du4) r15).e, r16);
    L34:
        r14.c = r17;
        r3 = r3 + 1;
        goto L29
    L33:
        r17 = new du4(r15, r16);
        goto L34
    L35:
        x1(this.p0.j(b1()), 0, false, 4, -9223372036854775807L, -1, false);
        return;
    L17:
        ArrayList r18 = c1(r13);
        if (this.p0.a.p() == true) goto L20;
        ph3 r19 = o1(Z0(this.p0, r2, r18), r11, r2);
        x1(r19, 0, !r19.b.a.equals(this.p0.b.a), 4, g1(r19), -1, false);
        return;
    L20:
        if (this.q0 == (-1)) goto L23;
        r5 = false;
    L23:
        z1();
        r1(r18, -1, -9223372036854775807L, r5);
        return;
    L6:
        r6 = false;
        goto L7
    }

    @Override // defpackage.qi3
    public final void L0(List r7) {
        z1();
        ArrayList r1 = c1(r7);
        z1();
        r1(r1, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.qi3
    public final void M(cw4 r7) {
        z1();
        pn0 r0 = this.j;
        r0.getClass();
        cw4 r1 = E0();
        if (this.N == false) goto L9;
        this.O = r7.I;
        jx1 r2 = this.P.a;
        bw4 r3 = r7.a();
        o15 r4 = r2.h();
    L6:
        if (r4.hasNext() == false) goto L8;
        r3.l(((Integer) r4.next()).intValue(), true);
        goto L6
    L8:
        cw4 r5 = r3.b();
    L11:
        if (r5.equals(r0.d()) == true) goto L14;
        r0.j(r5);
    L14:
        if (r1.equals(r7) == true) goto L18;
        y31 r6 = new y31(r7, 0);
        this.n.f(19, r6);
        return;
    L18:
        return;
    L9:
        r5 = r7;
        goto L11
    }

    @Override // defpackage.qi3
    public final long M0() {
        z1();
        return f35.i0(g1(this.p0));
    }

    @Override // defpackage.qi3
    public final void N0(List r10, int r11) {
        z1();
        ArrayList r2 = c1(r10);
        z1();
        if (r11 < 0) goto L5;
        boolean r5 = true;
    L6:
        rr2.l(r5);
        int r1 = Math.min(r11, this.q.size());
        if (this.p0.a.p() == true) goto L9;
        x1(Z0(this.p0, r1, r2), 0, false, 5, -9223372036854775807L, -1, false);
        return;
    L9:
        if (this.q0 != (-1)) goto L11;
        boolean r6 = true;
    L12:
        z1();
        r1(r2, -1, -9223372036854775807L, r6);
        return;
    L11:
        r6 = false;
        goto L12
    L5:
        r5 = false;
        goto L6
    }

    @Override // defpackage.qi3
    public final long O0() {
        z1();
        return this.l0;
    }

    @Override // defpackage.qi3
    public final void P(int r12, int r13) {
        z1();
        if (r12 < 0) goto L6;
        if (r13 < r12) goto L6;
        boolean r1 = true;
    L7:
        rr2.l(r1);
        int r2 = this.q.size();
        int r14 = Math.min(r13, r2);
        if (r12 >= r2) goto L13;
        if (r12 == r14) goto L14;
        ph3 r3 = o1(this.p0, r12, r14);
        x1(r3, 0, !r3.b.a.equals(this.p0.b.a), 4, g1(r3), -1, false);
        return;
    L14:
        return;
    L13:
        return;
    L6:
        r1 = false;
        goto L7
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder r5) {
        z1();
        if (r5 != null) goto L6;
        z1();
        p1();
        t1(null);
        n1(0, 0);
        return;
    L6:
        p1();
        this.X = true;
        this.W = r5;
        r5.addCallback(this.x);
        Surface r2 = r5.getSurface();
        if (r2 != null) goto L9;
    L12:
        t1(null);
        n1(0, 0);
        return;
    L9:
        if (r2.isValid() == false) goto L12;
        t1(r2);
        Rect r6 = r5.getSurfaceFrame();
        n1(r6.width(), r6.height());
    }

    @Override // defpackage.qi3
    public final void R(float r4) {
        z1();
        float r5 = f35.i(r4, 0.0f, 1.0f);
        float r0 = this.b0;
        if (r0 != r5) goto L6;
        return;
    L6:
        if (r5 == 0.0f) goto L8;
        r0 = r5;
    L8:
        this.c0 = r0;
        this.b0 = r5;
        this.m.u.b(32, Float.valueOf(r5)).b();
        w31 r1 = new w31(0, r5);
        this.n.f(22, r1);
    }

    @Override // defpackage.qi3
    public final void T(List r7, int r8, long r9) {
        z1();
        ArrayList r1 = c1(r7);
        z1();
        r1(r1, r8, r9, false);
    }

    @Override // defpackage.qi3
    public final PlaybackException U() {
        z1();
        return this.p0.f;
    }

    @Override // defpackage.qi3
    public final Looper U0() {
        return this.u;
    }

    @Override // defpackage.qi3
    public final void V(boolean r2) {
        z1();
        w1(1, r2);
    }

    @Override // defpackage.qi3
    public final long X() {
        z1();
        return this.m0;
    }

    @Override // defpackage.fq
    public final void X0(int r11, int r12, long r13, boolean r15) {
        z1();
        if (r11 != (-1)) goto L6;
        return;
    L6:
        if (r11 < 0) goto L8;
        boolean r4 = true;
    L9:
        rr2.l(r4);
        cu4 r5 = this.p0.a;
        if (r5.p() == false) goto L12;
    L14:
        nj0 r6 = this.t;
        if (r6.v == true) goto L17;
        q9 r7 = r6.W();
        r6.v = true;
        r6.b0(r7, -1, new oi0(20));
    L17:
        this.K++;
        if (k() == false) goto L21;
        l93.q0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        n41 r1 = new n41(this.p0);
        r1.e(1);
        i41 r0 = this.l.o;
        r0.k.d(new k6(24, r0, r1));
        return;
    L21:
        ph3 r2 = this.p0;
        int r3 = r2.e;
        if (r3 != 3) goto L24;
    L27:
        r2 = this.p0.h(2);
    L28:
        int r8 = o0();
        ph3 r9 = l1(r2, r5, m1(r11, r13, r5));
        this.m.u.b(3, new p41(r11, f35.Q(r13), r5)).b();
        x1(r9, 0, true, 1, g1(r9), r8, r15);
        return;
    L24:
        if (r3 != 4) goto L28;
        if (r5.p() == true) goto L28;
    L12:
        if (r11 < r5.o()) goto L14;
        return;
    L8:
        r4 = false;
        goto L9
    }

    @Override // defpackage.qi3
    public final long Z() {
        z1();
        return f1(this.p0);
    }

    public final ph3 Z0(ph3 r10, int r11, ArrayList r12) {
        cu4 r1 = r10.a;
        this.K++;
        ArrayList r6 = new ArrayList();
        int r0 = 0;
    L4:
        if (r0 >= r12.size()) goto L6;
        bu2 r2 = new bu2((bq) r12.get(r0), this.r);
        r6.add(r2);
        f41 r4 = new f41(r2.b, r2.a);
        this.q.add(r0 + r11, r4);
        r0 = r0 + 1;
        goto L4
    L6:
        this.Q = this.Q.a(r11, r6.size());
        tm3 r3 = b1();
        ph3 r9 = l1(r10, r3, i1(r1, r3, h1(r10), f1(r10)));
        pd4 r5 = this.Q;
        yp4 r13 = this.m.u;
        l41 r7 = new l41(r6, r5, -1, -9223372036854775807L);
        r13.getClass();
        xp4 r14 = yp4.c();
        r14.a = r13.a.obtainMessage(18, r11, 0, r7);
        r14.b();
        return r9;
    }

    @Override // defpackage.qi3
    public final void a0() {
        z1();
        if (this.b0 != 0.0f) goto L8;
        float r0 = this.c0;
        if (r0 == 0.0f) goto L9;
        R(r0);
        return;
    L9:
        return;
    }

    public final do2 a1() {
        cu4 r0 = x0();
        if (r0.p() == true) goto L5;
        gn2 r1 = r0.m(o0(), this.b, 0).b;
        co2 r5 = this.o0.a();
        r5.b(r1.d);
        return new do2(r5);
    L5:
        return this.o0;
    }

    @Override // defpackage.qi3
    public final void b() {
        z1();
        ph3 r0 = this.p0;
        if (r0.e == 1) goto L5;
        return;
    L5:
        ph3 r1 = r0.f(null);
        if (r1.a.p() == false) goto L8;
        int r2 = 4;
    L9:
        ph3 r4 = k1(r1, r2);
        this.K++;
        this.m.u.a(29).b();
        x1(r4, 1, false, 5, -9223372036854775807L, -1, false);
        return;
    L8:
        r2 = 2;
        goto L9
    }

    @Override // defpackage.qi3
    public final long b0() {
        z1();
        if (k() == false) goto L11;
        ph3 r0 = this.p0;
        if (r0.k.equals(r0.b) == false) goto L9;
        return f35.i0(this.p0.q);
    L9:
        return getDuration();
    L11:
        return F0();
    }

    public final tm3 b1() {
        return new tm3(this.q, this.Q);
    }

    public final ArrayList c1(List r5) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L6;
        gn2 r2 = (gn2) r5.get(r1);
        r0.add(this.s.d(r2));
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    @Override // defpackage.qi3
    public final void d(qh3 r11) {
        z1();
        if (this.p0.o.equals(r11) == false) goto L5;
        return;
    L5:
        ph3 r2 = this.p0.g(r11);
        this.K++;
        this.m.u.b(4, r11).b();
        x1(r2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final void d0(int r1) {
        z1();
    }

    public final sk3 d1(rk3 r8) {
        int r0 = h1(this.p0);
        cu4 r4 = this.p0.a;
        if (r0 != (-1)) goto L5;
        r0 = 0;
    L5:
        q41 r2 = this.m;
        return new sk3(r2, r8, r4, r0, r2.w);
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        z1();
        return (jw4) this.p0.i.r;
    }

    public final int e1() {
        z1();
        c6 r2 = this.D;
        r2.getClass();
        Looper r0 = Looper.myLooper();
        if (r0 != ((yp4) r2.c).a.getLooper()) goto L6;
        Object r3 = r2.e;
    L11:
        return ((Integer) r3).intValue();
    L6:
        if (r0 != ((yp4) r2.b).a.getLooper()) goto L8;
        boolean r1 = true;
    L9:
        rr2.w(r1);
        r3 = r2.f;
        goto L11
    L8:
        r1 = false;
        goto L9
    }

    @Override // defpackage.qi3
    public final boolean f() {
        z1();
        return this.p0.g;
    }

    public final long f1(ph3 r8) {
        mt2 r0 = r8.b;
        long r1 = r8.c;
        cu4 r3 = r8.a;
        if (r0.b() == false) goto L11;
        Object r2 = r8.b.a;
        zt4 r4 = this.p;
        r3.g(r2, r4);
        if (r1 == (-9223372036854775807L)) goto L7;
        long r7 = f35.i0(r4.e);
        return f35.i0(r1) + r7;
    L7:
        return f35.i0(r3.m(h1(r8), this.b, 0).k);
    L11:
        return f35.i0(g1(r8));
    }

    @Override // defpackage.qi3
    public final int g() {
        z1();
        return this.p0.e;
    }

    @Override // defpackage.qi3
    public final do2 g0() {
        z1();
        return this.T;
    }

    public final long g1(ph3 r4) {
        if (r4.a.p() == false) goto L7;
        return f35.Q(this.r0);
    L7:
        if (r4.p == false) goto L9;
        long r0 = r4.l();
    L11:
        if (r4.b.b() == false) goto L13;
        return r0;
    L13:
        cu4 r2 = r4.a;
        Object r5 = r4.b.a;
        zt4 r3 = this.p;
        r2.g(r5, r3);
        return r0 + r3.e;
    L9:
        r0 = r4.s;
        goto L11
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        z1();
        if (k() == false) goto L7;
        ph3 r0 = this.p0;
        mt2 r1 = r0.b;
        cu4 r2 = r0.a;
        Object r3 = r1.a;
        zt4 r4 = this.p;
        r2.g(r3, r4);
        return f35.i0(r4.a(r1.b, r1.c));
    L7:
        return x();
    }

    @Override // defpackage.qi3
    public final int h() {
        z1();
        return this.I;
    }

    public final int h1(ph3 r2) {
        if (r2.a.p() == false) goto L7;
        return this.q0;
    L7:
        return r2.a.g(r2.b.a, this.p).c;
    }

    @Override // defpackage.qi3
    public final qh3 i() {
        z1();
        return this.p0.o;
    }

    @Override // defpackage.qi3
    public final jg0 i0() {
        z1();
        return this.e0;
    }

    public final Pair i1(cu4 r18, tm3 r19, int r20, long r21) {
        long r8 = -9223372036854775807L;
        int r10 = -1;
        if (r18.p() == true) goto L17;
        if (r19.p() == true) goto L17;
        zt4 r13 = this.p;
        long r15 = f35.Q(r21);
        Pair r1 = r18.i(this.b, r13, r20, r15);
        Object r5 = r1.first;
        if (r19.b(r5) == (-1)) goto L10;
        return r1;
    L10:
        int r3 = this.I;
        boolean r4 = this.J;
        int r2 = q41.U(this.b, this.p, r3, r4, r5, r18, r19);
        if (r2 == (-1)) goto L15;
        bu4 r6 = this.b;
        r19.m(r2, r6, 0);
        return m1(r2, f35.i0(r6.k), r19);
    L15:
        return m1(-1, -9223372036854775807L, r19);
    L17:
        if (r18.p() == false) goto L19;
    L21:
        boolean r7 = false;
    L22:
        if (r7 == true) goto L25;
        r10 = r20;
    L25:
        if (r7 == true) goto L29;
        r8 = r21;
    L29:
        return m1(r10, r8, r19);
    L19:
        if (r19.p() == false) goto L21;
        r7 = true;
        goto L22
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        z1();
        return this.N;
    }

    @Override // defpackage.qi3
    public final int j() {
        z1();
        return 0;
    }

    @Override // defpackage.qi3
    public final boolean k() {
        z1();
        return this.p0.b.b();
    }

    @Override // defpackage.qi3
    public final void k0(il r5, boolean r6) {
        z1();
        if (this.i0 == false) goto L5;
        return;
    L5:
        boolean r0 = Objects.equals(this.a0, r5);
        tc2 r2 = this.n;
        if (r0 == true) goto L8;
        this.a0 = r5;
        q1(1, 3, r5);
        r2.c(20, new x31(r5, 0));
    L8:
        il r7 = this.a0;
        yp4 r4 = this.m.u;
        r4.getClass();
        xp4 r1 = yp4.c();
        r1.a = r4.a.obtainMessage(31, r6 ? 1 : 0, 0, r7);
        r1.b();
        r2.b();
    }

    @Override // defpackage.qi3
    public final void l0(do2 r2) {
        z1();
        r2.getClass();
        if (r2.equals(this.T) == false) goto L5;
        return;
    L5:
        this.T = r2;
        u31 r3 = new u31(this, 4);
        this.n.f(15, r3);
    }

    public final ph3 l1(ph3 r23, cu4 r24, Pair r25) {
        if (r24.p() == true) goto L7;
        if (r25 != null) goto L7;
        boolean r3 = false;
    L8:
        rr2.l(r3);
        cu4 r6 = r23.a;
        long r7 = f1(r23);
        ph3 r9 = r23.j(r24);
        if (r24.p() == false) goto L12;
        mt2 r10 = ph3.u;
        long r11 = f35.Q(this.r0);
        ph3 r0 = r9.d(r10, r11, r11, r11, 0, tv4.d, this.c, gy3.r).c(r10);
        r0.q = r0.s;
        return r0;
    L12:
        Object r4 = r9.b.a;
        String r12 = f35.a;
        boolean r13 = r4.equals(r25.first);
        if (r13 == true) goto L15;
        mt2 r14 = new mt2(r25.first);
    L16:
        long r15 = ((Long) r25.second).longValue();
        long r8 = f35.Q(r7);
        if (r6.p() == true) goto L25;
        r8 = r8 - r6.g(r4, this.p).e;
        if (r13 == false) goto L25;
        if ((r8 - r15) != 1) goto L25;
        if (r8 != r6.g(r4, this.p).d) goto L25;
        r8 = r8 - 1;
    L25:
        if (r13 == true) goto L27;
    L28:
        mt2 r16 = r14;
        rr2.w(!r16.b());
        if (r13 == true) goto L52;
        tv4 r2 = tv4.d;
    L51:
        tv4 r19 = r2;
        if (r13 == true) goto L56;
        ew4 r1 = this.c;
    L55:
        ew4 r20 = r1;
        if (r13 == true) goto L60;
        vw1 r5 = yw1.o;
        List r17 = gy3.r;
    L61:
        ph3 r18 = r9.d(r16, r15, r15, r15, 0, r19, r20, r17).c(r16);
        r18.q = r15;
        return r18;
    L60:
        r17 = r9.j;
        goto L61
    L56:
        r1 = r9.i;
        goto L55
    L52:
        r2 = r9.h;
        goto L51
    L27:
        if (r15 < r8) goto L28;
        if (r15 != r8) goto L43;
        int r21 = r24.b(r9.k.a);
        if (r21 != (-1)) goto L33;
    L36:
        r24.g(r14.a, this.p);
        boolean r22 = r14.b();
        zt4 r26 = this.p;
        if (r22 == false) goto L40;
        long r27 = r26.a(r14.b, r14.c);
    L39:
        mt2 r110 = r14;
        ph3 r28 = r9.d(r110, r9.s, r9.s, r9.d, r27 - r9.s, r9.h, r9.i, r9.j).c(r110);
        r28.q = r27;
        return r28;
    L40:
        r27 = r26.d;
        goto L39
    L33:
        if (r24.f(r21, this.p, false).c != r24.g(r14.a, this.p).c) goto L36;
        return r9;
    L43:
        mt2 r111 = r14;
        rr2.w(!r111.b());
        long r112 = Math.max(0, r9.r - (r15 - r8));
        long r29 = r9.q;
        if (r9.k.equals(r9.b) == false) goto L46;
        r29 = r15 + r112;
    L46:
        ph3 r30 = r9.d(r111, r15, r15, r15, r112, r9.h, r9.i, r9.j);
        r30.q = r29;
        return r30;
    L15:
        r14 = r9.b;
    L7:
        r3 = true;
        goto L8
    }

    @Override // defpackage.qi3
    public final long m() {
        z1();
        return f35.i0(this.p0.r);
    }

    public final Pair m1(int r7, long r8, cu4 r10) {
        if (r10.p() == false) goto L10;
        this.q0 = r7;
        if (r8 != (-9223372036854775807L)) goto L7;
        r8 = 0;
    L7:
        this.r0 = r8;
        return null;
    L10:
        if (r7 != (-1)) goto L12;
    L15:
        r7 = r10.a(this.J);
        r8 = f35.i0(r10.m(r7, this.b, 0).k);
    L14:
        int r3 = r7;
        return r10.i(this.b, this.p, r3, f35.Q(r8));
    L12:
        if (r7 < r10.o()) goto L14;
        goto L14
    }

    @Override // defpackage.qi3
    public final int n0() {
        z1();
        if (k() == true) goto L5;
        return -1;
    L5:
        return this.p0.b.b;
    }

    public final void n1(int r4, int r5) {
        pf4 r0 = this.Z;
        if (r4 == r0.a) goto L5;
    L8:
        this.Z = new pf4(r4, r5);
        v31 r1 = new v31(r4, r5, 0);
        this.n.f(24, r1);
        q1(2, 14, new pf4(r4, r5));
        return;
    L5:
        if (r5 != r0.b) goto L8;
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        z1();
        return this.R;
    }

    @Override // defpackage.qi3
    public final int o0() {
        z1();
        int r1 = h1(this.p0);
        if (r1 != (-1)) goto L6;
        return 0;
    L6:
        return r1;
    }

    public final ph3 o1(ph3 r18, int r19, int r20) {
        int r3 = h1(r18);
        long r4 = f1(r18);
        cu4 r14 = r18.a;
        this.K++;
        int r1 = r20 - 1;
    L3:
        if (r1 < r19) goto L5;
        this.q.remove(r1);
        r1 = r1 - 1;
        goto L3
    L5:
        pd4 r2 = this.Q;
        int r5 = r20 - r19;
        int[] r10 = r2.b;
        int[] r11 = new int[r10.length - r5];
        int r12 = 0;
        int r13 = 0;
    L7:
        if (r12 >= r10.length) goto L17;
        int r15 = r10[r12];
        if (r15 < r19) goto L12;
        if (r15 >= r20) goto L12;
        r13 = r13 + 1;
    L16:
        r12 = r12 + 1;
    L12:
        int r16 = r12 - r13;
        if (r15 < r19) goto L15;
        r15 = r15 - r5;
    L15:
        r11[r16] = r15;
        goto L16
    L17:
        this.Q = new pd4(r11, new Random(r2.a.nextLong()));
        tm3 r17 = b1();
        ph3 r6 = l1(r18, r17, i1(r14, r17, r3, r4));
        int r7 = r6.e;
        if (r7 != 1) goto L20;
    L26:
        pd4 r8 = this.Q;
        yp4 r0 = this.m.u;
        r0.getClass();
        xp4 r9 = yp4.c();
        r9.a = r0.a.obtainMessage(20, r19, r20, r8);
        r9.b();
        return r6;
    L20:
        if (r7 == 4) goto L26;
        if (r3 < r19) goto L26;
        if (r3 >= r20) goto L26;
        Object r110 = r18.b.a;
        if (q41.U(this.b, this.p, this.I, this.J, r110, r14, r17) != (-1)) goto L26;
        r6 = k1(r6, 4);
        goto L26
    }

    @Override // defpackage.qi3
    public final void p0(int r5) {
        z1();
        if (this.I == r5) goto L6;
        this.I = r5;
        yp4 r0 = this.m.u;
        r0.getClass();
        xp4 r1 = yp4.c();
        r1.a = r0.a.obtainMessage(11, r5, 0);
        r1.b();
        ij0 r2 = new ij0(r5, 1);
        tc2 r6 = this.n;
        r6.c(8, r2);
        v1();
        r6.b();
        return;
    }

    public final void p1() {
        SurfaceHolder r0 = this.W;
        if (r0 == null) goto L6;
        r0.removeCallback(this.x);
        this.W = null;
        return;
    }

    @Override // defpackage.qi3
    public final boolean q() {
        z1();
        return this.p0.l;
    }

    @Override // defpackage.qi3
    public final void q0(boolean r1) {
        z1();
    }

    public final void q1(int r7, int r8, Object r9) {
        kq[] r0 = this.h;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L11;
        kq r5 = r0[r3];
        if (r7 != (-1)) goto L8;
    L9:
        sk3 r4 = d1(r5);
        rr2.w(!r4.f);
        r4.c = r8;
        rr2.w(!r4.f);
        r4.d = r9;
        r4.b();
    L10:
        r3 = r3 + 1;
        goto L4
    L8:
        if (r5.o != r7) goto L10;
    L11:
        kq[] r6 = this.i;
        int r10 = r6.length;
    L12:
        if (r2 >= r10) goto L20;
        kq r11 = r6[r2];
        if (r11 == null) goto L19;
        if (r7 != (-1)) goto L17;
    L18:
        sk3 r12 = d1(r11);
        rr2.w(!r12.f);
        r12.c = r8;
        rr2.w(!r12.f);
        r12.d = r9;
        r12.b();
        goto L19
    L17:
        if (r11.o == r7) goto L18;
    L19:
        r2 = r2 + 1;
        goto L12
    }

    @Override // defpackage.qi3
    public final void r0(oi3 r1) {
        z1();
        r1.getClass();
        this.n.e(r1);
    }

    public final void r1(ArrayList r15, int r16, long r17, boolean r19) {
        int r1 = r16;
        int r2 = h1(this.p0);
        long r3 = M0();
        this.K++;
        ArrayList r5 = this.q;
        r5.clear();
        ArrayList r8 = new ArrayList();
        int r7 = 0;
    L4:
        if (r7 >= r15.size()) goto L6;
        bu2 r9 = new bu2((bq) r15.get(r7), this.r);
        r8.add(r9);
        r5.add(r7, new f41(r9.b, r9.a));
        r7 = r7 + 1;
        goto L4
    L6:
        pd4 r6 = this.Q;
        int r10 = r8.size();
        r6.getClass();
        this.Q = new pd4(new Random(r6.a.nextLong())).a(0, r10);
        tm3 r11 = b1();
        int r12 = r11.g;
        if (r11.p() == true) goto L13;
        if (r1 < r12) goto L13;
        throw new IllegalSeekPositionException();
    L13:
        if (r19 == false) goto L16;
        r1 = r11.a(this.J);
        long r4 = -9223372036854775807L;
    L15:
        int r13 = r1;
    L19:
        ph3 r14 = l1(this.p0, r11, m1(r13, r4, r11));
        int r18 = r14.e;
        if (r18 != 1) goto L23;
        r18 = 1;
    L30:
        ph3 r20 = k1(r14, r18);
        long r110 = f35.Q(r4);
        this.m.u.b(17, new l41(r8, this.Q, r13, r110)).b();
        if (this.p0.b.a.equals(r20.b.a) == false) goto L33;
    L35:
        boolean r21 = false;
    L36:
        x1(r20, 0, r21, 4, g1(r20), -1, false);
        return;
    L33:
        if (this.p0.a.p() == true) goto L35;
        r21 = true;
        goto L36
    L23:
        if (r11.p() == false) goto L25;
    L24:
        r18 = 4;
        goto L30
    L25:
        if (r13 == (-1)) goto L30;
        if (r13 >= r12) goto L24;
        r18 = 2;
        goto L30
    L16:
        if (r1 != (-1)) goto L18;
        r13 = r2;
        r4 = r3;
        goto L19
    L18:
        r4 = r17;
        goto L15
    }

    @Override // defpackage.qi3
    public final void s(boolean r5) {
        z1();
        if (this.J == r5) goto L6;
        this.J = r5;
        yp4 r0 = this.m.u;
        r0.getClass();
        xp4 r1 = yp4.c();
        r1.a = r0.a.obtainMessage(12, r5 ? 1 : 0, 0);
        r1.b();
        t31 r2 = new t31(0, r5);
        tc2 r6 = this.n;
        r6.c(9, r2);
        v1();
        r6.b();
        return;
    }

    public final void s1(pd4 r14) {
        z1();
        if (r14.b.length != this.q.size()) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.Q = r14;
        tm3 r1 = b1();
        ph3 r5 = l1(this.p0, r1, m1(o0(), M0(), r1));
        this.K++;
        this.m.u.b(21, r14).b();
        x1(r5, 0, false, 5, -9223372036854775807L, -1, false);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput r3) {
        z1();
        q1(4, 15, r3);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean r7) {
        z1();
        if (r7 != this.N) goto L5;
        return;
    L5:
        this.N = r7;
        i74 r0 = this.P;
        if (r0.a.isEmpty() == true) goto L18;
        pn0 r1 = this.j;
        r1.getClass();
        jn0 r2 = r1.d();
        if (r7 == false) goto L14;
        this.O = r2.I;
        jx1 r3 = r0.a;
        bw4 r4 = r2.a();
        o15 r5 = r3.h();
    L11:
        if (r5.hasNext() == false) goto L13;
        r4.l(((Integer) r5.next()).intValue(), true);
        goto L11
    L13:
        cw4 r6 = r4.b();
    L16:
        if (r6.equals(r2) == true) goto L18;
        r1.j(r6);
        goto L18
    L14:
        r2.getClass();
        in0 r8 = new in0(r2);
        r8.m(this.O);
        jn0 r9 = new jn0(r8);
        this.O = null;
        r6 = r9;
    L18:
        this.m.u.b(36, Boolean.valueOf(r7)).b();
        ph3 r10 = this.p0;
        boolean r11 = r10.l;
        w1(r10.m, r11);
    }

    @Override // defpackage.qi3
    public final void stop() {
        z1();
        u1(null);
        gy3 r1 = gy3.r;
        this.e0 = new jg0(this.p0.s, r1);
    }

    public final void t1(Surface r11) {
        Object r0 = this.U;
        boolean r1 = true;
        if (r0 == null) goto L6;
        if (r0 == r11) goto L6;
        boolean r2 = true;
    L8:
        if (r2 == false) goto L10;
        long r4 = this.C;
    L11:
        q41 r6 = this.m;
        if (r6.X == false) goto L14;
    L19:
        if (r2 == false) goto L23;
        Object r3 = this.U;
        Surface r5 = this.V;
        if (r3 != r5) goto L23;
        r5.release();
        this.V = null;
    L23:
        this.U = r11;
        if (r1 == true) goto L27;
        u1(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        return;
    L27:
        return;
    L14:
        if (r6.w.getThread().isAlive() == false) goto L19;
        q90 r7 = new q90(r6.D);
        r6.u.b(30, new Pair(r11, r7)).b();
        if (r4 == (-9223372036854775807L)) goto L19;
        r1 = r7.c(r4);
        goto L19
    L10:
        r4 = -9223372036854775807L;
    L6:
        r2 = false;
        goto L8
    }

    @Override // defpackage.qi3
    public final long u() {
        z1();
        return this.n0;
    }

    @Override // defpackage.qi3
    public final void u0(int r11, int r12, int r13) {
        z1();
        if (r11 < 0) goto L7;
        if (r11 > r12) goto L7;
        if (r13 < 0) goto L7;
        boolean r4 = true;
    L8:
        rr2.l(r4);
        ArrayList r5 = this.q;
        int r6 = r5.size();
        int r7 = Math.min(r12, r6);
        int r8 = Math.min(r13, r6 - (r7 - r11));
        if (r11 >= r6) goto L15;
        if (r11 == r7) goto L16;
        if (r11 == r8) goto L17;
        cu4 r1 = x0();
        this.K++;
        f35.P(r5, r11, r7, r8);
        pd4 r2 = this.Q;
        r2.getClass();
        this.Q = r2;
        tm3 r3 = b1();
        ph3 r9 = this.p0;
        ph3 r10 = l1(r9, r3, i1(r1, r3, h1(r9), f1(this.p0)));
        pd4 r14 = this.Q;
        q41 r15 = this.m;
        r15.getClass();
        r15.u.b(19, new m41(r11, r7, r8, r14)).b();
        x1(r10, 0, false, 5, -9223372036854775807L, -1, false);
        return;
    L17:
        return;
    L16:
        return;
    L15:
        return;
    L7:
        r4 = false;
        goto L8
    }

    public final void u1(ExoPlaybackException r12) {
        ph3 r0 = this.p0;
        ph3 r1 = r0.c(r0.b);
        r1.q = r1.s;
        r1.r = 0;
        ph3 r2 = k1(r1, 1);
        if (r12 == null) goto L5;
        r2 = r2.f(r12);
    L5:
        this.K++;
        this.m.u.a(6).b();
        x1(r2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final void v(oi3 r1) {
        r1.getClass();
        this.n.a(r1);
    }

    @Override // defpackage.qi3
    public final int v0() {
        z1();
        return this.p0.n;
    }

    public final void v1() {
        mi3 r0 = this.R;
        String r1 = f35.a;
        i41 r2 = this.g;
        boolean r3 = r2.k();
        boolean r4 = r2.R0();
        boolean r5 = r2.I();
        boolean r6 = r2.f0();
        boolean r7 = r2.V0();
        boolean r8 = r2.T0();
        boolean r9 = r2.x0().p();
        boolean r10 = true;
        zg5 r11 = new zg5(1);
        xk0 r12 = (xk0) r11.n;
        r12.c(this.d.a);
        boolean r13 = !r3;
        r11.k(4, r13);
        if (r4 == false) goto L6;
        if (r3 == true) goto L6;
        boolean r14 = true;
    L7:
        r11.k(5, r14);
        if (r5 == false) goto L11;
        if (r3 == true) goto L11;
        boolean r15 = true;
    L12:
        r11.k(6, r15);
        if (r9 == true) goto L19;
        if (r5 == true) goto L17;
        if (r7 == false) goto L17;
        if (r4 == false) goto L19;
    L17:
        if (r3 == true) goto L19;
        boolean r16 = true;
    L20:
        r11.k(7, r16);
        if (r6 == false) goto L24;
        if (r3 == true) goto L24;
        boolean r17 = true;
    L25:
        r11.k(8, r17);
        if (r9 == true) goto L32;
        if (r6 == true) goto L30;
        if (r7 == false) goto L32;
        if (r8 == false) goto L32;
    L30:
        if (r3 == true) goto L32;
        boolean r18 = true;
    L33:
        r11.k(9, r18);
        r11.k(10, r13);
        if (r4 == false) goto L37;
        if (r3 == true) goto L37;
        boolean r19 = true;
    L38:
        r11.k(11, r19);
        if (r4 == false) goto L42;
        if (r3 == true) goto L42;
    L43:
        r11.k(12, r10);
        mi3 r20 = new mi3(r12.f());
        this.R = r20;
        if (r20.equals(r0) == true) goto L47;
        this.n.c(13, new u31(this, 3));
        return;
    L47:
        return;
    L42:
        r10 = false;
    L37:
        r19 = false;
    L32:
        r18 = false;
    L24:
        r17 = false;
    L19:
        r16 = false;
    L11:
        r15 = false;
    L6:
        r14 = false;
        goto L7
    }

    public final void w1(int r14, boolean r15) {
        if (this.N == false) goto L6;
        int r0 = 4;
    L10:
        ph3 r3 = this.p0;
        if (r3.l == r15) goto L13;
    L17:
        this.K++;
        if (r3.p == false) goto L20;
        r3 = r3.a();
    L20:
        ph3 r5 = r3.e(r14, r0, r15);
        int r16 = r14 | (r0 << 4);
        yp4 r1 = this.m.u;
        r1.getClass();
        xp4 r2 = yp4.c();
        r2.a = r1.a.obtainMessage(1, r15 ? 1 : 0, r16);
        r2.b();
        x1(r5, 0, false, 5, -9223372036854775807L, -1, false);
        return;
    L13:
        if (r3.n != r0) goto L17;
        if (r3.m != r14) goto L17;
        return;
    L6:
        if (this.p0.n != 1) goto L9;
        if (r15 == true) goto L9;
        r0 = 1;
    L9:
        r0 = 0;
        goto L10
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        z1();
        return this.p0.a;
    }

    public final void x1(final ph3 r35, int r36, boolean r37, int r38, long r39, int r41, boolean r42) {
        ph3 r3 = this.p0;
        this.p0 = r35;
        boolean r4 = r3.a.equals(r35.a);
        bu4 r5 = this.b;
        zt4 r6 = this.p;
        cu4 r9 = r3.a;
        mt2 r10 = r3.b;
        cu4 r11 = r35.a;
        mt2 r12 = r35.b;
        int r16 = 0;
        if (r11.p() == false) goto L8;
        if (r9.p() == false) goto L8;
        Pair r7 = new Pair(Boolean.FALSE, -1);
    L35:
        boolean r8 = ((Boolean) r7.first).booleanValue();
        int r13 = ((Integer) r7.second).intValue();
        if (r8 == true) goto L38;
        gn2 r14 = null;
    L43:
        if (r8 == false) goto L45;
    L46:
        co2 r15 = this.o0.a();
        List r17 = r35.j;
        int r18 = 0;
    L48:
        if (r18 >= r17.size()) goto L54;
        qv2 r19 = (qv2) r17.get(r18);
        int r110 = 0;
    L50:
        pv2[] r20 = r19.a;
        if (r110 >= r20.length) goto L53;
        r20[r110].b(r15);
        r110 = r110 + 1;
        goto L50
    L53:
        r18 = r18 + 1;
        goto L48
    L54:
        this.o0 = new do2(r15);
    L55:
        do2 r21 = a1();
        boolean r22 = r21.equals(this.S);
        this.S = r21;
        if (r3.l == r35.l) goto L58;
        boolean r23 = true;
    L60:
        if (r3.e == r35.e) goto L62;
        boolean r111 = true;
    L63:
        if (r111 == true) goto L65;
        if (r23 == true) goto L65;
    L67:
        if (r3.g == r35.g) goto L69;
        boolean r112 = true;
    L70:
        if (r4 == true) goto L72;
        this.n.c(0, new q31(r36, r16, r35));
    L72:
        if (r37 == false) goto L102;
        zt4 r24 = new zt4();
        if (r3.a.p() == true) goto L76;
        Object r113 = r3.b.a;
        r3.a.g(r113, r24);
        int r114 = r24.c;
        int r115 = r3.a.b(r113);
        Object r25 = r3.a.m(r114, this.b, 0).a;
        gn2 r26 = this.b.b;
        Object r27 = r113;
        int r28 = r114;
        int r29 = r115;
    L77:
        mt2 r30 = r3.b;
        if (r38 != 0) goto L89;
        boolean r31 = r30.b();
        mt2 r32 = r3.b;
        if (r31 == false) goto L83;
        long r33 = r24.a(r32.b, r32.c);
        long r116 = j1(r3);
    L92:
        long r210 = f35.i0(r33);
        long r34 = f35.i0(r116);
        mt2 r40 = r3.b;
        pi3 r211 = new pi3(r25, r28, r26, r27, r29, r210, r34, r40.b, r40.c);
        bu4 r43 = this.b;
        int r44 = o0();
        int r117 = y();
        if (this.p0.a.p() == true) goto L96;
        ph3 r118 = this.p0;
        Object r119 = r118.b.a;
        r118.a.g(r119, this.p);
        r117 = this.p0.a.b(r119);
        Object r120 = this.p0.a.m(r44, r43, 0).a;
        gn2 r212 = r43.b;
        Object r213 = r119;
        Object r214 = r120;
    L95:
        int r215 = r117;
        long r216 = f35.i0(r39);
        if (this.p0.b.b() == false) goto L100;
        long r310 = f35.i0(j1(this.p0));
    L101:
        mt2 r45 = this.p0.b;
        int r121 = 0;
        this.n.c(11, new z31(r38, r211, new pi3(r214, r44, r212, r213, r215, r216, r310, r45.b, r45.c), 0));
    L103:
        if (r8 == false) goto L105;
        this.n.c(1, new a41(r14, r13, r121));
    L105:
        final int r46 = 7;
        if (r3.f == r35.f) goto L110;
        this.n.c(10, new s31(r35, r46));
        if (r35.f == null) goto L110;
        final int r47 = 8;
        this.n.c(10, new s31(r35, r47));
    L110:
        ew4 r2 = r3.i;
        ew4 r48 = r35.i;
        if (r2 == r48) goto L113;
        pn0 r49 = this.j;
        Object r50 = r48.s;
        r49.getClass();
        gg2 r51 = (gg2) r50;
        final int r52 = 9;
        this.n.c(2, new s31(r35, r52));
    L113:
        if (r22 == true) goto L115;
        final int r122 = 0;
        this.n.c(14, new r31(this.S, r122));
    L116:
        if (r112 == false) goto L118;
        this.n.c(3, new s31(r35, r122));
    L118:
        if (r111 == true) goto L120;
        if (r23 == true) goto L120;
    L121:
        final int r53 = 4;
        if (r111 == false) goto L124;
        final int r54 = 2;
        this.n.c(4, new s31(r35, r54));
    L124:
        final int r55 = 5;
        if (r23 == false) goto L127;
    L128:
        final int r56 = 3;
        this.n.c(5, new s31(r35, r56));
    L129:
        final int r57 = 6;
        if (r3.n == r35.n) goto L133;
        this.n.c(6, new s31(r35, r53));
    L133:
        if (r3.m() == r35.m()) goto L136;
        this.n.c(7, new s31(r35, r55));
    L136:
        if (r3.o.equals(r35.o) == true) goto L138;
        this.n.c(12, new s31(r35, r57));
    L138:
        v1();
        this.n.b();
        if (r3.p == r35.p) goto L144;
        Iterator r0 = this.o.iterator();
    L142:
        if (r0.hasNext() == false) goto L148;
        ((d41) r0.next()).n.y1();
        goto L142
    L148:
        return;
    L144:
        return;
    L127:
        if (r3.m == r35.m) goto L129;
    L120:
        final int r58 = 1;
        this.n.c(-1, new s31(r35, r58));
        goto L121
    L115:
        r122 = 0;
        goto L116
    L100:
        r310 = r216;
        goto L101
    L96:
        r214 = null;
        r212 = null;
        r213 = null;
        goto L95
    L83:
        if (r32.e == (-1)) goto L86;
        r33 = j1(this.p0);
    L85:
        r116 = r33;
        goto L92
    L86:
        long r59 = r24.e;
        long r123 = r24.d;
    L87:
        r33 = r59 + r123;
        goto L85
    L89:
        if (r30.b() == false) goto L91;
        r33 = r3.s;
        r116 = j1(r3);
        goto L92
    L91:
        r59 = r24.e;
        r123 = r3.s;
        goto L87
    L76:
        r28 = r41;
        r29 = r28;
        r25 = null;
        r26 = null;
        r27 = null;
        goto L77
    L102:
        r8 = r8;
        r22 = r22;
        r111 = r111;
        r121 = 0;
        goto L103
    L69:
        r112 = false;
    L65:
        y1();
        goto L67
    L62:
        r111 = false;
        goto L63
    L58:
        r23 = false;
        goto L60
    L45:
        if (r3.j.equals(r35.j) == true) goto L55;
    L38:
        if (r35.a.p() == true) goto L40;
        r14 = r35.a.m(r35.a.g(r35.b.a, this.p).c, this.b, 0).b;
    L41:
        this.o0 = do2.K;
        goto L43
    L40:
        r14 = null;
    L8:
        if (r11.p() == r9.p()) goto L11;
        r7 = new Pair(Boolean.TRUE, 3);
        goto L35
    L11:
        if (r9.m(r9.g(r10.a, r6).c, r5, 0).a.equals(r11.m(r11.g(r12.a, r6).c, r5, 0).a) == true) goto L24;
        if (r37 == false) goto L15;
        if (r38 != 0) goto L15;
        int r60 = 1;
    L21:
        r7 = new Pair(Boolean.TRUE, Integer.valueOf(r60));
    L15:
        if (r37 == true) goto L17;
    L19:
        if (r4 == true) goto L22;
        r60 = 3;
        goto L21
    L22:
        tb4.a();
        return;
    L17:
        if (r38 != 1) goto L19;
        r60 = 2;
        goto L21
    L24:
        if (r37 == false) goto L29;
        if (r38 != 0) goto L29;
        if (r10.d >= r12.d) goto L29;
        r7 = new Pair(Boolean.TRUE, 0);
    L29:
        if (r37 == true) goto L31;
    L34:
        r7 = new Pair(Boolean.FALSE, -1);
        goto L35
    L31:
        if (r38 != 1) goto L34;
        if (r42 == false) goto L34;
        r7 = new Pair(Boolean.TRUE, 2);
        goto L35
    }

    @Override // defpackage.qi3
    public final int y() {
        z1();
        if (this.p0.a.p() == false) goto L8;
        int r1 = this.q0;
        if (r1 != (-1)) goto L10;
        return 0;
    L10:
        return r1;
    L8:
        ph3 r2 = this.p0;
        return r2.a.b(r2.b.a);
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        z1();
        return false;
    }

    public final void y1() {
        int r0 = g();
        y10 r1 = this.B;
        y10 r2 = this.A;
        boolean r3 = false;
        if (r0 != 1) goto L5;
    L19:
        r2.k(false);
        r1.k(false);
        return;
    L5:
        if (r0 != 2) goto L7;
    L13:
        z1();
        boolean r4 = this.p0.p;
        if (q() == false) goto L17;
        if (r4 == true) goto L17;
        r3 = true;
    L17:
        r2.k(r3);
        r1.k(q());
        return;
    L7:
        if (r0 == 3) goto L13;
        if (r0 == 4) goto L19;
        tb4.a();
    }

    @Override // defpackage.qi3
    public final s55 z() {
        z1();
        return this.k0;
    }

    public final void z1() {
        this.e.b();
        Thread r0 = Thread.currentThread();
        Looper r1 = this.u;
        if (r0 == r1.getThread()) goto L14;
        String r2 = Thread.currentThread().getName();
        String r3 = r1.getThread().getName();
        String r4 = f35.a;
        Locale r5 = Locale.US;
        String r6 = f34.h("Player is accessed on the wrong thread.\nCurrent thread: '", r2, "'\nExpected thread: '", r3, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
        if (this.f0 == false) goto L7;
        kf2.o(r6);
        return;
    L7:
        if (this.g0 == false) goto L9;
        IllegalStateException r7 = null;
    L10:
        l93.r0("ExoPlayerImpl", r6, r7);
        this.g0 = true;
        return;
    L9:
        r7 = new IllegalStateException();
        goto L10
    }
}
