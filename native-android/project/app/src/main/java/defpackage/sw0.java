package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw0 {
    public final int a;
    public final mt2 b;
    public final CopyOnWriteArrayList c;

    public sw0(CopyOnWriteArrayList r1, int r2, mt2 r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    public final void a(tv1 r6) {
        Iterator r0 = this.c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        rw0 r1 = (rw0) r0.next();
        tw0 r2 = r1.b;
        f35.W(r1.a, new v6(this, r2, r6, 8));
        goto L4
    }

    public final void b() {
        Iterator r0 = this.c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        rw0 r1 = (rw0) r0.next();
        tw0 r2 = r1.b;
        f35.W(r1.a, new qw0(this, r2, 1));
        goto L4
    }

    public final void c(int r6) {
        Iterator r0 = this.c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        rw0 r1 = (rw0) r0.next();
        tw0 r2 = r1.b;
        f35.W(r1.a, new gk(this, r2, r6, 4));
        goto L4
    }

    public final void d(Exception r6) {
        Iterator r0 = this.c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        rw0 r1 = (rw0) r0.next();
        tw0 r2 = r1.b;
        f35.W(r1.a, new v6(this, r2, r6, 7));
        goto L4
    }

    public final void e() {
        Iterator r0 = this.c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        rw0 r1 = (rw0) r0.next();
        tw0 r2 = r1.b;
        f35.W(r1.a, new qw0(this, r2, 0));
        goto L4
    }
}
