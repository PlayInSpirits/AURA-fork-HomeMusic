package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dw3 {
    public final ew3 n;
    public boolean o;
    public int p;

    public dw3() {
        this.n = new ew3();
        this.o = false;
        this.p = 1;
    }

    public abstract int a();

    public long b(int r1) {
        return -1;
    }

    public int c(int r1) {
        return 0;
    }

    public final void d() {
        this.n.b();
    }

    public final void e(int r2, Comparable r3) {
        this.n.d(r2, 1, r3);
    }

    public void f(RecyclerView r1) {
    }

    public abstract void g(cx3 r1, int r2);

    public void h(cx3 r1, int r2, List r3) {
        g(r1, r2);
    }

    public abstract cx3 i(ViewGroup r1, int r2);

    public void j(RecyclerView r1) {
    }

    public boolean k(cx3 r1) {
        return false;
    }

    public void l(cx3 r1) {
    }

    public void m(cx3 r1) {
    }

    public void n(cx3 r1) {
    }

    public final void o(boolean r2) {
        if (this.n.a() == true) goto L6;
        this.o = r2;
        return;
    L6:
        kf2.o("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
