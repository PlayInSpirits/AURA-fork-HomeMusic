package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ AlbumBottomSheetDialog o;

    public /* synthetic */ y6(AlbumBottomSheetDialog albumBottomSheetDialog, int i) {
        this.n = i;
        this.o = albumBottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bl2 bl2Var;
        int i = this.n;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        AlbumBottomSheetDialog albumBottomSheetDialog = this.o;
        switch (i) {
            case 0:
                j7 j7Var = albumBottomSheetDialog.C0;
                pa paVar = j7Var.d;
                String artistId = j7Var.g.getArtistId();
                paVar.getClass();
                pa.v(artistId).e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, 4));
                break;
            case 1:
                j7 j7Var2 = albumBottomSheetDialog.C0;
                hh3 hh3Var = j7Var2.f;
                String id = j7Var2.g.getId();
                String name = j7Var2.g.getName();
                hh3Var.getClass();
                hh3.h(id, name).e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, i3));
                break;
            case 2:
                String strO = ud3.o();
                List list = albumBottomSheetDialog.F0;
                if (strO == null) {
                    au0.w(albumBottomSheetDialog.Z()).f(albumBottomSheetDialog.G0, (List) list.stream().map(new hu3(6)).collect(Collectors.toList()));
                } else {
                    list.forEach(new e7());
                }
                albumBottomSheetDialog.h0();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                j7 j7Var3 = albumBottomSheetDialog.C0;
                Context contextZ = albumBottomSheetDialog.Z();
                d34 d34Var = j7Var3.e;
                if (!n61.f(2, j7Var3.g.getId(), j7Var3.g.getStarred() != null)) {
                    boolean zT = hw.t();
                    AlbumID3 albumID3 = j7Var3.g;
                    if (!zT) {
                        String id2 = albumID3.getId();
                        h7 h7Var = new h7(j7Var3, 1);
                        d34Var.getClass();
                        d34.I(null, id2, null, h7Var);
                        j7Var3.g.setStarred(new Date());
                        App.b().getClass();
                        if (App.c().getBoolean("sync_starred_albums_for_offline_use", false)) {
                            k03 k03VarL = rv2.l(j7Var3.g.getId());
                            k03VarL.f(new i7(contextZ, k03VarL, i4));
                        }
                    } else {
                        d34Var.J(null, albumID3.getId(), true, null);
                        j7Var3.g.setStarred(new Date());
                    }
                } else {
                    boolean zT2 = hw.t();
                    AlbumID3 albumID4 = j7Var3.g;
                    if (!zT2) {
                        String id3 = albumID4.getId();
                        h7 h7Var2 = new h7(j7Var3, 0);
                        d34Var.getClass();
                        d34.K(null, id3, null, h7Var2);
                        j7Var3.g.setStarred(null);
                    } else {
                        d34Var.J(null, albumID4.getId(), false, null);
                        j7Var3.g.setStarred(null);
                    }
                }
                break;
            case 4:
                MainActivity mainActivity = (MainActivity) albumBottomSheetDialog.e();
                if (mainActivity != null && (bl2Var = mainActivity.P) != null) {
                    albumBottomSheetDialog.H0 = true;
                    Toast.makeText(albumBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                    j7 j7Var4 = albumBottomSheetDialog.C0;
                    AlbumID3 albumID5 = albumBottomSheetDialog.D0;
                    k03 k03Var = j7Var4.h;
                    k03Var.k(Collections.EMPTY_LIST);
                    j7Var4.c.getClass();
                    new xi4(2).o(albumID5.getId(), fb0.o, 30).e(mainActivity, new g7(k03Var, 0));
                    k03Var.e(mainActivity, new z6(albumBottomSheetDialog, bl2Var, mainActivity, i4));
                }
                break;
            case 5:
                rv2.l(albumBottomSheetDialog.D0.getId()).e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, 3));
                break;
            case 6:
                albumBottomSheetDialog.C0.c().e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, i4));
                break;
            case 7:
                albumBottomSheetDialog.C0.c().e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, 5));
                break;
            default:
                albumBottomSheetDialog.C0.c().e(albumBottomSheetDialog.v(), new b7(albumBottomSheetDialog, i2));
                break;
        }
    }
}
