package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn {
    public final Context a;
    public final fz0 b;
    public final wo0 c;
    public final zh0 d;
    public tc2 e;
    public vp4 f;
    public nl g;
    public ql h;
    public Looper i;
    public Context j;

    public dn(ss0 r3) {
        Context r0 = (Context) r3.n;
        this.a = r0;
        wo0 r1 = (wo0) r3.o;
        r1.getClass();
        this.c = r1;
        this.b = (fz0) r3.p;
        this.g = (nl) r3.q;
        if (r0 != null) goto L5;
        zh0 r4 = null;
    L6:
        this.d = r4;
        this.f = vp4.a;
        return;
    L5:
        r4 = new zh0(8, this);
        goto L6
    }

    public final an a(em r9) {
        int r0 = r9.h;     // Catch: Throwable -> L37
        int r1 = r9.i;     // Catch: Throwable -> L37
        if (r1 == (-1)) goto L15;
        Context r2 = this.a;
        if (r2 == null) goto L15;
        if (Build.VERSION.SDK_INT < 34) goto L15;
        Context r3 = this.j;     // Catch: Throwable -> L37 Throwable -> L37
        if (r3 != null) goto L12;
    L13:
        this.j = bn.e(r2, r1);     // Catch: Throwable -> L37 Throwable -> L37
    L14:
        Context r4 = this.j;     // Catch: Throwable -> L37 Throwable -> L37
        r0 = 0;
    L16:
        AudioFormat r5 = new AudioFormat.Builder().setSampleRate(r9.b).setChannelMask(r9.c).setEncoding(r9.a).build();     // Catch: Throwable -> L37 Throwable -> L37
        il r6 = r9.g;     // Catch: Throwable -> L37 Throwable -> L37
        if (r9.d == false) goto L20;
        AudioAttributes r7 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();     // Catch: IllegalArgumentException -> L35 Throwable -> L37
    L21:
        AudioTrack.Builder r8 = new AudioTrack.Builder().setAudioAttributes(r7).setAudioFormat(r5).setTransferMode(1).setBufferSizeInBytes(r9.f).setSessionId(r0);     // Catch: Throwable -> L37 Throwable -> L37
        int r10 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L37 Throwable -> L37
        if (r10 < 29) goto L24;
        z9.m(r8, r9.e);     // Catch: Throwable -> L37 Throwable -> L37
    L24:
        if (r10 < 34) goto L27;
        if (r4 == null) goto L27;
        bn.x(r8, r4);     // Catch: Throwable -> L37 Throwable -> L37
    L27:
        AudioTrack r11 = r8.build();     // Catch: Throwable -> L37 Throwable -> L37
        if (r11.getState() == 1) goto L31;
        r11.release();     // Catch: Exception -> L40
    L34:
        throw new AudioOutputProvider$InitializationException();
    L31:
        return new an(r11, r9, this.d, this.f);
    L20:
        r7 = r6.c();     // Catch: IllegalArgumentException -> L35 Throwable -> L37
    L35:
        e = e;
    L39:
        throw new AudioOutputProvider$InitializationException(e);
    L12:
        if (bn.c(r3) == r1) goto L14;
    L15:
        r4 = null;
    L37:
        e = e;
        goto L39
    }

    public final cm b(am r8) {
        e(r8);
        tb1 r0 = r8.a;
        il r9 = r8.b;
        zl r1 = this.c.v(r0, r9);
        bm r2 = new bm();
        String r3 = r0.n;
        int r4 = r0.H;
        int r5 = 0;
        if (Objects.equals(r3, "audio/raw") == false) goto L7;
        if (r4 != 2) goto L9;
    L5:
        r5 = 2;
    L9:
        r2.a = r5;
        r2.b = r1.a;
        r2.c = r1.b;
        r2.d = r1.c;
        return r2.a();
    L7:
        if (this.g.d(r0, r9) == null) goto L9;
        goto L9
    }

    public final em c(am r24) {
        tb1 r2 = r24.a;
        boolean r3 = r24.d;
        il r4 = r24.b;
        e(r24);
        String r5 = r2.n;
        int r6 = r2.G;
        int r7 = r2.H;
        int r8 = r2.F;
        if (Objects.equals(r5, "audio/raw") == false) goto L6;
        rr2.l(f35.L(r7));
        int r9 = f35.s(r8);
        int r10 = f35.t(r7) * r8;
        boolean r11 = false;
        char r14 = 0;
    L5:
        boolean r15 = false;
    L16:
        int r12 = r2.j;
        if (Objects.equals(r5, "audio/vnd.dts.hd;profile=lbr") == false) goto L20;
        if (r12 != (-1)) goto L20;
        r12 = 768000;
    L20:
        int r13 = r24.h;
        if (r13 == (-1)) goto L23;
        boolean r20 = true;
    L63:
        dm r0 = new dm();
        il r16 = il.i;
        r0.i = -1;
        r0.b = r6;
        r0.c = r9;
        r0.a = r7;
        r0.f = r13;
        r0.h = r24.e;
        r0.g = r4;
        boolean r17 = r20;
        if (r14 != r17) goto L66;
        boolean r18 = r17;
    L67:
        r0.e = r18;
        r0.d = r24.g;
        r0.j = r15;
        r0.k = r11;
        r0.i = r24.f;
        return new em(r0);
    L66:
        r18 = false;
        goto L67
    L23:
        int r19 = AudioTrack.getMinBufferSize(r6, r9, r7);
        if (r19 == (-2)) goto L26;
        boolean r110 = true;
    L27:
        rr2.w(r110);
        if (r10 != (-1)) goto L31;
        r10 = 1;
    L31:
        if (r15 == false) goto L33;
        double r111 = 8.0d;
    L34:
        this.b.getClass();
        if (r14 != 0) goto L37;
        r20 = true;
        long r112 = r6;
        long r113 = 250000 * r112;
        long r114 = r10;
        int r1 = f35.j(r19 * 4, jz4.m((r113 * r114) / 1000000), jz4.m(((750000 * r112) * r114) / 1000000));
    L62:
        r13 = (((Math.max(r19, (int) (((double) r1) * r111)) + r10) - 1) / r10) * r10;
        goto L63
    L37:
        if (r14 == 1) goto L56;
        if (r14 == 2) goto L40;
        nz2.c();
        return null;
    L40:
        if (r7 != 5) goto L42;
        int r115 = 500000;
    L45:
        if (r12 == (-1)) goto L48;
        RoundingMode r21 = RoundingMode.CEILING;
        int r22 = h12.m(r12, 8);
    L47:
        r20 = true;
        r1 = jz4.m((((long) r115) * ((long) r22)) / 1000000);
        goto L62
    L48:
        int r23 = wr1.w(r7);
        if (r23 == (-2147483647)) goto L51;
        boolean r25 = true;
    L52:
        rr2.w(r25);
        r22 = r23;
        goto L47
    L51:
        r25 = false;
        goto L52
    L42:
        if (r7 != 8) goto L44;
        r115 = 1000000;
        goto L45
    L44:
        r115 = 250000;
        goto L45
    L56:
        r20 = true;
        int r26 = wr1.w(r7);
        if (r26 == (-2147483647)) goto L59;
        boolean r27 = true;
    L60:
        rr2.w(r27);
        r1 = jz4.m((50000000 * ((long) r26)) / 1000000);
        goto L62
    L59:
        r27 = false;
        goto L60
    L33:
        r111 = 1.0d;
        goto L34
    L26:
        r110 = false;
        goto L27
    L6:
        if (r3 == false) goto L8;
        zl r28 = this.c.v(r2, r4);
    L9:
        if (r3 == true) goto L11;
    L13:
        Pair r29 = this.g.d(r2, r4);
        if (r29 == null) goto L70;
        r7 = ((Integer) r29.first).intValue();
        r9 = ((Integer) r29.second).intValue();
        r14 = 2;
        r10 = -1;
        r11 = false;
        goto L5
    L70:
        throw new AudioOutputProvider$ConfigurationException("Unable to configure passthrough for: " + r2);
    L11:
        if (r28.a == false) goto L13;
        r5.getClass();
        int r30 = lw2.c(r5, r2.k);
        int r31 = f35.s(r8);
        boolean r32 = r28.b;
        r7 = r30;
        r9 = r31;
        r11 = r32;
        r10 = -1;
        r14 = 1;
        r15 = true;
        goto L16
    L8:
        r28 = zl.d;
        goto L9
    }

    public final void d() {
        tc2 r0 = this.e;
        if (r0 == null) goto L5;
        r0.d();
    L5:
        ql r3 = this.h;
        if (r3 == null) goto L15;
        Context r1 = r3.a;
        if (r3.j == false) goto L16;
        r3.g = null;
        xl.n(r1).unregisterAudioDeviceCallback(r3.d);
        r1.unregisterReceiver(r3.e);
        pl r2 = r3.f;
        if (r2 == null) goto L13;
        r2.a.unregisterContentObserver(r2);
    L13:
        r3.j = false;
        return;
    L16:
        return;
    }

    public final void e(am r6) {
        AudioDeviceInfo r0 = r6.c;
        il r7 = r6.b;
        f();
        ql r1 = this.h;
        if (r1 != null) goto L14;
        Context r2 = this.a;
        if (r2 == null) goto L14;
        ql r3 = new ql(r2, new cn(0, this), r7, r0);
        this.h = r3;
        if (r3.j == false) goto L9;
        nl r8 = r3.g;
        r8.getClass();
    L13:
        this.g = r8;
    L24:
        this.g.getClass();
        return;
    L9:
        r3.j = true;
        pl r9 = r3.f;
        if (r9 == null) goto L12;
        r9.a.registerContentObserver(r9.b, false, r9);
    L12:
        Context r10 = r3.a;
        AudioManager r4 = xl.n(r10);
        ol r5 = r3.d;
        Handler r11 = r3.c;
        r4.registerAudioDeviceCallback(r5, r11);
        IntentFilter r12 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        r8 = nl.c(r10, r10.registerReceiver(r3.e, r12, null, r11), r3.i, r3.h);
        r3.g = r8;
    L14:
        if (r1 == null) goto L24;
        if (r0 != null) goto L17;
    L20:
        ql r13 = this.h;
        if (Objects.equals(r7, r13.i) == true) goto L24;
        r13.i = r7;
        r13.a(nl.b(r13.a, r7, r13.h));
        goto L24
    L17:
        if (r0.equals(r1.h) == true) goto L20;
        r1.h = r0;
        r1.a(nl.b(r1.a, r1.i, r0));
        goto L20
    }

    public final void f() {
        if (this.a != null) goto L5;
        return;
    L5:
        Looper r0 = Looper.myLooper();
        Looper r1 = this.i;
        if (r1 == null) goto L10;
        if (r1 == r0) goto L10;
        boolean r2 = false;
    L11:
        String r3 = "null";
        if (r1 != null) goto L14;
        String r4 = "null";
    L15:
        if (r0 == null) goto L18;
        r3 = r0.getThread().getName();
    L18:
        if (r2 == false) goto L21;
        this.i = r0;
        return;
    L21:
        kf2.o(gh0.s("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", new Object[]{r4, r3}));
        return;
    L14:
        r4 = r1.getThread().getName();
    L10:
        r2 = true;
        goto L11
    }
}
