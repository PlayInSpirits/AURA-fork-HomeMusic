package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.PodcastCallback;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SettingsFragment;
import com.eddyizm.tempus.ui.fragment.ToolbarFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PodcastChannelBottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bj3(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r12) {
        int r0 = this.n;
        int r5 = 0;
        Object r11 = this.o;
        switch(r0) {
            case 0: goto L92;
            case 1: goto L85;
            case 2: goto L79;
            case 3: goto L72;
            case 4: goto L70;
            case 5: goto L68;
            case 6: goto L58;
            case 7: goto L56;
            case 8: goto L54;
            case 9: goto L47;
            case 10: goto L45;
            case 11: goto L43;
            case 12: goto L38;
            case 13: goto L36;
            case 14: goto L34;
            case 15: goto L32;
            case 16: goto L6;
            default: goto L4;
        };
    L4:
        he5 r13 = (he5) r11;
        Bundle r14 = b11.h("MEDIA_BY_YEAR", "MEDIA_BY_YEAR");
        uc4 r1 = r13.v;
        r14.putInt("year_object", ((Integer) r1.s.get(r13.c())).intValue());
        r1.r.onYearClick(r14);
        return;
    L6:
        final ToolbarFragment r15 = (ToolbarFragment) r11;
        ArrayList r2 = r15.p0;
        PopupMenu r3 = new PopupMenu(r15.Z(), r12);
        String r16 = ud3.k();
        if (r16 != null) goto L9;
        int r4 = 0;
    L10:
        r3.getMenu().add(1, 0, 0, R.string.settings_music_library_all);
        int r6 = 0;
    L12:
        if (r6 >= r2.size()) goto L24;
        MusicFolder r7 = (MusicFolder) r2.get(r6);
        if (r7.getId() == null) goto L23;
        if (r7.getName() == null) goto L19;
        String r8 = r7.getName();
    L20:
        int r10 = r6 + 1;
        r3.getMenu().add(1, r10, r10, r8);
        if (r7.getId().equals(r16) == false) goto L23;
        r4 = r10;
        goto L23
    L19:
        r8 = r7.getId();
    L23:
        r6 = r6 + 1;
        goto L12
    L24:
        r3.getMenu().setGroupCheckable(1, true, true);
        if (r4 == (-1)) goto L27;
        r3.getMenu().findItem(r4).setChecked(true);
    L27:
        final ArrayList r17 = new ArrayList();
        int r9 = r2.size();
    L28:
        if (r5 >= r9) goto L30;
        Object r18 = r2.get(r5);
        r5 = r5 + 1;
        r17.add(((MusicFolder) r18).getId());
        goto L28
    L30:
        r3.setOnMenuItemClickListener(new ev4(r15, r17));
        r3.show();
        return;
    L9:
        r4 = -1;
        goto L10
    L32:
        xd4 r19 = (xd4) r11;
        Bundle r110 = new Bundle();
        s6 r20 = r19.v;
        r110.putParcelable("TRACK_OBJECT", (Parcelable) r20.r.get(r19.c()));
        r110.putBoolean("MEDIA_MIX", true);
        ((cp1) r20.t).onMediaClick(r110);
        return;
    L34:
        ((SettingsFragment) r11).l0.T.o();
        return;
    L36:
        la4 r111 = (la4) r11;
        Bundle r112 = new Bundle();
        zd0 r21 = r111.v;
        r112.putParcelable("server_object", (Parcelable) r21.r.get(r111.c()));
        ((LoginFragment) r21.s).onServerClick(r112);
        return;
    L38:
        sl3 r113 = (sl3) r11;
        Editable r114 = ((TextInputEditText) ((hd5) r113.D0).p).getText();
        Objects.requireNonNull(r114);
        String r115 = r114.toString().trim();
        r113.C0 = r115;
        if (TextUtils.isEmpty(r115) == false) goto L41;
        ((TextInputEditText) ((hd5) r113.D0).p).setError(r113.s(R.string.error_required));
        return;
    L41:
        xm3 r116 = (xm3) r113.E0;
        String r22 = r113.C0;
        r116.e.k(null);
        r116.d.k(Boolean.FALSE);
        r116.c.getClass();
        wo0 r23 = App.f(false).h();
        r23.getClass();
        Log.d("PodcastClient", "createPodcastChannel()");
        ((hn3) r23.o).d(((pn4) r23.n).f(), r22).enqueue(new om1(19, r116));
        ((PodcastCallback) r113.F0).onDismiss();
        Dialog r117 = r113.w0;
        Objects.requireNonNull(r117);
        r117.dismiss();
        return;
    L43:
        PodcastChannelCatalogueFragment r118 = (PodcastChannelCatalogueFragment) r11;
        r118.h0(r12);
        r118.m0.T.o();
        return;
    L45:
        vm3 r119 = (vm3) r11;
        Bundle r120 = new Bundle();
        ej r24 = r119.v;
        r120.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) r24.r.get(r119.c()));
        ((PodcastChannelCatalogueFragment) r24.t).onPodcastChannelClick(r120);
        return;
    L47:
        PodcastChannelBottomSheetDialog r121 = (PodcastChannelBottomSheetDialog) r11;
        um3 r122 = r121.B0;
        PodcastChannel r25 = r122.d;
        if (r25 != null) goto L50;
    L52:
        r121.h0();
        return;
    L50:
        if (r25.getId() == null) goto L52;
        hh3 r26 = r122.c;
        String r27 = r122.d.getId();
        r26.getClass();
        wo0 r28 = App.f(false).h();
        r28.getClass();
        Log.d("PodcastClient", "deletePodcastChannel()");
        ((hn3) r28.o).a(((pn4) r28.n).f(), r27).enqueue(new si1(16, r122));
        goto L52
    L54:
        PlaylistPageFragment r123 = (PlaylistPageFragment) r11;
        ((InputMethodManager) r123.X().getSystemService("input_method")).hideSoftInputFromWindow(r12.getWindowToken(), 0);
        r123.m0.T.o();
        return;
    L56:
        q05.l((PlaylistEditorFragment) r11).o();
        return;
    L58:
        ol3 r124 = (ol3) r11;
        final int r125 = r124.c();
        if (r125 == (-1)) goto L105;
        final PlaylistEditorFragment r126 = (PlaylistEditorFragment) r124.v.s;
        wl3 r29 = r126.m0;
        if (r29.i == true) goto L106;
        List r30 = (List) r29.g.d();
        Objects.requireNonNull(r30);
        final Child r31 = (Child) r30.remove(r125);
        r126.n0.n.f(r125, 1);
        MainActivity r32 = (MainActivity) r126.X();
        qp4 r33 = r32.R;
        if (r33 == null) goto L107;
        final boolean[] r34 = {false};
        FrameLayout r35 = (FrameLayout) r33.c;
        int[] r36 = qg4.E;
        qg4 r37 = qg4.h(r35, r35.getResources().getText(R.string.playlist_editor_removed_track), 0);
        r37.e(r32.u());
        r37.i(R.string.song_bottom_sheet_undo, new ul3(r126, r34, r125, r31));
        r126.p0 = r37;
        r37.j();
        return;
    L107:
        return;
    L106:
        return;
    L105:
        return;
    L68:
        nl3 r127 = (nl3) r11;
        Bundle r128 = new Bundle();
        zd0 r38 = r127.v;
        r128.putParcelable("PLAYLIST_OBJECT", (Parcelable) r38.r.get(r127.c()));
        ((fl3) r38.s).onPlaylistClick(r128);
        return;
    L70:
        xk3 r129 = (xk3) r11;
        Bundle r130 = new Bundle();
        yk3 r39 = r129.v;
        r130.putParcelableArrayList("TRACKS_OBJECT", new ArrayList(r39.s));
        r130.putInt("ITEM_POSITION", r129.c());
        r39.q.onMediaClick(r130);
        return;
    L72:
        qj3 r131 = (qj3) r11;
        r131.g();
        if (r12.getId() != R.id.exo_overflow_show) goto L76;
        r131.r.start();
        return;
    L76:
        if (r12.getId() != R.id.exo_overflow_hide) goto L109;
        r131.s.start();
        return;
    L109:
        return;
    L79:
        PlayerControlView r132 = ((cj3) r11).t;
        qi3 r133 = r132.D0;
        if (r133 != null) goto L82;
        return;
    L82:
        if (r133.S0(29) == false) goto L111;
        r132.D0.M(r132.D0.E0().a().d(3).g().i().k().b());
        r132.E.dismiss();
        return;
    L111:
        return;
    L85:
        ij3 r134 = (ij3) r11;
        PlayerControlView r135 = r134.x;
        int r136 = r134.c();
        View r40 = r135.T;
        if (r136 != 0) goto L88;
        gj3 r137 = r135.A;
        r40.getClass();
        r135.d(r137, r40);
        return;
    L88:
        if (r136 != 1) goto L90;
        cj3 r138 = r135.C;
        r40.getClass();
        r135.d(r138, r40);
        return;
    L90:
        r135.E.dismiss();
        return;
    L92:
        PlayerControlView r139 = ((cj3) r11).t;
        qi3 r140 = r139.D0;
        if (r140 != null) goto L95;
        return;
    L95:
        if (r140.S0(29) == false) goto L115;
        cw4 r141 = r139.D0.E0();
        qi3 r41 = r139.D0;
        String r42 = f35.a;
        r41.M(r141.a().d(1).l(1, false).b());
        r139.z.r[1] = r139.getResources().getString(R.string.exo_track_selection_auto);
        r139.E.dismiss();
        return;
    }
}
