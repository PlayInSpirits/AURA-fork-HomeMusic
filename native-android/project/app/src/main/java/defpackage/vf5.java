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

    public vf5(wg5 wg5Var) {
        super(1);
        this.b = wg5Var;
    }

    @Override // defpackage.cg5
    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.cg5
    public final void b(Exception exc) {
        try {
            this.b.g(new Status(10, b11.o(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.cg5
    public final void c(gf5 gf5Var) throws DeadObjectException {
        try {
            wg5 wg5Var = this.b;
            me meVar = gf5Var.f;
            wg5Var.getClass();
            try {
                wg5Var.f(meVar);
            } catch (DeadObjectException e) {
                wg5Var.g(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                wg5Var.g(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.cg5
    public final void d(xc5 xc5Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) xc5Var.o;
        wg5 wg5Var = this.b;
        map.put(wg5Var, boolValueOf);
        wg5Var.a(new cf5(xc5Var, wg5Var));
    }
}
