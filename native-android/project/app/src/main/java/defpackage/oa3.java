package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa3 extends e22 {
    public static final oa3 f = null;

    static {
        f = new oa3(0, 1, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r1, bi r2, lg4 r3, uy3 r4, wa3 r5) {
        lv3 r0 = (lv3) r1.d(0);
        w03 r6 = r4.i;
        if (r6 == null) goto L5;
        ff3 r7 = (ff3) r6.g(r0);
    L6:
        if (r7 == null) goto L12;
        ArrayList r8 = r4.j;
        if (r8 != null) goto L10;
        r8 = new ArrayList();
        r4.j = r8;
    L10:
        r8.add(r4.e);
        r4.e = r7.o;
        return;
    L12:
        return;
    L5:
        r7 = null;
        goto L6
    }
}
