package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        String strA = k14Var.s.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    public static final void b(be0 be0Var, gr1 gr1Var, tl1 tl1Var) {
        List listUnmodifiableList;
        be0Var.getClass();
        gr1Var.getClass();
        tl1Var.getClass();
        if (be0Var == be0.g) {
            return;
        }
        Pattern pattern = ae0.k;
        List listF = tl1Var.f("Set-Cookie");
        int size = listF.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ae0 ae0VarT = l93.T(gr1Var, (String) listF.get(i));
            if (ae0VarT != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ae0VarT);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = u01.n;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        be0Var.p(gr1Var, listUnmodifiableList);
    }
}
