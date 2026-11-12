package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aq implements oi3 {
    public final /* synthetic */ MediaService n;
    public final /* synthetic */ qi3 o;

    public aq(MediaService r1, qi3 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.oi3
    public final void A(jw4 r7) {
        r7.getClass();
        qi3 r0 = this.o;
        Log.d("BaseMediaService", "onTracksChanged: " + r0.o0());
        jz3.p(r0, r7);
        gn2 r8 = r0.a();
        if (r8 == null) goto L9;
        gn2 r9 = gi1.J(r8);
        if (r9.d.I == null) goto L7;
        bo2.m(r9, false);
    L7:
        is3.a(r0, this.n);
    L9:
        if ((r0 instanceof ExoPlayer) == false) goto L27;
        AtomicBoolean r6 = bo2.b;
        if (r6.get() == false) goto L28;
        Log.d("BaseMediaService", "update shuffle order");
        r6.set(false);
        Object r1 = (ExoPlayer) r0;
        int r10 = ((fq) r1).Q0();
        int[] r11 = new int[r10];
        int r2 = 0;
    L13:
        if (r2 >= r10) goto L15;
        r11[r2] = r2;
        r2 = r2 + 1;
        goto L13
    L15:
        ju3 r3 = ku3.n;
        int r4 = r10 - 1;
    L16:
        if (r4 <= 0) goto L18;
        int r5 = ku3.o.a(r4 + 1);
        int r12 = r11[r4];
        r11[r4] = r11[r5];
        r11[r5] = r12;
        r4 = r4 - 1;
        goto L16
    L18:
        i41 r13 = (i41) r1;
        int r14 = ti.l0(r11, r13.o0());
        if (r14 <= (-1)) goto L23;
        if (r10 == 0) goto L23;
        int r15 = r11[0];
        r11[0] = r11[r14];
        r11[r14] = r15;
    L23:
        ju3 r16 = ku3.n;
        r13.s1(new pd4(r11, ku3.o.b().nextLong()));
        return;
    L28:
        return;
    }

    @Override // defpackage.oi3
    public final void I(cu4 r8, int r9) {
        qi3 r0 = this.o;
        r8.getClass();
        Log.d("BaseMediaService", "onTimelineChanged reason=" + r9);
        MediaService r7 = this.n;
        r7.u();
        jz3.g(r0);     // Catch: Throwable -> L5
    L7:
        rs3.a.c(r7, r0);
        if (r8.p() == true) goto L23;
        bu4 r10 = new bu4();
        int r1 = r8.o();
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L31;
        r8.n(r2, r10);
        Uri r3 = r10.b.d.m;
        if (r3 == null) goto L22;
        ns3 r4 = r7.y;
        if (r4 == null) goto L20;
        if (((LruCache) r4.p).get(r3) != null) goto L22;
        ((ExecutorService) r4.q).execute(new ur2(23, r4, r3));
        goto L22
    L20:
        h12.Q("bitmapLoader");
        throw null;
    L22:
        r2 = r2 + 1;
        goto L11
    L31:
        return;
    L23:
        return;
    L5:
        th = move-exception;
        Log.w("BaseMediaService", "prefetchQueueGains failed: " + th);
        goto L7
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException r7) {
        r7.getClass();
        int r0 = r7.n;
        if (r0 != (-100)) goto L5;
        String r1 = "ERROR_CODE_DISCONNECTED";
    L80:
        Log.w("BaseMediaService", "onPlayerError: ".concat(r1), r7);
        switch(r0) {
            case 2000: goto L83;
            case 2001: goto L83;
            case 2002: goto L83;
            default: goto L88;
        };
    L83:
        long r2 = SystemClock.elapsedRealtime();
        MediaService r8 = this.n;
        if ((r2 - r8.O) < r8.P) goto L87;
        r8.O = r2;
        this.o.b();
        return;
    L87:
        return;
    L88:
        return;
    L5:
        if (r0 != (-6)) goto L7;
        r1 = "ERROR_CODE_NOT_SUPPORTED";
        goto L80
    L7:
        if (r0 != (-4)) goto L9;
        r1 = "ERROR_CODE_PERMISSION_DENIED";
        goto L80
    L9:
        if (r0 != (-3)) goto L11;
        r1 = "ERROR_CODE_BAD_VALUE";
        goto L80
    L11:
        if (r0 != (-2)) goto L13;
        r1 = "ERROR_CODE_INVALID_STATE";
        goto L80
    L13:
        if (r0 != 7000) goto L15;
        r1 = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        goto L80
    L15:
        if (r0 == 7001) goto L73;
        switch(r0) {
            case -110: goto L72;
            case -109: goto L71;
            case -108: goto L70;
            case -107: goto L69;
            case -106: goto L68;
            case -105: goto L67;
            case -104: goto L66;
            case -103: goto L65;
            case -102: goto L64;
            default: goto L17;
        };
    L17:
        switch(r0) {
            case 1000: goto L63;
            case 1001: goto L62;
            case 1002: goto L61;
            case 1003: goto L60;
            case 1004: goto L59;
            default: goto L18;
        };
    L18:
        switch(r0) {
            case 2000: goto L58;
            case 2001: goto L57;
            case 2002: goto L56;
            case 2003: goto L55;
            case 2004: goto L54;
            case 2005: goto L53;
            case 2006: goto L52;
            case 2007: goto L51;
            case 2008: goto L50;
            default: goto L19;
        };
    L19:
        switch(r0) {
            case 3001: goto L49;
            case 3002: goto L48;
            case 3003: goto L47;
            case 3004: goto L46;
            default: goto L20;
        };
    L20:
        switch(r0) {
            case 4001: goto L45;
            case 4002: goto L44;
            case 4003: goto L43;
            case 4004: goto L42;
            case 4005: goto L41;
            case 4006: goto L40;
            default: goto L21;
        };
    L21:
        switch(r0) {
            case 5001: goto L39;
            case 5002: goto L38;
            case 5003: goto L37;
            case 5004: goto L36;
            default: goto L22;
        };
    L22:
        switch(r0) {
            case 6000: goto L35;
            case 6001: goto L34;
            case 6002: goto L33;
            case 6003: goto L32;
            case 6004: goto L31;
            case 6005: goto L30;
            case 6006: goto L29;
            case 6007: goto L28;
            case 6008: goto L27;
            default: goto L24;
        };
    L27:
        r1 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
        goto L80
    L28:
        r1 = "ERROR_CODE_DRM_DEVICE_REVOKED";
        goto L80
    L29:
        r1 = "ERROR_CODE_DRM_SYSTEM_ERROR";
        goto L80
    L30:
        r1 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
        goto L80
    L31:
        r1 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
        goto L80
    L32:
        r1 = "ERROR_CODE_DRM_CONTENT_ERROR";
        goto L80
    L33:
        r1 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
        goto L80
    L34:
        r1 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
        goto L80
    L35:
        r1 = "ERROR_CODE_DRM_UNSPECIFIED";
        goto L80
    L24:
        if (r0 < 1000000) goto L26;
        r1 = "custom error code";
        goto L80
    L26:
        r1 = "invalid error code";
        goto L80
    L36:
        r1 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
        goto L80
    L37:
        r1 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
        goto L80
    L38:
        r1 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        goto L80
    L39:
        r1 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        goto L80
    L40:
        r1 = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
        goto L80
    L41:
        r1 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
        goto L80
    L42:
        r1 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
        goto L80
    L43:
        r1 = "ERROR_CODE_DECODING_FAILED";
        goto L80
    L44:
        r1 = "ERROR_CODE_DECODER_QUERY_FAILED";
        goto L80
    L45:
        r1 = "ERROR_CODE_DECODER_INIT_FAILED";
        goto L80
    L46:
        r1 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
        goto L80
    L47:
        r1 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
        goto L80
    L48:
        r1 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
        goto L80
    L49:
        r1 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
        goto L80
    L50:
        r1 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
        goto L80
    L51:
        r1 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
        goto L80
    L52:
        r1 = "ERROR_CODE_IO_NO_PERMISSION";
        goto L80
    L53:
        r1 = "ERROR_CODE_IO_FILE_NOT_FOUND";
        goto L80
    L54:
        r1 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
        goto L80
    L55:
        r1 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
        goto L80
    L56:
        r1 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
        goto L80
    L57:
        r1 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
        goto L80
    L58:
        r1 = "ERROR_CODE_IO_UNSPECIFIED";
        goto L80
    L59:
        r1 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
        goto L80
    L60:
        r1 = "ERROR_CODE_TIMEOUT";
        goto L80
    L61:
        r1 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
        goto L80
    L62:
        r1 = "ERROR_CODE_REMOTE_ERROR";
        goto L80
    L63:
        r1 = "ERROR_CODE_UNSPECIFIED";
        goto L80
    L64:
        r1 = "ERROR_CODE_AUTHENTICATION_EXPIRED";
        goto L80
    L65:
        r1 = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
        goto L80
    L66:
        r1 = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
        goto L80
    L67:
        r1 = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
        goto L80
    L68:
        r1 = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
        goto L80
    L69:
        r1 = "ERROR_CODE_SKIP_LIMIT_REACHED";
        goto L80
    L70:
        r1 = "ERROR_CODE_SETUP_REQUIRED";
        goto L80
    L71:
        r1 = "ERROR_CODE_END_OF_PLAYLIST";
        goto L80
    L72:
        r1 = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
        goto L80
    L73:
        r1 = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        goto L80
    }

    @Override // defpackage.oi3
    public final void V(boolean r12) {
        MediaService r0 = this.n;
        g5 r1 = r0.F;
        Handler r2 = r0.B;
        qi3 r11 = this.o;
        Log.d("BaseMediaService", "onIsPlayingChanged " + r11.o0());
        if (r12 == true) goto L9;
        bo2.n(r11.a(), r11.M0());
        gn2 r4 = r11.a();
        if (r4 == null) goto L10;
        String r7 = r4.a;
        if (r7 == null) goto L10;
        vs3.b.execute(new ss3(new vs3(), r7, r11.M0(), 1));
    L10:
        boolean r5 = r0.C;
        if (r12 == false) goto L16;
        if (r5 == true) goto L15;
        r2.postDelayed(r1, 1000);
        r0.C = true;
    L15:
        MediaService.m(r0);
    L20:
        r0.w(r11);
        return;
    L16:
        if (r5 == false) goto L19;
        r2.removeCallbacks(r1);
        r0.C = false;
    L19:
        r0.t();
        goto L20
    L9:
        bo2.m(r11.a(), false);
        goto L10
    }

    @Override // defpackage.oi3
    public final void b(int r3) {
        Log.d("BaseMediaService", "onAudioSessionIdChanged");
        MediaService r2 = this.n;
        wo0 r0 = r2.A;
        if (r0 == null) goto L6;
        v11 r1 = (v11) r0.n;
        Context r4 = ((Context) r0.o).getApplicationContext();
        r4.getClass();
        r1.f(r4, r3);
        r2.sendBroadcast(new Intent("com.eddyizm.tempus.service.EQUALIZER_UPDATED"));
        return;
    L6:
        h12.Q("equalizerManager");
        throw null;
    }

    @Override // defpackage.oi3
    public final void f(int r1) {
        ud3.t0(r1);
    }

    @Override // defpackage.oi3
    public final void h(qv2 r15) {
        r15.getClass();
        pv2[] r16 = r15.a;
        qi3 r0 = this.o;
        gn2 r1 = r0.a();
        if (r1 == null) goto L150;
        do2 r2 = r1.d;
        Bundle r3 = r2.I;
        ExoPlayer r4 = null;
        if (r3 == null) goto L8;
        String r5 = r3.getString("type");
    L10:
        if (h12.c(r5, WaveOrigin.RADIO) == false) goto L151;
        int r6 = r16.length;
        String r8 = null;
        String r9 = null;
        int r7 = 0;
    L14:
        if (r7 >= r6) goto L68;
        pv2 r11 = r16[r7];
        r11.getClass();
        if ((r11 instanceof jv1) == false) goto L31;
        String r12 = ((jv1) r11).b;
        if (r12 == null) goto L67;
        List r10 = qm4.C0(r12, new String[]{" - "}, 2);
        if (r10.size() != 2) goto L27;
        r8 = qm4.K0((String) r10.get(0)).toString();
        if (r8.length() != 0) goto L24;
        r8 = null;
    L24:
        r9 = qm4.K0((String) r10.get(1)).toString();
        if (r9.length() != 0) goto L67;
    L26:
        r9 = null;
        goto L67
    L27:
        r9 = qm4.K0(r12).toString();
        if (r9.length() == 0) goto L26;
    L67:
        r7 = r7 + 1;
        goto L14
    L31:
        if ((r11 instanceof ds4) == false) goto L49;
        ds4 r13 = (ds4) r11;
        String r14 = r13.c;
        r14.getClass();
        String r17 = r13.a;
        int r18 = r17.hashCode();
        if (r18 == 2575251) goto L43;
        if (r18 != 2581512) goto L67;
        if (r17.equals("TPE1") == false) goto L67;
        if (qm4.u0(r14) == true) goto L67;
    L41:
        r8 = r14;
        goto L67
    L43:
        if (r17.equals("TIT2") == false) goto L67;
        if (qm4.u0(r14) == true) goto L67;
    L66:
        r9 = r14;
        goto L67
    L49:
        if ((r11 instanceof r85) == false) goto L67;
        r85 r19 = (r85) r11;
        r14 = r19.b;
        r14.getClass();
        String r110 = r19.a;
        int r111 = r110.hashCode();
        if (r111 == 79833656) goto L62;
        if (r111 != 1939198791) goto L67;
        if (r110.equals("ARTIST") == false) goto L67;
        if (qm4.u0(r14) == true) goto L67;
    L62:
        if (r110.equals("TITLE") == false) goto L67;
        if (qm4.u0(r14) == true) goto L67;
    L68:
        if (r8 != null) goto L70;
    L71:
        if (r9 != null) goto L73;
        return;
    L73:
        if (qm4.u0(r9) == true) goto L152;
    L75:
        MediaService r112 = this.n;
        if (h12.c(r8, r112.M) == true) goto L78;
    L80:
        r112.M = r8;
        r112.N = r9;
        r112.t();
        int r113 = r0.o0();
        if (r113 == (-1)) goto L154;
        co2 r20 = r2.a();
        if (r3 != null) goto L86;
        Bundle r21 = new Bundle();
    L87:
        Bundle r22 = new Bundle(r21);
        if (r8 == null) goto L90;
        r22.putString("radioArtist", r8);
    L90:
        if (r9 == null) goto L93;
        r22.putString("radioTitle", r9);
    L93:
        if (r3 == null) goto L96;
        String r23 = r3.getString("stationName");
        if (r23 == null) goto L96;
    L101:
        if (qm4.u0(r23) == true) goto L103;
        r22.putString("stationName", r23);
    L103:
        if (r8 != null) goto L105;
    L112:
        if (r9 != null) goto L114;
    L117:
        if (r8 != null) goto L119;
    L120:
        r8 = r23;
    L121:
        r20.a = r8;
        if (qm4.u0(r23) == true) goto L125;
        r20.b = r23;
    L125:
        if ((r0 instanceof ExoPlayer) == false) goto L127;
        r4 = (ExoPlayer) r0;
    L127:
        if (r4 == null) goto L149;
        tm2 r24 = r1.a();
        r20.H = r22;
        r24.k = new do2(r20);
        ((fq) r4).z0(r113, r24.a());
        r112.w(r4);
        return;
    L149:
        return;
    L119:
        if (qm4.u0(r8) == false) goto L121;
    L114:
        if (qm4.u0(r9) == true) goto L117;
        r8 = r9;
        goto L121
    L105:
        if (qm4.u0(r8) == true) goto L112;
        if (r9 == null) goto L112;
        if (qm4.u0(r9) == true) goto L112;
        r8 = r8 + " - " + r9;
    L96:
        CharSequence r25 = r2.a;
        if (r25 == null) goto L99;
        r23 = r25.toString();
        goto L101
    L99:
        r23 = "";
        goto L101
    L86:
        r21 = r3;
        goto L87
    L154:
        return;
    L78:
        if (h12.c(r9, r112.N) == false) goto L80;
        return;
    L152:
        return;
    L70:
        if (qm4.u0(r8) == false) goto L75;
    L151:
        return;
    L8:
        r5 = null;
        goto L10
    }

    @Override // defpackage.oi3
    public final void k(pi3 r6, pi3 r7, int r8) {
        r6.getClass();
        r7.getClass();
        int r0 = r6.b;
        int r1 = r7.b;
        StringBuilder r2 = b11.t("onPositionDiscontinuity reason=", " old=", r8, r0, " new=");
        r2.append(r1);
        Log.d("BaseMediaService", r2.toString());
        if (r6.b == r7.b) goto L8;
        if (r8 == 0) goto L8;
        gn2 r3 = r6.c;
        if (r3 == null) goto L8;
        bo2.n(r3, r6.f);
    L8:
        int r4 = 0;
        if (r8 != 0) goto L11;
    L13:
        String r5 = null;
        if (r8 != 0) goto L39;
        gn2 r9 = r6.c;
        if (r9 == null) goto L22;
        do2 r10 = r9.d;
        if (r10 == null) goto L22;
        Bundle r11 = r10.I;
        if (r11 == null) goto L22;
        String r12 = r11.getString("type");
    L24:
        if (h12.c(r12, "music") == false) goto L26;
        bo2.m(r6.c, true);
        bo2.l(r6.c);
    L26:
        bo2.d(r6.c);
        gn2 r13 = r7.c;
        if (r13 == null) goto L34;
        do2 r14 = r13.d;
        if (r14 == null) goto L34;
        Bundle r15 = r14.I;
        if (r15 == null) goto L34;
        r5 = r15.getString("type");
    L34:
        if (h12.c(r5, "music") == false) goto L65;
        gn2 r16 = r7.c;
        if (r16 == null) goto L66;
        vs3.b.execute(new ur2(14, new vs3(), r16.a));
        return;
    L66:
        return;
    L65:
        return;
    L22:
        r12 = null;
        goto L24
    L39:
        if (r8 == 1) goto L41;
        return;
    L41:
        if (r6.b == r7.b) goto L68;
        gn2 r17 = r6.c;
        if (r17 == null) goto L50;
        do2 r18 = r17.d;
        if (r18 == null) goto L50;
        Bundle r19 = r18.I;
        if (r19 == null) goto L50;
        r5 = r19.getString("type");
    L50:
        if (h12.c(r5, "music") == false) goto L69;
        gn2 r20 = r6.c;
        if (r20 == null) goto L58;
        do2 r21 = r20.d;
        if (r21 == null) goto L58;
        Bundle r22 = r21.I;
        if (r22 == null) goto L58;
        r4 = r22.getInt("duration");
    L58:
        long r23 = ((long) r4) * 1000;
        long r24 = r6.f;
        WeakReference r25 = bo2.a;
        if (r23 > 30000) goto L62;
        return;
    L62:
        if (r24 < Math.min(r23 / 2, 240000)) goto L70;
        bo2.m(r6.c, true);
        bo2.l(r6.c);
        return;
    L70:
        return;
    L69:
        return;
    L68:
        return;
    L11:
        if (r6.b != r7.b) goto L13;
        jz3.e.l = false;
        jz3.i(this.o);
        goto L13
    }

    @Override // defpackage.oi3
    public final void q(boolean r2) {
        if (r2 == true) goto L5;
        rs3.a.c(this.n, this.o);
        return;
    }

    @Override // defpackage.oi3
    public final void t(int r12, gn2 r13) {
        Log.d("BaseMediaService", "onMediaItemTransition" + this.o.o0());
        if (r13 != null) goto L5;
        return;
    L5:
        qi3 r0 = this.o;
        iz3 r1 = jz3.e;
        r1.l = false;
        if (r13.a != null) goto L8;
        Log.d("ReplayGainUtil", "applyGain: null mediaItem or mediaId, skipping");
    L19:
        Bundle r2 = r13.d.I;
        if (r2 == null) goto L22;
        int r3 = r2.getInt("aa_start_index", -1);
    L23:
        if (r3 < 0) goto L34;
        Bundle r4 = new Bundle(r2);
        r4.remove("aa_start_index");
        co2 r5 = r13.d.a();
        r5.H = r4;
        do2 r6 = new do2(r5);
        int r7 = this.o.o0();
        Object r8 = this.o;
        if ((r8 instanceof ExoPlayer) == false) goto L28;
        if (r7 == (-1)) goto L28;
        tm2 r9 = r13.a();
        r9.k = r6;
        ((fq) ((ExoPlayer) r8)).z0(r7, r9.a());
    L28:
        if (r3 < 0) goto L34;
        if (r3 >= this.o.Q0()) goto L34;
        if (r3 == r7) goto L34;
        this.o.n(r3, 0);
    L34:
        if (r12 != 1) goto L36;
    L38:
        WeakReference r10 = bo2.a;
        vs3.b.execute(new ur2(14, new vs3(), r13.a));
    L39:
        if (r12 == 1) goto L41;
    L43:
        Bundle r14 = r13.d.I;
        if (r14 == null) goto L46;
        String r15 = r14.getString("type");
    L48:
        if (h12.c(r15, WaveOrigin.RADIO) == false) goto L53;
        if (this.o.h0() == false) goto L53;
        this.n.t();
        MediaService.m(this.n);
    L55:
        this.n.w(this.o);
        rs3.a.c(this.n, this.o);
        return;
    L53:
        if (h12.c(r15, WaveOrigin.RADIO) == true) goto L55;
        this.n.t();
        goto L55
    L46:
        r15 = null;
        goto L48
    L41:
        if (yf4.c().g == false) goto L43;
        yf4.c().f();
        yf4.c().a(true);
        this.o.R(1.0f);
        this.o.c();
        goto L43
    L36:
        if (r12 == 2) goto L38;
    L22:
        r3 = -1;
        goto L23
    L8:
        ReplayGainInfo r11 = jz3.d(r13);
        if (r11 == null) goto L11;
        ArrayList r16 = jz3.o(r11);
        jz3.b.put(r13.a, r16);
        jz3.c.add(r13.a);
        float r17 = jz3.k(r0, r16);
        float r18 = jz3.l(r0, r16);
        float r19 = jz3.c(r17, r18);
        Log.d("ReplayGainUtil", "applyGain: server RG for " + r13.a + " gain=" + r17 + " peak=" + r18 + " totalGain=" + r19);
        r1.n(r19);
        jz3.h(r0);
        goto L19
    L11:
        List r20 = (List) jz3.b.get(r13.a);
        if (r20 == null) goto L17;
        float r21 = jz3.k(r0, r20);
        if (r21 == 0.0f) goto L16;
        float r22 = jz3.l(r0, r20);
        float r23 = jz3.c(r21, r22);
        Log.d("ReplayGainUtil", "applyGain: tag cache hit for " + r13.a + " gain=" + r21 + " peak=" + r22 + " totalGain=" + r23);
        r1.n(r23);
    L18:
        jz3.h(r0);
        goto L19
    L16:
        float r24 = jz3.c(0.0f, 0.0f);
        Log.d("ReplayGainUtil", "applyGain: cache hit but gain=0 for " + r13.a + ", applying preamp-only totalGain=" + r24);
        r1.n(r24);
        goto L18
    L17:
        Log.d("ReplayGainUtil", "applyGain: cache miss for " + r13.a + ", holding current gain until onTracksChanged");
        goto L18
    }

    @Override // defpackage.oi3
    public final void v(int r3) {
        Log.d("BaseMediaService", "onPlaybackStateChanged");
        qi3 r0 = this.o;
        if (r0.f0() == false) goto L5;
    L13:
        this.n.w(r0);
        return;
    L5:
        if (r3 != 4) goto L13;
        Bundle r4 = r0.K0().I;
        if (r4 == null) goto L9;
        String r5 = r4.getString("type");
    L11:
        if (h12.c(r5, "music") == false) goto L13;
        bo2.m(r0.a(), true);
        bo2.l(r0.a());
        bo2.d(r0.a());
        goto L13
    L9:
        r5 = null;
        goto L11
    }

    @Override // defpackage.oi3
    public final void x(boolean r1) {
        ud3.x0(r1);
    }
}
