package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag5 extends kf5 {
    public final cr4 b;

    public ag5(cr4 r2) {
        super(4);
        this.b = r2;
    }

    @Override // defpackage.cg5
    public final void a(Status r2) {
        ApiException r0 = new ApiException(r2);
        this.b.c(r0);
    }

    @Override // defpackage.cg5
    public final void b(Exception r1) {
        this.b.c(r1);
    }

    @Override // defpackage.cg5
    public final void c(gf5 r2) {
        h(r2);     // Catch: RuntimeException -> L4 RemoteException -> L7 DeadObjectException -> L10
        return;
    L10:
        e = move-exception;
        a(cg5.e(e));
        throw e;
    L7:
        e = move-exception;
        a(cg5.e(e));
        return;
    L4:
        e = move-exception;
        this.b.c(e);
    }

    @Override // defpackage.cg5
    public final /* bridge */ /* synthetic */ void d(xc5 r1, boolean r2) {
    }

    @Override // defpackage.kf5
    public final boolean f(gf5 r1) {
        if (r1.j.get(null) != null) goto L5;
        return false;
    L5:
        kf2.k();
        return false;
    }

    @Override // defpackage.kf5
    public final p61[] g(gf5 r1) {
        if (r1.j.get(null) != null) goto L5;
        return null;
    L5:
        kf2.k();
        return null;
    }

    public final void h(gf5 r3) {
        if (r3.j.remove(null) != null) goto L18;
        cr4 r2 = this.b;
        Boolean r4 = Boolean.FALSE;
        jw r5 = r2.a;
        Object r0 = r5.o;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L7:
        if (r5.n == false) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        r5.n = true;     // Catch: Throwable -> L10
        r5.q = r4;     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        ((mf4) r5.p).j(r5);
        return;
    L18:
        kf2.k();
    }
}
