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
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
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
import defpackage.gh1;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.ml3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.w7;
import defpackage.y41;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class GenreCatalogueFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public gh1 n0;
    public ej o0;
    public int p0 = 2;
    public int q0 = 20;

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
        searchView.setOnQueryTextListener(new w7(this, searchView, 2));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_genre_catalogue, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i2 = R.id.filter_genres_text_view_clickable;
            Button button = (Button) uo.s(viewInflate, R.id.filter_genres_text_view_clickable);
            if (button != null) {
                i2 = R.id.genre_catalogue_recycler_view;
                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.genre_catalogue_recycler_view);
                if (recyclerView != null) {
                    i2 = R.id.genre_info_sector;
                    ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.genre_info_sector);
                    if (constraintLayout != null) {
                        i2 = R.id.genre_list_sort_image_view;
                        Button button2 = (Button) uo.s(viewInflate, R.id.genre_list_sort_image_view);
                        if (button2 != null) {
                            i2 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.l0 = new ml3(linearLayout, appBarLayout, button, recyclerView, constraintLayout, button2, materialToolbar);
                                nc1 nc1VarX = X();
                                e75 e75VarD = nc1VarX.d();
                                b75 b75VarR = gh0.r(nc1VarX);
                                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                i30 i30VarA = kx3.a(gh1.class);
                                String strB = i30VarA.b();
                                if (strB == null) {
                                    kf2.n("Local and anonymous classes can not be ViewModels");
                                    return null;
                                }
                                gh1 gh1Var = (gh1) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                this.n0 = gh1Var;
                                if (gh1Var.d == null) {
                                    gh1Var.c.getClass();
                                    gh1Var.d = y41.j(-1, false);
                                }
                                ut4.c().a(Z());
                                ut4 ut4VarC = ut4.c();
                                Context contextZ = Z();
                                if (!ut4VarC.i) {
                                    ut4VarC.a(contextZ);
                                }
                                this.p0 = ut4VarC.d;
                                ut4 ut4VarC2 = ut4.c();
                                Context contextZ2 = Z();
                                if (!ut4VarC2.i) {
                                    ut4VarC2.a(contextZ2);
                                }
                                this.q0 = ut4VarC2.e;
                                final int i3 = 1;
                                ((Button) this.l0.b).setOnClickListener(new View.OnClickListener(this) { // from class: fh1
                                    public final /* synthetic */ GenreCatalogueFragment o;

                                    {
                                        this.o = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i3;
                                        GenreCatalogueFragment genreCatalogueFragment = this.o;
                                        switch (i4) {
                                            case 0:
                                                PopupMenu popupMenu = new PopupMenu(genreCatalogueFragment.Z(), view);
                                                popupMenu.getMenuInflater().inflate(R.menu.sort_genre_popup_menu, popupMenu.getMenu());
                                                popupMenu.setOnMenuItemClickListener(new v7(5, genreCatalogueFragment));
                                                popupMenu.show();
                                                break;
                                            case 1:
                                                genreCatalogueFragment.m0.T.m(R.id.action_genreCatalogueFragment_to_filterFragment, null, null);
                                                break;
                                            default:
                                                genreCatalogueFragment.h0(view);
                                                genreCatalogueFragment.m0.T.o();
                                                break;
                                        }
                                    }
                                });
                                this.m0.o((MaterialToolbar) this.l0.f);
                                if (this.m0.n() != null) {
                                    this.m0.n().f0(true);
                                    this.m0.n().g0();
                                }
                                final int i4 = 2;
                                ((MaterialToolbar) this.l0.f).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: fh1
                                    public final /* synthetic */ GenreCatalogueFragment o;

                                    {
                                        this.o = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i4;
                                        GenreCatalogueFragment genreCatalogueFragment = this.o;
                                        switch (i5) {
                                            case 0:
                                                PopupMenu popupMenu = new PopupMenu(genreCatalogueFragment.Z(), view);
                                                popupMenu.getMenuInflater().inflate(R.menu.sort_genre_popup_menu, popupMenu.getMenu());
                                                popupMenu.setOnMenuItemClickListener(new v7(5, genreCatalogueFragment));
                                                popupMenu.show();
                                                break;
                                            case 1:
                                                genreCatalogueFragment.m0.T.m(R.id.action_genreCatalogueFragment_to_filterFragment, null, null);
                                                break;
                                            default:
                                                genreCatalogueFragment.h0(view);
                                                genreCatalogueFragment.m0.T.o();
                                                break;
                                        }
                                    }
                                });
                                int i5 = 5;
                                ((AppBarLayout) this.l0.a).a(new u7(i5, this));
                                RecyclerView recyclerView2 = (RecyclerView) this.l0.c;
                                Z();
                                recyclerView2.setLayoutManager(new GridLayoutManager(this.p0));
                                ((RecyclerView) this.l0.c).i(new ek1(this.p0, this.q0));
                                ((RecyclerView) this.l0.c).setHasFixedSize(true);
                                ej ejVar = new ej(this);
                                this.o0 = ejVar;
                                ejVar.p = 2;
                                ejVar.n.g();
                                ((RecyclerView) this.l0.c).setAdapter(this.o0);
                                this.n0.d.e(v(), new d8(11, this));
                                ((RecyclerView) this.l0.c).setOnTouchListener(new s7(i5, this));
                                ((Button) this.l0.e).setOnClickListener(new View.OnClickListener(this) { // from class: fh1
                                    public final /* synthetic */ GenreCatalogueFragment o;

                                    {
                                        this.o = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i;
                                        GenreCatalogueFragment genreCatalogueFragment = this.o;
                                        switch (i6) {
                                            case 0:
                                                PopupMenu popupMenu = new PopupMenu(genreCatalogueFragment.Z(), view);
                                                popupMenu.getMenuInflater().inflate(R.menu.sort_genre_popup_menu, popupMenu.getMenu());
                                                popupMenu.setOnMenuItemClickListener(new v7(5, genreCatalogueFragment));
                                                popupMenu.show();
                                                break;
                                            case 1:
                                                genreCatalogueFragment.m0.T.m(R.id.action_genreCatalogueFragment_to_filterFragment, null, null);
                                                break;
                                            default:
                                                genreCatalogueFragment.h0(view);
                                                genreCatalogueFragment.m0.T.o();
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void h0(View view) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onGenreClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songListPageFragment, bundle, null);
        h0(a0());
    }
}
