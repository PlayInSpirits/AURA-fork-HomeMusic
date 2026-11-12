package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocket;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pa implements nn3, ga1, vn0, at4, s92, Callback, ns, zs, b85, c11, me0 {
    public final /* synthetic */ int n;

    public pa(k42 k42Var, k42 k42Var2) {
        this.n = 28;
        k42Var.getClass();
        k42Var2.getClass();
        if (0.0f <= 0.0f) {
            return;
        }
        nz2.c();
        throw null;
    }

    public static yw A(byte[] bArr) {
        yw ywVar = yw.q;
        int length = bArr.length;
        zz1.i(bArr.length, 0L, length);
        return new yw(ti.d0(bArr, 0, length));
    }

    public static void n(pa paVar, List list, final String str, final String str2, final dk dkVar) {
        if (list == null || list.isEmpty()) {
            Log.d("ArtistSync", "No albums to process");
            dkVar.e(new ArrayList());
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(list.size());
        Log.d("ArtistSync", "Processing " + list.size() + " albums");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AlbumID3 albumID3 = (AlbumID3) it.next();
            Log.d("ArtistSync", "Getting tracks for album: " + albumID3.getName());
            final k03 k03VarL = rv2.l(albumID3.getId());
            k03VarL.f(new a83() { // from class: yj
                @Override // defpackage.a83
                public final void b(Object obj) {
                    String str3;
                    String str4;
                    List<Child> list2 = (List) obj;
                    StringBuilder sb = new StringBuilder("Got ");
                    sb.append(list2 != null ? list2.size() : 0);
                    sb.append(" songs from album");
                    Log.d("ArtistSync", sb.toString());
                    ArrayList arrayList2 = arrayList;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Child child : list2) {
                            boolean zEquals = (child.getArtistId() == null || (str4 = str) == null) ? false : child.getArtistId().equals(str4);
                            if (!zEquals && child.getArtist() != null && (str3 = str2) != null) {
                                zEquals = child.getArtist().equalsIgnoreCase(str3);
                            }
                            if (zEquals) {
                                arrayList3.add(child);
                            }
                        }
                        arrayList2.addAll(arrayList3);
                    }
                    ad2.a("removeObservers");
                    k03 k03Var = k03VarL;
                    Iterator it2 = k03Var.b.iterator();
                    while (true) {
                        e44 e44Var = (e44) it2;
                        if (!e44Var.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) e44Var.next();
                        if (((zc2) entry.getValue()).d(null)) {
                            k03Var.j((a83) entry.getKey());
                        }
                    }
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    Log.d("ArtistSync", "Remaining albums: " + iDecrementAndGet);
                    if (iDecrementAndGet == 0) {
                        Log.d("ArtistSync", "All albums processed. Total songs: " + arrayList2.size());
                        dkVar.e(arrayList2);
                    }
                }
            });
        }
    }

    public static final v20 o(pa paVar, String str) {
        v20 v20Var = new v20(str);
        v20.d.put(str, v20Var);
        return v20Var;
    }

    public static final void p(uk ukVar, long j, boolean z) {
        uk ukVar2;
        ReentrantLock reentrantLock = uk.h;
        if (uk.l == null) {
            uk.l = new uk();
            rk rkVar = new rk("Okio Watchdog");
            rkVar.setDaemon(true);
            rkVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            ukVar.g = Math.min(j, ukVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            ukVar.g = j + jNanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            ukVar.g = ukVar.c();
        }
        long j2 = ukVar.g - jNanoTime;
        uk ukVar3 = uk.l;
        ukVar3.getClass();
        while (true) {
            ukVar2 = ukVar3.f;
            if (ukVar2 == null || j2 < ukVar2.g - jNanoTime) {
                break;
            } else {
                ukVar3 = ukVar2;
            }
        }
        ukVar.f = ukVar2;
        ukVar3.f = ukVar;
        if (ukVar3 == uk.l) {
            uk.i.signal();
        }
    }

    public static uk q() throws InterruptedException {
        uk ukVar = uk.l;
        ukVar.getClass();
        uk ukVar2 = ukVar.f;
        if (ukVar2 == null) {
            long jNanoTime = System.nanoTime();
            uk.i.await(uk.j, TimeUnit.MILLISECONDS);
            uk ukVar3 = uk.l;
            ukVar3.getClass();
            if (ukVar3.f != null || System.nanoTime() - jNanoTime < uk.k) {
                return null;
            }
            return uk.l;
        }
        long jNanoTime2 = ukVar2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            uk.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        uk ukVar4 = uk.l;
        ukVar4.getClass();
        ukVar4.f = ukVar2.f;
        ukVar2.f = null;
        ukVar2.e = 2;
        return ukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static yw r(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = d.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new yw(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new yw(bArrCopyOf);
        }
        return null;
    }

    public static yw s(String str) {
        if (str.length() % 2 != 0) {
            kf2.e("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (e35.j(str.charAt(i2 + 1)) + (e35.j(str.charAt(i2)) << 4));
        }
        return new yw(bArr);
    }

    public static yw t(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(w10.a);
        bytes.getClass();
        yw ywVar = new yw(bytes);
        ywVar.p = str;
        return ywVar;
    }

    public static k03 v(String str) {
        k03 k03Var = new k03();
        App.f(false).c().i(str).enqueue(new hd5(2, str, k03Var));
        return k03Var;
    }

    public static k03 z(int i, String str) {
        k03 k03Var = new k03(new ArrayList());
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getTopSongs()");
        ((ov) gp3VarC.p).j(((pn4) gp3VarC.o).f(), str, i).enqueue(new wo0(k03Var, str));
        return k03Var;
    }

    @Override // defpackage.s92
    public void a(z92 z92Var) {
    }

    @Override // defpackage.vn0
    public boolean b(SSLSocket sSLSocket) {
        return xm4.k0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.zs
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.zs
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ns
    public long e(long j) {
        return j;
    }

    @Override // defpackage.s92
    public void f(z92 z92Var) {
        z92Var.n();
    }

    @Override // defpackage.vn0
    public uh4 g(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new uc(superclass);
    }

    @Override // defpackage.zs
    public Bitmap h(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.c11
    public boolean i(Object obj, File file, db3 db3Var) throws Throwable {
        try {
            vw.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // defpackage.zs
    public void j(int i) {
    }

    @Override // defpackage.zs
    public void k() {
    }

    @Override // defpackage.b85
    public pb5 m(View view, pb5 pb5Var, c85 c85Var) {
        c85Var.d = pb5Var.a() + c85Var.d;
        WeakHashMap weakHashMap = j65.a;
        boolean z = view.getLayoutDirection() == 1;
        int iB = pb5Var.b();
        int iC = pb5Var.c();
        int i = c85Var.a + (z ? iC : iB);
        c85Var.a = i;
        int i2 = c85Var.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        c85Var.c = i3;
        view.setPaddingRelative(i, c85Var.b, i3, c85Var.d);
        return pb5Var;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
    }

    public String toString() {
        switch (this.n) {
            case 10:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }

    public synchronized v20 u(String str) {
        v20 v20Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = v20.d;
            v20Var = (v20) linkedHashMap.get(str);
            if (v20Var == null) {
                if (xm4.k0(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = xm4.k0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                v20Var = (v20) linkedHashMap.get(strConcat);
                if (v20Var == null) {
                    v20Var = new v20(str);
                }
                linkedHashMap.put(str, v20Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return v20Var;
    }

    public void w(String str, dk dkVar) {
        Log.d("ArtistSync", "Getting albums for artist: " + str);
        App.f(false).c().i(str).enqueue(new i61(this, str, dkVar, 2));
    }

    public void x(List list, k03 k03Var) {
        Object arrayList = (List) k03Var.d();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        k03Var.k(arrayList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.f(false).c().i(((ArtistID3) it.next()).getId()).enqueue(new ck(this, k03Var));
        }
    }

    public k03 y(int i, boolean z) {
        k03 k03Var = new k03(new ArrayList());
        App.f(false).a().s().enqueue(new bk(this, z, k03Var, i, 0));
        return k03Var;
    }

    public pa() {
        this.n = 14;
        new fg4(16);
        long[] jArr = v54.a;
        new w03();
    }

    public /* synthetic */ pa(int i) {
        this.n = i;
    }

    public pa(ra raVar) {
        this.n = 0;
        mn3.a.getClass();
    }
}
