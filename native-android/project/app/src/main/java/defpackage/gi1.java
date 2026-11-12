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
import android.graphics.Shader;
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
import com.eddyizm.tempus.homemusic.MixOfflineWorker;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.provider.AlbumArtContentProvider;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.gson.reflect.TypeToken;
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
    public static Method g = null;
    public static boolean h = false;
    public static Boolean k = null;
    public static Boolean l = null;
    public static Boolean m = null;
    public static Boolean n = null;
    public static Boolean o = null;
    public static Boolean p = null;
    public static Boolean q = null;
    public static volatile HashMap r = null;
    public static volatile long s = -1;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final zj5 i = new zj5("id");
    public static final zj5 j = new zj5("type");

    public static boolean A(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (l == null) {
            l = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || z(resources));
        }
        return l.booleanValue();
    }

    public static boolean B(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (q == null) {
            q = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return q.booleanValue();
    }

    public static final boolean C(float f2, float f3, float f4, float f5, long j2) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return ((f7 * f7) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static float D(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static ow2 E() {
        Long lM0;
        String strM = b11.m("homemusic_mix_offline_state", null);
        if (strM == null) {
            return new ow2();
        }
        List listC0 = qm4.C0(strM, new String[]{"\n"}, 6);
        String str = (String) q40.y0(listC0, 0);
        return (str == null || (lM0 = xm4.m0(str)) == null) ? new ow2() : new ow2(lM0.longValue(), kb4.r(listC0, 1), kb4.r(listC0, 2));
    }

    public static HubNotifier$State F(Context context) {
        String string = context.getSharedPreferences("homemusic_notifier", 0).getString("state", null);
        if (string == null) {
            return new HubNotifier$State();
        }
        try {
            HubNotifier$State hubNotifier$State = (HubNotifier$State) rr1.c.f(string, new TypeToken<HubNotifier$State>() { // from class: com.eddyizm.tempus.homemusic.HubNotifier$load$1
            }.getType());
            return hubNotifier$State == null ? new HubNotifier$State() : hubNotifier$State;
        } catch (Exception unused) {
            return new HubNotifier$State();
        }
    }

    public static gn2 G(Child child) {
        bn2 bn2Var;
        Bundle bundle = new Bundle();
        bundle.putInt("samplingRate", child.getSamplingRate() != null ? child.getSamplingRate().intValue() : 0);
        bundle.putInt("bitDepth", child.getBitDepth() != null ? child.getBitDepth().intValue() : 0);
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        String id = child.getId();
        id.getClass();
        co2 co2Var = new co2();
        co2Var.a = child.getTitle();
        co2Var.n = Integer.valueOf(child.getTrack() != null ? child.getTrack().intValue() : 0);
        co2Var.B = Integer.valueOf(child.getDiscNumber() != null ? child.getDiscNumber().intValue() : 0);
        co2Var.v = Integer.valueOf(child.getYear() != null ? child.getYear().intValue() : 0);
        co2Var.c = child.getAlbum();
        co2Var.b = child.getArtist();
        co2Var.H = bundle;
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        do2 do2Var = new do2(co2Var);
        yc5 yc5Var = new yc5();
        yc5Var.p = bundle;
        yc5Var.n = xa3.u("audio_transcode_download", false) ? e03.k(child.getId()) : e03.e(child.getId());
        cn2 cn2Var2 = new cn2(yc5Var);
        Uri uriK = xa3.u("audio_transcode_download", false) ? e03.k(child.getId()) : e03.e(child.getId());
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        if (uriK != null) {
            bn2Var = new bn2(uriK, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L);
        } else {
            bn2Var = null;
        }
        return new gn2(id, new wm2(um2Var), bn2Var, new an2(zm2Var), do2Var, cn2Var2);
    }

    public static ArrayList H(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(G((Child) list.get(i2)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004a  */
    public static gn2 I(InternetRadioStation internetRadioStation) {
        Uri uriA;
        String strG;
        String homePageUrl;
        Uri uri = Uri.parse(internetRadioStation.getStreamUrl());
        if (internetRadioStation.getId() != null) {
            File fileE = xt3.e(internetRadioStation.getId());
            if (fileE.exists()) {
                uriA = AlbumArtContentProvider.a("rl_" + internetRadioStation.getId()).buildUpon().appendQueryParameter("v", String.valueOf(fileE.lastModified())).build();
            } else {
                uriA = null;
            }
        } else {
            uriA = null;
        }
        if (uriA != null || internetRadioStation.getCoverArt() == null || internetRadioStation.getCoverArt().isEmpty()) {
            strG = null;
        } else {
            String coverArt = internetRadioStation.getCoverArt();
            strG = coverArt;
            uriA = AlbumArtContentProvider.a(coverArt);
        }
        if (uriA == null && (homePageUrl = internetRadioStation.getHomePageUrl()) != null && !homePageUrl.isEmpty() && e03.n(homePageUrl)) {
            strG = xa3.g("ir_", Base64.encodeToString(homePageUrl.getBytes(StandardCharsets.UTF_8), 10));
            uriA = AlbumArtContentProvider.a(strG);
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", internetRadioStation.getId());
        bundle.putString("title", internetRadioStation.getName());
        bundle.putString("stationName", internetRadioStation.getName());
        bundle.putString("uri", uri.toString());
        bundle.putString("type", WaveOrigin.RADIO);
        bundle.putString("coverArtId", strG);
        String homePageUrl2 = internetRadioStation.getHomePageUrl();
        if (homePageUrl2 != null) {
            bundle.putString("homepageUrl", homePageUrl2);
        }
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        String id = internetRadioStation.getId();
        id.getClass();
        co2 co2Var = new co2();
        co2Var.a = internetRadioStation.getName();
        co2Var.m = uriA;
        co2Var.H = bundle;
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        do2 do2Var = new do2(co2Var);
        yc5 yc5Var = new yc5();
        yc5Var.n = uri;
        yc5Var.p = bundle;
        cn2 cn2Var2 = new cn2(yc5Var);
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        return new gn2(id, new wm2(um2Var), new bn2(uri, null, ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2Var, cn2Var2);
    }

    public static gn2 J(gn2 gn2Var) {
        Uri uri;
        bn2 bn2Var;
        cn2 cn2Var = gn2Var.f;
        Bundle bundle = cn2Var.c;
        String string = bundle != null ? bundle.getString("id") : null;
        if (string != null && ((Download) ((HashMap) q()).get(string)) != null) {
            return K(N(gn2Var));
        }
        Uri uri2 = cn2Var.a;
        if (uri2 == null) {
            uri = null;
        } else {
            Pattern pattern = e03.a;
            String scheme = uri2.getScheme();
            if (scheme == null || (!scheme.equals("content") && !scheme.equals("file"))) {
                String strReplaceAll = e03.b.matcher(e03.a.matcher(uri2.toString()).replaceAll("")).replaceAll("");
                int iD = e03.d();
                String strQ = e03.q(iD);
                if (!ud3.U()) {
                    StringBuilder sbS = b11.s(strReplaceAll, "&maxBitRate=");
                    sbS.append(e03.b(iD, strQ));
                    strReplaceAll = sbS.toString();
                }
                if (!ud3.U()) {
                    strReplaceAll = b11.o(strReplaceAll, "&format=", strQ);
                }
                uri2 = Uri.parse(strReplaceAll);
            }
            uri = uri2;
        }
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var2 = cn2.d;
        String str = gn2Var.a;
        str.getClass();
        do2 do2Var = gn2Var.d;
        yc5 yc5Var = new yc5();
        yc5Var.n = uri;
        yc5Var.p = cn2Var.c;
        cn2 cn2Var3 = new cn2(yc5Var);
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        if (uri != null) {
            bn2Var = new bn2(uri, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L);
        } else {
            bn2Var = null;
        }
        wm2 wm2Var = new wm2(um2Var);
        an2 an2Var = new an2(zm2Var);
        if (do2Var == null) {
            do2Var = do2.K;
        }
        return new gn2(str, wm2Var, bn2Var, an2Var, do2Var, cn2Var3);
    }

    public static gn2 K(Child child) {
        try {
            Child child2 = (Download) ((HashMap) q()).get(child.getId());
            if (child2 == null) {
                child2 = child;
            }
            Uri uriT = t(child);
            String coverArtId = child2.getCoverArtId();
            Uri uriA = coverArtId != null ? AlbumArtContentProvider.a(coverArtId) : null;
            Bundle bundle = new Bundle();
            bundle.putString("id", child2.getId());
            bundle.putString("parentId", child2.getParentId());
            bundle.putBoolean("isDir", child2.isDir());
            bundle.putString("title", child.getTitle());
            bundle.putString("album", child.getAlbum());
            bundle.putString("artist", child.getArtist());
            bundle.putInt("track", child.getTrack() != null ? child.getTrack().intValue() : 0);
            bundle.putInt("year", child.getYear() != null ? child.getYear().intValue() : 0);
            bundle.putString("genre", child.getGenre());
            bundle.putString("coverArtId", coverArtId);
            bundle.putLong("size", child2.getSize() != null ? child2.getSize().longValue() : 0L);
            bundle.putString("contentType", child2.getContentType());
            bundle.putString("suffix", child2.getSuffix());
            bundle.putString("transcodedContentType", child2.getTranscodedContentType());
            bundle.putString("transcodedSuffix", child2.getTranscodedSuffix());
            bundle.putInt("duration", child2.getDuration() != null ? child2.getDuration().intValue() : 0);
            bundle.putInt("bitrate", child2.getBitrate() != null ? child2.getBitrate().intValue() : 0);
            bundle.putInt("samplingRate", child2.getSamplingRate() != null ? child2.getSamplingRate().intValue() : 0);
            bundle.putInt("bitDepth", child2.getBitDepth() != null ? child2.getBitDepth().intValue() : 0);
            bundle.putString("path", child2.getPath());
            bundle.putBoolean("isVideo", child2.isVideo());
            bundle.putInt("userRating", child.getUserRating() != null ? child.getUserRating().intValue() : 0);
            bundle.putDouble("averageRating", child.getAverageRating() != null ? child.getAverageRating().doubleValue() : 0.0d);
            bundle.putLong("playCount", child.getPlayCount() != null ? child.getPlayCount().longValue() : 0L);
            bundle.putInt("discNumber", child.getDiscNumber() != null ? child.getDiscNumber().intValue() : 0);
            bundle.putLong("created", child.getCreated() != null ? child.getCreated().getTime() : 0L);
            bundle.putLong("starred", child.getStarred() != null ? child.getStarred().getTime() : 0L);
            bundle.putString("albumId", child.getAlbumId());
            bundle.putString("albumArtist", child.getAlbumArtist());
            bundle.putString("artistId", child.getArtistId());
            bundle.putString("type", "music");
            bundle.putLong("bookmarkPosition", child.getBookmarkPosition() != null ? child.getBookmarkPosition().longValue() : 0L);
            bundle.putInt("originalWidth", child.getOriginalWidth() != null ? child.getOriginalWidth().intValue() : 0);
            bundle.putInt("originalHeight", child.getOriginalHeight() != null ? child.getOriginalHeight().intValue() : 0);
            bundle.putString("uri", uriT.toString());
            si0.Z(bundle, child.getReplayGain());
            bundle.putString("assetLinkSong", child.getId() != null ? l93.i("song", child.getId()) : null);
            bundle.putString("assetLinkAlbum", child.getAlbumId() != null ? l93.i("album", child.getAlbumId()) : null);
            bundle.putString("assetLinkArtist", child.getArtistId() != null ? l93.i("artist", child.getArtistId()) : null);
            bundle.putString("assetLinkGenre", l93.i("genre", child.getGenre()));
            Integer year = child.getYear();
            bundle.putString("assetLinkYear", (year == null || year.intValue() == 0) ? null : l93.i("year", String.valueOf(year)));
            um2 um2Var = new um2();
            xm2 xm2Var = new xm2();
            List list = Collections.EMPTY_LIST;
            gy3 gy3Var = gy3.r;
            zm2 zm2Var = new zm2();
            cn2 cn2Var = cn2.d;
            String id = child.getId();
            id.getClass();
            co2 co2Var = new co2();
            co2Var.a = child.getTitle();
            co2Var.n = Integer.valueOf(child.getTrack() != null ? child.getTrack().intValue() : 0);
            co2Var.B = Integer.valueOf(child.getDiscNumber() != null ? child.getDiscNumber().intValue() : 0);
            co2Var.v = Integer.valueOf(child.getYear() != null ? child.getYear().intValue() : 0);
            co2Var.c = child.getAlbum();
            co2Var.b = child.getArtist();
            co2Var.m = uriA;
            co2Var.i = new vl1(n61.f(1, child.getId(), child.getStarred() != null && child.getStarred().getTime() > 0));
            co2Var.I = yw1.k(yw1.p("android.media3.session.demo.HEART_ON", "android.media3.session.demo.HEART_OFF"));
            co2Var.H = bundle;
            co2Var.q = Boolean.FALSE;
            co2Var.r = Boolean.TRUE;
            do2 do2Var = new do2(co2Var);
            yc5 yc5Var = new yc5();
            yc5Var.n = uriT;
            yc5Var.p = bundle;
            cn2 cn2Var2 = new cn2(yc5Var);
            rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
            return new gn2(id, new wm2(um2Var), new bn2(uriT, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2Var, cn2Var2);
        } catch (Exception e2) {
            String id2 = child != null ? child.getId() : "NULL_MEDIA_OBJECT";
            Log.e("MappingUtil", f34.h("Instant Mix CRASH! Failed to map song to MediaItem. Problematic Song ID: ", id2, ", Title: ", child != null ? child.getTitle() : "N/A", ". Inspect this song's Subsonic data for missing fields."), e2);
            nz2.s(xa3.g("Mapping failed for song ID: ", id2), e2);
            return null;
        }
    }

    public static gn2 L(PodcastEpisode podcastEpisode) {
        Uri uriJ;
        Download download;
        boolean z = true;
        z = true;
        if (ud3.o() != null) {
            ConcurrentHashMap concurrentHashMap = g51.a;
            uriJ = g51.d(podcastEpisode.getArtist(), podcastEpisode.getTitle(), podcastEpisode.getAlbum());
            if (uriJ == null) {
                uriJ = e03.j(0, podcastEpisode.getStreamId());
            }
        } else {
            eu0 eu0VarW = au0.w(App.a());
            String streamId = podcastEpisode.getStreamId();
            eu0VarW.getClass();
            if (eu0.d(streamId)) {
                String streamId2 = podcastEpisode.getStreamId();
                pb0 pb0Var = new pb0(AppDatabase.y().w(), streamId2, z ? 1 : 0);
                Thread thread = new Thread(pb0Var);
                thread.start();
                try {
                    thread.join();
                    download = (Download) pb0Var.q;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    download = null;
                }
                uriJ = (download == null || download.getDownloadUri().isEmpty()) ? e03.e(streamId2) : Uri.parse(download.getDownloadUri());
            } else {
                uriJ = e03.j(0, podcastEpisode.getStreamId());
            }
        }
        Uri uri = uriJ;
        Uri uriA = AlbumArtContentProvider.a(podcastEpisode.getCoverArtId());
        Bundle bundle = new Bundle();
        bundle.putString("id", podcastEpisode.getId());
        bundle.putString("parentId", podcastEpisode.getParentId());
        bundle.putBoolean("isDir", podcastEpisode.isDir());
        bundle.putString("title", podcastEpisode.getTitle());
        bundle.putString("album", podcastEpisode.getAlbum());
        bundle.putString("artist", podcastEpisode.getArtist());
        bundle.putInt("year", podcastEpisode.getYear() != null ? podcastEpisode.getYear().intValue() : 0);
        bundle.putString("coverArtId", podcastEpisode.getCoverArtId());
        bundle.putLong("size", podcastEpisode.getSize() != null ? podcastEpisode.getSize().longValue() : 0L);
        bundle.putString("contentType", podcastEpisode.getContentType());
        bundle.putString("suffix", podcastEpisode.getSuffix());
        bundle.putInt("duration", podcastEpisode.getDuration() != null ? podcastEpisode.getDuration().intValue() : 0);
        bundle.putInt("bitrate", podcastEpisode.getBitrate() != null ? podcastEpisode.getBitrate().intValue() : 0);
        bundle.putBoolean("isVideo", podcastEpisode.isVideo());
        bundle.putLong("created", podcastEpisode.getCreated() != null ? podcastEpisode.getCreated().getTime() : 0L);
        bundle.putString("artistId", podcastEpisode.getArtistId());
        bundle.putString("description", podcastEpisode.getDescription());
        bundle.putString("type", "podcast");
        bundle.putString("uri", uri.toString());
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        String id = podcastEpisode.getId();
        id.getClass();
        co2 co2Var = new co2();
        co2Var.a = podcastEpisode.getTitle();
        co2Var.v = Integer.valueOf(podcastEpisode.getYear() != null ? podcastEpisode.getYear().intValue() : 0);
        co2Var.c = podcastEpisode.getAlbum();
        co2Var.b = podcastEpisode.getArtist();
        co2Var.m = uriA;
        co2Var.H = bundle;
        co2Var.q = Boolean.FALSE;
        co2Var.r = Boolean.TRUE;
        do2 do2Var = new do2(co2Var);
        yc5 yc5Var = new yc5();
        yc5Var.n = uri;
        yc5Var.p = bundle;
        cn2 cn2Var2 = new cn2(yc5Var);
        if (((Uri) xm2Var.e) != null && ((UUID) xm2Var.d) == null) {
            z = false;
        }
        rr2.w(z);
        return new gn2(id, new wm2(um2Var), new bn2(uri, "audio", ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2Var, cn2Var2);
    }

    public static ArrayList M(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Child child = (Child) list.get(i2);
            try {
                arrayList.add(K(child));
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Skipping un-mappable song in queue restore: ");
                sb.append(child != null ? child.getId() : "null");
                Log.e("MappingUtil", sb.toString(), e2);
            }
        }
        return arrayList;
    }

    public static Child N(gn2 gn2Var) {
        Integer num;
        Integer num2;
        Integer num3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        if (gn2Var == null) {
            return null;
        }
        do2 do2Var = gn2Var.d;
        Bundle bundle = do2Var.I;
        String string = (bundle == null || bundle.getString("id") == null) ? gn2Var.a : bundle.getString("id");
        if (string == null) {
            return null;
        }
        Child child = new Child(string);
        if (bundle != null) {
            child.setParentId(bundle.getString("parentId"));
            child.setDir(bundle.getBoolean("isDir"));
            child.setTitle(bundle.getString("title"));
            child.setAlbum(bundle.getString("album"));
            child.setArtist(bundle.getString("artist"));
            child.setGenre(bundle.getString("genre"));
            child.setCoverArtId(bundle.getString("coverArtId"));
            child.setContentType(bundle.getString("contentType"));
            child.setSuffix(bundle.getString("suffix"));
            child.setTranscodedContentType(bundle.getString("transcodedContentType"));
            child.setTranscodedSuffix(bundle.getString("transcodedSuffix"));
            child.setPath(bundle.getString("path"));
            child.setVideo(bundle.getBoolean("isVideo"));
            child.setAlbumId(bundle.getString("albumId"));
            child.setAlbumArtist(bundle.getString("albumArtist"));
            child.setArtistId(bundle.getString("artistId"));
            child.setType(bundle.getString("type"));
            if (bundle.containsKey("track")) {
                child.setTrack(Integer.valueOf(bundle.getInt("track")));
            }
            if (bundle.containsKey("year")) {
                child.setYear(Integer.valueOf(bundle.getInt("year")));
            }
            if (bundle.containsKey("size")) {
                child.setSize(Long.valueOf(bundle.getLong("size")));
            }
            if (bundle.containsKey("duration")) {
                child.setDuration(Integer.valueOf(bundle.getInt("duration")));
            }
            if (bundle.containsKey("bitrate")) {
                child.setBitrate(Integer.valueOf(bundle.getInt("bitrate")));
            }
            if (bundle.containsKey("samplingRate")) {
                child.setSamplingRate(Integer.valueOf(bundle.getInt("samplingRate")));
            }
            if (bundle.containsKey("bitDepth")) {
                child.setBitDepth(Integer.valueOf(bundle.getInt("bitDepth")));
            }
            if (bundle.containsKey("userRating")) {
                child.setUserRating(Integer.valueOf(bundle.getInt("userRating")));
            }
            if (bundle.containsKey("averageRating")) {
                child.setAverageRating(Double.valueOf(bundle.getDouble("averageRating")));
            }
            if (bundle.containsKey("playCount")) {
                child.setPlayCount(Long.valueOf(bundle.getLong("playCount")));
            }
            if (bundle.containsKey("discNumber")) {
                child.setDiscNumber(Integer.valueOf(bundle.getInt("discNumber")));
            }
            if (bundle.containsKey("bookmarkPosition")) {
                child.setBookmarkPosition(Long.valueOf(bundle.getLong("bookmarkPosition")));
            }
            if (bundle.containsKey("originalWidth")) {
                child.setOriginalWidth(Integer.valueOf(bundle.getInt("originalWidth")));
            }
            if (bundle.containsKey("originalHeight")) {
                child.setOriginalHeight(Integer.valueOf(bundle.getInt("originalHeight")));
            }
            long j2 = bundle.getLong("created", 0L);
            if (j2 != 0) {
                child.setCreated(new Date(j2));
            }
            long j3 = bundle.getLong("starred", 0L);
            if (j3 != 0) {
                child.setStarred(new Date(j3));
            }
            child.setReplayGain(si0.v(bundle));
        }
        if (child.getTitle() == null && (charSequence3 = do2Var.a) != null) {
            child.setTitle(charSequence3.toString());
        }
        if (child.getArtist() == null && (charSequence2 = do2Var.b) != null) {
            child.setArtist(charSequence2.toString());
        }
        if (child.getAlbum() == null && (charSequence = do2Var.c) != null) {
            child.setAlbum(charSequence.toString());
        }
        if (child.getTrack() == null && (num3 = do2Var.n) != null) {
            child.setTrack(num3);
        }
        if (child.getDiscNumber() == null && (num2 = do2Var.C) != null) {
            child.setDiscNumber(num2);
        }
        if (child.getYear() == null && (num = do2Var.w) != null) {
            child.setYear(num);
        }
        return child;
    }

    public static TypedArray O(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static k62 P(String str, String str2) {
        String string;
        if (str == null || (string = qm4.K0(str).toString()) == null) {
            return null;
        }
        if (string.length() <= 0 || string.length() > 64) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        return new k62(string, b0(str2));
    }

    public static xk0 Q(HubNotifier$State hubNotifier$State, List list, List list2) {
        list.getClass();
        list2.getClass();
        xk0 xk0Var = new xk0(3);
        boolean initialized = hubNotifier$State.getInitialized();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HubDownloadItem hubDownloadItem = (HubDownloadItem) it.next();
            if (!hubDownloadItem.getStar() && h12.c(hubDownloadItem.getStatus(), "done") && !hubNotifier$State.getDoneItems().contains(Long.valueOf(hubDownloadItem.getId()))) {
                hubNotifier$State.getDoneItems().add(Long.valueOf(hubDownloadItem.getId()));
                if (initialized) {
                    xk0Var.o = true;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            HubAssistantTask hubAssistantTask = (HubAssistantTask) it2.next();
            String status = hubAssistantTask.getStatus();
            if (status != null) {
                String strValueOf = String.valueOf(hubAssistantTask.getId());
                if (!h12.c(hubNotifier$State.getTasks().get(strValueOf), status)) {
                    hubNotifier$State.getTasks().put(strValueOf, status);
                    if (initialized && (status.equals("awaiting_confirmation") || status.equals("failed"))) {
                        ((ArrayList) xk0Var.p).add(hubAssistantTask);
                    }
                }
            }
        }
        hubNotifier$State.setInitialized(true);
        return xk0Var;
    }

    public static void R(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final long S(on3 on3Var, boolean z) {
        long jD = g83.d(on3Var.c, on3Var.g);
        if (z || !on3Var.c()) {
            return jD;
        }
        return 0L;
    }

    public static rq4 T(x34 x34Var, String str) {
        long j2;
        Map mapB;
        fb4 fb4Var;
        x34Var.getClass();
        z34 z34VarU = x34Var.U("PRAGMA table_info(`" + str + "`)");
        try {
            long j3 = 0;
            if (z34VarU.O()) {
                int iY = rr2.y(z34VarU, "name");
                int iY2 = rr2.y(z34VarU, "type");
                int iY3 = rr2.y(z34VarU, "notnull");
                int iY4 = rr2.y(z34VarU, "pk");
                int iY5 = rr2.y(z34VarU, "dflt_value");
                ag2 ag2Var = new ag2();
                while (true) {
                    String strD = z34VarU.D(iY);
                    j2 = j3;
                    ag2Var.put(strD, new oq4((int) z34VarU.getLong(iY4), 2, strD, z34VarU.D(iY2), z34VarU.isNull(iY5) ? null : z34VarU.D(iY5), z34VarU.getLong(iY3) != j3));
                    if (!z34VarU.O()) {
                        break;
                    }
                    j3 = j2;
                }
                mapB = ag2Var.b();
                ud3.e(z34VarU, null);
            } else {
                mapB = v01.n;
                ud3.e(z34VarU, null);
                j2 = 0;
            }
            z34 z34VarU2 = x34Var.U("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iY6 = rr2.y(z34VarU2, "id");
                int iY7 = rr2.y(z34VarU2, "seq");
                int iY8 = rr2.y(z34VarU2, "table");
                int iY9 = rr2.y(z34VarU2, "on_delete");
                int iY10 = rr2.y(z34VarU2, "on_update");
                List listQ = uc5.Q(z34VarU2);
                z34VarU2.reset();
                fb4 fb4Var2 = new fb4();
                while (z34VarU2.O()) {
                    if (z34VarU2.getLong(iY7) == j2) {
                        int i2 = (int) z34VarU2.getLong(iY6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = iY6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listQ) {
                            int i4 = iY7;
                            List list = listQ;
                            if (((ob1) obj).n == i2) {
                                arrayList3.add(obj);
                            }
                            iY7 = i4;
                            listQ = list;
                        }
                        int i5 = iY7;
                        List list2 = listQ;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            ob1 ob1Var = (ob1) obj2;
                            arrayList.add(ob1Var.p);
                            arrayList2.add(ob1Var.q);
                            arrayList3 = arrayList3;
                        }
                        fb4Var2.add(new pq4(z34VarU2.D(iY8), z34VarU2.D(iY9), z34VarU2.D(iY10), arrayList, arrayList2));
                        iY6 = i3;
                        iY7 = i5;
                        listQ = list2;
                    }
                }
                fb4 fb4VarL = kb4.l(fb4Var2);
                ud3.e(z34VarU2, null);
                z34 z34VarU3 = x34Var.U("PRAGMA index_list(`" + str + "`)");
                try {
                    int iY11 = rr2.y(z34VarU3, "name");
                    int iY12 = rr2.y(z34VarU3, "origin");
                    int iY13 = rr2.y(z34VarU3, "unique");
                    if (iY11 == -1 || iY12 == -1 || iY13 == -1) {
                        ud3.e(z34VarU3, null);
                        fb4Var = null;
                    } else {
                        fb4 fb4Var3 = new fb4();
                        while (z34VarU3.O()) {
                            if ("c".equals(z34VarU3.D(iY12))) {
                                qq4 qq4VarR = uc5.R(x34Var, z34VarU3.D(iY11), z34VarU3.getLong(iY13) == 1);
                                if (qq4VarR == null) {
                                    ud3.e(z34VarU3, null);
                                    fb4Var = null;
                                } else {
                                    fb4Var3.add(qq4VarR);
                                }
                            }
                        }
                        fb4 fb4VarL2 = kb4.l(fb4Var3);
                        ud3.e(z34VarU3, null);
                        fb4Var = fb4VarL2;
                    }
                    return new rq4(str, mapB, fb4VarL, fb4Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ud3.e(z34VarU3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ud3.e(z34VarU2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ud3.e(z34VarU, th5);
                throw th6;
            }
        }
    }

    public static final void U(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance > 125) {
            context.getSharedPreferences("homemusic_notifier", 0).edit().putBoolean("pending_kept_sync", true).apply();
        } else {
            context.getSharedPreferences("homemusic_notifier", 0).edit().putBoolean("pending_kept_sync", false).apply();
            io1.b.post(new lf(context, 5));
        }
    }

    public static void V(ow2 ow2Var) {
        App.b().getClass();
        App.c().edit().putString("homemusic_mix_offline_state", q40.B0(gb.P(String.valueOf(ow2Var.a), q40.B0(ow2Var.b, ",", null, null, null, 62), q40.B0(ow2Var.c, ",", null, null, null, 62)), "\n", null, null, null, 62)).apply();
    }

    public static final void W(Context context) {
        sc5 sc5VarB = sc5.b(context);
        bq4 bq4Var = sc5VarB.d;
        r90 r90Var = sc5VarB.b;
        String str = "homemusic_mix_offline";
        if (xa3.u("homemusic_mix_offline", true)) {
            i93 i93Var = new i93(MixOfflineWorker.class, 6L, TimeUnit.HOURS);
            ((dd5) i93Var.b).j = k();
            sc5VarB.a("homemusic_mix_offline", (kf3) i93Var.b());
            i93 i93Var2 = new i93(MixOfflineWorker.class);
            ((dd5) i93Var2.b).j = k();
            new mc5(sc5VarB, "homemusic_mix_offline_now", 2, gb.O((j93) i93Var2.b()), 0).a();
            return;
        }
        i80 i80Var = r90Var.m;
        String strConcat = "CancelWorkByName_".concat("homemusic_mix_offline");
        ia4 ia4Var = (ia4) bq4Var.n;
        ia4Var.getClass();
        int i2 = 2;
        h12.D(i80Var, strConcat, ia4Var, new gp(i2, str, sc5VarB));
        i80 i80Var2 = r90Var.m;
        String strConcat2 = "CancelWorkByName_".concat("homemusic_mix_offline_now");
        ia4 ia4Var2 = (ia4) bq4Var.n;
        ia4Var2.getClass();
        h12.D(i80Var2, strConcat2, ia4Var2, new gp(i2, "homemusic_mix_offline_now", sc5VarB));
    }

    public static ArrayList X(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i2 = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i3 = 0; i3 < 8; i3++) {
                        byte b3 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b3 & 127) << (i3 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new f83(i2, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void Y(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            Y((View) parent, fArr, fArr2, iArr);
            gb.b(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            gb.b(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            gb.b(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            gb.b(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        hw.L(fArr2, matrix);
        gb.U(fArr, fArr2);
    }

    public static void Z(HubNotifier$State hubNotifier$State) {
        List<Long> doneItems = hubNotifier$State.getDoneItems();
        if (doneItems.size() > 500) {
            doneItems.subList(0, doneItems.size() - SmartPlan.MAX_QUEUE).clear();
        }
        if (hubNotifier$State.getTasks().size() > 500) {
            Set<String> setKeySet = hubNotifier$State.getTasks().keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                Long lM0 = xm4.m0((String) it.next());
                if (lM0 != null) {
                    arrayList.add(lM0);
                }
            }
            List listM0 = q40.M0(q40.J0(arrayList), SmartPlan.MAX_QUEUE);
            ArrayList arrayList2 = new ArrayList(r40.k0(listM0, 10));
            Iterator it2 = listM0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            Set setT0 = q40.T0(arrayList2);
            Map<String, String> tasks = hubNotifier$State.getTasks();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : tasks.entrySet()) {
                if (setT0.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            hubNotifier$State.setTasks(new LinkedHashMap(linkedHashMap));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(rr3 rr3Var, r70 r70Var, rg1 rg1Var, int i2) {
        j35 j35Var;
        boolean z;
        lv3 lv3VarP;
        rg1Var.S(-149765515);
        o02 o02Var = rg1Var.x;
        mf3 mf3VarK = rg1Var.k();
        rg1Var.P(201, l80.b);
        Object objH = rg1Var.H();
        if (h12.c(objH, j80.a)) {
            j35Var = null;
        } else {
            objH.getClass();
            j35Var = (j35) objH;
        }
        qr3 qr3Var = rr3Var.a;
        j35 j35VarD = qr3Var.d(rr3Var, j35Var);
        boolean zEquals = j35VarD.equals(j35Var);
        if (!zEquals) {
            rg1Var.b0(j35VarD);
        }
        if (!rg1Var.S) {
            hg4 hg4Var = rg1Var.G;
            Object objB = hg4Var.b(hg4Var.b, hg4Var.g);
            objB.getClass();
            mf3 mf3Var = (mf3) objB;
            if (!(rg1Var.w() && zEquals) && (rr3Var.g || !mf3VarK.containsKey(qr3Var))) {
                mf3VarK = mf3VarK.b(qr3Var, j35VarD);
            } else if ((zEquals && !rg1Var.w) || !rg1Var.w) {
                mf3VarK = mf3Var;
            }
            if (rg1Var.y || mf3Var != mf3VarK) {
                z = true;
            }
            if (z && !rg1Var.S) {
                rg1Var.F(mf3VarK);
            }
            o02Var.c(rg1Var.w ? 1 : 0);
            rg1Var.w = z;
            rg1Var.K = mf3VarK;
            rg1Var.O(202, l80.c, 0, mf3VarK);
            r70Var.invoke(rg1Var, Integer.valueOf((i2 >> 3) & 14));
            rg1Var.o(false);
            rg1Var.o(false);
            rg1Var.w = o02Var.b() != 0;
            rg1Var.K = null;
            lv3VarP = rg1Var.p();
            if (lv3VarP != null) {
                lv3VarP.d = new p70(rr3Var, r70Var, i2, 2);
            }
        }
        if (rr3Var.g || !mf3VarK.containsKey(qr3Var)) {
            mf3VarK = mf3VarK.b(qr3Var, j35VarD);
        }
        rg1Var.J = true;
        z = false;
        if (z) {
            rg1Var.F(mf3VarK);
        }
        o02Var.c(rg1Var.w ? 1 : 0);
        rg1Var.w = z;
        rg1Var.K = mf3VarK;
        rg1Var.O(202, l80.c, 0, mf3VarK);
        r70Var.invoke(rg1Var, Integer.valueOf((i2 >> 3) & 14));
        rg1Var.o(false);
        rg1Var.o(false);
        rg1Var.w = o02Var.b() != 0;
        rg1Var.K = null;
        lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new p70(rr3Var, r70Var, i2, 2);
        }
    }

    public static boolean a0(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
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
    public static final void b(rr3[] rr3VarArr, r70 r70Var, rg1 rg1Var, int i2) {
        mf3 mf3VarA0;
        boolean z;
        lv3 lv3VarP;
        rg1Var.S(415205898);
        o02 o02Var = rg1Var.x;
        mf3 mf3VarK = rg1Var.k();
        rg1Var.P(201, l80.b);
        int i3 = 1;
        if (rg1Var.S) {
            mf3VarA0 = rg1Var.a0(mf3VarK, vr1.I(rr3VarArr, mf3VarK, mf3.q));
            rg1Var.J = true;
        } else {
            hg4 hg4Var = rg1Var.G;
            Object objH = hg4Var.h(hg4Var.g, 0);
            objH.getClass();
            mf3 mf3Var = (mf3) objH;
            hg4 hg4Var2 = rg1Var.G;
            Object objH2 = hg4Var2.h(hg4Var2.g, 1);
            objH2.getClass();
            mf3 mf3Var2 = (mf3) objH2;
            mf3 mf3VarI = vr1.I(rr3VarArr, mf3VarK, mf3Var2);
            if (!rg1Var.w() || rg1Var.y || !mf3Var2.equals(mf3VarI)) {
                mf3VarA0 = rg1Var.a0(mf3VarK, mf3VarI);
                if (rg1Var.y || !h12.c(mf3VarA0, mf3Var)) {
                    z = true;
                }
                if (z && !rg1Var.S) {
                    rg1Var.F(mf3VarA0);
                }
                o02Var.c(rg1Var.w ? 1 : 0);
                rg1Var.w = z;
                rg1Var.K = mf3VarA0;
                rg1Var.O(202, l80.c, 0, mf3VarA0);
                r70Var.invoke(rg1Var, Integer.valueOf((i2 >> 3) & 14));
                rg1Var.o(false);
                rg1Var.o(false);
                rg1Var.w = o02Var.b() != 0;
                rg1Var.K = null;
                lv3VarP = rg1Var.p();
                if (lv3VarP != null) {
                    lv3VarP.d = new p70(rr3VarArr, r70Var, i2, i3);
                }
            }
            rg1Var.l = rg1Var.G.s() + rg1Var.l;
            mf3VarA0 = mf3Var;
        }
        z = false;
        if (z) {
            rg1Var.F(mf3VarA0);
        }
        o02Var.c(rg1Var.w ? 1 : 0);
        rg1Var.w = z;
        rg1Var.K = mf3VarA0;
        rg1Var.O(202, l80.c, 0, mf3VarA0);
        r70Var.invoke(rg1Var, Integer.valueOf((i2 >> 3) & 14));
        rg1Var.o(false);
        rg1Var.o(false);
        rg1Var.w = o02Var.b() != 0;
        rg1Var.K = null;
        lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new p70(rr3VarArr, r70Var, i2, i3);
        }
    }

    public static String b0(String str) {
        if (str == null || str.length() > 32 || !k62.c.a(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void c(final hd3 hd3Var, final String str, dx2 dx2Var, hs hsVar, i80 i80Var, float f2, rg1 rg1Var, final int i2, final int i3) {
        hs hsVar2;
        int i4;
        i80 i80Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        dx2 dx2Var2;
        final float f3;
        hs hsVar3;
        final i80 i80Var3;
        lv3 lv3VarP;
        int i10;
        i80 i80Var4;
        float f4;
        i80 i80Var5;
        dx2 zhVar;
        Object objH;
        boolean z2;
        Object objH2;
        rg1Var.S(1142754848);
        int i11 = (rg1Var.g(hd3Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i11 |= rg1Var.e(str) ? 32 : 16;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 = i11 | 3072;
            hsVar2 = hsVar;
        } else {
            hsVar2 = hsVar;
            i4 = i11 | (rg1Var.e(hsVar2) ? 2048 : 1024);
        }
        int i13 = i3 & 16;
        if (i13 == 0) {
            if ((i2 & 24576) == 0) {
                i80Var2 = i80Var;
                i4 |= rg1Var.e(i80Var2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i7 = i4 | 196608;
            } else {
                if (rg1Var.c(f2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i7 = i4 | i6;
            }
            if ((i3 & 64) != 0) {
                i8 = 1572864;
            } else if (rg1Var.e(null)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i7 | i8;
            if ((599187 & i9) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (rg1Var.K(i9 & 1, z)) {
                if (i12 != 0) {
                    hsVar3 = fz0.s;
                    i10 = i5;
                } else {
                    i10 = i5;
                    hsVar3 = hsVar2;
                }
                if (i13 != 0) {
                    i80Var4 = od0.b;
                } else {
                    i80Var4 = i80Var2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                i80Var5 = j80.a;
                if (str != null) {
                    rg1Var.R(1899222916);
                    if ((i9 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objH2 = rg1Var.H();
                    if (z2 || objH2 == i80Var5) {
                        objH2 = new rs0(6, str);
                        rg1Var.b0(objH2);
                    }
                    AtomicInteger atomicInteger = f94.a;
                    zhVar = new zh((if1) objH2);
                    rg1Var.o(false);
                } else {
                    rg1Var.R(1899381698);
                    rg1Var.o(false);
                    zhVar = ax2.a;
                }
                dx2Var2 = dx2Var;
                dx2 dx2VarW = bu.w(au0.G(dx2Var2.c(zhVar), null, 1044479), hd3Var, hsVar3, i80Var4, f4, null);
                objH = rg1Var.H();
                if (objH == i80Var5) {
                    objH = w01.d;
                    rg1Var.b0(objH);
                }
                ui2 ui2Var = (ui2) objH;
                int iHashCode = Long.hashCode(rg1Var.T);
                dx2 dx2VarE = j51.E(rg1Var, dx2VarW);
                mf3 mf3VarK = rg1Var.k();
                e80.e.getClass();
                rg1Var.U();
                if (rg1Var.S) {
                    rg1Var.j();
                } else {
                    rg1Var.e0();
                }
                l93.c0(fz0.I, rg1Var, ui2Var);
                l93.c0(fz0.H, rg1Var, mf3VarK);
                l93.a0(rg1Var);
                l93.c0(fz0.G, rg1Var, dx2VarE);
                l93.c0(fz0.J, rg1Var, Integer.valueOf(iHashCode));
                rg1Var.o(true);
                i80Var3 = i80Var4;
                f3 = f4;
            } else {
                dx2Var2 = dx2Var;
                rg1Var.N();
                f3 = f2;
                hsVar3 = hsVar2;
                i80Var3 = i80Var2;
            }
            lv3VarP = rg1Var.p();
            if (lv3VarP != null) {
                final dx2 dx2Var3 = dx2Var2;
                final hs hsVar4 = hsVar3;
                lv3VarP.d = new wf1() { // from class: yv1
                    @Override // defpackage.wf1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gi1.c(hd3Var, str, dx2Var3, hsVar4, i80Var3, f3, (rg1) obj, xl.O(i2 | 1), i3);
                        return j15.a;
                    }
                };
            }
        }
        i4 |= 24576;
        i80Var2 = i80Var;
        i5 = i3 & 32;
        if (i5 != 0) {
            i7 = i4 | 196608;
        } else {
            if (rg1Var.c(f2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i7 = i4 | i6;
        }
        if ((i3 & 64) != 0) {
            i8 = 1572864;
        } else if (rg1Var.e(null)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        i9 = i7 | i8;
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rg1Var.K(i9 & 1, z)) {
            if (i12 != 0) {
                hsVar3 = fz0.s;
                i10 = i5;
            } else {
                i10 = i5;
                hsVar3 = hsVar2;
            }
            if (i13 != 0) {
                i80Var4 = od0.b;
            } else {
                i80Var4 = i80Var2;
            }
            if (i10 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            i80Var5 = j80.a;
            if (str != null) {
                rg1Var.R(1899222916);
                if ((i9 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objH2 = rg1Var.H();
                if (z2) {
                    objH2 = new rs0(6, str);
                    rg1Var.b0(objH2);
                } else {
                    objH2 = new rs0(6, str);
                    rg1Var.b0(objH2);
                }
                AtomicInteger atomicInteger2 = f94.a;
                zhVar = new zh((if1) objH2);
                rg1Var.o(false);
            } else {
                rg1Var.R(1899381698);
                rg1Var.o(false);
                zhVar = ax2.a;
            }
            dx2Var2 = dx2Var;
            dx2 dx2VarW2 = bu.w(au0.G(dx2Var2.c(zhVar), null, 1044479), hd3Var, hsVar3, i80Var4, f4, null);
            objH = rg1Var.H();
            if (objH == i80Var5) {
                objH = w01.d;
                rg1Var.b0(objH);
            }
            ui2 ui2Var2 = (ui2) objH;
            int iHashCode2 = Long.hashCode(rg1Var.T);
            dx2 dx2VarE2 = j51.E(rg1Var, dx2VarW2);
            mf3 mf3VarK2 = rg1Var.k();
            e80.e.getClass();
            rg1Var.U();
            if (rg1Var.S) {
                rg1Var.j();
            } else {
                rg1Var.e0();
            }
            l93.c0(fz0.I, rg1Var, ui2Var2);
            l93.c0(fz0.H, rg1Var, mf3VarK2);
            l93.a0(rg1Var);
            l93.c0(fz0.G, rg1Var, dx2VarE2);
            l93.c0(fz0.J, rg1Var, Integer.valueOf(iHashCode2));
            rg1Var.o(true);
            i80Var3 = i80Var4;
            f3 = f4;
        } else {
            dx2Var2 = dx2Var;
            rg1Var.N();
            f3 = f2;
            hsVar3 = hsVar2;
            i80Var3 = i80Var2;
        }
        lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            final dx2 dx2Var4 = dx2Var2;
            final hs hsVar5 = hsVar3;
            lv3VarP.d = new wf1() { // from class: yv1
                @Override // defpackage.wf1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gi1.c(hd3Var, str, dx2Var4, hsVar5, i80Var3, f3, (rg1) obj, xl.O(i2 | 1), i3);
                    return j15.a;
                }
            };
        }
    }

    public static float c0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void d(cc ccVar, String str, dx2 dx2Var, rg1 rg1Var, int i2) {
        Object obj;
        Bitmap bitmap = ccVar.a;
        hs hsVar = fz0.s;
        boolean zE = rg1Var.e(ccVar);
        Object objH = rg1Var.H();
        if (zE || objH == j80.a) {
            obj = objH;
            ys ysVar = new ys(ccVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
            ysVar.g = 1;
            rg1Var.b0(ysVar);
            obj = ysVar;
        }
        obj = objH;
        c((ys) obj, str, dx2Var, hsVar, od0.a, 1.0f, rg1Var, (i2 & 112) | 24968, 0);
    }

    public static String d0(rj5 rj5Var) {
        StringBuilder sb = new StringBuilder(rj5Var.e());
        for (int i2 = 0; i2 < rj5Var.e(); i2++) {
            byte bA = rj5Var.a(i2);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static float e(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static final boolean g(on3 on3Var) {
        return !on3Var.h && on3Var.d;
    }

    public static final boolean h(on3 on3Var) {
        return (on3Var.c() || !on3Var.h || on3Var.d) ? false : true;
    }

    public static final boolean i(on3 on3Var) {
        return on3Var.h && !on3Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Context context) {
        List list;
        xk0 xk0VarQ;
        String string;
        String string2;
        context.getClass();
        if (pt0.c()) {
            rr1 rr1Var = rr1.a;
            List list2 = (List) rr1.d(new or1(18), new or1(20));
            int i2 = 0;
            try {
                list = (List) rr1.d(new k2(25, 0 == true ? 1 : 0), new k2(26, 0 == true ? 1 : 0));
            } catch (Exception e2) {
                Log.w("HubNotifier", "Assistant tasks unavailable", e2);
                list = u01.n;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            synchronized (e) {
                HubNotifier$State hubNotifier$StateF = F(applicationContext);
                xk0VarQ = Q(hubNotifier$StateF, list2, list);
                Z(hubNotifier$StateF);
                applicationContext.getSharedPreferences("homemusic_notifier", 0).edit().putString("state", rr1.c.j(hubNotifier$StateF)).apply();
            }
            int size = list2.size();
            int size2 = list.size();
            int size3 = ((ArrayList) xk0VarQ.p).size();
            boolean z = xk0VarQ.o;
            StringBuilder sbT = b11.t("Checked ", " downloads, ", size, size2, " tasks: ");
            sbT.append(size3);
            sbT.append(" to notify, newly done: ");
            sbT.append(z);
            Log.d("HubNotifier", sbT.toString());
            ArrayList arrayList = (ArrayList) xk0VarQ.p;
            int size4 = arrayList.size();
            while (i2 < size4) {
                Object obj = arrayList.get(i2);
                i2++;
                HubAssistantTask hubAssistantTask = (HubAssistantTask) obj;
                if (h12.c(hubAssistantTask.getStatus(), "failed")) {
                    string = applicationContext.getString(R.string.homemusic_notify_task_failed);
                    string.getClass();
                    string2 = hubAssistantTask.getError();
                    if (string2 == null) {
                        string2 = applicationContext.getString(R.string.homemusic_notify_task_open);
                        string2.getClass();
                    }
                } else {
                    string = applicationContext.getString(R.string.homemusic_notify_task_ready);
                    string.getClass();
                    string2 = applicationContext.getString(R.string.homemusic_notify_task_confirm);
                    string2.getClass();
                }
                int iHashCode = ("t" + hubAssistantTask.getId()).hashCode();
                String strK = b11.k("/assistant/", hubAssistantTask.getId());
                if (Build.VERSION.SDK_INT < 33 || ud3.c(applicationContext, "android.permission.POST_NOTIFICATIONS") == 0) {
                    m(applicationContext);
                    Intent intentPutExtra = new Intent(applicationContext, (Class<?>) MainActivity.class).addFlags(805306368).putExtra("homemusic_hub_route", strK);
                    intentPutExtra.getClass();
                    PendingIntent activity = PendingIntent.getActivity(applicationContext, iHashCode, intentPutExtra, 201326592);
                    s63 s63Var = new s63(applicationContext, "homemusic_hub");
                    s63Var.v.icon = R.drawable.ic_download;
                    s63Var.e = s63.b(string);
                    s63Var.f = s63.b(string2);
                    r63 r63Var = new r63();
                    r63Var.b = s63.b(string2);
                    s63Var.e(r63Var);
                    s63Var.g = activity;
                    s63Var.c(16, true);
                    Notification notificationA = s63Var.a();
                    notificationA.getClass();
                    try {
                        new x63(applicationContext).a(iHashCode, notificationA);
                    } catch (SecurityException e3) {
                        Log.w("HubNotifier", "Notification not allowed", e3);
                    }
                }
            }
            if (xk0VarQ.o) {
                U(applicationContext);
            }
        }
    }

    public static mc0 k() {
        return new mc0(new o53(null), 3, true, false, false, false, -1L, -1L, q40.T0(new LinkedHashSet()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] l(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final void m(Context context) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null) {
            gm0.n();
            NotificationChannel notificationChannelY = gm0.y(context.getString(R.string.homemusic_channel_name));
            notificationChannelY.setDescription(context.getString(R.string.homemusic_channel_description));
            notificationManager.createNotificationChannel(notificationChannelY);
        }
    }

    public static aa5 n(jc0 jc0Var, int i2, ArrayList arrayList, aa5 aa5Var) {
        int i3;
        int i4 = i2 == 0 ? jc0Var.m0 : jc0Var.n0;
        if (i4 != -1 && (aa5Var == null || i4 != aa5Var.b)) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                aa5 aa5Var2 = (aa5) arrayList.get(i5);
                if (aa5Var2.b == i4) {
                    if (aa5Var != null) {
                        aa5Var.c(i2, aa5Var2);
                        arrayList.remove(aa5Var);
                    }
                    aa5Var = aa5Var2;
                    break;
                }
            }
        } else if (i4 != -1) {
            return aa5Var;
        }
        if (aa5Var == null) {
            if (jc0Var instanceof ep) {
                ep epVar = (ep) jc0Var;
                int i6 = 0;
                while (true) {
                    if (i6 >= epVar.q0) {
                        i3 = -1;
                        break;
                    }
                    jc0 jc0Var2 = epVar.p0[i6];
                    if ((i2 == 0 && (i3 = jc0Var2.m0) != -1) || (i2 == 1 && (i3 = jc0Var2.n0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        aa5 aa5Var3 = (aa5) arrayList.get(i7);
                        if (aa5Var3.b == i3) {
                            aa5Var = aa5Var3;
                            break;
                        }
                    }
                }
            }
            if (aa5Var == null) {
                aa5Var = new aa5();
                aa5Var.a = new ArrayList();
                aa5Var.d = null;
                aa5Var.e = -1;
                int i8 = aa5.f;
                aa5.f = i8 + 1;
                aa5Var.b = i8;
                aa5Var.c = i2;
            }
            arrayList.add(aa5Var);
        }
        ArrayList arrayList2 = aa5Var.a;
        if (arrayList2.contains(jc0Var)) {
            return aa5Var;
        }
        arrayList2.add(jc0Var);
        if (jc0Var instanceof pk1) {
            pk1 pk1Var = (pk1) jc0Var;
            pk1Var.s0.b(pk1Var.t0 == 0 ? 1 : 0, aa5Var, arrayList);
        }
        int i9 = aa5Var.b;
        if (i2 == 0) {
            jc0Var.m0 = i9;
            jc0Var.H.b(i2, aa5Var, arrayList);
            jc0Var.J.b(i2, aa5Var, arrayList);
        } else {
            jc0Var.n0 = i9;
            jc0Var.I.b(i2, aa5Var, arrayList);
            jc0Var.L.b(i2, aa5Var, arrayList);
            jc0Var.K.b(i2, aa5Var, arrayList);
        }
        jc0Var.O.b(i2, aa5Var, arrayList);
        return aa5Var;
    }

    public static final f75 o(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            f75 f75Var = tag instanceof f75 ? (f75) tag : null;
            if (f75Var != null) {
                return f75Var;
            }
            Object objZ = au0.z(view);
            view = objZ instanceof View ? (View) objZ : null;
        }
        return null;
    }

    public static int p(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static Map q() {
        HashMap map = r;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (map != null && s >= 0 && jElapsedRealtime - s < 1000) {
            return map;
        }
        HashMap map2 = new HashMap();
        lg1 lg1Var = new lg1(10, AppDatabase.y().w());
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        for (Download download : (List) lg1Var.p) {
            if (download.getId() != null) {
                map2.put(download.getId(), download);
            }
        }
        r = map2;
        s = jElapsedRealtime;
        return map2;
    }

    public static ColorStateList r(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!u(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i2 >= 28 && i2 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = t50.a;
        try {
            return t50.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    public static ue1 s(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        ue1 ue1VarG;
        if (u(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new ue1((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                ue1VarG = ue1.g(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                ue1VarG = null;
            }
            if (ue1VarG != null) {
                return ue1VarG;
            }
        }
        return new ue1((Shader) null, (ColorStateList) null, 0);
    }

    public static Uri t(Child child) {
        Uri uriE;
        ConcurrentHashMap concurrentHashMap = ot1.a;
        child.getClass();
        Uri uriBuild = !ot1.c(child.getId()) ? null : new Uri.Builder().scheme("homemusic-hub").authority("listen").appendQueryParameter("ref", qm4.z0(child.getId(), "hub:")).build();
        if (uriBuild != null) {
            return uriBuild;
        }
        Map mapQ = q();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) mapQ).entrySet()) {
            if (((Download) entry.getValue()).getDownloadUri() != null && !((Download) entry.getValue()).getDownloadUri().isEmpty()) {
                map.put((String) entry.getKey(), ((Download) entry.getValue()).getDownloadUri());
            }
        }
        String str = (String) map.get(child.getId());
        if (str != null) {
            return Uri.parse(str);
        }
        return (ud3.o() == null || (uriE = g51.e(child)) == null) ? e03.j(0, child.getId()) : uriE;
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static kd3 v() {
        Download download;
        ss0 ss0VarW = AppDatabase.y().w();
        Set set = E().b;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pb0 pb0Var = new pb0(ss0VarW, (String) it.next(), 1);
            Thread thread = new Thread(pb0Var);
            thread.start();
            try {
                thread.join();
                download = (Download) pb0Var.q;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                download = null;
            }
            if (download != null) {
                arrayList.add(download);
            }
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        long jLongValue = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long size2 = ((Download) obj).getSize();
            jLongValue += size2 != null ? size2.longValue() : 0L;
        }
        return new kd3(numValueOf, Long.valueOf(jLongValue));
    }

    public static int w(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return v50.b(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean x(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (p == null) {
            p = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return p.booleanValue();
    }

    public static final boolean y(float f2, float f3, nc ncVar) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        nc ncVarA = pc.a();
        Path path = ncVarA.a;
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            pc.b("Invalid rectangle, make sure no value is NaN");
        }
        if (ncVarA.b == null) {
            ncVarA.b = new RectF();
        }
        RectF rectF = ncVarA.b;
        rectF.getClass();
        rectF.set(f4, f5, f6, f7);
        RectF rectF2 = ncVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        Path path2 = pc.a().a;
        Path.Op op = Path.Op.INTERSECT;
        if (!(ncVar instanceof nc)) {
            er1.l("Unable to obtain android.graphics.Path");
            return false;
        }
        path2.op(ncVar.a, path, op);
        boolean zIsEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !zIsEmpty;
    }

    public static boolean z(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (n == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            n = Boolean.valueOf(z);
        }
        return n.booleanValue();
    }
}
