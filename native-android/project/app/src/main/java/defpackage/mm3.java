package defpackage;

import android.content.Context;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm3 {
    public static volatile String g;
    public final hg3 a = AppDatabase.y().B();
    public final ml3 b = AppDatabase.y().C();
    public final rm3 c = AppDatabase.y().D();
    public final qp4 d = AppDatabase.y().H();
    public static final k03 e = new k03();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final k03 h = new k03();

    public static boolean f(Response response) {
        SubsonicResponse subsonicResponse;
        return response.isSuccessful() && response.body() != null && (subsonicResponse = ((ApiResponse) response.body()).getSubsonicResponse()) != null && ResponseStatus.OK.equals(subsonicResponse.getStatus());
    }

    public final void a(String str, ArrayList arrayList, Boolean bool) {
        Log.d("PlaylistRepository", "addSongToPlaylist: id=" + str + ", songs=" + arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        new Thread(new t6(this, bool, str, arrayList, 26)).start();
    }

    public final void b(String str, lm3 lm3Var) {
        rm3 rm3VarG = App.f(false).g();
        rm3VarG.getClass();
        Log.d("BrowsingClient", "deletePlaylist()");
        ((qm3) rm3VarG.o).e(((pn4) rm3VarG.n).f(), str).enqueue(new r20(this, str, lm3Var, 9));
    }

    public final k03 c(String str, boolean z, Runnable runnable) {
        k03 k03Var = new k03();
        Call callF = App.f(false).g().F(str);
        jw jwVar = new jw();
        jwVar.r = this;
        jwVar.o = k03Var;
        jwVar.p = str;
        jwVar.q = runnable;
        jwVar.n = z;
        callF.enqueue(jwVar);
        return k03Var;
    }

    public final k03 d(int i, boolean z) {
        k03 k03Var = new k03();
        rm3 rm3VarG = App.f(false).g();
        rm3VarG.getClass();
        Log.d("BrowsingClient", "getPlaylists()");
        ((qm3) rm3VarG.o).d(((pn4) rm3VarG.n).f()).enqueue(new bk(this, z, k03Var, i, 5));
        return k03Var;
    }

    public final t24 e(String str) {
        Log.d("TempusLog", "Repo reaching DAO with: " + str);
        ml3 ml3Var = this.b;
        return ((s24) ml3Var.a).i().a(new String[]{"playlist", "pinned_playlist"}, new il3(ml3Var, str, 1));
    }

    public final void g() {
        e.i(Boolean.TRUE);
        h();
    }

    public final void h() {
        rm3 rm3VarG = App.f(false).g();
        rm3VarG.getClass();
        Log.d("BrowsingClient", "getPlaylists()");
        ((qm3) rm3VarG.o).d(((pn4) rm3VarG.n).f()).enqueue(new om1(18, this));
    }

    public final void i(Context context) {
        String strD = ud3.D();
        if (strD == null || !pt0.c() || strD.equals(g)) {
            return;
        }
        g = strD;
        new Thread(new qo2(this, strD, context, 6)).start();
    }

    public final Boolean j(String str) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Boolean) xl.E((s24) this.b.a, true, false, new rs0(15, str)))) {
            return bool;
        }
        return null;
    }
}
