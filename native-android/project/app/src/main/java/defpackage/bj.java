package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.ArtistID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bj extends hd {
    public final pa c;
    public final d34 d;
    public final k03 e;
    public k03 f;
    public ArtistID3 g;

    public bj(Application application) {
        super(application);
        this.e = new k03(null);
        this.c = new pa(12);
        this.d = new d34(25);
    }

    public final ad2 c() {
        if (this.f == null) {
            String id = this.g.getId();
            pa paVar = this.c;
            paVar.getClass();
            k03 k03Var = new k03();
            paVar.w(id, new xj(k03Var, 0));
            this.f = k03Var;
        }
        return this.f;
    }
}
