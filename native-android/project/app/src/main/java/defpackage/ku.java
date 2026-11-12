package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ku implements ju, dc5 {
    public static final ku n = null;
    public static final ku o = null;

    static {
        n = new ku();
        o = new ku();
    }

    @Override // defpackage.ju
    public Rect a(Activity r1) {
        Rect r0 = ((WindowManager) r1.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        r0.getClass();
        return r0;
    }

    @Override // defpackage.dc5
    public zb5 e(Context r1, po0 r2) {
        r2.getClass();
        WindowManager r0 = (WindowManager) r1.getSystemService(WindowManager.class);
        float r3 = r1.getResources().getDisplayMetrics().density;
        Rect r4 = r0.getCurrentWindowMetrics().getBounds();
        r4.getClass();
        return new zb5(r4, r3);
    }
}
