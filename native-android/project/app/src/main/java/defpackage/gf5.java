package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gf5 implements gj1, hj1 {
    public final me f;
    public final ve g;
    public final xc5 h;
    public final int k;
    public final rf5 l;
    public boolean m;
    public final /* synthetic */ ij1 q;
    public final LinkedList e = new LinkedList();
    public final HashSet i = new HashSet();
    public final HashMap j = new HashMap();
    public final ArrayList n = new ArrayList();
    public ka0 o = null;
    public int p = 0;

    public gf5(ij1 ij1Var, dj1 dj1Var) {
        this.q = ij1Var;
        Looper looper = ij1Var.A.getLooper();
        c12 c12VarA = dj1Var.a();
        ml3 ml3Var = new ml3((qi) c12VarA.o, (String) c12VarA.p, (String) c12VarA.q);
        vr1 vr1Var = (vr1) dj1Var.c.n;
        ji2.m(vr1Var);
        me meVarA = vr1Var.a(dj1Var.a, looper, ml3Var, dj1Var.d, this, this);
        String str = dj1Var.b;
        if (str != null && (meVarA instanceof a)) {
            ((a) meVarA).E = str;
        }
        if (str != null && (meVarA instanceof l63)) {
            xa3.r(meVarA);
            throw null;
        }
        this.f = meVarA;
        this.g = dj1Var.e;
        this.h = new xc5(23);
        this.k = dj1Var.g;
        if (!meVarA.i0()) {
            this.l = null;
            return;
        }
        Context context = ij1Var.r;
        zw2 zw2Var = ij1Var.A;
        c12 c12VarA2 = dj1Var.a();
        this.l = new rf5(context, zw2Var, new ml3((qi) c12VarA2.o, (String) c12VarA2.p, (String) c12VarA2.q));
    }

    @Override // defpackage.gj1
    public final void U(int i) {
        Looper looperMyLooper = Looper.myLooper();
        zw2 zw2Var = this.q.A;
        if (looperMyLooper == zw2Var.getLooper()) {
            f(i);
        } else {
            zw2Var.post(new rq(i, 7, this));
        }
    }

    @Override // defpackage.gj1
    public final void X() {
        Looper looperMyLooper = Looper.myLooper();
        zw2 zw2Var = this.q.A;
        if (looperMyLooper == zw2Var.getLooper()) {
            e();
        } else {
            zw2Var.post(new wu4(5, this));
        }
    }

    public final void a(ka0 ka0Var) {
        HashSet hashSet = this.i;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            kf2.k();
        } else {
            if (au0.n(ka0Var, ka0.r)) {
                this.f.d0();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        ji2.j(this.q.A);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        ji2.j(this.q.A);
        if ((status == null) == (exc == null)) {
            kf2.n("Status XOR exception should be null");
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            cg5 cg5Var = (cg5) it.next();
            if (!z || cg5Var.a == 2) {
                if (status != null) {
                    cg5Var.a(status);
                } else {
                    cg5Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cg5 cg5Var = (cg5) arrayList.get(i);
            if (!this.f.Y()) {
                return;
            }
            if (h(cg5Var)) {
                linkedList.remove(cg5Var);
            }
        }
    }

    public final void e() {
        ij1 ij1Var = this.q;
        ji2.j(ij1Var.A);
        this.o = null;
        a(ka0.r);
        zw2 zw2Var = ij1Var.A;
        if (this.m) {
            ve veVar = this.g;
            zw2Var.removeMessages(11, veVar);
            zw2Var.removeMessages(9, veVar);
            this.m = false;
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        ij1 ij1Var = this.q;
        zw2 zw2Var = ij1Var.A;
        ji2.j(ij1Var.A);
        this.o = null;
        this.m = true;
        String strH0 = this.f.h0();
        xc5 xc5Var = this.h;
        xc5Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strH0 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strH0);
        }
        xc5Var.x(true, new Status(20, sb.toString(), null, null));
        ve veVar = this.g;
        zw2Var.sendMessageDelayed(Message.obtain(zw2Var, 9, veVar), 5000L);
        zw2Var.sendMessageDelayed(Message.obtain(zw2Var, 11, veVar), 120000L);
        ((SparseIntArray) ij1Var.t.o).clear();
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    public final void g() {
        ij1 ij1Var = this.q;
        zw2 zw2Var = ij1Var.A;
        ve veVar = this.g;
        zw2Var.removeMessages(12, veVar);
        zw2Var.sendMessageDelayed(zw2Var.obtainMessage(12, veVar), ij1Var.n);
    }

    public final boolean h(cg5 cg5Var) {
        p61 p61Var;
        if (!(cg5Var instanceof kf5)) {
            xc5 xc5Var = this.h;
            me meVar = this.f;
            cg5Var.d(xc5Var, meVar.i0());
            try {
                cg5Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                U(1);
                meVar.a0("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        kf5 kf5Var = (kf5) cg5Var;
        p61[] p61VarArrG = kf5Var.g(this);
        if (p61VarArrG == null || p61VarArrG.length == 0) {
            p61Var = null;
            break;
        }
        p61[] p61VarArrG0 = this.f.g0();
        if (p61VarArrG0 == null) {
            p61VarArrG0 = new p61[0];
        }
        oi oiVar = new oi(p61VarArrG0.length);
        for (p61 p61Var2 : p61VarArrG0) {
            oiVar.put(p61Var2.n, Long.valueOf(p61Var2.b()));
        }
        int length = p61VarArrG.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                p61Var = null;
                break;
            }
            p61Var = p61VarArrG[i];
            Long l = (Long) oiVar.get(p61Var.n);
            if (l == null || l.longValue() < p61Var.b()) {
                break;
            }
            i++;
        }
        if (p61Var == null) {
            xc5 xc5Var2 = this.h;
            me meVar2 = this.f;
            cg5Var.d(xc5Var2, meVar2.i0());
            try {
                cg5Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                U(1);
                meVar2.a0("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f.getClass().getName() + " could not execute call because it requires feature (" + p61Var.n + ", " + p61Var.b() + ").");
        if (!this.q.B || !kf5Var.f(this)) {
            kf5Var.b(new UnsupportedApiCallException(p61Var));
            return true;
        }
        hf5 hf5Var = new hf5(this.g, p61Var);
        int iIndexOf = this.n.indexOf(hf5Var);
        ArrayList arrayList = this.n;
        if (iIndexOf >= 0) {
            hf5 hf5Var2 = (hf5) arrayList.get(iIndexOf);
            this.q.A.removeMessages(15, hf5Var2);
            zw2 zw2Var = this.q.A;
            zw2Var.sendMessageDelayed(Message.obtain(zw2Var, 15, hf5Var2), 5000L);
            return false;
        }
        arrayList.add(hf5Var);
        zw2 zw2Var2 = this.q.A;
        zw2Var2.sendMessageDelayed(Message.obtain(zw2Var2, 15, hf5Var), 5000L);
        zw2 zw2Var3 = this.q.A;
        zw2Var3.sendMessageDelayed(Message.obtain(zw2Var3, 16, hf5Var), 120000L);
        ka0 ka0Var = new ka0(2, null);
        if (!i(ka0Var)) {
            this.q.c(ka0Var, this.k);
        }
        return false;
    }

    public final boolean i(ka0 ka0Var) {
        AtomicReference atomicReference;
        synchronized (ij1.E) {
            try {
                ij1 ij1Var = this.q;
                if (ij1Var.x == null || !ij1Var.y.contains(this.g)) {
                    return false;
                }
                df5 df5Var = this.q.x;
                int i = this.k;
                df5Var.getClass();
                eg5 eg5Var = new eg5(ka0Var, i);
                loop0: do {
                    atomicReference = df5Var.p;
                    do {
                        int i2 = 1;
                        if (atomicReference.compareAndSet(null, eg5Var)) {
                            df5Var.q.post(new qf5(i2, df5Var, eg5Var));
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } while (atomicReference.get() == null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        ij1 ij1Var = this.q;
        ji2.j(ij1Var.A);
        me meVar = this.f;
        if (meVar.Y() || meVar.c0()) {
            return;
        }
        try {
            hd5 hd5Var = ij1Var.t;
            Context context = ij1Var.r;
            SparseIntArray sparseIntArray = (SparseIntArray) hd5Var.o;
            ji2.m(context);
            int iF0 = meVar.f0();
            int iB = ((SparseIntArray) hd5Var.o).get(iF0, -1);
            if (iB == -1) {
                iB = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iF0 && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iB == -1) {
                    iB = ((ej1) hd5Var.p).b(context, iF0);
                }
                sparseIntArray.put(iF0, iB);
            }
            if (iB != 0) {
                ka0 ka0Var = new ka0(iB, null);
                Log.w("GoogleApiManager", "The service for " + meVar.getClass().getName() + " is not available: " + ka0Var.toString());
                l(ka0Var, null);
                return;
            }
            nq nqVar = new nq(ij1Var, meVar, this.g);
            if (meVar.i0()) {
                rf5 rf5Var = this.l;
                ji2.m(rf5Var);
                Handler handler = rf5Var.g;
                ml3 ml3Var = rf5Var.j;
                sd4 sd4Var = rf5Var.k;
                if (sd4Var != null) {
                    sd4Var.b();
                }
                ml3Var.f = Integer.valueOf(System.identityHashCode(rf5Var));
                rf5Var.k = (sd4) rf5Var.h.a(rf5Var.f, handler.getLooper(), ml3Var, (ud4) ml3Var.e, rf5Var, rf5Var);
                rf5Var.l = nqVar;
                Set set = rf5Var.i;
                if (set == null || set.isEmpty()) {
                    handler.post(new wu4(7, rf5Var));
                } else {
                    sd4 sd4Var2 = rf5Var.k;
                    sd4Var2.getClass();
                    sd4Var2.e0(new d34(9, sd4Var2));
                }
            }
            try {
                meVar.e0(nqVar);
            } catch (SecurityException e) {
                l(new ka0(10), e);
            }
        } catch (IllegalStateException e2) {
            l(new ka0(10), e2);
        }
    }

    public final void k(cg5 cg5Var) {
        ji2.j(this.q.A);
        boolean zY = this.f.Y();
        LinkedList linkedList = this.e;
        if (zY) {
            if (h(cg5Var)) {
                g();
                return;
            } else {
                linkedList.add(cg5Var);
                return;
            }
        }
        linkedList.add(cg5Var);
        ka0 ka0Var = this.o;
        if (ka0Var == null || ka0Var.o == 0 || ka0Var.p == null) {
            j();
        } else {
            l(ka0Var, null);
        }
    }

    public final void l(ka0 ka0Var, RuntimeException runtimeException) {
        sd4 sd4Var;
        ji2.j(this.q.A);
        rf5 rf5Var = this.l;
        if (rf5Var != null && (sd4Var = rf5Var.k) != null) {
            sd4Var.b();
        }
        ji2.j(this.q.A);
        this.o = null;
        ((SparseIntArray) this.q.t.o).clear();
        a(ka0Var);
        if ((this.f instanceof fg5) && ka0Var.o != 24) {
            ij1 ij1Var = this.q;
            ij1Var.o = true;
            zw2 zw2Var = ij1Var.A;
            zw2Var.sendMessageDelayed(zw2Var.obtainMessage(19), 300000L);
        }
        if (ka0Var.o == 4) {
            b(ij1.D);
            return;
        }
        if (this.e.isEmpty()) {
            this.o = ka0Var;
            return;
        }
        ij1 ij1Var2 = this.q;
        if (runtimeException != null) {
            ji2.j(ij1Var2.A);
            c(null, runtimeException, false);
            return;
        }
        boolean z = ij1Var2.B;
        ve veVar = this.g;
        if (!z) {
            b(ij1.d(veVar, ka0Var));
            return;
        }
        c(ij1.d(veVar, ka0Var), null, true);
        if (this.e.isEmpty() || i(ka0Var) || this.q.c(ka0Var, this.k)) {
            return;
        }
        if (ka0Var.o == 18) {
            this.m = true;
        }
        if (!this.m) {
            b(ij1.d(this.g, ka0Var));
            return;
        }
        ij1 ij1Var3 = this.q;
        ve veVar2 = this.g;
        zw2 zw2Var2 = ij1Var3.A;
        zw2Var2.sendMessageDelayed(Message.obtain(zw2Var2, 9, veVar2), 5000L);
    }

    @Override // defpackage.hj1
    public final void m(ka0 ka0Var) {
        l(ka0Var, null);
    }

    public final void n(ka0 ka0Var) {
        ji2.j(this.q.A);
        me meVar = this.f;
        meVar.a0("onSignInFailed for " + meVar.getClass().getName() + " with " + String.valueOf(ka0Var));
        l(ka0Var, null);
    }

    public final void o() {
        ji2.j(this.q.A);
        Status status = ij1.C;
        b(status);
        this.h.x(false, status);
        for (pc2 pc2Var : (pc2[]) this.j.keySet().toArray(new pc2[0])) {
            k(new ag5(new cr4()));
        }
        int i = 4;
        a(new ka0(4));
        me meVar = this.f;
        if (meVar.Y()) {
            meVar.b0(new h45(i, this));
        }
    }
}
