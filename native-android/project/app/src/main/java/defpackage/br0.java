package defpackage;

import android.os.Bundle;
import androidx.work.impl.WorkerStoppedException;
import java.io.IOException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br0(int i, Object obj, Object obj2) {
        super(1);
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        r23 r23VarC;
        switch (this.n) {
            case 0:
                ((IOException) obj).getClass();
                jr0 jr0Var = (jr0) this.o;
                ll llVar = (ll) this.p;
                synchronized (jr0Var) {
                    llVar.d();
                }
                return j15.a;
            case 1:
                z23 z23Var = (z23) obj;
                v23 v23Var = (v23) this.p;
                z23Var.getClass();
                x23 x23Var = z23Var.a;
                x23Var.f = 0;
                x23Var.g = 0;
                r23 r23Var = (r23) this.o;
                if (r23Var instanceof t23) {
                    int i = r23.w;
                    for (r23 r23Var2 : fa4.c0(k5.y, r23Var)) {
                        r23 r23VarG = v23Var.g();
                        if (h12.c(r23Var2, r23VarG != null ? r23VarG.o : null)) {
                        }
                    }
                    int i2 = t23.A;
                    z23Var.b = jz4.s(v23Var.i()).u;
                    z23Var.c = true;
                }
                return j15.a;
            case 2:
                a23 a23Var = (a23) obj;
                t43 t43Var = (t43) this.o;
                a23Var.getClass();
                r23 r23Var3 = a23Var.o;
                if (r23Var3 == null) {
                    r23Var3 = null;
                }
                if (r23Var3 == null || (r23VarC = t43Var.c(r23Var3, a23Var.c(), (y23) this.p)) == null) {
                    return null;
                }
                if (r23VarC.equals(r23Var3)) {
                    return a23Var;
                }
                d23 d23VarB = t43Var.b();
                Bundle bundleA = r23VarC.a(a23Var.c());
                v23 v23Var2 = d23VarB.h;
                return tv1.v(v23Var2.a, r23VarC, bundleA, v23Var2.j(), v23Var2.o);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                tc0 tc0Var = (tc0) obj;
                tc0Var.getClass();
                ((sk4) this.o).f(null);
                ((rq3) this.p).d(tc0Var);
                return j15.a;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    ((oc2) this.o).c.compareAndSet(-256, ((WorkerStoppedException) th).n);
                }
                ((ic2) this.p).cancel(false);
                return j15.a;
        }
    }
}
