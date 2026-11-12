package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jh2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ lx2 o;
    public final /* synthetic */ nh2 p;

    public /* synthetic */ jh2(nh2 nh2Var, lx2 lx2Var, int i) {
        this.n = i;
        this.p = nh2Var;
        this.o = lx2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        lx2 lx2Var = this.o;
        nh2 nh2Var = this.p;
        switch (i) {
            case 0:
                int iQ0 = ((LinearLayoutManager) nh2Var.t0.getLayoutManager()).Q0() - 1;
                if (iQ0 >= 0) {
                    Calendar calendarC = a35.c(lx2Var.q.n.n);
                    calendarC.add(2, iQ0);
                    nh2Var.i0(new ix2(calendarC));
                }
                break;
            default:
                int iP0 = ((LinearLayoutManager) nh2Var.t0.getLayoutManager()).P0() + 1;
                if (iP0 < nh2Var.t0.getAdapter().a()) {
                    Calendar calendarC2 = a35.c(lx2Var.q.n.n);
                    calendarC2.add(2, iP0);
                    nh2Var.i0(new ix2(calendarC2));
                }
                break;
        }
    }
}
