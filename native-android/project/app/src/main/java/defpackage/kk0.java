package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements ww0 {
    public final UUID b;
    public final mj0 c;
    public final ll d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final qr2 i;
    public final i80 j;
    public final d34 k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public m31 q;
    public ik0 r;
    public ik0 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public ik3 w;
    public volatile zk x;

    public kk0(UUID uuid, ll llVar, HashMap map, boolean z, int[] iArr, boolean z2, i80 i80Var) {
        uuid.getClass();
        rr2.k("Use C.CLEARKEY_UUID instead", !ax.b.equals(uuid));
        this.b = uuid;
        this.c = ue1.r;
        this.d = llVar;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = i80Var;
        this.i = new qr2(6);
        this.k = new d34(19, this);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000L;
    }

    public static boolean h(ik0 ik0Var) {
        ik0Var.o();
        if (ik0Var.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionG = ik0Var.g();
        drmSession$DrmSessionExceptionG.getClass();
        Throwable cause = drmSession$DrmSessionExceptionG.getCause();
        return (cause instanceof ResourceBusyException) || gb.N(cause);
    }

    public static ArrayList k(ow0 ow0Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(ow0Var.q);
        for (int i = 0; i < ow0Var.q; i++) {
            nw0 nw0Var = ow0Var.n[i];
            if ((nw0Var.a(uuid) || (ax.c.equals(uuid) && nw0Var.a(ax.b))) && (nw0Var.r != null || z)) {
                arrayList.add(nw0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ww0
    public final void a() {
        m(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ik0) arrayList.get(i2)).d(null);
            }
        }
        o15 it = jx1.k(this.n).iterator();
        while (it.hasNext()) {
            ((jk0) it.next()).a();
        }
        l();
    }

    @Override // defpackage.ww0
    public final void b() {
        m31 om0Var;
        m(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    try {
                        om0Var = new ue1(uuid);
                    } catch (Exception e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (UnsupportedSchemeException e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                l93.F("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                om0Var = new om0(12);
            }
            this.q = om0Var;
            om0Var.D(new zg5(this));
            return;
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((ik0) arrayList.get(i2)).e(null);
            i2++;
        }
    }

    @Override // defpackage.ww0
    public final pw0 c(sw0 sw0Var, tb1 tb1Var) {
        m(false);
        rr2.w(this.p > 0);
        this.t.getClass();
        return g(this.t, sw0Var, tb1Var, true);
    }

    @Override // defpackage.ww0
    public final vw0 d(sw0 sw0Var, tb1 tb1Var) {
        rr2.w(this.p > 0);
        this.t.getClass();
        jk0 jk0Var = new jk0(this, sw0Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new k6(18, jk0Var, tb1Var));
        return jk0Var;
    }

    @Override // defpackage.ww0
    public final void e(Looper looper, ik3 ik3Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    rr2.w(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = ik3Var;
    }

    @Override // defpackage.ww0
    public final int f(tb1 tb1Var) {
        m(false);
        m31 m31Var = this.q;
        m31Var.getClass();
        int iP = m31Var.P();
        ow0 ow0Var = tb1Var.r;
        if (ow0Var == null) {
            int iH = lw2.h(tb1Var.n);
            int i = 0;
            while (true) {
                int[] iArr = this.g;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (k(ow0Var, uuid, true).isEmpty()) {
                if (ow0Var.q == 1 && ow0Var.n[0].a(ax.b)) {
                    l93.q0("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = ow0Var.p;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iP;
    }

    public final pw0 g(Looper looper, sw0 sw0Var, tb1 tb1Var, boolean z) {
        ArrayList arrayListK;
        int i = 2;
        if (this.x == null) {
            this.x = new zk(this, looper, i);
        }
        ow0 ow0Var = tb1Var.r;
        int i2 = 0;
        ik0 ik0Var = null;
        if (ow0Var == null) {
            int iH = lw2.h(tb1Var.n);
            m31 m31Var = this.q;
            m31Var.getClass();
            if (m31Var.P() != 2 || !se1.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i2 >= iArr.length) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == iH) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1 && m31Var.P() != 1) {
                    ik0 ik0Var2 = this.r;
                    if (ik0Var2 == null) {
                        vw1 vw1Var = yw1.o;
                        ik0 ik0VarJ = j(gy3.r, true, null, z);
                        this.m.add(ik0VarJ);
                        this.r = ik0VarJ;
                    } else {
                        ik0Var2.e(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListK = k(ow0Var, this.b, false);
            if (arrayListK.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
                l93.G("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                sw0Var.d(defaultDrmSessionManager$MissingSchemeDataException);
                return new f21(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
            }
        } else {
            arrayListK = null;
        }
        if (this.f) {
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ik0 ik0Var3 = (ik0) obj;
                if (Objects.equals(ik0Var3.a, arrayListK)) {
                    ik0Var = ik0Var3;
                    break;
                }
            }
        } else {
            ik0Var = this.s;
        }
        if (ik0Var != null) {
            ik0Var.e(sw0Var);
            return ik0Var;
        }
        ik0 ik0VarJ2 = j(arrayListK, false, sw0Var, z);
        if (!this.f) {
            this.s = ik0VarJ2;
        }
        this.m.add(ik0VarJ2);
        return ik0VarJ2;
    }

    public final ik0 i(List list, boolean z, sw0 sw0Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        m31 m31Var = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        ik3 ik3Var = this.w;
        ik3Var.getClass();
        ik0 ik0Var = new ik0(this.b, m31Var, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, ik3Var);
        ik0Var.e(sw0Var);
        if (this.l != -9223372036854775807L) {
            ik0Var.e(null);
        }
        return ik0Var;
    }

    public final ik0 j(List list, boolean z, sw0 sw0Var, boolean z2) {
        ik0 ik0VarI = i(list, z, sw0Var);
        boolean zH = h(ik0VarI);
        long j = this.l;
        Set set = this.o;
        if (zH && !set.isEmpty()) {
            o15 it = jx1.k(set).iterator();
            while (it.hasNext()) {
                ((pw0) it.next()).d(null);
            }
            ik0VarI.d(sw0Var);
            if (j != -9223372036854775807L) {
                ik0VarI.d(null);
            }
            ik0VarI = i(list, z, sw0Var);
        }
        if (h(ik0VarI) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                o15 it2 = jx1.k(set2).iterator();
                while (it2.hasNext()) {
                    ((jk0) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    o15 it3 = jx1.k(set).iterator();
                    while (it3.hasNext()) {
                        ((pw0) it3.next()).d(null);
                    }
                }
                ik0VarI.d(sw0Var);
                if (j != -9223372036854775807L) {
                    ik0VarI.d(null);
                }
                return i(list, z, sw0Var);
            }
        }
        return ik0VarI;
    }

    public final void l() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            m31 m31Var = this.q;
            m31Var.getClass();
            m31Var.a();
            this.q = null;
        }
    }

    public final void m(boolean z) {
        if (z && this.t == null) {
            l93.r0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            l93.r0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }
}
