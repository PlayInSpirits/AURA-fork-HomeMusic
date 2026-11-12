package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.interfaces.PodcastCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gp1 extends kc1 implements ClickCallback, PodcastCallback {
    public up0 l0;
    public MainActivity m0;
    public jn3 n0;
    public en3 o0;
    public zd0 p0;
    public bl2 q0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home_tab_podcast, viewGroup, false);
        int i = R.id.empty_description_image_view;
        if (((ImageView) uo.s(viewInflate, R.id.empty_description_image_view)) != null) {
            i = R.id.empty_podcast_layout;
            LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.empty_podcast_layout);
            if (linearLayout != null) {
                i = R.id.hide_section_button;
                TextView textView = (TextView) uo.s(viewInflate, R.id.hide_section_button);
                if (textView != null) {
                    i = R.id.home_newest_podcasts_sector;
                    LinearLayout linearLayout2 = (LinearLayout) uo.s(viewInflate, R.id.home_newest_podcasts_sector);
                    if (linearLayout2 != null) {
                        i = R.id.home_podcast_channels_sector;
                        LinearLayout linearLayout3 = (LinearLayout) uo.s(viewInflate, R.id.home_podcast_channels_sector);
                        if (linearLayout3 != null) {
                            i = R.id.home_podcast_sector;
                            if (((NestedScrollView) uo.s(viewInflate, R.id.home_podcast_sector)) != null) {
                                i = R.id.newest_podcasts_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.newest_podcasts_recycler_view);
                                if (recyclerView != null) {
                                    i = R.id.podcast_channels_pre_text_view;
                                    TextView textView2 = (TextView) uo.s(viewInflate, R.id.podcast_channels_pre_text_view);
                                    if (textView2 != null) {
                                        i = R.id.podcast_channels_recycler_view;
                                        RecyclerView recyclerView2 = (RecyclerView) uo.s(viewInflate, R.id.podcast_channels_recycler_view);
                                        if (recyclerView2 != null) {
                                            i = R.id.podcast_channels_text_view_clickable;
                                            TextView textView3 = (TextView) uo.s(viewInflate, R.id.podcast_channels_text_view_clickable);
                                            if (textView3 != null) {
                                                i = R.id.subtitle_empty_description_label;
                                                if (((TextView) uo.s(viewInflate, R.id.subtitle_empty_description_label)) != null) {
                                                    i = R.id.title_empty_description_label;
                                                    if (((TextView) uo.s(viewInflate, R.id.title_empty_description_label)) != null) {
                                                        i = R.id.upper_button_divider;
                                                        View viewS = uo.s(viewInflate, R.id.upper_button_divider);
                                                        if (viewS != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            this.l0 = new up0(constraintLayout, linearLayout, textView, linearLayout2, linearLayout3, recyclerView, textView2, recyclerView2, textView3, viewS);
                                                            nc1 nc1VarX = X();
                                                            e75 e75VarD = nc1VarX.d();
                                                            b75 b75VarR = gh0.r(nc1VarX);
                                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                            i30 i30VarA = kx3.a(jn3.class);
                                                            String strB = i30VarA.b();
                                                            if (strB != null) {
                                                                this.n0 = (jn3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                return constraintLayout;
                                                            }
                                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                                            return null;
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
        this.q0 = bl2Var;
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        final int i = 0;
        ((TextView) this.l0.f).setOnClickListener(new View.OnClickListener(this) { // from class: dp1
            public final /* synthetic */ gp1 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                gp1 gp1Var = this.o;
                switch (i2) {
                    case 0:
                        new sl3(1, gp1Var).m0(gp1Var.m0.k(), null);
                        break;
                    default:
                        gp1Var.m0.T.m(R.id.action_homeFragment_to_podcastChannelCatalogueFragment, null, null);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((TextView) this.l0.h).setOnClickListener(new View.OnClickListener(this) { // from class: dp1
            public final /* synthetic */ gp1 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                gp1 gp1Var = this.o;
                switch (i3) {
                    case 0:
                        new sl3(1, gp1Var).m0(gp1Var.m0.k(), null);
                        break;
                    default:
                        gp1Var.m0.T.m(R.id.action_homeFragment_to_podcastChannelCatalogueFragment, null, null);
                        break;
                }
            }
        });
        ((TextView) this.l0.c).setOnClickListener(new ep1(0));
        jn3 jn3Var = this.n0;
        le1 le1VarV = v();
        k03 k03Var = jn3Var.e;
        if (k03Var.d() == null) {
            jn3Var.c.getClass();
            hh3.l(null, false).e(le1VarV, new g7(k03Var, 0));
        }
        k03Var.e(v(), new a83(this) { // from class: fp1
            public final /* synthetic */ gp1 b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i3 = i;
                gp1 gp1Var = this.b;
                List list = (List) obj;
                switch (i3) {
                    case 0:
                        up0 up0Var = gp1Var.l0;
                        if (list != null) {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(!list.isEmpty() ? 0 : 8);
                            }
                            up0 up0Var2 = gp1Var.l0;
                            if (up0Var2 != null) {
                                ((LinearLayout) up0Var2.a).setVisibility(list.isEmpty() ? 0 : 8);
                            }
                        } else {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(8);
                            }
                            up0 up0Var3 = gp1Var.l0;
                            if (up0Var3 != null) {
                                ((LinearLayout) up0Var3.a).setVisibility(8);
                            }
                        }
                        break;
                    case 1:
                        up0 up0Var4 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var4 != null) {
                                ((LinearLayout) up0Var4.d).setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var = gp1Var.p0;
                            zd0Var.r = list;
                            zd0Var.d();
                        } else if (up0Var4 != null) {
                            ((LinearLayout) up0Var4.d).setVisibility(8);
                        }
                        break;
                    default:
                        up0 up0Var5 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var5 != null) {
                                up0Var5.b.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            gp1Var.o0.p((List) list.stream().filter(new c7(14)).collect(Collectors.toList()));
                        } else if (up0Var5 != null) {
                            up0Var5.b.setVisibility(8);
                        }
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.l0.e;
        Z();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.e).i(g12.v(Z()));
        en3 en3Var = new en3(this);
        this.o0 = en3Var;
        ((RecyclerView) this.l0.e).setAdapter(en3Var);
        jn3 jn3Var2 = this.n0;
        le1 le1VarV2 = v();
        k03 k03Var2 = jn3Var2.d;
        if (k03Var2.d() == null) {
            jn3Var2.c.getClass();
            hh3.k().e(le1VarV2, new g7(k03Var2, 0));
        }
        final int i3 = 2;
        k03Var2.e(v(), new a83(this) { // from class: fp1
            public final /* synthetic */ gp1 b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i3;
                gp1 gp1Var = this.b;
                List list = (List) obj;
                switch (i4) {
                    case 0:
                        up0 up0Var = gp1Var.l0;
                        if (list != null) {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(!list.isEmpty() ? 0 : 8);
                            }
                            up0 up0Var2 = gp1Var.l0;
                            if (up0Var2 != null) {
                                ((LinearLayout) up0Var2.a).setVisibility(list.isEmpty() ? 0 : 8);
                            }
                        } else {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(8);
                            }
                            up0 up0Var3 = gp1Var.l0;
                            if (up0Var3 != null) {
                                ((LinearLayout) up0Var3.a).setVisibility(8);
                            }
                        }
                        break;
                    case 1:
                        up0 up0Var4 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var4 != null) {
                                ((LinearLayout) up0Var4.d).setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var = gp1Var.p0;
                            zd0Var.r = list;
                            zd0Var.d();
                        } else if (up0Var4 != null) {
                            ((LinearLayout) up0Var4.d).setVisibility(8);
                        }
                        break;
                    default:
                        up0 up0Var5 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var5 != null) {
                                up0Var5.b.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            gp1Var.o0.p((List) list.stream().filter(new c7(14)).collect(Collectors.toList()));
                        } else if (up0Var5 != null) {
                            up0Var5.b.setVisibility(8);
                        }
                        break;
                }
            }
        });
        RecyclerView recyclerView2 = (RecyclerView) this.l0.g;
        Z();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        zd0 zd0Var = new zd0(this);
        this.p0 = zd0Var;
        ((RecyclerView) this.l0.g).setAdapter(zd0Var);
        jn3 jn3Var3 = this.n0;
        le1 le1VarV3 = v();
        k03 k03Var3 = jn3Var3.e;
        if (k03Var3.d() == null) {
            jn3Var3.c.getClass();
            hh3.l(null, false).e(le1VarV3, new g7(k03Var3, 0));
        }
        k03Var3.e(v(), new a83(this) { // from class: fp1
            public final /* synthetic */ gp1 b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i2;
                gp1 gp1Var = this.b;
                List list = (List) obj;
                switch (i4) {
                    case 0:
                        up0 up0Var = gp1Var.l0;
                        if (list != null) {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(!list.isEmpty() ? 0 : 8);
                            }
                            up0 up0Var2 = gp1Var.l0;
                            if (up0Var2 != null) {
                                ((LinearLayout) up0Var2.a).setVisibility(list.isEmpty() ? 0 : 8);
                            }
                        } else {
                            if (up0Var != null) {
                                ((LinearLayout) up0Var.d).setVisibility(8);
                            }
                            up0 up0Var3 = gp1Var.l0;
                            if (up0Var3 != null) {
                                ((LinearLayout) up0Var3.a).setVisibility(8);
                            }
                        }
                        break;
                    case 1:
                        up0 up0Var4 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var4 != null) {
                                ((LinearLayout) up0Var4.d).setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            zd0 zd0Var2 = gp1Var.p0;
                            zd0Var2.r = list;
                            zd0Var2.d();
                        } else if (up0Var4 != null) {
                            ((LinearLayout) up0Var4.d).setVisibility(8);
                        }
                        break;
                    default:
                        up0 up0Var5 = gp1Var.l0;
                        if (list != null) {
                            if (up0Var5 != null) {
                                up0Var5.b.setVisibility(list.isEmpty() ? 8 : 0);
                            }
                            gp1Var.o0.p((List) list.stream().filter(new c7(14)).collect(Collectors.toList()));
                        } else if (up0Var5 != null) {
                            up0Var5.b.setVisibility(8);
                        }
                        break;
                }
            }
        });
    }

    @Override // com.eddyizm.tempus.interfaces.PodcastCallback
    public final void onDismiss() {
        new Handler().postDelayed(new qa1(11, this), 1000L);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelClick(Bundle bundle) {
        gb.x(a0()).m(R.id.podcastChannelPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.podcastChannelBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeClick(Bundle bundle) {
        bl2 bl2Var = this.q0;
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
