package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.OpenSubsonicExtension;
import java.util.Objects;
import java.util.function.Predicate;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ at0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return ((Child) obj).getId().equals(str);
            case 1:
                return Objects.equals(((Child) obj).getAlbumId(), str);
            case 2:
                return ((Child) obj).getId().equals(str);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Objects.equals(((Child) obj).getAlbumId(), str);
            case 4:
                return Objects.equals(((Child) obj).getGenre(), str);
            case 5:
                return Objects.equals(((Child) obj).getGenre(), str);
            case 6:
                return Objects.equals(((Child) obj).getYear(), Integer.valueOf(str));
            case 7:
                return Objects.equals(((Child) obj).getArtistId(), str);
            case 8:
                Child child = (Child) obj;
                return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), str);
            case 9:
                return Objects.equals(((Child) obj).getYear(), Integer.valueOf(str));
            case 10:
                return Objects.equals(((Child) obj).getArtistId(), str);
            case 11:
                Child child2 = (Child) obj;
                return (child2 instanceof Download) && Objects.equals(((Download) child2).getPlaylistId(), str);
            case 12:
                return ((HomeSector) obj).getId().equals(str);
            default:
                return ((OpenSubsonicExtension) obj).getName().equals(str);
        }
    }
}
