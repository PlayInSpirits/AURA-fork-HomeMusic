package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ y8(int i, Object obj, Object obj2) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i2) {
            case 0:
                a9 a9Var = (a9) obj;
                d9 d9Var = (d9) obj2;
                a9Var.r.onClick(d9Var.b, i);
                if (!a9Var.v) {
                    d9Var.b.dismiss();
                }
                break;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj2;
                jx2 jx2VarA = materialCalendarGridView.a();
                if (i >= jx2VarA.a() && i <= jx2VarA.c()) {
                    om1 om1Var = ((lx2) obj).s;
                    Long item = materialCalendarGridView.a().getItem(i);
                    long jLongValue = item.longValue();
                    nh2 nh2Var = (nh2) om1Var.o;
                    if (jLongValue >= nh2Var.o0.p.n) {
                        nh2Var.n0.n = item;
                        Iterator it = nh2Var.l0.iterator();
                        while (it.hasNext()) {
                            ((wh2) it.next()).b(nh2Var.n0.n);
                        }
                        nh2Var.t0.getAdapter().d();
                        RecyclerView recyclerView = nh2Var.s0;
                        if (recyclerView != null) {
                            recyclerView.getAdapter().d();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
