package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p80 extends bq {
    public final HashMap h;
    public Handler i;
    public rw4 j;

    public p80() {
        this.h = new HashMap();
    }

    @Override // defpackage.bq
    public final void d() {
        Iterator r2 = this.h.values().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        o80 r0 = (o80) r2.next();
        r0.a.c(r0.b);
        goto L4
    }

    @Override // defpackage.bq
    public final void f() {
        Iterator r2 = this.h.values().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        o80 r0 = (o80) r2.next();
        r0.a.e(r0.b);
        goto L4
    }

    @Override // defpackage.bq
    public void j() {
        Iterator r1 = this.h.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((o80) r1.next()).a.j();
        goto L4
    }

    @Override // defpackage.bq
    public void p() {
        HashMap r4 = this.h;
        Iterator r0 = r4.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        o80 r1 = (o80) r0.next();
        bq r2 = r1.a;
        n80 r3 = r1.c;
        r2.o(r1.b);
        r2.r(r3);
        r2.q(r3);
        goto L4
    L6:
        r4.clear();
    }

    public abstract mt2 t(Object r1, mt2 r2);

    public long u(long r1, Object r3) {
        return r1;
    }

    public int v(int r1, Object r2) {
        return r1;
    }

    public abstract void w(Object r1, bq r2, cu4 r3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m80, nt2] */
    public final void x(final Integer r5, bq r6) {
        HashMap r0 = this.h;
        rr2.l(!r0.containsKey(r5));
        ?? r1 = new m80(this, r5);
        n80 r2 = new n80(this, r5);
        r0.put(r5, new o80(r6, r1, r2));
        Handler r7 = this.i;
        r7.getClass();
        r6.getClass();
        ue1 r3 = r6.c;
        r3.getClass();
        CopyOnWriteArrayList r4 = (CopyOnWriteArrayList) r3.q;
        rt2 r8 = new rt2();
        r8.a = r7;
        r8.b = r2;
        r4.add(r8);
        Handler r9 = this.i;
        r9.getClass();
        sw0 r10 = r6.d;
        r10.getClass();
        CopyOnWriteArrayList r11 = r10.c;
        rw0 r12 = new rw0();
        r12.a = r9;
        r12.b = r2;
        r11.add(r12);
        rw4 r13 = this.j;
        ik3 r14 = this.g;
        r14.getClass();
        r6.k(r1, r13, r14);
        if (this.b.isEmpty() == false) goto L6;
        r6.c(r1);
        return;
    }

    public final void y(Integer r2) {
        o80 r1 = (o80) this.h.remove(r2);
        r1.getClass();
        bq r3 = r1.a;
        r3.o(r1.b);
        n80 r4 = r1.c;
        r3.r(r4);
        r3.q(r4);
    }
}
