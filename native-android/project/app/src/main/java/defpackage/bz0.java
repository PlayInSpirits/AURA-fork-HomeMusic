package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bz0 extends az0 {
    @Override // defpackage.zy0, defpackage.ez0
    public void b(up4 r1, up4 r2, Window r3, View r4, boolean r5, boolean r6) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        l93.d0(r3, false);
        r3.setStatusBarColor(0);
        r3.setNavigationBarColor(0);
        kz.p(r3);
        kz.x(r3);
        om1 r0 = new om1(r4);
        int r7 = Build.VERSION.SDK_INT;
        if (r7 < 35) goto L6;
        su3 r8 = new tb5(r3, r0);
    L12:
        r8.D(!r5);
        r8.C(!r6);
        return;
    L6:
        if (r7 < 30) goto L9;
        r8 = new sb5(r3, r0);
        goto L12
    L9:
        if (r7 < 26) goto L11;
        r8 = new rb5(r3, r0);
        goto L12
    L11:
        r8 = new qb5(r3, r0);
        goto L12
    }
}
