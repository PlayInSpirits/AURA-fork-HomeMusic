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

    public kt2(tn2 r2) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.e = new WeakReference(r2);
        this.f = new na4(r2);
        this.g = Collections.synchronizedSet(new HashSet());
        this.h = fy3.v;
    }

    public static ic2 K0(tn2 r6, fr2 r7, int r8, it2 r9, wc0 r10) {
        if (r6.l() == true) goto L5;
        ic2 r4 = (ic2) r9.h(r6, r7, r8);
        lb4 r2 = new lb4();
        r4.f(new t6(r6, r2, r10, r4, 24), gq0.n);
        return r2;
    L5:
        return mw1.o;
    }

    public static void P0(tn2 r1, fr2 r2, int r3, ab4 r4) {
        er2 r0 = r2.d;     // Catch: RemoteException -> L4
        r0.getClass();     // Catch: RemoteException -> L4
        r0.v(r3, r4);     // Catch: RemoteException -> L4
        r1.c.a(true, true);     // Catch: RemoteException -> L4
        return;
    L4:
        e = move-exception;
        l93.r0("MediaSessionStub", "Failed to send result to controller " + r2, e);
    }

    public static ss2 Q0(wc0 r2) {
        ss2 r0 = new ss2(3, r2);
        return new ss2(2, r0);
    }

    @Override // defpackage.pu1
    public final void A(ju1 r3, int r4, Bundle r5) {
        if (r3 == null) goto L13;
        if (r5 == null) goto L14;
        N0(r3, r4, 29, Q0(new ef0(23, this, cw4.b(r5))));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        return;
    L14:
        return;
    }

    @Override // defpackage.pu1
    public final void A0(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 7, Q0(new zr2(6)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void B(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 12, Q0(new zr2(9)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void B0(ju1 r3, int r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 26, Q0(new t31(4, r5)));
    }

    @Override // defpackage.pu1
    public final void C0(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 3, Q0(new zr2(14)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void D(ju1 r3, int r4, int r5, Bundle r6) {
        if (r3 == null) goto L14;
        if (r6 == null) goto L15;
        if (r5 < 0) goto L16;
        vs2 r0 = new vs2(0, gn2.b(r6));
        int r1 = 1;
        N0(r3, r4, 20, new at2(new bt2(r0, new us2(this, r5, r1)), r1));
        return;
    L9:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L16:
        return;
    L15:
        return;
    }

    @Override // defpackage.pu1
    public final void D0(ju1 r3, int r4, int r5) {
        if (r3 != null) goto L5;
        return;
    L5:
        if (r5 == 2) goto L10;
        if (r5 == 0) goto L10;
        if (r5 == 1) goto L10;
        return;
    L10:
        N0(r3, r4, 15, Q0(new ij0(r5, 8)));
    }

    @Override // defpackage.pu1
    public final void E0(ju1 r2, int r3, final int r4, final int r5, final int r6) {
        if (r2 == null) goto L9;
        if (r4 < 0) goto L10;
        if (r5 < r4) goto L11;
        if (r6 < 0) goto L12;
        N0(r2, r3, 20, Q0(new ws2(r4, r5, r6)));
        return;
    L12:
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // defpackage.pu1
    public final void F(ju1 r3, int r4, int r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 34, Q0(new ij0(r5, 7)));
    }

    @Override // defpackage.pu1
    public final void F0(ju1 r3, int r4, int r5, int r6) {
        if (r3 == null) goto L8;
        if (r5 < 0) goto L9;
        if (r6 < 0) goto L10;
        N0(r3, r4, 20, Q0(new v31(r5, r6, 5)));
        return;
    L10:
        return;
    L9:
        return;
    }

    @Override // defpackage.pu1
    public final void G(ju1 r3, int r4, Bundle r5) {
        if (r3 == null) goto L13;
        if (r5 == null) goto L14;
        N0(r3, r4, 20, new at2(new bt2(new vs2(2, gn2.b(r5)), new zr2(13)), 1));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L14:
        return;
    }

    @Override // defpackage.pu1
    public final void G0(ju1 r4, int r5, int r6, Bundle r7) {
        if (r4 == null) goto L14;
        if (r7 == null) goto L15;
        if (r6 < 0) goto L16;
        int r1 = 1;
        N0(r4, r5, 20, new at2(new bt2(new vs2(r1, gn2.b(r7)), new us2(this, r6, 2)), r1));
        return;
    L9:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L16:
        return;
    L15:
        return;
    }

    @Override // defpackage.pu1
    public final void H(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 11, Q0(new zr2(5)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void H0(ju1 r3, int r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 14, Q0(new t31(5, r5)));
    }

    @Override // defpackage.pu1
    public final void J(ju1 r2, int r3, iw r4) {
        L(r2, r3, r4, true);
    }

    @Override // defpackage.pu1
    public final void K(ju1 r3, int r4, int r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 34, Q0(new ij0(r5, 6)));
    }

    @Override // defpackage.pu1
    public final void L(ju1 r4, int r5, IBinder r6, boolean r7) {
        if (r4 == null) goto L18;
        if (r6 == null) goto L19;
        yw1 r8 = iw.a(r6);     // Catch: RuntimeException -> L12
        uw1 r0 = yw1.j();     // Catch: RuntimeException -> L12
        int r1 = 0;
    L7:
        if (r1 >= r8.size()) goto L9;
        Bundle r2 = (Bundle) r8.get(r1);     // Catch: RuntimeException -> L12
        r2.getClass();     // Catch: RuntimeException -> L12
        r0.c(gn2.b(r2));     // Catch: RuntimeException -> L12
        r1 = r1 + 1;     // Catch: RuntimeException -> L12
        goto L7
    L9:
        int r3 = 29;
        N0(r4, r5, 20, new at2(new ef0(r3, new ts2(r0.f(), r7, 2), new zr2(20)), 1));
        return;
    L12:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L19:
        return;
    }

    public final int L0(fr2 r3, al3 r4, int r5) {
        if (r4.S0(17) == false) goto L10;
        na4 r2 = this.f;
        if (r2.H(r3, 17) == true) goto L10;
        if (r2.H(r3, 16) == false) goto L10;
        return r4.o0() + r5;
    L10:
        return r5;
    }

    @Override // defpackage.pu1
    public final void M(ju1 r2, int r3, int r4, int r5) {
        if (r2 == null) goto L8;
        if (r4 < 0) goto L9;
        if (r5 < r4) goto L10;
        rs2 r0 = new rs2(this, r4, r5);
        N0(r2, r3, 20, new ss2(2, r0));
        return;
    L10:
        return;
    L9:
        return;
    }

    public final void M0(fr2 r3, int r4) {
        O0(r3, r4, 1, Q0(new ef0(25, this, r3)));
    }

    @Override // defpackage.pu1
    public final void N(ju1 r3, int r4, int r5) {
        if (r3 == null) goto L7;
        if (r5 < 0) goto L8;
        us2 r0 = new us2(this, r5, 4);
        N0(r3, r4, 20, new ss2(2, r0));
        return;
    L8:
        return;
    }

    public final void N0(ju1 r2, int r3, int r4, it2 r5) {
        fr2 r6 = this.f.w(r2.asBinder());
        if (r6 == null) goto L6;
        O0(r6, r3, r4, r5);
        return;
    }

    public final void O0(final fr2 r11, final int r12, final int r13, final it2 r14) {
        long r1 = Binder.clearCallingIdentity();
        final tn2 r7 = (tn2) this.e.get();     // Catch: Throwable -> L11
        if (r7 != null) goto L6;
    L13:
        Binder.restoreCallingIdentity(r1);
        return;
    L6:
        if (r7.l() == true) goto L13;
        f35.W(r7.l, new zs2(this, r11, r13, r7, r12, r14));     // Catch: Throwable -> L11
        Binder.restoreCallingIdentity(r1);
        return;
    L11:
        th = move-exception;
        Binder.restoreCallingIdentity(r1);
        throw th;
    }

    @Override // defpackage.pu1
    public final void P(ju1 r4, int r5, int r6, int r7, IBinder r8) {
        if (r4 == null) goto L20;
        if (r8 == null) goto L21;
        if (r6 < 0) goto L22;
        if (r7 < r6) goto L23;
        yw1 r9 = iw.a(r8);     // Catch: RuntimeException -> L14
        uw1 r0 = yw1.j();     // Catch: RuntimeException -> L14
        int r1 = 0;
    L9:
        if (r1 >= r9.size()) goto L11;
        Bundle r2 = (Bundle) r9.get(r1);     // Catch: RuntimeException -> L14
        r2.getClass();     // Catch: RuntimeException -> L14
        r0.c(gn2.b(r2));     // Catch: RuntimeException -> L14
        r1 = r1 + 1;     // Catch: RuntimeException -> L14
        goto L9
    L11:
        N0(r4, r5, 20, new at2(new bt2(new vr2(r0.f()), new rs2(this, r6, r7)), 1));
        return;
    L14:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L23:
        return;
    L22:
        return;
    L21:
        return;
    }

    @Override // defpackage.pu1
    public final void Q(ju1 r2, int r3, int r4, int r5) {
        if (r2 != null) goto L4;
        return;
    L4:
        N0(r2, r3, 27, Q0(new rs2(this, r4, r5)));
    }

    @Override // defpackage.pu1
    public final void R(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 9, Q0(new zr2(10)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void S(ju1 r2, int r3, int r4, long r5) {
        if (r2 == null) goto L7;
        if (r4 < 0) goto L8;
        lj0 r0 = new lj0(r5, this, r4);
        N0(r2, r3, 10, new ss2(2, r0));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void T(ju1 r4, int r5, IBinder r6) {
        if (r4 == null) goto L18;
        if (r6 == null) goto L19;
        yw1 r7 = iw.a(r6);     // Catch: RuntimeException -> L12
        uw1 r0 = yw1.j();     // Catch: RuntimeException -> L12
        int r1 = 0;
    L7:
        if (r1 >= r7.size()) goto L9;
        Bundle r2 = (Bundle) r7.get(r1);     // Catch: RuntimeException -> L12
        r2.getClass();     // Catch: RuntimeException -> L12
        r0.c(gn2.b(r2));     // Catch: RuntimeException -> L12
        r1 = r1 + 1;     // Catch: RuntimeException -> L12
        goto L7
    L9:
        N0(r4, r5, 20, new at2(new bt2(new c41(r0.f(), 2), new zr2(12)), 1));
        return;
    L12:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L19:
        return;
    }

    public final void U(ju1 r12, final int r13, final va4 r14, final int r15, final it2 r16) {
        long r1 = Binder.clearCallingIdentity();
        final tn2 r7 = (tn2) this.e.get();     // Catch: Throwable -> L15
        if (r7 != null) goto L6;
    L17:
        Binder.restoreCallingIdentity(r1);
        return;
    L6:
        if (r7.l() == true) goto L17;
        final fr2 r5 = this.f.w(r12.asBinder());     // Catch: Throwable -> L15
        if (r5 != null) goto L12;
        Binder.restoreCallingIdentity(r1);
        return;
    L12:
        f35.W(r7.l, new ys2(this, r5, r14, r7, r13, r15, r16));     // Catch: Throwable -> L15
        Binder.restoreCallingIdentity(r1);
        return;
    L15:
        th = move-exception;
        Binder.restoreCallingIdentity(r1);
        throw th;
    }

    @Override // defpackage.pu1
    public final void W(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 4, Q0(new zr2(16)));
    }

    public final lk3 X(lk3 r10) {
        yw1 r0 = r10.F.a;
        uw1 r1 = yw1.j();
        nw1 r2 = new nw1(4);
        int r3 = 0;
    L4:
        if (r3 >= r0.size()) goto L10;
        iw4 r4 = (iw4) r0.get(r3);
        sv4 r5 = r4.b;
        String r6 = (String) this.h.get(r5);
        if (r6 != null) goto L8;
        StringBuilder r7 = new StringBuilder();
        int r8 = this.i;
        this.i = r8 + 1;
        String r9 = f35.a;
        r7.append(Integer.toString(r8, 36));
        r7.append("-");
        r7.append(r5.b);
        r6 = r7.toString();
    L8:
        r2.F(r5, r6);
        r1.c(new iw4(new sv4(r6, r4.b.d), r4.c, r4.d, r4.e));
        r3 = r3 + 1;
        goto L4
    L10:
        if (r2.o != 0) goto L12;
        fy3 r11 = fy3.v;
    L13:
        this.h = r11;
        lk3 r12 = r10.b(new jw4(r1.f()));
        cw4 r13 = r12.G;
        if (r13.H.isEmpty() == false) goto L16;
        return r12;
    L16:
        bw4 r14 = r13.a().c();
        o15 r15 = r13.H.f().h();
    L18:
        if (r15.hasNext() == false) goto L24;
        yv4 r16 = (yv4) r15.next();
        sv4 r17 = r16.a;
        String r18 = (String) this.h.get(r17);
        if (r18 != null) goto L21;
        r14.a(r16);
        goto L18
    L21:
        r14.a(new yv4(new sv4(r18, r17.d), r16.b));
        goto L18
    L24:
        return r12.o(r14.b());
    L12:
        Object[] r19 = (Object[]) r2.p;
        r11 = new fy3(r2.o, r19);
        goto L13
    }

    @Override // defpackage.pu1
    public final void Z(ju1 r4, int r5, int r6, IBinder r7) {
        if (r4 == null) goto L19;
        if (r7 == null) goto L20;
        if (r6 < 0) goto L21;
        yw1 r8 = iw.a(r7);     // Catch: RuntimeException -> L13
        uw1 r0 = yw1.j();     // Catch: RuntimeException -> L13
        int r1 = 0;
    L8:
        if (r1 >= r8.size()) goto L10;
        Bundle r2 = (Bundle) r8.get(r1);     // Catch: RuntimeException -> L13
        r2.getClass();     // Catch: RuntimeException -> L13
        r0.c(gn2.b(r2));     // Catch: RuntimeException -> L13
        r1 = r1 + 1;     // Catch: RuntimeException -> L13
        goto L8
    L10:
        int r3 = 1;
        N0(r4, r5, 20, new at2(new bt2(new c41(r0.f(), r3), new us2(this, r6, 3)), r3));
        return;
    L13:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L21:
        return;
    L20:
        return;
    }

    @Override // defpackage.pu1
    public final void a(ju1 r5, int r6, Bundle r7) {
        if (r5 == null) goto L38;
        if (r7 == null) goto L39;
        ab4 r8 = ab4.a(r7);     // Catch: RuntimeException -> L30
        long r0 = Binder.clearCallingIdentity();
        na4 r4 = this.f;     // Catch: Throwable -> L24
        IBinder r9 = r5.asBinder();     // Catch: Throwable -> L24
        Object r2 = r4.n;     // Catch: Throwable -> L24
        monitor-enter(r2);     // Catch: Throwable -> L24
        fr2 r10 = r4.w(r9);     // Catch: Throwable -> L12
        yk r3 = null;
        if (r10 == null) goto L14;
        ba0 r11 = (ba0) ((oi) r4.p).get(r10);     // Catch: Throwable -> L12
    L15:
        monitor-exit(r2);     // Catch: Throwable -> L12
        if (r11 == null) goto L18;
        r3 = r11.b;     // Catch: Throwable -> L24
    L18:
        if (r3 != null) goto L21;
        Binder.restoreCallingIdentity(r0);
        return;
    L21:
        r3.y(r6, r8);     // Catch: Throwable -> L24
        Binder.restoreCallingIdentity(r0);
        return;
    L14:
        r11 = null;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        Binder.restoreCallingIdentity(r0);
        throw th;
    L30:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        return;
    L39:
        return;
    }

    @Override // defpackage.pu1
    public final void a0(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 6, Q0(new zr2(7)));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.pu1
    public final void b(ju1 r3, int r4, Bundle r5, boolean r6) {
        if (r3 == null) goto L13;
        if (r5 == null) goto L14;
        N0(r3, r4, 35, Q0(new ts2(il.a(r5), r6, 1)));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        return;
    L14:
        return;
    }

    @Override // defpackage.pu1
    public final void d(ju1 r3, int r4) {
        if (r3 == null) goto L9;
        fr2 r5 = this.f.w(r3.asBinder());
        if (r5 == null) goto L8;
        O0(r5, r4, 1, Q0(new zr2(2)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void d0(ju1 r2, int r3, long r4) {
        if (r2 != null) goto L4;
        return;
    L4:
        N0(r2, r3, 5, Q0(new xm(r4)));
    }

    @Override // defpackage.pu1
    public final void e0(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 2, Q0(new zr2(17)));
    }

    @Override // defpackage.pu1
    public final void f0(ju1 r3, int r4, int r5) {
        if (r3 == null) goto L7;
        if (r5 < 0) goto L8;
        us2 r0 = new us2(this, r5, 0);
        N0(r3, r4, 10, new ss2(2, r0));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void g0(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 26, Q0(new zr2(11)));
    }

    @Override // defpackage.pu1
    public final void h0(ju1 r3, int r4, boolean r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 1, Q0(new t31(3, r5)));
    }

    @Override // defpackage.pu1
    public final void i0(ju1 r2, int r3, Bundle r4) {
        o0(r2, r3, r4, true);
    }

    @Override // defpackage.pu1
    public final void j0(ju1 r5, int r6) {
        if (r5 != null) goto L4;
        return;
    L4:
        long r0 = Binder.clearCallingIdentity();
        tn2 r7 = (tn2) this.e.get();     // Catch: Throwable -> L13
        if (r7 != null) goto L8;
    L15:
        Binder.restoreCallingIdentity(r0);
        return;
    L8:
        if (r7.l() == true) goto L15;
        f35.W(r7.l, new ur2(3, this, r5));     // Catch: Throwable -> L13
        Binder.restoreCallingIdentity(r0);
        return;
    L13:
        th = move-exception;
        Binder.restoreCallingIdentity(r0);
        throw th;
    }

    @Override // defpackage.pu1
    public final void k(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 24, Q0(new zr2(1)));
    }

    @Override // defpackage.pu1
    public final void l(ju1 r2, int r3, Bundle r4, long r5) {
        if (r2 == null) goto L13;
        if (r4 == null) goto L14;
        int r6 = 29;
        N0(r2, r3, 31, new at2(new ef0(r6, new ll2(r5, gn2.b(r4)), new zr2(20)), 1));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L14:
        return;
    }

    public final void m(ju1 r8, fr2 r9) {
        if (r8 == null) goto L12;
        tn2 r4 = (tn2) this.e.get();
        if (r4 == null) goto L10;
        if (r4.l() == true) goto L10;
        this.g.add(r9);
        f35.W(r4.l, new t6(this, r9, r4, r8, 23));
        return;
    L10:
        au0.k(r8);
        return;
    L12:
        au0.k(r8);
    }

    @Override // defpackage.pu1
    public final void m0(ju1 r3, int r4, Surface r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 27, Q0(new ef0(27, this, r5)));
    }

    @Override // defpackage.pu1
    public final void n0(ju1 r18, int r19, Bundle r20) {
        tn2 r3 = (tn2) this.e.get();
        if (r18 == null) goto L25;
        if (r20 == null) goto L25;
        if (r3 == null) goto L25;
        MediaService r4 = r3.f;     // Catch: RuntimeException -> L22
        ja0 r5 = ja0.a(r20);     // Catch: RuntimeException -> L22
        int r6 = Binder.getCallingUid();
        int r7 = Binder.getCallingPid();
        String r8 = r5.c;
        if (au0.f(r6, r4, r8) != 1) goto L12;
        l93.q0("MediaSessionStub", "Ignoring connection from invalid package name " + r8 + " (uid=" + r6 + ")");
        au0.k(r18);
        return;
    L12:
        long r9 = Binder.clearCallingIdentity();
        if (r7 != 0) goto L29;
        r7 = r5.d;
    L29:
        ms2 r11 = new ms2(r8, r7, r6);     // Catch: Throwable -> L19
        boolean r14 = hg3.E(r4).G(r11);     // Catch: Throwable -> L19
        int r12 = r5.a;     // Catch: Throwable -> L19
        int r13 = r5.b;     // Catch: Throwable -> L19
        m(r18, new fr2(r11, r12, r13, r14, new ft2(r18, r13), r5.e));     // Catch: Throwable -> L19
        Binder.restoreCallingIdentity(r9);
        return;
    L19:
        th = move-exception;
        Binder.restoreCallingIdentity(r9);
        throw th;
    L22:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        return;
    L25:
        au0.k(r18);
    }

    @Override // defpackage.pu1
    public final void o0(ju1 r3, int r4, Bundle r5, boolean r6) {
        if (r3 == null) goto L15;
        if (r5 == null) goto L17;
        gn2 r7 = gn2.b(r5);     // Catch: RuntimeException -> L10
        fr2 r8 = this.f.w(r3.asBinder());
        if (r8 == null) goto L16;
        int r1 = 29;
        O0(r8, r4, 31, new at2(new ef0(r1, new ts2(r7, r6, 0), new zr2(20)), 1));
        return;
    L16:
        return;
    L10:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    L17:
        return;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r13, Parcel r14, Parcel r15, int r16) {
        int r7 = 1;
        if (r13 < 1) goto L8;
        if (r13 > 16777215) goto L8;
        r14.enforceInterface("androidx.media3.session.IMediaSession");
    L8:
        if (r13 != 1598968902) goto L11;
        r15.writeString("androidx.media3.session.IMediaSession");
        return true;
    L11:
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        boolean r11 = false;
        switch(r13) {
            case 3002: goto L263;
            case 3003: goto L261;
            case 3004: goto L259;
            case 3005: goto L257;
            case 3006: goto L252;
            case 3007: goto L250;
            case 3008: goto L248;
            case 3009: goto L243;
            case 3010: goto L241;
            case 3011: goto L236;
            case 3012: goto L234;
            case 3013: goto L229;
            case 3014: goto L227;
            case 3015: goto L225;
            case 3016: goto L223;
            case 3017: goto L221;
            case 3018: goto L216;
            case 3019: goto L214;
            case 3020: goto L212;
            case 3021: goto L210;
            case 3022: goto L208;
            case 3023: goto L206;
            case 3024: goto L204;
            case 3025: goto L202;
            case 3026: goto L200;
            case 3027: goto L198;
            case 3028: goto L196;
            case 3029: goto L194;
            case 3030: goto L192;
            case 3031: goto L190;
            case 3032: goto L188;
            case 3033: goto L186;
            case 3034: goto L184;
            case 3035: goto L182;
            case 3036: goto L180;
            case 3037: goto L178;
            case 3038: goto L176;
            case 3039: goto L174;
            case 3040: goto L172;
            case 3041: goto L170;
            case 3042: goto L168;
            case 3043: goto L166;
            case 3044: goto L164;
            case 3045: goto L162;
            case 3046: goto L160;
            case 3047: goto L158;
            case 3048: goto L156;
            case 3049: goto L143;
            case 3050: goto L135;
            case 3051: goto L133;
            case 3052: goto L131;
            case 3053: goto L129;
            case 3054: goto L124;
            case 3055: goto L122;
            case 3056: goto L120;
            case 3057: goto L115;
            case 3058: goto L113;
            case 3059: goto L111;
            case 3060: goto L104;
            case 3061: goto L102;
            case 3062: goto L100;
            default: goto L13;
        };
    L13:
        jn2 r12 = null;
        switch(r13) {
            case 4001: goto L91;
            case 4002: goto L82;
            case 4003: goto L66;
            case 4004: goto L54;
            case 4005: goto L38;
            case 4006: goto L26;
            case 4007: goto L17;
            default: goto L16;
        };
    L17:
        ju1 r0 = mm2.m(r14.readStrongBinder());
        int r2 = r14.readInt();
        String r1 = r14.readString();
        if (r0 != null) goto L21;
    L155:
        return true;
    L21:
        if (TextUtils.isEmpty(r1) == false) goto L24;
        l93.q0("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
        return true;
    L24:
        U(r0, r2, null, 50002, new at2(new ss2(r4 ? 1 : 0, r1), r4 ? 1 : 0));
        return true;
    L26:
        ju1 r3 = mm2.m(r14.readStrongBinder());
        int r17 = r14.readInt();
        String r18 = r14.readString();
        Bundle r19 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r3 == null) goto L155;
        if (TextUtils.isEmpty(r18) == false) goto L32;
        l93.q0("MediaSessionStub", "subscribe(): Ignoring empty parentId");
        goto L155
    L32:
        if (r19 != null) goto L265;
    L35:
        U(r3, r17, null, 50001, new at2(new ef0(28, r18, r12), r4 ? 1 : 0));
        goto L155
    L265:
        r12 = jn2.a(r19);     // Catch: RuntimeException -> L36
    L36:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L155
    L38:
        ju1 r20 = mm2.m(r14.readStrongBinder());
        int r21 = r14.readInt();
        String r22 = r14.readString();
        int r23 = r14.readInt();
        int r110 = r14.readInt();
        Bundle r24 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r20 == null) goto L155;
        if (TextUtils.isEmpty(r22) == false) goto L44;
        l93.q0("MediaSessionStub", "getSearchResult(): Ignoring empty query");
        goto L155
    L44:
        if (r23 >= 0) goto L46;
        l93.q0("MediaSessionStub", "getSearchResult(): Ignoring negative page");
        goto L155
    L46:
        if (r110 >= 1) goto L48;
        l93.q0("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
        goto L155
    L48:
        if (r24 != null) goto L269;
    L51:
        U(r20, r21, null, 50006, new at2(new ij0(r22, r23, r110, r12), r4 ? 1 : 0));
        goto L155
    L269:
        r12 = jn2.a(r24);     // Catch: RuntimeException -> L52
    L52:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L155
    L54:
        ju1 r25 = mm2.m(r14.readStrongBinder());
        int r26 = r14.readInt();
        String r27 = r14.readString();
        Bundle r28 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r25 == null) goto L155;
        if (TextUtils.isEmpty(r27) == false) goto L60;
        l93.q0("MediaSessionStub", "search(): Ignoring empty query");
        goto L155
    L60:
        if (r28 != null) goto L277;
    L63:
        U(r25, r26, null, 50005, new at2(new zr2(r27, r12), r4 ? 1 : 0));
        goto L155
    L277:
        r12 = jn2.a(r28);     // Catch: RuntimeException -> L64
    L64:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L155
    L66:
        ju1 r29 = mm2.m(r14.readStrongBinder());
        int r30 = r14.readInt();
        String r31 = r14.readString();
        int r32 = r14.readInt();
        int r111 = r14.readInt();
        Bundle r33 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r29 == null) goto L155;
        if (TextUtils.isEmpty(r31) == false) goto L72;
        l93.q0("MediaSessionStub", "getChildren(): Ignoring empty parentId");
        goto L155
    L72:
        if (r32 >= 0) goto L74;
        l93.q0("MediaSessionStub", "getChildren(): Ignoring negative page");
        goto L155
    L74:
        if (r111 >= 1) goto L76;
        l93.q0("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
        goto L155
    L76:
        if (r33 != null) goto L273;
    L79:
        U(r29, r30, null, 50003, new at2(new jm2(r31, r32, r111, r12), r4 ? 1 : 0));
        goto L155
    L273:
        r12 = jn2.a(r33);     // Catch: RuntimeException -> L80
    L80:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L155
    L82:
        ju1 r34 = mm2.m(r14.readStrongBinder());
        int r35 = r14.readInt();
        String r36 = r14.readString();
        if (r34 == null) goto L155;
        if (TextUtils.isEmpty(r36) == false) goto L89;
        l93.q0("MediaSessionStub", "getItem(): Ignoring empty mediaId");
        return true;
    L89:
        U(r34, r35, null, 50004, new at2(new zr2(r36), r4 ? 1 : 0));
        return true;
    L91:
        ju1 r37 = mm2.m(r14.readStrongBinder());
        int r38 = r14.readInt();
        Bundle r39 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r37 == null) goto L155;
        if (r39 != null) goto L267;
    L97:
        U(r37, r38, null, 50000, new at2(new ss2(r7, r12), r4 ? 1 : 0));
        goto L155
    L267:
        r12 = jn2.a(r39);     // Catch: RuntimeException -> L98
    L98:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L155
    L16:
        return super.onTransact(r13, r14, r15, r16);
    L100:
        Q(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt());
        return true;
    L102:
        z0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Surface) si0.d(r14, Surface.CREATOR), r14.readInt(), r14.readInt());
        return true;
    L104:
        ju1 r40 = mm2.m(r14.readStrongBinder());
        int r41 = r14.readInt();
        Parcelable.Creator r42 = Bundle.CREATOR;
        Bundle r43 = (Bundle) si0.d(r14, r42);
        Bundle r44 = (Bundle) si0.d(r14, r42);
        if (r14.readInt() == 0) goto L108;
        boolean r45 = true;
    L109:
        s(r40, r41, r43, r44, r45);
        return true;
    L108:
        r45 = false;
        goto L109
    L111:
        p(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L113:
        k(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L115:
        ju1 r46 = mm2.m(r14.readStrongBinder());
        int r47 = r14.readInt();
        Bundle r48 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r14.readInt() == 0) goto L118;
        r5 = true;
    L118:
        b(r46, r47, r48, r5);
        return true;
    L120:
        P(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt(), r14.readStrongBinder());
        return true;
    L122:
        G0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L124:
        ju1 r49 = mm2.m(r14.readStrongBinder());
        int r50 = r14.readInt();
        if (r14.readInt() == 0) goto L127;
        r6 = true;
    L127:
        x0(r49, r50, r6, r14.readInt());
        return true;
    L129:
        K(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L131:
        F(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L133:
        t(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt());
        return true;
    L135:
        ju1 r51 = mm2.m(r14.readStrongBinder());
        int r52 = r14.readInt();
        Bundle r53 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r51 == null) goto L155;
        if (r53 == null) goto L155;
        U(r51, r52, null, 40010, new at2(new ss2(4, lu3.a(r53)), r7));
    L141:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        goto L155
    L143:
        ju1 r54 = mm2.m(r14.readStrongBinder());
        int r55 = r14.readInt();
        String r56 = r14.readString();
        Bundle r57 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r54 == null) goto L155;
        if (r56 == null) goto L155;
        if (r57 == null) goto L155;
        if (TextUtils.isEmpty(r56) == false) goto L275;
        l93.q0("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
        goto L155
    L275:
        U(r54, r55, null, 40010, new at2(new ef0(26, r56, lu3.a(r57)), r7));
    L153:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        goto L155
    L156:
        A(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L158:
        R(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L160:
        A0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L162:
        p0(mm2.m(r14.readStrongBinder()));
        return true;
    L164:
        m0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Surface) si0.d(r14, Surface.CREATOR));
        return true;
    L166:
        v(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L168:
        a0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L170:
        B(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L172:
        H(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L174:
        S(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readLong());
        return true;
    L176:
        d0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readLong());
        return true;
    L178:
        f0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L180:
        W(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L182:
        j0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L184:
        C0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L186:
        y0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L188:
        Z(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readStrongBinder());
        return true;
    L190:
        T(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readStrongBinder());
        return true;
    L192:
        D(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L194:
        G(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L196:
        w(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readFloat());
        return true;
    L198:
        r0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L200:
        e0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L202:
        d(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L204:
        q(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L206:
        E0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt(), r14.readInt());
        return true;
    L208:
        F0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt());
        return true;
    L210:
        v0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L212:
        M(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt(), r14.readInt());
        return true;
    L214:
        N(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L216:
        ju1 r58 = mm2.m(r14.readStrongBinder());
        int r59 = r14.readInt();
        if (r14.readInt() == 0) goto L219;
        r8 = true;
    L219:
        H0(r58, r59, r8);
        return true;
    L221:
        D0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L223:
        ju1 r60 = mm2.m(r14.readStrongBinder());
        int r61 = r14.readInt();
        Parcelable.Creator r62 = Bundle.CREATOR;
        s(r60, r61, (Bundle) si0.d(r14, r62), (Bundle) si0.d(r14, r62), false);
        return true;
    L225:
        n0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L227:
        a(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR));
        return true;
    L229:
        ju1 r63 = mm2.m(r14.readStrongBinder());
        int r64 = r14.readInt();
        if (r14.readInt() == 0) goto L232;
        r9 = true;
    L232:
        h0(r63, r64, r9);
        return true;
    L234:
        u(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readStrongBinder(), r14.readInt(), r14.readLong());
        return true;
    L236:
        ju1 r65 = mm2.m(r14.readStrongBinder());
        int r66 = r14.readInt();
        IBinder r67 = r14.readStrongBinder();
        if (r14.readInt() == 0) goto L239;
        r10 = true;
    L239:
        L(r65, r66, r67, r10);
        return true;
    L241:
        L(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readStrongBinder(), true);
        return true;
    L243:
        ju1 r68 = mm2.m(r14.readStrongBinder());
        int r69 = r14.readInt();
        Bundle r70 = (Bundle) si0.d(r14, Bundle.CREATOR);
        if (r14.readInt() == 0) goto L246;
        r11 = true;
    L246:
        o0(r68, r69, r70, r11);
        return true;
    L248:
        l(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR), r14.readLong());
        return true;
    L250:
        o0(mm2.m(r14.readStrongBinder()), r14.readInt(), (Bundle) si0.d(r14, Bundle.CREATOR), true);
        return true;
    L252:
        ju1 r71 = mm2.m(r14.readStrongBinder());
        int r72 = r14.readInt();
        if (r14.readInt() == 0) goto L255;
        r4 = true;
    L255:
        B0(r71, r72, r4);
        return true;
    L257:
        g0(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L259:
        y(mm2.m(r14.readStrongBinder()), r14.readInt());
        return true;
    L261:
        q0(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readInt());
        return true;
    L263:
        x(mm2.m(r14.readStrongBinder()), r14.readInt(), r14.readFloat());
        return true;
    }

    @Override // defpackage.pu1
    public final void p(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 24, Q0(new zr2(15)));
    }

    @Override // defpackage.pu1
    public final void p0(ju1 r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        long r0 = Binder.clearCallingIdentity();
        tn2 r2 = (tn2) this.e.get();     // Catch: Throwable -> L14
        if (r2 != null) goto L8;
    L18:
        Binder.restoreCallingIdentity(r0);
        return;
    L8:
        if (r2.l() == true) goto L18;
        fr2 r7 = this.f.w(r6.asBinder());     // Catch: Throwable -> L14
        if (r7 == null) goto L16;
        f35.W(r2.l, new ur2(4, this, r7));     // Catch: Throwable -> L14
    L16:
        Binder.restoreCallingIdentity(r0);
        return;
    L14:
        th = move-exception;
        Binder.restoreCallingIdentity(r0);
        throw th;
    }

    @Override // defpackage.pu1
    public final void q(ju1 r2, int r3) {
        if (r2 == null) goto L9;
        fr2 r4 = this.f.w(r2.asBinder());
        if (r4 == null) goto L8;
        M0(r4, r3);
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void q0(ju1 r3, int r4, int r5) {
        if (r3 == null) goto L7;
        if (r5 < 0) goto L8;
        N0(r3, r4, 25, Q0(new ij0(r5, 10)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void r0(ju1 r4, int r5, Bundle r6) {
        if (r4 == null) goto L13;
        if (r6 == null) goto L14;
        N0(r4, r5, 13, Q0(new ql2(new qh3(r6.getFloat(qh3.e, 1.0f), r6.getFloat(qh3.f, 1.0f)), 2)));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        return;
    L14:
        return;
    }

    @Override // defpackage.pu1
    public final void s(ju1 r8, int r9, Bundle r10, Bundle r11, boolean r12) {
        Bundle r13 = f35.n(r11);
        if (r8 == null) goto L38;
        if (r10 == null) goto L39;
        if (r13 == null) goto L40;
        va4 r3 = va4.a(r10);     // Catch: RuntimeException -> L31
        if (j60.n(r3.b) == false) goto L29;
        long r14 = Binder.clearCallingIdentity();
        tn2 r4 = (tn2) this.e.get();     // Catch: Throwable -> L23
        if (r4 != null) goto L14;
    L25:
        Binder.restoreCallingIdentity(r14);
        return;
    L14:
        if (r4.l() == true) goto L25;
        fr2 r2 = this.f.w(r8.asBinder());     // Catch: Throwable -> L23
        if (r2 != null) goto L20;
        Binder.restoreCallingIdentity(r14);
        return;
    L20:
        f35.W(r4.l, new ls1(this, r2, r3, r4, r9, r8));     // Catch: Throwable -> L23
        Binder.restoreCallingIdentity(r14);
        return;
    L23:
        th = move-exception;
        Binder.restoreCallingIdentity(r14);
        throw th;
    L29:
        U(r8, r9, r3, 0, new at2(new ef0(r12, r3, r13), 1));
        return;
    L31:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        return;
    L40:
        return;
    L39:
        return;
    }

    @Override // defpackage.pu1
    public final void t(ju1 r3, int r4, int r5, int r6) {
        if (r3 == null) goto L7;
        if (r5 < 0) goto L8;
        N0(r3, r4, 33, Q0(new v31(r5, r6, 4)));
        return;
    L8:
        return;
    }

    @Override // defpackage.pu1
    public final void t0(ju1 r7, int r8, Bundle r9, Bundle r10) {
        s(r7, r8, r9, r10, false);
    }

    @Override // defpackage.pu1
    public final void u(ju1 r4, int r5, IBinder r6, int r7, long r8) {
        if (r4 == null) goto L21;
        if (r6 != null) goto L5;
        return;
    L5:
        if (r7 == (-1)) goto L18;
        if (r7 >= 0) goto L18;
        return;
    L18:
        yw1 r9 = iw.a(r6);     // Catch: RuntimeException -> L15
        uw1 r0 = yw1.j();     // Catch: RuntimeException -> L15
        int r1 = 0;
    L10:
        if (r1 >= r9.size()) goto L12;
        Bundle r2 = (Bundle) r9.get(r1);     // Catch: RuntimeException -> L15
        r2.getClass();     // Catch: RuntimeException -> L15
        r0.c(gn2.b(r2));     // Catch: RuntimeException -> L15
        r1 = r1 + 1;     // Catch: RuntimeException -> L15
        goto L10
    L12:
        int r10 = 29;
        N0(r4, r5, 20, new at2(new ef0(r10, new lj0(r8, r0.f(), r7), new zr2(20)), 1));
        return;
    L15:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        return;
    }

    @Override // defpackage.pu1
    public final void v(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 8, Q0(new zr2(3)));
    }

    @Override // defpackage.pu1
    public final void v0(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 20, Q0(new zr2(18)));
    }

    @Override // defpackage.pu1
    public final void w(ju1 r3, int r4, float r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r5 <= 0.0f) goto L9;
        N0(r3, r4, 13, Q0(new w31(3, r5)));
        return;
    }

    @Override // defpackage.pu1
    public final void x(ju1 r3, int r4, float r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r5 >= 0.0f) goto L6;
        return;
    L6:
        if (r5 > 1.0f) goto L12;
        N0(r3, r4, 24, Q0(new w31(4, r5)));
        return;
    }

    @Override // defpackage.pu1
    public final void x0(ju1 r2, int r3, final boolean r4, final int r5) {
        if (r2 != null) goto L4;
        return;
    L4:
        N0(r2, r3, 34, Q0(new xs2(r5, r4)));
    }

    @Override // defpackage.pu1
    public final void y(ju1 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        N0(r3, r4, 26, Q0(new zr2(4)));
    }

    @Override // defpackage.pu1
    public final void y0(ju1 r3, int r4, Bundle r5) {
        if (r3 == null) goto L13;
        if (r5 == null) goto L14;
        N0(r3, r4, 19, Q0(new r31(do2.b(r5), 2)));
        return;
    L8:
        e = move-exception;
        l93.r0("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        return;
    L14:
        return;
    }

    @Override // defpackage.pu1
    public final void z0(ju1 r7, int r8, Surface r9, int r10, int r11) {
        if (r7 != null) goto L4;
        return;
    L4:
        N0(r7, r8, 27, Q0(new hl2(this, r9, r10, r11, 2)));
    }
}
