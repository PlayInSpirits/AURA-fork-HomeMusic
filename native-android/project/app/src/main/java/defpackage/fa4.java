package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa4 extends ga4 {
    public static aa4 b0(Iterator r2) {
        r2.getClass();
        return new gb0(new w40(1, r2));
    }

    public static aa4 c0(if1 r3, Object r4) {
        if (r4 != null) goto L6;
        return y01.a;
    L6:
        return new tq4(new wc(23, r4), r3, 2);
    }

    public static String d0(aa4 r4, String r5, or1 r6, int r7) {
        if ((r7 & 32) == 0) goto L5;
        r6 = null;
    L5:
        r4.getClass();
        StringBuilder r8 = new StringBuilder();
        r8.append("");
        Iterator r9 = r4.iterator();
        int r1 = 0;
    L7:
        if (r9.hasNext() == false) goto L12;
        Object r2 = r9.next();
        r1 = r1 + 1;
        if (r1 <= 1) goto L11;
        r8.append(r5);
    L11:
        si0.j(r8, r2, r6);
        goto L7
    L12:
        r8.append("");
        return r8.toString();
    }

    public static aa4 e0(aa4 r2, int r3) {
        if (r3 < 0) goto L12;
        if (r3 != 0) goto L7;
        return y01.a;
    L7:
        if ((r2 instanceof gx0) == false) goto L11;
        return ((gx0) r2).a(r3);
    L11:
        return new fx0(r2, r3, 1);
    L12:
        kf2.e(b11.j(r3, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List f0(aa4 r2) {
        r2.getClass();
        Iterator r3 = r2.iterator();
        if (r3.hasNext() == false) goto L5;
        Object r0 = r3.next();
        if (r3.hasNext() == false) goto L9;
        ArrayList r1 = new ArrayList();
        r1.add(r0);
    L12:
        if (r3.hasNext() == false) goto L14;
        r1.add(r3.next());
        goto L12
    L14:
        return r1;
    L9:
        return gb.O(r0);
    L5:
        return u01.n;
    }
}
