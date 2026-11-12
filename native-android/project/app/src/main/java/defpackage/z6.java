package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(MainActivity mainActivity, k03 k03Var, String str) {
        this.a = 2;
        this.c = mainActivity;
        this.d = k03Var;
        this.b = str;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        KeyEvent.Callback callback = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                AlbumBottomSheetDialog albumBottomSheetDialog = (AlbumBottomSheetDialog) obj3;
                ic2 ic2Var = (ic2) obj2;
                MainActivity mainActivity = (MainActivity) callback;
                List list = (List) obj;
                if (list != null && !list.isEmpty() && albumBottomSheetDialog.e() != null) {
                    e03.o(list);
                    if (!albumBottomSheetDialog.H0) {
                        bo2.e(ic2Var, list, true);
                    } else {
                        albumBottomSheetDialog.H0 = false;
                        bo2.q(ic2Var, list, 0, "album");
                        ((au) mainActivity.V.n).d(true);
                        if (albumBottomSheetDialog.y()) {
                            albumBottomSheetDialog.h0();
                        }
                    }
                    break;
                }
                break;
            case 1:
                ArtistBottomSheetDialog artistBottomSheetDialog = (ArtistBottomSheetDialog) obj3;
                ic2 ic2Var2 = (ic2) obj2;
                MainActivity mainActivity2 = (MainActivity) callback;
                List list2 = (List) obj;
                if (list2 != null && !list2.isEmpty() && artistBottomSheetDialog.e() != null) {
                    e03.o(list2);
                    if (!artistBottomSheetDialog.E0) {
                        bo2.e(ic2Var2, list2, true);
                    } else {
                        artistBottomSheetDialog.E0 = false;
                        bo2.q(ic2Var2, list2, 0, "artist");
                        ((au) mainActivity2.V.n).d(true);
                        if (artistBottomSheetDialog.y()) {
                            artistBottomSheetDialog.h0();
                        }
                    }
                    break;
                }
                break;
            case 2:
                MainActivity mainActivity3 = (MainActivity) callback;
                String str = (String) obj2;
                SubsonicResponse subsonicResponse = (SubsonicResponse) obj;
                int i2 = ((k03) obj3) == mainActivity3.Q ? 1 : 0;
                if (i2 != 0) {
                    mainActivity3.Q = null;
                }
                if (i2 != 0 && subsonicResponse != null && str.equals(ud3.v())) {
                    ud3.m0(str);
                    App.p = App.d();
                    ra0.a();
                    mainActivity3.d().a();
                    v23 v23Var = (v23) ((ss0) mainActivity3.U.o).q;
                    int i3 = v23Var.g().u;
                    v23Var.p(i3, true);
                    v23Var.m(i3, null, null);
                    break;
                } else {
                    ra0.a();
                    if (i2 != 0 && subsonicResponse == null) {
                        App.b().getClass();
                        App.c().edit().putLong("next_server_switch", System.currentTimeMillis()).apply();
                        mainActivity3.G();
                        break;
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                View view = (View) obj2;
                View view2 = (View) callback;
                boolean zAnyMatch = ((List) obj).stream().anyMatch(new tj(5, (PlaylistRowBottomSheetDialog) obj3));
                view.setVisibility(zAnyMatch ? 8 : 0);
                view2.setVisibility(zAnyMatch ? 0 : 8);
                break;
            default:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj3;
                ic2 ic2Var3 = (ic2) obj2;
                MainActivity mainActivity4 = (MainActivity) callback;
                List list3 = (List) obj;
                if (list3 != null && !list3.isEmpty() && songBottomSheetDialog.e() != null) {
                    e03.o(list3);
                    if (!songBottomSheetDialog.N0) {
                        bo2.e(ic2Var3, list3, true);
                    } else {
                        songBottomSheetDialog.N0 = false;
                        bo2.o(ic2Var3, list3, 0);
                        if (!songBottomSheetDialog.E0) {
                            ((au) mainActivity4.V.n).d(true);
                        }
                        if (songBottomSheetDialog.y()) {
                            songBottomSheetDialog.h0();
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z6(zt ztVar, Object obj, KeyEvent.Callback callback, int i) {
        this.a = i;
        this.d = ztVar;
        this.b = obj;
        this.c = callback;
    }
}
