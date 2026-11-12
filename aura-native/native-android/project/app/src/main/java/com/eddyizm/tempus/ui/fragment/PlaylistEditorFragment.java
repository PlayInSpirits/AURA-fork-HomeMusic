package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
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
import defpackage.uo;
import defpackage.vl3;
import defpackage.wl3;
import defpackage.zd0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistEditorFragment extends kc1 {
    public jv3 l0;
    public wl3 m0;
    public zd0 n0;
    public f22 o0;
    public qg4 p0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_playlist_editor, viewGroup, false);
        int i2 = R.id.playlist_song_recycler_view;
        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.playlist_song_recycler_view);
        if (recyclerView != null) {
            i2 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
            if (materialToolbar != null) {
                this.l0 = new jv3((LinearLayout) viewInflate, recyclerView, materialToolbar);
                e75 e75VarD = d();
                b75 b75VarR = gh0.r(this);
                tf0 tf0VarQ = gh0.q(this);
                b75VarR.getClass();
                tf0VarQ.getClass();
                bq4 bq4Var = new bq4(e75VarD, b75VarR, tf0VarQ);
                i30 i30VarA = kx3.a(wl3.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.m0 = (wl3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                Bundle bundle2 = this.s;
                Playlist playlist = bundle2 != null ? (Playlist) bundle2.getParcelable("PLAYLIST_OBJECT") : null;
                if (playlist == null) {
                    q05.l(this).o();
                    return (LinearLayout) this.l0.n;
                }
                wl3 wl3Var = this.m0;
                if (wl3Var.f == null) {
                    wl3Var.e = null;
                    wl3Var.c(playlist);
                }
                ((MaterialToolbar) this.l0.p).setNavigationOnClickListener(new bj3(7, this));
                final int i3 = 1;
                ((MaterialToolbar) this.l0.p).getMenu().findItem(R.id.action_save_playlist).setEnabled(!this.m0.i);
                ((MaterialToolbar) this.l0.p).setOnMenuItemClickListener(new ss2(8, this));
                RecyclerView recyclerView2 = (RecyclerView) this.l0.o;
                Z();
                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                ((RecyclerView) this.l0.o).setHasFixedSize(true);
                zd0 zd0Var = new zd0(this);
                this.n0 = zd0Var;
                ((RecyclerView) this.l0.o).setAdapter(zd0Var);
                this.m0.g.e(v(), new a83(this) { // from class: tl3
                    public final /* synthetic */ PlaylistEditorFragment b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i4 = i3;
                        PlaylistEditorFragment playlistEditorFragment = this.b;
                        switch (i4) {
                            case 0:
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    playlistEditorFragment.m0.h.k(null);
                                    Toast.makeText(playlistEditorFragment.Z(), num.intValue(), 0).show();
                                    playlistEditorFragment.m0.i = false;
                                    ((MaterialToolbar) playlistEditorFragment.l0.p).getMenu().findItem(R.id.action_save_playlist).setEnabled(true);
                                    if (num.intValue() == R.string.playlist_editor_dialog_action_save_success) {
                                        q05.l(playlistEditorFragment).o();
                                    }
                                    break;
                                }
                                break;
                            default:
                                List list = (List) obj;
                                if (list == null) {
                                    Toast.makeText(playlistEditorFragment.Z(), R.string.playlist_editor_load_failure, 0).show();
                                    q05.l(playlistEditorFragment).o();
                                } else {
                                    zd0 zd0Var2 = playlistEditorFragment.n0;
                                    zd0Var2.r = list;
                                    zd0Var2.d();
                                }
                                break;
                        }
                    }
                });
                f22 f22Var = new f22(new vl3(this));
                this.o0 = f22Var;
                f22Var.i((RecyclerView) this.l0.o);
                this.m0.h.e(v(), new a83(this) { // from class: tl3
                    public final /* synthetic */ PlaylistEditorFragment b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i4 = i;
                        PlaylistEditorFragment playlistEditorFragment = this.b;
                        switch (i4) {
                            case 0:
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    playlistEditorFragment.m0.h.k(null);
                                    Toast.makeText(playlistEditorFragment.Z(), num.intValue(), 0).show();
                                    playlistEditorFragment.m0.i = false;
                                    ((MaterialToolbar) playlistEditorFragment.l0.p).getMenu().findItem(R.id.action_save_playlist).setEnabled(true);
                                    if (num.intValue() == R.string.playlist_editor_dialog_action_save_success) {
                                        q05.l(playlistEditorFragment).o();
                                    }
                                    break;
                                }
                                break;
                            default:
                                List list = (List) obj;
                                if (list == null) {
                                    Toast.makeText(playlistEditorFragment.Z(), R.string.playlist_editor_load_failure, 0).show();
                                    q05.l(playlistEditorFragment).o();
                                } else {
                                    zd0 zd0Var2 = playlistEditorFragment.n0;
                                    zd0Var2.r = list;
                                    zd0Var2.d();
                                }
                                break;
                        }
                    }
                });
                return (LinearLayout) this.l0.n;
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        qg4 qg4Var = this.p0;
        if (qg4Var != null) {
            qg4Var.a(3);
        }
        this.p0 = null;
        this.l0 = null;
        this.n0 = null;
        this.o0 = null;
    }
}
