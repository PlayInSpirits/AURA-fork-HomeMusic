package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub5 {
    public final su3 a;

    public ub5(Window r3, View r4) {
        om1 r0 = new om1(r4);
        int r5 = Build.VERSION.SDK_INT;
        if (r5 < 35) goto L7;
        this.a = new tb5(r3, r0);
        return;
    L7:
        if (r5 < 30) goto L11;
        this.a = new sb5(r3, r0);
        return;
    L11:
        if (r5 < 26) goto L14;
        this.a = new rb5(r3, r0);
        return;
    L14:
        this.a = new qb5(r3, r0);
    }

    public ub5(WindowInsetsController r3) {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        this.a = new tb5(r3, new om1(r3));
        return;
    L6:
        this.a = new sb5(r3, new om1(r3));
    }
}
