package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hk implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ c12 c;

    public /* synthetic */ hk(c12 c12Var, k03 k03Var, int i) {
        this.a = i;
        this.c = c12Var;
        this.b = k03Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        k03 k03Var = this.b;
        c12 c12Var = this.c;
        switch (i) {
            case 0:
                Child child = (Child) obj;
                k03Var.j(this);
                MainActivity mainActivity = (MainActivity) c12Var.o;
                if (child != null) {
                    mainActivity.getClass();
                    e75 d = mainActivity.d();
                    b75 r = gh0.r(mainActivity);
                    tf0 q = gh0.q(mainActivity);
                    r.getClass();
                    q.getClass();
                    bq4 bq4Var = new bq4(d, r, q);
                    i30 a = kx3.a(ii4.class);
                    String b = a.b();
                    if (b == null) {
                        kf2.n("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        ((ii4) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).h = child;
                        SongBottomSheetDialog songBottomSheetDialog = new SongBottomSheetDialog();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("TRACK_OBJECT", child);
                        songBottomSheetDialog.c0(bundle);
                        songBottomSheetDialog.m0(mainActivity.k(), null);
                        break;
                    }
                } else {
                    Toast.makeText(mainActivity, R.string.asset_link_error_song, 0).show();
                    break;
                }
            case 1:
                AlbumID3 albumID3 = (AlbumID3) obj;
                k03Var.j(this);
                if (albumID3 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("ALBUM_OBJECT", albumID3.strippedForNav());
                    c12Var.g(R.id.albumPageFragment, bundle2);
                    break;
                } else {
                    Toast.makeText((MainActivity) c12Var.o, R.string.asset_link_error_album, 0).show();
                    break;
                }
            case 2:
                ArtistID3 artistID3 = (ArtistID3) obj;
                k03Var.j(this);
                if (artistID3 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("ARTIST_OBJECT", artistID3.strippedForNav());
                    c12Var.g(R.id.artistPageFragment, bundle3);
                    break;
                } else {
                    Toast.makeText((MainActivity) c12Var.o, R.string.asset_link_error_artist, 0).show();
                    break;
                }
            default:
                Playlist playlist = (Playlist) obj;
                k03Var.j(this);
                if (playlist != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("PLAYLIST_OBJECT", playlist);
                    c12Var.g(R.id.playlistPageFragment, bundle4);
                    break;
                } else {
                    Toast.makeText((MainActivity) c12Var.o, R.string.asset_link_error_playlist, 0).show();
                    break;
                }
        }
    }
}
