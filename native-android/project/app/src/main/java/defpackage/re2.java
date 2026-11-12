package defpackage;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class re2 extends kc1 {
    public zc1 l0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            bundle2.getBoolean("single_page_mode");
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login_theme, viewGroup, false);
        int i2 = R.id.card_amber;
        MaterialCardView materialCardView = (MaterialCardView) uo.s(viewInflate, R.id.card_amber);
        if (materialCardView != null) {
            i2 = R.id.card_blue;
            MaterialCardView materialCardView2 = (MaterialCardView) uo.s(viewInflate, R.id.card_blue);
            if (materialCardView2 != null) {
                i2 = R.id.card_coral;
                MaterialCardView materialCardView3 = (MaterialCardView) uo.s(viewInflate, R.id.card_coral);
                if (materialCardView3 != null) {
                    i2 = R.id.card_emerald;
                    MaterialCardView materialCardView4 = (MaterialCardView) uo.s(viewInflate, R.id.card_emerald);
                    if (materialCardView4 != null) {
                        i2 = R.id.card_flirt;
                        MaterialCardView materialCardView5 = (MaterialCardView) uo.s(viewInflate, R.id.card_flirt);
                        if (materialCardView5 != null) {
                            i2 = R.id.card_purple;
                            MaterialCardView materialCardView6 = (MaterialCardView) uo.s(viewInflate, R.id.card_purple);
                            if (materialCardView6 != null) {
                                i2 = R.id.card_slate;
                                MaterialCardView materialCardView7 = (MaterialCardView) uo.s(viewInflate, R.id.card_slate);
                                if (materialCardView7 != null) {
                                    i2 = R.id.card_teal;
                                    MaterialCardView materialCardView8 = (MaterialCardView) uo.s(viewInflate, R.id.card_teal);
                                    if (materialCardView8 != null) {
                                        i2 = R.id.chooseAccentColorContainer;
                                        if (((LinearLayout) uo.s(viewInflate, R.id.chooseAccentColorContainer)) != null) {
                                            i2 = R.id.chooseAccentColorTitle;
                                            if (((TextView) uo.s(viewInflate, R.id.chooseAccentColorTitle)) != null) {
                                                i2 = R.id.defaultDynamicSwitch;
                                                MaterialSwitch materialSwitch = (MaterialSwitch) uo.s(viewInflate, R.id.defaultDynamicSwitch);
                                                if (materialSwitch != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    int i3 = R.id.mainSwitchesContainer;
                                                    if (((LinearLayout) uo.s(viewInflate, R.id.mainSwitchesContainer)) != null) {
                                                        i3 = R.id.themesList;
                                                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) uo.s(viewInflate, R.id.themesList);
                                                        if (autoCompleteTextView != null) {
                                                            i3 = R.id.themesListContainer;
                                                            if (((TextInputLayout) uo.s(viewInflate, R.id.themesListContainer)) != null) {
                                                                i3 = R.id.trueBlackSwitch;
                                                                MaterialSwitch materialSwitch2 = (MaterialSwitch) uo.s(viewInflate, R.id.trueBlackSwitch);
                                                                if (materialSwitch2 != null) {
                                                                    zc1 zc1Var = new zc1();
                                                                    zc1Var.a = constraintLayout;
                                                                    zc1Var.b = materialCardView;
                                                                    zc1Var.c = materialCardView2;
                                                                    zc1Var.d = materialCardView3;
                                                                    zc1Var.e = materialCardView4;
                                                                    zc1Var.f = materialCardView5;
                                                                    zc1Var.g = materialCardView6;
                                                                    zc1Var.h = materialCardView7;
                                                                    zc1Var.i = materialCardView8;
                                                                    zc1Var.j = materialSwitch;
                                                                    zc1Var.l = autoCompleteTextView;
                                                                    zc1Var.k = materialSwitch2;
                                                                    this.l0 = zc1Var;
                                                                    final int i4 = 1;
                                                                    if (xa3.u("dark_theme_black", false)) {
                                                                        zc1 zc1Var2 = this.l0;
                                                                        zc1Var2.getClass();
                                                                        ((MaterialSwitch) zc1Var2.k).setChecked(true);
                                                                    }
                                                                    zc1 zc1Var3 = this.l0;
                                                                    zc1Var3.getClass();
                                                                    ((MaterialSwitch) zc1Var3.k).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i5 = i;
                                                                            re2 re2Var = this.o;
                                                                            switch (i5) {
                                                                                case 0:
                                                                                    zc1 zc1Var4 = re2Var.l0;
                                                                                    zc1Var4.getClass();
                                                                                    if (((MaterialSwitch) zc1Var4.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var5 = re2Var.l0;
                                                                                    zc1Var5.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var5.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var4 = this.l0;
                                                                    zc1Var4.getClass();
                                                                    ((MaterialSwitch) zc1Var4.j).setChecked(ud3.S());
                                                                    zc1 zc1Var5 = this.l0;
                                                                    zc1Var5.getClass();
                                                                    final int i5 = 5;
                                                                    ((MaterialSwitch) zc1Var5.j).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i6 = i5;
                                                                            re2 re2Var = this.o;
                                                                            switch (i6) {
                                                                                case 0:
                                                                                    zc1 zc1Var6 = re2Var.l0;
                                                                                    zc1Var6.getClass();
                                                                                    if (((MaterialSwitch) zc1Var6.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var7 = re2Var.l0;
                                                                                    zc1Var7.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var7.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    String[] stringArray = r().getStringArray(R.array.theme_list_titles);
                                                                    stringArray.getClass();
                                                                    List listR0 = ti.r0(stringArray);
                                                                    final String[] stringArray2 = r().getStringArray(R.array.theme_list_values);
                                                                    stringArray2.getClass();
                                                                    ArrayAdapter arrayAdapter = new ArrayAdapter(Z(), android.R.layout.simple_dropdown_item_1line, listR0);
                                                                    zc1 zc1Var6 = this.l0;
                                                                    zc1Var6.getClass();
                                                                    AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) zc1Var6.l;
                                                                    autoCompleteTextView2.setAdapter(arrayAdapter);
                                                                    autoCompleteTextView2.setThreshold(0);
                                                                    fa faVar = new fa(13, arrayAdapter, autoCompleteTextView2);
                                                                    autoCompleteTextView2.setOnClickListener(new p6(25, faVar));
                                                                    final int i6 = 3;
                                                                    autoCompleteTextView2.setOnFocusChangeListener(new p30(3, faVar));
                                                                    int iM0 = ti.m0(stringArray2, ud3.H());
                                                                    autoCompleteTextView2.setText((CharSequence) ((iM0 == -1 || iM0 >= listR0.size()) ? ud3.H() : (String) listR0.get(iM0)), false);
                                                                    autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: qe2
                                                                        @Override // android.widget.AdapterView.OnItemClickListener
                                                                        public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
                                                                            String str = stringArray2[i7];
                                                                            str.getClass();
                                                                            jz4.d(str);
                                                                            App.b().getClass();
                                                                            App.c().edit().putString("theme", str).apply();
                                                                            re2 re2Var = this;
                                                                            nc1 nc1VarE = re2Var.e();
                                                                            nc1VarE.getClass();
                                                                            jz4.r((df) nc1VarE);
                                                                            nc1 nc1VarE2 = re2Var.e();
                                                                            if (nc1VarE2 != null) {
                                                                                nc1VarE2.recreate();
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var7 = this.l0;
                                                                    zc1Var7.getClass();
                                                                    final int i7 = 6;
                                                                    ((MaterialCardView) zc1Var7.f).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i8 = i7;
                                                                            re2 re2Var = this.o;
                                                                            switch (i8) {
                                                                                case 0:
                                                                                    zc1 zc1Var8 = re2Var.l0;
                                                                                    zc1Var8.getClass();
                                                                                    if (((MaterialSwitch) zc1Var8.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var9 = re2Var.l0;
                                                                                    zc1Var9.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var9.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var8 = this.l0;
                                                                    zc1Var8.getClass();
                                                                    final int i8 = 7;
                                                                    ((MaterialCardView) zc1Var8.d).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i9 = i8;
                                                                            re2 re2Var = this.o;
                                                                            switch (i9) {
                                                                                case 0:
                                                                                    zc1 zc1Var9 = re2Var.l0;
                                                                                    zc1Var9.getClass();
                                                                                    if (((MaterialSwitch) zc1Var9.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var10 = re2Var.l0;
                                                                                    zc1Var10.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var10.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var9 = this.l0;
                                                                    zc1Var9.getClass();
                                                                    final int i9 = 8;
                                                                    ((MaterialCardView) zc1Var9.e).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i10 = i9;
                                                                            re2 re2Var = this.o;
                                                                            switch (i10) {
                                                                                case 0:
                                                                                    zc1 zc1Var10 = re2Var.l0;
                                                                                    zc1Var10.getClass();
                                                                                    if (((MaterialSwitch) zc1Var10.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var11 = re2Var.l0;
                                                                                    zc1Var11.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var11.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var10 = this.l0;
                                                                    zc1Var10.getClass();
                                                                    final int i10 = 9;
                                                                    ((MaterialCardView) zc1Var10.e).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i11 = i10;
                                                                            re2 re2Var = this.o;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    zc1 zc1Var11 = re2Var.l0;
                                                                                    zc1Var11.getClass();
                                                                                    if (((MaterialSwitch) zc1Var11.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var12 = re2Var.l0;
                                                                                    zc1Var12.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var12.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var11 = this.l0;
                                                                    zc1Var11.getClass();
                                                                    final int i11 = 10;
                                                                    ((MaterialCardView) zc1Var11.c).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i12 = i11;
                                                                            re2 re2Var = this.o;
                                                                            switch (i12) {
                                                                                case 0:
                                                                                    zc1 zc1Var12 = re2Var.l0;
                                                                                    zc1Var12.getClass();
                                                                                    if (((MaterialSwitch) zc1Var12.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var13 = re2Var.l0;
                                                                                    zc1Var13.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var13.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var12 = this.l0;
                                                                    zc1Var12.getClass();
                                                                    ((MaterialCardView) zc1Var12.g).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i12 = i4;
                                                                            re2 re2Var = this.o;
                                                                            switch (i12) {
                                                                                case 0:
                                                                                    zc1 zc1Var13 = re2Var.l0;
                                                                                    zc1Var13.getClass();
                                                                                    if (((MaterialSwitch) zc1Var13.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var14 = re2Var.l0;
                                                                                    zc1Var14.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var14.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var13 = this.l0;
                                                                    zc1Var13.getClass();
                                                                    final int i12 = 2;
                                                                    ((MaterialCardView) zc1Var13.b).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i13 = i12;
                                                                            re2 re2Var = this.o;
                                                                            switch (i13) {
                                                                                case 0:
                                                                                    zc1 zc1Var14 = re2Var.l0;
                                                                                    zc1Var14.getClass();
                                                                                    if (((MaterialSwitch) zc1Var14.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var15 = re2Var.l0;
                                                                                    zc1Var15.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var15.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var14 = this.l0;
                                                                    zc1Var14.getClass();
                                                                    ((MaterialCardView) zc1Var14.i).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i13 = i6;
                                                                            re2 re2Var = this.o;
                                                                            switch (i13) {
                                                                                case 0:
                                                                                    zc1 zc1Var15 = re2Var.l0;
                                                                                    zc1Var15.getClass();
                                                                                    if (((MaterialSwitch) zc1Var15.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var16 = re2Var.l0;
                                                                                    zc1Var16.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var16.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var15 = this.l0;
                                                                    zc1Var15.getClass();
                                                                    final int i13 = 4;
                                                                    ((MaterialCardView) zc1Var15.h).setOnClickListener(new View.OnClickListener(this) { // from class: pe2
                                                                        public final /* synthetic */ re2 o;

                                                                        {
                                                                            this.o = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i14 = i13;
                                                                            re2 re2Var = this.o;
                                                                            switch (i14) {
                                                                                case 0:
                                                                                    zc1 zc1Var16 = re2Var.l0;
                                                                                    zc1Var16.getClass();
                                                                                    if (((MaterialSwitch) zc1Var16.k).isChecked()) {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC = App.c();
                                                                                        sharedPreferencesC.getClass();
                                                                                        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                                                                                        editorEdit.putBoolean("dark_theme_black", true);
                                                                                        editorEdit.apply();
                                                                                    } else {
                                                                                        App.b().getClass();
                                                                                        SharedPreferences sharedPreferencesC2 = App.c();
                                                                                        sharedPreferencesC2.getClass();
                                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                                                                                        editorEdit2.putBoolean("dark_theme_black", false);
                                                                                        editorEdit2.apply();
                                                                                    }
                                                                                    nc1 nc1VarE = re2Var.e();
                                                                                    nc1VarE.getClass();
                                                                                    jz4.r((df) nc1VarE);
                                                                                    nc1 nc1VarE2 = re2Var.e();
                                                                                    if (nc1VarE2 != null) {
                                                                                        nc1VarE2.recreate();
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    re2Var.h0("HEX:#7B1FA2");
                                                                                    break;
                                                                                case 2:
                                                                                    re2Var.h0("HEX:#FFA000");
                                                                                    break;
                                                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                    re2Var.h0("HEX:#00796B");
                                                                                    break;
                                                                                case 4:
                                                                                    re2Var.h0("HEX:#455A64");
                                                                                    break;
                                                                                case 5:
                                                                                    zc1 zc1Var17 = re2Var.l0;
                                                                                    zc1Var17.getClass();
                                                                                    boolean zIsChecked = ((MaterialSwitch) zc1Var17.j).isChecked();
                                                                                    App.b().getClass();
                                                                                    App.c().edit().putBoolean("dynamic_color_accent", zIsChecked).apply();
                                                                                    re2Var.h0(ud3.m());
                                                                                    break;
                                                                                case 6:
                                                                                    re2Var.m().a0("dialog_result_key", re2Var.v(), new cn(23, re2Var));
                                                                                    String strS = re2Var.s(R.string.la_theme_dialog_color_picker_title);
                                                                                    strS.getClass();
                                                                                    f50 f50Var = new f50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("arg_title", strS);
                                                                                    f50Var.c0(bundle2);
                                                                                    f50Var.m0(re2Var.m(), "ColorPickerDialog");
                                                                                    break;
                                                                                case 7:
                                                                                    re2Var.h0("HEX:#FF5722");
                                                                                    break;
                                                                                case 8:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                case 9:
                                                                                    re2Var.h0("HEX:#2E7D32");
                                                                                    break;
                                                                                default:
                                                                                    re2Var.h0("HEX:#1976D2");
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    zc1 zc1Var16 = this.l0;
                                                                    zc1Var16.getClass();
                                                                    return (ConstraintLayout) zc1Var16.a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i2 = i3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        int color;
        view.getClass();
        String strM = ud3.m();
        if (strM.equals("DYNAMIC") || strM.length() == 0) {
            color = Color.parseColor("#B5076B");
        } else {
            String strZ0 = qm4.z0(strM, "HEX:");
            color = xm4.k0(strZ0, "#", false) ? Color.parseColor(strZ0) : Color.parseColor("#".concat(strZ0));
        }
        zc1 zc1Var = this.l0;
        zc1Var.getClass();
        ((MaterialCardView) zc1Var.f).setCardBackgroundColor(color);
    }

    public final void h0(String str) {
        App.b().getClass();
        App.c().edit().putString("color_accent", str).apply();
        nc1 nc1VarE = e();
        nc1VarE.getClass();
        jz4.r((df) nc1VarE);
        nc1 nc1VarE2 = e();
        if (nc1VarE2 != null) {
            nc1VarE2.recreate();
        }
    }
}
