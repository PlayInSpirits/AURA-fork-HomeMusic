package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 {
    public static final jn0 c = null;
    public final bn2 a;
    public final int b;

    static {
        jn0 r0 = jn0.F0;
        r0.getClass();
        in0 r1 = new in0(r0);
        r1.G = true;
        r1.N = false;
        c = new jn0(r1);
    }

    public zs0(gn2 r4, bq r5, cw4 r6) {
        bn2 r7 = r4.b;
        r7.getClass();
        this.a = r7;
        boolean r8 = true;
        if (r5 != null) goto L6;
        int r9 = 0;
    L9:
        this.b = r9;
        pn0 r3 = new pn0(r6, new om0(8), null);
        new SparseIntArray();
        mj0 r10 = new mj0(11);
        om0 r11 = new om0(9);
        if (r3.a == null) goto L13;
        r8 = false;
    L13:
        rr2.w(r8);
        r3.a = r10;
        r3.b = r11;
        f35.q(null);
        return;
    L6:
        if ((r5 instanceof kr3) == false) goto L8;
        r9 = 1;
        goto L9
    L8:
        r9 = 2;
        goto L9
    }
}
