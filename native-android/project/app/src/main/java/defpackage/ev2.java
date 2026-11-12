package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ev2 extends bc2 implements su2 {
    public static final Method Q = null;
    public d34 P;

    static {
    L6:
        Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        return;
    L3:
        if (Build.VERSION.SDK_INT > 28) goto L10;
        Q = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L6
        return;
    }

    @Override // defpackage.su2
    public final void a(qu2 r1, MenuItem r2) {
        d34 r0 = this.P;
        if (r0 == null) goto L6;
        r0.a(r1, r2);
        return;
    }

    @Override // defpackage.su2
    public final void l(qu2 r1, tu2 r2) {
        d34 r0 = this.P;
        if (r0 == null) goto L6;
        r0.l(r1, r2);
        return;
    }

    @Override // defpackage.bc2
    public final cx0 q(Context r2, boolean r3) {
        dv2 r0 = new dv2(r2, r3);
        r0.setHoverListener(this);
        return r0;
    }
}
