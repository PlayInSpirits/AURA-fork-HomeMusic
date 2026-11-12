package defpackage;

import android.app.Application;
import android.util.Log;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class dl3 extends hd {
    public final mm3 c;
    public final k03 d;
    public final k03 e;
    public final lu2 f;

    public dl3(Application r3) {
        super(r3);
        this.c = new mm3();
        k03 r4 = new k03("ORDER_BY_NAME");
        this.d = r4;
        this.e = new k03(null);
        this.f = fu.N(r4, new x(29, this));
        r4.k(ud3.s());
        this.c = new mm3();
    }

    public final void c(String r3) {
        Log.d("TempusLog", "ViewModel setSortOrder called with: ".concat(r3));
        App.b().getClass();
        App.c().edit().putString("home_sort_playlists", r3).apply();
        this.d.k(r3);
    }
}
