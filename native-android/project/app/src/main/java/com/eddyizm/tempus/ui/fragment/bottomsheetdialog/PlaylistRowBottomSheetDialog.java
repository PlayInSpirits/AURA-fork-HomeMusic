package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import defpackage.b11;
import defpackage.e03;
import defpackage.f9;
import defpackage.i7;
import defpackage.jm3;
import defpackage.k03;
import defpackage.k52;
import defpackage.kc1;
import defpackage.le1;
import defpackage.lg1;
import defpackage.mm3;
import defpackage.s24;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.xd0;
import defpackage.xv0;
import defpackage.z6;
import defpackage.zt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistRowBottomSheetDialog extends zt {
    public final mm3 B0 = new mm3();
    public Playlist C0;
    public f9 D0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_playlist_row_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            Playlist playlist = (Playlist) bundle2.getParcelable("PLAYLIST_OBJECT");
            this.C0 = playlist;
            if (playlist != null) {
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.playlist_cover_image_view);
                Context context = viewInflate.getContext();
                String coverArtId = this.C0.getCoverArtId();
                final int i2 = 6;
                vz3 vz3VarT = b11.g(context, coverArtId, 6, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.playlist_title_text_view);
                textView.setText(this.C0.getName());
                final int i3 = 1;
                textView.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.playlist_count_text_view)).setText(viewInflate.getContext().getString(R.string.playlist_counted_tracks, Integer.valueOf(this.C0.getSongCount()), e03.h(Long.valueOf(this.C0.getDuration()), false)));
                viewInflate.findViewById(R.id.play_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i;
                        Object obj = null;
                        final int i5 = 1;
                        final int i6 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i4) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i7 = i5;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i7) {
                                            case 0:
                                                int i8 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i8, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i8, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i7 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i8 = i7;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                int i9 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i9, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i9, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i5) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i6) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i8 = i6;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                int i9 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i9, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i9, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i6, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i4 = 3;
                viewInflate.findViewById(R.id.play_shuffle_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        Object obj = null;
                        final int i6 = 1;
                        final int i7 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i5) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i8 = i6;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                int i9 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i9, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i9, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i8 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i9 = i8;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                int i10 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i10, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i10, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i6) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i7) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i9 = i7;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                int i10 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i10, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i10, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i7, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i5 = 4;
                viewInflate.findViewById(R.id.play_next_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i5;
                        Object obj = null;
                        final int i7 = 1;
                        final int i8 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i9 = i7;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                int i10 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i10, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i10, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i9 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i10 = i9;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i10) {
                                            case 0:
                                                int i11 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i11, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i11, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i7) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i10 = i8;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i10) {
                                            case 0:
                                                int i11 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i11, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i11, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i8, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i6 = 5;
                viewInflate.findViewById(R.id.add_to_queue_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i6;
                        Object obj = null;
                        final int i8 = 1;
                        final int i9 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i7) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i10 = i8;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i10) {
                                            case 0:
                                                int i11 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i11, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i11, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i10 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i10;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i9;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i9, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                viewInflate.findViewById(R.id.download_all_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i2;
                        Object obj = null;
                        final int i8 = 1;
                        final int i9 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i7) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i8;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i10 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i10;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i8) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i9;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i9, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i7 = 7;
                viewInflate.findViewById(R.id.edit_playlist_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i7;
                        Object obj = null;
                        final int i9 = 1;
                        final int i10 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i8) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i11 = i9;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                int i12 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i12, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i12, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i11 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i12 = i11;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                int i13 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i13, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i13, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i9) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i10) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i12 = i10;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                int i13 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i13, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i13, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i10, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i8 = 8;
                viewInflate.findViewById(R.id.edit_playlist_details_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i9 = i8;
                        Object obj = null;
                        final int i10 = 1;
                        final int i11 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i9) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i12 = i10;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                int i13 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i13, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i13, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i12 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i13 = i12;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i13) {
                                            case 0:
                                                int i14 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i14, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i14, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i10) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i13 = i11;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i13) {
                                            case 0:
                                                int i14 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i14, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i14, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i11, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                View viewFindViewById = viewInflate.findViewById(R.id.pin_row);
                View viewFindViewById2 = viewInflate.findViewById(R.id.unpin_row);
                ((s24) this.B0.a.o).i().a(new String[]{"pinned_playlist"}, new k52(26)).e(v(), new z6(this, viewFindViewById, viewFindViewById2, i4));
                final int i9 = 9;
                viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i9;
                        Object obj = null;
                        final int i11 = 1;
                        final int i12 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i10) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i13 = i11;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i13) {
                                            case 0:
                                                int i14 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i14, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i14, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i13 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i13;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i12;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i12, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i3;
                        Object obj = null;
                        final int i11 = 1;
                        final int i12 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i10) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i11;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i13 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i13;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i11) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i12;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i12, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
                                break;
                        }
                    }
                });
                final int i10 = 2;
                viewInflate.findViewById(R.id.delete_row).setOnClickListener(new View.OnClickListener(this) { // from class: nm3
                    public final /* synthetic */ PlaylistRowBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = i10;
                        Object obj = null;
                        final int i12 = 1;
                        final int i13 = 0;
                        final PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = this.o;
                        switch (i11) {
                            case 0:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i14 = i12;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i15, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i15, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                playlistRowBottomSheetDialog.o0(false);
                                break;
                            case 2:
                                vg2 vg2Var = new vg2(playlistRowBottomSheetDialog.X(), 0);
                                vg2Var.p(R.string.playlist_editor_dialog_neutral_button);
                                vg2Var.a.f = playlistRowBottomSheetDialog.C0.getName();
                                playlistRowBottomSheetDialog.D0 = vg2Var.l(R.string.playlist_editor_dialog_neutral_button, new vr(5, playlistRowBottomSheetDialog)).j(R.string.playlist_editor_dialog_negative_button, null).h();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                final int i14 = 2;
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i15 = i14;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i15) {
                                            case 0:
                                                int i16 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i16, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i16, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 4:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i12) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 5:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: om3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i13) {
                                            case 0:
                                                bo2.e(mainActivity.P, list, false);
                                                Toast.makeText(mainActivity, R.string.playlist_added_to_queue, 0).show();
                                                break;
                                            default:
                                                bo2.e(mainActivity.P, list, true);
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                playlistRowBottomSheetDialog.p0(new BiConsumer() { // from class: pm3
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        int i15 = i13;
                                        PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog2 = playlistRowBottomSheetDialog;
                                        MainActivity mainActivity = (MainActivity) obj2;
                                        List list = (List) obj3;
                                        switch (i15) {
                                            case 0:
                                                int i16 = 2;
                                                if (ud3.o() != null) {
                                                    list.forEach(new xd0(i16, playlistRowBottomSheetDialog2, mainActivity));
                                                } else {
                                                    au0.w(mainActivity).a(gi1.H(list), (List) list.stream().map(new t8(i16, playlistRowBottomSheetDialog2)).collect(Collectors.toList()), false);
                                                }
                                                break;
                                            case 1:
                                                bo2.q(mainActivity.P, list, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                            default:
                                                ArrayList arrayList = new ArrayList(list);
                                                Collections.shuffle(arrayList);
                                                bo2.q(mainActivity.P, arrayList, 0, v13.a(playlistRowBottomSheetDialog2.C0.getId()));
                                                ((au) mainActivity.V.n).d(true);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                v23 v23VarL = q05.l(playlistRowBottomSheetDialog);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                v23VarL.m(R.id.playlistEditorFragment, bundle3, null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            case 8:
                                sl3 sl3Var = new sl3(i13, obj);
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("PLAYLIST_OBJECT", playlistRowBottomSheetDialog.C0);
                                sl3Var.c0(bundle4);
                                sl3Var.m0(playlistRowBottomSheetDialog.X().k(), null);
                                playlistRowBottomSheetDialog.h0();
                                break;
                            default:
                                playlistRowBottomSheetDialog.o0(true);
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
    public final void J() {
        super.J();
        f9 f9Var = this.D0;
        if (f9Var != null && f9Var.isShowing()) {
            this.D0.dismiss();
        }
        this.D0 = null;
    }

    public final void o0(boolean z) {
        Playlist playlist = this.C0;
        mm3 mm3Var = this.B0;
        new Thread(new lg1(21, mm3Var.b, playlist)).start();
        Playlist playlist2 = this.C0;
        if (z) {
            new Thread(new jm3(mm3Var, playlist2.getId(), 1)).start();
        } else {
            new Thread(new jm3(mm3Var, playlist2.getId(), 0)).start();
        }
        h0();
    }

    public final void p0(BiConsumer biConsumer) {
        kc1 kc1Var;
        MainActivity mainActivity = (MainActivity) e();
        if (mainActivity == null || (kc1Var = q().y) == null || kc1Var.T == null) {
            return;
        }
        h0();
        le1 le1VarV = kc1Var.v();
        String id = this.C0.getId();
        int i = 1;
        xd0 xd0Var = new xd0(i, biConsumer, mainActivity);
        k03 k03VarC = new mm3().c(id, true, null);
        k03VarC.e(le1VarV, new i7(i, k03VarC, xd0Var));
    }
}
