package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd5 {
    public static final xd5 a = null;

    static {
        a = new xd5();
    }

    public final long a(Paint r5) {
        int r4 = x40.h;
        long r6 = fb5.a(r5);
        long r0 = 63 & r6;
        if (r0 >= 16) goto L6;
        return r6;
    L6:
        return (r6 & (-64)) | (r0 + 1);
    }

    public final void b(Paint r1, int r2) {
        fb5.d(r1, q05.A(r2));
    }

    public final void c(Paint r3, long r4) {
        int r2 = (int) (63 & r4);
        if (r2 != s50.x.c) goto L5;
    L9:
        long r5 = uc5.Z(x40.a(r4, s50.e));
    L10:
        fb5.c(r3, r5);
        return;
    L5:
        if (r2 == s50.s.c) goto L9;
        if (r2 == s50.t.c) goto L9;
        r5 = uc5.Z(r4);
        goto L10
    }
}
