package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements th0, Runnable, Comparable, r51 {
    public xq0 A;
    public db3 B;
    public m11 C;
    public int D;
    public long E;
    public boolean F;
    public Object G;
    public Thread H;
    public f42 I;
    public f42 J;
    public Object K;
    public sh0 L;
    public volatile uh0 M;
    public volatile boolean N;
    public volatile boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public final sd0 q;
    public final io3 r;
    public ii1 u;
    public f42 v;
    public eq3 w;
    public n11 x;
    public int y;
    public int z;
    public final wi0 n = new wi0();
    public final ArrayList o = new ArrayList();
    public final ul4 p = new ul4();
    public final jv3 s = new jv3();
    public final yl t = new yl();

    public xi0(sd0 sd0Var, i61 i61Var) {
        this.q = sd0Var;
        this.r = i61Var;
    }

    @Override // defpackage.th0
    public final void a(f42 f42Var, Object obj, sh0 sh0Var, int i, f42 f42Var2) {
        this.I = f42Var;
        this.K = obj;
        this.L = sh0Var;
        this.S = i;
        this.J = f42Var2;
        this.P = f42Var != this.n.a().get(0);
        if (Thread.currentThread() == this.H) {
            f();
            return;
        }
        this.R = 3;
        m11 m11Var = this.C;
        (m11Var.z ? m11Var.v : m11Var.u).execute(this);
    }

    @Override // defpackage.th0
    public final void b(f42 f42Var, Exception exc, sh0 sh0Var, int i) {
        sh0Var.c();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsA = sh0Var.a();
        glideException.o = f42Var;
        glideException.p = i;
        glideException.q = clsA;
        this.o.add(glideException);
        if (Thread.currentThread() == this.H) {
            l();
            return;
        }
        this.R = 2;
        m11 m11Var = this.C;
        (m11Var.z ? m11Var.v : m11Var.u).execute(this);
    }

    @Override // defpackage.r51
    public final ul4 c() {
        return this.p;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xi0 xi0Var = (xi0) obj;
        int iOrdinal = this.w.ordinal() - xi0Var.w.ordinal();
        return iOrdinal == 0 ? this.D - xi0Var.D : iOrdinal;
    }

    public final q04 d(sh0 sh0Var, Object obj, int i) {
        if (obj == null) {
            sh0Var.c();
            return null;
        }
        try {
            int i2 = ee2.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            q04 q04VarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + q04VarE, jElapsedRealtimeNanos, null);
            }
            return q04VarE;
        } finally {
            sh0Var.c();
        }
    }

    public final q04 e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        wi0 wi0Var = this.n;
        fd2 fd2VarC = wi0Var.c(cls);
        db3 db3Var = this.B;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || wi0Var.r;
            ab3 ab3Var = iu0.i;
            Boolean bool = (Boolean) db3Var.c(ab3Var);
            if (bool == null || (bool.booleanValue() && !z)) {
                db3Var = new db3();
                yx yxVar = this.B.b;
                yx yxVar2 = db3Var.b;
                yxVar2.g(yxVar);
                yxVar2.put(ab3Var, Boolean.valueOf(z));
            }
        }
        db3 db3Var2 = db3Var;
        yh0 yh0VarG = this.u.a().g(obj);
        try {
            return fd2VarC.a(this.y, this.z, new x7(i, 5, this), yh0VarG, db3Var2);
        } finally {
            yh0VarG.c();
        }
    }

    public final void f() {
        q04 q04VarD;
        boolean zB;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", this.E, "data: " + this.K + ", cache key: " + this.I + ", fetcher: " + this.L);
        }
        de2 de2Var = null;
        try {
            q04VarD = d(this.L, this.K, this.S);
        } catch (GlideException e) {
            f42 f42Var = this.J;
            int i = this.S;
            e.o = f42Var;
            e.p = i;
            e.q = null;
            this.o.add(e);
            q04VarD = null;
        }
        if (q04VarD == null) {
            l();
            return;
        }
        int i2 = this.S;
        if (q04VarD instanceof xy1) {
            ((xy1) q04VarD).a();
        }
        int i3 = 1;
        if (((de2) this.s.p) != null) {
            de2Var = (de2) de2.r.b();
            de2Var.q = false;
            de2Var.p = true;
            de2Var.o = q04VarD;
            q04VarD = de2Var;
        }
        n();
        m11 m11Var = this.C;
        synchronized (m11Var) {
            m11Var.B = q04VarD;
            m11Var.C = i2;
        }
        synchronized (m11Var) {
            try {
                m11Var.o.a();
                if (m11Var.I) {
                    m11Var.B.b();
                    m11Var.f();
                } else {
                    if (m11Var.n.n.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (m11Var.D) {
                        throw new IllegalStateException("Already have resource");
                    }
                    om0 om0Var = m11Var.r;
                    q04 q04Var = m11Var.B;
                    boolean z = m11Var.y;
                    n11 n11Var = m11Var.x;
                    i11 i11Var = m11Var.p;
                    om0Var.getClass();
                    m11Var.G = new o11(q04Var, z, true, n11Var, i11Var);
                    m11Var.D = true;
                    l11 l11Var = m11Var.n;
                    l11Var.getClass();
                    ArrayList arrayList = new ArrayList(l11Var.n);
                    m11Var.d(arrayList.size() + 1);
                    m11Var.s.d(m11Var, m11Var.x, m11Var.G);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        k11 k11Var = (k11) obj;
                        k11Var.b.execute(new j11(m11Var, k11Var.a, i3));
                    }
                    m11Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Q = 5;
        try {
            jv3 jv3Var = this.s;
            if (((de2) jv3Var.p) != null) {
                try {
                    this.q.a().M((f42) jv3Var.n, new ns3((w04) jv3Var.o, (de2) jv3Var.p, this.B, 2));
                    ((de2) jv3Var.p).a();
                } catch (Throwable th2) {
                    ((de2) jv3Var.p).a();
                    throw th2;
                }
            }
            if (de2Var != null) {
                de2Var.a();
            }
            yl ylVar = this.t;
            synchronized (ylVar) {
                ylVar.b = true;
                zB = ylVar.b();
            }
            if (zB) {
                k();
            }
        } catch (Throwable th3) {
            if (de2Var == null) {
                throw th3;
            }
            de2Var.a();
            throw th3;
        }
    }

    public final uh0 g() {
        int iW = xa3.w(this.Q);
        wi0 wi0Var = this.n;
        if (iW == 1) {
            return new r04(wi0Var, this);
        }
        if (iW == 2) {
            return new ph0(wi0Var.a(), wi0Var, this);
        }
        if (iW == 3) {
            return new fj4(wi0Var, this);
        }
        if (iW == 5) {
            return null;
        }
        kf2.o("Unrecognized stage: ".concat(xa3.y(this.Q)));
        return null;
    }

    public final int h(int i) {
        int iW = xa3.w(i);
        boolean z = false;
        if (iW == 0) {
            switch (this.A.a) {
                case 0:
                default:
                    z = true;
                    break;
                case 1:
                case 2:
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        }
        if (iW != 1) {
            if (iW == 2) {
                return this.F ? 6 : 4;
            }
            if (iW == 3 || iW == 5) {
                return 6;
            }
            kf2.n("Unrecognized stage: ".concat(xa3.y(i)));
            return 0;
        }
        switch (this.A.a) {
            case 0:
            case 2:
            default:
                z = true;
                break;
            case 1:
                break;
        }
        if (z) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, long j, String str2) {
        StringBuilder sbS = b11.s(str, " in ");
        sbS.append(ee2.a(j));
        sbS.append(", load key: ");
        sbS.append(this.x);
        sbS.append(str2 != null ? ", ".concat(str2) : "");
        sbS.append(", thread: ");
        sbS.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbS.toString());
    }

    public final void j() {
        boolean zB;
        n();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.o));
        m11 m11Var = this.C;
        synchronized (m11Var) {
            m11Var.E = glideException;
        }
        synchronized (m11Var) {
            try {
                m11Var.o.a();
                if (m11Var.I) {
                    m11Var.f();
                } else {
                    if (m11Var.n.n.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (m11Var.F) {
                        throw new IllegalStateException("Already failed once");
                    }
                    m11Var.F = true;
                    n11 n11Var = m11Var.x;
                    l11 l11Var = m11Var.n;
                    l11Var.getClass();
                    ArrayList arrayList = new ArrayList(l11Var.n);
                    m11Var.d(arrayList.size() + 1);
                    m11Var.s.d(m11Var, n11Var, null);
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        k11 k11Var = (k11) obj;
                        k11Var.b.execute(new j11(m11Var, k11Var.a, i));
                    }
                    m11Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yl ylVar = this.t;
        synchronized (ylVar) {
            ylVar.c = true;
            zB = ylVar.b();
        }
        if (zB) {
            k();
        }
    }

    public final void k() {
        yl ylVar = this.t;
        synchronized (ylVar) {
            ylVar.b = false;
            ylVar.a = false;
            ylVar.c = false;
        }
        jv3 jv3Var = this.s;
        jv3Var.n = null;
        jv3Var.o = null;
        jv3Var.p = null;
        wi0 wi0Var = this.n;
        wi0Var.c = null;
        wi0Var.d = null;
        wi0Var.n = null;
        wi0Var.g = null;
        wi0Var.k = null;
        wi0Var.i = null;
        wi0Var.o = null;
        wi0Var.j = null;
        wi0Var.p = null;
        wi0Var.a.clear();
        wi0Var.l = false;
        wi0Var.b.clear();
        wi0Var.m = false;
        this.N = false;
        this.u = null;
        this.v = null;
        this.B = null;
        this.w = null;
        this.x = null;
        this.C = null;
        this.Q = 0;
        this.M = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.S = 0;
        this.L = null;
        this.E = 0L;
        this.O = false;
        this.G = null;
        this.o.clear();
        this.r.a(this);
    }

    public final void l() {
        this.H = Thread.currentThread();
        int i = ee2.b;
        this.E = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.O && this.M != null && !(zC = this.M.c())) {
            this.Q = h(this.Q);
            this.M = g();
            if (this.Q == 4) {
                this.R = 2;
                m11 m11Var = this.C;
                (m11Var.z ? m11Var.v : m11Var.u).execute(this);
                return;
            }
        }
        if ((this.Q == 6 || this.O) && !zC) {
            j();
        }
    }

    public final void m() {
        String str;
        int iW = xa3.w(this.R);
        if (iW == 0) {
            this.Q = h(1);
            this.M = g();
            l();
        } else {
            if (iW == 1) {
                l();
                return;
            }
            if (iW == 2) {
                f();
                return;
            }
            int i = this.R;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            kf2.o("Unrecognized run reason: ".concat(str));
        }
    }

    public final void n() {
        Throwable th;
        this.p.a();
        if (!this.N) {
            this.N = true;
            return;
        }
        if (this.o.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.o;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        mj0.j("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        sh0 sh0Var = this.L;
        try {
            try {
                if (this.O) {
                    j();
                    if (sh0Var != null) {
                        sh0Var.c();
                        return;
                    }
                    return;
                }
                m();
                if (sh0Var != null) {
                    sh0Var.c();
                }
            } catch (Throwable th) {
                if (sh0Var != null) {
                    sh0Var.c();
                }
                throw th;
            }
        } catch (ly e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.O + ", stage: " + xa3.y(this.Q), th2);
            }
            if (this.Q != 5) {
                this.o.add(th2);
                j();
            }
            if (!this.O) {
                throw th2;
            }
            throw th2;
        }
    }
}
