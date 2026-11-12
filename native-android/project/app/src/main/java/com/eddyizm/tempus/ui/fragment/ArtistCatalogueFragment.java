package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ej;
import defpackage.ek1;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gj;
import defpackage.hj;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.rc1;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistCatalogueFragment extends kc1 implements ClickCallback {
    public rc1 l0;
    public MainActivity m0;
    public hj n0;
    public ej o0;
    public int p0 = 2;
    public int q0 = 20;

    public static void h0(ArtistCatalogueFragment artistCatalogueFragment, String str) {
        List<ArtistID3> list = (List) artistCatalogueFragment.n0.c.d();
        if (list == null || list.isEmpty()) {
            return;
        }
        if (str == null || str.trim().isEmpty()) {
            ej ejVar = artistCatalogueFragment.o0;
            ejVar.r = list;
            ejVar.s = new ArrayList(list);
            ejVar.d();
            return;
        }
        String strTrim = str.toLowerCase().trim();
        ArrayList arrayList = new ArrayList();
        for (ArtistID3 artistID3 : list) {
            if (artistID3.getName() != null && artistID3.getName().toLowerCase().contains(strTrim)) {
                arrayList.add(artistID3);
            }
        }
        ej ejVar2 = artistCatalogueFragment.o0;
        ejVar2.r = arrayList;
        ejVar2.s = new ArrayList(arrayList);
        ejVar2.d();
    }

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(hj.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return;
        }
        hj hjVar = (hj) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.n0 = hjVar;
        App.f(false).c().j().enqueue(new zh0(7, hjVar));
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setQueryHint(s(R.string.filter_artist));
        searchView.setOnQueryTextListener(new gj(this));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_artist_catalogue, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i2 = R.id.artist_catalogue_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.artist_catalogue_recycler_view);
            if (recyclerView != null) {
                i2 = R.id.artist_info_sector;
                ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.artist_info_sector);
                if (constraintLayout != null) {
                    i2 = R.id.artist_list_sort_image_view;
                    Button button = (Button) uo.s(viewInflate, R.id.artist_list_sort_image_view);
                    if (button != null) {
                        i2 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                        if (materialToolbar != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.l0 = new rc1(linearLayout, appBarLayout, recyclerView, constraintLayout, button, materialToolbar);
                            ut4.c().b(Z());
                            ut4 ut4VarC = ut4.c();
                            Context contextZ = Z();
                            if (!ut4VarC.h) {
                                ut4VarC.b(contextZ);
                            }
                            this.p0 = ut4VarC.b;
                            ut4 ut4VarC2 = ut4.c();
                            Context contextZ2 = Z();
                            if (!ut4VarC2.h) {
                                ut4VarC2.b(contextZ2);
                            }
                            this.q0 = ut4VarC2.c;
                            this.m0.o(this.l0.e);
                            final int i3 = 1;
                            if (this.m0.n() != null) {
                                this.m0.n().f0(true);
                                this.m0.n().g0();
                            }
                            this.l0.e.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: fj
                                public final /* synthetic */ ArtistCatalogueFragment o;

                                {
                                    this.o = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i4 = i3;
                                    ArtistCatalogueFragment artistCatalogueFragment = this.o;
                                    switch (i4) {
                                        case 0:
                                            PopupMenu popupMenu = new PopupMenu(artistCatalogueFragment.Z(), view);
                                            popupMenu.getMenuInflater().inflate(R.menu.sort_artist_popup_menu, popupMenu.getMenu());
                                            popupMenu.setOnMenuItemClickListener(new v7(2, artistCatalogueFragment));
                                            popupMenu.show();
                                            break;
                                        default:
                                            artistCatalogueFragment.i0(view);
                                            artistCatalogueFragment.m0.T.o();
                                            break;
                                    }
                                }
                            });
                            int i4 = 2;
                            this.l0.b.a(new u7(i4, this));
                            RecyclerView recyclerView2 = this.l0.c;
                            Z();
                            recyclerView2.setLayoutManager(new GridLayoutManager(this.p0));
                            this.l0.c.i(new ek1(this.p0, this.q0));
                            this.l0.c.setHasFixedSize(true);
                            ej ejVar = new ej(this);
                            this.o0 = ejVar;
                            ejVar.p = 2;
                            ejVar.n.g();
                            this.l0.c.setAdapter(this.o0);
                            this.n0.c.e(v(), new d8(4, this));
                            this.l0.c.setOnTouchListener(new s7(i4, this));
                            this.l0.d.setOnClickListener(new View.OnClickListener(this) { // from class: fj
                                public final /* synthetic */ ArtistCatalogueFragment o;

                                {
                                    this.o = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i5 = i;
                                    ArtistCatalogueFragment artistCatalogueFragment = this.o;
                                    switch (i5) {
                                        case 0:
                                            PopupMenu popupMenu = new PopupMenu(artistCatalogueFragment.Z(), view);
                                            popupMenu.getMenuInflater().inflate(R.menu.sort_artist_popup_menu, popupMenu.getMenu());
                                            popupMenu.setOnMenuItemClickListener(new v7(2, artistCatalogueFragment));
                                            popupMenu.show();
                                            break;
                                        default:
                                            artistCatalogueFragment.i0(view);
                                            artistCatalogueFragment.m0.T.o();
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void i0(View view) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistPageFragment, bundle, null);
        i0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, bundle, null);
    }
}
