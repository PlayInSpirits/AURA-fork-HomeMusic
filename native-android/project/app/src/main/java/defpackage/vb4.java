package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.util.ClickablePreferenceCategory;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vb4 extends kp3 {
    public final HashSet A0;
    public boolean B0;
    public Integer C0;
    public String D0;
    public final np0 E0;
    public final y11 F0;
    public MainActivity t0;
    public ob4 u0;
    public vf2 v0;
    public r5 w0;
    public xp x0;
    public boolean y0;
    public r5 z0;

    public vb4() {
        this.y0 = false;
        this.A0 = new HashSet();
        this.B0 = false;
        this.C0 = null;
        this.D0 = "";
        this.E0 = new np0(3, this);
        this.F0 = new y11(2, this);
    }

    public static void k0(vb4 r3) {
        ob4 r0 = r3.u0;
        nb4 r1 = new nb4(1, r3);
        hh3 r4 = r0.c;
        nb4 r2 = new nb4(0, r1);
        r4.getClass();
        pn4 r5 = App.f(false);
        if (r5.k != null) goto L5;
        r5.k = new rm3(r5, 14);
    L5:
        rm3 r6 = r5.k;
        r6.getClass();
        Log.d("MediaLibraryScanningClient", "startScan()");
        ((in2) r6.o).a(((pn4) r6.n).f()).enqueue(new om1(22, r2));
    }

    public static void r0(PreferenceGroup r4) {
        int r1 = 0;
    L4:
        if (r1 >= r4.d0.size()) goto L14;
        Preference r2 = r4.G(r1);
        r2.A(true);
        if ((r2 instanceof PreferenceCategory) == false) goto L11;
        if (r2.x == null) goto L11;
        r2.x = null;
        r2.w = 0;
        r2.h();
    L11:
        if ((r2 instanceof PreferenceGroup) == false) goto L13;
        r0((PreferenceGroup) r2);
    L13:
        r1 = r1 + 1;
        goto L4
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void F(Bundle r4) {
        super.F(r4);
        int r0 = 2;
        q5 r5 = new q5(r0);
        this.z0 = W(new nz2(29), r5);
        q5 r6 = new q5(r0);
        this.w0 = W(new ss1(this, 17), r6);
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final View H(LayoutInflater r6, ViewGroup r7, Bundle r8) {
        this.t0 = (MainActivity) l();
        View r9 = super.H(r6, r7, r8);
        nc1 r10 = X();
        e75 r11 = r10.d();
        b75 r0 = gh0.r(r10);
        bq4 r1 = new bq4(r11, r0, b11.e(r10, r0));
        i30 r12 = kx3.a(ob4.class);
        String r13 = r12.b();
        if (r13 == null) goto L10;
        this.u0 = (ob4) r1.l(r12, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r13));
        nc1 r14 = X();
        e75 r15 = r14.d();
        b75 r2 = gh0.r(r14);
        bq4 r4 = new bq4(r15, r2, b11.e(r14, r2));
        i30 r16 = kx3.a(vf2.class);
        String r17 = r16.b();
        if (r17 == null) goto L8;
        this.v0 = (vf2) r4.l(r16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r17));
        this.n0.setPadding(0, 0, 0, (int) r().getDimension(R.dimen.global_padding_bottom));
        return r9;
    L8:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L10:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = false;
    }

    @Override // defpackage.kc1
    public final void O() {
        this.R = true;
        if (this.y0 == false) goto L6;
        X().unbindService(this.F0);
        this.y0 = false;
        return;
    }

    @Override // defpackage.kc1
    public final void P() {
        final int r2 = 1;
        this.R = true;
        this.A0.clear();
        ListPreference r0 = (ListPreference) h0("streaming_cache_size");
        if (r0 == null) goto L5;
        r0.y(new om1(24, this));
    L5:
        ListPreference r3 = (ListPreference) h0("language");
        Context r1 = Z();
        ArrayList r4 = new ArrayList();
        XmlResourceParser r5 = r1.getResources().getXml(R.xml.locale_config);
    L6:
        int r6 = 0;
        if (r5.getEventType() == 1) goto L25;
        String r7 = r5.getName();     // Catch: IOException -> L18 XmlPullParserException -> L20
        if (r5.getEventType() != 2) goto L22;
        if ("locale".equals(r7) == false) goto L22;
        if (r5.getAttributeCount() <= 0) goto L22;
        if (r5.getAttributeName(0).equals("name") == false) goto L22;
        r4.add(r5.getAttributeValue(0));     // Catch: IOException -> L18 XmlPullParserException -> L20
    L22:
        r5.next();     // Catch: IOException -> L18 XmlPullParserException -> L20
    L25:
        StringBuilder r8 = new StringBuilder();
        Iterator r9 = r4.iterator();
        if (r9.hasNext() == false) goto L30;
    L27:
        r8.append((CharSequence) r9.next());
        if (r9.hasNext() == false) goto L30;
        r8.append(",");
    L30:
        wd2 r10 = wd2.a(r8.toString());
        ArrayList r11 = new ArrayList();
        String r12 = App.a().getString(R.string.settings_system_language);
        int r13 = 0;
    L32:
        if (r13 >= r10.b()) goto L56;
        Locale r14 = r10.a.a.get(r13);
        if (r14 == null) goto L54;
        String r15 = r14.getDisplayName();
        if (r15 != null) goto L38;
    L39:
        int r17 = r6;
    L53:
        r11.add(new AbstractMap.SimpleEntry(r15, r14.toLanguageTag()));
    L55:
        r13 = r13 + 1;
        r6 = r17;
        goto L32
    L38:
        if (r15.isEmpty() == true) goto L39;
        StringBuilder r16 = new StringBuilder();
        char[] r18 = r15.toCharArray();
        int r19 = r6;
        int r110 = r19;
    L42:
        if (r19 > (r18.length - 1)) goto L52;
        if (r19 != 0) goto L45;
        r16 = new StringBuilder(Character.toString(Character.toUpperCase(r18[r19])));
        int r111 = r6;
    L51:
        r19 = r19 + 1;
        r6 = r111;
        goto L42
    L45:
        char r20 = r18[r19];
        r111 = r6;
        if (r20 != '_') goto L48;
        r110 = 1;
        goto L51
    L48:
        if (r110 == 0) goto L50;
        r16.append(Character.toUpperCase(r20));
        r110 = r111;
        goto L51
    L50:
        r16.append(r20);
        goto L51
    L52:
        r17 = r6;
        r15 = r16.toString();
        goto L53
    L54:
        r17 = r6;
        goto L55
    L56:
        final int r112 = r6;
        r11.sort(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER));
        LinkedHashMap r21 = new LinkedHashMap();
        String r22 = "default";
        r21.put(r12, "default");
        int r23 = r11.size();
        int r24 = r112;
    L57:
        if (r24 >= r23) goto L59;
        Object r25 = r11.get(r24);
        r24 = r24 + 1;
        Map.Entry r26 = (Map.Entry) r25;
        r21.put((String) r26.getKey(), (String) r26.getValue());
        goto L57
    L59:
        CharSequence[] r27 = (CharSequence[]) r21.keySet().toArray(new CharSequence[r21.size()]);
        CharSequence[] r28 = (CharSequence[]) r21.values().toArray(new CharSequence[r21.size()]);
        r3.G(r27);
        r3.i0 = r28;
        String r29 = r3.j0;
        if ("default".equals(r29) == false) goto L62;
        r3.x(Z().getString(R.string.settings_system_language));
    L63:
        r3.r = new ss1(this, 16);
        final ListPreference r30 = (ListPreference) h0("active_music_folder_id");
        if (r30 != null) goto L67;
    L79:
        h0("version").x(AURAVersion.versionName(Z()));
        EditTextPreference r31 = (EditTextPreference) h0("network_ping_timeout_base");
        if (r31 != null) goto L82;
    L85:
        h0("permissions").s = new ss1(this, 4);
        h0("theme").s = new ss1(this, 13);
        h0("logout").s = new ss1(this, 10);
        h0("scan_library").s = new ss1(this, 20);
        h0("sync_starred_albums_for_offline_use").r = new ss1(this, 6);
        h0("sync_starred_tracks_for_offline_use").r = new ss1(this, 3);
        h0("sync_starred_artists_for_offline_use").r = new ss1(this, 7);
        h0("streaming_cache_storage").s = new ss1(this, 11);
        h0("download_storage").s = new ss1(this, 12);
        ListPreference r32 = (ListPreference) h0("song_preload_buffer");
        Context r33 = n();
        Resources r34 = r();
        String[] r35 = r34.getStringArray(R.array.song_preload_buffer_titles);
        String[] r36 = r34.getStringArray(R.array.song_preload_buffer_values);
        int r37 = Arrays.asList(r36).indexOf(r33.getSharedPreferences(pp3.b(r33), 0).getString("song_preload_buffer", r36[2]));
        if (r37 != (-1)) goto L88;
        int r38 = 2;
    L89:
        r32.x(r33.getString(R.string.settings_song_preload_buffer_summary, new Object[]{r35[r38]}));
        Preference r39 = h0("set_download_directory");
        if (r39 == null) goto L92;
        r39.s = new ss1(this, 14);
    L92:
        h0("delete_download_storage").s = new ss1(this, 15);
        h0("always_on_display").r = new ss1(this, 8);
        SwitchPreference r40 = (SwitchPreference) h0("auto_download_lyrics");
        if (r40 == null) goto L96;
        r40.E(ud3.O());
        r40.r = new nz2(28);
    L96:
        SwitchPreference r41 = (SwitchPreference) h0("mini_shuffle_button_visibility");
        if (r41 == null) goto L100;
        App.b().getClass();
        r41.E(App.c().getBoolean("mini_shuffle_button_visibility", false));
        r41.r = new tb4(0);
    L100:
        Intent r42 = new Intent(X(), MediaService.class);
        r42.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(r42, this.F0, 1);
        this.y0 = true;
        Preference r43 = h0("builtin_equalizer");
        if (r43 == null) goto L103;
        r43.s = new ss1(this, 5);
    L103:
        final ListPreference r44 = (ListPreference) h0("selected_equalizer");
        if (r44 == null) goto L106;
        r44.x(r44.F());
        r44.r = new qb4(this, r44, r2);
    L106:
        SeekBarPreference r45 = (SeekBarPreference) h0("replay_gain_preamp");
        if (r45 == null) goto L110;
        App.b().getClass();
        r45.E(App.c().getInt("loudness_preamp", 0), true);
        r45.r = new ss1(this, 9);
    L110:
        l0();
        return;
    L88:
        r38 = r37;
        goto L89
    L82:
        if (om0.o != null) goto L84;
        om0.o = new om0(19);
    L84:
        r31.y(om0.o);
        r31.i0 = new tb4(1);
        r31.r = new tb4(2);
        goto L85
    L67:
        if (r30.h0 != null) goto L69;
        CharSequence[] r46 = new CharSequence[1];
        r46[r112] = s(R.string.settings_music_library_all);
        r30.G(r46);
        CharSequence[] r47 = new CharSequence[1];
        r47[r112] = "default";
        r30.i0 = r47;
    L69:
        String r48 = ud3.k();
        if (r48 == null) goto L72;
        r22 = r48;
    L72:
        r30.H(r22);
        s0(r30);
        r30.r = new qb4(this, r30, r112);
        if (this.B0 == true) goto L79;
        this.B0 = true;
        ob4 r49 = this.u0;
        le1 r50 = v();
        k03 r51 = r49.e;
        if (r51.d() != null) goto L78;
        r49.d.getClass();
        om0.X().e(r50, new g7(r51, 0));
    L78:
        r51.e(v(), this.E0);
        goto L79
    L62:
        r3.x(Locale.forLanguageTag(r29).getDisplayName());
        goto L63
    L18:
        e = e;
    L24:
        e.printStackTrace();
    L20:
        e = e;
        goto L24
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void R() {
        super.R();
        this.t0.U.p(false);
        this.t0.I(false);
    }

    @Override // defpackage.kp3
    public final void i0(String r12) {
        j0(R.xml.global_preferences, r12);
        PreferenceCategory r13 = (PreferenceCategory) h0("settings_github_update_category_key");
        if (r13 == null) goto L7;
        PreferenceScreen r0 = (PreferenceScreen) this.m0.g;
        r0.I(r13);
        np3 r14 = r0.U;
        if (r14 == null) goto L7;
        Handler r1 = r14.u;
        g5 r15 = r14.v;
        r1.removeCallbacks(r15);
        r1.post(r15);
    L7:
        int r16 = 0;
        bu.f = false;
        bu.g = false;
        int r2 = 1;
        if (((PreferenceScreen) this.m0.g) != null) goto L11;
    L9:
        vb4 r5 = this;
    L55:
        ClickablePreferenceCategory r11 = (ClickablePreferenceCategory) r5.h0("settings_androidauto_category_key");
        if (r11 == null) goto L60;
        PreferenceScreen r3 = (PreferenceScreen) r5.m0.g;
        r3.I(r11);
        np3 r17 = r3.U;
        if (r17 == null) goto L60;
        Handler r4 = r17.u;
        g5 r18 = r17.v;
        r4.removeCallbacks(r18);
        r4.post(r18);
    L60:
        PreferenceScreen r19 = (PreferenceScreen) r5.m0.g;
        if (r19 != null) goto L63;
    L79:
        SwitchPreference r110 = (SwitchPreference) r5.h0("download_wifi_only");
        if (r110 == null) goto L90;
        r110.r = new ss1(r5, 19);
        return;
    L90:
        return;
    L63:
        if (r16 >= r19.d0.size()) goto L79;
        Preference r6 = r19.G(r16);
        if ((r6 instanceof ClickablePreferenceCategory) == false) goto L78;
        ClickablePreferenceCategory r7 = (ClickablePreferenceCategory) r6;
        if (r7.y != null) goto L77;
        String r8 = f34.f(r16, "category_key_");
        r7.y = r8;
        if (r7.E == false) goto L77;
        if (TextUtils.isEmpty(r8) == false) goto L77;
        if (TextUtils.isEmpty(r7.y) == true) goto L75;
        r7.E = true;
        goto L77
    L75:
        kf2.o("Preference does not have a key assigned.");
        return;
    L77:
        r7.j0 = new ss1(r5, 18);
    L78:
        r16 = r16 + 1;
        goto L63
    L11:
        if (h0("homemusic_category") == null) goto L9;
        EditTextPreference r9 = (EditTextPreference) h0("homemusic_hub_url");
        int r10 = 5;
        int r20 = 3;
        int r21 = 17;
        if (r9 == null) goto L16;
        e90 r22 = new e90(17);
        r9.i0 = new ef0(r10, r9, "https://146.103.112.215:8445");
        r9.y(new cn(r21, r22));
        r9.r = new er1(3);
    L16:
        EditTextPreference r23 = (EditTextPreference) h0("homemusic_hub_local_url");
        if (r23 == null) goto L19;
        wc r24 = new wc(6, this);
        r23.i0 = new ef0(r10, r23, "http://192.168.0.111:8080");
        r23.y(new cn(r21, r24));
        r23.r = new er1(3);
    L19:
        Preference r25 = h0("homemusic_google");
        if (r25 == null) goto L22;
        jx3 r26 = new jx3();
        jx3 r27 = new jx3();
        io1.a.execute(new t6(this, r26, r27, r25, 7));
        dg0 r28 = new dg0(r27, this, r26, r25, 3);
        r5 = this;
        r25.s = r28;
    L23:
        Preference r111 = r5.h0("homemusic_admin");
        if (r111 == null) goto L26;
        int r29 = 2;
        io1.a.execute(new ts1(r5, r111, r29));
        r111.s = new ss1(r5, r29);
    L26:
        Preference r112 = r5.h0("homemusic_check_update");
        if (r112 == null) goto L29;
        Integer.valueOf(0);
        r112.x(AURAVersion.versionName(r5.Z()));
        r112.s = new ss1(r5, r2);
    L29:
        Preference r113 = r5.h0("homemusic_leave");
        if (r113 == null) goto L46;
        String r30 = ud3.K();
        String r31 = "";
        if (r30 != null) goto L34;
        r30 = "";
    L34:
        String r32 = ud3.D();
        if (r32 == null) goto L38;
        r31 = r32;
    L38:
        gr1 r33 = null;
        fr1 r34 = new fr1();     // Catch: IllegalArgumentException -> L83
        r34.e(null, r31);     // Catch: IllegalArgumentException -> L83
        r33 = r34.b();     // Catch: IllegalArgumentException -> L83
    L40:
        if (r33 == null) goto L45;
        String r35 = r33.d;
        if (r35 == null) goto L45;
        r31 = r35;
    L45:
        r113.s = new eg0(r5, r30, r31, r20);
    L46:
        Preference r114 = r5.h0("logout");
        if (r114 == null) goto L49;
        r114.A(false);
    L49:
        Preference r115 = r5.h0("homemusic_mix_offline");
        if (r115 == null) goto L52;
        r115.r = new ss1(r5, r16);
        io1.a.execute(new ts1(r5, r115, r16));
    L52:
        Preference r116 = r5.h0("homemusic_traffic_stats");
        if (r116 == null) goto L55;
        r116.s = new ef0(4, r116, r5);
        r116.x(r5.s(R.string.homemusic_settings_traffic_hint));
        io1.a.execute(new ts1(r5, r116, r2));
        goto L55
    L22:
        r5 = this;
        goto L23
    }

    public final void l0() {
        PreferenceScreen r0 = (PreferenceScreen) this.m0.g;
        if (r0 == null) goto L79;
        r0(r0);
        p0();
        Preference r1 = h0("streaming_cache_storage");
        boolean r2 = true;
        if (r1 != null) goto L71;
    L18:
        o0();
        m0();
        n0();
        Preference r3 = h0("active_music_folder_id");
        if (r3 == null) goto L30;
        Integer r4 = this.C0;
        if (r4 != null) goto L24;
    L29:
        r3.A(r2);
        goto L30
    L24:
        if (r4.intValue() > 1) goto L29;
        if (ud3.k() != null) goto L29;
        r2 = false;
    L30:
        Preference r5 = h0("homemusic_google");
        if (r5 == null) goto L33;
        r5.A(bu.f);
    L33:
        Preference r6 = h0("homemusic_admin");
        if (r6 == null) goto L36;
        r6.A(bu.g);
    L36:
        Preference r7 = h0("logout");
        if (r7 == null) goto L39;
        r7.A(false);
    L39:
        Preference r8 = h0("music_directory_section_visibility");
        if (r8 == null) goto L42;
        r8.A(false);
    L42:
        Preference r9 = h0("song_preload_buffer");
        if (r9 == null) goto L46;
        r9.A(false);
    L46:
        if (this.D0.isEmpty() == true) goto L48;
        q0(r0, false);
    L64:
        RecyclerView r10 = this.n0;
        if (r10 != null) goto L67;
        return;
    L67:
        if (r10.getAdapter() == null) goto L78;
        this.n0.getAdapter().d();
        return;
    L78:
        return;
    L48:
        int r11 = 0;
    L50:
        if (r11 >= r0.d0.size()) goto L64;
        Preference r12 = r0.G(r11);
        if ((r12 instanceof PreferenceCategory) == false) goto L63;
        PreferenceCategory r13 = (PreferenceCategory) r12;
        boolean r14 = this.A0.contains(r13.y);
        if (r14 == false) goto L56;
        int r15 = R.drawable.ic_arrow_down;
    L57:
        r13.v(r15);
        if (r14 == true) goto L63;
        int r16 = 0;
    L61:
        if (r16 >= r13.d0.size()) goto L63;
        r13.G(r16).A(false);
        r16 = r16 + 1;
        goto L61
    L56:
        r15 = R.drawable.ic_navigate_next;
    L63:
        r11 = r11 + 1;
        goto L50
    L71:
    L17:
        r1.A(false);
        goto L18
    L9:
        if (Z().getExternalFilesDirs(null)[1] != null) goto L12;
        r1.A(false);     // Catch: Exception -> L17
    L70:
        goto L18
    L12:
        if (ud3.G() != 0) goto L14;
        int r17 = R.string.download_storage_internal_dialog_negative_button;
    L15:
        r1.w(r17);     // Catch: Exception -> L17
        goto L70
    L14:
        r17 = R.string.download_storage_external_dialog_positive_button;
        goto L15
    }

    public final void m0() {
        Preference r0 = h0("download_storage");
        Preference r5 = h0("set_download_directory");
        if (r5 != null) goto L5;
        return;
    L5:
        Context r1 = r5.n;
        String r2 = ud3.o();
        if (r2 == null) goto L11;
        if (r0 == null) goto L9;
        r0.A(false);
    L9:
        r5.A(true);
        r5.v(R.drawable.ic_close);
        r5.z(r1.getString(R.string.settings_clear_download_folder));
        r5.x(r2);
        return;
    L11:
        if (r0 == null) goto L14;
        r0.A(true);
    L14:
        if (ud3.p() != 2) goto L17;
        r5.A(true);
        r5.v(R.drawable.ic_folder);
        r5.z(r1.getString(R.string.settings_set_download_folder));
        r5.w(R.string.settings_choose_download_folder);
        return;
    L17:
        r5.A(false);
    }

    public final void n0() {
        xp r0 = this.x0;
        if (r0 == null) goto L15;
        wo0 r1 = r0.e.A;
        if (r1 == null) goto L13;
        short r2 = ((v11) r1.n).b();
        Preference r3 = h0("app_equalizer");
        if (r3 == null) goto L16;
        if (r2 <= 0) goto L10;
        boolean r4 = true;
    L11:
        r3.A(r4);
        return;
    L10:
        r4 = false;
        goto L11
    L16:
        return;
    L13:
        h12.Q("equalizerManager");
        throw null;
    }

    public final void o0() {
        Preference r0 = h0("download_storage");
        if (r0 != null) goto L21;
        return;
    L21:
    L19:
        r0.A(false);
        return;
    L7:
        if (Z().getExternalFilesDirs(null)[1] != null) goto L10;
        r0.A(false);     // Catch: Exception -> L19
        return;
    L10:
        int r3 = ud3.p();     // Catch: Exception -> L19
        if (r3 != 0) goto L14;
        r0.w(R.string.download_storage_internal_dialog_negative_button);     // Catch: Exception -> L19
        return;
    L14:
        if (r3 != 1) goto L17;
        r0.w(R.string.download_storage_external_dialog_positive_button);     // Catch: Exception -> L19
        return;
    L17:
        r0.w(R.string.download_storage_directory_dialog_neutral_button);     // Catch: Exception -> L19
    }

    public final void p0() {
        Preference r0 = h0("system_equalizer");
        Preference r1 = h0("builtin_equalizer");
        int r2 = ud3.C();
        boolean r3 = false;
        if (r1 == null) goto L8;
        if (r2 != 1) goto L6;
        boolean r5 = true;
    L7:
        r1.A(r5);
        goto L8
    L6:
        r5 = false;
    L8:
        if (r0 == null) goto L18;
        Intent r4 = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
        if (r4.resolveActivity(X().getPackageManager()) == null) goto L16;
        r0.s = new bt2(this, r4);
        if (r2 != 2) goto L14;
        r3 = true;
    L14:
        r0.A(r3);
        return;
    L16:
        r0.A(false);
        return;
    }

    public final boolean q0(PreferenceGroup r11, boolean r12) {
        if (r11 != ((PreferenceScreen) this.m0.g)) goto L5;
        boolean r0 = true;
    L6:
        int r3 = 0;
        boolean r4 = false;
    L8:
        if (r3 >= r11.d0.size()) goto L52;
        Preference r5 = r11.G(r3);
        if (r12 == true) goto L23;
        CharSequence r6 = r5.u;
        String r7 = "";
        if (r6 == null) goto L14;
        String r8 = g12.I(r6.toString());
    L16:
        if (r5.f() == null) goto L19;
        r7 = g12.I(r5.f().toString());
    L19:
        if (r8.contains(this.D0) == false) goto L21;
    L22:
        boolean r9 = true;
    L25:
        if ((r5 instanceof PreferenceGroup) == false) goto L43;
        boolean r10 = r5.K;
        PreferenceGroup r13 = (PreferenceGroup) r5;
        if (r9 == false) goto L30;
        if (r10 == false) goto L30;
        boolean r14 = true;
    L31:
        boolean r15 = q0(r13, r14);
        if (r9 == true) goto L34;
        if (r15 == true) goto L34;
    L36:
        boolean r16 = false;
    L37:
        r5.A(r16);
        if ((r5 instanceof PreferenceCategory) == false) goto L41;
        if (r0 == false) goto L41;
        r5.v(R.drawable.ic_arrow_down);
    L41:
        if (r16 == false) goto L51;
    L50:
        r4 = true;
    L51:
        r3 = r3 + 1;
    L34:
        if (r10 == false) goto L36;
        r16 = true;
    L30:
        r14 = false;
        goto L31
    L43:
        boolean r17 = r5.K;
        if (r9 == false) goto L47;
        if (r17 == false) goto L47;
        boolean r18 = true;
    L48:
        r5.A(r18);
        if (r18 == false) goto L51;
    L47:
        r18 = false;
        goto L48
    L21:
        if (r7.contains(this.D0) == false) goto L23;
    L14:
        r8 = "";
    L23:
        r9 = r12;
        goto L25
    L52:
        return r4;
    L5:
        r0 = false;
        goto L6
    }

    public final void s0(ListPreference r2) {
        CharSequence r0 = r2.F();
        if (r0 == null) goto L6;
        r2.x(r0);
        return;
    L6:
        String r1 = ud3.k();
        if (r1 != null) goto L10;
        r1 = s(R.string.settings_music_library_all);
    L10:
        r2.x(r1);
    }
}
