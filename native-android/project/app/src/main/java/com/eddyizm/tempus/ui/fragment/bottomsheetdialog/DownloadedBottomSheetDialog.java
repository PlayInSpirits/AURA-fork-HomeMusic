package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.DownloadedBottomSheetDialog;
import defpackage.aj2;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.cb4;
import defpackage.f35;
import defpackage.fi0;
import defpackage.q05;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.zt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DownloadedBottomSheetDialog extends zt implements View.OnClickListener {
    public ArrayList B0;
    public String C0;
    public String D0;
    public bl2 E0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_downloaded_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("download_group");
            this.B0 = parcelableArrayList;
            if (parcelableArrayList != null) {
                this.C0 = bundle2.getString("download_group_title");
                this.D0 = bundle2.getString("download_group_subtitle");
                q05.u((ViewGroup) viewInflate.findViewById(R.id.option_linear_layout));
                final int i2 = 1;
                ((TextView) viewInflate.findViewById(R.id.play_random_text_view)).setVisibility(this.B0.size() > 1 ? 0 : 8);
                ((TextView) viewInflate.findViewById(R.id.remove_all_text_view)).setText(r().getText(this.B0.size() > 1 ? R.string.downloaded_bottom_sheet_remove_all : R.string.downloaded_bottom_sheet_remove));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.group_cover_image_view);
                Context contextZ = Z();
                String coverArtId = ((Child) this.B0.get(new Random().nextInt(this.B0.size()))).getCoverArtId();
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 1, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.group_title_text_view);
                textView.setText(this.C0);
                textView.setSelected(true);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.group_subtitle_text_view);
                textView2.setText(this.D0);
                textView2.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.play_random_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: cu0
                    public final /* synthetic */ DownloadedBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        DownloadedBottomSheetDialog downloadedBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                Collections.shuffle(downloadedBottomSheetDialog.B0);
                                bo2.o(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, 0);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, true);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 2:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, false);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            default:
                                String strO = ud3.o();
                                ArrayList arrayList = downloadedBottomSheetDialog.B0;
                                if (strO == null) {
                                    au0.w(downloadedBottomSheetDialog.Z()).f(gi1.H(arrayList), (List) downloadedBottomSheetDialog.B0.stream().map(new hu3(6)).collect(Collectors.toList()));
                                } else {
                                    arrayList.forEach(new e7());
                                }
                                downloadedBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.play_next_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: cu0
                    public final /* synthetic */ DownloadedBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i2;
                        DownloadedBottomSheetDialog downloadedBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                Collections.shuffle(downloadedBottomSheetDialog.B0);
                                bo2.o(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, 0);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, true);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 2:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, false);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            default:
                                String strO = ud3.o();
                                ArrayList arrayList = downloadedBottomSheetDialog.B0;
                                if (strO == null) {
                                    au0.w(downloadedBottomSheetDialog.Z()).f(gi1.H(arrayList), (List) downloadedBottomSheetDialog.B0.stream().map(new hu3(6)).collect(Collectors.toList()));
                                } else {
                                    arrayList.forEach(new e7());
                                }
                                downloadedBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i3 = 2;
                ((TextView) viewInflate.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: cu0
                    public final /* synthetic */ DownloadedBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        DownloadedBottomSheetDialog downloadedBottomSheetDialog = this.o;
                        switch (i4) {
                            case 0:
                                Collections.shuffle(downloadedBottomSheetDialog.B0);
                                bo2.o(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, 0);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, true);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 2:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, false);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            default:
                                String strO = ud3.o();
                                ArrayList arrayList = downloadedBottomSheetDialog.B0;
                                if (strO == null) {
                                    au0.w(downloadedBottomSheetDialog.Z()).f(gi1.H(arrayList), (List) downloadedBottomSheetDialog.B0.stream().map(new hu3(6)).collect(Collectors.toList()));
                                } else {
                                    arrayList.forEach(new e7());
                                }
                                downloadedBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i4 = 3;
                ((TextView) viewInflate.findViewById(R.id.remove_all_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: cu0
                    public final /* synthetic */ DownloadedBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        DownloadedBottomSheetDialog downloadedBottomSheetDialog = this.o;
                        switch (i5) {
                            case 0:
                                Collections.shuffle(downloadedBottomSheetDialog.B0);
                                bo2.o(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, 0);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, true);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            case 2:
                                bo2.e(downloadedBottomSheetDialog.E0, downloadedBottomSheetDialog.B0, false);
                                ((au) ((MainActivity) downloadedBottomSheetDialog.X()).V.n).d(true);
                                downloadedBottomSheetDialog.h0();
                                break;
                            default:
                                String strO = ud3.o();
                                ArrayList arrayList = downloadedBottomSheetDialog.B0;
                                if (strO == null) {
                                    au0.w(downloadedBottomSheetDialog.Z()).f(gi1.H(arrayList), (List) downloadedBottomSheetDialog.B0.stream().map(new hu3(6)).collect(Collectors.toList()));
                                } else {
                                    arrayList.forEach(new e7());
                                }
                                downloadedBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                return viewInflate;
            }
        }
        n0();
        return viewInflate;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.B0 != null) {
            Context contextZ = Z();
            cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
            Bundle bundle = Bundle.EMPTY;
            aj2 aj2Var = new aj2();
            Looper looperX = f35.x();
            bl2 bl2Var = new bl2(looperX);
            b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
            this.E0 = bl2Var;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.E0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        super.S();
    }
}
