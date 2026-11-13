package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lt0 {
    public static final h04 n = new h04(1);
    public final Context a;
    public final fk0 b;
    public final it0 c;
    public final cn d;
    public final CopyOnWriteArraySet e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public List l;
    public hq1 m;

    public lt0(Context context, tk4 tk4Var, se4 se4Var, bi0 bi0Var, ExecutorService executorService) {
        fk0 fk0Var = new fk0(tk4Var);
        kx kxVar = new kx();
        kxVar.n = se4Var;
        kxVar.r = bi0Var;
        z05 z05Var = new z05(kxVar, executorService);
        this.a = context.getApplicationContext();
        this.b = fk0Var;
        this.i = true;
        this.l = Collections.EMPTY_LIST;
        this.e = new CopyOnWriteArraySet();
        Handler q = f35.q(new gt0(0, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        it0 it0Var = new it0(handlerThread, fk0Var, z05Var, q, this.i);
        this.c = it0Var;
        cn cnVar = new cn(7, this);
        this.d = cnVar;
        hq1 hq1Var = new hq1(context, cnVar, n);
        this.m = hq1Var;
        int m = hq1Var.m();
        this.j = m;
        this.f = 1;
        it0Var.obtainMessage(1, m, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((jt0) it.next()).f(this, this.k);
        }
    }

    public final void b(hq1 hq1Var, int i) {
        Object obj = hq1Var.d;
        if (this.j != i) {
            this.j = i;
            this.f++;
            this.c.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean e = e();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((jt0) it.next()).c();
        }
        if (e) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean e = e();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((jt0) it.next()).getClass();
        }
        if (e) {
            a();
        }
    }

    public final void d(h04 h04Var) {
        if (h04Var.equals((h04) this.m.d)) {
            return;
        }
        hq1 hq1Var = this.m;
        Context context = (Context) hq1Var.b;
        v9 v9Var = (v9) hq1Var.f;
        v9Var.getClass();
        context.unregisterReceiver(v9Var);
        hq1Var.f = null;
        if (((j04) hq1Var.g) != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            j04 j04Var = (j04) hq1Var.g;
            j04Var.getClass();
            connectivityManager.unregisterNetworkCallback(j04Var);
            hq1Var.g = null;
        }
        hq1 hq1Var2 = new hq1(this.a, this.d, h04Var);
        this.m = hq1Var2;
        b(this.m, hq1Var2.m());
    }

    public final boolean e() {
        boolean z;
        if (!this.i && this.j != 0) {
            for (int i = 0; i < this.l.size(); i++) {
                if (((ns0) this.l.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.k != z;
        this.k = z;
        return z2;
    }
}
