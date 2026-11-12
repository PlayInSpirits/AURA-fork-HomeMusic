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

    public dl3(Application application) {
        super(application);
        this.c = new mm3();
        k03 k03Var = new k03("ORDER_BY_NAME");
        this.d = k03Var;
        this.e = new k03(null);
        this.f = fu.N(k03Var, new x(29, this));
        k03Var.k(ud3.s());
        this.c = new mm3();
    }

    public final void c(String str) {
        Log.d("TempusLog", "ViewModel setSortOrder called with: ".concat(str));
        App.b().getClass();
        App.c().edit().putString("home_sort_playlists", str).apply();
        this.d.k(str);
    }
}
