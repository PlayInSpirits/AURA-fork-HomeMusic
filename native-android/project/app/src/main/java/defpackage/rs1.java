package defpackage;

import android.os.Handler;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveSession;
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
    public static ScheduledFuture e;
    public static ScheduledFuture f;
    public static volatile boolean h;
    public static volatile kd3 m;
    public static volatile Map n;
    public static volatile Map o;
    public static Map p;
    public static final WeakHashMap q;
    public static final rs1 a = new rs1();
    public static final rp4 b = new rp4(new e90(13));
    public static final rp4 c = new rp4(new e90(14));
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public static final rp4 g = new rp4(new e90(15));
    public static volatile long i = Long.MIN_VALUE;
    public static volatile long j = Long.MIN_VALUE;
    public static final rp4 k = new rp4(new e90(16));
    public static final ArrayList l = new ArrayList();

    static {
        v01 v01Var = v01.n;
        n = v01Var;
        o = v01Var;
        p = v01Var;
        q = new WeakHashMap();
    }

    public static final void a(String str, String str2) {
        synchronized (a) {
            try {
                ArrayList arrayList = l;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    PlayEvent playEvent = (PlayEvent) ((kd3) obj).o;
                    if (h12.c(playEvent.getAccount(), str)) {
                        if (str2 != null) {
                            String ref = playEvent.getRef();
                            if (!h12.c(ref != null ? "hub:".concat(ref) : playEvent.getNdSongId(), str2)) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                }
                l.removeAll(q40.T0(arrayList2));
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    d((PlayEvent) ((kd3) obj2).o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(LinkedHashMap linkedHashMap, Map map) {
        map.getClass();
        Map map2 = n;
        map2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        linkedHashMap2.putAll(linkedHashMap);
        n = linkedHashMap2;
        if (map.isEmpty()) {
            return;
        }
        Map map3 = o;
        map3.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map3);
        linkedHashMap3.putAll(map);
        o = linkedHashMap3;
    }

    public static String c(String str) {
        str.getClass();
        String str2 = (String) n.get(str);
        return str2 == null ? "other" : str2;
    }

    public static void d(PlayEvent playEvent) {
        String ref = playEvent.getRef();
        String strConcat = ref != null ? "hub:".concat(ref) : playEvent.getNdSongId();
        if (strConcat == null) {
            return;
        }
        ih3 ih3Var = PlayEvent.Companion;
        String strF = f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Double positionS = playEvent.getPositionS();
        Long lValueOf = positionS != null ? Long.valueOf((long) (positionS.doubleValue() * 1000.0d)) : null;
        Double durationS = playEvent.getDurationS();
        Long lValueOf2 = durationS != null ? Long.valueOf((long) (durationS.doubleValue() * 1000.0d)) : null;
        String context = playEvent.getContext();
        String playbackId = playEvent.getPlaybackId();
        String deviceId = playEvent.getDeviceId();
        Long listenedMs = playEvent.getListenedMs();
        String account = playEvent.getAccount();
        Map<String, Object> trackMetadata = playEvent.getTrackMetadata();
        String launchId = playEvent.getLaunchId();
        String launchOrigin = playEvent.getLaunchOrigin();
        ih3Var.getClass();
        j(ih3.b("interrupted", strConcat, strF, jCurrentTimeMillis, lValueOf, lValueOf2, context, playbackId, deviceId, listenedMs, account, trackMetadata, launchId, launchOrigin));
    }

    public static void e() {
        Long lA;
        try {
            lA = ((nh3) c.getValue()).a();
        } catch (Exception e2) {
            Log.w("HubPlays", "flush", e2);
            lA = 30000L;
        }
        if (lA != null) {
            k(lA.longValue());
        }
    }

    public static final String f() {
        return qm4.J0(32, "app/1.14.7");
    }

    public static final void g() {
        if (h) {
            return;
        }
        h = true;
        n61.g = new er1(2);
        File[] fileArrListFiles = new File(App.a().getFilesDir(), "homemusic-open-plays").listFiles();
        int i2 = 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            file.getClass();
            String name = file.getName();
            name.getClass();
            if (qm4.G0(name, '.', "").equals("json")) {
                arrayList.add(file);
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            File file2 = (File) obj;
            try {
                nk1 nk1Var = rr1.c;
                file2.getClass();
                PlayEvent playEvent = (PlayEvent) nk1Var.d(PlayEvent.class, ji2.H(file2));
                if (playEvent.getPlaybackId() != null && playEvent.getDeviceId() != null && playEvent.getListenedMs() != null) {
                    l.add(new kd3(file2, playEvent));
                }
            } catch (Exception e2) {
                Log.w("HubPlays", "read listening checkpoint", e2);
            }
        }
        d.execute(new u6(8));
    }

    public static void h() {
        ScheduledFuture scheduledFuture = f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        lx0 lx0Var = (lx0) g.getValue();
        ii iiVar = lx0Var.b;
        while (!iiVar.isEmpty()) {
            try {
                lx0Var.a.invoke(iiVar.first());
                iiVar.removeFirst();
            } catch (Exception unused) {
                Log.e("HubPlays", "Could not persist listening event; retrying");
                f = d.schedule(new u6(9), 30L, TimeUnit.SECONDS);
                return;
            }
        }
        f = null;
        k(5000L);
    }

    public static final void i(List list) {
        list.getClass();
        int iW = lg2.W(r40.k0(list, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((Child) it.next()).getId(), "queue");
        }
        b(linkedHashMap, v01.n);
    }

    public static final void j(final PlayEvent playEvent) {
        if (!ti.t0(new String[]{"progress", "interrupted", "error"}).contains(playEvent.getKind())) {
            WeakReference weakReference = b.a;
            Handler handler = io1.b;
            final int i2 = 2;
            handler.post(new Runnable() { // from class: os1
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    PlayEvent playEvent2 = playEvent;
                    switch (i3) {
                        case 0:
                            rs1 rs1Var = rs1.a;
                            lx0 lx0Var = (lx0) rs1.g.getValue();
                            lx0Var.getClass();
                            lx0Var.b.addLast(playEvent2);
                            rs1.h();
                            break;
                        case 1:
                            SmartSession smartSession = a.b;
                            if (smartSession != null && smartSession.onEvent(playEvent2)) {
                                a.b();
                                break;
                            }
                            break;
                        default:
                            WaveSession waveSession = b.b;
                            if (waveSession != null && waveSession.onEvent(playEvent2)) {
                                b.c();
                                break;
                            }
                            break;
                    }
                }
            });
            WeakReference weakReference2 = a.a;
            final int i3 = 1;
            handler.post(new Runnable() { // from class: os1
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    PlayEvent playEvent2 = playEvent;
                    switch (i4) {
                        case 0:
                            rs1 rs1Var = rs1.a;
                            lx0 lx0Var = (lx0) rs1.g.getValue();
                            lx0Var.getClass();
                            lx0Var.b.addLast(playEvent2);
                            rs1.h();
                            break;
                        case 1:
                            SmartSession smartSession = a.b;
                            if (smartSession != null && smartSession.onEvent(playEvent2)) {
                                a.b();
                                break;
                            }
                            break;
                        default:
                            WaveSession waveSession = b.b;
                            if (waveSession != null && waveSession.onEvent(playEvent2)) {
                                b.c();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        final int i4 = 0;
        d.execute(new Runnable() { // from class: os1
            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                PlayEvent playEvent2 = playEvent;
                switch (i5) {
                    case 0:
                        rs1 rs1Var = rs1.a;
                        lx0 lx0Var = (lx0) rs1.g.getValue();
                        lx0Var.getClass();
                        lx0Var.b.addLast(playEvent2);
                        rs1.h();
                        break;
                    case 1:
                        SmartSession smartSession = a.b;
                        if (smartSession != null && smartSession.onEvent(playEvent2)) {
                            a.b();
                            break;
                        }
                        break;
                    default:
                        WaveSession waveSession = b.b;
                        if (waveSession != null && waveSession.onEvent(playEvent2)) {
                            b.c();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void k(long j2) {
        ScheduledFuture scheduledFuture = e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        e = d.schedule(new u6(10), j2, TimeUnit.MILLISECONDS);
    }
}
