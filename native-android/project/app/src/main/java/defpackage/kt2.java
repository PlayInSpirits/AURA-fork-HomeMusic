package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.eddyizm.tempus.service.MediaService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kt2 extends Binder implements pu1 {
    public static final /* synthetic */ int k = 0;
    public final WeakReference e;
    public final na4 f;
    public final Set g;
    public fy3 h;
    public int i;
    public jt2 j;

    public kt2(tn2 tn2Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.e = new WeakReference(tn2Var);
        this.f = new na4(tn2Var);
        this.g = Collections.synchronizedSet(new HashSet());
        this.h = fy3.v;
    }

    public static ic2 K0(tn2 tn2Var, fr2 fr2Var, int i, it2 it2Var, wc0 wc0Var) {
        if (tn2Var.l()) {
            return mw1.o;
        }
        ic2 ic2Var = (ic2) it2Var.h(tn2Var, fr2Var, i);
        lb4 lb4Var = new lb4();
        ic2Var.f(new t6(tn2Var, lb4Var, wc0Var, ic2Var, 24), gq0.n);
        return lb4Var;
    }

    public static void P0(tn2 tn2Var, fr2 fr2Var, int i, ab4 ab4Var) {
        try {
            er2 er2Var = fr2Var.d;
            er2Var.getClass();
            er2Var.v(i, ab4Var);
            tn2Var.c.a(true, true);
        } catch (RemoteException e) {
            l93.r0("MediaSessionStub", "Failed to send result to controller " + fr2Var, e);
        }
    }

    public static ss2 Q0(wc0 wc0Var) {
        return new ss2(2, new ss2(3, wc0Var));
    }

    @Override // defpackage.pu1
    public final void A(ju1 ju1Var, int i, Bundle bundle) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 29, Q0(new ef0(23, this, cw4.b(bundle))));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.pu1
    public final void A0(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 7, Q0(new zr2(6)));
    }

    @Override // defpackage.pu1
    public final void B(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 12, Q0(new zr2(9)));
    }

    @Override // defpackage.pu1
    public final void B0(ju1 ju1Var, int i, boolean z) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 26, Q0(new t31(4, z)));
    }

    @Override // defpackage.pu1
    public final void C0(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 3, Q0(new zr2(14)));
    }

    @Override // defpackage.pu1
    public final void D(ju1 ju1Var, int i, int i2, Bundle bundle) {
        if (ju1Var == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            int i3 = 1;
            N0(ju1Var, i, 20, new at2(new bt2(new vs2(0, gn2.b(bundle)), new us2(this, i2, i3)), i3));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.pu1
    public final void D0(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            N0(ju1Var, i, 15, Q0(new ij0(i2, 8)));
        }
    }

    @Override // defpackage.pu1
    public final void E0(ju1 ju1Var, int i, final int i2, final int i3, final int i4) {
        if (ju1Var == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        N0(ju1Var, i, 20, Q0(new wc0() { // from class: ws2
            @Override // defpackage.wc0
            public final void accept(Object obj) {
                ((al3) obj).u0(i2, i3, i4);
            }
        }));
    }

    @Override // defpackage.pu1
    public final void F(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 34, Q0(new ij0(i2, 7)));
    }

    @Override // defpackage.pu1
    public final void F0(ju1 ju1Var, int i, int i2, int i3) {
        if (ju1Var == null || i2 < 0 || i3 < 0) {
            return;
        }
        N0(ju1Var, i, 20, Q0(new v31(i2, i3, 5)));
    }

    @Override // defpackage.pu1
    public final void G(ju1 ju1Var, int i, Bundle bundle) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 20, new at2(new bt2(new vs2(2, gn2.b(bundle)), new zr2(13)), 1));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.pu1
    public final void G0(ju1 ju1Var, int i, int i2, Bundle bundle) {
        if (ju1Var == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            int i3 = 1;
            N0(ju1Var, i, 20, new at2(new bt2(new vs2(i3, gn2.b(bundle)), new us2(this, i2, 2)), i3));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.pu1
    public final void H(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 11, Q0(new zr2(5)));
    }

    @Override // defpackage.pu1
    public final void H0(ju1 ju1Var, int i, boolean z) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 14, Q0(new t31(5, z)));
    }

    @Override // defpackage.pu1
    public final void J(ju1 ju1Var, int i, iw iwVar) {
        L(ju1Var, i, iwVar, true);
    }

    @Override // defpackage.pu1
    public final void K(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 34, Q0(new ij0(i2, 6)));
    }

    @Override // defpackage.pu1
    public final void L(ju1 ju1Var, int i, IBinder iBinder, boolean z) {
        if (ju1Var == null || iBinder == null) {
            return;
        }
        try {
            yw1 yw1VarA = iw.a(iBinder);
            uw1 uw1VarJ = yw1.j();
            for (int i2 = 0; i2 < yw1VarA.size(); i2++) {
                Bundle bundle = (Bundle) yw1VarA.get(i2);
                bundle.getClass();
                uw1VarJ.c(gn2.b(bundle));
            }
            N0(ju1Var, i, 20, new at2(new ef0(29, new ts2(uw1VarJ.f(), z, 2), new zr2(20)), 1));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final int L0(fr2 fr2Var, al3 al3Var, int i) {
        if (al3Var.S0(17)) {
            na4 na4Var = this.f;
            if (!na4Var.H(fr2Var, 17) && na4Var.H(fr2Var, 16)) {
                return al3Var.o0() + i;
            }
        }
        return i;
    }

    @Override // defpackage.pu1
    public final void M(ju1 ju1Var, int i, int i2, int i3) {
        if (ju1Var == null || i2 < 0 || i3 < i2) {
            return;
        }
        N0(ju1Var, i, 20, new ss2(2, new rs2(this, i2, i3)));
    }

    public final void M0(fr2 fr2Var, int i) {
        O0(fr2Var, i, 1, Q0(new ef0(25, this, fr2Var)));
    }

    @Override // defpackage.pu1
    public final void N(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null || i2 < 0) {
            return;
        }
        N0(ju1Var, i, 20, new ss2(2, new us2(this, i2, 4)));
    }

    public final void N0(ju1 ju1Var, int i, int i2, it2 it2Var) {
        fr2 fr2VarW = this.f.w(ju1Var.asBinder());
        if (fr2VarW != null) {
            O0(fr2VarW, i, i2, it2Var);
        }
    }

    public final void O0(final fr2 fr2Var, final int i, final int i2, final it2 it2Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final tn2 tn2Var = (tn2) this.e.get();
            if (tn2Var != null && !tn2Var.l()) {
                f35.W(tn2Var.l, new Runnable() { // from class: zs2
                    @Override // java.lang.Runnable
                    public final void run() {
                        na4 na4Var = this.n.f;
                        final fr2 fr2Var2 = fr2Var;
                        int i3 = i2;
                        boolean zH = na4Var.H(fr2Var2, i3);
                        final tn2 tn2Var2 = tn2Var;
                        final int i4 = i;
                        if (!zH) {
                            kt2.P0(tn2Var2, fr2Var2, i4, new ab4(-4));
                            return;
                        }
                        pq pqVar = tn2Var2.e;
                        tn2Var2.B(fr2Var2);
                        pqVar.getClass();
                        final it2 it2Var2 = it2Var;
                        if (i3 != 27) {
                            na4Var.d(fr2Var2, i3, new aa0() { // from class: dt2
                                @Override // defpackage.aa0
                                public final ic2 run() {
                                    return (ic2) it2Var2.h(tn2Var2, fr2Var2, i4);
                                }
                            });
                        } else {
                            it2Var2.h(tn2Var2, fr2Var2, i4);
                            na4Var.d(fr2Var2, i3, new ct2());
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.pu1
    public final void P(ju1 ju1Var, int i, int i2, int i3, IBinder iBinder) {
        if (ju1Var == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            yw1 yw1VarA = iw.a(iBinder);
            uw1 uw1VarJ = yw1.j();
            for (int i4 = 0; i4 < yw1VarA.size(); i4++) {
                Bundle bundle = (Bundle) yw1VarA.get(i4);
                bundle.getClass();
                uw1VarJ.c(gn2.b(bundle));
            }
            N0(ju1Var, i, 20, new at2(new bt2(new vr2(uw1VarJ.f()), new rs2(this, i2, i3)), 1));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.pu1
    public final void Q(ju1 ju1Var, int i, int i2, int i3) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 27, Q0(new rs2(this, i2, i3)));
    }

    @Override // defpackage.pu1
    public final void R(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 9, Q0(new zr2(10)));
    }

    @Override // defpackage.pu1
    public final void S(ju1 ju1Var, int i, int i2, long j) {
        if (ju1Var == null || i2 < 0) {
            return;
        }
        N0(ju1Var, i, 10, new ss2(2, new lj0(j, this, i2)));
    }

    @Override // defpackage.pu1
    public final void T(ju1 ju1Var, int i, IBinder iBinder) {
        if (ju1Var == null || iBinder == null) {
            return;
        }
        try {
            yw1 yw1VarA = iw.a(iBinder);
            uw1 uw1VarJ = yw1.j();
            for (int i2 = 0; i2 < yw1VarA.size(); i2++) {
                Bundle bundle = (Bundle) yw1VarA.get(i2);
                bundle.getClass();
                uw1VarJ.c(gn2.b(bundle));
            }
            N0(ju1Var, i, 20, new at2(new bt2(new c41(uw1VarJ.f(), 2), new zr2(12)), 1));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void U(ju1 ju1Var, final int i, final va4 va4Var, final int i2, final it2 it2Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final tn2 tn2Var = (tn2) this.e.get();
            if (tn2Var != null && !tn2Var.l()) {
                final fr2 fr2VarW = this.f.w(ju1Var.asBinder());
                if (fr2VarW == null) {
                    return;
                }
                f35.W(tn2Var.l, new Runnable() { // from class: ys2
                    @Override // java.lang.Runnable
                    public final void run() {
                        na4 na4Var = this.n.f;
                        fr2 fr2Var = fr2VarW;
                        if (na4Var.F(fr2Var)) {
                            va4 va4Var2 = va4Var;
                            tn2 tn2Var2 = tn2Var;
                            int i3 = i;
                            if (va4Var2 != null) {
                                if (!na4Var.J(fr2Var, va4Var2)) {
                                    kt2.P0(tn2Var2, fr2Var, i3, new ab4(-4));
                                    return;
                                }
                            } else if (!na4Var.I(fr2Var, i2)) {
                                kt2.P0(tn2Var2, fr2Var, i3, new ab4(-4));
                                return;
                            }
                            it2Var.h(tn2Var2, fr2Var, i3);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.pu1
    public final void W(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 4, Q0(new zr2(16)));
    }

    public final lk3 X(lk3 lk3Var) {
        yw1 yw1Var = lk3Var.F.a;
        uw1 uw1VarJ = yw1.j();
        nw1 nw1Var = new nw1(4);
        for (int i = 0; i < yw1Var.size(); i++) {
            iw4 iw4Var = (iw4) yw1Var.get(i);
            sv4 sv4Var = iw4Var.b;
            String string = (String) this.h.get(sv4Var);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.i;
                this.i = i2 + 1;
                String str = f35.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(sv4Var.b);
                string = sb.toString();
            }
            nw1Var.F(sv4Var, string);
            uw1VarJ.c(new iw4(new sv4(string, iw4Var.b.d), iw4Var.c, iw4Var.d, iw4Var.e));
        }
        this.h = nw1Var.o == 0 ? fy3.v : new fy3(nw1Var.o, (Object[]) nw1Var.p);
        lk3 lk3VarB = lk3Var.b(new jw4(uw1VarJ.f()));
        cw4 cw4Var = lk3VarB.G;
        if (cw4Var.H.isEmpty()) {
            return lk3VarB;
        }
        bw4 bw4VarC = cw4Var.a().c();
        o15 it = cw4Var.H.values().iterator();
        while (it.hasNext()) {
            yv4 yv4Var = (yv4) it.next();
            sv4 sv4Var2 = yv4Var.a;
            String str2 = (String) this.h.get(sv4Var2);
            if (str2 != null) {
                bw4VarC.a(new yv4(new sv4(str2, sv4Var2.d), yv4Var.b));
            } else {
                bw4VarC.a(yv4Var);
            }
        }
        return lk3VarB.o(bw4VarC.b());
    }

    @Override // defpackage.pu1
    public final void Z(ju1 ju1Var, int i, int i2, IBinder iBinder) {
        if (ju1Var == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            yw1 yw1VarA = iw.a(iBinder);
            uw1 uw1VarJ = yw1.j();
            for (int i3 = 0; i3 < yw1VarA.size(); i3++) {
                Bundle bundle = (Bundle) yw1VarA.get(i3);
                bundle.getClass();
                uw1VarJ.c(gn2.b(bundle));
            }
            int i4 = 1;
            N0(ju1Var, i, 20, new at2(new bt2(new c41(uw1VarJ.f(), i4), new us2(this, i2, 3)), i4));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.pu1
    public final void a(ju1 ju1Var, int i, Bundle bundle) {
        ba0 ba0Var;
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            ab4 ab4VarA = ab4.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                na4 na4Var = this.f;
                IBinder iBinderAsBinder = ju1Var.asBinder();
                synchronized (na4Var.n) {
                    try {
                        fr2 fr2VarW = na4Var.w(iBinderAsBinder);
                        ba0Var = fr2VarW != null ? (ba0) ((oi) na4Var.p).get(fr2VarW) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                yk ykVar = ba0Var != null ? ba0Var.b : null;
                if (ykVar == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    ykVar.y(i, ab4VarA);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.pu1
    public final void a0(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 6, Q0(new zr2(7)));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.pu1
    public final void b(ju1 ju1Var, int i, Bundle bundle, boolean z) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 35, Q0(new ts2(il.a(bundle), z, 1)));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.pu1
    public final void d(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        O0(fr2VarW, i, 1, Q0(new zr2(2)));
    }

    @Override // defpackage.pu1
    public final void d0(ju1 ju1Var, int i, long j) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 5, Q0(new xm(j)));
    }

    @Override // defpackage.pu1
    public final void e0(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 2, Q0(new zr2(17)));
    }

    @Override // defpackage.pu1
    public final void f0(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null || i2 < 0) {
            return;
        }
        N0(ju1Var, i, 10, new ss2(2, new us2(this, i2, 0)));
    }

    @Override // defpackage.pu1
    public final void g0(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 26, Q0(new zr2(11)));
    }

    @Override // defpackage.pu1
    public final void h0(ju1 ju1Var, int i, boolean z) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 1, Q0(new t31(3, z)));
    }

    @Override // defpackage.pu1
    public final void i0(ju1 ju1Var, int i, Bundle bundle) {
        o0(ju1Var, i, bundle, true);
    }

    @Override // defpackage.pu1
    public final void j0(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            tn2 tn2Var = (tn2) this.e.get();
            if (tn2Var != null && !tn2Var.l()) {
                f35.W(tn2Var.l, new ur2(3, this, ju1Var));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.pu1
    public final void k(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 24, Q0(new zr2(1)));
    }

    @Override // defpackage.pu1
    public final void l(ju1 ju1Var, int i, Bundle bundle, long j) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 31, new at2(new ef0(29, new ll2(j, gn2.b(bundle)), new zr2(20)), 1));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void m(ju1 ju1Var, fr2 fr2Var) {
        if (ju1Var == null) {
            au0.k(ju1Var);
            return;
        }
        tn2 tn2Var = (tn2) this.e.get();
        if (tn2Var == null || tn2Var.l()) {
            au0.k(ju1Var);
        } else {
            this.g.add(fr2Var);
            f35.W(tn2Var.l, new t6(this, fr2Var, tn2Var, ju1Var, 23));
        }
    }

    @Override // defpackage.pu1
    public final void m0(ju1 ju1Var, int i, Surface surface) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 27, Q0(new ef0(27, this, surface)));
    }

    @Override // defpackage.pu1
    public final void n0(ju1 ju1Var, int i, Bundle bundle) {
        tn2 tn2Var = (tn2) this.e.get();
        if (ju1Var == null || bundle == null || tn2Var == null) {
            au0.k(ju1Var);
            return;
        }
        try {
            MediaService mediaService = tn2Var.f;
            ja0 ja0VarA = ja0.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = ja0VarA.c;
            if (au0.f(callingUid, mediaService, str) == 1) {
                l93.q0("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                au0.k(ju1Var);
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ja0VarA.d;
            }
            try {
                ms2 ms2Var = new ms2(str, callingPid, callingUid);
                boolean zG = hg3.E(mediaService).G(ms2Var);
                int i2 = ja0VarA.a;
                int i3 = ja0VarA.b;
                m(ju1Var, new fr2(ms2Var, i2, i3, zG, new ft2(ju1Var, i3), ja0VarA.e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.pu1
    public final void o0(ju1 ju1Var, int i, Bundle bundle, boolean z) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            gn2 gn2VarB = gn2.b(bundle);
            fr2 fr2VarW = this.f.w(ju1Var.asBinder());
            if (fr2VarW != null) {
                O0(fr2VarW, i, 31, new at2(new ef0(29, new ts2(gn2VarB, z, 0), new zr2(20)), 1));
            }
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        boolean z = false;
        switch (i) {
            case 3002:
                x(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                q0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                y(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                g0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                B0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                o0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                l(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                o0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                L(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                L(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                u(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                h0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                a(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                n0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                ju1 ju1VarM = mm2.m(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                s(ju1VarM, i4, (Bundle) si0.d(parcel, creator), (Bundle) si0.d(parcel, creator), false);
                return true;
            case 3017:
                D0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                H0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                N(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                M(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                v0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                F0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                E0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                q(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                d(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                e0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                r0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                w(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                G(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3030:
                D(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                T(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                Z(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                y0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                C0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                j0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                W(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                f0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                d0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                S(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                H(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                B(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                a0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                v(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                m0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Surface) si0.d(parcel, Surface.CREATOR));
                return true;
            case 3045:
                p0(mm2.m(parcel.readStrongBinder()));
                return true;
            case 3046:
                A0(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                R(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                A(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                ju1 ju1VarM2 = mm2.m(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle = (Bundle) si0.d(parcel, Bundle.CREATOR);
                if (ju1VarM2 != null && string != null && bundle != null) {
                    if (TextUtils.isEmpty(string)) {
                        l93.q0("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            U(ju1VarM2, i5, null, 40010, new at2(new ef0(26, string, lu3.a(bundle)), i3));
                        } catch (RuntimeException e) {
                            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
                        }
                    }
                }
                return true;
            case 3050:
                ju1 ju1VarM3 = mm2.m(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                Bundle bundle2 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                if (ju1VarM3 != null && bundle2 != null) {
                    try {
                        U(ju1VarM3, i6, null, 40010, new at2(new ss2(4, lu3.a(bundle2)), i3));
                    } catch (RuntimeException e2) {
                        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e2);
                    }
                }
                return true;
            case 3051:
                t(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                F(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                K(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                x0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                G0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                P(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                b(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Bundle) si0.d(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                k(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                p(mm2.m(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                ju1 ju1VarM4 = mm2.m(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                s(ju1VarM4, i7, (Bundle) si0.d(parcel, creator2), (Bundle) si0.d(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                z0(mm2.m(parcel.readStrongBinder()), parcel.readInt(), (Surface) si0.d(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                Q(mm2.m(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                jn2 jn2VarA = null;
                switch (i) {
                    case 4001:
                        ju1 ju1VarM5 = mm2.m(parcel.readStrongBinder());
                        int i8 = parcel.readInt();
                        Bundle bundle3 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                        if (ju1VarM5 != null) {
                            if (bundle3 != null) {
                                try {
                                    jn2VarA = jn2.a(bundle3);
                                } catch (RuntimeException e3) {
                                    l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e3);
                                }
                            }
                            U(ju1VarM5, i8, null, 50000, new at2(new ss2(i3, jn2VarA), z ? 1 : 0));
                            break;
                        }
                        return true;
                    case 4002:
                        ju1 ju1VarM6 = mm2.m(parcel.readStrongBinder());
                        int i9 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (ju1VarM6 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                l93.q0("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            U(ju1VarM6, i9, null, 50004, new at2(new zr2(string2), z ? 1 : 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        ju1 ju1VarM7 = mm2.m(parcel.readStrongBinder());
                        int i10 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i11 = parcel.readInt();
                        int i12 = parcel.readInt();
                        Bundle bundle4 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                        if (ju1VarM7 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                l93.q0("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i11 < 0) {
                                l93.q0("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i12 < 1) {
                                l93.q0("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle4 != null) {
                                    try {
                                        jn2VarA = jn2.a(bundle4);
                                    } catch (RuntimeException e4) {
                                        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e4);
                                    }
                                }
                                U(ju1VarM7, i10, null, 50003, new at2(new jm2(string3, i11, i12, jn2VarA), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4004:
                        ju1 ju1VarM8 = mm2.m(parcel.readStrongBinder());
                        int i13 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle5 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                        if (ju1VarM8 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                l93.q0("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        jn2VarA = jn2.a(bundle5);
                                    } catch (RuntimeException e5) {
                                        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                                U(ju1VarM8, i13, null, 50005, new at2(new zr2(string4, jn2VarA), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4005:
                        ju1 ju1VarM9 = mm2.m(parcel.readStrongBinder());
                        int i14 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i15 = parcel.readInt();
                        int i16 = parcel.readInt();
                        Bundle bundle6 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                        if (ju1VarM9 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                l93.q0("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i15 < 0) {
                                l93.q0("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i16 < 1) {
                                l93.q0("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        jn2VarA = jn2.a(bundle6);
                                    } catch (RuntimeException e6) {
                                        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                                U(ju1VarM9, i14, null, 50006, new at2(new ij0(string5, i15, i16, jn2VarA), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4006:
                        ju1 ju1VarM10 = mm2.m(parcel.readStrongBinder());
                        int i17 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle7 = (Bundle) si0.d(parcel, Bundle.CREATOR);
                        if (ju1VarM10 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                l93.q0("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        jn2VarA = jn2.a(bundle7);
                                    } catch (RuntimeException e7) {
                                        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                                U(ju1VarM10, i17, null, 50001, new at2(new ef0(28, string6, jn2VarA), z ? 1 : 0));
                            }
                            break;
                        }
                        return true;
                    case 4007:
                        ju1 ju1VarM11 = mm2.m(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (ju1VarM11 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                l93.q0("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            U(ju1VarM11, i18, null, 50002, new at2(new ss2(z ? 1 : 0, string7), z ? 1 : 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.pu1
    public final void p(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 24, Q0(new zr2(15)));
    }

    @Override // defpackage.pu1
    public final void p0(ju1 ju1Var) {
        if (ju1Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            tn2 tn2Var = (tn2) this.e.get();
            if (tn2Var != null && !tn2Var.l()) {
                fr2 fr2VarW = this.f.w(ju1Var.asBinder());
                if (fr2VarW != null) {
                    f35.W(tn2Var.l, new ur2(4, this, fr2VarW));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.pu1
    public final void q(ju1 ju1Var, int i) {
        fr2 fr2VarW;
        if (ju1Var == null || (fr2VarW = this.f.w(ju1Var.asBinder())) == null) {
            return;
        }
        M0(fr2VarW, i);
    }

    @Override // defpackage.pu1
    public final void q0(ju1 ju1Var, int i, int i2) {
        if (ju1Var == null || i2 < 0) {
            return;
        }
        N0(ju1Var, i, 25, Q0(new ij0(i2, 10)));
    }

    @Override // defpackage.pu1
    public final void r0(ju1 ju1Var, int i, Bundle bundle) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 13, Q0(new ql2(new qh3(bundle.getFloat(qh3.e, 1.0f), bundle.getFloat(qh3.f, 1.0f)), 2)));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.pu1
    public final void s(ju1 ju1Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundleN = f35.n(bundle2);
        if (ju1Var == null || bundle == null || bundleN == null) {
            return;
        }
        try {
            va4 va4VarA = va4.a(bundle);
            if (!j60.n(va4VarA.b)) {
                U(ju1Var, i, va4VarA, 0, new at2(new ef0(z, va4VarA, bundleN), 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                tn2 tn2Var = (tn2) this.e.get();
                if (tn2Var != null && !tn2Var.l()) {
                    fr2 fr2VarW = this.f.w(ju1Var.asBinder());
                    if (fr2VarW == null) {
                        return;
                    }
                    f35.W(tn2Var.l, new ls1(this, fr2VarW, va4VarA, tn2Var, i, ju1Var));
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.pu1
    public final void t(ju1 ju1Var, int i, int i2, int i3) {
        if (ju1Var == null || i2 < 0) {
            return;
        }
        N0(ju1Var, i, 33, Q0(new v31(i2, i3, 4)));
    }

    @Override // defpackage.pu1
    public final void t0(ju1 ju1Var, int i, Bundle bundle, Bundle bundle2) {
        s(ju1Var, i, bundle, bundle2, false);
    }

    @Override // defpackage.pu1
    public final void u(ju1 ju1Var, int i, IBinder iBinder, int i2, long j) {
        if (ju1Var == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                yw1 yw1VarA = iw.a(iBinder);
                uw1 uw1VarJ = yw1.j();
                for (int i3 = 0; i3 < yw1VarA.size(); i3++) {
                    Bundle bundle = (Bundle) yw1VarA.get(i3);
                    bundle.getClass();
                    uw1VarJ.c(gn2.b(bundle));
                }
                N0(ju1Var, i, 20, new at2(new ef0(29, new lj0(j, uw1VarJ.f(), i2), new zr2(20)), 1));
            } catch (RuntimeException e) {
                l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.pu1
    public final void v(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 8, Q0(new zr2(3)));
    }

    @Override // defpackage.pu1
    public final void v0(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 20, Q0(new zr2(18)));
    }

    @Override // defpackage.pu1
    public final void w(ju1 ju1Var, int i, float f) {
        if (ju1Var == null || f <= 0.0f) {
            return;
        }
        N0(ju1Var, i, 13, Q0(new w31(3, f)));
    }

    @Override // defpackage.pu1
    public final void x(ju1 ju1Var, int i, float f) {
        if (ju1Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        N0(ju1Var, i, 24, Q0(new w31(4, f)));
    }

    @Override // defpackage.pu1
    public final void x0(ju1 ju1Var, int i, final boolean z, final int i2) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 34, Q0(new wc0() { // from class: xs2
            @Override // defpackage.wc0
            public final void accept(Object obj) {
                ((al3) obj).E(i2, z);
            }
        }));
    }

    @Override // defpackage.pu1
    public final void y(ju1 ju1Var, int i) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 26, Q0(new zr2(4)));
    }

    @Override // defpackage.pu1
    public final void y0(ju1 ju1Var, int i, Bundle bundle) {
        if (ju1Var == null || bundle == null) {
            return;
        }
        try {
            N0(ju1Var, i, 19, Q0(new r31(do2.b(bundle), 2)));
        } catch (RuntimeException e) {
            l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // defpackage.pu1
    public final void z0(ju1 ju1Var, int i, Surface surface, int i2, int i3) {
        if (ju1Var == null) {
            return;
        }
        N0(ju1Var, i, 27, Q0(new hl2(this, surface, i2, i3, 2)));
    }
}
