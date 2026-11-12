package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sk2 implements qi3 {
    public final bu4 b;
    public boolean c;
    public final rk2 d;
    public final qk2 e;
    public final Handler f;
    public final long g;
    public boolean h;
    public final bl2 i;

    public sk2(Context context, cb4 cb4Var, Bundle bundle, qk2 qk2Var, Looper looper, bl2 bl2Var, xc5 xc5Var) {
        rr2.s(context, "context must not be null");
        rr2.s(cb4Var, "token must not be null");
        l93.K("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");
        this.b = new bu4();
        this.g = -9223372036854775807L;
        this.e = qk2Var;
        this.f = new Handler(looper);
        this.i = bl2Var;
        rk2 rk2VarW0 = W0(context, cb4Var, bundle, looper, xc5Var);
        this.d = rk2VarW0;
        rk2VarW0.R0();
    }

    public static void Z0(Future future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((sk2) hw.j(future)).Y0();
        } catch (CancellationException | ExecutionException e) {
            l93.r0("MediaController", "MediaController future failed (so we couldn't release it)", e);
        }
    }

    @Override // defpackage.qi3
    public final void A() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.A();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.qi3
    public final void A0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.A0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring mute().");
        }
    }

    @Override // defpackage.qi3
    public final float B() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.B();
        }
        return 1.0f;
    }

    @Override // defpackage.qi3
    public final void B0(gn2 gn2Var) {
        c1();
        rr2.s(gn2Var, "mediaItems must not be null");
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.B0(gn2Var);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void C() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.C();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.qi3
    public final void C0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.C0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final il D() {
        c1();
        rk2 rk2Var = this.d;
        return !rk2Var.Y() ? il.i : rk2Var.D();
    }

    @Override // defpackage.qi3
    public final boolean D0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.D0();
    }

    @Override // defpackage.qi3
    public final void E(int i, boolean z) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.E(i, z);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        c1();
        rk2 rk2Var = this.d;
        return !rk2Var.Y() ? cw4.J : rk2Var.E0();
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        c1();
        rk2 rk2Var = this.d;
        return !rk2Var.Y() ? hp0.e : rk2Var.F();
    }

    @Override // defpackage.qi3
    public final long F0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.F0();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final void G() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.G();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final void G0(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.G0(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final void H(int i, int i2) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.H(i, i2);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final void H0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.H0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.qi3
    public final boolean I() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.I();
    }

    @Override // defpackage.qi3
    public final void I0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.I0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.qi3
    public final void J(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.J(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final void J0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.J0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.qi3
    public final int K() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.K();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.K0() : do2.K;
    }

    @Override // defpackage.qi3
    public final void L(int i, int i2, List list) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.L(i, i2, list);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void L0(List list) {
        c1();
        rr2.s(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            rr2.j(i, "items must not contain null, index=%s", list.get(i) != null);
        }
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.V0(list);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void M(cw4 cw4Var) {
        c1();
        rk2 rk2Var = this.d;
        if (!rk2Var.Y()) {
            l93.q0("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        rk2Var.M(cw4Var);
    }

    @Override // defpackage.qi3
    public final long M0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.M0();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final void N(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.N(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.qi3
    public final void N0(List list, int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.N0(list, i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void O(long j) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.O(j);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.qi3
    public final long O0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.O0();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final void P(int i, int i2) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.P(i, i2);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder surfaceHolder) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.Q(surfaceHolder);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override // defpackage.qi3
    public final int Q0() {
        return x0().o();
    }

    @Override // defpackage.qi3
    public final void R(float f) {
        c1();
        rr2.k("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.R(f);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.qi3
    public final boolean R0() {
        c1();
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).g;
    }

    @Override // defpackage.qi3
    public final void S() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.S();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.qi3
    public final boolean S0(int i) {
        return o().a(i);
    }

    @Override // defpackage.qi3
    public final void T(List list, int i, long j) {
        c1();
        rr2.s(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            rr2.j(i2, "items must not contain null, index=%s", list.get(i2) != null);
        }
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.T(list, i, j);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final boolean T0() {
        c1();
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).h;
    }

    @Override // defpackage.qi3
    public final PlaybackException U() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.U();
        }
        return null;
    }

    @Override // defpackage.qi3
    public final Looper U0() {
        return this.f.getLooper();
    }

    @Override // defpackage.qi3
    public final void V(boolean z) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.V(z);
        }
    }

    @Override // defpackage.qi3
    public final boolean V0() {
        c1();
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).a();
    }

    @Override // defpackage.qi3
    public final void W(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.W(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    public rk2 W0(Context context, cb4 cb4Var, Bundle bundle, Looper looper, xs xsVar) {
        if (!cb4Var.a.e()) {
            return new bm2(context, this, cb4Var, bundle, looper);
        }
        xsVar.getClass();
        return new im2(context, this, cb4Var, bundle, looper, xsVar);
    }

    @Override // defpackage.qi3
    public final long X() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.X();
        }
        return 0L;
    }

    public final void X0() {
        rr2.w(Looper.myLooper() == this.f.getLooper());
        rr2.w(!this.h);
        this.h = true;
        bl2 bl2Var = this.i;
        bl2Var.w = true;
        sk2 sk2Var = bl2Var.v;
        if (sk2Var != null) {
            bl2Var.l(sk2Var);
        }
    }

    @Override // defpackage.qi3
    public final gn2 Y(int i) {
        return x0().m(i, this.b, 0L).b;
    }

    public final void Y0() {
        String str;
        c1();
        if (this.c) {
            return;
        }
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.2] [");
        sb.append(f35.a);
        sb.append("] [");
        HashSet hashSet = hn2.a;
        synchronized (hn2.class) {
            str = hn2.b;
        }
        sb.append(str);
        sb.append("]");
        l93.K("MediaController", sb.toString());
        this.c = true;
        this.f.removeCallbacksAndMessages(null);
        try {
            this.d.a();
        } catch (Exception e) {
            l93.B("MediaController", "Exception while releasing impl", e);
        }
        if (this.h) {
            rr2.w(Looper.myLooper() == this.f.getLooper());
            this.e.c();
        } else {
            this.h = true;
            bl2 bl2Var = this.i;
            bl2Var.getClass();
            bl2Var.m(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.qi3
    public final long Z() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.Z();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final gn2 a() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return null;
        }
        return cu4VarX0.m(o0(), this.b, 0L).b;
    }

    @Override // defpackage.qi3
    public final void a0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.a0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring unmute().");
        }
    }

    public final void a1(Runnable runnable) {
        f35.W(this.f, runnable);
    }

    @Override // defpackage.qi3
    public final void b() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.b();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.qi3
    public final long b0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.b0();
        }
        return 0L;
    }

    public final ic2 b1(va4 va4Var, Bundle bundle) {
        c1();
        rr2.k("command must be a custom command", va4Var.a == 0);
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.T0(va4Var, bundle) : new mw1(new ab4(-100));
    }

    @Override // defpackage.qi3
    public final void c() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.c();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.qi3
    public final void c0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.c0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    public final void c1() {
        rr2.v("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f.getLooper());
    }

    @Override // defpackage.qi3
    public final void d(qh3 qh3Var) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.d(qh3Var);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.qi3
    public final void d0(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.d0(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.qi3
    public final void e(float f) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.e(f);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.e0() : jw4.b;
    }

    @Override // defpackage.qi3
    public final boolean f() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.f();
    }

    @Override // defpackage.qi3
    public final boolean f0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.f0();
    }

    @Override // defpackage.qi3
    public final int g() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.g();
        }
        return 1;
    }

    @Override // defpackage.qi3
    public final do2 g0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.g0() : do2.K;
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.qi3
    public final int h() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.h();
        }
        return 0;
    }

    @Override // defpackage.qi3
    public final boolean h0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.h0();
    }

    @Override // defpackage.qi3
    public final qh3 i() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.i() : qh3.d;
    }

    @Override // defpackage.qi3
    public final jg0 i0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.i0() : jg0.d;
    }

    @Override // defpackage.qi3
    public final int j() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.j();
        }
        return 0;
    }

    @Override // defpackage.qi3
    public final int j0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.j0();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final boolean k() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.k();
    }

    @Override // defpackage.qi3
    public final void k0(il ilVar, boolean z) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.k0(ilVar, z);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.qi3
    public final long l() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.l();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.qi3
    public final void l0(do2 do2Var) {
        c1();
        rr2.s(do2Var, "playlistMetadata must not be null");
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.l0(do2Var);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.qi3
    public final long m() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.m();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final void m0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.m0();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.qi3
    public final void n(int i, long j) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.n(i, j);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.qi3
    public final int n0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.n0();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        c1();
        rk2 rk2Var = this.d;
        return !rk2Var.Y() ? mi3.b : rk2Var.o();
    }

    @Override // defpackage.qi3
    public final int o0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.o0();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final void p(gn2 gn2Var, long j) {
        c1();
        rr2.s(gn2Var, "mediaItems must not be null");
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.p(gn2Var, j);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.qi3
    public final void p0(int i) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.p0(i);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.qi3
    public final boolean q() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() && rk2Var.q();
    }

    @Override // defpackage.qi3
    public final void q0(boolean z) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.q0(z);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.qi3
    public final void r() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.r();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void r0(oi3 oi3Var) {
        c1();
        rr2.s(oi3Var, "listener must not be null");
        this.d.r0(oi3Var);
    }

    @Override // defpackage.qi3
    public final void s(boolean z) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.s(z);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.qi3
    public final void s0(gn2 gn2Var) {
        c1();
        rr2.s(gn2Var, "mediaItems must not be null");
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.s0(gn2Var);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.qi3
    public final void stop() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.stop();
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.qi3
    public final int t() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.t();
        }
        return 0;
    }

    @Override // defpackage.qi3
    public final void t0(int i, int i2) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.t0(i, i2);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // defpackage.qi3
    public final long u() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.u();
        }
        return 0L;
    }

    @Override // defpackage.qi3
    public final void u0(int i, int i2, int i3) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.u0(i, i2, i3);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final void v(oi3 oi3Var) {
        rr2.s(oi3Var, "listener must not be null");
        this.d.v(oi3Var);
    }

    @Override // defpackage.qi3
    public final int v0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.v0();
        }
        return 0;
    }

    @Override // defpackage.qi3
    public final int w() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.w();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final void w0(List list) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.w0(list);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.qi3
    public final long x() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.x();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.x0() : cu4.a;
    }

    @Override // defpackage.qi3
    public final int y() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.y();
        }
        return -1;
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            return rk2Var.y0();
        }
        return false;
    }

    @Override // defpackage.qi3
    public final s55 z() {
        c1();
        rk2 rk2Var = this.d;
        return rk2Var.Y() ? rk2Var.z() : s55.d;
    }

    @Override // defpackage.qi3
    public final void z0(int i, gn2 gn2Var) {
        c1();
        rk2 rk2Var = this.d;
        if (rk2Var.Y()) {
            rk2Var.z0(i, gn2Var);
        } else {
            l93.q0("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }
}
