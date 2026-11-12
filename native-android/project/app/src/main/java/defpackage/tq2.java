package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 extends wq2 {
    public final ArrayList w;
    public final oi x;

    public tq2(vq2 r2, String r3, String r4) {
        super(r2, r3, r4, false);
        this.w = new ArrayList();
        this.x = new oi(0);
    }

    public final boolean m() {
        yq2.b();
        ui1 r0 = yq2.c();
        r0.getClass();
        ArrayList r1 = new ArrayList();
        Iterator r2 = r0.i.values().iterator();
        if (r2.hasNext() == true) goto L7;
        return r1.contains(this);
    L7:
        throw xa3.d(r2);
    }

    public final boolean n(wq2 r1) {
        mq2 r0 = (mq2) this.x.get(r1.c);
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.d == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void o(Collection r6) {
        this.v.clear();
        ArrayList r0 = this.w;
        r0.clear();
        oi r1 = this.x;
        r1.clear();
        Iterator r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L13;
        mq2 r2 = (mq2) r7.next();
        String r3 = r2.a.d();
        wq2 r4 = this.a.a(r3);
        if (r4 == null) goto L4;
        r0.add(r4);
        r1.put(r4.c, r2);
        int r5 = r2.b;
        if (r5 == 2) goto L12;
        if (r5 != 3) goto L4;
    L12:
        this.v.add(r4);
        goto L4
    L13:
        yq2.c().a.b(259, this);
    }
}
