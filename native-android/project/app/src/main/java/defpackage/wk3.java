package defpackage;

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
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wk3 extends kc1 implements ClickCallback {
    public lv4 l0;
    public FloatingActionButton m0;
    public ExtendedFloatingActionButton n0;
    public ExtendedFloatingActionButton o0;
    public ExtendedFloatingActionButton p0;
    public ExtendedFloatingActionButton q0;
    public ExtendedFloatingActionButton r0;
    public aj3 t0;
    public li3 u0;
    public bl2 v0;
    public yk3 w0;
    public boolean s0 = false;
    public List x0 = new ArrayList();

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.inner_fragment_player_queue, viewGroup, false);
        int i2 = R.id.fab_clear_queue;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) uo.s(viewInflate, R.id.fab_clear_queue);
        if (extendedFloatingActionButton != null) {
            i2 = R.id.fab_download_all;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) uo.s(viewInflate, R.id.fab_download_all);
            if (extendedFloatingActionButton2 != null) {
                i2 = R.id.fab_load_queue;
                ExtendedFloatingActionButton extendedFloatingActionButton3 = (ExtendedFloatingActionButton) uo.s(viewInflate, R.id.fab_load_queue);
                if (extendedFloatingActionButton3 != null) {
                    i2 = R.id.fab_menu_container;
                    if (((LinearLayout) uo.s(viewInflate, R.id.fab_menu_container)) != null) {
                        i2 = R.id.fab_menu_toggle;
                        FloatingActionButton floatingActionButton = (FloatingActionButton) uo.s(viewInflate, R.id.fab_menu_toggle);
                        if (floatingActionButton != null) {
                            i2 = R.id.fab_save_to_playlist;
                            ExtendedFloatingActionButton extendedFloatingActionButton4 = (ExtendedFloatingActionButton) uo.s(viewInflate, R.id.fab_save_to_playlist);
                            if (extendedFloatingActionButton4 != null) {
                                i2 = R.id.fab_shuffle_queue;
                                ExtendedFloatingActionButton extendedFloatingActionButton5 = (ExtendedFloatingActionButton) uo.s(viewInflate, R.id.fab_shuffle_queue);
                                if (extendedFloatingActionButton5 != null) {
                                    i2 = R.id.player_queue_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.player_queue_recycler_view);
                                    if (recyclerView != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                        this.l0 = new lv4(coordinatorLayout, extendedFloatingActionButton, extendedFloatingActionButton2, extendedFloatingActionButton3, floatingActionButton, extendedFloatingActionButton4, extendedFloatingActionButton5, recyclerView);
                                        nc1 nc1VarX = X();
                                        e75 e75VarD = nc1VarX.d();
                                        b75 b75VarR = gh0.r(nc1VarX);
                                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                        i30 i30VarA = kx3.a(aj3.class);
                                        String strB = i30VarA.b();
                                        if (strB == null) {
                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                            return null;
                                        }
                                        this.t0 = (aj3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                        nc1 nc1VarX2 = X();
                                        e75 e75VarD2 = nc1VarX2.d();
                                        b75 b75VarR2 = gh0.r(nc1VarX2);
                                        bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                                        i30 i30VarA2 = kx3.a(li3.class);
                                        String strB2 = i30VarA2.b();
                                        if (strB2 == null) {
                                            kf2.n("Local and anonymous classes can not be ViewModels");
                                            return null;
                                        }
                                        this.u0 = (li3) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                                        lv4 lv4Var = this.l0;
                                        FloatingActionButton floatingActionButton2 = (FloatingActionButton) lv4Var.q;
                                        this.m0 = floatingActionButton2;
                                        this.n0 = (ExtendedFloatingActionButton) lv4Var.n;
                                        this.o0 = (ExtendedFloatingActionButton) lv4Var.s;
                                        this.p0 = (ExtendedFloatingActionButton) lv4Var.r;
                                        this.q0 = (ExtendedFloatingActionButton) lv4Var.o;
                                        this.r0 = (ExtendedFloatingActionButton) lv4Var.p;
                                        floatingActionButton2.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i3 = i;
                                                gq0 gq0Var = gq0.n;
                                                int i4 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i3) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i4), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i5 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i5++;
                                                                    }
                                                                }
                                                                if (i5 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i5, Integer.valueOf(i5)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i4, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        final int i3 = 1;
                                        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i4 = i3;
                                                gq0 gq0Var = gq0.n;
                                                int i5 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i4) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i5), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i6 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i6++;
                                                                    }
                                                                }
                                                                if (i6 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i6, Integer.valueOf(i6)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i5, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        final int i4 = 2;
                                        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i5 = i4;
                                                gq0 gq0Var = gq0.n;
                                                int i6 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i5) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i6), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i7 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i7++;
                                                                    }
                                                                }
                                                                if (i7 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i7, Integer.valueOf(i7)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i6, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        final int i5 = 3;
                                        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i6 = i5;
                                                gq0 gq0Var = gq0.n;
                                                int i7 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i6) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i7), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i8 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i8++;
                                                                    }
                                                                }
                                                                if (i8 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i8, Integer.valueOf(i8)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i7, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        final int i6 = 4;
                                        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i7 = i6;
                                                gq0 gq0Var = gq0.n;
                                                int i8 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i7) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i8), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i9 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i9++;
                                                                    }
                                                                }
                                                                if (i9 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i9, Integer.valueOf(i9)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i8, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        final int i7 = 5;
                                        this.r0.setOnClickListener(new View.OnClickListener(this) { // from class: vk3
                                            public final /* synthetic */ wk3 o;

                                            {
                                                this.o = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i8 = i7;
                                                gq0 gq0Var = gq0.n;
                                                int i9 = 4;
                                                wk3 wk3Var = this.o;
                                                switch (i8) {
                                                    case 0:
                                                        wk3Var.k0();
                                                        break;
                                                    case 1:
                                                        Log.d("PlayerQueueFragment", "Clear Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, i9), gq0Var);
                                                        break;
                                                    case 2:
                                                        Log.d("PlayerQueueFragment", "Shuffle Queue Clicked!");
                                                        wk3Var.v0.f(new tk3(wk3Var, 6), gq0Var);
                                                        break;
                                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                        Log.d("PlayerQueueFragment", "Save to Playlist Clicked!");
                                                        List list = wk3Var.w0.s;
                                                        if (list == null || list.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(list));
                                                            fl3 fl3Var = new fl3();
                                                            fl3Var.c0(bundle2);
                                                            fl3Var.m0(wk3Var.X().k(), null);
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    case 4:
                                                        Log.d("PlayerQueueFragment", "Download All Clicked!");
                                                        List<Child> list2 = wk3Var.w0.s;
                                                        if (list2 == null || list2.isEmpty()) {
                                                            Toast.makeText(wk3Var.Z(), "Queue is empty", 0).show();
                                                            wk3Var.k0();
                                                        } else {
                                                            if (ud3.o() == null) {
                                                                ArrayList arrayListM = gi1.M(list2);
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Child child : list2) {
                                                                    Download download = new Download(child);
                                                                    download.setArtist(child.getArtist());
                                                                    download.setAlbum(child.getAlbum());
                                                                    download.setCoverArtId(child.getCoverArtId());
                                                                    arrayList.add(download);
                                                                }
                                                                eu0 eu0VarW = au0.w(wk3Var.Z());
                                                                if (eu0VarW != null) {
                                                                    eu0VarW.a(arrayListM, arrayList, false);
                                                                    int size = list2.size();
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, size, Integer.valueOf(size)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 2), 1000L);
                                                                } else {
                                                                    Log.e("PlayerQueueFragment", "DownloaderManager not initialized. Check DownloadUtil.");
                                                                    Toast.makeText(wk3Var.Z(), "Download service unavailable.", 0).show();
                                                                }
                                                            } else {
                                                                int i10 = 0;
                                                                for (Child child2 : list2) {
                                                                    if (g51.e(child2) == null) {
                                                                        i51.a(wk3Var.Z(), child2);
                                                                        i10++;
                                                                    }
                                                                }
                                                                if (i10 > 0) {
                                                                    Toast.makeText(wk3Var.Z(), wk3Var.r().getQuantityString(R.plurals.songs_download_started, i10, Integer.valueOf(i10)), 0).show();
                                                                    new Handler().postDelayed(new tk3(wk3Var, 3), 2000L);
                                                                } else {
                                                                    Toast.makeText(wk3Var.Z(), "All songs already downloaded", 0).show();
                                                                }
                                                            }
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                    default:
                                                        Log.d("PlayerQueueFragment", "Load Queue Clicked!");
                                                        if (ud3.Y()) {
                                                            nc1 nc1VarX3 = wk3Var.X();
                                                            e75 e75VarD3 = nc1VarX3.d();
                                                            b75 b75VarR3 = gh0.r(nc1VarX3);
                                                            bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                                                            i30 i30VarA3 = kx3.a(aj3.class);
                                                            String strB3 = i30VarA3.b();
                                                            if (strB3 != null) {
                                                                aj3 aj3Var = (aj3) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                                                                aj3Var.c().e(wk3Var.v(), new i7(i9, wk3Var, aj3Var));
                                                                new Handler().postDelayed(new tk3(wk3Var, 1), 1000L);
                                                            } else {
                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                            }
                                                        } else {
                                                            wk3Var.k0();
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        if (!ud3.Y()) {
                                            this.r0.setVisibility(8);
                                        }
                                        RecyclerView recyclerView2 = (RecyclerView) this.l0.t;
                                        Z();
                                        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                        ((RecyclerView) this.l0.t).setHasFixedSize(true);
                                        ((RecyclerView) this.l0.t).setClipToPadding(false);
                                        ((RecyclerView) this.l0.t).post(new tk3(this, i7));
                                        yk3 yk3Var = new yk3(this);
                                        this.w0 = yk3Var;
                                        ((RecyclerView) this.l0.t).setAdapter(yk3Var);
                                        a.f.e(v(), new uk3(this, i));
                                        j0();
                                        ns3 ns3Var = this.t0.f.a;
                                        ((s24) ns3Var.o).i().a(new String[]{"queue"}, new ks3(ns3Var, i3)).e(v(), new uk3(this, i3));
                                        u52.c.e(v(), new uk3(this, i4));
                                        u52.b.e(v(), new uk3(this, i5));
                                        new f22(new oo1(this)).i((RecyclerView) this.l0.t);
                                        return coordinatorLayout;
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
    public final void P() {
        this.R = true;
        yk3 yk3Var = this.w0;
        yk3Var.r = this.v0;
        yk3Var.d();
        this.v0.f(new tk3(this, 0), gq0.n);
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
        int i = 4;
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(i, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.v0 = bl2Var;
        bo2.j(bl2Var, this.u0);
        this.u0.b.e(v(), new uk3(this, i));
        this.u0.c.e(v(), new uk3(this, 5));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.v0);
        this.R = true;
    }

    public final void h0(View view, int i) {
        view.animate().translationY((i + 1) * 70.0f * r().getDisplayMetrics().density).alpha(0.0f).setDuration(250L).withEndAction(new ni0(view, 1)).start();
    }

    public final void i0(View view, int i) {
        float f = (i + 1) * 70.0f * r().getDisplayMetrics().density;
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.setTranslationY(f);
        view.animate().translationY(0.0f).alpha(1.0f).setDuration(250L).start();
    }

    public final void j0() {
        if (this.w0 != null) {
            if (!u52.c().a) {
                String str = (String) this.u0.b.d();
                Boolean bool = (Boolean) this.u0.c.d();
                this.w0.q(str, bool != null && bool.booleanValue());
            } else {
                v52 v52VarC = u52.c();
                int i = v52VarC.o;
                List listL = u52.l();
                this.w0.q((i < 0 || i >= listL.size()) ? null : ((Child) listL.get(i)).getId(), v52VarC.j);
            }
        }
    }

    public final void k0() {
        if (this.s0) {
            if (ud3.Y()) {
                h0(this.r0, 4);
            }
            h0(this.p0, 3);
            h0(this.n0, 2);
            h0(this.q0, 1);
            h0(this.o0, 0);
            this.m0.animate().rotation(0.0f).setDuration(250L).start();
        } else {
            i0(this.o0, 0);
            i0(this.q0, 1);
            i0(this.n0, 2);
            i0(this.p0, 3);
            if (ud3.Y()) {
                i0(this.r0, 4);
            }
            this.m0.animate().rotation(45.0f).setDuration(250L).start();
        }
        this.s0 = !this.s0;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.q(this.v0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"), "queue");
    }
}
