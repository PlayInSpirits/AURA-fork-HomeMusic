package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yt extends dg {
    public xt A;
    public boolean B;
    public qp4 C;
    public wt D;
    public BottomSheetBehavior t;
    public FrameLayout u;
    public CoordinatorLayout v;
    public FrameLayout w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.t == null) {
            i();
        }
        super.cancel();
    }

    public final void i() {
        if (this.u == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.u = frameLayout;
            this.v = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.u.findViewById(R.id.design_bottom_sheet);
            this.w = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.t = bottomSheetBehaviorC;
            bottomSheetBehaviorC.w(this.D);
            this.t.H(this.x);
            this.C = new qp4(this.t, this.w);
        }
    }

    public final FrameLayout j(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.u.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.B) {
            FrameLayout frameLayout = this.w;
            d34 d34Var = new d34(11, this);
            WeakHashMap weakHashMap = j65.a;
            a65.c(frameLayout, d34Var);
        }
        this.w.removeAllViews();
        FrameLayout frameLayout2 = this.w;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new i4(3, this));
        j65.o(this.w, new ar(1, this));
        this.w.setOnTouchListener(new dr(1));
        return this.u;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.B && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.u;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.v;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            l93.d0(window, !z);
            xt xtVar = this.A;
            if (xtVar != null) {
                xtVar.e(window);
            }
        }
        qp4 qp4Var = this.C;
        if (qp4Var == null) {
            return;
        }
        View view = (View) qp4Var.c;
        boolean z2 = this.x;
        ah2 ah2Var = (ah2) qp4Var.a;
        if (z2) {
            if (ah2Var != null) {
                ah2Var.b((zg2) qp4Var.b, view, false);
            }
        } else if (ah2Var != null) {
            ah2Var.c(view);
        }
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ah2 ah2Var;
        xt xtVar = this.A;
        if (xtVar != null) {
            xtVar.e(null);
        }
        qp4 qp4Var = this.C;
        if (qp4Var == null || (ah2Var = (ah2) qp4Var.a) == null) {
            return;
        }
        ah2Var.c((View) qp4Var.c);
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.t;
        if (bottomSheetBehavior == null || bottomSheetBehavior.Y != 5) {
            return;
        }
        bottomSheetBehavior.J(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        qp4 qp4Var;
        super.setCancelable(z);
        if (this.x != z) {
            this.x = z;
            BottomSheetBehavior bottomSheetBehavior = this.t;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(z);
            }
            if (getWindow() == null || (qp4Var = this.C) == null) {
                return;
            }
            View view = (View) qp4Var.c;
            boolean z2 = this.x;
            ah2 ah2Var = (ah2) qp4Var.a;
            if (z2) {
                if (ah2Var != null) {
                    ah2Var.b((zg2) qp4Var.b, view, false);
                }
            } else if (ah2Var != null) {
                ah2Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.x) {
            this.x = true;
        }
        this.y = z;
        this.z = true;
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(j(null, i, null));
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
