package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        List listO;
        ba4 ba4VarC = si0.C(new v70(this, null));
        if (ba4VarC.hasNext()) {
            Object next = ba4VarC.next();
            if (ba4VarC.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ba4VarC.hasNext()) {
                    arrayList.add(ba4VarC.next());
                }
                listO = arrayList;
            } else {
                listO = gb.O(next);
            }
        } else {
            listO = u01.n;
        }
        return rm4.d0("\n            |Failed to execute op number " + this.q + ":\n            |" + q40.B0(q40.M0(listO, 50), "\n", null, null, null, 62) + "\n            ");
    }
}
