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

    public SearchFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r23, ViewGroup r24, Bundle r25) {
        this.m0 = (MainActivity) l();
        boolean r6 = false;
        View r0 = r23.inflate(R.layout.fragment_search, r24, false);
        int r1 = R.id.allSongs;
        TextView r9 = (TextView) uo.s(r0, R.id.allSongs);
        if (r9 == null) goto L45;
        r1 = R.id.allsongsview;
        RecyclerView r10 = (RecyclerView) uo.s(r0, R.id.allsongsview);
        if (r10 == null) goto L45;
        r1 = R.id.emptyResponseContainer;
        LinearLayout r11 = (LinearLayout) uo.s(r0, R.id.emptyResponseContainer);
        if (r11 == null) goto L45;
        r1 = R.id.search_album_sector;
        LinearLayout r12 = (LinearLayout) uo.s(r0, R.id.search_album_sector);
        if (r12 == null) goto L45;
        r1 = R.id.search_artist_sector;
        LinearLayout r13 = (LinearLayout) uo.s(r0, R.id.search_artist_sector);
        if (r13 == null) goto L45;
        r1 = R.id.search_bar;
        SearchBar r14 = (SearchBar) uo.s(r0, R.id.search_bar);
        if (r14 == null) goto L45;
        r1 = R.id.search_result_album_recycler_view;
        RecyclerView r15 = (RecyclerView) uo.s(r0, R.id.search_result_album_recycler_view);
        if (r15 == null) goto L45;
        r1 = R.id.search_result_artist_recycler_view;
        RecyclerView r16 = (RecyclerView) uo.s(r0, R.id.search_result_artist_recycler_view);
        if (r16 == null) goto L45;
        r1 = R.id.search_result_layout;
        LinearLayout r17 = (LinearLayout) uo.s(r0, R.id.search_result_layout);
        if (r17 == null) goto L45;
        r1 = R.id.search_result_nested_scroll_view;
        if (((NestedScrollView) uo.s(r0, R.id.search_result_nested_scroll_view)) == null) goto L45;
        r1 = R.id.search_result_tracks_recycler_view;
        RecyclerView r18 = (RecyclerView) uo.s(r0, R.id.search_result_tracks_recycler_view);
        if (r18 == null) goto L45;
        r1 = R.id.search_song_sector;
        LinearLayout r19 = (LinearLayout) uo.s(r0, R.id.search_song_sector);
        if (r19 == null) goto L45;
        r1 = R.id.search_view;
        SearchView r20 = (SearchView) uo.s(r0, R.id.search_view);
        if (r20 == null) goto L45;
        r1 = R.id.search_view_suggestion_container;
        LinearLayout r21 = (LinearLayout) uo.s(r0, R.id.search_view_suggestion_container);
        if (r21 == null) goto L45;
        CoordinatorLayout r8 = (CoordinatorLayout) r0;
        this.l0 = new ae1(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        nc1 r2 = X();
        e75 r3 = r2.d();
        b75 r4 = gh0.r(r2);
        bq4 r5 = new bq4(r3, r4, b11.e(r2, r4));
        i30 r7 = kx3.a(d84.class);
        String r22 = r7.b();
        if (r22 == null) goto L43;
        this.n0 = (d84) r5.l(r7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r22));
        nc1 r26 = X();
        e75 r27 = r26.d();
        b75 r28 = gh0.r(r26);
        bq4 r29 = new bq4(r27, r28, b11.e(r26, r28));
        i30 r30 = kx3.a(li3.class);
        String r31 = r30.b();
        if (r31 == null) goto L41;
        this.o0 = (li3) r29.l(r30, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r31));
        RecyclerView r32 = (RecyclerView) this.l0.d;
        Z();
        r32.setLayoutManager(new LinearLayoutManager(0));
        ((RecyclerView) this.l0.d).setHasFixedSize(true);
        Boolean r33 = Boolean.FALSE;
        vi r34 = new vi(this, r33, r33);
        this.p0 = r34;
        ((RecyclerView) this.l0.d).setAdapter(r34);
        new xg0(0).a((RecyclerView) this.l0.d);
        RecyclerView r35 = (RecyclerView) this.l0.c;
        Z();
        r35.setLayoutManager(new LinearLayoutManager(0));
        ((RecyclerView) this.l0.c).setHasFixedSize(true);
        s6 r36 = new s6(this);
        this.q0 = r36;
        ((RecyclerView) this.l0.c).setAdapter(r36);
        new xg0(0).a((RecyclerView) this.l0.c);
        RecyclerView r37 = (RecyclerView) this.l0.e;
        Z();
        r37.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.e).setHasFixedSize(true);
        ni4 r38 = new ni4(v(), this, true, false, null);
        this.r0 = r38;
        r38.A = this.t0;
        String r39 = (String) this.o0.b.d();
        Boolean r40 = (Boolean) this.o0.c.d();
        ni4 r41 = this.r0;
        if (r40 != null) goto L37;
    L39:
        r41.s(r39, r6);
        ((RecyclerView) this.l0.e).setAdapter(this.r0);
        RecyclerView r42 = (RecyclerView) this.l0.b;
        Z();
        r42.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.b).setHasFixedSize(true);
        ej r43 = new ej(this);
        this.s0 = r43;
        ((RecyclerView) this.l0.b).setAdapter(r43);
        i0();
        ((SearchView) this.l0.m).getEditText().setOnEditorActionListener(new zn1(1, this));
        ((SearchView) this.l0.m).getEditText().addTextChangedListener(new pn1(2, this));
        ((SearchView) this.l0.m).l();
        return r8;
    L37:
        if (r40.booleanValue() == false) goto L39;
        r6 = true;
        goto L39
    L41:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L43:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L45:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
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
        ni4 r0 = this.r0;
        if (r0 == null) goto L6;
        r0.A = this.t0;
        return;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L6;
        xc5 r1 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r1), new Handler(r6));
        this.t0 = r7;
        bo2.j(r7, this.o0);
        this.o0.b.e(v(), new k74(this, 0));
        this.o0.c.e(v(), new k74(this, 1));
        return;
    L6:
        r1 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.t0);
        this.R = true;
    }

    public final void h0(String r11) {
        d84 r0 = this.n0;
        r0.getClass();
        if (r11.isEmpty() == true) goto L5;
        rm2 r1 = r0.c;
        RecentSearch r2 = new RecentSearch(r11, System.currentTimeMillis() / 1000);
        new Thread(new e84((jv3) r1.o, r2, 1)).start();
    L5:
        this.l0.a.setText(this.T.getContext().getString(R.string.search_all_songs_loading));
        this.s0.p(Collections.EMPTY_LIST);
        ((SearchBar) this.l0.l).setText(r11);
        ((SearchView) this.l0.m).g();
        this.n0.c.getClass();
        k03 r3 = new k03();
        Executors.newSingleThreadExecutor().execute(new ur2(20, r11, this));
        pn4 r4 = App.f(false);
        if (r4.g != null) goto L8;
        r4.g = new hd5(r4);
    L8:
        r4.g.m(r11, 20, 0, 20, 20).enqueue(new ck(r3, 2));
        r3.e(v(), new k74(this, 3));
        ((LinearLayout) this.l0.i).setVisibility(0);
    }

    public final void i0() {
        ((LinearLayout) this.l0.k).removeAllViews();
        d84 r0 = this.n0;
        r0.getClass();
        ArrayList r1 = new ArrayList();
        rm2 r2 = r0.c;
        r2.getClass();
        List r3 = new ArrayList();
        lg1 r4 = new lg1((jv3) r2.o);
        Thread r5 = new Thread(r4);
        r5.start();
        r5.join();     // Catch: InterruptedException -> L5
        r3 = (List) r4.p;     // Catch: InterruptedException -> L5
    L7:
        r1.addAll(r3);
        int r6 = r1.size();
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L10;
        Object r8 = r1.get(r7);
        r7 = r7 + 1;
        String r9 = (String) r8;
        View r10 = LayoutInflater.from(((LinearLayout) this.l0.k).getContext()).inflate(R.layout.item_search_suggestion, (LinearLayout) this.l0.k, false);
        ImageView r11 = (ImageView) r10.findViewById(R.id.search_suggestion_icon);
        TextView r12 = (TextView) r10.findViewById(R.id.search_suggestion_title);
        ImageView r13 = (ImageView) r10.findViewById(R.id.search_suggestion_delete_icon);
        r11.setImageDrawable(r().getDrawable(R.drawable.ic_history, null));
        r12.setText(r9);
        r10.setOnClickListener(new l74(this, r9, 0));
        r13.setOnClickListener(new l74(this, r9, 1));
        ((LinearLayout) this.l0.k).addView(r10);
        goto L8
    L10:
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        bo2.o(this.t0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"));
        this.r0.d();
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r2) {
        PlaylistWithSongs r3 = (PlaylistWithSongs) r2.getParcelable("PLAYLIST_OBJECT");
        if (r3 == null) goto L6;
        bo2.o(this.t0, r3.getEntries(), 0);
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistBottomSheetDialog, r3, null);
    }
}
