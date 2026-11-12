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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e03 {
    public static final Pattern a = null;
    public static final Pattern b = null;
    public static final AtomicReference c = null;

    static {
        a = Pattern.compile("&maxBitRate=\\d+");
        b = Pattern.compile("&format=\\w+");
        c = new AtomicReference();
    }

    public static void a(Download r2, String r3, String r4) {
        if (r2 == null) goto L46;
        if (r3 != null) goto L6;
        return;
    L6:
        if (r3.equals("raw") == true) goto L47;
        r2.setSuffix(r3);
        String r5 = r3.toLowerCase();
        r5.getClass();
        byte r1 = -1;
        switch(r5.hashCode()) {
            case 96323: goto L24;
            case 108272: goto L20;
            case 3145576: goto L16;
            case 3418175: goto L12;
            default: goto L27;
        };
    L27:
        Integer r6 = null;
        switch(r1) {
            case 0: goto L33;
            case 1: goto L32;
            case 2: goto L31;
            case 3: goto L30;
            default: goto L29;
        };
    L29:
        String r0 = null;
    L34:
        if (r0 == null) goto L36;
        r2.setContentType(r0);
    L36:
        r2.setSamplingRate(null);
        r2.setBitDepth(null);
        int r7 = Integer.parseInt(r4);     // Catch: NumberFormatException -> L42
        if (r7 <= 0) goto L40;
        r6 = Integer.valueOf(r7);     // Catch: NumberFormatException -> L42
    L40:
        r2.setBitrate(r6);
        return;
    L30:
        r0 = "audio/opus";
        goto L34
    L31:
        r0 = "audio/flac";
        goto L34
    L32:
        r0 = "audio/mpeg";
        goto L34
    L33:
        r0 = "audio/aac";
        goto L34
    L12:
        if (r5.equals("opus") == false) goto L27;
        r1 = 3;
        goto L27
    L16:
        if (r5.equals("flac") == false) goto L27;
        r1 = 2;
        goto L27
    L20:
        if (r5.equals("mp3") == false) goto L27;
        r1 = 1;
        goto L27
    L24:
        if (r5.equals("aac") == false) goto L27;
        r1 = 0;
        goto L27
    L47:
        return;
    }

    public static String b(int r1, String r2) {
        if (r2.equals("raw") == false) goto L5;
        return "0";
    L5:
        if (r1 != 0) goto L8;
        App.b().getClass();
        String r3 = App.c().getString("max_bitrate_mobile", "0");
        r3.getClass();
        return r3;
    L8:
        App.b().getClass();
        String r4 = App.c().getString("max_bitrate_wifi", "0");
        r4.getClass();
        return r4;
    }

    public static String c(String r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        return Html.fromHtml(r3, 63).toString().replaceAll("&#34;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "'").replaceAll("<a\\s+([^>]+)>((?:.(?!</a>))*.)</a>", "");
    }

    public static int d() {
        long r0 = SystemClock.elapsedRealtime();
        AtomicReference r2 = c;
        d03 r3 = (d03) r2.get();
        if (r3 != null) goto L5;
    L8:
        Network r4 = ((ConnectivityManager) App.a().getSystemService("connectivity")).getActiveNetwork();
        if (r4 != null) goto L11;
        NetworkCapabilities r5 = null;
    L12:
        if (r5 != null) goto L14;
        int r6 = -1;
    L21:
        d03 r7 = new d03(r6, r0);
    L23:
        if (r2.compareAndSet(r3, r7) == true) goto L24;
        if (r2.get() == r3) goto L23;
        return ((d03) r2.get()).a;
    L24:
        return r6;
    L14:
        int r8 = 1;
        if (r5.hasTransport(1) == false) goto L17;
    L16:
        r6 = r8;
        goto L21
    L17:
        r8 = 0;
        if (r5.hasTransport(0) == true) goto L16;
        r6 = -2;
        goto L21
    L11:
        r5 = ((ConnectivityManager) App.a().getSystemService("connectivity")).getNetworkCapabilities(r4);
        goto L12
    L5:
        if ((r0 - r3.b) >= 1000) goto L8;
        return r3.a;
    }

    public static Uri e(String r4) {
        StringBuilder r0 = new StringBuilder();
        pb0 r2 = new pb0(AppDatabase.y().w(), r4, 1);
        Thread r1 = new Thread(r2);
        r1.start();
        r1.join();     // Catch: InterruptedException -> L5
        Download r3 = (Download) r2.q;     // Catch: InterruptedException -> L5
    L7:
        if (r3 != null) goto L9;
    L12:
        HashMap r5 = App.f(false).f();
        r0.append(App.f(false).j());
        r0.append("download");
        if (r5.containsKey("u") == false) goto L20;
        if (r5.get("u") == null) goto L20;
        r0.append("?u=");
        String r6 = (String) r5.get("u");
        r6 = URLEncoder.encode(r6, StandardCharsets.UTF_8.toString());     // Catch: UnsupportedEncodingException -> L47
    L18:
        r0.append(r6);
    L20:
        if (r5.containsKey("p") == false) goto L25;
        if (r5.get("p") == null) goto L25;
        r0.append("&p=");
        r0.append((String) r5.get("p"));
    L25:
        if (r5.containsKey("s") == false) goto L30;
        if (r5.get("s") == null) goto L30;
        r0.append("&s=");
        r0.append((String) r5.get("s"));
    L30:
        if (r5.containsKey("t") == false) goto L35;
        if (r5.get("t") == null) goto L35;
        r0.append("&t=");
        r0.append((String) r5.get("t"));
    L35:
        if (r5.containsKey("v") == false) goto L40;
        if (r5.get("v") == null) goto L40;
        r0.append("&v=");
        r0.append((String) r5.get("v"));
    L40:
        if (r5.containsKey("c") == true) goto L42;
    L44:
        r0.append("&id=");
        r0.append(r4);
    L45:
        Log.d("MusicUtil", "getDownloadUri: " + r0);
        return Uri.parse(r0.toString());
    L42:
        if (r5.get("c") == null) goto L44;
        r0.append("&c=");
        r0.append((String) r5.get("c"));
        goto L44
    L9:
        if (r3.getDownloadUri().isEmpty() == true) goto L12;
        r0.append(r3.getDownloadUri());
    L5:
        e = move-exception;
        e.printStackTrace();
        r3 = null;
        goto L7
    }

    public static String f(Child r9) {
        boolean r1 = false;
        String r2 = "";
        if (xa3.u("audio_quality_per_item", false) == false) goto L19;
        Download r0 = (Download) ((HashMap) gi1.q()).get(r9.getId());
        if (r0 == null) goto L9;
        r9 = r0;
    L9:
        if (r9.getBitrate() == null) goto L11;
        boolean r3 = true;
    L13:
        if (r9.getSuffix() != null) goto L15;
    L17:
        if (r3 == true) goto L21;
        if (r1 == false) goto L19;
    L21:
        if (r9.getBitDepth() == null) goto L30;
        if (r9.getBitDepth().intValue() == 0) goto L30;
        StringBuilder r4 = new StringBuilder();
        r4.append(r9.getBitDepth());
        r4.append("/");
        if (r9.getSamplingRate() == null) goto L27;
        Object r5 = Integer.valueOf(r9.getSamplingRate().intValue() / 1000);
    L28:
        r4.append(r5);
        String r6 = r4.toString();
    L33:
        if (r1 == true) goto L35;
    L39:
        StringBuilder r7 = new StringBuilder("• ");
        if (r3 == false) goto L42;
        String r10 = r9.getBitrate() + "kbps";
    L43:
        r7.append(r10);
        if (r3 == false) goto L49;
        if (r6.isEmpty() == true) goto L49;
        r2 = " • ";
    L49:
        return b11.q(r7, r2, r6);
    L42:
        r10 = "";
        goto L43
    L35:
        if (r6.isEmpty() == false) goto L38;
        String r8 = r9.getSuffix();
    L37:
        r6 = r8;
        goto L39
    L38:
        StringBuilder r11 = b11.s(r6, " ");
        r11.append(r9.getSuffix());
        r8 = r11.toString();
        goto L37
    L27:
        r5 = "";
    L30:
        if (r9.getSamplingRate() == null) goto L32;
        r6 = new DecimalFormat("0.#").format(((double) r9.getSamplingRate().intValue()) / 1000.0d) + "kHz";
        goto L33
    L32:
        r6 = "";
        goto L33
    L15:
        if (r9.getSuffix().isEmpty() == true) goto L17;
        r1 = true;
        goto L17
    L11:
        r3 = false;
    L19:
        return "";
    }

    public static String g(Integer r2) {
        if (r2 == null) goto L4;
        long r0 = r2.intValue();
    L6:
        return h(Long.valueOf(r0), false);
    L4:
        r0 = 0;
        goto L6
    }

    public static String h(Long r6, boolean r7) {
        long r0 = r6.longValue();
        if (r7 == false) goto L5;
        long r1 = r0 / 1000;
        long r8 = r1 / 60;
        long r2 = r1 % 60;
    L7:
        if (r8 < 60) goto L9;
        long r4 = r8 / 60;
        return String.format(Locale.getDefault(), "%d:%02d:%02d", new Object[]{Long.valueOf(r4), Long.valueOf(r8 % 60), Long.valueOf(r2)});
    L9:
        return String.format(Locale.getDefault(), "%01d:%02d", new Object[]{Long.valueOf(r8), Long.valueOf(r2)});
    L5:
        r8 = r0 / 60;
        r2 = r0 % 60;
        goto L7
    }

    public static String i(String r2) {
        if (r2 != null) goto L4;
        return "";
    L4:
        return r2.replaceAll("&#34;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "'").replaceAll("&#xA;", "\n");
    }

    public static Uri j(int r5, String r6) {
        HashMap r1 = App.f(false).f();
        StringBuilder r2 = new StringBuilder();
        r2.append(App.f(false).j());
        r2.append("stream");
        if (r1.containsKey("u") == false) goto L10;
        if (r1.get("u") == null) goto L10;
        r2.append("?u=");
        String r0 = (String) r1.get("u");
        r0 = URLEncoder.encode(r0, StandardCharsets.UTF_8.toString());     // Catch: UnsupportedEncodingException -> L44
    L8:
        r2.append(r0);
    L10:
        if (r1.containsKey("p") == false) goto L15;
        if (r1.get("p") == null) goto L15;
        r2.append("&p=");
        r2.append((String) r1.get("p"));
    L15:
        if (r1.containsKey("s") == false) goto L20;
        if (r1.get("s") == null) goto L20;
        r2.append("&s=");
        r2.append((String) r1.get("s"));
    L20:
        if (r1.containsKey("t") == false) goto L25;
        if (r1.get("t") == null) goto L25;
        r2.append("&t=");
        r2.append((String) r1.get("t"));
    L25:
        if (r1.containsKey("v") == false) goto L30;
        if (r1.get("v") == null) goto L30;
        r2.append("&v=");
        r2.append((String) r1.get("v"));
    L30:
        if (r1.containsKey("c") == true) goto L32;
    L34:
        int r3 = d();
        String r4 = q(r3);
        String r7 = b(r3, r4);
        Log.i("MusicUtil", "DEBUG: Requesting Format: " + r4 + " at Bitrate: " + r7);
        if (ud3.U() == true) goto L38;
        r2.append("&maxBitRate=");
        r2.append(r7);
    L38:
        if (ud3.U() == true) goto L40;
        r2.append("&format=");
        r2.append(r4);
    L40:
        if (r5 <= 0) goto L42;
        r2.append("&timeOffset=");
        r2.append(r5);
    L42:
        r2.append("&id=");
        r2.append(r6);
        Log.d("MusicUtil", "getStreamUri: " + r2);
        return Uri.parse(r2.toString());
    L32:
        if (r1.get("c") == null) goto L34;
        r2.append("&c=");
        r2.append((String) r1.get("c"));
        goto L34
    }

    public static Uri k(String r6) {
        HashMap r1 = App.f(false).f();
        StringBuilder r2 = new StringBuilder();
        r2.append(App.f(false).j());
        r2.append("stream");
        if (r1.containsKey("u") == false) goto L10;
        if (r1.get("u") == null) goto L10;
        r2.append("?u=");
        String r3 = (String) r1.get("u");
        r3 = URLEncoder.encode(r3, StandardCharsets.UTF_8.toString());     // Catch: UnsupportedEncodingException -> L46
    L8:
        r2.append(r3);
    L10:
        if (r1.containsKey("p") == false) goto L15;
        if (r1.get("p") == null) goto L15;
        r2.append("&p=");
        r2.append((String) r1.get("p"));
    L15:
        if (r1.containsKey("s") == false) goto L20;
        if (r1.get("s") == null) goto L20;
        r2.append("&s=");
        r2.append((String) r1.get("s"));
    L20:
        if (r1.containsKey("t") == false) goto L25;
        if (r1.get("t") == null) goto L25;
        r2.append("&t=");
        r2.append((String) r1.get("t"));
    L25:
        if (r1.containsKey("v") == false) goto L30;
        if (r1.get("v") == null) goto L30;
        r2.append("&v=");
        r2.append((String) r1.get("v"));
    L30:
        if (r1.containsKey("c") == false) goto L35;
        if (r1.get("c") == null) goto L35;
        r2.append("&c=");
        r2.append((String) r1.get("c"));
    L35:
        if (xa3.u("audio_transcode_download_priority", false) == true) goto L42;
        r2.append("&maxBitRate=");
        String r4 = "0";
        if (l().equals("raw") == true) goto L40;
        App.b().getClass();
        r4 = App.c().getString("max_bitrate_download", "0");
        r4.getClass();
    L40:
        r2.append(r4);
    L42:
        if (xa3.u("audio_transcode_download_priority", false) == true) goto L44;
        r2.append("&format=");
        r2.append(l());
    L44:
        r2.append("&id=");
        r2.append(r6);
        Log.d("MusicUtil", "getTranscodedDownloadUri: " + r2);
        return Uri.parse(r2.toString());
    }

    public static String l() {
        App.b().getClass();
        String r0 = App.c().getString("audio_transcode_format_download", "raw");
        r0.getClass();
        return r0;
    }

    public static boolean m(bj2 r2) {
        if (r2 != null) goto L5;
    L18:
        return false;
    L5:
        if (r2.a() == null) goto L18;
        Uri r3 = r2.a().f.a;
        if (r3 != null) goto L10;
        return false;
    L10:
        String r4 = r3.getScheme();
        if ("content".equals(r4) == false) goto L13;
        return true;
    L13:
        if ("file".equals(r4) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public static boolean n(String r2) {
        if (r2.isEmpty() == true) goto L20;
        String r3 = r2.toLowerCase().trim().split("\\?")[0];
        if (r3.endsWith(".jpg") == false) goto L8;
        return true;
    L8:
        if (r3.endsWith(".jpeg") == false) goto L10;
        return true;
    L10:
        if (r3.endsWith(".png") == false) goto L12;
        return true;
    L12:
        if (r3.endsWith(".webp") == false) goto L14;
        return true;
    L14:
        if (r3.endsWith(".gif") == false) goto L16;
        return true;
    L16:
        if (r3.endsWith(".bmp") == false) goto L18;
        return true;
    L18:
        if (r3.endsWith(".svg") == false) goto L20;
        return true;
    L20:
        return false;
    }

    public static void o(List r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L9;
        List r0 = (List) r3.stream().filter(new c7(16)).collect(Collectors.toList());
        r3.clear();
        r3.addAll(r0);
        return;
    }

    public static String p(Bundle r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        String r0 = r4.getString("path");
        if (r0 == null) goto L14;
        int r1 = r0.lastIndexOf(46);
        if (r1 <= Math.max(r0.lastIndexOf(47), r0.lastIndexOf(92))) goto L14;
        if (r1 >= (r0.length() - 1)) goto L14;
        return r0.substring(r1 + 1);
    L14:
        return r4.getString("suffix");
    }

    public static String q(int r2) {
        if (r2 != (-1)) goto L5;
        return "raw";
    L5:
        if (r2 != 0) goto L8;
        App.b().getClass();
        String r3 = App.c().getString("audio_transcode_format_mobile", "raw");
        r3.getClass();
        return r3;
    L8:
        App.b().getClass();
        String r4 = App.c().getString("audio_transcode_format_wifi", "raw");
        r4.getClass();
        return r4;
    }
}
