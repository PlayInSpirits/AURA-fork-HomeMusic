package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubDownloadItem;
import com.eddyizm.tempus.homemusic.HubNotifier$State;
import com.eddyizm.tempus.homemusic.HubNotifier$load$1;
import com.eddyizm.tempus.homemusic.MixOfflineWorker;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.provider.AlbumArtContentProvider;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gi1 {
    public static final float[][] a = null;
    public static final float[][] b = null;
    public static final float[] c = null;
    public static final float[][] d = null;
    public static final Object e = null;
    public static final Object f = null;
    public static Method g = null;
    public static boolean h = false;
    public static final zj5 i = null;
    public static final zj5 j = null;
    public static Boolean k = null;
    public static Boolean l = null;
    public static Boolean m = null;
    public static Boolean n = null;
    public static Boolean o = null;
    public static Boolean p = null;
    public static Boolean q = null;
    public static volatile HashMap r = null;
    public static volatile long s = -1;

    static {
        a = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        b = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        c = new float[]{95.047f, 100.0f, 108.883f};
        d = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
        e = new Object();
        f = new Object();
        i = new zj5("id");
        j = new zj5("type");
    }

    public static boolean A(Context r3) {
        Resources r4 = r3.getResources();
        boolean r0 = false;
        if (r4 != null) goto L6;
        return false;
    L6:
        if (l != null) goto L15;
        if ((r4.getConfiguration().screenLayout & 15) <= 3) goto L11;
    L12:
        r0 = true;
    L13:
        l = Boolean.valueOf(r0);
        goto L15
    L11:
        if (z(r4) == false) goto L13;
    L15:
        return l.booleanValue();
    }

    public static boolean B(Context r1) {
        PackageManager r2 = r1.getPackageManager();
        if (q != null) goto L15;
        if (r2.hasSystemFeature("com.google.android.tv") == false) goto L7;
    L12:
        boolean r3 = true;
    L13:
        q = Boolean.valueOf(r3);
        goto L15
    L7:
        if (r2.hasSystemFeature("android.hardware.type.television") == true) goto L12;
        if (r2.hasSystemFeature("android.software.leanback") == true) goto L12;
        r3 = false;
    L15:
        return q.booleanValue();
    }

    public static final boolean C(float r2, float r3, float r4, float r5, long r6) {
        float r7 = r2 - r4;
        float r8 = r3 - r5;
        float r9 = Float.intBitsToFloat((int) (r6 >> 32));
        float r10 = Float.intBitsToFloat((int) (r6 & 4294967295L));
        float r11 = (r8 * r8) / (r10 * r10);
        if ((r11 + ((r7 * r7) / (r9 * r9))) > 1.0f) goto L6;
        return true;
    L6:
        return false;
    }

    public static float D(int r6) {
        float r7 = r6 / 255.0f;
        if (r7 > 0.04045f) goto L7;
        float r8 = r7 / 12.92f;
    L6:
        return r8 * 100.0f;
    L7:
        r8 = (float) Math.pow((r7 + 0.055f) / 1.055f, 2.4000000953674316d);
        goto L6
    }

    public static ow2 E() {
        String r0 = b11.m("homemusic_mix_offline_state", null);
        if (r0 == null) goto L13;
        List r1 = qm4.C0(r0, new String[]{"\n"}, 6);
        String r2 = (String) q40.y0(r1, 0);
        if (r2 == null) goto L11;
        Long r3 = xm4.m0(r2);
        if (r3 == null) goto L11;
        return new ow2(r3.longValue(), kb4.r(r1, 1), kb4.r(r1, 2));
    L11:
        return new ow2();
    L13:
        return new ow2();
    }

    public static HubNotifier$State F(Context r2) {
        String r3 = r2.getSharedPreferences("homemusic_notifier", 0).getString("state", null);
        if (r3 == null) goto L5;
        HubNotifier$State r4 = (HubNotifier$State) rr1.c.f(r3, new HubNotifier$load$1().getType());     // Catch: Exception -> L10
        if (r4 != null) goto L14;
        return new HubNotifier$State();
    L14:
        return r4;
    L11:
        return new HubNotifier$State();
    L5:
        return new HubNotifier$State();
    }

    public static gn2 G(Child r22) {
        Bundle r0 = new Bundle();
        boolean r2 = false;
        if (r22.getSamplingRate() == null) goto L5;
        int r1 = r22.getSamplingRate().intValue();
    L6:
        r0.putInt("samplingRate", r1);
        if (r22.getBitDepth() == null) goto L9;
        int r3 = r22.getBitDepth().intValue();
    L10:
        r0.putInt("bitDepth", r3);
        um2 r4 = new um2();
        xm2 r5 = new xm2();
        List r9 = Collections.EMPTY_LIST;
        gy3 r11 = gy3.r;
        zm2 r14 = new zm2();
        cn2 r6 = cn2.d;
        String r16 = r22.getId();
        r16.getClass();
        co2 r7 = new co2();
        r7.a = r22.getTitle();
        if (r22.getTrack() == null) goto L13;
        int r8 = r22.getTrack().intValue();
    L14:
        r7.n = Integer.valueOf(r8);
        if (r22.getDiscNumber() == null) goto L17;
        int r10 = r22.getDiscNumber().intValue();
    L18:
        r7.B = Integer.valueOf(r10);
        if (r22.getYear() == null) goto L21;
        int r12 = r22.getYear().intValue();
    L22:
        r7.v = Integer.valueOf(r12);
        r7.c = r22.getAlbum();
        r7.b = r22.getArtist();
        r7.H = r0;
        r7.q = Boolean.FALSE;
        r7.r = Boolean.TRUE;
        do2 r15 = new do2(r7);
        yc5 r13 = new yc5();
        r13.p = r0;
        if (xa3.u("audio_transcode_download", false) == false) goto L25;
        Uri r17 = e03.k(r22.getId());
    L26:
        r13.n = r17;
        cn2 r18 = new cn2(r13);
        if (xa3.u("audio_transcode_download", false) == false) goto L29;
        Uri r19 = e03.k(r22.getId());
    L31:
        if (((Uri) r5.e) != null) goto L33;
    L34:
        r2 = true;
    L35:
        rr2.w(r2);
        ym2 r20 = null;
        if (r19 != null) goto L38;
        bn2 r110 = null;
    L44:
        return new gn2(r16, new wm2(r4), r110, new an2(r14), r15, r18);
    L38:
        if (((UUID) r5.d) == null) goto L40;
        r20 = new ym2(r5);
    L40:
        r110 = new bn2(r19, "audio", r20, null, r9, null, r11, -9223372036854775807L);
        goto L44
    L33:
        if (((UUID) r5.d) == null) goto L35;
    L29:
        r19 = e03.e(r22.getId());
        goto L31
    L25:
        r17 = e03.e(r22.getId());
        goto L26
    L21:
        r12 = 0;
        goto L22
    L17:
        r10 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L14
    L9:
        r3 = 0;
        goto L10
    L5:
        r1 = 0;
        goto L6
    }

    public static ArrayList H(List r3) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r3.size()) goto L6;
        r0.add(G((Child) r3.get(r1)));
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public static gn2 I(InternetRadioStation r21) {
        Uri r2 = Uri.parse(r21.getStreamUrl());
        ym2 r1 = null;
        if (r21.getId() == null) goto L7;
        File r0 = xt3.e(r21.getId());
        if (r0.exists() == false) goto L7;
        Uri r3 = AlbumArtContentProvider.a("rl_" + r21.getId()).buildUpon().appendQueryParameter("v", String.valueOf(r0.lastModified())).build();
    L8:
        if (r3 == null) goto L10;
    L14:
        String r4 = null;
    L15:
        if (r3 != null) goto L23;
        String r5 = r21.getHomePageUrl();
        if (r5 == null) goto L23;
        if (r5.isEmpty() == true) goto L23;
        if (e03.n(r5) == false) goto L23;
        r4 = xa3.g("ir_", Base64.encodeToString(r5.getBytes(StandardCharsets.UTF_8), 10));
        r3 = AlbumArtContentProvider.a(r4);
    L23:
        Bundle r6 = new Bundle();
        r6.putString("id", r21.getId());
        r6.putString("title", r21.getName());
        r6.putString("stationName", r21.getName());
        r6.putString("uri", r2.toString());
        r6.putString("type", WaveOrigin.RADIO);
        r6.putString("coverArtId", r4);
        String r7 = r21.getHomePageUrl();
        if (r7 == null) goto L26;
        r6.putString("homepageUrl", r7);
    L26:
        um2 r11 = new um2();
        xm2 r8 = new xm2();
        List r9 = Collections.EMPTY_LIST;
        gy3 r10 = gy3.r;
        zm2 r12 = new zm2();
        cn2 r13 = cn2.d;
        String r14 = r21.getId();
        r14.getClass();
        co2 r15 = new co2();
        r15.a = r21.getName();
        r15.m = r3;
        r15.H = r6;
        r15.q = Boolean.FALSE;
        r15.r = Boolean.TRUE;
        do2 r16 = new do2(r15);
        yc5 r17 = new yc5();
        r17.n = r2;
        r17.p = r6;
        cn2 r18 = new cn2(r17);
        if (((Uri) r8.e) != null) goto L29;
    L32:
        boolean r19 = true;
    L33:
        rr2.w(r19);
        if (((UUID) r8.d) == null) goto L37;
        r1 = new ym2(r8);
    L37:
        return new gn2(r14, new wm2(r11), new bn2(r2, null, r1, null, r9, null, r10, -9223372036854775807L), new an2(r12), r16, r18);
    L29:
        if (((UUID) r8.d) != null) goto L32;
        r19 = false;
        goto L33
    L10:
        if (r21.getCoverArt() == null) goto L14;
        if (r21.getCoverArt().isEmpty() == true) goto L14;
        String r20 = r21.getCoverArt();
        r4 = r20;
        r3 = AlbumArtContentProvider.a(r20);
    L7:
        r3 = null;
        goto L8
    }

    public static gn2 J(gn2 r22) {
        cn2 r1 = r22.f;
        Bundle r2 = r1.c;
        ym2 r3 = null;
        if (r2 == null) goto L5;
        String r4 = r2.getString("id");
    L6:
        if (r4 != null) goto L8;
    L11:
        Uri r5 = r1.a;
        if (r5 != null) goto L14;
        Uri r6 = null;
    L29:
        um2 r7 = new um2();
        xm2 r8 = new xm2();
        List r9 = Collections.EMPTY_LIST;
        gy3 r11 = gy3.r;
        zm2 r14 = new zm2();
        cn2 r10 = cn2.d;
        String r15 = r22.a;
        r15.getClass();
        do2 r0 = r22.d;
        yc5 r12 = new yc5();
        r12.n = r6;
        r12.p = r1.c;
        cn2 r13 = new cn2(r12);
        if (((Uri) r8.e) != null) goto L32;
    L35:
        boolean r16 = true;
    L36:
        rr2.w(r16);
        if (r6 != null) goto L39;
        bn2 r18 = null;
    L44:
        wm2 r17 = new wm2(r7);
        an2 r19 = new an2(r14);
        if (r0 != null) goto L49;
        r0 = do2.K;
    L49:
        return new gn2(r15, r17, r18, r19, r0, r13);
    L39:
        if (((UUID) r8.d) == null) goto L41;
        r3 = new ym2(r8);
    L41:
        r18 = new bn2(r6, "audio", r3, null, r9, null, r11, -9223372036854775807L);
        goto L44
    L32:
        if (((UUID) r8.d) != null) goto L35;
        r16 = false;
        goto L36
    L14:
        Pattern r20 = e03.a;
        String r21 = r5.getScheme();
        if (r21 != null) goto L17;
    L21:
        String r23 = e03.b.matcher(e03.a.matcher(r5.toString()).replaceAll("")).replaceAll("");
        int r24 = e03.d();
        String r25 = e03.q(r24);
        if (ud3.U() == true) goto L25;
        StringBuilder r26 = b11.s(r23, "&maxBitRate=");
        r26.append(e03.b(r24, r25));
        r23 = r26.toString();
    L25:
        if (ud3.U() == true) goto L27;
        r23 = b11.o(r23, "&format=", r25);
    L27:
        r5 = Uri.parse(r23);
    L28:
        r6 = r5;
        goto L29
    L17:
        if (r21.equals("content") == true) goto L28;
        if (r21.equals("file") == false) goto L21;
    L8:
        if (((Download) ((HashMap) q()).get(r4)) == null) goto L11;
        return K(N(r22));
    L5:
        r4 = null;
        goto L6
    }

    public static gn2 K(Child r21) {
        Child r5 = (Download) ((HashMap) q()).get(r21.getId());     // Catch: Exception -> L10
        if (r5 != null) goto L7;
        r5 = r21;
    L7:
        Uri r7 = t(r21);     // Catch: Exception -> L10
        String r6 = r5.getCoverArtId();     // Catch: Exception -> L10
        if (r6 == null) goto L12;
        Uri r8 = AlbumArtContentProvider.a(r6);     // Catch: Exception -> L10
    L13:
        Bundle r9 = new Bundle();     // Catch: Exception -> L10
        r9.putString("id", r5.getId());     // Catch: Exception -> L10
        r9.putString("parentId", r5.getParentId());     // Catch: Exception -> L10
        r9.putBoolean("isDir", r5.isDir());     // Catch: Exception -> L10
        r9.putString("title", r21.getTitle());     // Catch: Exception -> L10
        r9.putString("album", r21.getAlbum());     // Catch: Exception -> L10
        r9.putString("artist", r21.getArtist());     // Catch: Exception -> L10
        boolean r12 = false;
        if (r21.getTrack() == null) goto L16;
        int r11 = r21.getTrack().intValue();     // Catch: Exception -> L10
    L17:
        r9.putInt("track", r11);     // Catch: Exception -> L10
        if (r21.getYear() == null) goto L20;
        int r10 = r21.getYear().intValue();     // Catch: Exception -> L10
    L21:
        r9.putInt("year", r10);     // Catch: Exception -> L10
        r9.putString("genre", r21.getGenre());     // Catch: Exception -> L10
        r9.putString("coverArtId", r6);     // Catch: Exception -> L10
        if (r5.getSize() == null) goto L24;
        long r13 = r5.getSize().longValue();     // Catch: Exception -> L10
    L25:
        r9.putLong("size", r13);     // Catch: Exception -> L10
        r9.putString("contentType", r5.getContentType());     // Catch: Exception -> L10
        r9.putString("suffix", r5.getSuffix());     // Catch: Exception -> L10
        r9.putString("transcodedContentType", r5.getTranscodedContentType());     // Catch: Exception -> L10
        r9.putString("transcodedSuffix", r5.getTranscodedSuffix());     // Catch: Exception -> L10
        if (r5.getDuration() == null) goto L28;
        int r14 = r5.getDuration().intValue();     // Catch: Exception -> L10
    L29:
        r9.putInt("duration", r14);     // Catch: Exception -> L10
        if (r5.getBitrate() == null) goto L32;
        int r15 = r5.getBitrate().intValue();     // Catch: Exception -> L10
    L33:
        r9.putInt("bitrate", r15);     // Catch: Exception -> L10
        if (r5.getSamplingRate() == null) goto L36;
        int r16 = r5.getSamplingRate().intValue();     // Catch: Exception -> L10
    L37:
        r9.putInt("samplingRate", r16);     // Catch: Exception -> L10
        if (r5.getBitDepth() == null) goto L40;
        int r17 = r5.getBitDepth().intValue();     // Catch: Exception -> L10
    L41:
        r9.putInt("bitDepth", r17);     // Catch: Exception -> L10
        r9.putString("path", r5.getPath());     // Catch: Exception -> L10
        r9.putBoolean("isVideo", r5.isVideo());     // Catch: Exception -> L10
        if (r21.getUserRating() == null) goto L44;
        int r18 = r21.getUserRating().intValue();     // Catch: Exception -> L10
    L45:
        r9.putInt("userRating", r18);     // Catch: Exception -> L10
        if (r21.getAverageRating() == null) goto L48;
        double r19 = r21.getAverageRating().doubleValue();     // Catch: Exception -> L10
    L49:
        r9.putDouble("averageRating", r19);     // Catch: Exception -> L10
        if (r21.getPlayCount() == null) goto L52;
        long r110 = r21.getPlayCount().longValue();     // Catch: Exception -> L10
    L53:
        r9.putLong("playCount", r110);     // Catch: Exception -> L10
        if (r21.getDiscNumber() == null) goto L56;
        int r20 = r21.getDiscNumber().intValue();     // Catch: Exception -> L10
    L57:
        r9.putInt("discNumber", r20);     // Catch: Exception -> L10
        if (r21.getCreated() == null) goto L60;
        long r111 = r21.getCreated().getTime();     // Catch: Exception -> L10
    L61:
        r9.putLong("created", r111);     // Catch: Exception -> L10
        if (r21.getStarred() == null) goto L64;
        long r112 = r21.getStarred().getTime();     // Catch: Exception -> L10
    L65:
        r9.putLong("starred", r112);     // Catch: Exception -> L10
        r9.putString("albumId", r21.getAlbumId());     // Catch: Exception -> L10
        r9.putString("albumArtist", r21.getAlbumArtist());     // Catch: Exception -> L10
        r9.putString("artistId", r21.getArtistId());     // Catch: Exception -> L10
        r9.putString("type", "music");     // Catch: Exception -> L10
        if (r21.getBookmarkPosition() == null) goto L68;
        long r113 = r21.getBookmarkPosition().longValue();     // Catch: Exception -> L10
    L69:
        r9.putLong("bookmarkPosition", r113);     // Catch: Exception -> L10
        if (r21.getOriginalWidth() == null) goto L72;
        int r22 = r21.getOriginalWidth().intValue();     // Catch: Exception -> L10
    L73:
        r9.putInt("originalWidth", r22);     // Catch: Exception -> L10
        if (r21.getOriginalHeight() == null) goto L76;
        int r23 = r21.getOriginalHeight().intValue();     // Catch: Exception -> L10
    L77:
        r9.putInt("originalHeight", r23);     // Catch: Exception -> L10
        r9.putString("uri", r7.toString());     // Catch: Exception -> L10
        si0.Z(r9, r21.getReplayGain());     // Catch: Exception -> L10
        if (r21.getId() == null) goto L80;
        String r24 = l93.i("song", r21.getId());     // Catch: Exception -> L10
    L81:
        r9.putString("assetLinkSong", r24);     // Catch: Exception -> L10
        if (r21.getAlbumId() == null) goto L84;
        String r3 = l93.i("album", r21.getAlbumId());     // Catch: Exception -> L10
    L85:
        r9.putString("assetLinkAlbum", r3);     // Catch: Exception -> L10
        if (r21.getArtistId() == null) goto L88;
        String r2 = l93.i("artist", r21.getArtistId());     // Catch: Exception -> L10
    L89:
        r9.putString("assetLinkArtist", r2);     // Catch: Exception -> L10
        r9.putString("assetLinkGenre", l93.i("genre", r21.getGenre()));     // Catch: Exception -> L10
        Integer r0 = r21.getYear();     // Catch: Exception -> L10
        if (r0 != null) goto L92;
    L94:
        String r1 = null;
    L95:
        r9.putString("assetLinkYear", r1);     // Catch: Exception -> L10
        um2 r4 = new um2();     // Catch: Exception -> L10
        xm2 r25 = new xm2();     // Catch: Exception -> L10
        List r114 = Collections.EMPTY_LIST;     // Catch: Exception -> L10
        gy3 r115 = gy3.r;     // Catch: Exception -> L10
        zm2 r26 = new zm2();     // Catch: Exception -> L10
        cn2 r27 = cn2.d;     // Catch: Exception -> L10
        String r116 = r21.getId();     // Catch: Exception -> L10
        r116.getClass();     // Catch: Exception -> L10
        co2 r28 = new co2();     // Catch: Exception -> L10
        r28.a = r21.getTitle();     // Catch: Exception -> L10
        if (r21.getTrack() == null) goto L98;
        int r117 = r21.getTrack().intValue();     // Catch: Exception -> L10
    L99:
        r28.n = Integer.valueOf(r117);     // Catch: Exception -> L10
        if (r21.getDiscNumber() == null) goto L102;
        int r118 = r21.getDiscNumber().intValue();     // Catch: Exception -> L10
    L103:
        r28.B = Integer.valueOf(r118);     // Catch: Exception -> L10
        if (r21.getYear() == null) goto L106;
        int r119 = r21.getYear().intValue();     // Catch: Exception -> L10
    L107:
        r28.v = Integer.valueOf(r119);     // Catch: Exception -> L10
        r28.c = r21.getAlbum();     // Catch: Exception -> L10
        r28.b = r21.getArtist();     // Catch: Exception -> L10
        r28.m = r8;     // Catch: Exception -> L10
        String r120 = r21.getId();     // Catch: Exception -> L10
        if (r21.getStarred() != null) goto L110;
    L112:
        boolean r29 = false;
    L113:
        r28.i = new vl1(n61.f(1, r120, r29));     // Catch: Exception -> L10
        r28.I = yw1.k(yw1.p("android.media3.session.demo.HEART_ON", "android.media3.session.demo.HEART_OFF"));     // Catch: Exception -> L10
        r28.H = r9;     // Catch: Exception -> L10
        r28.q = Boolean.FALSE;     // Catch: Exception -> L10
        r28.r = Boolean.TRUE;     // Catch: Exception -> L10
        do2 r30 = new do2(r28);     // Catch: Exception -> L10
        yc5 r31 = new yc5();     // Catch: Exception -> L10
        r31.n = r7;     // Catch: Exception -> L10
        r31.p = r9;     // Catch: Exception -> L10
        cn2 r32 = new cn2(r31);     // Catch: Exception -> L10
        if (((Uri) r25.e) != null) goto L116;
    L117:
        r12 = true;
    L118:
        rr2.w(r12);     // Catch: Exception -> L10
        if (((UUID) r25.d) == null) goto L121;
        ym2 r33 = new ym2(r25);     // Catch: Exception -> L10
    L122:
        return new gn2(r116, new wm2(r4), new bn2(r7, "audio", r33, null, r114, null, r115, -9223372036854775807L), new an2(r26), r30, r32);
    L121:
        r33 = null;
        goto L122
    L116:
        if (((UUID) r25.d) == null) goto L118;
    L110:
        if (r21.getStarred().getTime() <= 0) goto L112;
        r29 = true;
        goto L113
    L106:
        r119 = 0;
        goto L107
    L102:
        r118 = 0;
        goto L103
    L98:
        r117 = 0;
        goto L99
    L92:
        if (r0.intValue() == 0) goto L94;
        r1 = l93.i("year", String.valueOf(r0));     // Catch: Exception -> L10
        goto L95
    L88:
        r2 = null;
        goto L89
    L84:
        r3 = null;
        goto L85
    L80:
        r24 = null;
        goto L81
    L76:
        r23 = 0;
        goto L77
    L72:
        r22 = 0;
        goto L73
    L68:
        r113 = 0;
        goto L69
    L64:
        r112 = 0;
        goto L65
    L60:
        r111 = 0;
        goto L61
    L56:
        r20 = 0;
        goto L57
    L52:
        r110 = 0;
        goto L53
    L48:
        r19 = 0.0d;
        goto L49
    L44:
        r18 = 0;
        goto L45
    L40:
        r17 = 0;
        goto L41
    L36:
        r16 = 0;
        goto L37
    L32:
        r15 = 0;
        goto L33
    L28:
        r14 = 0;
        goto L29
    L24:
        r13 = 0;
        goto L25
    L20:
        r10 = 0;
        goto L21
    L16:
        r11 = 0;
        goto L17
    L12:
        r8 = null;
    L10:
        e = move-exception;
        if (r21 == null) goto L126;
        String r34 = r21.getId();
    L127:
        if (r21 == null) goto L129;
        String r35 = r21.getTitle();
    L130:
        Log.e("MappingUtil", f34.h("Instant Mix CRASH! Failed to map song to MediaItem. Problematic Song ID: ", r34, ", Title: ", r35, ". Inspect this song's Subsonic data for missing fields."), e);
        nz2.s(xa3.g("Mapping failed for song ID: ", r34), e);
        return null;
    L129:
        r35 = "N/A";
        goto L130
    L126:
        r34 = "NULL_MEDIA_OBJECT";
        goto L127
    }

    public static gn2 L(PodcastEpisode r23) {
        boolean r1 = true;
        r1 = true;
        ym2 r2 = null;
        if (ud3.o() == null) goto L8;
        ConcurrentHashMap r0 = g51.a;
        Uri r3 = g51.d(r23.getArtist(), r23.getTitle(), r23.getAlbum());
        if (r3 == null) goto L7;
    L6:
        Uri r5 = r3;
        Uri r4 = AlbumArtContentProvider.a(r23.getCoverArtId());
        Bundle r6 = new Bundle();
        r6.putString("id", r23.getId());
        r6.putString("parentId", r23.getParentId());
        r6.putBoolean("isDir", r23.isDir());
        r6.putString("title", r23.getTitle());
        r6.putString("album", r23.getAlbum());
        r6.putString("artist", r23.getArtist());
        if (r23.getYear() == null) goto L24;
        int r7 = r23.getYear().intValue();
    L25:
        r6.putInt("year", r7);
        r6.putString("coverArtId", r23.getCoverArtId());
        long r8 = 0;
        if (r23.getSize() == null) goto L28;
        long r9 = r23.getSize().longValue();
    L29:
        r6.putLong("size", r9);
        r6.putString("contentType", r23.getContentType());
        r6.putString("suffix", r23.getSuffix());
        if (r23.getDuration() == null) goto L32;
        int r10 = r23.getDuration().intValue();
    L33:
        r6.putInt("duration", r10);
        if (r23.getBitrate() == null) goto L36;
        int r11 = r23.getBitrate().intValue();
    L37:
        r6.putInt("bitrate", r11);
        r6.putBoolean("isVideo", r23.isVideo());
        if (r23.getCreated() == null) goto L40;
        r8 = r23.getCreated().getTime();
    L40:
        r6.putLong("created", r8);
        r6.putString("artistId", r23.getArtistId());
        r6.putString("description", r23.getDescription());
        r6.putString("type", "podcast");
        r6.putString("uri", r5.toString());
        um2 r14 = new um2();
        xm2 r12 = new xm2();
        List r13 = Collections.EMPTY_LIST;
        gy3 r15 = gy3.r;
        zm2 r16 = new zm2();
        cn2 r17 = cn2.d;
        String r18 = r23.getId();
        r18.getClass();
        co2 r19 = new co2();
        r19.a = r23.getTitle();
        if (r23.getYear() == null) goto L43;
        int r20 = r23.getYear().intValue();
    L44:
        r19.v = Integer.valueOf(r20);
        r19.c = r23.getAlbum();
        r19.b = r23.getArtist();
        r19.m = r4;
        r19.H = r6;
        r19.q = Boolean.FALSE;
        r19.r = Boolean.TRUE;
        do2 r21 = new do2(r19);
        yc5 r22 = new yc5();
        r22.n = r5;
        r22.p = r6;
        cn2 r24 = new cn2(r22);
        if (((Uri) r12.e) != null) goto L47;
    L50:
        rr2.w(r1);
        if (((UUID) r12.d) == null) goto L54;
        r2 = new ym2(r12);
    L54:
        return new gn2(r18, new wm2(r14), new bn2(r5, "audio", r2, null, r13, null, r15, -9223372036854775807L), new an2(r16), r21, r24);
    L47:
        if (((UUID) r12.d) != null) goto L50;
        r1 = false;
        goto L50
    L43:
        r20 = 0;
        goto L44
    L36:
        r11 = 0;
        goto L37
    L32:
        r10 = 0;
        goto L33
    L28:
        r9 = 0;
        goto L29
    L24:
        r7 = 0;
        goto L25
    L7:
        r3 = e03.j(0, r23.getStreamId());
        goto L6
    L8:
        eu0 r25 = au0.w(App.a());
        String r26 = r23.getStreamId();
        r25.getClass();
        if (eu0.d(r26) == false) goto L20;
        String r27 = r23.getStreamId();
        pb0 r28 = new pb0(AppDatabase.y().w(), r27, r1 ? 1 : 0);
        Thread r29 = new Thread(r28);
        r29.start();
        r29.join();     // Catch: InterruptedException -> L13
        Download r30 = (Download) r28.q;     // Catch: InterruptedException -> L13
    L15:
        if (r30 != null) goto L17;
    L19:
        r3 = e03.e(r27);
        goto L6
    L17:
        if (r30.getDownloadUri().isEmpty() == true) goto L19;
        r3 = Uri.parse(r30.getDownloadUri());
    L13:
        e = move-exception;
        e.printStackTrace();
        r30 = null;
        goto L15
    L20:
        r3 = e03.j(0, r23.getStreamId());
        goto L6
    }

    public static ArrayList M(List r6) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r6.size()) goto L15;
        Child r2 = (Child) r6.get(r1);
        r0.add(K(r2));     // Catch: Exception -> L8
    L14:
        r1 = r1 + 1;
    L8:
        e = move-exception;
        StringBuilder r4 = new StringBuilder("Skipping un-mappable song in queue restore: ");
        if (r2 == null) goto L12;
        String r3 = r2.getId();
    L13:
        r4.append(r3);
        Log.e("MappingUtil", r4.toString(), e);
        goto L14
    L12:
        r3 = "null";
        goto L13
    L15:
        return r0;
    }

    public static Child N(gn2 r7) {
        if (r7 == null) goto L95;
        do2 r0 = r7.d;
        Bundle r1 = r0.I;
        if (r1 != null) goto L7;
    L9:
        String r8 = r7.a;
    L10:
        if (r8 != null) goto L13;
        return null;
    L13:
        Child r2 = new Child(r8);
        if (r1 == null) goto L65;
        r2.setParentId(r1.getString("parentId"));
        r2.setDir(r1.getBoolean("isDir"));
        r2.setTitle(r1.getString("title"));
        r2.setAlbum(r1.getString("album"));
        r2.setArtist(r1.getString("artist"));
        r2.setGenre(r1.getString("genre"));
        r2.setCoverArtId(r1.getString("coverArtId"));
        r2.setContentType(r1.getString("contentType"));
        r2.setSuffix(r1.getString("suffix"));
        r2.setTranscodedContentType(r1.getString("transcodedContentType"));
        r2.setTranscodedSuffix(r1.getString("transcodedSuffix"));
        r2.setPath(r1.getString("path"));
        r2.setVideo(r1.getBoolean("isVideo"));
        r2.setAlbumId(r1.getString("albumId"));
        r2.setAlbumArtist(r1.getString("albumArtist"));
        r2.setArtistId(r1.getString("artistId"));
        r2.setType(r1.getString("type"));
        if (r1.containsKey("track") == false) goto L19;
        r2.setTrack(Integer.valueOf(r1.getInt("track")));
    L19:
        if (r1.containsKey("year") == false) goto L22;
        r2.setYear(Integer.valueOf(r1.getInt("year")));
    L22:
        if (r1.containsKey("size") == false) goto L25;
        r2.setSize(Long.valueOf(r1.getLong("size")));
    L25:
        if (r1.containsKey("duration") == false) goto L28;
        r2.setDuration(Integer.valueOf(r1.getInt("duration")));
    L28:
        if (r1.containsKey("bitrate") == false) goto L31;
        r2.setBitrate(Integer.valueOf(r1.getInt("bitrate")));
    L31:
        if (r1.containsKey("samplingRate") == false) goto L34;
        r2.setSamplingRate(Integer.valueOf(r1.getInt("samplingRate")));
    L34:
        if (r1.containsKey("bitDepth") == false) goto L37;
        r2.setBitDepth(Integer.valueOf(r1.getInt("bitDepth")));
    L37:
        if (r1.containsKey("userRating") == false) goto L40;
        r2.setUserRating(Integer.valueOf(r1.getInt("userRating")));
    L40:
        if (r1.containsKey("averageRating") == false) goto L43;
        r2.setAverageRating(Double.valueOf(r1.getDouble("averageRating")));
    L43:
        if (r1.containsKey("playCount") == false) goto L46;
        r2.setPlayCount(Long.valueOf(r1.getLong("playCount")));
    L46:
        if (r1.containsKey("discNumber") == false) goto L49;
        r2.setDiscNumber(Integer.valueOf(r1.getInt("discNumber")));
    L49:
        if (r1.containsKey("bookmarkPosition") == false) goto L52;
        r2.setBookmarkPosition(Long.valueOf(r1.getLong("bookmarkPosition")));
    L52:
        if (r1.containsKey("originalWidth") == false) goto L55;
        r2.setOriginalWidth(Integer.valueOf(r1.getInt("originalWidth")));
    L55:
        if (r1.containsKey("originalHeight") == false) goto L57;
        r2.setOriginalHeight(Integer.valueOf(r1.getInt("originalHeight")));
    L57:
        long r5 = r1.getLong("created", 0);
        if (r5 == 0) goto L60;
        r2.setCreated(new Date(r5));
    L60:
        long r6 = r1.getLong("starred", 0);
        if (r6 == 0) goto L63;
        r2.setStarred(new Date(r6));
    L63:
        r2.setReplayGain(si0.v(r1));
    L65:
        if (r2.getTitle() != null) goto L70;
        CharSequence r9 = r0.a;
        if (r9 == null) goto L70;
        r2.setTitle(r9.toString());
    L70:
        if (r2.getArtist() != null) goto L75;
        CharSequence r10 = r0.b;
        if (r10 == null) goto L75;
        r2.setArtist(r10.toString());
    L75:
        if (r2.getAlbum() != null) goto L80;
        CharSequence r11 = r0.c;
        if (r11 == null) goto L80;
        r2.setAlbum(r11.toString());
    L80:
        if (r2.getTrack() != null) goto L85;
        Integer r12 = r0.n;
        if (r12 == null) goto L85;
        r2.setTrack(r12);
    L85:
        if (r2.getDiscNumber() != null) goto L90;
        Integer r13 = r0.C;
        if (r13 == null) goto L90;
        r2.setDiscNumber(r13);
    L90:
        if (r2.getYear() != null) goto L94;
        Integer r14 = r0.w;
        if (r14 == null) goto L94;
        r2.setYear(r14);
    L94:
        return r2;
    L7:
        if (r1.getString("id") == null) goto L9;
        r8 = r1.getString("id");
        goto L10
    L95:
        return null;
    }

    public static TypedArray O(Resources r0, Resources.Theme r1, AttributeSet r2, int[] r3) {
        if (r1 != null) goto L6;
        return r0.obtainAttributes(r2, r3);
    L6:
        return r1.obtainStyledAttributes(r2, r3, 0, 0);
    }

    public static k62 P(String r3, String r4) {
        if (r3 == null) goto L16;
        String r5 = qm4.K0(r3).toString();
        if (r5 != null) goto L7;
        return null;
    L7:
        if (r5.length() > 0) goto L9;
    L11:
        r5 = null;
    L12:
        if (r5 != null) goto L15;
        return null;
    L15:
        return new k62(r5, b0(r4));
    L9:
        if (r5.length() > 64) goto L11;
    L16:
        return null;
    }

    public static xk0 Q(HubNotifier$State r7, List r8, List r9) {
        r8.getClass();
        r9.getClass();
        xk0 r0 = new xk0(3);
        boolean r1 = r7.getInitialized();
        Iterator r10 = r8.iterator();
    L4:
        if (r10.hasNext() == false) goto L14;
        HubDownloadItem r2 = (HubDownloadItem) r10.next();
        if (r2.getStar() == true) goto L4;
        if (h12.c(r2.getStatus(), "done") == false) goto L4;
        if (r7.getDoneItems().contains(Long.valueOf(r2.getId())) == true) goto L4;
        r7.getDoneItems().add(Long.valueOf(r2.getId()));
        if (r1 == false) goto L4;
        r0.o = true;
        goto L4
    L14:
        Iterator r11 = r9.iterator();
    L16:
        if (r11.hasNext() == false) goto L29;
        HubAssistantTask r12 = (HubAssistantTask) r11.next();
        String r3 = r12.getStatus();
        if (r3 == null) goto L16;
        String r4 = String.valueOf(r12.getId());
        if (h12.c(r7.getTasks().get(r4), r3) == true) goto L16;
        r7.getTasks().put(r4, r3);
        if (r1 == false) goto L16;
        if (r3.equals("awaiting_confirmation") == true) goto L28;
        if (r3.equals("failed") == false) goto L16;
    L28:
        ((ArrayList) r0.p).add(r12);
        goto L16
    L29:
        r7.setInitialized(true);
        return r0;
    }

    public static void R(AnimatorSet r10, ArrayList r11) {
        int r0 = r11.size();
        long r1 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r0) goto L5;
        Animator r5 = (Animator) r11.get(r4);
        r1 = Math.max(r1, r5.getDuration() + r5.getStartDelay());
        r4 = r4 + 1;
        goto L3
    L5:
        ValueAnimator r2 = ValueAnimator.ofInt(new int[]{0, 0});
        r2.setDuration(r1);
        r11.add(0, r2);
        r10.playTogether(r11);
    }

    public static final long S(on3 r4, boolean r5) {
        long r0 = r4.g;
        long r1 = g83.d(r4.c, r0);
        if (r5 == false) goto L5;
    L8:
        return r1;
    L5:
        if (r4.c() == false) goto L8;
        return 0;
    }

    public static rq4 T(x34 r31, String r32) {
        r31.getClass();
        z34 r2 = r31.U("PRAGMA table_info(`" + r32 + "`)");
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L82
    L82:
        th = move-exception;
        ud3.e(r2, th);
        throw th;
    L4:
        long r5 = 0;
        if (r2.O() == true) goto L10;
        Map r4 = v01.n;     // Catch: Throwable -> L8
        ud3.e(r2, null);
        long r23 = 0;
    L24:
        z34 r3 = r31.U("PRAGMA foreign_key_list(`" + r32 + "`)");
        int r6 = rr2.y(r3, "id");     // Catch: Throwable -> L38
        int r7 = rr2.y(r3, "seq");     // Catch: Throwable -> L38
        int r11 = rr2.y(r3, "table");     // Catch: Throwable -> L38
        int r12 = rr2.y(r3, "on_delete");     // Catch: Throwable -> L38
        int r13 = rr2.y(r3, "on_update");     // Catch: Throwable -> L38
        List r14 = uc5.Q(r3);     // Catch: Throwable -> L38
        r3.reset();     // Catch: Throwable -> L38
        fb4 r15 = new fb4();     // Catch: Throwable -> L38
    L27:
        if (r3.O() == false) goto L44;
        if (r3.getLong(r7) != r23) goto L27;
        int r8 = (int) r3.getLong(r6);     // Catch: Throwable -> L38
        ArrayList r9 = new ArrayList();     // Catch: Throwable -> L38
        ArrayList r10 = new ArrayList();     // Catch: Throwable -> L38
        int r19 = r6;
        ArrayList r16 = new ArrayList();     // Catch: Throwable -> L38
        Iterator r20 = r14.iterator();     // Catch: Throwable -> L38
    L33:
        if (r20.hasNext() == false) goto L40;
        int r21 = r7;
        Object r17 = r20.next();     // Catch: Throwable -> L38
        List r22 = r14;
        if (((ob1) r17).n != r8) goto L37;
        r16.add(r17);     // Catch: Throwable -> L38
    L37:
        r7 = r21;
        r14 = r22;
        goto L33
    L40:
        int r24 = r7;
        List r25 = r14;
        int r18 = r16.size();     // Catch: Throwable -> L38
        int r26 = 0;
    L41:
        if (r26 >= r18) goto L43;
        Object r110 = r16.get(r26);     // Catch: Throwable -> L38
        r26 = r26 + 1;     // Catch: Throwable -> L38
        ob1 r111 = (ob1) r110;     // Catch: Throwable -> L38
        r9.add(r111.p);     // Catch: Throwable -> L38
        r10.add(r111.q);     // Catch: Throwable -> L38
        r16 = r16;
        goto L41
    L43:
        r15.add(new pq4(r3.D(r11), r3.D(r12), r3.D(r13), r9, r10));     // Catch: Throwable -> L38
        r6 = r19;
        r7 = r24;
        r14 = r25;
        goto L27
    L44:
        fb4 r27 = kb4.l(r15);     // Catch: Throwable -> L38
        ud3.e(r3, null);
        z34 r28 = r31.U("PRAGMA index_list(`" + r32 + "`)");
        int r29 = rr2.y(r28, "name");     // Catch: Throwable -> L65
        int r30 = rr2.y(r28, "origin");     // Catch: Throwable -> L65
        int r33 = rr2.y(r28, "unique");     // Catch: Throwable -> L65
        if (r29 == (-1)) goto L69;
        if (r30 == (-1)) goto L69;
        if (r33 == (-1)) goto L69;
        fb4 r34 = new fb4();     // Catch: Throwable -> L65
    L53:
        if (r28.O() == false) goto L67;
        if ("c".equals(r28.D(r30)) == false) goto L53;
        String r35 = r28.D(r29);     // Catch: Throwable -> L65
        if (r28.getLong(r33) != 1) goto L60;
        boolean r112 = true;
    L61:
        qq4 r36 = uc5.R(r31, r35, r112);     // Catch: Throwable -> L65
        if (r36 == null) goto L63;
        r34.add(r36);     // Catch: Throwable -> L65
        goto L53
    L63:
        ud3.e(r28, null);
        fb4 r113 = null;
    L71:
        return new rq4(r32, r4, r27, r113);
    L60:
        r112 = false;
        goto L61
    L67:
        fb4 r0 = kb4.l(r34);     // Catch: Throwable -> L65
        ud3.e(r28, null);
        r113 = r0;
    L69:
        ud3.e(r28, null);
        r113 = null;
    L65:
        th = move-exception;
        throw th;     // Catch: Throwable -> L73
    L73:
        th = move-exception;
        ud3.e(r28, th);
        throw th;
    L38:
        th = move-exception;
        throw th;     // Catch: Throwable -> L77
    L77:
        th = move-exception;
        ud3.e(r3, th);
        throw th;
    L10:
        int r37 = rr2.y(r2, "name");     // Catch: Throwable -> L8
        int r114 = rr2.y(r2, "type");     // Catch: Throwable -> L8
        int r115 = rr2.y(r2, "notnull");     // Catch: Throwable -> L8
        int r116 = rr2.y(r2, "pk");     // Catch: Throwable -> L8
        int r117 = rr2.y(r2, "dflt_value");     // Catch: Throwable -> L8
        ag2 r118 = new ag2();     // Catch: Throwable -> L8
    L11:
        String r119 = r2.D(r37);     // Catch: Throwable -> L8
        String r210 = r2.D(r114);     // Catch: Throwable -> L8
        if (r2.getLong(r115) == r5) goto L15;
        boolean r211 = true;
    L14:
        r23 = r5;
        int r38 = (int) r2.getLong(r116);     // Catch: Throwable -> L8
        if (r2.isNull(r117) == false) goto L19;
        String r212 = null;
    L20:
        r118.put(r119, new oq4(r38, 2, r119, r210, r212, r211));     // Catch: Throwable -> L8
        if (r2.O() == false) goto L22;
        r5 = r23;
        goto L11
    L22:
        r4 = r118.b();     // Catch: Throwable -> L8
        ud3.e(r2, null);
        goto L24
    L19:
        r212 = r2.D(r117);     // Catch: Throwable -> L8
        goto L20
    L15:
        r211 = false;
        goto L14
    }

    public static final void U(Context r5) {
        ActivityManager.RunningAppProcessInfo r0 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(r0);
        if (r0.importance > 125) goto L6;
        r5.getSharedPreferences("homemusic_notifier", 0).edit().putBoolean("pending_kept_sync", false).apply();
        io1.b.post(new lf(r5, 5));
        return;
    L6:
        r5.getSharedPreferences("homemusic_notifier", 0).edit().putBoolean("pending_kept_sync", true).apply();
    }

    public static void V(ow2 r9) {
        App.b().getClass();
        App.c().edit().putString("homemusic_mix_offline_state", q40.B0(gb.P(new String[]{String.valueOf(r9.a), q40.B0(r9.b, ",", null, null, null, 62), q40.B0(r9.c, ",", null, null, null, 62)}), "\n", null, null, null, 62)).apply();
    }

    public static final void W(Context r9) {
        sc5 r1 = sc5.b(r9);
        bq4 r10 = r1.d;
        r90 r0 = r1.b;
        String r3 = "homemusic_mix_offline";
        if (xa3.u("homemusic_mix_offline", true) == true) goto L6;
        i80 r2 = r0.m;
        String r5 = "CancelWorkByName_".concat("homemusic_mix_offline");
        ia4 r6 = (ia4) r10.n;
        r6.getClass();
        int r8 = 2;
        h12.D(r2, r5, r6, new gp(r8, r3, r1));
        i80 r4 = r0.m;
        String r7 = "CancelWorkByName_".concat("homemusic_mix_offline_now");
        ia4 r11 = (ia4) r10.n;
        r11.getClass();
        h12.D(r4, r7, r11, new gp(r8, "homemusic_mix_offline_now", r1));
        return;
    L6:
        i93 r12 = new i93(MixOfflineWorker.class, 6, TimeUnit.HOURS);
        ((dd5) r12.b).j = k();
        r1.a("homemusic_mix_offline", (kf3) r12.b());
        i93 r13 = new i93(MixOfflineWorker.class);
        ((dd5) r13.b).j = k();
        new mc5(r1, "homemusic_mix_offline_now", 2, gb.O((j93) r13.b()), 0).a();
    }

    public static ArrayList X(ByteBuffer r7) {
        ByteBuffer r8 = r7.asReadOnlyBuffer();
        ArrayList r0 = new ArrayList();
    L4:
        if (r8.hasRemaining() == false) goto L22;
        byte r1 = r8.get();     // Catch: BufferUnderflowException -> L23
        int r2 = (r1 >> 3) & 15;     // Catch: BufferUnderflowException -> L23
        if (((r1 >> 2) & 1) == 0) goto L9;
        r8.get();     // Catch: BufferUnderflowException -> L23
    L9:
        if (((r1 >> 1) & 1) == 0) goto L17;
        int r3 = 0;
        int r4 = 0;
    L12:
        if (r3 >= 8) goto L19;
        byte r5 = r8.get();     // Catch: BufferUnderflowException -> L23
        r4 = r4 | ((r5 & 127) << (r3 * 7));     // Catch: BufferUnderflowException -> L23
        if ((r5 & 128) == 0) goto L19;
        r3 = r3 + 1;     // Catch: BufferUnderflowException -> L23
    L19:
        if ((r8.position() + r4) > r8.limit()) goto L22;
        ByteBuffer r6 = r8.duplicate();
        r6.limit(r8.position() + r4);
        r0.add(new f83(r2, r6));
        r8.position(r8.position() + r4);
        goto L4
    L17:
        r4 = r8.remaining();     // Catch: BufferUnderflowException -> L23
    L22:
        return r0;
    }

    public static void Y(View r2, float[] r3, float[] r4, int[] r5) {
        Object r0 = r2.getParent();
        if ((r0 instanceof View) == false) goto L5;
        Y((View) r0, r3, r4, r5);
        gb.b(r3, -r2.getScrollX(), -r2.getScrollY(), r4);
        gb.b(r3, r2.getLeft(), r2.getTop(), r4);
    L6:
        Matrix r6 = r2.getMatrix();
        if (r6.isIdentity() == true) goto L10;
        hw.L(r4, r6);
        gb.U(r3, r4);
        return;
    L10:
        return;
    L5:
        r2.getLocationInWindow(r5);
        gb.b(r3, -r2.getScrollX(), -r2.getScrollY(), r4);
        gb.b(r3, r5[0], r5[1], r4);
        goto L6
    }

    public static void Z(HubNotifier$State r5) {
        List<Long> r0 = r5.getDoneItems();
        if (r0.size() <= 500) goto L6;
        r0.subList(0, r0.size() - SmartPlan.MAX_QUEUE).clear();
    L6:
        if (r5.getTasks().size() <= 500) goto L36;
        Set<String> r1 = r5.getTasks().keySet();
        ArrayList r2 = new ArrayList();
        Iterator<T> r3 = r1.iterator();
    L9:
        if (r3.hasNext() == false) goto L13;
        Long r4 = xm4.m0((String) r3.next());
        if (r4 == null) goto L9;
        r2.add(r4);
        goto L9
    L13:
        List r6 = q40.M0(q40.J0(r2), SmartPlan.MAX_QUEUE);
        ArrayList r7 = new ArrayList(r40.k0(r6, 10));
        Iterator r8 = r6.iterator();
    L15:
        if (r8.hasNext() == false) goto L17;
        r7.add(String.valueOf(((Number) r8.next()).longValue()));
        goto L15
    L17:
        Set r9 = q40.T0(r7);
        Map<String, String> r10 = r5.getTasks();
        LinkedHashMap r11 = new LinkedHashMap();
        Iterator<Map.Entry<String, String>> r12 = r10.entrySet().iterator();
    L19:
        if (r12.hasNext() == false) goto L23;
        Map.Entry<String, String> r13 = r12.next();
        if (r9.contains(r13.getKey()) == false) goto L19;
        r11.put(r13.getKey(), r13.getValue());
        goto L19
    L23:
        r5.setTasks(new LinkedHashMap(r11));
        return;
    }

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
    public static final void a(rr3 r11, r70 r12, rg1 r13, int r14) {
        r13.S(-149765515);
        o02 r0 = r13.x;
        mf3 r1 = r13.k();
        r13.P(201, l80.b);
        Object r2 = r13.H();
        if (h12.c(r2, j80.a) == false) goto L5;
        j35 r3 = null;
    L6:
        qr3 r4 = r11.a;
        j35 r5 = r4.d(r11, r3);
        boolean r6 = r5.equals(r3);
        if (r6 == true) goto L9;
        r13.b0(r5);
    L9:
        boolean r7 = true;
        if (r13.S == true) goto L12;
        hg4 r8 = r13.G;
        Object r9 = r8.b(r8.b, r8.g);
        r9.getClass();
        mf3 r10 = (mf3) r9;
        if (r13.w() == false) goto L22;
        if (r6 == false) goto L22;
    L26:
        if (r6 == false) goto L31;
        if (r13.w == true) goto L31;
    L33:
        r1 = r10;
    L36:
        if (r13.y == true) goto L38;
        if (r10 != r1) goto L38;
    L17:
        boolean r15 = false;
    L39:
        if (r15 == true) goto L41;
    L43:
        r0.c(r13.w ? 1 : 0);
        r13.w = r15;
        r13.K = r1;
        r13.O(202, l80.c, 0, r1);
        r12.invoke(r13, Integer.valueOf((r14 >> 3) & 14));
        r13.o(false);
        r13.o(false);
        if (r0.b() != 0) goto L47;
        r7 = false;
    L47:
        r13.w = r7;
        r13.K = null;
        lv3 r16 = r13.p();
        if (r16 == null) goto L51;
        r16.d = new p70(r11, r12, r14, 2);
        return;
    L51:
        return;
    L41:
        if (r13.S == true) goto L43;
        r13.F(r1);
    L38:
        r15 = true;
    L31:
        if (r13.w == false) goto L33;
    L22:
        if (r11.g == false) goto L24;
    L34:
        r1 = r1.b(r4, r5);
        goto L36
    L24:
        if (r1.containsKey(r4) == true) goto L26;
    L12:
        if (r11.g == false) goto L14;
    L15:
        r1 = r1.b(r4, r5);
    L16:
        r13.J = true;
        goto L17
    L14:
        if (r1.containsKey(r4) == true) goto L16;
    L5:
        r2.getClass();
        r3 = (j35) r2;
        goto L6
    }

    public static boolean a0(int r4, int r5, int r6, int r7) {
        if (r6 == 1) goto L9;
        if (r6 == 2) goto L9;
        if (r6 != 4) goto L8;
        if (r4 != 2) goto L9;
    L8:
        boolean r8 = false;
    L10:
        if (r7 == 1) goto L16;
        if (r7 == 2) goto L16;
        if (r7 != 4) goto L15;
        if (r5 != 2) goto L16;
    L15:
        boolean r9 = false;
    L17:
        if (r8 == true) goto L21;
        if (r9 == true) goto L21;
        return false;
    L21:
        return true;
    L16:
        r9 = true;
    L9:
        r8 = true;
        goto L10
    }

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
    public static final void b(rr3[] r8, r70 r9, rg1 r10, int r11) {
        r10.S(415205898);
        o02 r0 = r10.x;
        mf3 r1 = r10.k();
        r10.P(201, l80.b);
        int r3 = 1;
        boolean r4 = false;
        if (r10.S == false) goto L6;
        mf3 r2 = r10.a0(r1, vr1.I(r8, r1, mf3.q));
        r10.J = true;
    L5:
        boolean r5 = false;
    L19:
        if (r5 == true) goto L21;
    L23:
        r0.c(r10.w ? 1 : 0);
        r10.w = r5;
        r10.K = r2;
        r10.O(202, l80.c, 0, r2);
        r9.invoke(r10, Integer.valueOf((r11 >> 3) & 14));
        r10.o(false);
        r10.o(false);
        if (r0.b() == 0) goto L26;
        r4 = true;
    L26:
        r10.w = r4;
        r10.K = null;
        lv3 r12 = r10.p();
        if (r12 == null) goto L30;
        r12.d = new p70(r8, r9, r11, r3);
        return;
    L30:
        return;
    L21:
        if (r10.S == true) goto L23;
        r10.F(r2);
        goto L23
    L6:
        hg4 r6 = r10.G;
        Object r7 = r6.h(r6.g, 0);
        r7.getClass();
        mf3 r13 = (mf3) r7;
        hg4 r14 = r10.G;
        Object r15 = r14.h(r14.g, 1);
        r15.getClass();
        mf3 r16 = (mf3) r15;
        mf3 r17 = vr1.I(r8, r1, r16);
        if (r10.w() == true) goto L9;
    L14:
        r2 = r10.a0(r1, r17);
        if (r10.y == false) goto L17;
    L18:
        r5 = true;
        goto L19
    L17:
        if (h12.c(r2, r13) == true) goto L5;
    L9:
        if (r10.y == true) goto L14;
        if (r16.equals(r17) == false) goto L14;
        r10.l = r10.G.s() + r10.l;
        r2 = r13;
        goto L5
    }

    public static String b0(String r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        if (r2.length() <= 32) goto L6;
        return null;
    L6:
        if (k62.c.a(r2) == false) goto L11;
        return r2;
    L11:
        return null;
    }

    public static final void c(final hd3 r17, final String r18, dx2 r19, hs r20, i80 r21, float r22, rg1 r23, final int r24, final int r25) {
        r23.S(1142754848);
        if (r23.g(r17) == false) goto L5;
        int r1 = 4;
    L6:
        int r2 = r1 | r24;
        if ((r24 & 48) == 0) goto L9;
    L13:
        int r3 = r25 & 8;
        if (r3 == 0) goto L16;
        int r4 = r2 | 3072;
        hs r5 = r20;
    L21:
        int r6 = r25 & 16;
        if (r6 == 0) goto L26;
        r4 = r4 | 24576;
    L24:
        i80 r8 = r21;
    L32:
        int r10 = r25 & 32;
        if (r10 == 0) goto L36;
        int r7 = r4 | 196608;
    L41:
        if ((r25 & 64) == 0) goto L45;
        int r12 = 1572864;
    L43:
        int r9 = r7 | r12;
        if ((599187 & r9) == 599186) goto L51;
        boolean r13 = true;
    L53:
        if (r23.K(r9 & 1, r13) == false) goto L84;
        if (r3 == 0) goto L56;
        hs r11 = fz0.s;
        int r14 = r10;
    L57:
        if (r6 == 0) goto L59;
        i80 r15 = od0.b;
    L60:
        if (r14 == 0) goto L62;
        float r16 = 1.0f;
    L63:
        i80 r26 = j80.a;
        if (r18 == null) goto L75;
        r23.R(1899222916);
        if ((r9 & 112) != 32) goto L68;
        boolean r27 = true;
    L69:
        Object r28 = r23.H();
        if (r27 == true) goto L72;
        if (r28 == r26) goto L72;
    L73:
        AtomicInteger r29 = f94.a;
        dx2 r30 = new zh((if1) r28);
        r23.o(false);
    L74:
        dx2 r31 = r19;
        dx2 r32 = bu.w(au0.G(r31.c(r30), null, 1044479), r17, r11, r15, r16, null);
        Object r33 = r23.H();
        if (r33 != r26) goto L79;
        r33 = w01.d;
        r23.b0(r33);
    L79:
        ui2 r34 = (ui2) r33;
        int r35 = Long.hashCode(r23.T);
        dx2 r36 = j51.E(r23, r32);
        mf3 r37 = r23.k();
        e80.e.getClass();
        r23.U();
        if (r23.S == false) goto L82;
        r23.j();
    L83:
        l93.c0(fz0.I, r23, r34);
        l93.c0(fz0.H, r23, r37);
        l93.a0(r23);
        l93.c0(fz0.G, r23, r36);
        l93.c0(fz0.J, r23, Integer.valueOf(r35));
        r23.o(true);
        final i80 r38 = r15;
        final float r39 = r16;
    L85:
        lv3 r40 = r23.p();
        if (r40 == null) goto L89;
        final dx2 r41 = r31;
        final hs r42 = r11;
        r40.d = new yv1(r17, r18, r41, r42, r38, r39, r24, r25);
        return;
    L89:
        return;
    L82:
        r23.e0();
    L72:
        r28 = new rs0(6, r18);
        r23.b0(r28);
        goto L73
    L68:
        r27 = false;
        goto L69
    L75:
        r23.R(1899381698);
        r23.o(false);
        r30 = ax2.a;
        goto L74
    L62:
        r16 = r22;
        goto L63
    L59:
        r15 = r8;
        goto L60
    L56:
        r14 = r10;
        r11 = r5;
        goto L57
    L84:
        r31 = r19;
        r23.N();
        r39 = r22;
        r11 = r5;
        r38 = r8;
        goto L85
    L51:
        r13 = false;
        goto L53
    L45:
        if (r23.e(null) == false) goto L47;
        r12 = 1048576;
        goto L43
    L47:
        r12 = 524288;
        goto L43
    L36:
        if (r23.c(r22) == false) goto L38;
        int r110 = 131072;
    L39:
        r7 = r4 | r110;
        goto L41
    L38:
        r110 = 65536;
        goto L39
    L26:
        if ((r24 & 24576) != 0) goto L24;
        r8 = r21;
        if (r23.e(r8) == false) goto L30;
        int r111 = 16384;
    L31:
        r4 = r4 | r111;
        goto L32
    L30:
        r111 = 8192;
        goto L31
    L16:
        r5 = r20;
        if (r23.e(r5) == false) goto L19;
        int r43 = 2048;
    L20:
        r4 = r2 | r43;
        goto L21
    L19:
        r43 = 1024;
        goto L20
    L9:
        if (r23.e(r18) == false) goto L11;
        int r44 = 32;
    L12:
        r2 = r2 | r44;
        goto L13
    L11:
        r44 = 16;
        goto L12
    L5:
        r1 = 2;
        goto L6
    }

    public static float c0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void d(cc r10, String r11, dx2 r12, rg1 r13, int r14) {
        Bitmap r0 = r10.a;
        hs r4 = fz0.s;
        boolean r1 = r13.e(r10);
        Object r2 = r13.H();
        if (r1 == true) goto L6;
        Object r3 = r2;
        if (r2 == j80.a) goto L6;
    L7:
        i80 r5 = od0.a;
        c((ys) r3, r11, r12, r4, r5, 1.0f, r13, (r14 & 112) | 24968, 0);
        return;
    L6:
        int r6 = r0.getWidth();
        ys r7 = new ys(r10, (((long) r6) << 32) | (((long) r0.getHeight()) & 4294967295L));
        r7.g = 1;
        r13.b0(r7);
        r3 = r7;
        goto L7
    }

    public static String d0(rj5 r5) {
        StringBuilder r0 = new StringBuilder(r5.e());
        int r1 = 0;
    L4:
        if (r1 >= r5.e()) goto L30;
        byte r2 = r5.a(r1);
        if (r2 != 34) goto L8;
        r0.append("\\\"");
    L28:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 != 39) goto L10;
        r0.append("\\'");
        goto L28
    L10:
        if (r2 == 92) goto L25;
        switch(r2) {
            case 7: goto L24;
            case 8: goto L23;
            case 9: goto L22;
            case 10: goto L21;
            case 11: goto L20;
            case 12: goto L19;
            case 13: goto L18;
            default: goto L13;
        };
    L18:
        r0.append("\\r");
        goto L28
    L19:
        r0.append("\\f");
        goto L28
    L20:
        r0.append("\\v");
        goto L28
    L21:
        r0.append("\\n");
        goto L28
    L22:
        r0.append("\\t");
        goto L28
    L23:
        r0.append("\\b");
        goto L28
    L24:
        r0.append("\\a");
        goto L28
    L13:
        if (r2 >= 32) goto L15;
    L17:
        r0.append('\\');
        r0.append((char) (((r2 >>> 6) & 3) + 48));
        r0.append((char) (((r2 >>> 3) & 7) + 48));
        r0.append((char) ((r2 & 7) + 48));
        goto L28
    L15:
        if (r2 > 126) goto L17;
        r0.append((char) r2);
        goto L28
    L25:
        r0.append("\\\\");
        goto L28
    L30:
        return r0.toString();
    }

    public static float e(float[] r8) {
        if (r8.length >= 6) goto L5;
        return 0.0f;
    L5:
        float r0 = r8[0];
        float r1 = r8[1];
        float r3 = r8[2];
        float r4 = r8[3];
        float r5 = r8[4];
        float r9 = r8[5];
        float r7 = r1 * r5;
        float r10 = r7 + (r0 * r4);
        float r6 = (((((r3 * r9) + r10) - (r4 * r5)) - (r1 * r3)) - (r0 * r9)) * 0.5f;
        if (r6 < 0.0f) goto L8;
        return r6;
    L8:
        return -r6;
    }

    public static String f(byte[] r4) {
        StringBuilder r0 = new StringBuilder(r4.length * 2);
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L7;
        r0.append(String.format("%02x", new Object[]{Byte.valueOf(r4[r1])}));
        r1 = r1 + 1;
        goto L4
    L7:
        return r0.toString();
    }

    public static final boolean g(on3 r1) {
        if (r1.h == false) goto L5;
        return false;
    L5:
        if (r1.d == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static final boolean h(on3 r1) {
        if (r1.c() == false) goto L5;
        return false;
    L5:
        if (r1.h == true) goto L7;
        return false;
    L7:
        if (r1.d == true) goto L13;
        return true;
    L13:
        return false;
    }

    public static final boolean i(on3 r1) {
        if (r1.h == true) goto L5;
        return false;
    L5:
        if (r1.d == true) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Context r11) {
        r11.getClass();
        if (pt0.c() == false) goto L53;
        rr1 r0 = rr1.a;
        List r1 = (List) rr1.d(new or1(18), new or1(20));
        int r2 = 0;
        List r3 = (List) rr1.d(new k2(25, 0 == true ? 1 : 0), new k2(26, 0 == true ? 1 : 0));     // Catch: Exception -> L8
    L10:
        Context r12 = r11.getApplicationContext();
        r12.getClass();
        Object r4 = e;
        monitor-enter(r4);
        HubNotifier$State r5 = F(r12);     // Catch: Throwable -> L36
        xk0 r6 = Q(r5, r1, r3);     // Catch: Throwable -> L36
        Z(r5);     // Catch: Throwable -> L36
        r12.getSharedPreferences("homemusic_notifier", 0).edit().putString("state", rr1.c.j(r5)).apply();     // Catch: Throwable -> L36
        monitor-exit(r4);
        int r7 = r1.size();
        int r8 = r3.size();
        int r9 = ((ArrayList) r6.p).size();
        boolean r10 = r6.o;
        StringBuilder r13 = b11.t("Checked ", " downloads, ", r7, r8, " tasks: ");
        r13.append(r9);
        r13.append(" to notify, newly done: ");
        r13.append(r10);
        Log.d("HubNotifier", r13.toString());
        ArrayList r14 = (ArrayList) r6.p;
        int r15 = r14.size();
    L15:
        if (r2 >= r15) goto L33;
        Object r16 = r14.get(r2);
        r2 = r2 + 1;
        HubAssistantTask r17 = (HubAssistantTask) r16;
        if (h12.c(r17.getStatus(), "failed") == false) goto L21;
        String r18 = r12.getString(R.string.homemusic_notify_task_failed);
        r18.getClass();
        String r19 = r17.getError();
        if (r19 != null) goto L22;
        r19 = r12.getString(R.string.homemusic_notify_task_open);
        r19.getClass();
    L22:
        int r20 = ("t" + r17.getId()).hashCode();
        String r21 = b11.k("/assistant/", r17.getId());
        if (Build.VERSION.SDK_INT < 33) goto L27;
        if (ud3.c(r12, "android.permission.POST_NOTIFICATIONS") != 0) goto L15;
    L27:
        m(r12);
        Intent r22 = new Intent(r12, MainActivity.class).addFlags(805306368).putExtra("homemusic_hub_route", r21);
        r22.getClass();
        PendingIntent r23 = PendingIntent.getActivity(r12, r20, r22, 201326592);
        s63 r24 = new s63(r12, "homemusic_hub");
        r24.v.icon = R.drawable.ic_download;
        r24.e = s63.b(r18);
        r24.f = s63.b(r19);
        r63 r25 = new r63();
        r25.b = s63.b(r19);
        r24.e(r25);
        r24.g = r23;
        r24.c(16, true);
        Notification r26 = r24.a();
        r26.getClass();
        new x63(r12).a(r20, r26);     // Catch: SecurityException -> L30
    L30:
        e = move-exception;
        Log.w("HubNotifier", "Notification not allowed", e);
        goto L15
    L21:
        r18 = r12.getString(R.string.homemusic_notify_task_ready);
        r18.getClass();
        r19 = r12.getString(R.string.homemusic_notify_task_confirm);
        r19.getClass();
        goto L22
    L33:
        if (r6.o == false) goto L52;
        U(r12);
        return;
    L52:
        return;
    L36:
        th = move-exception;
        throw th;
    L8:
        e = move-exception;
        Log.w("HubNotifier", "Assistant tasks unavailable", e);
        r3 = u01.n;
        goto L10
    }

    public static mc0 k() {
        LinkedHashSet r0 = new LinkedHashSet();
        return new mc0(new o53(null), 3, true, false, false, false, -1, -1, q40.T0(r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] l(Serializable r4) {
        if ((r4 instanceof int[]) == false) goto L10;
        int[] r5 = (int[]) r4;
        long[] r0 = new long[r5.length];
        int r1 = 0;
    L6:
        if (r1 >= r5.length) goto L8;
        r0[r1] = r5[r1];
        r1 = r1 + 1;
        goto L6
    L8:
        return r0;
    L10:
        if ((r4 instanceof long[]) == true) goto L12;
        return null;
    L12:
        return (long[]) r4;
    }

    public static final void m(Context r3) {
        if (Build.VERSION.SDK_INT < 26) goto L10;
        NotificationManager r0 = (NotificationManager) r3.getSystemService(NotificationManager.class);
        if (r0 != null) goto L8;
        return;
    L8:
        gm0.n();
        NotificationChannel r1 = gm0.y(r3.getString(R.string.homemusic_channel_name));
        gm0.z(r1, r3.getString(R.string.homemusic_channel_description));
        gm0.q(r0, r1);
        return;
    }

    public static aa5 n(jc0 r7, int r8, ArrayList r9, aa5 r10) {
        if (r8 != 0) goto L4;
        int r0 = r7.m0;
    L5:
        int r1 = 0;
        if (r0 == (-1)) goto L19;
        if (r10 != null) goto L9;
    L10:
        int r3 = 0;
    L12:
        if (r3 >= r9.size()) goto L22;
        aa5 r4 = (aa5) r9.get(r3);
        if (r4.b == r0) goto L15;
        r3 = r3 + 1;
        goto L12
    L15:
        if (r10 == null) goto L17;
        r10.c(r8, r4);
        r9.remove(r10);
    L17:
        r10 = r4;
    L22:
        if (r10 == null) goto L24;
    L50:
        ArrayList r2 = r10.a;
        if (r2.contains(r7) == false) goto L53;
        return r10;
    L53:
        r2.add(r7);
        if ((r7 instanceof pk1) == false) goto L59;
        pk1 r5 = (pk1) r7;
        hb0 r6 = r5.s0;
        if (r5.t0 != 0) goto L58;
        r1 = 1;
    L58:
        r6.b(r1, r10, r9);
    L59:
        int r11 = r10.b;
        if (r8 != 0) goto L62;
        r7.m0 = r11;
        r7.H.b(r8, r10, r9);
        r7.J.b(r8, r10, r9);
    L63:
        r7.O.b(r8, r10, r9);
        return r10;
    L62:
        r7.n0 = r11;
        r7.I.b(r8, r10, r9);
        r7.L.b(r8, r10, r9);
        r7.K.b(r8, r10, r9);
        goto L63
    L24:
        if ((r7 instanceof ep) == false) goto L47;
        ep r12 = (ep) r7;
        int r13 = 0;
    L27:
        if (r13 >= r12.q0) goto L38;
        jc0 r14 = r12.p0[r13];
        if (r8 != 0) goto L33;
        int r15 = r14.m0;
        if (r15 == (-1)) goto L33;
    L39:
        if (r15 == (-1)) goto L47;
        int r16 = 0;
    L42:
        if (r16 >= r9.size()) goto L47;
        aa5 r17 = (aa5) r9.get(r16);
        if (r17.b == r15) goto L45;
        r16 = r16 + 1;
        goto L42
    L45:
        r10 = r17;
    L33:
        if (r8 != 1) goto L37;
        r15 = r14.n0;
        if (r15 != (-1)) goto L39;
    L37:
        r13 = r13 + 1;
        goto L27
    L38:
        r15 = -1;
    L47:
        if (r10 != null) goto L49;
        r10 = new aa5();
        r10.a = new ArrayList();
        r10.d = null;
        r10.e = -1;
        int r18 = aa5.f;
        aa5.f = r18 + 1;
        r10.b = r18;
        r10.c = r8;
    L49:
        r9.add(r10);
        goto L50
    L9:
        if (r0 != r10.b) goto L10;
    L19:
        if (r0 == (-1)) goto L22;
        return r10;
    L4:
        r0 = r7.n0;
        goto L5
    }

    public static final f75 o(View r3) {
        r3.getClass();
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(R.id.view_tree_view_model_store_owner);
        if ((r1 instanceof f75) == false) goto L8;
        f75 r2 = (f75) r1;
    L9:
        if (r2 != null) goto L10;
        Object r4 = au0.z(r3);
        if ((r4 instanceof View) == true) goto L13;
        r3 = null;
        goto L4
    L13:
        r3 = (View) r4;
        goto L4
    L10:
        return r2;
    L8:
        r2 = null;
        goto L9
    L15:
        return null;
    }

    public static int p(Context r2, int r3, int r4) {
        TypedValue r0 = new TypedValue();
        r2.getTheme().resolveAttribute(r3, r0, true);
        if (r0.resourceId == 0) goto L5;
        return r3;
    L5:
        return r4;
    }

    public static Map q() {
        HashMap r0 = r;
        long r1 = SystemClock.elapsedRealtime();
        if (r0 != null) goto L5;
    L9:
        HashMap r2 = new HashMap();
        int r5 = 10;
        lg1 r4 = new lg1(r5, AppDatabase.y().w());
        Thread r3 = new Thread(r4);
        r3.start();
        r3.join();     // Catch: InterruptedException -> L12
    L14:
        Iterator r6 = ((List) r4.p).iterator();
    L16:
        if (r6.hasNext() == false) goto L20;
        Download r7 = (Download) r6.next();
        if (r7.getId() == null) goto L16;
        r2.put(r7.getId(), r7);
        goto L16
    L20:
        r = r2;
        s = r1;
        return r2;
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L14
    L5:
        if (s < 0) goto L9;
        if ((r1 - s) >= 1000) goto L9;
        return r0;
    }

    public static ColorStateList r(TypedArray r4, XmlPullParser r5, Resources.Theme r6) {
        if (u(r5, "tint") == false) goto L20;
        TypedValue r7 = new TypedValue();
        r4.getValue(1, r7);
        int r2 = r7.type;
        if (r2 == 2) goto L19;
        if (r2 >= 28) goto L9;
    L12:
        Resources r8 = r4.getResources();
        int r9 = r4.getResourceId(1, 0);
        ThreadLocal r1 = t50.a;
        return t50.a(r8, r8.getXml(r9), r6);
    L15:
        e = move-exception;
        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
        return null;
    L9:
        if (r2 > 31) goto L12;
        return ColorStateList.valueOf(r7.data);
    L19:
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + r7);
    L20:
        return null;
    }

    public static ue1 s(TypedArray r3, XmlPullParser r4, Resources.Theme r5, String r6, int r7) {
        if (u(r4, r6) == false) goto L18;
        TypedValue r8 = new TypedValue();
        r3.getValue(r7, r8);
        int r1 = r8.type;
        if (r1 < 28) goto L19;
        if (r1 > 31) goto L19;
        return new ue1(null, null, r8.data);
    L19:
        ue1 r9 = ue1.g(r3.getResources(), r3.getResourceId(r7, 0), r5);     // Catch: Exception -> L13
    L15:
        if (r9 == null) goto L18;
        return r9;
    L13:
        e = move-exception;
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
        r9 = null;
    L18:
        return new ue1(null, null, 0);
    }

    public static Uri t(Child r4) {
        ConcurrentHashMap r0 = ot1.a;
        r4.getClass();
        if (ot1.c(r4.getId()) == true) goto L5;
        Uri r1 = null;
    L6:
        if (r1 == null) goto L8;
        return r1;
    L8:
        Map r2 = q();
        HashMap r3 = new HashMap();
        Iterator r5 = ((HashMap) r2).entrySet().iterator();
    L10:
        if (r5.hasNext() == false) goto L16;
        Map.Entry r6 = (Map.Entry) r5.next();
        if (((Download) r6.getValue()).getDownloadUri() == null) goto L10;
        if (((Download) r6.getValue()).getDownloadUri().isEmpty() == true) goto L10;
        r3.put((String) r6.getKey(), ((Download) r6.getValue()).getDownloadUri());
        goto L10
    L16:
        String r7 = (String) r3.get(r4.getId());
        if (r7 == null) goto L21;
        return Uri.parse(r7);
    L21:
        if (ud3.o() == null) goto L26;
        Uri r8 = g51.e(r4);
        if (r8 == null) goto L26;
        return r8;
    L26:
        return e03.j(0, r4.getId());
    L5:
        r1 = new Uri.Builder().scheme("homemusic-hub").authority("listen").appendQueryParameter("ref", qm4.z0(r4.getId(), "hub:")).build();
        goto L6
    }

    public static boolean u(XmlPullParser r1, String r2) {
        if (r1.getAttributeValue("http://schemas.android.com/apk/res/android", r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static kd3 v() {
        ss0 r0 = AppDatabase.y().w();
        Set r1 = E().b;
        ArrayList r2 = new ArrayList();
        Iterator r3 = r1.iterator();
    L4:
        if (r3.hasNext() == false) goto L12;
        pb0 r4 = new pb0(r0, (String) r3.next(), 1);
        Thread r5 = new Thread(r4);
        r5.start();
        r5.join();     // Catch: InterruptedException -> L8
        Download r6 = (Download) r4.q;     // Catch: InterruptedException -> L8
    L10:
        if (r6 == null) goto L4;
        r2.add(r6);
    L8:
        e = move-exception;
        e.printStackTrace();
        r6 = null;
        goto L10
    L12:
        Integer r7 = Integer.valueOf(r2.size());
        int r8 = r2.size();
        int r9 = 0;
        long r10 = 0;
    L13:
        if (r9 >= r8) goto L20;
        Object r11 = r2.get(r9);
        r9 = r9 + 1;
        Long r12 = ((Download) r11).getSize();
        if (r12 == null) goto L17;
        long r13 = r12.longValue();
    L18:
        r10 = r10 + r13;
        goto L13
    L17:
        r13 = 0;
        goto L18
    L20:
        return new kd3(r7, Long.valueOf(r10));
    }

    public static int w(float r15) {
        if (r15 >= 1.0f) goto L7;
        return -16777216;
    L7:
        if (r15 <= 99.0f) goto L10;
        return -1;
    L10:
        float r1 = (r15 + 16.0f) / 116.0f;
        if (r15 <= 8.0f) goto L13;
        float r16 = (r1 * r1) * r1;
    L14:
        float r3 = (r1 * r1) * r1;
        if (r3 <= 0.008856452f) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L20;
        float r8 = r3;
    L21:
        if (r5 == true) goto L24;
        r3 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
    L24:
        float[] r0 = c;
        return v50.b(r8 * r0[0], r16 * r0[1], r3 * r0[2]);
    L20:
        r8 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
        goto L21
    L17:
        r5 = false;
        goto L18
    L13:
        r16 = r15 / 903.2963f;
        goto L14
    }

    public static boolean x(Context r2) {
        PackageManager r3 = r2.getPackageManager();
        if (p != null) goto L12;
        if (Build.VERSION.SDK_INT >= 26) goto L7;
    L9:
        boolean r4 = false;
    L10:
        p = Boolean.valueOf(r4);
        goto L12
    L7:
        if (r3.hasSystemFeature("android.hardware.type.automotive") == false) goto L9;
        r4 = true;
    L12:
        return p.booleanValue();
    }

    public static final boolean y(float r5, float r6, nc r7) {
        float r1 = r5 - 0.005f;
        float r2 = r6 - 0.005f;
        float r8 = r5 + 0.005f;
        float r9 = r6 + 0.005f;
        nc r0 = pc.a();
        Path r3 = r0.a;
        if (Float.isNaN(r1) == false) goto L5;
    L10:
        pc.b("Invalid rectangle, make sure no value is NaN");
    L12:
        if (r0.b != null) goto L14;
        r0.b = new RectF();
    L14:
        RectF r4 = r0.b;
        r4.getClass();
        r4.set(r1, r2, r8, r9);
        RectF r10 = r0.b;
        r10.getClass();
        r3.addRect(r10, Path.Direction.CCW);
        Path r11 = pc.a().a;
        Path.Op r12 = Path.Op.INTERSECT;
        if ((r7 instanceof nc) == false) goto L18;
        r11.op(r7.a, r3, r12);
        boolean r13 = r11.isEmpty();
        r11.reset();
        r3.reset();
        return !r13;
    L18:
        er1.l("Unable to obtain android.graphics.Path");
        return false;
    L5:
        if (Float.isNaN(r2) == true) goto L10;
        if (Float.isNaN(r8) == true) goto L10;
        if (Float.isNaN(r9) == false) goto L12;
        goto L10
    }

    public static boolean z(Resources r3) {
        boolean r0 = false;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (n != null) goto L14;
        Configuration r4 = r3.getConfiguration();
        if ((r4.screenLayout & 15) <= 3) goto L10;
    L12:
        n = Boolean.valueOf(r0);
        goto L14
    L10:
        if (r4.smallestScreenWidthDp < 600) goto L12;
        r0 = true;
    L14:
        return n.booleanValue();
    }
}
