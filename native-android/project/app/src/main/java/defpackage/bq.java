package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq {
    public final ArrayList a;
    public final HashSet b;
    public final ue1 c;
    public final sw0 d;
    public Looper e;
    public cu4 f;
    public ik3 g;

    public bq() {
        this.a = new ArrayList(1);
        this.b = new HashSet(1);
        int r3 = 0;
        Object r4 = null;
        this.c = new ue1(new CopyOnWriteArrayList(), r3, r4, 8);
        this.d = new sw0(new CopyOnWriteArrayList(), 0, null);
    }

    public boolean a(gn2 r1) {
        return false;
    }

    public abstract no2 b(mt2 r1, n9 r2, long r3);

    public final void c(nt2 r3) {
        HashSet r0 = this.b;
        boolean r1 = r0.isEmpty();
        r0.remove(r3);
        if (r1 == false) goto L5;
        return;
    L5:
        if (r0.isEmpty() == false) goto L9;
        d();
        return;
    }

    public void d() {
    }

    public final void e(nt2 r3) {
        this.e.getClass();
        HashSet r0 = this.b;
        boolean r1 = r0.isEmpty();
        r0.add(r3);
        if (r1 == false) goto L6;
        f();
        return;
    }

    public void f() {
    }

    public cu4 g() {
        return null;
    }

    public abstract gn2 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(nt2 r3, rw4 r4, ik3 r5) {
        Looper r0 = Looper.myLooper();
        Looper r1 = this.e;
        if (r1 == null) goto L7;
        if (r1 == r0) goto L7;
        boolean r2 = false;
    L8:
        rr2.l(r2);
        this.g = r5;
        cu4 r6 = this.f;
        this.a.add(r3);
        if (this.e != null) goto L12;
        this.e = r0;
        this.b.add(r3);
        l(r4);
        return;
    L12:
        if (r6 == null) goto L15;
        e(r3);
        r3.a(this, r6);
        return;
    L15:
        return;
    L7:
        r2 = true;
        goto L8
    }

    public abstract void l(rw4 r1);

    public final void m(cu4 r5) {
        this.f = r5;
        ArrayList r0 = this.a;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((nt2) r3).a(this, r5);
        goto L3
    }

    public abstract void n(no2 r1);

    public final void o(nt2 r2) {
        ArrayList r0 = this.a;
        r0.remove(r2);
        if (r0.isEmpty() == false) goto L6;
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
        return;
    L6:
        c(r2);
    }

    public abstract void p();

    public final void q(tw0 r4) {
        CopyOnWriteArrayList r3 = this.d.c;
        Iterator r0 = r3.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        rw0 r1 = (rw0) r0.next();
        if (r1.b != r4) goto L4;
        r3.remove(r1);
        goto L4
    }

    public final void r(st2 r4) {
        CopyOnWriteArrayList r3 = (CopyOnWriteArrayList) this.c.q;
        Iterator r0 = r3.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        rt2 r1 = (rt2) r0.next();
        if (r1.b != r4) goto L4;
        r3.remove(r1);
        goto L4
    }

    public void s(gn2 r1) {
    }
}
