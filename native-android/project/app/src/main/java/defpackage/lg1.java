package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lg1 implements Runnable {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public lg1(i61 i61Var) {
        this.n = 12;
        this.p = new ArrayList();
        this.o = i61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thO;
        ou2 ou2Var;
        xp0 xp0Var;
        int i;
        int i2;
        int[] iArr;
        eu1 eu1Var;
        int i3 = 6;
        int i4 = 2;
        dd5 dd5Var = null;
        int i5 = 1;
        byte b = 0;
        int i6 = 0;
        int i7 = 0;
        switch (this.n) {
            case 0:
                kg1 kg1Var = (kg1) this.p;
                Future future = (Future) this.o;
                if ((future instanceof u0) && (thO = ((u0) future).o()) != null) {
                    kg1Var.o(thO);
                    return;
                }
                try {
                    kg1Var.h(hw.j(future));
                    return;
                } catch (ExecutionException e) {
                    kg1Var.o(e.getCause());
                    return;
                } catch (Throwable th) {
                    kg1Var.o(th);
                    return;
                }
            case 1:
                t4 t4Var = (t4) this.o;
                y4 y4Var = (y4) this.p;
                qu2 qu2Var = y4Var.p;
                if (qu2Var != null && (ou2Var = qu2Var.e) != null) {
                    ou2Var.y(qu2Var);
                }
                View view = (View) y4Var.u;
                if (view != null && view.getWindowToken() != null) {
                    if (t4Var.b()) {
                        y4Var.G = t4Var;
                    } else if (t4Var.e != null) {
                        t4Var.d(0, 0, false, false);
                        y4Var.G = t4Var;
                    }
                }
                y4Var.I = null;
                return;
            case 2:
                ((m5) this.o).n = this.p;
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((Application) this.o).unregisterActivityLifecycleCallbacks((m5) this.p);
                return;
            case 4:
                Object obj = this.p;
                Object obj2 = this.o;
                try {
                    Method method = n5.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        n5.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 5:
                nk nkVar = (nk) this.p;
                pk pkVar = nkVar.r;
                if (pkVar.g == nkVar.p) {
                    List list = nkVar.o;
                    xp0 xp0Var2 = (xp0) this.o;
                    Runnable runnable = nkVar.q;
                    pkVar.e = list;
                    pkVar.f = Collections.unmodifiableList(list);
                    hg3 hg3Var = pkVar.a;
                    int[] iArr2 = xp0Var2.b;
                    ArrayList arrayList = xp0Var2.a;
                    int i8 = xp0Var2.e;
                    zg5 zg5Var = xp0Var2.d;
                    qr qrVar = new qr(hg3Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i9 = xp0Var2.f;
                    int size = arrayList.size() - 1;
                    int i10 = i9;
                    int i11 = i8;
                    while (size >= 0) {
                        wp0 wp0Var = (wp0) arrayList.get(size);
                        int i12 = wp0Var.a;
                        int i13 = i5;
                        int i14 = wp0Var.c;
                        int i15 = i12 + i14;
                        int i16 = wp0Var.b;
                        int i17 = i16 + i14;
                        while (i11 > i15) {
                            i11--;
                            int i18 = iArr2[i11];
                            if ((i18 & 12) != 0) {
                                i = i12;
                                int i19 = i18 >> 4;
                                i2 = i15;
                                iArr = iArr2;
                                yp0 yp0VarA = xp0.a(arrayDeque, i19, false);
                                if (yp0VarA != null) {
                                    int i20 = (i8 - yp0VarA.b) - 1;
                                    qrVar.a(i11, i20);
                                    if ((i18 & 4) != 0) {
                                        zg5Var.s(i11, i19);
                                        qrVar.y(i20, i13, null);
                                    }
                                } else {
                                    boolean z = i13;
                                    arrayDeque.add(new yp0(i11, (i8 - i11) - (z ? 1 : 0), z));
                                }
                            } else {
                                i = i12;
                                i2 = i15;
                                iArr = iArr2;
                                qrVar.r(i11, i13);
                                i8--;
                            }
                            i12 = i;
                            i15 = i2;
                            iArr2 = iArr;
                            i13 = 1;
                        }
                        int i21 = i12;
                        int[] iArr3 = iArr2;
                        while (i10 > i17) {
                            i10--;
                            int i22 = xp0Var2.c[i10];
                            if ((i22 & 12) != 0) {
                                int i23 = i22 >> 4;
                                xp0Var = xp0Var2;
                                yp0 yp0VarA2 = xp0.a(arrayDeque, i23, true);
                                if (yp0VarA2 == null) {
                                    arrayDeque.add(new yp0(i10, i8 - i11, false));
                                } else {
                                    qrVar.a((i8 - yp0VarA2.b) - 1, i11);
                                    if ((i22 & 4) != 0) {
                                        zg5Var.s(i23, i10);
                                        qrVar.y(i11, 1, null);
                                    }
                                }
                            } else {
                                xp0Var = xp0Var2;
                                qrVar.k(i11, 1);
                                i8++;
                            }
                            xp0Var2 = xp0Var;
                        }
                        xp0 xp0Var3 = xp0Var2;
                        int i24 = i16;
                        int i25 = i21;
                        for (int i26 = 0; i26 < i14; i26++) {
                            if ((iArr3[i25] & 15) == 2) {
                                zg5Var.s(i25, i24);
                                qrVar.y(i25, 1, null);
                            }
                            i25++;
                            i24++;
                        }
                        size--;
                        i10 = i16;
                        i5 = 1;
                        xp0Var2 = xp0Var3;
                        i11 = i21;
                        iArr2 = iArr3;
                    }
                    qrVar.b();
                    pkVar.a(runnable);
                    return;
                }
                return;
            case 6:
                c05 c05Var = (c05) this.o;
                Typeface typeface = (Typeface) this.p;
                au0 au0Var = (au0) c05Var.n;
                if (au0Var != null) {
                    au0Var.N(typeface);
                    return;
                }
                return;
            case 7:
                r20 r20Var = (r20) this.o;
                xl.E((s24) r20Var.o, false, true, new o(4, r20Var, (Chronology) this.p));
                return;
            case 8:
                cx cxVarF = cx.f();
                String str = do0.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                dd5 dd5Var2 = (dd5) this.o;
                sb.append(dd5Var2.a);
                cxVarF.b(str, sb.toString());
                ((do0) this.p).a.e(dd5Var2);
                return;
            case 9:
                ss0 ss0Var = (ss0) this.o;
                ArrayList arrayList2 = (ArrayList) this.p;
                ss0Var.getClass();
                StringBuilder sb2 = new StringBuilder("DELETE FROM download WHERE id IN (");
                int size2 = arrayList2.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    sb2.append("?");
                    if (i27 < size2 - 1) {
                        sb2.append(",");
                    }
                }
                sb2.append(")");
                xl.E((s24) ss0Var.n, false, true, new o(i3, sb2.toString(), arrayList2));
                return;
            case 10:
                ss0 ss0Var2 = (ss0) this.o;
                this.p = (List) xl.E((s24) ss0Var2.n, true, false, new os0(ss0Var2, b));
                return;
            case 11:
                ss0 ss0Var3 = (ss0) this.o;
                xl.E((s24) ss0Var3.n, false, true, new o(5, ss0Var3, (Download) this.p));
                return;
            case 12:
                this.p = (List) xl.E((s24) ((i61) this.o).o, true, false, new k2(17, b));
                return;
            case 13:
                ll1 ll1VarA = ll1.a();
                ll1VarA.getClass();
                e35.m();
                ll1VarA.d.set(true);
                ((i71) this.p).o.o = true;
                ((i71) this.p).n.getViewTreeObserver().removeOnDrawListener((i71) this.o);
                ((i71) this.p).o.n.clear();
                return;
            case 14:
                ki1 ki1Var = (ki1) this.p;
                if (ki1Var.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.o).run();
                    return;
                } catch (Throwable th3) {
                    ki1Var.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                        return;
                    }
                    return;
                }
            case 15:
                ((cz) this.o).E((fl1) this.p);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                b22 b22Var = (b22) this.o;
                cx3 cx3Var = b22Var.e;
                f22 f22Var = (f22) this.p;
                RecyclerView recyclerView = f22Var.r;
                if (recyclerView == null || !recyclerView.F || b22Var.k || cx3Var.b() == -1) {
                    return;
                }
                jw3 itemAnimator = f22Var.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList3 = f22Var.p;
                    int size3 = arrayList3.size();
                    while (b < size3) {
                        if (((b22) arrayList3.get(b)).l) {
                            b++;
                        }
                    }
                    f22Var.m.i(cx3Var);
                    return;
                }
                f22Var.r.post(this);
                return;
            case 17:
                la2 la2Var = (la2) this.p;
                pe0 pe0Var = la2Var.q;
                while (true) {
                    try {
                        ((Runnable) this.o).run();
                    } catch (Throwable th4) {
                        uc5.s(q01.n, th4);
                    }
                    Runnable runnableA0 = la2Var.a0();
                    if (runnableA0 == null) {
                        return;
                    }
                    this.o = runnableA0;
                    i7++;
                    if (i7 >= 16 && pe0Var.Y(la2Var)) {
                        pe0Var.W(la2Var, this);
                        return;
                    }
                    break;
                }
                break;
            case 18:
                rf2 rf2Var = (rf2) this.o;
                xl.E((s24) rf2Var.n, false, true, new o(18, rf2Var, (LyricsCache) this.p));
                return;
            case 19:
                bq4 bq4Var = (bq4) this.p;
                pr2 pr2Var = (pr2) this.o;
                ArrayList arrayList4 = (ArrayList) bq4Var.n;
                if (!arrayList4.isEmpty()) {
                    qu1 qu1VarA = pr2Var.a();
                    if (qu1VarA != null) {
                        int size4 = arrayList4.size();
                        while (i6 < size4) {
                            Object obj3 = arrayList4.get(i6);
                            i6++;
                            ((Bundle) obj3).putBinder("extra_session_binder", qu1VarA.asBinder());
                        }
                    }
                    arrayList4.clear();
                }
                qj2 qj2Var = (qj2) bq4Var.o;
                qj2Var.getClass();
                qj2Var.setSessionToken(pr2Var.o);
                return;
            case 20:
                IBinder binder = ((Messenger) ((hg3) this.o).o).getBinder();
                oj2 oj2Var = (oj2) ((pn2) ((pz1) this.p).o).r.remove(binder);
                if (oj2Var != null) {
                    binder.unlinkToDeath(oj2Var, 0);
                    return;
                }
                return;
            case 21:
                ml3 ml3Var = (ml3) this.o;
                xl.E((s24) ml3Var.a, false, true, new hl3(ml3Var, (Playlist) this.p, b));
                return;
            case 22:
                ns3 ns3Var = (ns3) this.o;
                this.p = (Queue) xl.E((s24) ns3Var.o, true, false, new ks3(ns3Var, b));
                return;
            case 23:
                this.p = ((ns3) this.o).c();
                return;
            case 24:
                ((ua1) this.o).accept(this.p);
                return;
            case 25:
                ((cz) this.p).E((y21) this.o);
                return;
            case 26:
                boolean zU = xa3.u("sort_search_chronologically", false);
                jv3 jv3Var = (jv3) this.o;
                if (zU) {
                    this.p = (List) xl.E((s24) jv3Var.n, true, false, new ms3(i4));
                    return;
                } else {
                    this.p = (List) xl.E((s24) jv3Var.n, true, false, new ms3(i5));
                    return;
                }
            case 27:
                try {
                    ((Runnable) this.p).run();
                    synchronized (((ia4) this.o).r) {
                        ((ia4) this.o).a();
                        break;
                    }
                    return;
                } catch (Throwable th5) {
                    synchronized (((ia4) this.o).r) {
                        ((ia4) this.o).a();
                        throw th5;
                    }
                }
            case 28:
                pq3 pq3Var = ((wp4) this.p).n.f;
                String str2 = (String) this.o;
                synchronized (pq3Var.k) {
                    try {
                        td5 td5VarC = pq3Var.c(str2);
                        if (td5VarC != null) {
                            dd5Var = td5VarC.a;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (dd5Var == null || !dd5Var.c()) {
                    return;
                }
                synchronized (((wp4) this.p).p) {
                    ((wp4) this.p).s.put(q05.m(dd5Var), dd5Var);
                    wp4 wp4Var = (wp4) this.p;
                    ((wp4) this.p).t.put(q05.m(dd5Var), lc5.a(wp4Var.u, dd5Var, (pe0) wp4Var.o.o, wp4Var));
                    break;
                }
                return;
            default:
                ka0 ka0Var = (ka0) this.o;
                nq nqVar = (nq) this.p;
                me meVar = (me) nqVar.o;
                gf5 gf5Var = (gf5) ((ij1) nqVar.s).w.get((ve) nqVar.p);
                if (gf5Var == null) {
                    return;
                }
                if (ka0Var.o != 0) {
                    gf5Var.l(ka0Var, null);
                    return;
                }
                nqVar.n = true;
                if (meVar.i0()) {
                    if (!nqVar.n || (eu1Var = (eu1) nqVar.q) == null) {
                        return;
                    }
                    meVar.j0(eu1Var, (Set) nqVar.r);
                    return;
                }
                try {
                    meVar.j0(null, meVar.Z());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    meVar.a0("Failed to get service from broker.");
                    gf5Var.l(new ka0(10), null);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.n) {
            case 0:
                c12 c12Var = new c12(lg1.class.getSimpleName());
                kg1 kg1Var = (kg1) this.p;
                rm3 rm3Var = new rm3();
                ((rm3) c12Var.q).o = rm3Var;
                c12Var.q = rm3Var;
                rm3Var.n = kg1Var;
                return c12Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lg1(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public /* synthetic */ lg1(Object obj, Object obj2, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    public /* synthetic */ lg1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public lg1(jv3 jv3Var) {
        this.n = 26;
        this.p = new ArrayList();
        this.o = jv3Var;
    }

    public lg1(f22 f22Var, b22 b22Var, int i) {
        this.n = 16;
        this.p = f22Var;
        this.o = b22Var;
    }
}
