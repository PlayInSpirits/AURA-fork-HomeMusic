package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk2 extends gk2 implements yj2 {
    public final Context U0;
    public final xc5 V0;
    public final sm W0;
    public final ns3 X0;
    public int Y0;
    public boolean Z0;
    public tb1 a1;
    public tb1 b1;
    public long c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public int h1;
    public boolean i1;
    public long j1;

    public bk2(Context r5, zj2 r6, Handler r7, qm r8, sm r9) {
        if (Build.VERSION.SDK_INT < 35) goto L5;
        ns3 r0 = new ns3(6);
    L6:
        super(r5.getApplicationContext(), 1, r6, 44100.0f);
        this.U0 = r5.getApplicationContext();
        this.W0 = r9;
        this.X0 = r0;
        this.h1 = -1000;
        this.V0 = new xc5(r7, r8);
        this.j1 = -9223372036854775807L;
        ((tj0) r9).n = new si1(8, this);
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.gk2
    public final int A0(kf2 r18, tb1 r19) {
        int r3 = 0;
        int r4 = kq.a(1, 0, 0, 0);
        String r5 = r19.n;
        String r6 = r19.n;
        if (lw2.i(r5) == false) goto L5;
        int r7 = r19.O;
        if (r7 == 0) goto L9;
        boolean r8 = true;
    L11:
        if (r7 == 0) goto L15;
        if (r7 == 2) goto L15;
        boolean r9 = false;
    L16:
        dk2 r10 = null;
        int r12 = 8;
        int r13 = 4;
        sm r14 = this.W0;
        if (r9 == false) goto L28;
        if (r8 == false) goto L24;
        List r11 = jk2.e(false, false, "audio/raw");
        if (r11.isEmpty() == false) goto L22;
        dk2 r15 = null;
    L23:
        if (r15 == null) goto L28;
    L22:
        r15 = (dk2) r11.get(0);
    L24:
        int r16 = E0(r19);
        if (((tj0) r14).j(r19) == 0) goto L30;
        return kq.a(4, 8, 32, r16);
    L30:
        if ("audio/raw".equals(r6) == true) goto L32;
    L33:
        tj0 r17 = (tj0) r14;
        if (r17.j(f35.D(2, r19.F, r19.G)) == 0) goto L77;
        if (r6 != null) goto L38;
        gy3 r2 = gy3.r;
    L47:
        if (r2.isEmpty() == true) goto L77;
        if (r9 == false) goto L51;
        dk2 r20 = (dk2) r2.get(0);
        Context r0 = this.U0;
        boolean r21 = r20.e(r0, r19);
        if (r21 == true) goto L61;
        int r22 = 1;
    L56:
        if (r22 >= r2.q) goto L61;
        dk2 r23 = (dk2) r2.get(r22);
        if (r23.e(r0, r19) == true) goto L59;
        r22 = r22 + 1;
        goto L56
    L59:
        boolean r110 = false;
        r20 = r23;
        boolean r24 = true;
    L62:
        if (r24 == true) goto L65;
        r13 = 3;
    L65:
        if (r24 == false) goto L70;
        if (r20.f(r19) == false) goto L70;
        r12 = 16;
    L70:
        if (r20.g == false) goto L72;
        int r1 = 64;
    L73:
        if (r110 == false) goto L76;
        r3 = 128;
    L76:
        return ((r1 | ((r13 | r12) | 32)) | r3) | r16;
    L72:
        r1 = 0;
    L61:
        r24 = r21;
        r110 = true;
        goto L62
    L51:
        return kq.a(2, 0, 0, 0);
    L38:
        if (r17.j(r19) == 0) goto L45;
        List r25 = jk2.e(false, false, "audio/raw");
        if (r25.isEmpty() == true) goto L43;
        r10 = (dk2) r25.get(0);
    L43:
        if (r10 == null) goto L45;
        r2 = yw1.o(r10);
    L45:
        r2 = jk2.g(r18, r19, false, false);
    L77:
        return r4;
    L32:
        if (((tj0) r14).j(r19) == 0) goto L77;
    L28:
        r16 = 0;
    L15:
        r9 = true;
        goto L16
    L9:
        r8 = false;
        goto L11
    L5:
        return kq.a(0, 0, 0, 0);
    }

    public final int E0(tb1 r2) {
        tj0 r1 = (tj0) this.W0;
        if (r1.X == false) goto L5;
        zl r3 = zl.d;
    L7:
        if (r3.a == true) goto L11;
        return 0;
    L11:
        if (r3.b == false) goto L13;
        int r4 = 1536;
    L15:
        if (r3.c == true) goto L17;
        return r4;
    L17:
        return r4 | 2048;
    L13:
        r4 = 512;
        goto L15
    L5:
        cm r5 = r1.r.b(r1.i(r2));
        yl r6 = new yl();
        r6.a = r5.a;
        r6.b = r5.b;
        r6.c = r5.c;
        r3 = r6.a();
        goto L7
    }

    public final void F0() {
        m();
        long r0 = ((tj0) this.W0).h();
        if (r0 != Long.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.d1 == true) goto L8;
        r0 = Math.max(this.c1, r0);
    L8:
        this.c1 = r0;
        this.d1 = false;
    }

    @Override // defpackage.gk2
    public final ej0 J(dk2 r9, tb1 r10, tb1 r11) {
        ej0 r0 = r9.b(r10, r11);
        int r1 = r0.e;
        if (this.U == null) goto L5;
    L7:
        "OMX.google.raw.decoder".equals(r9.a);
        if (r11.o <= this.Y0) goto L10;
        r1 = r1 | 64;
    L10:
        int r7 = r1;
        String r3 = r9.a;
        if (r7 == 0) goto L14;
        int r8 = 0;
    L16:
        return new ej0(r3, r10, r11, r8, r7);
    L14:
        r8 = r0.d;
        goto L16
    L5:
        if (z0(r11) == false) goto L7;
        r1 = r1 | 32768;
        goto L7
    }

    @Override // defpackage.gk2
    public final float Q(float r4, tb1 r5, tb1[] r6) {
        int r3 = r6.length;
        int r0 = 0;
        int r1 = -1;
    L3:
        if (r0 >= r3) goto L8;
        int r2 = r6[r0].G;
        if (r2 == (-1)) goto L7;
        r1 = Math.max(r1, r2);
    L7:
        r0 = r0 + 1;
        goto L3
    L8:
        if (r1 != (-1)) goto L12;
        return -1.0f;
    L12:
        return r1 * r4;
    }

    @Override // defpackage.gk2
    public final ArrayList R(kf2 r4, tb1 r5, boolean r6) {
        if (r5.n != null) goto L6;
        gy3 r7 = gy3.r;
    L14:
        HashMap r8 = jk2.a;
        ArrayList r9 = new ArrayList(r7);
        Collections.sort(r9, new w60(2, new ef0(10, this.U0, r5)));
        return r9;
    L6:
        if (((tj0) this.W0).j(r5) == 0) goto L13;
        List r0 = jk2.e(false, false, "audio/raw");
        if (r0.isEmpty() == false) goto L10;
        dk2 r1 = null;
    L11:
        if (r1 == null) goto L13;
        r7 = yw1.o(r1);
        goto L14
    L10:
        r1 = (dk2) r0.get(0);
    L13:
        r7 = jk2.g(r4, r5, r6, false);
        goto L14
    }

    @Override // defpackage.gk2
    public final long S(long r8, long r10) {
        tj0 r11 = (tj0) this.W0;
        if (r11.n() == true) goto L5;
    L7:
        boolean r12 = false;
    L9:
        if (this.i1 == true) goto L15;
        if (r12 == false) goto L12;
        return 1000000;
    L12:
        if (this.F0 == true) goto L28;
    L27:
        return 10000;
    L28:
        return 1000000;
    L15:
        long r5 = r11.g();
        if (this.g1 == false) goto L27;
        if (r12 == false) goto L27;
        if (r5 == (-9223372036854775807L)) goto L27;
        float r9 = Math.min(r5, this.j1 - r8);
        if (i() == null) goto L24;
        float r7 = i().a;
    L26:
        return Math.max(10000, (long) ((r9 / r7) / 2.0f));
    L24:
        r7 = 1.0f;
        goto L26
    L5:
        if (this.j1 == (-9223372036854775807L)) goto L7;
        r12 = true;
        goto L9
    }

    @Override // defpackage.gk2
    public final ml3 U(dk2 r17, tb1 r18, MediaCrypto r19, float r20) {
        tb1[] r4 = this.w;
        r4.getClass();
        String r5 = r17.a;
        "OMX.google.raw.decoder".equals(r5);
        int r7 = r18.o;
        String r8 = r18.n;
        int r9 = r18.F;
        if (r4.length == 1) goto L11;
        int r10 = r4.length;
        int r13 = 0;
    L6:
        if (r13 >= r10) goto L11;
        tb1 r14 = r4[r13];
        if (r17.b(r18, r14).d == 0) goto L10;
        "OMX.google.raw.decoder".equals(r5);
        r7 = Math.max(r7, r14.o);
    L10:
        r13 = r13 + 1;
    L11:
        this.Y0 = r7;
        if (r5.equals("OMX.google.opus.decoder") == false) goto L14;
    L21:
        boolean r6 = true;
    L22:
        this.Z0 = r6;
        String r11 = r17.c;
        int r12 = this.Y0;
        MediaFormat r15 = new MediaFormat();
        r15.setString("mime", r11);
        r15.setInteger("channel-count", r9);
        int r16 = r18.G;
        r15.setInteger("sample-rate", r16);
        e35.R(r15, r18.q);
        e35.J(r15, "max-input-size", r12);
        r15.setInteger("priority", 0);
        if (r20 == (-1.0f)) goto L26;
        r15.setFloat("operating-rate", r20);
    L26:
        if ("audio/ac4".equals(r8) == false) goto L34;
        Pair r2 = i40.b(r18);
        if (r2 == null) goto L31;
        e35.J(r15, "profile", ((Integer) r2.first).intValue());
        e35.J(r15, "level", ((Integer) r2.second).intValue());
    L31:
        if (Build.VERSION.SDK_INT > 28) goto L34;
        r15.setInteger("ac4-is-sync", 1);
    L34:
        if (((tj0) this.W0).j(f35.D(4, r9, r16)) != 2) goto L36;
        r15.setInteger("pcm-encoding", 4);
    L36:
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 32) goto L40;
        r15.setInteger("max-output-channel-count", 99);
    L40:
        if (r3 < 35) goto L42;
        r15.setInteger("importance", Math.max(0, -this.h1));
    L42:
        H(r15);
        if ("audio/raw".equals(r17.b) == true) goto L45;
    L47:
        tb1 r21 = null;
    L48:
        this.b1 = r21;
        return new ml3(r17, r15, r18, null, r19, this.X0);
    L45:
        if ("audio/raw".equals(r8) == true) goto L47;
        r21 = r18;
        goto L48
    L14:
        if (r5.equals("c2.android.opus.decoder") == true) goto L21;
        if (r5.equals("OMX.google.vorbis.decoder") == true) goto L21;
        if (r5.equals("c2.android.vorbis.decoder") == true) goto L21;
        r6 = false;
        goto L22
    }

    @Override // defpackage.gk2
    public final void V(cj0 r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L26;
        tb1 r2 = r7.p;
        if (r2 != null) goto L7;
        return;
    L7:
        if (Objects.equals(r2.n, "audio/opus") == true) goto L9;
        return;
    L9:
        if (this.t0 == false) goto L29;
        ByteBuffer r3 = r7.u;
        r3.getClass();
        tb1 r8 = r7.p;
        r8.getClass();
        int r9 = r8.I;
        if (r3.remaining() != 8) goto L30;
        int r4 = (int) ((r3.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
        tj0 r6 = (tj0) this.W0;
        an r5 = r6.t;
        if (r5 != null) goto L15;
        return;
    L15:
        if (r5.c() == false) goto L32;
        qj0 r10 = r6.p;
        if (r10 != null) goto L19;
        return;
    L19:
        if (((em) r10.e).k == false) goto L34;
        an r11 = r6.t;
        if (r0 >= 29) goto L24;
        r11.getClass();
        return;
    L24:
        z9.o(r11.a, r9, r4);
        return;
    L34:
        return;
    L32:
        return;
    L30:
        return;
    L29:
        return;
    }

    @Override // defpackage.gk2
    public final void b0(Exception r4) {
        l93.G("MediaCodecAudioRenderer", "Audio codec error", r4);
        xc5 r3 = this.V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new jm(r3, r4, 0));
        return;
    }

    @Override // defpackage.gk2, defpackage.kq, defpackage.rk3
    public final void c(int r9, Object r10) {
        sm r1 = this.W0;
        if (r9 != 2) goto L5;
        r10.getClass();
        float r8 = ((Float) r10).floatValue();
        tj0 r2 = (tj0) r1;
        if (r2.H == r8) goto L91;
        r2.H = r8;
        if (r2.p() == false) goto L92;
        an r11 = r2.t;
        r11.a.setVolume(r2.H);
        return;
    L92:
        return;
    L91:
        return;
    L5:
        if (r9 != 3) goto L7;
        il r12 = (il) r10;
        r12.getClass();
        tj0 r3 = (tj0) r1;
        if (r3.u.equals(r12) == true) goto L95;
        r3.u = r12;
        if (r3.V == true) goto L96;
        r3.v();
        return;
    L96:
        return;
    L95:
        return;
    L7:
        if (r9 != 6) goto L9;
        xn r13 = (xn) r10;
        r13.getClass();
        ((tj0) r1).z(r13);
        return;
    L9:
        if (r9 != 12) goto L11;
        AudioDeviceInfo r14 = (AudioDeviceInfo) r10;
        tj0 r4 = (tj0) r1;
        r4.T = r14;
        an r15 = r4.t;
        if (r15 == null) goto L90;
        r15.a.setPreferredDevice(r14);
        return;
    L90:
        return;
    L11:
        if (r9 != 16) goto L13;
        r10.getClass();
        this.h1 = ((Integer) r10).intValue();
        ak2 r16 = this.a0;
        if (r16 != null) goto L63;
        return;
    L63:
        if (Build.VERSION.SDK_INT < 35) goto L89;
        Bundle r17 = new Bundle();
        r17.putInt("importance", Math.max(0, -this.h1));
        r16.c(r17);
        return;
    L89:
        return;
    L13:
        if (r9 != 9) goto L15;
        r10.getClass();
        tj0 r5 = (tj0) r1;
        r5.y = ((Boolean) r10).booleanValue();
        if (r5.C() == false) goto L52;
        qh3 r18 = qh3.d;
    L53:
        rj0 r6 = new rj0(r18, -9223372036854775807L, -9223372036854775807L);
        if (r5.p() == false) goto L57;
        r5.v = r6;
        return;
    L57:
        r5.w = r6;
        return;
    L52:
        r18 = r5.x;
        goto L53
    L15:
        if (r9 != 10) goto L17;
        r10.getClass();
        int r19 = ((Integer) r10).intValue();
        ((tj0) r1).y(r19);
        if (Build.VERSION.SDK_INT < 35) goto L87;
        ns3 r20 = this.X0;
        if (r20 == null) goto L88;
        r20.f(r19);
        return;
    L88:
        return;
    L87:
        return;
    L17:
        if (r9 != 19) goto L19;
        r10.getClass();
        int r21 = ((Integer) r10).intValue();
        tj0 r7 = (tj0) r1;
        r7.getClass();
        if (r21 == 0) goto L36;
        if (r21 == (-1)) goto L36;
    L38:
        if (r7.U == r21) goto L93;
        r7.U = r21;
        r7.v();
        return;
    L93:
        return;
    L36:
        r21 = -1;
        goto L38
    L19:
        if (r9 == 20) goto L22;
        super.c(r9, r10);
        return;
    L22:
        r10.getClass();
        dn r110 = (dn) r10;
        tj0 r22 = (tj0) r1;
        dn r23 = r22.r;
        if (r110 == r23) goto L86;
        r23.d();
        r22.r = r110;
        oj0 r24 = r22.s;
        if (r24 == null) goto L30;
        r110.f();
        if (r110.e != null) goto L29;
        tc2 r25 = new tc2(Thread.currentThread());
        r110.e = r25;
        r25.i = false;
    L29:
        r110.e.a(r24);
    L30:
        r22.v();
        return;
    }

    @Override // defpackage.gk2
    public final void c0(long r9, long r11, String r13) {
        xc5 r1 = this.V0;
        Handler r8 = (Handler) r1.o;
        if (r8 == null) goto L6;
        r8.post(new om(r1, r13, r9, r11, 0));
        return;
    }

    @Override // defpackage.yj2
    public final void d(qh3 r1) {
        ((tj0) this.W0).B(r1);
    }

    @Override // defpackage.gk2
    public final void d0(h40 r4) {
        xc5 r3 = this.V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new k6(6, r3, r4));
        return;
    }

    @Override // defpackage.gk2
    public final void e0(String r4) {
        xc5 r3 = this.V0;
        Handler r0 = (Handler) r3.o;
        if (r0 == null) goto L6;
        r0.post(new k6(5, r3, r4));
        return;
    }

    @Override // defpackage.gk2
    public final ej0 f0(gp3 r5) {
        tb1 r0 = (tb1) r5.p;
        r0.getClass();
        this.a1 = r0;
        ej0 r6 = super.f0(r5);
        xc5 r4 = this.V0;
        Handler r1 = (Handler) r4.o;
        if (r1 == null) goto L5;
        r1.post(new v6(r4, r0, r6, 1));
    L5:
        return r6;
    }

    @Override // defpackage.kq
    public final yj2 g() {
        return this;
    }

    @Override // defpackage.gk2
    public final void g0(tb1 r8, MediaFormat r9) {
        tb1 r0 = this.b1;
        boolean r1 = true;
        int[] r3 = null;
        if (r0 == null) goto L6;
        r8 = r0;
    L59:
        int r10 = Build.VERSION.SDK_INT;     // Catch: AudioSink$ConfigurationException -> L48
        sm r4 = this.W0;
        if (r10 >= 29) goto L40;
    L55:
        ((tj0) r4).c(r8, r3);     // Catch: AudioSink$ConfigurationException -> L48
        return;
    L40:
        if (this.t0 == false) goto L50;
        dz3 r5 = this.q;     // Catch: AudioSink$ConfigurationException -> L48
        r5.getClass();     // Catch: AudioSink$ConfigurationException -> L48
        if (r5.a == 0) goto L50;
        dz3 r6 = this.q;     // Catch: AudioSink$ConfigurationException -> L48
        r6.getClass();     // Catch: AudioSink$ConfigurationException -> L48
        int r7 = r6.a;     // Catch: AudioSink$ConfigurationException -> L48
        tj0 r11 = (tj0) r4;     // Catch: AudioSink$ConfigurationException -> L48
        r11.getClass();     // Catch: AudioSink$ConfigurationException -> L48
        if (r10 >= 29) goto L47;
        r1 = false;
    L47:
        rr2.w(r1);     // Catch: AudioSink$ConfigurationException -> L48
        r11.i = r7;     // Catch: AudioSink$ConfigurationException -> L48
    L50:
        tj0 r12 = (tj0) r4;     // Catch: AudioSink$ConfigurationException -> L48
        r12.getClass();     // Catch: AudioSink$ConfigurationException -> L48
        if (r10 >= 29) goto L54;
        r1 = false;
    L54:
        rr2.w(r1);     // Catch: AudioSink$ConfigurationException -> L48
        r12.i = 0;     // Catch: AudioSink$ConfigurationException -> L48
    L48:
        e = move-exception;
        throw b(e, e.n, false, 5001);
    L6:
        if (this.a0 == null) goto L59;
        r9.getClass();
        if ("audio/raw".equals(r8.n) == false) goto L12;
        int r2 = r8.H;
    L18:
        sb1 r13 = new sb1();
        r13.m = lw2.m("audio/raw");
        r13.G = r2;
        r13.H = r8.I;
        r13.I = r8.J;
        r13.k = r8.l;
        r13.a = r8.a;
        r13.b = r8.b;
        r13.c = yw1.k(r8.c);
        r13.d = r8.d;
        r13.e = r8.e;
        r13.f = r8.f;
        r13.E = r9.getInteger("channel-count");
        r13.F = r9.getInteger("sample-rate");
        r8 = new tb1(r13);
        if (this.Z0 == false) goto L59;
        int r14 = r8.F;
        if (r14 != 3) goto L23;
        r3 = new int[]{0, 2, 1};
        goto L59
    L23:
        if (r14 != 5) goto L25;
        r3 = new int[]{0, 2, 1, 3, 4};
        goto L59
    L25:
        if (r14 != 6) goto L27;
        r3 = new int[]{0, 2, 1, 5, 3, 4};
        goto L59
    L27:
        if (r14 != 7) goto L29;
        r3 = new int[]{0, 2, 1, 6, 5, 3, 4};
        goto L59
    L29:
        if (r14 != 8) goto L59;
        r3 = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
        goto L59
    L12:
        if (r9.containsKey("pcm-encoding") == false) goto L15;
        r2 = r9.getInteger("pcm-encoding");
        goto L18
    L15:
        if (r9.containsKey("v-bits-per-sample") == false) goto L17;
        r2 = f35.C(r9.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
        goto L18
    L17:
        r2 = 2;
        goto L18
    }

    @Override // defpackage.kq
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.gk2
    public final void h0() {
        this.W0.getClass();
    }

    @Override // defpackage.yj2
    public final qh3 i() {
        return ((tj0) this.W0).x;
    }

    @Override // defpackage.yj2
    public final long j() {
        if (this.u != 2) goto L6;
        F0();
    L6:
        return this.c1;
    }

    @Override // defpackage.gk2
    public final void j0() {
        ((tj0) this.W0).E = true;
    }

    @Override // defpackage.yj2
    public final boolean k() {
        boolean r0 = this.f1;
        this.f1 = false;
        return r0;
    }

    @Override // defpackage.kq
    public final boolean m() {
        if (this.F0 == false) goto L12;
        tj0 r1 = (tj0) this.W0;
        if (r1.p() == true) goto L7;
        return true;
    L7:
        if (r1.L == true) goto L9;
        return false;
    L9:
        if (r1.n() == true) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    @Override // defpackage.gk2
    public final boolean m0(long r1, long r3, ak2 r5, ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, tb1 r14) {
        r6.getClass();
        this.j1 = -9223372036854775807L;
        if (this.b1 != null) goto L5;
    L8:
        sm r2 = this.W0;
        if (r12 == false) goto L42;
        if (r5 == null) goto L12;
        r5.g(r7);
    L12:
        this.J0.f += r9;
        ((tj0) r2).E = true;
        return true;
    L42:
        if (((tj0) r2).m(r9, r10, r6) == false) goto L20;
        if (r5 == null) goto L18;
        r5.g(r7);
    L18:
        this.J0.e += r9;
        return true;
    L20:
        this.j1 = r10;
        return false;
    L24:
        e = move-exception;
        tb1 r4 = this.a1;
        if (this.t0 == false) goto L39;
        dz3 r11 = this.q;
        r11.getClass();
        if (r11.a == 0) goto L39;
        int r15 = 5004;
    L41:
        throw b(e, r4, e.n, r15);
    L39:
        r15 = 5001;
    L22:
        e = move-exception;
        if (this.t0 == false) goto L31;
        dz3 r16 = this.q;
        r16.getClass();
        if (r16.a == 0) goto L31;
        int r17 = 5003;
    L33:
        throw b(e, r14, e.o, r17);
    L31:
        r17 = 5002;
        goto L33
    L5:
        if ((r8 & 2) == 0) goto L8;
        r5.getClass();
        r5.g(r7);
        return true;
    }

    @Override // defpackage.kq
    public final boolean o() {
        return ((tj0) this.W0).n();
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void p() {
        xc5 r0 = this.V0;
        this.e1 = true;
        this.a1 = null;
        this.j1 = -9223372036854775807L;
        this.g1 = false;
        ((tj0) this.W0).f();     // Catch: Throwable -> L10
        super.p();     // Catch: Throwable -> L7
        r0.o(this.J0);
        return;
    L7:
        th = move-exception;
        r0.o(this.J0);
        throw th;
    L10:
        th = move-exception;
        super.p();     // Catch: Throwable -> L14
        r0.o(this.J0);
        throw th;
    L14:
        th = move-exception;
        r0.o(this.J0);
        throw th;
    }

    @Override // defpackage.gk2
    public final void p0() {
        ((tj0) this.W0).t();     // Catch: AudioSink$WriteException -> L6
        long r0 = this.K0.e;     // Catch: AudioSink$WriteException -> L6
        if (r0 == (-9223372036854775807L)) goto L8;
        this.j1 = r0;     // Catch: AudioSink$WriteException -> L6
        return;
    L8:
        return;
    L6:
        e = move-exception;
        if (this.t0 == false) goto L12;
        int r1 = 5003;
    L14:
        throw b(e, e.p, e.o, r1);
    L12:
        r1 = 5002;
        goto L14
    }

    @Override // defpackage.kq
    public final void q(boolean r4, boolean r5) {
        bj0 r6 = new bj0();
        this.J0 = r6;
        xc5 r7 = this.V0;
        Handler r0 = (Handler) r7.o;
        if (r0 == null) goto L5;
        r0.post(new km(r7, r6, 1));
    L5:
        dz3 r8 = this.q;
        r8.getClass();
        boolean r9 = r8.b;
        sm r10 = this.W0;
        if (r9 == false) goto L10;
        tj0 r11 = (tj0) r10;
        rr2.w(r11.P);
        if (r11.V == true) goto L13;
        r11.V = true;
        r11.v();
    L13:
        ik3 r12 = this.s;
        r12.getClass();
        tj0 r13 = (tj0) r10;
        r13.m = r12;
        vp4 r3 = this.t;
        r3.getClass();
        r13.r.f = r3;
        return;
    L10:
        tj0 r14 = (tj0) r10;
        if (r14.V == false) goto L13;
        r14.V = false;
        r14.v();
        goto L13
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void r(long r1, boolean r3, boolean r4) {
        super.r(r1, r3, r4);
        ((tj0) this.W0).f();
        this.c1 = r1;
        this.j1 = -9223372036854775807L;
        this.f1 = false;
        this.g1 = false;
        this.d1 = true;
    }

    @Override // defpackage.kq
    public final void s() {
        ((tj0) this.W0).r.d();
        if (Build.VERSION.SDK_INT < 35) goto L10;
        ns3 r2 = this.X0;
        if (r2 == null) goto L11;
        ((HashSet) r2.o).clear();
        LoudnessCodecController r3 = (LoudnessCodecController) r2.q;
        if (r3 == null) goto L12;
        vk.e(r3);
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.kq
    public final void u() {
        sm r0 = this.W0;
        this.f1 = false;
        this.g1 = false;
        this.j1 = -9223372036854775807L;
        this.t0 = false;     // Catch: Throwable -> L11
        q0();     // Catch: Throwable -> L11
        o0();     // Catch: Throwable -> L11
        pw0.b(this.U, null);     // Catch: Throwable -> L9
        this.U = null;     // Catch: Throwable -> L9
        if (this.e1 == false) goto L20;
        this.e1 = false;
        ((tj0) r0).w();
        return;
    L20:
        return;
    L9:
        th = move-exception;
        if (this.e1 == false) goto L17;
        this.e1 = false;
        ((tj0) r0).w();
    L17:
        throw th;
    L11:
        th = move-exception;
        pw0.b(this.U, null);     // Catch: Throwable -> L9
        this.U = null;     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    }

    @Override // defpackage.kq
    public final void v() {
        ((tj0) this.W0).r();
        this.i1 = true;
    }

    @Override // defpackage.kq
    public final void w() {
        F0();
        this.i1 = false;
        ((tj0) this.W0).q();
        this.g1 = false;
    }

    @Override // defpackage.gk2
    public final boolean z0(tb1 r5) {
        dz3 r0 = this.q;
        r0.getClass();
        if (r0.a == 0) goto L16;
        int r1 = E0(r5);
        if ((r1 & 512) == 0) goto L16;
        dz3 r2 = this.q;
        r2.getClass();
        if (r2.a != 2) goto L9;
    L14:
        return true;
    L9:
        if ((r1 & 1024) != 0) goto L14;
        if (r5.I != 0) goto L16;
        if (r5.J == 0) goto L14;
    L16:
        if (((tj0) this.W0).j(r5) == 0) goto L18;
        return true;
    L18:
        return false;
    }
}
