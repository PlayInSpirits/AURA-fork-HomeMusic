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
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.d8;
import defpackage.dl3;
import defpackage.e75;
import defpackage.ek1;
import defpackage.g7;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.q7;
import defpackage.rc1;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.v23;
import defpackage.w7;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistCatalogueFragment extends kc1 implements ClickCallback {
    public rc1 l0;
    public MainActivity m0;
    public dl3 n0;
    public q7 o0;

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
        searchView.setOnQueryTextListener(new w7(this, searchView, 3));
        searchView.setPadding(-32, 0, 0, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_playlist_catalogue, viewGroup, false);
        int i2 = R.id.album_info_sector;
        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.album_info_sector);
        if (constraintLayout != null) {
            i2 = R.id.app_bar_layout;
            AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
            if (appBarLayout != null) {
                i2 = R.id.playlist_catalogue_recycler_view;
                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.playlist_catalogue_recycler_view);
                if (recyclerView != null) {
                    i2 = R.id.playlist_list_sort_image_view;
                    Button button = (Button) uo.s(viewInflate, R.id.playlist_list_sort_image_view);
                    if (button != null) {
                        i2 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                        if (materialToolbar != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.l0 = new rc1(linearLayout, constraintLayout, appBarLayout, recyclerView, button, materialToolbar);
                            nc1 nc1VarX = X();
                            e75 e75VarD = nc1VarX.d();
                            b75 b75VarR = gh0.r(nc1VarX);
                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                            i30 i30VarA = kx3.a(dl3.class);
                            String strB = i30VarA.b();
                            if (strB == null) {
                                kf2.n("Local and anonymous classes can not be ViewModels");
                                return null;
                            }
                            this.n0 = (dl3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                            Bundle bundle2 = this.s;
                            if (bundle2 == null) {
                                MainActivity mainActivity = this.m0;
                                if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                    v23Var.o();
                                }
                                return linearLayout;
                            }
                            if (bundle2.getString("ALL") != null || bundle2.getString("DOWNLOADED") != null) {
                                this.n0.getClass();
                            }
                            this.m0.o(this.l0.e);
                            final int i3 = 1;
                            if (this.m0.n() != null) {
                                this.m0.n().f0(true);
                                this.m0.n().g0();
                            }
                            this.l0.e.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: cl3
                                public final /* synthetic */ PlaylistCatalogueFragment o;

                                {
                                    this.o = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i4 = i;
                                    PlaylistCatalogueFragment playlistCatalogueFragment = this.o;
                                    switch (i4) {
                                        case 0:
                                            playlistCatalogueFragment.h0(view);
                                            playlistCatalogueFragment.m0.T.o();
                                            break;
                                        default:
                                            PopupMenu popupMenu = new PopupMenu(playlistCatalogueFragment.Z(), view);
                                            popupMenu.getMenuInflater().inflate(R.menu.sort_playlist_popup_menu, popupMenu.getMenu());
                                            popupMenu.setOnMenuItemClickListener(new v7(7, playlistCatalogueFragment));
                                            popupMenu.show();
                                            break;
                                    }
                                }
                            });
                            this.l0.b.a(new u7(8, this));
                            RecyclerView recyclerView2 = this.l0.c;
                            Context context = recyclerView2.getContext();
                            ut4 ut4VarC = ut4.c();
                            if (!ut4VarC.h) {
                                ut4VarC.b(context);
                            }
                            int i4 = ut4VarC.b;
                            recyclerView2.setLayoutManager(new GridLayoutManager(i4));
                            ut4 ut4VarC2 = ut4.c();
                            if (!ut4VarC2.h) {
                                ut4VarC2.b(context);
                            }
                            recyclerView2.i(new ek1(i4, ut4VarC2.c));
                            recyclerView2.setHasFixedSize(true);
                            int i5 = (int) (16.0f * recyclerView2.getResources().getDisplayMetrics().density);
                            recyclerView2.setPaddingRelative(i5, recyclerView2.getPaddingTop(), i5, recyclerView2.getPaddingBottom());
                            q7 q7Var = new q7(this, true);
                            recyclerView2.setAdapter(q7Var);
                            this.o0 = q7Var;
                            dl3 dl3Var = this.n0;
                            le1 le1VarV = v();
                            k03 k03Var = dl3Var.e;
                            if (k03Var.d() == null) {
                                dl3Var.c.d(-1, false).e(le1VarV, new g7(k03Var, 0));
                            }
                            this.l0.c.setOnTouchListener(new s7(6, this));
                            this.l0.d.setOnClickListener(new View.OnClickListener(this) { // from class: cl3
                                public final /* synthetic */ PlaylistCatalogueFragment o;

                                {
                                    this.o = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i3;
                                    PlaylistCatalogueFragment playlistCatalogueFragment = this.o;
                                    switch (i6) {
                                        case 0:
                                            playlistCatalogueFragment.h0(view);
                                            playlistCatalogueFragment.m0.T.o();
                                            break;
                                        default:
                                            PopupMenu popupMenu = new PopupMenu(playlistCatalogueFragment.Z(), view);
                                            popupMenu.getMenuInflater().inflate(R.menu.sort_playlist_popup_menu, popupMenu.getMenu());
                                            popupMenu.setOnMenuItemClickListener(new v7(7, playlistCatalogueFragment));
                                            popupMenu.show();
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

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        this.n0.f.e(v(), new d8(17, this));
    }

    public final void h0(View view) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle bundle) {
        bundle.putBoolean("is_offline", false);
        gb.x(a0()).m(R.id.playlistPageFragment, bundle, null);
        h0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.playlistRowBottomSheetDialog, bundle, null);
    }
}
