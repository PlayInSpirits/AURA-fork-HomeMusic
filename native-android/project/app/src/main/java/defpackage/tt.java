package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tt extends hw {
    public final /* synthetic */ int j;
    public final /* synthetic */ de0 k;

    public /* synthetic */ tt(de0 de0Var, int i) {
        this.j = i;
        this.k = de0Var;
    }

    @Override // defpackage.hw
    public final void A(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.j;
        de0 de0Var = this.k;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) de0Var).A(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) de0Var;
                WeakReference weakReference = sideSheetBehavior.D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.n.U(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.I;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.n.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw xa3.d(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    @Override // defpackage.hw
    public final void B(View view, float f, float f2) {
        int i = this.j;
        int i2 = 3;
        de0 de0Var = this.k;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) de0Var;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.o) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top > bottomSheetBehavior.R) {
                            i2 = 6;
                        }
                    }
                } else if (bottomSheetBehavior.V && bottomSheetBehavior.L(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.q) {
                        if (view.getTop() > (bottomSheetBehavior.E() + bottomSheetBehavior.g0) / 2) {
                            i2 = 5;
                        } else if (!bottomSheetBehavior.o && Math.abs(view.getTop() - bottomSheetBehavior.E()) >= Math.abs(view.getTop() - bottomSheetBehavior.R)) {
                            i2 = 6;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.o) {
                        int i3 = bottomSheetBehavior.R;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.T)) {
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.T)) {
                            i2 = 4;
                        }
                        i2 = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior.Q) >= Math.abs(top2 - bottomSheetBehavior.T)) {
                        i2 = 4;
                    }
                } else {
                    if (!bottomSheetBehavior.o) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.R) < Math.abs(top3 - bottomSheetBehavior.T)) {
                            i2 = 6;
                        }
                    }
                    i2 = 4;
                }
                bottomSheetBehavior.M(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) de0Var;
                if (!sideSheetBehavior.n.G(f)) {
                    if (sideSheetBehavior.n.S(view, f)) {
                        if (sideSheetBehavior.n.L(f, f2) || sideSheetBehavior.n.J(view)) {
                            i2 = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.n.t()) >= Math.abs(left - sideSheetBehavior.n.u())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior.z(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    @Override // defpackage.hw
    public final boolean Q(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i2 = this.j;
        de0 de0Var = this.k;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) de0Var;
                int i3 = bottomSheetBehavior.Y;
                if (i3 != 1 && !bottomSheetBehavior.o0) {
                    if (i3 == 3 && bottomSheetBehavior.m0 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.i0;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.h0;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.h0;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) de0Var;
                return (sideSheetBehavior.u == 1 || (weakReference2 = sideSheetBehavior.C) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // defpackage.hw
    public final int d(View view, int i) {
        switch (this.j) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.k;
                return su3.l(i, sideSheetBehavior.n.x(), sideSheetBehavior.n.v());
        }
    }

    @Override // defpackage.hw
    public final int e(View view, int i) {
        switch (this.j) {
            case 0:
                return su3.l(i, ((BottomSheetBehavior) this.k).E(), p());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.hw
    public int o(View view) {
        switch (this.j) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.k;
                return sideSheetBehavior.y + sideSheetBehavior.B;
            default:
                return super.o(view);
        }
    }

    @Override // defpackage.hw
    public int p() {
        switch (this.j) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.k;
                return bottomSheetBehavior.V ? bottomSheetBehavior.g0 : bottomSheetBehavior.T;
            default:
                return super.p();
        }
    }

    @Override // defpackage.hw
    public final void z(int i) {
        int i2 = this.j;
        de0 de0Var = this.k;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) de0Var;
                    if (bottomSheetBehavior.X) {
                        bottomSheetBehavior.K(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) de0Var;
                    if (sideSheetBehavior.t) {
                        sideSheetBehavior.x(1);
                    }
                }
                break;
        }
    }
}
