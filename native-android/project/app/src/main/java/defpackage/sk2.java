package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.HashSet;
import java.util.List;
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

    public sk2(Context r7, cb4 r8, Bundle r9, qk2 r10, Looper r11, bl2 r12, xc5 r13) {
        rr2.s(r7, "context must not be null");
        rr2.s(r8, "token must not be null");
        l93.K("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");
        this.b = new bu4();
        this.g = -9223372036854775807L;
        this.e = r10;
        this.f = new Handler(r11);
        this.i = r12;
        rk2 r6 = W0(r7, r8, r9, r11, r13);
        this.d = r6;
        r6.R0();
    }

    public static void Z0(Future r2) {
        if (r2.cancel(false) == false) goto L11;
        return;
    L11:
        ((sk2) hw.j(r2)).Y0();
        return;
    L8:
        e = move-exception;
        l93.r0("MediaController", "MediaController future failed (so we couldn't release it)", e);
    }

    @Override // defpackage.qi3
    public final void A() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        return;
    L6:
        r1.A();
    }

    @Override // defpackage.qi3
    public final void A0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring mute().");
        return;
    L6:
        r1.A0();
    }

    @Override // defpackage.qi3
    public final float B() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return 1.0f;
    L5:
        return r1.B();
    }

    @Override // defpackage.qi3
    public final void B0(gn2 r2) {
        c1();
        rr2.s(r2, "mediaItems must not be null");
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        return;
    L6:
        r1.B0(r2);
    }

    @Override // defpackage.qi3
    public final void C() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        return;
    L6:
        r1.C();
    }

    @Override // defpackage.qi3
    public final void C0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        return;
    L6:
        r1.C0();
    }

    @Override // defpackage.qi3
    public final il D() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return il.i;
    L7:
        return r1.D();
    }

    @Override // defpackage.qi3
    public final boolean D0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.D0() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void E(int r2, boolean r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        return;
    L6:
        r1.E(r2, r3);
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return cw4.J;
    L7:
        return r1.E0();
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return hp0.e;
    L7:
        return r1.F();
    }

    @Override // defpackage.qi3
    public final long F0() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.F0();
    }

    @Override // defpackage.qi3
    public final void G() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        return;
    L6:
        r1.G();
    }

    @Override // defpackage.qi3
    public final void G0(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        return;
    L6:
        r1.G0(r2);
    }

    @Override // defpackage.qi3
    public final void H(int r2, int r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        return;
    L6:
        r1.H(r2, r3);
    }

    @Override // defpackage.qi3
    public final void H0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekToNext().");
        return;
    L6:
        r1.H0();
    }

    @Override // defpackage.qi3
    public final boolean I() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.I() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void I0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekForward().");
        return;
    L6:
        r1.I0();
    }

    @Override // defpackage.qi3
    public final void J(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        return;
    L6:
        r1.J(r2);
    }

    @Override // defpackage.qi3
    public final void J0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekBack().");
        return;
    L6:
        r1.J0();
    }

    @Override // defpackage.qi3
    public final int K() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.K();
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.K0();
    L7:
        return do2.K;
    }

    @Override // defpackage.qi3
    public final void L(int r2, int r3, List r4) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        return;
    L6:
        r1.L(r2, r3, r4);
    }

    @Override // defpackage.qi3
    public final void L0(List r5) {
        c1();
        rr2.s(r5, "mediaItems must not be null");
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L10;
        if (r5.get(r1) == null) goto L8;
        boolean r2 = true;
    L9:
        rr2.j(r1, "items must not contain null, index=%s", r2);
        r1 = r1 + 1;
        goto L4
    L8:
        r2 = false;
        goto L9
    L10:
        rk2 r4 = this.d;
        if (r4.Y() == true) goto L14;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        return;
    L14:
        r4.V0(r5);
    }

    @Override // defpackage.qi3
    public final void M(cw4 r3) {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        l93.q0("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
    L5:
        r2.M(r3);
    }

    @Override // defpackage.qi3
    public final long M0() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.M0();
    }

    @Override // defpackage.qi3
    public final void N(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        return;
    L6:
        r1.N(r2);
    }

    @Override // defpackage.qi3
    public final void N0(List r2, int r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        return;
    L6:
        r1.N0(r2, r3);
    }

    @Override // defpackage.qi3
    public final void O(long r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        return;
    L6:
        r1.O(r2);
    }

    @Override // defpackage.qi3
    public final long O0() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.O0();
    }

    @Override // defpackage.qi3
    public final void P(int r2, int r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        return;
    L6:
        r1.P(r2, r3);
    }

    @Override // defpackage.qi3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        return;
    L6:
        r1.Q(r2);
    }

    @Override // defpackage.qi3
    public final int Q0() {
        return x0().o();
    }

    @Override // defpackage.qi3
    public final void R(float r3) {
        c1();
        if (r3 >= 0.0f) goto L5;
    L7:
        boolean r0 = false;
    L8:
        rr2.k("volume must be between 0 and 1", r0);
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L12;
        l93.q0("MediaController", "The controller is not connected. Ignoring setVolume().");
        return;
    L12:
        r2.R(r3);
        return;
    L5:
        if (r3 > 1.0f) goto L7;
        r0 = true;
        goto L8
    }

    @Override // defpackage.qi3
    public final boolean R0() {
        c1();
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).g == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void S() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        return;
    L6:
        r1.S();
    }

    @Override // defpackage.qi3
    public final boolean S0(int r1) {
        return o().a(r1);
    }

    @Override // defpackage.qi3
    public final void T(List r5, int r6, long r7) {
        c1();
        rr2.s(r5, "mediaItems must not be null");
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L10;
        if (r5.get(r1) == null) goto L8;
        boolean r2 = true;
    L9:
        rr2.j(r1, "items must not contain null, index=%s", r2);
        r1 = r1 + 1;
        goto L4
    L8:
        r2 = false;
        goto L9
    L10:
        rk2 r4 = this.d;
        if (r4.Y() == true) goto L14;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        return;
    L14:
        r4.T(r5, r6, r7);
    }

    @Override // defpackage.qi3
    public final boolean T0() {
        c1();
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).h == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final PlaybackException U() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return null;
    L5:
        return r1.U();
    }

    @Override // defpackage.qi3
    public final Looper U0() {
        return this.f.getLooper();
    }

    @Override // defpackage.qi3
    public final void V(boolean r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L6;
        r1.V(r2);
        return;
    }

    @Override // defpackage.qi3
    public final boolean V0() {
        c1();
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).a() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void W(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        return;
    L6:
        r1.W(r2);
    }

    public rk2 W0(Context r9, cb4 r10, Bundle r11, Looper r12, xs r13) {
        if (r10.a.e() == false) goto L7;
        r13.getClass();
        return new im2(r9, this, r10, r11, r12, r13);
    L7:
        return new bm2(r9, this, r10, r11, r12);
    }

    @Override // defpackage.qi3
    public final long X() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.X();
    }

    public final void X0() {
        if (Looper.myLooper() != this.f.getLooper()) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        rr2.w(!this.h);
        this.h = true;
        bl2 r3 = this.i;
        r3.w = true;
        sk2 r1 = r3.v;
        if (r1 == null) goto L10;
        r3.l(r1);
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.qi3
    public final gn2 Y(int r4) {
        return x0().m(r4, this.b, 0).b;
    }

    public final void Y0() {
        c1();
        if (this.c == true) goto L31;
        StringBuilder r1 = new StringBuilder("Release ");
        r1.append(Integer.toHexString(System.identityHashCode(this)));
        r1.append(" [AndroidXMedia3/1.9.2] [");
        r1.append(f35.a);
        r1.append("] [");
        HashSet r2 = hn2.a;
        monitor-enter(hn2.class);
        String r3 = hn2.b;     // Catch: Throwable -> L23
        monitor-exit(hn2.class);
        r1.append(r3);
        r1.append("]");
        l93.K("MediaController", r1.toString());
        boolean r4 = true;
        this.c = true;
        this.f.removeCallbacksAndMessages(null);
        this.d.a();     // Catch: Exception -> L12
    L15:
        if (this.h == true) goto L17;
        this.h = true;
        bl2 r5 = this.i;
        r5.getClass();
        r5.m(new SecurityException("Session rejected the connection request."));
        return;
    L17:
        if (Looper.myLooper() == this.f.getLooper()) goto L20;
        r4 = false;
    L20:
        rr2.w(r4);
        this.e.c();
        return;
    L12:
        e = move-exception;
        l93.B("MediaController", "Exception while releasing impl", e);
    L23:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.qi3
    public final long Z() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.Z();
    }

    @Override // defpackage.qi3
    public final gn2 a() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L7;
        return null;
    L7:
        return r0.m(o0(), this.b, 0).b;
    }

    @Override // defpackage.qi3
    public final void a0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring unmute().");
        return;
    L6:
        r1.a0();
    }

    public final void a1(Runnable r1) {
        f35.W(this.f, r1);
    }

    @Override // defpackage.qi3
    public final void b() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring prepare().");
        return;
    L6:
        r1.b();
    }

    @Override // defpackage.qi3
    public final long b0() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.b0();
    }

    public final ic2 b1(va4 r3, Bundle r4) {
        c1();
        if (r3.a != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.k("command must be a custom command", r0);
        rk2 r2 = this.d;
        if (r2.Y() == false) goto L11;
        return r2.T0(r3, r4);
    L11:
        return new mw1(new ab4(-100));
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.qi3
    public final void c() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring pause().");
        return;
    L6:
        r1.c();
    }

    @Override // defpackage.qi3
    public final void c0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        return;
    L6:
        r1.c0();
    }

    public final void c1() {
        if (Looper.myLooper() != this.f.getLooper()) goto L5;
        boolean r1 = true;
    L6:
        rr2.v("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", r1);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.qi3
    public final void d(qh3 r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        return;
    L6:
        r1.d(r2);
    }

    @Override // defpackage.qi3
    public final void d0(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        return;
    L6:
        r1.d0(r2);
    }

    @Override // defpackage.qi3
    public final void e(float r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        return;
    L6:
        r1.e(r2);
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.e0();
    L7:
        return jw4.b;
    }

    @Override // defpackage.qi3
    public final boolean f() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.f() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final boolean f0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.f0() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final int g() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return 1;
    L5:
        return r1.g();
    }

    @Override // defpackage.qi3
    public final do2 g0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.g0();
    L7:
        return do2.K;
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return -9223372036854775807L;
    L5:
        return r2.getDuration();
    }

    @Override // defpackage.qi3
    public final int h() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return 0;
    L5:
        return r1.h();
    }

    @Override // defpackage.qi3
    public final boolean h0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.h0() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final qh3 i() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.i();
    L7:
        return qh3.d;
    }

    @Override // defpackage.qi3
    public final jg0 i0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.i0();
    L7:
        return jg0.d;
    }

    @Override // defpackage.qi3
    public final int j() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return 0;
    L7:
        return r1.j();
    }

    @Override // defpackage.qi3
    public final int j0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.j0();
    }

    @Override // defpackage.qi3
    public final boolean k() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.k() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void k0(il r2, boolean r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        return;
    L6:
        r1.k0(r2, r3);
    }

    @Override // defpackage.qi3
    public final long l() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return -9223372036854775807L;
    L5:
        return r2.l();
    }

    @Override // defpackage.qi3
    public final void l0(do2 r2) {
        c1();
        rr2.s(r2, "playlistMetadata must not be null");
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        return;
    L6:
        r1.l0(r2);
    }

    @Override // defpackage.qi3
    public final long m() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.m();
    }

    @Override // defpackage.qi3
    public final void m0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring play().");
        return;
    L6:
        r1.m0();
    }

    @Override // defpackage.qi3
    public final void n(int r2, long r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring seekTo().");
        return;
    L6:
        r1.n(r2, r3);
    }

    @Override // defpackage.qi3
    public final int n0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.n0();
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return mi3.b;
    L7:
        return r1.o();
    }

    @Override // defpackage.qi3
    public final int o0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.o0();
    }

    @Override // defpackage.qi3
    public final void p(gn2 r2, long r3) {
        c1();
        rr2.s(r2, "mediaItems must not be null");
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        return;
    L6:
        r1.p(r2, r3);
    }

    @Override // defpackage.qi3
    public final void p0(int r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        return;
    L6:
        r1.p0(r2);
    }

    @Override // defpackage.qi3
    public final boolean q() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return false;
    L5:
        if (r1.q() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void q0(boolean r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        return;
    L6:
        r1.q0(r2);
    }

    @Override // defpackage.qi3
    public final void r() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        return;
    L6:
        r1.r();
    }

    @Override // defpackage.qi3
    public final void r0(oi3 r2) {
        c1();
        rr2.s(r2, "listener must not be null");
        this.d.r0(r2);
    }

    @Override // defpackage.qi3
    public final void s(boolean r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        return;
    L6:
        r1.s(r2);
    }

    @Override // defpackage.qi3
    public final void s0(gn2 r2) {
        c1();
        rr2.s(r2, "mediaItems must not be null");
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        return;
    L6:
        r1.s0(r2);
    }

    @Override // defpackage.qi3
    public final void stop() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring stop().");
        return;
    L6:
        r1.stop();
    }

    @Override // defpackage.qi3
    public final int t() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return 0;
    L5:
        return r1.t();
    }

    @Override // defpackage.qi3
    public final void t0(int r2, int r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        return;
    L6:
        r1.t0(r2, r3);
    }

    @Override // defpackage.qi3
    public final long u() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return 0;
    L5:
        return r2.u();
    }

    @Override // defpackage.qi3
    public final void u0(int r2, int r3, int r4) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        return;
    L6:
        r1.u0(r2, r3, r4);
    }

    @Override // defpackage.qi3
    public final void v(oi3 r2) {
        rr2.s(r2, "listener must not be null");
        this.d.v(r2);
    }

    @Override // defpackage.qi3
    public final int v0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return 0;
    L5:
        return r1.v0();
    }

    @Override // defpackage.qi3
    public final int w() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.w();
    }

    @Override // defpackage.qi3
    public final void w0(List r2) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        return;
    L6:
        r1.w0(r2);
    }

    @Override // defpackage.qi3
    public final long x() {
        c1();
        rk2 r2 = this.d;
        if (r2.Y() == true) goto L5;
        return -9223372036854775807L;
    L5:
        return r2.x();
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.x0();
    L7:
        return cu4.a;
    }

    @Override // defpackage.qi3
    public final int y() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L5;
        return -1;
    L5:
        return r1.y();
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L7;
        return false;
    L7:
        return r1.y0();
    }

    @Override // defpackage.qi3
    public final s55 z() {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == false) goto L7;
        return r1.z();
    L7:
        return s55.d;
    }

    @Override // defpackage.qi3
    public final void z0(int r2, gn2 r3) {
        c1();
        rk2 r1 = this.d;
        if (r1.Y() == true) goto L6;
        l93.q0("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        return;
    L6:
        r1.z0(r2, r3);
    }
}
