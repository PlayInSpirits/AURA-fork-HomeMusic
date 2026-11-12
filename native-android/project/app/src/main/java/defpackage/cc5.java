package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cc5 implements bc5 {
    public final po0 b;

    public cc5() {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        po0 r0 = qo0.n;
    L6:
        this.b = r0;
        gb.d(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128});
        return;
    L5:
        r0 = fz0.V;
        goto L6
    }
}
