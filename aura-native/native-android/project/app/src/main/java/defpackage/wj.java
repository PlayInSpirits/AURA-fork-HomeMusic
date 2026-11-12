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

    public wj(Application application) {
        super(application);
        this.f = new k03();
        this.g = new k03();
        this.c = new pa(12);
        this.d = new d34(25);
    }

    public final k03 c(String str) {
        this.c.getClass();
        k03 k03Var = new k03(null);
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getArtistInfo2()");
        ((ov) gp3VarC.p).m(((pn4) gp3VarC.o).f(), str).enqueue(new q8(k03Var, 1));
        return k03Var;
    }
}
