package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements wq0, s21, kg1, er2 {
    public long n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    public lr0(r34 r34Var, gr4 gr4Var) {
        gr4Var.getClass();
        this.o = r34Var;
        this.p = gr4Var;
        this.n = Long.MIN_VALUE;
        this.q = new CopyOnWriteArrayList();
        this.r = new LinkedBlockingDeque();
    }

    @Override // defpackage.er2
    public void B(int i, za4 za4Var, boolean z, boolean z2, int i2) {
        ls2 ls2Var = (ls2) this.r;
        ls2Var.P(ls2Var.g.s);
    }

    @Override // defpackage.wq0
    public void M(f42 f42Var, ns3 ns3Var) {
        yq0 yq0Var;
        String strM = ((qr2) this.o).m(f42Var);
        rm3 rm3Var = (rm3) this.q;
        synchronized (rm3Var) {
            yq0Var = (yq0) ((HashMap) rm3Var.n).get(strM);
            if (yq0Var == null) {
                zg5 zg5Var = (zg5) rm3Var.o;
                synchronized (((ArrayDeque) zg5Var.n)) {
                    yq0Var = (yq0) ((ArrayDeque) zg5Var.n).poll();
                }
                if (yq0Var == null) {
                    yq0Var = new yq0();
                }
                ((HashMap) rm3Var.n).put(strM, yq0Var);
            }
            yq0Var.b++;
        }
        yq0Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM + " for for Key: " + f42Var);
            }
            try {
                kr0 kr0VarF = f();
                if (kr0VarF.s(strM) == null) {
                    ll llVarN = kr0VarF.n(strM);
                    if (llVarN == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM));
                    }
                    try {
                        if (((c11) ns3Var.o).i(ns3Var.p, llVarN.g(), (db3) ns3Var.q)) {
                            kr0.b((kr0) llVarN.r, llVarN, true);
                            llVarN.o = true;
                        }
                        if (!llVarN.o) {
                            try {
                                llVarN.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!llVarN.o) {
                            try {
                                llVarN.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            ((rm3) this.q).M(strM);
        } catch (Throwable th2) {
            ((rm3) this.q).M(strM);
            throw th2;
        }
    }

    @Override // defpackage.s21
    public cv3 a() throws IOException {
        p34 p34VarG;
        long j;
        p34 p34Var;
        r34 r34Var = (r34) this.o;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.q;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !r34Var.m(null)) {
                    b();
                    iOException.getClass();
                    throw iOException;
                }
                if (r34Var.isCanceled()) {
                    throw new IOException("Canceled");
                }
                rm2 rm2Var = ((gr4) this.p).a;
                long jNanoTime = System.nanoTime();
                long j2 = this.n - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    p34VarG = g();
                    j = 250000000;
                    this.n = jNanoTime + 250000000;
                } else {
                    j = j2;
                    p34VarG = null;
                }
                if (p34VarG == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (p34Var = (p34) ((LinkedBlockingDeque) this.r).poll(j, timeUnit)) == null) {
                        p34VarG = null;
                    } else {
                        copyOnWriteArrayList.remove(p34Var.a);
                        p34VarG = p34Var;
                    }
                    if (p34VarG == null) {
                    }
                }
                q34 q34Var = p34VarG.a;
                boolean z = false;
                if (p34VarG.b == null && p34VarG.c == null) {
                    b();
                    if (!q34Var.c()) {
                        p34VarG = q34Var.g();
                    }
                    if (p34VarG.b == null && p34VarG.c == null) {
                        z = true;
                    }
                    if (z) {
                        cv3 cv3VarE = p34VarG.a.e();
                        b();
                        return cv3VarE;
                    }
                }
                Throwable th = p34VarG.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        j51.d(iOException, th);
                    }
                }
                q34 q34Var2 = p34VarG.b;
                if (q34Var2 != null) {
                    r34Var.v().addFirst(q34Var2);
                }
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList<q34> copyOnWriteArrayList = (CopyOnWriteArrayList) this.q;
        for (q34 q34Var : copyOnWriteArrayList) {
            q34Var.cancel();
            q34 q34VarD = q34Var.d();
            if (q34VarD != null) {
                ((r34) this.o).v().addLast(q34VarD);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // defpackage.er2
    public void c() {
    }

    @Override // defpackage.s21
    public r34 d() {
        return (r34) this.o;
    }

    public synchronized kr0 f() {
        try {
            if (((kr0) this.r) == null) {
                this.r = kr0.v((File) this.p, this.n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (kr0) this.r;
    }

    public p34 g() {
        q34 x51Var;
        r34 r34Var = (r34) this.o;
        if (r34Var.m(null)) {
            try {
                x51Var = r34Var.w();
            } catch (Throwable th) {
                x51Var = new x51(th);
            }
            if (x51Var.c()) {
                return new p34(x51Var, (Throwable) null, 6);
            }
            if (x51Var instanceof x51) {
                return ((x51) x51Var).a;
            }
            ((CopyOnWriteArrayList) this.q).add(x51Var);
            ((gr4) this.p).e().d(new z51(ze5.c + " connect " + r34Var.n().h.i(), x51Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ls2 ls2Var = (ls2) ((lr0) this.r).r;
        if (this != ls2Var.s) {
            return;
        }
        ls2.F(ls2Var.m, f92.n((do2) this.o, (String) this.p, (Uri) this.q, this.n, bitmap));
        tn2 tn2Var = ls2Var.g;
        f35.W(tn2Var.o, new sr2(tn2Var, 1));
    }

    public void j() {
        int i;
        is2 is2Var;
        ls2 ls2Var = (ls2) this.r;
        al3 al3Var = ls2Var.g.s;
        if (al3Var.F().a == 0) {
            is2Var = null;
        } else {
            mi3 mi3VarO = al3Var.o();
            if (mi3VarO.a.a(26, 34)) {
                i = mi3VarO.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(al3Var.b.U0());
            int iJ = al3Var.S0(23) ? al3Var.j() : 0;
            hp0 hp0VarF = al3Var.F();
            is2Var = new is2(i, hp0VarF.c, iJ, hp0VarF.d, handler, al3Var);
        }
        ls2Var.p = is2Var;
        qr2 qr2Var = ls2Var.m;
        if (is2Var == null) {
            ((kr2) qr2Var.o).a.setPlaybackToLocal((al3Var.S0(21) ? al3Var.D() : il.i).c());
        } else {
            ((kr2) qr2Var.o).a.setPlaybackToRemote(is2Var.a());
        }
    }

    @Override // defpackage.er2
    public void k(List list, int i) {
        ls2 ls2Var = (ls2) this.r;
        ls2Var.P(ls2Var.g.s);
    }

    @Override // defpackage.er2
    public void l(int i, va4 va4Var) {
        Bundle bundle = Bundle.EMPTY;
        boolean zIsEmpty = bundle.isEmpty();
        Bundle bundle2 = va4Var.c;
        if (zIsEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        qr2 qr2Var = ((ls2) this.r).m;
        String str = va4Var.b;
        qr2Var.getClass();
        if (TextUtils.isEmpty(str)) {
            kf2.n("event cannot be null or empty");
        } else {
            ((kr2) qr2Var.o).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // defpackage.wq0
    public File m(f42 f42Var) {
        String strM = ((qr2) this.o).m(f42Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM + " for for Key: " + f42Var);
        }
        try {
            d34 d34VarS = f().s(strM);
            if (d34VarS != null) {
                return ((File[]) d34VarS.o)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public void n(gn2 gn2Var) {
        x();
        ls2 ls2Var = (ls2) this.r;
        qr2 qr2Var = ls2Var.m;
        if (gn2Var == null) {
            ((kr2) qr2Var.o).a.setRatingType(0);
        } else {
            ((kr2) qr2Var.o).a.setRatingType(f92.w(gn2Var.d.i));
        }
        ls2Var.P(ls2Var.g.s);
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        if (this != ((ls2) ((lr0) this.r).r).s) {
            return;
        }
        l93.q0("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public void p(int i, al3 al3Var, al3 al3Var2) {
        ls2 ls2Var = (ls2) this.r;
        cu4 cu4VarZ0 = al3Var2.Z0();
        if (al3Var == null || !Objects.equals(al3Var.Z0(), cu4VarZ0)) {
            w(cu4VarZ0);
        }
        do2 do2VarG0 = al3Var2.S0(18) ? al3Var2.g0() : do2.K;
        if (al3Var == null) {
            q(do2VarG0);
        } else {
            if (!Objects.equals(al3Var.S0(18) ? al3Var.g0() : do2.K, do2VarG0)) {
                q(do2VarG0);
            }
        }
        do2 do2VarA1 = al3Var2.a1();
        if (al3Var == null || !Objects.equals(al3Var.a1(), do2VarA1)) {
            x();
        }
        if (al3Var == null || al3Var.D0() != al3Var2.D0()) {
            u(al3Var2.D0());
        }
        if (al3Var == null || al3Var.h() != al3Var2.h()) {
            s(al3Var2.h());
        }
        al3Var2.F();
        j();
        int i2 = al3Var2.S0(20) ? 4 : 0;
        if (ls2Var.t != i2) {
            ls2Var.t = i2;
            ((kr2) ls2Var.m.o).a.setFlags(i2 | 3);
        }
        gn2 gn2VarY0 = al3Var2.Y0();
        if (al3Var == null || !Objects.equals(al3Var.Y0(), gn2VarY0)) {
            n(gn2VarY0);
        } else {
            ls2Var.P(al3Var2);
        }
    }

    public void q(do2 do2Var) {
        ls2 ls2Var = (ls2) this.r;
        qr2 qr2Var = ls2Var.m;
        CharSequence queueTitle = ((xk2) ((wo0) qr2Var.p).n).a.getQueueTitle();
        CharSequence charSequence = do2Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        al3 al3Var = ls2Var.g.s;
        if (!ls2Var.z.a(17) || !al3Var.o().a(17)) {
            charSequence = null;
        }
        ((kr2) qr2Var.o).a.setQueueTitle(charSequence);
    }

    public void s(int i) {
        qr2 qr2Var = ((ls2) this.r).m;
        int iP = f92.p(i);
        kr2 kr2Var = (kr2) qr2Var.o;
        if (kr2Var.j != iP) {
            kr2Var.j = iP;
            synchronized (kr2Var.d) {
                int iBeginBroadcast = kr2Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = kr2Var.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((lu1) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).f(iP);
                        } catch (RemoteException | SecurityException e) {
                            l93.G("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // defpackage.er2
    public void t(int i, mi3 mi3Var) {
        ls2 ls2Var = (ls2) this.r;
        al3 al3Var = ls2Var.g.s;
        int i2 = al3Var.S0(20) ? 4 : 0;
        if (ls2Var.t != i2) {
            ls2Var.t = i2;
            ((kr2) ls2Var.m.o).a.setFlags(i2 | 3);
        }
        ls2Var.P(al3Var);
    }

    public void u(boolean z) {
        qr2 qr2Var = ((ls2) this.r).m;
        jx1 jx1Var = f92.a;
        kr2 kr2Var = (kr2) qr2Var.o;
        if (kr2Var.k != z) {
            kr2Var.k = z ? 1 : 0;
            synchronized (kr2Var.d) {
                int iBeginBroadcast = kr2Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = kr2Var.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((lu1) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).c0(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            l93.G("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public void w(cu4 cu4Var) {
        y(cu4Var);
        x();
    }

    public void x() {
        Bitmap bitmap;
        Uri uri;
        ls2 ls2Var = (ls2) this.r;
        tn2 tn2Var = ls2Var.g;
        al3 al3Var = tn2Var.s;
        gn2 gn2VarY0 = al3Var.Y0();
        do2 do2VarA1 = al3Var.a1();
        long duration = -9223372036854775807L;
        if ((!al3Var.S0(16) || !al3Var.V0()) && al3Var.S0(16)) {
            duration = al3Var.getDuration();
        }
        String str = gn2VarY0 != null ? gn2VarY0.a : "";
        Uri uri2 = (gn2VarY0 == null || (uri = gn2VarY0.f.a) == null) ? null : uri;
        if (Objects.equals((do2) this.o, do2VarA1) && Objects.equals((String) this.p, str) && Objects.equals((Uri) this.q, uri2) && this.n == duration) {
            return;
        }
        this.p = str;
        this.q = uri2;
        this.o = do2VarA1;
        this.n = duration;
        ic2 ic2VarI = tn2Var.m.i(do2VarA1);
        if (ic2VarI != null) {
            ls2Var.s = null;
            k91 k91Var = (k91) ic2VarI;
            if (k91Var.isDone()) {
                try {
                    bitmap = (Bitmap) hw.j(ic2VarI);
                } catch (CancellationException | ExecutionException e) {
                    l93.q0("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                    bitmap = null;
                }
            } else {
                lr0 lr0Var = new lr0();
                lr0Var.r = this;
                lr0Var.o = do2VarA1;
                lr0Var.p = str;
                lr0Var.q = uri2;
                lr0Var.n = duration;
                ls2Var.s = lr0Var;
                Handler handler = tn2Var.l;
                Objects.requireNonNull(handler);
                k91Var.f(new lg1(0, ic2VarI, lr0Var), new ym(handler, 1));
            }
            bitmap = null;
        } else {
            bitmap = null;
        }
        ls2.F(ls2Var.m, f92.n(do2VarA1, str, uri2, duration, bitmap));
    }

    public void y(cu4 cu4Var) {
        ls2 ls2Var = (ls2) this.r;
        tn2 tn2Var = ls2Var.g;
        al3 al3Var = tn2Var.s;
        if (!ls2Var.z.a(17) || !al3Var.o().a(17) || cu4Var.p()) {
            ls2.E(ls2Var.m, null);
            return;
        }
        jx1 jx1Var = f92.a;
        ArrayList arrayList = new ArrayList();
        bu4 bu4Var = new bu4();
        for (int i = 0; i < cu4Var.o(); i++) {
            arrayList.add(cu4Var.m(i, bu4Var, 0L).b);
        }
        ArrayList arrayList2 = new ArrayList();
        t6 t6Var = new t6(this, new AtomicInteger(0), arrayList, arrayList2, 21);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((gn2) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                t6Var.run();
            } else {
                ic2 ic2VarJ = tn2Var.m.j(bArr);
                arrayList2.add(ic2VarJ);
                Handler handler = tn2Var.l;
                Objects.requireNonNull(handler);
                ((k91) ic2VarJ).f(t6Var, new ym(handler, 1));
            }
        }
    }
}
