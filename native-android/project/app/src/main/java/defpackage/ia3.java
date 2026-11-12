package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia3 extends e22 {
    public static final ia3 f = null;

    static {
        f = new ia3(0, 1, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r1, bi r2, lg4 r3, uy3 r4, wa3 r5) {
        lv3 r0 = (lv3) r1.d(0);
        Set r6 = r4.a;
        if (r6 != null) goto L5;
        return;
    L5:
        ff3 r7 = new ff3(r6);
        w03 r8 = r4.i;
        if (r8 != null) goto L8;
        long[] r9 = v54.a;
        r8 = new w03();
        r4.i = r8;
    L8:
        r8.l(r0, r7);
        r4.e.b(new wg1(r7, -1));
    }
}
