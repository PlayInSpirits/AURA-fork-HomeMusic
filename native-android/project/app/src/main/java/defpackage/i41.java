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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

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
    public i41(o31 o31Var) throws Throwable {
        i41 i41Var;
        Handler.Callback callback;
        i41 i41Var2;
        int i;
        yc5 yc5Var;
        Looper looper = o31Var.h;
        MediaService mediaService = o31Var.a;
        int i2 = 0;
        Integer num = 0;
        ?? fqVar = new fq();
        fqVar.e = new q90();
        try {
            l93.K("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(fqVar)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");
            vp4 vp4Var = o31Var.b;
            fqVar.f = mediaService.getApplicationContext();
            fqVar.t = new nj0(vp4Var);
            fqVar.h0 = o31Var.i;
            fqVar.a0 = o31Var.j;
            fqVar.Y = o31Var.o;
            fqVar.d0 = false;
            fqVar.C = o31Var.x;
            d41 d41Var = new d41(fqVar);
            fqVar.x = d41Var;
            fqVar.y = new e41();
            kq[] kqVarArrB = ((pm0) o31Var.c.get()).b(new Handler(looper), d41Var, d41Var, d41Var, d41Var);
            fqVar.h = kqVarArrB;
            rr2.w(kqVarArrB.length > 0);
            fqVar.i = new kq[kqVarArrB.length];
            int i3 = 0;
            while (true) {
                kq[] kqVarArr = fqVar.i;
                if (i3 >= kqVarArr.length) {
                    break;
                }
                int i4 = fqVar.h[i3].o;
                kqVarArr[i3] = null;
                i3++;
                i41Var.e.d();
                throw th;
            }
            pn0 pn0Var = (pn0) o31Var.e.get();
            fqVar.j = pn0Var;
            fqVar.s = (lt2) o31Var.d.get();
            cp cpVar = (cp) o31Var.g.get();
            fqVar.v = cpVar;
            fqVar.r = o31Var.p;
            n84 n84Var = o31Var.q;
            fqVar.l0 = o31Var.s;
            fqVar.m0 = o31Var.t;
            fqVar.n0 = o31Var.u;
            fqVar.P = o31Var.r;
            fqVar.u = looper;
            fqVar.w = vp4Var;
            fqVar.g = fqVar;
            fqVar.n = new tc2(looper, vp4Var, new u31(fqVar, i2));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            fqVar.o = copyOnWriteArraySet;
            fqVar.q = new ArrayList();
            fqVar.Q = new pd4();
            kq[] kqVarArr2 = fqVar.h;
            ew4 ew4Var = new ew4(new dz3[kqVarArr2.length], new t41[kqVarArr2.length], jw4.b, null);
            fqVar.c = ew4Var;
            fqVar.p = new zt4();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = iArr[i5];
                rr2.w(!false);
                sparseBooleanArray.append(i6, true);
                i5++;
                num = num;
            }
            Integer num2 = num;
            rr2.w(!false);
            sparseBooleanArray.append(29, true);
            rr2.w(!false);
            w71 w71Var = new w71(sparseBooleanArray);
            fqVar.d = new mi3(w71Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i7 = 0; i7 < w71Var.a.size(); i7++) {
                int iB = w71Var.b(i7);
                rr2.w(!false);
                sparseBooleanArray2.append(iB, true);
            }
            rr2.w(!false);
            sparseBooleanArray2.append(4, true);
            rr2.w(!false);
            sparseBooleanArray2.append(10, true);
            rr2.w(!false);
            fqVar.R = new mi3(new w71(sparseBooleanArray2));
            fqVar.k = vp4Var.a(looper, null);
            u31 u31Var = new u31(fqVar, 1);
            fqVar.l = u31Var;
            fqVar.p0 = ph3.k(ew4Var);
            fqVar.t.c0(fqVar, looper);
            ik3 ik3Var = new ik3(o31Var.E);
            q41 q41Var = new q41(fqVar.f, fqVar.h, fqVar.i, pn0Var, ew4Var, (cd2) o31Var.f.get(), cpVar, fqVar.I, fqVar.J, fqVar.t, n84Var, o31Var.v, o31Var.w, looper, vp4Var, u31Var, ik3Var, fqVar.y, o31Var.F);
            yp4 yp4Var = q41Var.u;
            fqVar.m = q41Var;
            Looper looper2 = q41Var.w;
            fqVar.b0 = 1.0f;
            fqVar.I = 0;
            do2 do2Var = do2.K;
            fqVar.S = do2Var;
            fqVar.T = do2Var;
            fqVar.o0 = do2Var;
            fqVar.q0 = -1;
            fqVar.e0 = jg0.d;
            fqVar.f0 = true;
            fqVar.v(fqVar.t);
            cpVar.L(new Handler(looper), fqVar.t);
            copyOnWriteArraySet.add(fqVar.x);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                try {
                    Context context = fqVar.f;
                    try {
                        boolean z = o31Var.C;
                        yp4 yp4VarA = vp4Var.a(q41Var.w, null);
                        callback = null;
                        try {
                            b41 b41Var = new b41(context, z, this, ik3Var, 0);
                            i41Var2 = this;
                            yp4VarA.d(b41Var);
                        } catch (Throwable th) {
                            th = th;
                            i41Var = this;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i41Var = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i41Var = fqVar;
                }
            } else {
                callback = null;
                i41Var2 = fqVar;
            }
            u31 u31Var2 = new u31(i41Var2, 2);
            c6 c6Var = new c6();
            c6Var.b = vp4Var.a(looper2, callback);
            c6Var.c = vp4Var.a(looper, callback);
            c6Var.e = num2;
            c6Var.f = num2;
            c6Var.d = u31Var2;
            i41Var2.D = c6Var;
            c6Var.v(new a0(27, i41Var2));
            i41 i41Var3 = i41Var2;
            try {
                ll llVar = new ll(mediaService, looper2, o31Var.h, i41Var2.x, vp4Var);
                i41Var3.z = llVar;
                llVar.l(o31Var.n);
                int i9 = o31Var.m ? o31Var.l : (o31Var.y == Integer.MAX_VALUE || o31Var.z == Integer.MAX_VALUE || o31Var.A == Integer.MAX_VALUE || o31Var.B == Integer.MAX_VALUE) ? 0 : 1;
                y10 y10Var = new y10(mediaService, looper2, vp4Var, 3);
                i41Var3.A = y10Var;
                boolean z2 = i9 != 0;
                if (y10Var.b != z2) {
                    y10Var.b = z2;
                    y10Var.h(z2, y10Var.c);
                }
                y10 y10Var2 = new y10(mediaService, looper2, vp4Var, 4);
                i41Var3.B = y10Var2;
                boolean z3 = i9 == 2;
                if (y10Var2.b != z3) {
                    y10Var2.b = z3;
                    y10Var2.i(z3, y10Var2.c);
                }
                i41Var3.j0 = hp0.e;
                i41Var3.k0 = s55.d;
                i41Var3.Z = pf4.c;
                if (i8 >= 34) {
                    yc5 yc5Var2 = new yc5();
                    yc5Var2.p = i41Var3;
                    yc5Var2.n = new WeakReference(mediaService);
                    g41 g41Var = new g41(0, yc5Var2);
                    yc5Var2.o = g41Var;
                    i = 0;
                    mediaService.registerDeviceIdChangeListener(new h41(0, i41Var3.w.a(i41Var3.u, callback)), g41Var);
                    yc5Var = yc5Var2;
                } else {
                    i = 0;
                    yc5Var = callback;
                }
                i41Var3.F = yc5Var;
                i41Var3.G = new qr2(8);
                i41Var3.H = new qr2(8);
                int i10 = i;
                fqVar = i41Var3;
                fqVar.E = new w12(fqVar, i41Var3.x, i41Var3.w, o31Var.y, o31Var.z, o31Var.A, o31Var.B);
                yp4Var.b(38, fqVar.P).b();
                il ilVar = fqVar.a0;
                boolean z4 = o31Var.k;
                yp4Var.getClass();
                xp4 xp4VarC = yp4.c();
                xp4VarC.a = yp4Var.a.obtainMessage(31, z4 ? 1 : 0, i10, ilVar);
                xp4VarC.b();
                fqVar.q1(1, 3, fqVar.a0);
                fqVar.q1(2, 4, Integer.valueOf(fqVar.Y));
                fqVar.q1(2, 5, num2);
                fqVar.q1(1, 9, Boolean.valueOf(fqVar.d0));
                fqVar.q1(6, 8, fqVar.y);
                fqVar.q1(-1, 16, Integer.valueOf(fqVar.h0));
                fqVar.e.d();
            } catch (Throwable th4) {
                th = th4;
                i41Var = i41Var3;
            }
        } catch (Throwable th5) {
            th = th5;
            i41Var = fqVar;
        }
    }

    public static long j1(ph3 ph3Var) {
        bu4 bu4Var = new bu4();
        zt4 zt4Var = new zt4();
        ph3Var.a.g(ph3Var.b.a, zt4Var);
        long j = ph3Var.c;
        return j == -9223372036854775807L ? ph3Var.a.m(zt4Var.c, bu4Var, 0L).k : zt4Var.e + j;
    }

    public static ph3 k1(ph3 ph3Var, int i) {
        ph3 ph3VarH = ph3Var.h(i);
        return (i == 1 || i == 4) ? ph3VarH.b(false) : ph3VarH;
    }

    @Override // defpackage.qi3
    public final void A0() {
        z1();
        if (this.b0 != 0.0f) {
            R(0.0f);
        }
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
    public final void E(int i, boolean z) {
        z1();
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        z1();
        jn0 jn0VarD = this.j.d();
        if (!this.N) {
            return jn0VarD;
        }
        jn0VarD.getClass();
        in0 in0Var = new in0(jn0VarD);
        in0Var.m(this.O);
        return new jn0(in0Var);
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        z1();
        return this.j0;
    }

    @Override // defpackage.qi3
    public final long F0() {
        z1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        ph3 ph3Var = this.p0;
        if (ph3Var.k.d != ph3Var.b.d) {
            return f35.i0(ph3Var.a.m(o0(), this.b, 0L).l);
        }
        long j = ph3Var.q;
        if (this.p0.k.b()) {
            ph3 ph3Var2 = this.p0;
            zt4 zt4VarG = ph3Var2.a.g(ph3Var2.k.a, this.p);
            long jD = zt4VarG.d(this.p0.k.b);
            j = jD == Long.MIN_VALUE ? zt4VarG.d : jD;
        }
        ph3 ph3Var3 = this.p0;
        cu4 cu4Var = ph3Var3.a;
        Object obj = ph3Var3.k.a;
        zt4 zt4Var = this.p;
        cu4Var.g(obj, zt4Var);
        return f35.i0(j + zt4Var.e);
    }

    @Override // defpackage.qi3
    public final void G() {
        z1();
    }

    @Override // defpackage.qi3
    public final void G0(int i) {
        z1();
    }

    @Override // defpackage.qi3
    public final void H(int i, int i2) {
        z1();
    }

    @Override // defpackage.qi3
    public final void J(int i) {
        z1();
    }

    @Override // defpackage.qi3
    public final int K() {
        z1();
        if (k()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        z1();
        return this.S;
    }

    @Override // defpackage.qi3
    public final void L(int i, int i2, List list) {
        z1();
        rr2.l(i >= 0 && i2 >= i);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            int i3 = i;
            while (true) {
                if (i3 >= iMin) {
                    this.K++;
                    yp4 yp4Var = this.m.u;
                    yp4Var.getClass();
                    xp4 xp4VarC = yp4.c();
                    xp4VarC.a = yp4Var.a.obtainMessage(27, i, iMin, list);
                    xp4VarC.b();
                    for (int i4 = i; i4 < iMin; i4++) {
                        f41 f41Var = (f41) arrayList.get(i4);
                        cu4 cu4Var = f41Var.c;
                        gn2 gn2Var = (gn2) list.get(i4 - i);
                        f41Var.c = cu4Var instanceof du4 ? new du4(((du4) cu4Var).e, gn2Var) : new du4(cu4Var, gn2Var);
                    }
                    x1(this.p0.j(b1()), 0, false, 4, -9223372036854775807L, -1, false);
                    return;
                }
                if (!((f41) arrayList.get(i3)).b.k.a((gn2) list.get(i3 - i))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList arrayListC1 = c1(list);
        if (!this.p0.a.p()) {
            ph3 ph3VarO1 = o1(Z0(this.p0, iMin, arrayListC1), i, iMin);
            x1(ph3VarO1, 0, !ph3VarO1.b.a.equals(this.p0.b.a), 4, g1(ph3VarO1), -1, false);
        } else {
            boolean z = this.q0 == -1;
            z1();
            r1(arrayListC1, -1, -9223372036854775807L, z);
        }
    }

    @Override // defpackage.qi3
    public final void L0(List list) {
        z1();
        ArrayList arrayListC1 = c1(list);
        z1();
        r1(arrayListC1, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.qi3
    public final void M(cw4 cw4Var) {
        cw4 cw4VarB;
        z1();
        pn0 pn0Var = this.j;
        pn0Var.getClass();
        cw4 cw4VarE0 = E0();
        if (this.N) {
            this.O = cw4Var.I;
            jx1 jx1Var = this.P.a;
            bw4 bw4VarA = cw4Var.a();
            o15 it = jx1Var.iterator();
            while (it.hasNext()) {
                bw4VarA.l(((Integer) it.next()).intValue(), true);
            }
            cw4VarB = bw4VarA.b();
        } else {
            cw4VarB = cw4Var;
        }
        if (!cw4VarB.equals(pn0Var.d())) {
            pn0Var.j(cw4VarB);
        }
        if (cw4VarE0.equals(cw4Var)) {
            return;
        }
        this.n.f(19, new y31(cw4Var, 0));
    }

    @Override // defpackage.qi3
    public final long M0() {
        z1();
        return f35.i0(g1(this.p0));
    }

    @Override // defpackage.qi3
    public final void N0(List list, int i) {
        z1();
        ArrayList arrayListC1 = c1(list);
        z1();
        rr2.l(i >= 0);
        int iMin = Math.min(i, this.q.size());
        if (!this.p0.a.p()) {
            x1(Z0(this.p0, iMin, arrayListC1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.q0 == -1;
        z1();
        r1(arrayListC1, -1, -9223372036854775807L, z);
    }

    @Override // defpackage.qi3
    public final long O0() {
        z1();
        return this.l0;
    }

    @Override // defpackage.qi3
    public final void P(int i, int i2) {
        z1();
        rr2.l(i >= 0 && i2 >= i);
        int size = this.q.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        ph3 ph3VarO1 = o1(this.p0, i, iMin);
        x1(ph3VarO1, 0, !ph3VarO1.b.a.equals(this.p0.b.a), 4, g1(ph3VarO1), -1, false);
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder surfaceHolder) {
        z1();
        if (surfaceHolder == null) {
            z1();
            p1();
            t1(null);
            n1(0, 0);
            return;
        }
        p1();
        this.X = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            t1(null);
            n1(0, 0);
        } else {
            t1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            n1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.qi3
    public final void R(float f) {
        z1();
        float fI = f35.i(f, 0.0f, 1.0f);
        float f2 = this.b0;
        if (f2 == fI) {
            return;
        }
        if (fI != 0.0f) {
            f2 = fI;
        }
        this.c0 = f2;
        this.b0 = fI;
        this.m.u.b(32, Float.valueOf(fI)).b();
        this.n.f(22, new w31(0, fI));
    }

    @Override // defpackage.qi3
    public final void T(List list, int i, long j) {
        z1();
        ArrayList arrayListC1 = c1(list);
        z1();
        r1(arrayListC1, i, j, false);
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
    public final void V(boolean z) {
        z1();
        w1(1, z);
    }

    @Override // defpackage.qi3
    public final long X() {
        z1();
        return this.m0;
    }

    @Override // defpackage.fq
    public final void X0(int i, int i2, long j, boolean z) {
        z1();
        if (i == -1) {
            return;
        }
        rr2.l(i >= 0);
        cu4 cu4Var = this.p0.a;
        if (cu4Var.p() || i < cu4Var.o()) {
            nj0 nj0Var = this.t;
            if (!nj0Var.v) {
                q9 q9VarW = nj0Var.W();
                nj0Var.v = true;
                nj0Var.b0(q9VarW, -1, new oi0(20));
            }
            this.K++;
            if (k()) {
                l93.q0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                n41 n41Var = new n41(this.p0);
                n41Var.e(1);
                i41 i41Var = this.l.o;
                i41Var.k.d(new k6(24, i41Var, n41Var));
                return;
            }
            ph3 ph3VarH = this.p0;
            int i3 = ph3VarH.e;
            if (i3 == 3 || (i3 == 4 && !cu4Var.p())) {
                ph3VarH = this.p0.h(2);
            }
            int iO0 = o0();
            ph3 ph3VarL1 = l1(ph3VarH, cu4Var, m1(i, j, cu4Var));
            this.m.u.b(3, new p41(i, f35.Q(j), cu4Var)).b();
            x1(ph3VarL1, 0, true, 1, g1(ph3VarL1), iO0, z);
        }
    }

    @Override // defpackage.qi3
    public final long Z() {
        z1();
        return f1(this.p0);
    }

    public final ph3 Z0(ph3 ph3Var, int i, ArrayList arrayList) {
        cu4 cu4Var = ph3Var.a;
        this.K++;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bu2 bu2Var = new bu2((bq) arrayList.get(i2), this.r);
            arrayList2.add(bu2Var);
            this.q.add(i2 + i, new f41(bu2Var.b, bu2Var.a));
        }
        this.Q = this.Q.a(i, arrayList2.size());
        tm3 tm3VarB1 = b1();
        ph3 ph3VarL1 = l1(ph3Var, tm3VarB1, i1(cu4Var, tm3VarB1, h1(ph3Var), f1(ph3Var)));
        pd4 pd4Var = this.Q;
        yp4 yp4Var = this.m.u;
        l41 l41Var = new l41(arrayList2, pd4Var, -1, -9223372036854775807L);
        yp4Var.getClass();
        xp4 xp4VarC = yp4.c();
        xp4VarC.a = yp4Var.a.obtainMessage(18, i, 0, l41Var);
        xp4VarC.b();
        return ph3VarL1;
    }

    @Override // defpackage.qi3
    public final void a0() {
        z1();
        if (this.b0 == 0.0f) {
            float f = this.c0;
            if (f != 0.0f) {
                R(f);
            }
        }
    }

    public final do2 a1() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return this.o0;
        }
        gn2 gn2Var = cu4VarX0.m(o0(), this.b, 0L).b;
        co2 co2VarA = this.o0.a();
        co2VarA.b(gn2Var.d);
        return new do2(co2VarA);
    }

    @Override // defpackage.qi3
    public final void b() {
        z1();
        ph3 ph3Var = this.p0;
        if (ph3Var.e != 1) {
            return;
        }
        ph3 ph3VarF = ph3Var.f(null);
        ph3 ph3VarK1 = k1(ph3VarF, ph3VarF.a.p() ? 4 : 2);
        this.K++;
        this.m.u.a(29).b();
        x1(ph3VarK1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final long b0() {
        z1();
        if (!k()) {
            return F0();
        }
        ph3 ph3Var = this.p0;
        return ph3Var.k.equals(ph3Var.b) ? f35.i0(this.p0.q) : getDuration();
    }

    public final tm3 b1() {
        return new tm3(this.q, this.Q);
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.s.d((gn2) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.qi3
    public final void d(qh3 qh3Var) {
        z1();
        if (this.p0.o.equals(qh3Var)) {
            return;
        }
        ph3 ph3VarG = this.p0.g(qh3Var);
        this.K++;
        this.m.u.b(4, qh3Var).b();
        x1(ph3VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final void d0(int i) {
        z1();
    }

    public final sk3 d1(rk3 rk3Var) {
        int iH1 = h1(this.p0);
        cu4 cu4Var = this.p0.a;
        if (iH1 == -1) {
            iH1 = 0;
        }
        q41 q41Var = this.m;
        return new sk3(q41Var, rk3Var, cu4Var, iH1, q41Var.w);
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        z1();
        return (jw4) this.p0.i.r;
    }

    public final int e1() {
        Object obj;
        z1();
        c6 c6Var = this.D;
        c6Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == ((yp4) c6Var.c).a.getLooper()) {
            obj = c6Var.e;
        } else {
            rr2.w(looperMyLooper == ((yp4) c6Var.b).a.getLooper());
            obj = c6Var.f;
        }
        return ((Integer) obj).intValue();
    }

    @Override // defpackage.qi3
    public final boolean f() {
        z1();
        return this.p0.g;
    }

    public final long f1(ph3 ph3Var) {
        mt2 mt2Var = ph3Var.b;
        long j = ph3Var.c;
        cu4 cu4Var = ph3Var.a;
        if (!mt2Var.b()) {
            return f35.i0(g1(ph3Var));
        }
        Object obj = ph3Var.b.a;
        zt4 zt4Var = this.p;
        cu4Var.g(obj, zt4Var);
        if (j == -9223372036854775807L) {
            return f35.i0(cu4Var.m(h1(ph3Var), this.b, 0L).k);
        }
        return f35.i0(j) + f35.i0(zt4Var.e);
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

    public final long g1(ph3 ph3Var) {
        if (ph3Var.a.p()) {
            return f35.Q(this.r0);
        }
        long jL = ph3Var.p ? ph3Var.l() : ph3Var.s;
        if (ph3Var.b.b()) {
            return jL;
        }
        cu4 cu4Var = ph3Var.a;
        Object obj = ph3Var.b.a;
        zt4 zt4Var = this.p;
        cu4Var.g(obj, zt4Var);
        return jL + zt4Var.e;
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        z1();
        if (!k()) {
            return x();
        }
        ph3 ph3Var = this.p0;
        mt2 mt2Var = ph3Var.b;
        cu4 cu4Var = ph3Var.a;
        Object obj = mt2Var.a;
        zt4 zt4Var = this.p;
        cu4Var.g(obj, zt4Var);
        return f35.i0(zt4Var.a(mt2Var.b, mt2Var.c));
    }

    @Override // defpackage.qi3
    public final int h() {
        z1();
        return this.I;
    }

    public final int h1(ph3 ph3Var) {
        return ph3Var.a.p() ? this.q0 : ph3Var.a.g(ph3Var.b.a, this.p).c;
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

    public final Pair i1(cu4 cu4Var, tm3 tm3Var, int i, long j) {
        if (cu4Var.p() || tm3Var.p()) {
            boolean z = !cu4Var.p() && tm3Var.p();
            return m1(z ? -1 : i, z ? -9223372036854775807L : j, tm3Var);
        }
        Pair pairI = cu4Var.i(this.b, this.p, i, f35.Q(j));
        Object obj = pairI.first;
        if (tm3Var.b(obj) != -1) {
            return pairI;
        }
        int iU = q41.U(this.b, this.p, this.I, this.J, obj, cu4Var, tm3Var);
        if (iU == -1) {
            return m1(-1, -9223372036854775807L, tm3Var);
        }
        bu4 bu4Var = this.b;
        tm3Var.m(iU, bu4Var, 0L);
        return m1(iU, f35.i0(bu4Var.k), tm3Var);
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
    public final void k0(il ilVar, boolean z) {
        z1();
        if (this.i0) {
            return;
        }
        boolean zEquals = Objects.equals(this.a0, ilVar);
        tc2 tc2Var = this.n;
        if (!zEquals) {
            this.a0 = ilVar;
            q1(1, 3, ilVar);
            tc2Var.c(20, new x31(ilVar, 0));
        }
        il ilVar2 = this.a0;
        yp4 yp4Var = this.m.u;
        yp4Var.getClass();
        xp4 xp4VarC = yp4.c();
        xp4VarC.a = yp4Var.a.obtainMessage(31, z ? 1 : 0, 0, ilVar2);
        xp4VarC.b();
        tc2Var.b();
    }

    @Override // defpackage.qi3
    public final void l0(do2 do2Var) {
        z1();
        do2Var.getClass();
        if (do2Var.equals(this.T)) {
            return;
        }
        this.T = do2Var;
        this.n.f(15, new u31(this, 4));
    }

    public final ph3 l1(ph3 ph3Var, cu4 cu4Var, Pair pair) {
        List list;
        rr2.l(cu4Var.p() || pair != null);
        cu4 cu4Var2 = ph3Var.a;
        long jF1 = f1(ph3Var);
        ph3 ph3VarJ = ph3Var.j(cu4Var);
        if (cu4Var.p()) {
            mt2 mt2Var = ph3.u;
            long jQ = f35.Q(this.r0);
            ph3 ph3VarC = ph3VarJ.d(mt2Var, jQ, jQ, jQ, 0L, tv4.d, this.c, gy3.r).c(mt2Var);
            ph3VarC.q = ph3VarC.s;
            return ph3VarC;
        }
        Object obj = ph3VarJ.b.a;
        String str = f35.a;
        boolean zEquals = obj.equals(pair.first);
        mt2 mt2Var2 = !zEquals ? new mt2(pair.first) : ph3VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jQ2 = f35.Q(jF1);
        if (!cu4Var2.p()) {
            jQ2 -= cu4Var2.g(obj, this.p).e;
            if (zEquals && jQ2 - jLongValue == 1 && jQ2 == cu4Var2.g(obj, this.p).d) {
                jQ2--;
            }
        }
        if (!zEquals || jLongValue < jQ2) {
            mt2 mt2Var3 = mt2Var2;
            rr2.w(!mt2Var3.b());
            tv4 tv4Var = !zEquals ? tv4.d : ph3VarJ.h;
            ew4 ew4Var = !zEquals ? this.c : ph3VarJ.i;
            if (zEquals) {
                list = ph3VarJ.j;
            } else {
                vw1 vw1Var = yw1.o;
                list = gy3.r;
            }
            ph3 ph3VarC2 = ph3VarJ.d(mt2Var3, jLongValue, jLongValue, jLongValue, 0L, tv4Var, ew4Var, list).c(mt2Var3);
            ph3VarC2.q = jLongValue;
            return ph3VarC2;
        }
        if (jLongValue != jQ2) {
            mt2 mt2Var4 = mt2Var2;
            rr2.w(!mt2Var4.b());
            long jMax = Math.max(0L, ph3VarJ.r - (jLongValue - jQ2));
            long j = ph3VarJ.q;
            if (ph3VarJ.k.equals(ph3VarJ.b)) {
                j = jLongValue + jMax;
            }
            ph3 ph3VarD = ph3VarJ.d(mt2Var4, jLongValue, jLongValue, jLongValue, jMax, ph3VarJ.h, ph3VarJ.i, ph3VarJ.j);
            ph3VarD.q = j;
            return ph3VarD;
        }
        int iB = cu4Var.b(ph3VarJ.k.a);
        if (iB != -1 && cu4Var.f(iB, this.p, false).c == cu4Var.g(mt2Var2.a, this.p).c) {
            return ph3VarJ;
        }
        cu4Var.g(mt2Var2.a, this.p);
        boolean zB = mt2Var2.b();
        zt4 zt4Var = this.p;
        long jA = zB ? zt4Var.a(mt2Var2.b, mt2Var2.c) : zt4Var.d;
        mt2 mt2Var5 = mt2Var2;
        ph3 ph3VarC3 = ph3VarJ.d(mt2Var5, ph3VarJ.s, ph3VarJ.s, ph3VarJ.d, jA - ph3VarJ.s, ph3VarJ.h, ph3VarJ.i, ph3VarJ.j).c(mt2Var5);
        ph3VarC3.q = jA;
        return ph3VarC3;
    }

    @Override // defpackage.qi3
    public final long m() {
        z1();
        return f35.i0(this.p0.r);
    }

    public final Pair m1(int i, long j, cu4 cu4Var) {
        if (cu4Var.p()) {
            this.q0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.r0 = j;
            return null;
        }
        if (i == -1 || i >= cu4Var.o()) {
            i = cu4Var.a(this.J);
            j = f35.i0(cu4Var.m(i, this.b, 0L).k);
        }
        return cu4Var.i(this.b, this.p, i, f35.Q(j));
    }

    @Override // defpackage.qi3
    public final int n0() {
        z1();
        if (k()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final void n1(int i, int i2) {
        pf4 pf4Var = this.Z;
        if (i == pf4Var.a && i2 == pf4Var.b) {
            return;
        }
        this.Z = new pf4(i, i2);
        this.n.f(24, new v31(i, i2, 0));
        q1(2, 14, new pf4(i, i2));
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        z1();
        return this.R;
    }

    @Override // defpackage.qi3
    public final int o0() {
        z1();
        int iH1 = h1(this.p0);
        if (iH1 == -1) {
            return 0;
        }
        return iH1;
    }

    public final ph3 o1(ph3 ph3Var, int i, int i2) {
        int iH1 = h1(ph3Var);
        long jF1 = f1(ph3Var);
        cu4 cu4Var = ph3Var.a;
        this.K++;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.q.remove(i3);
        }
        pd4 pd4Var = this.Q;
        int i4 = i2 - i;
        int[] iArr = pd4Var.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.Q = new pd4(iArr2, new Random(pd4Var.a.nextLong()));
        tm3 tm3VarB1 = b1();
        ph3 ph3VarL1 = l1(ph3Var, tm3VarB1, i1(cu4Var, tm3VarB1, iH1, jF1));
        int i9 = ph3VarL1.e;
        if (i9 != 1 && i9 != 4 && iH1 >= i && iH1 < i2) {
            if (q41.U(this.b, this.p, this.I, this.J, ph3Var.b.a, cu4Var, tm3VarB1) == -1) {
                ph3VarL1 = k1(ph3VarL1, 4);
            }
        }
        pd4 pd4Var2 = this.Q;
        yp4 yp4Var = this.m.u;
        yp4Var.getClass();
        xp4 xp4VarC = yp4.c();
        xp4VarC.a = yp4Var.a.obtainMessage(20, i, i2, pd4Var2);
        xp4VarC.b();
        return ph3VarL1;
    }

    @Override // defpackage.qi3
    public final void p0(int i) {
        z1();
        if (this.I != i) {
            this.I = i;
            yp4 yp4Var = this.m.u;
            yp4Var.getClass();
            xp4 xp4VarC = yp4.c();
            xp4VarC.a = yp4Var.a.obtainMessage(11, i, 0);
            xp4VarC.b();
            ij0 ij0Var = new ij0(i, 1);
            tc2 tc2Var = this.n;
            tc2Var.c(8, ij0Var);
            v1();
            tc2Var.b();
        }
    }

    public final void p1() {
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.x);
            this.W = null;
        }
    }

    @Override // defpackage.qi3
    public final boolean q() {
        z1();
        return this.p0.l;
    }

    @Override // defpackage.qi3
    public final void q0(boolean z) {
        z1();
    }

    public final void q1(int i, int i2, Object obj) {
        for (kq kqVar : this.h) {
            if (i == -1 || kqVar.o == i) {
                sk3 sk3VarD1 = d1(kqVar);
                rr2.w(!sk3VarD1.f);
                sk3VarD1.c = i2;
                rr2.w(!sk3VarD1.f);
                sk3VarD1.d = obj;
                sk3VarD1.b();
            }
        }
        for (kq kqVar2 : this.i) {
            if (kqVar2 != null && (i == -1 || kqVar2.o == i)) {
                sk3 sk3VarD2 = d1(kqVar2);
                rr2.w(!sk3VarD2.f);
                sk3VarD2.c = i2;
                rr2.w(!sk3VarD2.f);
                sk3VarD2.d = obj;
                sk3VarD2.b();
            }
        }
    }

    @Override // defpackage.qi3
    public final void r0(oi3 oi3Var) {
        z1();
        oi3Var.getClass();
        this.n.e(oi3Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    public final void r1(ArrayList arrayList, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        ph3 ph3VarK1;
        boolean z2;
        int iA = i;
        int iH1 = h1(this.p0);
        long jM0 = M0();
        this.K++;
        ArrayList arrayList2 = this.q;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            bu2 bu2Var = new bu2((bq) arrayList.get(i4), this.r);
            arrayList3.add(bu2Var);
            arrayList2.add(i4, new f41(bu2Var.b, bu2Var.a));
        }
        pd4 pd4Var = this.Q;
        int size = arrayList3.size();
        pd4Var.getClass();
        this.Q = new pd4(new Random(pd4Var.a.nextLong())).a(0, size);
        tm3 tm3VarB1 = b1();
        int i5 = tm3VarB1.g;
        if (!tm3VarB1.p() && iA >= i5) {
            throw new IllegalSeekPositionException();
        }
        if (!z) {
            if (iA == -1) {
                i2 = iH1;
                j2 = jM0;
            } else {
                j2 = j;
            }
            ph3 ph3VarL1 = l1(this.p0, tm3VarB1, m1(i2, j2, tm3VarB1));
            i3 = ph3VarL1.e;
            if (i3 == 1) {
                i3 = 1;
            } else if (!tm3VarB1.p()) {
                i3 = 4;
            } else if (i2 != -1) {
                if (i2 >= i5) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            ph3VarK1 = k1(ph3VarL1, i3);
            this.m.u.b(17, new l41(arrayList3, this.Q, i2, f35.Q(j2))).b();
            if (!this.p0.b.a.equals(ph3VarK1.b.a) || this.p0.a.p()) {
                z2 = false;
            } else {
                z2 = true;
            }
            x1(ph3VarK1, 0, z2, 4, g1(ph3VarK1), -1, false);
        }
        iA = tm3VarB1.a(this.J);
        j2 = -9223372036854775807L;
        i2 = iA;
        ph3 ph3VarL2 = l1(this.p0, tm3VarB1, m1(i2, j2, tm3VarB1));
        i3 = ph3VarL2.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (!tm3VarB1.p()) {
            i3 = 4;
        } else if (i2 != -1) {
            if (i2 >= i5) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        ph3VarK1 = k1(ph3VarL2, i3);
        this.m.u.b(17, new l41(arrayList3, this.Q, i2, f35.Q(j2))).b();
        if (this.p0.b.a.equals(ph3VarK1.b.a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        x1(ph3VarK1, 0, z2, 4, g1(ph3VarK1), -1, false);
    }

    @Override // defpackage.qi3
    public final void s(boolean z) {
        z1();
        if (this.J != z) {
            this.J = z;
            yp4 yp4Var = this.m.u;
            yp4Var.getClass();
            xp4 xp4VarC = yp4.c();
            xp4VarC.a = yp4Var.a.obtainMessage(12, z ? 1 : 0, 0);
            xp4VarC.b();
            t31 t31Var = new t31(0, z);
            tc2 tc2Var = this.n;
            tc2Var.c(9, t31Var);
            v1();
            tc2Var.b();
        }
    }

    public final void s1(pd4 pd4Var) {
        z1();
        rr2.l(pd4Var.b.length == this.q.size());
        this.Q = pd4Var;
        tm3 tm3VarB1 = b1();
        ph3 ph3VarL1 = l1(this.p0, tm3VarB1, m1(o0(), M0(), tm3VarB1));
        this.K++;
        this.m.u.b(21, pd4Var).b();
        x1(ph3VarL1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        z1();
        q1(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        cw4 cw4VarB;
        z1();
        if (z == this.N) {
            return;
        }
        this.N = z;
        i74 i74Var = this.P;
        if (!i74Var.a.isEmpty()) {
            pn0 pn0Var = this.j;
            pn0Var.getClass();
            jn0 jn0VarD = pn0Var.d();
            if (z) {
                this.O = jn0VarD.I;
                jx1 jx1Var = i74Var.a;
                bw4 bw4VarA = jn0VarD.a();
                o15 it = jx1Var.iterator();
                while (it.hasNext()) {
                    bw4VarA.l(((Integer) it.next()).intValue(), true);
                }
                cw4VarB = bw4VarA.b();
            } else {
                jn0VarD.getClass();
                in0 in0Var = new in0(jn0VarD);
                in0Var.m(this.O);
                jn0 jn0Var = new jn0(in0Var);
                this.O = null;
                cw4VarB = jn0Var;
            }
            if (!cw4VarB.equals(jn0VarD)) {
                pn0Var.j(cw4VarB);
            }
        }
        this.m.u.b(36, Boolean.valueOf(z)).b();
        ph3 ph3Var = this.p0;
        w1(ph3Var.m, ph3Var.l);
    }

    @Override // defpackage.qi3
    public final void stop() {
        z1();
        u1(null);
        this.e0 = new jg0(this.p0.s, gy3.r);
    }

    public final void t1(Surface surface) {
        Object obj = this.U;
        boolean zC = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.C : -9223372036854775807L;
        q41 q41Var = this.m;
        if (!q41Var.X && q41Var.w.getThread().isAlive()) {
            q90 q90Var = new q90(q41Var.D);
            q41Var.u.b(30, new Pair(surface, q90Var)).b();
            if (j != -9223372036854775807L) {
                zC = q90Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.U;
            Surface surface2 = this.V;
            if (obj2 == surface2) {
                surface2.release();
                this.V = null;
            }
        }
        this.U = surface;
        if (zC) {
            return;
        }
        u1(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
    }

    @Override // defpackage.qi3
    public final long u() {
        z1();
        return this.n0;
    }

    @Override // defpackage.qi3
    public final void u0(int i, int i2, int i3) {
        z1();
        rr2.l(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        cu4 cu4VarX0 = x0();
        this.K++;
        f35.P(arrayList, i, iMin, iMin2);
        pd4 pd4Var = this.Q;
        pd4Var.getClass();
        this.Q = pd4Var;
        tm3 tm3VarB1 = b1();
        ph3 ph3Var = this.p0;
        ph3 ph3VarL1 = l1(ph3Var, tm3VarB1, i1(cu4VarX0, tm3VarB1, h1(ph3Var), f1(this.p0)));
        pd4 pd4Var2 = this.Q;
        q41 q41Var = this.m;
        q41Var.getClass();
        q41Var.u.b(19, new m41(i, iMin, iMin2, pd4Var2)).b();
        x1(ph3VarL1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void u1(ExoPlaybackException exoPlaybackException) {
        ph3 ph3Var = this.p0;
        ph3 ph3VarC = ph3Var.c(ph3Var.b);
        ph3VarC.q = ph3VarC.s;
        ph3VarC.r = 0L;
        ph3 ph3VarK1 = k1(ph3VarC, 1);
        if (exoPlaybackException != null) {
            ph3VarK1 = ph3VarK1.f(exoPlaybackException);
        }
        this.K++;
        this.m.u.a(6).b();
        x1(ph3VarK1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final void v(oi3 oi3Var) {
        oi3Var.getClass();
        this.n.a(oi3Var);
    }

    @Override // defpackage.qi3
    public final int v0() {
        z1();
        return this.p0.n;
    }

    public final void v1() {
        mi3 mi3Var = this.R;
        String str = f35.a;
        i41 i41Var = this.g;
        boolean zK = i41Var.k();
        boolean zR0 = i41Var.R0();
        boolean zI = i41Var.I();
        boolean zF0 = i41Var.f0();
        boolean zV0 = i41Var.V0();
        boolean zT0 = i41Var.T0();
        boolean zP = i41Var.x0().p();
        zg5 zg5Var = new zg5(1);
        xk0 xk0Var = (xk0) zg5Var.n;
        xk0Var.c(this.d.a);
        boolean z = !zK;
        zg5Var.k(4, z);
        zg5Var.k(5, zR0 && !zK);
        zg5Var.k(6, zI && !zK);
        zg5Var.k(7, !zP && (zI || !zV0 || zR0) && !zK);
        zg5Var.k(8, zF0 && !zK);
        zg5Var.k(9, !zP && (zF0 || (zV0 && zT0)) && !zK);
        zg5Var.k(10, z);
        zg5Var.k(11, zR0 && !zK);
        zg5Var.k(12, zR0 && !zK);
        mi3 mi3Var2 = new mi3(xk0Var.f());
        this.R = mi3Var2;
        if (mi3Var2.equals(mi3Var)) {
            return;
        }
        this.n.c(13, new u31(this, 3));
    }

    public final void w1(int i, boolean z) {
        int i2;
        if (this.N) {
            i2 = 4;
        } else {
            i2 = (this.p0.n != 1 || z) ? 0 : 1;
        }
        ph3 ph3VarA = this.p0;
        if (ph3VarA.l == z && ph3VarA.n == i2 && ph3VarA.m == i) {
            return;
        }
        this.K++;
        if (ph3VarA.p) {
            ph3VarA = ph3VarA.a();
        }
        ph3 ph3VarE = ph3VarA.e(i, i2, z);
        int i3 = i | (i2 << 4);
        yp4 yp4Var = this.m.u;
        yp4Var.getClass();
        xp4 xp4VarC = yp4.c();
        xp4VarC.a = yp4Var.a.obtainMessage(1, z ? 1 : 0, i3);
        xp4VarC.b();
        x1(ph3VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        z1();
        return this.p0.a;
    }

    public final void x1(final ph3 ph3Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        gn2 gn2Var;
        int i5;
        final int i6;
        int i7;
        int i8;
        Object obj;
        gn2 gn2Var2;
        Object obj2;
        long j2;
        long j3;
        long jJ1;
        long jJ2;
        Object obj3;
        gn2 gn2Var3;
        Object obj4;
        ph3 ph3Var2 = this.p0;
        this.p0 = ph3Var;
        boolean zEquals = ph3Var2.a.equals(ph3Var.a);
        bu4 bu4Var = this.b;
        zt4 zt4Var = this.p;
        cu4 cu4Var = ph3Var2.a;
        mt2 mt2Var = ph3Var2.b;
        cu4 cu4Var2 = ph3Var.a;
        mt2 mt2Var2 = ph3Var.b;
        int i9 = 0;
        if (cu4Var2.p() && cu4Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (cu4Var2.p() != cu4Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!cu4Var.m(cu4Var.g(mt2Var.a, zt4Var).c, bu4Var, 0L).a.equals(cu4Var2.m(cu4Var2.g(mt2Var2.a, zt4Var).c, bu4Var, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    tb4.a();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && mt2Var.d < mt2Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            gn2Var = ph3Var.a.p() ? null : ph3Var.a.m(ph3Var.a.g(ph3Var.b.a, this.p).c, this.b, 0L).b;
            this.o0 = do2.K;
        } else {
            gn2Var = null;
        }
        if (zBooleanValue || !ph3Var2.j.equals(ph3Var.j)) {
            co2 co2VarA = this.o0.a();
            List list = ph3Var.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                qv2 qv2Var = (qv2) list.get(i10);
                int i11 = 0;
                while (true) {
                    pv2[] pv2VarArr = qv2Var.a;
                    if (i11 < pv2VarArr.length) {
                        pv2VarArr[i11].b(co2VarA);
                        i11++;
                    }
                }
            }
            this.o0 = new do2(co2VarA);
        }
        do2 do2VarA1 = a1();
        boolean zEquals2 = do2VarA1.equals(this.S);
        this.S = do2VarA1;
        boolean z3 = ph3Var2.l != ph3Var.l;
        boolean z4 = ph3Var2.e != ph3Var.e;
        if (z4 || z3) {
            y1();
        }
        boolean z5 = ph3Var2.g != ph3Var.g;
        if (!zEquals) {
            this.n.c(0, new q31(i, i9, ph3Var));
        }
        if (z) {
            zt4 zt4Var2 = new zt4();
            if (ph3Var2.a.p()) {
                i7 = i3;
                i8 = i7;
                obj = null;
                gn2Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = ph3Var2.b.a;
                ph3Var2.a.g(obj5, zt4Var2);
                int i12 = zt4Var2.c;
                int iB = ph3Var2.a.b(obj5);
                obj = ph3Var2.a.m(i12, this.b, 0L).a;
                gn2Var2 = this.b.b;
                obj2 = obj5;
                i7 = i12;
                i8 = iB;
            }
            mt2 mt2Var3 = ph3Var2.b;
            if (i2 == 0) {
                boolean zB = mt2Var3.b();
                mt2 mt2Var4 = ph3Var2.b;
                if (zB) {
                    jJ1 = zt4Var2.a(mt2Var4.b, mt2Var4.c);
                    jJ2 = j1(ph3Var2);
                } else {
                    if (mt2Var4.e != -1) {
                        jJ1 = j1(this.p0);
                    } else {
                        j2 = zt4Var2.e;
                        j3 = zt4Var2.d;
                        jJ1 = j2 + j3;
                    }
                    jJ2 = jJ1;
                }
            } else if (mt2Var3.b()) {
                jJ1 = ph3Var2.s;
                jJ2 = j1(ph3Var2);
            } else {
                j2 = zt4Var2.e;
                j3 = ph3Var2.s;
                jJ1 = j2 + j3;
                jJ2 = jJ1;
            }
            long jI0 = f35.i0(jJ1);
            long jI1 = f35.i0(jJ2);
            mt2 mt2Var5 = ph3Var2.b;
            pi3 pi3Var = new pi3(obj, i7, gn2Var2, obj2, i8, jI0, jI1, mt2Var5.b, mt2Var5.c);
            bu4 bu4Var2 = this.b;
            int iO0 = o0();
            int iY = y();
            if (this.p0.a.p()) {
                obj3 = null;
                gn2Var3 = null;
                obj4 = null;
            } else {
                ph3 ph3Var3 = this.p0;
                Object obj6 = ph3Var3.b.a;
                ph3Var3.a.g(obj6, this.p);
                iY = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(iO0, bu4Var2, 0L).a;
                gn2Var3 = bu4Var2.b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i13 = iY;
            long jI2 = f35.i0(j);
            long jI3 = this.p0.b.b() ? f35.i0(j1(this.p0)) : jI2;
            mt2 mt2Var6 = this.p0.b;
            i5 = 0;
            this.n.c(11, new z31(i2, pi3Var, new pi3(obj3, iO0, gn2Var3, obj4, i13, jI2, jI3, mt2Var6.b, mt2Var6.c), 0));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
            i5 = 0;
        }
        if (zBooleanValue) {
            this.n.c(1, new a41(gn2Var, iIntValue, i5));
        }
        final int i14 = 7;
        if (ph3Var2.f != ph3Var.f) {
            this.n.c(10, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj8) {
                    int i15 = i14;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj8;
                    switch (i15) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
            if (ph3Var.f != null) {
                final int i15 = 8;
                this.n.c(10, new qc2() { // from class: s31
                    @Override // defpackage.qc2
                    public final void invoke(Object obj8) {
                        int i16 = i15;
                        ph3 ph3Var4 = ph3Var;
                        oi3 oi3Var = (oi3) obj8;
                        switch (i16) {
                            case 0:
                                oi3Var.i(ph3Var4.g);
                                oi3Var.q(ph3Var4.g);
                                break;
                            case 1:
                                oi3Var.L(ph3Var4.e, ph3Var4.l);
                                break;
                            case 2:
                                oi3Var.v(ph3Var4.e);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.r(ph3Var4.m, ph3Var4.l);
                                break;
                            case 4:
                                oi3Var.g(ph3Var4.n);
                                break;
                            case 5:
                                oi3Var.V(ph3Var4.m());
                                break;
                            case 6:
                                oi3Var.N(ph3Var4.o);
                                break;
                            case 7:
                                oi3Var.P(ph3Var4.f);
                                break;
                            case 8:
                                oi3Var.S(ph3Var4.f);
                                break;
                            default:
                                oi3Var.A((jw4) ph3Var4.i.r);
                                break;
                        }
                    }
                });
            }
        }
        ew4 ew4Var = ph3Var2.i;
        ew4 ew4Var2 = ph3Var.i;
        if (ew4Var != ew4Var2) {
            pn0 pn0Var = this.j;
            Object obj8 = ew4Var2.s;
            pn0Var.getClass();
            final int i16 = 9;
            this.n.c(2, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i17 = i16;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i17) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        if (zEquals2) {
            i6 = 0;
        } else {
            i6 = 0;
            this.n.c(14, new r31(this.S, i6));
        }
        if (z5) {
            this.n.c(3, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i17 = i6;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i17) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i17 = 1;
            this.n.c(-1, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i18 = i17;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i18) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        final int i18 = 4;
        if (z4) {
            final int i19 = 2;
            this.n.c(4, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i110 = i19;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i110) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        final int i20 = 5;
        if (z3 || ph3Var2.m != ph3Var.m) {
            final int i21 = 3;
            this.n.c(5, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i110 = i21;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i110) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        final int i22 = 6;
        if (ph3Var2.n != ph3Var.n) {
            this.n.c(6, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i110 = i18;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i110) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        if (ph3Var2.m() != ph3Var.m()) {
            this.n.c(7, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i110 = i20;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i110) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        if (!ph3Var2.o.equals(ph3Var.o)) {
            this.n.c(12, new qc2() { // from class: s31
                @Override // defpackage.qc2
                public final void invoke(Object obj9) {
                    int i110 = i22;
                    ph3 ph3Var4 = ph3Var;
                    oi3 oi3Var = (oi3) obj9;
                    switch (i110) {
                        case 0:
                            oi3Var.i(ph3Var4.g);
                            oi3Var.q(ph3Var4.g);
                            break;
                        case 1:
                            oi3Var.L(ph3Var4.e, ph3Var4.l);
                            break;
                        case 2:
                            oi3Var.v(ph3Var4.e);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.r(ph3Var4.m, ph3Var4.l);
                            break;
                        case 4:
                            oi3Var.g(ph3Var4.n);
                            break;
                        case 5:
                            oi3Var.V(ph3Var4.m());
                            break;
                        case 6:
                            oi3Var.N(ph3Var4.o);
                            break;
                        case 7:
                            oi3Var.P(ph3Var4.f);
                            break;
                        case 8:
                            oi3Var.S(ph3Var4.f);
                            break;
                        default:
                            oi3Var.A((jw4) ph3Var4.i.r);
                            break;
                    }
                }
            });
        }
        v1();
        this.n.b();
        if (ph3Var2.p != ph3Var.p) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((d41) it.next()).n.y1();
            }
        }
    }

    @Override // defpackage.qi3
    public final int y() {
        z1();
        if (!this.p0.a.p()) {
            ph3 ph3Var = this.p0;
            return ph3Var.a.b(ph3Var.b.a);
        }
        int i = this.q0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        z1();
        return false;
    }

    public final void y1() {
        int iG = g();
        y10 y10Var = this.B;
        y10 y10Var2 = this.A;
        boolean z = false;
        if (iG != 1) {
            if (iG == 2 || iG == 3) {
                z1();
                boolean z2 = this.p0.p;
                if (q() && !z2) {
                    z = true;
                }
                y10Var2.k(z);
                y10Var.k(q());
                return;
            }
            if (iG != 4) {
                tb4.a();
                return;
            }
        }
        y10Var2.k(false);
        y10Var.k(false);
    }

    @Override // defpackage.qi3
    public final s55 z() {
        z1();
        return this.k0;
    }

    public final void z1() {
        this.e.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.u;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = f35.a;
            Locale locale = Locale.US;
            String strH = f34.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                kf2.o(strH);
            } else {
                l93.r0("ExoPlayerImpl", strH, this.g0 ? null : new IllegalStateException());
                this.g0 = true;
            }
        }
    }
}
