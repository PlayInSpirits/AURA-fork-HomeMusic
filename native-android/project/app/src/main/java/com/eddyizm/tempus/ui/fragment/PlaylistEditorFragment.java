package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b75;
import defpackage.bj3;
import defpackage.bq4;
import defpackage.e75;
import defpackage.f22;
import defpackage.gh0;
import defpackage.i30;
import defpackage.jv3;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nz2;
import defpackage.q05;
import defpackage.qg4;
import defpackage.ss2;
import defpackage.tf0;
import defpackage.tl3;
import defpackage.uo;
import defpackage.vl3;
import defpackage.wl3;
import defpackage.zd0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistEditorFragment extends kc1 {
    public jv3 l0;
    public wl3 m0;
    public zd0 n0;
    public f22 o0;
    public qg4 p0;

    public PlaylistEditorFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r4, ViewGroup r5, Bundle r6) {
        final int r0 = 0;
        View r7 = r4.inflate(R.layout.fragment_playlist_editor, r5, false);
        int r8 = R.id.playlist_song_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r7, R.id.playlist_song_recycler_view);
        if (r9 == null) goto L22;
        r8 = R.id.toolbar;
        MaterialToolbar r2 = (MaterialToolbar) uo.s(r7, R.id.toolbar);
        if (r2 == null) goto L22;
        this.l0 = new jv3((LinearLayout) r7, r9, r2);
        e75 r10 = d();
        b75 r11 = gh0.r(this);
        tf0 r12 = gh0.q(this);
        r11.getClass();
        r12.getClass();
        bq4 r3 = new bq4(r10, r11, r12);
        i30 r13 = kx3.a(wl3.class);
        String r14 = r13.b();
        if (r14 == null) goto L20;
        this.m0 = (wl3) r3.l(r13, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r14));
        Bundle r15 = this.s;
        if (r15 == null) goto L11;
        Playlist r16 = (Playlist) r15.getParcelable("PLAYLIST_OBJECT");
    L12:
        if (r16 != null) goto L15;
        q05.l(this).o();
        return (LinearLayout) this.l0.n;
    L15:
        wl3 r17 = this.m0;
        if (r17.f != null) goto L18;
        r17.e = null;
        r17.c(r16);
    L18:
        ((MaterialToolbar) this.l0.p).setNavigationOnClickListener(new bj3(7, this));
        final int r18 = 1;
        ((MaterialToolbar) this.l0.p).getMenu().findItem(R.id.action_save_playlist).setEnabled(!this.m0.i);
        ((MaterialToolbar) this.l0.p).setOnMenuItemClickListener(new ss2(8, this));
        RecyclerView r19 = (RecyclerView) this.l0.o;
        Z();
        r19.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.o).setHasFixedSize(true);
        zd0 r20 = new zd0(this);
        this.n0 = r20;
        ((RecyclerView) this.l0.o).setAdapter(r20);
        this.m0.g.e(v(), new tl3(this, r18));
        f22 r21 = new f22(new vl3(this));
        this.o0 = r21;
        r21.i((RecyclerView) this.l0.o);
        this.m0.h.e(v(), new tl3(this, r0));
        return (LinearLayout) this.l0.n;
    L11:
        r16 = null;
        goto L12
    L20:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L22:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(r8)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        qg4 r0 = this.p0;
        if (r0 == null) goto L5;
        r0.a(3);
    L5:
        this.p0 = null;
        this.l0 = null;
        this.n0 = null;
        this.o0 = null;
    }
}
