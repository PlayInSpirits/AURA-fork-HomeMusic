package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements pw0 {
    public final List a;
    public final m31 b;
    public final qr2 c;
    public final d34 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final ie0 h;
    public final i80 i;
    public final ik3 j;
    public final ll k;
    public final UUID l;
    public final Looper m;
    public final zk n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public gk0 s;
    public se1 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public k31 x;
    public si1 y;
    public l31 z;

    public ik0(UUID r1, m31 r2, qr2 r3, d34 r4, List r5, boolean r6, boolean r7, byte[] r8, HashMap r9, ll r10, Looper r11, i80 r12, ik3 r13) {
        this.l = r1;
        this.c = r3;
        this.d = r4;
        this.b = r2;
        this.e = r6;
        this.f = r7;
        if (r8 == null) goto L5;
        this.w = r8;
        this.a = null;
    L6:
        this.g = r9;
        this.k = r10;
        this.h = new ie0();
        this.i = r12;
        this.j = r13;
        this.p = 2;
        this.m = r11;
        this.n = new zk(this, r11, 1);
        this.o = new Object();
        return;
    L5:
        r5.getClass();
        this.a = Collections.unmodifiableList(r5);
        goto L6
    }

    @Override // defpackage.pw0
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // defpackage.pw0
    public final boolean c() {
        o();
        return this.e;
    }

    @Override // defpackage.pw0
    public final void d(sw0 r13) {
        o();
        int r0 = this.q;
        if (r0 > 0) goto L6;
        l93.F("DefaultDrmSession", "release() called on a session that's already fully released.");
        return;
    L6:
        int r1 = r0 - 1;
        this.q = r1;
        if (r1 != 0) goto L27;
        this.p = 0;
        zk r2 = this.n;
        String r3 = f35.a;
        r2.removeCallbacksAndMessages(null);
        gk0 r4 = this.s;
        monitor-enter(r4);
        r4.removeCallbacksAndMessages(null);     // Catch: Throwable -> L23
        r4.b = true;     // Catch: Throwable -> L23
        monitor-exit(r4);
        this.s = null;
        this.r.quit();
        this.r = null;
        this.t = null;
        this.u = null;
        this.x = null;
        Object r5 = this.o;
        monitor-enter(r5);
        this.y = null;     // Catch: Throwable -> L19
        monitor-exit(r5);     // Catch: Throwable -> L19
        this.z = null;
        byte[] r6 = this.v;
        if (r6 == null) goto L27;
        this.b.B(r6);
        this.v = null;
    L19:
        th = move-exception;
        throw th;
    L23:
        th = move-exception;
        throw th;
    L27:
        if (r13 == null) goto L47;
        ie0 r7 = this.h;
        Object r8 = r7.n;
        monitor-enter(r8);
        Integer r9 = (Integer) r7.o.get(r13);     // Catch: Throwable -> L34
        if (r9 != null) goto L36;
        monitor-exit(r8);     // Catch: Throwable -> L34
    L43:
        if (this.h.a(r13) != 0) goto L47;
        r13.e();
        goto L47
    L36:
        ArrayList r10 = new ArrayList(r7.q);     // Catch: Throwable -> L34
        r10.remove(r13);     // Catch: Throwable -> L34
        r7.q = Collections.unmodifiableList(r10);     // Catch: Throwable -> L34
        int r11 = r9.intValue();     // Catch: Throwable -> L34
        HashMap r12 = r7.o;
        if (r11 != 1) goto L40;
        r12.remove(r13);     // Catch: Throwable -> L34
        HashSet r14 = new HashSet(r7.p);     // Catch: Throwable -> L34
        r14.remove(r13);     // Catch: Throwable -> L34
        r7.p = Collections.unmodifiableSet(r14);     // Catch: Throwable -> L34
    L41:
        monitor-exit(r8);     // Catch: Throwable -> L34
        goto L43
    L40:
        r12.put(r13, Integer.valueOf(r9.intValue() - 1));     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;
    L47:
        d34 r15 = this.d;
        int r16 = this.q;
        kk0 r17 = (kk0) r15.o;
        if (r16 == 1) goto L50;
    L54:
        if (r16 != 0) goto L69;
        r17.m.remove(this);
        if (r17.r != this) goto L59;
        r17.r = null;
    L59:
        if (r17.s != this) goto L61;
        r17.s = null;
    L61:
        qr2 r18 = r17.i;
        HashSet r19 = (HashSet) r18.o;
        r19.remove(this);
        if (((ik0) r18.p) != this) goto L67;
        r18.p = null;
        if (r19.isEmpty() == true) goto L67;
        ik0 r20 = (ik0) r19.iterator().next();
        r18.p = r20;
        l31 r110 = r20.b.p();
        r20.z = r110;
        gk0 r21 = r20.s;
        String r22 = f35.a;
        r110.getClass();
        r21.getClass();
        r21.obtainMessage(1, new hk0(ed2.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), r110)).sendToTarget();
    L67:
        if (r17.l == (-9223372036854775807L)) goto L69;
        Handler r23 = r17.u;
        r23.getClass();
        r23.removeCallbacksAndMessages(this);
        r17.o.remove(this);
    L69:
        r17.l();
        return;
    L50:
        if (r17.p <= 0) goto L54;
        if (r17.l == (-9223372036854775807L)) goto L54;
        r17.o.add(this);
        Handler r24 = r17.u;
        r24.getClass();
        r24.postAtTime(new a0(19, this), this, SystemClock.uptimeMillis() + r17.l);
        goto L69
    }

    @Override // defpackage.pw0
    public final void e(sw0 r8) {
        o();
        boolean r1 = false;
        if (this.q >= 0) goto L6;
        l93.F("DefaultDrmSession", "Session reference count less than zero: " + this.q);
        this.q = 0;
    L6:
        if (r8 == null) goto L23;
        ie0 r2 = this.h;
        Object r3 = r2.n;
        monitor-enter(r3);
        ArrayList r4 = new ArrayList(r2.q);     // Catch: Throwable -> L12
        r4.add(r8);     // Catch: Throwable -> L12
        r2.q = Collections.unmodifiableList(r4);     // Catch: Throwable -> L12
        Integer r5 = (Integer) r2.o.get(r8);     // Catch: Throwable -> L12
        if (r5 != null) goto L14;
        HashSet r6 = new HashSet(r2.p);     // Catch: Throwable -> L12
        r6.add(r8);     // Catch: Throwable -> L12
        r2.p = Collections.unmodifiableSet(r6);     // Catch: Throwable -> L12
    L14:
        HashMap r7 = r2.o;     // Catch: Throwable -> L12
        if (r5 == null) goto L17;
        int r9 = r5.intValue() + 1;     // Catch: Throwable -> L12
    L18:
        r7.put(r8, Integer.valueOf(r9));     // Catch: Throwable -> L12
        monitor-exit(r3);     // Catch: Throwable -> L12
        goto L23
    L17:
        r9 = 1;
    L12:
        th = move-exception;
        throw th;
    L23:
        int r10 = this.q + 1;
        this.q = r10;
        if (r10 == 1) goto L26;
        if (r8 != null) goto L33;
    L37:
        kk0 r11 = (kk0) this.d.o;
        if (r11.l == (-9223372036854775807L)) goto L43;
        r11.o.remove(this);
        Handler r12 = r11.u;
        r12.getClass();
        r12.removeCallbacksAndMessages(this);
        return;
    L43:
        return;
    L33:
        if (j() == false) goto L37;
        if (this.h.a(r8) != 1) goto L37;
        r8.c(this.p);
        goto L37
    L26:
        if (this.p != 2) goto L28;
        r1 = true;
    L28:
        rr2.w(r1);
        HandlerThread r13 = new HandlerThread("ExoPlayer:DrmRequestHandler");
        this.r = r13;
        r13.start();
        this.s = new gk0(this, this.r.getLooper());
        if (m() == false) goto L37;
        i(true);
        goto L37
    }

    @Override // defpackage.pw0
    public final boolean f(String r2) {
        o();
        byte[] r0 = this.v;
        r0.getClass();
        return this.b.U(r2, r0);
    }

    @Override // defpackage.pw0
    public final DrmSession$DrmSessionException g() {
        o();
        if (this.p == 1) goto L5;
        return null;
    L5:
        return this.u;
    }

    @Override // defpackage.pw0
    public final int getState() {
        o();
        return this.p;
    }

    @Override // defpackage.pw0
    public final se1 h() {
        o();
        return this.t;
    }

    public final void i(boolean r10) {
        if (this.f == true) goto L70;
        byte[] r0 = this.v;
        String r1 = f35.a;
        boolean r2 = true;
        if (this.w != null) goto L10;
        n(1, r10, r0);
        return;
    L10:
        if (this.p == 4) goto L19;
        this.b.A(this.v, this.w);     // Catch: Throwable -> L13 Exception -> L15
    L17:
        if (r2 == true) goto L19;
        return;
    L13:
        e = move-exception;
        k(e, 1);
        r2 = false;
    L19:
        if (ax.d.equals(this.l) == true) goto L21;
        long r3 = Long.MAX_VALUE;
    L40:
        if (r3 > 60) goto L44;
        l93.A("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + r3);
        n(2, r10, r0);
        return;
    L44:
        if (r3 > 0) goto L47;
        k(new KeysExpiredException(), 2);
        return;
    L47:
        this.p = 4;
        ie0 r9 = this.h;
        Object r11 = r9.n;
        monitor-enter(r11);
        Set r12 = r9.p;     // Catch: Throwable -> L56
        monitor-exit(r11);     // Catch: Throwable -> L56
        Iterator r13 = r12.iterator();
    L53:
        if (r13.hasNext() == false) goto L71;
        ((sw0) r13.next()).b();
        goto L53
    L71:
        return;
    L56:
        th = move-exception;
        throw th;
    L21:
        o();
        byte[] r4 = this.v;
        Pair r5 = null;
        if (r4 != null) goto L24;
        Map r6 = null;
    L25:
        if (r6 == null) goto L38;
        long r7 = -9223372036854775807L;
        String r8 = (String) r6.get("LicenseDurationRemaining");     // Catch: NumberFormatException -> L60
        if (r8 == null) goto L32;
        long r14 = Long.parseLong(r8);     // Catch: NumberFormatException -> L60
    L33:
        Long r15 = Long.valueOf(r14);
        String r16 = (String) r6.get("PlaybackDurationRemaining");     // Catch: NumberFormatException -> L59
        if (r16 == null) goto L37;
        r7 = Long.parseLong(r16);     // Catch: NumberFormatException -> L59
    L37:
        r5 = new Pair(r15, Long.valueOf(r7));
    L32:
        r14 = -9223372036854775807L;
    L38:
        r5.getClass();
        r3 = Math.min(((Long) r5.first).longValue(), ((Long) r5.second).longValue());
        goto L40
    L24:
        r6 = this.b.e(r4);
        goto L25
    }

    public final boolean j() {
        int r1 = this.p;
        if (r1 != 3) goto L5;
        return true;
    L5:
        if (r1 == 4) goto L11;
        return false;
    L11:
        return true;
    }

    public final void k(Throwable r6, int r7) {
        if ((r6 instanceof MediaDrm.MediaDrmStateException) == false) goto L6;
        int r8 = f35.y(f35.z(((MediaDrm.MediaDrmStateException) r6).getDiagnosticInfo()));
    L35:
        this.u = new DrmSession$DrmSessionException(r6, r8);
        l93.G("DefaultDrmSession", "DRM session error", r6);
        if ((r6 instanceof Exception) == false) goto L49;
        ie0 r9 = this.h;
        Object r0 = r9.n;
        monitor-enter(r0);
        Set r10 = r9.p;     // Catch: Throwable -> L45
        monitor-exit(r0);     // Catch: Throwable -> L45
        Iterator r11 = r10.iterator();
    L43:
        if (r11.hasNext() == false) goto L58;
        ((sw0) r11.next()).d((Exception) r6);
    L58:
        if (this.p == 4) goto L66;
        this.p = 1;
        return;
    L66:
        return;
    L45:
        th = move-exception;
        throw th;
    L49:
        if ((r6 instanceof Error) == true) goto L51;
        mj0.j("Unexpected Throwable subclass", r6);
        return;
    L51:
        if (gb.N(r6) == true) goto L58;
        if (gb.M(r6) == true) goto L58;
        throw ((Error) r6);
    L6:
        if ((r6 instanceof MediaDrmResetException) == false) goto L9;
    L7:
        r8 = 6006;
        goto L35
    L9:
        if ((r6 instanceof NotProvisionedException) == false) goto L11;
    L32:
        r8 = 6002;
        goto L35
    L11:
        if (gb.M(r6) == true) goto L32;
        if ((r6 instanceof DeniedByServerException) == false) goto L17;
        r8 = 6007;
        goto L35
    L17:
        if ((r6 instanceof UnsupportedDrmException) == false) goto L20;
        r8 = 6001;
        goto L35
    L20:
        if ((r6 instanceof DefaultDrmSessionManager$MissingSchemeDataException) == false) goto L23;
        r8 = 6003;
        goto L35
    L23:
        if ((r6 instanceof KeysExpiredException) == false) goto L25;
        r8 = 6008;
        goto L35
    L25:
        if (r7 == 1) goto L7;
        if (r7 != 2) goto L31;
        r8 = 6004;
        goto L35
    L31:
        if (r7 == 3) goto L32;
        nz2.c();
    }

    public final void l(Throwable r2, boolean r3) {
        if ((r2 instanceof NotProvisionedException) == false) goto L5;
    L12:
        this.c.r(this);
        return;
    L5:
        if (gb.M(r2) == true) goto L12;
        if (r3 == false) goto L9;
        int r4 = 1;
    L10:
        k(r2, r4);
        return;
    L9:
        r4 = 2;
        goto L10
    }

    public final boolean m() {
        if (j() == false) goto L31;
        return true;
    L31:
        byte[] r0 = this.b.w();     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        this.v = r0;     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        this.b.Q(r0, this.j);     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        this.t = this.b.v(this.v);     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        this.p = 3;     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        ie0 r2 = this.h;     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        Object r3 = r2.n;     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        monitor-enter(r3);     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        Set r4 = r2.p;     // Catch: Throwable -> L19
        monitor-exit(r3);     // Catch: Throwable -> L19
        Iterator r5 = r4.iterator();     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
    L11:
        if (r5.hasNext() == false) goto L13;
        ((sw0) r5.next()).c(3);     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        goto L11
    L13:
        this.v.getClass();     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
        return true;
    L19:
        th = move-exception;
        throw th;     // Catch: NoSuchMethodError -> L15 Exception -> L17 NotProvisionedException -> L26
    L26:
        this.c.r(this);
        return false;
    L17:
        e = e;
    L23:
        if (gb.M(e) == false) goto L25;
        this.c.r(this);
        return false;
    L25:
        k(e, 1);
        return false;
    L15:
        e = e;
        goto L23
    }

    public final void n(int r11, boolean r12, byte[] r13) {
        Object r1 = this.o;     // Catch: Throwable -> L12 Exception -> L14
        monitor-enter(r1);     // Catch: Throwable -> L12 Exception -> L14
        this.y = new si1(3);     // Catch: Throwable -> L7
        List r0 = this.a;     // Catch: Throwable -> L7
        if (r0 == null) goto L9;
        yw1.k(r0);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
        k31 r9 = this.b.O(r13, this.a, r11, this.g);     // Catch: Throwable -> L12 Exception -> L14
        this.x = r9;     // Catch: Throwable -> L12 Exception -> L14
        gk0 r14 = this.s;     // Catch: Throwable -> L12 Exception -> L14
        String r15 = f35.a;     // Catch: Throwable -> L12 Exception -> L14
        r9.getClass();     // Catch: Throwable -> L12 Exception -> L14
        r14.getClass();     // Catch: Throwable -> L12 Exception -> L14
        r14.obtainMessage(2, new hk0(ed2.g.getAndIncrement(), r12, SystemClock.elapsedRealtime(), r9)).sendToTarget();     // Catch: Throwable -> L12 Exception -> L14
        return;
    L7:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12 Exception -> L14
    L12:
        e = move-exception;
        l(e, true);
    }

    public final void o() {
        Thread r0 = Thread.currentThread();
        Looper r2 = this.m;
        if (r0 == r2.getThread()) goto L6;
        l93.r0("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + r2.getThread().getName(), new IllegalStateException());
        return;
    }
}
