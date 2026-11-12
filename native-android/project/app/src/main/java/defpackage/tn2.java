package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaLibraryService;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.service.MediaService;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 {
    public static final ab4 H = null;
    public static final go4 I = null;
    public final yw1 A;
    public final Bundle B;
    public final kn2 C;
    public final pq D;
    public final nl1 E;
    public final nl1 F;
    public final int G;
    public final Object a;
    public final Uri b;
    public final wr2 c;
    public final cj2 d;
    public final pq e;
    public final MediaService f;
    public final kt2 g;
    public final ls2 h;
    public final String i;
    public final cb4 j;
    public final kn2 k;
    public final Handler l;
    public final x7 m;
    public final sr2 n;
    public final Handler o;
    public final boolean p;
    public final yw1 q;
    public lk3 r;
    public al3 s;
    public final PendingIntent t;
    public xr2 u;
    public rm2 v;
    public pn2 w;
    public boolean x;
    public boolean y;
    public final yw1 z;

    static {
        H = new ab4(1);
        I = au0.L(new di0(4));
    }

    public tn2(kn2 r22, MediaService r23, ExoPlayer r24, PendingIntent r25, yw1 r26, yw1 r27, yw1 r28, pq r29, Bundle r30, Bundle r31, x7 r32) {
        this.a = new Object();
        l93.K("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + f35.a + "]");
        this.k = r22;
        this.f = r23;
        this.i = "";
        this.t = r25;
        this.z = r26;
        this.A = r27;
        this.q = r28;
        this.e = r29;
        this.B = r31;
        this.m = r32;
        this.p = true;
        kt2 r14 = new kt2(this);
        this.g = r14;
        this.o = new Handler(Looper.getMainLooper());
        Looper r2 = ((i41) r24).u;
        Handler r3 = new Handler(r2);
        this.l = r3;
        this.r = lk3.H;
        this.c = new wr2(this, r2);
        this.d = new cj2(this, r2);
        Uri r4 = new Uri.Builder().scheme(tn2.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = r4;
        ls2 r0 = new ls2(this, r4, r3, r30, r26, r27, dr2.e, dr2.f, r31);
        this.h = r0;
        this.j = new cb4(Process.myUid(), 1009002300, 8, r23.getPackageName(), r14, r30, ((kr2) r0.m.o).c.o);
        al3 r1 = new al3(r24);
        this.s = r1;
        f35.W(r3, new ws1(28, this, r1));
        this.n = new sr2(this, 2);
        f35.W(r3, new sr2(this, 3));
        this.C = r22;
        this.D = r29;
        this.G = 2;
        this.E = new nl1();
        this.F = new nl1();
    }

    public static Object E(Future r2) {
        rr2.w(r2.isDone());
        return r2.get();
    L5:
        e = move-exception;
        l93.r0("MediaSessionImpl", "Library operation failed", e);
        return null;
    }

    public static void G(int r2, m92 r3) {
        if (r3.a != 0) goto L9;
        yw1 r4 = (yw1) r3.c;
        r4.getClass();
        if (r4.size() <= r2) goto L10;
        nz2.d(r4.size(), r2, ", pageSize=", "Invalid size=");
        return;
    L10:
        return;
    }

    public static void a(tn2 r8) {
        Object r1 = r8.a;
        monitor-enter(r1);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (r8.x == false) goto L10;
        monitor-exit(r1);     // Catch: Throwable -> L8
        return;
    L10:
        monitor-exit(r1);     // Catch: Throwable -> L8
        za4 r3 = r8.s.X0();
        if (r8.c.hasMessages(1) == false) goto L14;
    L23:
        r8.C();
        return;
    L14:
        if (ju2.a(r3, r8.r.c) == false) goto L23;
        na4 r0 = r8.g.f;
        yw1 r2 = r0.u();
        int r4 = 0;
    L17:
        if (r4 >= r2.size()) goto L27;
        fr2 r5 = (fr2) r2.get(r4);
        r0.A(r5);
        r8.e(r5, new tr2(r3, r0.H(r5, 16), r0.H(r5, 17), r5));
        r4 = r4 + 1;
        goto L17
    L27:
        r8.h.i.B(0, r3, true, true, 0);     // Catch: RemoteException -> L21
    L21:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        goto L23
    }

    public static void b(tn2 r0, Runnable r1) {
        f35.W(r0.l, r1);
    }

    public static boolean m(fr2 r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (Objects.equals(r1.a.a.a, "com.android.systemui") == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final void A() {
        StringBuilder r1 = new StringBuilder("Release ");
        r1.append(Integer.toHexString(System.identityHashCode(this)));
        r1.append(" [AndroidXMedia3/1.9.2] [");
        r1.append(f35.a);
        r1.append("] [");
        HashSet r2 = hn2.a;
        monitor-enter(hn2.class);
        String r3 = hn2.b;     // Catch: Throwable -> L61
        monitor-exit(hn2.class);
        r1.append(r3);
        r1.append("]");
        l93.K("MediaSessionImpl", r1.toString());
        Object r0 = this.a;
        monitor-enter(r0);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (this.x == false) goto L14;
        monitor-exit(r0);     // Catch: Throwable -> L12
        return;
    L14:
        this.x = true;     // Catch: Throwable -> L12
        monitor-exit(r0);     // Catch: Throwable -> L12
        cj2 r4 = this.d;
        qo2 r5 = (qo2) r4.b;
        if (r5 == null) goto L19;
        r4.removeCallbacks(r5);
        r4.b = null;
    L19:
        this.l.removeCallbacksAndMessages(null);
        int r6 = 0;
        f35.W(this.l, new sr2(this, r6));     // Catch: Exception -> L22
    L24:
        ls2 r7 = this.h;
        ComponentName r8 = r7.o;
        tn2 r9 = r7.g;
        qr2 r10 = r7.m;
        int r11 = Build.VERSION.SDK_INT;
        if (r11 >= 31) goto L29;
        if (r8 != null) goto L28;
        ((kr2) r10.o).a.setMediaButtonReceiver(null);
        goto L29
    L28:
        Intent r12 = new Intent("android.intent.action.MEDIA_BUTTON", r9.b);
        r12.setComponent(r8);
        PendingIntent r13 = PendingIntent.getBroadcast(r9.f, 0, r12, ls2.A);
        ((kr2) r10.o).a.setMediaButtonReceiver(r13);
    L29:
        v9 r14 = r7.n;
        if (r14 == null) goto L32;
        r9.f.unregisterReceiver(r14);
    L32:
        w9 r15 = r7.l;
        if (r15 != null) goto L35;
    L38:
        kr2 r16 = (kr2) r10.o;
        MediaSession r17 = r16.a;
        r16.f.kill();
        if (r11 == 27) goto L64;
    L46:
        r17.setCallback(null);
        r16.b.e.clear();
        r17.release();
        kt2 r18 = this.g;
        Set r19 = r18.g;
        na4 r20 = r18.f;
        yw1 r21 = r20.u();
        int r22 = r21.size();
    L47:
        if (r6 >= r22) goto L51;
        Object r23 = r21.get(r6);
        r6 = r6 + 1;
        fr2 r24 = (fr2) r23;
        r20.N(r24);
        er2 r25 = r24.d;
        if (r25 == null) goto L47;
        r25.c();
        goto L47
    L51:
        Iterator r26 = r19.iterator();
    L53:
        if (r26.hasNext() == false) goto L57;
        er2 r27 = ((fr2) r26.next()).d;
        if (r27 == null) goto L53;
        r27.c();
        goto L53
    L57:
        r19.clear();
        r18.e.clear();
        return;
    L64:
        Field r28 = r17.getClass().getDeclaredField("mCallback");     // Catch: Exception -> L44
        r28.setAccessible(true);     // Catch: Exception -> L44
        Handler r29 = (Handler) r28.get(r17);     // Catch: Exception -> L44
        if (r29 == null) goto L46;
        r29.removeCallbacksAndMessages(null);     // Catch: Exception -> L44
    L44:
        e = move-exception;
        l93.r0("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
        goto L46
    L35:
        if (r15.f.getAndSet(true) == true) goto L38;
        r15.c.execute(new u9(r15, 0));
    L22:
        e = move-exception;
        l93.r0("MediaSessionImpl", "Exception thrown while closing", e);
    L61:
        th = move-exception;
        throw th;
    }

    public final fr2 B(fr2 r2) {
        if (this.y == true) goto L5;
    L8:
        return r2;
    L5:
        if (m(r2) == false) goto L8;
        fr2 r1 = g();
        r1.getClass();
        return r1;
    }

    public final void C() {
        this.l.removeCallbacks(this.n);
    }

    public final void D(al3 r44, al3 r45) {
        ls2 r4 = this.h;
        this.s = r45;
        if (r44 == null) goto L5;
        xr2 r0 = this.u;
        r0.getClass();
        r44.r0(r0);
    L5:
        xr2 r1 = new xr2(this, r45);
        r45.v(r1);
        this.u = r1;
        int r5 = 0;
        r4.i.p(0, r44, r45);     // Catch: RemoteException -> L8
    L10:
        if (r44 != null) goto L12;
        ((kr2) r4.m.o).a.setActive(true);
    L12:
        PlaybackException r7 = r45.U();
        za4 r9 = r45.X0();
        pi3 r10 = r45.W0();
        pi3 r11 = r45.W0();
        qh3 r13 = r45.i();
        int r14 = r45.h();
        boolean r15 = r45.D0();
        s55 r16 = r45.z();
        cu4 r17 = r45.Z0();
        if (r45.S0(18) == false) goto L16;
        do2 r2 = r45.g0();
    L15:
        do2 r19 = r2;
        if (r45.S0(22) == false) goto L21;
        float r3 = r45.B();
    L20:
        float r20 = r3;
        if (r45.S0(21) == false) goto L26;
        il r6 = r45.D();
    L25:
        il r22 = r6;
        if (r45.S0(28) == false) goto L31;
        jg0 r8 = r45.i0();
    L30:
        jg0 r24 = r8;
        hp0 r25 = r45.F();
        if (r45.S0(23) == false) goto L35;
        r5 = r45.j();
    L35:
        int r26 = r5;
        boolean r27 = r45.b1();
        boolean r28 = r45.q();
        int r30 = r45.v0();
        int r31 = r45.g();
        boolean r32 = r45.h0();
        boolean r33 = r45.f();
        do2 r34 = r45.a1();
        long r35 = r45.O0();
        long r37 = r45.X();
        long r39 = r45.u();
        if (r45.S0(30) == false) goto L39;
        jw4 r12 = r45.e0();
    L38:
        jw4 r41 = r12;
        this.r = new lk3(r7, 0, r9, r10, r11, 0, r13, r14, r15, r16, r17, 0, r19, r20, 1.0f, r22, 0, r24, r25, r26, r27, r28, 1, r30, r31, r32, r33, r34, r35, r37, r39, r41, r45.E0());
        h(r45.o());
        return;
    L39:
        r12 = jw4.b;
        goto L38
    L31:
        r8 = jg0.d;
        goto L30
    L26:
        r6 = il.i;
        goto L25
    L21:
        r3 = 1.0f;
        goto L20
    L16:
        r2 = do2.K;
    L8:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        goto L10
    }

    public final void F() {
        if (Looper.myLooper() != this.l.getLooper()) goto L5;
        return;
    L5:
        kf2.o("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }

    public final boolean c(KeyEvent r8, boolean r9, boolean r10) {
        fr2 r4 = this.k.a.g();
        r4.getClass();
        int r11 = r8.getKeyCode();
        if (r11 == 85) goto L5;
        if (r11 == 79) goto L5;
    L7:
        int r12 = 1;
        if (r11 == 79) goto L29;
        if (r11 != 126) goto L12;
        y90 r13 = new y90(this, r4, 9);
    L32:
        b41 r1 = new b41(this, r10, r4, r13, 3);
        f35.W(this.l, r1);
        return true;
    L12:
        if (r11 != 127) goto L14;
        r13 = new y90(this, r4, r12);
        goto L32
    L14:
        if (r11 != 272) goto L16;
    L25:
        r13 = new y90(this, r4, 2);
        goto L32
    L16:
        if (r11 == 273) goto L24;
        switch(r11) {
            case 85: goto L29;
            case 86: goto L23;
            case 87: goto L25;
            case 88: goto L24;
            case 89: goto L22;
            case 90: goto L20;
            default: goto L18;
        };
    L18:
        return false;
    L20:
        r13 = new y90(this, r4, 4);
        goto L32
    L22:
        r13 = new y90(this, r4, 5);
        goto L32
    L23:
        r13 = new y90(this, r4, 6);
    L24:
        r13 = new y90(this, r4, 3);
    L29:
        if (this.s.q() == false) goto L31;
        r13 = new y90(this, r4, 7);
        goto L32
    L31:
        r13 = new y90(this, r4, 8);
    L5:
        if (r9 == false) goto L7;
        r11 = 87;
        goto L7
    }

    public final ic2 d(fr2 r5, yr2 r6) {
        kt2 r0 = this.g;
        yk r2 = r0.f.C(r5);     // Catch: RemoteException -> L6 DeadObjectException -> L19
        if (r2 == null) goto L9;
        ea4 r4 = r2.j(H);     // Catch: RemoteException -> L6 DeadObjectException -> L19
        int r3 = r4.u;     // Catch: RemoteException -> L6 DeadObjectException -> L19
        ic2 r7 = r4;
    L13:
        er2 r8 = r5.d;     // Catch: RemoteException -> L6 DeadObjectException -> L19
        if (r8 == null) goto L16;
        r6.f(r8, r3);     // Catch: RemoteException -> L6 DeadObjectException -> L19
    L16:
        return r7;
    L9:
        if (j(r5) == false) goto L11;
        r3 = 0;
        r7 = new mw1(new ab4(0));     // Catch: RemoteException -> L6 DeadObjectException -> L19
        goto L13
    L11:
        return new mw1(new ab4(-100));
    L19:
        r0.f.N(r5);
        return new mw1(new ab4(-100));
    L6:
        e = move-exception;
        l93.r0("MediaSessionImpl", "Exception in " + r5, e);
        return new mw1(new ab4(-1));
    }

    public final void e(fr2 r3, yr2 r4) {
        kt2 r0 = this.g;
        yk r1 = r0.f.C(r3);     // Catch: RemoteException -> L6 DeadObjectException -> L17
        if (r1 == null) goto L9;
        int r2 = r1.s();     // Catch: RemoteException -> L6 DeadObjectException -> L17
    L12:
        er2 r5 = r3.d;     // Catch: RemoteException -> L6 DeadObjectException -> L17
        if (r5 == null) goto L22;
        r4.f(r5, r2);     // Catch: RemoteException -> L6 DeadObjectException -> L17
        return;
    L22:
        return;
    L9:
        if (j(r3) == false) goto L21;
        r2 = 0;
        goto L12
    L21:
        return;
    L17:
        r0.f.N(r3);
        return;
    L6:
        e = move-exception;
        l93.r0("MediaSessionImpl", "Exception in " + r3, e);
    }

    public final void f(yr2 r7) {
        yw1 r2 = this.g.f.u();
        int r4 = 0;
    L4:
        if (r4 >= r2.size()) goto L23;
        e((fr2) r2.get(r4), r7);
        r4 = r4 + 1;
        goto L4
    L23:
        r7.f(this.h.i, 0);     // Catch: RemoteException -> L8
    L10:
        Object r3 = this.a;
        monitor-enter(r3);
        pn2 r6 = this.w;     // Catch: Throwable -> L20
        monitor-exit(r3);     // Catch: Throwable -> L20
        if (r6 == null) goto L29;
        r7.f(r6.y, 0);     // Catch: RemoteException -> L17
        return;
    L17:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        return;
    L29:
        return;
    L20:
        th = move-exception;
        throw th;
    L8:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
        goto L10
    }

    public final fr2 g() {
        yw1 r0 = this.g.f.u();
        int r1 = 0;
    L4:
        if (r1 >= r0.size()) goto L9;
        fr2 r2 = (fr2) r0.get(r1);
        if (k(r2) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r2;
    L9:
        return null;
    }

    public final void h(mi3 r3) {
        this.c.a(false, false);
        f(new km2(r3));
        lr0 r4 = this.h.i;     // Catch: RemoteException -> L5
        hp0 r2 = this.r.s;     // Catch: RemoteException -> L5
        r4.j();     // Catch: RemoteException -> L5
        return;
    L5:
        e = move-exception;
        l93.G("MediaSessionImpl", "Exception in using media1 API", e);
    }

    public final void i(fr2 r7, boolean r8) {
        if (u() == false) goto L31;
        int r1 = 0;
        if (this.s.S0(16) == true) goto L8;
    L10:
        boolean r0 = false;
    L12:
        if (this.s.S0(31) == false) goto L14;
    L17:
        boolean r3 = true;
    L18:
        fr2 r9 = B(r7);
        SparseBooleanArray r4 = new SparseBooleanArray();
        rr2.w(!false);
        r4.append(1, true);
        rr2.w(true);
        mi3 r5 = new mi3(new w71(r4));
        if (r0 == true) goto L24;
        if (r3 == false) goto L24;
        this.e.getClass();
        UnsupportedOperationException r2 = new UnsupportedOperationException();
        lw1 r6 = new lw1();
        r6.m(r2);
        ll r10 = new ll(this, r9, r8, r5);
        r6.f(new lg1(r1, r6, r10), new rn2(this, 2));
        return;
    L24:
        if (r0 == true) goto L26;
        l93.q0("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
    L26:
        f35.I(this.s);
        if (r8 == false) goto L30;
        v(r9, r5);
        return;
    L30:
        return;
    L14:
        if (this.s.S0(20) == true) goto L17;
        r3 = false;
        goto L18
    L8:
        if (this.s.a() == null) goto L10;
        r0 = true;
        goto L12
    }

    public final boolean j(fr2 r2) {
        if (this.g.f.F(r2) == false) goto L5;
        return true;
    L5:
        if (this.h.f.F(r2) == true) goto L25;
        Object r0 = this.a;
        monitor-enter(r0);
        pn2 r1 = this.w;     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        if (r1 != null) goto L13;
        return false;
    L13:
        if (r1.x.F(r2) == true) goto L26;
        return false;
    L26:
        return true;
    L17:
        th = move-exception;
        throw th;
    L25:
        return true;
    }

    public final boolean k(fr2 r2) {
        if (Objects.equals(r2.a.a.a, this.f.getPackageName()) == true) goto L5;
    L10:
        return false;
    L5:
        if (r2.b == 0) goto L10;
        if (new Bundle(r2.e).getBoolean("androidx.media3.session.MediaNotificationManager", false) == false) goto L10;
        return true;
    }

    public final boolean l() {
        Object r0 = this.a;
        monitor-enter(r0);
        boolean r1 = this.x;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final void n(fr2 r7, m92 r8) {
        int r0 = this.G;
        if (r0 != 0) goto L5;
        return;
    L5:
        if (r7.b != 0) goto L39;
        int r9 = r8.a;
        ls2 r6 = this.h;
        if (r9 != (-102)) goto L10;
    L11:
        boolean r1 = true;
        if (r0 == 1) goto L15;
        r1 = false;
    L15:
        r6.getClass();
        jn2 r2 = r8.e;
        xa4 r10 = r8.f;
        int r3 = f92.g(r9);
        bk r4 = r6.u;
        if (r4 != null) goto L18;
    L20:
        if (r10 == null) goto L22;
        String r5 = r10.b;
    L23:
        Bundle r11 = Bundle.EMPTY;
        if (r2 == null) goto L28;
        Bundle r12 = r2.a;
        if (r12.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT") == false) goto L28;
        r11 = r12;
    L30:
        r6.u = new bk(r1, r3, r5, r11);
        r6.P(r6.g.s);
    L31:
        if (r9 == 0) goto L33;
        return;
    L33:
        if (r6.u == null) goto L38;
        r6.u = null;
        r6.P(r6.g.s);
        return;
    L38:
        return;
    L28:
        if (r10 == null) goto L30;
        r11 = r10.c;
        goto L30
    L22:
        r5 = "no error message provided";
        goto L23
    L18:
        if (r4.o != r3) goto L20;
    L10:
        if (r9 != (-105)) goto L31;
    }

    public final mw1 o(fr2 r2, List r3) {
        kn2 r0 = this.k;
        fr2 r4 = B(r2);
        return this.e.d(r0, r4, r3);
    }

    public final dr2 p(fr2 r9) {
        yw1 r1 = null;
        if (this.y == true) goto L5;
    L19:
        pq r0 = this.e;
        kn2 r2 = this.k;
        r0.getClass();
        r2.getClass();
        int r5 = 1;
        if (r0.p != null) goto L22;
    L25:
        Log.d("BaseSessionCallback", "onConnect: remove and add listener");
        if (r0.p == null) goto L28;
        r2.a().r0(r0.o);
    L28:
        r0.p = r2;
        r2.a().v(r0.o);
        n61.e = new mq(r0, r5);
    L29:
        int r6 = 0;
        if (r2.a.k(r9) == false) goto L32;
    L37:
        mi3 r3 = dr2.f;
        wa4 r4 = r0.s;
        r4.getClass();
        qi3 r7 = r2.a();
        r7.getClass();
        dr2 r8 = new dr2(r4, r3, null, yw1.k(r0.a(r7, false)));
    L39:
        if (k(r9) == false) goto L64;
        this.y = true;
        yw1 r10 = r8.d;
        if (r10 != null) goto L44;
        r10 = this.k.a.A;
    L44:
        boolean r11 = r10.isEmpty();
        ls2 r12 = this.h;
        if (r11 == false) goto L51;
        yw1 r13 = r8.c;
        if (r13 != null) goto L50;
        r13 = this.k.a.z;
    L50:
        r12.w = r13;
    L52:
        ls2 r14 = this.h;
        wa4 r15 = r8.a;
        mi3 r16 = r8.b;
        if (r14.z.a(17) != r16.a(17)) goto L56;
        r5 = 0;
    L56:
        r14.y = r15;
        r14.z = r16;
        if (r14.x.isEmpty() == true) goto L59;
        r14.O();
    L59:
        tn2 r17 = r14.g;
        if (r5 == 0) goto L63;
        f35.W(r17.l, new ds2(r14, r17.s, r6));
        return r8;
    L63:
        r14.P(r17.s);
        goto L64
    L51:
        r12.x = r10;
        r12.O();
    L64:
        return r8;
    L32:
        if (r2.b(r9) == true) goto L37;
        r2.a.getClass();
        if (r9.a.a.a.equals("com.google.android.projection.gearhead") == true) goto L37;
        wa4 r18 = dr2.e;
        r18.getClass();
        HashSet r19 = new HashSet(r18.a);
        r19.add(new va4("com.eddyizm.tempus.PLAY_NEXT_FIXUP", Bundle.EMPTY));
        r8 = new dr2(new wa4(r19), dr2.f, null, null);
        goto L39
    L22:
        if (r2.b(r9) == true) goto L25;
        r2.a.getClass();
        if (r9.a.a.a.equals("com.google.android.projection.gearhead") == false) goto L29;
    L5:
        if (m(r9) == false) goto L19;
        ls2 r20 = this.h;
        r20.getClass();
        wa4 r21 = dr2.e;
        wa4 r22 = r20.y;
        r22.getClass();
        mi3 r23 = r20.z;
        r23.getClass();
        if (r20.x.isEmpty() == true) goto L12;
        yw1 r24 = r20.x;
        if (r24 != null) goto L11;
        yw1 r25 = null;
    L18:
        return new dr2(r22, r23, r1, r25);
    L11:
        r25 = yw1.k(r24);
        goto L18
    L12:
        yw1 r26 = r20.w;
        if (r26 != null) goto L15;
        yw1 r27 = null;
    L16:
        r1 = r27;
        r25 = null;
        goto L18
    L15:
        r27 = yw1.k(r26);
        goto L16
    }

    public final ic2 q(fr2 r10, va4 r11, Bundle r12) {
        fr2 r13 = B(r10);
        pq r0 = this.e;
        r0.getClass();
        MediaService r1 = r0.b;
        kn2 r9 = this.k;
        r9.getClass();
        r13.getClass();
        r12.getClass();
        String r14 = r11.b;
        Log.d("BaseSessionCallback", "onCustomCommand: " + r14);
        int r4 = 1;
        int r5 = 0;
        switch(r14.hashCode()) {
            case -1023607354: goto L62;
            case -395959765: goto L57;
            case 192214611: goto L42;
            case 610148995: goto L39;
            case 758402520: goto L27;
            case 935679408: goto L17;
            case 935692670: goto L14;
            case 935692917: goto L11;
            case 2035641462: goto L6;
            default: goto L64;
        };
    L6:
        if (r14.equals("android.media3.session.demo.SHUFFLE_OFF") == false) goto L64;
        r9.a().s(false);
        r0.f(r9, false);
        return new mw1(new ab4(0));
    L11:
        if (r14.equals("android.media3.session.demo.REPEAT_ONE") == false) goto L64;
    L19:
        int r15 = r9.a().h();
        if (r15 == 0) goto L24;
        if (r15 == 1) goto L23;
        r4 = 0;
        goto L24
    L23:
        r4 = 2;
    L24:
        r9.a().p0(r4);
        r0.f(r9, false);
        return new mw1(new ab4(0));
    L14:
        if (r14.equals("android.media3.session.demo.REPEAT_OFF") == true) goto L19;
    L17:
        if (r14.equals("android.media3.session.demo.REPEAT_ALL") == true) goto L19;
    L27:
        if (r14.equals("android.media3.session.demo.SHUFFLE_ON") == false) goto L64;
        qi3 r16 = a.h();
        if (r16 != null) goto L33;
    L34:
        r9.a().s(true);
    L36:
        r0.f(r9, false);
        return new mw1(new ab4(0));
    L33:
        if (a.b == null) goto L34;
        io1.b.post(new at1(r16, r5));
        goto L36
    L39:
        if (r14.equals("android.media3.session.demo.HEART_OFF") == false) goto L64;
    L59:
        qi3 r17 = r9.a();
        r17.getClass();
        boolean r18 = pq.c(r17);
        r0.f(r9, true);
        vl1 r19 = new vl1(!r18);
        gn2 r110 = r9.a().a();
        r110.getClass();
        String r111 = r110.a;
        r111.getClass();
        return r0.e(r9, r13, r111, r19);
    L42:
        if (r14.equals("android.media3.session.demo.INSTANT_MIX_ON") == false) goto L64;
        if (bo2.c.get() == false) goto L47;
    L53:
        Log.d("BaseSessionCallback", "onCustomCommand: onInstantMix not usable");
    L54:
        r0.f(r9, false);
        return new mw1(new ab4(0));
    L47:
        if (ud3.T() == false) goto L53;
        Log.d("BaseSessionCallback", "onCustomCommand: start onInstantMix");
        k6 r112 = new k6(11, r0, r9);
        qi3 r113 = r9.a();
        r113.getClass();
        gn2 r114 = r113.a();
        int r2 = r113.o0();
        int r115 = r113.Q0();
        int r3 = r115 - 1;
        if (r2 < 0) goto L52;
        if (r2 >= r3) goto L52;
        Log.d("BaseMediaService", "onInstantMix: remove range from " + r2 + " to " + r3);
        bo2.k(r1, r2 + 1, r115);
    L52:
        Log.d("BaseMediaService", "onInstantMix: start Continuous Play with " + r114);
        bo2.c(r114, r1, new vp(r112, r5));
        goto L54
    L57:
        if (r14.equals("android.media3.session.demo.HEART_ON") == true) goto L59;
    L62:
        if (r14.equals("com.eddyizm.tempus.PLAY_NEXT_FIXUP") == false) goto L64;
        r1.a(r12.getInt("play_next_insert_pos", -1), r12.getInt("play_next_count", 0), r12.getInt("play_next_target_count", -1));
        return new mw1(new ab4(0));
    L64:
        return new mw1(new ab4(new xa4(-6, r14)));
    }

    public final ic2 r(fr2 r8, String r9, int r10, jn2 r11) {
        boolean r12 = Objects.equals(r9, "androidx.media3.session.recent.root");
        int r0 = 0;
        pq r1 = this.D;
        if (r12 == true) goto L5;
        B(r8);
        r1.getClass();
        mw1 r3 = new mw1(m92.b(-6));
        r3.f(new qn2(this, r3, r8, r10, 0), new rn2(this, r0));
        return r3;
    L5:
        if (this.h.o == null) goto L16;
        if (this.s.g() != 1) goto L13;
        lb4 r13 = new lb4();
        if (this.y == false) goto L11;
        g().getClass();
    L11:
        r1.getClass();
        UnsupportedOperationException r7 = new UnsupportedOperationException();
        lw1 r14 = new lw1();
        r14.m(r7);
        r14.f(new lg1(r0, r14, new gp3(14, r13, r11)), gq0.n);
        return r13;
    L13:
        um2 r15 = new um2();
        vw1 r16 = yw1.o;
        gy3 r17 = gy3.r;
        List r18 = Collections.EMPTY_LIST;
        gy3 r19 = gy3.r;
        zm2 r20 = new zm2();
        cn2 r6 = cn2.d;
        co2 r21 = new co2();
        r21.q = Boolean.FALSE;
        r21.r = Boolean.TRUE;
        do2 r5 = new do2(r21);
        return new mw1(m92.c(yw1.o(new gn2("androidx.media3.session.recent.item", new wm2(r15), null, new an2(r20), r5, r6)), r11));
    L16:
        return new mw1(m92.b(-6));
    }

    public final mw1 s(fr2 r13, jn2 r14) {
        if (r14 != null) goto L5;
    L14:
        B(r13);
        this.D.getClass();
        return new mw1(m92.b(-6));
    L5:
        if (r14.b == false) goto L14;
        if (m(r13) == false) goto L14;
        if (this.h.o == null) goto L13;
        um2 r0 = new um2();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        List r3 = Collections.EMPTY_LIST;
        gy3 r4 = gy3.r;
        zm2 r5 = new zm2();
        cn2 r11 = cn2.d;
        co2 r6 = new co2();
        r6.q = Boolean.TRUE;
        r6.r = Boolean.FALSE;
        do2 r10 = new do2(r6);
        gn2 r7 = new gn2("androidx.media3.session.recent.root", new wm2(r0), null, new an2(r5), r10, r11);
        m92.d(r7);
        return new mw1(new m92(0, SystemClock.elapsedRealtime(), r14, null, r7, 2));
    L13:
        return new mw1(m92.b(-6));
    }

    public final boolean t(fr2 r11, Intent r12) {
        int r0 = r11.b;
        Bundle r1 = r12.getExtras();
        qo2 r2 = null;
        if (r1 != null) goto L5;
    L7:
        KeyEvent r3 = null;
    L8:
        ComponentName r4 = r12.getComponent();
        if (Objects.equals(r12.getAction(), "android.intent.action.MEDIA_BUTTON") == false) goto L72;
        MediaService r5 = this.f;
        if (r4 != null) goto L13;
    L14:
        if (r3 == null) goto L72;
        F();
        this.e.getClass();
        int r7 = 1;
        if (r3.getAction() == 0) goto L30;
        int r10 = r3.getKeyCode();
        if (r10 != 79) goto L21;
    L71:
        return true;
    L21:
        if (r10 == 126) goto L71;
        if (r10 == 127) goto L71;
        if (r10 == 272) goto L71;
        if (r10 == 273) goto L71;
        switch(r10) {
            case 85: goto L71;
            case 86: goto L71;
            case 87: goto L71;
            case 88: goto L71;
            case 89: goto L71;
            case 90: goto L71;
            default: goto L72;
        };
    L30:
        int r6 = r3.getKeyCode();
        boolean r8 = r5.getPackageManager().hasSystemFeature("android.software.leanback");
        cj2 r9 = this.d;
        if (r6 == 79) goto L38;
        if (r6 == 85) goto L38;
        qo2 r13 = (qo2) r9.b;
        if (r13 == null) goto L36;
        r9.removeCallbacks(r13);
        qo2 r14 = (qo2) r9.b;
        r9.b = null;
        r2 = r14;
    L36:
        if (r2 == null) goto L55;
        f35.W(r9, r2);
    L55:
        boolean r15 = false;
    L57:
        if (this.y == true) goto L67;
        ls2 r16 = this.h;
        if (r6 == 85) goto L61;
        if (r6 == 79) goto L61;
    L64:
        if (r0 == 0) goto L72;
        ((xk2) ((wo0) r16.m.p).n).a.dispatchMediaButtonEvent(r3);
        return true;
    L61:
        if (r15 == false) goto L64;
        r16.z();
        return true;
    L67:
        boolean r17 = r12.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
        if (r3.getRepeatCount() > 0) goto L71;
        if (c(r3, r15, r17) == false) goto L72;
    L38:
        if (r8 == true) goto L50;
        if (r0 != 0) goto L50;
        if (r3.getRepeatCount() != 0) goto L50;
        qo2 r18 = (qo2) r9.b;
        if (r18 == null) goto L48;
        if (r18 == null) goto L47;
        r9.removeCallbacks(r18);
        r9.b = null;
    L47:
        r15 = true;
        goto L57
    L48:
        qo2 r19 = new qo2(r9, r11, r3, r7);
        r9.b = r19;
        r9.postDelayed(r19, ViewConfiguration.getDoubleTapTimeout());
        return true;
    L50:
        qo2 r110 = (qo2) r9.b;
        if (r110 == null) goto L53;
        r9.removeCallbacks(r110);
        qo2 r111 = (qo2) r9.b;
        r9.b = null;
        r2 = r111;
    L53:
        if (r2 == null) goto L55;
        f35.W(r9, r2);
        goto L55
    L13:
        if (Objects.equals(r4.getPackageName(), r5.getPackageName()) == true) goto L14;
    L72:
        return false;
    L5:
        if (r1.containsKey("android.intent.extra.KEY_EVENT") == false) goto L7;
        r3 = (KeyEvent) r1.getParcelable("android.intent.extra.KEY_EVENT");
        goto L8
    }

    public final boolean u() {
        if (Looper.myLooper() == Looper.getMainLooper()) goto L10;
        lb4 r0 = new lb4();
        ws1 r1 = new ws1(29, this, r0);
        this.o.post(r1);
        return ((Boolean) r0.get()).booleanValue();
    L7:
        e = move-exception;
        throw new IllegalStateException(e);
    L10:
        rm2 r2 = this.v;
        if (r2 == null) goto L21;
        MediaLibraryService r3 = (MediaLibraryService) r2.o;
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 31) goto L21;
        if (r4 >= 33) goto L21;
        int r5 = MediaLibraryService.t;
        if (r3.d().x == true) goto L21;
        return r3.k(this.k, true);
    L21:
        return true;
    }

    public final void v(fr2 r4, mi3 r5) {
        fr2 r6 = B(r4);
        this.e.getClass();
        kn2 r3 = this.k;
        r3.getClass();
        r6.getClass();
        r5.getClass();
        w71 r7 = r5.a;
        if (r7.a(new int[]{9, 8, 7, 6}) == true) goto L5;
        return;
    L5:
        if (r7.a(new int[]{1, 3}) == true) goto L19;
        qi3 r8 = r3.a();
        r8.getClass();
        if (r8.a() != null) goto L10;
        return;
    L10:
        if (r8.q() == false) goto L13;
        return;
    L13:
        if (r8.g() != 1) goto L15;
        r8.b();
    L15:
        r8.m0();
        return;
    }

    public final mw1 w(fr2 r4) {
        B(r4);
        this.D.getClass();
        mw1 r1 = new mw1(m92.b(-6));
        r1.f(new sn2(this, r1, r4, 1), new rn2(this, 0));
        return r1;
    }

    public final lb4 x(fr2 r2, List r3, final int r4, final long r5) {
        fr2 r6 = B(r2);
        pq r0 = this.e;
        r0.getClass();
        return f35.h0(r0.d(this.k, r6, r3), new cr2(r4, r5));
    }

    public final lb4 y(fr2 r11, String r12, jn2 r13) {
        er2 r0 = r11.d;
        r0.getClass();
        this.F.j(r0, r12);
        this.E.j(r12, r11);
        fr2 r5 = B(r11);
        this.D.getClass();
        mw1 r2 = new mw1(m92.b(-6));
        kn2 r6 = this.C;
        lb4 r3 = f35.h0(r2, new dg0(r5, r6, r12, r13, 5));
        r3.f(new t6(this, r3, r11, r12, 16), new rn2(this, 1));
        return r3;
    }

    public final mw1 z(fr2 r10, String r11) {
        B(r10);
        this.D.getClass();
        mw1 r0 = new mw1(new m92(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        r0.f(new v6(this, r10, r11, 28), new rn2(this, 0));
        return r0;
    }
}
