package defpackage;

import android.app.Application;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wj extends hd {
    public final pa c;
    public final d34 d;
    public ArtistID3 e;
    public final k03 f;
    public final k03 g;

    public wj(Application r2) {
        super(r2);
        this.f = new k03();
        this.g = new k03();
        this.c = new pa(12);
        this.d = new d34(25);
    }

    public final k03 c(String r4) {
        this.c.getClass();
        k03 r3 = new k03(null);
        gp3 r0 = App.f(false).c();
        r0.getClass();
        Log.d("BrowsingClient", "getArtistInfo2()");
        ((ov) r0.p).m(((pn4) r0.o).f(), r4).enqueue(new q8(r3, 1));
        return r3;
    }
}
