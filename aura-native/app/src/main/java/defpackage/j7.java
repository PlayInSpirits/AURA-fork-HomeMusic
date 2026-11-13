package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.AlbumID3;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class j7 extends hd {
    public final rv2 c;
    public final pa d;
    public final d34 e;
    public final hh3 f;
    public AlbumID3 g;
    public final k03 h;

    public j7(Application application) {
        super(application);
        this.h = new k03(null);
        this.c = new rv2(27);
        this.d = new pa(12);
        this.e = new d34(25);
        this.f = new hh3(27);
    }

    public final k03 c() {
        String id = this.g.getId();
        this.c.getClass();
        return rv2.l(id);
    }
}
