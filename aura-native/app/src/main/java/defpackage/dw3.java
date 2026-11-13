package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class dw3 {
    public final ew3 n = new ew3();
    public boolean o = false;
    public int p = 1;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public final void d() {
        this.n.b();
    }

    public final void e(int i, Comparable comparable) {
        this.n.d(i, 1, comparable);
    }

    public abstract void g(cx3 cx3Var, int i);

    public void h(cx3 cx3Var, int i, List list) {
        g(cx3Var, i);
    }

    public abstract cx3 i(ViewGroup viewGroup, int i);

    public boolean k(cx3 cx3Var) {
        return false;
    }

    public final void o(boolean z) {
        if (this.n.a()) {
            kf2.o("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.o = z;
        }
    }

    public void f(RecyclerView recyclerView) {
    }

    public void j(RecyclerView recyclerView) {
    }

    public void l(cx3 cx3Var) {
    }

    public void m(cx3 cx3Var) {
    }

    public void n(cx3 cx3Var) {
    }
}
