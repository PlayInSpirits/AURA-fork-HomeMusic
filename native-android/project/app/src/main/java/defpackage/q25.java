package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.upnp.UpnpException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q25 extends qe4 {
    public static final long P = 4000;
    public static final Set Q = ti.t0(new String[]{"STOPPED", "NO_MEDIA_PRESENT"});
    public static final long R = 10000;
    public static final long S = 30000;
    public static final long T = 5000;
    public static final mi3 U;
    public volatile long A;
    public volatile long B;
    public volatile boolean C;
    public volatile String D;
    public volatile long E;
    public volatile long F;
    public final AtomicInteger G;
    public volatile Long H;
    public volatile PlaybackException I;
    public volatile boolean J;
    public volatile int K;
    public volatile long L;
    public volatile boolean M;
    public long N;
    public final wu4 O;
    public final f25 j;
    public final g25 k;
    public final mx2 l;
    public final if1 m;
    public final Handler n;
    public final PowerManager.WakeLock o;
    public volatile List p;
    public volatile int q;
    public volatile boolean r;
    public volatile int s;
    public volatile long t;
    public volatile long u;
    public volatile boolean v;
    public volatile String w;
    public volatile int x;
    public volatile int y;
    public volatile long z;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{1, 2, 3, 4, 5, 9, 8, 7, 6, 10, 31, 20, 17, 16, 18, 30, 32}) {
            rr2.w(!false);
            sparseBooleanArray.append(i, true);
        }
        rr2.w(!false);
        U = new mi3(new w71(sparseBooleanArray));
    }

    public q25(f25 f25Var, g25 g25Var, Looper looper, Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        mx2 mx2VarM = wr1.M(Executors.newSingleThreadExecutor());
        o54 o54Var = new o54(23);
        super(looper);
        this.j = f25Var;
        this.k = g25Var;
        this.l = mx2VarM;
        this.m = o54Var;
        this.n = new Handler(looper);
        Object systemService = context.getSystemService("power");
        PowerManager.WakeLock wakeLock = null;
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null && (wakeLockNewWakeLock = powerManager.newWakeLock(1, "tempus:UpnpPlayer")) != null) {
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLock = wakeLockNewWakeLock;
        }
        this.o = wakeLock;
        this.p = u01.n;
        this.s = 1;
        this.B = -9223372036854775807L;
        this.G = new AtomicInteger();
        this.O = new wu4(2, this);
    }

    public static String R1(gn2 gn2Var, String str) {
        do2 do2Var = gn2Var.d;
        do2Var.getClass();
        List list = f25.c;
        CharSequence charSequence = do2Var.a;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        CharSequence charSequence2 = do2Var.b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        CharSequence charSequence3 = do2Var.c;
        String string3 = charSequence3 != null ? charSequence3.toString() : null;
        String str2 = string3 != null ? string3 : "";
        str.getClass();
        String strH = ud3.h(string);
        String strH2 = ud3.h(string2);
        String strH3 = ud3.h(str2);
        String strH4 = ud3.h("*");
        String strH5 = ud3.h(str);
        StringBuilder sbU = b11.u("<DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\"><item id=\"1\" parentID=\"0\" restricted=\"1\"><dc:title>", strH, "</dc:title><upnp:artist>", strH2, "</upnp:artist><upnp:album>");
        f34.n(sbU, strH3, "</upnp:album><upnp:class>object.item.audioItem.musicTrack</upnp:class><res protocolInfo=\"http-get:*:", strH4, ":DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01700000000000000000000000000000\">");
        return b11.q(sbU, strH5, "</res></item></DIDL-Lite>");
    }

    public final PlaybackException G1(Exception exc) {
        return new PlaybackException(xa3.h("Lost contact with ", this.k.b, "."), exc, 1001);
    }

    public final PlaybackException H1(p25 p25Var, Exception exc) {
        String host;
        Uri uri;
        String str = p25Var.c;
        if (str == null || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            host = "the music server";
        }
        return new PlaybackException(this.k.b + " could not play the track from " + host + ". A renderer fetches the stream from the music server itself, so the server address has to be one the renderer can reach, not a VPN or loopback address only this phone can use.", exc, 2005);
    }

    public final PlaybackException I1(p25 p25Var, Exception exc) {
        if (!(exc instanceof UpnpException)) {
            return G1(exc);
        }
        UpnpException upnpException = (UpnpException) exc;
        int i = upnpException.n;
        if (i == 716 && p25Var != null) {
            return H1(p25Var, exc);
        }
        return new PlaybackException(this.k.b + " refused the track (UPnP error " + i + ").", upnpException, 1001);
    }

    public final p25 J1() {
        return (p25) q40.y0(this.p, this.q);
    }

    public final ic2 K1(if1 if1Var) {
        p25 p25VarJ1 = J1();
        Long lValueOf = p25VarJ1 != null ? Long.valueOf(p25VarJ1.a) : null;
        p25 p25Var = (p25) q40.y0(this.p, this.q + 1);
        String str = p25Var != null ? p25Var.c : null;
        ArrayList arrayListR0 = q40.R0(this.p);
        if1Var.invoke(arrayListR0);
        this.p = arrayListR0;
        int size = arrayListR0.size();
        int iM = 0;
        int i = 0;
        while (true) {
            if (i >= size) {
                iM = -1;
                break;
            }
            Object obj = arrayListR0.get(i);
            i++;
            long j = ((p25) obj).a;
            if (lValueOf != null && j == lValueOf.longValue()) {
                break;
            }
            iM++;
        }
        boolean z = lValueOf != null && iM < 0;
        if (iM < 0) {
            iM = gb.m(this.q, 0, Math.max(0, arrayListR0.size() - 1));
        }
        this.q = iM;
        O1();
        if (arrayListR0.isEmpty()) {
            ic2 ic2VarB = this.l.b(new l25(this, 0));
            ic2VarB.getClass();
            return ic2VarB;
        }
        if (z) {
            Y1(0L);
            this.B = -9223372036854775807L;
            return Q1(0L);
        }
        p25 p25Var2 = (p25) q40.y0(arrayListR0, this.q + 1);
        if (h12.c(p25Var2 != null ? p25Var2.c : null, str)) {
            return mw1.o;
        }
        ic2 ic2VarB2 = this.l.b(new l25(this, 1));
        ic2VarB2.getClass();
        return ic2VarB2;
    }

    public final void L1(PlaybackException playbackException) {
        this.I = playbackException;
        this.r = false;
        c2();
        Z1();
        a2("after a refusal");
        O1();
        Log.w("UpnpPlayer", "playback on the renderer stopped", playbackException);
    }

    public final void M1(boolean z) {
        if (z == this.r) {
            this.y = 0;
            return;
        }
        this.y++;
        if (this.y < 2) {
            return;
        }
        this.y = 0;
        if (!z) {
            Y1(U1());
        }
        this.r = z;
        c2();
        if (z) {
            Long l = this.H;
            if (l != null) {
                long jLongValue = l.longValue();
                this.H = null;
                if (W1(jLongValue)) {
                    Y1(jLongValue);
                    this.A = jLongValue;
                }
            }
            X1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    public final boolean N1(long j, long j2, String str) {
        boolean z;
        if (str != null && !qm4.u0(str)) {
            p25 p25VarJ1 = J1();
            if (!str.equals(p25VarJ1 != null ? p25VarJ1.c : null)) {
                int i = this.q + 1;
                p25 p25Var = (p25) q40.y0(this.p, i);
                if (!h12.c(p25Var != null ? p25Var.c : null, str)) {
                    Iterator it = this.p.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        p25 p25Var2 = (p25) it.next();
                        if (h12.c(p25Var2 != null ? p25Var2.c : null, str)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (j2 <= 0) {
                        z = false;
                    } else {
                        if (j < j2 - 2000) {
                            WeakReference weakReference = bo2.a;
                            if (j2 <= 30000 || j < Math.min(j2 / 2, 240000L)) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    this.v = z;
                    this.q = i;
                    this.B = -9223372036854775807L;
                    this.J = false;
                    this.K = 0;
                    this.x = 0;
                    this.A = 0L;
                    Y1(0L);
                    O1();
                    X1();
                    return true;
                }
                if (this.r) {
                    Log.w("UpnpPlayer", "renderer is on a track that is not in the queue, loading ours again");
                    P1(0L);
                    return true;
                }
            }
        }
        return false;
    }

    public final void O1() {
        this.n.post(new o25(this, 3));
    }

    public final void P1(long j) {
        p25 p25VarJ1 = J1();
        if (p25VarJ1 == null) {
            return;
        }
        String str = p25VarJ1.c;
        if (str == null) {
            Log.w("UpnpPlayer", "queue item has no uri, nothing to hand the renderer");
            return;
        }
        this.I = null;
        this.H = null;
        int i = 0;
        this.x = 0;
        this.w = null;
        this.J = false;
        this.K = 0;
        this.A = 0L;
        this.s = 2;
        O1();
        boolean zEquals = str.equals(this.D);
        try {
            if (!zEquals) {
                this.j.f(this.k, str, R1(p25VarJ1.b, str));
                this.D = str;
            } else if (this.r) {
                this.H = null;
                W1(j);
            } else {
                this.H = Long.valueOf(j);
            }
            if (this.r) {
                this.j.b(this.k);
            }
            if (!zEquals && j > 0) {
                if (this.r) {
                    this.H = null;
                    V1(j);
                } else {
                    this.H = Long.valueOf(j);
                }
            }
            this.u = SystemClock.elapsedRealtime();
            X1();
            if (!this.r) {
                this.s = 3;
            }
            this.n.post(new o25(this, i));
            O1();
        } catch (Exception e) {
            L1(I1(p25VarJ1, e));
        }
    }

    public final ic2 Q1(long j) {
        this.E++;
        long j2 = this.E;
        this.G.incrementAndGet();
        ic2 ic2VarB = this.l.b(new i25(j2, this, j));
        ic2VarB.getClass();
        return ic2VarB;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    public final void S1(long j, long j2, long j3, long j4) {
        boolean z;
        if (!this.r) {
            this.D = null;
            this.s = 1;
            return;
        }
        p25 p25VarJ1 = J1();
        if (p25VarJ1 != null && !this.J) {
            this.K++;
            if (this.K > 5) {
                L1(H1(p25VarJ1, null));
                return;
            }
            return;
        }
        this.D = null;
        if (j3 > 0 && j < j3 - R) {
            Y1(j4);
            this.r = false;
            c2();
            this.s = 1;
            Z1();
            return;
        }
        p25 p25Var = (p25) q40.y0(this.p, this.q + 1);
        if (p25Var != null && h12.c(this.w, p25Var.c) && this.x < 3) {
            this.x++;
            return;
        }
        this.x = 0;
        if (j2 <= 0) {
            z = false;
        } else {
            if (j < j2 - 2000) {
                WeakReference weakReference = bo2.a;
                if (j2 <= 30000 || j < Math.min(j2 / 2, 240000L)) {
                    z = false;
                }
            }
            z = true;
        }
        if (this.q + 1 >= this.p.size()) {
            this.r = false;
            c2();
            this.s = z ? 4 : 1;
            Z1();
            return;
        }
        this.v = z;
        this.q++;
        Y1(0L);
        this.B = -9223372036854775807L;
        this.J = false;
        this.K = 0;
        this.A = 0L;
        P1(0L);
    }

    public final void T1() throws UpnpException {
        Set setT0;
        f25 f25Var = this.j;
        f25Var.getClass();
        Set set = z01.n;
        g25 g25Var = this.k;
        g25Var.getClass();
        try {
            String str = (String) f25Var.h(f25.d(g25Var), "GetCurrentTransportActions", gb.O(new kd3("InstanceID", "0"))).get("Actions");
            if (str != null) {
                int i = 0;
                List listD0 = qm4.D0(str, new char[]{','});
                ArrayList arrayList = new ArrayList(r40.k0(listD0, 10));
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    arrayList.add(qm4.K0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                setT0 = q40.T0(arrayList2);
            } else {
                setT0 = null;
            }
            if (setT0 != null) {
                set = setT0;
            }
        } catch (UpnpException unused) {
        }
        if (!set.isEmpty()) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!xm4.f0((String) it2.next(), "Pause", true));
            }
            f25Var.h(f25.d(g25Var), "Stop", gb.O(new kd3("InstanceID", "0")));
            return;
        }
        try {
            f25Var.h(f25.d(g25Var), "Pause", gb.O(new kd3("InstanceID", "0")));
        } catch (UpnpException e) {
            if (e.n != 701) {
                throw e;
            }
            Log.d("UpnpPlayer", "renderer refused a pause, stopping instead");
        }
    }

    public final long U1() {
        long jElapsedRealtime = this.t + (this.s == 3 && this.r && (this.u > 0L ? 1 : (this.u == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.u : 0L);
        long j = this.B <= 0 ? Long.MAX_VALUE : (this.B / 1000) - 1;
        return jElapsedRealtime > j ? j : jElapsedRealtime;
    }

    public final boolean V1(long j) {
        long j2 = this.E;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + T;
        while (j2 == this.E && !this.C && SystemClock.elapsedRealtime() < jElapsedRealtime) {
            try {
                f25 f25Var = this.j;
                g25 g25Var = this.k;
                f25Var.getClass();
                g25Var.getClass();
                if (h12.c((String) f25Var.h(f25.d(g25Var), "GetTransportInfo", gb.O(new kd3("InstanceID", "0"))).get("CurrentTransportState"), "PLAYING")) {
                    break;
                }
                SystemClock.sleep(200L);
            } catch (Exception unused) {
            }
        }
        return j2 == this.E && !this.C && W1(j);
    }

    public final boolean W1(long j) {
        this.z = SystemClock.elapsedRealtime();
        try {
            f25 f25Var = this.j;
            g25 g25Var = this.k;
            long j2 = j / 1000;
            if (j2 < 0) {
                j2 = 0;
            }
            f25Var.e(g25Var, String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 / 60) % 60), Long.valueOf(j2 % 60)}, 3)));
            return true;
        } catch (Exception e) {
            Log.d("UpnpPlayer", "renderer did not take the seek target, it keeps playing from where it is", e);
            return false;
        }
    }

    public final void X1() {
        p25 p25Var;
        String str;
        if (!this.r || (p25Var = (p25) q40.y0(this.p, this.q + 1)) == null || (str = p25Var.c) == null) {
            return;
        }
        try {
            this.j.g(this.k, str, R1(p25Var.b, str));
            this.w = str;
        } catch (Exception e) {
            this.w = null;
            Log.d("UpnpPlayer", "renderer did not take a next track, queue will gap", e);
        }
    }

    public final void Y1(long j) {
        this.t = j;
        this.u = SystemClock.elapsedRealtime();
    }

    public final void Z1() {
        this.M = false;
        c2();
        this.n.post(new o25(this, 2));
    }

    public final void a2(String str) {
        try {
            f25 f25Var = this.j;
            g25 g25Var = this.k;
            f25Var.getClass();
            g25Var.getClass();
            f25Var.h(f25.d(g25Var), "Stop", gb.O(new kd3("InstanceID", "0")));
        } catch (Exception e) {
            Log.d("UpnpPlayer", "renderer did not acknowledge the stop ".concat(str), e);
        }
        this.D = null;
    }

    public final void b2(long j, long j2, long j3) {
        if (j >= (this.B == -9223372036854775807L ? Long.MAX_VALUE : this.B / 1000)) {
            return;
        }
        if (j2 - this.z >= 2000 || Math.abs(j - U1()) < 2000) {
            if (this.s != 3 || !this.r) {
                Y1(j);
                return;
            }
            if (j3 - j2 > P) {
                return;
            }
            long jU1 = U1();
            if (Math.abs(j - jU1) < 2000) {
                Y1(jU1);
            } else {
                Y1(j);
                this.u = (j2 + j3) / 2;
            }
        }
    }

    public final void c2() {
        PowerManager.WakeLock wakeLock = this.o;
        if (wakeLock == null) {
            return;
        }
        boolean z = this.M && this.r && !this.C;
        if (z && !wakeLock.isHeld()) {
            wakeLock.acquire();
        } else {
            if (z || !wakeLock.isHeld()) {
                return;
            }
            wakeLock.release();
        }
    }

    @Override // defpackage.qe4
    public final pe4 f1(pe4 pe4Var) {
        pe4Var.getClass();
        if (pe4Var.d != 3 || !pe4Var.b || q() || this.J) {
            return pe4Var;
        }
        oe4 oe4VarA = pe4Var.a();
        oe4VarA.d = 2;
        return new pe4(oe4VarA);
    }

    @Override // defpackage.qe4
    public final pe4 i1() {
        ne4 xmVar;
        p25 p25VarJ1 = J1();
        Long lValueOf = p25VarJ1 != null ? Long.valueOf(p25VarJ1.a) : null;
        List<p25> list = this.p;
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        for (p25 p25Var : list) {
            ge4 ge4Var = new ge4(Long.valueOf(p25Var.a));
            ge4Var.c = p25Var.b;
            ge4Var.j = true;
            ge4Var.a((lValueOf != null && p25Var.a == lValueOf.longValue()) ? this.B : -9223372036854775807L);
            ge4Var.b = p25Var.d;
            arrayList.add(new he4(ge4Var));
        }
        if (this.s == 3 && this.r) {
            final long jU1 = U1();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = this.B <= 0 ? Long.MAX_VALUE : (this.B / 1000) - 1;
            xmVar = new ne4() { // from class: m25
                @Override // defpackage.ne4
                public final long get() {
                    return Math.min((SystemClock.elapsedRealtime() - jElapsedRealtime) + jU1, j);
                }
            };
        } else {
            xmVar = new xm(this.t);
        }
        oe4 oe4Var = new oe4();
        oe4Var.a = U;
        oe4Var.f = this.I;
        oe4Var.d = this.I != null ? 1 : (!arrayList.isEmpty() || this.s == 1) ? this.s : 4;
        oe4Var.b = this.r;
        oe4Var.c = 1;
        oe4Var.b(arrayList);
        oe4Var.B = gb.m(this.q, 0, Math.max(0, arrayList.size() - 1));
        oe4Var.E = null;
        oe4Var.F = xmVar;
        if (this.v) {
            this.v = false;
            long j2 = this.t;
            oe4Var.K = true;
            oe4Var.L = 0;
            oe4Var.M = j2;
        }
        return new pe4(oe4Var);
    }

    @Override // defpackage.qe4
    public final ic2 l1(List list, int i) {
        list.getClass();
        return K1(new kv3(i, list, this));
    }

    @Override // defpackage.qe4
    public final ic2 m1(final int i, final int i2, final int i3) {
        return K1(new if1() { // from class: h25
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                int i4 = i;
                int i5 = i2;
                ArrayList arrayList = new ArrayList(list.subList(i4, i5));
                list.subList(i4, i5).clear();
                list.addAll(gb.m(i3, 0, list.size()), arrayList);
                return j15.a;
            }
        });
    }

    @Override // defpackage.qe4
    public final ic2 n1() {
        if (this.I != null) {
            return Q1(this.t);
        }
        if (this.G.get() > 0) {
            return mw1.o;
        }
        if (this.D != null) {
            String str = this.D;
            p25 p25VarJ1 = J1();
            if (h12.c(str, p25VarJ1 != null ? p25VarJ1.c : null)) {
                return mw1.o;
            }
        }
        return Q1(this.t);
    }

    @Override // defpackage.qe4
    public final ic2 o1() {
        this.C = true;
        Z1();
        c2();
        ic2 ic2VarB = this.l.b(new l25(this, 3));
        ic2VarB.getClass();
        return ic2VarB;
    }

    @Override // defpackage.qe4
    public final ic2 p1(final int i, final int i2) {
        return K1(new if1() { // from class: j25
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                list.subList(i, i2).clear();
                return j15.a;
            }
        });
    }

    @Override // defpackage.qe4
    public final ic2 q1(final int i, final int i2, final List list) {
        list.getClass();
        return K1(new if1() { // from class: k25
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                long j;
                List list2 = (List) obj;
                list2.getClass();
                int i3 = i;
                int i4 = i2;
                ArrayList arrayList = new ArrayList(list2.subList(i3, i4));
                list2.subList(i3, i4).clear();
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(r40.k0(list3, 10));
                int i5 = 0;
                for (Object obj2 : list3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        gb.c0();
                        throw null;
                    }
                    gn2 gn2Var = (gn2) obj2;
                    p25 p25Var = (p25) q40.y0(arrayList, i5);
                    q25 q25Var = this;
                    if (p25Var != null) {
                        j = p25Var.a;
                    } else {
                        j = q25Var.N;
                        q25Var.N = 1 + j;
                    }
                    arrayList2.add(new p25(j, gn2Var, (String) q25Var.m.invoke(gn2Var)));
                    i5 = i6;
                }
                list2.addAll(i3, arrayList2);
                return j15.a;
            }
        });
    }

    @Override // defpackage.qe4
    public final ic2 r1(int i, int i2, long j) {
        if (i != -1 && (i < 0 || i >= this.p.size())) {
            Log.w("UpnpPlayer", "seek to index " + i + " is outside the queue, ignoring it");
            return mw1.o;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = j;
        boolean z = (i == -1 || i == this.q) ? false : true;
        if (i != -1) {
            this.q = i;
        }
        if (z || this.D == null) {
            Y1(j2);
            this.B = -9223372036854775807L;
            return Q1(j2);
        }
        long j3 = this.F;
        long j4 = this.E;
        long j5 = this.E;
        if (j3 == j4) {
            this.E = j5 + 1;
            j5 = this.E;
        }
        ic2 ic2VarB = this.l.b(new i25(this, j2, j5));
        ic2VarB.getClass();
        return ic2VarB;
    }

    @Override // defpackage.qe4
    public final ic2 s1(List list, int i, long j) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gn2 gn2Var = (gn2) it.next();
            long j2 = this.N;
            this.N = 1 + j2;
            arrayList.add(new p25(j2, gn2Var, (String) this.m.invoke(gn2Var)));
        }
        this.p = arrayList;
        if (i == -1) {
            i = 0;
        }
        this.q = i;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        Y1(j);
        this.B = -9223372036854775807L;
        return Q1(this.t);
    }

    @Override // defpackage.qe4
    public final ic2 t1(final boolean z) {
        ic2 ic2VarB = this.l.b(new Callable() { // from class: n25
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z2 = z;
                q25 q25Var = this;
                try {
                    if (z2) {
                        boolean z3 = q25Var.r;
                        q25Var.j.b(q25Var.k);
                        q25Var.r = true;
                        q25Var.c2();
                        if (!z3) {
                            q25Var.s = q25Var.J ? 3 : 2;
                            q25Var.J = false;
                            q25Var.K = 0;
                            Long l = q25Var.H;
                            if (l != null) {
                                long jLongValue = l.longValue();
                                q25Var.H = null;
                                q25Var.V1(jLongValue);
                            }
                            q25Var.u = SystemClock.elapsedRealtime();
                        }
                        q25Var.X1();
                        q25Var.n.post(new o25(q25Var, 1));
                    } else {
                        q25Var.T1();
                        q25Var.Y1(q25Var.U1());
                        q25Var.r = false;
                        q25Var.c2();
                    }
                } catch (Exception e) {
                    if (z2) {
                        q25Var.L1(q25Var.I1(q25Var.J1(), e));
                    } else {
                        Log.w("UpnpPlayer", "renderer did not acknowledge the pause", e);
                        q25Var.r = false;
                        q25Var.c2();
                        q25Var.s = 1;
                    }
                }
                q25Var.O1();
                return j15.a;
            }
        });
        ic2VarB.getClass();
        return ic2VarB;
    }

    @Override // defpackage.qe4
    public final ic2 y1() {
        ic2 ic2VarB = this.l.b(new l25(this, 2));
        ic2VarB.getClass();
        return ic2VarB;
    }
}
