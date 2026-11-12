package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa4 extends ga4 {
    public static aa4 b0(Iterator it) {
        it.getClass();
        return new gb0(new w40(1, it));
    }

    public static aa4 c0(if1 if1Var, Object obj) {
        return obj == null ? y01.a : new tq4(new wc(23, obj), if1Var, 2);
    }

    public static String d0(aa4 aa4Var, String str, or1 or1Var, int i) {
        if ((i & 32) != 0) {
            or1Var = null;
        }
        aa4Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : aa4Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            si0.j(sb, obj, or1Var);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static aa4 e0(aa4 aa4Var, int i) {
        if (i < 0) {
            kf2.e(b11.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return y01.a;
        }
        return aa4Var instanceof gx0 ? ((gx0) aa4Var).a(i) : new fx0(aa4Var, i, 1);
    }

    public static List f0(aa4 aa4Var) {
        aa4Var.getClass();
        Iterator it = aa4Var.iterator();
        if (!it.hasNext()) {
            return u01.n;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return gb.O(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
