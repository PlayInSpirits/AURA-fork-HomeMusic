package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kb4;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.ml3;
import defpackage.mq0;
import defpackage.nc1;
import defpackage.nq0;
import defpackage.nz2;
import defpackage.om0;
import defpackage.oq0;
import defpackage.qq0;
import defpackage.rq0;
import defpackage.sk2;
import defpackage.uo;
import defpackage.us0;
import defpackage.v23;
import defpackage.x7;
import defpackage.xc5;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DirectoryFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public rq0 n0;
    public zd0 o0;
    public bl2 p0;
    public om0 q0;
    public MenuItem r0;

    public DirectoryFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.directory_page_menu, r2);
        this.r0 = r2.getItem(0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r10, ViewGroup r11, Bundle r12) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r13 = r10.inflate(R.layout.fragment_directory, r11, false);
        int r14 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r13, R.id.app_bar_layout);
        if (r3 == null) goto L30;
        r14 = R.id.directory_back_image_view;
        Button r4 = (Button) uo.s(r13, R.id.directory_back_image_view);
        if (r4 == null) goto L30;
        r14 = R.id.directory_info_sector;
        ConstraintLayout r5 = (ConstraintLayout) uo.s(r13, R.id.directory_info_sector);
        if (r5 == null) goto L30;
        r14 = R.id.directory_recycler_view;
        RecyclerView r6 = (RecyclerView) uo.s(r13, R.id.directory_recycler_view);
        if (r6 == null) goto L30;
        r14 = R.id.directory_title_label;
        TextView r7 = (TextView) uo.s(r13, R.id.directory_title_label);
        if (r7 == null) goto L30;
        r14 = R.id.toolbar;
        MaterialToolbar r8 = (MaterialToolbar) uo.s(r13, R.id.toolbar);
        if (r8 == null) goto L30;
        LinearLayout r2 = (LinearLayout) r13;
        this.l0 = new ml3(r2, r3, r4, r5, r6, r7, r8);
        nc1 r15 = X();
        e75 r16 = r15.d();
        b75 r1 = gh0.r(r15);
        bq4 r9 = new bq4(r16, r1, b11.e(r15, r1));
        i30 r17 = kx3.a(rq0.class);
        String r18 = r17.b();
        if (r18 == null) goto L28;
        this.n0 = (rq0) r9.l(r17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r18));
        this.q0 = new om0(5);
        Bundle r19 = this.s;
        MainActivity r110 = this.m0;
        if (r19 != null) goto L23;
        if (r110 == null) goto L22;
        v23 r20 = r110.T;
        if (r20 == null) goto L22;
        r20.o();
    L22:
        return r2;
    L23:
        r110.o((MaterialToolbar) this.l0.f);
        final int r111 = 1;
        if (this.m0.n() == null) goto L26;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L26:
        ((MaterialToolbar) this.l0.f).setNavigationOnClickListener(new nq0(this, r0));
        ((Button) this.l0.b).setOnClickListener(new nq0(this, r111));
        RecyclerView r112 = (RecyclerView) this.l0.d;
        Z();
        r112.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.d).setHasFixedSize(true);
        zd0 r113 = new zd0(this);
        this.o0 = r113;
        ((RecyclerView) this.l0.d).setAdapter(r113);
        le1 r114 = v();
        zd0 r115 = this.o0;
        Objects.requireNonNull(r115);
        kb4.N(r114, new a0(23, r115));
        rq0 r116 = this.n0;
        String r117 = this.s.getString("MUSIC_DIRECTORY_ID");
        r116.c.getClass();
        om0.W(r117).e(v(), new d8(7, this));
        return r2;
    L28:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L30:
        nz2.n("Missing required view with ID: ".concat(r13.getResources().getResourceName(r14)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem r3) {
        int r1 = 0;
        if (r3.getItemId() != R.id.action_download_directory) goto L6;
        new us0(new qq0(this), r1).m0(this.m0.k(), null);
        return true;
    L6:
        return false;
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
        this.p0 = r7;
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r3) {
        bo2.o(this.p0, r3.getParcelableArrayList("TRACKS_OBJECT"), r3.getInt("ITEM_POSITION"));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicDirectoryClick(Bundle r3) {
        gb.x(a0()).m(R.id.directoryFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicDirectoryPlay(Bundle r10) {
        String r11 = r10.getString("MUSIC_DIRECTORY_ID");
        if (r11 == null) goto L6;
        Toast.makeText(Z(), s(R.string.folder_play_collecting), 0).show();
        ArrayList r5 = new ArrayList();
        AtomicInteger r6 = new AtomicInteger(0);
        mq0 r7 = new mq0(this, r5, 0);
        r6.incrementAndGet();
        this.q0.getClass();
        om0.W(r11).e(v(), new oq0(this, r5, r6, r7, 0));
        return;
    }
}
