package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c7 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ c7(eu0 r1) {
        this.a = 10;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object r5) {
        switch(this.a) {
            case 0: goto L73;
            case 1: goto L71;
            case 2: goto L69;
            case 3: goto L67;
            case 4: goto L60;
            case 5: goto L59;
            case 6: goto L57;
            case 7: goto L55;
            case 8: goto L53;
            case 9: goto L46;
            case 10: goto L45;
            case 11: goto L42;
            case 12: goto L32;
            case 13: goto L31;
            case 14: goto L29;
            case 15: goto L27;
            case 16: goto L18;
            case 17: goto L17;
            case 18: goto L15;
            case 19: goto L8;
            case 20: goto L7;
            default: goto L5;
        };
    L8:
        PodcastEpisode r6 = (PodcastEpisode) r5;
        if (r6 != null) goto L11;
        return false;
    L11:
        if (Objects.equals(r6.getStatus(), "completed") == true) goto L13;
        return false;
    L13:
        return true;
    L18:
        Child r7 = (Child) r5;
        if (r7.getUserRating() == null) goto L23;
        int r4 = r7.getUserRating().intValue();
        App.b().getClass();
        if (r4 < App.c().getInt("min_star_rating", 0)) goto L23;
    L25:
        return true;
    L23:
        if (r7.getUserRating() == null) goto L25;
        return false;
    L32:
        ns0 r8 = (ns0) r5;
        if (Arrays.equals(r8.a.t, eu0.c) == true) goto L79;
        int r9 = r8.b;
        if (r9 == 0) goto L41;
        if (r9 == 2) goto L41;
        if (r9 == 7) goto L41;
        return false;
    L41:
        return true;
    L79:
        return false;
    L42:
        float r10 = DownloaderService.w;
        return !Arrays.equals(((ns0) r5).a.t, eu0.c);
    L46:
        Child r11 = (Child) r5;
        if (g51.e(r11) == null) goto L49;
        return false;
    L49:
        if (i51.b.contains(r11.getId()) == false) goto L51;
        return false;
    L51:
        return true;
    L60:
        Child r12 = (Child) r5;
        if ((r12 instanceof Download) == true) goto L63;
        return false;
    L63:
        if (((Download) r12).getPlaylistId() != null) goto L65;
        return false;
    L65:
        return true;
    L5:
        return Objects.nonNull((Integer) r5);
    L7:
        return Objects.nonNull((Child) r5);
    L15:
        return Objects.equals(((PodcastEpisode) r5).getStatus(), "completed");
    L17:
        return Objects.nonNull((PodcastEpisode) r5);
    L27:
        return "HOME_SECTOR_CONTINUE_LISTENING".equals(((HomeSector) r5).getId());
    L29:
        return Objects.equals(((PodcastEpisode) r5).getStatus(), "completed");
    L31:
        return !Arrays.equals(((ns0) r5).a.t, eu0.c);
    L45:
        return eu0.d(((gn2) r5).a);
    L53:
        return Objects.nonNull(((Child) r5).getYear());
    L55:
        return Objects.nonNull(((Child) r5).getGenre());
    L57:
        return Objects.nonNull(((Child) r5).getArtistId());
    L59:
        return Objects.nonNull(((Child) r5).getAlbumId());
    L67:
        return Objects.nonNull(((Child) r5).getId());
    L69:
        return !((Child) r5).isDir();
    L71:
        return !((Child) r5).isDir();
    L73:
        if (g51.e((Child) r5) != null) goto L75;
        return false;
    L75:
        return true;
    }

    public /* synthetic */ c7(int r1) {
        this.a = r1;
    }
}
