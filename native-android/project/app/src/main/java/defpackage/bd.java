package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bd extends pe0 {
    public static final zc A = null;
    public static final rp4 z = null;
    public final Choreographer p;
    public final Handler q;
    public final Object r;
    public final ii s;
    public ArrayList t;
    public ArrayList u;
    public boolean v;
    public boolean w;
    public final ad x;
    public final ed y;

    static {
        z = new rp4(new t5(6));
        A = new zc(0);
    }

    public bd(Choreographer r1, Handler r2) {
        this.p = r1;
        this.q = r2;
        this.r = new Object();
        this.s = new ii();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.x = new ad(this);
        this.y = new ed(r1, this);
    }

    public static final void a0(bd r4) {
    L2:
        Object r0 = r4.r;
        monitor-enter(r0);
        ii r1 = r4.s;     // Catch: Throwable -> L37
        if (r1.isEmpty() == false) goto L7;
        Object r2 = null;
    L8:
        Runnable r3 = (Runnable) r2;     // Catch: Throwable -> L37
        monitor-exit(r0);
    L10:
        if (r3 == null) goto L23;
        r3.run();
        Object r5 = r4.r;
        monitor-enter(r5);
        ii r6 = r4.s;     // Catch: Throwable -> L20
        if (r6.isEmpty() == false) goto L16;
        Object r7 = null;
    L17:
        r3 = (Runnable) r7;     // Catch: Throwable -> L20
        monitor-exit(r5);
        goto L10
    L16:
        r7 = r6.removeFirst();     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    L23:
        Object r8 = r4.r;
        monitor-enter(r8);
    L29:
        th = move-exception;
        throw th;
    L26:
        if (r4.s.isEmpty() == false) goto L31;
        boolean r9 = false;
        r4.v = false;     // Catch: Throwable -> L29
    L32:
        monitor-exit(r8);
        if (r9 == true) goto L2;
        return;
    L31:
        r9 = true;
        goto L32
    L7:
        r2 = r1.removeFirst();     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pe0
    public final void W(ne0 r3, Runnable r4) {
        Object r5 = this.r;
        monitor-enter(r5);
        this.s.addLast(r4);     // Catch: Throwable -> L10
        if (this.v == true) goto L12;
        this.v = true;     // Catch: Throwable -> L10
        this.q.post(this.x);     // Catch: Throwable -> L10
        if (this.w == true) goto L12;
        this.w = true;     // Catch: Throwable -> L10
        this.p.postFrameCallback(this.x);     // Catch: Throwable -> L10
    L12:
        monitor-exit(r5);
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
