package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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

    public pa(k42 r2, k42 r3) {
        this.n = 28;
        r2.getClass();
        r3.getClass();
        if (0.0f > 0.0f) goto L5;
        return;
    L5:
        nz2.c();
        throw null;
    }

    public static yw A(byte[] r8) {
        yw r0 = yw.q;
        int r1 = r8.length;
        zz1.i(r8.length, 0, r1);
        return new yw(ti.d0(r8, 0, r1));
    }

    public static void n(pa r8, List r9, final String r10, final String r11, final dk r12) {
        if (r9 == null) goto L12;
        if (r9.isEmpty() == true) goto L12;
        final ArrayList r4 = new ArrayList();
        final AtomicInteger r6 = new AtomicInteger(r9.size());
        Log.d("ArtistSync", "Processing " + r9.size() + " albums");
        Iterator r13 = r9.iterator();
    L9:
        if (r13.hasNext() == false) goto L11;
        AlbumID3 r0 = (AlbumID3) r13.next();
        Log.d("ArtistSync", "Getting tracks for album: " + r0.getName());
        final k03 r5 = rv2.l(r0.getId());
        r5.f(new yj(r10, r11, r4, r5, r6, r12));
        goto L9
    L11:
        return;
    L12:
        Log.d("ArtistSync", "No albums to process");
        r12.e(new ArrayList());
    }

    public static final v20 o(pa r1, String r2) {
        v20 r3 = new v20(r2);
        v20.d.put(r2, r3);
        return r3;
    }

    public static final void p(uk r5, long r6, boolean r8) {
        ReentrantLock r0 = uk.h;
        if (uk.l != null) goto L5;
        uk.l = new uk();
        rk r1 = new rk("Okio Watchdog");
        r1.setDaemon(true);
        r1.start();
    L5:
        long r2 = System.nanoTime();
        if (r6 == 0) goto L9;
        if (r8 == false) goto L9;
        r5.g = Math.min(r6, r5.c() - r2) + r2;
    L13:
        long r7 = r5.g - r2;
        uk r9 = uk.l;
        r9.getClass();
    L14:
        uk r3 = r9.f;
        if (r3 == null) goto L20;
        if (r7 < (r3.g - r2)) goto L20;
        r9 = r3;
    L20:
        r5.f = r3;
        r9.f = r5;
        if (r9 != uk.l) goto L28;
        uk.i.signal();
        return;
    L28:
        return;
    L9:
        if (r6 == 0) goto L11;
        r5.g = r6 + r2;
        goto L13
    L11:
        if (r8 == false) goto L25;
        r5.g = r5.c();
        goto L13
    L25:
        throw new AssertionError();
    }

    public static uk q() {
        uk r0 = uk.l;
        r0.getClass();
        uk r1 = r0.f;
        if (r1 != null) goto L11;
        long r2 = System.nanoTime();
        uk.i.await(uk.j, TimeUnit.MILLISECONDS);
        uk r3 = uk.l;
        r3.getClass();
        if (r3.f == null) goto L7;
    L10:
        return null;
    L7:
        if ((System.nanoTime() - r2) < uk.k) goto L10;
        return uk.l;
    L11:
        long r4 = System.nanoTime();
        long r5 = r1.g - r4;
        if (r5 <= 0) goto L15;
        uk.i.await(r5, TimeUnit.NANOSECONDS);
        return null;
    L15:
        uk r6 = uk.l;
        r6.getClass();
        r6.f = r1.f;
        r1.f = null;
        r1.e = 2;
        return r1;
    }

    public static yw r(String r14) {
        r14.getClass();
        byte[] r0 = d.a;
        int r1 = r14.length();
    L4:
        if (r1 <= 0) goto L13;
        char r5 = r14.charAt(r1 - 1);
        if (r5 == '=') goto L12;
        if (r5 == '\n') goto L12;
        if (r5 == '\r') goto L12;
        if (r5 == ' ') goto L12;
        if (r5 != '\t') goto L13;
    L12:
        r1 = r1 - 1;
    L13:
        int r6 = (int) ((((long) r1) * 6) / 8);
        byte[] r7 = new byte[r6];
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
    L15:
        if (r8 >= r1) goto L53;
        char r12 = r14.charAt(r8);
        if ('A' > r12) goto L22;
        if (r12 >= '[') goto L22;
        int r13 = r12 - 'A';
    L49:
        r10 = (r10 << 6) | r13;
        r9 = r9 + 1;
        if ((r9 % 4) != 0) goto L52;
        r7[r11] = (byte) (r10 >> 16);
        int r15 = r11 + 2;
        r7[r11 + 1] = (byte) (r10 >> 8);
        r11 = r11 + 3;
        r7[r15] = (byte) r10;
    L52:
        r8 = r8 + 1;
    L22:
        if ('a' > r12) goto L27;
        if (r12 >= '{') goto L27;
        r13 = r12 - 'G';
    L27:
        if ('0' > r12) goto L32;
        if (r12 >= ':') goto L32;
        r13 = r12 + 4;
    L32:
        if (r12 != '+') goto L34;
    L48:
        r13 = 62;
        goto L49
    L34:
        if (r12 == '-') goto L48;
        if (r12 != '/') goto L39;
    L47:
        r13 = 63;
        goto L49
    L39:
        if (r12 == '_') goto L47;
        if (r12 == '\n') goto L52;
        if (r12 == '\r') goto L52;
        if (r12 == ' ') goto L52;
        if (r12 == '\t') goto L52;
    L46:
        r7 = null;
    L65:
        if (r7 != null) goto L67;
        return null;
    L67:
        return new yw(r7);
    L53:
        int r16 = r9 % 4;
        if (r16 == 1) goto L46;
        if (r16 != 2) goto L58;
        r7[r11] = (byte) ((r10 << 12) >> 16);
        r11 = r11 + 1;
    L62:
        if (r11 == r6) goto L65;
        r7 = Arrays.copyOf(r7, r11);
        goto L65
    L58:
        if (r16 != 3) goto L62;
        int r17 = r10 << 6;
        int r2 = r11 + 1;
        r7[r11] = (byte) (r17 >> 16);
        r11 = r11 + 2;
        r7[r2] = (byte) (r17 >> 8);
        goto L62
    }

    public static yw s(String r5) {
        if ((r5.length() % 2) != 0) goto L9;
        int r0 = r5.length() / 2;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L8;
        int r3 = r2 * 2;
        int r4 = e35.j(r5.charAt(r3)) << 4;
        r1[r2] = (byte) (e35.j(r5.charAt(r3 + 1)) + r4);
        r2 = r2 + 1;
        goto L5
    L8:
        return new yw(r1);
    L9:
        kf2.e("Unexpected hex string: ".concat(r5));
        return null;
    }

    public static yw t(String r2) {
        r2.getClass();
        byte[] r1 = r2.getBytes(w10.a);
        r1.getClass();
        yw r0 = new yw(r1);
        r0.p = r2;
        return r0;
    }

    public static k03 v(String r4) {
        k03 r0 = new k03();
        App.f(false).c().i(r4).enqueue(new hd5(2, r4, r0));
        return r0;
    }

    public static k03 z(int r4, String r5) {
        k03 r0 = new k03(new ArrayList());
        gp3 r1 = App.f(false).c();
        r1.getClass();
        Log.d("BrowsingClient", "getTopSongs()");
        ((ov) r1.p).j(((pn4) r1.o).f(), r5, r4).enqueue(new wo0(r0, r5));
        return r0;
    }

    @Override // defpackage.s92
    public void a(z92 r1) {
    }

    @Override // defpackage.vn0
    public boolean b(SSLSocket r2) {
        return xm4.k0(r2.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.zs
    public Bitmap c(int r1, int r2, Bitmap.Config r3) {
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // defpackage.zs
    public void d(Bitmap r1) {
        r1.recycle();
    }

    @Override // defpackage.ns
    public long e(long r1) {
        return r1;
    }

    @Override // defpackage.s92
    public void f(z92 r1) {
        r1.n();
    }

    @Override // defpackage.vn0
    public uh4 g(SSLSocket r3) {
        Class<?> r2 = r3.getClass();
        Class<?> r4 = r2;
    L4:
        if (r4.getSimpleName().equals("OpenSSLSocketImpl") == true) goto L11;
        r4 = r4.getSuperclass();
        if (r4 != null) goto L4;
        throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + r2);
    L11:
        return new uc(r4);
    }

    @Override // defpackage.zs
    public Bitmap h(int r1, int r2, Bitmap.Config r3) {
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // defpackage.c11
    public boolean i(Object r1, File r2, db3 r3) {
        vw.d((ByteBuffer) r1, r2);     // Catch: IOException -> L6
        return true;
    L6:
        e = move-exception;
        if (Log.isLoggable("ByteBufferEncoder", 3) == false) goto L14;
        Log.d("ByteBufferEncoder", "Failed to write data", e);
        return false;
    L14:
        return false;
    }

    @Override // defpackage.zs
    public void j(int r1) {
    }

    @Override // defpackage.zs
    public void k() {
    }

    @Override // defpackage.b85
    public pb5 m(View r5, pb5 r6, c85 r7) {
        int r4 = r7.d;
        r7.d = r6.a() + r4;
        WeakHashMap r8 = j65.a;
        boolean r0 = true;
        if (r5.getLayoutDirection() == 1) goto L6;
        r0 = false;
    L6:
        int r9 = r6.b();
        int r1 = r6.c();
        int r2 = r7.a;
        if (r0 == false) goto L9;
        int r3 = r1;
    L10:
        int r10 = r2 + r3;
        r7.a = r10;
        int r11 = r7.c;
        if (r0 == true) goto L14;
        r9 = r1;
    L14:
        int r12 = r11 + r9;
        r7.c = r12;
        r5.setPaddingRelative(r10, r7.b, r12, r7.d);
        return r6;
    L9:
        r3 = r9;
        goto L10
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r1, Response r2) {
    }

    public String toString() {
        switch(this.n) {
            case 10: goto L6;
            default: goto L5;
        };
    L6:
        return "Arrangement#Top";
    L5:
        return super.toString();
    }

    public synchronized v20 u(String r7) {
        monitor-enter(this);
        r7.getClass();     // Catch: Throwable -> L15
        LinkedHashMap r0 = v20.d;     // Catch: Throwable -> L15
        v20 r1 = (v20) r0.get(r7);     // Catch: Throwable -> L15
        if (r1 == null) goto L6;
    L18:
        monitor-exit(this);
        return r1;
    L6:
        if (xm4.k0(r7, "TLS_", false) == false) goto L9;
        String r2 = "SSL_".concat(r7.substring(4));     // Catch: Throwable -> L15
    L12:
        r1 = (v20) r0.get(r2);     // Catch: Throwable -> L15
        if (r1 != null) goto L17;
        r1 = new v20(r7);     // Catch: Throwable -> L15
    L17:
        r0.put(r7, r1);     // Catch: Throwable -> L15
        goto L18
    L9:
        if (xm4.k0(r7, "SSL_", false) == false) goto L11;
        r2 = "TLS_".concat(r7.substring(4));     // Catch: Throwable -> L15
        goto L12
    L11:
        r2 = r7;
    L15:
        th = move-exception;
        throw th;
    }

    public void w(String r4, dk r5) {
        Log.d("ArtistSync", "Getting albums for artist: " + r4);
        App.f(false).c().i(r4).enqueue(new i61(this, r4, r5, 2));
    }

    public void x(List r3, k03 r4) {
        Object r0 = (List) r4.d();
        if (r0 != null) goto L5;
        r0 = new ArrayList();
    L5:
        r4.k(r0);
        Iterator r5 = r3.iterator();
    L7:
        if (r5.hasNext() == false) goto L9;
        ArtistID3 r1 = (ArtistID3) r5.next();
        App.f(false).c().i(r1.getId()).enqueue(new ck(this, r4));
        goto L7
    }

    public k03 y(int r8, boolean r9) {
        k03 r3 = new k03(new ArrayList());
        App.f(false).a().s().enqueue(new bk(this, r9, r3, r8, 0));
        return r3;
    }

    public pa() {
        this.n = 14;
        new fg4(16);
        long[] r1 = v54.a;
        new w03();
    }

    public /* synthetic */ pa(int r1) {
        this.n = r1;
    }

    public pa(ra r1) {
        this.n = 0;
        mn3.a.getClass();
    }
}
