package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements po0, dc5 {
    public static final qo0 n = null;
    public static final qo0 o = null;

    static {
        n = new qo0();
        o = new qo0();
    }

    @Override // defpackage.po0
    public float c(Context r1) {
        return ((WindowManager) r1.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.dc5
    public zb5 e(Context r1, po0 r2) {
        r2.getClass();
        if (r1.isUiContext() == false) goto L5;
        WindowManager r0 = (WindowManager) r1.getSystemService(WindowManager.class);
    L6:
        Rect r3 = r0.getCurrentWindowMetrics().getBounds();
        r3.getClass();
        return new zb5(r3, r0.getCurrentWindowMetrics().getDensity());
    L5:
        r0 = (WindowManager) r1.getApplicationContext().getSystemService(WindowManager.class);
        goto L6
    }
}
