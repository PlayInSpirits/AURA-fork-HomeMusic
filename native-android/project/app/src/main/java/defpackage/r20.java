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
    public static final Object s = null;
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;
    public final Object q;

    static {
        s = new Object();
    }

    public r20(List r3) {
        this.n = 11;
        this.o = r3;
        this.p = new wv4[r3.size()];
        c6 r4 = new c6(new ss2(24, this));
        this.q = r4;
        r4.x(3);
    }

    public static r20 t(Context r2) {
        if (r != null) goto L16;
        Object r0 = s;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (r != null) goto L11;
        r = new r20(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    L16:
        return r;
    }

    @Override // defpackage.n9
    public synchronized void a(ru r2) {
        monitor-enter(this);
        ((wl0) this.q).c.a(r2);     // Catch: Throwable -> L10
    L4:
        if (r2 == null) goto L12;
        m9 r0 = (m9) r2.p;     // Catch: Throwable -> L10
        r0.getClass();     // Catch: Throwable -> L10
        u(r0);     // Catch: Throwable -> L10
        r2 = (ru) r2.q;     // Catch: Throwable -> L10
        if (r2 == null) goto L9;
        if (((m9) r2.p) != null) goto L4;
    L9:
        r2 = null;
        goto L4
    L12:
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.f51
    public int b() {
        int r0 = ((ExtendedFloatingActionButton) this.q).U;
        if (r0 == (-1)) goto L5;
        if (r0 == 0) goto L12;
        if (r0 == (-2)) goto L12;
        return r0;
    L12:
        return ((ExtendedFloatingActionButton) ((hg3) this.p).o).getMeasuredHeight();
    L5:
        return ((rm3) this.o).b();
    }

    @Override // defpackage.aw1
    public int c() {
        List r0 = (List) this.p;
        a r1 = (a) this.q;
        qj0 r10 = (qj0) this.o;
        int r2 = r0.size();
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L19;
        wv1 r5 = (wv1) r0.get(r3);
        aw3 r6 = null;
        aw3 r7 = new aw3(new FileInputStream(r1.a().getFileDescriptor()), r10);     // Catch: Throwable -> L14
        int r8 = r5.b(r7, r10);     // Catch: Throwable -> L12
        r7.f();
        r1.a();
        if (r8 != (-1)) goto L10;
        r3 = r3 + 1;
        goto L4
    L10:
        return r8;
    L12:
        th = th;
        r6 = r7;
    L15:
        if (r6 == null) goto L17;
        r6.f();
    L17:
        r1.a();
        throw th;
    L14:
        th = th;
        goto L15
    L19:
        return -1;
    }

    @Override // defpackage.f51
    public int d() {
        int r0 = ((ExtendedFloatingActionButton) this.q).T;
        if (r0 == (-1)) goto L5;
        if (r0 == 0) goto L12;
        if (r0 == (-2)) goto L12;
        return r0;
    L12:
        return ((hg3) this.p).d();
    L5:
        return ((rm3) this.o).d();
    }

    @Override // defpackage.dk
    public void e(ArrayList r2) {
        ArrayList r0 = (ArrayList) this.o;
        r0.addAll(r2);
        if (((AtomicInteger) this.p).decrementAndGet() != 0) goto L6;
        ((xj) this.q).e(r0);
        return;
    }

    @Override // defpackage.n9
    public synchronized void f(m9 r2) {
        monitor-enter(this);
        ((wl0) this.q).c.f(r2);     // Catch: Throwable -> L6
        u(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n9
    public synchronized m9 g() {
        monitor-enter(this);
        m9 r0 = ((wl0) this.q).c.g();     // Catch: Throwable -> L14
        ((HashMap) this.o).put(r0, (ik3) this.p);     // Catch: Throwable -> L14
        vl0 r1 = (vl0) ((wl0) this.q).p.get((ik3) this.p);     // Catch: Throwable -> L14
        if (r1 == null) goto L12;
        monitor-enter(r1);     // Catch: Throwable -> L14
        r1.d++;     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L14
        goto L12
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L12:
        monitor-exit(this);
        return r0;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n9
    public synchronized void h() {
        monitor-enter(this);
        ((wl0) this.q).c.h();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options r2) {
        return BitmapFactory.decodeFileDescriptor(((a) this.q).a().getFileDescriptor(), null, r2);
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.q).N;
    }

    @Override // defpackage.aw1
    public void k() {
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() {
        List r0 = (List) this.p;
        a r1 = (a) this.q;
        qj0 r9 = (qj0) this.o;
        int r2 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L19;
        wv1 r4 = (wv1) r0.get(r3);
        aw3 r5 = null;
        aw3 r6 = new aw3(new FileInputStream(r1.a().getFileDescriptor()), r9);     // Catch: Throwable -> L13
        ImageHeaderParser$ImageType r7 = r4.d(r6);     // Catch: Throwable -> L11
        r6.f();
        r1.a();
        if (r7 != ImageHeaderParser$ImageType.UNKNOWN) goto L9;
        r3 = r3 + 1;
        goto L3
    L9:
        return r7;
    L11:
        th = th;
        r5 = r6;
    L14:
        if (r5 == null) goto L16;
        r5.f();
    L16:
        r1.a();
        throw th;
    L13:
        th = th;
        goto L14
    L19:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.n9
    public synchronized int m() {
        monitor-enter(this);
        int r0 = ((wl0) this.q).c.o;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public void n(long r5, be3 r7) {
        if (r7.a() < 9) goto L16;
        int r0 = r7.m();
        int r1 = r7.m();
        int r2 = r7.A();
        if (r0 == 434) goto L8;
        return;
    L8:
        if (r1 == 1195456820) goto L10;
        return;
    L10:
        if (r2 != 3) goto L15;
        ((c6) this.q).a(r5, r7);
        return;
    L15:
        return;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        ExtendedFloatingActionButton r3 = (ExtendedFloatingActionButton) this.q;
        int r1 = r3.T;
        int r2 = -2;
        if (r1 != 0) goto L5;
        r1 = -2;
    L5:
        int r4 = r3.U;
        if (r4 == 0) goto L10;
        r2 = r4;
    L10:
        return new ViewGroup.LayoutParams(r1, r2);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((lm3) this.p).g();
        return;
    L6:
        Log.d("ArtistRepository", "Error getting artist info: " + r2.getMessage());
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r7, Response r8) {
        int r9 = this.n;
        Object r0 = this.q;
        Object r1 = this.o;
        Object r2 = this.p;
        switch(r9) {
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        lm3 r3 = (lm3) r2;
        if (mm3.f(r8) == false) goto L7;
        new Thread(new qo2(this, (String) r1, ud3.D(), 12)).start();
        ((mm3) r0).g();
        r3.onSuccess();
        return;
    L7:
        r3.g();
        return;
    L9:
        ArtistID3 r4 = (ArtistID3) r1;
        if (r8.isSuccessful() == true) goto L12;
    L27:
        Log.d("ArtistRepository", "Failed to get artist info");
        return;
    L12:
        if (r8.body() == null) goto L27;
        if (((ApiResponse) r8.body()).getSubsonicResponse().getArtist() == null) goto L27;
        if (((ApiResponse) r8.body()).getSubsonicResponse().getArtist().getAlbums() == null) goto L27;
        List<AlbumID3> r6 = ((ApiResponse) r8.body()).getSubsonicResponse().getArtist().getAlbums();
        Log.d("ArtistRepository", "Got albums directly: " + r6.size());
        if (r6.isEmpty() == false) goto L20;
        Log.d("ArtistRepository", "No albums found in artist response");
        return;
    L20:
        Collections.shuffle(r6);
        int[] r10 = r6.stream().mapToInt(new zj()).toArray();
        Arrays.parallelPrefix(r10, new ak());
        int r5 = 0;
    L22:
        if (r5 >= r6.size()) goto L26;
        if (r10[r5] >= 200) goto L26;
        r5 = r5 + 1;
    L26:
        Log.d("ArtistRepository", String.format("Retaining %d/%d albums", new Object[]{Integer.valueOf(r5), Integer.valueOf(r6.size())}));
        pa.n((pa) r0, (List) r6.stream().limit(r5).collect(Collectors.toList()), r4.getId(), r4.getName(), new xj((k03) r2, 1));
    }

    public void p(m51 r9, sy4 r10) {
        wv4[] r0 = (wv4[]) this.p;
        int r2 = 0;
    L4:
        if (r2 >= r0.length) goto L13;
        r10.a();
        r10.b();
        wv4 r3 = r9.t(r10.d, 3);
        tb1 r4 = (tb1) ((List) this.o).get(r2);
        String r5 = r4.n;
        if ("application/cea-608".equals(r5) == false) goto L8;
    L11:
        boolean r6 = true;
    L12:
        rr2.o(r6, "Invalid closed caption MIME type provided: %s", r5);
        sb1 r7 = new sb1();
        r10.b();
        r7.a = r10.e;
        r7.l = lw2.m("video/mp2t");
        r7.m = lw2.m(r5);
        r7.e = r4.e;
        r7.d = r4.d;
        r7.J = r4.K;
        r7.p = r4.q;
        f34.l(r7, r3);
        r0[r2] = r3;
        r2 = r2 + 1;
        goto L4
    L8:
        if ("application/cea-708".equals(r5) == true) goto L11;
        r6 = false;
        goto L12
    }

    public void q(Bundle r7) {
        HashSet r0 = (HashSet) this.p;
        String r1 = ((Context) this.q).getString(R.string.androidx_startup);
        if (r7 != null) goto L21;
        return;
    L21:
        HashSet r2 = new HashSet();     // Catch: ClassNotFoundException -> L17
        Iterator<String> r3 = r7.keySet().iterator();     // Catch: ClassNotFoundException -> L17
    L6:
        if (r3.hasNext() == false) goto L12;
        String r4 = r3.next();     // Catch: ClassNotFoundException -> L17
        if (r1.equals(r7.getString(r4, null)) == false) goto L6;
        Class<?> r5 = Class.forName(r4);     // Catch: ClassNotFoundException -> L17
        if (yy1.class.isAssignableFrom(r5) == false) goto L6;
        r0.add(r5);     // Catch: ClassNotFoundException -> L17
        goto L6
    L12:
        Iterator r8 = r0.iterator();     // Catch: ClassNotFoundException -> L17
    L13:
        if (r8.hasNext() == false) goto L31;
        r((Class) r8.next(), r2);     // Catch: ClassNotFoundException -> L17
        goto L13
    L31:
        return;
    L17:
        e = move-exception;
        throw new StartupException(e);
    }

    public Object r(Class r6, HashSet r7) {
        HashMap r0 = (HashMap) this.o;
        if (xl.y() == false) goto L6;
        Trace.beginSection(xl.N(r6.getSimpleName()));     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        Trace.endSection();
        throw th;
    L6:
        if (r7.contains(r6) == true) goto L28;
        if (r0.containsKey(r6) == true) goto L24;
        r7.add(r6);     // Catch: Throwable -> L29
        yy1 r1 = (yy1) r6.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L21
        List r2 = r1.a();     // Catch: Throwable -> L21
        if (r2.isEmpty() == true) goto L19;
        Iterator r3 = r2.iterator();     // Catch: Throwable -> L21
    L15:
        if (r3.hasNext() == false) goto L19;
        Class r4 = (Class) r3.next();     // Catch: Throwable -> L21
        if (r0.containsKey(r4) == true) goto L15;
        r(r4, r7);     // Catch: Throwable -> L21
    L19:
        Object r5 = r1.b((Context) this.q);     // Catch: Throwable -> L21
        r7.remove(r6);     // Catch: Throwable -> L21
        r0.put(r6, r5);     // Catch: Throwable -> L21
    L25:
        Trace.endSection();
        return r5;
    L21:
        th = move-exception;
        throw new StartupException(th);     // Catch: Throwable -> L29
    L24:
        r5 = r0.get(r6);     // Catch: Throwable -> L29
        goto L25
    L28:
        throw new IllegalStateException("Cannot initialize " + r6.getName() + ". Cycle detected.");     // Catch: Throwable -> L29
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.q).M;
    }

    public void u(m9 r2) {
        ik3 r3 = (ik3) ((HashMap) this.o).remove(r2);
        r3.getClass();
        vl0 r1 = (vl0) ((wl0) this.q).p.get(r3);
        if (r1 == null) goto L11;
        monitor-enter(r1);
        r1.d--;     // Catch: Throwable -> L8
        monitor-exit(r1);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public /* synthetic */ r20(Object r1, Object r2, Object r3, boolean r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public r20(AppDatabase r3) {
        this.n = 0;
        this.q = new i80(22);
        this.o = r3;
        this.p = new q20(0, this);
    }

    public /* synthetic */ r20(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    public r20(Runnable r2) {
        this.n = 8;
        this.p = new CopyOnWriteArrayList();
        this.q = new HashMap();
        this.o = r2;
    }

    public r20(Context r2) {
        this.n = 1;
        this.q = r2.getApplicationContext();
        this.p = new HashSet();
        this.o = new HashMap();
    }

    public r20(byte[] r2, ic2 r3) {
        this.n = 3;
        this.o = r2;
        this.p = null;
        this.q = r3;
    }

    public r20(Uri r2, ic2 r3) {
        this.n = 3;
        this.o = null;
        this.p = r2;
        this.q = r3;
    }

    public r20(do2 r2, ic2 r3) {
        this.n = 3;
        this.o = r2.k;
        this.p = r2.m;
        this.q = r3;
    }

    public r20(ParcelFileDescriptor r2, ArrayList r3, qj0 r4) {
        this.n = 6;
        h12.f(r4, "Argument must not be null");
        this.o = r4;
        h12.f(r3, "Argument must not be null");
        this.p = r3;
        this.q = new a(r2);
    }

    public r20(wl0 r2, ik3 r3) {
        this.n = 4;
        this.q = r2;
        this.o = new HashMap();
        this.p = r3;
    }
}
