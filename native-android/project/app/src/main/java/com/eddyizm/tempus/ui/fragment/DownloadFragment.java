package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.DownloadStack;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.bu0;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.ft0;
import defpackage.g51;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.os0;
import defpackage.s24;
import defpackage.sk2;
import defpackage.ss0;
import defpackage.ud3;
import defpackage.uo;
import defpackage.up0;
import defpackage.ws0;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DownloadFragment extends kc1 implements ClickCallback {
    public up0 l0;
    public MainActivity m0;
    public om1 n0;
    public bu0 o0;
    public ft0 p0;
    public bl2 q0;
    public MaterialToolbar r0;

    @Override // defpackage.kc1
    public final void D(int i, int i2, Intent intent) {
        Uri data;
        super.D(i, i2, intent);
        if (i == 1002 && i2 == -1 && (data = intent.getData()) != null) {
            Z().getContentResolver().takePersistableUriPermission(data, 3);
            ud3.i0(data.toString());
            g51.i();
            Toast.makeText(Z(), "Download directory set", 0).show();
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainActivity mainActivity = (MainActivity) e();
        this.m0 = mainActivity;
        this.n0 = mainActivity.U;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_download, viewGroup, false);
        int i = R.id.download_downloaded_sector;
        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.download_downloaded_sector);
        if (constraintLayout != null) {
            i = R.id.downloaded_go_back_image_view;
            ImageView imageView = (ImageView) uo.s(viewInflate, R.id.downloaded_go_back_image_view);
            if (imageView != null) {
                i = R.id.downloaded_group_by_image_view;
                ImageView imageView2 = (ImageView) uo.s(viewInflate, R.id.downloaded_group_by_image_view);
                if (imageView2 != null) {
                    i = R.id.downloaded_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.downloaded_recycler_view);
                    if (recyclerView != null) {
                        i = R.id.downloaded_refresh_image_view;
                        ImageView imageView3 = (ImageView) uo.s(viewInflate, R.id.downloaded_refresh_image_view);
                        if (imageView3 != null) {
                            i = R.id.downloaded_text_view_refreshable;
                            if (((TextView) uo.s(viewInflate, R.id.downloaded_text_view_refreshable)) != null) {
                                i = R.id.empty_description_image_view;
                                if (((ImageView) uo.s(viewInflate, R.id.empty_description_image_view)) != null) {
                                    i = R.id.empty_download_layout;
                                    LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.empty_download_layout);
                                    if (linearLayout != null) {
                                        i = R.id.loading_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) uo.s(viewInflate, R.id.loading_progress_bar);
                                        if (progressBar != null) {
                                            i = R.id.shuffle_downloaded_text_view_clickable;
                                            TextView textView = (TextView) uo.s(viewInflate, R.id.shuffle_downloaded_text_view_clickable);
                                            if (textView != null) {
                                                i = R.id.subtitle_empty_description_label;
                                                if (((TextView) uo.s(viewInflate, R.id.subtitle_empty_description_label)) != null) {
                                                    i = R.id.title_empty_description_label;
                                                    if (((TextView) uo.s(viewInflate, R.id.title_empty_description_label)) != null) {
                                                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                        this.l0 = new up0(linearLayout2, constraintLayout, imageView, imageView2, recyclerView, imageView3, linearLayout, progressBar, textView);
                                                        nc1 nc1VarX = X();
                                                        e75 e75VarD = nc1VarX.d();
                                                        b75 b75VarR = gh0.r(nc1VarX);
                                                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                                        i30 i30VarA = kx3.a(bu0.class);
                                                        String strB = i30VarA.b();
                                                        if (strB != null) {
                                                            this.o0 = (bu0) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                            return linearLayout2;
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
        this.m0.J();
        this.m0.I(true);
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        MaterialToolbar materialToolbar = (MaterialToolbar) ((LinearLayout) this.l0.a).findViewById(R.id.toolbar);
        this.r0 = materialToolbar;
        this.m0.o(materialToolbar);
        this.n0.n(this.m0, this.r0);
        Drawable overflowIcon = this.r0.getOverflowIcon();
        Objects.requireNonNull(overflowIcon);
        overflowIcon.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        final int i = 1;
        ((RecyclerView) this.l0.f).setHasFixedSize(true);
        ft0 ft0Var = new ft0(this);
        this.p0 = ft0Var;
        ((RecyclerView) this.l0.f).setAdapter(ft0Var);
        bu0 bu0Var = this.o0;
        le1 le1VarV = v();
        ss0 ss0Var = (ss0) bu0Var.c.o;
        ((s24) ss0Var.n).i().a(new String[]{"download"}, new os0(ss0Var, 1)).e(le1VarV, new d8(9, bu0Var));
        final int i2 = 0;
        bu0Var.d.e(v(), new a83(this) { // from class: vs0
            public final /* synthetic */ DownloadFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i3 = i2;
                DownloadFragment downloadFragment = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            boolean zIsEmpty = list.isEmpty();
                            up0 up0Var = downloadFragment.l0;
                            if (zIsEmpty) {
                                if (up0Var != null) {
                                    up0Var.b.setVisibility(0);
                                    ((ConstraintLayout) downloadFragment.l0.c).setVisibility(8);
                                    ((ImageView) downloadFragment.l0.e).setVisibility(8);
                                }
                            } else if (up0Var != null) {
                                up0Var.b.setVisibility(8);
                                ((ConstraintLayout) downloadFragment.l0.c).setVisibility(0);
                                ((ImageView) downloadFragment.l0.e).setVisibility(0);
                                downloadFragment.o0.e.e(downloadFragment.v(), new f7(1, downloadFragment, list));
                            }
                            up0 up0Var2 = downloadFragment.l0;
                            if (up0Var2 != null) {
                                ((ProgressBar) up0Var2.h).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        Integer num = (Integer) obj;
                        if (num != null && downloadFragment.l0 != null) {
                            if (num.intValue() == -1) {
                                Toast.makeText(downloadFragment.Z(), R.string.download_refresh_no_directory, 0).show();
                            } else if (num.intValue() != 0) {
                                Toast.makeText(downloadFragment.Z(), downloadFragment.r().getQuantityString(R.plurals.download_refresh_removed, num.intValue(), num), 0).show();
                            } else {
                                Toast.makeText(downloadFragment.Z(), R.string.download_refresh_no_changes, 0).show();
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.o0.f.e(v(), new a83(this) { // from class: vs0
            public final /* synthetic */ DownloadFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i3 = i;
                DownloadFragment downloadFragment = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            boolean zIsEmpty = list.isEmpty();
                            up0 up0Var = downloadFragment.l0;
                            if (zIsEmpty) {
                                if (up0Var != null) {
                                    up0Var.b.setVisibility(0);
                                    ((ConstraintLayout) downloadFragment.l0.c).setVisibility(8);
                                    ((ImageView) downloadFragment.l0.e).setVisibility(8);
                                }
                            } else if (up0Var != null) {
                                up0Var.b.setVisibility(8);
                                ((ConstraintLayout) downloadFragment.l0.c).setVisibility(0);
                                ((ImageView) downloadFragment.l0.e).setVisibility(0);
                                downloadFragment.o0.e.e(downloadFragment.v(), new f7(1, downloadFragment, list));
                            }
                            up0 up0Var2 = downloadFragment.l0;
                            if (up0Var2 != null) {
                                ((ProgressBar) up0Var2.h).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        Integer num = (Integer) obj;
                        if (num != null && downloadFragment.l0 != null) {
                            if (num.intValue() == -1) {
                                Toast.makeText(downloadFragment.Z(), R.string.download_refresh_no_directory, 0).show();
                            } else if (num.intValue() != 0) {
                                Toast.makeText(downloadFragment.Z(), downloadFragment.r().getQuantityString(R.plurals.download_refresh_removed, num.intValue(), num), 0).show();
                            } else {
                                Toast.makeText(downloadFragment.Z(), R.string.download_refresh_no_changes, 0).show();
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ((ImageView) this.l0.e).setOnClickListener(new ws0(this, i2));
        ((ImageView) this.l0.d).setOnClickListener(new ws0(this, i));
        ((ImageView) this.l0.g).setOnClickListener(new ws0(this, 2));
    }

    public final void h0(String str) {
        bu0 bu0Var = this.o0;
        DownloadStack downloadStack = new DownloadStack(str, null);
        bu0Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(downloadStack);
        bu0Var.e.k(arrayList);
        App.b().getClass();
        App.c().edit().putString("default_download_view_type", str).apply();
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle bundle) {
        this.o0.c(new DownloadStack("download_type_album", bundle.getString("download_type_album")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle bundle) {
        this.o0.c(new DownloadStack("download_type_artist", bundle.getString("download_type_artist")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onDownloadGroupLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.downloadBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onGenreClick(Bundle bundle) {
        this.o0.c(new DownloadStack("download_type_genre", bundle.getString("download_type_genre")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        bo2.o(this.q0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle bundle) {
        this.o0.c(new DownloadStack("download_type_playlist", bundle.getString("download_type_playlist")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onYearClick(Bundle bundle) {
        this.o0.c(new DownloadStack("download_type_year", bundle.getString("download_type_year")));
    }
}
