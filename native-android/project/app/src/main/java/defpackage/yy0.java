package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 extends ez0 {
    @Override // defpackage.ez0
    public void b(up4 r1, up4 r2, Window r3, View r4, boolean r5, boolean r6) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        l93.d0(r3, false);
        if (r5 == false) goto L5;
        int r0 = r1.b;
    L6:
        r3.setStatusBarColor(r0);
        r3.setNavigationBarColor(r2.b);
        om1 r7 = new om1(r4);
        int r8 = Build.VERSION.SDK_INT;
        if (r8 < 35) goto L10;
        su3 r9 = new tb5(r3, r7);
    L16:
        r9.D(!r5);
        return;
    L10:
        if (r8 < 30) goto L13;
        r9 = new sb5(r3, r7);
        goto L16
    L13:
        if (r8 < 26) goto L15;
        r9 = new rb5(r3, r7);
        goto L16
    L15:
        r9 = new qb5(r3, r7);
        goto L16
    L5:
        r0 = r1.a;
        goto L6
    }
}
