package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.ab2;
import defpackage.b11;
import defpackage.b30;
import defpackage.bm;
import defpackage.cx3;
import defpackage.dw3;
import defpackage.er1;
import defpackage.f34;
import defpackage.fk1;
import defpackage.hm2;
import defpackage.j65;
import defpackage.kf2;
import defpackage.mw3;
import defpackage.n41;
import defpackage.nw3;
import defpackage.o3;
import defpackage.u3;
import defpackage.v3;
import defpackage.xc5;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final xc5 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new xc5(10);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        w1(mw3.J(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final boolean E0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(yw3 yw3Var, ab2 ab2Var, b30 b30Var) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = ab2Var.d) >= 0 && i < yw3Var.b() && i2 > 0; i3++) {
            b30Var.b(ab2Var.d, Math.max(0, ab2Var.g));
            this.K.getClass();
            i2--;
            ab2Var.d += ab2Var.e;
        }
    }

    @Override // defpackage.mw3
    public final int K(hm2 hm2Var, yw3 yw3Var) {
        if (this.p == 0) {
            return Math.min(this.F, D());
        }
        if (yw3Var.b() < 1) {
            return 0;
        }
        return s1(yw3Var.b() - 1, hm2Var, yw3Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View T0(hm2 hm2Var, yw3 yw3Var, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = yw3Var.b();
        L0();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int I = mw3.I(viewU);
            if (I >= 0 && I < iB && t1(I, hm2Var, yw3Var) == 0) {
                if (((nw3) viewU.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.g(viewU) < i3 && this.r.d(viewU) >= iM) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U(View view, int i, hm2 hm2Var, yw3 yw3Var) {
        View viewE;
        int iV;
        int i2;
        int iV2;
        View view2;
        View view3;
        int i3;
        int i4;
        hm2 hm2Var2 = hm2Var;
        yw3 yw3Var2 = yw3Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (viewE = recyclerView.E(view)) == null || ((ArrayList) this.a.r).contains(viewE)) {
            viewE = null;
        }
        if (viewE != null) {
            fk1 fk1Var = (fk1) viewE.getLayoutParams();
            int i5 = fk1Var.e;
            int i6 = fk1Var.f + i5;
            if (super.U(view, i, hm2Var, yw3Var) != null) {
                if ((K0(i) == 1) != this.u) {
                    iV2 = v() - 1;
                    iV = -1;
                    i2 = -1;
                } else {
                    iV = v();
                    i2 = 1;
                    iV2 = 0;
                }
                boolean z = this.p == 1 && Y0();
                int iS1 = s1(iV2, hm2Var2, yw3Var2);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iV2;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iV) {
                        break;
                    }
                    int iS2 = s1(i9, hm2Var2, yw3Var2);
                    View viewU = u(i9);
                    if (viewU == viewE) {
                        break;
                    }
                    if (!viewU.hasFocusable() || iS2 == iS1) {
                        fk1 fk1Var2 = (fk1) viewU.getLayoutParams();
                        int i10 = fk1Var2.e;
                        view3 = viewE;
                        int i11 = fk1Var2.f + i10;
                        if (viewU.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewU;
                        }
                        if (!(viewU.hasFocusable() && view4 == null) && (viewU.hasFocusable() || view2 != null)) {
                            i3 = iV;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewU.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view4 == null) {
                                i4 = iMin;
                                if (!this.c.o(viewU) || !this.d.o(viewU)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            hm2Var2 = hm2Var;
                            yw3Var2 = yw3Var;
                            viewE = view3;
                            iV = i3;
                        } else {
                            i4 = iMin;
                            i3 = iV;
                        }
                        boolean zHasFocusable = viewU.hasFocusable();
                        int i12 = fk1Var2.e;
                        if (zHasFocusable) {
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewU;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                            i7 = i12;
                            iMin = i4;
                            view5 = viewU;
                        }
                        i9 += i2;
                        hm2Var2 = hm2Var;
                        yw3Var2 = yw3Var;
                        viewE = view3;
                        iV = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewE;
                        i4 = iMin;
                        i3 = iV;
                    }
                    view5 = view2;
                    iMin = i4;
                    i9 += i2;
                    hm2Var2 = hm2Var;
                    yw3Var2 = yw3Var;
                    viewE = view3;
                    iV = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void W(hm2 hm2Var, yw3 yw3Var, v3 v3Var) {
        super.W(hm2Var, yw3Var, v3Var);
        v3Var.i(GridView.class.getName());
        dw3 dw3Var = this.b.z;
        if (dw3Var == null || dw3Var.a() <= 1) {
            return;
        }
        v3Var.b(o3.u);
    }

    @Override // defpackage.mw3
    public final void X(hm2 hm2Var, yw3 yw3Var, View view, v3 v3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof fk1)) {
            Y(view, v3Var);
            return;
        }
        fk1 fk1Var = (fk1) layoutParams;
        int iS1 = s1(fk1Var.a.d(), hm2Var, yw3Var);
        int i = this.p;
        int i2 = fk1Var.e;
        int i3 = fk1Var.f;
        if (i == 0) {
            v3Var.k(u3.a(i2, i3, iS1, 1, false, false));
        } else {
            v3Var.k(u3.a(iS1, 1, i2, i3, false, false));
        }
    }

    @Override // defpackage.mw3
    public final void Z(int i, int i2) {
        xc5 xc5Var = this.K;
        xc5Var.t();
        ((SparseIntArray) xc5Var.p).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(hm2 hm2Var, yw3 yw3Var, ab2 ab2Var, bm bmVar) {
        int i;
        int i2;
        int i3;
        int iF;
        int iF2;
        int iW;
        int iW2;
        ?? r12;
        int i4;
        View viewB;
        int iL = this.r.l();
        boolean z = iL != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            x1();
        }
        boolean z2 = ab2Var.e == 1;
        int iT1 = this.F;
        if (!z2) {
            iT1 = t1(ab2Var.d, hm2Var, yw3Var) + u1(ab2Var.d, hm2Var, yw3Var);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = ab2Var.d) >= 0 && i4 < yw3Var.b() && iT1 > 0) {
            int i7 = ab2Var.d;
            int iU1 = u1(i7, hm2Var, yw3Var);
            if (iU1 > this.F) {
                kf2.n(f34.i(b11.t("Item at position ", " requires ", i7, iU1, " spans but GridLayoutManager has only "), this.F, " spans."));
                return;
            }
            iT1 -= iU1;
            if (iT1 < 0 || (viewB = ab2Var.b(hm2Var)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            bmVar.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            fk1 fk1Var = (fk1) view.getLayoutParams();
            int iU2 = u1(mw3.I(view), hm2Var, yw3Var);
            fk1Var.f = iU2;
            fk1Var.e = i8;
            i8 += iU2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (ab2Var.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.P(view2));
            }
            v1(view2, iL, r12);
            int iE = this.r.e(view2);
            if (iE > i9) {
                i9 = iE;
            }
            float f2 = (this.r.f(view2) * 1.0f) / ((fk1) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            l1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                v1(view3, 1073741824, true);
                int iE2 = this.r.e(view3);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.e(view4) != i9) {
                fk1 fk1Var2 = (fk1) view4.getLayoutParams();
                Rect rect2 = fk1Var2.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) fk1Var2).topMargin + ((ViewGroup.MarginLayoutParams) fk1Var2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) fk1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) fk1Var2).rightMargin;
                int iR1 = r1(fk1Var2.e, fk1Var2.f);
                if (this.p == 1) {
                    iW2 = mw3.w(false, iR1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) fk1Var2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = mw3.w(false, iR1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) fk1Var2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (B0(view4, iW2, iW, (nw3) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        int iH = 0;
        bmVar.a = i9;
        int i15 = this.p;
        int i16 = ab2Var.f;
        int iF3 = ab2Var.b;
        if (i15 != 1) {
            if (i16 == -1) {
                iF2 = iF3 - i9;
                iF = iF3;
            } else {
                iF = iF3 + i9;
                iF2 = iF3;
            }
            iF3 = iH;
        } else if (i16 == -1) {
            iH = iF3 - i9;
            iF2 = 0;
            iF = 0;
        } else {
            iF = 0;
            iH = iF3;
            iF3 += i9;
            iF2 = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            fk1 fk1Var3 = (fk1) view5.getLayoutParams();
            if (this.p != 1) {
                iH = H() + this.G[fk1Var3.e];
                iF3 = this.r.f(view5) + iH;
            } else if (Y0()) {
                int iF4 = F() + this.G[this.F - fk1Var3.e];
                iF = iF4;
                iF2 = iF4 - this.r.f(view5);
            } else {
                iF2 = F() + this.G[fk1Var3.e];
                iF = this.r.f(view5) + iF2;
            }
            mw3.P(view5, iF2, iH, iF, iF3);
            if (fk1Var3.a.j() || fk1Var3.a.m()) {
                bmVar.c = true;
            }
            bmVar.d = view5.hasFocusable() | bmVar.d;
            i17++;
        }
    }

    @Override // defpackage.mw3
    public final void a0() {
        xc5 xc5Var = this.K;
        xc5Var.t();
        ((SparseIntArray) xc5Var.p).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(hm2 hm2Var, yw3 yw3Var, n41 n41Var, int i) {
        x1();
        if (yw3Var.b() > 0 && !yw3Var.g) {
            boolean z = i == 1;
            int iT1 = t1(n41Var.b, hm2Var, yw3Var);
            if (z) {
                while (iT1 > 0) {
                    int i2 = n41Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    n41Var.b = i3;
                    iT1 = t1(i3, hm2Var, yw3Var);
                }
            } else {
                int iB = yw3Var.b() - 1;
                int i4 = n41Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iT2 = t1(i5, hm2Var, yw3Var);
                    if (iT2 <= iT1) {
                        break;
                    }
                    i4 = i5;
                    iT1 = iT2;
                }
                n41Var.b = i4;
            }
        }
        m1();
    }

    @Override // defpackage.mw3
    public final void b0(int i, int i2) {
        xc5 xc5Var = this.K;
        xc5Var.t();
        ((SparseIntArray) xc5Var.p).clear();
    }

    @Override // defpackage.mw3
    public final void c0(int i, int i2) {
        xc5 xc5Var = this.K;
        xc5Var.t();
        ((SparseIntArray) xc5Var.p).clear();
    }

    @Override // defpackage.mw3
    public final void d0(int i, int i2) {
        xc5 xc5Var = this.K;
        xc5Var.t();
        ((SparseIntArray) xc5Var.p).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void e0(hm2 hm2Var, yw3 yw3Var) {
        boolean z = yw3Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                fk1 fk1Var = (fk1) u(i).getLayoutParams();
                int iD = fk1Var.a.d();
                sparseIntArray2.put(iD, fk1Var.f);
                sparseIntArray.put(iD, fk1Var.e);
            }
        }
        super.e0(hm2Var, yw3Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // defpackage.mw3
    public final boolean f(nw3 nw3Var) {
        return nw3Var instanceof fk1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void f0(yw3 yw3Var) {
        View viewQ;
        super.f0(yw3Var);
        this.E = false;
        int i = this.M;
        if (i == -1 || (viewQ = q(i)) == null) {
            return;
        }
        viewQ.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void h1(boolean z) {
        if (z) {
            er1.l("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.h1(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final boolean j0(int i, Bundle bundle) {
        View viewU;
        cx3 cx3VarM;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == o3.u.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= v()) {
                    viewU = null;
                    break;
                }
                View viewU2 = u(i5);
                Objects.requireNonNull(viewU2);
                if (viewU2.isAccessibilityFocused()) {
                    viewU = u(i5);
                    break;
                }
                i5++;
            }
            if (viewU != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i6)) && (cx3VarM = this.b.M(viewU)) != null) {
                    int iB = cx3VarM.b();
                    int iO1 = o1(iB);
                    int iN1 = n1(iB);
                    if (iO1 >= 0 && iN1 >= 0) {
                        if (!p1(iB).contains(Integer.valueOf(this.N)) || !q1(n1(iB), iB).contains(Integer.valueOf(this.O))) {
                            this.N = iO1;
                            this.O = iN1;
                        }
                        int i7 = this.N;
                        if (i7 == -1) {
                            i7 = iO1;
                        }
                        int i8 = this.O;
                        if (i8 != -1) {
                            iN1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iO2 = o1(iIntValue);
                                    int iN2 = n1(iIntValue);
                                    if (iO2 >= 0 && iN2 >= 0) {
                                        if (this.p != 1) {
                                            if (p1(iIntValue).contains(Integer.valueOf(i7)) && iN2 < iN1) {
                                                this.O = iN2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iO2 == i7 && iN2 < iN1) || iO2 < i7) {
                                                this.N = iO2;
                                                this.O = iN2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iO1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < D()) {
                                                    it2 = p1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iO1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iO1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < D()) {
                                                it4 = p1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iO1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = n1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iO3 = o1(iIntValue);
                                    int iN3 = n1(iIntValue);
                                    if (iO3 >= 0 && iN3 >= 0) {
                                        if (this.p != 1) {
                                            if (iO3 < i7 && iN3 == iN1) {
                                                this.N = ((Integer) Collections.max(p1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iO3 < i7 && q1(n1(iIntValue), iIntValue).contains(Integer.valueOf(iN1))) {
                                                this.N = iO3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iO1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < D()) {
                                                    it2 = p1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iO1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iO1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < D()) {
                                                it4 = p1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iO1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = n1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < D()) {
                                    int iO4 = o1(iIntValue);
                                    int iN4 = n1(iIntValue);
                                    if (iO4 >= 0 && iN4 >= 0) {
                                        if (this.p != 1) {
                                            if (iN4 > iN1 && p1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.O = iN4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iO4 == i7 && iN4 > iN1) || iO4 > i7) {
                                                this.N = iO4;
                                                this.O = iN4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iO1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < D()) {
                                                    it2 = p1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iO1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iO1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < D()) {
                                                it4 = p1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iO1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = n1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < D()) {
                                    int iO5 = o1(iIntValue);
                                    int iN5 = n1(iIntValue);
                                    if (iO5 >= 0 && iN5 >= 0) {
                                        if (this.p != 1) {
                                            if (iO5 > i7 && iN5 == iN1) {
                                                this.N = o1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iO5 > i7 && (iN5 == iN1 || q1(n1(iIntValue), iIntValue).contains(Integer.valueOf(iN1)))) {
                                                this.N = iO5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.p) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iO1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < D()) {
                                                it2 = p1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iO1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.N = iIntValue2;
                                                            this.O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iO1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < D()) {
                                            it4 = p1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iO1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = iIntValue3;
                                                        this.O = n1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.j0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iA = this.b.z.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iA) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int iT1 = t1(i11, recyclerView.p, recyclerView.u0);
                    RecyclerView recyclerView2 = this.b;
                    int iS1 = s1(i11, recyclerView2.p, recyclerView2.u0);
                    if (this.p != 1) {
                        if (iT1 == i9 && iS1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iT1 == i10 && iS1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    f1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int k(yw3 yw3Var) {
        return I0(yw3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int l(yw3 yw3Var) {
        return J0(yw3Var);
    }

    public final void l1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void m1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int n(yw3 yw3Var) {
        return I0(yw3Var);
    }

    public final int n1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? s1(i, recyclerView.p, recyclerView.u0) : t1(i, recyclerView.p, recyclerView.u0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int o(yw3 yw3Var) {
        return J0(yw3Var);
    }

    public final int o1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? s1(i, recyclerView.p, recyclerView.u0) : t1(i, recyclerView.p, recyclerView.u0);
    }

    public final HashSet p1(int i) {
        return q1(o1(i), i);
    }

    public final HashSet q1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iU1 = u1(i2, recyclerView.p, recyclerView.u0);
        for (int i3 = i; i3 < i + iU1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final nw3 r() {
        return this.p == 0 ? new fk1(-2, -1) : new fk1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int r0(int i, hm2 hm2Var, yw3 yw3Var) {
        x1();
        m1();
        return super.r0(i, hm2Var, yw3Var);
    }

    public final int r1(int i, int i2) {
        if (this.p != 1 || !Y0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // defpackage.mw3
    public final nw3 s(Context context, AttributeSet attributeSet) {
        fk1 fk1Var = new fk1(context, attributeSet);
        fk1Var.e = -1;
        fk1Var.f = 0;
        return fk1Var;
    }

    public final int s1(int i, hm2 hm2Var, yw3 yw3Var) {
        boolean z = yw3Var.g;
        xc5 xc5Var = this.K;
        if (!z) {
            int i2 = this.F;
            xc5Var.getClass();
            return xc5.r(i, i2);
        }
        int iB = hm2Var.b(i);
        if (iB != -1) {
            int i3 = this.F;
            xc5Var.getClass();
            return xc5.r(iB, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // defpackage.mw3
    public final nw3 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            fk1 fk1Var = new fk1((ViewGroup.MarginLayoutParams) layoutParams);
            fk1Var.e = -1;
            fk1Var.f = 0;
            return fk1Var;
        }
        fk1 fk1Var2 = new fk1(layoutParams);
        fk1Var2.e = -1;
        fk1Var2.f = 0;
        return fk1Var2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final int t0(int i, hm2 hm2Var, yw3 yw3Var) {
        x1();
        m1();
        return super.t0(i, hm2Var, yw3Var);
    }

    public final int t1(int i, hm2 hm2Var, yw3 yw3Var) {
        boolean z = yw3Var.g;
        xc5 xc5Var = this.K;
        if (!z) {
            int i2 = this.F;
            xc5Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = hm2Var.b(i);
        if (iB != -1) {
            int i4 = this.F;
            xc5Var.getClass();
            return iB % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int u1(int i, hm2 hm2Var, yw3 yw3Var) {
        boolean z = yw3Var.g;
        xc5 xc5Var = this.K;
        if (!z) {
            xc5Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (hm2Var.b(i) != -1) {
            xc5Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void v1(View view, int i, boolean z) {
        int iW;
        int iW2;
        fk1 fk1Var = (fk1) view.getLayoutParams();
        Rect rect = fk1Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) fk1Var).topMargin + ((ViewGroup.MarginLayoutParams) fk1Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) fk1Var).leftMargin + ((ViewGroup.MarginLayoutParams) fk1Var).rightMargin;
        int iR1 = r1(fk1Var.e, fk1Var.f);
        if (this.p == 1) {
            iW2 = mw3.w(false, iR1, i, i3, ((ViewGroup.MarginLayoutParams) fk1Var).width);
            iW = mw3.w(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) fk1Var).height);
        } else {
            int iW3 = mw3.w(false, iR1, i, i2, ((ViewGroup.MarginLayoutParams) fk1Var).height);
            int iW4 = mw3.w(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) fk1Var).width);
            iW = iW3;
            iW2 = iW4;
        }
        nw3 nw3Var = (nw3) view.getLayoutParams();
        if (z ? B0(view, iW2, iW, nw3Var) : z0(view, iW2, iW, nw3Var)) {
            view.measure(iW2, iW);
        }
    }

    @Override // defpackage.mw3
    public final void w0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.w0(rect, i, i2);
        }
        int iG3 = G() + F();
        int iE = E() + H();
        if (this.p == 1) {
            int iHeight = rect.height() + iE;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = j65.a;
            iG2 = mw3.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = mw3.g(i, iArr[iArr.length - 1] + iG3, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iG3;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = j65.a;
            iG = mw3.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = mw3.g(i2, iArr2[iArr2.length - 1] + iE, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    public final void w1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            kf2.n(f34.f(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.t();
        q0();
    }

    @Override // defpackage.mw3
    public final int x(hm2 hm2Var, yw3 yw3Var) {
        if (this.p == 1) {
            return Math.min(this.F, D());
        }
        if (yw3Var.b() < 1) {
            return 0;
        }
        return s1(yw3Var.b() - 1, hm2Var, yw3Var) + 1;
    }

    public final void x1() {
        int iE;
        int iH;
        if (this.p == 1) {
            iE = this.n - G();
            iH = F();
        } else {
            iE = this.o - E();
            iH = H();
        }
        l1(iE - iH);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new xc5(10);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        w1(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new xc5(10);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        w1(i);
    }
}
