package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag5 extends kf5 {
    public final cr4 b;

    public ag5(cr4 cr4Var) {
        super(4);
        this.b = cr4Var;
    }

    @Override // defpackage.cg5
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.cg5
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.cg5
    public final void c(gf5 gf5Var) throws DeadObjectException {
        try {
            h(gf5Var);
        } catch (DeadObjectException e) {
            a(cg5.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(cg5.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.cg5
    public final /* bridge */ /* synthetic */ void d(xc5 xc5Var, boolean z) {
    }

    @Override // defpackage.kf5
    public final boolean f(gf5 gf5Var) {
        if (gf5Var.j.get(null) == null) {
            return false;
        }
        kf2.k();
        return false;
    }

    @Override // defpackage.kf5
    public final p61[] g(gf5 gf5Var) {
        if (gf5Var.j.get(null) == null) {
            return null;
        }
        kf2.k();
        return null;
    }

    public final void h(gf5 gf5Var) {
        if (gf5Var.j.remove(null) != null) {
            kf2.k();
            return;
        }
        cr4 cr4Var = this.b;
        Boolean bool = Boolean.FALSE;
        jw jwVar = cr4Var.a;
        synchronized (jwVar.o) {
            try {
                if (jwVar.n) {
                    return;
                }
                jwVar.n = true;
                jwVar.q = bool;
                ((mf4) jwVar.p).j(jwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
