package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.aj2;
import defpackage.b03;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ey;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gp3;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om0;
import defpackage.on1;
import defpackage.oq0;
import defpackage.ov;
import defpackage.p6;
import defpackage.pn1;
import defpackage.pn4;
import defpackage.q8;
import defpackage.qm4;
import defpackage.qn1;
import defpackage.sk2;
import defpackage.tx1;
import defpackage.u7;
import defpackage.uo;
import defpackage.ux3;
import defpackage.wx1;
import defpackage.x;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class IndexFragment extends kc1 implements ClickCallback {
    public ey l0;
    public MainActivity m0;
    public wx1 n0;
    public b03 o0;
    public bl2 p0;
    public om0 q0;
    public MusicFolder r0;
    public List s0;

    public IndexFragment() {
        this.s0 = new ArrayList();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r12, ViewGroup r13, Bundle r14) {
        this.m0 = (MainActivity) l();
        int r0 = 0;
        View r15 = r12.inflate(R.layout.fragment_index, r13, false);
        int r16 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r15, R.id.app_bar_layout);
        if (r3 == null) goto L42;
        r16 = R.id.fast_scrollbar;
        FastScrollbar r4 = (FastScrollbar) uo.s(r15, R.id.fast_scrollbar);
        if (r4 == null) goto L42;
        r16 = R.id.hm_index_search;
        TextInputEditText r5 = (TextInputEditText) uo.s(r15, R.id.hm_index_search);
        if (r5 == null) goto L42;
        r16 = R.id.hm_index_search_empty;
        TextView r6 = (TextView) uo.s(r15, R.id.hm_index_search_empty);
        if (r6 == null) goto L42;
        r16 = R.id.hm_index_search_layout;
        if (((TextInputLayout) uo.s(r15, R.id.hm_index_search_layout)) == null) goto L42;
        r16 = R.id.index_info_sector;
        ConstraintLayout r7 = (ConstraintLayout) uo.s(r15, R.id.index_info_sector);
        if (r7 == null) goto L42;
        r16 = R.id.index_recycler_view;
        RecyclerView r8 = (RecyclerView) uo.s(r15, R.id.index_recycler_view);
        if (r8 == null) goto L42;
        r16 = R.id.index_title_label;
        TextView r9 = (TextView) uo.s(r15, R.id.index_title_label);
        if (r9 == null) goto L42;
        r16 = R.id.toolbar;
        MaterialToolbar r10 = (MaterialToolbar) uo.s(r15, R.id.toolbar);
        if (r10 == null) goto L42;
        LinearLayout r2 = (LinearLayout) r15;
        this.l0 = new ey(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        nc1 r17 = X();
        e75 r18 = r17.d();
        b75 r1 = gh0.r(r17);
        bq4 r11 = new bq4(r18, r1, b11.e(r17, r1));
        i30 r19 = kx3.a(wx1.class);
        String r110 = r19.b();
        if (r110 == null) goto L40;
        this.n0 = (wx1) r11.l(r19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r110));
        this.q0 = new om0(5);
        Bundle r111 = this.s;
        if (r111 == null) goto L25;
        MusicFolder r112 = (MusicFolder) r111.getParcelable("MUSIC_FOLDER_OBJECT");
    L26:
        this.r0 = r112;
        this.m0.o((MaterialToolbar) this.l0.h);
        if (this.m0.n() == null) goto L29;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L29:
        ((MaterialToolbar) this.l0.h).setNavigationOnClickListener(new p6(21, this));
        ((AppBarLayout) this.l0.a).a(new u7(6, this));
        RecyclerView r113 = (RecyclerView) this.l0.f;
        Z();
        r113.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.f).setHasFixedSize(true);
        b03 r114 = new b03(this);
        this.o0 = r114;
        ((RecyclerView) this.l0.f).setAdapter(r114);
        wx1 r115 = this.n0;
        MusicFolder r20 = this.r0;
        if (r20 == null) goto L32;
        String r21 = r20.getId();
    L33:
        r115.c.getClass();
        k03 r116 = new k03();
        gp3 r22 = App.f(false).c();
        r22.getClass();
        Log.d("BrowsingClient", "getIndexes()");
        ((ov) r22.p).b(((pn4) r22.o).f(), r21, null).enqueue(new q8(r116, 2));
        r116.e(v(), new d8(13, this));
        TextInputEditText r117 = (TextInputEditText) this.l0.c;
        x r118 = new x(18, this);
        ux3 r23 = qn1.a;
        r117.addTextChangedListener(new pn1(r0, r118));
        r117.setOnEditorActionListener(new on1());
        ey r119 = this.l0;
        ((FastScrollbar) r119.b).setRecyclerView((RecyclerView) r119.f);
        FastScrollbar r120 = (FastScrollbar) this.l0.b;
        LayoutInflater.from(r120.getContext()).inflate(R.layout.layout_fast_scrollbar, r120, true);
        TextView r121 = (TextView) r120.findViewById(R.id.fastscroller_bubble);
        r120.n = r121;
        if (r121 == null) goto L36;
        r121.setVisibility(4);
    L36:
        r120.o = r120.findViewById(R.id.fastscroller_handle);
        MusicFolder r122 = this.r0;
        if (r122 == null) goto L39;
        this.n0.d = r122;
        ((TextView) this.l0.g).setText(r122.getName());
    L39:
        return r2;
    L32:
        r21 = null;
        goto L33
    L25:
        r112 = null;
        goto L26
    L40:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L42:
        nz2.n("Missing required view with ID: ".concat(r15.getResources().getResourceName(r16)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
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
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void h0() {
        ey r0 = this.l0;
        if (r0 != null) goto L6;
        return;
    L6:
        if (((TextInputEditText) r0.c).getText() == null) goto L8;
        String r1 = ((TextInputEditText) this.l0.c).getText().toString();
    L9:
        b03 r2 = this.o0;
        List r3 = this.s0;
        TextView r9 = (TextView) this.l0.d;
        ux3 r4 = qn1.a;
        r3.getClass();
        r1.getClass();
        if (qm4.u0(r1) == false) goto L12;
        ?? r5 = r3;
    L22:
        if (r5.isEmpty() == true) goto L24;
    L28:
        int r6 = 8;
    L29:
        r9.setVisibility(r6);
        r2.r = r5;
        r2.d();
        return;
    L24:
        if (qm4.u0(r1) == true) goto L28;
        if (r3.isEmpty() == true) goto L28;
        r6 = 0;
        goto L29
    L12:
        r5 = new ArrayList();
        Iterator r7 = r3.iterator();
    L14:
        if (r7.hasNext() == false) goto L22;
        Object r8 = r7.next();
        ux3 r10 = qn1.a;
        String r11 = ((Artist) r8).getName();
        if (r11 != null) goto L19;
        r11 = "";
    L19:
        if (qn1.a(r11, r1) == false) goto L14;
        r5.add(r8);
        goto L14
    L8:
        r1 = "";
        goto L9
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicIndexClick(Bundle r3) {
        gb.x(a0()).m(R.id.directoryFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicIndexPlay(Bundle r10) {
        String r11 = r10.getString("MUSIC_DIRECTORY_ID");
        if (r11 == null) goto L6;
        Toast.makeText(Z(), s(R.string.folder_play_collecting), 0).show();
        ArrayList r5 = new ArrayList();
        AtomicInteger r6 = new AtomicInteger(0);
        tx1 r7 = new tx1(this, r5, 0);
        r6.incrementAndGet();
        this.q0.getClass();
        om0.W(r11).e(v(), new oq0(this, r5, r6, r7, 1));
        return;
    }
}
