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
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.cl3;
import defpackage.d8;
import defpackage.dl3;
import defpackage.e75;
import defpackage.ek1;
import defpackage.g7;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.q7;
import defpackage.rc1;
import defpackage.s7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.v23;
import defpackage.w7;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistCatalogueFragment extends kc1 implements ClickCallback {
    public rc1 l0;
    public MainActivity m0;
    public dl3 n0;
    public q7 o0;

    public PlaylistCatalogueFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.toolbar_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setOnQueryTextListener(new w7(this, r4, 3));
        r4.setPadding(-32, 0, 0, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.kc1
    public final View H(LayoutInflater r9, ViewGroup r10, Bundle r11) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r12 = r9.inflate(R.layout.fragment_playlist_catalogue, r10, false);
        int r13 = R.id.album_info_sector;
        ConstraintLayout r3 = (ConstraintLayout) uo.s(r12, R.id.album_info_sector);
        if (r3 == null) goto L44;
        r13 = R.id.app_bar_layout;
        AppBarLayout r4 = (AppBarLayout) uo.s(r12, R.id.app_bar_layout);
        if (r4 == null) goto L44;
        r13 = R.id.playlist_catalogue_recycler_view;
        RecyclerView r5 = (RecyclerView) uo.s(r12, R.id.playlist_catalogue_recycler_view);
        if (r5 == null) goto L44;
        r13 = R.id.playlist_list_sort_image_view;
        Button r6 = (Button) uo.s(r12, R.id.playlist_list_sort_image_view);
        if (r6 == null) goto L44;
        r13 = R.id.toolbar;
        MaterialToolbar r7 = (MaterialToolbar) uo.s(r12, R.id.toolbar);
        if (r7 == null) goto L44;
        LinearLayout r2 = (LinearLayout) r12;
        this.l0 = new rc1(r2, r3, r4, r5, r6, r7);
        nc1 r14 = X();
        e75 r15 = r14.d();
        b75 r1 = gh0.r(r14);
        bq4 r8 = new bq4(r15, r1, b11.e(r14, r1));
        i30 r16 = kx3.a(dl3.class);
        String r17 = r16.b();
        if (r17 == null) goto L42;
        this.n0 = (dl3) r8.l(r16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r17));
        Bundle r18 = this.s;
        if (r18 != null) goto L23;
        MainActivity r19 = this.m0;
        if (r19 == null) goto L21;
        v23 r20 = r19.T;
        if (r20 == null) goto L21;
        r20.o();
    L21:
        return r2;
    L23:
        if (r18.getString("ALL") == null) goto L26;
        this.n0.getClass();
    L28:
        this.m0.o(this.l0.e);
        final int r110 = 1;
        if (this.m0.n() == null) goto L31;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L31:
        this.l0.e.setNavigationOnClickListener(new cl3(this, r0));
        this.l0.b.a(new u7(8, this));
        RecyclerView r21 = this.l0.c;
        Context r111 = r21.getContext();
        ut4 r22 = ut4.c();
        if (r22.h == true) goto L34;
        r22.b(r111);
    L34:
        int r23 = r22.b;
        r21.setLayoutManager(new GridLayoutManager(r23));
        ut4 r24 = ut4.c();
        if (r24.h == true) goto L37;
        r24.b(r111);
    L37:
        r21.i(new ek1(r23, r24.c));
        r21.setHasFixedSize(true);
        int r112 = (int) (16.0f * r21.getResources().getDisplayMetrics().density);
        r21.setPaddingRelative(r112, r21.getPaddingTop(), r112, r21.getPaddingBottom());
        q7 r113 = new q7(this, true);
        r21.setAdapter(r113);
        this.o0 = r113;
        dl3 r25 = this.n0;
        le1 r114 = v();
        k03 r26 = r25.e;
        if (r26.d() != null) goto L40;
        r25.c.d(-1, false).e(r114, new g7(r26, 0));
    L40:
        this.l0.c.setOnTouchListener(new s7(6, this));
        this.l0.d.setOnClickListener(new cl3(this, r110));
        return r2;
    L26:
        if (r18.getString("DOWNLOADED") == null) goto L28;
        this.n0.getClass();
        goto L28
    L42:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L44:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        this.n0.f.e(v(), new d8(17, this));
    }

    public final void h0(View r2) {
        ((InputMethodManager) this.m0.getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r4) {
        r4.putBoolean("is_offline", false);
        gb.x(a0()).m(R.id.playlistPageFragment, r4, null);
        h0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistRowBottomSheetDialog, r3, null);
    }
}
