package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 implements AutoCloseable {
    public final gn2 n;
    public final dm0 o;
    public final Object p;
    public final ArrayList q;
    public lb4 r;
    public fw2 s;
    public boolean t;

    public hw2(gn2 r1, dm0 r2) {
        this.n = r1;
        this.o = r2;
        this.p = new Object();
        this.q = new ArrayList();
    }

    public final void b() {
        if (this.r != null) goto L12;
        this.r = new lb4();
        fw2 r0 = new fw2(this.o, this.n, new bw2(this), new bw2(this));
        this.s = r0;
        gw2 r5 = fw2.g;
        monitor-enter(r5);
        r5.a.addLast(r0);     // Catch: Throwable -> L9
        r5.a();     // Catch: Throwable -> L9
        monitor-exit(r5);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object r0 = this.p;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.t == false) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        this.t = true;     // Catch: Throwable -> L8
        ArrayList r2 = this.q;     // Catch: Throwable -> L8
        vw1 r3 = yw1.o;     // Catch: Throwable -> L8
        r2.getClass();     // Catch: Throwable -> L8
        new g60(yw1.k(r2), new zq0(1, new qa1(22, this)));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
    }
}
