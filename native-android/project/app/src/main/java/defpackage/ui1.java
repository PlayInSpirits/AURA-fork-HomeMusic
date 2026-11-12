package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 {
    public static final /* synthetic */ int B = 0;
    public final zh0 A;
    public final ri1 a;
    public final HashMap b;
    public wq2 c;
    public oq2 d;
    public uq2 e;
    public final Context f;
    public final ArrayList g;
    public final ArrayList h;
    public final HashMap i;
    public final HashMap j;
    public final ArrayList k;
    public final ArrayList l;
    public final hh3 m;
    public final si1 n;
    public final boolean o;
    public final boolean p;
    public final zo2 q;
    public final vg3 r;
    public final zq2 s;
    public wq2 t;
    public wq2 u;
    public wq2 v;
    public nq2 w;
    public up2 x;
    public up2 y;
    public int z;

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public ui1(Context r8) {
        this.a = new ri1(this);
        this.b = new HashMap();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new hh3(13);
        this.n = new si1(0, this);
        this.A = new zh0(28, this);
        this.f = r8;
        this.o = ((ActivityManager) r8.getSystemService("activity")).isLowRamDevice();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L7;
        int r4 = fu2.b;
        Intent r5 = new Intent(r8, fu2.class);
        r5.setPackage(r8.getPackageName());
        if (r8.getPackageManager().queryBroadcastReceivers(r5, 0).size() <= 0) goto L7;
        boolean r6 = true;
    L8:
        this.p = r6;
        int r7 = fq4.a;
        Intent r9 = new Intent(r8, fq4.class);
        r9.setPackage(r8.getPackageName());
        r8.getPackageManager().queryBroadcastReceivers(r9, 0).size();
        if (r0 < 30) goto L12;
        if (r6 == false) goto L12;
        zo2 r1 = new zo2(r8, new hg3(22, this));
    L13:
        this.q = r1;
        vg3 r3 = new vg3(r8, this);
        this.r = r3;
        this.s = new zq2(new qa1(2, this));
        a(r3, true);
        if (r1 == null) goto L16;
        a(r1, true);
    L16:
        ip0 r2 = new ip0(r8, this);
        Handler r10 = (Handler) r2.d;
        if (r2.a == true) goto L20;
        r2.a = true;
        IntentFilter r11 = new IntentFilter();
        r11.addAction("android.intent.action.PACKAGE_ADDED");
        r11.addAction("android.intent.action.PACKAGE_REMOVED");
        r11.addAction("android.intent.action.PACKAGE_CHANGED");
        r11.addAction("android.intent.action.PACKAGE_REPLACED");
        r11.addAction("android.intent.action.PACKAGE_RESTARTED");
        r11.addDataScheme("package");
        ((Context) r2.b).registerReceiver((v9) r2.g, r11, null, r10);
        r10.post((g5) r2.h);
        return;
    L20:
        return;
    L12:
        r1 = null;
    L7:
        r6 = false;
        goto L8
    }

    public final void a(qq2 r3, boolean r4) {
        if (d(r3) != null) goto L6;
        vq2 r0 = new vq2(r3, r4);
        this.k.add(r0);
        this.a.b(513, r0);
        m(r0, r3.t);
        yq2.b();
        r3.q = this.n;
        r3.g(this.x);
        return;
    }

    public final String b(vq2 r10, String r11) {
        String r0 = ((ComponentName) r10.d.o).flattenToShortString();
        boolean r12 = r10.c;
        if (r12 == false) goto L5;
        String r1 = r11;
    L6:
        HashMap r2 = this.j;
        if (r12 == true) goto L30;
        ArrayList r9 = this.h;
        int r13 = r9.size();
        int r4 = 0;
    L10:
        if (r4 >= r13) goto L15;
        if (((wq2) r9.get(r4)).c.equals(r1) == true) goto L16;
        r4 = r4 + 1;
    L16:
        if (r4 < 0) goto L30;
        Log.w("AxMediaRouter", f34.h("Either ", r11, " isn't unique in ", r0, " or we're trying to assign a unique ID for an already added route"));
        int r14 = 2;
    L19:
        Locale r5 = Locale.US;
        String r6 = r1 + "_" + r14;
        int r7 = r9.size();
        int r8 = 0;
    L20:
        if (r8 >= r7) goto L25;
        if (((wq2) r9.get(r8)).c.equals(r6) == true) goto L26;
        r8 = r8 + 1;
    L26:
        if (r8 < 0) goto L27;
        r14 = r14 + 1;
        goto L19
    L27:
        r2.put(new ld3(r0, r11), r6);
        return r6;
    L25:
        r8 = -1;
        goto L26
    L15:
        r4 = -1;
    L30:
        r2.put(new ld3(r0, r11), r1);
        return r1;
    L5:
        r1 = b11.o(r0, ":", r11);
        goto L6
    }

    public final wq2 c() {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L16;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        wq2 r4 = (wq2) r3;
        if (r4 == this.t) goto L3;
        if (r4.c() != this.r) goto L3;
        if (r4.l("android.media.intent.category.LIVE_AUDIO") == false) goto L3;
        if (r4.l("android.media.intent.category.LIVE_VIDEO") == true) goto L3;
        if (r4.f() == false) goto L3;
        return r4;
    L16:
        return this.t;
    }

    public final vq2 d(qq2 r5) {
        ArrayList r4 = this.k;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        vq2 r3 = (vq2) r2;
        if (r3.a != r5) goto L3;
        return r3;
    L7:
        return null;
    }

    public final void e() {
        Iterator r1 = this.i.values().iterator();
        if (r1.hasNext() == true) goto L6;
        return;
    L6:
        throw xa3.d(r1);
    }

    public final oq2 f(wq2 r2) {
        if (r2 != this.c) goto L8;
        oq2 r0 = this.d;
        if (r0 == null) goto L8;
        return r0;
    L8:
        if ((r2 instanceof tq2) == true) goto L10;
    L13:
        oq2 r3 = (oq2) this.b.get(r2.c);
        if (r3 == null) goto L16;
        return r3;
    L16:
        Iterator r1 = this.i.values().iterator();
        if (r1.hasNext() == true) goto L20;
        return r3;
    L20:
        throw xa3.d(r1);
    L10:
        if (((tq2) r2).m() == false) goto L13;
        e();
        return null;
    }

    public final wq2 g() {
        wq2 r0 = this.c;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final void h() {
        if (this.c.e() == false) goto L23;
        List r0 = Collections.unmodifiableList(this.c.v);
        HashSet r1 = new HashSet();
        Iterator r2 = r0.iterator();
    L7:
        if (r2.hasNext() == false) goto L9;
        r1.add(((wq2) r2.next()).c);
        goto L7
    L9:
        HashMap r3 = this.b;
        Iterator r4 = r3.entrySet().iterator();
    L11:
        if (r4.hasNext() == false) goto L15;
        Map.Entry r5 = (Map.Entry) r4.next();
        if (r1.contains(r5.getKey()) == true) goto L11;
        oq2 r6 = (oq2) r5.getValue();
        r6.h(0);
        r6.d();
        r4.remove();
        goto L11
    L15:
        Iterator r7 = r0.iterator();
    L17:
        if (r7.hasNext() == false) goto L37;
        wq2 r8 = (wq2) r7.next();
        if (r3.containsKey(r8.c) == true) goto L17;
        oq2 r9 = r8.c().d(r8.b, this.c.b);
        if (r9 == null) goto L17;
        r9.e();
        r3.put(r8.c, r9);
        goto L17
    L37:
        return;
    }

    public final void i(wq2 r5, int r6, boolean r7) {
        if (this.h.contains(r5) == true) goto L7;
        Log.w("AxMediaRouter", "Ignoring attempt to select removed route: " + r5);
        return;
    L7:
        if (r5.g == true) goto L10;
        Log.w("AxMediaRouter", "Ignoring attempt to select disabled route: " + r5);
        return;
    L10:
        wq2 r0 = this.c;
        if (r0 == r5) goto L27;
        if (r0 == null) goto L15;
        tq2 r1 = r0.a();
    L16:
        if (r1 == null) goto L30;
        if (Collections.unmodifiableList(r1.v).size() != 1) goto L30;
        mq2 r2 = (mq2) r1.x.get(r5.c);
        if (r2 == null) goto L22;
        int r3 = r2.b;
    L24:
        if (r3 == 3) goto L27;
        if (r3 != 2) goto L30;
    L22:
        r3 = 4;
    L30:
        if (Build.VERSION.SDK_INT < 30) goto L45;
        qq2 r4 = r5.c();
        zo2 r8 = this.q;
        if (r4 != r8) goto L45;
        if (this.c == r5) goto L45;
        String r9 = r5.b;
        MediaRoute2Info r10 = r8.h(r9);
        if (r10 != null) goto L40;
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + r9);
        return;
    L40:
        if (TextUtils.equals(r8.E, r9) == false) goto L43;
        Log.w("MR2Provider", "Ignoring attempt to transfer to pending transfer route: " + r10);
        return;
    L43:
        r8.E = r9;
        l3.v(r8.v, r10);
        return;
    L45:
        j(r5, r6, r7);
        return;
    L15:
        r1 = null;
    L27:
        Log.w("AxMediaRouter", "Ignoring attempt to select selected route: " + r5);
    }

    public final void j(wq2 r15, int r16, boolean r17) {
        if (this.c != r15) goto L5;
        return;
    L5:
        boolean r1 = false;
        if (r15 != this.t) goto L8;
        boolean r0 = true;
    L10:
        if (this.u == null) goto L27;
        if (r0 == false) goto L27;
        StackTraceElement[] r2 = Thread.currentThread().getStackTrace();
        StringBuilder r4 = new StringBuilder("- Stacktrace: [");
        int r8 = 3;
    L14:
        if (r8 >= r2.length) goto L18;
        StackTraceElement r9 = r2[r8];
        r4.append(r9.getClassName());
        r4.append(".");
        r4.append(r9.getMethodName());
        r4.append(":");
        r4.append(r9.getLineNumber());
        r8 = r8 + 1;
        if (r8 >= r2.length) goto L14;
        r4.append(", ");
        goto L14
    L18:
        r4.append("]");
        wq2 r3 = this.c;
        if (r3 == null) goto L24;
        Locale r10 = Locale.US;
        String r11 = r3.d;
        yq2.b();
        if (yq2.c().u != r3) goto L23;
        r1 = true;
    L23:
        String r5 = r11 + "(BT=" + r1 + ", syncMediaRoute1Provider=" + r17 + ")";
    L25:
        StringBuilder r6 = xa3.j("Changing selection(", r5, ") to default while BT is available: pkgName=");
        r6.append(this.f.getPackageName());
        r6.append(r4);
        Log.w("AxMediaRouter", r6.toString());
        goto L27
    L24:
        r5 = null;
    L27:
        if (this.v == null) goto L32;
        this.v = null;
        nq2 r7 = this.w;
        if (r7 == null) goto L32;
        r7.h(3);
        this.w.d();
        this.w = null;
    L32:
        if (this.p == false) goto L60;
        xk0 r12 = r15.a.e;
        if (r12 == null) goto L60;
        if (r12.o == false) goto L60;
        qq2 r13 = r15.c();
        String r14 = r15.b;
        Bundle r18 = new Bundle();
        r18.putString("clientPackageName", this.f.getPackageName());
        nq2 r19 = r13.a(r14, new pq2(r18));
        if (r19 == null) goto L59;
        Executor r20 = ud3.w(this.f);
        zh0 r110 = this.A;
        Object r21 = r19.a;
        monitor-enter(r21);
        if (r20 == null) goto L56;
        if (r110 == null) goto L54;
        r19.b = r20;     // Catch: Throwable -> L48
        r19.c = r110;     // Catch: Throwable -> L48
        ArrayList r22 = r19.e;     // Catch: Throwable -> L48
        if (r22 != null) goto L46;
    L50:
        monitor-exit(r21);     // Catch: Throwable -> L48
        this.v = r15;
        this.w = r19;
        r19.e();
        return;
    L46:
        if (r22.isEmpty() == true) goto L50;
        sp2 r111 = r19.d;     // Catch: Throwable -> L48
        ArrayList r112 = r19.e;     // Catch: Throwable -> L48
        r19.d = null;     // Catch: Throwable -> L48
        r19.e = null;     // Catch: Throwable -> L48
        r19.b.execute(new t6(r19, r110, r111, r112, 20));     // Catch: Throwable -> L48
        goto L50
    L54:
        throw new NullPointerException("Listener shouldn't be null");     // Catch: Throwable -> L48
    L56:
        throw new NullPointerException("Executor shouldn't be null");     // Catch: Throwable -> L48
    L48:
        th = move-exception;
        throw th;
    L59:
        Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + r15);
    L60:
        qq2 r23 = r15.c();
        String r24 = r15.b;
        Bundle r25 = new Bundle();
        r25.putString("clientPackageName", this.f.getPackageName());
        oq2 r26 = r23.c(r24, new pq2(r25));
        if (r26 == null) goto L64;
        r26.e();
    L64:
        if (this.c != null) goto L67;
        this.c = r15;
        this.d = r26;
        ri1 r113 = this.a;
        r113.getClass();
        Message r114 = r113.obtainMessage(262, new ti1(null, r15, r17));
        r114.arg1 = r16;
        r114.sendToTarget();
        return;
    L67:
        uq2 r27 = this.e;
        if (r27 == null) goto L70;
        r27.a();
        this.e = null;
    L70:
        uq2 r28 = new uq2(this, r15, r26, r16, r17, null, null);
        this.e = r28;
        r28.b();
        return;
    L8:
        r0 = false;
        goto L10
    }

    public final void k() {
        c52 r1 = new c52();
        zq2 r2 = this.s;
        long r3 = 0;
        r2.n = 0;
        int r5 = 0;
        r2.p = false;
        r2.o = SystemClock.elapsedRealtime();
        ((Handler) r2.q).removeCallbacks((qa1) r2.r);
        ArrayList r6 = this.g;
        int r7 = r6.size();
        int r8 = 0;
        boolean r9 = false;
    L3:
        r7 = r7 - 1;
        if (r7 < 0) goto L31;
        yq2 r10 = (yq2) ((WeakReference) r6.get(r7)).get();
        if (r10 != null) goto L9;
        r6.remove(r7);
    L30:
        r3 = r3;
        r6 = r6;
        r5 = 0;
        goto L3
    L9:
        ArrayList r11 = r10.b;
        int r12 = r11.size();
        r8 = r8 + r12;
        int r13 = r5;
    L10:
        if (r13 >= r12) goto L30;
        sq2 r14 = (sq2) r11.get(r13);
        rq2 r15 = r14.c;
        if (r15 == null) goto L28;
        r1.a(r15.b());
        if ((r14.d & 1) == 0) goto L17;
        int r16 = 1;
    L16:
        long r17 = r3;
        long r4 = r14.e;
        if (r16 != 0) goto L21;
        r2.getClass();
        ArrayList r18 = r6;
    L25:
        if (r16 == 0) goto L27;
        r9 = true;
    L27:
        r13 = r13 + 1;
        r3 = r17;
        r6 = r18;
        r5 = 0;
        goto L10
    L21:
        r18 = r6;
        long r19 = r2.o;
        if ((r19 - r4) >= 30000) goto L25;
        r2.n = Math.max(r2.n, (r4 + 30000) - r19);
        r2.p = true;
        goto L25
    L17:
        r16 = r5;
        goto L16
    L28:
        kf2.n("selector must not be null");
        return;
    L31:
        long r110 = r3;
        if (r2.p == false) goto L36;
        long r20 = r2.n;
        if (r20 <= r110) goto L36;
        ((Handler) r2.q).postDelayed((qa1) r2.r, r20);
    L36:
        boolean r21 = r2.p;
        this.z = r8;
        if (r9 == false) goto L39;
        rq2 r22 = r1.d();
    L40:
        rq2 r23 = r1.d();
        boolean r24 = this.p;
        zo2 r25 = this.q;
        if (r24 == false) goto L59;
        up2 r26 = this.y;
        if (r26 == null) goto L51;
        r26.a();
        if (r26.b.equals(r23) == false) goto L51;
        if (this.y.b() == r21) goto L59;
    L51:
        if (r23.c() == false) goto L57;
        if (r21 == true) goto L57;
        if (this.y == null) goto L59;
        this.y = null;
    L58:
        r25.g(this.y);
    L57:
        this.y = new up2(r23, r21);
    L59:
        up2 r27 = this.x;
        if (r27 == null) goto L67;
        r27.a();
        if (r27.b.equals(r22) == false) goto L67;
        if (this.x.b() != r21) goto L67;
        return;
    L67:
        if (r22.c() == false) goto L73;
        if (r21 == true) goto L73;
        if (this.x == null) goto L96;
        this.x = null;
    L74:
        if (r9 == false) goto L79;
        if (r21 == true) goto L79;
        if (this.o == false) goto L79;
        Log.i("AxMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
    L79:
        ArrayList r28 = this.k;
        int r29 = r28.size();
        int r30 = 0;
    L80:
        if (r30 >= r29) goto L97;
        Object r31 = r28.get(r30);
        r30 = r30 + 1;
        qq2 r32 = ((vq2) r31).a;
        if (r32 == r25) goto L80;
        r32.g(this.x);
        goto L80
    L97:
        return;
    L96:
        return;
    L73:
        this.x = new up2(r22, r21);
        goto L74
    L39:
        r22 = rq2.c;
        goto L40
    }

    public final void l() {
        wq2 r0 = this.c;
        if (r0 == null) goto L26;
        this.m.getClass();
        if (r0.e() == true) goto L7;
    L10:
        this.c.getClass();
        this.c.getClass();
        if (this.p == true) goto L13;
    L21:
        Iterator r2 = this.l.iterator();
        if (r2.hasNext() == true) goto L25;
        return;
    L25:
        throw xa3.d(r2);
    L13:
        if (this.c.c() != this.q) goto L21;
        oq2 r1 = this.d;
        int r3 = zo2.F;
        if ((r1 instanceof vo2) == false) goto L21;
        MediaRouter2.RoutingController r4 = ((vo2) r1).g;
        if (r4 == null) goto L21;
        to2.j(r4);
        goto L21
    L7:
        if (yq2.c == null) goto L10;
        yq2.c().getClass();
        goto L10
    }

    public final void m(vq2 r20, xk0 r21) {
        xk0 r3 = r20.e;
        ArrayList r4 = r20.b;
        if (r3 == r21) goto L97;
        r20.e = r21;
        ArrayList r5 = this.h;
        ri1 r6 = this.a;
        if (r21 == null) goto L17;
        List r9 = (List) r21.p;
        int r10 = r9.size();
        int r11 = 0;
    L7:
        if (r11 >= r10) goto L18;
        sp2 r12 = (sp2) r9.get(r11);
        if (r12 == null) goto L15;
        if (r12.e() == false) goto L15;
        r11 = r11 + 1;
    L15:
        if (r21 != this.r.t) goto L17;
    L18:
        ArrayList r2 = new ArrayList();
        ArrayList r13 = new ArrayList();
        Iterator r14 = r9.iterator();
        int r15 = 0;
        boolean r16 = false;
    L20:
        if (r14.hasNext() == false) goto L53;
        sp2 r17 = (sp2) r14.next();
        if (r17 != null) goto L24;
    L25:
        Iterator r18 = r14;
        boolean r19 = r16;
        Log.w("AxMediaRouter", "Ignoring invalid route descriptor: " + r17);
    L51:
        r14 = r18;
        r16 = r19;
        goto L20
    L24:
        if (r17.e() == false) goto L25;
        String r110 = r17.d();
        int r8 = r4.size();
        int r111 = 0;
    L27:
        if (r111 >= r8) goto L32;
        if (((wq2) r4.get(r111)).b.equals(r110) == true) goto L33;
        r111 = r111 + 1;
    L33:
        if (r111 >= 0) goto L39;
        r18 = r14;
        r19 = r16;
        wq2 r22 = new wq2(r20, r110, b(r20, r110), r17.a.getBoolean("isSystemRoute", false));
        int r7 = r15 + 1;
        r4.add(r15, r22);
        r5.add(r22);
        if (r17.c().isEmpty() == true) goto L37;
        r2.add(new ld3(r22, r17));
    L38:
        r15 = r7;
        goto L51
    L37:
        r22.i(r17);
        r6.b(257, r22);
        goto L38
    L39:
        r18 = r14;
        r19 = r16;
        if (r111 >= r15) goto L42;
        Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: " + r17);
        goto L51
    L42:
        wq2 r23 = (wq2) r4.get(r111);
        int r24 = r15 + 1;
        Collections.swap(r4, r111, r15);
        if (r17.c().isEmpty() == true) goto L46;
        r13.add(new ld3(r23, r17));
    L50:
        r15 = r24;
        goto L51
    L46:
        if (n(r23, r17) == 0) goto L50;
        if (r23 != this.c) goto L50;
        r15 = r24;
        r19 = true;
        goto L51
    L32:
        r111 = -1;
        goto L33
    L53:
        boolean r112 = r16;
        int r113 = 0;
        int r25 = r2.size();
        int r26 = 0;
    L54:
        if (r26 >= r25) goto L56;
        Object r27 = r2.get(r26);
        r26 = r26 + 1;
        ld3 r28 = (ld3) r27;
        wq2 r29 = (wq2) r28.a;
        r29.i((sp2) r28.b);
        r6.b(257, r29);
        goto L54
    L56:
        int r30 = r13.size();
        boolean r31 = r112;
    L57:
        if (r113 >= r30) goto L63;
        Object r32 = r13.get(r113);
        r113 = r113 + 1;
        ld3 r33 = (ld3) r32;
        wq2 r34 = (wq2) r33.a;
        if (n(r34, (sp2) r33.b) == 0) goto L57;
        if (r34 != this.c) goto L57;
        r31 = true;
        goto L57
    L63:
        boolean r114 = r31;
        int r35 = r15;
    L68:
        int r36 = r4.size() - 1;
    L69:
        if (r36 < r35) goto L71;
        wq2 r37 = (wq2) r4.get(r36);
        r37.i(null);
        r5.remove(r37);
        r36 = r36 - 1;
        goto L69
    L71:
        o(r114);
        int r0 = r4.size() - 1;
    L72:
        if (r0 < r35) goto L74;
        r6.b(258, (wq2) r4.remove(r0));
        r0 = r0 - 1;
        goto L72
    L74:
        r6.b(515, r20);
        return;
    L17:
        r114 = false;
        if (r21 == null) goto L66;
        String r38 = "Ignoring invalid provider descriptor: " + r21;
    L67:
        Log.w("AxMediaRouter", r38);
        r35 = 0;
        goto L68
    L66:
        r38 = "Ignoring null provider descriptor from " + ((ComponentName) r20.d.o);
        goto L67
    }

    public final int n(wq2 r2, sp2 r3) {
        int r4 = r2.i(r3);
        if (r4 == 0) goto L13;
        int r0 = r4 & 1;
        ri1 r1 = this.a;
        if (r0 == 0) goto L8;
        r1.b(259, r2);
    L8:
        if ((r4 & 2) == 0) goto L11;
        r1.b(260, r2);
    L11:
        if ((r4 & 4) == 0) goto L13;
        r1.b(261, r2);
    L13:
        return r4;
    }

    public final void o(boolean r11) {
        wq2 r0 = this.t;
        if (r0 != null) goto L5;
    L7:
        wq2 r1 = this.t;
        vg3 r3 = this.r;
        ArrayList r4 = this.h;
        if (r1 != null) goto L18;
        int r2 = r4.size();
        int r6 = 0;
    L10:
        if (r6 >= r2) goto L18;
        Object r7 = r4.get(r6);
        r6 = r6 + 1;
        wq2 r8 = (wq2) r7;
        if (r8.c() != r3) goto L10;
        if (r8.b.equals("DEFAULT_ROUTE") == false) goto L10;
        if (r8.f() == false) goto L10;
        this.t = r8;
        Log.i("AxMediaRouter", "Found default route: " + this.t);
    L18:
        wq2 r5 = this.u;
        if (r5 == null) goto L24;
        if (r5.f() == true) goto L24;
        Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.u);
        this.u = null;
    L24:
        if (this.u != null) goto L36;
        int r9 = r4.size();
        int r10 = 0;
    L26:
        if (r10 >= r9) goto L36;
        Object r12 = r4.get(r10);
        r10 = r10 + 1;
        wq2 r13 = (wq2) r12;
        if (r13.c() != r3) goto L26;
        if (r13.l("android.media.intent.category.LIVE_AUDIO") == false) goto L26;
        if (r13.l("android.media.intent.category.LIVE_VIDEO") == true) goto L26;
        if (r13.f() == false) goto L26;
        this.u = r13;
        Log.i("AxMediaRouter", "Found bluetooth route: " + this.u);
    L36:
        wq2 r14 = this.c;
        if (r14 != null) goto L39;
    L44:
        Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.c);
        j(c(), 0, true);
        return;
    L39:
        if (r14.g == false) goto L44;
        if (r11 == false) goto L64;
        h();
        l();
        return;
    L64:
        return;
    L5:
        if (r0.f() == true) goto L7;
        Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.t);
        this.t = null;
        goto L7
    }
}
