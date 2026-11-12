package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements po0, dc5 {
    public static final qo0 n = new qo0();
    public static final qo0 o = new qo0();

    @Override // defpackage.po0
    public float c(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.dc5
    public zb5 e(Context context, po0 po0Var) {
        po0Var.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new zb5(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
