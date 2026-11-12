package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.cn;
import defpackage.d7;
import defpackage.e75;
import defpackage.g7;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l92;
import defpackage.le1;
import defpackage.mp1;
import defpackage.n92;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.pa;
import defpackage.q7;
import defpackage.qm4;
import defpackage.qr2;
import defpackage.rn1;
import defpackage.rv2;
import defpackage.s6;
import defpackage.uo;
import defpackage.vf2;
import defpackage.vg2;
import defpackage.vi;
import defpackage.wn1;
import defpackage.xa3;
import defpackage.xc1;
import defpackage.xg0;
import defpackage.y41;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LibraryFragment extends kc1 implements ClickCallback {
    public xc1 l0;
    public MainActivity m0;
    public om1 n0;
    public n92 o0;
    public vf2 p0;
    public s6 q0;
    public vi r0;
    public zd0 s0;
    public q7 t0;
    public MaterialToolbar u0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainActivity mainActivity = (MainActivity) e();
        this.m0 = mainActivity;
        this.n0 = mainActivity.U;
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_library, viewGroup, false);
        int i2 = R.id.album_catalogue_sample_text_view_refreshable;
        LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.album_catalogue_sample_text_view_refreshable);
        if (linearLayout != null) {
            i2 = R.id.album_catalogue_text_view_clickable;
            TextView textView = (TextView) uo.s(viewInflate, R.id.album_catalogue_text_view_clickable);
            if (textView != null) {
                i2 = R.id.album_recycler_view;
                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.album_recycler_view);
                if (recyclerView != null) {
                    i2 = R.id.artist_catalogue_sample_text_view_refreshable;
                    LinearLayout linearLayout2 = (LinearLayout) uo.s(viewInflate, R.id.artist_catalogue_sample_text_view_refreshable);
                    if (linearLayout2 != null) {
                        i2 = R.id.artist_catalogue_text_view_clickable;
                        TextView textView2 = (TextView) uo.s(viewInflate, R.id.artist_catalogue_text_view_clickable);
                        if (textView2 != null) {
                            i2 = R.id.artist_recycler_view;
                            RecyclerView recyclerView2 = (RecyclerView) uo.s(viewInflate, R.id.artist_recycler_view);
                            if (recyclerView2 != null) {
                                i2 = R.id.fragment_library_nested_scroll_view;
                                if (((NestedScrollView) uo.s(viewInflate, R.id.fragment_library_nested_scroll_view)) != null) {
                                    i2 = R.id.genre_catalogue_sample_text_view_refreshable;
                                    LinearLayout linearLayout3 = (LinearLayout) uo.s(viewInflate, R.id.genre_catalogue_sample_text_view_refreshable);
                                    if (linearLayout3 != null) {
                                        i2 = R.id.genre_catalogue_text_view_clickable;
                                        TextView textView3 = (TextView) uo.s(viewInflate, R.id.genre_catalogue_text_view_clickable);
                                        if (textView3 != null) {
                                            i2 = R.id.genre_recycler_view;
                                            RecyclerView recyclerView3 = (RecyclerView) uo.s(viewInflate, R.id.genre_recycler_view);
                                            if (recyclerView3 != null) {
                                                i2 = R.id.library_album_sector;
                                                LinearLayout linearLayout4 = (LinearLayout) uo.s(viewInflate, R.id.library_album_sector);
                                                if (linearLayout4 != null) {
                                                    i2 = R.id.library_artist_sector;
                                                    LinearLayout linearLayout5 = (LinearLayout) uo.s(viewInflate, R.id.library_artist_sector);
                                                    if (linearLayout5 != null) {
                                                        i2 = R.id.library_genres_sector;
                                                        LinearLayout linearLayout6 = (LinearLayout) uo.s(viewInflate, R.id.library_genres_sector);
                                                        if (linearLayout6 != null) {
                                                            i2 = R.id.library_liked_songs_count;
                                                            TextView textView4 = (TextView) uo.s(viewInflate, R.id.library_liked_songs_count);
                                                            if (textView4 != null) {
                                                                i2 = R.id.library_liked_songs_row;
                                                                LinearLayout linearLayout7 = (LinearLayout) uo.s(viewInflate, R.id.library_liked_songs_row);
                                                                if (linearLayout7 != null) {
                                                                    i2 = R.id.library_linear_layout_container;
                                                                    if (((LinearLayout) uo.s(viewInflate, R.id.library_linear_layout_container)) != null) {
                                                                        i2 = R.id.library_music_folder_sector;
                                                                        LinearLayout linearLayout8 = (LinearLayout) uo.s(viewInflate, R.id.library_music_folder_sector);
                                                                        if (linearLayout8 != null) {
                                                                            i2 = R.id.library_playlist_sector;
                                                                            LinearLayout linearLayout9 = (LinearLayout) uo.s(viewInflate, R.id.library_playlist_sector);
                                                                            if (linearLayout9 != null) {
                                                                                i2 = R.id.music_folder_hide_text_view_clickable;
                                                                                TextView textView5 = (TextView) uo.s(viewInflate, R.id.music_folder_hide_text_view_clickable);
                                                                                if (textView5 != null) {
                                                                                    i2 = R.id.music_folder_recycler_view;
                                                                                    RecyclerView recyclerView4 = (RecyclerView) uo.s(viewInflate, R.id.music_folder_recycler_view);
                                                                                    if (recyclerView4 != null) {
                                                                                        i2 = R.id.playlist_catalogue_sample_text_view_refreshable;
                                                                                        LinearLayout linearLayout10 = (LinearLayout) uo.s(viewInflate, R.id.playlist_catalogue_sample_text_view_refreshable);
                                                                                        if (linearLayout10 != null) {
                                                                                            i2 = R.id.playlist_catalogue_text_view_clickable;
                                                                                            TextView textView6 = (TextView) uo.s(viewInflate, R.id.playlist_catalogue_text_view_clickable);
                                                                                            if (textView6 != null) {
                                                                                                i2 = R.id.playlist_recycler_view;
                                                                                                RecyclerView recyclerView5 = (RecyclerView) uo.s(viewInflate, R.id.playlist_recycler_view);
                                                                                                if (recyclerView5 != null) {
                                                                                                    i2 = R.id.swipe_library_to_refresh;
                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) uo.s(viewInflate, R.id.swipe_library_to_refresh);
                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                                        this.l0 = new xc1(coordinatorLayout, linearLayout, textView, recyclerView, linearLayout2, textView2, recyclerView2, linearLayout3, textView3, recyclerView3, linearLayout4, linearLayout5, linearLayout6, textView4, linearLayout7, linearLayout8, linearLayout9, textView5, recyclerView4, linearLayout10, textView6, recyclerView5, swipeRefreshLayout);
                                                                                                        nc1 nc1VarX = X();
                                                                                                        e75 e75VarD = nc1VarX.d();
                                                                                                        b75 b75VarR = gh0.r(nc1VarX);
                                                                                                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                                                                        i30 i30VarA = kx3.a(n92.class);
                                                                                                        String strB = i30VarA.b();
                                                                                                        if (strB == null) {
                                                                                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                                            return null;
                                                                                                        }
                                                                                                        this.o0 = (n92) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                                                        nc1 nc1VarX2 = X();
                                                                                                        e75 e75VarD2 = nc1VarX2.d();
                                                                                                        b75 b75VarR2 = gh0.r(nc1VarX2);
                                                                                                        bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                                                                                                        i30 i30VarA2 = kx3.a(vf2.class);
                                                                                                        String strB2 = i30VarA2.b();
                                                                                                        if (strB2 == null) {
                                                                                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                                            return null;
                                                                                                        }
                                                                                                        this.p0 = (vf2) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                                                                                                        this.o0.c();
                                                                                                        LinearLayout linearLayout11 = this.l0.o;
                                                                                                        k03 k03Var = wn1.a;
                                                                                                        linearLayout11.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i3 = i;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i3) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i3 = 9;
                                                                                                        this.l0.r.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i4 = i3;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i4) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i4 = 3;
                                                                                                        this.l0.c.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i5 = i4;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i5) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i5 = 4;
                                                                                                        this.l0.f.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i6 = i5;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i6) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i6 = 5;
                                                                                                        this.l0.i.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i7 = i6;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i7) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i7 = 6;
                                                                                                        this.l0.t.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i8 = i7;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i8) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i8 = 1;
                                                                                                        this.l0.b.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: k92
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnLongClickListener
                                                                                                            public final boolean onLongClick(View view) {
                                                                                                                int i9 = i8;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i9) {
                                                                                                                    case 0:
                                                                                                                        libraryFragment.o0.f(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        libraryFragment.o0.d(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        libraryFragment.o0.e(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        n92 n92Var = libraryFragment.o0;
                                                                                                                        le1 le1VarV = libraryFragment.v();
                                                                                                                        n92Var.f.getClass();
                                                                                                                        k03 k03VarJ = y41.j(15, true);
                                                                                                                        k03 k03Var2 = n92Var.l;
                                                                                                                        Objects.requireNonNull(k03Var2);
                                                                                                                        k03VarJ.e(le1VarV, new g7(k03Var2, 0));
                                                                                                                        break;
                                                                                                                }
                                                                                                                return true;
                                                                                                            }
                                                                                                        });
                                                                                                        final int i9 = 7;
                                                                                                        this.l0.b.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i10 = i9;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i10) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        final int i10 = 2;
                                                                                                        this.l0.e.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: k92
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnLongClickListener
                                                                                                            public final boolean onLongClick(View view) {
                                                                                                                int i11 = i10;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i11) {
                                                                                                                    case 0:
                                                                                                                        libraryFragment.o0.f(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        libraryFragment.o0.d(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        libraryFragment.o0.e(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        n92 n92Var = libraryFragment.o0;
                                                                                                                        le1 le1VarV = libraryFragment.v();
                                                                                                                        n92Var.f.getClass();
                                                                                                                        k03 k03VarJ = y41.j(15, true);
                                                                                                                        k03 k03Var2 = n92Var.l;
                                                                                                                        Objects.requireNonNull(k03Var2);
                                                                                                                        k03VarJ.e(le1VarV, new g7(k03Var2, 0));
                                                                                                                        break;
                                                                                                                }
                                                                                                                return true;
                                                                                                            }
                                                                                                        });
                                                                                                        final int i11 = 8;
                                                                                                        this.l0.e.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i12 = i11;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i12) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        this.l0.h.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: k92
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnLongClickListener
                                                                                                            public final boolean onLongClick(View view) {
                                                                                                                int i12 = i4;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i12) {
                                                                                                                    case 0:
                                                                                                                        libraryFragment.o0.f(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        libraryFragment.o0.d(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        libraryFragment.o0.e(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        n92 n92Var = libraryFragment.o0;
                                                                                                                        le1 le1VarV = libraryFragment.v();
                                                                                                                        n92Var.f.getClass();
                                                                                                                        k03 k03VarJ = y41.j(15, true);
                                                                                                                        k03 k03Var2 = n92Var.l;
                                                                                                                        Objects.requireNonNull(k03Var2);
                                                                                                                        k03VarJ.e(le1VarV, new g7(k03Var2, 0));
                                                                                                                        break;
                                                                                                                }
                                                                                                                return true;
                                                                                                            }
                                                                                                        });
                                                                                                        this.l0.h.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i12 = i8;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i12) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        this.l0.s.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: k92
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnLongClickListener
                                                                                                            public final boolean onLongClick(View view) {
                                                                                                                int i12 = i;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i12) {
                                                                                                                    case 0:
                                                                                                                        libraryFragment.o0.f(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        libraryFragment.o0.d(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        libraryFragment.o0.e(libraryFragment.v());
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        n92 n92Var = libraryFragment.o0;
                                                                                                                        le1 le1VarV = libraryFragment.v();
                                                                                                                        n92Var.f.getClass();
                                                                                                                        k03 k03VarJ = y41.j(15, true);
                                                                                                                        k03 k03Var2 = n92Var.l;
                                                                                                                        Objects.requireNonNull(k03Var2);
                                                                                                                        k03VarJ.e(le1VarV, new g7(k03Var2, 0));
                                                                                                                        break;
                                                                                                                }
                                                                                                                return true;
                                                                                                            }
                                                                                                        });
                                                                                                        this.l0.s.setOnClickListener(new View.OnClickListener(this) { // from class: tn1
                                                                                                            public final /* synthetic */ LibraryFragment o;

                                                                                                            {
                                                                                                                this.o = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                int i12 = i10;
                                                                                                                LibraryFragment libraryFragment = this.o;
                                                                                                                switch (i12) {
                                                                                                                    case 0:
                                                                                                                        q05.l(libraryFragment).m(R.id.songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_albumCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_artistCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_genreCatalogueFragment, null, null);
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                        libraryFragment.m0.T.m(R.id.action_libraryFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                                                                                                                        break;
                                                                                                                    case 7:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    case 8:
                                                                                                                        Toast.makeText(libraryFragment.Z(), R.string.library_toast_long_press_to_refresh, 0).show();
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        libraryFragment.h0(null);
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        });
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
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
        new Handler().postDelayed(new l92(this, 0), 100L);
        wn1.a(new d7(4, this.l0.n));
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.m0.J();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        MaterialToolbar materialToolbar = (MaterialToolbar) this.l0.a.findViewById(R.id.toolbar);
        this.u0 = materialToolbar;
        this.m0.o(materialToolbar);
        this.n0.n(this.m0, this.u0);
        Drawable overflowIcon = this.u0.getOverflowIcon();
        Objects.requireNonNull(overflowIcon);
        overflowIcon.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        this.l0.p.setVisibility(8);
        RecyclerView recyclerView = this.l0.d;
        Z();
        final int i = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        final int i2 = 1;
        this.l0.d.setHasFixedSize(true);
        s6 s6Var = new s6(this);
        this.q0 = s6Var;
        this.l0.d.setAdapter(s6Var);
        n92 n92Var = this.o0;
        le1 le1VarV = v();
        k03 k03Var = n92Var.j;
        if (k03Var.d() == null) {
            n92Var.d.getClass();
            rv2.m("random", 10, null, null).e(le1VarV, new mp1(n92Var, n92Var.n, k03Var, 1));
        }
        final int i3 = 4;
        k03Var.e(v(), new a83(this) { // from class: j92
            public final /* synthetic */ LibraryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i3;
                LibraryFragment libraryFragment = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        xc1 xc1Var = libraryFragment.l0;
                        if (list != null) {
                            if (xc1Var != null) {
                                xc1Var.q.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            q7 q7Var = libraryFragment.t0;
                            q7Var.getClass();
                            ArrayList arrayList = new ArrayList(list);
                            q7Var.s = arrayList;
                            q7Var.t = su3.q((String) q7Var.v, arrayList);
                            q7Var.d();
                        } else if (xc1Var != null) {
                            xc1Var.q.setVisibility(8);
                        }
                        break;
                    case 1:
                        List list2 = (List) obj;
                        xc1 xc1Var2 = libraryFragment.l0;
                        if (list2 != null) {
                            if (xc1Var2 != null) {
                                xc1Var2.m.setVisibility(list2.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var = libraryFragment.s0;
                            zd0Var.r = list2;
                            zd0Var.d();
                        } else if (xc1Var2 != null) {
                            xc1Var2.m.setVisibility(8);
                        }
                        break;
                    case 2:
                        n92 n92Var2 = libraryFragment.o0;
                        le1 le1VarV2 = libraryFragment.v();
                        if (n92Var2.c()) {
                            n92Var2.d(le1VarV2);
                            n92Var2.e(le1VarV2);
                            break;
                        }
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        List list3 = (List) obj;
                        xc1 xc1Var3 = libraryFragment.l0;
                        if (list3 != null) {
                            if (xc1Var3 != null) {
                                xc1Var3.l.setVisibility(list3.isEmpty() ? 8 : 0);
                            }
                            vi viVar = libraryFragment.r0;
                            viVar.u = list3;
                            viVar.d();
                        } else if (xc1Var3 != null) {
                            xc1Var3.l.setVisibility(8);
                        }
                        break;
                    default:
                        List list4 = (List) obj;
                        xc1 xc1Var4 = libraryFragment.l0;
                        if (list4 != null) {
                            if (xc1Var4 != null) {
                                xc1Var4.k.setVisibility(list4.isEmpty() ? 8 : 0);
                            }
                            libraryFragment.q0.p(list4);
                        } else if (xc1Var4 != null) {
                            xc1Var4.k.setVisibility(8);
                        }
                        break;
                }
            }
        });
        new xg0(0).a(this.l0.d);
        RecyclerView recyclerView2 = this.l0.g;
        Z();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        this.l0.g.setHasFixedSize(true);
        Boolean bool = Boolean.FALSE;
        vi viVar = new vi(this, bool, bool);
        this.r0 = viVar;
        this.l0.g.setAdapter(viVar);
        n92 n92Var2 = this.o0;
        le1 le1VarV2 = v();
        k03 k03Var2 = n92Var2.k;
        final int i4 = 3;
        if (k03Var2.d() == null) {
            pa paVar = n92Var2.e;
            paVar.getClass();
            k03 k03Var3 = new k03();
            App.f(false).c().j().enqueue(new qr2(i4, paVar, k03Var3));
            k03Var3.e(le1VarV2, new mp1(n92Var2, n92Var2.n, k03Var2, 1));
        }
        k03Var2.e(v(), new a83(this) { // from class: j92
            public final /* synthetic */ LibraryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i5 = i4;
                LibraryFragment libraryFragment = this.b;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        xc1 xc1Var = libraryFragment.l0;
                        if (list != null) {
                            if (xc1Var != null) {
                                xc1Var.q.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            q7 q7Var = libraryFragment.t0;
                            q7Var.getClass();
                            ArrayList arrayList = new ArrayList(list);
                            q7Var.s = arrayList;
                            q7Var.t = su3.q((String) q7Var.v, arrayList);
                            q7Var.d();
                        } else if (xc1Var != null) {
                            xc1Var.q.setVisibility(8);
                        }
                        break;
                    case 1:
                        List list2 = (List) obj;
                        xc1 xc1Var2 = libraryFragment.l0;
                        if (list2 != null) {
                            if (xc1Var2 != null) {
                                xc1Var2.m.setVisibility(list2.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var = libraryFragment.s0;
                            zd0Var.r = list2;
                            zd0Var.d();
                        } else if (xc1Var2 != null) {
                            xc1Var2.m.setVisibility(8);
                        }
                        break;
                    case 2:
                        n92 n92Var3 = libraryFragment.o0;
                        le1 le1VarV3 = libraryFragment.v();
                        if (n92Var3.c()) {
                            n92Var3.d(le1VarV3);
                            n92Var3.e(le1VarV3);
                            break;
                        }
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        List list3 = (List) obj;
                        xc1 xc1Var3 = libraryFragment.l0;
                        if (list3 != null) {
                            if (xc1Var3 != null) {
                                xc1Var3.l.setVisibility(list3.isEmpty() ? 8 : 0);
                            }
                            vi viVar2 = libraryFragment.r0;
                            viVar2.u = list3;
                            viVar2.d();
                        } else if (xc1Var3 != null) {
                            xc1Var3.l.setVisibility(8);
                        }
                        break;
                    default:
                        List list4 = (List) obj;
                        xc1 xc1Var4 = libraryFragment.l0;
                        if (list4 != null) {
                            if (xc1Var4 != null) {
                                xc1Var4.k.setVisibility(list4.isEmpty() ? 8 : 0);
                            }
                            libraryFragment.q0.p(list4);
                        } else if (xc1Var4 != null) {
                            xc1Var4.k.setVisibility(8);
                        }
                        break;
                }
            }
        });
        new xg0(0).a(this.l0.g);
        RecyclerView recyclerView3 = this.l0.j;
        Z();
        recyclerView3.setLayoutManager(new GridLayoutManager(3, 0));
        this.l0.j.setHasFixedSize(true);
        zd0 zd0Var = new zd0(this);
        this.s0 = zd0Var;
        this.l0.j.setAdapter(zd0Var);
        n92 n92Var3 = this.o0;
        le1 le1VarV3 = v();
        k03 k03Var4 = n92Var3.l;
        if (k03Var4.d() == null) {
            n92Var3.f.getClass();
            y41.j(15, true).e(le1VarV3, new g7(k03Var4, 0));
        }
        k03Var4.e(v(), new a83(this) { // from class: j92
            public final /* synthetic */ LibraryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i5 = i2;
                LibraryFragment libraryFragment = this.b;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        xc1 xc1Var = libraryFragment.l0;
                        if (list != null) {
                            if (xc1Var != null) {
                                xc1Var.q.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            q7 q7Var = libraryFragment.t0;
                            q7Var.getClass();
                            ArrayList arrayList = new ArrayList(list);
                            q7Var.s = arrayList;
                            q7Var.t = su3.q((String) q7Var.v, arrayList);
                            q7Var.d();
                        } else if (xc1Var != null) {
                            xc1Var.q.setVisibility(8);
                        }
                        break;
                    case 1:
                        List list2 = (List) obj;
                        xc1 xc1Var2 = libraryFragment.l0;
                        if (list2 != null) {
                            if (xc1Var2 != null) {
                                xc1Var2.m.setVisibility(list2.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var2 = libraryFragment.s0;
                            zd0Var2.r = list2;
                            zd0Var2.d();
                        } else if (xc1Var2 != null) {
                            xc1Var2.m.setVisibility(8);
                        }
                        break;
                    case 2:
                        n92 n92Var4 = libraryFragment.o0;
                        le1 le1VarV4 = libraryFragment.v();
                        if (n92Var4.c()) {
                            n92Var4.d(le1VarV4);
                            n92Var4.e(le1VarV4);
                            break;
                        }
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        List list3 = (List) obj;
                        xc1 xc1Var3 = libraryFragment.l0;
                        if (list3 != null) {
                            if (xc1Var3 != null) {
                                xc1Var3.l.setVisibility(list3.isEmpty() ? 8 : 0);
                            }
                            vi viVar2 = libraryFragment.r0;
                            viVar2.u = list3;
                            viVar2.d();
                        } else if (xc1Var3 != null) {
                            xc1Var3.l.setVisibility(8);
                        }
                        break;
                    default:
                        List list4 = (List) obj;
                        xc1 xc1Var4 = libraryFragment.l0;
                        if (list4 != null) {
                            if (xc1Var4 != null) {
                                xc1Var4.k.setVisibility(list4.isEmpty() ? 8 : 0);
                            }
                            libraryFragment.q0.p(list4);
                        } else if (xc1Var4 != null) {
                            xc1Var4.k.setVisibility(8);
                        }
                        break;
                }
            }
        });
        new xg0(0).a(this.l0.j);
        RecyclerView recyclerView4 = this.l0.u;
        recyclerView4.getContext();
        recyclerView4.setLayoutManager(new LinearLayoutManager(0));
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setPaddingRelative((int) (16.0f * recyclerView4.getResources().getDisplayMetrics().density), recyclerView4.getPaddingTop(), recyclerView4.getPaddingEnd(), recyclerView4.getPaddingBottom());
        q7 q7Var = new q7(this, false);
        recyclerView4.setAdapter(q7Var);
        new xg0(0).a(recyclerView4);
        this.t0 = q7Var;
        n92 n92Var4 = this.o0;
        le1 le1VarV4 = v();
        k03 k03Var5 = n92Var4.i;
        if (k03Var5.d() == null) {
            n92Var4.g.d(10, true).e(le1VarV4, new g7(k03Var5, 0));
        }
        k03Var5.e(v(), new a83(this) { // from class: j92
            public final /* synthetic */ LibraryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i5 = i;
                LibraryFragment libraryFragment = this.b;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        xc1 xc1Var = libraryFragment.l0;
                        if (list != null) {
                            if (xc1Var != null) {
                                xc1Var.q.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            q7 q7Var2 = libraryFragment.t0;
                            q7Var2.getClass();
                            ArrayList arrayList = new ArrayList(list);
                            q7Var2.s = arrayList;
                            q7Var2.t = su3.q((String) q7Var2.v, arrayList);
                            q7Var2.d();
                        } else if (xc1Var != null) {
                            xc1Var.q.setVisibility(8);
                        }
                        break;
                    case 1:
                        List list2 = (List) obj;
                        xc1 xc1Var2 = libraryFragment.l0;
                        if (list2 != null) {
                            if (xc1Var2 != null) {
                                xc1Var2.m.setVisibility(list2.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var2 = libraryFragment.s0;
                            zd0Var2.r = list2;
                            zd0Var2.d();
                        } else if (xc1Var2 != null) {
                            xc1Var2.m.setVisibility(8);
                        }
                        break;
                    case 2:
                        n92 n92Var5 = libraryFragment.o0;
                        le1 le1VarV5 = libraryFragment.v();
                        if (n92Var5.c()) {
                            n92Var5.d(le1VarV5);
                            n92Var5.e(le1VarV5);
                            break;
                        }
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        List list3 = (List) obj;
                        xc1 xc1Var3 = libraryFragment.l0;
                        if (list3 != null) {
                            if (xc1Var3 != null) {
                                xc1Var3.l.setVisibility(list3.isEmpty() ? 8 : 0);
                            }
                            vi viVar2 = libraryFragment.r0;
                            viVar2.u = list3;
                            viVar2.d();
                        } else if (xc1Var3 != null) {
                            xc1Var3.l.setVisibility(8);
                        }
                        break;
                    default:
                        List list4 = (List) obj;
                        xc1 xc1Var4 = libraryFragment.l0;
                        if (list4 != null) {
                            if (xc1Var4 != null) {
                                xc1Var4.k.setVisibility(list4.isEmpty() ? 8 : 0);
                            }
                            libraryFragment.q0.p(list4);
                        } else if (xc1Var4 != null) {
                            xc1Var4.k.setVisibility(8);
                        }
                        break;
                }
            }
        });
        this.l0.v.setOnRefreshListener(new cn(20, this));
        final int i5 = 2;
        this.p0.d.e(v(), new a83(this) { // from class: j92
            public final /* synthetic */ LibraryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i6 = i5;
                LibraryFragment libraryFragment = this.b;
                switch (i6) {
                    case 0:
                        List list = (List) obj;
                        xc1 xc1Var = libraryFragment.l0;
                        if (list != null) {
                            if (xc1Var != null) {
                                xc1Var.q.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            q7 q7Var2 = libraryFragment.t0;
                            q7Var2.getClass();
                            ArrayList arrayList = new ArrayList(list);
                            q7Var2.s = arrayList;
                            q7Var2.t = su3.q((String) q7Var2.v, arrayList);
                            q7Var2.d();
                        } else if (xc1Var != null) {
                            xc1Var.q.setVisibility(8);
                        }
                        break;
                    case 1:
                        List list2 = (List) obj;
                        xc1 xc1Var2 = libraryFragment.l0;
                        if (list2 != null) {
                            if (xc1Var2 != null) {
                                xc1Var2.m.setVisibility(list2.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var2 = libraryFragment.s0;
                            zd0Var2.r = list2;
                            zd0Var2.d();
                        } else if (xc1Var2 != null) {
                            xc1Var2.m.setVisibility(8);
                        }
                        break;
                    case 2:
                        n92 n92Var5 = libraryFragment.o0;
                        le1 le1VarV5 = libraryFragment.v();
                        if (n92Var5.c()) {
                            n92Var5.d(le1VarV5);
                            n92Var5.e(le1VarV5);
                            break;
                        }
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        List list3 = (List) obj;
                        xc1 xc1Var3 = libraryFragment.l0;
                        if (list3 != null) {
                            if (xc1Var3 != null) {
                                xc1Var3.l.setVisibility(list3.isEmpty() ? 8 : 0);
                            }
                            vi viVar2 = libraryFragment.r0;
                            viVar2.u = list3;
                            viVar2.d();
                        } else if (xc1Var3 != null) {
                            xc1Var3.l.setVisibility(8);
                        }
                        break;
                    default:
                        List list4 = (List) obj;
                        xc1 xc1Var4 = libraryFragment.l0;
                        if (list4 != null) {
                            if (xc1Var4 != null) {
                                xc1Var4.k.setVisibility(list4.isEmpty() ? 8 : 0);
                            }
                            libraryFragment.q0.p(list4);
                        } else if (xc1Var4 != null) {
                            xc1Var4.k.setVisibility(8);
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final void h0(MusicFolder musicFolder) {
        String name = musicFolder != null ? musicFolder.getName() : null;
        l92 l92Var = new l92(this, 1);
        l92 l92Var2 = new l92(this, 2);
        k03 k03Var = wn1.a;
        Context contextZ = Z();
        if (name == null) {
            name = contextZ.getString(R.string.library_title_music_folder);
            name.getClass();
        } else {
            if (qm4.u0(name)) {
                name = null;
            }
            if (name == null) {
                name = contextZ.getString(R.string.library_title_music_folder);
                name.getClass();
            }
        }
        vg2 vg2Var = new vg2(contextZ, 0);
        vg2Var.p(R.string.homemusic_folders_hide_title);
        vg2Var.a.f = contextZ.getString(R.string.homemusic_folders_hide_message, xa3.h("«", name, "»"));
        vg2Var.l(R.string.homemusic_folders_hide, new rn1(l92Var, this, l92Var2, 0)).j(R.string.homemusic_cancel, null).h();
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
    public final void onGenreClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songListPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicFolderClick(Bundle bundle) {
        gb.x(a0()).m(R.id.indexFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicFolderLongClick(Bundle bundle) {
        h0((MusicFolder) bundle.getParcelable("MUSIC_FOLDER_OBJECT"));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle bundle) {
        gb.x(a0()).m(R.id.playlistPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.playlistRowBottomSheetDialog, bundle, null);
    }
}
