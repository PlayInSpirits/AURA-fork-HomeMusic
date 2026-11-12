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
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.aj2;
import defpackage.au;
import defpackage.au0;
import defpackage.b11;
import defpackage.b41;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bj3;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e03;
import defpackage.e75;
import defpackage.f35;
import defpackage.f7;
import defpackage.f9;
import defpackage.fi0;
import defpackage.g41;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.i7;
import defpackage.im3;
import defpackage.jm3;
import defpackage.k03;
import defpackage.k52;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l8;
import defpackage.le1;
import defpackage.lg1;
import defpackage.li3;
import defpackage.m7;
import defpackage.mb0;
import defpackage.mm3;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.qa1;
import defpackage.qj1;
import defpackage.s24;
import defpackage.si1;
import defpackage.sk2;
import defpackage.sl3;
import defpackage.ud3;
import defpackage.uo;
import defpackage.v13;
import defpackage.v23;
import defpackage.vz3;
import defpackage.w7;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.yd1;
import defpackage.zl3;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistPageFragment extends kc1 implements ClickCallback {
    public yd1 l0;
    public MainActivity m0;
    public im3 n0;
    public li3 o0;
    public ni4 p0;
    public f9 q0;
    public bl2 r0;
    public boolean s0;
    public boolean t0;
    public List u0;
    public boolean v0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(final Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.playlist_page_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        int i = 4;
        searchView.setOnQueryTextListener(new w7(this, searchView, i));
        final int i2 = 0;
        searchView.setPadding(-32, 0, 0, 0);
        im3 im3Var = this.n0;
        le1 le1VarV = v();
        im3Var.getClass();
        k03 k03Var = new k03();
        ((s24) im3Var.c.a.o).i().a(new String[]{"pinned_playlist"}, new k52(26)).e(le1VarV, new f7(i, im3Var, k03Var));
        k03Var.e(v(), new a83() { // from class: cm3
            @Override // defpackage.a83
            public final void b(Object obj) {
                int i3 = i2;
                Menu menu2 = menu;
                Boolean bool = (Boolean) obj;
                switch (i3) {
                    case 0:
                        menu2.findItem(R.id.action_unpin_playlist).setVisible(bool.booleanValue());
                        menu2.findItem(R.id.action_pin_playlist).setVisible(!bool.booleanValue());
                        break;
                    default:
                        menu2.findItem(R.id.action_keep_synced).setChecked(bool.booleanValue());
                        break;
                }
            }
        });
        final int i3 = 1;
        this.n0.f().e(v(), new a83() { // from class: cm3
            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i3;
                Menu menu2 = menu;
                Boolean bool = (Boolean) obj;
                switch (i4) {
                    case 0:
                        menu2.findItem(R.id.action_unpin_playlist).setVisible(bool.booleanValue());
                        menu2.findItem(R.id.action_pin_playlist).setVisible(!bool.booleanValue());
                        break;
                    default:
                        menu2.findItem(R.id.action_keep_synced).setChecked(bool.booleanValue());
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.MarginLayoutParams mb0Var;
        v23 v23Var;
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_playlist_page, viewGroup, false);
        int i = R.id.album_bio_label;
        if (((TextView) uo.s(viewInflate, R.id.album_bio_label)) != null) {
            i = R.id.anim_toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.anim_toolbar);
            if (materialToolbar != null) {
                i = R.id.app_bar_layout;
                if (((AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout)) != null) {
                    i = R.id.bottom_button_divider;
                    View viewS = uo.s(viewInflate, R.id.bottom_button_divider);
                    if (viewS != null) {
                        i = R.id.empty_playlist_label;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.empty_playlist_label);
                        if (textView != null) {
                            i = R.id.playlist_cover_image_view_bottom_left;
                            ImageView imageView = (ImageView) uo.s(viewInflate, R.id.playlist_cover_image_view_bottom_left);
                            if (imageView != null) {
                                i = R.id.playlist_cover_image_view_bottom_right;
                                ImageView imageView2 = (ImageView) uo.s(viewInflate, R.id.playlist_cover_image_view_bottom_right);
                                if (imageView2 != null) {
                                    i = R.id.playlist_cover_image_view_top_left;
                                    ImageView imageView3 = (ImageView) uo.s(viewInflate, R.id.playlist_cover_image_view_top_left);
                                    if (imageView3 != null) {
                                        i = R.id.playlist_cover_image_view_top_right;
                                        ImageView imageView4 = (ImageView) uo.s(viewInflate, R.id.playlist_cover_image_view_top_right);
                                        if (imageView4 != null) {
                                            i = R.id.playlist_duration_label;
                                            TextView textView2 = (TextView) uo.s(viewInflate, R.id.playlist_duration_label);
                                            if (textView2 != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) uo.s(viewInflate, R.id.playlist_info_scroll_view);
                                                i = R.id.playlist_info_sector;
                                                if (((ConstraintLayout) uo.s(viewInflate, R.id.playlist_info_sector)) != null) {
                                                    i = R.id.playlist_name_label;
                                                    TextView textView3 = (TextView) uo.s(viewInflate, R.id.playlist_name_label);
                                                    if (textView3 != null) {
                                                        i = R.id.playlist_page_button_layout;
                                                        if (((LinearLayout) uo.s(viewInflate, R.id.playlist_page_button_layout)) != null) {
                                                            i = R.id.playlist_page_play_button;
                                                            Button button = (Button) uo.s(viewInflate, R.id.playlist_page_play_button);
                                                            if (button != null) {
                                                                i = R.id.playlist_page_shuffle_button;
                                                                Button button2 = (Button) uo.s(viewInflate, R.id.playlist_page_shuffle_button);
                                                                if (button2 != null) {
                                                                    i = R.id.playlist_song_count_label;
                                                                    TextView textView4 = (TextView) uo.s(viewInflate, R.id.playlist_song_count_label);
                                                                    if (textView4 != null) {
                                                                        i = R.id.song_recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.song_recycler_view);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.song_recycler_view_placeholder;
                                                                            ProgressBar progressBar = (ProgressBar) uo.s(viewInflate, R.id.song_recycler_view_placeholder);
                                                                            if (progressBar != null) {
                                                                                i = R.id.upper_button_divider;
                                                                                View viewS2 = uo.s(viewInflate, R.id.upper_button_divider);
                                                                                if (viewS2 != null) {
                                                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                    this.l0 = new yd1(linearLayout, materialToolbar, viewS, textView, imageView, imageView2, imageView3, imageView4, textView2, nestedScrollView, textView3, button, button2, textView4, recyclerView, progressBar, viewS2);
                                                                                    nc1 nc1VarX = X();
                                                                                    e75 e75VarD = nc1VarX.d();
                                                                                    b75 b75VarR = gh0.r(nc1VarX);
                                                                                    bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                                                    i30 i30VarA = kx3.a(im3.class);
                                                                                    String strB = i30VarA.b();
                                                                                    if (strB == null) {
                                                                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                        return null;
                                                                                    }
                                                                                    this.n0 = (im3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
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
                                                                                    Playlist playlist = bundle2 != null ? (Playlist) bundle2.getParcelable("PLAYLIST_OBJECT") : null;
                                                                                    if (playlist == null) {
                                                                                        MainActivity mainActivity = this.m0;
                                                                                        if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                                                                            v23Var.o();
                                                                                        }
                                                                                        return linearLayout;
                                                                                    }
                                                                                    im3 im3Var = this.n0;
                                                                                    Playlist playlist2 = im3Var.e;
                                                                                    char c = 1;
                                                                                    Object[] objArr = playlist2 == null || !playlist2.getId().equals(playlist.getId());
                                                                                    im3Var.e = playlist;
                                                                                    im3Var.g = null;
                                                                                    if (objArr != false) {
                                                                                        im3Var.j.k(null);
                                                                                        im3Var.k.k(Boolean.FALSE);
                                                                                    }
                                                                                    im3 im3Var2 = this.n0;
                                                                                    String id = playlist.getId();
                                                                                    mm3 mm3Var = im3Var2.c;
                                                                                    mm3Var.getClass();
                                                                                    new Thread(new jm3(mm3Var, id, 2)).start();
                                                                                    this.m0.o(this.l0.a);
                                                                                    if (this.m0.n() != null) {
                                                                                        this.m0.n().f0(true);
                                                                                        this.m0.n().g0();
                                                                                    }
                                                                                    this.l0.a.setTitle(this.n0.e.getName());
                                                                                    this.l0.j.setText(this.n0.e.getName());
                                                                                    this.l0.m.setText(t(R.string.playlist_song_count, Integer.valueOf(this.n0.e.getSongCount())));
                                                                                    this.l0.h.setText(t(R.string.playlist_duration, e03.h(Long.valueOf(this.n0.e.getDuration()), false)));
                                                                                    this.l0.a.setNavigationOnClickListener(new bj3(8, this));
                                                                                    Drawable overflowIcon = this.l0.a.getOverflowIcon();
                                                                                    Objects.requireNonNull(overflowIcon);
                                                                                    overflowIcon.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
                                                                                    this.n0.d().e(v(), new zl3(this, c == true ? 1 : 0));
                                                                                    Playlist playlist3 = this.n0.e;
                                                                                    if (playlist3 != null && this.l0 != null) {
                                                                                        String coverArtId = playlist3.getCoverArtId();
                                                                                        ViewGroup viewGroup2 = (ViewGroup) this.l0.f.getParent();
                                                                                        ImageView imageView5 = (ImageView) viewGroup2.findViewWithTag("SINGLE_PLAYLIST_COVER");
                                                                                        if (coverArtId == null || coverArtId.trim().isEmpty()) {
                                                                                            if (imageView5 != null) {
                                                                                                imageView5.setVisibility(8);
                                                                                            }
                                                                                            this.n0.d().e(v(), new zl3(this, 4));
                                                                                        } else {
                                                                                            if (imageView5 == null) {
                                                                                                imageView5 = new ImageView(Z());
                                                                                                imageView5.setTag("SINGLE_PLAYLIST_COVER");
                                                                                                imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                                                                if (viewGroup2 instanceof FrameLayout) {
                                                                                                    mb0Var = new FrameLayout.LayoutParams(-1, -1);
                                                                                                } else {
                                                                                                    mb0Var = viewGroup2 instanceof ConstraintLayout ? new mb0(-1, -1) : new ViewGroup.MarginLayoutParams(-1, -1);
                                                                                                }
                                                                                                int i2 = (int) (Z().getResources().getDisplayMetrics().density * 62.0f);
                                                                                                mb0Var.setMargins(i2, 0, i2, 0);
                                                                                                viewGroup2.addView(imageView5, mb0Var);
                                                                                            }
                                                                                            imageView5.setVisibility(0);
                                                                                            Context contextZ = Z();
                                                                                            vz3 vz3VarT = b11.g(contextZ, coverArtId, 6, a.c(contextZ), wg0.b(ud3.t(), coverArtId)).T(xv0.b());
                                                                                            if (ud3.R()) {
                                                                                                vz3VarT = (vz3) vz3VarT.l();
                                                                                            }
                                                                                            float f = wg0.a;
                                                                                            ((vz3) vz3VarT.A(new qj1(f, f, f, f))).K(imageView5);
                                                                                        }
                                                                                    }
                                                                                    RecyclerView recyclerView2 = this.l0.n;
                                                                                    Z();
                                                                                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                                                    this.l0.n.setHasFixedSize(true);
                                                                                    this.l0.n.setClipToPadding(false);
                                                                                    this.l0.n.post(new qa1(29, this));
                                                                                    yd1 yd1Var = this.l0;
                                                                                    NestedScrollView nestedScrollView2 = yd1Var.i;
                                                                                    if (nestedScrollView2 != null) {
                                                                                        yd1Var.n.j(new l8(nestedScrollView2, 1));
                                                                                    }
                                                                                    ni4 ni4Var = new ni4(v(), this, true, false, null);
                                                                                    this.p0 = ni4Var;
                                                                                    this.l0.n.setAdapter(ni4Var);
                                                                                    this.p0.A = this.r0;
                                                                                    i0();
                                                                                    this.n0.d().e(v(), new zl3(this, 5));
                                                                                    final boolean z = bundle == null;
                                                                                    this.s0 = false;
                                                                                    this.t0 = false;
                                                                                    this.n0.f().e(v(), new a83() { // from class: dm3
                                                                                        @Override // defpackage.a83
                                                                                        public final void b(Object obj) {
                                                                                            Boolean bool = (Boolean) obj;
                                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                                            PlaylistPageFragment playlistPageFragment = this.a;
                                                                                            playlistPageFragment.s0 = zBooleanValue;
                                                                                            if (z && !playlistPageFragment.t0 && bool.booleanValue() && playlistPageFragment.n0.j.d() != null) {
                                                                                                playlistPageFragment.n0.h();
                                                                                            }
                                                                                            playlistPageFragment.t0 = true;
                                                                                        }
                                                                                    });
                                                                                    this.n0.k.e(v(), new zl3(this, 3));
                                                                                    return linearLayout;
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        f9 f9Var = this.q0;
        if (f9Var != null && f9Var.isShowing()) {
            this.q0.dismiss();
        }
        this.q0 = null;
        this.v0 = false;
        this.u0 = null;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem menuItem) {
        int i = 1;
        if (menuItem.getItemId() == R.id.action_download_playlist) {
            if (!this.v0) {
                this.v0 = true;
                k03 k03Var = this.n0.j;
                k03Var.e(v(), new i7(5, this, k03Var));
                return true;
            }
        } else if (menuItem.getItemId() == R.id.action_keep_synced) {
            boolean zIsChecked = menuItem.isChecked();
            boolean z = !zIsChecked;
            im3 im3Var = this.n0;
            mm3 mm3Var = im3Var.c;
            Playlist playlist = im3Var.e;
            if (playlist != null) {
                new Thread(new lg1(21, mm3Var.b, playlist)).start();
                String id = im3Var.e.getId();
                String strD = ud3.D();
                if (strD == null) {
                    Log.w("PlaylistRepository", "No server address in use, keep synced not saved for " + id);
                    return true;
                }
                mm3.f.execute(new b41(mm3Var, z, id, strD, 4));
                menuItem.setChecked(z);
                this.s0 = z;
                if (!zIsChecked) {
                    h0((List) this.n0.j.d());
                    return true;
                }
            }
        } else {
            if (menuItem.getItemId() == R.id.action_pin_playlist) {
                im3 im3Var2 = this.n0;
                mm3 mm3Var2 = im3Var2.c;
                new Thread(new lg1(21, mm3Var2.b, im3Var2.e)).start();
                new Thread(new jm3(mm3Var2, im3Var2.e.getId(), i)).start();
                return true;
            }
            int i2 = 0;
            if (menuItem.getItemId() == R.id.action_unpin_playlist) {
                im3 im3Var3 = this.n0;
                mm3 mm3Var3 = im3Var3.c;
                new Thread(new lg1(21, mm3Var3.b, im3Var3.e)).start();
                new Thread(new jm3(mm3Var3, im3Var3.e.getId(), i2)).start();
                return true;
            }
            if (menuItem.getItemId() != R.id.action_add_to_queue) {
                if (menuItem.getItemId() == R.id.action_edit_playlist) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("PLAYLIST_OBJECT", this.n0.e);
                    gb.x(a0()).m(R.id.playlistEditorFragment, bundle, null);
                    return true;
                }
                if (menuItem.getItemId() != R.id.action_edit_playlist_details) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("PLAYLIST_OBJECT", this.n0.e);
                sl3 sl3Var = new sl3(0, new si1(15, this));
                sl3Var.c0(bundle2);
                sl3Var.m0(this.m0.k(), null);
                return true;
            }
            List list = (List) this.n0.d().d();
            if (B() && e() != null && list != null && !list.isEmpty()) {
                bo2.e(this.r0, list, false);
            }
        }
        return true;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 ni4Var = this.p0;
        if (ni4Var != null) {
            ni4Var.A = this.r0;
        }
    }

    @Override // defpackage.kc1
    public final void R() {
        xc5 xc5Var;
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(contextZ)));
        } else {
            xc5Var = null;
        }
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
        this.r0 = bl2Var;
        bo2.j(bl2Var, this.o0);
        this.o0.b.e(v(), new zl3(this, 0));
        this.o0.c.e(v(), new zl3(this, 2));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.r0);
        this.R = true;
    }

    public final void h0(List list) {
        if (list == null || this.l0 == null) {
            return;
        }
        this.u0 = (List) list.stream().map(new m7(17)).collect(Collectors.toList());
        Playlist playlist = this.n0.e;
        au0.l(Z(), list, playlist.getId(), playlist.getName(), false, new g41(1, this));
    }

    public final void i0() {
        if (this.p0 != null) {
            String str = (String) this.o0.b.d();
            Boolean bool = (Boolean) this.o0.c.d();
            this.p0.s(str, bool != null && bool.booleanValue());
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.q(this.r0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"), v13.a(this.n0.e.getId()));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        List list = (List) this.n0.d().d();
        Child child = (Child) bundle.getParcelable("TRACK_OBJECT");
        if (list != null) {
            int iIndexOf = 0;
            while (true) {
                if (iIndexOf >= list.size()) {
                    iIndexOf = -1;
                    break;
                } else if (list.get(iIndexOf) == child) {
                    break;
                } else {
                    iIndexOf++;
                }
            }
            if (iIndexOf == -1) {
                iIndexOf = list.indexOf(child);
            }
            bundle.putInt("ITEM_POSITION", this.n0.f == null ? iIndexOf : -1);
        } else {
            bundle.putInt("ITEM_POSITION", -1);
        }
        bundle.putString("PLAYLIST_ID", this.n0.e.getId());
        bundle.putString("PLAYLIST_NAME", this.n0.e.getName());
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }
}
