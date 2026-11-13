package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mh2 extends rw3 {
    public final /* synthetic */ lx2 a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ nh2 c;

    public mh2(nh2 nh2Var, lx2 lx2Var, MaterialButton materialButton) {
        this.c = nh2Var;
        this.a = lx2Var;
        this.b = materialButton;
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        dy dyVar = this.a.q;
        nh2 nh2Var = this.c;
        RecyclerView recyclerView2 = nh2Var.t0;
        int P0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).P0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).Q0();
        Calendar c = a35.c(dyVar.n.n);
        c.add(2, P0);
        nh2Var.p0 = new ix2(c);
        Calendar c2 = a35.c(dyVar.n.n);
        c2.add(2, P0);
        c2.set(5, 1);
        Calendar c3 = a35.c(c2);
        c3.get(2);
        c3.get(1);
        c3.getMaximum(7);
        c3.getActualMaximum(5);
        c3.getTimeInMillis();
        this.b.setText(a35.b("yMMMM", Locale.getDefault()).format(new Date(c3.getTimeInMillis())));
    }
}
