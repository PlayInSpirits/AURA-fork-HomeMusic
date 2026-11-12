package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ rq1 o;
    public final /* synthetic */ int p;

    public /* synthetic */ oq1(rq1 r1, int r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.n) {
            case 0: goto L24;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        this.o.x.getClass();
        rq1 r0 = this.o;
        int r3 = this.p;
        monitor-enter(r0);
        r0.L.remove(Integer.valueOf(r3));     // Catch: Throwable -> L10
        monitor-exit(r0);
        return j15.a;
    L10:
        th = move-exception;
        throw th;
    L13:
        this.o.x.getClass();
        rq1 r1 = this.o;
        int r4 = this.p;
        r1.J.u(r4, b21.u);     // Catch: IOException -> L35
        monitor-enter(r1);     // Catch: IOException -> L35
        r1.L.remove(Integer.valueOf(r4));     // Catch: Throwable -> L19
        monitor-exit(r1);     // Catch: IOException -> L35
        goto L23
    L19:
        th = move-exception;
        throw th;     // Catch: IOException -> L35
    L23:
        return j15.a;
    L24:
        this.o.x.getClass();
        rq1 r2 = this.o;
        int r5 = this.p;
        r2.J.u(r5, b21.u);     // Catch: IOException -> L36
        monitor-enter(r2);     // Catch: IOException -> L36
        r2.L.remove(Integer.valueOf(r5));     // Catch: Throwable -> L30
        monitor-exit(r2);     // Catch: IOException -> L36
        goto L34
    L30:
        th = move-exception;
        throw th;     // Catch: IOException -> L36
    L34:
        return j15.a;
    }

    public oq1(rq1 r1, int r2, List r3, boolean r4) {
        this.n = 0;
        this.o = r1;
        this.p = r2;
        super(0);
    }
}
