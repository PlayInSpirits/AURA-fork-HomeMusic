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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 {
    public static final h04 n = null;
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

    static {
        n = new h04(1);
    }

    public lt0(Context r7, tk4 r8, se4 r9, bi0 r10, ExecutorService r11) {
        fk0 r2 = new fk0(r8);
        kx r12 = new kx();
        r12.n = r9;
        r12.r = r10;
        z05 r3 = new z05(r12, r11);
        this.a = r7.getApplicationContext();
        this.b = r2;
        this.i = true;
        this.l = Collections.EMPTY_LIST;
        this.e = new CopyOnWriteArraySet();
        Handler r4 = f35.q(new gt0(0, this));
        HandlerThread r1 = new HandlerThread("ExoPlayer:DownloadManager");
        r1.start();
        it0 r0 = new it0(r1, r2, r3, r4, this.i);
        this.c = r0;
        cn r13 = new cn(7, this);
        this.d = r13;
        hq1 r14 = new hq1(r7, r13, n);
        this.m = r14;
        int r15 = r14.m();
        this.j = r15;
        this.f = 1;
        r0.obtainMessage(1, r15, 0).sendToTarget();
    }

    public final void a() {
        Iterator r0 = this.e.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((jt0) r0.next()).f(this, this.k);
        goto L4
    }

    public final void b(hq1 r3, int r4) {
        Object r5 = r3.d;
        if (this.j == r4) goto L5;
        this.j = r4;
        this.f++;
        this.c.obtainMessage(3, r4, 0).sendToTarget();
    L5:
        boolean r6 = e();
        Iterator r7 = this.e.iterator();
    L7:
        if (r7.hasNext() == false) goto L9;
        ((jt0) r7.next()).c();
        goto L7
    L9:
        if (r6 == false) goto L13;
        a();
        return;
    }

    public final void c(boolean r4) {
        if (this.i == r4) goto L14;
        this.i = r4;
        this.f++;
        this.c.obtainMessage(2, r4 ? 1 : 0, 0).sendToTarget();
        boolean r5 = e();
        Iterator r0 = this.e.iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        ((jt0) r0.next()).getClass();
        goto L7
    L9:
        if (r5 == false) goto L13;
        a();
        return;
    L13:
        return;
    }

    public final void d(h04 r5) {
        if (r5.equals((h04) this.m.d) == false) goto L5;
        return;
    L5:
        hq1 r0 = this.m;
        Context r1 = (Context) r0.b;
        v9 r2 = (v9) r0.f;
        r2.getClass();
        r1.unregisterReceiver(r2);
        r0.f = null;
        if (((j04) r0.g) == null) goto L8;
        ConnectivityManager r3 = (ConnectivityManager) r1.getSystemService("connectivity");
        r3.getClass();
        j04 r4 = (j04) r0.g;
        r4.getClass();
        r3.unregisterNetworkCallback(r4);
        r0.g = null;
    L8:
        hq1 r6 = new hq1(this.a, this.d, r5);
        this.m = r6;
        int r7 = r6.m();
        b(this.m, r7);
    }

    public final boolean e() {
        boolean r1 = true;
        if (this.i == false) goto L5;
    L13:
        boolean r0 = false;
    L15:
        if (this.k != r0) goto L18;
        r1 = false;
    L18:
        this.k = r0;
        return r1;
    L5:
        if (this.j == 0) goto L13;
        int r2 = 0;
    L8:
        if (r2 >= this.l.size()) goto L13;
        if (((ns0) this.l.get(r2)).b == 0) goto L11;
        r2 = r2 + 1;
        goto L8
    L11:
        r0 = true;
        goto L15
    }
}
