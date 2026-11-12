package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.model.ReplayGain;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz3 {
    public static final String[] a = null;
    public static final ConcurrentHashMap b = null;
    public static final ConcurrentHashMap.KeySetView c = null;
    public static final ExecutorService d = null;
    public static final iz3 e = null;
    public static volatile WeakReference f;
    public static final Handler g = null;

    static {
        a = new String[]{"REPLAYGAIN_TRACK_GAIN", "REPLAYGAIN_ALBUM_GAIN", "R128_TRACK_GAIN", "R128_ALBUM_GAIN", "REPLAYGAIN_TRACK_PEAK", "REPLAYGAIN_ALBUM_PEAK"};
        b = new ConcurrentHashMap();
        c = ConcurrentHashMap.newKeySet();
        d = Executors.newFixedThreadPool(2);
        iz3 r0 = new iz3();
        r0.i = 1.0f;
        r0.j = 1.0f;
        r0.k = 1.0f;
        r0.l = false;
        r0.m = 1.0f;
        r0.n = 1.0f;
        r0.o = 1.0f;
        r0.p = 441;
        r0.q = 0;
        r0.r = false;
        r0.s = false;
        r0.t = false;
        r0.u = false;
        e = r0;
        f = new WeakReference(null);
        g = new Handler(Looper.getMainLooper());
    }

    public static boolean a(qi3 r3) {
        gn2 r0 = r3.a();
        int r1 = r3.j0();
        if (r1 != (-1)) goto L5;
        gn2 r4 = null;
    L6:
        if (r0 == null) goto L16;
        if (r4 == null) goto L18;
        do2 r5 = r4.d;
        CharSequence r2 = r0.d.c;
        if (r2 != null) goto L11;
        return false;
    L11:
        if (r5.c != null) goto L13;
        return false;
    L13:
        if (r2.toString().equals(r5.c.toString()) == false) goto L21;
        return true;
    L21:
        return false;
    L18:
        return false;
    L16:
        return false;
    L5:
        r4 = r3.Y(r1);
        goto L6
    }

    public static boolean b(qi3 r3) {
        gn2 r0 = r3.a();
        int r1 = r3.w();
        if (r1 != (-1)) goto L5;
        gn2 r4 = null;
    L6:
        if (r0 == null) goto L17;
        do2 r2 = r0.d;
        if (r4 != null) goto L10;
        return false;
    L10:
        if (r2.c == null) goto L20;
        CharSequence r5 = r4.d.c;
        if (r5 != null) goto L14;
        return false;
    L14:
        if (r5.toString().equals(r2.c.toString()) == false) goto L22;
        return true;
    L22:
        return false;
    L20:
        return false;
    L17:
        return false;
    L5:
        r4 = r3.Y(r1);
        goto L6
    }

    public static float c(float r3, float r4) {
        App.b().getClass();
        float r0 = App.c().getInt("loudness_preamp", 0) + r3;
        if (xa3.u("replay_gain_prevent_clipping", true) == false) goto L10;
        if (r4 <= 0.0f) goto L10;
        float r5 = -((float) (Math.log10(r4) * 20.0d));
        if (r0 <= r5) goto L10;
        r0 = r5;
    L10:
        return Math.max(-60.0f, Math.min(15.0f, r0));
    }

    public static ReplayGainInfo d(gn2 r2) {
        if (r2 == null) goto L15;
        do2 r3 = r2.d;
        if (r3 == null) goto L21;
        Bundle r4 = r3.I;
        if (r4 != null) goto L9;
        return null;
    L9:
        if (r4.getBoolean("rg_present", false) == false) goto L18;
        ReplayGainInfo r5 = si0.v(r4);
        if (r5 != null) goto L13;
        return null;
    L13:
        if (r5.hasAnyValue() == false) goto L20;
        return r5;
    L20:
        return null;
    L18:
        return null;
    L21:
        return null;
    L15:
        return null;
    }

    public static ArrayList e(ArrayList r14) {
        ReplayGain r0 = new ReplayGain();
        ReplayGain r1 = new ReplayGain();
        int r2 = r14.size();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L55;
        Object r5 = r14.get(r4);
        r4 = r4 + 1;
        qv2 r6 = (qv2) r5;
        if (r6 == null) goto L3;
        int r7 = 0;
    L8:
        pv2[] r8 = r6.a;
        if (r7 >= r8.length) goto L3;
        pv2 r9 = r8[r7];
        String r10 = r9.toString().toUpperCase(Locale.ROOT);
        int r11 = 0;
    L12:
        if (r11 >= 6) goto L54;
        String[] r12 = a;
        if (r10.contains(r12[r11]) == true) goto L15;
        r11 = r11 + 1;
        goto L12
    L15:
        boolean r13 = r9 instanceof ds4;
        if (r13 == false) goto L18;
    L21:
        ReplayGain r15 = r0;
    L22:
        String r16 = r9.toString();
        if ((r9 instanceof s02) == false) goto L25;
        s02 r17 = (s02) r9;
        r16 = r17.c.concat(r17.d);
    L35:
        String r18 = r16.toUpperCase(Locale.ROOT);
        if (r18.contains(r12[0]) == false) goto L39;
        r15.setTrackGain(f(r16));
    L39:
        if (r18.contains(r12[1]) == false) goto L42;
        r15.setAlbumGain(f(r16));
    L42:
        if (r18.contains(r12[2]) == false) goto L45;
        r15.setTrackGain((f(r16) / 256.0f) + 5.0f);
    L45:
        if (r18.contains(r12[3]) == false) goto L48;
        r15.setAlbumGain((f(r16) / 256.0f) + 5.0f);
    L48:
        if (r18.contains(r12[4]) == false) goto L51;
        r15.setTrackPeak(f(r16));
    L51:
        if (r18.contains(r12[5]) == false) goto L54;
        r15.setAlbumPeak(f(r16));
        goto L54
    L25:
        if (r13 == false) goto L35;
        ds4 r19 = (ds4) r9;
        yw1 r20 = r19.d;
        String r110 = r19.b;
        if (r110 != null) goto L30;
        r110 = r19.a;
    L30:
        StringBuilder r21 = xa3.i(r110);
        if (r20.isEmpty() == true) goto L33;
        String r22 = (String) r20.get(0);
    L34:
        r21.append(r22);
        r16 = r21.toString();
        goto L35
    L33:
        r22 = "";
        goto L34
    L18:
        if ((r9 instanceof s02) == true) goto L21;
        r15 = r1;
    L54:
        r7 = r7 + 1;
        goto L8
    L55:
        ArrayList r111 = new ArrayList();
        r111.add(r0);
        r111.add(r1);
        return r111;
    }

    public static float f(String r2) {
        Matcher r3 = Pattern.compile("(-?\\d+(?:\\.\\d+)?)\\s*(?:dB)?\\s*$", 2).matcher(r2.trim());     // Catch: NumberFormatException -> L11
        String r0 = null;
    L4:
        if (r3.find() == false) goto L6;
        r0 = r3.group(1);     // Catch: NumberFormatException -> L11
        goto L4
    L6:
        if (r0 == null) goto L9;
        return Float.parseFloat(r0);
    L9:
        return 0.0f;
    L15:
        return 0.0f;
    }

    public static void g(qi3 r5) {
        if (Objects.equals(ud3.z(), "disabled") == true) goto L33;
        f = new WeakReference(r5);
        int r0 = 0;
    L7:
        if (r0 >= r5.Q0()) goto L43;
        gn2 r1 = r5.Y(r0);
        if (r1.a == null) goto L32;
        if (r1.b == null) goto L32;
        Bundle r2 = r1.d.I;
        if (r2 == null) goto L16;
        String r3 = r2.getString("type");
    L18:
        if (WaveOrigin.RADIO.equals(r3) == true) goto L32;
        if (r1.a.startsWith("ir-") == true) goto L32;
        ReplayGainInfo r4 = d(r1);
        String r6 = r1.a;
        if (r4 == null) goto L29;
        if (c.add(r6) == false) goto L32;
        b.put(r1.a, o(r4));
        Log.d("ReplayGainUtil", "Prefetch skip (server RG available) " + r1.a);
        goto L32
    L29:
        if (c.add(r6) == false) goto L32;
        d.execute(new jq3(4, r1));
        goto L32
    L16:
        r3 = null;
    L32:
        r0 = r0 + 1;
        goto L7
    L43:
        return;
    }

    public static void h(qi3 r17) {
        iz3 r0 = e;
        int r1 = r17.j0();
        byte r2 = -1;
        if (r1 == (-1)) goto L71;
        gn2 r3 = r17.Y(r1);
        if (r3 == null) goto L70;
        String r4 = r3.a;
        if (r4 == null) goto L72;
        List r5 = (List) b.get(r4);
        float r10 = 0.0f;
        if (r5 != null) goto L13;
        float r6 = 0.0f;
    L42:
        if (r6 != 0.0f) goto L50;
        if (r5 != null) goto L47;
        Log.d("ReplayGainUtil", "queuePendingForNextTrack: no RG data yet for " + r4 + ", carrying over current gain");
        return;
    L47:
        float r7 = c(0.0f, 0.0f);
        r0.getClass();
        r0.j = (float) Math.pow(10.0d, ((double) Math.max(-60.0f, Math.min(15.0f, r7))) / 20.0d);
        r0.l = true;
        Log.d("ReplayGainUtil", "queuePendingForNextTrack: no RG tags for " + r4 + ", queuing preamp-only totalGain=" + r7);
        return;
    L50:
        if (Objects.equals(ud3.z(), "disabled") == true) goto L65;
        if (r5 == null) goto L65;
        if (r5.isEmpty() == true) goto L65;
        if (Objects.equals(ud3.z(), "album") == false) goto L58;
    L63:
        boolean r8 = true;
    L64:
        r10 = n(r5, r8);
        goto L65
    L58:
        if (Objects.equals(ud3.z(), "auto") == true) goto L60;
    L62:
        r8 = false;
        goto L64
    L60:
        if (a(r17) == false) goto L62;
    L65:
        float r9 = c(r6, r10);
        r0.getClass();
        r0.j = (float) Math.pow(10.0d, ((double) Math.max(-60.0f, Math.min(15.0f, r9))) / 20.0d);
        r0.l = true;
        return;
    L13:
        if (Objects.equals(ud3.z(), "disabled") == false) goto L15;
        r6 = 0.0f;
        goto L42
    L15:
        if (r5.isEmpty() == true) goto L68;
        String r11 = Objects.toString(ud3.z(), "");
        r11.getClass();
        switch(r11.hashCode()) {
            case 3005871: goto L29;
            case 92896879: goto L25;
            case 110621003: goto L21;
            default: goto L32;
        };
    L32:
        switch(r2) {
            case 0: goto L37;
            case 1: goto L35;
            case 2: goto L34;
            default: goto L69;
        };
    L34:
        r6 = m(r5);
        goto L42
    L35:
        r6 = j(r5);
        goto L42
    L69:
        r6 = 0.0f;
        goto L42
    L37:
        if (a(r17) == false) goto L39;
        r6 = j(r5);
        goto L42
    L39:
        r6 = m(r5);
        goto L42
    L21:
        if (r11.equals("track") == false) goto L32;
        r2 = 2;
        goto L32
    L25:
        if (r11.equals("album") == false) goto L32;
        r2 = 1;
        goto L32
    L29:
        if (r11.equals("auto") == false) goto L32;
        r2 = 0;
        goto L32
    L68:
        r6 = 0.0f;
        goto L42
    L72:
        return;
    L70:
        return;
    }

    public static void i(qi3 r8) {
        gn2 r0 = r8.a();
        if (r0 == null) goto L21;
        String r2 = r0.a;
        if (r2 == null) goto L21;
        ReplayGainInfo r1 = d(r0);
        iz3 r3 = e;
        if (r1 == null) goto L11;
        ArrayList r4 = o(r1);
        float r9 = c(k(r8, r4), l(r8, r4));
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: server RG for " + r2 + " totalGain=" + r9);
        r3.n(r9);
        return;
    L11:
        List r5 = (List) b.get(r2);
        if (r5 == null) goto L19;
        float r6 = k(r8, r5);
        if (r6 == 0.0f) goto L17;
        float r10 = c(r6, l(r8, r5));
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: cache hit for " + r2 + " totalGain=" + r10);
        r3.n(r10);
        return;
    L17:
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: cache hit but gain=0 for " + r2 + ", keeping current gain");
        return;
    L19:
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: no cached data for " + r2 + ", keeping current gain");
        return;
    L21:
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: no current item, skipping");
    }

    public static float j(List r4) {
        float r0 = ((ReplayGain) r4.get(0)).getAlbumGain();
        float r1 = ((ReplayGain) r4.get(1)).getAlbumGain();
        if (r0 != 0.0f) goto L7;
        r0 = r1;
    L7:
        if (r0 == 0.0f) goto L10;
        return r0;
    L10:
        return m(r4);
    }

    public static float k(qi3 r3, List r4) {
        if (Objects.equals(ud3.z(), "disabled") == false) goto L5;
        return 0.0f;
    L5:
        if (r4.isEmpty() == true) goto L36;
        String r0 = Objects.toString(ud3.z(), "");
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case 3005871: goto L19;
            case 92896879: goto L15;
            case 110621003: goto L11;
            default: goto L22;
        };
    L22:
        switch(r2) {
            case 0: goto L29;
            case 1: goto L27;
            case 2: goto L25;
            default: goto L37;
        };
    L37:
        return 0.0f;
    L25:
        return m(r4);
    L27:
        return j(r4);
    L29:
        if (b(r3) == false) goto L33;
        return j(r4);
    L33:
        return m(r4);
    L11:
        if (r0.equals("track") == false) goto L22;
        r2 = 2;
        goto L22
    L15:
        if (r0.equals("album") == false) goto L22;
        r2 = 1;
        goto L22
    L19:
        if (r0.equals("auto") == false) goto L22;
        r2 = 0;
        goto L22
    L36:
        return 0.0f;
    }

    public static float l(qi3 r2, List r3) {
        if (Objects.equals(ud3.z(), "disabled") == false) goto L5;
        return 0.0f;
    L5:
        if (r3.isEmpty() == false) goto L8;
        return 0.0f;
    L8:
        if (Objects.equals(ud3.z(), "album") == false) goto L10;
    L15:
        boolean r4 = true;
    L17:
        return n(r3, r4);
    L10:
        if (Objects.equals(ud3.z(), "auto") == true) goto L12;
    L14:
        r4 = false;
        goto L17
    L12:
        if (b(r2) == false) goto L14;
        goto L14
    }

    public static float m(List r2) {
        float r0 = ((ReplayGain) r2.get(0)).getTrackGain();
        float r3 = ((ReplayGain) r2.get(1)).getTrackGain();
        if (r0 == 0.0f) goto L5;
        return r0;
    L5:
        return r3;
    }

    public static float n(List r5, boolean r6) {
        if (r6 == false) goto L11;
        float r7 = ((ReplayGain) r5.get(0)).getAlbumPeak();
        float r3 = ((ReplayGain) r5.get(1)).getAlbumPeak();
        if (r7 != 0.0f) goto L9;
        r7 = r3;
    L9:
        if (r7 == 0.0f) goto L11;
        return r7;
    L11:
        float r8 = ((ReplayGain) r5.get(0)).getTrackPeak();
        float r9 = ((ReplayGain) r5.get(1)).getTrackPeak();
        if (r8 == 0.0f) goto L14;
        return r8;
    L14:
        return r9;
    }

    public static ArrayList o(ReplayGainInfo r3) {
        ReplayGain r0 = new ReplayGain();
        if (r3.getTrackGain() == null) goto L6;
        r0.setTrackGain(r3.getTrackGain().floatValue());
    L6:
        if (r3.getAlbumGain() == null) goto L9;
        r0.setAlbumGain(r3.getAlbumGain().floatValue());
    L9:
        if (r3.getTrackPeak() == null) goto L12;
        r0.setTrackPeak(r3.getTrackPeak().floatValue());
    L12:
        if (r3.getAlbumPeak() == null) goto L14;
        r0.setAlbumPeak(r3.getAlbumPeak().floatValue());
    L14:
        ReplayGain r1 = new ReplayGain();
        Float r4 = r3.getFallbackGain();
        if (r4 == null) goto L17;
        r1.setTrackGain(r4.floatValue());
        r1.setAlbumGain(r4.floatValue());
    L17:
        ArrayList r5 = new ArrayList();
        r5.add(r0);
        r5.add(r1);
        return r5;
    }

    public static void p(qi3 r9, jw4 r10) {
        if (r10 == null) goto L55;
        yw1 r11 = r10.a;
        if (r11.isEmpty() == true) goto L56;
        gn2 r0 = r9.a();
        if (r0 != null) goto L9;
    L12:
        ArrayList r2 = new ArrayList();
        int r4 = 0;
    L14:
        if (r4 >= r11.size()) goto L28;
        iw4 r5 = (iw4) r11.get(r4);
        if (r5 == null) goto L27;
        sv4 r6 = r5.b;
        if (r6 == null) goto L27;
        int r7 = 0;
    L22:
        if (r7 >= r6.a) goto L27;
        qv2 r8 = r5.a(r7).l;
        if (r8 == null) goto L26;
        r2.add(r8);
    L26:
        r7 = r7 + 1;
    L27:
        r4 = r4 + 1;
        goto L14
    L28:
        List r12 = e(r2);
        List r3 = null;
        if (r0 == null) goto L31;
        String r1 = r0.a;
    L32:
        ConcurrentHashMap r13 = b;
        if (r1 == null) goto L36;
        r3 = (List) r13.get(r1);
    L36:
        if (m(r12) == 0.0f) goto L38;
    L41:
        if (r1 == null) goto L43;
        r13.put(r1, r12);
        c.add(r1);
    L43:
        float r14 = k(r9, r12);
        iz3 r15 = e;
        if (r14 != 0.0f) goto L47;
        float r16 = c(0.0f, 0.0f);
        Log.d("ReplayGainUtil", "setReplayGain: no effective gain data for " + r1 + ", applying preamp-only totalGain=" + r16);
        r15.n(r16);
        h(r9);
        return;
    L47:
        r15.n(c(r14, l(r9, r12)));
        h(r9);
        return;
    L38:
        if (j(r12) != 0.0f) goto L41;
        if (r3 == null) goto L41;
        Log.d("ReplayGainUtil", "setReplayGain: extracted gains empty (seek past header?), keeping cached gains for " + r1);
        r12 = r3;
        goto L43
    L31:
        r1 = null;
        goto L32
    L9:
        if (d(r0) == null) goto L12;
        Log.d("ReplayGainUtil", "setReplayGain: server RG already applied for " + r0.a + ", ignoring tag-extracted values");
        h(r9);
        return;
    L56:
        return;
    }
}
