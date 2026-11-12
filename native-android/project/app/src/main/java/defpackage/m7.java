package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                AlbumID3 albumID3 = (AlbumID3) obj;
                return albumID3.getName() != null ? albumID3.getName() : "";
            case 1:
                AlbumID3 albumID4 = (AlbumID3) obj;
                return albumID4.getArtist() != null ? albumID4.getArtist() : "";
            case 2:
                return Integer.valueOf(((AlbumID3) obj).getYear());
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                AlbumID3 albumID5 = (AlbumID3) obj;
                return albumID5.getCreated() != null ? albumID5.getCreated() : new Date(0L);
            case 4:
                AlbumID3 albumID6 = (AlbumID3) obj;
                return albumID6.getPlayed() != null ? albumID6.getPlayed() : new Date(0L);
            case 5:
                AlbumID3 albumID7 = (AlbumID3) obj;
                return Long.valueOf(albumID7.getPlayCount() != null ? albumID7.getPlayCount().longValue() : 0L);
            case 6:
                return ((AlbumID3) obj).getName();
            case 7:
                return ((AlbumID3) obj).getStarred();
            case 8:
                return ((AlbumID3) obj).getCreated();
            case 9:
                return ((ArtistID3) obj).getName();
            case 10:
                return Integer.valueOf(((ArtistID3) obj).getAlbumCount());
            case 11:
                return ((ArtistID3) obj).getStarred();
            case 12:
                return new ArrayList((TreeSet) obj);
            case 13:
                return ((Download) obj).getArtist();
            case 14:
                AlbumID3 albumID8 = (AlbumID3) obj;
                List<String> releaseTypes = albumID8.getReleaseTypes();
                if (releaseTypes != null && !releaseTypes.isEmpty() && releaseTypes.get(0) != null) {
                    String lowerCase = releaseTypes.get(0).trim().toLowerCase();
                    if (!lowerCase.isEmpty()) {
                        return lowerCase;
                    }
                }
                int iIntValue = albumID8.getSongCount() != null ? albumID8.getSongCount().intValue() : 0;
                if (iIntValue >= 8) {
                    return "album";
                }
                return iIntValue <= 2 ? "single" : "ep";
            case 15:
                return ((Child) obj).getYear();
            case WaveRetry.MAX_FAILURES /* 16 */:
                return ((Download) ((Child) obj)).getPlaylistId();
            case 17:
                return ((Child) obj).getId();
            case 18:
                return ((Child) obj).getAlbumId();
            case 19:
                return ((Child) obj).getArtistId();
            case 20:
                return ((Child) obj).getArtist();
            case 21:
                return ((Child) obj).getGenre();
            case 22:
                return (Download) obj;
            case 23:
                return (Double) obj;
            case 24:
                return ((Genre) obj).getGenre();
            case 25:
                return (Chronology) obj;
            case 26:
                return ((d64) obj).h;
            case 27:
                return ((d64) obj).g;
            case 28:
                d64 d64Var = (d64) obj;
                boolean zC = tv1.C(d64Var);
                boolean z = d64Var.c;
                if (zC) {
                    return Double.valueOf(z ? 90.0d : 25.0d);
                }
                return Double.valueOf(z ? 80.0d : 40.0d);
            default:
                return Double.valueOf(((d64) obj).c ? 100.0d : 0.0d);
        }
    }
}
