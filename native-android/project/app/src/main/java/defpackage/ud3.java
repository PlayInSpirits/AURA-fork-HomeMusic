package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.versionedparcelable.ParcelImpl;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubMix;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.homemusic.WaveTrack;
import com.google.gson.reflect.TypeToken;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ud3 {
    public static final f01 a = new f01(1, "CLOSED");
    public static final Object b = new Object();
    public static final int[] c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static Map A() {
        String strM = b11.m("resume_points", null);
        if (strM != null) {
            try {
                if (!qm4.u0(strM)) {
                    Map map = (Map) new nk1().f(strM, new TypeToken<Map<String, sp3>>() { // from class: com.eddyizm.tempus.util.Preferences$getResumePoints$1
                    }.getType());
                    return map == null ? new LinkedHashMap() : map;
                }
            } catch (Exception unused) {
                return new LinkedHashMap();
            }
        }
        return new LinkedHashMap();
    }

    public static final void A0(boolean z) {
        xa3.t("sync_starred_tracks_for_offline_use", z);
    }

    public static final String B() {
        return b11.m("salt", null);
    }

    public static final void B0(int i) {
        App.b().getClass();
        App.c().edit().putString("streaming_cache_storage", String.valueOf(i)).apply();
    }

    public static final int C() {
        App.b().getClass();
        String string = App.c().getString("selected_equalizer", "0");
        string.getClass();
        return Integer.parseInt(string);
    }

    public static final void C0(String str) {
        App.b().getClass();
        App.c().edit().putString("token", str).apply();
    }

    public static final String D() {
        return b11.m("server", null);
    }

    public static final void D0(String str) {
        App.b().getClass();
        App.c().edit().putString("user", str).apply();
    }

    public static final String E() {
        return b11.m("server_id", null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public static void E0(View view, HubMixToday hubMixToday) {
        String string;
        String string2;
        Resources resources = view.getResources();
        HubMix mix = hubMixToday != null ? hubMixToday.getMix() : null;
        TextView textView = (TextView) view.findViewById(R.id.homemusic_mix_title);
        if (mix == null || (string = mix.getTitle()) == null) {
            string = resources.getString(R.string.homemusic_mix_title);
            string.getClass();
        } else {
            if (qm4.u0(string)) {
                string = null;
            }
            if (string == null) {
                string = resources.getString(R.string.homemusic_mix_title);
                string.getClass();
            }
        }
        textView.setText(string);
        TextView textView2 = (TextView) view.findViewById(R.id.homemusic_mix_subtitle);
        Resources resources2 = view.getResources();
        HubMix mix2 = hubMixToday != null ? hubMixToday.getMix() : null;
        if (hubMixToday == null) {
            string2 = resources2.getString(R.string.homemusic_mix_title);
            string2.getClass();
        } else if (mix2 != null) {
            String string3 = resources2.getString(R.string.homemusic_mix_title);
            if (mix2.getTitle() == null) {
                string3 = null;
            }
            string2 = q40.B0(ti.i0(new String[]{string3, resources2.getQuantityString(R.plurals.homemusic_mix_songs, mix2.getTotal(), Integer.valueOf(mix2.getTotal()))}), " · ", null, null, null, 62);
        } else if (hubMixToday.getBuilding()) {
            string2 = resources2.getString(R.string.homemusic_mix_building);
            string2.getClass();
        } else if (hubMixToday.getOnboarding()) {
            string2 = resources2.getString(R.string.homemusic_mix_onboarding);
            string2.getClass();
        } else {
            string2 = resources2.getString(R.string.homemusic_mix_none);
            string2.getClass();
        }
        textView2.setText(string2);
        View viewFindViewById = view.findViewById(R.id.homemusic_mix_play);
        List<WaveTrack> tracks = mix != null ? mix.getTracks() : null;
        viewFindViewById.setVisibility((tracks == null || tracks.isEmpty()) ? 8 : 0);
    }

    public static final long F() {
        App.b().getClass();
        String string = App.c().getString("streaming_cache_size", "256");
        string.getClass();
        return Long.parseLong(string);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static th4 F0(l51 l51Var, boolean z, boolean z2) {
        th4 th4Var;
        int i;
        long jU;
        int i2;
        long j;
        int i3;
        int[] iArr;
        long length = l51Var.getLength();
        long j2 = -1;
        int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i4 != 0 && length <= 4096) {
            j3 = length;
        }
        int i5 = (int) j3;
        be3 be3Var = new be3(64);
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            if (i7 < i5) {
                be3Var.K(8);
                boolean z4 = true;
                if (l51Var.e(be3Var.a, i6, 8, true)) {
                    long jC = be3Var.C();
                    int iM = be3Var.m();
                    if (jC == 1) {
                        j2 = j2;
                        l51Var.n(be3Var.a, 8, 8);
                        i2 = 16;
                        be3Var.M(16);
                        jU = be3Var.u();
                    } else {
                        j2 = j2;
                        if (jC == 0) {
                            long length2 = l51Var.getLength();
                            if (length2 != j2) {
                                jC = (length2 - l51Var.f()) + 8;
                            }
                        }
                        jU = jC;
                        i2 = 8;
                    }
                    long j4 = i2;
                    if (jU < j4) {
                        th4Var = null;
                        if (iM != 1718773093 || i2 != 8) {
                            return new dl(iM, i2, jU);
                        }
                        jU = j4;
                    } else {
                        th4Var = null;
                    }
                    int i8 = i7 + i2;
                    if (iM == 1836019574) {
                        i5 += (int) jU;
                        if (i4 != 0 && i5 > length) {
                            i5 = (int) length;
                        }
                        i7 = i8;
                        i6 = 0;
                    } else {
                        if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                            j = length;
                            i3 = 0;
                            i7 = i8;
                        } else if (iM == 1836019558 || iM == 1836475768) {
                            i = 1;
                        } else {
                            if (iM == 1835295092) {
                                z3 = true;
                            }
                            if (iM != 1937007212 || jU <= 1000000) {
                                j = length;
                                if ((((long) i8) + jU) - j4 < i5) {
                                    int i9 = (int) (jU - j4);
                                    i7 = i8 + i9;
                                    if (iM != 1718909296) {
                                        i3 = 0;
                                        if (i9 != 0) {
                                            l51Var.g(i9);
                                        }
                                    } else {
                                        if (i9 < 8) {
                                            return new dl(iM, 8, i9);
                                        }
                                        be3Var.K(i9);
                                        i3 = 0;
                                        l51Var.n(be3Var.a, 0, i9);
                                        int iM2 = be3Var.m();
                                        if (P(iM2, z2)) {
                                            z3 = true;
                                        }
                                        be3Var.O(4);
                                        int iA = be3Var.a() / 4;
                                        if (!z3 && iA > 0) {
                                            iArr = new int[iA];
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= iA) {
                                                    z4 = z3;
                                                    break;
                                                }
                                                int iM3 = be3Var.m();
                                                iArr[i10] = iM3;
                                                if (P(iM3, z2)) {
                                                    break;
                                                }
                                                i10++;
                                            }
                                        } else {
                                            z4 = z3;
                                            iArr = th4Var;
                                        }
                                        if (!z4) {
                                            return new x7(iArr, iM2);
                                        }
                                        z3 = z4;
                                    }
                                }
                            }
                            i = 0;
                        }
                        i6 = i3;
                        length = j;
                    }
                }
                if (!z3) {
                    return rv2.t;
                }
                if (z != i) {
                    return i != 0 ? ox1.p : ox1.q;
                }
                return th4Var;
            }
            th4Var = null;
            i = i6;
            if (!z3) {
                return rv2.t;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return th4Var;
        }
    }

    public static final int G() {
        App.b().getClass();
        String string = App.c().getString("streaming_cache_storage", "0");
        string.getClass();
        return Integer.parseInt(string);
    }

    public static void G0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            r50.v(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final String H() {
        String strM = b11.m("theme", "default");
        return strM == null ? "default" : strM;
    }

    public static final void H0() {
        String strV = h12.c(u(), D()) ? v() : D();
        App.b().getClass();
        App.c().edit().putString("in_use_server_address", strV).apply();
    }

    public static final int I() {
        String strM = b11.m("tile_size", "2");
        Integer num = null;
        Integer numL0 = strM != null ? xm4.l0(strM) : null;
        if (numL0 != null) {
            int iIntValue = numL0.intValue();
            if (2 <= iIntValue && iIntValue < 7) {
                num = numL0;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 2;
    }

    public static String I0(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? xa3.h("CornerRadius.circular(", gh0.F(Float.intBitsToFloat(i)), ")") : f34.h("CornerRadius.elliptical(", gh0.F(Float.intBitsToFloat(i)), ", ", gh0.F(Float.intBitsToFloat(i2)), ")");
    }

    public static final String J() {
        return b11.m("token", null);
    }

    public static final Object J0(ne0 ne0Var, Object obj, Object obj2, wf1 wf1Var, vd0 vd0Var) {
        Object objInvoke;
        Object objR = te5.R(ne0Var, obj2);
        try {
            lk4 lk4Var = new lk4(vd0Var, ne0Var);
            if (wf1Var == null) {
                objInvoke = ya4.Q(wf1Var, obj, lk4Var);
            } else {
                jz4.j(2, wf1Var);
                objInvoke = wf1Var.invoke(obj, lk4Var);
            }
            te5.K(ne0Var, objR);
            if (objInvoke == xe0.n) {
                vd0Var.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            te5.K(ne0Var, objR);
            throw th;
        }
    }

    public static final String K() {
        return b11.m("user", null);
    }

    public static void K0(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        parcel.writeBundle(bundle);
        S0(parcel, iR0);
    }

    public static u45 L(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ud3.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).n;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void L0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        parcel.writeByteArray(bArr);
        S0(parcel, iR0);
    }

    public static void M(nc1 nc1Var, String str, jj1 jj1Var) {
        yf0 yf0VarD;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new uh1(str));
        List<xf0> listQ0 = q40.Q0(arrayList);
        kh1 kh1Var = new kh1(listQ0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        Executor executorW = w(nc1Var);
        executorW.getClass();
        wo0 wo0Var = new wo0(jj1Var, nc1Var);
        zg5 zg5Var = new zg5(nc1Var);
        if (kh1Var != "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL") {
            for (xf0 xf0Var : listQ0) {
            }
            int i = Build.VERSION.SDK_INT;
            yf0VarD = null;
            if (i >= 34) {
                bg0 bg0Var = new bg0((nc1) zg5Var.n);
                yf0VarD = bg0Var.isAvailableOnDevice() ? bg0Var : null;
                if (yf0VarD == null) {
                    yf0VarD = zg5Var.D();
                }
            } else if (i <= 33) {
                yf0VarD = zg5Var.D();
            }
        } else {
            yf0VarD = zg5Var.D();
        }
        yf0 yf0Var = yf0VarD;
        if (yf0Var == null) {
            wo0Var.F(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            yf0Var.onGetCredential(nc1Var, kh1Var, cancellationSignal, executorW, wo0Var);
        }
    }

    public static void M0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        S0(parcel, iR0);
    }

    public static int N(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        kf2.n(f34.f(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static void N0(Map map) {
        App.b().getClass();
        SharedPreferences.Editor editorEdit = App.c().edit();
        nk1 nk1Var = new nk1();
        if (map.size() > 200) {
            List<Map.Entry> listL0 = q40.L0(q40.K0(map.entrySet(), new jb2(2)), 200);
            map.clear();
            for (Map.Entry entry : listL0) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        editorEdit.putString("resume_points", nk1Var.j(map)).apply();
    }

    public static final boolean O() {
        App.b().getClass();
        SharedPreferences sharedPreferencesC = App.c();
        if (sharedPreferencesC.contains("auto_download_lyrics")) {
            return sharedPreferencesC.getBoolean("auto_download_lyrics", false);
        }
        return false;
    }

    public static void O0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        parcel.writeString(str);
        S0(parcel, iR0);
    }

    public static boolean P(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (c[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static void P0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        S0(parcel, iR0);
    }

    public static final boolean Q() {
        return xa3.u("dark_theme_black", false);
    }

    public static void Q0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iR0 = R0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        S0(parcel, iR0);
    }

    public static final boolean R() {
        return xa3.u("data_saving_mode", false);
    }

    public static int R0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final boolean S() {
        return xa3.u("dynamic_color_accent", true);
    }

    public static void S0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final boolean T() {
        App.b().getClass();
        return App.c().getLong("last_instant_mix", 0L) + 10000 < System.currentTimeMillis();
    }

    public static void T0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final boolean U() {
        return xa3.u("audio_transcode_priority", false);
    }

    public static final boolean V() {
        return xa3.u("share", false);
    }

    public static final boolean W() {
        return xa3.u("sync_starred_artists_for_offline_use", false);
    }

    public static final boolean X() {
        return xa3.u("sync_starred_tracks_for_offline_use", false);
    }

    public static final boolean Y() {
        return xa3.u("queue_syncing", false);
    }

    public static String Z(String str) {
        Object next;
        String string;
        fb2 fb2Var = new fb2(str);
        do {
            if (!fb2Var.hasNext()) {
                next = null;
                break;
            }
            next = fb2Var.next();
        } while (!xm4.k0((String) next, "LOCATION:", true));
        String str2 = (String) next;
        if (str2 == null || (string = qm4.K0(qm4.E0(str2, ':')).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static final boolean a(pu0 pu0Var, long j) {
        if (!pu0Var.n.A) {
            return false;
        }
        iz1 iz1Var = (iz1) j51.O(pu0Var).Q.d;
        if (!iz1Var.n0.A) {
            return false;
        }
        long jK0 = iz1Var.K0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK0 & 4294967295L));
        long j2 = pu0Var.D;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static double[] a0(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    public static void b(long j, tv tvVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            kf2.n("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((yw) arrayList4.get(i8)).d() < i7) {
                kf2.n("Failed requirement.");
                return;
            }
        }
        yw ywVar = (yw) arrayList.get(i2);
        yw ywVar2 = (yw) arrayList4.get(i3 - 1);
        if (i7 == ywVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            yw ywVar3 = (yw) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            ywVar = ywVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (ywVar.i(i7) == ywVar2.i(i7)) {
            int iMin = Math.min(ywVar.d(), ywVar2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && ywVar.i(i11) == ywVar2.i(i11); i11++) {
                i10++;
            }
            long j3 = (tvVar.o / 4) + j + 2 + ((long) i10) + 1;
            tvVar.b0(-i10);
            tvVar.b0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                tvVar.b0(ywVar.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((yw) arrayList4.get(i4)).d()) {
                    tvVar.b0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    kf2.o("Check failed.");
                    return;
                }
            }
            tv tvVar2 = new tv();
            tvVar.b0(((int) ((tvVar2.o / 4) + j3)) * (-1));
            b(j3, tvVar2, i12, arrayList4, i4, i3, arrayList5);
            tvVar.p(tvVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((yw) arrayList4.get(i14 - 1)).i(i7) != ((yw) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j4 = (tvVar.o / 4) + j + 2 + ((long) (i13 * 2));
        tvVar.b0(i13);
        tvVar.b0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((yw) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || i16 != ((yw) arrayList4.get(i15 - 1)).i(i7)) {
                tvVar.b0(i16 & 255);
            }
        }
        tv tvVar3 = new tv();
        int i17 = i4;
        while (i17 < i3) {
            byte bI = ((yw) arrayList4.get(i17)).i(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (bI != ((yw) arrayList4.get(i19)).i(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((yw) arrayList4.get(i17)).d()) {
                tvVar.b0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                tvVar.b0(((int) ((tvVar3.o / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                b(j2, tvVar3, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        tvVar.p(tvVar3);
    }

    public static final ArrayList b0(Map map, if1 if1Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            z13 z13Var = (z13) entry.getValue();
            Boolean boolValueOf = z13Var != null ? Boolean.valueOf(z13Var.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !z13Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) if1Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int c(Context context, String str) {
        if (str == null) {
            nz2.n("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new x63(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static List c0(lg4 lg4Var, int i, lg4 lg4Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iU = lg4Var.u(i);
        int i2 = i + iU;
        int iF = lg4Var.f(i);
        int iF2 = lg4Var.f(i2);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (lg4Var.b[(lg4Var.r(i) * 5) + 1] & 201326592) != 0;
        lg4Var2.w(iU);
        lg4Var2.x(i3, lg4Var2.t);
        if (lg4Var.g < i2) {
            lg4Var.B(i2);
        }
        if (lg4Var.k < iF2) {
            lg4Var.C(iF2, i2);
        }
        int[] iArr = lg4Var2.b;
        int i4 = lg4Var2.t;
        int i5 = i4 * 5;
        ti.Y(i5, i * 5, i2 * 5, lg4Var.b, iArr);
        Object[] objArr = lg4Var2.c;
        int i6 = lg4Var2.i;
        System.arraycopy(lg4Var.c, iF, objArr, i6, i3);
        int i7 = lg4Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iU;
        int iG = i6 - lg4Var2.g(iArr, i4);
        int i10 = lg4Var2.m;
        int i11 = lg4Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = lg4.i(lg4Var2.g(iArr, i13) + iG, i12 < i13 ? 0 : lg4Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        lg4Var2.m = i12;
        int iA = kg4.a(lg4Var.d, i, lg4Var.p());
        int iA2 = kg4.a(lg4Var.d, i2, lg4Var.p());
        if (iA < iA2) {
            ArrayList arrayList = lg4Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i15 = iA; i15 < iA2; i15++) {
                mg1 mg1Var = (mg1) arrayList.get(i15);
                mg1Var.a += i8;
                arrayList2.add(mg1Var);
            }
            lg4Var2.d.addAll(kg4.a(lg4Var2.d, lg4Var2.t, lg4Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = u01.n;
        }
        if (!list.isEmpty()) {
            HashMap map = lg4Var.e;
            HashMap map2 = lg4Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = lg4Var2.v;
        lg4Var2.O(i7);
        int iE = lg4Var.E(lg4Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                lg4Var.P();
                lg4Var.a(iE - lg4Var.t);
                lg4Var.P();
            }
            lg4Var.a(i - lg4Var.t);
            boolean zH = lg4Var.H();
            if (z7) {
                lg4Var.M();
                lg4Var.j();
                lg4Var.M();
                lg4Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = lg4Var.I(i, iU);
            lg4Var.J(iF, i3, i - 1);
            z4 = zI;
        }
        if (z4) {
            l80.a("Unexpectedly removed anchors");
        }
        int i18 = lg4Var2.o;
        int i19 = iArr3[i5 + 1];
        lg4Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            lg4Var2.t = i9;
            lg4Var2.i = i6 + i3;
        }
        if (z6) {
            lg4Var2.T(i7);
        }
        return list;
    }

    public static final kd3 d(hu2 hu2Var) {
        Charset charset = w10.a;
        if (hu2Var != null) {
            Charset charsetA = hu2.a(hu2Var);
            if (charsetA == null) {
                try {
                    hu2Var = ve5.a(hu2Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    hu2Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new kd3(charset, hu2Var);
    }

    public static String d0(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (si0.l(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (si0.l(context, str) == 0) {
                return str;
            }
        }
        tb4.e(xa3.h("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(z34 z34Var, Throwable th) {
        boolean zIsTerminated;
        if (z34Var != 0) {
            if (th != null) {
                try {
                    xa3.o(z34Var);
                    return;
                } catch (Throwable th2) {
                    j51.d(th, th2);
                    return;
                }
            }
            if (z34Var instanceof AutoCloseable) {
                z34Var.close();
                return;
            }
            if (!(z34Var instanceof ExecutorService)) {
                if (z34Var instanceof TypedArray) {
                    ((TypedArray) z34Var).recycle();
                    return;
                }
                if (z34Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) z34Var).release();
                    return;
                } else if (z34Var instanceof MediaDrm) {
                    ((MediaDrm) z34Var).release();
                    return;
                } else {
                    nz2.c();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) z34Var;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Map e0(String str, String str2) {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(false);
            Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str))).getDocumentElement();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            documentElement.getClass();
            f(documentElement, str2, linkedHashMap);
            return linkedHashMap;
        } catch (Exception unused) {
            return v01.n;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[SYNTHETIC] */
    public static void f(Element element, String str, LinkedHashMap linkedHashMap) {
        String textContent;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            Element element2 = nodeItem instanceof Element ? (Element) nodeItem : null;
            if (element2 != null) {
                String tagName = element2.getTagName();
                tagName.getClass();
                String strE0 = qm4.E0(tagName, ':');
                Iterable iterableG0 = gb.g0(0, element2.getChildNodes().getLength());
                if (!(iterableG0 instanceof Collection) || !((Collection) iterableG0).isEmpty()) {
                    Iterator it = iterableG0.iterator();
                    while (true) {
                        if (((i02) it).p) {
                            if (element2.getChildNodes().item(((b02) it).nextInt()) instanceof Element) {
                                f(element2, str, linkedHashMap);
                            }
                        } else if (strE0.equals(str.concat("Response"))) {
                            textContent = element2.getTextContent();
                            if (textContent == null) {
                                textContent = "";
                            }
                            linkedHashMap.put(strE0, textContent);
                        }
                    }
                } else if (strE0.equals(str.concat("Response"))) {
                    textContent = element2.getTextContent();
                    if (textContent == null) {
                        textContent = "";
                    }
                    linkedHashMap.put(strE0, textContent);
                }
            }
        }
    }

    public static void f0(nc1 nc1Var, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                kf2.n(b11.q(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        nc1Var.requestPermissions(strArr, i);
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    public static final zs4 g0(zs4 zs4Var, r62 r62Var) {
        long j;
        cs4 cs4Var;
        int i;
        int i2;
        qs4 qs4Var;
        ij4 ij4Var = zs4Var.a;
        as4 as4Var = jj4.d;
        as4 as4Var2 = ij4Var.a;
        if (as4Var2.equals(rv2.F)) {
            as4Var2 = jj4.d;
        }
        as4 as4Var3 = as4Var2;
        long j2 = ij4Var.b;
        ct4[] ct4VarArr = bt4.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = jj4.a;
        }
        long j3 = j2;
        gb1 gb1Var = ij4Var.c;
        if (gb1Var == null) {
            gb1Var = gb1.p;
        }
        gb1 gb1Var2 = gb1Var;
        eb1 eb1Var = ij4Var.d;
        eb1 eb1Var2 = new eb1(eb1Var != null ? eb1Var.a : 0);
        fb1 fb1Var = ij4Var.e;
        fb1 fb1Var2 = new fb1(fb1Var != null ? fb1Var.a : 65535);
        vk0 vk0Var = ij4Var.f;
        if (vk0Var == null) {
            vk0Var = vk0.a;
        }
        vk0 vk0Var2 = vk0Var;
        String str = ij4Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = ij4Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = jj4.b;
        }
        long j5 = j4;
        hr hrVar = ij4Var.i;
        float f = hrVar != null ? hrVar.a : 0.0f;
        hr hrVar2 = new hr(Float.isNaN(f) ? 0.0f : f);
        bs4 bs4Var = ij4Var.j;
        if (bs4Var == null) {
            bs4Var = bs4.c;
        }
        bs4 bs4Var2 = bs4Var;
        vd2 vd2VarM = ij4Var.k;
        if (vd2VarM == null) {
            vd2 vd2Var = vd2.p;
            vd2VarM = fh0.m();
        }
        vd2 vd2Var2 = vd2VarM;
        long j6 = ij4Var.l;
        if (j6 == 16) {
            j6 = jj4.c;
        }
        long j7 = j6;
        sr4 sr4Var = ij4Var.m;
        if (sr4Var == null) {
            sr4Var = sr4.b;
        }
        sr4 sr4Var2 = sr4Var;
        xb4 xb4Var = ij4Var.n;
        if (xb4Var == null) {
            xb4Var = xb4.d;
        }
        xb4 xb4Var2 = xb4Var;
        q05 q05Var = ij4Var.o;
        if (q05Var == null) {
            q05Var = c71.d;
        }
        ij4 ij4Var2 = new ij4(as4Var3, j3, gb1Var2, eb1Var2, fb1Var2, vk0Var2, str2, j5, hrVar2, bs4Var2, vd2Var2, j7, sr4Var2, xb4Var2, q05Var);
        sd3 sd3Var = zs4Var.b;
        int i3 = td3.b;
        int i4 = sd3Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = sd3Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = r62Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        er1.n();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = sd3Var.c;
            if ((j & 1095216660480L) == 0) {
                j = td3.a;
            }
            cs4Var = sd3Var.d;
            if (cs4Var == null) {
                cs4Var = cs4.c;
            }
            zg3 zg3Var = sd3Var.e;
            ra2 ra2Var = sd3Var.f;
            i = sd3Var.g;
            if (i == 0) {
                i = ma2.b;
            }
            i2 = sd3Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            qs4Var = sd3Var.i;
            if (qs4Var == null) {
                qs4Var = qs4.c;
            }
            return new zs4(ij4Var2, new sd3(i4, i6, j, cs4Var, zg3Var, ra2Var, i, i2, qs4Var), zs4Var.c);
        }
        int iOrdinal2 = r62Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            er1.n();
            return null;
        }
        i6 = i5;
        j = sd3Var.c;
        if ((j & 1095216660480L) == 0) {
            j = td3.a;
        }
        cs4Var = sd3Var.d;
        if (cs4Var == null) {
            cs4Var = cs4.c;
        }
        zg3 zg3Var2 = sd3Var.e;
        ra2 ra2Var2 = sd3Var.f;
        i = sd3Var.g;
        if (i == 0) {
            i = ma2.b;
        }
        i2 = sd3Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        qs4Var = sd3Var.i;
        if (qs4Var == null) {
            qs4Var = qs4.c;
        }
        return new zs4(ij4Var2, new sd3(i4, i6, j, cs4Var, zg3Var2, ra2Var2, i, i2, qs4Var), zs4Var.c);
    }

    public static String h(String str) {
        str.getClass();
        return xm4.i0(xm4.i0(xm4.i0(xm4.i0(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;");
    }

    public static final void h0(String str) {
        App.b().getClass();
        App.c().edit().putString("client_cert", str).apply();
    }

    public static final int i(int i, nc3 nc3Var, Object obj) {
        if (obj != null && nc3Var.b() != 0 && (i >= nc3Var.b() || !obj.equals(nc3Var.c(i)))) {
            p03 p03Var = (p03) nc3Var.c.p;
            int iD = p03Var.d(obj);
            int i2 = iD >= 0 ? p03Var.c[iD] : -1;
            if (i2 != -1) {
                return i2;
            }
        }
        return i;
    }

    public static final void i0(String str) {
        App.b().getClass();
        if (!h12.c(App.c().getString("download_directory_uri", null), str)) {
            j51.o();
        }
        App.b().getClass();
        App.c().edit().putString("download_directory_uri", str).apply();
    }

    public static final Object j(u84 u84Var, long j, wf1 wf1Var) {
        while (true) {
            if (u84Var.e >= j && !u84Var.f()) {
                return u84Var;
            }
            Object objD = u84Var.d();
            f01 f01Var = a;
            if (objD == f01Var) {
                return f01Var;
            }
            u84 u84Var2 = (u84) ((p90) objD);
            if (u84Var2 == null) {
                u84Var2 = (u84) wf1Var.invoke(Long.valueOf(u84Var.e + 1), u84Var);
                if (u84Var.i(u84Var2)) {
                    if (u84Var.f()) {
                        u84Var.h();
                    }
                }
            }
            u84Var = u84Var2;
        }
    }

    public static final void j0(int i) {
        App.b().getClass();
        App.c().edit().putString("download_storage", String.valueOf(i)).apply();
    }

    public static final String k() {
        String strM;
        String strE = E();
        String strConcat = strE == null ? null : "active_music_folder_id_".concat(strE);
        if (strConcat == null || (strM = b11.m(strConcat, "default")) == null || strM.equals("default")) {
            return null;
        }
        return strM;
    }

    public static final void k0(short[] sArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (short s : sArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            sb.append((CharSequence) String.valueOf((int) s));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        App.b().getClass();
        App.c().edit().putString("equalizer_band_levels", string).apply();
    }

    public static final boolean l() {
        return xa3.u("bitrate_visible", true);
    }

    public static final void l0(List list) {
        App.b().getClass();
        App.c().edit().putString("home_sector_list", new nk1().j(list)).apply();
    }

    public static final String m() {
        String strM = b11.m("color_accent", "DYNAMIC");
        return strM == null ? "DYNAMIC" : strM;
    }

    public static final void m0(String str) {
        App.b().getClass();
        App.c().edit().putString("in_use_server_address", str).apply();
    }

    public static ColorStateList n(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        e14 e14Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f14 f14Var = new f14(resources, theme);
        synchronized (g14.c) {
            try {
                SparseArray sparseArray = (SparseArray) g14.b.get(f14Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (e14Var = (e14) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (e14Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || e14Var.c != 0) {
                            if (theme == null || e14Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = e14Var.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = g14.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = t50.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (g14.c) {
            try {
                WeakHashMap weakHashMap = g14.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(f14Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(f14Var, sparseArray2);
                }
                sparseArray2.append(i, new e14(colorStateListA, f14Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final void n0(String str) {
        App.b().getClass();
        App.c().edit().putString("local_address", str).apply();
    }

    public static final String o() {
        return b11.m("download_directory_uri", null);
    }

    public static final void o0(boolean z) {
        xa3.t("low_security", z);
    }

    public static final int p() {
        App.b().getClass();
        String string = App.c().getString("download_storage", "0");
        string.getClass();
        return Integer.parseInt(string);
    }

    public static final void p0(boolean z) {
        xa3.t("open_subsonic", z);
    }

    public static final short[] q(short s) {
        int iIntValue;
        String strM = b11.m("equalizer_band_levels", null);
        if (strM == null || qm4.u0(strM)) {
            return new short[s];
        }
        List listC0 = qm4.C0(strM, new String[]{","}, 6);
        if (listC0.size() < s) {
            return new short[s];
        }
        short[] sArr = new short[s];
        for (int i = 0; i < s; i++) {
            String str = (String) listC0.get(i);
            str.getClass();
            Integer numL0 = xm4.l0(str);
            Short shValueOf = (numL0 == null || (iIntValue = numL0.intValue()) < -32768 || iIntValue > 32767) ? null : Short.valueOf((short) iIntValue);
            sArr[i] = shValueOf != null ? shValueOf.shortValue() : (short) 0;
        }
        return sArr;
    }

    public static final void q0(String str) {
        App.b().getClass();
        App.c().edit().putString("password", str).apply();
    }

    public static final String r() {
        return b11.m("home_sector_list", null);
    }

    public static final void r0(float f) {
        App.b().getClass();
        App.c().edit().putFloat("playback_speed", f).apply();
    }

    public static final String s() {
        String strM = b11.m("home_sort_playlists", "ORDER_BY_NAME");
        return strM == null ? "ORDER_BY_NAME" : strM;
    }

    public static final void s0(float f) {
        App.b().getClass();
        App.c().edit().putFloat("playback_speed_manual_pitch_value", f).apply();
    }

    public static final int t() {
        App.b().getClass();
        String string = App.c().getString("image_size", "-1");
        string.getClass();
        return Integer.parseInt(string);
    }

    public static final void t0(int i) {
        App.b().getClass();
        App.c().edit().putInt("repeat_mode", i).apply();
    }

    public static final String u() {
        String strM = b11.m("in_use_server_address", null);
        if (strM != null) {
            String str = qm4.u0(strM) ? null : strM;
            if (str != null) {
                return str;
            }
        }
        return D();
    }

    public static final void u0(String str) {
        App.b().getClass();
        App.c().edit().putString("salt", str).apply();
    }

    public static final String v() {
        return b11.m("local_address", null);
    }

    public static final void v0(String str) {
        App.b().getClass();
        App.c().edit().putString("server", str).apply();
    }

    public static Executor w(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? ne.e(context) : new ok(new Handler(context.getMainLooper()), 1);
    }

    public static final void w0(String str) {
        App.b().getClass();
        App.c().edit().putString("server_id", str).apply();
    }

    public static final int x() {
        String strM = b11.m("network_ping_timeout_base", "2");
        Integer numL0 = xm4.l0(strM != null ? strM : "2");
        int iIntValue = numL0 != null ? numL0.intValue() : 2;
        if (iIntValue < 1) {
            return 1;
        }
        return iIntValue;
    }

    public static final void x0(boolean z) {
        xa3.t("shuffle_mode", z);
    }

    public static final String y() {
        return b11.m("password", null);
    }

    public static final void y0(boolean z) {
        xa3.t("homemusic_smart_shuffle_chosen", z);
    }

    public static final String z() {
        return b11.m("replay_gain_mode", "disabled");
    }

    public static final void z0(boolean z) {
        xa3.t("sync_starred_albums_for_offline_use", z);
    }
}
