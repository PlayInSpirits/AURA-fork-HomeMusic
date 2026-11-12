package defpackage;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ eu3 o;

    public /* synthetic */ au3(eu3 eu3Var, int i) {
        this.n = i;
        this.o = eu3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        final int i2 = 0;
        final int i3 = 1;
        final eu3 eu3Var = this.o;
        switch (i) {
            case 0:
                Editable text = ((TextInputEditText) eu3Var.J0.e).getText();
                if (text != null && text.length() > 0) {
                    ((TextInputEditText) eu3Var.J0.e).setText("");
                    ((TextInputEditText) eu3Var.J0.e).requestFocus();
                } else {
                    int visibility = ((ListView) eu3Var.J0.g).getVisibility();
                    w12 w12Var = eu3Var.J0;
                    if (visibility != 0) {
                        ((TextInputEditText) w12Var.e).requestFocus();
                        eu3Var.o0("");
                    } else if (w12Var != null) {
                        ((ListView) w12Var.g).setVisibility(8);
                    }
                }
                break;
            case 1:
                Editable text2 = ((TextInputEditText) eu3Var.B0.f).getText();
                Objects.requireNonNull(text2);
                eu3Var.E0 = text2.toString().trim();
                Editable text3 = ((TextInputEditText) eu3Var.B0.g).getText();
                Objects.requireNonNull(text3);
                eu3Var.F0 = text3.toString().trim();
                Editable text4 = ((TextInputEditText) eu3Var.B0.e).getText();
                Objects.requireNonNull(text4);
                eu3Var.G0 = text4.toString().trim();
                eu3Var.H0 = ((TextInputEditText) eu3Var.B0.d).getText() != null ? ((TextInputEditText) eu3Var.B0.d).getText().toString().trim() : "";
                if (TextUtils.isEmpty(eu3Var.E0)) {
                    ((TextInputEditText) eu3Var.B0.f).setError(eu3Var.s(R.string.error_required));
                    break;
                } else if (TextUtils.isEmpty(eu3Var.F0)) {
                    ((TextInputEditText) eu3Var.B0.g).setError(eu3Var.s(R.string.error_required));
                    break;
                } else {
                    gu3 gu3Var = eu3Var.C0;
                    InternetRadioStation internetRadioStation = gu3Var.d;
                    hh3 hh3Var = gu3Var.c;
                    k03 k03Var = gu3Var.f;
                    k03 k03Var2 = gu3Var.g;
                    String str = eu3Var.E0;
                    String str2 = eu3Var.F0;
                    String str3 = eu3Var.G0;
                    if (internetRadioStation == null) {
                        String str4 = str3.isEmpty() ? null : eu3Var.G0;
                        String str5 = eu3Var.H0.isEmpty() ? null : eu3Var.H0;
                        k03Var2.k(null);
                        k03Var.k(Boolean.FALSE);
                        if (!gu3Var.e) {
                            hh3Var.getClass();
                            xc5 xc5VarD = App.f(false).d();
                            xc5VarD.getClass();
                            Log.d("InternetRadioClient", "createInternetRadioStation()");
                            ((x02) xc5VarD.p).d(((pn4) xc5VarD.o).f(), str2, str, str4).enqueue(new pz1(16, gu3Var));
                        } else {
                            fu3 fu3Var = new fu3(gu3Var, 2);
                            hh3Var.getClass();
                            new Thread(new mr(str, str2, str4, str5, fu3Var)).start();
                        }
                        break;
                    } else {
                        String str6 = str3.isEmpty() ? null : eu3Var.G0;
                        String str7 = eu3Var.H0.isEmpty() ? null : eu3Var.H0;
                        InternetRadioStation internetRadioStation2 = gu3Var.d;
                        if (internetRadioStation2 != null && internetRadioStation2.getId() != null) {
                            k03Var2.k(null);
                            k03Var.k(Boolean.FALSE);
                            boolean z = gu3Var.e;
                            InternetRadioStation internetRadioStation3 = gu3Var.d;
                            if (!z) {
                                String id = internetRadioStation3.getId();
                                hh3Var.getClass();
                                xc5 xc5VarD2 = App.f(false).d();
                                xc5VarD2.getClass();
                                Log.d("InternetRadioClient", "updateInternetRadioStation()");
                                ((x02) xc5VarD2.p).b(((pn4) xc5VarD2.o).f(), id, str2, str, str6).enqueue(new rm2(11, gu3Var));
                            } else {
                                String id2 = internetRadioStation3.getId();
                                fu3 fu3Var2 = new fu3(gu3Var, 1);
                                hh3Var.getClass();
                                new Thread(new up(id2, str, str2, str6, str7, fu3Var2)).start();
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                PopupWindow popupWindow = eu3Var.I0;
                if (popupWindow != null && popupWindow.isShowing()) {
                    eu3Var.I0.dismiss();
                } else {
                    View viewInflate = eu3Var.o().inflate(R.layout.popup_radio_search, (ViewGroup) null, false);
                    int i4 = R.id.popup_cancel_button;
                    MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.popup_cancel_button);
                    if (materialButton != null) {
                        i4 = R.id.popup_country_dropdown;
                        TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.popup_country_dropdown);
                        if (textInputEditText != null) {
                            i4 = R.id.popup_country_layout;
                            TextInputLayout textInputLayout = (TextInputLayout) uo.s(viewInflate, R.id.popup_country_layout);
                            if (textInputLayout != null) {
                                i4 = R.id.popup_country_list;
                                ListView listView = (ListView) uo.s(viewInflate, R.id.popup_country_list);
                                if (listView != null) {
                                    i4 = R.id.popup_empty_results;
                                    TextView textView = (TextView) uo.s(viewInflate, R.id.popup_empty_results);
                                    if (textView != null) {
                                        i4 = R.id.popup_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) uo.s(viewInflate, R.id.popup_progress_bar);
                                        if (progressBar != null) {
                                            i4 = R.id.popup_results_recycler;
                                            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.popup_results_recycler);
                                            if (recyclerView != null) {
                                                i4 = R.id.popup_search_button;
                                                MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.popup_search_button);
                                                if (materialButton2 != null) {
                                                    i4 = R.id.popup_search_name;
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.popup_search_name);
                                                    if (textInputEditText2 != null) {
                                                        i4 = R.id.popup_search_name_layout;
                                                        if (((TextInputLayout) uo.s(viewInflate, R.id.popup_search_name_layout)) != null) {
                                                            eu3Var.J0 = new w12((LinearLayout) viewInflate, materialButton, textInputEditText, textInputLayout, listView, textView, progressBar, recyclerView, materialButton2, textInputEditText2);
                                                            eu3Var.L0 = new zd0(new ss2(11, eu3Var));
                                                            RecyclerView recyclerView2 = (RecyclerView) eu3Var.J0.i;
                                                            eu3Var.Z();
                                                            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                            ((RecyclerView) eu3Var.J0.i).setAdapter(eu3Var.L0);
                                                            ((TextInputEditText) eu3Var.J0.k).setText(((TextInputEditText) eu3Var.B0.f).getText());
                                                            ArrayAdapter arrayAdapter = new ArrayAdapter(eu3Var.Z(), R.layout.item_country_dropdown);
                                                            eu3Var.M0 = arrayAdapter;
                                                            ((ListView) eu3Var.J0.g).setAdapter((ListAdapter) arrayAdapter);
                                                            ((ListView) eu3Var.J0.g).setOnItemClickListener(new ne2(i3, eu3Var));
                                                            ((TextInputEditText) eu3Var.J0.e).addTextChangedListener(new pn1(i3, eu3Var));
                                                            ((TextInputEditText) eu3Var.J0.e).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zt3
                                                                @Override // android.view.View.OnFocusChangeListener
                                                                public final void onFocusChange(View view2, boolean z2) {
                                                                    w12 w12Var2;
                                                                    int i5 = i2;
                                                                    eu3 eu3Var2 = eu3Var;
                                                                    switch (i5) {
                                                                        case 0:
                                                                            if (z2) {
                                                                                eu3Var2.o0(((TextInputEditText) eu3Var2.J0.e).getText() != null ? ((TextInputEditText) eu3Var2.J0.e).getText().toString() : "");
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (z2 && (w12Var2 = eu3Var2.J0) != null) {
                                                                                ((ListView) w12Var2.g).setVisibility(8);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            ((TextInputLayout) eu3Var.J0.f).setEndIconOnClickListener(new au3(eu3Var, i2));
                                                            eu3Var.p0();
                                                            ((TextInputEditText) eu3Var.J0.k).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zt3
                                                                @Override // android.view.View.OnFocusChangeListener
                                                                public final void onFocusChange(View view2, boolean z2) {
                                                                    w12 w12Var2;
                                                                    int i5 = i3;
                                                                    eu3 eu3Var2 = eu3Var;
                                                                    switch (i5) {
                                                                        case 0:
                                                                            if (z2) {
                                                                                eu3Var2.o0(((TextInputEditText) eu3Var2.J0.e).getText() != null ? ((TextInputEditText) eu3Var2.J0.e).getText().toString() : "");
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (z2 && (w12Var2 = eu3Var2.J0) != null) {
                                                                                ((ListView) w12Var2.g).setVisibility(8);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            if (eu3Var.K0.isEmpty()) {
                                                                vt3 vt3VarA = vt3.a();
                                                                vt3VarA.getClass();
                                                                Log.d("RadioBrowserClient", "getCountries");
                                                                vt3VarA.a.a().enqueue(new si1(18, eu3Var));
                                                            }
                                                            ((MaterialButton) eu3Var.J0.c).setOnClickListener(new au3(eu3Var, 3));
                                                            ((MaterialButton) eu3Var.J0.j).setOnClickListener(new au3(eu3Var, 4));
                                                            Rect rect = new Rect();
                                                            eu3Var.X().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                                                            PopupWindow popupWindow2 = new PopupWindow((View) eu3Var.J0.b, rect.width() - (((int) (eu3Var.r().getDisplayMetrics().density * 16.0f)) * 2), (int) (((double) rect.height()) * 0.6d), true);
                                                            eu3Var.I0 = popupWindow2;
                                                            popupWindow2.setFocusable(true);
                                                            eu3Var.I0.setElevation(16.0f);
                                                            eu3Var.I0.setInputMethodMode(1);
                                                            eu3Var.I0.setClippingEnabled(true);
                                                            eu3Var.I0.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: yt3
                                                                @Override // android.widget.PopupWindow.OnDismissListener
                                                                public final void onDismiss() {
                                                                    eu3Var.I0 = null;
                                                                }
                                                            });
                                                            eu3Var.I0.showAtLocation((LinearLayout) eu3Var.B0.a, 17, 0, 0);
                                                            Editable text5 = ((TextInputEditText) eu3Var.J0.k).getText();
                                                            Objects.requireNonNull(text5);
                                                            String strTrim = text5.toString().trim();
                                                            if (!strTrim.isEmpty()) {
                                                                eu3Var.n0(strTrim, "");
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
                    nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                eu3Var.I0.dismiss();
                break;
            default:
                Editable text6 = ((TextInputEditText) eu3Var.J0.k).getText();
                Objects.requireNonNull(text6);
                String strTrim2 = text6.toString().trim();
                String strTrim3 = ((TextInputEditText) eu3Var.J0.e).getText() != null ? ((TextInputEditText) eu3Var.J0.e).getText().toString().trim() : "";
                if (strTrim2.isEmpty() && strTrim3.isEmpty()) {
                    ((TextInputEditText) eu3Var.J0.k).setError(eu3Var.s(R.string.radio_search_empty_query));
                } else {
                    w12 w12Var2 = eu3Var.J0;
                    if (w12Var2 != null) {
                        ((ListView) w12Var2.g).setVisibility(8);
                    }
                    eu3Var.n0(strTrim2, strTrim3);
                }
                break;
        }
    }
}
