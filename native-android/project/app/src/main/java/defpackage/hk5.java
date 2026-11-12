package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk5 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public hk5(Executor r2, cg0 r3) {
        this.a = 2;
        this.c = new Object();
        this.b = r2;
        this.d = r3;
    }

    public final void a(jw r4) {
        switch(this.a) {
            case 0: goto L24;
            case 1: goto L15;
            default: goto L5;
        };
    L24:
        Object r0 = this.c;
        monitor-enter(r0);
        monitor-exit(r0);     // Catch: Throwable -> L29
        this.b.execute(new qf5(4, this, r4));
        return;
    L29:
        th = move-exception;
        throw th;
    L5:
        if (r4.p() == false) goto L13;
        Object r1 = this.c;
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L10
        this.b.execute(new qf5(6, this, r4));
        return;
    L10:
        th = move-exception;
        throw th;
    L13:
        return;
    L15:
        if (r4.p() == true) goto L23;
        Object r2 = this.c;
        monitor-enter(r2);
        monitor-exit(r2);     // Catch: Throwable -> L20
        this.b.execute(new qf5(5, this, r4));
        return;
    L20:
        th = move-exception;
        throw th;
    }

    public hk5(Executor r2, b93 r3) {
        this.a = 0;
        this.c = new Object();
        this.b = r2;
        this.d = r3;
    }

    public hk5(Executor r2, e93 r3) {
        this.a = 1;
        this.c = new Object();
        this.b = r2;
        this.d = r3;
    }
}
