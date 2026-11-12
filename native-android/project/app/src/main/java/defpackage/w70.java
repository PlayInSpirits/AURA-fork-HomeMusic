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

    public w70(q03 r1, q03 r2, h03 r3, int r4, Exception r5) {
        super(r5);
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ba4 r0 = si0.C(new v70(this, null));
        if (r0.hasNext() == true) goto L5;
        List r1 = u01.n;
    L14:
        return rm4.d0("\n            |Failed to execute op number " + this.q + ":\n            |" + q40.B0(q40.M0(r1, 50), "\n", null, null, null, 62) + "\n            ");
    L5:
        Object r2 = r0.next();
        if (r0.hasNext() == true) goto L8;
        r1 = gb.O(r2);
        goto L14
    L8:
        ArrayList r3 = new ArrayList();
        r3.add(r2);
    L10:
        if (r0.hasNext() == false) goto L12;
        r3.add(r0.next());
        goto L10
    L12:
        r1 = r3;
        goto L14
    }
}
