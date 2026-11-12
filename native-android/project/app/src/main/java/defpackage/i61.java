package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 implements Callback, io3, qn4 {
    public static final dd2 r = new dd2(0, -9223372036854775807L, false);
    public static final dd2 s = new dd2(2, -9223372036854775807L, false);
    public static final dd2 t = new dd2(3, -9223372036854775807L, false);
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public i61(ArrayList arrayList) {
        this.n = 11;
        this.o = Collections.unmodifiableList(new ArrayList(arrayList));
        this.p = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            r95 r95Var = (r95) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.p;
            jArr[i2] = r95Var.b;
            jArr[i2 + 1] = r95Var.c;
        }
        long[] jArr2 = (long[]) this.p;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.q = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.io3
    public boolean a(Object obj) {
        if (obj instanceof r51) {
            ((r51) obj).c().a = true;
        }
        switch (((y41) this.p).n) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((ko3) this.q).a(obj);
    }

    @Override // defpackage.io3
    public Object b() {
        Object objB = ((ko3) this.q).b();
        if (objB == null) {
            objB = ((q51) this.o).g();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objB.getClass());
            }
        }
        if (objB instanceof r51) {
            ((r51) objB).c().a = false;
        }
        return objB;
    }

    public void c(c72 c72Var, n12 n12Var) {
        d34 d34Var = (d34) this.o;
        d34 d34Var2 = (d34) this.p;
        d34 d34Var3 = (d34) this.q;
        int iOrdinal = n12Var.ordinal();
        if (iOrdinal == 0) {
            d34Var.B(c72Var);
            d34Var3.B(c72Var);
            return;
        }
        if (iOrdinal == 1) {
            d34Var2.B(c72Var);
            d34Var3.B(c72Var);
            return;
        }
        if (iOrdinal == 2) {
            if (c72Var.u != null) {
                d34Var3.B(c72Var);
                return;
            } else {
                d34Var.B(c72Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            er1.n();
        } else if (c72Var.u != null) {
            d34Var3.B(c72Var);
        } else {
            d34Var2.B(c72Var);
        }
    }

    public void d() {
        id2 id2Var = (id2) this.p;
        id2Var.getClass();
        id2Var.a(false);
    }

    @Override // defpackage.qn4
    public int e(long j) {
        long[] jArr = (long[]) this.q;
        int iB = f35.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public boolean f(c72 c72Var) {
        return !(c72Var.u == null) && (((cj4) ((d34) this.o).o).contains(c72Var) || ((cj4) ((d34) this.p).o).contains(c72Var));
    }

    public jz g() {
        return ((mz) this.q).n.c;
    }

    public oo0 h() {
        return ((mz) this.q).n.a;
    }

    public r62 i() {
        return ((mz) this.q).n.b;
    }

    public long j() {
        return ((mz) this.q).n.d;
    }

    @Override // defpackage.qn4
    public long k(int i) {
        long[] jArr = (long[]) this.q;
        rr2.l(i >= 0);
        rr2.l(i < jArr.length);
        return jArr[i];
    }

    public boolean l() {
        return ((id2) this.p) != null;
    }

    @Override // defpackage.qn4
    public List m(long j) {
        List list = (List) this.o;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.p;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                r95 r95Var = (r95) list.get(i);
                ig0 ig0Var = r95Var.a;
                if (ig0Var.e == -3.4028235E38f) {
                    arrayList2.add(r95Var);
                } else {
                    arrayList.add(ig0Var);
                }
            }
        }
        Collections.sort(arrayList2, new n7(24));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ig0 ig0Var2 = ((r95) arrayList2.get(i3)).a;
            arrayList.add(new ig0(ig0Var2.a, ig0Var2.b, ig0Var2.c, ig0Var2.d, (-1) - i3, 1, ig0Var2.g, ig0Var2.h, ig0Var2.i, ig0Var2.n, ig0Var2.o, ig0Var2.j, ig0Var2.k, ig0Var2.l, ig0Var2.m, ig0Var2.p, ig0Var2.q, ig0Var2.r));
        }
        return arrayList;
    }

    @Override // defpackage.qn4
    public int n() {
        return ((long[]) this.q).length;
    }

    public boolean o() {
        return !(((cj4) ((d34) this.o).o).isEmpty() && ((cj4) ((d34) this.q).o).isEmpty() && ((cj4) ((d34) this.p).o).isEmpty());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 2:
                Log.d("ArtistSync", "Error getting artist info: " + th.getMessage());
                ((dk) this.p).e(new ArrayList());
                break;
            default:
                ((k03) this.o).k(null);
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        String str = null;
        switch (this.n) {
            case 2:
                dk dkVar = (dk) this.p;
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtist() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtist().getAlbums() == null) {
                    Log.d("ArtistSync", "Failed to get artist info");
                    dkVar.e(new ArrayList());
                } else {
                    List<AlbumID3> albums = ((ApiResponse) response.body()).getSubsonicResponse().getArtist().getAlbums();
                    Log.d("ArtistSync", "Got albums directly: " + albums.size());
                    if (!albums.isEmpty()) {
                        ArtistWithAlbumsID3 artist = ((ApiResponse) response.body()).getSubsonicResponse().getArtist();
                        pa.n((pa) this.q, albums, (String) this.o, artist != null ? artist.getName() : null, dkVar);
                    } else {
                        Log.d("ArtistSync", "No albums found in artist response");
                        dkVar.e(new ArrayList());
                    }
                }
                break;
            default:
                k03 k03Var = (k03) this.o;
                if (response.isSuccessful() && response.body() != null) {
                    SubsonicResponse subsonicResponse = ((ApiResponse) response.body()).getSubsonicResponse();
                    if (subsonicResponse.getPlaylist() != null) {
                        k03Var.k(subsonicResponse.getPlaylist());
                    } else if (subsonicResponse.getError() == null || subsonicResponse.getError().getCode() == null || subsonicResponse.getError().getCode().intValue() != 70) {
                        k03Var.k(null);
                    } else {
                        mm3 mm3Var = (mm3) this.q;
                        String str2 = (String) this.p;
                        mm3Var.getClass();
                        new Thread(new qo2(mm3Var, str2, str, 9)).start();
                        k03Var.k(null);
                    }
                } else {
                    k03Var.k(null);
                }
                break;
        }
    }

    public void p(kd2 kd2Var) {
        ty3 ty3Var = (ty3) this.o;
        id2 id2Var = (id2) this.p;
        if (id2Var != null) {
            id2Var.a(true);
        }
        if (kd2Var != null) {
            ty3Var.execute(new g5(19, kd2Var));
        }
        ty3Var.o.accept(ty3Var.n);
    }

    public void q(jz jzVar) {
        ((mz) this.q).n.c = jzVar;
    }

    public void r(oo0 oo0Var) {
        ((mz) this.q).n.a = oo0Var;
    }

    public void s(r62 r62Var) {
        ((mz) this.q).n.b = r62Var;
    }

    public void t(long j) {
        ((mz) this.q).n.d = j;
    }

    public void u(jd2 jd2Var, hd2 hd2Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.q = null;
        id2 id2Var = new id2(this, looperMyLooper, jd2Var, hd2Var, i, SystemClock.elapsedRealtime());
        rr2.w(((id2) this.p) == null);
        this.p = id2Var;
        id2Var.b();
    }

    public /* synthetic */ i61(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    public i61(AppDatabase appDatabase) {
        this.n = 0;
        this.o = appDatabase;
        this.p = new q20(3);
        this.q = new h61(0);
    }

    public /* synthetic */ i61(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.q = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public i61(mz mzVar) {
        this.n = 3;
        this.q = mzVar;
        this.o = new zg5(this);
    }

    public i61(int i) {
        this.n = i;
        switch (i) {
            case 10:
                break;
            default:
                this.o = new d34(21);
                this.p = new d34(21);
                this.q = new d34(21);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i61(String str) {
        this.n = 1;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = f35.a;
        this(new ty3(Executors.newSingleThreadExecutor(new n90(1, strConcat)), new er1(14)));
    }

    public i61(ty3 ty3Var) {
        this.n = 1;
        this.o = ty3Var;
    }
}
