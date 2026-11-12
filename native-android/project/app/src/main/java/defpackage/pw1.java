package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pw1 extends qw1 {
    public Object[] a;
    public int b;
    public boolean c;

    public pw1(int r2) {
        uc5.f(r2, "initialCapacity");
        this.a = new Object[r2];
        this.b = 0;
    }

    public final void c(Object r4) {
        r4.getClass();
        e(1);
        Object[] r0 = this.a;
        int r1 = this.b;
        this.b = r1 + 1;
        r0[r1] = r4;
    }

    public final void d(Iterable r3) {
        if ((r3 instanceof Collection) == false) goto L8;
        Collection r0 = (Collection) r3;
        e(r0.size());
        if ((r0 instanceof rw1) == false) goto L8;
        Object[] r4 = this.a;
        this.b = ((rw1) r0).b(this.b, r4);
        return;
    L8:
        Iterator r5 = r3.iterator();
    L10:
        if (r5.hasNext() == false) goto L12;
        a(r5.next());
        goto L10
    }

    public final void e(int r4) {
        Object[] r0 = this.a;
        int r5 = qw1.b(r0.length, this.b + r4);
        if (r5 <= r0.length) goto L5;
    L8:
        this.a = Arrays.copyOf(this.a, r5);
        this.c = false;
        return;
    L5:
        if (this.c == true) goto L8;
    }
}
