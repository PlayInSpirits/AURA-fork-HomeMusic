package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumBottomSheetDialog b;

    public /* synthetic */ b7(AlbumBottomSheetDialog albumBottomSheetDialog, int i) {
        this.a = i;
        this.b = albumBottomSheetDialog;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        AlbumBottomSheetDialog albumBottomSheetDialog = this.b;
        switch (i) {
            case 0:
                bo2.e(albumBottomSheetDialog.I0, (List) obj, true);
                ((au) ((MainActivity) albumBottomSheetDialog.X()).V.n).d(true);
                albumBottomSheetDialog.h0();
                break;
            case 1:
                Share share = (Share) obj;
                if (share == null) {
                    Toast.makeText(albumBottomSheetDialog.Z(), albumBottomSheetDialog.s(R.string.share_unsupported_error), 0).show();
                    albumBottomSheetDialog.h0();
                } else {
                    ((ClipboardManager) albumBottomSheetDialog.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(albumBottomSheetDialog.s(R.string.app_name), share.getUrl()));
                    albumBottomSheetDialog.B0.g(albumBottomSheetDialog.X());
                    albumBottomSheetDialog.h0();
                }
                break;
            case 2:
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>((List) obj));
                fl3 fl3Var = new fl3();
                fl3Var.c0(bundle);
                fl3Var.m0(albumBottomSheetDialog.X().k(), null);
                albumBottomSheetDialog.h0();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list = (List) obj;
                Collections.shuffle(list);
                bo2.q(albumBottomSheetDialog.I0, list, 0, "album");
                ((au) ((MainActivity) albumBottomSheetDialog.X()).V.n).d(true);
                albumBottomSheetDialog.h0();
                break;
            case 4:
                ArtistID3 artistID3 = (ArtistID3) obj;
                if (artistID3 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("ARTIST_OBJECT", artistID3);
                    q05.l(albumBottomSheetDialog).m(R.id.artistPageFragment, bundle2, null);
                } else {
                    Toast.makeText(albumBottomSheetDialog.Z(), albumBottomSheetDialog.s(R.string.album_error_retrieving_artist), 0).show();
                }
                albumBottomSheetDialog.h0();
                break;
            case 5:
                bo2.e(albumBottomSheetDialog.I0, (List) obj, false);
                ((au) ((MainActivity) albumBottomSheetDialog.X()).V.n).d(true);
                albumBottomSheetDialog.h0();
                break;
            default:
                List list2 = (List) obj;
                if (list2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
                albumBottomSheetDialog.F0 = list2;
                albumBottomSheetDialog.G0 = gi1.H(list2);
                albumBottomSheetDialog.E0.setOnClickListener(new y6(albumBottomSheetDialog, 2));
                albumBottomSheetDialog.o0();
                break;
        }
    }
}
