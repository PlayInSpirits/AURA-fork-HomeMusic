package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class bq {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final ue1 c = new ue1(new CopyOnWriteArrayList(), 0, (Object) null, 8);
    public final sw0 d = new sw0(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public cu4 f;
    public ik3 g;

    public boolean a(gn2 gn2Var) {
        return false;
    }

    public abstract no2 b(mt2 mt2Var, n9 n9Var, long j);

    public final void c(nt2 nt2Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(nt2Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(nt2 nt2Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(nt2Var);
        if (isEmpty) {
            f();
        }
    }

    public cu4 g() {
        return null;
    }

    public abstract gn2 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(nt2 nt2Var, rw4 rw4Var, ik3 ik3Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        rr2.l(looper == null || looper == myLooper);
        this.g = ik3Var;
        cu4 cu4Var = this.f;
        this.a.add(nt2Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(nt2Var);
            l(rw4Var);
        } else if (cu4Var != null) {
            e(nt2Var);
            nt2Var.a(this, cu4Var);
        }
    }

    public abstract void l(rw4 rw4Var);

    public final void m(cu4 cu4Var) {
        this.f = cu4Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nt2) obj).a(this, cu4Var);
        }
    }

    public abstract void n(no2 no2Var);

    public final void o(nt2 nt2Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(nt2Var);
        if (!arrayList.isEmpty()) {
            c(nt2Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(tw0 tw0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            rw0 rw0Var = (rw0) it.next();
            if (rw0Var.b == tw0Var) {
                copyOnWriteArrayList.remove(rw0Var);
            }
        }
    }

    public final void r(st2 st2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.q;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            rt2 rt2Var = (rt2) it.next();
            if (rt2Var.b == st2Var) {
                copyOnWriteArrayList.remove(rt2Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }

    public void s(gn2 gn2Var) {
    }
}
