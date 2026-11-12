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
    public static final k03 e = null;
    public static final ExecutorService f = null;
    public static volatile String g;
    public static final k03 h = null;
    public final hg3 a;
    public final ml3 b;
    public final rm3 c;
    public final qp4 d;

    static {
        e = new k03();
        f = Executors.newSingleThreadExecutor();
        h = new k03();
    }

    public mm3() {
        this.a = AppDatabase.y().B();
        this.b = AppDatabase.y().C();
        this.c = AppDatabase.y().D();
        this.d = AppDatabase.y().H();
    }

    public static boolean f(Response r2) {
        if (r2.isSuccessful() == true) goto L5;
    L13:
        return false;
    L5:
        if (r2.body() == null) goto L13;
        SubsonicResponse r3 = ((ApiResponse) r2.body()).getSubsonicResponse();
        if (r3 == null) goto L13;
        if (ResponseStatus.OK.equals(r3.getStatus()) == false) goto L13;
        return true;
    }

    public final void a(String r8, ArrayList r9, Boolean r10) {
        Log.d("PlaylistRepository", "addSongToPlaylist: id=" + r8 + ", songs=" + r9);
        if (r9.isEmpty() == false) goto L5;
        return;
    L5:
        new Thread(new t6(this, r10, r8, r9, 26)).start();
    }

    public final void b(String r4, lm3 r5) {
        rm3 r0 = App.f(false).g();
        r0.getClass();
        Log.d("BrowsingClient", "deletePlaylist()");
        ((qm3) r0.o).e(((pn4) r0.n).f(), r4).enqueue(new r20(this, r4, r5, 9));
    }

    public final k03 c(String r4, boolean r5, Runnable r6) {
        k03 r0 = new k03();
        Call r1 = App.f(false).g().F(r4);
        jw r2 = new jw();
        r2.r = this;
        r2.o = r0;
        r2.p = r4;
        r2.q = r6;
        r2.n = r5;
        r1.enqueue(r2);
        return r0;
    }

    public final k03 d(int r8, boolean r9) {
        k03 r3 = new k03();
        rm3 r0 = App.f(false).g();
        r0.getClass();
        Log.d("BrowsingClient", "getPlaylists()");
        ((qm3) r0.o).d(((pn4) r0.n).f()).enqueue(new bk(this, r9, r3, r8, 5));
        return r3;
    }

    public final t24 e(String r5) {
        Log.d("TempusLog", "Repo reaching DAO with: " + r5);
        ml3 r4 = this.b;
        return ((s24) r4.a).i().a(new String[]{"playlist", "pinned_playlist"}, new il3(r4, r5, 1));
    }

    public final void g() {
        e.i(Boolean.TRUE);
        h();
    }

    public final void h() {
        rm3 r0 = App.f(false).g();
        r0.getClass();
        Log.d("BrowsingClient", "getPlaylists()");
        ((qm3) r0.o).d(((pn4) r0.n).f()).enqueue(new om1(18, this));
    }

    public final void i(Context r5) {
        String r0 = ud3.D();
        if (r0 != null) goto L5;
        return;
    L5:
        if (pt0.c() == true) goto L8;
        return;
    L8:
        if (r0.equals(g) == true) goto L14;
        g = r0;
        new Thread(new qo2(this, r0, r5, 6)).start();
        return;
    }

    public final Boolean j(String r4) {
        Boolean r0 = Boolean.TRUE;
        if (r0.equals((Boolean) xl.E((s24) this.b.a, true, false, new rs0(15, r4))) == false) goto L5;
        return r0;
    L5:
        return null;
    }
}
