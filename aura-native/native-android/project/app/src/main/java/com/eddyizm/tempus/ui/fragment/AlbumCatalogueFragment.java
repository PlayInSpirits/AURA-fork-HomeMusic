package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.e75;
import defpackage.ek1;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.lv4;
import defpackage.m7;
import defpackage.n7;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.q7;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.w7;
import defpackage.y7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumCatalogueFragment extends kc1 implements ClickCallback {
    public lv4 l0;
    public MainActivity m0;
    public y7 n0;
    public int o0 = 2;
    public int p0 = 20;
    public q7 q0;
    public String r0;
    public List s0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
        App.b().getClass();
        String string = App.c().getString("album_sort_order", "ALBUM_ORDER_BY_NAME");
        this.r0 = string != null ? string : "ALBUM_ORDER_BY_NAME";
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(y7.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return;
        }
        y7 y7Var = (y7) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.n0 = y7Var;
        y7Var.e = 0;
        y7Var.f = 1;
        y7Var.c.k(new ArrayList());
        y7Var.c();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new w7(this, searchView, 0));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_album_catalogue, viewGroup, false);
        int i2 = R.id.album_catalogue_recycler_view;
        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.album_catalogue_recycler_view);
        if (recyclerView != null) {
            i2 = R.id.album_info_sector;
            ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.album_info_sector);
            if (constraintLayout != null) {
                i2 = R.id.album_list_progress_loader;
                ProgressBar progressBar = (ProgressBar) uo.s(viewInflate, R.id.album_list_progress_loader);
                if (progressBar != null) {
                    i2 = R.id.album_list_sort_image_view;
                    Button button = (Button) uo.s(viewInflate, R.id.album_list_sort_image_view);
                    if (button != null) {
                        i2 = R.id.albumListSortTextView;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.albumListSortTextView);
                        if (textView != null) {
                            i2 = R.id.app_bar_layout;
                            AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
                            if (appBarLayout != null) {
                                i2 = R.id.sort_container;
                                if (((LinearLayout) uo.s(viewInflate, R.id.sort_container)) != null) {
                                    i2 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        this.l0 = new lv4(linearLayout, recyclerView, constraintLayout, progressBar, button, textView, appBarLayout, materialToolbar);
                                        ut4.c().b(Z());
                                        ut4 ut4VarC = ut4.c();
                                        Context contextZ = Z();
                                        if (!ut4VarC.h) {
                                            ut4VarC.b(contextZ);
                                        }
                                        this.o0 = ut4VarC.b;
                                        ut4 ut4VarC2 = ut4.c();
                                        Context contextZ2 = Z();
                                        if (!ut4VarC2.h) {
                                            ut4VarC2.b(contextZ2);
                                        }
                                        this.p0 = ut4VarC2.c;
                                        this.m0.o((MaterialToolbar) this.l0.t);
                                        final int i3 = 1;
                                        if (this.m0.n() != null) {
                                            this.m0.n().f0(true);
                                            this.m0.n().g0();
                                        }
                                        ((MaterialToolbar) this.l0.t).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: t7
                                            public final /* synthetic */ AlbumCatalogueFragment o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i4 = i3;
                                                AlbumCatalogueFragment albumCatalogueFragment = this.o;
                                                switch (i4) {
                                                    case 0:
                                                        PopupMenu popupMenu = new PopupMenu(albumCatalogueFragment.Z(), view);
                                                        popupMenu.getMenuInflater().inflate(R.menu.sort_album_popup_menu, popupMenu.getMenu());
                                                        popupMenu.setOnMenuItemClickListener(new v7(0, albumCatalogueFragment));
                                                        popupMenu.show();
                                                        break;
                                                    default:
                                                        albumCatalogueFragment.i0(view);
                                                        albumCatalogueFragment.m0.T.o();
                                                        break;
                                                }
                                            }
                                        });
                                        ((AppBarLayout) this.l0.s).a(new u7(i, this));
                                        RecyclerView recyclerView2 = (RecyclerView) this.l0.n;
                                        Z();
                                        recyclerView2.setLayoutManager(new GridLayoutManager(this.o0));
                                        ((RecyclerView) this.l0.n).i(new ek1(this.o0, this.p0));
                                        ((RecyclerView) this.l0.n).setHasFixedSize(true);
                                        q7 q7Var = new q7(this);
                                        this.q0 = q7Var;
                                        q7Var.p = 2;
                                        q7Var.n.g();
                                        ((RecyclerView) this.l0.n).setAdapter(this.q0);
                                        this.n0.c.e(v(), new a83(this) { // from class: r7
                                            public final /* synthetic */ AlbumCatalogueFragment b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // defpackage.a83
                                            public final void b(Object obj) {
                                                int i4 = i3;
                                                AlbumCatalogueFragment albumCatalogueFragment = this.b;
                                                switch (i4) {
                                                    case 0:
                                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                        lv4 lv4Var = albumCatalogueFragment.l0;
                                                        if (!zBooleanValue) {
                                                            ((Button) lv4Var.r).setEnabled(true);
                                                            ((ProgressBar) albumCatalogueFragment.l0.q).setVisibility(8);
                                                        } else {
                                                            ((Button) lv4Var.r).setEnabled(false);
                                                            ((ProgressBar) albumCatalogueFragment.l0.q).setVisibility(0);
                                                        }
                                                        break;
                                                    default:
                                                        albumCatalogueFragment.s0 = (List) obj;
                                                        String strM = b11.m("album_sort_order", "ALBUM_ORDER_BY_NAME");
                                                        String str = strM != null ? strM : "ALBUM_ORDER_BY_NAME";
                                                        albumCatalogueFragment.r0 = str;
                                                        albumCatalogueFragment.h0(str);
                                                        albumCatalogueFragment.j0();
                                                        break;
                                                }
                                            }
                                        });
                                        ((RecyclerView) this.l0.n).setOnTouchListener(new s7(i, this));
                                        ((Button) this.l0.r).setOnClickListener(new View.OnClickListener(this) { // from class: t7
                                            public final /* synthetic */ AlbumCatalogueFragment o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i4 = i;
                                                AlbumCatalogueFragment albumCatalogueFragment = this.o;
                                                switch (i4) {
                                                    case 0:
                                                        PopupMenu popupMenu = new PopupMenu(albumCatalogueFragment.Z(), view);
                                                        popupMenu.getMenuInflater().inflate(R.menu.sort_album_popup_menu, popupMenu.getMenu());
                                                        popupMenu.setOnMenuItemClickListener(new v7(0, albumCatalogueFragment));
                                                        popupMenu.show();
                                                        break;
                                                    default:
                                                        albumCatalogueFragment.i0(view);
                                                        albumCatalogueFragment.m0.T.o();
                                                        break;
                                                }
                                            }
                                        });
                                        this.n0.d.e(v(), new a83(this) { // from class: r7
                                            public final /* synthetic */ AlbumCatalogueFragment b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // defpackage.a83
                                            public final void b(Object obj) {
                                                int i4 = i;
                                                AlbumCatalogueFragment albumCatalogueFragment = this.b;
                                                switch (i4) {
                                                    case 0:
                                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                        lv4 lv4Var = albumCatalogueFragment.l0;
                                                        if (!zBooleanValue) {
                                                            ((Button) lv4Var.r).setEnabled(true);
                                                            ((ProgressBar) albumCatalogueFragment.l0.q).setVisibility(8);
                                                        } else {
                                                            ((Button) lv4Var.r).setEnabled(false);
                                                            ((ProgressBar) albumCatalogueFragment.l0.q).setVisibility(0);
                                                        }
                                                        break;
                                                    default:
                                                        albumCatalogueFragment.s0 = (List) obj;
                                                        String strM = b11.m("album_sort_order", "ALBUM_ORDER_BY_NAME");
                                                        String str = strM != null ? strM : "ALBUM_ORDER_BY_NAME";
                                                        albumCatalogueFragment.r0 = str;
                                                        albumCatalogueFragment.h0(str);
                                                        albumCatalogueFragment.j0();
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
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void I() {
        this.R = true;
        this.n0.f = 2;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        String str;
        this.R = true;
        String strM = b11.m("album_sort_order", "ALBUM_ORDER_BY_NAME");
        String str2 = strM != null ? strM : "ALBUM_ORDER_BY_NAME";
        if (!str2.equals(this.r0)) {
            this.r0 = str2;
        }
        if (this.s0 == null || (str = this.r0) == null) {
            Log.d("AlbumCatalogueFragment", "onResume - Cannot re-sort, missing data");
        } else {
            h0(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h0(String str) {
        q7 q7Var;
        List list;
        List list2 = this.s0;
        if (list2 == null) {
            return;
        }
        q7 q7Var2 = this.q0;
        q7Var2.getClass();
        q7Var2.t = new ArrayList(list2);
        q7Var2.s = new ArrayList(list2);
        q7Var2.d();
        if (str == null || (list = (q7Var = this.q0).s) == null) {
            return;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -1987032272:
                if (str.equals("ALBUM_ORDER_BY_RECENTLY_ADDED")) {
                    b = 0;
                }
                break;
            case -1687333910:
                if (str.equals("ALBUM_ORDER_BY_RANDOM")) {
                    b = 1;
                }
                break;
            case -1031702909:
                if (str.equals("ALBUM_ORDER_BY_RECENTLY_PLAYED")) {
                    b = 2;
                }
                break;
            case -569472142:
                if (str.equals("ALBUM_ORDER_BY_NAME")) {
                    b = 3;
                }
                break;
            case -569140956:
                if (str.equals("ALBUM_ORDER_BY_YEAR")) {
                    b = 4;
                }
                break;
            case -519941048:
                if (str.equals("ALBUM_ORDER_BY_MOST_PLAYED")) {
                    b = 5;
                }
                break;
            case 2136821358:
                if (str.equals("ALBUM_ORDER_BY_ARTIST")) {
                    b = 6;
                }
                break;
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        switch (b) {
            case 0:
                list.sort(Comparator.comparing(new m7(3), Comparator.nullsLast(new n7(0))));
                Collections.reverse(q7Var.s);
                break;
            case 1:
                Collections.shuffle(list);
                break;
            case 2:
                list.sort(Comparator.comparing(new m7(4), Comparator.nullsLast(new n7(0))));
                Collections.reverse(q7Var.s);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                list.sort(Comparator.comparing(new m7(0), comparator));
                break;
            case 4:
                list.sort(Comparator.comparing(new m7(2)));
                break;
            case 5:
                list.sort(Comparator.comparing(new m7(5)));
                Collections.reverse(q7Var.s);
                break;
            case 6:
                list.sort(Comparator.comparing(new m7(1), comparator).thenComparing(new m7(2)));
                break;
        }
        q7Var.d();
    }

    public final void i0(View view) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void j0() {
        if (this.l0 == null) {
            return;
        }
        String str = this.r0;
        String strS = "";
        if (str != null) {
            switch (str) {
                case "ALBUM_ORDER_BY_RECENTLY_ADDED":
                    strS = s(R.string.menu_sort_recently_added);
                    break;
                case "ALBUM_ORDER_BY_RANDOM":
                    strS = s(R.string.menu_sort_random);
                    break;
                case "ALBUM_ORDER_BY_RECENTLY_PLAYED":
                    strS = s(R.string.menu_sort_recently_played);
                    break;
                case "ALBUM_ORDER_BY_NAME":
                    strS = s(R.string.menu_sort_name);
                    break;
                case "ALBUM_ORDER_BY_YEAR":
                    strS = s(R.string.menu_sort_year);
                    break;
                case "ALBUM_ORDER_BY_MOST_PLAYED":
                    strS = s(R.string.menu_sort_most_played);
                    break;
                case "ALBUM_ORDER_BY_ARTIST":
                    strS = s(R.string.menu_group_by_artist);
                    break;
            }
        }
        ((TextView) this.l0.p).setText(strS);
        ((TextView) this.l0.p).setVisibility(0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumPageFragment, bundle, null);
        i0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, bundle, null);
    }
}
