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
    public MainActivity t0;
    public ob4 u0;
    public vf2 v0;
    public r5 w0;
    public xp x0;
    public r5 z0;
    public boolean y0 = false;
    public final HashSet A0 = new HashSet();
    public boolean B0 = false;
    public Integer C0 = null;
    public String D0 = "";
    public final np0 E0 = new np0(3, this);
    public final y11 F0 = new y11(2, this);

    public static void k0(vb4 vb4Var) {
        ob4 ob4Var = vb4Var.u0;
        nb4 nb4Var = new nb4(1, vb4Var);
        hh3 hh3Var = ob4Var.c;
        nb4 nb4Var2 = new nb4(0, nb4Var);
        hh3Var.getClass();
        pn4 pn4VarF = App.f(false);
        if (pn4VarF.k == null) {
            pn4VarF.k = new rm3(pn4VarF, 14);
        }
        rm3 rm3Var = pn4VarF.k;
        rm3Var.getClass();
        Log.d("MediaLibraryScanningClient", "startScan()");
        ((in2) rm3Var.o).a(((pn4) rm3Var.n).f()).enqueue(new om1(22, nb4Var2));
    }

    public static void r0(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.d0.size(); i++) {
            Preference preferenceG = preferenceGroup.G(i);
            preferenceG.A(true);
            if ((preferenceG instanceof PreferenceCategory) && preferenceG.x != null) {
                preferenceG.x = null;
                preferenceG.w = 0;
                preferenceG.h();
            }
            if (preferenceG instanceof PreferenceGroup) {
                r0((PreferenceGroup) preferenceG);
            }
        }
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        int i = 2;
        this.z0 = W(new nz2(29), new q5(i));
        this.w0 = W(new ss1(this, 17), new q5(i));
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t0 = (MainActivity) e();
        View viewH = super.H(layoutInflater, viewGroup, bundle);
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(ob4.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.u0 = (ob4) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        nc1 nc1VarX2 = X();
        e75 e75VarD2 = nc1VarX2.d();
        b75 b75VarR2 = gh0.r(nc1VarX2);
        bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
        i30 i30VarA2 = kx3.a(vf2.class);
        String strB2 = i30VarA2.b();
        if (strB2 == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.v0 = (vf2) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
        this.n0.setPadding(0, 0, 0, (int) r().getDimension(R.dimen.global_padding_bottom));
        return viewH;
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = false;
    }

    @Override // defpackage.kc1
    public final void O() {
        this.R = true;
        if (this.y0) {
            X().unbindService(this.F0);
            this.y0 = false;
        }
    }

    @Override // defpackage.kc1
    public final void P() {
        int i;
        int i2;
        int i3;
        final int i4 = 1;
        this.R = true;
        this.A0.clear();
        ListPreference listPreference = (ListPreference) h0("streaming_cache_size");
        if (listPreference != null) {
            listPreference.y(new om1(24, this));
        }
        ListPreference listPreference2 = (ListPreference) h0("language");
        Context contextZ = Z();
        ArrayList arrayList = new ArrayList();
        XmlResourceParser xml = contextZ.getResources().getXml(R.xml.locale_config);
        while (true) {
            i = 0;
            try {
                if (xml.getEventType() == 1) {
                    break;
                }
                String name = xml.getName();
                if (xml.getEventType() == 2 && "locale".equals(name) && xml.getAttributeCount() > 0 && xml.getAttributeName(0).equals("name")) {
                    arrayList.add(xml.getAttributeValue(0));
                }
                xml.next();
            } catch (IOException e) {
                e = e;
                e.printStackTrace();
            } catch (XmlPullParserException e2) {
                e = e2;
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb.append((CharSequence) ",");
                }
            }
        }
        wd2 wd2VarA = wd2.a(sb.toString());
        ArrayList arrayList2 = new ArrayList();
        String string = App.a().getString(R.string.settings_system_language);
        int i5 = 0;
        while (i5 < wd2VarA.b()) {
            Locale locale = wd2VarA.a.a.get(i5);
            if (locale != null) {
                String displayName = locale.getDisplayName();
                if (displayName == null || displayName.isEmpty()) {
                    i2 = i;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    char[] charArray = displayName.toCharArray();
                    int i6 = i;
                    int i7 = i6;
                    while (i6 <= charArray.length - 1) {
                        if (i6 == 0) {
                            sb2 = new StringBuilder(Character.toString(Character.toUpperCase(charArray[i6])));
                            i3 = i;
                        } else {
                            char c = charArray[i6];
                            i3 = i;
                            if (c == '_') {
                                i7 = 1;
                            } else if (i7 != 0) {
                                sb2.append(Character.toUpperCase(c));
                                i7 = i3;
                            } else {
                                sb2.append(c);
                            }
                        }
                        i6++;
                        i = i3;
                    }
                    i2 = i;
                    displayName = sb2.toString();
                }
                arrayList2.add(new AbstractMap.SimpleEntry(displayName, locale.toLanguageTag()));
            } else {
                i2 = i;
            }
            i5++;
            i = i2;
        }
        final int i8 = i;
        arrayList2.sort(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(string, "default");
        int size = arrayList2.size();
        int i9 = i8;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        CharSequence[] charSequenceArr = (CharSequence[]) linkedHashMap.keySet().toArray(new CharSequence[linkedHashMap.size()]);
        CharSequence[] charSequenceArr2 = (CharSequence[]) linkedHashMap.values().toArray(new CharSequence[linkedHashMap.size()]);
        listPreference2.G(charSequenceArr);
        listPreference2.i0 = charSequenceArr2;
        String str = listPreference2.j0;
        if ("default".equals(str)) {
            listPreference2.x(Z().getString(R.string.settings_system_language));
        } else {
            listPreference2.x(Locale.forLanguageTag(str).getDisplayName());
        }
        listPreference2.r = new ss1(this, 16);
        final ListPreference listPreference3 = (ListPreference) h0("active_music_folder_id");
        if (listPreference3 != null) {
            if (listPreference3.h0 == null) {
                CharSequence[] charSequenceArr3 = new CharSequence[1];
                charSequenceArr3[i8] = s(R.string.settings_music_library_all);
                listPreference3.G(charSequenceArr3);
                CharSequence[] charSequenceArr4 = new CharSequence[1];
                charSequenceArr4[i8] = "default";
                listPreference3.i0 = charSequenceArr4;
            }
            String strK = ud3.k();
            listPreference3.H(strK != null ? strK : "default");
            s0(listPreference3);
            listPreference3.r = new bp3(this) { // from class: qb4
                public final /* synthetic */ vb4 o;

                {
                    this.o = this;
                }

                @Override // defpackage.bp3
                public final boolean g(Preference preference, Object obj2) {
                    CharSequence[] charSequenceArr5;
                    int i10 = i8;
                    ListPreference listPreference4 = listPreference3;
                    vb4 vb4Var = this.o;
                    switch (i10) {
                        case 0:
                            String str2 = (String) obj2;
                            listPreference4.H(str2);
                            vb4Var.v0.d(str2);
                            vb4Var.s0(listPreference4);
                            break;
                        default:
                            String str3 = (String) obj2;
                            int iE = listPreference4.E(str3);
                            listPreference4.x((iE < 0 || (charSequenceArr5 = listPreference4.h0) == null) ? "" : charSequenceArr5[iE]);
                            str3.getClass();
                            App.b().getClass();
                            App.c().edit().putString("selected_equalizer", str3).apply();
                            vb4Var.p0();
                            Intent intent = new Intent(vb4Var.n().getApplicationContext(), (Class<?>) MediaService.class);
                            intent.setAction("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER");
                            ud3.G0(vb4Var.n().getApplicationContext(), intent);
                            break;
                    }
                    return true;
                }
            };
            if (!this.B0) {
                this.B0 = true;
                ob4 ob4Var = this.u0;
                le1 le1VarV = v();
                k03 k03Var = ob4Var.e;
                if (k03Var.d() == null) {
                    ob4Var.d.getClass();
                    om0.X().e(le1VarV, new g7(k03Var, 0));
                }
                k03Var.e(v(), this.E0);
            }
        }
        h0("version").x(AURAVersion.versionName(Z()));
        EditTextPreference editTextPreference = (EditTextPreference) h0("network_ping_timeout_base");
        if (editTextPreference != null) {
            if (om0.o == null) {
                om0.o = new om0(19);
            }
            editTextPreference.y(om0.o);
            editTextPreference.i0 = new tb4(1);
            editTextPreference.r = new tb4(2);
        }
        h0("permissions").s = new ss1(this, 4);
        h0("theme").s = new ss1(this, 13);
        h0("logout").s = new ss1(this, 10);
        h0("scan_library").s = new ss1(this, 20);
        h0("sync_starred_albums_for_offline_use").r = new ss1(this, 6);
        h0("sync_starred_tracks_for_offline_use").r = new ss1(this, 3);
        h0("sync_starred_artists_for_offline_use").r = new ss1(this, 7);
        h0("streaming_cache_storage").s = new ss1(this, 11);
        h0("download_storage").s = new ss1(this, 12);
        ListPreference listPreference4 = (ListPreference) h0("song_preload_buffer");
        Context contextN = n();
        Resources resourcesR = r();
        String[] stringArray = resourcesR.getStringArray(R.array.song_preload_buffer_titles);
        String[] stringArray2 = resourcesR.getStringArray(R.array.song_preload_buffer_values);
        int iIndexOf = Arrays.asList(stringArray2).indexOf(contextN.getSharedPreferences(pp3.b(contextN), 0).getString("song_preload_buffer", stringArray2[2]));
        listPreference4.x(contextN.getString(R.string.settings_song_preload_buffer_summary, stringArray[iIndexOf == -1 ? 2 : iIndexOf]));
        Preference preferenceH0 = h0("set_download_directory");
        if (preferenceH0 != null) {
            preferenceH0.s = new ss1(this, 14);
        }
        h0("delete_download_storage").s = new ss1(this, 15);
        h0("always_on_display").r = new ss1(this, 8);
        SwitchPreference switchPreference = (SwitchPreference) h0("auto_download_lyrics");
        if (switchPreference != null) {
            switchPreference.E(ud3.O());
            switchPreference.r = new nz2(28);
        }
        SwitchPreference switchPreference2 = (SwitchPreference) h0("mini_shuffle_button_visibility");
        if (switchPreference2 != null) {
            App.b().getClass();
            switchPreference2.E(App.c().getBoolean("mini_shuffle_button_visibility", false));
            switchPreference2.r = new tb4(0);
        }
        Intent intent = new Intent(X(), (Class<?>) MediaService.class);
        intent.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(intent, this.F0, 1);
        this.y0 = true;
        Preference preferenceH1 = h0("builtin_equalizer");
        if (preferenceH1 != null) {
            preferenceH1.s = new ss1(this, 5);
        }
        final ListPreference listPreference5 = (ListPreference) h0("selected_equalizer");
        if (listPreference5 != null) {
            listPreference5.x(listPreference5.F());
            listPreference5.r = new bp3(this) { // from class: qb4
                public final /* synthetic */ vb4 o;

                {
                    this.o = this;
                }

                @Override // defpackage.bp3
                public final boolean g(Preference preference, Object obj2) {
                    CharSequence[] charSequenceArr5;
                    int i10 = i4;
                    ListPreference listPreference6 = listPreference5;
                    vb4 vb4Var = this.o;
                    switch (i10) {
                        case 0:
                            String str2 = (String) obj2;
                            listPreference6.H(str2);
                            vb4Var.v0.d(str2);
                            vb4Var.s0(listPreference6);
                            break;
                        default:
                            String str3 = (String) obj2;
                            int iE = listPreference6.E(str3);
                            listPreference6.x((iE < 0 || (charSequenceArr5 = listPreference6.h0) == null) ? "" : charSequenceArr5[iE]);
                            str3.getClass();
                            App.b().getClass();
                            App.c().edit().putString("selected_equalizer", str3).apply();
                            vb4Var.p0();
                            Intent intent2 = new Intent(vb4Var.n().getApplicationContext(), (Class<?>) MediaService.class);
                            intent2.setAction("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER");
                            ud3.G0(vb4Var.n().getApplicationContext(), intent2);
                            break;
                    }
                    return true;
                }
            };
        }
        SeekBarPreference seekBarPreference = (SeekBarPreference) h0("replay_gain_preamp");
        if (seekBarPreference != null) {
            App.b().getClass();
            seekBarPreference.E(App.c().getInt("loudness_preamp", 0), true);
            seekBarPreference.r = new ss1(this, 9);
        }
        l0();
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void R() {
        super.R();
        this.t0.U.p(false);
        this.t0.I(false);
    }

    @Override // defpackage.kp3
    public final void i0(String str) {
        vb4 vb4Var;
        String str2;
        j0(R.xml.global_preferences, str);
        PreferenceCategory preferenceCategory = (PreferenceCategory) h0("settings_github_update_category_key");
        if (preferenceCategory != null) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.m0.g;
            preferenceScreen.I(preferenceCategory);
            np3 np3Var = preferenceScreen.U;
            if (np3Var != null) {
                Handler handler = np3Var.u;
                g5 g5Var = np3Var.v;
                handler.removeCallbacks(g5Var);
                handler.post(g5Var);
            }
        }
        int i = 0;
        bu.f = false;
        bu.g = false;
        int i2 = 1;
        if (((PreferenceScreen) this.m0.g) == null || h0("homemusic_category") == null) {
            vb4Var = this;
        } else {
            EditTextPreference editTextPreference = (EditTextPreference) h0("homemusic_hub_url");
            int i3 = 5;
            int i4 = 3;
            int i5 = 17;
            if (editTextPreference != null) {
                e90 e90Var = new e90(17);
                editTextPreference.i0 = new ef0(i3, editTextPreference, "https://146.103.112.215:8445");
                editTextPreference.y(new cn(i5, e90Var));
                editTextPreference.r = new er1(3);
            }
            EditTextPreference editTextPreference2 = (EditTextPreference) h0("homemusic_hub_local_url");
            if (editTextPreference2 != null) {
                wc wcVar = new wc(6, this);
                editTextPreference2.i0 = new ef0(i3, editTextPreference2, "http://192.168.0.111:8080");
                editTextPreference2.y(new cn(i5, wcVar));
                editTextPreference2.r = new er1(3);
            }
            Preference preferenceH0 = h0("homemusic_google");
            if (preferenceH0 != null) {
                jx3 jx3Var = new jx3();
                jx3 jx3Var2 = new jx3();
                io1.a.execute(new t6(this, jx3Var, jx3Var2, preferenceH0, 7));
                dg0 dg0Var = new dg0(jx3Var2, this, jx3Var, preferenceH0, 3);
                vb4Var = this;
                preferenceH0.s = dg0Var;
            } else {
                vb4Var = this;
            }
            Preference preferenceH1 = vb4Var.h0("homemusic_admin");
            if (preferenceH1 != null) {
                int i6 = 2;
                io1.a.execute(new ts1(vb4Var, preferenceH1, i6));
                preferenceH1.s = new ss1(vb4Var, i6);
            }
            Preference preferenceH2 = vb4Var.h0("homemusic_check_update");
            if (preferenceH2 != null) {
                Integer.valueOf(0);
                preferenceH2.x(AURAVersion.versionName(vb4Var.Z()));
                preferenceH2.s = new ss1(vb4Var, i2);
            }
            Preference preferenceH3 = vb4Var.h0("homemusic_leave");
            if (preferenceH3 != null) {
                String strK = ud3.K();
                if (strK == null) {
                    strK = "";
                }
                String strD = ud3.D();
                String str3 = strD != null ? strD : "";
                gr1 gr1VarB = null;
                try {
                    fr1 fr1Var = new fr1();
                    fr1Var.e(null, str3);
                    gr1VarB = fr1Var.b();
                } catch (IllegalArgumentException unused) {
                }
                if (gr1VarB != null && (str2 = gr1VarB.d) != null) {
                    str3 = str2;
                }
                preferenceH3.s = new eg0(vb4Var, strK, str3, i4);
            }
            Preference preferenceH4 = vb4Var.h0("logout");
            if (preferenceH4 != null) {
                preferenceH4.A(false);
            }
            Preference preferenceH5 = vb4Var.h0("homemusic_mix_offline");
            if (preferenceH5 != null) {
                preferenceH5.r = new ss1(vb4Var, i);
                io1.a.execute(new ts1(vb4Var, preferenceH5, i));
            }
            Preference preferenceH6 = vb4Var.h0("homemusic_traffic_stats");
            if (preferenceH6 != null) {
                preferenceH6.s = new ef0(4, preferenceH6, vb4Var);
                preferenceH6.x(vb4Var.s(R.string.homemusic_settings_traffic_hint));
                io1.a.execute(new ts1(vb4Var, preferenceH6, i2));
            }
        }
        ClickablePreferenceCategory clickablePreferenceCategory = (ClickablePreferenceCategory) vb4Var.h0("settings_androidauto_category_key");
        if (clickablePreferenceCategory != null) {
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) vb4Var.m0.g;
            preferenceScreen2.I(clickablePreferenceCategory);
            np3 np3Var2 = preferenceScreen2.U;
            if (np3Var2 != null) {
                Handler handler2 = np3Var2.u;
                g5 g5Var2 = np3Var2.v;
                handler2.removeCallbacks(g5Var2);
                handler2.post(g5Var2);
            }
        }
        PreferenceScreen preferenceScreen3 = (PreferenceScreen) vb4Var.m0.g;
        if (preferenceScreen3 != null) {
            while (i < preferenceScreen3.d0.size()) {
                Preference preferenceG = preferenceScreen3.G(i);
                if (preferenceG instanceof ClickablePreferenceCategory) {
                    ClickablePreferenceCategory clickablePreferenceCategory2 = (ClickablePreferenceCategory) preferenceG;
                    if (clickablePreferenceCategory2.y == null) {
                        String strF = f34.f(i, "category_key_");
                        clickablePreferenceCategory2.y = strF;
                        if (clickablePreferenceCategory2.E && TextUtils.isEmpty(strF)) {
                            if (TextUtils.isEmpty(clickablePreferenceCategory2.y)) {
                                kf2.o("Preference does not have a key assigned.");
                                return;
                            }
                            clickablePreferenceCategory2.E = true;
                        }
                    }
                    clickablePreferenceCategory2.j0 = new ss1(vb4Var, 18);
                }
                i++;
            }
        }
        SwitchPreference switchPreference = (SwitchPreference) vb4Var.h0("download_wifi_only");
        if (switchPreference != null) {
            switchPreference.r = new ss1(vb4Var, 19);
        }
    }

    public final void l0() {
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.m0.g;
        if (preferenceScreen == null) {
            return;
        }
        r0(preferenceScreen);
        p0();
        Preference preferenceH0 = h0("streaming_cache_storage");
        boolean z = true;
        if (preferenceH0 != null) {
            try {
                if (Z().getExternalFilesDirs(null)[1] == null) {
                    preferenceH0.A(false);
                } else {
                    preferenceH0.w(ud3.G() == 0 ? R.string.download_storage_internal_dialog_negative_button : R.string.download_storage_external_dialog_positive_button);
                }
            } catch (Exception unused) {
                preferenceH0.A(false);
            }
        }
        o0();
        m0();
        n0();
        Preference preferenceH1 = h0("active_music_folder_id");
        if (preferenceH1 != null) {
            Integer num = this.C0;
            if (num != null && num.intValue() <= 1 && ud3.k() == null) {
                z = false;
            }
            preferenceH1.A(z);
        }
        Preference preferenceH2 = h0("homemusic_google");
        if (preferenceH2 != null) {
            preferenceH2.A(bu.f);
        }
        Preference preferenceH3 = h0("homemusic_admin");
        if (preferenceH3 != null) {
            preferenceH3.A(bu.g);
        }
        Preference preferenceH4 = h0("logout");
        if (preferenceH4 != null) {
            preferenceH4.A(false);
        }
        Preference preferenceH5 = h0("music_directory_section_visibility");
        if (preferenceH5 != null) {
            preferenceH5.A(false);
        }
        Preference preferenceH6 = h0("song_preload_buffer");
        if (preferenceH6 != null) {
            preferenceH6.A(false);
        }
        if (this.D0.isEmpty()) {
            for (int i = 0; i < preferenceScreen.d0.size(); i++) {
                Preference preferenceG = preferenceScreen.G(i);
                if (preferenceG instanceof PreferenceCategory) {
                    PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceG;
                    boolean zContains = this.A0.contains(preferenceCategory.y);
                    preferenceCategory.v(zContains ? R.drawable.ic_arrow_down : R.drawable.ic_navigate_next);
                    if (!zContains) {
                        for (int i2 = 0; i2 < preferenceCategory.d0.size(); i2++) {
                            preferenceCategory.G(i2).A(false);
                        }
                    }
                }
            }
        } else {
            q0(preferenceScreen, false);
        }
        RecyclerView recyclerView = this.n0;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        this.n0.getAdapter().d();
    }

    public final void m0() {
        Preference preferenceH0 = h0("download_storage");
        Preference preferenceH1 = h0("set_download_directory");
        if (preferenceH1 == null) {
            return;
        }
        Context context = preferenceH1.n;
        String strO = ud3.o();
        if (strO != null) {
            if (preferenceH0 != null) {
                preferenceH0.A(false);
            }
            preferenceH1.A(true);
            preferenceH1.v(R.drawable.ic_close);
            preferenceH1.z(context.getString(R.string.settings_clear_download_folder));
            preferenceH1.x(strO);
            return;
        }
        if (preferenceH0 != null) {
            preferenceH0.A(true);
        }
        if (ud3.p() != 2) {
            preferenceH1.A(false);
            return;
        }
        preferenceH1.A(true);
        preferenceH1.v(R.drawable.ic_folder);
        preferenceH1.z(context.getString(R.string.settings_set_download_folder));
        preferenceH1.w(R.string.settings_choose_download_folder);
    }

    public final void n0() {
        xp xpVar = this.x0;
        if (xpVar != null) {
            wo0 wo0Var = xpVar.e.A;
            if (wo0Var == null) {
                h12.Q("equalizerManager");
                throw null;
            }
            short sB = ((v11) wo0Var.n).b();
            Preference preferenceH0 = h0("app_equalizer");
            if (preferenceH0 != null) {
                preferenceH0.A(sB > 0);
            }
        }
    }

    public final void o0() {
        Preference preferenceH0 = h0("download_storage");
        if (preferenceH0 == null) {
            return;
        }
        try {
            if (Z().getExternalFilesDirs(null)[1] == null) {
                preferenceH0.A(false);
                return;
            }
            int iP = ud3.p();
            if (iP == 0) {
                preferenceH0.w(R.string.download_storage_internal_dialog_negative_button);
            } else if (iP == 1) {
                preferenceH0.w(R.string.download_storage_external_dialog_positive_button);
            } else {
                preferenceH0.w(R.string.download_storage_directory_dialog_neutral_button);
            }
        } catch (Exception unused) {
            preferenceH0.A(false);
        }
    }

    public final void p0() {
        Preference preferenceH0 = h0("system_equalizer");
        Preference preferenceH1 = h0("builtin_equalizer");
        int iC = ud3.C();
        if (preferenceH1 != null) {
            preferenceH1.A(iC == 1);
        }
        if (preferenceH0 != null) {
            Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
            if (intent.resolveActivity(X().getPackageManager()) == null) {
                preferenceH0.A(false);
            } else {
                preferenceH0.s = new bt2(this, intent);
                preferenceH0.A(iC == 2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    public final boolean q0(PreferenceGroup preferenceGroup, boolean z) {
        boolean z2;
        boolean z3 = preferenceGroup == ((PreferenceScreen) this.m0.g);
        boolean z4 = false;
        for (int i = 0; i < preferenceGroup.d0.size(); i++) {
            Preference preferenceG = preferenceGroup.G(i);
            if (z) {
                z2 = z;
            } else {
                CharSequence charSequence = preferenceG.u;
                String strI = charSequence != null ? g12.I(charSequence.toString()) : "";
                String strI2 = preferenceG.f() != null ? g12.I(preferenceG.f().toString()) : "";
                if (strI.contains(this.D0) || strI2.contains(this.D0)) {
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (preferenceG instanceof PreferenceGroup) {
                boolean z5 = preferenceG.K;
                boolean z6 = (z2 || q0((PreferenceGroup) preferenceG, z2 && z5)) && z5;
                preferenceG.A(z6);
                if ((preferenceG instanceof PreferenceCategory) && z3) {
                    preferenceG.v(R.drawable.ic_arrow_down);
                }
                if (z6) {
                    z4 = true;
                }
            } else {
                boolean z7 = z2 && preferenceG.K;
                preferenceG.A(z7);
                if (z7) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void s0(ListPreference listPreference) {
        CharSequence charSequenceF = listPreference.F();
        if (charSequenceF != null) {
            listPreference.x(charSequenceF);
            return;
        }
        String strK = ud3.k();
        if (strK == null) {
            strK = s(R.string.settings_music_library_all);
        }
        listPreference.x(strK);
    }
}
