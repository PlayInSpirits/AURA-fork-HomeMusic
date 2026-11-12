package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ab2;
import defpackage.b30;
import defpackage.bb2;
import defpackage.bm;
import defpackage.cx3;
import defpackage.db2;
import defpackage.dw3;
import defpackage.e35;
import defpackage.f34;
import defpackage.hm2;
import defpackage.kf2;
import defpackage.lw3;
import defpackage.mw3;
import defpackage.n41;
import defpackage.nw3;
import defpackage.o3;
import defpackage.qz0;
import defpackage.v3;
import defpackage.xw3;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends mw3 implements xw3 {
    public final n41 A;
    public final bm B;
    public final int C;
    public final int[] D;
    public int p;
    public ab2 q;
    public qz0 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public bb2 z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new n41();
        this.B = new bm();
        this.C = 2;
        this.D = new int[2];
        lw3 lw3VarJ = mw3.J(context, attributeSet, i, i2);
        g1(lw3VarJ.a);
        boolean z = lw3VarJ.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            q0();
        }
        h1(lw3VarJ.d);
    }

    @Override // defpackage.mw3
    public final boolean A0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mw3
    public void C0(RecyclerView recyclerView, int i) {
        db2 db2Var = new db2(recyclerView.getContext());
        db2Var.a = i;
        D0(db2Var);
    }

    @Override // defpackage.mw3
    public boolean E0() {
        return this.z == null && this.s == this.v;
    }

    public void F0(yw3 yw3Var, int[] iArr) {
        int i;
        int iN = yw3Var.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void G0(yw3 yw3Var, ab2 ab2Var, b30 b30Var) {
        int i = ab2Var.d;
        if (i < 0 || i >= yw3Var.b()) {
            return;
        }
        b30Var.b(i, Math.max(0, ab2Var.g));
    }

    public final int H0(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        L0();
        qz0 qz0Var = this.r;
        boolean z = !this.w;
        return e35.q(yw3Var, qz0Var, O0(z), N0(z), this, this.w);
    }

    public final int I0(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        L0();
        qz0 qz0Var = this.r;
        boolean z = !this.w;
        return e35.r(yw3Var, qz0Var, O0(z), N0(z), this, this.w, this.u);
    }

    public final int J0(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        L0();
        qz0 qz0Var = this.r;
        boolean z = !this.w;
        return e35.s(yw3Var, qz0Var, O0(z), N0(z), this, this.w);
    }

    public final int K0(int i) {
        if (i == 1) {
            return (this.p != 1 && Y0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && Y0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void L0() {
        if (this.q == null) {
            ab2 ab2Var = new ab2();
            ab2Var.a = true;
            ab2Var.h = 0;
            ab2Var.i = 0;
            ab2Var.k = null;
            this.q = ab2Var;
        }
    }

    @Override // defpackage.mw3
    public final boolean M() {
        return true;
    }

    public final int M0(hm2 hm2Var, ab2 ab2Var, yw3 yw3Var, boolean z) {
        int i;
        int i2 = ab2Var.c;
        int i3 = ab2Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                ab2Var.g = i3 + i2;
            }
            b1(hm2Var, ab2Var);
        }
        int i4 = ab2Var.c + ab2Var.h;
        while (true) {
            if ((!ab2Var.l && i4 <= 0) || (i = ab2Var.d) < 0 || i >= yw3Var.b()) {
                break;
            }
            bm bmVar = this.B;
            bmVar.a = 0;
            bmVar.b = false;
            bmVar.c = false;
            bmVar.d = false;
            Z0(hm2Var, yw3Var, ab2Var, bmVar);
            if (!bmVar.b) {
                int i5 = ab2Var.b;
                int i6 = bmVar.a;
                ab2Var.b = (ab2Var.f * i6) + i5;
                if (!bmVar.c || ab2Var.k != null || !yw3Var.g) {
                    ab2Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = ab2Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    ab2Var.g = i8;
                    int i9 = ab2Var.c;
                    if (i9 < 0) {
                        ab2Var.g = i8 + i9;
                    }
                    b1(hm2Var, ab2Var);
                }
                if (z && bmVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - ab2Var.c;
    }

    @Override // defpackage.mw3
    public final boolean N() {
        return this.t;
    }

    public final View N0(boolean z) {
        return this.u ? S0(0, v(), z, true) : S0(v() - 1, -1, z, true);
    }

    public final View O0(boolean z) {
        return this.u ? S0(v() - 1, -1, z, true) : S0(0, v(), z, true);
    }

    public final int P0() {
        View viewS0 = S0(0, v(), false, true);
        if (viewS0 == null) {
            return -1;
        }
        return mw3.I(viewS0);
    }

    public final int Q0() {
        View viewS0 = S0(v() - 1, -1, false, true);
        if (viewS0 == null) {
            return -1;
        }
        return mw3.I(viewS0);
    }

    public final View R0(int i, int i2) {
        int i3;
        int i4;
        L0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.g(u(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.h(i, i2, i3, i4) : this.d.h(i, i2, i3, i4);
    }

    public final View S0(int i, int i2, boolean z, boolean z2) {
        L0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.h(i, i2, i3, i4) : this.d.h(i, i2, i3, i4);
    }

    @Override // defpackage.mw3
    public final void T(RecyclerView recyclerView) {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View T0(hm2 hm2Var, yw3 yw3Var, boolean z, boolean z2) {
        int i;
        int iV;
        int i2;
        L0();
        int iV2 = v();
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
            i2 = 1;
        }
        int iB = yw3Var.b();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i) {
            View viewU = u(iV);
            int I = mw3.I(viewU);
            int iG = this.r.g(viewU);
            int iD = this.r.d(viewU);
            if (I >= 0 && I < iB) {
                if (!((nw3) viewU.getLayoutParams()).a.j()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewU;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z3) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // defpackage.mw3
    public View U(View view, int i, hm2 hm2Var, yw3 yw3Var) {
        int iK0;
        View viewR0;
        d1();
        if (v() != 0 && (iK0 = K0(i)) != Integer.MIN_VALUE) {
            L0();
            i1(iK0, (int) (this.r.n() * 0.33333334f), false, yw3Var);
            ab2 ab2Var = this.q;
            ab2Var.g = Integer.MIN_VALUE;
            ab2Var.a = false;
            M0(hm2Var, ab2Var, yw3Var, true);
            boolean z = this.u;
            if (iK0 == -1) {
                viewR0 = z ? R0(v() - 1, -1) : R0(0, v());
            } else {
                viewR0 = z ? R0(0, v()) : R0(v() - 1, -1);
            }
            View viewX0 = iK0 == -1 ? X0() : W0();
            if (!viewX0.hasFocusable()) {
                return viewR0;
            }
            if (viewR0 != null) {
                return viewX0;
            }
        }
        return null;
    }

    public final int U0(int i, hm2 hm2Var, yw3 yw3Var, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -e1(-i3, hm2Var, yw3Var);
        int i5 = i + i4;
        if (!z || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.q(i2);
        return i2 + i4;
    }

    @Override // defpackage.mw3
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(P0());
            accessibilityEvent.setToIndex(Q0());
        }
    }

    public final int V0(int i, hm2 hm2Var, yw3 yw3Var, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -e1(iM2, hm2Var, yw3Var);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.q(-iM);
        return i2 - iM;
    }

    @Override // defpackage.mw3
    public void W(hm2 hm2Var, yw3 yw3Var, v3 v3Var) {
        super.W(hm2Var, yw3Var, v3Var);
        dw3 dw3Var = this.b.z;
        if (dw3Var == null || dw3Var.a() <= 0) {
            return;
        }
        v3Var.b(o3.o);
    }

    public final View W0() {
        return u(this.u ? 0 : v() - 1);
    }

    public final View X0() {
        return u(this.u ? v() - 1 : 0);
    }

    public final boolean Y0() {
        return this.b.getLayoutDirection() == 1;
    }

    public void Z0(hm2 hm2Var, yw3 yw3Var, ab2 ab2Var, bm bmVar) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = ab2Var.b(hm2Var);
        if (viewB == null) {
            bmVar.b = true;
            return;
        }
        nw3 nw3Var = (nw3) viewB.getLayoutParams();
        List list = ab2Var.k;
        boolean z = this.u;
        int i3 = ab2Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        nw3 nw3Var2 = (nw3) viewB.getLayoutParams();
        Rect rectP = this.b.P(viewB);
        int i4 = rectP.left + rectP.right;
        int i5 = rectP.top + rectP.bottom;
        int iW = mw3.w(d(), this.n, this.l, G() + F() + ((ViewGroup.MarginLayoutParams) nw3Var2).leftMargin + ((ViewGroup.MarginLayoutParams) nw3Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) nw3Var2).width);
        int iW2 = mw3.w(e(), this.o, this.m, E() + H() + ((ViewGroup.MarginLayoutParams) nw3Var2).topMargin + ((ViewGroup.MarginLayoutParams) nw3Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) nw3Var2).height);
        if (z0(viewB, iW, iW2, nw3Var2)) {
            viewB.measure(iW, iW2);
        }
        bmVar.a = this.r.e(viewB);
        if (this.p == 1) {
            if (Y0()) {
                iF2 = this.n - G();
                iF = iF2 - this.r.f(viewB);
            } else {
                int iF3 = F();
                iF2 = this.r.f(viewB) + iF3;
                iF = iF3;
            }
            int i6 = ab2Var.f;
            i2 = ab2Var.b;
            int i7 = bmVar.a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iH = H();
            int iF4 = this.r.f(viewB) + iH;
            int i9 = ab2Var.f;
            int i10 = ab2Var.b;
            int i11 = bmVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iF2 = i10;
                i2 = iH;
                i = iF4;
                iF = i12;
            } else {
                int i13 = i10 + i11;
                i = iF4;
                iF = i10;
                i2 = iH;
                iF2 = i13;
            }
        }
        mw3.P(viewB, iF, i2, iF2, i);
        if (nw3Var.a.j() || nw3Var.a.m()) {
            bmVar.c = true;
        }
        bmVar.d = viewB.hasFocusable();
    }

    @Override // defpackage.xw3
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < mw3.I(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(hm2 hm2Var, yw3 yw3Var, n41 n41Var, int i) {
    }

    public final void b1(hm2 hm2Var, ab2 ab2Var) {
        if (!ab2Var.a || ab2Var.l) {
            return;
        }
        int i = ab2Var.g;
        int i2 = ab2Var.i;
        if (ab2Var.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iH = (this.r.h() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.g(viewU) < iH || this.r.p(viewU) < iH) {
                        c1(hm2Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.g(viewU2) < iH || this.r.p(viewU2) < iH) {
                    c1(hm2Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.d(viewU3) > i6 || this.r.o(viewU3) > i6) {
                    c1(hm2Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.d(viewU4) > i6 || this.r.o(viewU4) > i6) {
                c1(hm2Var, i8, i9);
                return;
            }
        }
    }

    @Override // defpackage.mw3
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final void c1(hm2 hm2Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                o0(i);
                hm2Var.h(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            o0(i3);
            hm2Var.h(viewU2);
        }
    }

    @Override // defpackage.mw3
    public final boolean d() {
        return this.p == 0;
    }

    public final void d1() {
        if (this.p == 1 || !Y0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // defpackage.mw3
    public final boolean e() {
        return this.p == 1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:126:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0236  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.mw3
    public void e0(hm2 hm2Var, yw3 yw3Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewT0;
        boolean z3;
        qz0 qz0Var;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        qz0 qz0Var2;
        int iN;
        nw3 nw3Var;
        int i2;
        int iG2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iU0;
        int i7;
        View viewQ;
        int iG3;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.z == null && this.x == -1) && yw3Var.b() == 0) {
            l0(hm2Var);
            return;
        }
        bb2 bb2Var = this.z;
        if (bb2Var != null && (i9 = bb2Var.n) >= 0) {
            this.x = i9;
        }
        L0();
        boolean z6 = false;
        this.q.a = false;
        d1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.r).contains(focusedChild)) {
            focusedChild = null;
        }
        n41 n41Var = this.A;
        if (!n41Var.e || this.x != -1 || this.z != null) {
            n41Var.f();
            n41Var.d = this.u ^ this.v;
            if (yw3Var.g || (i2 = this.x) == -1) {
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.r).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        nw3Var = (nw3) focusedChild2.getLayoutParams();
                        if (!nw3Var.a.j() || nw3Var.a.d() < 0 || nw3Var.a.d() >= yw3Var.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewT0 = T0(hm2Var, yw3Var, n41Var.d, z2)) == null) {
                                n41Var.b();
                                if (this.v) {
                                    iB = yw3Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                n41Var.b = iB;
                            } else {
                                int I = mw3.I(viewT0);
                                z3 = n41Var.d;
                                qz0Var = (qz0) n41Var.f;
                                if (z3) {
                                    int iD2 = qz0Var.d(viewT0);
                                    qz0Var2 = (qz0) n41Var.f;
                                    if (Integer.MIN_VALUE == qz0Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = qz0Var2.n() - qz0Var2.a;
                                    }
                                    n41Var.c = iN + iD2;
                                } else {
                                    n41Var.c = qz0Var.g(viewT0);
                                }
                                n41Var.b = I;
                                if (!yw3Var.g && E0()) {
                                    iG = this.r.g(viewT0);
                                    iD = this.r.d(viewT0);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (n41Var.d) {
                                            iM = i;
                                        }
                                        n41Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            n41Var.c(focusedChild2, mw3.I(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            n41Var.b();
                            if (this.v) {
                                iB = yw3Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            n41Var.b = iB;
                        } else {
                            int I2 = mw3.I(viewT0);
                            z3 = n41Var.d;
                            qz0Var = (qz0) n41Var.f;
                            if (z3) {
                                int iD3 = qz0Var.d(viewT0);
                                qz0Var2 = (qz0) n41Var.f;
                                if (Integer.MIN_VALUE == qz0Var2.a) {
                                    iN = 0;
                                } else {
                                    iN = qz0Var2.n() - qz0Var2.a;
                                }
                                n41Var.c = iN + iD3;
                            } else {
                                n41Var.c = qz0Var.g(viewT0);
                            }
                            n41Var.b = I2;
                            if (!yw3Var.g) {
                                iG = this.r.g(viewT0);
                                iD = this.r.d(viewT0);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (n41Var.d) {
                                        iM = i;
                                    }
                                    n41Var.c = iM;
                                } else {
                                    if (n41Var.d) {
                                        iM = i;
                                    }
                                    n41Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    n41Var.b();
                    if (this.v) {
                        iB = yw3Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    n41Var.b = iB;
                }
            } else if (i2 < 0 || i2 >= yw3Var.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        nw3Var = (nw3) focusedChild2.getLayoutParams();
                        if (nw3Var.a.j()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                n41Var.b();
                                if (this.v) {
                                    iB = yw3Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                n41Var.b = iB;
                            } else {
                                int I3 = mw3.I(viewT0);
                                z3 = n41Var.d;
                                qz0Var = (qz0) n41Var.f;
                                if (z3) {
                                    int iD4 = qz0Var.d(viewT0);
                                    qz0Var2 = (qz0) n41Var.f;
                                    if (Integer.MIN_VALUE == qz0Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = qz0Var2.n() - qz0Var2.a;
                                    }
                                    n41Var.c = iN + iD4;
                                } else {
                                    n41Var.c = qz0Var.g(viewT0);
                                }
                                n41Var.b = I3;
                                if (!yw3Var.g) {
                                    iG = this.r.g(viewT0);
                                    iD = this.r.d(viewT0);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (n41Var.d) {
                                            iM = i;
                                        }
                                        n41Var.c = iM;
                                    } else {
                                        if (n41Var.d) {
                                            iM = i;
                                        }
                                        n41Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                n41Var.b();
                                if (this.v) {
                                    iB = yw3Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                n41Var.b = iB;
                            } else {
                                int I4 = mw3.I(viewT0);
                                z3 = n41Var.d;
                                qz0Var = (qz0) n41Var.f;
                                if (z3) {
                                    int iD5 = qz0Var.d(viewT0);
                                    qz0Var2 = (qz0) n41Var.f;
                                    if (Integer.MIN_VALUE == qz0Var2.a) {
                                        iN = 0;
                                    } else {
                                        iN = qz0Var2.n() - qz0Var2.a;
                                    }
                                    n41Var.c = iN + iD5;
                                } else {
                                    n41Var.c = qz0Var.g(viewT0);
                                }
                                n41Var.b = I4;
                                if (!yw3Var.g) {
                                    iG = this.r.g(viewT0);
                                    iD = this.r.d(viewT0);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (n41Var.d) {
                                            iM = i;
                                        }
                                        n41Var.c = iM;
                                    } else {
                                        if (n41Var.d) {
                                            iM = i;
                                        }
                                        n41Var.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            n41Var.b();
                            if (this.v) {
                                iB = yw3Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            n41Var.b = iB;
                        } else {
                            int I5 = mw3.I(viewT0);
                            z3 = n41Var.d;
                            qz0Var = (qz0) n41Var.f;
                            if (z3) {
                                int iD6 = qz0Var.d(viewT0);
                                qz0Var2 = (qz0) n41Var.f;
                                if (Integer.MIN_VALUE == qz0Var2.a) {
                                    iN = 0;
                                } else {
                                    iN = qz0Var2.n() - qz0Var2.a;
                                }
                                n41Var.c = iN + iD6;
                            } else {
                                n41Var.c = qz0Var.g(viewT0);
                            }
                            n41Var.b = I5;
                            if (!yw3Var.g) {
                                iG = this.r.g(viewT0);
                                iD = this.r.d(viewT0);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (n41Var.d) {
                                        iM = i;
                                    }
                                    n41Var.c = iM;
                                } else {
                                    if (n41Var.d) {
                                        iM = i;
                                    }
                                    n41Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    n41Var.b();
                    if (this.v) {
                        iB = yw3Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    n41Var.b = iB;
                }
            } else {
                int i11 = this.x;
                n41Var.b = i11;
                bb2 bb2Var2 = this.z;
                if (bb2Var2 != null && bb2Var2.n >= 0) {
                    boolean z7 = bb2Var2.p;
                    n41Var.d = z7;
                    qz0 qz0Var3 = this.r;
                    if (z7) {
                        n41Var.c = qz0Var3.i() - this.z.o;
                    } else {
                        n41Var.c = qz0Var3.m() + this.z.o;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i11);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            n41Var.d = (this.x < mw3.I(u(0))) == this.u;
                        }
                        n41Var.b();
                    } else if (this.r.e(viewQ2) > this.r.n()) {
                        n41Var.b();
                    } else {
                        int iG4 = this.r.g(viewQ2) - this.r.m();
                        qz0 qz0Var4 = this.r;
                        if (iG4 < 0) {
                            n41Var.c = qz0Var4.m();
                            n41Var.d = false;
                        } else if (qz0Var4.i() - this.r.d(viewQ2) < 0) {
                            n41Var.c = this.r.i();
                            n41Var.d = true;
                        } else {
                            boolean z8 = n41Var.d;
                            qz0 qz0Var5 = this.r;
                            if (z8) {
                                int iD7 = qz0Var5.d(viewQ2);
                                qz0 qz0Var6 = this.r;
                                iG2 = (Integer.MIN_VALUE == qz0Var6.a ? 0 : qz0Var6.n() - qz0Var6.a) + iD7;
                            } else {
                                iG2 = qz0Var5.g(viewQ2);
                            }
                            n41Var.c = iG2;
                        }
                    }
                } else {
                    boolean z9 = this.u;
                    n41Var.d = z9;
                    qz0 qz0Var7 = this.r;
                    if (z9) {
                        n41Var.c = qz0Var7.i() - this.y;
                    } else {
                        n41Var.c = qz0Var7.m() + this.y;
                    }
                }
            }
            n41Var.e = true;
        } else if (focusedChild != null && (this.r.g(focusedChild) >= this.r.i() || this.r.d(focusedChild) <= this.r.m())) {
            n41Var.c(focusedChild, mw3.I(focusedChild));
        }
        ab2 ab2Var = this.q;
        ab2Var.f = ab2Var.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        F0(yw3Var, iArr);
        int iM2 = this.r.m() + Math.max(0, iArr[0]);
        int iJ = this.r.j() + Math.max(0, iArr[1]);
        if (yw3Var.g && (i7 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewQ = q(i7)) != null) {
            boolean z10 = this.u;
            qz0 qz0Var8 = this.r;
            if (z10) {
                i8 = qz0Var8.i() - this.r.d(viewQ);
                iG3 = this.y;
            } else {
                iG3 = qz0Var8.g(viewQ) - this.r.m();
                i8 = this.y;
            }
            int i12 = i8 - iG3;
            if (i12 > 0) {
                iM2 += i12;
            } else {
                iJ -= i12;
            }
        }
        boolean z11 = n41Var.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i10 = 1;
        }
        a1(hm2Var, yw3Var, n41Var, i10);
        p(hm2Var);
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = n41Var.d;
        int i13 = n41Var.b;
        if (z13) {
            k1(i13, n41Var.c);
            ab2 ab2Var2 = this.q;
            ab2Var2.h = iM2;
            M0(hm2Var, ab2Var2, yw3Var, false);
            ab2 ab2Var3 = this.q;
            i4 = ab2Var3.b;
            int i14 = ab2Var3.d;
            int i15 = ab2Var3.c;
            if (i15 > 0) {
                iJ += i15;
            }
            j1(n41Var.b, n41Var.c);
            ab2 ab2Var4 = this.q;
            ab2Var4.h = iJ;
            ab2Var4.d += ab2Var4.e;
            M0(hm2Var, ab2Var4, yw3Var, false);
            ab2 ab2Var5 = this.q;
            i3 = ab2Var5.b;
            int i16 = ab2Var5.c;
            if (i16 > 0) {
                k1(i14, i4);
                ab2 ab2Var6 = this.q;
                ab2Var6.h = i16;
                M0(hm2Var, ab2Var6, yw3Var, false);
                i4 = this.q.b;
            }
        } else {
            j1(i13, n41Var.c);
            ab2 ab2Var7 = this.q;
            ab2Var7.h = iJ;
            M0(hm2Var, ab2Var7, yw3Var, false);
            ab2 ab2Var8 = this.q;
            i3 = ab2Var8.b;
            int i17 = ab2Var8.d;
            int i18 = ab2Var8.c;
            if (i18 > 0) {
                iM2 += i18;
            }
            k1(n41Var.b, n41Var.c);
            ab2 ab2Var9 = this.q;
            ab2Var9.h = iM2;
            ab2Var9.d += ab2Var9.e;
            M0(hm2Var, ab2Var9, yw3Var, false);
            ab2 ab2Var10 = this.q;
            int i19 = ab2Var10.b;
            int i20 = ab2Var10.c;
            if (i20 > 0) {
                j1(i17, i3);
                ab2 ab2Var11 = this.q;
                ab2Var11.h = i20;
                M0(hm2Var, ab2Var11, yw3Var, false);
                i3 = this.q.b;
            }
            i4 = i19;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int iU1 = U0(i3, hm2Var, yw3Var, true);
                i5 = i4 + iU1;
                i6 = i3 + iU1;
                iU0 = V0(i5, hm2Var, yw3Var, false);
            } else {
                int iV0 = V0(i4, hm2Var, yw3Var, true);
                i5 = i4 + iV0;
                i6 = i3 + iV0;
                iU0 = U0(i6, hm2Var, yw3Var, false);
            }
            i4 = i5 + iU0;
            i3 = i6 + iU0;
        }
        if (yw3Var.k && v() != 0 && !yw3Var.g && E0()) {
            List list2 = hm2Var.a;
            int size = list2.size();
            int I6 = mw3.I(u(0));
            int i21 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i21 < size) {
                cx3 cx3Var = (cx3) list2.get(i21);
                boolean zJ = cx3Var.j();
                View view = cx3Var.a;
                if (!zJ) {
                    boolean z14 = cx3Var.d() < I6 ? true : z6;
                    boolean z15 = this.u;
                    qz0 qz0Var9 = this.r;
                    if (z14 != z15) {
                        iE += qz0Var9.e(view);
                    } else {
                        iE2 += qz0Var9.e(view);
                    }
                }
                i21++;
                z6 = false;
            }
            this.q.k = list2;
            if (iE > 0) {
                k1(mw3.I(X0()), i4);
                ab2 ab2Var12 = this.q;
                ab2Var12.h = iE;
                r4 = 0;
                ab2Var12.c = 0;
                ab2Var12.a(null);
                M0(hm2Var, this.q, yw3Var, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                j1(mw3.I(W0()), i3);
                ab2 ab2Var13 = this.q;
                ab2Var13.h = iE2;
                ab2Var13.c = r4;
                list = null;
                ab2Var13.a(null);
                M0(hm2Var, this.q, yw3Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (yw3Var.g) {
            n41Var.f();
        } else {
            qz0 qz0Var10 = this.r;
            qz0Var10.a = qz0Var10.n();
        }
        this.s = this.v;
    }

    public final int e1(int i, hm2 hm2Var, yw3 yw3Var) {
        if (v() != 0 && i != 0) {
            L0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            i1(i2, iAbs, true, yw3Var);
            ab2 ab2Var = this.q;
            int iM0 = M0(hm2Var, ab2Var, yw3Var, false) + ab2Var.g;
            if (iM0 >= 0) {
                if (iAbs > iM0) {
                    i = i2 * iM0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.mw3
    public void f0(yw3 yw3Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.f();
    }

    public final void f1(int i, int i2) {
        this.x = i;
        this.y = i2;
        bb2 bb2Var = this.z;
        if (bb2Var != null) {
            bb2Var.n = -1;
        }
        q0();
    }

    @Override // defpackage.mw3
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof bb2) {
            bb2 bb2Var = (bb2) parcelable;
            this.z = bb2Var;
            if (this.x != -1) {
                bb2Var.n = -1;
            }
            q0();
        }
    }

    public final void g1(int i) {
        if (i != 0 && i != 1) {
            kf2.n(f34.f(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            qz0 qz0VarB = qz0.b(this, i);
            this.r = qz0VarB;
            this.A.f = qz0VarB;
            this.p = i;
            q0();
        }
    }

    @Override // defpackage.mw3
    public final void h(int i, int i2, yw3 yw3Var, b30 b30Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        L0();
        i1(i > 0 ? 1 : -1, Math.abs(i), true, yw3Var);
        G0(yw3Var, this.q, b30Var);
    }

    @Override // defpackage.mw3
    public final Parcelable h0() {
        bb2 bb2Var = this.z;
        if (bb2Var != null) {
            bb2 bb2Var2 = new bb2();
            bb2Var2.n = bb2Var.n;
            bb2Var2.o = bb2Var.o;
            bb2Var2.p = bb2Var.p;
            return bb2Var2;
        }
        bb2 bb2Var3 = new bb2();
        if (v() <= 0) {
            bb2Var3.n = -1;
            return bb2Var3;
        }
        L0();
        boolean z = this.s ^ this.u;
        bb2Var3.p = z;
        if (z) {
            View viewW0 = W0();
            bb2Var3.o = this.r.i() - this.r.d(viewW0);
            bb2Var3.n = mw3.I(viewW0);
            return bb2Var3;
        }
        View viewX0 = X0();
        bb2Var3.n = mw3.I(viewX0);
        bb2Var3.o = this.r.g(viewX0) - this.r.m();
        return bb2Var3;
    }

    public void h1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        q0();
    }

    @Override // defpackage.mw3
    public final void i(int i, b30 b30Var) {
        boolean z;
        int i2;
        bb2 bb2Var = this.z;
        if (bb2Var == null || (i2 = bb2Var.n) < 0) {
            d1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = bb2Var.p;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            b30Var.b(i2, 0);
            i2 += i3;
        }
    }

    public final void i1(int i, int i2, boolean z, yw3 yw3Var) {
        int iM;
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        F0(yw3Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        ab2 ab2Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        ab2Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        ab2Var.i = iMax;
        if (z2) {
            ab2Var.h = this.r.j() + i3;
            View viewW0 = W0();
            ab2 ab2Var2 = this.q;
            ab2Var2.e = this.u ? -1 : 1;
            int I = mw3.I(viewW0);
            ab2 ab2Var3 = this.q;
            ab2Var2.d = I + ab2Var3.e;
            ab2Var3.b = this.r.d(viewW0);
            iM = this.r.d(viewW0) - this.r.i();
        } else {
            View viewX0 = X0();
            ab2 ab2Var4 = this.q;
            ab2Var4.h = this.r.m() + ab2Var4.h;
            ab2 ab2Var5 = this.q;
            ab2Var5.e = this.u ? 1 : -1;
            int I2 = mw3.I(viewX0);
            ab2 ab2Var6 = this.q;
            ab2Var5.d = I2 + ab2Var6.e;
            ab2Var6.b = this.r.g(viewX0);
            iM = (-this.r.g(viewX0)) + this.r.m();
        }
        ab2 ab2Var7 = this.q;
        ab2Var7.c = i2;
        if (z) {
            ab2Var7.c = i2 - iM;
        }
        ab2Var7.g = iM;
    }

    @Override // defpackage.mw3
    public final int j(yw3 yw3Var) {
        return H0(yw3Var);
    }

    @Override // defpackage.mw3
    public boolean j0(int i, Bundle bundle) {
        int iMin;
        if (super.j0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, K(recyclerView.p, recyclerView.u0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, x(recyclerView2.p, recyclerView2.u0) - 1);
            }
            if (iMin >= 0) {
                f1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final void j1(int i, int i2) {
        this.q.c = this.r.i() - i2;
        ab2 ab2Var = this.q;
        ab2Var.e = this.u ? -1 : 1;
        ab2Var.d = i;
        ab2Var.f = 1;
        ab2Var.b = i2;
        ab2Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.mw3
    public int k(yw3 yw3Var) {
        return I0(yw3Var);
    }

    public final void k1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        ab2 ab2Var = this.q;
        ab2Var.d = i;
        ab2Var.e = this.u ? 1 : -1;
        ab2Var.f = -1;
        ab2Var.b = i2;
        ab2Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.mw3
    public int l(yw3 yw3Var) {
        return J0(yw3Var);
    }

    @Override // defpackage.mw3
    public final int m(yw3 yw3Var) {
        return H0(yw3Var);
    }

    @Override // defpackage.mw3
    public int n(yw3 yw3Var) {
        return I0(yw3Var);
    }

    @Override // defpackage.mw3
    public int o(yw3 yw3Var) {
        return J0(yw3Var);
    }

    @Override // defpackage.mw3
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int I = i - mw3.I(u(0));
        if (I >= 0 && I < iV) {
            View viewU = u(I);
            if (mw3.I(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.mw3
    public nw3 r() {
        return new nw3(-2, -2);
    }

    @Override // defpackage.mw3
    public int r0(int i, hm2 hm2Var, yw3 yw3Var) {
        if (this.p == 1) {
            return 0;
        }
        return e1(i, hm2Var, yw3Var);
    }

    @Override // defpackage.mw3
    public final void s0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        bb2 bb2Var = this.z;
        if (bb2Var != null) {
            bb2Var.n = -1;
        }
        q0();
    }

    @Override // defpackage.mw3
    public int t0(int i, hm2 hm2Var, yw3 yw3Var) {
        if (this.p == 0) {
            return 0;
        }
        return e1(i, hm2Var, yw3Var);
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new n41();
        this.B = new bm();
        this.C = 2;
        this.D = new int[2];
        g1(i);
        c(null);
        if (this.t) {
            this.t = false;
            q0();
        }
    }
}
