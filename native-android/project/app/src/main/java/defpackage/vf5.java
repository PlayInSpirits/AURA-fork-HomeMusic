package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vf5 extends cg5 {
    public final wg5 b;

    public vf5(wg5 r2) {
        super(1);
        this.b = r2;
    }

    @Override // defpackage.cg5
    public final void a(Status r2) {
        this.b.g(r2);     // Catch: IllegalStateException -> L4
        return;
    L4:
        e = move-exception;
        Log.w("ApiCallRunner", "Exception reporting failure", e);
    }

    @Override // defpackage.cg5
    public final void b(Exception r4) {
        Status r0 = new Status(10, b11.o(r4.getClass().getSimpleName(), ": ", r4.getLocalizedMessage()), null, null);
        this.b.g(r0);     // Catch: IllegalStateException -> L5
        return;
    L5:
        e = move-exception;
        Log.w("ApiCallRunner", "Exception reporting failure", e);
    }

    @Override // defpackage.cg5
    public final void c(gf5 r6) {
        wg5 r0 = this.b;     // Catch: RuntimeException -> L12
        me r7 = r6.f;     // Catch: RuntimeException -> L12
        r0.getClass();     // Catch: RuntimeException -> L12
        r0.f(r7);     // Catch: RemoteException -> L6 DeadObjectException -> L9 RuntimeException -> L12
        return;
    L9:
        e = move-exception;
        r0.g(new Status(8, e.getLocalizedMessage(), null, null));     // Catch: RuntimeException -> L12
        throw e;     // Catch: RuntimeException -> L12
    L6:
        e = move-exception;
        r0.g(new Status(8, e.getLocalizedMessage(), null, null));     // Catch: RuntimeException -> L12
        return;
    L12:
        e = move-exception;
        b(e);
    }

    @Override // defpackage.cg5
    public final void d(xc5 r2, boolean r3) {
        Boolean r4 = Boolean.valueOf(r3);
        Map r0 = (Map) r2.o;
        wg5 r1 = this.b;
        r0.put(r1, r4);
        r1.a(new cf5(r2, r1));
    }
}
