package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.b8;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.lj;
import defpackage.nc1;
import defpackage.nj;
import defpackage.nz2;
import defpackage.oc1;
import defpackage.os0;
import defpackage.s24;
import defpackage.s7;
import defpackage.ss0;
import defpackage.u7;
import defpackage.uo;
import defpackage.v23;
import defpackage.w7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistListPageFragment extends kc1 implements ClickCallback {
    public oc1 l0;
    public MainActivity m0;
    public nj n0;
    public b8 o0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new w7(this, searchView, 1));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_artist_list_page, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i2 = R.id.artist_info_sector;
            ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.artist_info_sector);
            if (constraintLayout != null) {
                i2 = R.id.artist_list_recycler_view;
                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.artist_list_recycler_view);
                if (recyclerView != null) {
                    i2 = R.id.artist_list_sort_image_view;
                    Button button = (Button) uo.s(viewInflate, R.id.artist_list_sort_image_view);
                    if (button != null) {
                        i2 = R.id.page_subtitle_label;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.page_subtitle_label);
                        if (textView != null) {
                            i2 = R.id.page_title_label;
                            TextView textView2 = (TextView) uo.s(viewInflate, R.id.page_title_label);
                            if (textView2 != null) {
                                i2 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                if (materialToolbar != null) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    this.l0 = new oc1(linearLayout, appBarLayout, constraintLayout, recyclerView, button, textView, textView2, materialToolbar);
                                    nc1 nc1VarX = X();
                                    e75 e75VarD = nc1VarX.d();
                                    b75 b75VarR = gh0.r(nc1VarX);
                                    bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                    i30 i30VarA = kx3.a(nj.class);
                                    String strB = i30VarA.b();
                                    if (strB == null) {
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                    this.n0 = (nj) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                    Bundle bundle2 = this.s;
                                    if (bundle2 == null) {
                                        MainActivity mainActivity = this.m0;
                                        if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                            v23Var.o();
                                        }
                                        return linearLayout;
                                    }
                                    if (bundle2.getString("ARTIST_STARRED") != null) {
                                        this.n0.e = "ARTIST_STARRED";
                                        this.l0.f.setText(R.string.artist_list_page_starred);
                                    } else if (bundle2.getString("ARTIST_DOWNLOADED") != null) {
                                        this.n0.e = "ARTIST_DOWNLOADED";
                                        this.l0.f.setText(R.string.artist_list_page_downloaded);
                                    }
                                    this.m0.o(this.l0.g);
                                    final int i3 = 1;
                                    if (this.m0.n() != null) {
                                        this.m0.n().f0(true);
                                        this.m0.n().g0();
                                    }
                                    this.l0.g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: kj
                                        public final /* synthetic */ ArtistListPageFragment o;

                                        {
                                            this.o = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i3;
                                            ArtistListPageFragment artistListPageFragment = this.o;
                                            switch (i4) {
                                                case 0:
                                                    PopupMenu popupMenu = new PopupMenu(artistListPageFragment.Z(), view);
                                                    popupMenu.getMenuInflater().inflate(R.menu.sort_horizontal_artist_popup_menu, popupMenu.getMenu());
                                                    popupMenu.setOnMenuItemClickListener(new v7(3, artistListPageFragment));
                                                    popupMenu.show();
                                                    break;
                                                default:
                                                    ((InputMethodManager) artistListPageFragment.X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                                                    artistListPageFragment.m0.T.o();
                                                    break;
                                            }
                                        }
                                    });
                                    this.l0.a.a(new u7(3, this));
                                    RecyclerView recyclerView2 = this.l0.c;
                                    Z();
                                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                    this.l0.c.setHasFixedSize(true);
                                    b8 b8Var = new b8(this, 1);
                                    this.o0 = b8Var;
                                    this.l0.c.setAdapter(b8Var);
                                    nj njVar = this.n0;
                                    le1 le1VarV = v();
                                    njVar.getClass();
                                    njVar.f = new k03(new ArrayList());
                                    String str = njVar.e;
                                    str.getClass();
                                    if (str.equals("ARTIST_STARRED")) {
                                        njVar.f = njVar.c.y(-1, false);
                                    } else if (str.equals("ARTIST_DOWNLOADED")) {
                                        ss0 ss0Var = (ss0) njVar.d.o;
                                        ((s24) ss0Var.n).i().a(new String[]{"download"}, new os0(ss0Var, 1)).e(le1VarV, new lj(0));
                                    }
                                    njVar.f.e(v(), new d8(5, this));
                                    this.l0.c.setOnTouchListener(new s7(3, this));
                                    this.l0.d.setOnClickListener(new View.OnClickListener(this) { // from class: kj
                                        public final /* synthetic */ ArtistListPageFragment o;

                                        {
                                            this.o = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i;
                                            ArtistListPageFragment artistListPageFragment = this.o;
                                            switch (i4) {
                                                case 0:
                                                    PopupMenu popupMenu = new PopupMenu(artistListPageFragment.Z(), view);
                                                    popupMenu.getMenuInflater().inflate(R.menu.sort_horizontal_artist_popup_menu, popupMenu.getMenu());
                                                    popupMenu.setOnMenuItemClickListener(new v7(3, artistListPageFragment));
                                                    popupMenu.show();
                                                    break;
                                                default:
                                                    ((InputMethodManager) artistListPageFragment.X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                                                    artistListPageFragment.m0.T.o();
                                                    break;
                                            }
                                        }
                                    });
                                    return linearLayout;
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

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, bundle, null);
    }
}
