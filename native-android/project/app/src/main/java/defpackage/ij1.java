package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements Handler.Callback {
    public static final Status C = null;
    public static final Status D = null;
    public static final Object E = null;
    public static ij1 F;
    public final zw2 A;
    public volatile boolean B;
    public long n;
    public boolean o;
    public kr4 p;
    public r61 q;
    public final Context r;
    public final ej1 s;
    public final hd5 t;
    public final AtomicInteger u;
    public final AtomicInteger v;
    public final ConcurrentHashMap w;
    public df5 x;
    public final qi y;
    public final qi z;

    static {
        C = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
        D = new Status(4, "The user must be signed in to make this API call.", null, null);
        E = new Object();
    }

    public ij1(Context r7, Looper r8) {
        ej1 r0 = ej1.c;
        this.n = 10000;
        this.o = false;
        boolean r3 = true;
        this.u = new AtomicInteger(1);
        this.v = new AtomicInteger(0);
        this.w = new ConcurrentHashMap(5, 0.75f, 1);
        this.x = null;
        this.y = new qi(0);
        this.z = new qi(0);
        this.B = true;
        this.r = r7;
        zw2 r2 = new zw2(r8, this, 2);
        Looper.getMainLooper();
        this.A = r2;
        this.s = r0;
        this.t = new hd5(23);
        PackageManager r9 = r7.getPackageManager();
        if (kb4.h != null) goto L12;
        if (Build.VERSION.SDK_INT >= 26) goto L7;
    L9:
        r3 = false;
    L10:
        kb4.h = Boolean.valueOf(r3);
        goto L12
    L7:
        if (r9.hasSystemFeature("android.hardware.type.automotive") == false) goto L9;
    L12:
        if (kb4.h.booleanValue() == false) goto L14;
        this.B = false;
    L14:
        r2.sendMessage(r2.obtainMessage(6));
    }

    public static Status d(ve r4, ka0 r5) {
        return new Status(17, "API: " + ((String) r4.b.o) + " is not available on this device. Connection failed with: " + String.valueOf(r5), r5.p, r5);
    }

    public static ij1 f(Context r5) {
        Object r0 = E;
        monitor-enter(r0);
    L18:
        th = move-exception;
        throw th;
    L5:
        if (F != null) goto L22;
        Object r1 = tk5.g;     // Catch: Throwable -> L18
        monitor-enter(r1);     // Catch: Throwable -> L18
        HandlerThread r2 = tk5.i;     // Catch: Throwable -> L12
        if (r2 == null) goto L14;
        monitor-exit(r1);     // Catch: Throwable -> L12
    L16:
        Looper r3 = r2.getLooper();     // Catch: Throwable -> L18
        Context r6 = r5.getApplicationContext();     // Catch: Throwable -> L18
        Object r4 = ej1.b;     // Catch: Throwable -> L18
        F = new ij1(r6, r3);     // Catch: Throwable -> L18
        goto L22
    L14:
        HandlerThread r7 = new HandlerThread("GoogleApiHandler", 9);     // Catch: Throwable -> L12
        tk5.i = r7;     // Catch: Throwable -> L12
        r7.start();     // Catch: Throwable -> L12
        r2 = tk5.i;     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L22:
        ij1 r8 = F;     // Catch: Throwable -> L18
        monitor-exit(r0);     // Catch: Throwable -> L18
        return r8;
    }

    public final void a(df5 r3) {
        Object r0 = E;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.x == r3) goto L9;
        this.x = r3;     // Catch: Throwable -> L7
        this.y.clear();     // Catch: Throwable -> L7
    L9:
        this.y.addAll(r3.s);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final boolean b() {
        if (this.o == true) goto L18;
        e34 r0 = (e34) d34.E().o;
        if (r0 != null) goto L8;
    L9:
        int r2 = ((SparseIntArray) this.t.o).get(203400000, -1);
        if (r2 == (-1)) goto L15;
        if (r2 == 0) goto L19;
        return false;
    L19:
        return true;
    L15:
        return true;
    L8:
        if (r0.o == true) goto L9;
        return false;
    L18:
        return false;
    }

    public final boolean c(ka0 r9, int r10) {
        ej1 r0 = this.s;
        Context r8 = this.r;
        r0.getClass();
        monitor-enter(zz1.class);
        Context r2 = r8.getApplicationContext();     // Catch: Throwable -> L13
        Context r3 = zz1.a;     // Catch: Throwable -> L13
        PendingIntent r6 = null;
        if (r3 == null) goto L15;
        Boolean r7 = zz1.b;     // Catch: Throwable -> L13
        if (r7 == null) goto L15;
        if (r3 != r2) goto L15;
        boolean r4 = r7.booleanValue();     // Catch: Throwable -> L13
        monitor-exit(zz1.class);
    L27:
        if (r4 == true) goto L42;
        int r1 = r9.o;
        if (r1 == 0) goto L34;
        PendingIntent r5 = r9.p;
        if (r5 == null) goto L34;
    L39:
        if (r5 == null) goto L42;
        int r11 = r9.o;
        int r12 = GoogleApiActivity.o;
        Intent r13 = new Intent(r8, GoogleApiActivity.class);
        r13.putExtra("pending_intent", r5);
        r13.putExtra("failing_client_id", r10);
        r13.putExtra("notify_manager", true);
        r0.f(r8, r11, PendingIntent.getActivity(r8, 0, r13, gg5.a | 134217728));
        return true;
    L34:
        Intent r14 = r0.a(r1, r8, null);
        if (r14 == null) goto L38;
        r6 = PendingIntent.getActivity(r8, 0, r14, 201326592);
    L38:
        r5 = r6;
    L42:
        return false;
    L15:
        zz1.b = null;     // Catch: Throwable -> L13
        if (Build.VERSION.SDK_INT < 26) goto L18;
        boolean r15 = true;
    L19:
        if (r15 == false) goto L46;
        zz1.b = Boolean.valueOf(gm0.B(r2.getPackageManager()));     // Catch: Throwable -> L13
    L25:
        zz1.a = r2;     // Catch: Throwable -> L13
        r4 = zz1.b.booleanValue();     // Catch: Throwable -> L13
        monitor-exit(zz1.class);
        goto L27
    L46:
        r8.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");     // Catch: Throwable -> L13 ClassNotFoundException -> L24
        zz1.b = Boolean.TRUE;     // Catch: Throwable -> L13 ClassNotFoundException -> L24
    L24:
        zz1.b = Boolean.FALSE;     // Catch: Throwable -> L13
        goto L25
    L18:
        r15 = false;
    L13:
        th = move-exception;
        throw th;
    }

    public final gf5 e(dj1 r4) {
        ve r0 = r4.e;
        ConcurrentHashMap r1 = this.w;
        gf5 r2 = (gf5) r1.get(r0);
        if (r2 != null) goto L6;
        r2 = new gf5(this, r4);
        r1.put(r0, r2);
    L6:
        if (r2.f.i0() == false) goto L8;
        this.z.add(r0);
    L8:
        r2.j();
        return r2;
    }

    public final void g(ka0 r3, int r4) {
        if (c(r3, r4) == true) goto L6;
        zw2 r2 = this.A;
        r2.sendMessage(r2.obtainMessage(5, r4, 0, r3));
        return;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r15) {
        int r0 = r15.what;
        long r2 = 300000;
        int r5 = 0;
        switch(r0) {
            case 1: goto L199;
            case 2: goto L196;
            case 3: goto L192;
            case 4: goto L181;
            case 5: goto L165;
            case 6: goto L135;
            case 7: goto L132;
            case 8: goto L181;
            case 9: goto L127;
            case 10: goto L118;
            case 11: goto L106;
            case 12: goto L91;
            case 13: goto L181;
            case 14: goto L88;
            case 15: goto L75;
            case 16: goto L54;
            case 17: goto L42;
            case 18: goto L8;
            case 19: goto L6;
            default: goto L4;
        };
    L4:
        Log.w("GoogleApiManager", "Unknown message id: " + r0);
        return false;
    L6:
        this.o = false;
        return true;
    L8:
        of5 r16 = (of5) r15.obj;
        if (r16.c != 0) goto L15;
        kr4 r1 = new kr4(Arrays.asList(new iw2[]{r16.a}), r16.b);
        if (this.q != null) goto L13;
        this.q = new r61(this.r, null, r61.m, lr4.n, cj1.c);
    L13:
        r61 r14 = this.q;
        r14.getClass();
        bk r17 = bk.b();
        r17.r = new p61[]{hw.e};
        r17.p = false;
        r17.q = new h95(r1);
        r14.b(2, r17.a());
        return true;
    L15:
        kr4 r3 = this.p;
        if (r3 == null) goto L39;
        List r4 = r3.o;
        if (r3.n != r16.b) goto L27;
        if (r4 != null) goto L21;
    L23:
        kr4 r6 = this.p;
        iw2 r7 = r16.a;
        if (r6.o != null) goto L26;
        r6.o = new ArrayList();
    L26:
        r6.o.add(r7);
        goto L39
    L21:
        if (r4.size() < r16.d) goto L23;
    L27:
        this.A.removeMessages(17);
        kr4 r8 = this.p;
        if (r8 == null) goto L39;
        if (r8.n > 0) goto L34;
        if (b() == true) goto L34;
    L37:
        this.p = null;
    L34:
        if (this.q != null) goto L36;
        this.q = new r61(this.r, null, r61.m, lr4.n, cj1.c);
    L36:
        r61 r9 = this.q;
        r9.getClass();
        bk r10 = bk.b();
        r10.r = new p61[]{hw.e};
        r10.p = false;
        r10.q = new h95(r8);
        r9.b(2, r10.a());
    L39:
        if (this.p != null) goto L206;
        ArrayList r11 = new ArrayList();
        r11.add(r16.a);
        this.p = new kr4(r11, r16.b);
        zw2 r18 = this.A;
        r18.sendMessageDelayed(r18.obtainMessage(17), r16.c);
        return true;
    L206:
        return true;
    L42:
        kr4 r19 = this.p;
        if (r19 == null) goto L206;
        if (r19.n > 0) goto L49;
        if (b() == true) goto L49;
    L52:
        this.p = null;
        return true;
    L49:
        if (this.q != null) goto L51;
        this.q = new r61(this.r, null, r61.m, lr4.n, cj1.c);
    L51:
        r61 r12 = this.q;
        r12.getClass();
        bk r13 = bk.b();
        r13.r = new p61[]{hw.e};
        r13.p = false;
        r13.q = new h95(r19);
        r12.b(2, r13.a());
        goto L52
    L54:
        hf5 r110 = (hf5) r15.obj;
        if (this.w.containsKey(r110.a) == false) goto L206;
        gf5 r111 = (gf5) this.w.get(r110.a);
        ArrayList r20 = r111.n;
        ij1 r21 = r111.q;
        LinkedList r22 = r111.e;
        if (r20.remove(r110) == false) goto L206;
        r21.A.removeMessages(15, r110);
        r21.A.removeMessages(16, r110);
        p61 r112 = r110.b;
        ArrayList r23 = new ArrayList(r22.size());
        Iterator r24 = r22.iterator();
    L60:
        if (r24.hasNext() == false) goto L72;
        cg5 r25 = (cg5) r24.next();
        if ((r25 instanceof kf5) == false) goto L60;
        p61[] r26 = ((kf5) r25).g(r111);
        if (r26 == null) goto L60;
        int r27 = r26.length;
        int r28 = 0;
    L66:
        if (r28 >= r27) goto L60;
        if (au0.n(r26[r28], r112) == true) goto L69;
        r28 = r28 + 1;
        goto L66
    L69:
        if (r28 < 0) goto L60;
        r23.add(r25);
        goto L60
    L72:
        int r113 = r23.size();
    L73:
        if (r5 >= r113) goto L206;
        cg5 r29 = (cg5) r23.get(r5);
        r22.remove(r29);
        r29.b(new UnsupportedApiCallException(r112));
        r5 = r5 + 1;
        goto L73
    L75:
        hf5 r114 = (hf5) r15.obj;
        if (this.w.containsKey(r114.a) == false) goto L206;
        gf5 r115 = (gf5) this.w.get(r114.a);
        if (r115.n.contains(r114) == false) goto L206;
        if (r115.m == true) goto L206;
        if (r115.f.Y() == true) goto L86;
        r115.j();
        return true;
    L86:
        r115.d();
        return true;
    L88:
        r15.obj.getClass();
        kf2.k();
        return false;
    L118:
        qi r116 = this.z;
        r116.getClass();
        ki r30 = new ki(r116);
    L120:
        if (r30.hasNext() == false) goto L124;
        gf5 r117 = (gf5) this.w.remove((ve) r30.next());
        if (r117 == null) goto L120;
        r117.o();
        goto L120
    L124:
        this.z.clear();
        return true;
    L132:
        e((dj1) r15.obj);
        return true;
    L165:
        int r31 = r15.arg1;
        ka0 r118 = (ka0) r15.obj;
        Iterator r32 = this.w.values().iterator();
    L167:
        if (r32.hasNext() == false) goto L171;
        gf5 r33 = (gf5) r32.next();
        if (r33.k != r31) goto L167;
    L172:
        if (r33 == null) goto L179;
        int r34 = r118.o;
        if (r34 != 13) goto L177;
        this.s.getClass();
        int r119 = lj1.e;
        r33.b(new Status(17, "Error resolution was canceled by the user, original error message: " + ka0.b(r34) + ": " + r118.q, null, null));
        return true;
    L177:
        r33.b(d(r33.g, r118));
        return true;
    L179:
        Log.wtf("GoogleApiManager", b11.j(r31, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
        return true;
    L171:
        r33 = null;
        goto L172
    L181:
        pf5 r120 = (pf5) r15.obj;
        gf5 r35 = (gf5) this.w.get(r120.c.e);
        if (r35 != null) goto L185;
        r35 = e(r120.c);
    L185:
        if (r35.f.i0() == true) goto L187;
    L190:
        r35.k(r120.a);
        return true;
    L187:
        if (this.v.get() == r120.b) goto L190;
        r120.a.a(C);
        r35.o();
        return true;
    L192:
        Iterator r121 = this.w.values().iterator();
    L194:
        if (r121.hasNext() == false) goto L206;
        gf5 r122 = (gf5) r121.next();
        ji2.j(r122.q.A);
        r122.o = null;
        r122.j();
        goto L194
    L196:
        r15.obj.getClass();
        kf2.k();
        return false;
    L91:
        if (this.w.containsKey(r15.obj) == false) goto L206;
        gf5 r123 = (gf5) this.w.get(r15.obj);
        ji2.j(r123.q.A);
        me r124 = r123.f;
        if (r124.Y() == true) goto L95;
    L104:
        return true;
    L95:
        if (r123.j.isEmpty() == false) goto L104;
        xc5 r36 = r123.h;
        if (((Map) r36.o).isEmpty() == true) goto L99;
    L103:
        r123.g();
        goto L104
    L99:
        if (((Map) r36.p).isEmpty() == false) goto L103;
        r124.a0("Timing out service connection.");
        return true;
    L106:
        if (this.w.containsKey(r15.obj) == false) goto L206;
        gf5 r125 = (gf5) this.w.get(r15.obj);
        ij1 r126 = r125.q;
        ji2.j(r126.A);
        boolean r37 = r125.m;
        if (r37 == false) goto L206;
        ve r38 = r125.g;
        zw2 r39 = r125.q.A;
        if (r37 == false) goto L113;
        r39.removeMessages(11, r38);
        r39.removeMessages(9, r38);
        r125.m = false;
    L113:
        if (r126.s.b(r126.r, fj1.a) != 18) goto L115;
        Status r40 = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
    L116:
        r125.b(r40);
        r125.f.a0("Timing out connection while resuming.");
        return true;
    L115:
        r40 = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
        goto L116
    L127:
        if (this.w.containsKey(r15.obj) == false) goto L206;
        gf5 r127 = (gf5) this.w.get(r15.obj);
        ji2.j(r127.q.A);
        if (r127.m == false) goto L206;
        r127.j();
        return true;
    L135:
        if ((this.r.getApplicationContext() instanceof Application) == false) goto L206;
        Application r128 = (Application) this.r.getApplicationContext();
        so r41 = so.r;
        monitor-enter(r41);
    L141:
        th = move-exception;
        throw th;
    L139:
        if (r41.q == true) goto L143;
        r128.registerActivityLifecycleCallbacks(r41);     // Catch: Throwable -> L141
        r128.registerComponentCallbacks(r41);     // Catch: Throwable -> L141
        r41.q = true;     // Catch: Throwable -> L141
    L143:
        monitor-exit(r41);     // Catch: Throwable -> L141
        ff5 r129 = new ff5(this);
        monitor-enter(r41);
        r41.p.add(r129);     // Catch: Throwable -> L159
        monitor-exit(r41);     // Catch: Throwable -> L159
        AtomicBoolean r130 = r41.n;
        AtomicBoolean r42 = r41.o;
        if (r42.get() == true) goto L156;
        ActivityManager.RunningAppProcessInfo r43 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(r43);
        if (r42.getAndSet(true) == true) goto L156;
        if (r43.importance <= 100) goto L156;
        r130.set(true);
    L156:
        if (r130.get() == true) goto L206;
        this.n = 300000;
        return true;
    L159:
        th = move-exception;
        throw th;
    L199:
        if (true != ((Boolean) r15.obj).booleanValue()) goto L202;
        r2 = 10000;
    L202:
        this.n = r2;
        this.A.removeMessages(12);
        Iterator r131 = this.w.keySet().iterator();
    L204:
        if (r131.hasNext() == false) goto L206;
        ve r44 = (ve) r131.next();
        zw2 r45 = this.A;
        r45.sendMessageDelayed(r45.obtainMessage(12, r44), this.n);
        goto L204
    }
}
