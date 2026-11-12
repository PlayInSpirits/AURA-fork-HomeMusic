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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PodcastChannelPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bn3;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e03;
import defpackage.e75;
import defpackage.en3;
import defpackage.f35;
import defpackage.fi0;
import defpackage.g12;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gq0;
import defpackage.hh3;
import defpackage.hn3;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.pn4;
import defpackage.pz1;
import defpackage.qg4;
import defpackage.sk2;
import defpackage.u52;
import defpackage.uo;
import defpackage.v23;
import defpackage.wo0;
import defpackage.ws1;
import defpackage.x7;
import defpackage.xc5;
import defpackage.z40;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastChannelPageFragment extends kc1 implements ClickCallback {
    public z40 l0;
    public MainActivity m0;
    public bn3 n0;
    public en3 o0;
    public bl2 p0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_podcast_channel_page, viewGroup, false);
        int i2 = R.id.app_bar_layout;
        if (((AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i2 = R.id.podcast_channel_description_label;
            if (((TextView) uo.s(viewInflate, R.id.podcast_channel_description_label)) != null) {
                i2 = R.id.podcast_channel_description_text_view;
                TextView textView = (TextView) uo.s(viewInflate, R.id.podcast_channel_description_text_view);
                if (textView != null) {
                    i2 = R.id.podcast_channel_page_info_sector;
                    if (((ConstraintLayout) uo.s(viewInflate, R.id.podcast_channel_page_info_sector)) != null) {
                        i2 = R.id.podcast_episodes_filter_image_view;
                        Button button = (Button) uo.s(viewInflate, R.id.podcast_episodes_filter_image_view);
                        if (button != null) {
                            i2 = R.id.podcast_episodes_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.podcast_episodes_recycler_view);
                            if (recyclerView != null) {
                                i2 = R.id.podcast_episodes_section_label;
                                if (((TextView) uo.s(viewInflate, R.id.podcast_episodes_section_label)) != null) {
                                    i2 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i2 = R.id.upper_button_divider;
                                        View viewS = uo.s(viewInflate, R.id.upper_button_divider);
                                        if (viewS != null) {
                                            this.l0 = new z40(linearLayout, textView, button, recyclerView, materialToolbar, viewS);
                                            nc1 nc1VarX = X();
                                            e75 e75VarD = nc1VarX.d();
                                            b75 b75VarR = gh0.r(nc1VarX);
                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                            i30 i30VarA = kx3.a(bn3.class);
                                            String strB = i30VarA.b();
                                            if (strB == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.n0 = (bn3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                            Bundle bundle2 = this.s;
                                            PodcastChannel podcastChannel = bundle2 != null ? (PodcastChannel) bundle2.getParcelable("PODCAST_CHANNEL_OBJECT") : null;
                                            if (podcastChannel == null) {
                                                MainActivity mainActivity = this.m0;
                                                if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                                    v23Var.o();
                                                }
                                                return linearLayout;
                                            }
                                            this.n0.d = podcastChannel;
                                            this.m0.o((MaterialToolbar) this.l0.q);
                                            final int i3 = 1;
                                            if (this.m0.n() != null) {
                                                this.m0.n().f0(true);
                                                this.m0.n().g0();
                                            }
                                            ((MaterialToolbar) this.l0.q).setTitle(this.n0.d.getTitle());
                                            ((MaterialToolbar) this.l0.q).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: an3
                                                public final /* synthetic */ PodcastChannelPageFragment o;

                                                {
                                                    this.o = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i4 = i3;
                                                    PodcastChannelPageFragment podcastChannelPageFragment = this.o;
                                                    switch (i4) {
                                                        case 0:
                                                            PopupMenu popupMenu = new PopupMenu(podcastChannelPageFragment.Z(), view);
                                                            popupMenu.getMenuInflater().inflate(R.menu.filter_podcast_episode_popup_menu, popupMenu.getMenu());
                                                            popupMenu.setOnMenuItemClickListener(new v7(8, podcastChannelPageFragment));
                                                            popupMenu.show();
                                                            break;
                                                        default:
                                                            podcastChannelPageFragment.m0.T.o();
                                                            break;
                                                    }
                                                }
                                            });
                                            ((MaterialToolbar) this.l0.q).setTitle(this.n0.d.getTitle());
                                            String strC = e03.c(this.n0.d.getDescription());
                                            z40 z40Var = this.l0;
                                            if (z40Var != null) {
                                                ((TextView) z40Var.n).setVisibility(!strC.trim().isEmpty() ? 0 : 8);
                                                ((TextView) this.l0.n).setText(strC);
                                                ((Button) this.l0.o).setOnClickListener(new View.OnClickListener(this) { // from class: an3
                                                    public final /* synthetic */ PodcastChannelPageFragment o;

                                                    {
                                                        this.o = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i4 = i;
                                                        PodcastChannelPageFragment podcastChannelPageFragment = this.o;
                                                        switch (i4) {
                                                            case 0:
                                                                PopupMenu popupMenu = new PopupMenu(podcastChannelPageFragment.Z(), view);
                                                                popupMenu.getMenuInflater().inflate(R.menu.filter_podcast_episode_popup_menu, popupMenu.getMenu());
                                                                popupMenu.setOnMenuItemClickListener(new v7(8, podcastChannelPageFragment));
                                                                popupMenu.show();
                                                                break;
                                                            default:
                                                                podcastChannelPageFragment.m0.T.o();
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            RecyclerView recyclerView2 = (RecyclerView) this.l0.p;
                                            Z();
                                            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                            ((RecyclerView) this.l0.p).i(g12.v(Z()));
                                            en3 en3Var = new en3(this);
                                            this.o0 = en3Var;
                                            ((RecyclerView) this.l0.p).setAdapter(en3Var);
                                            bn3 bn3Var = this.n0;
                                            hh3 hh3Var = bn3Var.c;
                                            String id = bn3Var.d.getId();
                                            hh3Var.getClass();
                                            hh3.l(id, true).e(v(), new d8(23, this));
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
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
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.p0 = bl2Var;
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeAltClick(Bundle bundle) {
        PodcastEpisode podcastEpisode = (PodcastEpisode) bundle.getParcelable("PODCAST_OBJECT");
        bn3 bn3Var = this.n0;
        bn3Var.getClass();
        if (podcastEpisode != null && podcastEpisode.getId() != null) {
            hh3 hh3Var = bn3Var.c;
            String id = podcastEpisode.getId();
            hh3Var.getClass();
            wo0 wo0VarH = App.f(false).h();
            wo0VarH.getClass();
            Log.d("PodcastClient", "downloadPodcastEpisode()");
            ((hn3) wo0VarH.o).b(((pn4) wo0VarH.n).f(), id).enqueue(new pz1(14, podcastEpisode));
        }
        View viewA0 = a0();
        int[] iArr = qg4.E;
        qg4 qg4VarH = qg4.h(viewA0, viewA0.getResources().getText(R.string.podcast_episode_download_request_snackbar), -1);
        qg4VarH.e(this.m0.u());
        qg4VarH.j();
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeClick(Bundle bundle) {
        bl2 bl2Var = this.p0;
        PodcastEpisode podcastEpisode = (PodcastEpisode) bundle.getParcelable("PODCAST_OBJECT");
        WeakReference weakReference = bo2.a;
        if (u52.c().a) {
            u52.h(R.string.lan_music_only);
        } else if (bl2Var != null) {
            bl2Var.f(new ws1(17, bl2Var, podcastEpisode), gq0.n);
        }
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.podcastEpisodeBottomSheetDialog, bundle, null);
    }
}
