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

    public /* synthetic */ tt(de0 r1, int r2) {
        this.j = r2;
        this.k = r1;
    }

    @Override // defpackage.hw
    public final void A(View r4, int r5, int r6) {
        int r0 = this.j;
        de0 r3 = this.k;
        switch(r0) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r7 = (SideSheetBehavior) r3;
        WeakReference r8 = r7.D;
        if (r8 == null) goto L7;
        View r9 = (View) r8.get();
    L8:
        if (r9 == null) goto L12;
        ViewGroup.MarginLayoutParams r1 = (ViewGroup.MarginLayoutParams) r9.getLayoutParams();
        if (r1 == null) goto L12;
        r7.n.U(r1, r4.getLeft(), r4.getRight());
        r9.setLayoutParams(r1);
    L12:
        LinkedHashSet r10 = r7.I;
        if (r10.isEmpty() == true) goto L19;
        r7.n.f(r5);
        Iterator r11 = r10.iterator();
        if (r11.hasNext() == true) goto L18;
        return;
    L18:
        throw xa3.d(r11);
    L19:
        return;
    L7:
        r9 = null;
        goto L8
    L20:
        ((BottomSheetBehavior) r3).A(r6);
    }

    @Override // defpackage.hw
    public final void B(View r7, float r8, float r9) {
        int r0 = this.j;
        int r3 = 3;
        de0 r6 = this.k;
        switch(r0) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r10 = (SideSheetBehavior) r6;
        if (r10.n.G(r8) == false) goto L8;
    L23:
        r10.z(r7, r3, true);
        return;
    L8:
        if (r10.n.S(r7, r8) == false) goto L15;
        if (r10.n.L(r8, r9) == false) goto L12;
    L22:
        r3 = 5;
        goto L23
    L12:
        if (r10.n.J(r7) == false) goto L23;
    L15:
        if (r8 != 0.0f) goto L17;
    L19:
        int r11 = r7.getLeft();
        if (Math.abs(r11 - r10.n.t()) >= Math.abs(r11 - r10.n.u())) goto L22;
    L17:
        if (Math.abs(r8) <= Math.abs(r9)) goto L19;
    L25:
        BottomSheetBehavior r12 = (BottomSheetBehavior) r6;
        if (r9 >= 0.0f) goto L34;
        if (r12.o == true) goto L75;
        int r13 = r7.getTop();
        System.currentTimeMillis();
        if (r13 <= r12.R) goto L75;
    L50:
        r3 = 6;
    L75:
        r12.M(r7, r3, true);
        return;
    L34:
        if (r12.V == false) goto L52;
        if (r12.L(r7, r9) == false) goto L52;
        if (Math.abs(r8) >= Math.abs(r9)) goto L42;
        if (r9 <= r12.q) goto L42;
    L43:
        r3 = 5;
    L42:
        if (r7.getTop() > ((r12.E() + r12.g0) / 2)) goto L43;
        if (r12.o == true) goto L75;
        if (Math.abs(r7.getTop() - r12.E()) >= Math.abs(r7.getTop() - r12.R)) goto L50;
    L52:
        if (r9 != 0.0f) goto L54;
    L62:
        int r14 = r7.getTop();
        if (r12.o == true) goto L65;
        int r15 = r12.R;
        if (r14 >= r15) goto L73;
        if (r14 >= Math.abs(r14 - r12.T)) goto L50;
    L73:
        if (Math.abs(r14 - r15) < Math.abs(r14 - r12.T)) goto L50;
    L58:
        r3 = 4;
        goto L75
    L65:
        if (Math.abs(r14 - r12.Q) >= Math.abs(r14 - r12.T)) goto L58;
    L54:
        if (Math.abs(r8) > Math.abs(r9)) goto L62;
        if (r12.o == true) goto L58;
        int r16 = r7.getTop();
        if (Math.abs(r16 - r12.R) >= Math.abs(r16 - r12.T)) goto L58;
        goto L58
    }

    @Override // defpackage.hw
    public final boolean Q(View r5, int r6) {
        int r0 = this.j;
        de0 r4 = this.k;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r7 = (SideSheetBehavior) r4;
        if (r7.u == 1) goto L13;
        WeakReference r8 = r7.C;
        if (r8 == null) goto L13;
        if (r8.get() != r5) goto L13;
        return true;
    L13:
        return false;
    L14:
        BottomSheetBehavior r9 = (BottomSheetBehavior) r4;
        int r1 = r9.Y;
        if (r1 == 1) goto L38;
        if (r9.o0 == true) goto L38;
        if (r1 == 3) goto L23;
    L32:
        System.currentTimeMillis();
        WeakReference r10 = r9.h0;
        if (r10 == null) goto L38;
        if (r10.get() != r5) goto L38;
        return true;
    L23:
        if (r9.m0 != r6) goto L32;
        WeakReference r11 = r9.i0;
        if (r11 == null) goto L27;
        View r12 = (View) r11.get();
    L28:
        if (r12 == null) goto L32;
        if (r12.canScrollVertically(-1) == false) goto L32;
    L27:
        r12 = null;
    L38:
        return false;
    }

    @Override // defpackage.hw
    public final int d(View r2, int r3) {
        switch(this.j) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r1 = (SideSheetBehavior) this.k;
        return su3.l(r3, r1.n.x(), r1.n.v());
    L7:
        return r2.getLeft();
    }

    @Override // defpackage.hw
    public final int e(View r2, int r3) {
        switch(this.j) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTop();
    L7:
        return su3.l(r3, ((BottomSheetBehavior) this.k).E(), p());
    }

    @Override // defpackage.hw
    public int o(View r2) {
        switch(this.j) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r1 = (SideSheetBehavior) this.k;
        return r1.y + r1.B;
    L5:
        return super.o(r2);
    }

    @Override // defpackage.hw
    public int p() {
        switch(this.j) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        BottomSheetBehavior r1 = (BottomSheetBehavior) this.k;
        if (r1.V == false) goto L10;
        return r1.g0;
    L10:
        return r1.T;
    L5:
        return super.p();
    }

    @Override // defpackage.hw
    public final void z(int r3) {
        int r0 = this.j;
        de0 r2 = this.k;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        if (r3 != 1) goto L14;
        SideSheetBehavior r4 = (SideSheetBehavior) r2;
        if (r4.t == false) goto L15;
        r4.x(1);
        return;
    L15:
        return;
    L14:
        return;
    L9:
        if (r3 != 1) goto L16;
        BottomSheetBehavior r5 = (BottomSheetBehavior) r2;
        if (r5.X == false) goto L17;
        r5.K(1);
        return;
    L17:
        return;
    }
}
