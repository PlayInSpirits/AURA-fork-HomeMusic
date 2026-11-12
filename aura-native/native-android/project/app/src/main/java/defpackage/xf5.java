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

    public xf5(int i, bk bkVar, cr4 cr4Var, pa paVar) {
        super(i);
        this.c = cr4Var;
        this.b = bkVar;
        this.d = paVar;
        if (i == 2 && bkVar.p) {
            kf2.n("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.cg5
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(status.p != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // defpackage.cg5
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.cg5
    public final void c(gf5 gf5Var) throws DeadObjectException {
        cr4 cr4Var = this.c;
        try {
            bk bkVar = this.b;
            ((zy3) ((bk) bkVar.r).q).accept(gf5Var.f, cr4Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(cg5.e(e2));
        } catch (RuntimeException e3) {
            cr4Var.c(e3);
        }
    }

    @Override // defpackage.cg5
    public final void d(xc5 xc5Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) xc5Var.p;
        cr4 cr4Var = this.c;
        map.put(cr4Var, boolValueOf);
        jw jwVar = cr4Var.a;
        gp3 gp3Var = new gp3(xc5Var, cr4Var, false, 23);
        jwVar.getClass();
        ((mf4) jwVar.p).i(new hk5(dr4.a, gp3Var));
        jwVar.v();
    }

    @Override // defpackage.kf5
    public final boolean f(gf5 gf5Var) {
        return this.b.p;
    }

    @Override // defpackage.kf5
    public final p61[] g(gf5 gf5Var) {
        return (p61[]) this.b.q;
    }
}
