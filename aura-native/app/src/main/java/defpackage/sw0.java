package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sw0 {
    public final int a;
    public final mt2 b;
    public final CopyOnWriteArrayList c;

    public sw0(CopyOnWriteArrayList copyOnWriteArrayList, int i, mt2 mt2Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = mt2Var;
    }

    public final void a(tv1 tv1Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            f35.W(rw0Var.a, new v6(this, rw0Var.b, tv1Var, 8));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            f35.W(rw0Var.a, new qw0(this, rw0Var.b, 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            f35.W(rw0Var.a, new gk(this, rw0Var.b, i, 4));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            f35.W(rw0Var.a, new v6(this, rw0Var.b, exc, 7));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            f35.W(rw0Var.a, new qw0(this, rw0Var.b, 0));
        }
    }
}
