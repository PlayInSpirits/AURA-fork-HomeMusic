package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t43 {
    public d23 a;
    public boolean b;

    public abstract r23 a();

    public final d23 b() {
        d23 r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public r23 c(r23 r1, Bundle r2, y23 r3) {
        return r1;
    }

    public void d(List r4, y23 r5) {
        g71 r6 = new g71(new h71(new tq4(new w40(0, r4), new br0(2, this, r5), 1), false, new o54(13)));
    L4:
        if (r6.hasNext() == false) goto L6;
        a23 r7 = (a23) r6.next();
        b().g(r7);
        goto L4
    }

    public void e(d23 r1) {
        this.a = r1;
        this.b = true;
    }

    public void f(a23 r6) {
        r23 r0 = r6.o;
        if (r0 != null) goto L6;
        r0 = null;
    L6:
        if (r0 != null) goto L8;
        return;
    L8:
        x23 r2 = new x23();
        r2.a = true;
        r2.b = false;
        r2.c = -1;
        r2.d = false;
        r2.e = false;
        c(r0, null, r2.a());
        b().c(r6);
    }

    public void g(Bundle r1) {
    }

    public Bundle h() {
        return null;
    }

    public void i(a23 r4, boolean r5) {
        r4.getClass();
        List r0 = (List) b().e.n.getValue();
        if (r0.contains(r4) == false) goto L13;
        ListIterator r1 = r0.listIterator(r0.size());
        a23 r2 = null;
    L6:
        if (j() == false) goto L10;
        r2 = (a23) r1.previous();
        if (h12.c(r2, r4) == false) goto L6;
    L10:
        if (r2 == null) goto L18;
        b().d(r2, r5);
        return;
    L18:
        return;
    L13:
        nz2.o("popBackStack was called with ", r4, " which does not exist in back stack ", r0);
    }

    public boolean j() {
        return true;
    }
}
