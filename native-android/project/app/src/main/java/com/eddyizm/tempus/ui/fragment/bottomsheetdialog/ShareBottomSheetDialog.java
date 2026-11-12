package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ShareBottomSheetDialog;
import com.eddyizm.tempus.viewmodel.b;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.e75;
import defpackage.g12;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.rc4;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.xv0;
import defpackage.zt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ShareBottomSheetDialog extends zt implements View.OnClickListener {
    public b B0;
    public rc4 C0;
    public Share D0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_share_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            Share share = (Share) bundle2.getParcelable("share_object");
            this.D0 = share;
            if (share != null) {
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(b.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.B0 = (b) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                nc1 nc1VarX2 = X();
                e75 e75VarD2 = nc1VarX2.d();
                b75 b75VarR2 = gh0.r(nc1VarX2);
                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                i30 i30VarA2 = kx3.a(rc4.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                rc4 rc4Var = (rc4) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                this.C0 = rc4Var;
                rc4Var.d = this.D0;
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.share_cover_image_view);
                List<Child> entries = this.C0.d.getEntries();
                String coverArtId = (entries == null || entries.isEmpty()) ? null : entries.get(0).getCoverArtId();
                Context contextZ = Z();
                final int i2 = 1;
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 1, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.share_title_text_view);
                textView.setText(this.C0.d.getDescription());
                textView.setSelected(true);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.share_subtitle_text_view);
                textView2.setText(Z().getString(R.string.share_subtitle_item, g12.x(this.D0.getExpires())));
                textView2.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.copy_link_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: qc4
                    public final /* synthetic */ ShareBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        ShareBottomSheetDialog shareBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                ((ClipboardManager) shareBottomSheetDialog.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(shareBottomSheetDialog.s(R.string.app_name), shareBottomSheetDialog.C0.d.getUrl()));
                                shareBottomSheetDialog.h0();
                                break;
                            case 1:
                                new xc4().m0(shareBottomSheetDialog.X().k(), null);
                                shareBottomSheetDialog.h0();
                                break;
                            default:
                                rc4 rc4Var2 = shareBottomSheetDialog.C0;
                                hh3 hh3Var = rc4Var2.c;
                                String id = rc4Var2.d.getId();
                                hh3Var.getClass();
                                wo0 wo0VarI = App.f(false).i();
                                wo0VarI.getClass();
                                Log.d("BrowsingClient", "deleteShare()");
                                ((hd4) wo0VarI.o).a(((pn4) wo0VarI.n).f(), id).enqueue(new hh3(26));
                                shareBottomSheetDialog.B0.g(shareBottomSheetDialog.I);
                                shareBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.update_share_preferences_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: qc4
                    public final /* synthetic */ ShareBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i2;
                        ShareBottomSheetDialog shareBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                ((ClipboardManager) shareBottomSheetDialog.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(shareBottomSheetDialog.s(R.string.app_name), shareBottomSheetDialog.C0.d.getUrl()));
                                shareBottomSheetDialog.h0();
                                break;
                            case 1:
                                new xc4().m0(shareBottomSheetDialog.X().k(), null);
                                shareBottomSheetDialog.h0();
                                break;
                            default:
                                rc4 rc4Var2 = shareBottomSheetDialog.C0;
                                hh3 hh3Var = rc4Var2.c;
                                String id = rc4Var2.d.getId();
                                hh3Var.getClass();
                                wo0 wo0VarI = App.f(false).i();
                                wo0VarI.getClass();
                                Log.d("BrowsingClient", "deleteShare()");
                                ((hd4) wo0VarI.o).a(((pn4) wo0VarI.n).f(), id).enqueue(new hh3(26));
                                shareBottomSheetDialog.B0.g(shareBottomSheetDialog.I);
                                shareBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i3 = 2;
                ((TextView) viewInflate.findViewById(R.id.delete_share_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: qc4
                    public final /* synthetic */ ShareBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        ShareBottomSheetDialog shareBottomSheetDialog = this.o;
                        switch (i4) {
                            case 0:
                                ((ClipboardManager) shareBottomSheetDialog.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(shareBottomSheetDialog.s(R.string.app_name), shareBottomSheetDialog.C0.d.getUrl()));
                                shareBottomSheetDialog.h0();
                                break;
                            case 1:
                                new xc4().m0(shareBottomSheetDialog.X().k(), null);
                                shareBottomSheetDialog.h0();
                                break;
                            default:
                                rc4 rc4Var2 = shareBottomSheetDialog.C0;
                                hh3 hh3Var = rc4Var2.c;
                                String id = rc4Var2.d.getId();
                                hh3Var.getClass();
                                wo0 wo0VarI = App.f(false).i();
                                wo0VarI.getClass();
                                Log.d("BrowsingClient", "deleteShare()");
                                ((hd4) wo0VarI.o).a(((pn4) wo0VarI.n).f(), id).enqueue(new hh3(26));
                                shareBottomSheetDialog.B0.g(shareBottomSheetDialog.I);
                                shareBottomSheetDialog.h0();
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
}
