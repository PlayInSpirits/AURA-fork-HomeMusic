package com.eddyizm.tempus.ui.fragment;

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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import defpackage.ae1;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.ck;
import defpackage.d84;
import defpackage.e75;
import defpackage.e84;
import defpackage.ej;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.hd5;
import defpackage.i30;
import defpackage.jv3;
import defpackage.k03;
import defpackage.k74;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l74;
import defpackage.lg1;
import defpackage.li3;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.pn1;
import defpackage.pn4;
import defpackage.rm2;
import defpackage.s6;
import defpackage.sk2;
import defpackage.uo;
import defpackage.ur2;
import defpackage.vi;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xg0;
import defpackage.zn1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SearchFragment extends kc1 implements ClickCallback {
    public ae1 l0;
    public MainActivity m0;
    public d84 n0;
    public li3 o0;
    public vi p0;
    public s6 q0;
    public ni4 r0;
    public ej s0;
    public bl2 t0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        boolean z = false;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search, viewGroup, false);
        int i = R.id.allSongs;
        TextView textView = (TextView) uo.s(viewInflate, R.id.allSongs);
        if (textView != null) {
            i = R.id.allsongsview;
            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.allsongsview);
            if (recyclerView != null) {
                i = R.id.emptyResponseContainer;
                LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.emptyResponseContainer);
                if (linearLayout != null) {
                    i = R.id.search_album_sector;
                    LinearLayout linearLayout2 = (LinearLayout) uo.s(viewInflate, R.id.search_album_sector);
                    if (linearLayout2 != null) {
                        i = R.id.search_artist_sector;
                        LinearLayout linearLayout3 = (LinearLayout) uo.s(viewInflate, R.id.search_artist_sector);
                        if (linearLayout3 != null) {
                            i = R.id.search_bar;
                            SearchBar searchBar = (SearchBar) uo.s(viewInflate, R.id.search_bar);
                            if (searchBar != null) {
                                i = R.id.search_result_album_recycler_view;
                                RecyclerView recyclerView2 = (RecyclerView) uo.s(viewInflate, R.id.search_result_album_recycler_view);
                                if (recyclerView2 != null) {
                                    i = R.id.search_result_artist_recycler_view;
                                    RecyclerView recyclerView3 = (RecyclerView) uo.s(viewInflate, R.id.search_result_artist_recycler_view);
                                    if (recyclerView3 != null) {
                                        i = R.id.search_result_layout;
                                        LinearLayout linearLayout4 = (LinearLayout) uo.s(viewInflate, R.id.search_result_layout);
                                        if (linearLayout4 != null) {
                                            i = R.id.search_result_nested_scroll_view;
                                            if (((NestedScrollView) uo.s(viewInflate, R.id.search_result_nested_scroll_view)) != null) {
                                                i = R.id.search_result_tracks_recycler_view;
                                                RecyclerView recyclerView4 = (RecyclerView) uo.s(viewInflate, R.id.search_result_tracks_recycler_view);
                                                if (recyclerView4 != null) {
                                                    i = R.id.search_song_sector;
                                                    LinearLayout linearLayout5 = (LinearLayout) uo.s(viewInflate, R.id.search_song_sector);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.search_view;
                                                        SearchView searchView = (SearchView) uo.s(viewInflate, R.id.search_view);
                                                        if (searchView != null) {
                                                            i = R.id.search_view_suggestion_container;
                                                            LinearLayout linearLayout6 = (LinearLayout) uo.s(viewInflate, R.id.search_view_suggestion_container);
                                                            if (linearLayout6 != null) {
                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                this.l0 = new ae1(coordinatorLayout, textView, recyclerView, linearLayout, linearLayout2, linearLayout3, searchBar, recyclerView2, recyclerView3, linearLayout4, recyclerView4, linearLayout5, searchView, linearLayout6);
                                                                nc1 nc1VarX = X();
                                                                e75 e75VarD = nc1VarX.d();
                                                                b75 b75VarR = gh0.r(nc1VarX);
                                                                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                                i30 i30VarA = kx3.a(d84.class);
                                                                String strB = i30VarA.b();
                                                                if (strB == null) {
                                                                    kf2.n("Local and anonymous classes can not be ViewModels");
                                                                    return null;
                                                                }
                                                                this.n0 = (d84) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                nc1 nc1VarX2 = X();
                                                                e75 e75VarD2 = nc1VarX2.d();
                                                                b75 b75VarR2 = gh0.r(nc1VarX2);
                                                                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                                                                i30 i30VarA2 = kx3.a(li3.class);
                                                                String strB2 = i30VarA2.b();
                                                                if (strB2 == null) {
                                                                    kf2.n("Local and anonymous classes can not be ViewModels");
                                                                    return null;
                                                                }
                                                                this.o0 = (li3) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                                                                RecyclerView recyclerView5 = (RecyclerView) this.l0.d;
                                                                Z();
                                                                recyclerView5.setLayoutManager(new LinearLayoutManager(0));
                                                                ((RecyclerView) this.l0.d).setHasFixedSize(true);
                                                                Boolean bool = Boolean.FALSE;
                                                                vi viVar = new vi(this, bool, bool);
                                                                this.p0 = viVar;
                                                                ((RecyclerView) this.l0.d).setAdapter(viVar);
                                                                new xg0(0).a((RecyclerView) this.l0.d);
                                                                RecyclerView recyclerView6 = (RecyclerView) this.l0.c;
                                                                Z();
                                                                recyclerView6.setLayoutManager(new LinearLayoutManager(0));
                                                                ((RecyclerView) this.l0.c).setHasFixedSize(true);
                                                                s6 s6Var = new s6(this);
                                                                this.q0 = s6Var;
                                                                ((RecyclerView) this.l0.c).setAdapter(s6Var);
                                                                new xg0(0).a((RecyclerView) this.l0.c);
                                                                RecyclerView recyclerView7 = (RecyclerView) this.l0.e;
                                                                Z();
                                                                recyclerView7.setLayoutManager(new LinearLayoutManager(1));
                                                                ((RecyclerView) this.l0.e).setHasFixedSize(true);
                                                                ni4 ni4Var = new ni4(v(), this, true, false, null);
                                                                this.r0 = ni4Var;
                                                                ni4Var.A = this.t0;
                                                                String str = (String) this.o0.b.d();
                                                                Boolean bool2 = (Boolean) this.o0.c.d();
                                                                ni4 ni4Var2 = this.r0;
                                                                if (bool2 != null && bool2.booleanValue()) {
                                                                    z = true;
                                                                }
                                                                ni4Var2.s(str, z);
                                                                ((RecyclerView) this.l0.e).setAdapter(this.r0);
                                                                RecyclerView recyclerView8 = (RecyclerView) this.l0.b;
                                                                Z();
                                                                recyclerView8.setLayoutManager(new LinearLayoutManager(1));
                                                                ((RecyclerView) this.l0.b).setHasFixedSize(true);
                                                                ej ejVar = new ej(this);
                                                                this.s0 = ejVar;
                                                                ((RecyclerView) this.l0.b).setAdapter(ejVar);
                                                                i0();
                                                                ((SearchView) this.l0.m).getEditText().setOnEditorActionListener(new zn1(1, this));
                                                                ((SearchView) this.l0.m).getEditText().addTextChangedListener(new pn1(2, this));
                                                                ((SearchView) this.l0.m).l();
                                                                return coordinatorLayout;
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
    public final void P() {
        this.R = true;
        ni4 ni4Var = this.r0;
        if (ni4Var != null) {
            ni4Var.A = this.t0;
        }
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
        this.t0 = bl2Var;
        bo2.j(bl2Var, this.o0);
        this.o0.b.e(v(), new k74(this, 0));
        this.o0.c.e(v(), new k74(this, 1));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.t0);
        this.R = true;
    }

    public final void h0(String str) {
        d84 d84Var = this.n0;
        d84Var.getClass();
        if (!str.isEmpty()) {
            rm2 rm2Var = d84Var.c;
            new Thread(new e84((jv3) rm2Var.o, new RecentSearch(str, System.currentTimeMillis() / 1000), 1)).start();
        }
        this.l0.a.setText(this.T.getContext().getString(R.string.search_all_songs_loading));
        this.s0.p(Collections.EMPTY_LIST);
        ((SearchBar) this.l0.l).setText(str);
        ((SearchView) this.l0.m).g();
        this.n0.c.getClass();
        k03 k03Var = new k03();
        Executors.newSingleThreadExecutor().execute(new ur2(20, str, this));
        pn4 pn4VarF = App.f(false);
        if (pn4VarF.g == null) {
            pn4VarF.g = new hd5(pn4VarF);
        }
        pn4VarF.g.m(str, 20, 0, 20, 20).enqueue(new ck(k03Var, 2));
        k03Var.e(v(), new k74(this, 3));
        ((LinearLayout) this.l0.i).setVisibility(0);
    }

    public final void i0() {
        ((LinearLayout) this.l0.k).removeAllViews();
        d84 d84Var = this.n0;
        d84Var.getClass();
        ArrayList arrayList = new ArrayList();
        rm2 rm2Var = d84Var.c;
        rm2Var.getClass();
        List arrayList2 = new ArrayList();
        lg1 lg1Var = new lg1((jv3) rm2Var.o);
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
            arrayList2 = (List) lg1Var.p;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        arrayList.addAll(arrayList2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            View viewInflate = LayoutInflater.from(((LinearLayout) this.l0.k).getContext()).inflate(R.layout.item_search_suggestion, (ViewGroup) this.l0.k, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.search_suggestion_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.search_suggestion_title);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.search_suggestion_delete_icon);
            imageView.setImageDrawable(r().getDrawable(R.drawable.ic_history, null));
            textView.setText(str);
            viewInflate.setOnClickListener(new l74(this, str, 0));
            imageView2.setOnClickListener(new l74(this, str, 1));
            ((LinearLayout) this.l0.k).addView(viewInflate);
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.o(this.t0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"));
        this.r0.d();
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle bundle) {
        PlaylistWithSongs playlistWithSongs = (PlaylistWithSongs) bundle.getParcelable("PLAYLIST_OBJECT");
        if (playlistWithSongs != null) {
            bo2.o(this.t0, playlistWithSongs.getEntries(), 0);
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.playlistBottomSheetDialog, bundle, null);
    }
}
