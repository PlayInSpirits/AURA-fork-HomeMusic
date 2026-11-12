package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 extends wr1 {
    public final /* synthetic */ int j;
    public final SideSheetBehavior k;

    public /* synthetic */ e92(SideSheetBehavior sideSheetBehavior, int i) {
        this.j = i;
        this.k = sideSheetBehavior;
    }

    @Override // defpackage.wr1
    public final int B() {
        switch (this.j) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.wr1
    public final boolean G(float f) {
        switch (this.j) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // defpackage.wr1
    public final boolean J(View view) {
        switch (this.j) {
            case 0:
                return view.getRight() < (t() - u()) / 2;
            default:
                return view.getLeft() > (t() + this.k.z) / 2;
        }
    }

    @Override // defpackage.wr1
    public final boolean L(float f, float f2) {
        switch (this.j) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
        }
    }

    @Override // defpackage.wr1
    public final boolean S(View view, float f) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return Math.abs((f * sideSheetBehavior.x) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * sideSheetBehavior.x) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // defpackage.wr1
    public final void T(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.j) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.wr1
    public final void U(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.z) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.z;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // defpackage.wr1
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.wr1
    public final float f(int i) {
        switch (this.j) {
            case 0:
                float fU = u();
                return (i - fU) / (t() - fU);
            default:
                float f = this.k.z;
                return (f - i) / (f - t());
        }
    }

    @Override // defpackage.wr1
    public final int s(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.wr1
    public final int t() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.A + sideSheetBehavior.B);
            default:
                return Math.max(0, (sideSheetBehavior.z - sideSheetBehavior.y) - sideSheetBehavior.B);
        }
    }

    @Override // defpackage.wr1
    public final int u() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.y) - sideSheetBehavior.B;
            default:
                return sideSheetBehavior.z;
        }
    }

    @Override // defpackage.wr1
    public final int v() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return sideSheetBehavior.B;
            default:
                return sideSheetBehavior.z;
        }
    }

    @Override // defpackage.wr1
    public final int x() {
        switch (this.j) {
            case 0:
                return -this.k.y;
            default:
                return t();
        }
    }

    @Override // defpackage.wr1
    public final int y(View view) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.B;
            default:
                return view.getLeft() - sideSheetBehavior.B;
        }
    }

    @Override // defpackage.wr1
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.j) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
