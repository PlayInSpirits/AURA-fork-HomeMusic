package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w70 extends RuntimeException {
    public final q03 n;
    public final q03 o;
    public final h03 p;
    public final int q;

    public w70(q03 q03Var, q03 q03Var2, h03 h03Var, int i, Exception exc) {
        super(exc);
        this.n = q03Var;
        this.o = q03Var2;
        this.p = h03Var;
        this.q = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        ba4 C = si0.C(new v70(this, null));
        if (C.hasNext()) {
            Object next = C.next();
            if (C.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (C.hasNext()) {
                    arrayList.add(C.next());
                }
                list = arrayList;
            } else {
                list = gb.O(next);
            }
        } else {
            list = u01.n;
        }
        return rm4.d0("\n            |Failed to execute op number " + this.q + ":\n            |" + q40.B0(q40.M0(list, 50), "\n", null, null, null, 62) + "\n            ");
    }
}
