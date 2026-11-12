package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cw3 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ cw3(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void a(cx3 cx3Var, n50 n50Var, n50 n50Var2) {
        boolean zG;
        cx3Var.p(false);
        RecyclerView recyclerView = this.a;
        pl0 pl0Var = (pl0) recyclerView.c0;
        if (n50Var != null) {
            pl0Var.getClass();
            int i = n50Var.a;
            int i2 = n50Var2.a;
            if (i == i2 && n50Var.b == n50Var2.b) {
                pl0Var.l(cx3Var);
                cx3Var.a.setAlpha(0.0f);
                pl0Var.i.add(cx3Var);
                zG = true;
            } else {
                zG = pl0Var.g(cx3Var, i, n50Var.b, i2, n50Var2.b);
            }
        } else {
            pl0Var.l(cx3Var);
            cx3Var.a.setAlpha(0.0f);
            pl0Var.i.add(cx3Var);
            zG = true;
        }
        if (zG) {
            recyclerView.Y();
        }
    }

    public void b(cx3 cx3Var, n50 n50Var, n50 n50Var2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.p.l(cx3Var);
        recyclerView.h(cx3Var);
        cx3Var.p(false);
        pl0 pl0Var = (pl0) recyclerView.c0;
        pl0Var.getClass();
        int i = n50Var.a;
        int i2 = n50Var.b;
        View view = cx3Var.a;
        int left = n50Var2 == null ? view.getLeft() : n50Var2.a;
        int top = n50Var2 == null ? view.getTop() : n50Var2.b;
        if (cx3Var.j() || (i == left && i2 == top)) {
            pl0Var.l(cx3Var);
            pl0Var.h.add(cx3Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = pl0Var.g(cx3Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.Y();
        }
    }
}
