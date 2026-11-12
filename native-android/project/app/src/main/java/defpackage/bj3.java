package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bj3(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                PlayerControlView playerControlView = ((cj3) obj).t;
                qi3 qi3Var = playerControlView.D0;
                if (qi3Var != null && qi3Var.S0(29)) {
                    cw4 cw4VarE0 = playerControlView.D0.E0();
                    qi3 qi3Var2 = playerControlView.D0;
                    String str = f35.a;
                    qi3Var2.M(cw4VarE0.a().d(1).l(1, false).b());
                    playerControlView.z.r[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
                    playerControlView.E.dismiss();
                    break;
                }
                break;
            case 1:
                ij3 ij3Var = (ij3) obj;
                PlayerControlView playerControlView2 = ij3Var.x;
                int iC = ij3Var.c();
                View view2 = playerControlView2.T;
                if (iC == 0) {
                    gj3 gj3Var = playerControlView2.A;
                    view2.getClass();
                    playerControlView2.d(gj3Var, view2);
                } else if (iC == 1) {
                    cj3 cj3Var = playerControlView2.C;
                    view2.getClass();
                    playerControlView2.d(cj3Var, view2);
                } else {
                    playerControlView2.E.dismiss();
                }
                break;
            case 2:
                PlayerControlView playerControlView3 = ((cj3) obj).t;
                qi3 qi3Var3 = playerControlView3.D0;
                if (qi3Var3 != null && qi3Var3.S0(29)) {
                    playerControlView3.D0.M(playerControlView3.D0.E0().a().d(3).g().i().k().b());
                    playerControlView3.E.dismiss();
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qj3 qj3Var = (qj3) obj;
                qj3Var.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    qj3Var.r.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    qj3Var.s.start();
                }
                break;
            case 4:
                xk3 xk3Var = (xk3) obj;
                Bundle bundle = new Bundle();
                yk3 yk3Var = xk3Var.v;
                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(yk3Var.s));
                bundle.putInt("ITEM_POSITION", xk3Var.c());
                yk3Var.q.onMediaClick(bundle);
                break;
            case 5:
                nl3 nl3Var = (nl3) obj;
                Bundle bundle2 = new Bundle();
                zd0 zd0Var = nl3Var.v;
                bundle2.putParcelable("PLAYLIST_OBJECT", (Parcelable) zd0Var.r.get(nl3Var.c()));
                ((fl3) zd0Var.s).onPlaylistClick(bundle2);
                break;
            case 6:
                ol3 ol3Var = (ol3) obj;
                final int iC2 = ol3Var.c();
                if (iC2 != -1) {
                    final PlaylistEditorFragment playlistEditorFragment = (PlaylistEditorFragment) ol3Var.v.s;
                    wl3 wl3Var = playlistEditorFragment.m0;
                    if (!wl3Var.i) {
                        List list = (List) wl3Var.g.d();
                        Objects.requireNonNull(list);
                        final Child child = (Child) list.remove(iC2);
                        playlistEditorFragment.n0.n.f(iC2, 1);
                        MainActivity mainActivity = (MainActivity) playlistEditorFragment.X();
                        qp4 qp4Var = mainActivity.R;
                        if (qp4Var != null) {
                            final boolean[] zArr = {false};
                            FrameLayout frameLayout = (FrameLayout) qp4Var.c;
                            int[] iArr = qg4.E;
                            qg4 qg4VarH = qg4.h(frameLayout, frameLayout.getResources().getText(R.string.playlist_editor_removed_track), 0);
                            qg4VarH.e(mainActivity.u());
                            qg4VarH.i(R.string.song_bottom_sheet_undo, new View.OnClickListener() { // from class: ul3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int iMin;
                                    Child child2;
                                    PlaylistEditorFragment playlistEditorFragment2 = playlistEditorFragment;
                                    if (playlistEditorFragment2.n0 != null) {
                                        boolean[] zArr2 = zArr;
                                        if (zArr2[0]) {
                                            return;
                                        }
                                        wl3 wl3Var2 = playlistEditorFragment2.m0;
                                        if (wl3Var2.i) {
                                            return;
                                        }
                                        zArr2[0] = true;
                                        List list2 = (List) wl3Var2.g.d();
                                        if (list2 == null || (child2 = child) == null) {
                                            iMin = -1;
                                        } else {
                                            iMin = Math.min(Math.max(iC2, 0), list2.size());
                                            list2.add(iMin, child2);
                                        }
                                        if (iMin >= 0) {
                                            playlistEditorFragment2.n0.n.e(iMin, 1);
                                        }
                                    }
                                }
                            });
                            playlistEditorFragment.p0 = qg4VarH;
                            qg4VarH.j();
                            break;
                        }
                    }
                }
                break;
            case 7:
                q05.l((PlaylistEditorFragment) obj).o();
                break;
            case 8:
                PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) obj;
                ((InputMethodManager) playlistPageFragment.X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                playlistPageFragment.m0.T.o();
                break;
            case 9:
                PodcastChannelBottomSheetDialog podcastChannelBottomSheetDialog = (PodcastChannelBottomSheetDialog) obj;
                um3 um3Var = podcastChannelBottomSheetDialog.B0;
                PodcastChannel podcastChannel = um3Var.d;
                if (podcastChannel != null && podcastChannel.getId() != null) {
                    hh3 hh3Var = um3Var.c;
                    String id = um3Var.d.getId();
                    hh3Var.getClass();
                    wo0 wo0VarH = App.f(false).h();
                    wo0VarH.getClass();
                    Log.d("PodcastClient", "deletePodcastChannel()");
                    ((hn3) wo0VarH.o).a(((pn4) wo0VarH.n).f(), id).enqueue(new si1(16, um3Var));
                }
                podcastChannelBottomSheetDialog.h0();
                break;
            case 10:
                vm3 vm3Var = (vm3) obj;
                Bundle bundle3 = new Bundle();
                ej ejVar = vm3Var.v;
                bundle3.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) ejVar.r.get(vm3Var.c()));
                ((PodcastChannelCatalogueFragment) ejVar.t).onPodcastChannelClick(bundle3);
                break;
            case 11:
                PodcastChannelCatalogueFragment podcastChannelCatalogueFragment = (PodcastChannelCatalogueFragment) obj;
                podcastChannelCatalogueFragment.h0(view);
                podcastChannelCatalogueFragment.m0.T.o();
                break;
            case 12:
                sl3 sl3Var = (sl3) obj;
                Editable text = ((TextInputEditText) ((hd5) sl3Var.D0).p).getText();
                Objects.requireNonNull(text);
                String strTrim = text.toString().trim();
                sl3Var.C0 = strTrim;
                if (TextUtils.isEmpty(strTrim)) {
                    ((TextInputEditText) ((hd5) sl3Var.D0).p).setError(sl3Var.s(R.string.error_required));
                } else {
                    xm3 xm3Var = (xm3) sl3Var.E0;
                    String str2 = sl3Var.C0;
                    xm3Var.e.k(null);
                    xm3Var.d.k(Boolean.FALSE);
                    xm3Var.c.getClass();
                    wo0 wo0VarH2 = App.f(false).h();
                    wo0VarH2.getClass();
                    Log.d("PodcastClient", "createPodcastChannel()");
                    ((hn3) wo0VarH2.o).d(((pn4) wo0VarH2.n).f(), str2).enqueue(new om1(19, xm3Var));
                    ((PodcastCallback) sl3Var.F0).onDismiss();
                    Dialog dialog = sl3Var.w0;
                    Objects.requireNonNull(dialog);
                    dialog.dismiss();
                }
                break;
            case 13:
                la4 la4Var = (la4) obj;
                Bundle bundle4 = new Bundle();
                zd0 zd0Var2 = la4Var.v;
                bundle4.putParcelable("server_object", (Parcelable) zd0Var2.r.get(la4Var.c()));
                ((LoginFragment) zd0Var2.s).onServerClick(bundle4);
                break;
            case 14:
                ((SettingsFragment) obj).l0.T.o();
                break;
            case 15:
                xd4 xd4Var = (xd4) obj;
                Bundle bundle5 = new Bundle();
                s6 s6Var = xd4Var.v;
                bundle5.putParcelable("TRACK_OBJECT", (Parcelable) s6Var.r.get(xd4Var.c()));
                bundle5.putBoolean("MEDIA_MIX", true);
                ((cp1) s6Var.t).onMediaClick(bundle5);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                final ToolbarFragment toolbarFragment = (ToolbarFragment) obj;
                ArrayList arrayList = toolbarFragment.p0;
                PopupMenu popupMenu = new PopupMenu(toolbarFragment.Z(), view);
                String strK = ud3.k();
                int i3 = strK == null ? 0 : -1;
                popupMenu.getMenu().add(1, 0, 0, R.string.settings_music_library_all);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    MusicFolder musicFolder = (MusicFolder) arrayList.get(i4);
                    if (musicFolder.getId() != null) {
                        int i5 = i4 + 1;
                        popupMenu.getMenu().add(1, i5, i5, musicFolder.getName() != null ? musicFolder.getName() : musicFolder.getId());
                        if (musicFolder.getId().equals(strK)) {
                            i3 = i5;
                        }
                    }
                }
                popupMenu.getMenu().setGroupCheckable(1, true, true);
                if (i3 != -1) {
                    popupMenu.getMenu().findItem(i3).setChecked(true);
                }
                final ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(((MusicFolder) obj2).getId());
                }
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: ev4
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int itemId = menuItem.getItemId() - 1;
                        String str3 = itemId < 0 ? "default" : (String) arrayList2.get(itemId);
                        if (str3 == null) {
                            return true;
                        }
                        toolbarFragment.o0.d(str3);
                        return true;
                    }
                });
                popupMenu.show();
                break;
            default:
                he5 he5Var = (he5) obj;
                Bundle bundleH = b11.h("MEDIA_BY_YEAR", "MEDIA_BY_YEAR");
                uc4 uc4Var = he5Var.v;
                bundleH.putInt("year_object", ((Integer) uc4Var.s.get(he5Var.c())).intValue());
                uc4Var.r.onYearClick(bundleH);
                break;
        }
    }
}
