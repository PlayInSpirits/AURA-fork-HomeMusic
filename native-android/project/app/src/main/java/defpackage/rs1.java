package defpackage;

import android.os.Handler;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 {
    public static final rs1 a = null;
    public static final rp4 b = null;
    public static final rp4 c = null;
    public static final ScheduledExecutorService d = null;
    public static ScheduledFuture e;
    public static ScheduledFuture f;
    public static final rp4 g = null;
    public static volatile boolean h;
    public static volatile long i;
    public static volatile long j;
    public static final rp4 k = null;
    public static final ArrayList l = null;
    public static volatile kd3 m;
    public static volatile Map n;
    public static volatile Map o;
    public static Map p;
    public static final WeakHashMap q = null;

    static {
        a = new rs1();
        b = new rp4(new e90(13));
        c = new rp4(new e90(14));
        d = Executors.newSingleThreadScheduledExecutor();
        g = new rp4(new e90(15));
        i = Long.MIN_VALUE;
        j = Long.MIN_VALUE;
        k = new rp4(new e90(16));
        l = new ArrayList();
        v01 r0 = v01.n;
        n = r0;
        o = r0;
        p = r0;
        q = new WeakHashMap();
    }

    public static final void a(String r9, String r10) {
        rs1 r0 = a;
        monitor-enter(r0);
        ArrayList r1 = l;     // Catch: Throwable -> L16
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L16
        int r3 = r1.size();     // Catch: Throwable -> L16
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L19;
        Object r6 = r1.get(r5);     // Catch: Throwable -> L16
        r5 = r5 + 1;     // Catch: Throwable -> L16
        PlayEvent r7 = (PlayEvent) ((kd3) r6).o;     // Catch: Throwable -> L16
        if (h12.c(r7.getAccount(), r9) == false) goto L5;
        if (r10 == null) goto L18;
        String r8 = r7.getRef();     // Catch: Throwable -> L16
        if (r8 == null) goto L12;
        String r11 = "hub:".concat(r8);     // Catch: Throwable -> L16
    L14:
        if (h12.c(r11, r10) == true) goto L5;
    L12:
        r11 = r7.getNdSongId();     // Catch: Throwable -> L16
    L18:
        r2.add(r6);     // Catch: Throwable -> L16
        goto L5
    L19:
        l.removeAll(q40.T0(r2));     // Catch: Throwable -> L16
        int r12 = r2.size();     // Catch: Throwable -> L16
    L20:
        if (r4 >= r12) goto L23;
        Object r13 = r2.get(r4);     // Catch: Throwable -> L16
        r4 = r4 + 1;     // Catch: Throwable -> L16
        d((PlayEvent) ((kd3) r13).o);     // Catch: Throwable -> L16
        goto L20
    L23:
        monitor-exit(r0);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public static void b(LinkedHashMap r2, Map r3) {
        r3.getClass();
        Map r0 = n;
        r0.getClass();
        LinkedHashMap r1 = new LinkedHashMap(r0);
        r1.putAll(r2);
        n = r1;
        if (r3.isEmpty() == true) goto L6;
        Map r4 = o;
        r4.getClass();
        LinkedHashMap r5 = new LinkedHashMap(r4);
        r5.putAll(r3);
        o = r5;
        return;
    }

    public static String c(String r1) {
        r1.getClass();
        String r2 = (String) n.get(r1);
        if (r2 != null) goto L6;
        return "other";
    L6:
        return r2;
    }

    public static void d(PlayEvent r16) {
        String r0 = r16.getRef();
        if (r0 == null) goto L6;
        String r1 = "hub:".concat(r0);
    L5:
        String r2 = r1;
        if (r2 != null) goto L9;
        return;
    L9:
        ih3 r3 = PlayEvent.Companion;
        String r4 = f();
        long r5 = System.currentTimeMillis();
        Double r6 = r16.getPositionS();
        Long r7 = null;
        if (r6 == null) goto L12;
        Long r8 = Long.valueOf((long) (r6.doubleValue() * 1000.0d));
    L13:
        Double r9 = r16.getDurationS();
        if (r9 == null) goto L16;
        r7 = Long.valueOf((long) (r9.doubleValue() * 1000.0d));
    L16:
        String r10 = r16.getContext();
        String r11 = r16.getPlaybackId();
        String r12 = r16.getDeviceId();
        Long r13 = r16.getListenedMs();
        String r14 = r16.getAccount();
        Map<String, Object> r15 = r16.getTrackMetadata();
        String r17 = r16.getLaunchId();
        String r18 = r16.getLaunchOrigin();
        r3.getClass();
        j(ih3.b("interrupted", r2, r4, r5, r8, r7, r10, r11, r12, r13, r14, r15, r17, r18));
        return;
    L12:
        r8 = null;
        goto L13
    L6:
        r1 = r16.getNdSongId();
        goto L5
    }

    public static void e() {
        Long r0 = ((nh3) c.getValue()).a();     // Catch: Exception -> L4
    L6:
        if (r0 == null) goto L11;
        k(r0.longValue());
        return;
    L11:
        return;
    L4:
        e = move-exception;
        Log.w("HubPlays", "flush", e);
        r0 = 30000L;
        goto L6
    }

    public static final String f() {
        return qm4.J0(32, "app/1.14.7");
    }

    public static final void g() {
        if (h == false) goto L5;
        return;
    L5:
        h = true;
        n61.g = new er1(2);
        File[] r0 = new File(App.a().getFilesDir(), "homemusic-open-plays").listFiles();
        int r1 = 0;
        if (r0 != null) goto L8;
        r0 = new File[0];
    L8:
        ArrayList r2 = new ArrayList();
        int r3 = r0.length;
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L14;
        File r5 = r0[r4];
        r5.getClass();
        String r6 = r5.getName();
        r6.getClass();
        if (qm4.G0(r6, '.', "").equals("json") == false) goto L13;
        r2.add(r5);
    L13:
        r4 = r4 + 1;
        goto L9
    L14:
        int r7 = r2.size();
    L15:
        if (r1 >= r7) goto L27;
        Object r8 = r2.get(r1);
        r1 = r1 + 1;
        File r9 = (File) r8;
        nk1 r10 = rr1.c;     // Catch: Exception -> L25
        r9.getClass();     // Catch: Exception -> L25
        PlayEvent r11 = (PlayEvent) r10.d(PlayEvent.class, ji2.H(r9));     // Catch: Exception -> L25
        if (r11.getPlaybackId() == null) goto L15;
        if (r11.getDeviceId() == null) goto L15;
        if (r11.getListenedMs() == null) goto L15;
        l.add(new kd3(r9, r11));     // Catch: Exception -> L25
    L25:
        e = move-exception;
        Log.w("HubPlays", "read listening checkpoint", e);
        goto L15
    L27:
        d.execute(new u6(8));
    }

    public static void h() {
        ScheduledFuture r0 = f;
        if (r0 == null) goto L5;
        r0.cancel(false);
    L5:
        lx0 r1 = (lx0) g.getValue();
        ii r2 = r1.b;
    L7:
        if (r2.isEmpty() == true) goto L12;
        r1.a.invoke(r2.first());     // Catch: Exception -> L10
        r2.removeFirst();
    L10:
        Log.e("HubPlays", "Could not persist listening event; retrying");
        u6 r3 = new u6(9);
        TimeUnit r4 = TimeUnit.SECONDS;
        f = d.schedule(r3, 30, r4);
        return;
    L12:
        f = null;
        k(5000);
    }

    public static final void i(List r3) {
        r3.getClass();
        int r0 = lg2.W(r40.k0(r3, 10));
        if (r0 >= 16) goto L5;
        r0 = 16;
    L5:
        LinkedHashMap r1 = new LinkedHashMap(r0);
        Iterator r4 = r3.iterator();
    L7:
        if (r4.hasNext() == false) goto L9;
        r1.put(((Child) r4.next()).getId(), "queue");
        goto L7
    L9:
        b(r1, v01.n);
    }

    public static final void j(final PlayEvent r3) {
        if (ti.t0(new String[]{"progress", "interrupted", "error"}).contains(r3.getKind()) == true) goto L5;
        WeakReference r0 = b.a;
        Handler r1 = io1.b;
        final int r2 = 2;
        r1.post(new os1(r3, r2));
        WeakReference r4 = a.a;
        final int r5 = 1;
        r1.post(new os1(r3, r5));
    L5:
        final int r6 = 0;
        Runnable r7 = new os1(r3, r6);
        d.execute(r7);
    }

    public static void k(long r3) {
        ScheduledFuture r0 = e;
        if (r0 == null) goto L5;
        r0.cancel(false);
    L5:
        u6 r1 = new u6(10);
        TimeUnit r2 = TimeUnit.MILLISECONDS;
        e = d.schedule(r1, r3, r2);
    }
}
