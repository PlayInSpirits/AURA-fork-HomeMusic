package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r93 extends e22 {
    public static final r93 f = null;

    static {
        f = new r93(0, 2, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r2, bi r3, lg4 r4, uy3 r5, wa3 r6) {
        int r1 = 0;
        int r7 = ((l02) r2.d(0)).a;
        List r8 = (List) r2.d(1);
        int r9 = r8.size();
    L3:
        if (r1 >= r9) goto L5;
        Object r10 = r8.get(r1);
        int r0 = r7 + r1;
        r3.a(r0, r10);
        r3.h(r0, r10);
        r1 = r1 + 1;
        goto L3
    }
}
