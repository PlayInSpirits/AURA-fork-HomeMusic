package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zy0 extends ez0 {
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
        if (r6 == false) goto L9;
        int r7 = r2.b;
    L10:
        r3.setNavigationBarColor(r7);
        om1 r8 = new om1(r4);
        int r9 = Build.VERSION.SDK_INT;
        if (r9 < 35) goto L14;
        su3 r10 = new tb5(r3, r8);
    L20:
        r10.D(!r5);
        r10.C(!r6);
        return;
    L14:
        if (r9 < 30) goto L17;
        r10 = new sb5(r3, r8);
        goto L20
    L17:
        if (r9 < 26) goto L19;
        r10 = new rb5(r3, r8);
        goto L20
    L19:
        r10 = new qb5(r3, r8);
        goto L20
    L9:
        r7 = r2.a;
        goto L10
    L5:
        r0 = r1.a;
        goto L6
    }
}
