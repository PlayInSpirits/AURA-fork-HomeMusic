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

    public ik0(UUID uuid, m31 m31Var, qr2 qr2Var, d34 d34Var, List list, boolean z, boolean z2, byte[] bArr, HashMap map, ll llVar, Looper looper, i80 i80Var, ik3 ik3Var) {
        this.l = uuid;
        this.c = qr2Var;
        this.d = d34Var;
        this.b = m31Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = llVar;
        this.h = new ie0();
        this.i = i80Var;
        this.j = ik3Var;
        this.p = 2;
        this.m = looper;
        this.n = new zk(this, looper, 1);
        this.o = new Object();
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
    public final void d(sw0 sw0Var) {
        o();
        int i = this.q;
        if (i <= 0) {
            l93.F("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            zk zkVar = this.n;
            String str = f35.a;
            zkVar.removeCallbacksAndMessages(null);
            gk0 gk0Var = this.s;
            synchronized (gk0Var) {
                gk0Var.removeCallbacksAndMessages(null);
                gk0Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.B(bArr);
                this.v = null;
            }
        }
        if (sw0Var != null) {
            ie0 ie0Var = this.h;
            synchronized (ie0Var.n) {
                try {
                    Integer num = (Integer) ie0Var.o.get(sw0Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(ie0Var.q);
                        arrayList.remove(sw0Var);
                        ie0Var.q = Collections.unmodifiableList(arrayList);
                        int iIntValue = num.intValue();
                        HashMap map = ie0Var.o;
                        if (iIntValue == 1) {
                            map.remove(sw0Var);
                            HashSet hashSet = new HashSet(ie0Var.p);
                            hashSet.remove(sw0Var);
                            ie0Var.p = Collections.unmodifiableSet(hashSet);
                        } else {
                            map.put(sw0Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.h.a(sw0Var) == 0) {
                sw0Var.e();
            }
        }
        d34 d34Var = this.d;
        int i3 = this.q;
        kk0 kk0Var = (kk0) d34Var.o;
        if (i3 == 1 && kk0Var.p > 0 && kk0Var.l != -9223372036854775807L) {
            kk0Var.o.add(this);
            Handler handler = kk0Var.u;
            handler.getClass();
            handler.postAtTime(new a0(19, this), this, SystemClock.uptimeMillis() + kk0Var.l);
        } else if (i3 == 0) {
            kk0Var.m.remove(this);
            if (kk0Var.r == this) {
                kk0Var.r = null;
            }
            if (kk0Var.s == this) {
                kk0Var.s = null;
            }
            qr2 qr2Var = kk0Var.i;
            HashSet hashSet2 = (HashSet) qr2Var.o;
            hashSet2.remove(this);
            if (((ik0) qr2Var.p) == this) {
                qr2Var.p = null;
                if (!hashSet2.isEmpty()) {
                    ik0 ik0Var = (ik0) hashSet2.iterator().next();
                    qr2Var.p = ik0Var;
                    l31 l31VarP = ik0Var.b.p();
                    ik0Var.z = l31VarP;
                    gk0 gk0Var2 = ik0Var.s;
                    String str2 = f35.a;
                    l31VarP.getClass();
                    gk0Var2.getClass();
                    gk0Var2.obtainMessage(1, new hk0(ed2.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), l31VarP)).sendToTarget();
                }
            }
            if (kk0Var.l != -9223372036854775807L) {
                Handler handler2 = kk0Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                kk0Var.o.remove(this);
            }
        }
        kk0Var.l();
    }

    @Override // defpackage.pw0
    public final void e(sw0 sw0Var) {
        o();
        if (this.q < 0) {
            l93.F("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (sw0Var != null) {
            ie0 ie0Var = this.h;
            synchronized (ie0Var.n) {
                try {
                    ArrayList arrayList = new ArrayList(ie0Var.q);
                    arrayList.add(sw0Var);
                    ie0Var.q = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) ie0Var.o.get(sw0Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(ie0Var.p);
                        hashSet.add(sw0Var);
                        ie0Var.p = Collections.unmodifiableSet(hashSet);
                    }
                    ie0Var.o.put(sw0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            rr2.w(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new gk0(this, this.r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (sw0Var != null && j() && this.h.a(sw0Var) == 1) {
            sw0Var.c(this.p);
        }
        kk0 kk0Var = (kk0) this.d.o;
        if (kk0Var.l != -9223372036854775807L) {
            kk0Var.o.remove(this);
            Handler handler = kk0Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.pw0
    public final boolean f(String str) {
        o();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.U(str, bArr);
    }

    @Override // defpackage.pw0
    public final DrmSession$DrmSessionException g() {
        o();
        if (this.p == 1) {
            return this.u;
        }
        return null;
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

    public final void i(boolean z) {
        long jMin;
        long j;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str = f35.a;
        boolean z2 = true;
        if (this.w == null) {
            n(1, z, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.A(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                k(e, 1);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (ax.d.equals(this.l)) {
            o();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map mapE = bArr2 == null ? null : this.b.e(bArr2);
            if (mapE != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapE.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapE.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j2 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            l93.A("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            n(2, z, bArr);
            return;
        }
        if (jMin <= 0) {
            k(new KeysExpiredException(), 2);
            return;
        }
        this.p = 4;
        ie0 ie0Var = this.h;
        synchronized (ie0Var.n) {
            set = ie0Var.p;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sw0) it.next()).b();
        }
    }

    public final boolean j() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void k(Throwable th, int i) {
        int iY;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iY = f35.y(f35.z(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (th instanceof MediaDrmResetException) {
            iY = 6006;
        } else if ((th instanceof NotProvisionedException) || gb.M(th)) {
            iY = 6002;
        } else if (th instanceof DeniedByServerException) {
            iY = 6007;
        } else if (th instanceof UnsupportedDrmException) {
            iY = 6001;
        } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
            iY = 6003;
        } else if (th instanceof KeysExpiredException) {
            iY = 6008;
        } else if (i == 1) {
            iY = 6006;
        } else if (i == 2) {
            iY = 6004;
        } else {
            if (i != 3) {
                nz2.c();
                return;
            }
            iY = 6002;
        }
        this.u = new DrmSession$DrmSessionException(th, iY);
        l93.G("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            ie0 ie0Var = this.h;
            synchronized (ie0Var.n) {
                set = ie0Var.p;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sw0) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            mj0.j("Unexpected Throwable subclass", th);
            return;
        } else if (!gb.N(th) && !gb.M(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void l(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || gb.M(th)) {
            this.c.r(this);
        } else {
            k(th, z ? 1 : 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] bArrW = this.b.w();
            this.v = bArrW;
            this.b.Q(bArrW, this.j);
            this.t = this.b.v(this.v);
            this.p = 3;
            ie0 ie0Var = this.h;
            synchronized (ie0Var.n) {
                set = ie0Var.p;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sw0) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.r(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (gb.M(e)) {
                this.c.r(this);
                return false;
            }
            k(e, 1);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (gb.M(e)) {
                this.c.r(this);
                return false;
            }
            k(e, 1);
            return false;
        }
    }

    public final void n(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new si1(3);
                    List list = this.a;
                    if (list != null) {
                        yw1.k(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k31 k31VarO = this.b.O(bArr, this.a, i, this.g);
            this.x = k31VarO;
            gk0 gk0Var = this.s;
            String str = f35.a;
            k31VarO.getClass();
            gk0Var.getClass();
            gk0Var.obtainMessage(2, new hk0(ed2.g.getAndIncrement(), z, SystemClock.elapsedRealtime(), k31VarO)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            l93.r0("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
