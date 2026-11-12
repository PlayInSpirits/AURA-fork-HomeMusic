package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c7 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ c7(eu0 eu0Var) {
        this.a = 10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return g51.e((Child) obj) != null;
            case 1:
                return !((Child) obj).isDir();
            case 2:
                return !((Child) obj).isDir();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Objects.nonNull(((Child) obj).getId());
            case 4:
                Child child = (Child) obj;
                return (child instanceof Download) && ((Download) child).getPlaylistId() != null;
            case 5:
                return Objects.nonNull(((Child) obj).getAlbumId());
            case 6:
                return Objects.nonNull(((Child) obj).getArtistId());
            case 7:
                return Objects.nonNull(((Child) obj).getGenre());
            case 8:
                return Objects.nonNull(((Child) obj).getYear());
            case 9:
                Child child2 = (Child) obj;
                if (g51.e(child2) == null) {
                    return !i51.b.contains(child2.getId());
                }
                return false;
            case 10:
                return eu0.d(((gn2) obj).a);
            case 11:
                float f = DownloaderService.w;
                return !Arrays.equals(((ns0) obj).a.t, eu0.c);
            case 12:
                ns0 ns0Var = (ns0) obj;
                if (Arrays.equals(ns0Var.a.t, eu0.c)) {
                    return false;
                }
                int i = ns0Var.b;
                return i == 0 || i == 2 || i == 7;
            case 13:
                return !Arrays.equals(((ns0) obj).a.t, eu0.c);
            case 14:
                return Objects.equals(((PodcastEpisode) obj).getStatus(), "completed");
            case 15:
                return "HOME_SECTOR_CONTINUE_LISTENING".equals(((HomeSector) obj).getId());
            case WaveRetry.MAX_FAILURES /* 16 */:
                Child child3 = (Child) obj;
                if (child3.getUserRating() != null) {
                    int iIntValue = child3.getUserRating().intValue();
                    App.b().getClass();
                    if (iIntValue < App.c().getInt("min_star_rating", 0)) {
                        if (child3.getUserRating() != null) {
                            return false;
                        }
                    }
                } else if (child3.getUserRating() != null) {
                    return false;
                }
                return true;
            case 17:
                return Objects.nonNull((PodcastEpisode) obj);
            case 18:
                return Objects.equals(((PodcastEpisode) obj).getStatus(), "completed");
            case 19:
                PodcastEpisode podcastEpisode = (PodcastEpisode) obj;
                return podcastEpisode != null && Objects.equals(podcastEpisode.getStatus(), "completed");
            case 20:
                return Objects.nonNull((Child) obj);
            default:
                return Objects.nonNull((Integer) obj);
        }
    }

    public /* synthetic */ c7(int i) {
        this.a = i;
    }
}
