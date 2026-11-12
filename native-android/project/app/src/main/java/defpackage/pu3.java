package defpackage;

import android.app.Application;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pu3 extends hd {
    public final xi4 c;
    public final rv2 d;
    public final pa e;
    public Child f;
    public AlbumID3 g;
    public ArtistID3 h;

    public pu3(Application r2) {
        super(r2);
        this.c = new xi4(2);
        this.d = new rv2(27);
        this.e = new pa(12);
    }

    public final void c(int r3) {
        Child r0 = this.f;
        if (r0 == null) goto L6;
        String r1 = r0.getId();
        this.c.getClass();
        App.f(false).e().w(r3, r1).enqueue(new xi4(1));
        return;
    L6:
        AlbumID3 r2 = this.g;
        if (r2 == null) goto L10;
        String r4 = r2.getId();
        this.d.getClass();
        App.f(false).e().w(r3, r4).enqueue(new rv2(26));
        return;
    L10:
        ArtistID3 r5 = this.h;
        if (r5 == null) goto L14;
        String r6 = r5.getId();
        this.e.getClass();
        App.f(false).e().w(r3, r6).enqueue(new pa(11));
        return;
    }
}
