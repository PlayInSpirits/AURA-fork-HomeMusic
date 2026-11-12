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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
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
import defpackage.cm3;
import defpackage.dm3;
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

    public PlaylistPageFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(final Menu r9, MenuInflater r10) {
        r10.inflate(R.menu.playlist_page_menu, r9);
        SearchView r11 = (SearchView) r9.findItem(R.id.action_search).getActionView();
        r11.setImeOptions(6);
        int r1 = 4;
        r11.setOnQueryTextListener(new w7(this, r11, r1));
        final int r2 = 0;
        r11.setPadding(-32, 0, 0, 0);
        im3 r12 = this.n0;
        le1 r0 = v();
        r12.getClass();
        k03 r3 = new k03();
        ((s24) r12.c.a.o).i().a(new String[]{"pinned_playlist"}, new k52(26)).e(r0, new f7(r1, r12, r3));
        r3.e(v(), new cm3(r2, r9));
        final int r4 = 1;
        this.n0.f().e(v(), new cm3(r4, r9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc1
    public final View H(LayoutInflater r26, ViewGroup r27, Bundle r28) {
        this.m0 = (MainActivity) l();
        View r0 = r26.inflate(R.layout.fragment_playlist_page, r27, false);
        int r1 = R.id.album_bio_label;
        if (((TextView) uo.s(r0, R.id.album_bio_label)) == null) goto L106;
        r1 = R.id.anim_toolbar;
        MaterialToolbar r9 = (MaterialToolbar) uo.s(r0, R.id.anim_toolbar);
        if (r9 == null) goto L106;
        r1 = R.id.app_bar_layout;
        if (((AppBarLayout) uo.s(r0, R.id.app_bar_layout)) == null) goto L106;
        r1 = R.id.bottom_button_divider;
        View r10 = uo.s(r0, R.id.bottom_button_divider);
        if (r10 == null) goto L106;
        r1 = R.id.empty_playlist_label;
        TextView r11 = (TextView) uo.s(r0, R.id.empty_playlist_label);
        if (r11 == null) goto L106;
        r1 = R.id.playlist_cover_image_view_bottom_left;
        ImageView r12 = (ImageView) uo.s(r0, R.id.playlist_cover_image_view_bottom_left);
        if (r12 == null) goto L106;
        r1 = R.id.playlist_cover_image_view_bottom_right;
        ImageView r13 = (ImageView) uo.s(r0, R.id.playlist_cover_image_view_bottom_right);
        if (r13 == null) goto L106;
        r1 = R.id.playlist_cover_image_view_top_left;
        ImageView r14 = (ImageView) uo.s(r0, R.id.playlist_cover_image_view_top_left);
        if (r14 == null) goto L106;
        r1 = R.id.playlist_cover_image_view_top_right;
        ImageView r15 = (ImageView) uo.s(r0, R.id.playlist_cover_image_view_top_right);
        if (r15 == null) goto L106;
        r1 = R.id.playlist_duration_label;
        TextView r16 = (TextView) uo.s(r0, R.id.playlist_duration_label);
        if (r16 == null) goto L106;
        NestedScrollView r17 = (NestedScrollView) uo.s(r0, R.id.playlist_info_scroll_view);
        r1 = R.id.playlist_info_sector;
        if (((ConstraintLayout) uo.s(r0, R.id.playlist_info_sector)) == null) goto L106;
        r1 = R.id.playlist_name_label;
        TextView r18 = (TextView) uo.s(r0, R.id.playlist_name_label);
        if (r18 == null) goto L106;
        r1 = R.id.playlist_page_button_layout;
        if (((LinearLayout) uo.s(r0, R.id.playlist_page_button_layout)) == null) goto L106;
        r1 = R.id.playlist_page_play_button;
        Button r19 = (Button) uo.s(r0, R.id.playlist_page_play_button);
        if (r19 == null) goto L106;
        r1 = R.id.playlist_page_shuffle_button;
        Button r20 = (Button) uo.s(r0, R.id.playlist_page_shuffle_button);
        if (r20 == null) goto L106;
        r1 = R.id.playlist_song_count_label;
        TextView r21 = (TextView) uo.s(r0, R.id.playlist_song_count_label);
        if (r21 == null) goto L106;
        r1 = R.id.song_recycler_view;
        RecyclerView r22 = (RecyclerView) uo.s(r0, R.id.song_recycler_view);
        if (r22 == null) goto L106;
        r1 = R.id.song_recycler_view_placeholder;
        ProgressBar r23 = (ProgressBar) uo.s(r0, R.id.song_recycler_view_placeholder);
        if (r23 == null) goto L106;
        r1 = R.id.upper_button_divider;
        View r24 = uo.s(r0, R.id.upper_button_divider);
        if (r24 == null) goto L106;
        LinearLayout r8 = (LinearLayout) r0;
        this.l0 = new yd1(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
        nc1 r2 = X();
        e75 r3 = r2.d();
        b75 r4 = gh0.r(r2);
        bq4 r5 = new bq4(r3, r4, b11.e(r2, r4));
        i30 r6 = kx3.a(im3.class);
        String r7 = r6.b();
        if (r7 == null) goto L104;
        this.n0 = (im3) r5.l(r6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r7));
        nc1 r25 = X();
        e75 r29 = r25.d();
        b75 r30 = gh0.r(r25);
        bq4 r31 = new bq4(r29, r30, b11.e(r25, r30));
        i30 r32 = kx3.a(li3.class);
        String r33 = r32.b();
        if (r33 == null) goto L102;
        this.o0 = (li3) r31.l(r32, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r33));
        Bundle r34 = this.s;
        if (r34 == null) goto L47;
        Playlist r35 = (Playlist) r34.getParcelable("PLAYLIST_OBJECT");
    L48:
        if (r35 != null) goto L55;
        MainActivity r36 = this.m0;
        if (r36 == null) goto L54;
        v23 r37 = r36.T;
        if (r37 == null) goto L54;
        r37.o();
    L54:
        return r8;
    L55:
        im3 r38 = this.n0;
        Playlist r39 = r38.e;
        final boolean r40 = true;
        char r41 = 1;
        if (r39 != null) goto L58;
    L61:
        Object[] r42 = true;
    L62:
        r38.e = r35;
        r38.g = null;
        if (r42 == false) goto L65;
        r38.j.k(null);
        r38.k.k(Boolean.FALSE);
    L65:
        im3 r43 = this.n0;
        String r44 = r35.getId();
        mm3 r45 = r43.c;
        r45.getClass();
        new Thread(new jm3(r45, r44, 2)).start();
        this.m0.o(this.l0.a);
        if (this.m0.n() == null) goto L68;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L68:
        this.l0.a.setTitle(this.n0.e.getName());
        this.l0.j.setText(this.n0.e.getName());
        this.l0.m.setText(t(R.string.playlist_song_count, new Object[]{Integer.valueOf(this.n0.e.getSongCount())}));
        this.l0.h.setText(t(R.string.playlist_duration, new Object[]{e03.h(Long.valueOf(this.n0.e.getDuration()), false)}));
        this.l0.a.setNavigationOnClickListener(new bj3(8, this));
        Drawable r46 = this.l0.a.getOverflowIcon();
        Objects.requireNonNull(r46);
        r46.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        this.n0.d().e(v(), new zl3(this, r41 == true ? 1 : 0));
        Playlist r47 = this.n0.e;
        if (r47 != null) goto L71;
    L93:
        RecyclerView r48 = this.l0.n;
        Z();
        r48.setLayoutManager(new LinearLayoutManager(1));
        this.l0.n.setHasFixedSize(true);
        this.l0.n.setClipToPadding(false);
        this.l0.n.post(new qa1(29, this));
        yd1 r49 = this.l0;
        NestedScrollView r50 = r49.i;
        if (r50 == null) goto L96;
        r49.n.j(new l8(r50, 1));
    L96:
        ni4 r51 = new ni4(v(), this, true, false, null);
        this.p0 = r51;
        this.l0.n.setAdapter(r51);
        this.p0.A = this.r0;
        i0();
        this.n0.d().e(v(), new zl3(this, 5));
        if (r28 == null) goto L100;
        r40 = false;
    L100:
        this.s0 = false;
        this.t0 = false;
        this.n0.f().e(v(), new dm3(this, r40));
        this.n0.k.e(v(), new zl3(this, 3));
        return r8;
    L71:
        if (this.l0 == null) goto L93;
        String r52 = r47.getCoverArtId();
        ViewGroup r53 = (ViewGroup) this.l0.f.getParent();
        ImageView r54 = (ImageView) r53.findViewWithTag("SINGLE_PLAYLIST_COVER");
        if (r52 != null) goto L76;
    L90:
        if (r54 == null) goto L92;
        r54.setVisibility(8);
    L92:
        this.n0.d().e(v(), new zl3(this, 4));
        goto L93
    L76:
        if (r52.trim().isEmpty() == true) goto L90;
        if (r54 != null) goto L86;
        r54 = new ImageView(Z());
        r54.setTag("SINGLE_PLAYLIST_COVER");
        r54.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if ((r53 instanceof FrameLayout) == false) goto L82;
        ViewGroup.MarginLayoutParams r55 = new FrameLayout.LayoutParams(-1, -1);
    L85:
        int r56 = (int) (Z().getResources().getDisplayMetrics().density * 62.0f);
        r55.setMargins(r56, 0, r56, 0);
        r53.addView(r54, r55);
        goto L86
    L82:
        if ((r53 instanceof ConstraintLayout) == false) goto L84;
        r55 = new mb0(-1, -1);
        goto L85
    L84:
        r55 = new ViewGroup.MarginLayoutParams(-1, -1);
    L86:
        r54.setVisibility(0);
        Context r57 = Z();
        vz3 r58 = b11.g(r57, r52, 6, a.c(r57), wg0.b(ud3.t(), r52)).T(xv0.b());
        if (ud3.R() == false) goto L89;
        r58 = (vz3) r58.l();
    L89:
        float r59 = wg0.a;
        ((vz3) r58.A(new qj1(r59, r59, r59, r59))).K(r54);
        goto L93
    L58:
        if (r39.getId().equals(r35.getId()) == false) goto L61;
        r42 = false;
        goto L62
    L47:
        r35 = null;
        goto L48
    L102:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L104:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L106:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        f9 r0 = this.q0;
        if (r0 != null) goto L5;
    L7:
        this.q0 = null;
        this.v0 = false;
        this.u0 = null;
        this.l0 = null;
        return;
    L5:
        if (r0.isShowing() == false) goto L7;
        this.q0.dismiss();
        goto L7
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem r11) {
        int r2 = 1;
        if (r11.getItemId() != R.id.action_download_playlist) goto L10;
        if (this.v0 == true) goto L40;
        this.v0 = true;
        k03 r12 = this.n0.j;
        r12.e(v(), new i7(5, this, r12));
        return true;
    L40:
        return true;
    L10:
        if (r11.getItemId() != R.id.action_keep_synced) goto L23;
        boolean r0 = r11.isChecked();
        boolean r6 = !r0;
        im3 r1 = this.n0;
        mm3 r5 = r1.c;
        Playlist r4 = r1.e;
        if (r4 == null) goto L40;
        new Thread(new lg1(21, r5.b, r4)).start();
        String r7 = r1.e.getId();
        String r8 = ud3.D();
        if (r8 != null) goto L18;
        Log.w("PlaylistRepository", "No server address in use, keep synced not saved for " + r7);
        return true;
    L18:
        mm3.f.execute(new b41(r5, r6, r7, r8, 4));
        r11.setChecked(r6);
        this.s0 = r6;
        if (r0 == true) goto L40;
        h0((List) this.n0.j.d());
        return true;
    L23:
        if (r11.getItemId() != R.id.action_pin_playlist) goto L26;
        im3 r10 = this.n0;
        mm3 r13 = r10.c;
        new Thread(new lg1(21, r13.b, r10.e)).start();
        new Thread(new jm3(r13, r10.e.getId(), r2)).start();
        return true;
    L26:
        int r9 = 0;
        if (r11.getItemId() != R.id.action_unpin_playlist) goto L31;
        im3 r14 = this.n0;
        mm3 r15 = r14.c;
        new Thread(new lg1(21, r15.b, r14.e)).start();
        new Thread(new jm3(r15, r14.e.getId(), r9)).start();
        return true;
    L31:
        if (r11.getItemId() != R.id.action_add_to_queue) goto L42;
        List r16 = (List) this.n0.d().d();
        if (B() == false) goto L40;
        if (l() == null) goto L40;
        if (r16 == null) goto L40;
        if (r16.isEmpty() == true) goto L40;
        bo2.e(this.r0, r16, false);
        goto L40
    L42:
        if (r11.getItemId() != R.id.action_edit_playlist) goto L46;
        Bundle r17 = new Bundle();
        r17.putParcelable("PLAYLIST_OBJECT", this.n0.e);
        gb.x(a0()).m(R.id.playlistEditorFragment, r17, null);
        return true;
    L46:
        if (r11.getItemId() != R.id.action_edit_playlist_details) goto L49;
        Bundle r18 = new Bundle();
        r18.putParcelable("PLAYLIST_OBJECT", this.n0.e);
        sl3 r3 = new sl3(0, new si1(15, this));
        r3.c0(r18);
        r3.m0(this.m0.k(), null);
        return true;
    L49:
        return false;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 r0 = this.p0;
        if (r0 == null) goto L6;
        r0.A = this.r0;
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
        fi0 r8 = new fi0(new x7(r2));
        xc5 r0 = new xc5(4, r8);
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.r0 = r7;
        bo2.j(r7, this.o0);
        this.o0.b.e(v(), new zl3(this, 0));
        this.o0.c.e(v(), new zl3(this, 2));
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.r0);
        this.R = true;
    }

    public final void h0(List r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (this.l0 == null) goto L9;
        this.u0 = (List) r8.stream().map(new m7(17)).collect(Collectors.toList());
        Playlist r0 = this.n0.e;
        au0.l(Z(), r8, r0.getId(), r0.getName(), false, new g41(1, this));
        return;
    }

    public final void i0() {
        if (this.p0 == null) goto L12;
        String r0 = (String) this.o0.b.d();
        Boolean r1 = (Boolean) this.o0.c.d();
        ni4 r2 = this.p0;
        if (r1 != null) goto L7;
    L9:
        boolean r3 = false;
    L10:
        r2.s(r0, r3);
        return;
    L7:
        if (r1.booleanValue() == false) goto L9;
        r3 = true;
        goto L10
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        bo2.q(this.r0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"), v13.a(this.n0.e.getId()));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r7) {
        List r0 = (List) this.n0.d().d();
        Child r1 = (Child) r7.getParcelable("TRACK_OBJECT");
        int r3 = -1;
        if (r0 == null) goto L19;
        int r4 = 0;
    L6:
        if (r4 >= r0.size()) goto L11;
        if (r0.get(r4) == r1) goto L12;
        r4 = r4 + 1;
    L12:
        if (r4 != (-1)) goto L15;
        r4 = r0.indexOf(r1);
    L15:
        if (this.n0.f != null) goto L18;
        r3 = r4;
    L18:
        r7.putInt("ITEM_POSITION", r3);
    L20:
        r7.putString("PLAYLIST_ID", this.n0.e.getId());
        r7.putString("PLAYLIST_NAME", this.n0.e.getName());
        gb.x(a0()).m(R.id.songBottomSheetDialog, r7, null);
        return;
    L11:
        r4 = -1;
        goto L12
    L19:
        r7.putInt("ITEM_POSITION", -1);
        goto L20
    }
}
