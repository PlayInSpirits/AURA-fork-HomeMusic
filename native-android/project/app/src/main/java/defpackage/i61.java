package defpackage;

import android.graphics.Bitmap;
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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 implements Callback, io3, qn4 {
    public static final dd2 r = null;
    public static final dd2 s = null;
    public static final dd2 t = null;
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    static {
        r = new dd2(0, -9223372036854775807L, false);
        s = new dd2(2, -9223372036854775807L, false);
        t = new dd2(3, -9223372036854775807L, false);
    }

    public i61(ArrayList r7) {
        this.n = 11;
        this.o = Collections.unmodifiableList(new ArrayList(r7));
        this.p = new long[r7.size() * 2];
        int r0 = 0;
    L4:
        if (r0 >= r7.size()) goto L6;
        r95 r1 = (r95) r7.get(r0);
        int r2 = r0 * 2;
        long[] r3 = (long[]) this.p;
        r3[r2] = r1.b;
        r3[r2 + 1] = r1.c;
        r0 = r0 + 1;
        goto L4
    L6:
        long[] r8 = (long[]) this.p;
        long[] r9 = Arrays.copyOf(r8, r8.length);
        this.q = r9;
        Arrays.sort(r9);
    }

    @Override // defpackage.io3
    public boolean a(Object r3) {
        if ((r3 instanceof r51) == false) goto L6;
        ((r51) r3).c().a = true;
    L6:
        switch(((y41) this.p).n) {
            case 3: goto L9;
            default: goto L7;
        };
    L7:
        ((List) r3).clear();
    L9:
        return ((ko3) this.q).a(r3);
    }

    @Override // defpackage.io3
    public Object b() {
        Object r0 = ((ko3) this.q).b();
        if (r0 != null) goto L8;
        r0 = ((q51) this.o).g();
        if (Log.isLoggable("FactoryPools", 2) == false) goto L8;
        Log.v("FactoryPools", "Created new " + r0.getClass());
    L8:
        if ((r0 instanceof r51) == false) goto L10;
        ((r51) r0).c().a = false;
    L10:
        return r0;
    }

    public void c(c72 r4, n12 r5) {
        d34 r0 = (d34) this.o;
        d34 r1 = (d34) this.p;
        d34 r3 = (d34) this.q;
        int r6 = r5.ordinal();
        if (r6 != 0) goto L5;
        r0.B(r4);
        r3.B(r4);
        return;
    L5:
        if (r6 != 1) goto L7;
        r1.B(r4);
        r3.B(r4);
        return;
    L7:
        if (r6 == 2) goto L19;
        if (r6 == 3) goto L11;
        er1.n();
        return;
    L11:
        if (r4.u == null) goto L14;
        r3.B(r4);
        return;
    L14:
        r1.B(r4);
        return;
    L19:
        if (r4.u == null) goto L22;
        r3.B(r4);
        return;
    L22:
        r0.B(r4);
    }

    public void d() {
        id2 r1 = (id2) this.p;
        r1.getClass();
        r1.a(false);
    }

    @Override // defpackage.qn4
    public int e(long r2) {
        long[] r1 = (long[]) this.q;
        int r3 = f35.b(r1, r2, false);
        if (r3 >= r1.length) goto L5;
        return r3;
    L5:
        return -1;
    }

    public boolean f(c72 r5) {
        if (r5.u != null) goto L5;
        boolean r0 = true;
    L7:
        if (((cj4) ((d34) this.o).o).contains(r5) == false) goto L9;
    L12:
        boolean r4 = true;
    L13:
        if (r0 == true) goto L16;
        if (r4 == false) goto L16;
        return true;
    L16:
        return false;
    L9:
        if (((cj4) ((d34) this.p).o).contains(r5) == true) goto L12;
        r4 = false;
        goto L13
    L5:
        r0 = false;
        goto L7
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
    public long k(int r4) {
        long[] r3 = (long[]) this.q;
        boolean r0 = false;
        if (r4 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (r4 >= r3.length) goto L9;
        r0 = true;
    L9:
        rr2.l(r0);
        return r3[r4];
    L5:
        r2 = false;
        goto L6
    }

    public boolean l() {
        if (((id2) this.p) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.qn4
    public List m(long r25) {
        List r1 = (List) this.o;
        ArrayList r2 = new ArrayList();
        ArrayList r3 = new ArrayList();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r1.size()) goto L14;
        long[] r6 = (long[]) this.p;
        int r7 = r5 * 2;
        if (r6[r7] > r25) goto L13;
        if (r25 >= r6[r7 + 1]) goto L13;
        r95 r8 = (r95) r1.get(r5);
        ig0 r9 = r8.a;
        if (r9.e != (-3.4028235E38f)) goto L12;
        r3.add(r8);
        goto L13
    L12:
        r2.add(r9);
    L13:
        r5 = r5 + 1;
        goto L4
    L14:
        Collections.sort(r3, new n7(24));
    L16:
        if (r4 >= r3.size()) goto L18;
        ig0 r0 = ((r95) r3.get(r4)).a;
        CharSequence r10 = r0.a;
        Bitmap r11 = r0.d;
        r2.add(new ig0(r10, r0.b, r0.c, r11, (-1) - r4, 1, r0.g, r0.h, r0.i, r0.n, r0.o, r0.j, r0.k, r0.l, r0.m, r0.p, r0.q, r0.r));
        r4 = r4 + 1;
        goto L16
    L18:
        return r2;
    }

    @Override // defpackage.qn4
    public int n() {
        return ((long[]) this.q).length;
    }

    public boolean o() {
        if (((cj4) ((d34) this.o).o).isEmpty() == true) goto L5;
    L9:
        boolean r2 = false;
    L11:
        return !r2;
    L5:
        if (((cj4) ((d34) this.q).o).isEmpty() == false) goto L9;
        if (((cj4) ((d34) this.p).o).isEmpty() == false) goto L9;
        r2 = true;
        goto L11
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        switch(this.n) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((k03) this.o).k(null);
        return;
    L6:
        Log.d("ArtistSync", "Error getting artist info: " + r3.getMessage());
        ((dk) this.p).e(new ArrayList());
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r6, Response r7) {
        String r0 = null;
        switch(this.n) {
            case 2: goto L21;
            default: goto L4;
        };
    L4:
        k03 r8 = (k03) this.o;
        if (r7.isSuccessful() == true) goto L7;
    L19:
        r8.k(null);
        return;
    L7:
        if (r7.body() == null) goto L19;
        SubsonicResponse r9 = ((ApiResponse) r7.body()).getSubsonicResponse();
        if (r9.getPlaylist() == null) goto L12;
        r8.k(r9.getPlaylist());
        return;
    L12:
        if (r9.getError() != null) goto L14;
    L18:
        r8.k(null);
        return;
    L14:
        if (r9.getError().getCode() == null) goto L18;
        if (r9.getError().getCode().intValue() != 70) goto L18;
        mm3 r10 = (mm3) this.q;
        String r5 = (String) this.p;
        r10.getClass();
        new Thread(new qo2(r10, r5, r0, 9)).start();
        r8.k(null);
        return;
    L21:
        dk r11 = (dk) this.p;
        if (r7.isSuccessful() == true) goto L24;
    L36:
        Log.d("ArtistSync", "Failed to get artist info");
        r11.e(new ArrayList());
        return;
    L24:
        if (r7.body() == null) goto L36;
        if (((ApiResponse) r7.body()).getSubsonicResponse().getArtist() == null) goto L36;
        if (((ApiResponse) r7.body()).getSubsonicResponse().getArtist().getAlbums() == null) goto L36;
        List<AlbumID3> r1 = ((ApiResponse) r7.body()).getSubsonicResponse().getArtist().getAlbums();
        Log.d("ArtistSync", "Got albums directly: " + r1.size());
        if (r1.isEmpty() == true) goto L35;
        ArtistWithAlbumsID3 r12 = ((ApiResponse) r7.body()).getSubsonicResponse().getArtist();
        if (r12 == null) goto L34;
        r0 = r12.getName();
    L34:
        pa.n((pa) this.q, r1, (String) this.o, r0, r11);
        return;
    L35:
        Log.d("ArtistSync", "No albums found in artist response");
        r11.e(new ArrayList());
    }

    public void p(kd2 r3) {
        ty3 r0 = (ty3) this.o;
        id2 r2 = (id2) this.p;
        if (r2 == null) goto L5;
        r2.a(true);
    L5:
        if (r3 == null) goto L7;
        r0.execute(new g5(19, r3));
    L7:
        r0.o.accept(r0.n);
    }

    public void q(jz r1) {
        ((mz) this.q).n.c = r1;
    }

    public void r(oo0 r1) {
        ((mz) this.q).n.a = r1;
    }

    public void s(r62 r1) {
        ((mz) this.q).n.b = r1;
    }

    public void t(long r1) {
        ((mz) this.q).n.d = r1;
    }

    public void u(jd2 r9, hd2 r10, int r11) {
        Looper r2 = Looper.myLooper();
        r2.getClass();
        this.q = null;
        id2 r0 = new id2(this, r2, r9, r10, r11, SystemClock.elapsedRealtime());
        if (((id2) this.p) != null) goto L5;
        boolean r8 = true;
    L6:
        rr2.w(r8);
        this.p = r0;
        r0.b();
        return;
    L5:
        r8 = false;
        goto L6
    }

    public /* synthetic */ i61(Object r1, Object r2, Object r3, boolean r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public i61(AppDatabase r2) {
        this.n = 0;
        this.o = r2;
        this.p = new q20(3);
        this.q = new h61(0);
    }

    public /* synthetic */ i61(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    public i61(mz r2) {
        this.n = 3;
        this.q = r2;
        this.o = new zg5(this);
    }

    public i61(int r2) {
        this.n = r2;
        switch(r2) {
            case 10: goto L7;
            default: goto L4;
        };
    L4:
        this.o = new d34(21);
        this.p = new d34(21);
        this.q = new d34(21);
        return;
    }

    public i61(String r3) {
        this.n = 1;
        String r4 = "ExoPlayer:Loader:".concat(r3);
        String r1 = f35.a;
        this(new ty3(Executors.newSingleThreadExecutor(new n90(1, r4)), new er1(14)));
    }

    public i61(ty3 r2) {
        this.n = 1;
        this.o = r2;
    }
}
