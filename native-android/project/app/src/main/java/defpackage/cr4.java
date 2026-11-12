package defpackage;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr4 {
    public final jw a;

    public cr4() {
        jw r0 = new jw();
        r0.o = new Object();
        r0.p = new mf4(7);
        this.a = r0;
    }

    public final void a(ApiException r3) {
        jw r2 = this.a;
        r2.getClass();
        Object r0 = r2.o;
        monitor-enter(r0);
        r2.u();     // Catch: Throwable -> L8
        r2.n = true;     // Catch: Throwable -> L8
        r2.r = r3;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        ((mf4) r2.p).j(r2);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void b(Object r3) {
        jw r2 = this.a;
        Object r0 = r2.o;
        monitor-enter(r0);
        r2.u();     // Catch: Throwable -> L8
        r2.n = true;     // Catch: Throwable -> L8
        r2.q = r3;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        ((mf4) r2.p).j(r2);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void c(Exception r3) {
        jw r2 = this.a;
        r2.getClass();
        ji2.n(r3, "Exception must not be null");
        Object r0 = r2.o;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (r2.n == false) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        r2.n = true;     // Catch: Throwable -> L8
        r2.r = r3;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        ((mf4) r2.p).j(r2);
    }
}
