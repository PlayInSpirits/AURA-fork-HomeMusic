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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ c12 c;

    public /* synthetic */ hk(c12 r1, k03 r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r5) {
        int r0 = this.a;
        k03 r2 = this.b;
        c12 r3 = this.c;
        switch(r0) {
            case 0: goto L19;
            case 1: goto L14;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        Playlist r6 = (Playlist) r5;
        r2.j(this);
        if (r6 != null) goto L7;
        Toast.makeText((MainActivity) r3.o, R.string.asset_link_error_playlist, 0).show();
        return;
    L7:
        Bundle r4 = new Bundle();
        r4.putParcelable("PLAYLIST_OBJECT", r6);
        r3.g(R.id.playlistPageFragment, r4);
        return;
    L9:
        ArtistID3 r7 = (ArtistID3) r5;
        r2.j(this);
        if (r7 != null) goto L12;
        Toast.makeText((MainActivity) r3.o, R.string.asset_link_error_artist, 0).show();
        return;
    L12:
        Bundle r8 = new Bundle();
        r8.putParcelable("ARTIST_OBJECT", r7.strippedForNav());
        r3.g(R.id.artistPageFragment, r8);
        return;
    L14:
        AlbumID3 r9 = (AlbumID3) r5;
        r2.j(this);
        if (r9 != null) goto L17;
        Toast.makeText((MainActivity) r3.o, R.string.asset_link_error_album, 0).show();
        return;
    L17:
        Bundle r10 = new Bundle();
        r10.putParcelable("ALBUM_OBJECT", r9.strippedForNav());
        r3.g(R.id.albumPageFragment, r10);
        return;
    L19:
        Child r11 = (Child) r5;
        r2.j(this);
        MainActivity r12 = (MainActivity) r3.o;
        if (r11 != null) goto L22;
        Toast.makeText(r12, R.string.asset_link_error_song, 0).show();
        return;
    L22:
        r12.getClass();
        e75 r1 = r12.d();
        b75 r13 = gh0.r(r12);
        tf0 r14 = gh0.q(r12);
        r13.getClass();
        r14.getClass();
        bq4 r15 = new bq4(r1, r13, r14);
        i30 r16 = kx3.a(ii4.class);
        String r17 = r16.b();
        if (r17 == null) goto L25;
        ((ii4) r15.l(r16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r17))).h = r11;
        SongBottomSheetDialog r18 = new SongBottomSheetDialog();
        Bundle r19 = new Bundle();
        r19.putParcelable("TRACK_OBJECT", r11);
        r18.c0(r19);
        r18.m0(r12.k(), null);
        return;
    L25:
        kf2.n("Local and anonymous classes can not be ViewModels");
    }
}
