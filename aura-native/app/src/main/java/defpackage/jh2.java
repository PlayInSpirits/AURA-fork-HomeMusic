package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
                int Q0 = ((LinearLayoutManager) nh2Var.t0.getLayoutManager()).Q0() - 1;
                if (Q0 >= 0) {
                    Calendar c = a35.c(lx2Var.q.n.n);
                    c.add(2, Q0);
                    nh2Var.i0(new ix2(c));
                    break;
                }
                break;
            default:
                int P0 = ((LinearLayoutManager) nh2Var.t0.getLayoutManager()).P0() + 1;
                if (P0 < nh2Var.t0.getAdapter().a()) {
                    Calendar c2 = a35.c(lx2Var.q.n.n);
                    c2.add(2, P0);
                    nh2Var.i0(new ix2(c2));
                    break;
                }
                break;
        }
    }
}
