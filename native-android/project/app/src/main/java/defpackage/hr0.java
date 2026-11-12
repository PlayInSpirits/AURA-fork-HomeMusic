package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends b71 {
    public final b71 c;

    public hr0(b71 r1) {
        r1.getClass();
        this.c = r1;
    }

    @Override // defpackage.b71
    public final of4 a(ge3 r1) {
        r1.getClass();
        return this.c.a(r1);
    }

    @Override // defpackage.b71
    public final void b(ge3 r1, ge3 r2) {
        r1.getClass();
        r2.getClass();
        this.c.b(r1, r2);
    }

    @Override // defpackage.b71
    public final void c(ge3 r1) {
        this.c.c(r1);
    }

    @Override // defpackage.b71
    public final void d(ge3 r1) {
        r1.getClass();
        this.c.d(r1);
    }

    @Override // defpackage.b71
    public final List f(ge3 r2) {
        List r1 = this.c.f(r2);
        ArrayList r3 = new ArrayList();
        Iterator r4 = r1.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        ge3 r0 = (ge3) r4.next();
        r0.getClass();
        r3.add(r0);
        goto L4
    L6:
        u40.l0(r3);
        return r3;
    }

    @Override // defpackage.b71
    public final xo0 h(ge3 r10) {
        r10.getClass();
        xo0 r9 = this.c.h(r10);
        if (r9 != null) goto L6;
        return null;
    L6:
        ge3 r3 = (ge3) r9.d;
        if (r3 != null) goto L9;
        return r9;
    L9:
        boolean r1 = r9.b;
        boolean r2 = r9.c;
        Long r4 = (Long) r9.e;
        Long r5 = (Long) r9.f;
        Long r6 = (Long) r9.g;
        Long r7 = (Long) r9.h;
        Map r8 = (Map) r9.i;
        r8.getClass();
        return new xo0(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    @Override // defpackage.b71
    public final r32 i(ge3 r1) {
        return this.c.i(r1);
    }

    @Override // defpackage.b71
    public final of4 j(ge3 r5) {
        r5.getClass();
        ge3 r0 = r5.b();
        b71 r1 = this.c;
        if (r0 == null) goto L14;
        ii r2 = new ii();
    L5:
        if (r0 == null) goto L9;
        if (e(r0) == true) goto L9;
        r2.addFirst(r0);
        r0 = r0.b();
    L9:
        Iterator<E> r4 = r2.iterator();
    L11:
        if (r4.hasNext() == false) goto L14;
        ge3 r3 = (ge3) r4.next();
        r3.getClass();
        r1.c(r3);
    L14:
        return r1.j(r5);
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 r1) {
        r1.getClass();
        return this.c.k(r1);
    }

    public final String toString() {
        return kx3.a(hr0.class).c() + '(' + this.c + ')';
    }
}
