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
import com.eddyizm.tempus.util.Preferences$getResumePoints$1;
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
    public static final f01 a = null;
    public static final Object b = null;
    public static final int[] c = null;

    static {
        int r2 = 1;
        a = new f01(r2, "CLOSED");
        b = new Object();
        c = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    }

    public static Map A() {
        String r0 = b11.m("resume_points", null);
        if (r0 == null) goto L12;
        if (qm4.u0(r0) == true) goto L12;
        Map r1 = (Map) new nk1().f(r0, new Preferences$getResumePoints$1().getType());     // Catch: Exception -> L13
        if (r1 == null) goto L10;
        return r1;
    L10:
        return new LinkedHashMap();
    L14:
        return new LinkedHashMap();
    L12:
        return new LinkedHashMap();
    }

    public static final void A0(boolean r1) {
        xa3.t("sync_starred_tracks_for_offline_use", r1);
    }

    public static final String B() {
        return b11.m("salt", null);
    }

    public static final void B0(int r2) {
        App.b().getClass();
        App.c().edit().putString("streaming_cache_storage", String.valueOf(r2)).apply();
    }

    public static final int C() {
        App.b().getClass();
        String r0 = App.c().getString("selected_equalizer", "0");
        r0.getClass();
        return Integer.parseInt(r0);
    }

    public static final void C0(String r2) {
        App.b().getClass();
        App.c().edit().putString("token", r2).apply();
    }

    public static final String D() {
        return b11.m("server", null);
    }

    public static final void D0(String r2) {
        App.b().getClass();
        App.c().edit().putString("user", r2).apply();
    }

    public static final String E() {
        return b11.m("server_id", null);
    }

    public static void E0(View r9, HubMixToday r10) {
        Resources r0 = r9.getResources();
        List<WaveTrack> r1 = null;
        if (r10 == null) goto L5;
        HubMix r2 = r10.getMix();
    L6:
        TextView r3 = (TextView) r9.findViewById(R.id.homemusic_mix_title);
        if (r2 == null) goto L16;
        String r5 = r2.getTitle();
        if (r5 == null) goto L16;
        if (qm4.u0(r5) == false) goto L14;
        r5 = null;
    L14:
        if (r5 == null) goto L16;
    L17:
        r3.setText(r5);
        TextView r4 = (TextView) r9.findViewById(R.id.homemusic_mix_subtitle);
        Resources r6 = r9.getResources();
        if (r10 == null) goto L20;
        HubMix r7 = r10.getMix();
    L21:
        if (r10 != null) goto L23;
        String r11 = r6.getString(R.string.homemusic_mix_title);
        r11.getClass();
    L36:
        r4.setText(r11);
        View r12 = r9.findViewById(R.id.homemusic_mix_play);
        if (r2 == null) goto L39;
        r1 = r2.getTracks();
    L39:
        if (r1 != null) goto L41;
    L44:
        int r13 = 8;
    L45:
        r12.setVisibility(r13);
        return;
    L41:
        if (r1.isEmpty() == true) goto L44;
        r13 = 0;
        goto L45
    L23:
        if (r7 == null) goto L30;
        String r14 = r6.getString(R.string.homemusic_mix_title);
        if (r7.getTitle() != null) goto L28;
        r14 = null;
    L28:
        r11 = q40.B0(ti.i0(new String[]{r14, r6.getQuantityString(R.plurals.homemusic_mix_songs, r7.getTotal(), new Object[]{Integer.valueOf(r7.getTotal())})}), " · ", null, null, null, 62);
        goto L36
    L30:
        if (r10.getBuilding() == false) goto L33;
        r11 = r6.getString(R.string.homemusic_mix_building);
        r11.getClass();
        goto L36
    L33:
        if (r10.getOnboarding() == false) goto L35;
        r11 = r6.getString(R.string.homemusic_mix_onboarding);
        r11.getClass();
        goto L36
    L35:
        r11 = r6.getString(R.string.homemusic_mix_none);
        r11.getClass();
        goto L36
    L20:
        r7 = null;
    L16:
        r5 = r0.getString(R.string.homemusic_mix_title);
        r5.getClass();
        goto L17
    L5:
        r2 = null;
        goto L6
    }

    public static final long F() {
        App.b().getClass();
        String r0 = App.c().getString("streaming_cache_size", "256");
        r0.getClass();
        return Long.parseLong(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static th4 F0(l51 r26, boolean r27, boolean r28) {
        long r2 = r26.getLength();
        long r4 = -1;
        int r6 = (r2 > (-1) ? 1 : (r2 == (-1) ? 0 : -1));
        long r7 = 4096;
        if (r6 != 0) goto L5;
    L8:
        int r8 = (int) r7;
        be3 r9 = new be3(64);
        int r10 = 0;
        int r11 = 0;
        boolean r12 = false;
    L9:
        if (r11 >= r8) goto L12;
        r9.K(8);
        boolean r15 = true;
        if (r26.e(r9.a, r10, 8, true) == false) goto L12;
        long r16 = r9.C();
        int r14 = r9.m();
        if (r16 != 1) goto L16;
        r4 = r4;
        r26.n(r9.a, 8, 8);
        int r5 = 16;
        r9.M(16);
        long r13 = r9.u();
    L22:
        long r17 = r5;
        if (r13 >= r17) goto L30;
        th4 r21 = null;
        if (r14 != 1718773093) goto L29;
        if (r5 != 8) goto L29;
        r13 = r17;
    L31:
        int r18 = r11 + r5;
        if (r14 == 1836019574) goto L33;
        if (r14 != 1953653099) goto L42;
    L45:
        long r22 = r2;
        int r19 = 0;
        r11 = r18;
    L89:
        r10 = r19;
        r2 = r22;
        goto L9
    L42:
        if (r14 == 1835297121) goto L45;
        if (r14 == 1835626086) goto L45;
        if (r14 == 1836019558) goto L90;
        if (r14 == 1836475768) goto L90;
        if (r14 != 1835295092) goto L55;
        r12 = true;
    L55:
        if (r14 == 1937007212) goto L57;
    L59:
        r22 = r2;
        if (((((long) r18) + r13) - r17) >= r8) goto L58;
        int r3 = (int) (r13 - r17);
        r11 = r18 + r3;
        if (r14 == 1718909296) goto L65;
        r19 = 0;
        if (r3 == 0) goto L89;
        r26.g(r3);
        goto L89
    L65:
        if (r3 < 8) goto L67;
        r9.K(r3);
        r19 = 0;
        r26.n(r9.a, 0, r3);
        int r20 = r9.m();
        if (P(r20, r28) == false) goto L71;
        r12 = true;
    L71:
        r9.O(4);
        int r23 = r9.a() / 4;
        if (r12 == true) goto L81;
        if (r23 <= 0) goto L81;
        int[] r110 = new int[r23];
        int r24 = 0;
    L75:
        if (r24 >= r23) goto L80;
        int r25 = r9.m();
        r110[r24] = r25;
        if (P(r25, r28) == true) goto L82;
        r24 = r24 + 1;
    L82:
        if (r15 == false) goto L84;
        r12 = r15;
        goto L89
    L84:
        return new x7(r110, r20);
    L80:
        r15 = r12;
    L81:
        r15 = r12;
        r110 = r21;
        goto L82
    L67:
        return new dl(r14, 8, r3);
    L58:
        int r29 = 0;
    L93:
        if (r12 == true) goto L97;
        return rv2.t;
    L97:
        if (r27 == r29) goto L103;
        if (r29 == 0) goto L102;
        return ox1.p;
    L102:
        return ox1.q;
    L103:
        return r21;
    L57:
        if (r13 <= 1000000) goto L59;
    L90:
        r29 = 1;
        goto L93
    L33:
        r8 = r8 + ((int) r13);
        if (r6 != 0) goto L36;
    L38:
        r11 = r18;
        r10 = 0;
        goto L9
    L36:
        if (r8 <= r2) goto L38;
        r8 = (int) r2;
    L29:
        return new dl(r14, r5, r13);
    L30:
        r21 = null;
        goto L31
    L16:
        r4 = r4;
        if (r16 != 0) goto L21;
        long r30 = r26.getLength();
        if (r30 == r4) goto L21;
        r16 = (r30 - r26.f()) + 8;
    L21:
        r13 = r16;
        r5 = 8;
    L12:
        r21 = null;
        r29 = r10;
        goto L93
    L5:
        if (r2 > 4096) goto L8;
        r7 = r2;
        goto L8
    }

    public static final int G() {
        App.b().getClass();
        String r0 = App.c().getString("streaming_cache_storage", "0");
        r0.getClass();
        return Integer.parseInt(r0);
    }

    public static void G0(Context r2, Intent r3) {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        r50.v(r2, r3);
        return;
    L6:
        r2.startService(r3);
    }

    public static final String H() {
        String r0 = b11.m("theme", "default");
        if (r0 != null) goto L5;
        return "default";
    L5:
        return r0;
    }

    public static final void H0() {
        if (h12.c(u(), D()) == false) goto L5;
        String r0 = v();
    L6:
        App.b().getClass();
        App.c().edit().putString("in_use_server_address", r0).apply();
        return;
    L5:
        r0 = D();
        goto L6
    }

    public static final int I() {
        String r0 = b11.m("tile_size", "2");
        Integer r1 = null;
        if (r0 == null) goto L5;
        Integer r2 = xm4.l0(r0);
    L7:
        if (r2 == null) goto L16;
        int r3 = r2.intValue();
        if (2 <= r3) goto L11;
    L13:
        if (r1 == null) goto L16;
        return r1.intValue();
    L11:
        if (r3 >= 7) goto L13;
        r1 = r2;
    L16:
        return 2;
    L5:
        r2 = null;
        goto L7
    }

    public static String I0(long r4) {
        int r0 = (int) (r4 >> 32);
        int r5 = (int) (r4 & 4294967295L);
        if (Float.intBitsToFloat(r0) != Float.intBitsToFloat(r5)) goto L7;
        return xa3.h("CornerRadius.circular(", gh0.F(Float.intBitsToFloat(r0)), ")");
    L7:
        return f34.h("CornerRadius.elliptical(", gh0.F(Float.intBitsToFloat(r0)), ", ", gh0.F(Float.intBitsToFloat(r5)), ")");
    }

    public static final String J() {
        return b11.m("token", null);
    }

    public static final Object J0(ne0 r2, Object r3, Object r4, wf1 r5, vd0 r6) {
        Object r7 = te5.R(r2, r4);
        lk4 r0 = new lk4(r6, r2);     // Catch: Throwable -> L6
        if (r5 != null) goto L8;
        Object r8 = ya4.Q(r5, r3, r0);     // Catch: Throwable -> L6
    L9:
        te5.K(r2, r7);
        if (r8 != xe0.n) goto L12;
        r6.getClass();
    L12:
        return r8;
    L8:
        jz4.j(2, r5);     // Catch: Throwable -> L6
        r8 = r5.invoke(r3, r0);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        te5.K(r2, r7);
        throw th;
    }

    public static final String K() {
        return b11.m("user", null);
    }

    public static void K0(Parcel r0, int r1, Bundle r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        int r3 = R0(r0, r1);
        r0.writeBundle(r2);
        S0(r0, r3);
    }

    public static u45 L(Bundle r1) {
        Bundle r2 = (Bundle) r1.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");     // Catch: RuntimeException -> L14
        if (r2 == null) goto L12;
        r2.setClassLoader(ud3.class.getClassLoader());     // Catch: RuntimeException -> L14
        Parcelable r3 = r2.getParcelable("a");     // Catch: RuntimeException -> L14
        if ((r3 instanceof ParcelImpl) == false) goto L11;
        return ((ParcelImpl) r3).n;
    L11:
        throw new IllegalArgumentException("Invalid parcel");     // Catch: RuntimeException -> L14
    L12:
        return null;
    L16:
        return null;
    }

    public static void L0(Parcel r0, int r1, byte[] r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        int r3 = R0(r0, r1);
        r0.writeByteArray(r2);
        S0(r0, r3);
    }

    public static void M(nc1 r8, String r9, jj1 r10) {
        r9.getClass();
        ArrayList r0 = new ArrayList();
        r0.add(new uh1(r9));
        List r11 = q40.Q0(r0);
        kh1 r4 = new kh1(r11);
        CancellationSignal r5 = new CancellationSignal();
        Executor r6 = w(r8);
        r6.getClass();
        wo0 r7 = new wo0(r10, r8);
        zg5 r12 = new zg5(r8);
        if (r4 == "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL") goto L19;
        Iterator r13 = r11.iterator();
    L6:
        if (r13.hasNext() == false) goto L8;
        xf0 r1 = (xf0) r13.next();
        goto L6
    L8:
        int r14 = Build.VERSION.SDK_INT;
        yf0 r2 = null;
        if (r14 < 34) goto L17;
        bg0 r15 = new bg0((nc1) r12.n);
        if (r15.isAvailableOnDevice() == false) goto L13;
        r2 = r15;
    L13:
        if (r2 != null) goto L15;
        r2 = r12.D();
    L15:
        yf0 r3 = r2;
        if (r3 != null) goto L23;
        r7.F(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        return;
    L23:
        r3.onGetCredential(r8, r4, r5, r6, r7);
        return;
    L17:
        if (r14 > 33) goto L15;
        r2 = r12.D();
        goto L15
    L19:
        r2 = r12.D();
        goto L15
    }

    public static void M0(Parcel r0, int r1, Parcelable r2, int r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        int r4 = R0(r0, r1);
        r2.writeToParcel(r0, r3);
        S0(r0, r4);
    }

    public static int N(int r3) {
        if (r3 != 1) goto L5;
        return 0;
    L5:
        if (r3 != 2) goto L7;
        return 1;
    L7:
        if (r3 != 4) goto L9;
        return 2;
    L9:
        if (r3 != 8) goto L11;
        return 3;
    L11:
        if (r3 != 16) goto L13;
        return 4;
    L13:
        if (r3 != 32) goto L15;
        return 5;
    L15:
        if (r3 != 64) goto L17;
        return 6;
    L17:
        if (r3 != 128) goto L19;
        return 7;
    L19:
        if (r3 != 256) goto L21;
        return 8;
    L21:
        if (r3 != 512) goto L24;
        return 9;
    L24:
        kf2.n(f34.f(r3, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static void N0(Map r6) {
        App.b().getClass();
        SharedPreferences.Editor r0 = App.c().edit();
        nk1 r1 = new nk1();
        if (r6.size() <= 200) goto L9;
        List r2 = q40.L0(q40.K0(r6.entrySet(), new jb2(2)), 200);
        r6.clear();
        Iterator r3 = r2.iterator();
    L7:
        if (r3.hasNext() == false) goto L9;
        Map.Entry r4 = (Map.Entry) r3.next();
        r6.put(r4.getKey(), r4.getValue());
    L9:
        r0.putString("resume_points", r1.j(r6)).apply();
    }

    public static final boolean O() {
        App.b().getClass();
        SharedPreferences r0 = App.c();
        if (r0.contains("auto_download_lyrics") == true) goto L5;
        return false;
    L5:
        return r0.getBoolean("auto_download_lyrics", false);
    }

    public static void O0(Parcel r0, int r1, String r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        int r3 = R0(r0, r1);
        r0.writeString(r2);
        S0(r0, r3);
    }

    public static boolean P(int r3, boolean r4) {
        if ((r3 >>> 8) != 3368816) goto L6;
        return true;
    L6:
        if (r3 != 1751476579) goto L9;
        if (r4 == false) goto L9;
        return true;
    L9:
        int r0 = 0;
    L11:
        if (r0 >= 29) goto L16;
        if (c[r0] == r3) goto L14;
        r0 = r0 + 1;
        goto L11
    L14:
        return true;
    L16:
        return false;
    }

    public static void P0(Parcel r6, int r7, Parcelable[] r8, int r9) {
        if (r8 != null) goto L4;
        return;
    L4:
        int r10 = R0(r6, r7);
        int r0 = r8.length;
        r6.writeInt(r0);
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L11;
        Parcelable r3 = r8[r2];
        if (r3 != null) goto L9;
        r6.writeInt(0);
    L10:
        r2 = r2 + 1;
        goto L5
    L9:
        int r4 = r6.dataPosition();
        r6.writeInt(1);
        int r5 = r6.dataPosition();
        r3.writeToParcel(r6, r9);
        int r11 = r6.dataPosition();
        r6.setDataPosition(r4);
        r6.writeInt(r11 - r5);
        r6.setDataPosition(r11);
        goto L10
    L11:
        S0(r6, r10);
    }

    public static final boolean Q() {
        return xa3.u("dark_theme_black", false);
    }

    public static void Q0(Parcel r6, int r7, List r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        int r9 = R0(r6, r7);
        int r0 = r8.size();
        r6.writeInt(r0);
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L11;
        Parcelable r3 = (Parcelable) r8.get(r2);
        if (r3 != null) goto L9;
        r6.writeInt(0);
    L10:
        r2 = r2 + 1;
        goto L5
    L9:
        int r4 = r6.dataPosition();
        r6.writeInt(1);
        int r5 = r6.dataPosition();
        r3.writeToParcel(r6, 0);
        int r10 = r6.dataPosition();
        r6.setDataPosition(r4);
        r6.writeInt(r10 - r5);
        r6.setDataPosition(r10);
        goto L10
    L11:
        S0(r6, r9);
    }

    public static final boolean R() {
        return xa3.u("data_saving_mode", false);
    }

    public static int R0(Parcel r1, int r2) {
        r1.writeInt(r2 | (-65536));
        r1.writeInt(0);
        return r1.dataPosition();
    }

    public static final boolean S() {
        return xa3.u("dynamic_color_accent", true);
    }

    public static void S0(Parcel r2, int r3) {
        int r0 = r2.dataPosition();
        r2.setDataPosition(r3 - 4);
        r2.writeInt(r0 - r3);
        r2.setDataPosition(r0);
    }

    public static final boolean T() {
        App.b().getClass();
        if ((App.c().getLong("last_instant_mix", 0) + 10000) >= System.currentTimeMillis()) goto L6;
        return true;
    L6:
        return false;
    }

    public static void T0(Parcel r0, int r1, int r2) {
        r0.writeInt(r1 | (r2 << 16));
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

    public static String Z(String r5) {
        fb2 r0 = new fb2(r5);
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r6 = r0.next();
        if (xm4.k0((String) r6, "LOCATION:", true) == false) goto L4;
    L9:
        String r7 = (String) r6;
        if (r7 == null) goto L16;
        String r8 = qm4.K0(qm4.E0(r7, ':')).toString();
        if (r8 == null) goto L16;
        if (r8.length() <= 0) goto L16;
        return r8;
    L16:
        return null;
    L8:
        r6 = null;
        goto L9
    }

    public static final boolean a(pu0 r10, long r11) {
        if (r10.n.A == false) goto L23;
        iz1 r0 = (iz1) j51.O(r10).Q.d;
        if (r0.n0.A == false) goto L24;
        long r1 = r0.K0(0);
        float r3 = Float.intBitsToFloat((int) (r1 >> 32));
        float r2 = Float.intBitsToFloat((int) (r1 & 4294967295L));
        long r6 = r10.D;
        float r12 = ((int) (r6 >> 32)) + r3;
        float r4 = ((int) (r6 & 4294967295L)) + r2;
        float r5 = Float.intBitsToFloat((int) (r11 >> 32));
        if (r3 <= r5) goto L11;
        return false;
    L11:
        if (r5 > r12) goto L20;
        float r13 = Float.intBitsToFloat((int) (r11 & 4294967295L));
        if (r2 <= r13) goto L15;
        return false;
    L15:
        if (r13 > r4) goto L22;
        return true;
    L22:
        return false;
    L20:
        return false;
    L24:
        return false;
    L23:
        return false;
    }

    public static double[] a0(double[] r17, double[][] r18) {
        double r1 = r17[0];
        double[] r3 = r18[0];
        double r4 = r3[0] * r1;
        double r7 = r17[1];
        double r9 = (r3[1] * r7) + r4;
        double r11 = r17[2];
        double r13 = (r3[2] * r11) + r9;
        double[] r5 = r18[1];
        double r10 = (r5[2] * r11) + ((r5[1] * r7) + (r5[0] * r1));
        double[] r6 = r18[2];
        return new double[]{r13, r10, (r11 * r6[2]) + ((r7 * r6[1]) + (r1 * r6[0]))};
    }

    public static void b(long r20, tv r22, int r23, ArrayList r24, int r25, int r26, ArrayList r27) {
        int r1 = r23;
        ArrayList r5 = r24;
        ArrayList r8 = r27;
        if (r25 >= r26) goto L66;
        int r4 = r25;
    L5:
        if (r4 >= r26) goto L11;
        if (((yw) r5.get(r4)).d() < r1) goto L9;
        r4 = r4 + 1;
        goto L5
    L9:
        kf2.n("Failed requirement.");
        return;
    L11:
        yw r3 = (yw) r24.get(r25);
        yw r6 = (yw) r5.get(r26 - 1);
        if (r1 != r3.d()) goto L14;
        int r7 = ((Number) r8.get(r25)).intValue();
        int r2 = r25 + 1;
        yw r9 = (yw) r5.get(r2);
        int r10 = r2;
        int r11 = r7;
        r3 = r9;
    L16:
        if (r3.i(r1) == r6.i(r1)) goto L48;
        int r12 = r10 + 1;
        int r13 = 1;
    L18:
        if (r12 >= r26) goto L23;
        if (((yw) r5.get(r12 - 1)).i(r1) == ((yw) r5.get(r12)).i(r1)) goto L22;
        r13 = r13 + 1;
    L22:
        r12 = r12 + 1;
        goto L18
    L23:
        long r14 = (((r22.o / 4) + r20) + 2) + ((long) (r13 * 2));
        r22.b0(r13);
        r22.b0(r11);
        int r15 = r10;
    L24:
        if (r15 >= r26) goto L31;
        int r16 = ((yw) r5.get(r15)).i(r1);
        if (r15 != r10) goto L28;
    L29:
        r22.b0(r16 & 255);
    L30:
        r15 = r15 + 1;
        goto L24
    L28:
        if (r16 == ((yw) r5.get(r15 - 1)).i(r1)) goto L30;
    L31:
        tv r17 = new tv();
        int r18 = r10;
    L32:
        if (r18 >= r26) goto L46;
        byte r19 = ((yw) r5.get(r18)).i(r1);
        int r21 = r18 + 1;
        int r28 = r21;
    L34:
        if (r28 >= r26) goto L39;
        if (r19 != ((yw) r5.get(r28)).i(r1)) goto L40;
        r28 = r28 + 1;
    L40:
        if (r21 == r28) goto L42;
    L44:
        r22.b0(((int) ((r17.o / 4) + r14)) * (-1));
        ArrayList r29 = r8;
        long r30 = r14;
        int r31 = r28;
        b(r30, r17, r1 + 1, r24, r18, r31, r29);
        r5 = r24;
    L45:
        r14 = r30;
        r18 = r31;
        r8 = r29;
        goto L32
    L42:
        if ((r1 + 1) != ((yw) r5.get(r18)).d()) goto L44;
        r22.b0(((Number) r8.get(r18)).intValue());
        r29 = r8;
        r30 = r14;
        r31 = r28;
        goto L45
    L39:
        r28 = r26;
        goto L40
    L46:
        r22.p(r17);
        return;
    L48:
        int r32 = Math.min(r3.d(), r6.d());
        int r33 = 0;
        int r110 = r1;
    L49:
        if (r110 >= r32) goto L53;
        if (r3.i(r110) != r6.i(r110)) goto L53;
        r33 = r33 + 1;
        r110 = r110 + 1;
    L53:
        long r111 = ((((r22.o / 4) + r20) + 2) + ((long) r33)) + 1;
        r22.b0(-r33);
        r22.b0(r11);
        int r34 = r1 + r33;
    L54:
        if (r1 >= r34) goto L57;
        r22.b0(r3.i(r1) & 255);
        r1 = r1 + 1;
        goto L54
    L57:
        if ((r10 + 1) == r26) goto L59;
        tv r35 = new tv();
        r22.b0(((int) ((r35.o / 4) + r111)) * (-1));
        b(r111, r35, r34, r5, r10, r26, r8);
        r22.p(r35);
        return;
    L59:
        if (r34 != ((yw) r5.get(r10)).d()) goto L62;
        r22.b0(((Number) r8.get(r10)).intValue());
        return;
    L62:
        kf2.o("Check failed.");
        return;
    L14:
        r10 = r25;
        r11 = -1;
        goto L16
    L66:
        kf2.n("Failed requirement.");
    }

    public static final ArrayList b0(Map r4, if1 r5) {
        r4.getClass();
        LinkedHashMap r0 = new LinkedHashMap();
        Iterator r6 = r4.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L14;
        Map.Entry r1 = (Map.Entry) r6.next();
        z13 r2 = (z13) r1.getValue();
        if (r2 == null) goto L8;
        Boolean r3 = Boolean.valueOf(r2.b);
    L9:
        r3.getClass();
        if (r3.booleanValue() == true) goto L4;
        if (r2.c == true) goto L4;
        r0.put(r1.getKey(), r1.getValue());
        goto L4
    L8:
        r3 = null;
        goto L9
    L14:
        Set r7 = r0.keySet();
        ArrayList r8 = new ArrayList();
        Iterator r9 = r7.iterator();
    L16:
        if (r9.hasNext() == false) goto L20;
        Object r10 = r9.next();
        if (((Boolean) r5.invoke((String) r10)).booleanValue() == false) goto L16;
        r8.add(r10);
        goto L16
    L20:
        return r8;
    }

    public static int c(Context r3, String r4) {
        if (r4 != null) goto L5;
        nz2.n("permission must be non-null");
        return 0;
    L5:
        if (Build.VERSION.SDK_INT >= 33) goto L14;
        if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", r4) == false) goto L14;
        if (new x63(r3).b.areNotificationsEnabled() == false) goto L11;
        return 0;
    L11:
        return -1;
    L14:
        return r3.checkPermission(r4, Process.myPid(), Process.myUid());
    }

    public static List c0(lg4 r24, int r25, lg4 r26, boolean r27, boolean r28, boolean r29) {
        int r3 = r24.u(r25);
        int r4 = r25 + r3;
        int r5 = r24.f(r25);
        int r6 = r24.f(r4);
        int r7 = r6 - r5;
        if (r25 >= 0) goto L5;
    L7:
        boolean r10 = false;
    L8:
        r26.w(r3);
        r26.x(r7, r26.t);
        if (r24.g >= r4) goto L12;
        r24.B(r4);
    L12:
        if (r24.k >= r6) goto L14;
        r24.C(r6, r4);
    L14:
        int[] r8 = r26.b;
        int r11 = r26.t;
        int r13 = r11 * 5;
        ti.Y(r13, r25 * 5, r4 * 5, r24.b, r8);
        Object[] r12 = r26.c;
        int r14 = r26.i;
        System.arraycopy(r24.c, r5, r12, r14, r7);
        int r15 = r26.v;
        r8[r13 + 2] = r15;
        int r16 = r11 - r25;
        int r9 = r11 + r3;
        int r18 = r14 - r26.g(r8, r11);
        int r17 = r26.m;
        int r19 = r26.l;
        int r110 = r12.length;
        boolean r21 = r10;
        int r111 = r17;
        int r112 = r11;
    L15:
        if (r112 >= r9) goto L26;
        if (r112 == r11) goto L18;
        int r22 = (r112 * 5) + 2;
        r8[r22] = r8[r22] + r16;
    L18:
        int[] r23 = r8;
        int r20 = r26.g(r8, r112) + r18;
        if (r111 >= r112) goto L21;
        int r113 = 0;
    L22:
        r23[(r112 * 5) + 4] = lg4.i(r20, r113, r19, r110);
        if (r112 != r111) goto L25;
        r111 = r111 + 1;
    L25:
        r112 = r112 + 1;
        r11 = r11;
        r8 = r23;
        goto L15
    L21:
        r113 = r26.k;
        goto L22
    L26:
        int[] r210 = r8;
        r26.m = r111;
        int r30 = kg4.a(r24.d, r25, r24.p());
        int r31 = kg4.a(r24.d, r4, r24.p());
        if (r30 >= r31) goto L32;
        ArrayList r32 = r24.d;
        ArrayList r114 = new ArrayList(r31 - r30);
        int r115 = r30;
    L29:
        if (r115 >= r31) goto L31;
        mg1 r116 = (mg1) r32.get(r115);
        r116.a += r16;
        r114.add(r116);
        r115 = r115 + 1;
        goto L29
    L31:
        r26.d.addAll(kg4.a(r26.d, r26.t, r26.p()), r114);
        r32.subList(r30, r31).clear();
        List r117 = r114;
    L34:
        if (r117.isEmpty() == true) goto L41;
        HashMap r33 = r24.e;
        HashMap r34 = r26.e;
        if (r33 == null) goto L41;
        if (r34 == null) goto L41;
        int r35 = r117.size();
        int r36 = 0;
    L39:
        if (r36 >= r35) goto L41;
        tg1 r118 = (tg1) r33.get((mg1) r117.get(r36));
        r36 = r36 + 1;
    L41:
        int r37 = r26.v;
        r26.O(r15);
        int r38 = r24.E(r24.b, r25);
        if (r29 == true) goto L44;
        boolean r119 = false;
    L55:
        if (r119 == false) goto L57;
        l80.a("Unexpectedly removed anchors");
    L57:
        int r0 = r26.o;
        int r1 = r210[r13 + 1];
        if ((1073741824 & r1) == 0) goto L60;
        int r39 = 1;
    L61:
        r26.o = r0 + r39;
        if (r28 == false) goto L64;
        r26.t = r9;
        r26.i = r14 + r7;
    L64:
        if (r21 == false) goto L66;
        r26.T(r15);
    L66:
        return r117;
    L60:
        r39 = r1 & 67108863;
        goto L61
    L44:
        if (r27 == false) goto L54;
        if (r38 < 0) goto L47;
        boolean r120 = true;
    L48:
        if (r120 == false) goto L50;
        r24.P();
        r24.a(r38 - r24.t);
        r24.P();
    L50:
        r24.a(r25 - r24.t);
        boolean r2 = r24.H();
        if (r120 == false) goto L53;
        r24.M();
        r24.j();
        r24.M();
        r24.j();
    L53:
        r119 = r2;
        goto L55
    L47:
        r120 = false;
        goto L48
    L54:
        boolean r40 = r24.I(r25, r3);
        r24.J(r5, r7, r25 - 1);
        r119 = r40;
        goto L55
    L32:
        r117 = u01.n;
        goto L34
    L5:
        if ((r24.b[(r24.r(r25) * 5) + 1] & 201326592) == 0) goto L7;
        r10 = true;
        goto L8
    }

    public static final kd3 d(hu2 r2) {
        Charset r0 = w10.a;
        if (r2 == null) goto L12;
        Charset r1 = hu2.a(r2);
        if (r1 == null) goto L13;
        r0 = r1;
        goto L12
    L13:
        r2 = ve5.a(r2 + "; charset=utf-8");     // Catch: IllegalArgumentException -> L9
    L9:
        r2 = null;
    L12:
        return new kd3(r0, r2);
    }

    public static String d0(Context r4) {
        String r0 = r4.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (si0.l(r4, r0) != 0) goto L5;
        return r0;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L9;
        r0 = kz.e(r4) + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (si0.l(r4, r0) != 0) goto L9;
        return r0;
    L9:
        tb4.e(xa3.h("Permission ", r0, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(z34 r4, Throwable r5) {
        if (r4 == 0) goto L48;
        if (r5 == null) goto L5;
        xa3.o(r4);     // Catch: Throwable -> L35
        return;
    L35:
        th = move-exception;
        j51.d(r5, th);
        return;
    L5:
        if ((r4 instanceof AutoCloseable) == false) goto L8;
        r4.close();
        return;
    L8:
        if ((r4 instanceof ExecutorService) == false) goto L23;
        ExecutorService r6 = (ExecutorService) r4;
        if (r6 == ForkJoinPool.commonPool()) goto L56;
        boolean r7 = r6.isTerminated();
        if (r7 == true) goto L50;
        r6.shutdown();
        boolean r0 = false;
    L15:
        if (r7 == true) goto L20;
        r7 = r6.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L18
    L18:
        if (r0 == true) goto L15;
        r6.shutdownNow();
        r0 = true;
        goto L15
    L20:
        if (r0 == false) goto L51;
        Thread.currentThread().interrupt();
        return;
    L51:
        return;
    L50:
        return;
    L56:
        return;
    L23:
        if ((r4 instanceof TypedArray) == false) goto L26;
        ((TypedArray) r4).recycle();
        return;
    L26:
        if ((r4 instanceof MediaMetadataRetriever) == false) goto L29;
        ((MediaMetadataRetriever) r4).release();
        return;
    L29:
        if ((r4 instanceof MediaDrm) == false) goto L31;
        ((MediaDrm) r4).release();
        return;
    L31:
        nz2.c();
        return;
    }

    public static Map e0(String r3, String r4) {
        DocumentBuilderFactory r0 = DocumentBuilderFactory.newInstance();     // Catch: Exception -> L5
        r0.setNamespaceAware(false);     // Catch: Exception -> L5
        Element r5 = r0.newDocumentBuilder().parse(new InputSource(new StringReader(r3))).getDocumentElement();     // Catch: Exception -> L5
        LinkedHashMap r1 = new LinkedHashMap();
        r5.getClass();
        f(r5, r4, r1);
        return r1;
    L6:
        return v01.n;
    }

    public static void f(Element r8, String r9, LinkedHashMap r10) {
        NodeList r11 = r8.getChildNodes();
        int r0 = r11.getLength();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L28;
        Node r3 = r11.item(r2);
        if ((r3 instanceof Element) == false) goto L7;
        Element r4 = (Element) r3;
    L8:
        if (r4 == null) goto L27;
        String r5 = r4.getTagName();
        r5.getClass();
        String r6 = qm4.E0(r5, ':');
        Iterable r7 = gb.g0(0, r4.getChildNodes().getLength());
        if ((r7 instanceof Collection) == true) goto L13;
    L15:
        Iterator r12 = r7.iterator();
    L17:
        if (((i02) r12).p == false) goto L22;
        if ((r4.getChildNodes().item(((b02) r12).nextInt()) instanceof Element) == false) goto L17;
        f(r4, r9, r10);
    L22:
        if (r6.equals(r9.concat("Response")) == true) goto L27;
        String r13 = r4.getTextContent();
        if (r13 != null) goto L26;
        r13 = "";
    L26:
        r10.put(r6, r13);
        goto L27
    L13:
        if (((Collection) r7).isEmpty() == false) goto L15;
    L27:
        r2 = r2 + 1;
        goto L3
    L7:
        r4 = null;
        goto L8
    }

    public static void f0(nc1 r6, String[] r7, int r8) {
        HashSet r0 = new HashSet();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r7.length) goto L15;
        if (TextUtils.isEmpty(r7[r2]) == true) goto L13;
        if (Build.VERSION.SDK_INT >= 33) goto L12;
        if (TextUtils.equals(r7[r2], "android.permission.POST_NOTIFICATIONS") == false) goto L12;
        r0.add(Integer.valueOf(r2));
    L12:
        r2 = r2 + 1;
        goto L4
    L13:
        kf2.n(b11.q(new StringBuilder("Permission request for permissions "), Arrays.toString(r7), " must not contain null or empty values"));
        return;
    L15:
        int r3 = r0.size();
        if (r3 <= 0) goto L18;
        String[] r4 = new String[r7.length - r3];
    L19:
        if (r3 > 0) goto L21;
    L30:
        r6.requestPermissions(r7, r8);
        return;
    L21:
        if (r3 != r7.length) goto L23;
        return;
    L23:
        int r5 = 0;
    L25:
        if (r1 >= r7.length) goto L30;
        if (r0.contains(Integer.valueOf(r1)) == true) goto L29;
        r4[r5] = r7[r1];
        r5 = r5 + 1;
    L29:
        r1 = r1 + 1;
        goto L25
    L18:
        r4 = r7;
        goto L19
    }

    public static final boolean g(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final zs4 g0(zs4 r27, r62 r28) {
        ij4 r2 = r27.a;
        as4 r3 = jj4.d;
        as4 r4 = r2.a;
        if (r4.equals(rv2.F) == true) goto L5;
    L4:
        as4 r5 = r4;
        long r6 = r2.b;
        ct4[] r7 = bt4.b;
        if ((r6 & 1095216660480L) != 0) goto L9;
        r6 = jj4.a;
    L9:
        long r8 = r6;
        gb1 r9 = r2.c;
        if (r9 != null) goto L12;
        r9 = gb1.p;
    L12:
        gb1 r10 = r9;
        eb1 r11 = r2.d;
        if (r11 == null) goto L15;
        int r12 = r11.a;
    L16:
        eb1 r13 = new eb1(r12);
        fb1 r14 = r2.e;
        if (r14 == null) goto L19;
        int r15 = r14.a;
    L20:
        fb1 r16 = new fb1(r15);
        vk0 r17 = r2.f;
        if (r17 != null) goto L23;
        r17 = vk0.a;
    L23:
        vk0 r18 = r17;
        String r19 = r2.g;
        if (r19 != null) goto L26;
        r19 = "";
    L26:
        String r110 = r19;
        long r20 = r2.h;
        if ((r20 & 1095216660480L) != 0) goto L29;
        r20 = jj4.b;
    L29:
        long r111 = r20;
        hr r21 = r2.i;
        float r22 = 0.0f;
        if (r21 == null) goto L32;
        float r23 = r21.a;
    L34:
        if (Float.isNaN(r23) == true) goto L37;
        r22 = r23;
    L37:
        hr r112 = new hr(r22);
        bs4 r24 = r2.j;
        if (r24 != null) goto L40;
        r24 = bs4.c;
    L40:
        bs4 r113 = r24;
        vd2 r25 = r2.k;
        if (r25 != null) goto L43;
        vd2 r26 = vd2.p;
        r25 = fh0.m();
    L43:
        vd2 r114 = r25;
        long r29 = r2.l;
        if (r29 == 16) goto L46;
    L45:
        long r115 = r29;
        sr4 r30 = r2.m;
        if (r30 != null) goto L50;
        r30 = sr4.b;
    L50:
        sr4 r210 = r30;
        xb4 r31 = r2.n;
        if (r31 != null) goto L53;
        r31 = xb4.d;
    L53:
        xb4 r211 = r31;
        q05 r32 = r2.o;
        if (r32 != null) goto L56;
        r32 = c71.d;
    L56:
        ij4 r33 = new ij4(r5, r8, r10, r13, r16, r18, r110, r111, r112, r113, r114, r115, r210, r211, r32);
        sd3 r34 = r27.b;
        int r35 = td3.b;
        int r36 = r34.a;
        int r37 = 5;
        if (r36 != 0) goto L59;
        r36 = 5;
    L59:
        int r38 = r34.b;
        if (r38 != 3) goto L68;
        int r39 = r28.ordinal();
        if (r39 == 0) goto L67;
        if (r39 != 1) goto L65;
    L64:
        r38 = r37;
    L76:
        long r40 = r34.c;
        if ((r40 & 1095216660480L) != 0) goto L79;
        r40 = td3.a;
    L79:
        cs4 r41 = r34.d;
        if (r41 != null) goto L82;
        r41 = cs4.c;
    L82:
        zg3 r116 = r34.e;
        ra2 r117 = r34.f;
        int r118 = r34.g;
        if (r118 != 0) goto L85;
        r118 = ma2.b;
    L85:
        int r119 = r34.h;
        if (r119 != 0) goto L88;
        r119 = 1;
    L88:
        qs4 r42 = r34.i;
        if (r42 != null) goto L91;
        r42 = qs4.c;
    L91:
        cs4 r120 = r41;
        return new zs4(r33, new sd3(r36, r38, r40, r120, r116, r117, r118, r119, r42), r27.c);
    L65:
        er1.n();
        return null;
    L67:
        r37 = 4;
        goto L64
    L68:
        if (r38 != 0) goto L76;
        int r43 = r28.ordinal();
        if (r43 == 0) goto L75;
        if (r43 != 1) goto L73;
        r37 = 2;
        goto L64
    L73:
        er1.n();
        return null;
    L75:
        r38 = 1;
        goto L76
    L46:
        r29 = jj4.c;
        goto L45
    L32:
        r23 = 0.0f;
        goto L34
    L19:
        r15 = 65535;
        goto L20
    L15:
        r12 = 0;
        goto L16
    L5:
        r4 = jj4.d;
        goto L4
    }

    public static String h(String r2) {
        r2.getClass();
        return xm4.i0(xm4.i0(xm4.i0(xm4.i0(r2, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;");
    }

    public static final void h0(String r2) {
        App.b().getClass();
        App.c().edit().putString("client_cert", r2).apply();
    }

    public static final int i(int r1, nc3 r2, Object r3) {
        if (r3 != null) goto L4;
    L17:
        return r1;
    L4:
        if (r2.b() == 0) goto L17;
        if (r1 < r2.b()) goto L9;
    L11:
        p03 r4 = (p03) r2.c.p;
        int r5 = r4.d(r3);
        if (r5 < 0) goto L14;
        int r6 = r4.c[r5];
    L15:
        if (r6 == (-1)) goto L17;
        return r6;
    L14:
        r6 = -1;
        goto L15
    L9:
        if (r3.equals(r2.c(r1)) == false) goto L11;
        goto L11
    }

    public static final void i0(String r3) {
        App.b().getClass();
        if (h12.c(App.c().getString("download_directory_uri", null), r3) == true) goto L5;
        j51.o();
    L5:
        App.b().getClass();
        App.c().edit().putString("download_directory_uri", r3).apply();
    }

    public static final Object j(u84 r4, long r5, wf1 r7) {
    L3:
        if (r4.e >= r5) goto L5;
    L8:
        Object r0 = r4.d();
        f01 r1 = a;
        if (r0 == r1) goto L10;
        u84 r2 = (u84) ((p90) r0);
        if (r2 != null) goto L13;
        r2 = (u84) r7.invoke(Long.valueOf(r4.e + 1), r4);
        if (r4.i(r2) == false) goto L3;
        if (r4.f() == false) goto L13;
        r4.h();
    L13:
        r4 = r2;
        goto L3
    L10:
        return r1;
    L5:
        if (r4.f() == true) goto L8;
        return r4;
    }

    public static final void j0(int r2) {
        App.b().getClass();
        App.c().edit().putString("download_storage", String.valueOf(r2)).apply();
    }

    public static final String k() {
        String r0 = E();
        if (r0 != null) goto L5;
        String r1 = null;
    L6:
        if (r1 == null) goto L14;
        String r2 = b11.m(r1, "default");
        if (r2 == null) goto L14;
        if (r2.equals("default") == true) goto L14;
        return r2;
    L14:
        return null;
    L5:
        r1 = "active_music_folder_id_".concat(r0);
        goto L6
    }

    public static final void k0(short[] r7) {
        StringBuilder r0 = new StringBuilder();
        r0.append("");
        int r2 = r7.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L8;
        short r5 = r7[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L7;
        r0.append(",");
    L7:
        r0.append(String.valueOf(r5));
        r3 = r3 + 1;
        goto L3
    L8:
        r0.append("");
        String r8 = r0.toString();
        App.b().getClass();
        App.c().edit().putString("equalizer_band_levels", r8).apply();
    }

    public static final boolean l() {
        return xa3.u("bitrate_visible", true);
    }

    public static final void l0(List r2) {
        App.b().getClass();
        App.c().edit().putString("home_sector_list", new nk1().j(r2)).apply();
    }

    public static final String m() {
        String r0 = b11.m("color_accent", "DYNAMIC");
        if (r0 != null) goto L5;
        return "DYNAMIC";
    L5:
        return r0;
    }

    public static final void m0(String r2) {
        App.b().getClass();
        App.c().edit().putString("in_use_server_address", r2).apply();
    }

    public static ColorStateList n(Context r8, int r9) {
        Resources r0 = r8.getResources();
        Resources.Theme r10 = r8.getTheme();
        f14 r1 = new f14(r0, r10);
        Object r2 = g14.c;
        monitor-enter(r2);
        SparseArray r3 = (SparseArray) g14.b.get(r1);     // Catch: Throwable -> L16
        ColorStateList r4 = null;
        if (r3 != null) goto L7;
    L25:
        monitor-exit(r2);     // Catch: Throwable -> L16
        ColorStateList r5 = null;
    L27:
        if (r5 == null) goto L29;
        return r5;
    L29:
        ThreadLocal r6 = g14.a;
        TypedValue r7 = (TypedValue) r6.get();
        if (r7 != null) goto L32;
        r7 = new TypedValue();
        r6.set(r7);
    L32:
        r0.getValue(r9, r7, true);
        int r11 = r7.type;
        if (r11 < 28) goto L59;
        if (r11 > 31) goto L59;
    L42:
        if (r4 == null) goto L56;
        Object r12 = g14.c;
        monitor-enter(r12);
        WeakHashMap r13 = g14.b;     // Catch: Throwable -> L48
        SparseArray r14 = (SparseArray) r13.get(r1);     // Catch: Throwable -> L48
        if (r14 != null) goto L50;
        r14 = new SparseArray();     // Catch: Throwable -> L48
        r13.put(r1, r14);     // Catch: Throwable -> L48
    L50:
        r14.append(r9, new e14(r4, r1.a.getConfiguration(), r10));     // Catch: Throwable -> L48
        monitor-exit(r12);     // Catch: Throwable -> L48
        return r4;
    L48:
        th = move-exception;
        throw th;
    L56:
        return r0.getColorStateList(r9, r10);
    L59:
        r4 = t50.a(r0, r0.getXml(r9), r10);     // Catch: Exception -> L40
    L40:
        e = move-exception;
        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
        goto L42
    L7:
        if (r3.size() <= 0) goto L25;
        e14 r15 = (e14) r3.get(r9);     // Catch: Throwable -> L16
        if (r15 == null) goto L25;
        if (r15.b.equals(r0.getConfiguration()) == false) goto L24;
        if (r10 == null) goto L14;
    L18:
        if (r10 == null) goto L24;
        if (r15.c != r10.hashCode()) goto L24;
    L21:
        r5 = r15.a;     // Catch: Throwable -> L16
        monitor-exit(r2);     // Catch: Throwable -> L16
        goto L27
    L14:
        if (r15.c == 0) goto L21;
    L24:
        r3.remove(r9);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    public static final void n0(String r2) {
        App.b().getClass();
        App.c().edit().putString("local_address", r2).apply();
    }

    public static final String o() {
        return b11.m("download_directory_uri", null);
    }

    public static final void o0(boolean r1) {
        xa3.t("low_security", r1);
    }

    public static final int p() {
        App.b().getClass();
        String r0 = App.c().getString("download_storage", "0");
        r0.getClass();
        return Integer.parseInt(r0);
    }

    public static final void p0(boolean r1) {
        xa3.t("open_subsonic", r1);
    }

    public static final short[] q(short r7) {
        String r0 = b11.m("equalizer_band_levels", null);
        if (r0 == null) goto L28;
        if (qm4.u0(r0) == true) goto L28;
        List r1 = qm4.C0(r0, new String[]{","}, 6);
        if (r1.size() < r7) goto L10;
        short[] r2 = new short[r7];
        int r4 = 0;
    L12:
        if (r4 >= r7) goto L26;
        String r5 = (String) r1.get(r4);
        r5.getClass();
        Integer r6 = xm4.l0(r5);
        if (r6 == null) goto L21;
        int r8 = r6.intValue();
        if (r8 < (-32768)) goto L21;
        if (r8 > 32767) goto L21;
        Short r9 = Short.valueOf((short) r8);
    L22:
        if (r9 == null) goto L24;
        short r10 = r9.shortValue();
    L25:
        r2[r4] = r10;
        r4 = r4 + 1;
        goto L12
    L24:
        r10 = 0;
    L21:
        r9 = null;
        goto L22
    L26:
        return r2;
    L10:
        return new short[r7];
    L28:
        return new short[r7];
    }

    public static final void q0(String r2) {
        App.b().getClass();
        App.c().edit().putString("password", r2).apply();
    }

    public static final String r() {
        return b11.m("home_sector_list", null);
    }

    public static final void r0(float r2) {
        App.b().getClass();
        App.c().edit().putFloat("playback_speed", r2).apply();
    }

    public static final String s() {
        String r0 = b11.m("home_sort_playlists", "ORDER_BY_NAME");
        if (r0 != null) goto L5;
        return "ORDER_BY_NAME";
    L5:
        return r0;
    }

    public static final void s0(float r2) {
        App.b().getClass();
        App.c().edit().putFloat("playback_speed_manual_pitch_value", r2).apply();
    }

    public static final int t() {
        App.b().getClass();
        String r0 = App.c().getString("image_size", "-1");
        r0.getClass();
        return Integer.parseInt(r0);
    }

    public static final void t0(int r2) {
        App.b().getClass();
        App.c().edit().putInt("repeat_mode", r2).apply();
    }

    public static final String u() {
        String r1 = null;
        String r0 = b11.m("in_use_server_address", null);
        if (r0 == null) goto L10;
        if (qm4.u0(r0) == true) goto L7;
        r1 = r0;
    L7:
        if (r1 == null) goto L10;
        return r1;
    L10:
        return D();
    }

    public static final void u0(String r2) {
        App.b().getClass();
        App.c().edit().putString("salt", r2).apply();
    }

    public static final String v() {
        return b11.m("local_address", null);
    }

    public static final void v0(String r2) {
        App.b().getClass();
        App.c().edit().putString("server", r2).apply();
    }

    public static Executor w(Context r2) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return ne.e(r2);
    L7:
        return new ok(new Handler(r2.getMainLooper()), 1);
    }

    public static final void w0(String r2) {
        App.b().getClass();
        App.c().edit().putString("server_id", r2).apply();
    }

    public static final int x() {
        String r1 = "2";
        String r0 = b11.m("network_ping_timeout_base", "2");
        if (r0 == null) goto L6;
        r1 = r0;
    L6:
        Integer r2 = xm4.l0(r1);
        if (r2 == null) goto L9;
        int r3 = r2.intValue();
    L11:
        if (r3 >= 1) goto L13;
        return 1;
    L13:
        return r3;
    L9:
        r3 = 2;
        goto L11
    }

    public static final void x0(boolean r1) {
        xa3.t("shuffle_mode", r1);
    }

    public static final String y() {
        return b11.m("password", null);
    }

    public static final void y0(boolean r1) {
        xa3.t("homemusic_smart_shuffle_chosen", r1);
    }

    public static final String z() {
        return b11.m("replay_gain_mode", "disabled");
    }

    public static final void z0(boolean r1) {
        xa3.t("sync_starred_albums_for_offline_use", r1);
    }
}
