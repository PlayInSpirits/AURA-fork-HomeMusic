package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class br1 {
    static {
        yw ywVar = yw.q;
        pa.t("\"\\");
        pa.t("\t ,=");
    }

    public static final boolean a(k14 k14Var) {
        if (h12.c(k14Var.n.b, "HEAD")) {
            return false;
        }
        int i = k14Var.q;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || ze5.e(k14Var) != -1) {
            return true;
        }
        String a = k14Var.s.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        return "chunked".equalsIgnoreCase(a);
    }

    public static final void b(be0 be0Var, gr1 gr1Var, tl1 tl1Var) {
        List list;
        be0Var.getClass();
        gr1Var.getClass();
        tl1Var.getClass();
        if (be0Var == be0.g) {
            return;
        }
        Pattern pattern = ae0.k;
        List f = tl1Var.f("Set-Cookie");
        int size = f.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ae0 T = l93.T(gr1Var, (String) f.get(i));
            if (T != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(T);
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        } else {
            list = u01.n;
        }
        if (list.isEmpty()) {
            return;
        }
        be0Var.p(gr1Var, list);
    }
}
