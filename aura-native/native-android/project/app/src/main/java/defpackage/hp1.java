package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hp1 extends kc1 implements ClickCallback, RadioCallback {
    public z40 l0;
    public MainActivity m0;
    public iu3 n0;
    public zd0 o0;
    public bl2 p0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home_tab_radio, viewGroup, false);
        int i = R.id.empty_description_image_view;
        if (((ImageView) uo.s(viewInflate, R.id.empty_description_image_view)) != null) {
            i = R.id.empty_radio_station_layout;
            LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.empty_radio_station_layout);
            if (linearLayout != null) {
                i = R.id.hide_section_button;
                TextView textView = (TextView) uo.s(viewInflate, R.id.hide_section_button);
                if (textView != null) {
                    i = R.id.internet_radio_station_pre_text_view;
                    TextView textView2 = (TextView) uo.s(viewInflate, R.id.internet_radio_station_pre_text_view);
                    if (textView2 != null) {
                        i = R.id.internet_radio_station_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.internet_radio_station_recycler_view);
                        if (recyclerView != null) {
                            i = R.id.internet_radio_station_title_text_view;
                            TextView textView3 = (TextView) uo.s(viewInflate, R.id.internet_radio_station_title_text_view);
                            if (textView3 != null) {
                                i = R.id.subtitle_empty_description_label;
                                if (((TextView) uo.s(viewInflate, R.id.subtitle_empty_description_label)) != null) {
                                    i = R.id.title_empty_description_label;
                                    if (((TextView) uo.s(viewInflate, R.id.title_empty_description_label)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.l0 = new z40(constraintLayout, linearLayout, textView, textView2, recyclerView, textView3);
                                        nc1 nc1VarX = X();
                                        e75 e75VarD = nc1VarX.d();
                                        b75 b75VarR = gh0.r(nc1VarX);
                                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                        i30 i30VarA = kx3.a(iu3.class);
                                        String strB = i30VarA.b();
                                        if (strB != null) {
                                            this.n0 = (iu3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                            return constraintLayout;
                                        }
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.p0 = bl2Var;
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        ((TextView) this.l0.p).setOnClickListener(new p6(19, this));
        ((TextView) this.l0.r).setOnLongClickListener(new q6(10, this));
        ((TextView) this.l0.o).setOnClickListener(new ep1(1));
        RecyclerView recyclerView = (RecyclerView) this.l0.q;
        Z();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.q).setHasFixedSize(true);
        zd0 zd0Var = new zd0(this);
        this.o0 = zd0Var;
        ((RecyclerView) this.l0.q).setAdapter(zd0Var);
        this.n0.c(v()).e(v(), new d8(12, this));
    }

    @Override // com.eddyizm.tempus.interfaces.RadioCallback
    public final void onDismiss() {
        new Handler().postDelayed(new qa1(12, this), 1000L);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onInternetRadioStationClick(Bundle bundle) {
        bl2 bl2Var = this.p0;
        InternetRadioStation internetRadioStation = (InternetRadioStation) bundle.getParcelable("INTERNET_RADIO_STATION_OBJECT");
        WeakReference weakReference = bo2.a;
        if (u52.c().a) {
            u52.h(R.string.lan_music_only);
        } else if (bl2Var != null) {
            bl2Var.f(new ws1(22, bl2Var, internetRadioStation), gq0.n);
        }
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onInternetRadioStationLongClick(Bundle bundle) {
        eu3 eu3Var = new eu3(new hg3(23, this));
        eu3Var.c0(bundle);
        eu3Var.m0(this.m0.k(), null);
    }
}
