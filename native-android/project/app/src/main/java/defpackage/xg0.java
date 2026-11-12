package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xg0 extends pw3 {
    public RecyclerView a;
    public Scroller b;
    public final ah4 c = new ah4(this);
    public final /* synthetic */ int d;
    public ib3 e;
    public ib3 f;

    public xg0(int i) {
        this.d = i;
    }

    public static int c(View view, qz0 qz0Var) {
        return ((qz0Var.e(view) / 2) + qz0Var.g(view)) - ((qz0Var.n() / 2) + qz0Var.m());
    }

    public static View e(mw3 mw3Var, qz0 qz0Var) {
        int iV = mw3Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (qz0Var.n() / 2) + qz0Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = mw3Var.u(i2);
            int iAbs = Math.abs(((qz0Var.e(viewU) / 2) + qz0Var.g(viewU)) - iN);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public static View f(mw3 mw3Var, qz0 qz0Var) {
        int iV = mw3Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (qz0Var.n() / 2) + qz0Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = mw3Var.u(i2);
            int iAbs = Math.abs(((qz0Var.e(viewU) / 2) + qz0Var.g(viewU)) - iN);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        ah4 ah4Var = this.c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.w0;
            if (arrayList != null) {
                arrayList.remove(ah4Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                kf2.o("An instance of OnFlingListener already set.");
                return;
            }
            this.a.j(ah4Var);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public final int[] b(mw3 mw3Var, View view) {
        switch (this.d) {
            case 0:
                int[] iArr = new int[2];
                if (mw3Var.d()) {
                    qz0 qz0VarH = h(mw3Var);
                    iArr[0] = ((qz0VarH.e(view) / 2) + qz0VarH.g(view)) - ((qz0VarH.n() / 2) + qz0VarH.m());
                } else {
                    iArr[0] = 0;
                }
                if (mw3Var.e()) {
                    qz0 qz0VarJ = j(mw3Var);
                    iArr[1] = ((qz0VarJ.e(view) / 2) + qz0VarJ.g(view)) - ((qz0VarJ.n() / 2) + qz0VarJ.m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (mw3Var.d()) {
                    iArr2[0] = c(view, i(mw3Var));
                } else {
                    iArr2[0] = 0;
                }
                if (mw3Var.e()) {
                    iArr2[1] = c(view, k(mw3Var));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public int d(mw3 mw3Var, qz0 qz0Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iV = mw3Var.v();
        float f = 1.0f;
        if (iV != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iV; i5++) {
                View viewU = mw3Var.u(i5);
                int I = mw3.I(viewU);
                if (I != -1) {
                    if (I < i4) {
                        view = viewU;
                        i4 = I;
                    }
                    if (I > i3) {
                        view2 = viewU;
                        i3 = I;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(qz0Var.d(view), qz0Var.d(view2)) - Math.min(qz0Var.g(view), qz0Var.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    public View g(mw3 mw3Var) {
        switch (this.d) {
            case 0:
                if (mw3Var instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mw3Var;
                    View viewS0 = linearLayoutManager.S0(0, linearLayoutManager.v(), true, false);
                    if ((viewS0 == null ? -1 : mw3.I(viewS0)) == 0) {
                        return null;
                    }
                    View viewS1 = linearLayoutManager.S0(linearLayoutManager.v() - 1, -1, true, false);
                    if ((viewS1 != null ? mw3.I(viewS1) : -1) == linearLayoutManager.D() - 1) {
                        return null;
                    }
                }
                if (mw3Var.e()) {
                    return e(mw3Var, j(mw3Var));
                }
                if (mw3Var.d()) {
                    return e(mw3Var, h(mw3Var));
                }
                return null;
            default:
                if (mw3Var.e()) {
                    return f(mw3Var, k(mw3Var));
                }
                if (mw3Var.d()) {
                    return f(mw3Var, i(mw3Var));
                }
                return null;
        }
    }

    public qz0 h(mw3 mw3Var) {
        ib3 ib3Var = this.f;
        if (ib3Var == null || ((mw3) ib3Var.b) != mw3Var) {
            this.f = new ib3(mw3Var, 0);
        }
        return this.f;
    }

    public qz0 i(mw3 mw3Var) {
        ib3 ib3Var = this.f;
        if (ib3Var == null || ((mw3) ib3Var.b) != mw3Var) {
            this.f = new ib3(mw3Var, 0);
        }
        return this.f;
    }

    public qz0 j(mw3 mw3Var) {
        ib3 ib3Var = this.e;
        if (ib3Var == null || ((mw3) ib3Var.b) != mw3Var) {
            this.e = new ib3(mw3Var, 1);
        }
        return this.e;
    }

    public qz0 k(mw3 mw3Var) {
        ib3 ib3Var = this.e;
        if (ib3Var == null || ((mw3) ib3Var.b) != mw3Var) {
            this.e = new ib3(mw3Var, 1);
        }
        return this.e;
    }

    public final void l() {
        mw3 layoutManager;
        View viewG;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewG);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.l0(i, iArrB[1], false);
    }
}
