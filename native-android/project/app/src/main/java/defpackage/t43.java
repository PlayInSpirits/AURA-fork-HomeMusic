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
        d23 d23Var = this.a;
        if (d23Var != null) {
            return d23Var;
        }
        kf2.o("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public r23 c(r23 r23Var, Bundle bundle, y23 y23Var) {
        return r23Var;
    }

    public void d(List list, y23 y23Var) {
        g71 g71Var = new g71(new h71(new tq4(new w40(0, list), new br0(2, this, y23Var), 1), false, new o54(13)));
        while (g71Var.hasNext()) {
            b().g((a23) g71Var.next());
        }
    }

    public void e(d23 d23Var) {
        this.a = d23Var;
        this.b = true;
    }

    public void f(a23 a23Var) {
        r23 r23Var = a23Var.o;
        if (r23Var == null) {
            r23Var = null;
        }
        if (r23Var == null) {
            return;
        }
        x23 x23Var = new x23();
        x23Var.a = true;
        x23Var.b = false;
        x23Var.c = -1;
        x23Var.d = false;
        x23Var.e = false;
        c(r23Var, null, x23Var.a());
        b().c(a23Var);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(a23 a23Var, boolean z) {
        a23Var.getClass();
        List list = (List) b().e.n.getValue();
        if (!list.contains(a23Var)) {
            nz2.o("popBackStack was called with ", a23Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        a23 a23Var2 = null;
        while (j()) {
            a23Var2 = (a23) listIterator.previous();
            if (h12.c(a23Var2, a23Var)) {
                break;
            }
        }
        if (a23Var2 != null) {
            b().d(a23Var2, z);
        }
    }

    public boolean j() {
        return true;
    }
}
