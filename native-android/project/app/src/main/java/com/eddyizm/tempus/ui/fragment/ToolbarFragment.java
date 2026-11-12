package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.ToolbarFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj3;
import defpackage.bq4;
import defpackage.c52;
import defpackage.cp2;
import defpackage.e5;
import defpackage.e75;
import defpackage.g7;
import defpackage.gh0;
import defpackage.hd5;
import defpackage.i30;
import defpackage.ie1;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.n92;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.o54;
import defpackage.om0;
import defpackage.oo4;
import defpackage.rq2;
import defpackage.s24;
import defpackage.ud3;
import defpackage.uo;
import defpackage.vf2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ToolbarFragment extends kc1 {
    public ie1 l0;
    public MainActivity m0;
    public n92 n0;
    public vf2 o0;
    public final ArrayList p0 = new ArrayList();
    public String q0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        e5 e5VarB;
        menuInflater.inflate(R.menu.main_page_menu, menu);
        Context contextZ = Z();
        MenuItem menuItemFindItem = menu.findItem(R.id.media_route_menu_item);
        if (menuItemFindItem != null) {
            menuItemFindItem.setTitle(R.string.upnp_route_menu_title);
            View actionView = menuItemFindItem.getActionView();
            if (actionView instanceof cp2) {
                ((cp2) actionView).setRemoteIndicatorDrawable(contextZ.getDrawable(R.drawable.ic_cast_audio));
            }
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.media_route_menu_item);
        if (menuItemFindItem2 == null) {
            return;
        }
        if (menuItemFindItem2 instanceof oo4) {
            e5VarB = ((oo4) menuItemFindItem2).b();
        } else {
            Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
            e5VarB = null;
        }
        MediaRouteActionProvider mediaRouteActionProvider = e5VarB instanceof MediaRouteActionProvider ? (MediaRouteActionProvider) e5VarB : null;
        if (mediaRouteActionProvider == null) {
            Log.w("UpnpRouteSetup", "route item has no MediaRouteActionProvider, leaving it alone");
            return;
        }
        c52 c52Var = new c52();
        rq2 rq2Var = mediaRouteActionProvider.c;
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        c52Var.a(rq2Var.b());
        c52Var.b("com.eddyizm.tempus.UPNP");
        rq2 rq2VarD = c52Var.d();
        if (rq2VarD == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (mediaRouteActionProvider.c.equals(rq2VarD)) {
            return;
        }
        mediaRouteActionProvider.c = rq2VarD;
        cp2 cp2Var = mediaRouteActionProvider.e;
        if (cp2Var != null) {
            cp2Var.setRouteSelector(rq2VarD);
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_toolbar, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) viewInflate;
        int i = R.id.toolbar;
        if (((MaterialToolbar) uo.s(viewInflate, R.id.toolbar)) != null) {
            i = R.id.toolbar_music_library_text_view;
            TextView textView = (TextView) uo.s(viewInflate, R.id.toolbar_music_library_text_view);
            if (textView != null) {
                i = R.id.toolbar_title_container;
                LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.toolbar_title_container);
                if (linearLayout != null) {
                    this.l0 = new ie1(appBarLayout, textView, linearLayout);
                    nc1 nc1VarX = X();
                    e75 e75VarD = nc1VarX.d();
                    b75 b75VarR = gh0.r(nc1VarX);
                    bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                    i30 i30VarA = kx3.a(n92.class);
                    String strB = i30VarA.b();
                    if (strB == null) {
                        kf2.n("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                    this.n0 = (n92) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                    nc1 nc1VarX2 = X();
                    e75 e75VarD2 = nc1VarX2.d();
                    b75 b75VarR2 = gh0.r(nc1VarX2);
                    bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                    i30 i30VarA2 = kx3.a(vf2.class);
                    String strB2 = i30VarA2.b();
                    if (strB2 != null) {
                        this.o0 = (vf2) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                        return appBarLayout;
                    }
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
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
    public final boolean N(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            AURAVersion.pendingSearch = true;
            this.m0.T.m(R.id.hubFragment, null, null);
            return true;
        }
        if (menuItem.getItemId() != R.id.action_settings) {
            return false;
        }
        this.m0.T.m(R.id.settingsFragment, null, null);
        return true;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        h0();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        if (this.I instanceof DownloadFragment) {
            return;
        }
        this.l0.a.setOnClickListener(new bj3(16, this));
        n92 n92Var = this.n0;
        le1 le1VarV = v();
        k03 k03Var = n92Var.h;
        final int i = 0;
        if (k03Var.d() == null) {
            n92Var.c.getClass();
            om0.X().e(le1VarV, new g7(k03Var, 0));
        }
        k03Var.e(v(), new a83(this) { // from class: dv4
            public final /* synthetic */ ToolbarFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i2 = i;
                ToolbarFragment toolbarFragment = this.b;
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        ArrayList arrayList = toolbarFragment.p0;
                        arrayList.clear();
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        toolbarFragment.h0();
                        break;
                    case 1:
                        toolbarFragment.h0();
                        break;
                    default:
                        List<Server> list2 = (List) obj;
                        String strE = ud3.E();
                        toolbarFragment.q0 = null;
                        if (list2 != null && strE != null) {
                            for (Server server : list2) {
                                if (strE.equals(server.getServerId())) {
                                    toolbarFragment.q0 = server.getServerName();
                                }
                            }
                        }
                        toolbarFragment.h0();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.o0.d.e(v(), new a83(this) { // from class: dv4
            public final /* synthetic */ ToolbarFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i3 = i2;
                ToolbarFragment toolbarFragment = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        ArrayList arrayList = toolbarFragment.p0;
                        arrayList.clear();
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        toolbarFragment.h0();
                        break;
                    case 1:
                        toolbarFragment.h0();
                        break;
                    default:
                        List<Server> list2 = (List) obj;
                        String strE = ud3.E();
                        toolbarFragment.q0 = null;
                        if (list2 != null && strE != null) {
                            for (Server server : list2) {
                                if (strE.equals(server.getServerId())) {
                                    toolbarFragment.q0 = server.getServerName();
                                }
                            }
                        }
                        toolbarFragment.h0();
                        break;
                }
            }
        });
        final int i3 = 2;
        ((s24) AppDatabase.y().G().n).i().a(new String[]{"server"}, new o54(14)).e(v(), new a83(this) { // from class: dv4
            public final /* synthetic */ ToolbarFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i3;
                ToolbarFragment toolbarFragment = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        ArrayList arrayList = toolbarFragment.p0;
                        arrayList.clear();
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        toolbarFragment.h0();
                        break;
                    case 1:
                        toolbarFragment.h0();
                        break;
                    default:
                        List<Server> list2 = (List) obj;
                        String strE = ud3.E();
                        toolbarFragment.q0 = null;
                        if (list2 != null && strE != null) {
                            for (Server server : list2) {
                                if (strE.equals(server.getServerId())) {
                                    toolbarFragment.q0 = server.getServerName();
                                }
                            }
                        }
                        toolbarFragment.h0();
                        break;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    public final void h0() {
        boolean z;
        hd5 hd5Var;
        String str;
        if (this.l0 == null) {
            return;
        }
        ArrayList arrayList = this.p0;
        int i = 0;
        if (arrayList.size() > 1 || ud3.k() != null) {
            kc1 kc1Var = this.I;
            if ((kc1Var instanceof DownloadFragment) || ((kc1Var instanceof HomeFragment) && ((hd5Var = ((HomeFragment) kc1Var).l0) == null || ((ViewPager2) hd5Var.p).getCurrentItem() != 0))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z2 = (z || (str = this.q0) == null || (this.I instanceof DownloadFragment) || str.equalsIgnoreCase(s(R.string.app_name))) ? false : true;
        this.l0.a.setClickable(z);
        this.l0.b.setVisibility((z || z2) ? 0 : 8);
        this.l0.b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, z ? R.drawable.ic_expand_more_small : 0, 0);
        if (z2) {
            this.l0.b.setText(this.q0);
            return;
        }
        if (z) {
            String strK = ud3.k();
            if (strK == null) {
                strK = null;
            } else {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    MusicFolder musicFolder = (MusicFolder) obj;
                    if (strK.equals(musicFolder.getId())) {
                        if (musicFolder.getName() == null) {
                            strK = musicFolder.getId();
                            break;
                        } else {
                            strK = musicFolder.getName();
                            break;
                        }
                    }
                }
            }
            TextView textView = this.l0.b;
            if (strK == null) {
                strK = s(R.string.settings_music_library_all);
            }
            textView.setText(strK);
        }
    }
}
