package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.aj2;
import defpackage.b03;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ey;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gp3;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om0;
import defpackage.on1;
import defpackage.oq0;
import defpackage.ov;
import defpackage.p6;
import defpackage.pn1;
import defpackage.pn4;
import defpackage.q8;
import defpackage.qm4;
import defpackage.qn1;
import defpackage.sk2;
import defpackage.tx1;
import defpackage.u7;
import defpackage.uo;
import defpackage.ux3;
import defpackage.wx1;
import defpackage.x;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class IndexFragment extends kc1 implements ClickCallback {
    public ey l0;
    public MainActivity m0;
    public wx1 n0;
    public b03 o0;
    public bl2 p0;
    public om0 q0;
    public MusicFolder r0;
    public List s0 = new ArrayList();

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_index, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i2 = R.id.fast_scrollbar;
            FastScrollbar fastScrollbar = (FastScrollbar) uo.s(viewInflate, R.id.fast_scrollbar);
            if (fastScrollbar != null) {
                i2 = R.id.hm_index_search;
                TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.hm_index_search);
                if (textInputEditText != null) {
                    i2 = R.id.hm_index_search_empty;
                    TextView textView = (TextView) uo.s(viewInflate, R.id.hm_index_search_empty);
                    if (textView != null) {
                        i2 = R.id.hm_index_search_layout;
                        if (((TextInputLayout) uo.s(viewInflate, R.id.hm_index_search_layout)) != null) {
                            i2 = R.id.index_info_sector;
                            ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.index_info_sector);
                            if (constraintLayout != null) {
                                i2 = R.id.index_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.index_recycler_view);
                                if (recyclerView != null) {
                                    i2 = R.id.index_title_label;
                                    TextView textView2 = (TextView) uo.s(viewInflate, R.id.index_title_label);
                                    if (textView2 != null) {
                                        i2 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                            this.l0 = new ey(linearLayout, appBarLayout, fastScrollbar, textInputEditText, textView, constraintLayout, recyclerView, textView2, materialToolbar);
                                            nc1 nc1VarX = X();
                                            e75 e75VarD = nc1VarX.d();
                                            b75 b75VarR = gh0.r(nc1VarX);
                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                            i30 i30VarA = kx3.a(wx1.class);
                                            String strB = i30VarA.b();
                                            if (strB == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.n0 = (wx1) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                            this.q0 = new om0(5);
                                            Bundle bundle2 = this.s;
                                            this.r0 = bundle2 != null ? (MusicFolder) bundle2.getParcelable("MUSIC_FOLDER_OBJECT") : null;
                                            this.m0.o((MaterialToolbar) this.l0.h);
                                            if (this.m0.n() != null) {
                                                this.m0.n().f0(true);
                                                this.m0.n().g0();
                                            }
                                            ((MaterialToolbar) this.l0.h).setNavigationOnClickListener(new p6(21, this));
                                            ((AppBarLayout) this.l0.a).a(new u7(6, this));
                                            RecyclerView recyclerView2 = (RecyclerView) this.l0.f;
                                            Z();
                                            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                            ((RecyclerView) this.l0.f).setHasFixedSize(true);
                                            b03 b03Var = new b03(this);
                                            this.o0 = b03Var;
                                            ((RecyclerView) this.l0.f).setAdapter(b03Var);
                                            wx1 wx1Var = this.n0;
                                            MusicFolder musicFolder = this.r0;
                                            String id = musicFolder != null ? musicFolder.getId() : null;
                                            wx1Var.c.getClass();
                                            k03 k03Var = new k03();
                                            gp3 gp3VarC = App.f(false).c();
                                            gp3VarC.getClass();
                                            Log.d("BrowsingClient", "getIndexes()");
                                            ((ov) gp3VarC.p).b(((pn4) gp3VarC.o).f(), id, null).enqueue(new q8(k03Var, 2));
                                            k03Var.e(v(), new d8(13, this));
                                            TextInputEditText textInputEditText2 = (TextInputEditText) this.l0.c;
                                            x xVar = new x(18, this);
                                            ux3 ux3Var = qn1.a;
                                            textInputEditText2.addTextChangedListener(new pn1(i, xVar));
                                            textInputEditText2.setOnEditorActionListener(new on1());
                                            ey eyVar = this.l0;
                                            ((FastScrollbar) eyVar.b).setRecyclerView((RecyclerView) eyVar.f);
                                            FastScrollbar fastScrollbar2 = (FastScrollbar) this.l0.b;
                                            LayoutInflater.from(fastScrollbar2.getContext()).inflate(R.layout.layout_fast_scrollbar, (ViewGroup) fastScrollbar2, true);
                                            TextView textView3 = (TextView) fastScrollbar2.findViewById(R.id.fastscroller_bubble);
                                            fastScrollbar2.n = textView3;
                                            if (textView3 != null) {
                                                textView3.setVisibility(4);
                                            }
                                            fastScrollbar2.o = fastScrollbar2.findViewById(R.id.fastscroller_handle);
                                            MusicFolder musicFolder2 = this.r0;
                                            if (musicFolder2 != null) {
                                                this.n0.d = musicFolder2;
                                                ((TextView) this.l0.g).setText(musicFolder2.getName());
                                            }
                                            return linearLayout;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void h0() {
        List arrayList;
        ey eyVar = this.l0;
        if (eyVar == null) {
            return;
        }
        String string = ((TextInputEditText) eyVar.c).getText() != null ? ((TextInputEditText) this.l0.c).getText().toString() : "";
        b03 b03Var = this.o0;
        List list = this.s0;
        TextView textView = (TextView) this.l0.d;
        ux3 ux3Var = qn1.a;
        list.getClass();
        string.getClass();
        if (qm4.u0(string)) {
            arrayList = list;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                ux3 ux3Var2 = qn1.a;
                String name = ((Artist) obj).getName();
                if (name == null) {
                    name = "";
                }
                if (qn1.a(name, string)) {
                    arrayList.add(obj);
                }
            }
        }
        textView.setVisibility((!arrayList.isEmpty() || qm4.u0(string) || list.isEmpty()) ? 8 : 0);
        b03Var.r = arrayList;
        b03Var.d();
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicIndexClick(Bundle bundle) {
        gb.x(a0()).m(R.id.directoryFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicIndexPlay(Bundle bundle) {
        String string = bundle.getString("MUSIC_DIRECTORY_ID");
        if (string != null) {
            Toast.makeText(Z(), s(R.string.folder_play_collecting), 0).show();
            ArrayList arrayList = new ArrayList();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            tx1 tx1Var = new tx1(this, arrayList, 0);
            atomicInteger.incrementAndGet();
            this.q0.getClass();
            om0.W(string).e(v(), new oq0(this, arrayList, atomicInteger, tx1Var, 1));
        }
    }
}
