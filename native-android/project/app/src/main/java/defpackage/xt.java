package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xt extends ut {
    public final Boolean a;
    public final pb5 b;
    public Window c;
    public boolean d;

    public xt(View view, pb5 pb5Var) {
        ColorStateList backgroundTintList;
        this.b = pb5Var;
        fi2 fi2Var = BottomSheetBehavior.C(view).v;
        if (fi2Var != null) {
            backgroundTintList = fi2Var.n.c;
        } else {
            WeakHashMap weakHashMap = j65.a;
            backgroundTintList = view.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(g12.B(backgroundTintList.getDefaultColor()));
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = Boolean.valueOf(g12.B(((ColorDrawable) view.getBackground()).getColor()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.ut
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.ut
    public final void b(View view, float f) {
        d(view);
    }

    @Override // defpackage.ut
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        su3 rb5Var;
        su3 rb5Var2;
        int top = view.getTop();
        pb5 pb5Var = this.b;
        if (top < pb5Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                om1 om1Var = new om1(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    rb5Var2 = new tb5(window, om1Var);
                } else if (i >= 30) {
                    rb5Var2 = new sb5(window, om1Var);
                } else {
                    rb5Var2 = i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
                }
                rb5Var2.D(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), pb5Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                om1 om1Var2 = new om1(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    rb5Var = new tb5(window2, om1Var2);
                } else if (i2 >= 30) {
                    rb5Var = new sb5(window2, om1Var2);
                } else {
                    rb5Var = i2 >= 26 ? new rb5(window2, om1Var2) : new qb5(window2, om1Var2);
                }
                rb5Var.D(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        su3 rb5Var;
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            om1 om1Var = new om1(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                rb5Var = new tb5(window, om1Var);
            } else if (i >= 30) {
                rb5Var = new sb5(window, om1Var);
            } else {
                rb5Var = i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
            }
            this.d = rb5Var.y();
        }
    }
}
