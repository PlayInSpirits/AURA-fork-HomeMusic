package defpackage;

import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.subsonic.models.Child;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 {
    public static final Handler a = null;
    public static final k03 b = null;
    public static final k03 c = null;
    public static String d;
    public static boolean e;
    public static Context f;
    public static final ExecutorService g = null;
    public static final ExecutorService h = null;
    public static volatile long i;
    public static volatile NsdServiceInfo j;
    public static volatile String k;
    public static volatile String l;
    public static volatile SSLSocket m;
    public static volatile SSLSocket n;
    public static Future o;

    static {
        a = new Handler(Looper.getMainLooper());
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        long r7 = 0;
        long r9 = 0;
        boolean r11 = false;
        boolean r12 = false;
        float r13 = 0.0f;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        long r18 = 0;
        String r20 = null;
        boolean r21 = false;
        int r22 = 0;
        boolean r23 = false;
        boolean r24 = false;
        String r25 = null;
        float r26 = 0.0f;
        float r27 = 0.0f;
        boolean r28 = false;
        boolean r29 = false;
        b = new k03(new v52(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, null, 536870911));
        c = new k03(u01.n);
        g = Executors.newSingleThreadExecutor();
        h = Executors.newSingleThreadExecutor();
    }

    public static final void a(String r8, long r9) {
        if (c().b == true) goto L5;
        return;
    L5:
        JSONObject r0 = new JSONObject().put("command", r8);
        if (r8.equals("seek") == false) goto L9;
        r0.put("position", r9);
    L9:
        if (r8.equals("volume") == false) goto L11;
        long r1 = r9;
        r0.put("value", gb.n(r9, 0, 100) / 100.0d);
    L13:
        if (r8.equals("shuffle") == false) goto L20;
        if (r1 == 0) goto L17;
        boolean r10 = true;
    L18:
        r0.put("enabled", r10);
        goto L20
    L17:
        r10 = false;
    L20:
        if (r8.equals("repeat") == false) goto L22;
        r0.put("mode", gb.n(r1, 0, 2));
    L22:
        r0.getClass();
        p(r0, new k52(5));
        return;
    L11:
        r1 = r9;
        goto L13
    }

    public static final void b(Context r38, final NsdServiceInfo r39, final String r40) {
        r38.getClass();
        f();
        final long r2 = i;
        final Context r6 = r38.getApplicationContext();
        f = r6;
        final String r4 = ud3.D();
        if (r4 != null) goto L5;
        return;
    L5:
        l = r4;
        j = r39;
        k03 r0 = b;
        String r8 = r39.getServiceName();
        r8.getClass();
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        long r13 = 0;
        long r15 = 0;
        boolean r17 = false;
        boolean r18 = false;
        float r19 = 0.0f;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        long r24 = 0;
        String r26 = null;
        boolean r27 = false;
        int r28 = 0;
        boolean r29 = false;
        boolean r30 = false;
        String r31 = null;
        float r32 = 0.0f;
        float r33 = 0.0f;
        boolean r34 = false;
        boolean r35 = false;
        r0.k(new v52(r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, null, 536870906));
        o = g.submit(new l52(r40, r2, r4, r39, r6));
    }

    public static final v52 c() {
        v52 r0 = (v52) b.d();
        if (r0 != null) goto L6;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        long r7 = 0;
        long r9 = 0;
        boolean r11 = false;
        boolean r12 = false;
        float r13 = 0.0f;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        long r18 = 0;
        String r20 = null;
        boolean r21 = false;
        int r22 = 0;
        boolean r23 = false;
        boolean r24 = false;
        String r25 = null;
        float r26 = 0.0f;
        float r27 = 0.0f;
        boolean r28 = false;
        boolean r29 = false;
        return new v52(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, null, 536870911);
    L6:
        return r0;
    }

    public static final Child d() {
        v52 r0 = c();
        List r1 = l();
        if (k() == false) goto L9;
        int r2 = r1.size();
        int r3 = r0.o;
        if (r3 < 0) goto L9;
        if (r3 >= r2) goto L9;
        return (Child) r1.get(r3);
    L9:
        String r4 = r0.x;
        String r5 = r0.d;
        String r7 = r0.e;
        return new Child(r4, null, false, r5, r0.f, r7, null, null, null, r0.g, null, null, null, null, null, Integer.valueOf((int) (r0.i / 1000)), null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33338, 7, null);
    }

    public static v52 e(JSONObject r33) {
        String r3 = r33.optString("name");
        r3.getClass();
        String r4 = r33.optString("title");
        r4.getClass();
        String r5 = r33.optString("artist");
        r5.getClass();
        String r6 = r33.optString("album");
        r6.getClass();
        String r7 = r33.optString("cover");
        r7.getClass();
        long r1 = r33.optLong("position");
        if (r1 >= 0) goto L5;
        r1 = 0;
    L5:
        long r10 = r33.optLong("duration");
        if (r10 >= 0) goto L8;
        r10 = 0;
    L8:
        boolean r12 = r33.optBoolean("playing");
        boolean r13 = r33.optBoolean("playWhenReady");
        float r14 = gb.l((float) r33.optDouble("volume", 1.0d), 0.0f, 1.0f);
        int r8 = r33.optInt("index", -1);
        int r15 = r33.optInt("deviceVolume");
        int r9 = r33.optInt("deviceVolumeMax");
        long r18 = r1;
        int r2 = r33.optInt("count");
        long r19 = SystemClock.elapsedRealtime();
        String r11 = r33.optString("revision");
        r11.getClass();
        boolean r16 = r33.optBoolean("shuffle");
        int r17 = r33.optInt("repeat");
        boolean r20 = r33.optBoolean("next");
        boolean r21 = r33.optBoolean("previous");
        String r22 = r33.optString("id");
        r22.getClass();
        float r23 = (float) r33.optDouble("speed", 1.0d);
        float r24 = (float) r33.optDouble("pitch", 1.0d);
        boolean r25 = r33.optBoolean("timerActive");
        boolean r30 = r33.optBoolean("timerEnd");
        String r31 = r33.optString("timerRemaining");
        r31.getClass();
        return new v52(r3, r4, r5, r6, r7, r18, r10, r12, r13, r14, r15, r9, r8, r2, r19, r11, r16, r17, r20, r21, r22, r23, r24, r25, r30, r31, 131072);
    }

    public static final void f() {
        if (h12.c(Looper.myLooper(), Looper.getMainLooper()) == false) goto L17;
        z52.b();
        i++;
        j = null;
        k = null;
        SSLSocket r1 = m;     // Catch: Throwable -> L19
        if (r1 == null) goto L8;
        r1.close();     // Catch: Throwable -> L19
    L8:
        m = null;
        SSLSocket r2 = n;     // Catch: Throwable -> L20
        if (r2 == null) goto L12;
        r2.close();     // Catch: Throwable -> L20
    L12:
        n = null;
        Future r3 = o;
        if (r3 == null) goto L15;
        r3.cancel(true);
    L15:
        o = null;
        b.k(new v52(null, null, null, null, null, 0, 0, false, false, 0.0f, 0, 0, 0, 0, 0, null, false, 0, false, false, null, 0.0f, 0.0f, false, false, null, 536870911));
        c.k(u01.n);
        d = null;
        e = false;
        w42 r0 = w42.a;
        w42.b("Controller released remote playback; no stop command sent");
        return;
    L17:
        kf2.o("Check failed.");
    }

    public static JSONObject g(String r9) {
        JSONObject r10 = new JSONObject().put("command", "edit").put("action", r9);
        String r0 = l;
        if (r0 != null) goto L5;
        r0 = "";
    L5:
        int r5 = 0;
        byte[] r1 = qm4.L0(r0, new char[]{'/'}).getBytes(w10.a);
        r1.getClass();
        byte[] r2 = MessageDigest.getInstance("SHA-256").digest(r1);
        r2.getClass();
        StringBuilder r3 = new StringBuilder();
        r3.append("");
        int r4 = r2.length;
        int r6 = 0;
    L6:
        if (r5 >= r4) goto L11;
        byte r7 = r2[r5];
        r6 = r6 + 1;
        if (r6 <= 1) goto L10;
        r3.append("");
    L10:
        r3.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r7)}, 1)));
        r5 = r5 + 1;
        goto L6
    L11:
        r3.append("");
        JSONObject r11 = r10.put("server", r3.toString());
        String r8 = d;
        if (r8 != null) goto L15;
        r8 = c().s;
    L15:
        return r11.put("revision", r8);
    }

    public static void h(final int r1) {
        Runnable r0 = new n52(r1);
        a.post(r0);
    }

    public static SSLSocket i(SSLContext r3, NsdServiceInfo r4, long r5, boolean r7) {
        Socket r6 = r3.getSocketFactory().createSocket();
        r6.getClass();
        SSLSocket r8 = (SSLSocket) r6;
        if (r7 == false) goto L5;
        m = r8;
    L21:
    L15:
        e = move-exception;
        r8.close();
        throw e;
    L8:
        if (i != r5) goto L18;
        r8.setSoTimeout(SmartSession.MAX_SONGS);     // Catch: Exception -> L15
        r8.connect(new InetSocketAddress(r4.getHost(), r4.getPort()), SmartSession.MAX_SONGS);     // Catch: Exception -> L15
        r8.startHandshake();     // Catch: Exception -> L15
        if (i != r5) goto L14;
        return r8;
    L14:
        throw new IllegalStateException("Check failed.");     // Catch: Exception -> L15
    L18:
        throw new IllegalStateException("Check failed.");     // Catch: Exception -> L15
    L5:
        n = r8;
        goto L21
    }

    public static final void j(float r3, float r4) {
        if (c().b == true) goto L5;
        return;
    L5:
        JSONObject r5 = new JSONObject().put("command", "speed").put("speed", Float.valueOf(r3)).put("pitch", Float.valueOf(r4));
        r5.getClass();
        p(r5, new k52(6));
    }

    public static final boolean k() {
        return h12.c(d, c().s);
    }

    public static final List l() {
        List r0 = (List) c.d();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return u01.n;
    }

    public static void m() {
        if (c().b == true) goto L5;
        return;
    L5:
        if (e == false) goto L7;
        return;
    L7:
        if (h12.c(c().s, d) == false) goto L10;
        return;
    L10:
        if (c().p > 500) goto L12;
        e = true;
        ArrayList r0 = new ArrayList();
        n(new jx3(), r0, 0);
        return;
    L12:
        if (h12.c(d, c().s) == true) goto L14;
        h(R.string.lan_queue_limit);
    L14:
        d = c().s;
        c.k(u01.n);
    }

    public static final void n(jx3 r3, ArrayList r4, int r5) {
        JSONObject r6 = new JSONObject().put("command", "queue_state").put("offset", r5);
        r6.getClass();
        o(r6, new e90(27), new o(14, r3, r4));
    }

    public static void o(final JSONObject r9, final gf1 r10, final if1 r11) {
        final long r1 = i;
        final NsdServiceInfo r3 = j;
        if (r3 == null) goto L10;
        final String r5 = k;
        if (r5 != null) goto L8;
        return;
    L8:
        h.execute(new o52(r1, r3, r9, r5, r11, r10));
        return;
    }

    public static /* synthetic */ void p(JSONObject r2, if1 r3) {
        o(r2, new e90(25), r3);
    }

    public static final boolean q(String r4, int r5, int r6) {
        if (c().a == true) goto L6;
        return false;
    L6:
        if (c().b == true) goto L10;
        h(R.string.lan_reconnecting);
        return true;
    L10:
        if (r4.equals("clear") == false) goto L12;
    L15:
        JSONObject r7 = g(r4).put("from", r5).put("to", r6).put("index", r5);
        r7.getClass();
        o(r7, new e90(26), new k52(0));
        return true;
    L12:
        if (h12.c(d, c().s) == true) goto L15;
        h(R.string.lan_queue_changed);
        List r8 = q40.Q0(l());
        c.k(r8);
        return true;
    }

    public static final boolean r(List r5, String r6, int r7, long r8) {
        r5.getClass();
        if (c().a == true) goto L7;
        return false;
    L7:
        if (c().b == true) goto L11;
        h(R.string.lan_reconnecting);
        return true;
    L11:
        if (r6.equals("reorder") == true) goto L13;
    L16:
        ArrayList r0 = new ArrayList(r40.k0(r5, 10));
        Iterator r9 = r5.iterator();
    L18:
        if (r9.hasNext() == false) goto L48;
        r0.add(((Child) r9.next()).getId());
        goto L18
    L48:
        j51.T(r0);     // Catch: Throwable -> L22
        Object r10 = j15.a;     // Catch: Throwable -> L22
    L25:
        if ((r10 instanceof s14) == false) goto L27;
    L46:
        h(R.string.lan_queue_limit);
        return true;
    L27:
        if (r6.equals("replace") == false) goto L31;
        if (r7 < 0) goto L46;
        if (r7 >= r0.size()) goto L46;
    L31:
        JSONObject r11 = g(r6).put("ids", new JSONArray(r0)).put("index", r7);
        if (r6.equals("replace") == true) goto L34;
    L37:
        String r12 = r11.toString();
        r12.getClass();
        byte[] r13 = r12.getBytes(w10.a);
        r13.getClass();
        if (r13.length <= 131072) goto L42;
        h(R.string.lan_queue_limit);
        return true;
    L42:
        if (ti.t0(new String[]{"replace", "append", "next"}).contains(r6) == false) goto L44;
        h(R.string.lan_transferring);
    L44:
        o(r11, new e90(24), new k52(2));
        return true;
    L34:
        if (r8 >= 0) goto L36;
        r8 = 0;
    L36:
        r11.put("position", r8);
    L22:
        th = move-exception;
        r10 = new s14(th);
        goto L25
    L13:
        if (h12.c(d, c().s) == true) goto L16;
        h(R.string.lan_queue_changed);
        c.k(q40.Q0(l()));
        return true;
    }

    public static final void s(int r3, String r4) {
        if (c().b == true) goto L5;
        return;
    L5:
        JSONObject r5 = new JSONObject().put("command", "timer").put("mode", r4).put("minutes", r3);
        r5.getClass();
        p(r5, new k52(1));
    }
}
