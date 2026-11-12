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
    public wq2 c;
    public oq2 d;
    public uq2 e;
    public final Context f;
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
    public final ri1 a = new ri1(this);
    public final HashMap b = new HashMap();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final hh3 m = new hh3(13);
    public final si1 n = new si1(0, this);
    public final zh0 A = new zh0(28, this);

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x008c  */
    public ui1(Context context) {
        boolean z;
        this.f = context;
        this.o = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = fu2.b;
            Intent intent = new Intent(context, (Class<?>) fu2.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.p = z;
        int i3 = fq4.a;
        Intent intent2 = new Intent(context, (Class<?>) fq4.class);
        intent2.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
        zo2 zo2Var = (i < 30 || !z) ? null : new zo2(context, new hg3(22, this));
        this.q = zo2Var;
        vg3 vg3Var = new vg3(context, this);
        this.r = vg3Var;
        this.s = new zq2(new qa1(2, this));
        a(vg3Var, true);
        if (zo2Var != null) {
            a(zo2Var, true);
        }
        ip0 ip0Var = new ip0(context, this);
        Handler handler = (Handler) ip0Var.d;
        if (ip0Var.a) {
            return;
        }
        ip0Var.a = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) ip0Var.b).registerReceiver((v9) ip0Var.g, intentFilter, null, handler);
        handler.post((g5) ip0Var.h);
    }

    public final void a(qq2 qq2Var, boolean z) {
        if (d(qq2Var) == null) {
            vq2 vq2Var = new vq2(qq2Var, z);
            this.k.add(vq2Var);
            this.a.b(513, vq2Var);
            m(vq2Var, qq2Var.t);
            yq2.b();
            qq2Var.q = this.n;
            qq2Var.g(this.x);
        }
    }

    public final String b(vq2 vq2Var, String str) {
        String strFlattenToShortString = ((ComponentName) vq2Var.d.o).flattenToShortString();
        boolean z = vq2Var.c;
        String strO = z ? str : b11.o(strFlattenToShortString, ":", str);
        HashMap map = this.j;
        if (!z) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((wq2) arrayList.get(i)).c.equals(strO)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("AxMediaRouter", f34.h("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strO + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((wq2) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        map.put(new ld3(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        map.put(new ld3(strFlattenToShortString, str), strO);
        return strO;
    }

    public final wq2 c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wq2 wq2Var = (wq2) obj;
            if (wq2Var != this.t && wq2Var.c() == this.r && wq2Var.l("android.media.intent.category.LIVE_AUDIO") && !wq2Var.l("android.media.intent.category.LIVE_VIDEO") && wq2Var.f()) {
                return wq2Var;
            }
        }
        return this.t;
    }

    public final vq2 d(qq2 qq2Var) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vq2 vq2Var = (vq2) obj;
            if (vq2Var.a == qq2Var) {
                return vq2Var;
            }
        }
        return null;
    }

    public final void e() {
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    public final oq2 f(wq2 wq2Var) {
        oq2 oq2Var;
        if (wq2Var == this.c && (oq2Var = this.d) != null) {
            return oq2Var;
        }
        if ((wq2Var instanceof tq2) && ((tq2) wq2Var).m()) {
            e();
            return null;
        }
        oq2 oq2Var2 = (oq2) this.b.get(wq2Var.c);
        if (oq2Var2 != null) {
            return oq2Var2;
        }
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        return oq2Var2;
    }

    public final wq2 g() {
        wq2 wq2Var = this.c;
        if (wq2Var != null) {
            return wq2Var;
        }
        kf2.o("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final void h() {
        oq2 oq2VarD;
        if (this.c.e()) {
            List<wq2> listUnmodifiableList = Collections.unmodifiableList(this.c.v);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((wq2) it.next()).c);
            }
            HashMap map = this.b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    oq2 oq2Var = (oq2) entry.getValue();
                    oq2Var.h(0);
                    oq2Var.d();
                    it2.remove();
                }
            }
            for (wq2 wq2Var : listUnmodifiableList) {
                if (!map.containsKey(wq2Var.c) && (oq2VarD = wq2Var.c().d(wq2Var.b, this.c.b)) != null) {
                    oq2VarD.e();
                    map.put(wq2Var.c, oq2VarD);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r0 != 2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(wq2 wq2Var, int i, boolean z) {
        if (!this.h.contains(wq2Var)) {
            Log.w("AxMediaRouter", "Ignoring attempt to select removed route: " + wq2Var);
            return;
        }
        if (!wq2Var.g) {
            Log.w("AxMediaRouter", "Ignoring attempt to select disabled route: " + wq2Var);
            return;
        }
        wq2 wq2Var2 = this.c;
        if (wq2Var2 != wq2Var) {
            tq2 tq2VarA = wq2Var2 != null ? wq2Var2.a() : null;
            if (tq2VarA != null && Collections.unmodifiableList(tq2VarA.v).size() == 1) {
                mq2 mq2Var = (mq2) tq2VarA.x.get(wq2Var.c);
                int i2 = mq2Var != null ? mq2Var.b : 4;
                if (i2 != 3) {
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                qq2 qq2VarC = wq2Var.c();
                zo2 zo2Var = this.q;
                if (qq2VarC == zo2Var && this.c != wq2Var) {
                    String str = wq2Var.b;
                    MediaRoute2Info mediaRoute2InfoH = zo2Var.h(str);
                    if (mediaRoute2InfoH == null) {
                        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                        return;
                    } else if (!TextUtils.equals(zo2Var.E, str)) {
                        zo2Var.E = str;
                        zo2Var.v.transferTo(mediaRoute2InfoH);
                        return;
                    } else {
                        Log.w("MR2Provider", "Ignoring attempt to transfer to pending transfer route: " + mediaRoute2InfoH);
                        return;
                    }
                }
            }
            j(wq2Var, i, z);
            return;
        }
        Log.w("AxMediaRouter", "Ignoring attempt to select selected route: " + wq2Var);
    }

    public final void j(wq2 wq2Var, int i, boolean z) {
        xk0 xk0Var;
        String str;
        if (this.c == wq2Var) {
            return;
        }
        boolean z2 = wq2Var == this.t;
        if (this.u != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stacktrace: [");
            int i2 = 3;
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i2++;
                if (i2 < stackTrace.length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            wq2 wq2Var2 = this.c;
            if (wq2Var2 != null) {
                Locale locale = Locale.US;
                String str2 = wq2Var2.d;
                yq2.b();
                str = str2 + "(BT=" + (yq2.c().u == wq2Var2) + ", syncMediaRoute1Provider=" + z + ")";
            } else {
                str = null;
            }
            StringBuilder sbJ = xa3.j("Changing selection(", str, ") to default while BT is available: pkgName=");
            sbJ.append(this.f.getPackageName());
            sbJ.append((Object) sb);
            Log.w("AxMediaRouter", sbJ.toString());
        }
        if (this.v != null) {
            this.v = null;
            nq2 nq2Var = this.w;
            if (nq2Var != null) {
                nq2Var.h(3);
                this.w.d();
                this.w = null;
            }
        }
        if (this.p && (xk0Var = wq2Var.a.e) != null && xk0Var.o) {
            qq2 qq2VarC = wq2Var.c();
            String str3 = wq2Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.f.getPackageName());
            nq2 nq2VarA = qq2VarC.a(str3, new pq2(bundle));
            if (nq2VarA != null) {
                Executor executorW = ud3.w(this.f);
                zh0 zh0Var = this.A;
                synchronized (nq2VarA.a) {
                    try {
                        if (executorW == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (zh0Var == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        nq2VarA.b = executorW;
                        nq2VarA.c = zh0Var;
                        ArrayList arrayList = nq2VarA.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            sp2 sp2Var = nq2VarA.d;
                            ArrayList arrayList2 = nq2VarA.e;
                            nq2VarA.d = null;
                            nq2VarA.e = null;
                            nq2VarA.b.execute(new t6(nq2VarA, zh0Var, sp2Var, arrayList2, 20));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.v = wq2Var;
                this.w = nq2VarA;
                nq2VarA.e();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wq2Var);
        }
        qq2 qq2VarC2 = wq2Var.c();
        String str4 = wq2Var.b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.f.getPackageName());
        oq2 oq2VarC = qq2VarC2.c(str4, new pq2(bundle2));
        if (oq2VarC != null) {
            oq2VarC.e();
        }
        if (this.c == null) {
            this.c = wq2Var;
            this.d = oq2VarC;
            ri1 ri1Var = this.a;
            ri1Var.getClass();
            Message messageObtainMessage = ri1Var.obtainMessage(262, new ti1(null, wq2Var, z));
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            return;
        }
        uq2 uq2Var = this.e;
        if (uq2Var != null) {
            uq2Var.a();
            this.e = null;
        }
        uq2 uq2Var2 = new uq2(this, wq2Var, oq2VarC, i, z, null, null);
        this.e = uq2Var2;
        uq2Var2.b();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0096 A[SYNTHETIC] */
    public final void k() {
        ArrayList arrayList;
        c52 c52Var = new c52();
        zq2 zq2Var = this.s;
        long j = 0;
        zq2Var.n = 0L;
        int i = 0;
        zq2Var.p = false;
        zq2Var.o = SystemClock.elapsedRealtime();
        ((Handler) zq2Var.q).removeCallbacks((qa1) zq2Var.r);
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                long j2 = j;
                if (zq2Var.p) {
                    long j3 = zq2Var.n;
                    if (j3 > j2) {
                        ((Handler) zq2Var.q).postDelayed((qa1) zq2Var.r, j3);
                    }
                }
                boolean z2 = zq2Var.p;
                this.z = i2;
                rq2 rq2VarD = z ? c52Var.d() : rq2.c;
                rq2 rq2VarD2 = c52Var.d();
                boolean z3 = this.p;
                zo2 zo2Var = this.q;
                if (z3) {
                    up2 up2Var = this.y;
                    if (up2Var != null) {
                        up2Var.a();
                        if (!up2Var.b.equals(rq2VarD2) || this.y.b() != z2) {
                            if (rq2VarD2.c() || z2) {
                                this.y = new up2(rq2VarD2, z2);
                            } else if (this.y != null) {
                                this.y = null;
                            }
                            zo2Var.g(this.y);
                        }
                    } else if (rq2VarD2.c()) {
                        this.y = new up2(rq2VarD2, z2);
                        zo2Var.g(this.y);
                    } else {
                        this.y = new up2(rq2VarD2, z2);
                        zo2Var.g(this.y);
                    }
                }
                up2 up2Var2 = this.x;
                if (up2Var2 != null) {
                    up2Var2.a();
                    if (up2Var2.b.equals(rq2VarD) && this.x.b() == z2) {
                        return;
                    }
                }
                if (!rq2VarD.c() || z2) {
                    this.x = new up2(rq2VarD, z2);
                } else if (this.x == null) {
                    return;
                } else {
                    this.x = null;
                }
                if (z && !z2 && this.o) {
                    Log.i("AxMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.k;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList3.get(i3);
                    i3++;
                    qq2 qq2Var = ((vq2) obj).a;
                    if (qq2Var != zo2Var) {
                        qq2Var.g(this.x);
                    }
                }
                return;
            }
            yq2 yq2Var = (yq2) ((WeakReference) arrayList2.get(size)).get();
            if (yq2Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = yq2Var.b;
                int size3 = arrayList4.size();
                i2 += size3;
                int i4 = i;
                while (i4 < size3) {
                    sq2 sq2Var = (sq2) arrayList4.get(i4);
                    rq2 rq2Var = sq2Var.c;
                    if (rq2Var == null) {
                        kf2.n("selector must not be null");
                        return;
                    }
                    c52Var.a(rq2Var.b());
                    int i5 = (sq2Var.d & 1) != 0 ? 1 : i;
                    long j4 = j;
                    long j5 = sq2Var.e;
                    if (i5 == 0) {
                        zq2Var.getClass();
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        long j6 = zq2Var.o;
                        if (j6 - j5 < 30000) {
                            zq2Var.n = Math.max(zq2Var.n, (j5 + 30000) - j6);
                            zq2Var.p = true;
                        }
                        if (i5 != 0) {
                            z = true;
                        }
                        i4++;
                        j = j4;
                        arrayList2 = arrayList;
                        i = 0;
                    }
                    if (i5 != 0) {
                        z = true;
                    }
                    i4++;
                    j = j4;
                    arrayList2 = arrayList;
                    i = 0;
                }
            }
            j = j;
            arrayList2 = arrayList2;
            i = 0;
        }
    }

    public final void l() {
        MediaRouter2.RoutingController routingController;
        wq2 wq2Var = this.c;
        if (wq2Var != null) {
            this.m.getClass();
            if (wq2Var.e() && yq2.c != null) {
                yq2.c().getClass();
            }
            this.c.getClass();
            this.c.getClass();
            if (this.p && this.c.c() == this.q) {
                oq2 oq2Var = this.d;
                int i = zo2.F;
                if ((oq2Var instanceof vo2) && (routingController = ((vo2) oq2Var).g) != null) {
                    routingController.getId();
                }
            }
            Iterator it = this.l.iterator();
            if (it.hasNext()) {
                throw xa3.d(it);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0178, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0187, please report this as an issue */
    public final void m(vq2 vq2Var, xk0 xk0Var) {
        boolean z;
        String str;
        int i;
        Iterator it;
        boolean z2;
        xk0 xk0Var2 = vq2Var.e;
        ArrayList arrayList = vq2Var.b;
        if (xk0Var2 != xk0Var) {
            vq2Var.e = xk0Var;
            ArrayList arrayList2 = this.h;
            ri1 ri1Var = this.a;
            if (xk0Var != null) {
                List list = (List) xk0Var.p;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        sp2 sp2Var = (sp2) list.get(i2);
                        if (sp2Var != null && sp2Var.e()) {
                            i2++;
                        } else if (xk0Var != this.r.t) {
                            z = false;
                            if (xk0Var != null) {
                                str = "Ignoring invalid provider descriptor: " + xk0Var;
                            } else {
                                str = "Ignoring null provider descriptor from " + ((ComponentName) vq2Var.d.o);
                            }
                            Log.w("AxMediaRouter", str);
                            i = 0;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    int i3 = 0;
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        sp2 sp2Var2 = (sp2) it2.next();
                        if (sp2Var2 == null || !sp2Var2.e()) {
                            it = it2;
                            z2 = z3;
                            Log.w("AxMediaRouter", "Ignoring invalid route descriptor: " + sp2Var2);
                        } else {
                            String strD = sp2Var2.d();
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    i4 = -1;
                                    break;
                                } else if (((wq2) arrayList.get(i4)).b.equals(strD)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (i4 < 0) {
                                it = it2;
                                z2 = z3;
                                wq2 wq2Var = new wq2(vq2Var, strD, b(vq2Var, strD), sp2Var2.a.getBoolean("isSystemRoute", false));
                                int i5 = i3 + 1;
                                arrayList.add(i3, wq2Var);
                                arrayList2.add(wq2Var);
                                if (sp2Var2.c().isEmpty()) {
                                    wq2Var.i(sp2Var2);
                                    ri1Var.b(257, wq2Var);
                                } else {
                                    arrayList3.add(new ld3(wq2Var, sp2Var2));
                                }
                                i3 = i5;
                            } else {
                                it = it2;
                                z2 = z3;
                                if (i4 < i3) {
                                    Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: " + sp2Var2);
                                } else {
                                    wq2 wq2Var2 = (wq2) arrayList.get(i4);
                                    int i6 = i3 + 1;
                                    Collections.swap(arrayList, i4, i3);
                                    if (!sp2Var2.c().isEmpty()) {
                                        arrayList4.add(new ld3(wq2Var2, sp2Var2));
                                    } else if (n(wq2Var2, sp2Var2) != 0 && wq2Var2 == this.c) {
                                        i3 = i6;
                                        z2 = true;
                                    }
                                    i3 = i6;
                                }
                            }
                        }
                        it2 = it;
                        z3 = z2;
                    }
                    boolean z4 = z3;
                    int i7 = 0;
                    int size3 = arrayList3.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj = arrayList3.get(i8);
                        i8++;
                        ld3 ld3Var = (ld3) obj;
                        wq2 wq2Var3 = (wq2) ld3Var.a;
                        wq2Var3.i((sp2) ld3Var.b);
                        ri1Var.b(257, wq2Var3);
                    }
                    int size4 = arrayList4.size();
                    boolean z5 = z4;
                    while (i7 < size4) {
                        Object obj2 = arrayList4.get(i7);
                        i7++;
                        ld3 ld3Var2 = (ld3) obj2;
                        wq2 wq2Var4 = (wq2) ld3Var2.a;
                        if (n(wq2Var4, (sp2) ld3Var2.b) != 0 && wq2Var4 == this.c) {
                            z5 = true;
                        }
                    }
                    z = z5;
                    i = i3;
                }
            } else {
                z = false;
                if (xk0Var != null) {
                    str = "Ignoring invalid provider descriptor: " + xk0Var;
                } else {
                    str = "Ignoring null provider descriptor from " + ((ComponentName) vq2Var.d.o);
                }
                Log.w("AxMediaRouter", str);
                i = 0;
            }
            for (int size5 = arrayList.size() - 1; size5 >= i; size5--) {
                wq2 wq2Var5 = (wq2) arrayList.get(size5);
                wq2Var5.i(null);
                arrayList2.remove(wq2Var5);
            }
            o(z);
            for (int size6 = arrayList.size() - 1; size6 >= i; size6--) {
                ri1Var.b(258, (wq2) arrayList.remove(size6));
            }
            ri1Var.b(515, vq2Var);
        }
    }

    public final int n(wq2 wq2Var, sp2 sp2Var) {
        int i = wq2Var.i(sp2Var);
        if (i != 0) {
            int i2 = i & 1;
            ri1 ri1Var = this.a;
            if (i2 != 0) {
                ri1Var.b(259, wq2Var);
            }
            if ((i & 2) != 0) {
                ri1Var.b(260, wq2Var);
            }
            if ((i & 4) != 0) {
                ri1Var.b(261, wq2Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        wq2 wq2Var = this.t;
        if (wq2Var != null && !wq2Var.f()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.t);
            this.t = null;
        }
        wq2 wq2Var2 = this.t;
        vg3 vg3Var = this.r;
        ArrayList arrayList = this.h;
        if (wq2Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wq2 wq2Var3 = (wq2) obj;
                if (wq2Var3.c() == vg3Var && wq2Var3.b.equals("DEFAULT_ROUTE") && wq2Var3.f()) {
                    this.t = wq2Var3;
                    Log.i("AxMediaRouter", "Found default route: " + this.t);
                    break;
                }
            }
        }
        wq2 wq2Var4 = this.u;
        if (wq2Var4 != null && !wq2Var4.f()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.u);
            this.u = null;
        }
        if (this.u == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                wq2 wq2Var5 = (wq2) obj2;
                if (wq2Var5.c() == vg3Var && wq2Var5.l("android.media.intent.category.LIVE_AUDIO") && !wq2Var5.l("android.media.intent.category.LIVE_VIDEO") && wq2Var5.f()) {
                    this.u = wq2Var5;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.u);
                    break;
                }
            }
        }
        wq2 wq2Var6 = this.c;
        if (wq2Var6 == null || !wq2Var6.g) {
            Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.c);
            j(c(), 0, true);
            return;
        }
        if (z) {
            h();
            l();
        }
    }
}
