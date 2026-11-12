package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rs3 {
    public static volatile ux d;
    public static final rs3 a = new rs3();
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new ps3(0));
    public static final AtomicInteger c = new AtomicInteger(0);
    public static volatile List e = u01.n;
    public static final HashSet f = new HashSet();

    public final void a(Context context, qs3 qs3Var, int i) {
        String str;
        String str2;
        int i2;
        Map mapSingletonMap;
        se4 se4VarB;
        xi4 xi4Var;
        bi0 bi0VarX;
        Context applicationContext;
        se4 se4VarB2;
        boolean zAdd;
        Uri uri = qs3Var.a;
        try {
            se4 se4VarD = au0.D(context);
            try {
                str2 = "Pre-cached ";
                i2 = 10;
                str = "Pre-cache aborted for ";
                try {
                    String strD = new xi4(10).d(new ii0(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
                    se4VarD.getClass();
                    if (nd0.a(se4VarD.i(strD)) == -1 && se4VarD.g(0L, 1L, strD) > 0) {
                        HashSet hashSet = f;
                        synchronized (hashSet) {
                            zAdd = hashSet.add(strD);
                        }
                        if (zAdd) {
                            Log.d("QueuePreloader", "Head of " + strD + " has no length, loading it again");
                            se4VarD.m(strD);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.d("QueuePreloader", "Could not check the head of " + uri + ": " + e);
                }
            } catch (Exception e3) {
                e = e3;
                str = "Pre-cache aborted for ";
                str2 = "Pre-cached ";
                i2 = 10;
            }
        } catch (Exception e4) {
            e = e4;
            str = "Pre-cache aborted for ";
            str2 = "Pre-cached ";
            i2 = 10;
        }
        Map map = Collections.EMPTY_MAP;
        long j = qs3Var.b;
        if (ot1.d(uri)) {
            mapSingletonMap = Collections.singletonMap("X-HomeMusic-Prefetch", "1");
            mapSingletonMap.getClass();
        } else {
            mapSingletonMap = v01.n;
        }
        ii0 ii0Var = new ii0(uri, 0L, 1, null, mapSingletonMap, 0L, j, null, 0);
        synchronized (au0.class) {
            se4VarB = au0.B(context);
            xi4Var = new xi4(i2);
            bi0VarX = au0.x();
            applicationContext = context.getApplicationContext();
            bi0VarX.getClass();
            se4VarB2 = au0.B(context);
            se4VarB2.getClass();
        }
        qx qxVar = new qx(new zj0(applicationContext, ((om1) bi0VarX).m()), se4VarB2);
        se4VarB.getClass();
        ux uxVar = new ux(new lx(se4VarB, qxVar, new t61(false), new jx(se4VarB), xi4Var, 0), ii0Var, null, null);
        synchronized (this) {
            if (c.get() != i) {
                return;
            }
            d = uxVar;
            try {
                try {
                    uxVar.a();
                    Log.d("QueuePreloader", str2 + qs3Var.b + " bytes of " + uri);
                    synchronized (this) {
                        if (d == uxVar) {
                            d = null;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        if (d == uxVar) {
                            d = null;
                        }
                        throw th;
                    }
                }
            } catch (Exception e5) {
                Log.d("QueuePreloader", str + uri + ": " + e5);
                synchronized (this) {
                    if (d == uxVar) {
                        d = null;
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            c.incrementAndGet();
            e = u01.n;
            ux uxVar = d;
            if (uxVar != null) {
                uxVar.j = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [u01] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    public final void c(Context context, qi3 qi3Var) {
        int iE;
        bn2 bn2Var;
        Uri uri;
        boolean zA = jp1.a();
        App.b().getClass();
        String string = App.c().getString("precache_tracks_count", "0");
        string.getClass();
        int i = Integer.parseInt(string);
        int i2 = 1;
        if (zA && i > 1) {
            i = 1;
        }
        if (i > 0 && ud3.F() > 0) {
            Context applicationContext = context.getApplicationContext();
            if (xa3.u("precache_wifi_only", true)) {
                applicationContext.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
                if (connectivityManager == null ? true : connectivityManager.isActiveNetworkMetered()) {
                    b();
                    return;
                }
            }
            if (qi3Var.f()) {
                return;
            }
            WaveSession waveSession = b.b;
            if (waveSession != null) {
                gn2 gn2VarA = qi3Var.a();
                String str = gn2VarA != null ? gn2VarA.a : null;
                if (waveSession.isWave(str) && !waveSession.settled(str)) {
                    b();
                    return;
                }
            }
            applicationContext.getClass();
            ?? arrayList = u01.n;
            cu4 cu4VarX0 = qi3Var.x0();
            cu4VarX0.getClass();
            if (!cu4VarX0.p()) {
                int iO0 = qi3Var.o0();
                if (iO0 != -1) {
                    arrayList = new ArrayList(i);
                    int i3 = iO0;
                    for (int i4 = -1; arrayList.size() < i && (iE = cu4VarX0.e(i3, qi3Var.h(), qi3Var.D0())) != i4 && iE != iO0; i4 = -1) {
                        gn2 gn2VarY = qi3Var.Y(iE);
                        gn2VarY.getClass();
                        String str2 = gn2VarY.a;
                        do2 do2Var = gn2VarY.d;
                        Bundle bundle = do2Var.I;
                        if (!h12.c(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO)) {
                            str2.getClass();
                            if (!xm4.k0(str2, "ir-", false)) {
                                au0.w(applicationContext).getClass();
                                if (!eu0.d(str2) && (((bn2Var = gn2VarY.b) != null && (uri = bn2Var.a) != null) || (uri = gn2VarY.f.a) != null)) {
                                    String scheme = uri.getScheme();
                                    if (h12.c(scheme, "http") || h12.c(scheme, "https") || ot1.d(uri)) {
                                        if (!ot1.d(uri)) {
                                            String queryParameter = uri.getQueryParameter("format");
                                            String queryParameter2 = uri.getQueryParameter("maxBitRate");
                                            if ((queryParameter == null || queryParameter.equals("raw")) && (queryParameter2 == null || queryParameter2.equals("0"))) {
                                            }
                                        }
                                        Bundle bundle2 = do2Var.I;
                                        int i5 = bundle2 != null ? bundle2.getInt("bitrate") : 0;
                                        if (xm4.e0(new xi4(10).d(new ii0(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0)), "|mobile", false) && (i2 > i5 || i5 >= 160)) {
                                            i5 = 160;
                                        }
                                        if (i5 <= 0) {
                                            i5 = 320;
                                        }
                                        arrayList.add(new qs3(uri, Math.max(262144L, (((((long) i5) * 1000) / 8) * ((long) (zA ? 10 : 15))) + 65536)));
                                    }
                                }
                            }
                        }
                        i3 = iE;
                        applicationContext = applicationContext;
                        i2 = 1;
                    }
                }
            }
            Context context2 = applicationContext;
            hx3 hx3Var = new hx3();
            synchronized (this) {
                if (arrayList.equals(e)) {
                    return;
                }
                hx3Var.n = c.incrementAndGet();
                e = arrayList;
                ux uxVar = d;
                if (uxVar != null) {
                    uxVar.j = true;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                b.execute(new qo2(arrayList, hx3Var, context2, 14));
            }
        }
    }
}
