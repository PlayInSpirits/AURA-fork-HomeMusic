package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kb4;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.ml3;
import defpackage.mq0;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om0;
import defpackage.oq0;
import defpackage.qq0;
import defpackage.rq0;
import defpackage.sk2;
import defpackage.uo;
import defpackage.us0;
import defpackage.v23;
import defpackage.x7;
import defpackage.xc5;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DirectoryFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public rq0 n0;
    public zd0 o0;
    public bl2 p0;
    public om0 q0;
    public MenuItem r0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.directory_page_menu, menu);
        this.r0 = menu.getItem(0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_directory, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i2 = R.id.directory_back_image_view;
            Button button = (Button) uo.s(viewInflate, R.id.directory_back_image_view);
            if (button != null) {
                i2 = R.id.directory_info_sector;
                ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.directory_info_sector);
                if (constraintLayout != null) {
                    i2 = R.id.directory_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.directory_recycler_view);
                    if (recyclerView != null) {
                        i2 = R.id.directory_title_label;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.directory_title_label);
                        if (textView != null) {
                            i2 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.l0 = new ml3(linearLayout, appBarLayout, button, constraintLayout, recyclerView, textView, materialToolbar);
                                nc1 nc1VarX = X();
                                e75 e75VarD = nc1VarX.d();
                                b75 b75VarR = gh0.r(nc1VarX);
                                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                i30 i30VarA = kx3.a(rq0.class);
                                String strB = i30VarA.b();
                                if (strB == null) {
                                    kf2.n("Local and anonymous classes can not be ViewModels");
                                    return null;
                                }
                                this.n0 = (rq0) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                this.q0 = new om0(5);
                                Bundle bundle2 = this.s;
                                MainActivity mainActivity = this.m0;
                                if (bundle2 == null) {
                                    if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                        v23Var.o();
                                    }
                                    return linearLayout;
                                }
                                mainActivity.o((MaterialToolbar) this.l0.f);
                                final int i3 = 1;
                                if (this.m0.n() != null) {
                                    this.m0.n().f0(true);
                                    this.m0.n().g0();
                                }
                                ((MaterialToolbar) this.l0.f).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: nq0
                                    public final /* synthetic */ DirectoryFragment o;

                                    {
                                        this.o = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i;
                                        DirectoryFragment directoryFragment = this.o;
                                        switch (i4) {
                                            case 0:
                                                directoryFragment.m0.T.o();
                                                break;
                                            default:
                                                directoryFragment.m0.T.o();
                                                break;
                                        }
                                    }
                                });
                                ((Button) this.l0.b).setOnClickListener(new View.OnClickListener(this) { // from class: nq0
                                    public final /* synthetic */ DirectoryFragment o;

                                    {
                                        this.o = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i3;
                                        DirectoryFragment directoryFragment = this.o;
                                        switch (i4) {
                                            case 0:
                                                directoryFragment.m0.T.o();
                                                break;
                                            default:
                                                directoryFragment.m0.T.o();
                                                break;
                                        }
                                    }
                                });
                                RecyclerView recyclerView2 = (RecyclerView) this.l0.d;
                                Z();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                ((RecyclerView) this.l0.d).setHasFixedSize(true);
                                zd0 zd0Var = new zd0(this);
                                this.o0 = zd0Var;
                                ((RecyclerView) this.l0.d).setAdapter(zd0Var);
                                le1 le1VarV = v();
                                zd0 zd0Var2 = this.o0;
                                Objects.requireNonNull(zd0Var2);
                                kb4.N(le1VarV, new a0(23, zd0Var2));
                                rq0 rq0Var = this.n0;
                                String string = this.s.getString("MUSIC_DIRECTORY_ID");
                                rq0Var.c.getClass();
                                om0.W(string).e(v(), new d8(7, this));
                                return linearLayout;
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
    public final boolean N(MenuItem menuItem) {
        int i = 0;
        if (menuItem.getItemId() != R.id.action_download_directory) {
            return false;
        }
        new us0(new qq0(this), i).m0(this.m0.k(), null);
        return true;
    }

    @Override // defpackage.kc1
    public final void R() {
        xc5 xc5Var;
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(contextZ)));
        } else {
            xc5Var = null;
        }
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
        this.p0 = bl2Var;
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.o(this.p0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicDirectoryClick(Bundle bundle) {
        gb.x(a0()).m(R.id.directoryFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicDirectoryPlay(Bundle bundle) {
        String string = bundle.getString("MUSIC_DIRECTORY_ID");
        if (string != null) {
            Toast.makeText(Z(), s(R.string.folder_play_collecting), 0).show();
            ArrayList arrayList = new ArrayList();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            mq0 mq0Var = new mq0(this, arrayList, 0);
            atomicInteger.incrementAndGet();
            this.q0.getClass();
            om0.W(string).e(v(), new oq0(this, arrayList, atomicInteger, mq0Var, 0));
        }
    }
}
