package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c61 extends rw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                int i4 = FastScrollbar.t;
                ((FastScrollbar) obj).c();
                break;
            default:
                e61 e61Var = (e61) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i5 = e61Var.a;
                int iComputeVerticalScrollRange = e61Var.s.computeVerticalScrollRange();
                int i6 = e61Var.r;
                e61Var.t = iComputeVerticalScrollRange - i6 > 0 && i6 >= i5;
                int iComputeHorizontalScrollRange = e61Var.s.computeHorizontalScrollRange();
                int i7 = e61Var.q;
                boolean z = iComputeHorizontalScrollRange - i7 > 0 && i7 >= i5;
                e61Var.u = z;
                boolean z2 = e61Var.t;
                if (z2 || z) {
                    if (z2) {
                        float f = i6;
                        e61Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        e61Var.k = Math.min(i6, (i6 * i6) / iComputeVerticalScrollRange);
                    }
                    if (e61Var.u) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i7;
                        e61Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        e61Var.n = Math.min(i7, (i7 * i7) / iComputeHorizontalScrollRange);
                    }
                    int i8 = e61Var.v;
                    if (i8 == 0 || i8 == 1) {
                        e61Var.l(1);
                    }
                } else if (e61Var.v != 0) {
                    e61Var.l(0);
                }
                break;
        }
    }
}
