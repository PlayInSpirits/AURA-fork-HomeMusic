package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements of4 {
    public final cc1 n;
    public boolean o;
    public final /* synthetic */ hq1 p;

    public cq1(hq1 r2) {
        this.p = r2;
        this.n = new cc1(((ew) r2.e).timeout());
    }

    @Override // defpackage.of4
    public final void L(tv r4, long r5) {
        ew r0 = (ew) this.p.e;
        if (this.o == false) goto L5;
        kf2.o("closed");
        return;
    L5:
        if (r5 != 0) goto L7;
        return;
    L7:
        r0.C(r5);
        r0.y("\r\n");
        r0.L(r4, r5);
        r0.y("\r\n");
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.o == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        this.o = true;     // Catch: Throwable -> L11
        ((ew) this.p.e).y("0\r\n\r\n");     // Catch: Throwable -> L11
        cc1 r0 = this.n;     // Catch: Throwable -> L11
        fu4 r1 = r0.e;     // Catch: Throwable -> L11
        r0.e = fu4.d;     // Catch: Throwable -> L11
        r1.a();     // Catch: Throwable -> L11
        r1.b();     // Catch: Throwable -> L11
        this.p.a = 3;     // Catch: Throwable -> L11
        monitor-exit(this);
    }

    @Override // defpackage.of4, java.io.Flushable
    public final synchronized void flush() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.o == false) goto L7;
        monitor-exit(this);
        return;
    L7:
        ((ew) this.p.e).flush();     // Catch: Throwable -> L10
        monitor-exit(this);
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n;
    }
}
