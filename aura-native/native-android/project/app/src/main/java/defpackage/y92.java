package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y92 implements s92, aa2 {
    public final HashSet n = new HashSet();
    public final ea2 o;

    public y92(ea2 ea2Var) {
        this.o = ea2Var;
        ea2Var.a(this);
    }

    @Override // defpackage.s92
    public final void a(z92 z92Var) {
        this.n.remove(z92Var);
    }

    @Override // defpackage.s92
    public final void f(z92 z92Var) {
        this.n.add(z92Var);
        r92 r92Var = this.o.h;
        if (r92Var == r92.n) {
            z92Var.h();
        } else if (r92Var.compareTo(r92.q) >= 0) {
            z92Var.n();
        } else {
            z92Var.j();
        }
    }

    @f93(q92.ON_DESTROY)
    public void onDestroy(ba2 ba2Var) {
        ArrayList arrayListB = e35.B(this.n);
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ((z92) obj).h();
        }
        ba2Var.h().f(this);
    }

    @f93(q92.ON_START)
    public void onStart(ba2 ba2Var) {
        ArrayList arrayListB = e35.B(this.n);
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ((z92) obj).n();
        }
    }

    @f93(q92.ON_STOP)
    public void onStop(ba2 ba2Var) {
        ArrayList arrayListB = e35.B(this.n);
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ((z92) obj).j();
        }
    }
}
