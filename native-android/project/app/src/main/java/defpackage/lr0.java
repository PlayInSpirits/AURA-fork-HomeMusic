package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements wq0, s21, kg1, er2 {
    public long n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    public lr0(r34 r1, gr4 r2) {
        r2.getClass();
        this.o = r1;
        this.p = r2;
        this.n = Long.MIN_VALUE;
        this.q = new CopyOnWriteArrayList();
        this.r = new LinkedBlockingDeque();
    }

    @Override // defpackage.er2
    public void B(int r1, za4 r2, boolean r3, boolean r4, int r5) {
        ls2 r0 = (ls2) this.r;
        r0.P(r0.g.s);
    }

    @Override // defpackage.wq0
    public void M(f42 r8, ns3 r9) {
        String r2 = ((qr2) this.o).m(r8);
        rm3 r3 = (rm3) this.q;
        monitor-enter(r3);
        yq0 r4 = (yq0) ((HashMap) r3.n).get(r2);     // Catch: Throwable -> L14
        if (r4 != null) goto L19;
        zg5 r5 = (zg5) r3.o;     // Catch: Throwable -> L14
        ArrayDeque r6 = (ArrayDeque) r5.n;     // Catch: Throwable -> L14
        monitor-enter(r6);     // Catch: Throwable -> L14
        r4 = (yq0) ((ArrayDeque) r5.n).poll();     // Catch: Throwable -> L16
        monitor-exit(r6);     // Catch: Throwable -> L16
        if (r4 != null) goto L12;
        r4 = new yq0();     // Catch: Throwable -> L14
    L12:
        ((HashMap) r3.n).put(r2, r4);     // Catch: Throwable -> L14
        goto L19
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L19:
        r4.b++;     // Catch: Throwable -> L14
        monitor-exit(r3);     // Catch: Throwable -> L14
        r4.a.lock();
    L26:
        th = move-exception;
        ((rm3) this.q).M(r2);
        throw th;
    L23:
        if (Log.isLoggable("DiskLruCacheWrapper", 2) == false) goto L66;
        Log.v("DiskLruCacheWrapper", "Put: Obtained: " + r2 + " for for Key: " + r8);     // Catch: Throwable -> L26
    L66:
        kr0 r10 = f();     // Catch: Throwable -> L26 IOException -> L41
        if (r10.s(r2) == null) goto L32;
    L30:
        ((rm3) this.q).M(r2);
        return;
    L32:
        ll r11 = r10.n(r2);     // Catch: Throwable -> L26 IOException -> L41
        if (r11 == null) goto L49;
    L43:
        th = move-exception;
        if (r11.o == false) goto L69;
    L47:
        throw th;     // Catch: Throwable -> L26 IOException -> L41
    L69:
        r11.a();     // Catch: Throwable -> L26 IOException -> L59
        goto L47
    L35:
        if (((c11) r9.o).i(r9.p, r11.g(), (db3) r9.q) == false) goto L38;
        kr0.b((kr0) r11.r, r11, true);     // Catch: Throwable -> L43
        r11.o = true;     // Catch: Throwable -> L43
    L38:
        if (r11.o == true) goto L30;
        r11.a();     // Catch: Throwable -> L26 IOException -> L58
        goto L30
    L49:
        throw new IllegalStateException("Had two simultaneous puts for: ".concat(r2));     // Catch: Throwable -> L26 IOException -> L41
    L41:
        e = move-exception;
        if (Log.isLoggable("DiskLruCacheWrapper", 5) == false) goto L30;
        Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);     // Catch: Throwable -> L26
    L14:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.s21
    public cv3 a() {
        r34 r0 = (r34) this.o;
        CopyOnWriteArrayList r1 = (CopyOnWriteArrayList) this.q;
        IOException r3 = null;
    L65:
    L10:
        th = move-exception;
        b();
        throw th;
    L4:
        if (r1.isEmpty() == false) goto L13;
        if (r0.m(null) == true) goto L13;
        b();
        r3.getClass();
        throw r3;
    L13:
        if (r0.isCanceled() == true) goto L62;
        rm2 r4 = ((gr4) this.p).a;     // Catch: Throwable -> L10
        long r5 = System.nanoTime();     // Catch: Throwable -> L10
        long r6 = this.n - r5;     // Catch: Throwable -> L10
        if (r1.isEmpty() == false) goto L17;
    L20:
        p34 r7 = g();     // Catch: Throwable -> L10
        long r8 = 250000000;
        this.n = r5 + 250000000;     // Catch: Throwable -> L10
    L21:
        if (r7 != null) goto L31;
        TimeUnit r9 = TimeUnit.NANOSECONDS;     // Catch: Throwable -> L10
        if (r1.isEmpty() == false) goto L25;
    L24:
        r7 = null;
    L29:
        if (r7 != null) goto L31;
    L25:
        p34 r10 = (p34) ((LinkedBlockingDeque) this.r).poll(r8, r9);     // Catch: Throwable -> L10
        if (r10 == null) goto L24;
        r1.remove(r10.a);     // Catch: Throwable -> L10
        r7 = r10;
    L31:
        q34 r11 = r7.a;     // Catch: Throwable -> L10
        boolean r12 = false;
        if (r7.b == null) goto L34;
    L36:
        boolean r13 = false;
    L37:
        if (r13 == false) goto L50;
        b();     // Catch: Throwable -> L10
        if (r11.c() == true) goto L42;
        r7 = r11.g();     // Catch: Throwable -> L10
    L42:
        if (r7.b == null) goto L44;
    L46:
        if (r12 == false) goto L50;
        cv3 r2 = r7.a.e();     // Catch: Throwable -> L10
        b();
        return r2;
    L44:
        if (r7.c != null) goto L46;
        r12 = true;
    L50:
        Throwable r14 = r7.c;     // Catch: Throwable -> L10
        if (r14 != null) goto L53;
    L58:
        q34 r15 = r7.b;     // Catch: Throwable -> L10
        if (r15 == null) goto L65;
        r0.v().addFirst(r15);     // Catch: Throwable -> L10
        goto L65
    L53:
        if ((r14 instanceof IOException) == false) goto L57;
        if (r3 != null) goto L56;
        r3 = (IOException) r14;     // Catch: Throwable -> L10
        goto L58
    L56:
        j51.d(r3, r14);     // Catch: Throwable -> L10
        goto L58
    L57:
        throw r14;     // Catch: Throwable -> L10
    L34:
        if (r7.c != null) goto L36;
        r13 = true;
        goto L37
    L17:
        if (r6 <= 0) goto L20;
        r8 = r6;
        r7 = null;
        goto L21
    L62:
        throw new IOException("Canceled");     // Catch: Throwable -> L10
    }

    public void b() {
        CopyOnWriteArrayList r0 = (CopyOnWriteArrayList) this.q;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        q34 r2 = (q34) r1.next();
        r2.cancel();
        q34 r3 = r2.d();
        if (r3 == null) goto L4;
        ((r34) this.o).v().addLast(r3);
        goto L4
    L9:
        r0.clear();
    }

    @Override // defpackage.er2
    public void c() {
    }

    @Override // defpackage.s21
    public r34 d() {
        return (r34) this.o;
    }

    public synchronized kr0 f() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((kr0) this.r) != null) goto L8;
        this.r = kr0.v((File) this.p, this.n);     // Catch: Throwable -> L6
    L8:
        kr0 r0 = (kr0) this.r;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    }

    public p34 g() {
        r34 r0 = (r34) this.o;
        if (r0.m(null) == true) goto L18;
    L17:
        return null;
    L18:
        q34 r2 = r0.w();     // Catch: Throwable -> L6
    L9:
        if (r2.c() == false) goto L13;
        return new p34(r2, null, 6);
    L13:
        if ((r2 instanceof x51) == true) goto L15;
        ((CopyOnWriteArrayList) this.q).add(r2);
        ((gr4) this.p).e().d(new z51(ze5.c + " connect " + r0.n().h.i(), r2, this), 0);
        goto L17
    L15:
        return ((x51) r2).a;
    L6:
        th = move-exception;
        r2 = new x51(th);
        goto L9
    }

    @Override // defpackage.kg1
    public void h(Object r8) {
        Bitmap r5 = (Bitmap) r8;
        ls2 r9 = (ls2) ((lr0) this.r).r;
        if (this == r9.s) goto L5;
        return;
    L5:
        ls2.F(r9.m, f92.n((do2) this.o, (String) this.p, (Uri) this.q, this.n, r5));
        tn2 r7 = r9.g;
        f35.W(r7.o, new sr2(r7, 1));
    }

    public void j() {
        ls2 r8 = (ls2) this.r;
        al3 r7 = r8.g.s;
        if (r7.F().a != 0) goto L5;
        is2 r0 = null;
    L16:
        r8.p = r0;
        qr2 r9 = r8.m;
        if (r0 == null) goto L19;
        ((kr2) r9.o).a.setPlaybackToRemote(r0.a());
        return;
    L19:
        if (r7.S0(21) == false) goto L21;
        il r1 = r7.D();
    L22:
        ((kr2) r9.o).a.setPlaybackToLocal(r1.c());
        return;
    L21:
        r1 = il.i;
        goto L22
    L5:
        mi3 r2 = r7.o();
        int r3 = 0;
        if (r2.a.a(new int[]{26, 34}) == true) goto L8;
        int r4 = 0;
    L12:
        Handler r6 = new Handler(r7.b.U0());
        if (r7.S0(23) == false) goto L15;
        r3 = r7.j();
    L15:
        hp0 r5 = r7.F();
        int r10 = r4;
        r0 = new is2(r10, r5.c, r3, r5.d, r6, r7);
        goto L16
    L8:
        if (r2.a.a(new int[]{25, 33}) == false) goto L10;
        r4 = 2;
        goto L12
    L10:
        r4 = 1;
        goto L12
    }

    @Override // defpackage.er2
    public void k(List r1, int r2) {
        ls2 r0 = (ls2) this.r;
        r0.P(r0.g.s);
    }

    @Override // defpackage.er2
    public void l(int r3, va4 r4) {
        Bundle r5 = Bundle.EMPTY;
        boolean r0 = r5.isEmpty();
        Bundle r1 = r4.c;
        if (r0 == false) goto L6;
        r5 = r1;
    L9:
        qr2 r2 = ((ls2) this.r).m;
        String r6 = r4.b;
        r2.getClass();
        if (TextUtils.isEmpty(r6) == true) goto L13;
        ((kr2) r2.o).a.sendSessionEvent(r6, r5);
        return;
    L13:
        kf2.n("event cannot be null or empty");
        return;
    L6:
        if (r1.isEmpty() == true) goto L9;
        Bundle r7 = new Bundle(r1);
        r7.putAll(r5);
        r5 = r7;
        goto L9
    }

    @Override // defpackage.wq0
    public File m(f42 r5) {
        String r0 = ((qr2) this.o).m(r5);
        if (Log.isLoggable("DiskLruCacheWrapper", 2) == false) goto L15;
        Log.v("DiskLruCacheWrapper", "Get: Obtained: " + r0 + " for for Key: " + r5);
    L15:
        d34 r4 = f().s(r0);     // Catch: IOException -> L9
        if (r4 == null) goto L17;
        return ((File[]) r4.o)[0];
    L17:
        return null;
    L9:
        e = move-exception;
        if (Log.isLoggable("DiskLruCacheWrapper", 5) == false) goto L18;
        Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
        return null;
    L18:
        return null;
    }

    public void n(gn2 r2) {
        x();
        ls2 r1 = (ls2) this.r;
        qr2 r0 = r1.m;
        if (r2 != null) goto L5;
        ((kr2) r0.o).a.setRatingType(0);
    L6:
        r1.P(r1.g.s);
        return;
    L5:
        int r3 = f92.w(r2.d.i);
        ((kr2) r0.o).a.setRatingType(r3);
        goto L6
    }

    @Override // defpackage.kg1
    public void o(Throwable r2) {
        if (this == ((ls2) ((lr0) this.r).r).s) goto L5;
        return;
    L5:
        l93.q0("MediaSessionLegacyStub", "Failed to load bitmap: " + r2.getMessage());
    }

    public void p(int r3, al3 r4, al3 r5) {
        ls2 r6 = (ls2) this.r;
        cu4 r0 = r5.Z0();
        if (r4 != null) goto L5;
    L6:
        w(r0);
    L8:
        if (r5.S0(18) == false) goto L10;
        do2 r1 = r5.g0();
    L11:
        if (r4 != null) goto L13;
    L18:
        q(r1);
    L19:
        do2 r2 = r5.a1();
        if (r4 != null) goto L22;
    L23:
        x();
    L24:
        if (r4 != null) goto L26;
    L27:
        u(r5.D0());
    L28:
        if (r4 != null) goto L30;
    L31:
        s(r5.h());
    L32:
        r5.F();
        j();
        if (r5.S0(20) == false) goto L35;
        int r7 = 4;
    L37:
        if (r6.t == r7) goto L39;
        r6.t = r7;
        ((kr2) r6.m.o).a.setFlags(r7 | 3);
    L39:
        gn2 r8 = r5.Y0();
        if (r4 != null) goto L42;
    L46:
        n(r8);
        return;
    L42:
        if (Objects.equals(r4.Y0(), r8) == false) goto L46;
        r6.P(r5);
        return;
    L35:
        r7 = 0;
        goto L37
    L30:
        if (r4.h() == r5.h()) goto L32;
    L26:
        if (r4.D0() == r5.D0()) goto L28;
    L22:
        if (Objects.equals(r4.a1(), r2) == true) goto L24;
    L13:
        if (r4.S0(18) == false) goto L15;
        do2 r9 = r4.g0();
    L17:
        if (Objects.equals(r9, r1) == true) goto L19;
    L15:
        r9 = do2.K;
        goto L17
    L10:
        r1 = do2.K;
        goto L11
    L5:
        if (Objects.equals(r4.Z0(), r0) == true) goto L8;
        goto L6
    }

    public void q(do2 r4) {
        ls2 r3 = (ls2) this.r;
        qr2 r0 = r3.m;
        CharSequence r1 = ((xk2) ((wo0) r0.p).n).a.getQueueTitle();
        CharSequence r5 = r4.a;
        if (TextUtils.equals(r1, r5) == true) goto L12;
        al3 r2 = r3.g.s;
        if (r3.z.a(17) == true) goto L7;
    L9:
        r5 = null;
    L10:
        ((kr2) r0.o).a.setQueueTitle(r5);
        return;
    L7:
        if (r2.o().a(17) == false) goto L9;
    }

    public void s(int r6) {
        qr2 r5 = ((ls2) this.r).m;
        int r7 = f92.p(r6);
        kr2 r8 = (kr2) r5.o;
        if (r8.j == r7) goto L25;
        r8.j = r7;
        Object r0 = r8.d;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L7:
        int r1 = r8.f.beginBroadcast() - 1;
    L8:
        RemoteCallbackList r2 = r8.f;
        if (r1 < 0) goto L20;
        ((lu1) r2.getBroadcastItem(r1)).f(r7);     // Catch: Throwable -> L13 SecurityException -> L15 Throwable -> L17
    L19:
        r1 = r1 - 1;     // Catch: Throwable -> L13
    L17:
        e = move-exception;
        l93.G("MediaSessionCompat", "Dead object in setRepeatMode.", e);     // Catch: Throwable -> L13
        goto L19
    L20:
        r2.finishBroadcast();     // Catch: Throwable -> L13
        monitor-exit(r0);     // Catch: Throwable -> L13
        return;
    }

    @Override // defpackage.er2
    public void t(int r2, mi3 r3) {
        ls2 r1 = (ls2) this.r;
        al3 r4 = r1.g.s;
        if (r4.S0(20) == false) goto L5;
        int r5 = 4;
    L7:
        if (r1.t == r5) goto L9;
        r1.t = r5;
        ((kr2) r1.m.o).a.setFlags(r5 | 3);
    L9:
        r1.P(r4);
        return;
    L5:
        r5 = 0;
        goto L7
    }

    public void u(boolean r6) {
        qr2 r5 = ((ls2) this.r).m;
        jx1 r0 = f92.a;
        kr2 r7 = (kr2) r5.o;
        if (r7.k == r6) goto L25;
        r7.k = r6 ? 1 : 0;
        Object r1 = r7.d;
        monitor-enter(r1);
    L13:
        th = move-exception;
        throw th;
    L7:
        int r2 = r7.f.beginBroadcast() - 1;
    L8:
        RemoteCallbackList r3 = r7.f;
        if (r2 < 0) goto L20;
        ((lu1) r3.getBroadcastItem(r2)).c0(r6 ? 1 : 0);     // Catch: Throwable -> L13 SecurityException -> L15 Throwable -> L17
    L19:
        r2 = r2 - 1;     // Catch: Throwable -> L13
    L17:
        e = move-exception;
        l93.G("MediaSessionCompat", "Dead object in setShuffleMode.", e);     // Catch: Throwable -> L13
        goto L19
    L20:
        r3.finishBroadcast();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    }

    public void w(cu4 r1) {
        y(r1);
        x();
    }

    public void x() {
        ls2 r1 = (ls2) this.r;
        tn2 r0 = r1.g;
        al3 r2 = r0.s;
        gn2 r3 = r2.Y0();
        do2 r4 = r2.a1();
        long r7 = -9223372036854775807L;
        if (r2.S0(16) == false) goto L8;
        if (r2.V0() == false) goto L8;
    L10:
        if (r3 == null) goto L13;
        String r5 = r3.a;
    L12:
        String r6 = r5;
        if (r3 == null) goto L19;
        Uri r8 = r3.f.a;
        if (r8 == null) goto L19;
        Uri r9 = r8;
    L21:
        if (Objects.equals((do2) this.o, r4) == true) goto L23;
    L29:
        this.p = r6;
        this.q = r9;
        this.o = r4;
        this.n = r7;
        ic2 r10 = r0.m.i(r4);
        if (r10 == null) goto L41;
        r1.s = null;
        k91 r11 = (k91) r10;
        if (r11.isDone() == true) goto L44;
        lr0 r12 = new lr0();
        r12.r = this;
        r12.o = r4;
        r12.p = r6;
        r12.q = r9;
        r12.n = r7;
        r1.s = r12;
        Handler r13 = r0.l;
        Objects.requireNonNull(r13);
        r11.f(new lg1(0, r10, r12), new ym(r13, 1));
        goto L41
    L44:
        Bitmap r14 = (Bitmap) hw.j(r10);     // Catch: ExecutionException -> L35 Throwable -> L37
    L42:
        ls2.F(r1.m, f92.n(r4, r6, r9, r7, r14));
        return;
    L37:
        e = move-exception;
        l93.q0("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
    L41:
        r14 = null;
        goto L42
    L23:
        if (Objects.equals((String) this.p, r6) == false) goto L29;
        if (Objects.equals((Uri) this.q, r9) == false) goto L29;
        if (this.n != r7) goto L29;
        return;
    L19:
        r9 = null;
        goto L21
    L13:
        r5 = "";
    L8:
        if (r2.S0(16) == false) goto L10;
        r7 = r2.getDuration();
        goto L10
    }

    public void y(cu4 r13) {
        ls2 r0 = (ls2) this.r;
        tn2 r1 = r0.g;
        al3 r2 = r1.s;
        if (r0.z.a(17) == true) goto L5;
    L22:
        ls2.E(r0.m, null);
        return;
    L5:
        if (r2.o().a(17) == false) goto L22;
        if (r13.p() == true) goto L22;
        jx1 r3 = f92.a;
        ArrayList r9 = new ArrayList();
        bu4 r4 = new bu4();
        int r5 = 0;
        int r6 = 0;
    L11:
        if (r6 >= r13.o()) goto L13;
        r9.add(r13.m(r6, r4, 0).b);
        r6 = r6 + 1;
        goto L11
    L13:
        ArrayList r10 = new ArrayList();
        t6 r7 = new t6(this, new AtomicInteger(0), r9, r10, 21);
    L15:
        if (r5 >= r9.size()) goto L21;
        byte[] r12 = ((gn2) r9.get(r5)).d.k;
        if (r12 != null) goto L19;
        r10.add(null);
        r7.run();
    L20:
        r5 = r5 + 1;
        goto L15
    L19:
        ic2 r14 = r1.m.j(r12);
        r10.add(r14);
        Handler r15 = r1.l;
        Objects.requireNonNull(r15);
        ((k91) r14).f(r7, new ym(r15, 1));
        goto L20
    }
}
