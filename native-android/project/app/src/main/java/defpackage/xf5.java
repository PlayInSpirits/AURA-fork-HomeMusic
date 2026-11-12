package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf5 extends kf5 {
    public final bk b;
    public final cr4 c;
    public final pa d;

    public xf5(int r1, bk r2, cr4 r3, pa r4) {
        super(r1);
        this.c = r3;
        this.b = r2;
        this.d = r4;
        if (r1 == 2) goto L5;
        return;
    L5:
        if (r2.p == false) goto L10;
        kf2.n("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        throw null;
    }

    @Override // defpackage.cg5
    public final void a(Status r2) {
        this.d.getClass();
        if (r2.p == null) goto L5;
        Exception r0 = new ResolvableApiException(r2);
    L6:
        this.c.c(r0);
        return;
    L5:
        r0 = new ApiException(r2);
        goto L6
    }

    @Override // defpackage.cg5
    public final void b(Exception r1) {
        this.c.c(r1);
    }

    @Override // defpackage.cg5
    public final void c(gf5 r3) {
        cr4 r0 = this.c;
        bk r1 = this.b;     // Catch: RuntimeException -> L5 RemoteException -> L7 DeadObjectException -> L13
        me r4 = r3.f;     // Catch: RuntimeException -> L5 RemoteException -> L7 DeadObjectException -> L13
        ((zy3) ((bk) r1.r).q).accept(r4, r0);     // Catch: RuntimeException -> L5 RemoteException -> L7 DeadObjectException -> L13
        return;
    L13:
        e = move-exception;
        throw e;
    L7:
        e = move-exception;
        a(cg5.e(e));
        return;
    L5:
        e = move-exception;
        r0.c(e);
    }

    @Override // defpackage.cg5
    public final void d(xc5 r4, boolean r5) {
        Boolean r6 = Boolean.valueOf(r5);
        Map r0 = (Map) r4.p;
        cr4 r3 = this.c;
        r0.put(r3, r6);
        jw r7 = r3.a;
        boolean r2 = false;
        gp3 r1 = new gp3(r4, r3, r2, 23);
        r7.getClass();
        hk5 r8 = new hk5(dr4.a, r1);
        ((mf4) r7.p).i(r8);
        r7.v();
    }

    @Override // defpackage.kf5
    public final boolean f(gf5 r1) {
        return this.b.p;
    }

    @Override // defpackage.kf5
    public final p61[] g(gf5 r1) {
        return (p61[]) this.b.q;
    }
}
