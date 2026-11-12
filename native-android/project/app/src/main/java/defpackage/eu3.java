package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import retrofit2.Call;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu3 extends pp0 {
    public up0 B0;
    public gu3 C0;
    public final RadioCallback D0;
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public PopupWindow I0;
    public w12 J0;
    public final ArrayList K0 = new ArrayList();
    public zd0 L0;
    public ArrayAdapter M0;
    public boolean N0;

    public eu3(RadioCallback radioCallback) {
        this.D0 = radioCallback;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        PopupWindow popupWindow = this.I0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        Button buttonI;
        Button buttonI2;
        super.R();
        InternetRadioStation internetRadioStation = this.C0.d;
        if (internetRadioStation != null) {
            ((TextInputEditText) this.B0.f).setText(internetRadioStation.getName());
            ((TextInputEditText) this.B0.g).setText(internetRadioStation.getStreamUrl());
            ((TextInputEditText) this.B0.e).setText(internetRadioStation.getHomePageUrl());
            this.B0.b.setVisibility(8);
            ((ImageButton) this.B0.i).setVisibility(8);
            if (this.C0.e) {
                ((TextInputLayout) this.B0.c).setVisibility(0);
                ((TextInputEditText) this.B0.d).setText(internetRadioStation.getCoverArt());
            }
            Dialog dialog = this.w0;
            if (dialog != null && (buttonI2 = ((f9) dialog).i(-3)) != null) {
                buttonI2.setVisibility(0);
            }
        }
        Dialog dialog2 = this.w0;
        if (!(dialog2 instanceof f9) || (buttonI = ((f9) dialog2).i(-1)) == null) {
            return;
        }
        buttonI.setOnClickListener(new au3(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        boolean z;
        final int i = 0;
        View viewInflate = o().inflate(R.layout.dialog_radio_editor, (ViewGroup) null, false);
        int i2 = R.id.internet_radio_station_cover_art_url_layout;
        TextInputLayout textInputLayout = (TextInputLayout) uo.s(viewInflate, R.id.internet_radio_station_cover_art_url_layout);
        if (textInputLayout != null) {
            i2 = R.id.internet_radio_station_cover_art_url_text_view;
            TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.internet_radio_station_cover_art_url_text_view);
            if (textInputEditText != null) {
                i2 = R.id.internet_radio_station_homepage_url_layout;
                if (((TextInputLayout) uo.s(viewInflate, R.id.internet_radio_station_homepage_url_layout)) != null) {
                    i2 = R.id.internet_radio_station_homepage_url_text_view;
                    TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.internet_radio_station_homepage_url_text_view);
                    if (textInputEditText2 != null) {
                        i2 = R.id.internet_radio_station_name_layout;
                        if (((TextInputLayout) uo.s(viewInflate, R.id.internet_radio_station_name_layout)) != null) {
                            i2 = R.id.internet_radio_station_name_text_view;
                            TextInputEditText textInputEditText3 = (TextInputEditText) uo.s(viewInflate, R.id.internet_radio_station_name_text_view);
                            if (textInputEditText3 != null) {
                                i2 = R.id.internet_radio_station_stream_url_layout;
                                if (((TextInputLayout) uo.s(viewInflate, R.id.internet_radio_station_stream_url_layout)) != null) {
                                    i2 = R.id.internet_radio_station_stream_url_text_view;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) uo.s(viewInflate, R.id.internet_radio_station_stream_url_text_view);
                                    if (textInputEditText4 != null) {
                                        i2 = R.id.radio_source_local;
                                        if (((MaterialButton) uo.s(viewInflate, R.id.radio_source_local)) != null) {
                                            i2 = R.id.radio_source_server;
                                            if (((MaterialButton) uo.s(viewInflate, R.id.radio_source_server)) != null) {
                                                int i3 = R.id.radio_source_toggle;
                                                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) uo.s(viewInflate, R.id.radio_source_toggle);
                                                if (materialButtonToggleGroup != null) {
                                                    i3 = R.id.search_directory_button;
                                                    ImageButton imageButton = (ImageButton) uo.s(viewInflate, R.id.search_directory_button);
                                                    if (imageButton != null) {
                                                        i3 = R.id.source_toggle_layout;
                                                        LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.source_toggle_layout);
                                                        if (linearLayout != null) {
                                                            this.B0 = new up0((LinearLayout) viewInflate, textInputLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, materialButtonToggleGroup, imageButton, linearLayout);
                                                            e75 e75VarD = d();
                                                            b75 b75VarR = gh0.r(this);
                                                            tf0 tf0VarQ = gh0.q(this);
                                                            b75VarR.getClass();
                                                            tf0VarQ.getClass();
                                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, tf0VarQ);
                                                            i30 i30VarA = kx3.a(gu3.class);
                                                            String strB = i30VarA.b();
                                                            if (strB == null) {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                                return null;
                                                            }
                                                            this.C0 = (gu3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                            Bundle bundle2 = this.s;
                                                            final int i4 = 1;
                                                            if (bundle2 != null && bundle2.getParcelable("INTERNET_RADIO_STATION_OBJECT") != null) {
                                                                gu3 gu3Var = this.C0;
                                                                InternetRadioStation internetRadioStation = (InternetRadioStation) Y().getParcelable("INTERNET_RADIO_STATION_OBJECT");
                                                                gu3Var.d = internetRadioStation;
                                                                if (internetRadioStation != null) {
                                                                    hh3 hh3Var = gu3Var.c;
                                                                    String id = internetRadioStation.getId();
                                                                    hh3Var.getClass();
                                                                    if (id == null || !id.startsWith("local_")) {
                                                                        z = false;
                                                                    } else {
                                                                        z = true;
                                                                    }
                                                                } else {
                                                                    z = false;
                                                                }
                                                                gu3Var.e = z;
                                                            }
                                                            this.C0.f.e(this, new a83(this) { // from class: bu3
                                                                public final /* synthetic */ eu3 b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // defpackage.a83
                                                                public final void b(Object obj) {
                                                                    Context contextA;
                                                                    int i5;
                                                                    int i6 = i;
                                                                    eu3 eu3Var = this.b;
                                                                    switch (i6) {
                                                                        case 0:
                                                                            Boolean bool = (Boolean) obj;
                                                                            if (bool != null && bool.booleanValue()) {
                                                                                Context contextZ = eu3Var.Z();
                                                                                if (eu3Var.C0.d == null) {
                                                                                    contextA = App.a();
                                                                                    i5 = R.string.radio_editor_dialog_added;
                                                                                } else {
                                                                                    contextA = App.a();
                                                                                    i5 = R.string.radio_editor_dialog_updated;
                                                                                }
                                                                                Toast.makeText(contextZ, contextA.getString(i5), 0).show();
                                                                                RadioCallback radioCallback = eu3Var.D0;
                                                                                if (radioCallback != null) {
                                                                                    radioCallback.onDismiss();
                                                                                }
                                                                                Dialog dialog = eu3Var.w0;
                                                                                Objects.requireNonNull(dialog);
                                                                                dialog.dismiss();
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            String str = (String) obj;
                                                                            if (str != null && !str.isEmpty()) {
                                                                                Toast.makeText(eu3Var.Z(), str, 1).show();
                                                                                eu3Var.C0.g.k(null);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            this.C0.g.e(this, new a83(this) { // from class: bu3
                                                                public final /* synthetic */ eu3 b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // defpackage.a83
                                                                public final void b(Object obj) {
                                                                    Context contextA;
                                                                    int i5;
                                                                    int i6 = i4;
                                                                    eu3 eu3Var = this.b;
                                                                    switch (i6) {
                                                                        case 0:
                                                                            Boolean bool = (Boolean) obj;
                                                                            if (bool != null && bool.booleanValue()) {
                                                                                Context contextZ = eu3Var.Z();
                                                                                if (eu3Var.C0.d == null) {
                                                                                    contextA = App.a();
                                                                                    i5 = R.string.radio_editor_dialog_added;
                                                                                } else {
                                                                                    contextA = App.a();
                                                                                    i5 = R.string.radio_editor_dialog_updated;
                                                                                }
                                                                                Toast.makeText(contextZ, contextA.getString(i5), 0).show();
                                                                                RadioCallback radioCallback = eu3Var.D0;
                                                                                if (radioCallback != null) {
                                                                                    radioCallback.onDismiss();
                                                                                }
                                                                                Dialog dialog = eu3Var.w0;
                                                                                Objects.requireNonNull(dialog);
                                                                                dialog.dismiss();
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            String str = (String) obj;
                                                                            if (str != null && !str.isEmpty()) {
                                                                                Toast.makeText(eu3Var.Z(), str, 1).show();
                                                                                eu3Var.C0.g.k(null);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            InternetRadioStation internetRadioStation2 = this.C0.d;
                                                            up0 up0Var = this.B0;
                                                            if (internetRadioStation2 != null) {
                                                                up0Var.b.setVisibility(8);
                                                                ((ImageButton) this.B0.i).setVisibility(8);
                                                            } else {
                                                                up0Var.b.setVisibility(0);
                                                                ((ImageButton) this.B0.i).setVisibility(0);
                                                                ((MaterialButtonToggleGroup) this.B0.h).p.add(new cu3(this));
                                                                ((MaterialButtonToggleGroup) this.B0.h).b(R.id.radio_source_server, true);
                                                            }
                                                            ((ImageButton) this.B0.i).setOnClickListener(new au3(this, 2));
                                                            vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) this.B0.a);
                                                            vg2VarQ.p(R.string.radio_editor_dialog_title);
                                                            vg2 vg2VarL = vg2VarQ.l(R.string.radio_editor_dialog_positive_button, new wr(3));
                                                            vg2VarL.k(R.string.radio_editor_dialog_neutral_button, new vr(6, this));
                                                            return vg2VarL.j(R.string.radio_editor_dialog_negative_button, new wr(9)).create();
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void n0(String str, String str2) {
        Call<List<RadioBrowserStation>> callC;
        if (this.L0.r.size() == 0) {
            ((ProgressBar) this.J0.h).setVisibility(0);
            ((TextView) this.J0.d).setVisibility(8);
        }
        if (!str.isEmpty() && !str2.isEmpty()) {
            vt3 vt3VarA = vt3.a();
            vt3VarA.getClass();
            Log.d("RadioBrowserClient", "searchAdvanced: name=" + str + " country=" + str2);
            HashMap map = new HashMap();
            if (!str.isEmpty()) {
                map.put("name", str);
            }
            if (!str2.isEmpty()) {
                map.put("country", str2);
            }
            map.put("limit", String.valueOf(30));
            map.put("order", "votes");
            map.put("reverse", "true");
            callC = vt3VarA.a.b(map);
        } else if (str2.isEmpty()) {
            vt3 vt3VarA2 = vt3.a();
            vt3VarA2.getClass();
            Log.d("RadioBrowserClient", "searchByName: ".concat(str));
            callC = vt3VarA2.a.c(str, 30, "votes", true);
        } else {
            vt3 vt3VarA3 = vt3.a();
            vt3VarA3.getClass();
            Log.d("RadioBrowserClient", "searchByCountryExact: ".concat(str2));
            callC = vt3VarA3.a.d(str2, 30, "votes", true);
        }
        callC.enqueue(new om1(21, this));
    }

    public final void o0(String str) {
        if (this.J0 == null) {
            return;
        }
        String lowerCase = str != null ? str.trim().toLowerCase() : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.K0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str2 = (String) obj;
            if (lowerCase.isEmpty() || str2.toLowerCase().contains(lowerCase)) {
                arrayList.add(str2);
            }
        }
        this.M0.clear();
        this.M0.addAll(arrayList);
        this.M0.notifyDataSetChanged();
        w12 w12Var = this.J0;
        if (w12Var != null) {
            int[] iArr = new int[2];
            ((View) ((ListView) w12Var.g).getParent()).getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((TextInputLayout) this.J0.f).getLocationOnScreen(iArr2);
            int i2 = (int) (r().getDisplayMetrics().density * 16.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((ListView) this.J0.g).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = Math.max(0, iArr2[0] - iArr[0]);
            layoutParams.rightMargin = i2;
            ((ListView) this.J0.g).setLayoutParams(layoutParams);
        }
        ((ListView) this.J0.g).setVisibility(arrayList.isEmpty() ? 8 : 0);
    }

    public final void p0() {
        w12 w12Var = this.J0;
        if (w12Var == null) {
            return;
        }
        Editable text = ((TextInputEditText) w12Var.e).getText();
        ((TextInputLayout) this.J0.f).setEndIconDrawable(text != null && text.length() > 0 ? R.drawable.ic_close : R.drawable.ic_expand_more);
    }
}
