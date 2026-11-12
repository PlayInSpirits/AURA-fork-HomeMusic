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

    public /* synthetic */ e92(SideSheetBehavior r1, int r2) {
        this.j = r2;
        this.k = r1;
    }

    @Override // defpackage.wr1
    public final int B() {
        switch(this.j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 1;
    }

    @Override // defpackage.wr1
    public final boolean G(float r1) {
        switch(this.j) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (r1 >= 0.0f) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r1 <= 0.0f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.wr1
    public final boolean J(View r4) {
        switch(this.j) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r5 = r4.getLeft();
        int r0 = this.k.z;
        if (r5 > ((t() + r0) / 2)) goto L7;
        return false;
    L7:
        return true;
    L9:
        if (r4.getRight() < ((t() - u()) / 2)) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.wr1
    public final boolean L(float r1, float r2) {
        switch(this.j) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (Math.abs(r1) > Math.abs(r2)) goto L7;
    L9:
        return false;
    L7:
        if (Math.abs(r1) <= 500.0f) goto L9;
        return true;
    L12:
        if (Math.abs(r1) > Math.abs(r2)) goto L14;
    L16:
        return false;
    L14:
        if (Math.abs(r1) <= 500.0f) goto L16;
        return true;
    }

    @Override // defpackage.wr1
    public final boolean S(View r5, float r6) {
        int r0 = this.j;
        SideSheetBehavior r4 = this.k;
        switch(r0) {
            case 0: goto L9;
            default: goto L5;
        };
    L5:
        if (Math.abs((r6 * r4.x) + r5.getRight()) > 0.5f) goto L7;
        return false;
    L7:
        return true;
    L9:
        if (Math.abs((r6 * r4.x) + r5.getLeft()) > 0.5f) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.wr1
    public final void T(ViewGroup.MarginLayoutParams r1, int r2) {
        switch(this.j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.rightMargin = r2;
        return;
    L6:
        r1.leftMargin = r2;
    }

    @Override // defpackage.wr1
    public final void U(ViewGroup.MarginLayoutParams r2, int r3, int r4) {
        int r0 = this.j;
        SideSheetBehavior r1 = this.k;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r5 = r1.z;
        if (r3 > r5) goto L12;
        r2.rightMargin = r5 - r3;
        return;
    L12:
        return;
    L9:
        if (r3 > r1.z) goto L13;
        r2.leftMargin = r4;
        return;
    }

    @Override // defpackage.wr1
    public final int e(ViewGroup.MarginLayoutParams r1) {
        switch(this.j) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.rightMargin;
    L7:
        return r1.leftMargin;
    }

    @Override // defpackage.wr1
    public final float f(int r2) {
        switch(this.j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r0 = this.k.z;
        return (r0 - r2) / (r0 - t());
    L6:
        float r1 = u();
        return (r2 - r1) / (t() - r1);
    }

    @Override // defpackage.wr1
    public final int s(ViewGroup.MarginLayoutParams r1) {
        switch(this.j) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.rightMargin;
    L7:
        return r1.leftMargin;
    }

    @Override // defpackage.wr1
    public final int t() {
        int r0 = this.j;
        SideSheetBehavior r3 = this.k;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Math.max(0, (r3.z - r3.y) - r3.B);
    L7:
        return Math.max(0, r3.A + r3.B);
    }

    @Override // defpackage.wr1
    public final int u() {
        int r0 = this.j;
        SideSheetBehavior r1 = this.k;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.z;
    L7:
        return (-r1.y) - r1.B;
    }

    @Override // defpackage.wr1
    public final int v() {
        int r0 = this.j;
        SideSheetBehavior r1 = this.k;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.z;
    L7:
        return r1.B;
    }

    @Override // defpackage.wr1
    public final int x() {
        switch(this.j) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return t();
    L7:
        return -this.k.y;
    }

    @Override // defpackage.wr1
    public final int y(View r2) {
        int r0 = this.j;
        SideSheetBehavior r1 = this.k;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getLeft() - r1.B;
    L7:
        return r2.getRight() + r1.B;
    }

    @Override // defpackage.wr1
    public final int z(CoordinatorLayout r1) {
        switch(this.j) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.getRight();
    L7:
        return r1.getLeft();
    }
}
