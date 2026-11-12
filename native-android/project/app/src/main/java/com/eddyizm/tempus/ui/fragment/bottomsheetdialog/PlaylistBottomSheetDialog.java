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
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistBottomSheetDialog;
import defpackage.aj2;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.cb4;
import defpackage.e03;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistBottomSheetDialog extends zt implements View.OnClickListener {
    public PlaylistWithSongs B0;
    public bl2 C0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_playlist_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            PlaylistWithSongs playlistWithSongs = (PlaylistWithSongs) bundle2.getParcelable("PLAYLIST_OBJECT");
            this.B0 = playlistWithSongs;
            if (playlistWithSongs != null) {
                q05.u((ViewGroup) viewInflate.findViewById(R.id.option_linear_layout));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.playlist_cover_image_view);
                Context context = viewInflate.getContext();
                String coverArtId = this.B0.getCoverArtId();
                vz3 vz3VarT = b11.g(context, coverArtId, 6, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.playlist_title_text_view);
                textView.setText(this.B0.getName());
                final int i2 = 1;
                textView.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.playlist_count_text_view)).setText(viewInflate.getContext().getString(R.string.playlist_counted_tracks, Integer.valueOf(this.B0.getSongCount()), e03.h(Long.valueOf(this.B0.getDuration()), false)));
                ((TextView) viewInflate.findViewById(R.id.play_next_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: bl3
                    public final /* synthetic */ PlaylistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        PlaylistBottomSheetDialog playlistBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                bo2.e(playlistBottomSheetDialog.C0, playlistBottomSheetDialog.B0.getEntries(), true);
                                ((au) ((MainActivity) playlistBottomSheetDialog.X()).V.n).d(true);
                                playlistBottomSheetDialog.h0();
                                break;
                            default:
                                bo2.e(playlistBottomSheetDialog.C0, playlistBottomSheetDialog.B0.getEntries(), false);
                                ((au) ((MainActivity) playlistBottomSheetDialog.X()).V.n).d(true);
                                playlistBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: bl3
                    public final /* synthetic */ PlaylistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i2;
                        PlaylistBottomSheetDialog playlistBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                bo2.e(playlistBottomSheetDialog.C0, playlistBottomSheetDialog.B0.getEntries(), true);
                                ((au) ((MainActivity) playlistBottomSheetDialog.X()).V.n).d(true);
                                playlistBottomSheetDialog.h0();
                                break;
                            default:
                                bo2.e(playlistBottomSheetDialog.C0, playlistBottomSheetDialog.B0.getEntries(), false);
                                ((au) ((MainActivity) playlistBottomSheetDialog.X()).V.n).d(true);
                                playlistBottomSheetDialog.h0();
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
            this.C0 = bl2Var;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.C0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
    }
}
