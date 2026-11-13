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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class aq implements oi3 {
    public final /* synthetic */ MediaService n;
    public final /* synthetic */ qi3 o;

    public aq(MediaService mediaService, qi3 qi3Var) {
        this.n = mediaService;
        this.o = qi3Var;
    }

    @Override // defpackage.oi3
    public final void A(jw4 jw4Var) {
        jw4Var.getClass();
        qi3 qi3Var = this.o;
        Log.d("BaseMediaService", "onTracksChanged: " + qi3Var.o0());
        jz3.p(qi3Var, jw4Var);
        gn2 a = qi3Var.a();
        if (a != null) {
            gn2 J = gi1.J(a);
            if (J.d.I != null) {
                bo2.m(J, false);
            }
            is3.a(qi3Var, this.n);
        }
        if (qi3Var instanceof ExoPlayer) {
            AtomicBoolean atomicBoolean = bo2.b;
            if (atomicBoolean.get()) {
                Log.d("BaseMediaService", "update shuffle order");
                atomicBoolean.set(false);
                Object obj = (ExoPlayer) qi3Var;
                int Q0 = ((fq) obj).Q0();
                int[] iArr = new int[Q0];
                for (int i = 0; i < Q0; i++) {
                    iArr[i] = i;
                }
                ju3 ju3Var = ku3.n;
                for (int i2 = Q0 - 1; i2 > 0; i2--) {
                    int a2 = ku3.o.a(i2 + 1);
                    int i3 = iArr[i2];
                    iArr[i2] = iArr[a2];
                    iArr[a2] = i3;
                }
                i41 i41Var = (i41) obj;
                int l0 = ti.l0(iArr, i41Var.o0());
                if (l0 > -1 && Q0 != 0) {
                    int i4 = iArr[0];
                    iArr[0] = iArr[l0];
                    iArr[l0] = i4;
                }
                ju3 ju3Var2 = ku3.n;
                i41Var.s1(new pd4(iArr, ku3.o.b().nextLong()));
            }
        }
    }

    @Override // defpackage.oi3
    public final void I(cu4 cu4Var, int i) {
        qi3 qi3Var = this.o;
        cu4Var.getClass();
        Log.d("BaseMediaService", "onTimelineChanged reason=" + i);
        MediaService mediaService = this.n;
        mediaService.u();
        try {
            jz3.g(qi3Var);
        } catch (Throwable th) {
            Log.w("BaseMediaService", "prefetchQueueGains failed: " + th);
        }
        rs3.a.c(mediaService, qi3Var);
        if (cu4Var.p()) {
            return;
        }
        bu4 bu4Var = new bu4();
        int o = cu4Var.o();
        for (int i2 = 0; i2 < o; i2++) {
            cu4Var.n(i2, bu4Var);
            Uri uri = bu4Var.b.d.m;
            if (uri != null) {
                ns3 ns3Var = mediaService.y;
                if (ns3Var == null) {
                    h12.Q("bitmapLoader");
                    throw null;
                }
                if (((LruCache) ns3Var.p).get(uri) == null) {
                    ((ExecutorService) ns3Var.q).execute(new ur2(23, ns3Var, uri));
                }
            }
        }
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException playbackException) {
        String str;
        playbackException.getClass();
        int i = playbackException.n;
        if (i == -100) {
            str = "ERROR_CODE_DISCONNECTED";
        } else if (i == -6) {
            str = "ERROR_CODE_NOT_SUPPORTED";
        } else if (i == -4) {
            str = "ERROR_CODE_PERMISSION_DENIED";
        } else if (i == -3) {
            str = "ERROR_CODE_BAD_VALUE";
        } else if (i == -2) {
            str = "ERROR_CODE_INVALID_STATE";
        } else if (i == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i != 7001) {
            switch (i) {
                case -110:
                    str = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                    break;
                case -109:
                    str = "ERROR_CODE_END_OF_PLAYLIST";
                    break;
                case -108:
                    str = "ERROR_CODE_SETUP_REQUIRED";
                    break;
                case -107:
                    str = "ERROR_CODE_SKIP_LIMIT_REACHED";
                    break;
                case -106:
                    str = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                    break;
                case -105:
                    str = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                    break;
                case -104:
                    str = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                    break;
                case -103:
                    str = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                    break;
                case -102:
                    str = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                    break;
                default:
                    switch (i) {
                        case 1000:
                            str = "ERROR_CODE_UNSPECIFIED";
                            break;
                        case 1001:
                            str = "ERROR_CODE_REMOTE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            break;
                        case 1003:
                            str = "ERROR_CODE_TIMEOUT";
                            break;
                        case 1004:
                            str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            break;
                        default:
                            switch (i) {
                                case 2000:
                                    str = "ERROR_CODE_IO_UNSPECIFIED";
                                    break;
                                case 2001:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    break;
                                case 2002:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    break;
                                case 2003:
                                    str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    break;
                                case 2004:
                                    str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    break;
                                case 2005:
                                    str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    break;
                                case 2006:
                                    str = "ERROR_CODE_IO_NO_PERMISSION";
                                    break;
                                case 2007:
                                    str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    break;
                                case 2008:
                                    str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    break;
                                default:
                                    switch (i) {
                                        case 3001:
                                            str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            break;
                                        case 3002:
                                            str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            break;
                                        case 3003:
                                            str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            break;
                                        case 3004:
                                            str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 4001:
                                                    str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                    break;
                                                case 4002:
                                                    str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    break;
                                                case 4003:
                                                    str = "ERROR_CODE_DECODING_FAILED";
                                                    break;
                                                case 4004:
                                                    str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    break;
                                                case 4005:
                                                    str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    break;
                                                case 4006:
                                                    str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 5001:
                                                            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                            break;
                                                        case 5002:
                                                            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                            break;
                                                        case 5003:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                            break;
                                                        case 5004:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 6000:
                                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                    break;
                                                                case 6001:
                                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                    break;
                                                                case 6002:
                                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                    break;
                                                                case 6003:
                                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                    break;
                                                                case 6004:
                                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                    break;
                                                                case 6005:
                                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                    break;
                                                                case 6006:
                                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                    break;
                                                                case 6007:
                                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                    break;
                                                                case 6008:
                                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                    break;
                                                                default:
                                                                    if (i < 1000000) {
                                                                        str = "invalid error code";
                                                                        break;
                                                                    } else {
                                                                        str = "custom error code";
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        Log.w("BaseMediaService", "onPlayerError: ".concat(str), playbackException);
        switch (i) {
            case 2000:
            case 2001:
            case 2002:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                MediaService mediaService = this.n;
                if (elapsedRealtime - mediaService.O >= mediaService.P) {
                    mediaService.O = elapsedRealtime;
                    this.o.b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oi3
    public final void V(boolean z) {
        String str;
        MediaService mediaService = this.n;
        g5 g5Var = mediaService.F;
        Handler handler = mediaService.B;
        qi3 qi3Var = this.o;
        Log.d("BaseMediaService", "onIsPlayingChanged " + qi3Var.o0());
        if (z) {
            bo2.m(qi3Var.a(), false);
        } else {
            bo2.n(qi3Var.a(), qi3Var.M0());
            gn2 a = qi3Var.a();
            if (a != null && (str = a.a) != null) {
                vs3.b.execute(new ss3(new vs3(), str, qi3Var.M0(), 1));
            }
        }
        boolean z2 = mediaService.C;
        if (z) {
            if (!z2) {
                handler.postDelayed(g5Var, 1000L);
                mediaService.C = true;
            }
            MediaService.m(mediaService);
        } else {
            if (z2) {
                handler.removeCallbacks(g5Var);
                mediaService.C = false;
            }
            mediaService.t();
        }
        mediaService.w(qi3Var);
    }

    @Override // defpackage.oi3
    public final void b(int i) {
        Log.d("BaseMediaService", "onAudioSessionIdChanged");
        MediaService mediaService = this.n;
        wo0 wo0Var = mediaService.A;
        if (wo0Var == null) {
            h12.Q("equalizerManager");
            throw null;
        }
        v11 v11Var = (v11) wo0Var.n;
        Context applicationContext = ((Context) wo0Var.o).getApplicationContext();
        applicationContext.getClass();
        v11Var.f(applicationContext, i);
        mediaService.sendBroadcast(new Intent("com.eddyizm.tempus.service.EQUALIZER_UPDATED"));
    }

    @Override // defpackage.oi3
    public final void f(int i) {
        ud3.t0(i);
    }

    @Override // defpackage.oi3
    public final void h(qv2 qv2Var) {
        String obj;
        String str;
        qv2Var.getClass();
        pv2[] pv2VarArr = qv2Var.a;
        qi3 qi3Var = this.o;
        gn2 a = qi3Var.a();
        if (a == null) {
            return;
        }
        do2 do2Var = a.d;
        Bundle bundle = do2Var.I;
        if (h12.c(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO)) {
            String str2 = null;
            String str3 = null;
            for (pv2 pv2Var : pv2VarArr) {
                pv2Var.getClass();
                if (pv2Var instanceof jv1) {
                    String str4 = ((jv1) pv2Var).b;
                    if (str4 != null) {
                        List C0 = qm4.C0(str4, new String[]{" - "}, 2);
                        if (C0.size() == 2) {
                            str2 = qm4.K0((String) C0.get(0)).toString();
                            if (str2.length() == 0) {
                                str2 = null;
                            }
                            str3 = qm4.K0((String) C0.get(1)).toString();
                            if (str3.length() != 0) {
                            }
                            str3 = null;
                        } else {
                            str3 = qm4.K0(str4).toString();
                            if (str3.length() != 0) {
                            }
                            str3 = null;
                        }
                    }
                } else if (pv2Var instanceof ds4) {
                    ds4 ds4Var = (ds4) pv2Var;
                    str = ds4Var.c;
                    str.getClass();
                    String str5 = ds4Var.a;
                    int hashCode = str5.hashCode();
                    if (hashCode != 2575251) {
                        if (hashCode == 2581512) {
                            if (str5.equals("TPE1")) {
                                if (qm4.u0(str)) {
                                }
                                str2 = str;
                            }
                        }
                    } else if (str5.equals("TIT2")) {
                        if (qm4.u0(str)) {
                        }
                        str3 = str;
                    }
                } else if (pv2Var instanceof r85) {
                    r85 r85Var = (r85) pv2Var;
                    str = r85Var.b;
                    str.getClass();
                    String str6 = r85Var.a;
                    int hashCode2 = str6.hashCode();
                    if (hashCode2 != 79833656) {
                        if (hashCode2 == 1939198791) {
                            if (str6.equals("ARTIST")) {
                                if (qm4.u0(str)) {
                                }
                                str2 = str;
                            }
                        }
                    } else if (str6.equals("TITLE")) {
                        if (qm4.u0(str)) {
                        }
                        str3 = str;
                    }
                }
            }
            if ((str2 == null || qm4.u0(str2)) && (str3 == null || qm4.u0(str3))) {
                return;
            }
            MediaService mediaService = this.n;
            if (h12.c(str2, mediaService.M) && h12.c(str3, mediaService.N)) {
                return;
            }
            mediaService.M = str2;
            mediaService.N = str3;
            mediaService.t();
            int o0 = qi3Var.o0();
            if (o0 == -1) {
                return;
            }
            co2 a2 = do2Var.a();
            Bundle bundle2 = new Bundle(bundle == null ? new Bundle() : bundle);
            if (str2 != null) {
                bundle2.putString("radioArtist", str2);
            }
            if (str3 != null) {
                bundle2.putString("radioTitle", str3);
            }
            if (bundle == null || (obj = bundle.getString("stationName")) == null) {
                CharSequence charSequence = do2Var.a;
                obj = charSequence != null ? charSequence.toString() : "";
            }
            if (!qm4.u0(obj)) {
                bundle2.putString("stationName", obj);
            }
            if (str2 != null && !qm4.u0(str2) && str3 != null && !qm4.u0(str3)) {
                str2 = ((Object) str2) + " - " + ((Object) str3);
            } else if (str3 != null && !qm4.u0(str3)) {
                str2 = str3;
            } else if (str2 == null || qm4.u0(str2)) {
                str2 = obj;
            }
            a2.a = str2;
            if (!qm4.u0(obj)) {
                a2.b = obj;
            }
            ExoPlayer exoPlayer = qi3Var instanceof ExoPlayer ? (ExoPlayer) qi3Var : null;
            if (exoPlayer != null) {
                tm2 a3 = a.a();
                a2.H = bundle2;
                a3.k = new do2(a2);
                ((fq) exoPlayer).z0(o0, a3.a());
                mediaService.w(exoPlayer);
            }
        }
    }

    @Override // defpackage.oi3
    public final void k(pi3 pi3Var, pi3 pi3Var2, int i) {
        do2 do2Var;
        Bundle bundle;
        do2 do2Var2;
        Bundle bundle2;
        gn2 gn2Var;
        do2 do2Var3;
        Bundle bundle3;
        do2 do2Var4;
        Bundle bundle4;
        gn2 gn2Var2;
        pi3Var.getClass();
        pi3Var2.getClass();
        int i2 = pi3Var.b;
        int i3 = pi3Var2.b;
        StringBuilder t = b11.t("onPositionDiscontinuity reason=", " old=", i, i2, " new=");
        t.append(i3);
        Log.d("BaseMediaService", t.toString());
        if (pi3Var.b != pi3Var2.b && i != 0 && (gn2Var2 = pi3Var.c) != null) {
            bo2.n(gn2Var2, pi3Var.f);
        }
        int i4 = 0;
        if (i != 0 && pi3Var.b == pi3Var2.b) {
            jz3.e.l = false;
            jz3.i(this.o);
        }
        String str = null;
        if (i == 0) {
            gn2 gn2Var3 = pi3Var.c;
            if (h12.c((gn2Var3 == null || (do2Var4 = gn2Var3.d) == null || (bundle4 = do2Var4.I) == null) ? null : bundle4.getString("type"), "music")) {
                bo2.m(pi3Var.c, true);
                bo2.l(pi3Var.c);
            }
            bo2.d(pi3Var.c);
            gn2 gn2Var4 = pi3Var2.c;
            if (gn2Var4 != null && (do2Var3 = gn2Var4.d) != null && (bundle3 = do2Var3.I) != null) {
                str = bundle3.getString("type");
            }
            if (!h12.c(str, "music") || (gn2Var = pi3Var2.c) == null) {
                return;
            }
            vs3.b.execute(new ur2(14, new vs3(), gn2Var.a));
            return;
        }
        if (i != 1 || pi3Var.b == pi3Var2.b) {
            return;
        }
        gn2 gn2Var5 = pi3Var.c;
        if (gn2Var5 != null && (do2Var2 = gn2Var5.d) != null && (bundle2 = do2Var2.I) != null) {
            str = bundle2.getString("type");
        }
        if (h12.c(str, "music")) {
            gn2 gn2Var6 = pi3Var.c;
            if (gn2Var6 != null && (do2Var = gn2Var6.d) != null && (bundle = do2Var.I) != null) {
                i4 = bundle.getInt("duration");
            }
            long j = i4 * 1000;
            long j2 = pi3Var.f;
            WeakReference weakReference = bo2.a;
            if (j > 30000 && j2 >= Math.min(j / 2, 240000L)) {
                bo2.m(pi3Var.c, true);
                bo2.l(pi3Var.c);
            }
        }
    }

    @Override // defpackage.oi3
    public final void q(boolean z) {
        if (z) {
            return;
        }
        rs3.a.c(this.n, this.o);
    }

    @Override // defpackage.oi3
    public final void t(int i, gn2 gn2Var) {
        Log.d("BaseMediaService", "onMediaItemTransition" + this.o.o0());
        if (gn2Var == null) {
            return;
        }
        qi3 qi3Var = this.o;
        iz3 iz3Var = jz3.e;
        iz3Var.l = false;
        if (gn2Var.a == null) {
            Log.d("ReplayGainUtil", "applyGain: null mediaItem or mediaId, skipping");
        } else {
            ReplayGainInfo d = jz3.d(gn2Var);
            if (d != null) {
                ArrayList o = jz3.o(d);
                jz3.b.put(gn2Var.a, o);
                jz3.c.add(gn2Var.a);
                float k = jz3.k(qi3Var, o);
                float l = jz3.l(qi3Var, o);
                float c = jz3.c(k, l);
                Log.d("ReplayGainUtil", "applyGain: server RG for " + gn2Var.a + " gain=" + k + " peak=" + l + " totalGain=" + c);
                iz3Var.n(c);
                jz3.h(qi3Var);
            } else {
                List list = (List) jz3.b.get(gn2Var.a);
                if (list != null) {
                    float k2 = jz3.k(qi3Var, list);
                    if (k2 != 0.0f) {
                        float l2 = jz3.l(qi3Var, list);
                        float c2 = jz3.c(k2, l2);
                        Log.d("ReplayGainUtil", "applyGain: tag cache hit for " + gn2Var.a + " gain=" + k2 + " peak=" + l2 + " totalGain=" + c2);
                        iz3Var.n(c2);
                    } else {
                        float c3 = jz3.c(0.0f, 0.0f);
                        Log.d("ReplayGainUtil", "applyGain: cache hit but gain=0 for " + gn2Var.a + ", applying preamp-only totalGain=" + c3);
                        iz3Var.n(c3);
                    }
                } else {
                    Log.d("ReplayGainUtil", "applyGain: cache miss for " + gn2Var.a + ", holding current gain until onTracksChanged");
                }
                jz3.h(qi3Var);
            }
        }
        Bundle bundle = gn2Var.d.I;
        int i2 = bundle != null ? bundle.getInt("aa_start_index", -1) : -1;
        if (i2 >= 0) {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.remove("aa_start_index");
            co2 a = gn2Var.d.a();
            a.H = bundle2;
            do2 do2Var = new do2(a);
            int o0 = this.o.o0();
            Object obj = this.o;
            if ((obj instanceof ExoPlayer) && o0 != -1) {
                tm2 a2 = gn2Var.a();
                a2.k = do2Var;
                ((fq) ((ExoPlayer) obj)).z0(o0, a2.a());
            }
            if (i2 >= 0 && i2 < this.o.Q0() && i2 != o0) {
                this.o.n(i2, 0L);
            }
        }
        if (i == 1 || i == 2) {
            WeakReference weakReference = bo2.a;
            vs3.b.execute(new ur2(14, new vs3(), gn2Var.a));
        }
        if (i == 1 && yf4.c().g) {
            yf4.c().f();
            yf4.c().a(true);
            this.o.R(1.0f);
            this.o.c();
        }
        Bundle bundle3 = gn2Var.d.I;
        String string = bundle3 != null ? bundle3.getString("type") : null;
        if (h12.c(string, WaveOrigin.RADIO) && this.o.h0()) {
            this.n.t();
            MediaService.m(this.n);
        } else if (!h12.c(string, WaveOrigin.RADIO)) {
            this.n.t();
        }
        this.n.w(this.o);
        rs3.a.c(this.n, this.o);
    }

    @Override // defpackage.oi3
    public final void v(int i) {
        Log.d("BaseMediaService", "onPlaybackStateChanged");
        qi3 qi3Var = this.o;
        if (!qi3Var.f0() && i == 4) {
            Bundle bundle = qi3Var.K0().I;
            if (h12.c(bundle != null ? bundle.getString("type") : null, "music")) {
                bo2.m(qi3Var.a(), true);
                bo2.l(qi3Var.a());
                bo2.d(qi3Var.a());
            }
        }
        this.n.w(qi3Var);
    }

    @Override // defpackage.oi3
    public final void x(boolean z) {
        ud3.x0(z);
    }
}
