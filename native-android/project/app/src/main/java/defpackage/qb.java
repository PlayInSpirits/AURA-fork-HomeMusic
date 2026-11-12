package defpackage;

import android.view.DragEvent;
import android.view.View;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qb implements View.OnDragListener, nu0 {
    public final pu0 a;
    public final qi b;
    public final pb c;

    public qb() {
        pu0 pu0Var = new pu0();
        pu0Var.D = 0L;
        this.a = pu0Var;
        this.b = new qi(0);
        this.c = new pb(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        zg5 zg5Var = new zg5(dragEvent);
        int action = dragEvent.getAction();
        qx4 qx4Var = qx4.n;
        qi qiVar = this.b;
        pu0 pu0Var = this.a;
        switch (action) {
            case 1:
                fx3 fx3Var = new fx3();
                x xVar = new x(zg5Var, pu0Var, fx3Var);
                if (xVar.invoke(pu0Var) == qx4Var) {
                    gh0.J(pu0Var, xVar);
                }
                boolean z = fx3Var.n;
                qiVar.getClass();
                ki kiVar = new ki(qiVar);
                while (kiVar.hasNext()) {
                    ((pu0) kiVar.next()).u0();
                }
                return z;
            case 2:
                pu0Var.t0(zg5Var);
                return false;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return pu0Var.q0();
            case 4:
                x xVar2 = new x(10, zg5Var);
                if (xVar2.invoke(pu0Var) == qx4Var) {
                    gh0.J(pu0Var, xVar2);
                }
                qiVar.clear();
                return false;
            case 5:
                pu0Var.r0();
                return false;
            case 6:
                pu0Var.s0();
                return false;
            default:
                return false;
        }
    }
}
