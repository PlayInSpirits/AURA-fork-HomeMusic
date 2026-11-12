package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b75;
import defpackage.b8;
import defpackage.bq4;
import defpackage.c8;
import defpackage.d8;
import defpackage.e75;
import defpackage.e8;
import defpackage.f8;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nz2;
import defpackage.oc1;
import defpackage.rm3;
import defpackage.rv2;
import defpackage.s7;
import defpackage.tf0;
import defpackage.u7;
import defpackage.uo;
import defpackage.v23;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumListPageFragment extends kc1 implements ClickCallback {
    public oc1 l0;
    public MainActivity m0;
    public f8 n0;
    public b8 o0;

    public AlbumListPageFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.artist_list_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setOnQueryTextListener(new rm3(this, r4));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r17, ViewGroup r18, Bundle r19) {
        this.m0 = (MainActivity) l();
        final int r2 = 0;
        View r1 = r17.inflate(R.layout.fragment_album_list_page, r18, false);
        int r3 = R.id.album_info_sector;
        ConstraintLayout r7 = (ConstraintLayout) uo.s(r1, R.id.album_info_sector);
        if (r7 == null) goto L94;
        r3 = R.id.album_list_recycler_view;
        RecyclerView r8 = (RecyclerView) uo.s(r1, R.id.album_list_recycler_view);
        if (r8 == null) goto L94;
        r3 = R.id.album_list_sort_image_view;
        Button r9 = (Button) uo.s(r1, R.id.album_list_sort_image_view);
        if (r9 == null) goto L94;
        r3 = R.id.app_bar_layout;
        AppBarLayout r10 = (AppBarLayout) uo.s(r1, R.id.app_bar_layout);
        if (r10 == null) goto L94;
        r3 = R.id.page_subtitle_label;
        TextView r11 = (TextView) uo.s(r1, R.id.page_subtitle_label);
        if (r11 == null) goto L94;
        r3 = R.id.page_title_label;
        TextView r12 = (TextView) uo.s(r1, R.id.page_title_label);
        if (r12 == null) goto L94;
        r3 = R.id.toolbar;
        MaterialToolbar r13 = (MaterialToolbar) uo.s(r1, R.id.toolbar);
        if (r13 == null) goto L94;
        LinearLayout r6 = (LinearLayout) r1;
        this.l0 = new oc1(r6, r7, r8, r9, r10, r11, r12, r13);
        e75 r4 = d();
        b75 r5 = gh0.r(this);
        tf0 r14 = gh0.q(this);
        r5.getClass();
        r14.getClass();
        bq4 r15 = new bq4(r4, r5, r14);
        i30 r16 = kx3.a(f8.class);
        String r20 = r16.b();
        if (r20 == null) goto L92;
        this.n0 = (f8) r15.l(r16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r20));
        Bundle r21 = this.s;
        if (r21 != null) goto L27;
        MainActivity r0 = this.m0;
        if (r0 == null) goto L25;
        v23 r22 = r0.T;
        if (r22 == null) goto L25;
        r22.o();
    L25:
        return r6;
    L27:
        if (r21.getString("ALBUM_RECENTLY_PLAYED") == null) goto L30;
        this.n0.d = "ALBUM_RECENTLY_PLAYED";
        this.l0.f.setText(R.string.album_list_page_recently_played);
    L50:
        this.m0.o(this.l0.g);
        if (this.m0.n() == null) goto L53;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L53:
        this.l0.g.setNavigationOnClickListener(new c8(this, r2));
        this.l0.a.a(new u7(1, this));
        RecyclerView r23 = this.l0.c;
        Z();
        r23.setLayoutManager(new LinearLayoutManager(1));
        this.l0.c.setHasFixedSize(true);
        if (this.n0.d.equals("ALBUM_DOWNLOADED") == true) goto L56;
        this.n0.d.equals("ALBUM_FROM_ARTIST");
    L56:
        b8 r24 = new b8(this, 0);
        this.o0 = r24;
        final int r110 = 2;
        r24.p = 2;
        r24.n.g();
        this.l0.c.setAdapter(this.o0);
        final f8 r25 = this.n0;
        le1 r111 = v();
        int r112 = r25.h;
        rv2 r113 = r25.c;
        ArrayList r114 = r25.f;
        if (r114 == null) goto L59;
        k03 r26 = new k03(r114);
    L90:
        r26.e(v(), new d8(0, this));
        final int r27 = 1;
        this.l0.c.setOnTouchListener(new s7(1, this));
        this.l0.d.setOnClickListener(new c8(this, r27));
        return r6;
    L59:
        r25.g = new k03(new ArrayList());
        String r28 = r25.d;
        r28.getClass();
        switch(r28.hashCode()) {
            case -1245588193: goto L79;
            case -584328933: goto L75;
            case 909521647: goto L71;
            case 928429018: goto L67;
            case 1124239097: goto L63;
            default: goto L61;
        };
    L61:
        byte r29 = -1;
    L82:
        switch(r29) {
            case 0: goto L88;
            case 1: goto L87;
            case 2: goto L86;
            case 3: goto L85;
            case 4: goto L84;
            default: goto L89;
        };
    L84:
        r113.getClass();
        rv2.m("newest", r112, null, null).e(r111, new e8(r25, r110));
        goto L89
    L85:
        r113.getClass();
        final int r30 = 0;
        rv2.m("recent", r112, null, null).e(r111, new e8(r25, r30));
        goto L89
    L86:
        r113.getClass();
        r25.g = rv2.o(-1, false);
        goto L89
    L87:
        int r31 = Calendar.getInstance().get(1);
        Integer r32 = Integer.valueOf(r31);
        Integer r33 = Integer.valueOf(r31);
        r113.getClass();
        final int r34 = 3;
        rv2.m("byYear", r112, r32, r33).e(r111, new e8(r25, r34));
        goto L89
    L88:
        r113.getClass();
        final int r35 = 1;
        rv2.m("frequent", r112, null, null).e(r111, new e8(r25, r35));
    L89:
        r26 = r25.g;
        goto L90
    L63:
        if (r28.equals("ALBUM_RECENTLY_ADDED") == false) goto L96;
        r29 = 4;
        goto L82
    L96:
        r29 = -1;
        goto L82
    L67:
        if (r28.equals("ALBUM_RECENTLY_PLAYED") == false) goto L97;
        r29 = 3;
        goto L82
    L97:
        r29 = -1;
        goto L82
    L71:
        if (r28.equals("ALBUM_STARRED") == false) goto L98;
        r29 = 2;
        goto L82
    L98:
        r29 = -1;
        goto L82
    L75:
        if (r28.equals("ALBUM_NEW_RELEASES") == false) goto L99;
        r29 = 1;
        goto L82
    L99:
        r29 = -1;
        goto L82
    L79:
        if (r28.equals("ALBUM_MOST_PLAYED") == false) goto L100;
        r29 = 0;
        goto L82
    L100:
        r29 = -1;
        goto L82
    L30:
        if (r21.getString("ALBUM_MOST_PLAYED") == null) goto L33;
        this.n0.d = "ALBUM_MOST_PLAYED";
        this.l0.f.setText(R.string.album_list_page_most_played);
        goto L50
    L33:
        if (r21.getString("ALBUM_RECENTLY_ADDED") == null) goto L36;
        this.n0.d = "ALBUM_RECENTLY_ADDED";
        this.l0.f.setText(R.string.album_list_page_recently_added);
        goto L50
    L36:
        if (r21.getString("ALBUM_STARRED") == null) goto L39;
        this.n0.d = "ALBUM_STARRED";
        this.l0.f.setText(R.string.album_list_page_starred);
        goto L50
    L39:
        if (r21.getString("ALBUM_NEW_RELEASES") == null) goto L42;
        this.n0.d = "ALBUM_NEW_RELEASES";
        this.l0.f.setText(R.string.album_list_page_new_releases);
        goto L50
    L42:
        if (r21.getString("ALBUM_DOWNLOADED") == null) goto L45;
        this.n0.d = "ALBUM_DOWNLOADED";
        this.l0.f.setText(R.string.album_list_page_downloaded);
        goto L50
    L45:
        if (r21.getParcelable("ARTIST_OBJECT") == null) goto L48;
        this.n0.e = (ArtistID3) r21.getParcelable("ARTIST_OBJECT");
        f8 r36 = this.n0;
        r36.d = "ALBUM_FROM_ARTIST";
        this.l0.f.setText(r36.e.getName());
        goto L50
    L48:
        if (r21.getParcelableArrayList("ALBUMS_OBJECT") == null) goto L50;
        this.n0.f = r21.getParcelableArrayList("ALBUMS_OBJECT");
        this.n0.d = r21.getString("ALBUM_LIST_TITLE", "");
        this.l0.f.setText(this.n0.d);
        goto L50
    L92:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L94:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, r3, null);
    }
}
