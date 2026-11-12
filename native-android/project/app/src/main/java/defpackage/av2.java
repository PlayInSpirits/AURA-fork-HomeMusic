package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class av2 {
    public final Context a;
    public final qu2 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public fv2 h;
    public yu2 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final zu2 k = new zu2(this);

    public av2(Context context, qu2 qu2Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = qu2Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final yu2 a() {
        yu2 wk4Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                wk4Var = new uz(context2, this.e, this.d, this.c);
            } else {
                wk4Var = new wk4(context2, this.b, this.e, this.d, this.c);
            }
            wk4Var.n(this.b);
            wk4Var.t(this.k);
            wk4Var.p(this.e);
            wk4Var.i(this.h);
            wk4Var.q(this.g);
            wk4Var.r(this.f);
            this.i = wk4Var;
        }
        return this.i;
    }

    public final boolean b() {
        yu2 yu2Var = this.i;
        return yu2Var != null && yu2Var.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        yu2 yu2VarA = a();
        yu2VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            yu2VarA.s(i);
            yu2VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            yu2VarA.n = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        yu2VarA.f();
    }
}
