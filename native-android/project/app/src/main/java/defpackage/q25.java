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
    public static final Set Q = null;
    public static final long R = 0;
    public static final long S = 0;
    public static final long T = 0;
    public static final mi3 U = null;
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
        Q = ti.t0(new String[]{"STOPPED", "NO_MEDIA_PRESENT"});
        R = 10000;
        S = 30000;
        T = 5000;
        SparseBooleanArray r0 = new SparseBooleanArray();
        int[] r1 = {1, 2, 3, 4, 5, 9, 8, 7, 6, 10, 31, 20, 17, 16, 18, 30, 32};
        int r2 = r1.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L6;
        int r6 = r1[r4];
        rr2.w(!false);
        r0.append(r6, true);
        r4 = r4 + 1;
        goto L4
    L6:
        rr2.w(!false);
        U = new mi3(new w71(r0));
    }

    public q25(f25 r4, g25 r5, Looper r6, Context r7) {
        mx2 r0 = wr1.M(Executors.newSingleThreadExecutor());
        o54 r1 = new o54(23);
        super(r6);
        this.j = r4;
        this.k = r5;
        this.l = r0;
        this.m = r1;
        this.n = new Handler(r6);
        Object r8 = r7.getSystemService("power");
        PowerManager.WakeLock r9 = null;
        if ((r8 instanceof PowerManager) == false) goto L5;
        PowerManager r10 = (PowerManager) r8;
    L7:
        if (r10 == null) goto L11;
        PowerManager.WakeLock r11 = r10.newWakeLock(1, "tempus:UpnpPlayer");
        if (r11 == null) goto L11;
        r11.setReferenceCounted(false);
        r9 = r11;
    L11:
        this.o = r9;
        this.p = u01.n;
        this.s = 1;
        this.B = -9223372036854775807L;
        this.G = new AtomicInteger();
        this.O = new wu4(2, this);
        return;
    L5:
        r10 = null;
        goto L7
    }

    public static String R1(gn2 r6, String r7) {
        do2 r8 = r6.d;
        r8.getClass();
        List r0 = f25.c;
        CharSequence r1 = r8.a;
        String r2 = null;
        if (r1 == null) goto L5;
        String r3 = r1.toString();
    L6:
        String r4 = "";
        if (r3 != null) goto L9;
        r3 = "";
    L9:
        CharSequence r5 = r8.b;
        if (r5 == null) goto L12;
        String r9 = r5.toString();
    L13:
        if (r9 != null) goto L15;
        r9 = "";
    L15:
        CharSequence r10 = r8.c;
        if (r10 == null) goto L18;
        r2 = r10.toString();
    L18:
        if (r2 == null) goto L21;
        r4 = r2;
    L21:
        r7.getClass();
        String r11 = ud3.h(r3);
        String r12 = ud3.h(r9);
        String r13 = ud3.h(r4);
        String r14 = ud3.h("*");
        String r15 = ud3.h(r7);
        StringBuilder r16 = b11.u("<DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\"><item id=\"1\" parentID=\"0\" restricted=\"1\"><dc:title>", r11, "</dc:title><upnp:artist>", r12, "</upnp:artist><upnp:album>");
        f34.n(r16, r13, "</upnp:album><upnp:class>object.item.audioItem.musicTrack</upnp:class><res protocolInfo=\"http-get:*:", r14, ":DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01700000000000000000000000000000\">");
        return b11.q(r16, r15, "</res></item></DIDL-Lite>");
    L12:
        r9 = null;
        goto L13
    L5:
        r3 = null;
        goto L6
    }

    public final PlaybackException G1(Exception r4) {
        return new PlaybackException(xa3.h("Lost contact with ", this.k.b, "."), r4, 1001);
    }

    public final PlaybackException H1(p25 r3, Exception r4) {
        String r5 = r3.c;
        if (r5 == null) goto L8;
        Uri r6 = Uri.parse(r5);
        if (r6 == null) goto L8;
        String r7 = r6.getHost();
        if (r7 == null) goto L8;
    L10:
        return new PlaybackException(this.k.b + " could not play the track from " + r7 + ". A renderer fetches the stream from the music server itself, so the server address has to be one the renderer can reach, not a VPN or loopback address only this phone can use.", r4, 2005);
    L8:
        r7 = "the music server";
        goto L10
    }

    public final PlaybackException I1(p25 r4, Exception r5) {
        if ((r5 instanceof UpnpException) == false) goto L12;
        UpnpException r0 = (UpnpException) r5;
        int r1 = r0.n;
        if (r1 != 716) goto L10;
        if (r4 == null) goto L10;
        return H1(r4, r5);
    L10:
        return new PlaybackException(this.k.b + " refused the track (UPnP error " + r1 + ").", r0, 1001);
    L12:
        return G1(r5);
    }

    public final p25 J1() {
        return (p25) q40.y0(this.p, this.q);
    }

    public final ic2 K1(if1 r13) {
        p25 r0 = J1();
        String r1 = null;
        if (r0 == null) goto L5;
        Long r2 = Long.valueOf(r0.a);
    L6:
        p25 r3 = (p25) q40.y0(this.p, this.q + 1);
        if (r3 == null) goto L9;
        String r4 = r3.c;
    L10:
        ArrayList r5 = q40.R0(this.p);
        r13.invoke(r5);
        this.p = r5;
        int r14 = r5.size();
        int r6 = 0;
        int r7 = 0;
    L11:
        if (r7 >= r14) goto L19;
        Object r8 = r5.get(r7);
        r7 = r7 + 1;
        long r9 = ((p25) r8).a;
        if (r2 == null) goto L18;
        if (r9 != r2.longValue()) goto L18;
    L20:
        if (r2 == null) goto L23;
        if (r6 >= 0) goto L23;
        boolean r15 = true;
    L24:
        if (r6 >= 0) goto L27;
        r6 = gb.m(this.q, 0, Math.max(0, r5.size() - 1));
    L27:
        this.q = r6;
        O1();
        if (r5.isEmpty() == false) goto L31;
        ic2 r12 = this.l.b(new l25(this, 0));
        r12.getClass();
        return r12;
    L31:
        if (r15 == false) goto L34;
        Y1(0);
        this.B = -9223372036854775807L;
        return Q1(0);
    L34:
        p25 r16 = (p25) q40.y0(r5, this.q + 1);
        if (r16 == null) goto L38;
        r1 = r16.c;
    L38:
        if (h12.c(r1, r4) == true) goto L42;
        ic2 r17 = this.l.b(new l25(this, 1));
        r17.getClass();
        return r17;
    L42:
        return mw1.o;
    L23:
        r15 = false;
    L18:
        r6 = r6 + 1;
        goto L11
    L19:
        r6 = -1;
        goto L20
    L9:
        r4 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public final void L1(PlaybackException r2) {
        this.I = r2;
        this.r = false;
        c2();
        Z1();
        a2("after a refusal");
        O1();
        Log.w("UpnpPlayer", "playback on the renderer stopped", r2);
    }

    public final void M1(boolean r4) {
        if (r4 != this.r) goto L6;
        this.y = 0;
        return;
    L6:
        this.y++;
        if (this.y < 2) goto L22;
        this.y = 0;
        if (r4 == true) goto L12;
        Y1(U1());
    L12:
        this.r = r4;
        c2();
        if (r4 == true) goto L15;
        return;
    L15:
        Long r5 = this.H;
        if (r5 == null) goto L20;
        long r0 = r5.longValue();
        this.H = null;
        if (W1(r0) == false) goto L20;
        Y1(r0);
        this.A = r0;
    L20:
        X1();
        return;
    }

    public final boolean N1(long r9, long r11, String r13) {
        if (r13 != null) goto L5;
    L53:
        return false;
    L5:
        if (qm4.u0(r13) == true) goto L53;
        p25 r1 = J1();
        if (r1 == null) goto L10;
        String r2 = r1.c;
    L12:
        if (r13.equals(r2) == true) goto L53;
        int r3 = this.q + 1;
        p25 r4 = (p25) q40.y0(this.p, r3);
        if (r4 == null) goto L17;
        String r5 = r4.c;
    L19:
        if (h12.c(r5, r13) == true) goto L34;
        Iterator r6 = this.p.iterator();
        int r7 = 0;
    L23:
        if (r6.hasNext() == false) goto L32;
        p25 r8 = (p25) r6.next();
        if (r8 == null) goto L27;
        String r10 = r8.c;
    L29:
        if (h12.c(r10, r13) == true) goto L30;
        r7 = r7 + 1;
        goto L23
    L30:
        r3 = r7;
        goto L34
    L27:
        r10 = null;
        goto L29
    L32:
        r3 = -1;
    L34:
        if (r3 < 0) goto L49;
        if (r11 > 0) goto L38;
    L45:
        boolean r12 = false;
    L46:
        this.v = r12;
        this.q = r3;
        this.B = -9223372036854775807L;
        this.J = false;
        this.K = 0;
        this.x = 0;
        this.A = 0;
        Y1(0);
        O1();
        X1();
        return true;
    L38:
        if (r9 >= (r11 - 2000)) goto L44;
        WeakReference r14 = bo2.a;
        if (r11 <= 30000) goto L45;
        if (r9 < Math.min(r11 / 2, 240000)) goto L45;
    L44:
        r12 = true;
        goto L46
    L49:
        if (this.r == false) goto L53;
        Log.w("UpnpPlayer", "renderer is on a track that is not in the queue, loading ours again");
        P1(0);
        return true;
    L17:
        r5 = null;
        goto L19
    L10:
        r2 = null;
        goto L12
    }

    public final void O1() {
        o25 r0 = new o25(this, 3);
        this.n.post(r0);
    }

    public final void P1(long r11) {
        p25 r0 = J1();
        if (r0 != null) goto L5;
        return;
    L5:
        String r1 = r0.c;
        if (r1 != null) goto L9;
        Log.w("UpnpPlayer", "queue item has no uri, nothing to hand the renderer");
        return;
    L9:
        this.I = null;
        this.H = null;
        int r3 = 0;
        this.x = 0;
        this.w = null;
        this.J = false;
        this.K = 0;
        this.A = 0;
        this.s = 2;
        O1();
        boolean r6 = r1.equals(this.D);
        if (r6 == true) goto L12;
        this.j.f(this.k, r1, R1(r0.b, r1));     // Catch: Exception -> L20
        this.D = r1;     // Catch: Exception -> L20
    L17:
        if (this.r == false) goto L22;
        this.j.b(this.k);     // Catch: Exception -> L20
    L22:
        if (r6 == false) goto L24;
    L29:
        this.u = SystemClock.elapsedRealtime();
        X1();
        if (this.r == true) goto L32;
        this.s = 3;
    L32:
        this.n.post(new o25(this, r3));
        O1();
        return;
    L24:
        if (r11 <= 0) goto L29;
        if (this.r == false) goto L28;
        this.H = null;
        V1(r11);
        goto L29
    L28:
        this.H = Long.valueOf(r11);
        goto L29
    L12:
        if (this.r == false) goto L14;
        this.H = null;     // Catch: Exception -> L20
        W1(r11);     // Catch: Exception -> L20
        goto L17
    L14:
        this.H = Long.valueOf(r11);     // Catch: Exception -> L20
    L20:
        e = move-exception;
        L1(I1(r0, e));
    }

    public final ic2 Q1(long r9) {
        this.E++;
        long r3 = this.E;
        this.G.incrementAndGet();
        ic2 r8 = this.l.b(new i25(r3, this, r9));
        r8.getClass();
        return r8;
    }

    public final void S1(long r8, long r10, long r12, long r14) {
        int r2 = 1;
        if (this.r == true) goto L6;
        this.D = null;
        this.s = 1;
        return;
    L6:
        p25 r0 = J1();
        if (r0 != null) goto L9;
    L14:
        this.D = null;
        if (r12 > 0) goto L17;
    L20:
        p25 r13 = (p25) q40.y0(this.p, this.q + 1);
        if (r13 != null) goto L23;
    L28:
        this.x = 0;
        if (r10 > 0) goto L31;
    L38:
        boolean r9 = false;
    L40:
        if ((this.q + 1) >= this.p.size()) goto L43;
        this.v = r9;
        this.q++;
        Y1(0);
        this.B = -9223372036854775807L;
        this.J = false;
        this.K = 0;
        this.A = 0;
        P1(0);
        return;
    L43:
        this.r = false;
        c2();
        if (r9 == false) goto L46;
        r2 = 4;
    L46:
        this.s = r2;
        Z1();
        return;
    L31:
        if (r8 >= (r10 - 2000)) goto L37;
        WeakReference r15 = bo2.a;
        if (r10 <= 30000) goto L38;
        if (r8 < Math.min(r10 / 2, 240000)) goto L38;
    L37:
        r9 = true;
        goto L40
    L23:
        if (h12.c(this.w, r13.c) == false) goto L28;
        if (this.x >= 3) goto L28;
        this.x++;
        return;
    L17:
        if (r8 >= (r12 - R)) goto L20;
        Y1(r14);
        this.r = false;
        c2();
        this.s = 1;
        Z1();
        return;
    L9:
        if (this.J == true) goto L14;
        this.K++;
        if (this.K <= 5) goto L48;
        L1(H1(r0, null));
        return;
    }

    public final void T1() {
        f25 r2 = this.j;
        r2.getClass();
        Set r3 = z01.n;
        g25 r11 = this.k;
        r11.getClass();
        String r5 = (String) r2.h(f25.d(r11), "GetCurrentTransportActions", gb.O(new kd3("InstanceID", "0"))).get("Actions");     // Catch: UpnpException -> L41
        if (r5 == null) goto L16;
        int r7 = 0;
        List r6 = qm4.D0(r5, new char[]{','});     // Catch: UpnpException -> L41
        ArrayList r8 = new ArrayList(r40.k0(r6, 10));     // Catch: UpnpException -> L41
        Iterator r9 = r6.iterator();     // Catch: UpnpException -> L41
    L7:
        if (r9.hasNext() == false) goto L9;
        r8.add(qm4.K0((String) r9.next()).toString());     // Catch: UpnpException -> L41
        goto L7
    L9:
        ArrayList r10 = new ArrayList();     // Catch: UpnpException -> L41
        int r12 = r8.size();     // Catch: UpnpException -> L41
    L10:
        if (r7 >= r12) goto L14;
        Object r13 = r8.get(r7);     // Catch: UpnpException -> L41
        r7 = r7 + 1;     // Catch: UpnpException -> L41
        if (((String) r13).length() <= 0) goto L10;
        r10.add(r13);     // Catch: UpnpException -> L41
        goto L10
    L14:
        Set r14 = q40.T0(r10);     // Catch: UpnpException -> L41
    L17:
        if (r14 == null) goto L21;
        r3 = r14;
        goto L21
    L16:
        r14 = null;
    L21:
        if (r3.isEmpty() == true) goto L42;
        Set r4 = r3;
        if ((r4 instanceof Collection) == true) goto L25;
    L27:
        Iterator r15 = r4.iterator();
    L29:
        if (r15.hasNext() == false) goto L38;
        if (xm4.f0((String) r15.next(), "Pause", true) == false) goto L29;
    L38:
        r2.h(f25.d(r11), "Stop", gb.O(new kd3("InstanceID", "0")));
        return;
    L25:
        if (r4.isEmpty() == false) goto L27;
    L42:
        r2.h(f25.d(r11), "Pause", gb.O(new kd3("InstanceID", "0")));     // Catch: UpnpException -> L34
        return;
    L34:
        e = move-exception;
        if (e.n != 701) goto L40;
        Log.d("UpnpPlayer", "renderer refused a pause, stopping instead");
        goto L38
    L40:
        throw e;
    }

    public final long U1() {
        if (this.s == 3) goto L5;
    L9:
        boolean r0 = false;
    L10:
        long r4 = this.t;
        if (r0 == false) goto L13;
        long r1 = SystemClock.elapsedRealtime() - this.u;
    L14:
        long r5 = r4 + r1;
        if (this.B > 0) goto L17;
        long r2 = Long.MAX_VALUE;
    L19:
        if (r5 <= r2) goto L21;
        return r2;
    L21:
        return r5;
    L17:
        r2 = (this.B / 1000) - 1;
        goto L19
    L13:
        r1 = 0;
        goto L14
    L5:
        if (this.r == false) goto L9;
        if (this.u == 0) goto L9;
        r0 = true;
        goto L10
    }

    public final boolean V1(long r11) {
        long r0 = this.E;
        long r2 = SystemClock.elapsedRealtime() + T;
    L4:
        if (r0 != this.E) goto L14;
        if (this.C == true) goto L14;
        if (SystemClock.elapsedRealtime() >= r2) goto L14;
        f25 r4 = this.j;     // Catch: Exception -> L22
        g25 r5 = this.k;     // Catch: Exception -> L22
        r4.getClass();     // Catch: Exception -> L22
        r5.getClass();     // Catch: Exception -> L22
        if (h12.c((String) r4.h(f25.d(r5), "GetTransportInfo", gb.O(new kd3("InstanceID", "0"))).get("CurrentTransportState"), "PLAYING") == true) goto L14;
        SystemClock.sleep(200);
    L14:
        if (r0 == this.E) goto L16;
    L20:
        return false;
    L16:
        if (this.C == true) goto L20;
        if (W1(r11) == false) goto L20;
        return true;
    }

    public final boolean W1(long r8) {
        this.z = SystemClock.elapsedRealtime();
        f25 r0 = this.j;     // Catch: Exception -> L9
        g25 r7 = this.k;     // Catch: Exception -> L9
        long r9 = r8 / 1000;     // Catch: Exception -> L9
        if (r9 >= 0) goto L6;
        r9 = 0;
    L6:
        r0.e(r7, String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(r9 / 3600), Long.valueOf((r9 / 60) % 60), Long.valueOf(r9 % 60)}, 3)));     // Catch: Exception -> L9
        return true;
    L9:
        e = move-exception;
        Log.d("UpnpPlayer", "renderer did not take the seek target, it keeps playing from where it is", e);
        return false;
    }

    public final void X1() {
        if (this.r == false) goto L18;
        p25 r0 = (p25) q40.y0(this.p, this.q + 1);
        if (r0 == null) goto L19;
        String r1 = r0.c;
        if (r1 != null) goto L16;
        return;
    L16:
        this.j.g(this.k, r1, R1(r0.b, r1));     // Catch: Exception -> L13
        this.w = r1;     // Catch: Exception -> L13
        return;
    L13:
        e = move-exception;
        this.w = null;
        Log.d("UpnpPlayer", "renderer did not take a next track, queue will gap", e);
        return;
    L19:
        return;
    }

    public final void Y1(long r1) {
        this.t = r1;
        this.u = SystemClock.elapsedRealtime();
    }

    public final void Z1() {
        this.M = false;
        c2();
        this.n.post(new o25(this, 2));
    }

    public final void a2(String r7) {
        f25 r0 = this.j;     // Catch: Exception -> L4
        g25 r1 = this.k;     // Catch: Exception -> L4
        r0.getClass();     // Catch: Exception -> L4
        r1.getClass();     // Catch: Exception -> L4
        r0.h(f25.d(r1), "Stop", gb.O(new kd3("InstanceID", "0")));     // Catch: Exception -> L4
    L6:
        this.D = null;
        return;
    L4:
        e = move-exception;
        Log.d("UpnpPlayer", "renderer did not acknowledge the stop ".concat(r7), e);
        goto L6
    }

    public final void b2(long r7, long r9, long r11) {
        if (this.B != (-9223372036854775807L)) goto L5;
        long r0 = Long.MAX_VALUE;
    L7:
        if (r7 < r0) goto L10;
        return;
    L10:
        if ((r9 - this.z) >= 2000) goto L15;
        if (Math.abs(r7 - U1()) < 2000) goto L15;
        return;
    L15:
        if (this.s == 3) goto L17;
    L28:
        Y1(r7);
        return;
    L17:
        if (this.r == false) goto L28;
        if ((r11 - r9) <= P) goto L22;
        return;
    L22:
        long r1 = U1();
        if (Math.abs(r7 - r1) >= 2000) goto L26;
        Y1(r1);
        return;
    L26:
        Y1(r7);
        this.u = (r9 + r11) / 2;
        return;
    L5:
        r0 = this.B / 1000;
        goto L7
    }

    public final void c2() {
        PowerManager.WakeLock r0 = this.o;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.M == true) goto L8;
    L12:
        boolean r2 = false;
    L13:
        if (r2 == true) goto L15;
    L18:
        if (r2 == false) goto L20;
        return;
    L20:
        if (r0.isHeld() == false) goto L24;
        r0.release();
        return;
    L24:
        return;
    L15:
        if (r0.isHeld() == true) goto L18;
        r0.acquire();
        return;
    L8:
        if (this.r == false) goto L12;
        if (this.C == true) goto L12;
        r2 = true;
        goto L13
    }

    @Override // defpackage.qe4
    public final pe4 f1(pe4 r3) {
        r3.getClass();
        if (r3.d == 3) goto L5;
        return r3;
    L5:
        if (r3.b == true) goto L7;
        return r3;
    L7:
        if (q() == false) goto L9;
        return r3;
    L9:
        if (this.J == true) goto L16;
        oe4 r2 = r3.a();
        r2.d = 2;
        return new pe4(r2);
    L16:
        return r3;
    }

    @Override // defpackage.qe4
    public final pe4 i1() {
        p25 r0 = J1();
        if (r0 == null) goto L5;
        Long r1 = Long.valueOf(r0.a);
    L6:
        List r2 = this.p;
        ArrayList r3 = new ArrayList(r40.k0(r2, 10));
        Iterator r4 = r2.iterator();
    L8:
        if (r4.hasNext() == false) goto L18;
        p25 r5 = (p25) r4.next();
        ge4 r6 = new ge4(Long.valueOf(r5.a));
        r6.c = r5.b;
        r6.j = true;
        long r7 = r5.a;
        if (r1 != null) goto L13;
    L15:
        long r8 = -9223372036854775807L;
    L16:
        r6.a(r8);
        r6.b = r5.d;
        r3.add(new he4(r6));
        goto L8
    L13:
        if (r7 != r1.longValue()) goto L15;
        r8 = this.B;
        goto L16
    L18:
        if (this.s == 3) goto L20;
    L26:
        ne4 r9 = new xm(this.t);
    L27:
        oe4 r10 = new oe4();
        r10.a = U;
        r10.f = this.I;
        if (this.I == null) goto L31;
        int r11 = 1;
    L36:
        r10.d = r11;
        r10.b = this.r;
        r10.c = 1;
        r10.b(r3);
        r10.B = gb.m(this.q, 0, Math.max(0, r3.size() - 1));
        r10.E = null;
        r10.F = r9;
        if (this.v == false) goto L40;
        this.v = false;
        long r12 = this.t;
        r10.K = true;
        r10.L = 0;
        r10.M = r12;
    L40:
        return new pe4(r10);
    L31:
        if (r3.isEmpty() == true) goto L33;
    L35:
        r11 = this.s;
        goto L36
    L33:
        if (this.s == 1) goto L35;
        r11 = 4;
        goto L36
    L20:
        if (this.r == false) goto L26;
        final long r13 = U1();
        final long r14 = SystemClock.elapsedRealtime();
        if (this.B > 0) goto L24;
        final long r15 = Long.MAX_VALUE;
    L25:
        r9 = new m25(r13, r14, r15);
        goto L27
    L24:
        r15 = (this.B / 1000) - 1;
        goto L25
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.qe4
    public final ic2 l1(List r2, int r3) {
        r2.getClass();
        return K1(new kv3(r3, r2, this));
    }

    @Override // defpackage.qe4
    public final ic2 m1(final int r2, final int r3, final int r4) {
        return K1(new h25(r2, r3, r4));
    }

    @Override // defpackage.qe4
    public final ic2 n1() {
        if (this.I == null) goto L7;
        return Q1(this.t);
    L7:
        if (this.G.get() <= 0) goto L11;
        return mw1.o;
    L11:
        if (this.D == null) goto L21;
        String r0 = this.D;
        p25 r1 = J1();
        if (r1 == null) goto L15;
        String r2 = r1.c;
    L17:
        if (h12.c(r0, r2) == false) goto L21;
        return mw1.o;
    L15:
        r2 = null;
    L21:
        return Q1(this.t);
    }

    @Override // defpackage.qe4
    public final ic2 o1() {
        this.C = true;
        Z1();
        c2();
        ic2 r3 = this.l.b(new l25(this, 3));
        r3.getClass();
        return r3;
    }

    @Override // defpackage.qe4
    public final ic2 p1(final int r2, final int r3) {
        return K1(new j25(r2, r3));
    }

    @Override // defpackage.qe4
    public final ic2 q1(final int r2, final int r3, final List r4) {
        r4.getClass();
        return K1(new k25(r2, r3, r4, this));
    }

    @Override // defpackage.qe4
    public final ic2 r1(int r9, int r10, long r11) {
        if (r9 == (-1)) goto L11;
        if (r9 >= 0) goto L6;
    L8:
        Log.w("UpnpPlayer", "seek to index " + r9 + " is outside the queue, ignoring it");
        return mw1.o;
    L6:
        if (r9 >= this.p.size()) goto L8;
    L11:
        if (r11 != (-9223372036854775807L)) goto L13;
        r11 = 0;
    L13:
        long r4 = r11;
        if (r9 != (-1)) goto L16;
    L18:
        boolean r12 = false;
    L19:
        if (r9 == (-1)) goto L21;
        this.q = r9;
    L21:
        if (r12 == true) goto L30;
        if (this.D == null) goto L30;
        long r13 = this.F;
        long r14 = this.E;
        long r15 = this.E;
        if (r13 != r14) goto L28;
        this.E = r15 + 1;
        r15 = this.E;
    L28:
        ic2 r8 = this.l.b(new i25(this, r4, r15));
        r8.getClass();
        return r8;
    L30:
        Y1(r4);
        this.B = -9223372036854775807L;
        return Q1(r4);
    L16:
        if (r9 == this.q) goto L18;
        r12 = true;
        goto L19
    }

    @Override // defpackage.qe4
    public final ic2 s1(List r8, int r9, long r10) {
        r8.getClass();
        ArrayList r0 = new ArrayList(r40.k0(r8, 10));
        Iterator r11 = r8.iterator();
    L4:
        if (r11.hasNext() == false) goto L6;
        gn2 r1 = (gn2) r11.next();
        long r3 = this.N;
        this.N = 1 + r3;
        r0.add(new p25(r3, r1, (String) this.m.invoke(r1)));
        goto L4
    L6:
        this.p = r0;
        if (r9 != (-1)) goto L9;
        r9 = 0;
    L9:
        this.q = r9;
        if (r10 != (-9223372036854775807L)) goto L12;
        r10 = 0;
    L12:
        Y1(r10);
        this.B = -9223372036854775807L;
        return Q1(this.t);
    }

    @Override // defpackage.qe4
    public final ic2 t1(final boolean r2) {
        Callable r0 = new n25(r2, this);
        ic2 r1 = this.l.b(r0);
        r1.getClass();
        return r1;
    }

    @Override // defpackage.qe4
    public final ic2 y1() {
        l25 r0 = new l25(this, 2);
        ic2 r2 = this.l.b(r0);
        r2.getClass();
        return r2;
    }
}
