package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh2 extends kw3 {
    public final Calendar a = a35.e(null);
    public final Calendar b = a35.e(null);
    public final /* synthetic */ nh2 c;

    public lh2(nh2 nh2Var) {
        this.c = nh2Var;
    }

    @Override // defpackage.kw3
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        lh2 lh2Var = this;
        if ((recyclerView.getAdapter() instanceof ke5) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            ke5 ke5Var = (ke5) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            nh2 nh2Var = lh2Var.c;
            nh2Var.n0.getClass();
            ArrayList arrayList = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ld3 ld3Var = (ld3) obj;
                Object obj2 = ld3Var.a;
                Object obj3 = ld3Var.b;
                if (obj2 != null) {
                    if (obj3 != null) {
                        long jLongValue = ((Long) obj2).longValue();
                        Calendar calendar = lh2Var.a;
                        calendar.setTimeInMillis(jLongValue);
                        long jLongValue2 = ((Long) obj3).longValue();
                        Calendar calendar2 = lh2Var.b;
                        calendar2.setTimeInMillis(jLongValue2);
                        int i2 = calendar.get(1) - ke5Var.q.o0.n.p;
                        int i3 = calendar2.get(1) - ke5Var.q.o0.n.p;
                        View viewQ = gridLayoutManager.q(i2);
                        View viewQ2 = gridLayoutManager.q(i3);
                        int i4 = gridLayoutManager.F;
                        int i5 = i2 / i4;
                        int i6 = i3 / i4;
                        for (int i7 = i5; i7 <= i6; i7++) {
                            View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i7);
                            if (viewQ3 != null) {
                                int top = viewQ3.getTop() + ((Rect) ((c6) nh2Var.r0.d).b).top;
                                int bottom = viewQ3.getBottom() - ((Rect) ((c6) nh2Var.r0.d).b).bottom;
                                canvas.drawRect((i7 != i5 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), top, (i7 != i6 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), bottom, (Paint) nh2Var.r0.h);
                            }
                        }
                    }
                }
                lh2Var = this;
            }
        }
    }
}
