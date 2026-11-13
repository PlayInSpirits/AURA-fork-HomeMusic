package defpackage;

import android.app.Application;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class pu3 extends hd {
    public final xi4 c;
    public final rv2 d;
    public final pa e;
    public Child f;
    public AlbumID3 g;
    public ArtistID3 h;

    public pu3(Application application) {
        super(application);
        this.c = new xi4(2);
        this.d = new rv2(27);
        this.e = new pa(12);
    }

    public final void c(int i) {
        Child child = this.f;
        if (child != null) {
            String id = child.getId();
            this.c.getClass();
            App.f(false).e().w(i, id).enqueue(new xi4(1));
            return;
        }
        AlbumID3 albumID3 = this.g;
        if (albumID3 != null) {
            String id2 = albumID3.getId();
            this.d.getClass();
            App.f(false).e().w(i, id2).enqueue(new rv2(26));
        } else {
            ArtistID3 artistID3 = this.h;
            if (artistID3 != null) {
                String id3 = artistID3.getId();
                this.e.getClass();
                App.f(false).e().w(i, id3).enqueue(new pa(11));
            }
        }
    }
}
