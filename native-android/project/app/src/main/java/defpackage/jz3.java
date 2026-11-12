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
    public static final String[] a = {"REPLAYGAIN_TRACK_GAIN", "REPLAYGAIN_ALBUM_GAIN", "R128_TRACK_GAIN", "R128_ALBUM_GAIN", "REPLAYGAIN_TRACK_PEAK", "REPLAYGAIN_ALBUM_PEAK"};
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();
    public static final ExecutorService d = Executors.newFixedThreadPool(2);
    public static final iz3 e;
    public static volatile WeakReference f;
    public static final Handler g;

    static {
        iz3 iz3Var = new iz3();
        iz3Var.i = 1.0f;
        iz3Var.j = 1.0f;
        iz3Var.k = 1.0f;
        iz3Var.l = false;
        iz3Var.m = 1.0f;
        iz3Var.n = 1.0f;
        iz3Var.o = 1.0f;
        iz3Var.p = 441;
        iz3Var.q = 0;
        iz3Var.r = false;
        iz3Var.s = false;
        iz3Var.t = false;
        iz3Var.u = false;
        e = iz3Var;
        f = new WeakReference(null);
        g = new Handler(Looper.getMainLooper());
    }

    public static boolean a(qi3 qi3Var) {
        gn2 gn2VarA = qi3Var.a();
        int iJ0 = qi3Var.j0();
        gn2 gn2VarY = iJ0 == -1 ? null : qi3Var.Y(iJ0);
        if (gn2VarA == null || gn2VarY == null) {
            return false;
        }
        do2 do2Var = gn2VarY.d;
        CharSequence charSequence = gn2VarA.d.c;
        return (charSequence == null || do2Var.c == null || !charSequence.toString().equals(do2Var.c.toString())) ? false : true;
    }

    public static boolean b(qi3 qi3Var) {
        CharSequence charSequence;
        gn2 gn2VarA = qi3Var.a();
        int iW = qi3Var.w();
        gn2 gn2VarY = iW == -1 ? null : qi3Var.Y(iW);
        if (gn2VarA == null) {
            return false;
        }
        do2 do2Var = gn2VarA.d;
        return (gn2VarY == null || do2Var.c == null || (charSequence = gn2VarY.d.c) == null || !charSequence.toString().equals(do2Var.c.toString())) ? false : true;
    }

    public static float c(float f2, float f3) {
        App.b().getClass();
        float f4 = App.c().getInt("loudness_preamp", 0) + f2;
        if (xa3.u("replay_gain_prevent_clipping", true) && f3 > 0.0f) {
            float f5 = -((float) (Math.log10(f3) * 20.0d));
            if (f4 > f5) {
                f4 = f5;
            }
        }
        return Math.max(-60.0f, Math.min(15.0f, f4));
    }

    public static ReplayGainInfo d(gn2 gn2Var) {
        do2 do2Var;
        Bundle bundle;
        ReplayGainInfo replayGainInfoV;
        if (gn2Var == null || (do2Var = gn2Var.d) == null || (bundle = do2Var.I) == null || !bundle.getBoolean("rg_present", false) || (replayGainInfoV = si0.v(bundle)) == null || !replayGainInfoV.hasAnyValue()) {
            return null;
        }
        return replayGainInfoV;
    }

    public static ArrayList e(ArrayList arrayList) {
        ReplayGain replayGain = new ReplayGain();
        ReplayGain replayGain2 = new ReplayGain();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qv2 qv2Var = (qv2) obj;
            if (qv2Var != null) {
                int i2 = 0;
                while (true) {
                    pv2[] pv2VarArr = qv2Var.a;
                    if (i2 < pv2VarArr.length) {
                        pv2 pv2Var = pv2VarArr[i2];
                        String upperCase = pv2Var.toString().toUpperCase(Locale.ROOT);
                        for (int i3 = 0; i3 < 6; i3++) {
                            String[] strArr = a;
                            if (upperCase.contains(strArr[i3])) {
                                boolean z = pv2Var instanceof ds4;
                                ReplayGain replayGain3 = (z || (pv2Var instanceof s02)) ? replayGain : replayGain2;
                                String string = pv2Var.toString();
                                if (pv2Var instanceof s02) {
                                    s02 s02Var = (s02) pv2Var;
                                    string = s02Var.c.concat(s02Var.d);
                                } else if (z) {
                                    ds4 ds4Var = (ds4) pv2Var;
                                    yw1 yw1Var = ds4Var.d;
                                    String str = ds4Var.b;
                                    if (str == null) {
                                        str = ds4Var.a;
                                    }
                                    StringBuilder sbI = xa3.i(str);
                                    sbI.append(!yw1Var.isEmpty() ? (String) yw1Var.get(0) : "");
                                    string = sbI.toString();
                                }
                                String upperCase2 = string.toUpperCase(Locale.ROOT);
                                if (upperCase2.contains(strArr[0])) {
                                    replayGain3.setTrackGain(f(string));
                                }
                                if (upperCase2.contains(strArr[1])) {
                                    replayGain3.setAlbumGain(f(string));
                                }
                                if (upperCase2.contains(strArr[2])) {
                                    replayGain3.setTrackGain((f(string) / 256.0f) + 5.0f);
                                }
                                if (upperCase2.contains(strArr[3])) {
                                    replayGain3.setAlbumGain((f(string) / 256.0f) + 5.0f);
                                }
                                if (upperCase2.contains(strArr[4])) {
                                    replayGain3.setTrackPeak(f(string));
                                }
                                if (!upperCase2.contains(strArr[5])) {
                                    break;
                                }
                                replayGain3.setAlbumPeak(f(string));
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(replayGain);
        arrayList2.add(replayGain2);
        return arrayList2;
    }

    public static float f(String str) {
        try {
            Matcher matcher = Pattern.compile("(-?\\d+(?:\\.\\d+)?)\\s*(?:dB)?\\s*$", 2).matcher(str.trim());
            String strGroup = null;
            while (matcher.find()) {
                strGroup = matcher.group(1);
            }
            if (strGroup != null) {
                return Float.parseFloat(strGroup);
            }
            return 0.0f;
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static void g(qi3 qi3Var) {
        if (Objects.equals(ud3.z(), "disabled")) {
            return;
        }
        f = new WeakReference(qi3Var);
        for (int i = 0; i < qi3Var.Q0(); i++) {
            gn2 gn2VarY = qi3Var.Y(i);
            if (gn2VarY.a != null && gn2VarY.b != null) {
                Bundle bundle = gn2VarY.d.I;
                if (!WaveOrigin.RADIO.equals(bundle != null ? bundle.getString("type") : null) && !gn2VarY.a.startsWith("ir-")) {
                    ReplayGainInfo replayGainInfoD = d(gn2VarY);
                    String str = gn2VarY.a;
                    if (replayGainInfoD != null) {
                        if (c.add(str)) {
                            b.put(gn2VarY.a, o(replayGainInfoD));
                            Log.d("ReplayGainUtil", "Prefetch skip (server RG available) " + gn2VarY.a);
                        }
                    } else if (c.add(str)) {
                        d.execute(new jq3(4, gn2VarY));
                    }
                }
            }
        }
    }

    public static void h(qi3 qi3Var) {
        gn2 gn2VarY;
        String str;
        float fM;
        iz3 iz3Var = e;
        int iJ0 = qi3Var.j0();
        if (iJ0 == -1 || (gn2VarY = qi3Var.Y(iJ0)) == null || (str = gn2VarY.a) == null) {
            return;
        }
        List list = (List) b.get(str);
        float fN = 0.0f;
        if (list != null && !Objects.equals(ud3.z(), "disabled") && !list.isEmpty()) {
            String string = Objects.toString(ud3.z(), "");
            string.getClass();
            switch (string) {
                case "auto":
                    if (!a(qi3Var)) {
                        fM = m(list);
                        break;
                    } else {
                        fM = j(list);
                        break;
                    }
                    break;
                case "album":
                    fM = j(list);
                    break;
                case "track":
                    fM = m(list);
                    break;
                default:
                    fM = 0.0f;
                    break;
            }
        } else {
            fM = 0.0f;
        }
        if (fM != 0.0f) {
            if (!Objects.equals(ud3.z(), "disabled") && list != null && !list.isEmpty()) {
                fN = n(list, Objects.equals(ud3.z(), "album") || (Objects.equals(ud3.z(), "auto") && a(qi3Var)));
            }
            float fC = c(fM, fN);
            iz3Var.getClass();
            iz3Var.j = (float) Math.pow(10.0d, ((double) Math.max(-60.0f, Math.min(15.0f, fC))) / 20.0d);
            iz3Var.l = true;
            return;
        }
        if (list == null) {
            Log.d("ReplayGainUtil", "queuePendingForNextTrack: no RG data yet for " + str + ", carrying over current gain");
            return;
        }
        float fC2 = c(0.0f, 0.0f);
        iz3Var.getClass();
        iz3Var.j = (float) Math.pow(10.0d, ((double) Math.max(-60.0f, Math.min(15.0f, fC2))) / 20.0d);
        iz3Var.l = true;
        Log.d("ReplayGainUtil", "queuePendingForNextTrack: no RG tags for " + str + ", queuing preamp-only totalGain=" + fC2);
    }

    public static void i(qi3 qi3Var) {
        String str;
        gn2 gn2VarA = qi3Var.a();
        if (gn2VarA == null || (str = gn2VarA.a) == null) {
            Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: no current item, skipping");
            return;
        }
        ReplayGainInfo replayGainInfoD = d(gn2VarA);
        iz3 iz3Var = e;
        if (replayGainInfoD != null) {
            ArrayList arrayListO = o(replayGainInfoD);
            float fC = c(k(qi3Var, arrayListO), l(qi3Var, arrayListO));
            Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: server RG for " + str + " totalGain=" + fC);
            iz3Var.n(fC);
            return;
        }
        List list = (List) b.get(str);
        if (list == null) {
            Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: no cached data for " + str + ", keeping current gain");
            return;
        }
        float fK = k(qi3Var, list);
        if (fK == 0.0f) {
            Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: cache hit but gain=0 for " + str + ", keeping current gain");
            return;
        }
        float fC2 = c(fK, l(qi3Var, list));
        Log.d("ReplayGainUtil", "reapplyCurrentTrackGain: cache hit for " + str + " totalGain=" + fC2);
        iz3Var.n(fC2);
    }

    public static float j(List list) {
        float albumGain = ((ReplayGain) list.get(0)).getAlbumGain();
        float albumGain2 = ((ReplayGain) list.get(1)).getAlbumGain();
        if (albumGain == 0.0f) {
            albumGain = albumGain2;
        }
        return albumGain != 0.0f ? albumGain : m(list);
    }

    public static float k(qi3 qi3Var, List list) {
        if (Objects.equals(ud3.z(), "disabled") || list.isEmpty()) {
            return 0.0f;
        }
        String string = Objects.toString(ud3.z(), "");
        string.getClass();
        switch (string) {
            case "auto":
                return b(qi3Var) ? j(list) : m(list);
            case "album":
                return j(list);
            case "track":
                return m(list);
            default:
                return 0.0f;
        }
    }

    public static float l(qi3 qi3Var, List list) {
        if (Objects.equals(ud3.z(), "disabled") || list.isEmpty()) {
            return 0.0f;
        }
        return n(list, Objects.equals(ud3.z(), "album") || (Objects.equals(ud3.z(), "auto") && b(qi3Var)));
    }

    public static float m(List list) {
        float trackGain = ((ReplayGain) list.get(0)).getTrackGain();
        return trackGain != 0.0f ? trackGain : ((ReplayGain) list.get(1)).getTrackGain();
    }

    public static float n(List list, boolean z) {
        if (z) {
            float albumPeak = ((ReplayGain) list.get(0)).getAlbumPeak();
            float albumPeak2 = ((ReplayGain) list.get(1)).getAlbumPeak();
            if (albumPeak == 0.0f) {
                albumPeak = albumPeak2;
            }
            if (albumPeak != 0.0f) {
                return albumPeak;
            }
        }
        float trackPeak = ((ReplayGain) list.get(0)).getTrackPeak();
        return trackPeak != 0.0f ? trackPeak : ((ReplayGain) list.get(1)).getTrackPeak();
    }

    public static ArrayList o(ReplayGainInfo replayGainInfo) {
        ReplayGain replayGain = new ReplayGain();
        if (replayGainInfo.getTrackGain() != null) {
            replayGain.setTrackGain(replayGainInfo.getTrackGain().floatValue());
        }
        if (replayGainInfo.getAlbumGain() != null) {
            replayGain.setAlbumGain(replayGainInfo.getAlbumGain().floatValue());
        }
        if (replayGainInfo.getTrackPeak() != null) {
            replayGain.setTrackPeak(replayGainInfo.getTrackPeak().floatValue());
        }
        if (replayGainInfo.getAlbumPeak() != null) {
            replayGain.setAlbumPeak(replayGainInfo.getAlbumPeak().floatValue());
        }
        ReplayGain replayGain2 = new ReplayGain();
        Float fallbackGain = replayGainInfo.getFallbackGain();
        if (fallbackGain != null) {
            replayGain2.setTrackGain(fallbackGain.floatValue());
            replayGain2.setAlbumGain(fallbackGain.floatValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(replayGain);
        arrayList.add(replayGain2);
        return arrayList;
    }

    public static void p(qi3 qi3Var, jw4 jw4Var) {
        sv4 sv4Var;
        if (jw4Var != null) {
            yw1 yw1Var = jw4Var.a;
            if (yw1Var.isEmpty()) {
                return;
            }
            gn2 gn2VarA = qi3Var.a();
            if (gn2VarA != null && d(gn2VarA) != null) {
                Log.d("ReplayGainUtil", "setReplayGain: server RG already applied for " + gn2VarA.a + ", ignoring tag-extracted values");
                h(qi3Var);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < yw1Var.size(); i++) {
                iw4 iw4Var = (iw4) yw1Var.get(i);
                if (iw4Var != null && (sv4Var = iw4Var.b) != null) {
                    for (int i2 = 0; i2 < sv4Var.a; i2++) {
                        qv2 qv2Var = iw4Var.a(i2).l;
                        if (qv2Var != null) {
                            arrayList.add(qv2Var);
                        }
                    }
                }
            }
            List listE = e(arrayList);
            String str = gn2VarA != null ? gn2VarA.a : null;
            ConcurrentHashMap concurrentHashMap = b;
            List list = str != null ? (List) concurrentHashMap.get(str) : null;
            if (m(listE) == 0.0f && j(listE) == 0.0f && list != null) {
                Log.d("ReplayGainUtil", "setReplayGain: extracted gains empty (seek past header?), keeping cached gains for " + str);
                listE = list;
            } else if (str != null) {
                concurrentHashMap.put(str, listE);
                c.add(str);
            }
            float fK = k(qi3Var, listE);
            iz3 iz3Var = e;
            if (fK != 0.0f) {
                iz3Var.n(c(fK, l(qi3Var, listE)));
                h(qi3Var);
                return;
            }
            float fC = c(0.0f, 0.0f);
            Log.d("ReplayGainUtil", "setReplayGain: no effective gain data for " + str + ", applying preamp-only totalGain=" + fC);
            iz3Var.n(fC);
            h(qi3Var);
        }
    }
}
