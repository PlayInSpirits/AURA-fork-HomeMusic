package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.c12;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ek1;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j8;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l7;
import defpackage.le1;
import defpackage.li3;
import defpackage.n61;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.oj;
import defpackage.pa;
import defpackage.pj;
import defpackage.qj;
import defpackage.s6;
import defpackage.sc1;
import defpackage.sk2;
import defpackage.uo;
import defpackage.ut4;
import defpackage.v23;
import defpackage.v8;
import defpackage.wj;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xg0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ArtistPageFragment extends kc1 implements ClickCallback {
    public sc1 l0;
    public MainActivity m0;
    public wj n0;
    public li3 o0;
    public ni4 p0;
    public v8 q0;
    public l7 r0;
    public s6 s0;
    public bl2 t0;
    public int u0 = 2;
    public int v0 = 20;
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public final a0 x0 = new a0(6, this);

    public static void h0(ArtistPageFragment artistPageFragment, Button button, int i) {
        String charSequence = button.getText() != null ? button.getText().toString() : null;
        if (charSequence == null || charSequence.isEmpty()) {
            return;
        }
        float measureText = button.getPaint().measureText(charSequence);
        int width = ((button.getWidth() - button.getPaddingLeft()) - button.getPaddingRight()) - ((int) ((48.0f * artistPageFragment.Z().getResources().getDisplayMetrics().density) + 0.5f));
        try {
            if (width <= 0 || measureText > width) {
                button.setText("");
                button.setContentDescription(artistPageFragment.s(i));
            } else if (button.getContentDescription() == null || button.getContentDescription().length() == 0) {
                button.setContentDescription(artistPageFragment.s(i));
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        View inflate = layoutInflater.inflate(app.homemusic.R.layout.fragment_artist_page, viewGroup, false);
        int i = app.homemusic.R.id.album_page_button_layout;
        if (((LinearLayout) uo.s(inflate, app.homemusic.R.id.album_page_button_layout)) != null) {
            i = app.homemusic.R.id.all_albums_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(inflate, app.homemusic.R.id.all_albums_recycler_view);
            if (recyclerView != null) {
                i = app.homemusic.R.id.anim_toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(inflate, app.homemusic.R.id.anim_toolbar);
                if (materialToolbar != null) {
                    i = app.homemusic.R.id.appbar;
                    if (((AppBarLayout) uo.s(inflate, app.homemusic.R.id.appbar)) != null) {
                        i = app.homemusic.R.id.appears_on_recycler_view;
                        RecyclerView recyclerView2 = (RecyclerView) uo.s(inflate, app.homemusic.R.id.appears_on_recycler_view);
                        if (recyclerView2 != null) {
                            i = app.homemusic.R.id.appears_on_see_all_text_view;
                            TextView textView = (TextView) uo.s(inflate, app.homemusic.R.id.appears_on_see_all_text_view);
                            if (textView != null) {
                                i = app.homemusic.R.id.artist_backdrop_image_view;
                                ImageView imageView = (ImageView) uo.s(inflate, app.homemusic.R.id.artist_backdrop_image_view);
                                if (imageView != null) {
                                    i = app.homemusic.R.id.artist_page_all_albums_sectors;
                                    if (((LinearLayout) uo.s(inflate, app.homemusic.R.id.artist_page_all_albums_sectors)) != null) {
                                        i = app.homemusic.R.id.artist_page_appears_on_sector;
                                        LinearLayout linearLayout = (LinearLayout) uo.s(inflate, app.homemusic.R.id.artist_page_appears_on_sector);
                                        if (linearLayout != null) {
                                            i = app.homemusic.R.id.artist_page_bio_sector;
                                            LinearLayout linearLayout2 = (LinearLayout) uo.s(inflate, app.homemusic.R.id.artist_page_bio_sector);
                                            if (linearLayout2 != null) {
                                                i = app.homemusic.R.id.artist_page_radio_button;
                                                Button button = (Button) uo.s(inflate, app.homemusic.R.id.artist_page_radio_button);
                                                if (button != null) {
                                                    Button button2 = (Button) uo.s(inflate, app.homemusic.R.id.artist_page_shuffle_button);
                                                    if (button2 != null) {
                                                        int i2 = app.homemusic.R.id.artist_page_top_songs_sector;
                                                        LinearLayout linearLayout3 = (LinearLayout) uo.s(inflate, app.homemusic.R.id.artist_page_top_songs_sector);
                                                        if (linearLayout3 != null) {
                                                            i2 = app.homemusic.R.id.artist_page_wave_button;
                                                            if (((Button) uo.s(inflate, app.homemusic.R.id.artist_page_wave_button)) != null) {
                                                                int i3 = app.homemusic.R.id.bio_more_text_view_clickable;
                                                                TextView textView2 = (TextView) uo.s(inflate, app.homemusic.R.id.bio_more_text_view_clickable);
                                                                if (textView2 != null) {
                                                                    i3 = app.homemusic.R.id.bio_text_view;
                                                                    TextView textView3 = (TextView) uo.s(inflate, app.homemusic.R.id.bio_text_view);
                                                                    if (textView3 != null) {
                                                                        i3 = app.homemusic.R.id.bottom_button_divider;
                                                                        View s = uo.s(inflate, app.homemusic.R.id.bottom_button_divider);
                                                                        if (s != null) {
                                                                            if (((ToggleButton) uo.s(inflate, app.homemusic.R.id.button_favorite)) == null) {
                                                                                i2 = app.homemusic.R.id.button_favorite;
                                                                            } else if (((Button) uo.s(inflate, app.homemusic.R.id.button_more_options)) == null) {
                                                                                i3 = app.homemusic.R.id.button_more_options;
                                                                            } else if (((Button) uo.s(inflate, app.homemusic.R.id.button_toggle_bio)) != null) {
                                                                                i3 = app.homemusic.R.id.collapsing_toolbar;
                                                                                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) uo.s(inflate, app.homemusic.R.id.collapsing_toolbar);
                                                                                if (collapsingToolbarLayout != null) {
                                                                                    i3 = app.homemusic.R.id.fragment_artist_page_nested_scroll_view;
                                                                                    if (((NestedScrollView) uo.s(inflate, app.homemusic.R.id.fragment_artist_page_nested_scroll_view)) != null) {
                                                                                        i3 = app.homemusic.R.id.item_song_placeholder_1;
                                                                                        View s2 = uo.s(inflate, app.homemusic.R.id.item_song_placeholder_1);
                                                                                        if (s2 != null) {
                                                                                            c12.f(s2);
                                                                                            i3 = app.homemusic.R.id.item_song_placeholder_2;
                                                                                            View s3 = uo.s(inflate, app.homemusic.R.id.item_song_placeholder_2);
                                                                                            if (s3 != null) {
                                                                                                c12.f(s3);
                                                                                                i3 = app.homemusic.R.id.item_song_placeholder_3;
                                                                                                View s4 = uo.s(inflate, app.homemusic.R.id.item_song_placeholder_3);
                                                                                                if (s4 != null) {
                                                                                                    c12.f(s4);
                                                                                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                                                                                    i3 = app.homemusic.R.id.most_streamed_song_recycler_container;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) uo.s(inflate, app.homemusic.R.id.most_streamed_song_recycler_container);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        i3 = app.homemusic.R.id.most_streamed_song_recycler_empty;
                                                                                                        TextView textView4 = (TextView) uo.s(inflate, app.homemusic.R.id.most_streamed_song_recycler_empty);
                                                                                                        if (textView4 != null) {
                                                                                                            i3 = app.homemusic.R.id.most_streamed_song_recycler_placeholder;
                                                                                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) uo.s(inflate, app.homemusic.R.id.most_streamed_song_recycler_placeholder);
                                                                                                            if (shimmerFrameLayout != null) {
                                                                                                                i3 = app.homemusic.R.id.most_streamed_song_recycler_view;
                                                                                                                RecyclerView recyclerView3 = (RecyclerView) uo.s(inflate, app.homemusic.R.id.most_streamed_song_recycler_view);
                                                                                                                if (recyclerView3 != null) {
                                                                                                                    i3 = app.homemusic.R.id.most_streamed_song_text_view_clickable;
                                                                                                                    TextView textView5 = (TextView) uo.s(inflate, app.homemusic.R.id.most_streamed_song_text_view_clickable);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i3 = app.homemusic.R.id.similar_artist_sector;
                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) uo.s(inflate, app.homemusic.R.id.similar_artist_sector);
                                                                                                                        if (linearLayout5 != null) {
                                                                                                                            i3 = app.homemusic.R.id.similar_artists_recycler_view;
                                                                                                                            RecyclerView recyclerView4 = (RecyclerView) uo.s(inflate, app.homemusic.R.id.similar_artists_recycler_view);
                                                                                                                            if (recyclerView4 != null) {
                                                                                                                                i3 = app.homemusic.R.id.upper_button_divider;
                                                                                                                                View s5 = uo.s(inflate, app.homemusic.R.id.upper_button_divider);
                                                                                                                                if (s5 != null) {
                                                                                                                                    this.l0 = new sc1(coordinatorLayout, recyclerView, materialToolbar, recyclerView2, textView, imageView, linearLayout, linearLayout2, button, button2, linearLayout3, textView2, textView3, s, collapsingToolbarLayout, linearLayout4, textView4, shimmerFrameLayout, recyclerView3, textView5, linearLayout5, recyclerView4, s5);
                                                                                                                                    nc1 X = X();
                                                                                                                                    e75 d = X.d();
                                                                                                                                    b75 r = gh0.r(X);
                                                                                                                                    bq4 bq4Var = new bq4(d, r, b11.e(X, r));
                                                                                                                                    i30 a = kx3.a(wj.class);
                                                                                                                                    String b = a.b();
                                                                                                                                    if (b == null) {
                                                                                                                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    this.n0 = (wj) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                                                                                                                                    nc1 X2 = X();
                                                                                                                                    e75 d2 = X2.d();
                                                                                                                                    b75 r2 = gh0.r(X2);
                                                                                                                                    bq4 bq4Var2 = new bq4(d2, r2, b11.e(X2, r2));
                                                                                                                                    i30 a2 = kx3.a(li3.class);
                                                                                                                                    String b2 = a2.b();
                                                                                                                                    if (b2 == null) {
                                                                                                                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    this.o0 = (li3) bq4Var2.l(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                                                                                                                                    Bundle bundle2 = this.s;
                                                                                                                                    ArtistID3 artistID3 = bundle2 != null ? (ArtistID3) bundle2.getParcelable("ARTIST_OBJECT") : null;
                                                                                                                                    if (artistID3 == null) {
                                                                                                                                        MainActivity mainActivity = this.m0;
                                                                                                                                        if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                                                                                                                            v23Var.o();
                                                                                                                                        }
                                                                                                                                        return coordinatorLayout;
                                                                                                                                    }
                                                                                                                                    ut4.c().b(Z());
                                                                                                                                    ut4 c = ut4.c();
                                                                                                                                    Context Z = Z();
                                                                                                                                    if (!c.h) {
                                                                                                                                        c.b(Z);
                                                                                                                                    }
                                                                                                                                    this.u0 = c.b;
                                                                                                                                    ut4 c2 = ut4.c();
                                                                                                                                    Context Z2 = Z();
                                                                                                                                    if (!c2.h) {
                                                                                                                                        c2.b(Z2);
                                                                                                                                    }
                                                                                                                                    this.v0 = c2.c;
                                                                                                                                    wj wjVar = this.n0;
                                                                                                                                    wjVar.e = artistID3;
                                                                                                                                    le1 v = v();
                                                                                                                                    pa paVar = wjVar.c;
                                                                                                                                    String id = wjVar.e.getId();
                                                                                                                                    paVar.getClass();
                                                                                                                                    int i4 = 6;
                                                                                                                                    pa.v(id).e(v, new d8(i4, wjVar));
                                                                                                                                    int i5 = 1;
                                                                                                                                    this.l0.t.setOnClickListener(new pj(this, i5));
                                                                                                                                    ToggleButton toggleButton = (ToggleButton) coordinatorLayout.findViewById(app.homemusic.R.id.button_favorite);
                                                                                                                                    toggleButton.setChecked(n61.f(3, this.n0.e.getId(), this.n0.e.getStarred() != null));
                                                                                                                                    int i6 = 2;
                                                                                                                                    toggleButton.setOnClickListener(new pj(this, i6));
                                                                                                                                    ((Button) coordinatorLayout.findViewById(app.homemusic.R.id.button_toggle_bio)).setOnClickListener(new pj(this, 3));
                                                                                                                                    int i7 = 4;
                                                                                                                                    ((Button) coordinatorLayout.findViewById(app.homemusic.R.id.button_more_options)).setOnClickListener(new pj(this, i7));
                                                                                                                                    Button button3 = (Button) coordinatorLayout.findViewById(app.homemusic.R.id.artist_page_shuffle_button);
                                                                                                                                    Button button4 = (Button) coordinatorLayout.findViewById(app.homemusic.R.id.artist_page_radio_button);
                                                                                                                                    if (button3 != null && button4 != null) {
                                                                                                                                        coordinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new qj(this, button3, button4, coordinatorLayout));
                                                                                                                                    }
                                                                                                                                    this.m0.o(this.l0.c);
                                                                                                                                    if (this.m0.n() != null) {
                                                                                                                                        this.m0.n().f0(true);
                                                                                                                                    }
                                                                                                                                    this.l0.o.setTitle(this.n0.e.getName());
                                                                                                                                    this.l0.c.setNavigationOnClickListener(new pj(this, i4));
                                                                                                                                    this.l0.o.setExpandedTitleColor(r().getColor(app.homemusic.R.color.white, null));
                                                                                                                                    wj wjVar2 = this.n0;
                                                                                                                                    wjVar2.c(wjVar2.e.getId()).e(v(), new oj(this, i5));
                                                                                                                                    this.l0.j.setOnClickListener(new pj(this, 7));
                                                                                                                                    View findViewById = this.l0.a.findViewById(app.homemusic.R.id.artist_page_wave_button);
                                                                                                                                    String id2 = this.n0.e.getId();
                                                                                                                                    int i8 = 5;
                                                                                                                                    if (id2 != null && !id2.trim().isEmpty()) {
                                                                                                                                        findViewById.setVisibility(0);
                                                                                                                                        findViewById.setOnClickListener(new j8(i8, this, id2));
                                                                                                                                    }
                                                                                                                                    this.l0.i.setOnClickListener(new pj(this, 8));
                                                                                                                                    RecyclerView recyclerView5 = this.l0.s;
                                                                                                                                    Z();
                                                                                                                                    recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                                                                                                                    ni4 ni4Var = new ni4(v(), this, true, true, null);
                                                                                                                                    this.p0 = ni4Var;
                                                                                                                                    this.l0.s.setAdapter(ni4Var);
                                                                                                                                    this.p0.A = this.t0;
                                                                                                                                    i0();
                                                                                                                                    wj wjVar3 = this.n0;
                                                                                                                                    pa paVar2 = wjVar3.c;
                                                                                                                                    String name = wjVar3.e.getName();
                                                                                                                                    paVar2.getClass();
                                                                                                                                    pa.z(20, name).e(v(), new oj(this, i6));
                                                                                                                                    this.l0.q.setOnClickListener(new pj(this, 0));
                                                                                                                                    RecyclerView recyclerView6 = this.l0.b;
                                                                                                                                    Z();
                                                                                                                                    recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                                                                                                                    this.l0.b.setHasFixedSize(true);
                                                                                                                                    this.l0.b.setNestedScrollingEnabled(false);
                                                                                                                                    v8 v8Var = new v8(Z(), this);
                                                                                                                                    this.q0 = v8Var;
                                                                                                                                    this.l0.b.setAdapter(v8Var);
                                                                                                                                    this.n0.g.e(v(), new oj(this, i7));
                                                                                                                                    RecyclerView recyclerView7 = this.l0.d;
                                                                                                                                    Z();
                                                                                                                                    recyclerView7.setLayoutManager(new LinearLayoutManager(0));
                                                                                                                                    this.l0.d.setHasFixedSize(true);
                                                                                                                                    this.l0.d.setNestedScrollingEnabled(false);
                                                                                                                                    l7 l7Var = new l7(this, true);
                                                                                                                                    this.r0 = l7Var;
                                                                                                                                    this.l0.d.setAdapter(l7Var);
                                                                                                                                    this.n0.f.e(v(), new oj(this, i8));
                                                                                                                                    RecyclerView recyclerView8 = this.l0.v;
                                                                                                                                    Z();
                                                                                                                                    recyclerView8.setLayoutManager(new GridLayoutManager(this.u0));
                                                                                                                                    this.l0.v.i(new ek1(this.u0, this.v0));
                                                                                                                                    this.l0.v.setHasFixedSize(true);
                                                                                                                                    s6 s6Var = new s6(this);
                                                                                                                                    this.s0 = s6Var;
                                                                                                                                    this.l0.v.setAdapter(s6Var);
                                                                                                                                    wj wjVar4 = this.n0;
                                                                                                                                    wjVar4.c(wjVar4.e.getId()).e(v(), new oj(this, i4));
                                                                                                                                    new xg0(0).a(this.l0.v);
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
                                                                            } else {
                                                                                i = app.homemusic.R.id.button_toggle_bio;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i = i3;
                                                            }
                                                        }
                                                        i = i2;
                                                    } else {
                                                        i = app.homemusic.R.id.artist_page_shuffle_button;
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
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.w0.removeCallbacks(this.x0);
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 ni4Var = this.p0;
        if (ni4Var != null) {
            ni4Var.A = this.t0;
        }
    }

    @Override // defpackage.kc1
    public final void R() {
        xc5 xc5Var;
        this.R = true;
        Context Z = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper x = f35.x();
        bl2 bl2Var = new bl2(x);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(Z)));
        } else {
            xc5Var = null;
        }
        b11.w(bl2Var, new bj2(Z, cb4Var, bundle, aj2Var, x, bl2Var, xc5Var), new Handler(x));
        this.t0 = bl2Var;
        bo2.j(bl2Var, this.o0);
        this.o0.b.e(v(), new oj(this, 0));
        this.o0.c.e(v(), new oj(this, 3));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.t0);
        this.w0.removeCallbacks(this.x0);
        this.R = true;
    }

    public final void i0() {
        if (this.p0 != null) {
            String str = (String) this.o0.b.d();
            Boolean bool = (Boolean) this.o0.c.d();
            this.p0.s(str, bool != null && bool.booleanValue());
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle bundle) {
        gb.x(a0()).m(app.homemusic.R.id.albumPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle bundle) {
        gb.x(a0()).m(app.homemusic.R.id.albumBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle bundle) {
        gb.x(a0()).m(app.homemusic.R.id.artistPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle bundle) {
        gb.x(a0()).m(app.homemusic.R.id.artistBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.q(this.t0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"), "artist");
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        gb.x(a0()).m(app.homemusic.R.id.songBottomSheetDialog, bundle, null);
    }
}
