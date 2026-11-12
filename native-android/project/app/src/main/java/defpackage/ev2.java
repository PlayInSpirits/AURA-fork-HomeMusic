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
    public static final Method Q;
    public d34 P;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.su2
    public final void a(qu2 qu2Var, MenuItem menuItem) {
        d34 d34Var = this.P;
        if (d34Var != null) {
            d34Var.a(qu2Var, menuItem);
        }
    }

    @Override // defpackage.su2
    public final void l(qu2 qu2Var, tu2 tu2Var) {
        d34 d34Var = this.P;
        if (d34Var != null) {
            d34Var.l(qu2Var, tu2Var);
        }
    }

    @Override // defpackage.bc2
    public final cx0 q(Context context, boolean z) {
        dv2 dv2Var = new dv2(context, z);
        dv2Var.setHoverListener(this);
        return dv2Var;
    }
}
