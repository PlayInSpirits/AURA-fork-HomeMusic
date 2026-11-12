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
import android.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ej;
import defpackage.ek1;
import defpackage.fj;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gj;
import defpackage.hj;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.rc1;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistCatalogueFragment extends kc1 implements ClickCallback {
    public rc1 l0;
    public MainActivity m0;
    public hj n0;
    public ej o0;
    public int p0;
    public int q0;

    public ArtistCatalogueFragment() {
        this.p0 = 2;
        this.q0 = 20;
    }

    public static void h0(ArtistCatalogueFragment r4, String r5) {
        List r0 = (List) r4.n0.c.d();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L31;
        if (r5 != null) goto L9;
    L21:
        ej r6 = r4.o0;
        r6.r = r0;
        r6.s = new ArrayList(r0);
        r6.d();
        return;
    L9:
        if (r5.trim().isEmpty() == true) goto L21;
        String r7 = r5.toLowerCase().trim();
        ArrayList r1 = new ArrayList();
        Iterator r2 = r0.iterator();
    L13:
        if (r2.hasNext() == false) goto L19;
        ArtistID3 r3 = (ArtistID3) r2.next();
        if (r3.getName() == null) goto L13;
        if (r3.getName().toLowerCase().contains(r7) == false) goto L13;
        r1.add(r3);
        goto L13
    L19:
        ej r8 = r4.o0;
        r8.r = r1;
        r8.s = new ArrayList(r1);
        r8.d();
        return;
    }

    @Override // defpackage.kc1
    public final void F(Bundle r4) {
        super.F(r4);
        d0();
        nc1 r5 = X();
        e75 r0 = r5.d();
        b75 r1 = gh0.r(r5);
        bq4 r2 = new bq4(r0, r1, b11.e(r5, r1));
        i30 r6 = kx3.a(hj.class);
        String r3 = r6.b();
        if (r3 == null) goto L6;
        hj r7 = (hj) r2.l(r6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r3));
        this.n0 = r7;
        App.f(false).c().j().enqueue(new zh0(7, r7));
        return;
    L6:
        kf2.n("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.toolbar_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setQueryHint(s(R.string.filter_artist));
        r4.setOnQueryTextListener(new gj(this));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r9, ViewGroup r10, Bundle r11) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r12 = r9.inflate(R.layout.fragment_artist_catalogue, r10, false);
        int r13 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r12, R.id.app_bar_layout);
        if (r3 == null) goto L23;
        r13 = R.id.artist_catalogue_recycler_view;
        RecyclerView r4 = (RecyclerView) uo.s(r12, R.id.artist_catalogue_recycler_view);
        if (r4 == null) goto L23;
        r13 = R.id.artist_info_sector;
        ConstraintLayout r5 = (ConstraintLayout) uo.s(r12, R.id.artist_info_sector);
        if (r5 == null) goto L23;
        r13 = R.id.artist_list_sort_image_view;
        Button r6 = (Button) uo.s(r12, R.id.artist_list_sort_image_view);
        if (r6 == null) goto L23;
        r13 = R.id.toolbar;
        MaterialToolbar r7 = (MaterialToolbar) uo.s(r12, R.id.toolbar);
        if (r7 == null) goto L23;
        LinearLayout r2 = (LinearLayout) r12;
        this.l0 = new rc1(r2, r3, r4, r5, r6, r7);
        ut4.c().b(Z());
        ut4 r14 = ut4.c();
        Context r15 = Z();
        if (r14.h == true) goto L15;
        r14.b(r15);
    L15:
        this.p0 = r14.b;
        ut4 r16 = ut4.c();
        Context r17 = Z();
        if (r16.h == true) goto L18;
        r16.b(r17);
    L18:
        this.q0 = r16.c;
        this.m0.o(this.l0.e);
        final int r18 = 1;
        if (this.m0.n() == null) goto L21;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L21:
        this.l0.e.setNavigationOnClickListener(new fj(this, r18));
        int r1 = 2;
        this.l0.b.a(new u7(r1, this));
        RecyclerView r19 = this.l0.c;
        Z();
        r19.setLayoutManager(new GridLayoutManager(this.p0));
        this.l0.c.i(new ek1(this.p0, this.q0));
        this.l0.c.setHasFixedSize(true);
        ej r20 = new ej(this);
        this.o0 = r20;
        r20.p = 2;
        r20.n.g();
        this.l0.c.setAdapter(this.o0);
        this.n0.c.e(v(), new d8(4, this));
        this.l0.c.setOnTouchListener(new s7(r1, this));
        this.l0.d.setOnClickListener(new fj(this, r0));
        return r2;
    L23:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void i0(View r2) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r4) {
        gb.x(a0()).m(R.id.artistPageFragment, r4, null);
        i0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, r3, null);
    }
}
