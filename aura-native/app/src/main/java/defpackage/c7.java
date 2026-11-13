/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import defpackage.eu0;
import defpackage.g51;
import defpackage.gn2;
import defpackage.i51;
import defpackage.ns0;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public final class c7
implements Predicate {
    public final int a;

    public c7(int n16) {
        this.a = n16;
    }

    public c7(eu0 eu02) {
        this.a = 10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean test(Object object) {
        int n16 = this.a;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        switch (n16) {
            default: {
                return Objects.nonNull((Integer)object);
            }
            case 20: {
                return Objects.nonNull((Child)object);
            }
            case 19: {
                object = (PodcastEpisode)object;
                bl5 = bl10;
                if (object == null) return bl5;
                bl5 = bl10;
                if (!Objects.equals(((PodcastEpisode)object).getStatus(), "completed")) return bl5;
                return true;
            }
            case 18: {
                return Objects.equals(((PodcastEpisode)object).getStatus(), "completed");
            }
            case 17: {
                return Objects.nonNull((PodcastEpisode)object);
            }
            case 16: {
                object = (Child)object;
                if (((Child)object).getUserRating() != null) {
                    n16 = ((Child)object).getUserRating();
                    App.b().getClass();
                    if (n16 >= App.c().getInt("min_star_rating", 0)) return true;
                }
                if (((Child)object).getUserRating() != null) return bl5;
                return true;
            }
            case 15: {
                return "HOME_SECTOR_CONTINUE_LISTENING".equals(((HomeSector)object).getId());
            }
            case 14: {
                return Objects.equals(((PodcastEpisode)object).getStatus(), "completed");
            }
            case 13: {
                return Arrays.equals(((ns0)object).a.t, eu0.c) ^ true;
            }
            case 12: {
                object = (ns0)object;
                bl5 = bl6;
                if (Arrays.equals(((ns0)object).a.t, eu0.c)) return bl5;
                n16 = ((ns0)object).b;
                if (n16 == 0) return true;
                if (n16 == 2) return true;
                bl5 = bl6;
                if (n16 != 7) return bl5;
                return true;
            }
            case 11: {
                object = (ns0)object;
                float f16 = DownloaderService.w;
                return Arrays.equals(((ns0)object).a.t, eu0.c) ^ true;
            }
            case 10: {
                return eu0.d(((gn2)object).a);
            }
            case 9: {
                object = (Child)object;
                bl5 = bl7;
                if (g51.e((Child)object) != null) return bl5;
                object = ((Child)object).getId();
                bl5 = bl7;
                if (i51.b.contains(object)) return bl5;
                return true;
            }
            case 8: {
                return Objects.nonNull(((Child)object).getYear());
            }
            case 7: {
                return Objects.nonNull(((Child)object).getGenre());
            }
            case 6: {
                return Objects.nonNull(((Child)object).getArtistId());
            }
            case 5: {
                return Objects.nonNull(((Child)object).getAlbumId());
            }
            case 4: {
                object = (Child)object;
                bl5 = bl8;
                if (!(object instanceof Download)) return bl5;
                bl5 = bl8;
                if (((Download)object).getPlaylistId() == null) return bl5;
                return true;
            }
            case 3: {
                return Objects.nonNull(((Child)object).getId());
            }
            case 2: {
                return ((Child)object).isDir() ^ true;
            }
            case 1: {
                return ((Child)object).isDir() ^ true;
            }
            case 0: 
        }
        bl5 = bl9;
        if (g51.e((Child)object) == null) return bl5;
        return true;
    }
}

