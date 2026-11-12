package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p80 extends bq {
    public final HashMap h = new HashMap();
    public Handler i;
    public rw4 j;

    @Override // defpackage.bq
    public final void d() {
        for (o80 o80Var : this.h.values()) {
            o80Var.a.c(o80Var.b);
        }
    }

    @Override // defpackage.bq
    public final void f() {
        for (o80 o80Var : this.h.values()) {
            o80Var.a.e(o80Var.b);
        }
    }

    @Override // defpackage.bq
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((o80) it.next()).a.j();
        }
    }

    @Override // defpackage.bq
    public void p() {
        HashMap map = this.h;
        for (o80 o80Var : map.values()) {
            bq bqVar = o80Var.a;
            n80 n80Var = o80Var.c;
            bqVar.o(o80Var.b);
            bqVar.r(n80Var);
            bqVar.q(n80Var);
        }
        map.clear();
    }

    public abstract mt2 t(Object obj, mt2 mt2Var);

    public long u(long j, Object obj) {
        return j;
    }

    public int v(int i, Object obj) {
        return i;
    }

    public abstract void w(Object obj, bq bqVar, cu4 cu4Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m80, nt2] */
    public final void x(final Integer num, bq bqVar) {
        HashMap map = this.h;
        rr2.l(!map.containsKey(num));
        ?? r1 = new nt2() { // from class: m80
            @Override // defpackage.nt2
            public final void a(bq bqVar2, cu4 cu4Var) {
                this.a.w(num, bqVar2, cu4Var);
            }
        };
        n80 n80Var = new n80(this, num);
        map.put(num, new o80(bqVar, r1, n80Var));
        Handler handler = this.i;
        handler.getClass();
        bqVar.getClass();
        ue1 ue1Var = bqVar.c;
        ue1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ue1Var.q;
        rt2 rt2Var = new rt2();
        rt2Var.a = handler;
        rt2Var.b = n80Var;
        copyOnWriteArrayList.add(rt2Var);
        Handler handler2 = this.i;
        handler2.getClass();
        sw0 sw0Var = bqVar.d;
        sw0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = sw0Var.c;
        rw0 rw0Var = new rw0();
        rw0Var.a = handler2;
        rw0Var.b = n80Var;
        copyOnWriteArrayList2.add(rw0Var);
        rw4 rw4Var = this.j;
        ik3 ik3Var = this.g;
        ik3Var.getClass();
        bqVar.k(r1, rw4Var, ik3Var);
        if (this.b.isEmpty()) {
            bqVar.c(r1);
        }
    }

    public final void y(Integer num) {
        o80 o80Var = (o80) this.h.remove(num);
        o80Var.getClass();
        bq bqVar = o80Var.a;
        bqVar.o(o80Var.b);
        n80 n80Var = o80Var.c;
        bqVar.r(n80Var);
        bqVar.q(n80Var);
    }
}
