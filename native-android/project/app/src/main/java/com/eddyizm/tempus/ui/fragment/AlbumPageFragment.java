package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.au;
import defpackage.au0;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d7;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.fl3;
import defpackage.g8;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gi1;
import defpackage.gp3;
import defpackage.hu3;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l8;
import defpackage.le1;
import defpackage.li3;
import defpackage.n61;
import defpackage.n8;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.ou3;
import defpackage.ov;
import defpackage.pc1;
import defpackage.pn4;
import defpackage.q8;
import defpackage.rv2;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.uo;
import defpackage.v23;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumPageFragment extends kc1 implements ClickCallback {
    public pc1 l0;
    public MainActivity m0;
    public n8 n0;
    public li3 o0;
    public ni4 p0;
    public bl2 q0;
    public k03 r0;
    public g8 s0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.album_page_menu, menu);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x038e A[PHI: r5
  0x038e: PHI (r5v8 int) = 
  (r5v7 int)
  (r5v9 int)
  (r5v10 int)
  (r5v11 int)
  (r5v12 int)
  (r5v13 int)
  (r5v14 int)
  (r5v15 int)
  (r5v16 int)
  (r5v17 int)
  (r5v18 int)
  (r5v19 int)
  (r5v20 int)
 binds: [B:13:0x0064, B:15:0x0070, B:17:0x007c, B:19:0x0088, B:21:0x0093, B:23:0x009f, B:25:0x00ab, B:27:0x00b8, B:29:0x00c5, B:31:0x00d2, B:33:0x00df, B:35:0x00ea, B:37:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        v23 v23Var2;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_album_page, viewGroup, false);
        int i2 = R.id.album_artist_label;
        TextView textView = (TextView) uo.s(viewInflate, R.id.album_artist_label);
        if (textView != null) {
            i2 = R.id.album_bio_label;
            if (((TextView) uo.s(viewInflate, R.id.album_bio_label)) != null) {
                i2 = R.id.album_cover_image_view;
                ImageView imageView = (ImageView) uo.s(viewInflate, R.id.album_cover_image_view);
                if (imageView != null) {
                    i2 = R.id.album_detail_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.album_detail_view);
                    if (constraintLayout != null) {
                        i2 = R.id.album_genres_textview;
                        TextView textView2 = (TextView) uo.s(viewInflate, R.id.album_genres_textview);
                        if (textView2 != null) {
                            int i3 = R.id.album_info_sector;
                            if (((ConstraintLayout) uo.s(viewInflate, R.id.album_info_sector)) != null) {
                                i3 = R.id.album_name_label;
                                TextView textView3 = (TextView) uo.s(viewInflate, R.id.album_name_label);
                                if (textView3 != null) {
                                    i3 = R.id.album_notes_textview;
                                    TextView textView4 = (TextView) uo.s(viewInflate, R.id.album_notes_textview);
                                    if (textView4 != null) {
                                        i3 = R.id.album_other_info_button;
                                        FrameLayout frameLayout = (FrameLayout) uo.s(viewInflate, R.id.album_other_info_button);
                                        if (frameLayout != null) {
                                            i3 = R.id.album_page_button_layout;
                                            if (((LinearLayout) uo.s(viewInflate, R.id.album_page_button_layout)) != null) {
                                                i3 = R.id.album_page_play_button;
                                                Button button = (Button) uo.s(viewInflate, R.id.album_page_play_button);
                                                if (button != null) {
                                                    i3 = R.id.album_page_shuffle_button;
                                                    Button button2 = (Button) uo.s(viewInflate, R.id.album_page_shuffle_button);
                                                    if (button2 != null) {
                                                        i3 = R.id.album_release_year_label;
                                                        TextView textView5 = (TextView) uo.s(viewInflate, R.id.album_release_year_label);
                                                        if (textView5 != null) {
                                                            i3 = R.id.album_release_years_textview;
                                                            TextView textView6 = (TextView) uo.s(viewInflate, R.id.album_release_years_textview);
                                                            if (textView6 != null) {
                                                                i3 = R.id.album_song_count_duration_textview;
                                                                TextView textView7 = (TextView) uo.s(viewInflate, R.id.album_song_count_duration_textview);
                                                                if (textView7 != null) {
                                                                    i3 = R.id.anim_toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.anim_toolbar);
                                                                    if (materialToolbar != null) {
                                                                        i3 = R.id.app_bar_layout;
                                                                        if (((AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout)) != null) {
                                                                            i3 = R.id.bottom_button_divider;
                                                                            View viewS = uo.s(viewInflate, R.id.bottom_button_divider);
                                                                            if (viewS == null) {
                                                                                i2 = i3;
                                                                            } else if (((ToggleButton) uo.s(viewInflate, R.id.button_favorite)) != null) {
                                                                                int i4 = R.id.song_recycler_view;
                                                                                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.song_recycler_view);
                                                                                if (recyclerView != null) {
                                                                                    i4 = R.id.upper_button_divider;
                                                                                    View viewS2 = uo.s(viewInflate, R.id.upper_button_divider);
                                                                                    if (viewS2 != null) {
                                                                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                        this.l0 = new pc1(linearLayout, textView, imageView, constraintLayout, textView2, textView3, textView4, frameLayout, button, button2, textView5, textView6, textView7, materialToolbar, viewS, recyclerView, viewS2);
                                                                                        nc1 nc1VarX = X();
                                                                                        e75 e75VarD = nc1VarX.d();
                                                                                        b75 b75VarR = gh0.r(nc1VarX);
                                                                                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                                                        i30 i30VarA = kx3.a(n8.class);
                                                                                        String strB = i30VarA.b();
                                                                                        if (strB == null) {
                                                                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                            return null;
                                                                                        }
                                                                                        this.n0 = (n8) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
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
                                                                                        Bundle bundle2 = this.s;
                                                                                        if (bundle2 == null) {
                                                                                            Log.e("AlbumPageFragment", "Arguments are null after process restoration.");
                                                                                            MainActivity mainActivity = this.m0;
                                                                                            if (mainActivity != null && (v23Var2 = mainActivity.T) != null) {
                                                                                                v23Var2.o();
                                                                                                return linearLayout;
                                                                                            }
                                                                                        } else {
                                                                                            AlbumID3 albumID3 = (AlbumID3) bundle2.getParcelable("ALBUM_OBJECT");
                                                                                            if (albumID3 != null) {
                                                                                                n8 n8Var = this.n0;
                                                                                                le1 le1VarV = v();
                                                                                                n8Var.getClass();
                                                                                                n8Var.f = albumID3.getId();
                                                                                                n8Var.h.i(albumID3);
                                                                                                n8Var.g = albumID3.getArtistId();
                                                                                                rv2 rv2Var = n8Var.c;
                                                                                                String str = n8Var.f;
                                                                                                rv2Var.getClass();
                                                                                                n8Var.i = rv2.l(str);
                                                                                                final int i5 = 2;
                                                                                                rv2.j(albumID3.getId()).e(le1VarV, new d8(i5, n8Var));
                                                                                                ToggleButton toggleButton = (ToggleButton) linearLayout.findViewById(R.id.button_favorite);
                                                                                                final int i6 = 1;
                                                                                                toggleButton.setChecked(n61.f(2, albumID3.getId(), albumID3.getStarred() != null));
                                                                                                final int i7 = 3;
                                                                                                toggleButton.setOnClickListener(new View.OnClickListener(this) { // from class: k8
                                                                                                    public final /* synthetic */ AlbumPageFragment o;

                                                                                                    {
                                                                                                        this.o = this;
                                                                                                    }

                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                    public final void onClick(View view) {
                                                                                                        int i8 = i7;
                                                                                                        AlbumPageFragment albumPageFragment = this.o;
                                                                                                        switch (i8) {
                                                                                                            case 0:
                                                                                                                albumPageFragment.m0.T.o();
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                int visibility = albumPageFragment.l0.a.getVisibility();
                                                                                                                pc1 pc1Var = albumPageFragment.l0;
                                                                                                                if (visibility == 8) {
                                                                                                                    pc1Var.a.setVisibility(0);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(Integer.MAX_VALUE);
                                                                                                                } else if (pc1Var.a.getVisibility() == 0) {
                                                                                                                    albumPageFragment.l0.a.setVisibility(8);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(2);
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                albumPageFragment.i0();
                                                                                                                n8 n8Var2 = albumPageFragment.n0;
                                                                                                                pa paVar = n8Var2.d;
                                                                                                                String str2 = n8Var2.g;
                                                                                                                paVar.getClass();
                                                                                                                k03 k03Var = new k03();
                                                                                                                App.f(false).c().i(str2).enqueue(new p8(k03Var, 1));
                                                                                                                albumPageFragment.r0 = k03Var;
                                                                                                                albumPageFragment.s0 = new g8(albumPageFragment, 5);
                                                                                                                k03Var.e(albumPageFragment.v(), albumPageFragment.s0);
                                                                                                                break;
                                                                                                            default:
                                                                                                                n8 n8Var3 = albumPageFragment.n0;
                                                                                                                d34 d34Var = n8Var3.e;
                                                                                                                k03 k03Var2 = n8Var3.h;
                                                                                                                AlbumID3 albumID4 = (AlbumID3) k03Var2.d();
                                                                                                                if (albumID4 != null) {
                                                                                                                    if (!n61.f(2, albumID4.getId(), albumID4.getStarred() != null)) {
                                                                                                                        if (!hw.t()) {
                                                                                                                            String id = albumID4.getId();
                                                                                                                            m8 m8Var = new m8(n8Var3, albumID4, 1);
                                                                                                                            d34Var.getClass();
                                                                                                                            d34.I(null, id, null, m8Var);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        } else {
                                                                                                                            d34Var.J(null, albumID4.getId(), true, null);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        }
                                                                                                                    } else if (!hw.t()) {
                                                                                                                        String id2 = albumID4.getId();
                                                                                                                        m8 m8Var2 = new m8(n8Var3, albumID4, 0);
                                                                                                                        d34Var.getClass();
                                                                                                                        d34.K(null, id2, null, m8Var2);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    } else {
                                                                                                                        d34Var.J(null, albumID4.getId(), false, null);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                this.n0.h.e(v(), new d8(i6, toggleButton));
                                                                                                this.m0.o((MaterialToolbar) this.l0.n);
                                                                                                if (this.m0.n() != null) {
                                                                                                    this.m0.n().f0(true);
                                                                                                    this.m0.n().g0();
                                                                                                }
                                                                                                this.n0.h.e(v(), new g8(this, 7));
                                                                                                ((MaterialToolbar) this.l0.n).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: k8
                                                                                                    public final /* synthetic */ AlbumPageFragment o;

                                                                                                    {
                                                                                                        this.o = this;
                                                                                                    }

                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                    public final void onClick(View view) {
                                                                                                        int i8 = i;
                                                                                                        AlbumPageFragment albumPageFragment = this.o;
                                                                                                        switch (i8) {
                                                                                                            case 0:
                                                                                                                albumPageFragment.m0.T.o();
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                int visibility = albumPageFragment.l0.a.getVisibility();
                                                                                                                pc1 pc1Var = albumPageFragment.l0;
                                                                                                                if (visibility == 8) {
                                                                                                                    pc1Var.a.setVisibility(0);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(Integer.MAX_VALUE);
                                                                                                                } else if (pc1Var.a.getVisibility() == 0) {
                                                                                                                    albumPageFragment.l0.a.setVisibility(8);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(2);
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                albumPageFragment.i0();
                                                                                                                n8 n8Var2 = albumPageFragment.n0;
                                                                                                                pa paVar = n8Var2.d;
                                                                                                                String str2 = n8Var2.g;
                                                                                                                paVar.getClass();
                                                                                                                k03 k03Var = new k03();
                                                                                                                App.f(false).c().i(str2).enqueue(new p8(k03Var, 1));
                                                                                                                albumPageFragment.r0 = k03Var;
                                                                                                                albumPageFragment.s0 = new g8(albumPageFragment, 5);
                                                                                                                k03Var.e(albumPageFragment.v(), albumPageFragment.s0);
                                                                                                                break;
                                                                                                            default:
                                                                                                                n8 n8Var3 = albumPageFragment.n0;
                                                                                                                d34 d34Var = n8Var3.e;
                                                                                                                k03 k03Var2 = n8Var3.h;
                                                                                                                AlbumID3 albumID4 = (AlbumID3) k03Var2.d();
                                                                                                                if (albumID4 != null) {
                                                                                                                    if (!n61.f(2, albumID4.getId(), albumID4.getStarred() != null)) {
                                                                                                                        if (!hw.t()) {
                                                                                                                            String id = albumID4.getId();
                                                                                                                            m8 m8Var = new m8(n8Var3, albumID4, 1);
                                                                                                                            d34Var.getClass();
                                                                                                                            d34.I(null, id, null, m8Var);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        } else {
                                                                                                                            d34Var.J(null, albumID4.getId(), true, null);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        }
                                                                                                                    } else if (!hw.t()) {
                                                                                                                        String id2 = albumID4.getId();
                                                                                                                        m8 m8Var2 = new m8(n8Var3, albumID4, 0);
                                                                                                                        d34Var.getClass();
                                                                                                                        d34.K(null, id2, null, m8Var2);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    } else {
                                                                                                                        d34Var.J(null, albumID4.getId(), false, null);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                Drawable overflowIcon = ((MaterialToolbar) this.l0.n).getOverflowIcon();
                                                                                                Objects.requireNonNull(overflowIcon);
                                                                                                overflowIcon.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
                                                                                                ((FrameLayout) this.l0.k).setOnClickListener(new View.OnClickListener(this) { // from class: k8
                                                                                                    public final /* synthetic */ AlbumPageFragment o;

                                                                                                    {
                                                                                                        this.o = this;
                                                                                                    }

                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                    public final void onClick(View view) {
                                                                                                        int i8 = i6;
                                                                                                        AlbumPageFragment albumPageFragment = this.o;
                                                                                                        switch (i8) {
                                                                                                            case 0:
                                                                                                                albumPageFragment.m0.T.o();
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                int visibility = albumPageFragment.l0.a.getVisibility();
                                                                                                                pc1 pc1Var = albumPageFragment.l0;
                                                                                                                if (visibility == 8) {
                                                                                                                    pc1Var.a.setVisibility(0);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(Integer.MAX_VALUE);
                                                                                                                } else if (pc1Var.a.getVisibility() == 0) {
                                                                                                                    albumPageFragment.l0.a.setVisibility(8);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(2);
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                albumPageFragment.i0();
                                                                                                                n8 n8Var2 = albumPageFragment.n0;
                                                                                                                pa paVar = n8Var2.d;
                                                                                                                String str2 = n8Var2.g;
                                                                                                                paVar.getClass();
                                                                                                                k03 k03Var = new k03();
                                                                                                                App.f(false).c().i(str2).enqueue(new p8(k03Var, 1));
                                                                                                                albumPageFragment.r0 = k03Var;
                                                                                                                albumPageFragment.s0 = new g8(albumPageFragment, 5);
                                                                                                                k03Var.e(albumPageFragment.v(), albumPageFragment.s0);
                                                                                                                break;
                                                                                                            default:
                                                                                                                n8 n8Var3 = albumPageFragment.n0;
                                                                                                                d34 d34Var = n8Var3.e;
                                                                                                                k03 k03Var2 = n8Var3.h;
                                                                                                                AlbumID3 albumID4 = (AlbumID3) k03Var2.d();
                                                                                                                if (albumID4 != null) {
                                                                                                                    if (!n61.f(2, albumID4.getId(), albumID4.getStarred() != null)) {
                                                                                                                        if (!hw.t()) {
                                                                                                                            String id = albumID4.getId();
                                                                                                                            m8 m8Var = new m8(n8Var3, albumID4, 1);
                                                                                                                            d34Var.getClass();
                                                                                                                            d34.I(null, id, null, m8Var);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        } else {
                                                                                                                            d34Var.J(null, albumID4.getId(), true, null);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        }
                                                                                                                    } else if (!hw.t()) {
                                                                                                                        String id2 = albumID4.getId();
                                                                                                                        m8 m8Var2 = new m8(n8Var3, albumID4, 0);
                                                                                                                        d34Var.getClass();
                                                                                                                        d34.K(null, id2, null, m8Var2);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    } else {
                                                                                                                        d34Var.J(null, albumID4.getId(), false, null);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                App.b().getClass();
                                                                                                if (App.c().getBoolean("album_detail", false)) {
                                                                                                    this.l0.a.setVisibility(0);
                                                                                                }
                                                                                                this.l0.c.setOnClickListener(new View.OnClickListener(this) { // from class: k8
                                                                                                    public final /* synthetic */ AlbumPageFragment o;

                                                                                                    {
                                                                                                        this.o = this;
                                                                                                    }

                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                    public final void onClick(View view) {
                                                                                                        int i8 = i5;
                                                                                                        AlbumPageFragment albumPageFragment = this.o;
                                                                                                        switch (i8) {
                                                                                                            case 0:
                                                                                                                albumPageFragment.m0.T.o();
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                int visibility = albumPageFragment.l0.a.getVisibility();
                                                                                                                pc1 pc1Var = albumPageFragment.l0;
                                                                                                                if (visibility == 8) {
                                                                                                                    pc1Var.a.setVisibility(0);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(Integer.MAX_VALUE);
                                                                                                                } else if (pc1Var.a.getVisibility() == 0) {
                                                                                                                    albumPageFragment.l0.a.setVisibility(8);
                                                                                                                    albumPageFragment.l0.e.setMaxLines(2);
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                albumPageFragment.i0();
                                                                                                                n8 n8Var2 = albumPageFragment.n0;
                                                                                                                pa paVar = n8Var2.d;
                                                                                                                String str2 = n8Var2.g;
                                                                                                                paVar.getClass();
                                                                                                                k03 k03Var = new k03();
                                                                                                                App.f(false).c().i(str2).enqueue(new p8(k03Var, 1));
                                                                                                                albumPageFragment.r0 = k03Var;
                                                                                                                albumPageFragment.s0 = new g8(albumPageFragment, 5);
                                                                                                                k03Var.e(albumPageFragment.v(), albumPageFragment.s0);
                                                                                                                break;
                                                                                                            default:
                                                                                                                n8 n8Var3 = albumPageFragment.n0;
                                                                                                                d34 d34Var = n8Var3.e;
                                                                                                                k03 k03Var2 = n8Var3.h;
                                                                                                                AlbumID3 albumID4 = (AlbumID3) k03Var2.d();
                                                                                                                if (albumID4 != null) {
                                                                                                                    if (!n61.f(2, albumID4.getId(), albumID4.getStarred() != null)) {
                                                                                                                        if (!hw.t()) {
                                                                                                                            String id = albumID4.getId();
                                                                                                                            m8 m8Var = new m8(n8Var3, albumID4, 1);
                                                                                                                            d34Var.getClass();
                                                                                                                            d34.I(null, id, null, m8Var);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        } else {
                                                                                                                            d34Var.J(null, albumID4.getId(), true, null);
                                                                                                                            albumID4.setStarred(new Date());
                                                                                                                            k03Var2.i(albumID4);
                                                                                                                        }
                                                                                                                    } else if (!hw.t()) {
                                                                                                                        String id2 = albumID4.getId();
                                                                                                                        m8 m8Var2 = new m8(n8Var3, albumID4, 0);
                                                                                                                        d34Var.getClass();
                                                                                                                        d34.K(null, id2, null, m8Var2);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    } else {
                                                                                                                        d34Var.J(null, albumID4.getId(), false, null);
                                                                                                                        albumID4.setStarred(null);
                                                                                                                        k03Var2.i(albumID4);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                n8 n8Var2 = this.n0;
                                                                                                rv2 rv2Var2 = n8Var2.c;
                                                                                                String str2 = n8Var2.f;
                                                                                                rv2Var2.getClass();
                                                                                                k03 k03Var = new k03();
                                                                                                gp3 gp3VarC = App.f(false).c();
                                                                                                gp3VarC.getClass();
                                                                                                Log.d("BrowsingClient", "getAlbumInfo2()");
                                                                                                ((ov) gp3VarC.p).d(((pn4) gp3VarC.o).f(), str2).enqueue(new q8(k03Var, i));
                                                                                                k03Var.e(v(), new g8(this, i6));
                                                                                                this.n0.i.e(v(), new g8(this, i5));
                                                                                                this.n0.h.e(v(), new g8(this, 8));
                                                                                                RecyclerView recyclerView2 = (RecyclerView) this.l0.q;
                                                                                                Z();
                                                                                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                                                                ((RecyclerView) this.l0.q).setHasFixedSize(true);
                                                                                                ((RecyclerView) this.l0.q).setClipToPadding(false);
                                                                                                ((RecyclerView) this.l0.q).post(new a0(i7, this));
                                                                                                if (((LinearLayout) this.l0.b).findViewById(R.id.album_info_scroll_view) != null) {
                                                                                                    ((RecyclerView) this.l0.q).j(new l8((NestedScrollView) ((LinearLayout) this.l0.b).findViewById(R.id.album_info_scroll_view), 0));
                                                                                                }
                                                                                                this.n0.h.e(v(), new g8(this, 6));
                                                                                                return linearLayout;
                                                                                            }
                                                                                            MainActivity mainActivity2 = this.m0;
                                                                                            if (mainActivity2 != null && (v23Var = mainActivity2.T) != null) {
                                                                                                v23Var.o();
                                                                                            }
                                                                                        }
                                                                                        return linearLayout;
                                                                                    }
                                                                                }
                                                                                i2 = i4;
                                                                            } else {
                                                                                i2 = R.id.button_favorite;
                                                                            }
                                                                        } else {
                                                                            i2 = i3;
                                                                        }
                                                                    } else {
                                                                        i2 = i3;
                                                                    }
                                                                } else {
                                                                    i2 = i3;
                                                                }
                                                            } else {
                                                                i2 = i3;
                                                            }
                                                        } else {
                                                            i2 = i3;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                } else {
                                                    i2 = i3;
                                                }
                                            } else {
                                                i2 = i3;
                                            }
                                        } else {
                                            i2 = i3;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = i3;
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
        i0();
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_rate_album) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) this.n0.h.d()).strippedForNav());
            ou3 ou3Var = new ou3();
            ou3Var.c0(bundle);
            ou3Var.m0(X().k(), null);
            return true;
        }
        if (menuItem.getItemId() == R.id.action_download_album) {
            List list = (List) this.n0.i.d();
            if (list != null && !list.isEmpty()) {
                if (ud3.o() == null) {
                    au0.w(Z()).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                    return true;
                }
                list.forEach(new d7(1, this));
                return true;
            }
        } else if (menuItem.getItemId() == R.id.action_add_to_playlist) {
            List list2 = (List) this.n0.i.d();
            if (list2 != null && !list2.isEmpty()) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list2));
                fl3 fl3Var = new fl3();
                fl3Var.c0(bundle2);
                fl3Var.m0(X().k(), null);
                return true;
            }
        } else {
            if (menuItem.getItemId() != R.id.action_play_next && menuItem.getItemId() != R.id.action_add_to_queue) {
                return false;
            }
            boolean z = menuItem.getItemId() == R.id.action_play_next;
            List list3 = (List) this.n0.i.d();
            if (list3 != null && !list3.isEmpty()) {
                bo2.e(this.q0, list3, z);
                ((au) this.m0.V.n).d(true);
            }
        }
        return true;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 ni4Var = this.p0;
        if (ni4Var != null) {
            ni4Var.A = this.q0;
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
        int i = 4;
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.q0 = bl2Var;
        bo2.j(bl2Var, this.o0);
        this.o0.b.e(v(), new g8(this, 0));
        this.o0.c.e(v(), new g8(this, i));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    public final void h0() {
        if (this.p0 != null) {
            String str = (String) this.o0.b.d();
            Boolean bool = (Boolean) this.o0.c.d();
            this.p0.s(str, bool != null && bool.booleanValue());
        }
    }

    public final void i0() {
        g8 g8Var;
        k03 k03Var = this.r0;
        if (k03Var != null && (g8Var = this.s0) != null) {
            k03Var.j(g8Var);
        }
        this.r0 = null;
        this.s0 = null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.q(this.q0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"), "album");
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }
}
