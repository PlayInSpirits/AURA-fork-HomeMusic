package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq2 extends oq2 {
    public final Object a;
    public Executor b;
    public zh0 c;
    public sp2 d;
    public ArrayList e;

    public nq2() {
        this.a = new Object();
    }

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(sp2 r9, ArrayList r10) {
        if (r9 == null) goto L15;
        Object r1 = this.a;
        monitor-enter(r1);
        Executor r0 = this.b;     // Catch: Throwable -> L8
        if (r0 == null) goto L10;
        r0.execute(new t6(this, this.c, r9, r10, 19));     // Catch: Throwable -> L8
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L8
        return;
    L10:
        this.d = r9;     // Catch: Throwable -> L8
        this.e = new ArrayList(r10);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    L15:
        nz2.n("groupRoute must not be null");
    }

    public abstract void m(String r1);

    public abstract void n(String r1);

    public abstract void o(ArrayList r1);
}
