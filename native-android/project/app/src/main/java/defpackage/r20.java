package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.util.Log;
import android.view.ViewGroup;
import androidx.startup.StartupException;
import app.homemusic.R;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 implements Callback, n9, f51, aw1, dk {
    public static volatile r20 r;
    public static final Object s = new Object();
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;
    public final Object q;

    public r20(List list) {
        this.n = 11;
        this.o = list;
        this.p = new wv4[list.size()];
        c6 c6Var = new c6(new ss2(24, this));
        this.q = c6Var;
        c6Var.x(3);
    }

    public static r20 t(Context context) {
        if (r == null) {
            synchronized (s) {
                try {
                    if (r == null) {
                        r = new r20(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r;
    }

    @Override // defpackage.n9
    public synchronized void a(ru ruVar) {
        ((wl0) this.q).c.a(ruVar);
        while (ruVar != null) {
            m9 m9Var = (m9) ruVar.p;
            m9Var.getClass();
            u(m9Var);
            ruVar = (ru) ruVar.q;
            if (ruVar == null || ((m9) ruVar.p) == null) {
                ruVar = null;
            }
        }
    }

    @Override // defpackage.f51
    public int b() {
        int i = ((ExtendedFloatingActionButton) this.q).U;
        if (i == -1) {
            return ((rm3) this.o).b();
        }
        return (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((hg3) this.p).o).getMeasuredHeight() : i;
    }

    @Override // defpackage.aw1
    public int c() throws Throwable {
        List list = (List) this.p;
        a aVar = (a) this.q;
        qj0 qj0Var = (qj0) this.o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wv1 wv1Var = (wv1) list.get(i);
            aw3 aw3Var = null;
            try {
                aw3 aw3Var2 = new aw3(new FileInputStream(aVar.a().getFileDescriptor()), qj0Var);
                try {
                    int iB = wv1Var.b(aw3Var2, qj0Var);
                    aw3Var2.f();
                    aVar.a();
                    if (iB != -1) {
                        return iB;
                    }
                } catch (Throwable th) {
                    th = th;
                    aw3Var = aw3Var2;
                    if (aw3Var != null) {
                        aw3Var.f();
                    }
                    aVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    @Override // defpackage.f51
    public int d() {
        int i = ((ExtendedFloatingActionButton) this.q).T;
        if (i == -1) {
            return ((rm3) this.o).d();
        }
        return (i == 0 || i == -2) ? ((hg3) this.p).d() : i;
    }

    @Override // defpackage.dk
    public void e(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.o;
        arrayList2.addAll(arrayList);
        if (((AtomicInteger) this.p).decrementAndGet() == 0) {
            ((xj) this.q).e(arrayList2);
        }
    }

    @Override // defpackage.n9
    public synchronized void f(m9 m9Var) {
        ((wl0) this.q).c.f(m9Var);
        u(m9Var);
    }

    @Override // defpackage.n9
    public synchronized m9 g() {
        m9 m9VarG;
        m9VarG = ((wl0) this.q).c.g();
        ((HashMap) this.o).put(m9VarG, (ik3) this.p);
        vl0 vl0Var = (vl0) ((wl0) this.q).p.get((ik3) this.p);
        if (vl0Var != null) {
            synchronized (vl0Var) {
                vl0Var.d++;
            }
        }
        return m9VarG;
    }

    @Override // defpackage.n9
    public synchronized void h() {
        ((wl0) this.q).c.h();
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((a) this.q).a().getFileDescriptor(), null, options);
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.q).N;
    }

    @Override // defpackage.aw1
    public void k() {
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() throws Throwable {
        List list = (List) this.p;
        a aVar = (a) this.q;
        qj0 qj0Var = (qj0) this.o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wv1 wv1Var = (wv1) list.get(i);
            aw3 aw3Var = null;
            try {
                aw3 aw3Var2 = new aw3(new FileInputStream(aVar.a().getFileDescriptor()), qj0Var);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = wv1Var.d(aw3Var2);
                    aw3Var2.f();
                    aVar.a();
                    if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                        return imageHeaderParser$ImageTypeD;
                    }
                } catch (Throwable th) {
                    th = th;
                    aw3Var = aw3Var2;
                    if (aw3Var != null) {
                        aw3Var.f();
                    }
                    aVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.n9
    public synchronized int m() {
        return ((wl0) this.q).c.o;
    }

    public void n(long j, be3 be3Var) {
        if (be3Var.a() < 9) {
            return;
        }
        int iM = be3Var.m();
        int iM2 = be3Var.m();
        int iA = be3Var.A();
        if (iM == 434 && iM2 == 1195456820 && iA == 3) {
            ((c6) this.q).a(j, be3Var);
        }
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.q;
        int i = extendedFloatingActionButton.T;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.U;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 2:
                Log.d("ArtistRepository", "Error getting artist info: " + th.getMessage());
                break;
            default:
                ((lm3) this.p).g();
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        int i = this.n;
        Object obj = this.q;
        Object obj2 = this.o;
        Object obj3 = this.p;
        switch (i) {
            case 2:
                ArtistID3 artistID3 = (ArtistID3) obj2;
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtist() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtist().getAlbums() == null) {
                    Log.d("ArtistRepository", "Failed to get artist info");
                } else {
                    List<AlbumID3> albums = ((ApiResponse) response.body()).getSubsonicResponse().getArtist().getAlbums();
                    Log.d("ArtistRepository", "Got albums directly: " + albums.size());
                    if (!albums.isEmpty()) {
                        Collections.shuffle(albums);
                        int[] array = albums.stream().mapToInt(new zj()).toArray();
                        Arrays.parallelPrefix(array, new ak());
                        int i2 = 0;
                        while (i2 < albums.size() && array[i2] < 200) {
                            i2++;
                        }
                        Log.d("ArtistRepository", String.format("Retaining %d/%d albums", Integer.valueOf(i2), Integer.valueOf(albums.size())));
                        pa.n((pa) obj, (List) albums.stream().limit(i2).collect(Collectors.toList()), artistID3.getId(), artistID3.getName(), new xj((k03) obj3, 1));
                    } else {
                        Log.d("ArtistRepository", "No albums found in artist response");
                    }
                }
                break;
            default:
                lm3 lm3Var = (lm3) obj3;
                if (!mm3.f(response)) {
                    lm3Var.g();
                } else {
                    new Thread(new qo2(this, (String) obj2, ud3.D(), 12)).start();
                    ((mm3) obj).g();
                    lm3Var.onSuccess();
                }
                break;
        }
    }

    public void p(m51 m51Var, sy4 sy4Var) {
        wv4[] wv4VarArr = (wv4[]) this.p;
        for (int i = 0; i < wv4VarArr.length; i++) {
            sy4Var.a();
            sy4Var.b();
            wv4 wv4VarT = m51Var.t(sy4Var.d, 3);
            tb1 tb1Var = (tb1) ((List) this.o).get(i);
            String str = tb1Var.n;
            rr2.o("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            sb1 sb1Var = new sb1();
            sy4Var.b();
            sb1Var.a = sy4Var.e;
            sb1Var.l = lw2.m("video/mp2t");
            sb1Var.m = lw2.m(str);
            sb1Var.e = tb1Var.e;
            sb1Var.d = tb1Var.d;
            sb1Var.J = tb1Var.K;
            sb1Var.p = tb1Var.q;
            f34.l(sb1Var, wv4VarT);
            wv4VarArr[i] = wv4VarT;
        }
    }

    public void q(Bundle bundle) {
        HashSet hashSet = (HashSet) this.p;
        String string = ((Context) this.q).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (yy1.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    r((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public Object r(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.o;
        if (xl.y()) {
            try {
                Trace.beginSection(xl.N(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                yy1 yy1Var = (yy1) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = yy1Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            r(cls2, hashSet);
                        }
                    }
                }
                objB = yy1Var.b((Context) this.q);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.q).M;
    }

    public void u(m9 m9Var) {
        ik3 ik3Var = (ik3) ((HashMap) this.o).remove(m9Var);
        ik3Var.getClass();
        vl0 vl0Var = (vl0) ((wl0) this.q).p.get(ik3Var);
        if (vl0Var != null) {
            synchronized (vl0Var) {
                vl0Var.d--;
            }
        }
    }

    public /* synthetic */ r20(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    public r20(AppDatabase appDatabase) {
        this.n = 0;
        this.q = new i80(22);
        this.o = appDatabase;
        this.p = new q20(0, this);
    }

    public /* synthetic */ r20(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.q = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public r20(Runnable runnable) {
        this.n = 8;
        this.p = new CopyOnWriteArrayList();
        this.q = new HashMap();
        this.o = runnable;
    }

    public r20(Context context) {
        this.n = 1;
        this.q = context.getApplicationContext();
        this.p = new HashSet();
        this.o = new HashMap();
    }

    public r20(byte[] bArr, ic2 ic2Var) {
        this.n = 3;
        this.o = bArr;
        this.p = null;
        this.q = ic2Var;
    }

    public r20(Uri uri, ic2 ic2Var) {
        this.n = 3;
        this.o = null;
        this.p = uri;
        this.q = ic2Var;
    }

    public r20(do2 do2Var, ic2 ic2Var) {
        this.n = 3;
        this.o = do2Var.k;
        this.p = do2Var.m;
        this.q = ic2Var;
    }

    public r20(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, qj0 qj0Var) {
        this.n = 6;
        h12.f(qj0Var, "Argument must not be null");
        this.o = qj0Var;
        h12.f(arrayList, "Argument must not be null");
        this.p = arrayList;
        this.q = new a(parcelFileDescriptor);
    }

    public r20(wl0 wl0Var, ik3 ik3Var) {
        this.n = 4;
        this.q = wl0Var;
        this.o = new HashMap();
        this.p = ik3Var;
    }
}
