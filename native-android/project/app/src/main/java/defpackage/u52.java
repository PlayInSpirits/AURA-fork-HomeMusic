package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSession;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 {
    public static String d;
    public static boolean e;
    public static Context f;
    public static volatile long i;
    public static volatile NsdServiceInfo j;
    public static volatile String k;
    public static volatile String l;
    public static volatile SSLSocket m;
    public static volatile SSLSocket n;
    public static Future o;
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final k03 b = new k03(new v52(null, null, null, null, null, 0, 0, false, false, 0.0f, 0, 0, 0, 0, 0, null, false, 0, false, false, null, 0.0f, 0.0f, false, false, null, 536870911));
    public static final k03 c = new k03(u01.n);
    public static final ExecutorService g = Executors.newSingleThreadExecutor();
    public static final ExecutorService h = Executors.newSingleThreadExecutor();

    public static final void a(String str, long j2) {
        long j3;
        if (c().b) {
            JSONObject jSONObjectPut = new JSONObject().put("command", str);
            if (str.equals("seek")) {
                jSONObjectPut.put("position", j2);
            }
            if (str.equals("volume")) {
                j3 = j2;
                jSONObjectPut.put("value", gb.n(j2, 0L, 100L) / 100.0d);
            } else {
                j3 = j2;
            }
            if (str.equals("shuffle")) {
                jSONObjectPut.put("enabled", j3 != 0);
            }
            if (str.equals("repeat")) {
                jSONObjectPut.put("mode", gb.n(j3, 0L, 2L));
            }
            jSONObjectPut.getClass();
            p(jSONObjectPut, new k52(5));
        }
    }

    public static final void b(Context context, final NsdServiceInfo nsdServiceInfo, final String str) {
        context.getClass();
        f();
        final long j2 = i;
        final Context applicationContext = context.getApplicationContext();
        f = applicationContext;
        final String strD = ud3.D();
        if (strD == null) {
            return;
        }
        l = strD;
        j = nsdServiceInfo;
        k03 k03Var = b;
        String serviceName = nsdServiceInfo.getServiceName();
        serviceName.getClass();
        k03Var.k(new v52(serviceName, null, null, null, null, 0L, 0L, false, false, 0.0f, 0, 0, 0, 0, 0L, null, false, 0, false, false, null, 0.0f, 0.0f, false, false, null, 536870906));
        o = g.submit(new Runnable() { // from class: l52
            /* JADX WARN: Code duplicated, block: B:127:0x015d A[ADDED_TO_REGION, EDGE_INSN: B:127:0x015d->B:85:0x015d BREAK  A[LOOP:0: B:4:0x0016->B:136:0x0016], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:129:0x015c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:70:0x0126 A[Catch: all -> 0x00ff, Exception -> 0x0159, TryCatch #2 {Exception -> 0x0159, blocks: (B:3:0x000f, B:4:0x0016, B:6:0x001c, B:68:0x0120, B:70:0x0126, B:73:0x0131, B:75:0x0135, B:77:0x0139, B:79:0x013d, B:81:0x0141, B:84:0x015c), top: B:103:0x000f, outer: #9 }] */
            /* JADX WARN: Code duplicated, block: B:75:0x0135 A[Catch: all -> 0x00ff, Exception -> 0x0159, TryCatch #2 {Exception -> 0x0159, blocks: (B:3:0x000f, B:4:0x0016, B:6:0x001c, B:68:0x0120, B:70:0x0126, B:73:0x0131, B:75:0x0135, B:77:0x0139, B:79:0x013d, B:81:0x0141, B:84:0x015c), top: B:103:0x000f, outer: #9 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x0185 A[ORIG_RETURN, RETURN] */
            @Override // java.lang.Runnable
            public final void run() {
                String strM;
                Throwable th;
                String str2 = str;
                final long j3 = j2;
                String str3 = strD;
                NsdServiceInfo nsdServiceInfo2 = nsdServiceInfo;
                final Context context2 = applicationContext;
                Handler handler = u52.a;
                try {
                    try {
                        SSLContext sSLContextE = fz0.j0.e();
                        int i2 = 1;
                        String str4 = str2;
                        boolean z = true;
                        while (u52.i == j3 && !Thread.currentThread().isInterrupted()) {
                            try {
                                if (!h12.c(ud3.D(), str3)) {
                                    throw new s52();
                                }
                                SSLSocket sSLSocketI = u52.i(sSLContextE, nsdServiceInfo2, j3, true);
                                try {
                                    strM = fz0.m(sSLSocketI);
                                    boolean z2 = LanReceiverService.y;
                                    context2.getClass();
                                    Set<String> stringSet = context2.getSharedPreferences("lan-playback", 0).getStringSet("receivers", z01.n);
                                    stringSet.getClass();
                                    if (!stringSet.contains(strM) || (str4 != null && !strM.equals(str4))) {
                                        throw new p52();
                                    }
                                    try {
                                        u52.k = strM;
                                        JSONObject jSONObjectPut = new JSONObject().put("command", "watch");
                                        jSONObjectPut.getClass();
                                        fz0.p(sSLSocketI, jSONObjectPut);
                                        w42 w42Var = w42.a;
                                        w42.a.a("Controller subscribed to live playback", null);
                                        final boolean z3 = z;
                                        while (u52.i == j3) {
                                            try {
                                                JSONObject jSONObjectN = fz0.n(sSLSocketI);
                                                if (!h12.c(ud3.D(), str3)) {
                                                    throw new s52();
                                                }
                                                if (jSONObjectN.has("error")) {
                                                    throw new r52();
                                                }
                                                if (jSONObjectN.optInt("remoteVersion") < 4) {
                                                    throw new t52();
                                                }
                                                String strOptString = jSONObjectN.optString("server");
                                                byte[] bytes = qm4.L0(str3, '/').getBytes(w10.a);
                                                bytes.getClass();
                                                if (!h12.c(strOptString, fz0.h(bytes))) {
                                                    throw new s52();
                                                }
                                                final v52 v52VarE = u52.e(jSONObjectN);
                                                try {
                                                    u52.a.post(new Runnable() { // from class: m52
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            xc5 xc5Var;
                                                            long j4 = j3;
                                                            v52 v52Var = v52VarE;
                                                            Context context3 = context2;
                                                            boolean z4 = z3;
                                                            if (u52.i == j4) {
                                                                u52.b.k(v52Var);
                                                                MediaSession mediaSession = z52.a;
                                                                context3.getClass();
                                                                z52.c(context3, v52Var);
                                                                Handler handler2 = u52.a;
                                                                u52.m();
                                                                if (z4) {
                                                                    cb4 cb4Var = new cb4(context3, new ComponentName(context3, (Class<?>) MediaService.class));
                                                                    Bundle bundle = Bundle.EMPTY;
                                                                    aj2 aj2Var = new aj2();
                                                                    Looper looperX = f35.x();
                                                                    bl2 bl2Var = new bl2(looperX);
                                                                    if (cb4Var.a.e()) {
                                                                        xc5Var = new xc5(4, new fi0(new x7(context3)));
                                                                    } else {
                                                                        xc5Var = null;
                                                                    }
                                                                    f35.W(new Handler(looperX), new ws1(11, bl2Var, new bj2(context3, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var)));
                                                                    bl2Var.f(new mm(j4, bl2Var, 3), new di(2));
                                                                }
                                                            }
                                                        }
                                                    });
                                                    z3 = false;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z = false;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th3) {
                                                        try {
                                                            q05.h(sSLSocketI, th);
                                                            throw th3;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str4 = strM;
                                                            if (u52.i == j3) {
                                                                break;
                                                            }
                                                            if (e instanceof p52) {
                                                            }
                                                            throw e;
                                                            if (u52.i != j3) {
                                                                return;
                                                            }
                                                            u52.m = null;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z = z3;
                                            }
                                        }
                                        try {
                                            sSLSocketI.close();
                                            z = z3;
                                            str4 = strM;
                                        } catch (Exception e3) {
                                            e = e3;
                                            z = z3;
                                            str4 = strM;
                                            if (u52.i == j3) {
                                                break;
                                                break;
                                            } else {
                                                if (e instanceof p52) {
                                                }
                                                throw e;
                                            }
                                            if (u52.i != j3) {
                                                return;
                                            }
                                            u52.m = null;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    strM = str4;
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                            if (u52.i == j3 || Thread.currentThread().isInterrupted()) {
                                break;
                                break;
                            }
                            if (!(e instanceof p52) || (e instanceof s52) || (e instanceof t52) || (e instanceof r52)) {
                                throw e;
                            }
                            w42.a.a("Controller live connection interrupted", e);
                            u52.a.post(new ns1(i2, j3));
                            Thread.sleep(2000L);
                        }
                        if (u52.i != j3) {
                            return;
                        }
                    } catch (Exception e5) {
                        if (u52.i == j3) {
                            w42.a.a("Controller connection rejected", e5);
                            u52.a.post(new mm(j3, e5, 2));
                        }
                        if (u52.i != j3) {
                            return;
                        }
                    }
                    u52.m = null;
                } catch (Throwable th7) {
                    if (u52.i != j3) {
                        throw th7;
                    }
                    u52.m = null;
                    throw th7;
                }
            }
        });
    }

    public static final v52 c() {
        v52 v52Var = (v52) b.d();
        if (v52Var != null) {
            return v52Var;
        }
        return new v52(null, null, null, null, null, 0L, 0L, false, false, 0.0f, 0, 0, 0, 0, 0L, null, false, 0, false, false, null, 0.0f, 0.0f, false, false, null, 536870911);
    }

    public static final Child d() {
        v52 v52VarC = c();
        List listL = l();
        if (k()) {
            int size = listL.size();
            int i2 = v52VarC.o;
            if (i2 >= 0 && i2 < size) {
                return (Child) listL.get(i2);
            }
        }
        return new Child(v52VarC.x, null, false, v52VarC.d, v52VarC.f, v52VarC.e, null, null, null, v52VarC.g, null, null, null, null, null, Integer.valueOf((int) (v52VarC.i / 1000)), null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33338, 7, null);
    }

    public static v52 e(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("title");
        strOptString2.getClass();
        String strOptString3 = jSONObject.optString("artist");
        strOptString3.getClass();
        String strOptString4 = jSONObject.optString("album");
        strOptString4.getClass();
        String strOptString5 = jSONObject.optString("cover");
        strOptString5.getClass();
        long jOptLong = jSONObject.optLong("position");
        if (jOptLong < 0) {
            jOptLong = 0;
        }
        long jOptLong2 = jSONObject.optLong("duration");
        if (jOptLong2 < 0) {
            jOptLong2 = 0;
        }
        boolean zOptBoolean = jSONObject.optBoolean("playing");
        boolean zOptBoolean2 = jSONObject.optBoolean("playWhenReady");
        float fL = gb.l((float) jSONObject.optDouble("volume", 1.0d), 0.0f, 1.0f);
        int iOptInt = jSONObject.optInt("index", -1);
        int iOptInt2 = jSONObject.optInt("deviceVolume");
        int iOptInt3 = jSONObject.optInt("deviceVolumeMax");
        long j2 = jOptLong;
        int iOptInt4 = jSONObject.optInt("count");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strOptString6 = jSONObject.optString("revision");
        strOptString6.getClass();
        boolean zOptBoolean3 = jSONObject.optBoolean("shuffle");
        int iOptInt5 = jSONObject.optInt("repeat");
        boolean zOptBoolean4 = jSONObject.optBoolean("next");
        boolean zOptBoolean5 = jSONObject.optBoolean("previous");
        String strOptString7 = jSONObject.optString("id");
        strOptString7.getClass();
        float fOptDouble = (float) jSONObject.optDouble("speed", 1.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("pitch", 1.0d);
        boolean zOptBoolean6 = jSONObject.optBoolean("timerActive");
        boolean zOptBoolean7 = jSONObject.optBoolean("timerEnd");
        String strOptString8 = jSONObject.optString("timerRemaining");
        strOptString8.getClass();
        return new v52(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, j2, jOptLong2, zOptBoolean, zOptBoolean2, fL, iOptInt2, iOptInt3, iOptInt, iOptInt4, jElapsedRealtime, strOptString6, zOptBoolean3, iOptInt5, zOptBoolean4, zOptBoolean5, strOptString7, fOptDouble, fOptDouble2, zOptBoolean6, zOptBoolean7, strOptString8, 131072);
    }

    public static final void f() {
        if (!h12.c(Looper.myLooper(), Looper.getMainLooper())) {
            kf2.o("Check failed.");
            return;
        }
        z52.b();
        i++;
        j = null;
        k = null;
        try {
            SSLSocket sSLSocket = m;
            if (sSLSocket != null) {
                sSLSocket.close();
            }
        } catch (Throwable unused) {
        }
        m = null;
        try {
            SSLSocket sSLSocket2 = n;
            if (sSLSocket2 != null) {
                sSLSocket2.close();
            }
        } catch (Throwable unused2) {
        }
        n = null;
        Future future = o;
        if (future != null) {
            future.cancel(true);
        }
        o = null;
        b.k(new v52(null, null, null, null, null, 0L, 0L, false, false, 0.0f, 0, 0, 0, 0, 0L, null, false, 0, false, false, null, 0.0f, 0.0f, false, false, null, 536870911));
        c.k(u01.n);
        d = null;
        e = false;
        w42 w42Var = w42.a;
        w42.a.a("Controller released remote playback; no stop command sent", null);
    }

    public static JSONObject g(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "edit").put("action", str);
        String str2 = l;
        if (str2 == null) {
            str2 = "";
        }
        byte[] bytes = qm4.L0(str2, '/').getBytes(w10.a);
        bytes.getClass();
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (byte b2 : bArrDigest) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        sb.append((CharSequence) "");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("server", sb.toString());
        String str3 = d;
        if (str3 == null) {
            str3 = c().s;
        }
        return jSONObjectPut2.put("revision", str3);
    }

    public static void h(final int i2) {
        a.post(new Runnable() { // from class: n52
            @Override // java.lang.Runnable
            public final void run() {
                Context context = u52.f;
                if (context != null) {
                    Toast.makeText(context, i2, 1).show();
                }
            }
        });
    }

    public static SSLSocket i(SSLContext sSLContext, NsdServiceInfo nsdServiceInfo, long j2, boolean z) throws Exception {
        Socket socketCreateSocket = sSLContext.getSocketFactory().createSocket();
        socketCreateSocket.getClass();
        SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
        if (z) {
            m = sSLSocket;
        } else {
            n = sSLSocket;
        }
        try {
            if (i != j2) {
                throw new IllegalStateException("Check failed.");
            }
            sSLSocket.setSoTimeout(SmartSession.MAX_SONGS);
            sSLSocket.connect(new InetSocketAddress(nsdServiceInfo.getHost(), nsdServiceInfo.getPort()), SmartSession.MAX_SONGS);
            sSLSocket.startHandshake();
            if (i == j2) {
                return sSLSocket;
            }
            throw new IllegalStateException("Check failed.");
        } catch (Exception e2) {
            sSLSocket.close();
            throw e2;
        }
    }

    public static final void j(float f2, float f3) throws JSONException {
        if (c().b) {
            JSONObject jSONObjectPut = new JSONObject().put("command", "speed").put("speed", Float.valueOf(f2)).put("pitch", Float.valueOf(f3));
            jSONObjectPut.getClass();
            p(jSONObjectPut, new k52(6));
        }
    }

    public static final boolean k() {
        return h12.c(d, c().s);
    }

    public static final List l() {
        List list = (List) c.d();
        return list == null ? u01.n : list;
    }

    public static void m() {
        if (!c().b || e || h12.c(c().s, d)) {
            return;
        }
        if (c().p <= 500) {
            e = true;
            n(new jx3(), new ArrayList(), 0);
        } else {
            if (!h12.c(d, c().s)) {
                h(R.string.lan_queue_limit);
            }
            d = c().s;
            c.k(u01.n);
        }
    }

    public static final void n(jx3 jx3Var, ArrayList arrayList, int i2) {
        JSONObject jSONObjectPut = new JSONObject().put("command", "queue_state").put("offset", i2);
        jSONObjectPut.getClass();
        o(jSONObjectPut, new e90(27), new o(14, jx3Var, arrayList));
    }

    public static void o(final JSONObject jSONObject, final gf1 gf1Var, final if1 if1Var) {
        final String str;
        final long j2 = i;
        final NsdServiceInfo nsdServiceInfo = j;
        if (nsdServiceInfo == null || (str = k) == null) {
            return;
        }
        h.execute(new Runnable() { // from class: o52
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                NsdServiceInfo nsdServiceInfo2 = nsdServiceInfo;
                JSONObject jSONObject2 = jSONObject;
                String str2 = str;
                if1 if1Var2 = if1Var;
                gf1 gf1Var2 = gf1Var;
                try {
                    try {
                        if (u52.i != j3 || !h12.c(ud3.D(), u52.l)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        Handler handler = u52.a;
                        SSLSocket sSLSocketI = u52.i(fz0.j0.e(), nsdServiceInfo2, j3, false);
                        try {
                            if (h12.c(jSONObject2.optString("command"), "edit")) {
                                sSLSocketI.setSoTimeout(120000);
                            }
                            if (!fz0.m(sSLSocketI).equals(str2)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (u52.i != j3 || !h12.c(ud3.D(), u52.l)) {
                                throw new IllegalStateException("Check failed.");
                            }
                            fz0.p(sSLSocketI, jSONObject2);
                            JSONObject jSONObjectN = fz0.n(sSLSocketI);
                            if (h12.c(jSONObjectN.optString("error"), "queue_changed")) {
                                throw new q52();
                            }
                            if (!jSONObjectN.optBoolean("ok")) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            sSLSocketI.close();
                            u52.a.post(new sn1(j3, if1Var2, jSONObjectN, 1));
                            if (u52.i == j3) {
                                u52.n = null;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                q05.h(sSLSocketI, th);
                                throw th2;
                            }
                        }
                    } catch (Exception e2) {
                        w42.a.a("Remote command failed", e2);
                        u52.a.post(new un1(j3, e2, jSONObject2, gf1Var2, 1));
                        if (u52.i == j3) {
                            u52.n = null;
                        }
                    }
                } catch (Throwable th3) {
                    if (u52.i != j3) {
                        throw th3;
                    }
                    u52.n = null;
                    throw th3;
                }
            }
        });
    }

    public static /* synthetic */ void p(JSONObject jSONObject, if1 if1Var) {
        o(jSONObject, new e90(25), if1Var);
    }

    public static final boolean q(String str, int i2, int i3) throws JSONException {
        int i4 = 0;
        if (!c().a) {
            return false;
        }
        if (!c().b) {
            h(R.string.lan_reconnecting);
            return true;
        }
        if (str.equals("clear") || h12.c(d, c().s)) {
            JSONObject jSONObjectPut = g(str).put("from", i2).put("to", i3).put("index", i2);
            jSONObjectPut.getClass();
            o(jSONObjectPut, new e90(26), new k52(i4));
            return true;
        }
        h(R.string.lan_queue_changed);
        c.k(q40.Q0(l()));
        return true;
    }

    public static final boolean r(List list, String str, int i2, long j2) throws JSONException {
        Object s14Var;
        list.getClass();
        if (!c().a) {
            return false;
        }
        if (!c().b) {
            h(R.string.lan_reconnecting);
            return true;
        }
        if (str.equals("reorder") && !h12.c(d, c().s)) {
            h(R.string.lan_queue_changed);
            c.k(q40.Q0(l()));
            return true;
        }
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Child) it.next()).getId());
        }
        try {
            j51.T(arrayList);
            s14Var = j15.a;
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        if ((s14Var instanceof s14) || (str.equals("replace") && (i2 < 0 || i2 >= arrayList.size()))) {
            h(R.string.lan_queue_limit);
            return true;
        }
        JSONObject jSONObjectPut = g(str).put("ids", new JSONArray((Collection) arrayList)).put("index", i2);
        if (str.equals("replace")) {
            if (j2 < 0) {
                j2 = 0;
            }
            jSONObjectPut.put("position", j2);
        }
        String string = jSONObjectPut.toString();
        string.getClass();
        byte[] bytes = string.getBytes(w10.a);
        bytes.getClass();
        if (bytes.length > 131072) {
            h(R.string.lan_queue_limit);
            return true;
        }
        if (ti.t0(new String[]{"replace", "append", "next"}).contains(str)) {
            h(R.string.lan_transferring);
        }
        o(jSONObjectPut, new e90(24), new k52(2));
        return true;
    }

    public static final void s(int i2, String str) throws JSONException {
        if (c().b) {
            JSONObject jSONObjectPut = new JSONObject().put("command", "timer").put("mode", str).put("minutes", i2);
            jSONObjectPut.getClass();
            p(jSONObjectPut, new k52(1));
        }
    }
}
