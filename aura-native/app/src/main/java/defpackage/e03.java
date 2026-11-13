package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class e03 {
    public static final Pattern a = Pattern.compile("&maxBitRate=\\d+");
    public static final Pattern b = Pattern.compile("&format=\\w+");
    public static final AtomicReference c = new AtomicReference();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(Download download, String str, String str2) {
        String str3;
        if (download == null || str == null || str.equals("raw")) {
            return;
        }
        download.setSuffix(str);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    c2 = 0;
                    break;
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3145576:
                if (lowerCase.equals("flac")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        Integer num = null;
        switch (c2) {
            case 0:
                str3 = "audio/aac";
                break;
            case 1:
                str3 = "audio/mpeg";
                break;
            case 2:
                str3 = "audio/flac";
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                str3 = "audio/opus";
                break;
            default:
                str3 = null;
                break;
        }
        if (str3 != null) {
            download.setContentType(str3);
        }
        download.setSamplingRate(null);
        download.setBitDepth(null);
        try {
            int parseInt = Integer.parseInt(str2);
            if (parseInt > 0) {
                num = Integer.valueOf(parseInt);
            }
        } catch (NumberFormatException unused) {
        }
        download.setBitrate(num);
    }

    public static String b(int i, String str) {
        if (str.equals("raw")) {
            return "0";
        }
        if (i == 0) {
            App.b().getClass();
            String string = App.c().getString("max_bitrate_mobile", "0");
            string.getClass();
            return string;
        }
        App.b().getClass();
        String string2 = App.c().getString("max_bitrate_wifi", "0");
        string2.getClass();
        return string2;
    }

    public static String c(String str) {
        return str != null ? Html.fromHtml(str, 63).toString().replaceAll("&#34;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "'").replaceAll("<a\\s+([^>]+)>((?:.(?!</a>))*.)</a>", "") : "";
    }

    public static int d() {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicReference atomicReference = c;
        d03 d03Var = (d03) atomicReference.get();
        if (d03Var != null && elapsedRealtime - d03Var.b < 1000) {
            return d03Var.a;
        }
        Network activeNetwork = ((ConnectivityManager) App.a().getSystemService("connectivity")).getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork == null ? null : ((ConnectivityManager) App.a().getSystemService("connectivity")).getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            i = -1;
        } else {
            int i2 = 1;
            if (!networkCapabilities.hasTransport(1)) {
                i2 = 0;
                if (!networkCapabilities.hasTransport(0)) {
                    i = -2;
                }
            }
            i = i2;
        }
        d03 d03Var2 = new d03(i, elapsedRealtime);
        while (!atomicReference.compareAndSet(d03Var, d03Var2)) {
            if (atomicReference.get() != d03Var) {
                return ((d03) atomicReference.get()).a;
            }
        }
        return i;
    }

    public static Uri e(String str) {
        Download download;
        StringBuilder sb = new StringBuilder();
        pb0 pb0Var = new pb0(AppDatabase.y().w(), str, 1);
        Thread thread = new Thread(pb0Var);
        thread.start();
        try {
            thread.join();
            download = (Download) pb0Var.q;
        } catch (InterruptedException e) {
            e.printStackTrace();
            download = null;
        }
        if (download == null || download.getDownloadUri().isEmpty()) {
            HashMap f = App.f(false).f();
            sb.append(App.f(false).j());
            sb.append("download");
            if (f.containsKey("u") && f.get("u") != null) {
                sb.append("?u=");
                String str2 = (String) f.get("u");
                try {
                    str2 = URLEncoder.encode(str2, StandardCharsets.UTF_8.toString());
                } catch (UnsupportedEncodingException unused) {
                }
                sb.append(str2);
            }
            if (f.containsKey("p") && f.get("p") != null) {
                sb.append("&p=");
                sb.append((String) f.get("p"));
            }
            if (f.containsKey("s") && f.get("s") != null) {
                sb.append("&s=");
                sb.append((String) f.get("s"));
            }
            if (f.containsKey("t") && f.get("t") != null) {
                sb.append("&t=");
                sb.append((String) f.get("t"));
            }
            if (f.containsKey("v") && f.get("v") != null) {
                sb.append("&v=");
                sb.append((String) f.get("v"));
            }
            if (f.containsKey("c") && f.get("c") != null) {
                sb.append("&c=");
                sb.append((String) f.get("c"));
            }
            sb.append("&id=");
            sb.append(str);
        } else {
            sb.append(download.getDownloadUri());
        }
        Log.d("MusicUtil", "getDownloadUri: " + ((Object) sb));
        return Uri.parse(sb.toString());
    }

    public static String f(Child child) {
        String str;
        String str2;
        String sb;
        boolean z = false;
        String str3 = "";
        if (xa3.u("audio_quality_per_item", false)) {
            Download download = (Download) ((HashMap) gi1.q()).get(child.getId());
            if (download != null) {
                child = download;
            }
            boolean z2 = child.getBitrate() != null;
            if (child.getSuffix() != null && !child.getSuffix().isEmpty()) {
                z = true;
            }
            if (z2 || z) {
                if (child.getBitDepth() != null && child.getBitDepth().intValue() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(child.getBitDepth());
                    sb2.append("/");
                    sb2.append(child.getSamplingRate() != null ? Integer.valueOf(child.getSamplingRate().intValue() / 1000) : "");
                    str = sb2.toString();
                } else if (child.getSamplingRate() != null) {
                    str = new DecimalFormat("0.#").format(child.getSamplingRate().intValue() / 1000.0d) + "kHz";
                } else {
                    str = "";
                }
                if (z) {
                    if (str.isEmpty()) {
                        sb = child.getSuffix();
                    } else {
                        StringBuilder s = b11.s(str, " ");
                        s.append(child.getSuffix());
                        sb = s.toString();
                    }
                    str = sb;
                }
                StringBuilder sb3 = new StringBuilder("• ");
                if (z2) {
                    str2 = child.getBitrate() + "kbps";
                } else {
                    str2 = "";
                }
                sb3.append(str2);
                if (z2 && !str.isEmpty()) {
                    str3 = " • ";
                }
                return b11.q(sb3, str3, str);
            }
        }
        return "";
    }

    public static String g(Integer num) {
        return h(Long.valueOf(num != null ? num.intValue() : 0L), false);
    }

    public static String h(Long l, boolean z) {
        long j;
        long j2;
        long longValue = l.longValue();
        if (z) {
            long j3 = longValue / 1000;
            j = j3 / 60;
            j2 = j3 % 60;
        } else {
            j = longValue / 60;
            j2 = longValue % 60;
        }
        if (j < 60) {
            return String.format(Locale.getDefault(), "%01d:%02d", Long.valueOf(j), Long.valueOf(j2));
        }
        return String.format(Locale.getDefault(), "%d:%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60), Long.valueOf(j2));
    }

    public static String i(String str) {
        return str != null ? str.replaceAll("&#34;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "'").replaceAll("&#xA;", "\n") : "";
    }

    public static Uri j(int i, String str) {
        HashMap f = App.f(false).f();
        StringBuilder sb = new StringBuilder();
        sb.append(App.f(false).j());
        sb.append("stream");
        if (f.containsKey("u") && f.get("u") != null) {
            sb.append("?u=");
            String str2 = (String) f.get("u");
            try {
                str2 = URLEncoder.encode(str2, StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(str2);
        }
        if (f.containsKey("p") && f.get("p") != null) {
            sb.append("&p=");
            sb.append((String) f.get("p"));
        }
        if (f.containsKey("s") && f.get("s") != null) {
            sb.append("&s=");
            sb.append((String) f.get("s"));
        }
        if (f.containsKey("t") && f.get("t") != null) {
            sb.append("&t=");
            sb.append((String) f.get("t"));
        }
        if (f.containsKey("v") && f.get("v") != null) {
            sb.append("&v=");
            sb.append((String) f.get("v"));
        }
        if (f.containsKey("c") && f.get("c") != null) {
            sb.append("&c=");
            sb.append((String) f.get("c"));
        }
        int d = d();
        String q = q(d);
        String b2 = b(d, q);
        Log.i("MusicUtil", "DEBUG: Requesting Format: " + q + " at Bitrate: " + b2);
        if (!ud3.U()) {
            sb.append("&maxBitRate=");
            sb.append(b2);
        }
        if (!ud3.U()) {
            sb.append("&format=");
            sb.append(q);
        }
        if (i > 0) {
            sb.append("&timeOffset=");
            sb.append(i);
        }
        sb.append("&id=");
        sb.append(str);
        Log.d("MusicUtil", "getStreamUri: " + ((Object) sb));
        return Uri.parse(sb.toString());
    }

    public static Uri k(String str) {
        HashMap f = App.f(false).f();
        StringBuilder sb = new StringBuilder();
        sb.append(App.f(false).j());
        sb.append("stream");
        if (f.containsKey("u") && f.get("u") != null) {
            sb.append("?u=");
            String str2 = (String) f.get("u");
            try {
                str2 = URLEncoder.encode(str2, StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(str2);
        }
        if (f.containsKey("p") && f.get("p") != null) {
            sb.append("&p=");
            sb.append((String) f.get("p"));
        }
        if (f.containsKey("s") && f.get("s") != null) {
            sb.append("&s=");
            sb.append((String) f.get("s"));
        }
        if (f.containsKey("t") && f.get("t") != null) {
            sb.append("&t=");
            sb.append((String) f.get("t"));
        }
        if (f.containsKey("v") && f.get("v") != null) {
            sb.append("&v=");
            sb.append((String) f.get("v"));
        }
        if (f.containsKey("c") && f.get("c") != null) {
            sb.append("&c=");
            sb.append((String) f.get("c"));
        }
        if (!xa3.u("audio_transcode_download_priority", false)) {
            sb.append("&maxBitRate=");
            String str3 = "0";
            if (!l().equals("raw")) {
                App.b().getClass();
                str3 = App.c().getString("max_bitrate_download", "0");
                str3.getClass();
            }
            sb.append(str3);
        }
        if (!xa3.u("audio_transcode_download_priority", false)) {
            sb.append("&format=");
            sb.append(l());
        }
        sb.append("&id=");
        sb.append(str);
        Log.d("MusicUtil", "getTranscodedDownloadUri: " + ((Object) sb));
        return Uri.parse(sb.toString());
    }

    public static String l() {
        App.b().getClass();
        String string = App.c().getString("audio_transcode_format_download", "raw");
        string.getClass();
        return string;
    }

    public static boolean m(bj2 bj2Var) {
        Uri uri;
        if (bj2Var == null || bj2Var.a() == null || (uri = bj2Var.a().f.a) == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return "content".equals(scheme) || "file".equals(scheme);
    }

    public static boolean n(String str) {
        if (!str.isEmpty()) {
            String str2 = str.toLowerCase().trim().split("\\?")[0];
            if (str2.endsWith(".jpg") || str2.endsWith(".jpeg") || str2.endsWith(".png") || str2.endsWith(".webp") || str2.endsWith(".gif") || str2.endsWith(".bmp") || str2.endsWith(".svg")) {
                return true;
            }
        }
        return false;
    }

    public static void o(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = (List) list.stream().filter(new c7(16)).collect(Collectors.toList());
        list.clear();
        list.addAll(list2);
    }

    public static String p(Bundle bundle) {
        int lastIndexOf;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("path");
        return (string == null || (lastIndexOf = string.lastIndexOf(46)) <= Math.max(string.lastIndexOf(47), string.lastIndexOf(92)) || lastIndexOf >= string.length() + (-1)) ? bundle.getString("suffix") : string.substring(lastIndexOf + 1);
    }

    public static String q(int i) {
        if (i == -1) {
            return "raw";
        }
        if (i == 0) {
            App.b().getClass();
            String string = App.c().getString("audio_transcode_format_mobile", "raw");
            string.getClass();
            return string;
        }
        App.b().getClass();
        String string2 = App.c().getString("audio_transcode_format_wifi", "raw");
        string2.getClass();
        return string2;
    }
}
