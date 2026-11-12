package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.OpenSubsonicExtension;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ at0(int r1, String r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object r4) {
        int r0 = this.a;
        String r3 = this.b;
        switch(r0) {
            case 0: goto L39;
            case 1: goto L37;
            case 2: goto L35;
            case 3: goto L33;
            case 4: goto L31;
            case 5: goto L29;
            case 6: goto L27;
            case 7: goto L25;
            case 8: goto L18;
            case 9: goto L17;
            case 10: goto L15;
            case 11: goto L8;
            case 12: goto L7;
            default: goto L5;
        };
    L8:
        Child r5 = (Child) r4;
        if ((r5 instanceof Download) == true) goto L11;
        return false;
    L11:
        if (Objects.equals(((Download) r5).getPlaylistId(), r3) == true) goto L13;
        return false;
    L13:
        return true;
    L18:
        Child r6 = (Child) r4;
        if ((r6 instanceof Download) == true) goto L21;
        return false;
    L21:
        if (Objects.equals(((Download) r6).getPlaylistId(), r3) == true) goto L23;
        return false;
    L23:
        return true;
    L5:
        return ((OpenSubsonicExtension) r4).getName().equals(r3);
    L7:
        return ((HomeSector) r4).getId().equals(r3);
    L15:
        return Objects.equals(((Child) r4).getArtistId(), r3);
    L17:
        return Objects.equals(((Child) r4).getYear(), Integer.valueOf(r3));
    L25:
        return Objects.equals(((Child) r4).getArtistId(), r3);
    L27:
        return Objects.equals(((Child) r4).getYear(), Integer.valueOf(r3));
    L29:
        return Objects.equals(((Child) r4).getGenre(), r3);
    L31:
        return Objects.equals(((Child) r4).getGenre(), r3);
    L33:
        return Objects.equals(((Child) r4).getAlbumId(), r3);
    L35:
        return ((Child) r4).getId().equals(r3);
    L37:
        return Objects.equals(((Child) r4).getAlbumId(), r3);
    L39:
        return ((Child) r4).getId().equals(r3);
    }
}
