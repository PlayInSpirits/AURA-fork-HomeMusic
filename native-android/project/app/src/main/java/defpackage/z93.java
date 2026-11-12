package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z93 extends e22 {
    public static final z93 f = null;

    static {
        f = new z93(0, 1, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r1, bi r2, lg4 r3, uy3 r4, wa3 r5) {
        lv3 r0 = (lv3) r1.d(0);
        w03 r6 = r4.i;
        if (r6 != null) goto L5;
        return;
    L5:
        if (((ff3) r6.g(r0)) == null) goto L14;
        ArrayList r7 = r4.j;
        if (r7 == null) goto L11;
        f13 r8 = (f13) r7.remove(r7.size() - 1);
        if (r8 == null) goto L11;
        r4.e = r8;
    L11:
        r6.j(r0);
        return;
    }
}
