package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.b30;
import defpackage.db2;
import defpackage.e35;
import defpackage.fg4;
import defpackage.g5;
import defpackage.hm2;
import defpackage.j65;
import defpackage.kf2;
import defpackage.lw3;
import defpackage.mw3;
import defpackage.nk4;
import defpackage.nw3;
import defpackage.ok4;
import defpackage.p72;
import defpackage.pk4;
import defpackage.qk4;
import defpackage.qz0;
import defpackage.u3;
import defpackage.v3;
import defpackage.xc5;
import defpackage.xw3;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends mw3 implements xw3 {
    public final xc5 B;
    public final int C;
    public boolean D;
    public boolean E;
    public qk4 F;
    public final Rect G;
    public final nk4 H;
    public final boolean I;
    public int[] J;
    public final g5 K;
    public final int p;
    public final fg4[] q;
    public final qz0 r;
    public final qz0 s;
    public final int t;
    public int u;
    public final p72 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        xc5 xc5Var = new xc5(20, false);
        this.B = xc5Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new nk4(this);
        this.I = true;
        this.K = new g5(28, this);
        lw3 lw3VarJ = mw3.J(context, attributeSet, i, i2);
        int i3 = lw3VarJ.a;
        if (i3 != 0 && i3 != 1) {
            kf2.n("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            qz0 qz0Var = this.r;
            this.r = this.s;
            this.s = qz0Var;
            q0();
        }
        int i4 = lw3VarJ.b;
        c(null);
        if (i4 != this.p) {
            xc5Var.n();
            q0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new fg4[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new fg4(this, i5);
            }
            q0();
        }
        boolean z = lw3VarJ.c;
        c(null);
        qk4 qk4Var = this.F;
        if (qk4Var != null && qk4Var.u != z) {
            qk4Var.u = z;
        }
        this.w = z;
        q0();
        p72 p72Var = new p72();
        p72Var.a = true;
        p72Var.f = 0;
        p72Var.g = 0;
        this.v = p72Var;
        this.r = qz0.b(this, this.t);
        this.s = qz0.b(this, 1 - this.t);
    }

    public static int f1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.mw3
    public final void C0(RecyclerView recyclerView, int i) {
        db2 db2Var = new db2(recyclerView.getContext());
        db2Var.a = i;
        D0(db2Var);
    }

    @Override // defpackage.mw3
    public final boolean E0() {
        return this.F == null;
    }

    public final boolean F0() {
        int iM0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iM0 = N0();
                M0();
            } else {
                iM0 = M0();
                N0();
            }
            if (iM0 == 0 && R0() != null) {
                this.B.n();
                this.f = true;
                q0();
                return true;
            }
        }
        return false;
    }

    public final int G0(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e35.r(yw3Var, this.r, J0(z), I0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int H0(hm2 hm2Var, p72 p72Var, yw3 yw3Var) {
        int i;
        fg4[] fg4VarArr;
        int iO0;
        BitSet bitSet;
        fg4[] fg4VarArr2;
        fg4 fg4Var;
        ?? r5;
        int iK;
        int iE;
        int iE2;
        int i2;
        BitSet bitSet2;
        int i3;
        int i4;
        hm2 hm2Var2 = hm2Var;
        BitSet bitSet3 = this.y;
        int i5 = this.p;
        bitSet3.set(0, i5, true);
        p72 p72Var2 = this.v;
        if (p72Var2.i) {
            i = p72Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = p72Var.e == 1 ? p72Var.g + p72Var.b : p72Var.f - p72Var.b;
        }
        int i6 = p72Var.e;
        int i7 = 0;
        while (true) {
            fg4VarArr = this.q;
            if (i7 >= i5) {
                break;
            }
            if (!((ArrayList) fg4VarArr[i7].f).isEmpty()) {
                e1(fg4VarArr[i7], i6, i);
            }
            i7++;
        }
        boolean z = this.x;
        qz0 qz0Var = this.r;
        int i8 = z ? qz0Var.i() : qz0Var.m();
        boolean z2 = false;
        while (true) {
            int i9 = p72Var.c;
            if (i9 < 0 || i9 >= yw3Var.b() || (!p72Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View view = hm2Var2.k(p72Var.c, Long.MAX_VALUE).a;
            p72Var.c += p72Var.d;
            ok4 ok4Var = (ok4) view.getLayoutParams();
            int iD = ok4Var.a.d();
            xc5 xc5Var = this.B;
            int[] iArr = (int[]) xc5Var.o;
            int i10 = (iArr == null || iD >= iArr.length) ? -1 : iArr[iD];
            if (i10 == -1) {
                if (V0(p72Var.e)) {
                    i4 = i5 - 1;
                    i5 = -1;
                    i3 = -1;
                } else {
                    i3 = 1;
                    i4 = 0;
                }
                fg4 fg4Var2 = null;
                int i11 = i3;
                if (p72Var.e == 1) {
                    int iM = qz0Var.m();
                    fg4VarArr2 = fg4VarArr;
                    int i12 = i4;
                    int i13 = Integer.MAX_VALUE;
                    while (i12 != i5) {
                        int i14 = i12;
                        fg4 fg4Var3 = fg4VarArr2[i14];
                        BitSet bitSet4 = bitSet3;
                        int iH = fg4Var3.h(iM);
                        if (iH < i13) {
                            i13 = iH;
                            fg4Var2 = fg4Var3;
                        }
                        i12 = i14 + i11;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    fg4VarArr2 = fg4VarArr;
                    int i15 = qz0Var.i();
                    int i16 = i4;
                    int i17 = Integer.MIN_VALUE;
                    while (i16 != i5) {
                        fg4 fg4Var4 = fg4VarArr2[i16];
                        int i18 = i5;
                        int iK2 = fg4Var4.k(i15);
                        if (iK2 > i17) {
                            i17 = iK2;
                            fg4Var2 = fg4Var4;
                        }
                        i16 += i11;
                        i5 = i18;
                    }
                }
                fg4Var = fg4Var2;
                xc5Var.p(iD);
                ((int[]) xc5Var.o)[iD] = fg4Var.e;
            } else {
                bitSet = bitSet3;
                i5 = i5;
                fg4VarArr2 = fg4VarArr;
                fg4Var = fg4VarArr2[i10];
            }
            ok4Var.e = fg4Var;
            if (p72Var.e == 1) {
                r5 = 0;
                b(view, -1, false);
            } else {
                r5 = 0;
                b(view, 0, false);
            }
            int i19 = this.t;
            if (i19 == 1) {
                T0(view, mw3.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) ok4Var).width), mw3.w(true, this.o, this.m, E() + H(), ((ViewGroup.MarginLayoutParams) ok4Var).height));
            } else {
                T0(view, mw3.w(true, this.n, this.l, G() + F(), ((ViewGroup.MarginLayoutParams) ok4Var).width), mw3.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) ok4Var).height));
            }
            if (p72Var.e == 1) {
                iE = fg4Var.h(i8);
                iK = qz0Var.e(view) + iE;
            } else {
                iK = fg4Var.k(i8);
                iE = iK - qz0Var.e(view);
            }
            int i20 = p72Var.e;
            fg4 fg4Var5 = ok4Var.e;
            if (i20 == 1) {
                fg4Var5.getClass();
                ok4 ok4Var2 = (ok4) view.getLayoutParams();
                ok4Var2.e = fg4Var5;
                ArrayList arrayList = (ArrayList) fg4Var5.f;
                arrayList.add(view);
                fg4Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fg4Var5.b = Integer.MIN_VALUE;
                }
                if (ok4Var2.a.j() || ok4Var2.a.m()) {
                    fg4Var5.d = ((StaggeredGridLayoutManager) fg4Var5.g).r.e(view) + fg4Var5.d;
                }
            } else {
                fg4Var5.getClass();
                ok4 ok4Var3 = (ok4) view.getLayoutParams();
                ok4Var3.e = fg4Var5;
                ArrayList arrayList2 = (ArrayList) fg4Var5.f;
                arrayList2.add(0, view);
                fg4Var5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fg4Var5.c = Integer.MIN_VALUE;
                }
                if (ok4Var3.a.j() || ok4Var3.a.m()) {
                    fg4Var5.d = ((StaggeredGridLayoutManager) fg4Var5.g).r.e(view) + fg4Var5.d;
                }
            }
            boolean zS0 = S0();
            qz0 qz0Var2 = this.s;
            if (zS0 && i19 == 1) {
                i2 = qz0Var2.i() - (((i5 - 1) - fg4Var.e) * this.u);
                iE2 = i2 - qz0Var2.e(view);
            } else {
                int iM2 = (fg4Var.e * this.u) + qz0Var2.m();
                int iE3 = qz0Var2.e(view) + iM2;
                iE2 = iM2;
                i2 = iE3;
            }
            z2 = true;
            if (i19 == 1) {
                mw3.P(view, iE2, iE, i2, iK);
            } else {
                mw3.P(view, iE, iE2, iK, i2);
            }
            e1(fg4Var, p72Var2.e, i);
            hm2Var2 = hm2Var;
            X0(hm2Var2, p72Var2);
            if (p72Var2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(fg4Var.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i5 = i5;
            fg4VarArr = fg4VarArr2;
        }
        if (!z2) {
            X0(hm2Var2, p72Var2);
        }
        if (p72Var2.e == -1) {
            iO0 = qz0Var.m() - P0(qz0Var.m());
        } else {
            iO0 = O0(qz0Var.i()) - qz0Var.i();
        }
        if (iO0 > 0) {
            return Math.min(p72Var.b, iO0);
        }
        return 0;
    }

    public final View I0(boolean z) {
        qz0 qz0Var = this.r;
        int iM = qz0Var.m();
        int i = qz0Var.i();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iG = qz0Var.g(viewU);
            int iD = qz0Var.d(viewU);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View J0(boolean z) {
        qz0 qz0Var = this.r;
        int iM = qz0Var.m();
        int i = qz0Var.i();
        int iV = v();
        View view = null;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            int iG = qz0Var.g(viewU);
            if (qz0Var.d(viewU) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    @Override // defpackage.mw3
    public final int K(hm2 hm2Var, yw3 yw3Var) {
        if (this.t == 0) {
            return Math.min(this.p, yw3Var.b());
        }
        return -1;
    }

    public final void K0(hm2 hm2Var, yw3 yw3Var, boolean z) {
        int i;
        int iO0 = O0(Integer.MIN_VALUE);
        if (iO0 != Integer.MIN_VALUE && (i = this.r.i() - iO0) > 0) {
            int i2 = i - (-b1(-i, hm2Var, yw3Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.r.q(i2);
        }
    }

    public final void L0(hm2 hm2Var, yw3 yw3Var, boolean z) {
        int iM;
        int iP0 = P0(Integer.MAX_VALUE);
        if (iP0 != Integer.MAX_VALUE && (iM = iP0 - this.r.m()) > 0) {
            int iB1 = iM - b1(iM, hm2Var, yw3Var);
            if (!z || iB1 <= 0) {
                return;
            }
            this.r.q(-iB1);
        }
    }

    @Override // defpackage.mw3
    public final boolean M() {
        return this.C != 0;
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return mw3.I(u(0));
    }

    @Override // defpackage.mw3
    public final boolean N() {
        return this.w;
    }

    public final int N0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return mw3.I(u(iV - 1));
    }

    public final int O0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    public final int P0(int i) {
        int iK = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iK2 = this.q[i2].k(i);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    @Override // defpackage.mw3
    public final void Q(int i) {
        super.Q(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fg4 fg4Var = this.q[i2];
            int i3 = fg4Var.b;
            if (i3 != Integer.MIN_VALUE) {
                fg4Var.b = i3 + i;
            }
            int i4 = fg4Var.c;
            if (i4 != Integer.MIN_VALUE) {
                fg4Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void Q0(int i, int i2, int i3) {
        int i4;
        int i5;
        xc5 xc5Var;
        int[] iArr;
        int iN0;
        ArrayList arrayList;
        int size;
        pk4 pk4Var;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iN1 = this.x ? N0() : M0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            xc5Var = this.B;
            iArr = (int[]) xc5Var.o;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) xc5Var.p;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            pk4Var = null;
                            break;
                        }
                        pk4Var = (pk4) ((ArrayList) xc5Var.p).get(size);
                        if (pk4Var.n == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (pk4Var != null) {
                        ((ArrayList) xc5Var.p).remove(pk4Var);
                    }
                    size2 = ((ArrayList) xc5Var.p).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((pk4) ((ArrayList) xc5Var.p).get(i6)).n >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        pk4 pk4Var2 = (pk4) ((ArrayList) xc5Var.p).get(i6);
                        ((ArrayList) xc5Var.p).remove(i6);
                        i7 = pk4Var2.n;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) xc5Var.o;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) xc5Var.o).length;
                } else {
                    Arrays.fill((int[]) xc5Var.o, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                xc5Var.u(i, i2);
            } else if (i3 != 2) {
                xc5Var.v(i, i2);
            } else if (i3 == 8) {
                xc5Var.v(i, 1);
                xc5Var.u(i2, 1);
            }
            if (i4 <= iN1) {
                return;
            }
            if (this.x) {
                iN0 = M0();
            } else {
                iN0 = N0();
            }
            if (i5 <= iN0) {
                q0();
            }
        }
        i4 = i + i2;
        i5 = i;
        xc5Var = this.B;
        iArr = (int[]) xc5Var.o;
        if (iArr != null) {
            arrayList = (ArrayList) xc5Var.p;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        pk4Var = null;
                        break;
                    }
                    pk4Var = (pk4) ((ArrayList) xc5Var.p).get(size);
                    if (pk4Var.n == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (pk4Var != null) {
                    ((ArrayList) xc5Var.p).remove(pk4Var);
                }
                size2 = ((ArrayList) xc5Var.p).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((pk4) ((ArrayList) xc5Var.p).get(i6)).n >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    pk4 pk4Var3 = (pk4) ((ArrayList) xc5Var.p).get(i6);
                    ((ArrayList) xc5Var.p).remove(i6);
                    i7 = pk4Var3.n;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) xc5Var.o;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) xc5Var.o).length;
            } else {
                Arrays.fill((int[]) xc5Var.o, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            xc5Var.u(i, i2);
        } else if (i3 != 2) {
            xc5Var.v(i, i2);
        } else if (i3 == 8) {
            xc5Var.v(i, 1);
            xc5Var.u(i2, 1);
        }
        if (i4 <= iN1) {
            return;
        }
        if (this.x) {
            iN0 = M0();
        } else {
            iN0 = N0();
        }
        if (i5 <= iN0) {
            q0();
        }
    }

    @Override // defpackage.mw3
    public final void R(int i) {
        super.R(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fg4 fg4Var = this.q[i2];
            int i3 = fg4Var.b;
            if (i3 != Integer.MIN_VALUE) {
                fg4Var.b = i3 + i;
            }
            int i4 = fg4Var.c;
            if (i4 != Integer.MIN_VALUE) {
                fg4Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View R0() {
        boolean z;
        boolean z2;
        int iV = v();
        int i = iV - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.t == 1 && S0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iV = -1;
        } else {
            i = 0;
        }
        int i3 = i < iV ? 1 : -1;
        while (i != iV) {
            View viewU = u(i);
            ok4 ok4Var = (ok4) viewU.getLayoutParams();
            boolean z3 = bitSet.get(ok4Var.e.e);
            qz0 qz0Var = this.r;
            if (z3) {
                fg4 fg4Var = ok4Var.e;
                if (this.x) {
                    int i4 = fg4Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        fg4Var.b();
                        i4 = fg4Var.c;
                    }
                    if (i4 < qz0Var.i()) {
                        ArrayList arrayList = (ArrayList) fg4Var.f;
                        ((ok4) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i5 = fg4Var.b;
                    ArrayList arrayList2 = (ArrayList) fg4Var.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        ok4 ok4Var2 = (ok4) view.getLayoutParams();
                        fg4Var.b = ((StaggeredGridLayoutManager) fg4Var.g).r.g(view);
                        ok4Var2.getClass();
                        i5 = fg4Var.b;
                    }
                    if (i5 > qz0Var.m()) {
                        ((ok4) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(ok4Var.e.e);
            }
            i += i3;
            if (i != iV) {
                View viewU2 = u(i);
                if (this.x) {
                    int iD = qz0Var.d(viewU);
                    int iD2 = qz0Var.d(viewU2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (ok4Var.e.e - ((ok4) viewU2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iG = qz0Var.g(viewU);
                int iG2 = qz0Var.g(viewU2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (ok4Var.e.e - ((ok4) viewU2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    @Override // defpackage.mw3
    public final void S() {
        this.B.n();
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
    }

    public final boolean S0() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // defpackage.mw3
    public final void T(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
        recyclerView.requestLayout();
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
        ok4 ok4Var = (ok4) view.getLayoutParams();
        int iF1 = f1(i, ((ViewGroup.MarginLayoutParams) ok4Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) ok4Var).rightMargin + rect.right);
        int iF2 = f1(i2, ((ViewGroup.MarginLayoutParams) ok4Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) ok4Var).bottomMargin + rect.bottom);
        if (z0(view, iF1, iF2, ok4Var)) {
            view.measure(iF1, iF2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    @Override // defpackage.mw3
    public final View U(View view, int i, hm2 hm2Var, yw3 yw3Var) {
        View viewE;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewE = recyclerView.E(view)) == null || ((ArrayList) this.a.r).contains(viewE)) {
                viewE = null;
            }
            if (viewE != null) {
                a1();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && S0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && S0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    ok4 ok4Var = (ok4) viewE.getLayoutParams();
                    ok4Var.getClass();
                    fg4 fg4Var = ok4Var.e;
                    int iN0 = i2 == 1 ? N0() : M0();
                    d1(iN0, yw3Var);
                    c1(i2);
                    p72 p72Var = this.v;
                    p72Var.c = p72Var.d + iN0;
                    p72Var.b = (int) (this.r.n() * 0.33333334f);
                    p72Var.h = true;
                    p72Var.a = false;
                    H0(hm2Var, p72Var, yw3Var);
                    this.D = this.x;
                    View viewI = fg4Var.i(iN0, i2);
                    if (viewI != null && viewI != viewE) {
                        return viewI;
                    }
                    boolean zV0 = V0(i2);
                    fg4[] fg4VarArr = this.q;
                    int i4 = this.p;
                    if (zV0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewI2 = fg4VarArr[i5].i(iN0, i2);
                            if (viewI2 != null && viewI2 != viewE) {
                                return viewI2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewI3 = fg4VarArr[i6].i(iN0, i2);
                            if (viewI3 != null && viewI3 != viewE) {
                                return viewI3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewQ = q(z ? fg4Var.d() : fg4Var.e());
                    if (viewQ != null && viewQ != viewE) {
                        return viewQ;
                    }
                    if (V0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != fg4Var.e) {
                                View viewQ2 = q(z ? fg4VarArr[i7].d() : fg4VarArr[i7].e());
                                if (viewQ2 != null && viewQ2 != viewE) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewQ3 = q(z ? fg4VarArr[i8].d() : fg4VarArr[i8].e());
                            if (viewQ3 != null && viewQ3 != viewE) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void U0(hm2 hm2Var, yw3 yw3Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        qk4 qk4Var;
        int iV;
        int i2;
        int I;
        int I2;
        int iV2;
        boolean z4;
        int i3;
        boolean z5;
        qk4 qk4Var2 = this.F;
        nk4 nk4Var = this.H;
        if (!(qk4Var2 == null && this.z == -1) && yw3Var.b() == 0) {
            l0(hm2Var);
            nk4Var.a();
            return;
        }
        boolean z6 = nk4Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = nk4Var.g;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        fg4[] fg4VarArr = this.q;
        int i4 = this.p;
        xc5 xc5Var = this.B;
        if (z7) {
            nk4Var.a();
            qk4 qk4Var3 = this.F;
            qz0 qz0Var = this.r;
            if (qk4Var3 != null) {
                int i5 = qk4Var3.p;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            fg4VarArr[i6].c();
                            qk4 qk4Var4 = this.F;
                            int i7 = qk4Var4.q[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += qk4Var4.v ? qz0Var.i() : qz0Var.m();
                            }
                            fg4 fg4Var = fg4VarArr[i6];
                            fg4Var.b = i7;
                            fg4Var.c = i7;
                        }
                    } else {
                        qk4Var3.q = null;
                        qk4Var3.p = 0;
                        qk4Var3.r = 0;
                        qk4Var3.s = null;
                        qk4Var3.t = null;
                        qk4Var3.n = qk4Var3.o;
                    }
                }
                qk4 qk4Var5 = this.F;
                this.E = qk4Var5.w;
                boolean z8 = qk4Var5.u;
                c(null);
                qk4 qk4Var6 = this.F;
                if (qk4Var6 != null && qk4Var6.u != z8) {
                    qk4Var6.u = z8;
                }
                this.w = z8;
                q0();
                a1();
                qk4 qk4Var7 = this.F;
                int i8 = qk4Var7.n;
                if (i8 != -1) {
                    this.z = i8;
                    nk4Var.c = qk4Var7.v;
                } else {
                    nk4Var.c = this.x;
                }
                if (qk4Var7.r > 1) {
                    xc5Var.o = qk4Var7.s;
                    xc5Var.p = qk4Var7.t;
                }
            } else {
                a1();
                nk4Var.c = this.x;
            }
            if (yw3Var.g || (i3 = this.z) == -1) {
                if (this.D) {
                    int iB = yw3Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            I2 = 0;
                            break;
                        }
                        I2 = mw3.I(u(iV2));
                        if (I2 < 0 && I2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = yw3Var.b();
                    iV = v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iV) {
                            I2 = 0;
                            break;
                        }
                        I = mw3.I(u(i2));
                        if (I < 0 && I < iB2) {
                            I2 = I;
                            break;
                        }
                        i2++;
                    }
                }
                nk4Var.a = I2;
                nk4Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= yw3Var.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = yw3Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            I2 = 0;
                            break;
                        } else {
                            I2 = mw3.I(u(iV2));
                            if (I2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = yw3Var.b();
                    iV = v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iV) {
                            I2 = 0;
                            break;
                        } else {
                            I = mw3.I(u(i2));
                            if (I < 0) {
                            }
                            i2++;
                        }
                    }
                }
                nk4Var.a = I2;
                nk4Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                qk4 qk4Var8 = this.F;
                if (qk4Var8 == null || qk4Var8.n == -1 || qk4Var8.p < 1) {
                    View viewQ = q(this.z);
                    if (viewQ != null) {
                        nk4Var.a = this.x ? N0() : M0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (nk4Var.c) {
                                nk4Var.b = (qz0Var.i() - this.A) - qz0Var.d(viewQ);
                            } else {
                                nk4Var.b = (qz0Var.m() + this.A) - qz0Var.g(viewQ);
                            }
                        } else if (qz0Var.e(viewQ) > qz0Var.n()) {
                            nk4Var.b = nk4Var.c ? qz0Var.i() : qz0Var.m();
                        } else {
                            int iG = qz0Var.g(viewQ) - qz0Var.m();
                            if (iG < 0) {
                                nk4Var.b = -iG;
                            } else {
                                int i9 = qz0Var.i() - qz0Var.d(viewQ);
                                if (i9 < 0) {
                                    nk4Var.b = i9;
                                } else {
                                    nk4Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.z;
                        nk4Var.a = i10;
                        int i11 = this.A;
                        if (i11 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i10 < M0()) != this.x) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.x) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            nk4Var.c = z5;
                            qz0 qz0Var2 = staggeredGridLayoutManager.r;
                            nk4Var.b = z5 ? qz0Var2.i() : qz0Var2.m();
                        } else {
                            boolean z9 = nk4Var.c;
                            qz0 qz0Var3 = staggeredGridLayoutManager.r;
                            if (z9) {
                                nk4Var.b = qz0Var3.i() - i11;
                            } else {
                                nk4Var.b = qz0Var3.m() + i11;
                            }
                        }
                        z4 = true;
                        nk4Var.d = true;
                    }
                } else {
                    nk4Var.b = Integer.MIN_VALUE;
                    nk4Var.a = this.z;
                }
                z4 = true;
            }
            nk4Var.e = z4;
        }
        if (this.F == null && this.z == -1 && !(nk4Var.c == this.D && S0() == this.E)) {
            xc5Var.n();
            i = 1;
            nk4Var.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((qk4Var = this.F) == null || qk4Var.p < i)) {
            if (nk4Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    fg4VarArr[i12].c();
                    int i13 = nk4Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        fg4 fg4Var2 = fg4VarArr[i12];
                        fg4Var2.b = i13;
                        fg4Var2.c = i13;
                    }
                }
            } else if (z7 || nk4Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    fg4 fg4Var3 = fg4VarArr[i14];
                    boolean z10 = this.x;
                    int i15 = nk4Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) fg4Var3.g;
                    int iH = z10 ? fg4Var3.h(Integer.MIN_VALUE) : fg4Var3.k(Integer.MIN_VALUE);
                    fg4Var3.c();
                    if (iH != Integer.MIN_VALUE && ((!z10 || iH >= staggeredGridLayoutManager2.r.i()) && (z10 || iH <= staggeredGridLayoutManager2.r.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iH += i15;
                        }
                        fg4Var3.c = iH;
                        fg4Var3.b = iH;
                    }
                }
                int length = fg4VarArr.length;
                int[] iArr = nk4Var.f;
                if (iArr == null || iArr.length < length) {
                    nk4Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    nk4Var.f[i16] = fg4VarArr[i16].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    fg4 fg4Var4 = fg4VarArr[i17];
                    fg4Var4.c();
                    int i18 = nk4Var.f[i17];
                    fg4Var4.b = i18;
                    fg4Var4.c = i18;
                }
            }
        }
        p(hm2Var);
        p72 p72Var = this.v;
        p72Var.a = false;
        qz0 qz0Var4 = this.s;
        int iN = qz0Var4.n();
        this.u = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, qz0Var4.k());
        d1(nk4Var.a, yw3Var);
        if (nk4Var.c) {
            c1(-1);
            H0(hm2Var, p72Var, yw3Var);
            c1(1);
            p72Var.c = nk4Var.a + p72Var.d;
            H0(hm2Var, p72Var, yw3Var);
        } else {
            c1(1);
            H0(hm2Var, p72Var, yw3Var);
            c1(-1);
            p72Var.c = nk4Var.a + p72Var.d;
            H0(hm2Var, p72Var, yw3Var);
        }
        if (qz0Var4.k() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < iV3; i19++) {
                View viewU = u(i19);
                float fE = qz0Var4.e(viewU);
                if (fE >= fMax) {
                    ((ok4) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i20 = this.u;
            int iRound = Math.round(fMax * i4);
            if (qz0Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, qz0Var4.n());
            }
            this.u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, qz0Var4.k());
            if (this.u != i20) {
                for (int i21 = 0; i21 < iV3; i21++) {
                    View viewU2 = u(i21);
                    ok4 ok4Var = (ok4) viewU2.getLayoutParams();
                    ok4Var.getClass();
                    boolean zS0 = S0();
                    int i22 = this.t;
                    if (zS0 && i22 == 1) {
                        int i23 = -((i4 - 1) - ok4Var.e.e);
                        viewU2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = ok4Var.e.e;
                        int i25 = this.u * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewU2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewU2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            K0(hm2Var, yw3Var, true);
            L0(hm2Var, yw3Var, false);
        } else {
            z2 = true;
            L0(hm2Var, yw3Var, true);
            K0(hm2Var, yw3Var, false);
        }
        if (!z || yw3Var.g || this.C == 0 || v() <= 0 || R0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (F0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (yw3Var.g) {
            nk4Var.a();
        }
        this.D = nk4Var.c;
        this.E = S0();
        if (z3) {
            nk4Var.a();
            U0(hm2Var, yw3Var, false);
        }
    }

    @Override // defpackage.mw3
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            View viewJ0 = J0(false);
            View viewI0 = I0(false);
            if (viewJ0 == null || viewI0 == null) {
                return;
            }
            int I = mw3.I(viewJ0);
            int I2 = mw3.I(viewI0);
            if (I < I2) {
                accessibilityEvent.setFromIndex(I);
                accessibilityEvent.setToIndex(I2);
            } else {
                accessibilityEvent.setFromIndex(I2);
                accessibilityEvent.setToIndex(I);
            }
        }
    }

    public final boolean V0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == S0();
    }

    @Override // defpackage.mw3
    public final void W(hm2 hm2Var, yw3 yw3Var, v3 v3Var) {
        super.W(hm2Var, yw3Var, v3Var);
        v3Var.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void W0(int i, yw3 yw3Var) {
        int iM0;
        int i2;
        if (i > 0) {
            iM0 = N0();
            i2 = 1;
        } else {
            iM0 = M0();
            i2 = -1;
        }
        p72 p72Var = this.v;
        p72Var.a = true;
        d1(iM0, yw3Var);
        c1(i2);
        p72Var.c = iM0 + p72Var.d;
        p72Var.b = Math.abs(i);
    }

    @Override // defpackage.mw3
    public final void X(hm2 hm2Var, yw3 yw3Var, View view, v3 v3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ok4)) {
            Y(view, v3Var);
            return;
        }
        fg4 fg4Var = ((ok4) layoutParams).e;
        if (this.t == 0) {
            v3Var.k(u3.a(fg4Var != null ? fg4Var.e : -1, 1, -1, -1, false, false));
        } else {
            v3Var.k(u3.a(-1, -1, fg4Var != null ? fg4Var.e : -1, 1, false, false));
        }
    }

    public final void X0(hm2 hm2Var, p72 p72Var) {
        if (!p72Var.a || p72Var.i) {
            return;
        }
        int i = p72Var.b;
        int i2 = p72Var.e;
        if (i == 0) {
            if (i2 == -1) {
                Y0(hm2Var, p72Var.g);
                return;
            } else {
                Z0(hm2Var, p72Var.f);
                return;
            }
        }
        int i3 = this.p;
        fg4[] fg4VarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = p72Var.f;
            int iK = fg4VarArr[0].k(i5);
            while (i4 < i3) {
                int iK2 = fg4VarArr[i4].k(i5);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i4++;
            }
            int i6 = i5 - iK;
            int iMin = p72Var.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, p72Var.b);
            }
            Y0(hm2Var, iMin);
            return;
        }
        int i7 = p72Var.g;
        int iH = fg4VarArr[0].h(i7);
        while (i4 < i3) {
            int iH2 = fg4VarArr[i4].h(i7);
            if (iH2 < iH) {
                iH = iH2;
            }
            i4++;
        }
        int i8 = iH - p72Var.g;
        int iMin2 = p72Var.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, p72Var.b);
        }
        Z0(hm2Var, iMin2);
    }

    public final void Y0(hm2 hm2Var, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            qz0 qz0Var = this.r;
            if (qz0Var.g(viewU) < i || qz0Var.p(viewU) < i) {
                return;
            }
            ok4 ok4Var = (ok4) viewU.getLayoutParams();
            ok4Var.getClass();
            if (((ArrayList) ok4Var.e.f).size() == 1) {
                return;
            }
            fg4 fg4Var = ok4Var.e;
            ArrayList arrayList = (ArrayList) fg4Var.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            ok4 ok4Var2 = (ok4) view.getLayoutParams();
            ok4Var2.e = null;
            if (ok4Var2.a.j() || ok4Var2.a.m()) {
                fg4Var.d -= ((StaggeredGridLayoutManager) fg4Var.g).r.e(view);
            }
            if (size == 1) {
                fg4Var.b = Integer.MIN_VALUE;
            }
            fg4Var.c = Integer.MIN_VALUE;
            n0(viewU, hm2Var);
        }
    }

    @Override // defpackage.mw3
    public final void Z(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Z0(hm2 hm2Var, int i) {
        while (v() > 0) {
            View viewU = u(0);
            qz0 qz0Var = this.r;
            if (qz0Var.d(viewU) > i || qz0Var.o(viewU) > i) {
                return;
            }
            ok4 ok4Var = (ok4) viewU.getLayoutParams();
            ok4Var.getClass();
            if (((ArrayList) ok4Var.e.f).size() == 1) {
                return;
            }
            fg4 fg4Var = ok4Var.e;
            ArrayList arrayList = (ArrayList) fg4Var.f;
            View view = (View) arrayList.remove(0);
            ok4 ok4Var2 = (ok4) view.getLayoutParams();
            ok4Var2.e = null;
            if (arrayList.size() == 0) {
                fg4Var.c = Integer.MIN_VALUE;
            }
            if (ok4Var2.a.j() || ok4Var2.a.m()) {
                fg4Var.d -= ((StaggeredGridLayoutManager) fg4Var.g).r.e(view);
            }
            fg4Var.b = Integer.MIN_VALUE;
            n0(viewU, hm2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.xw3
    public final PointF a(int i) {
        int i2 = -1;
        if (v() != 0) {
            if ((i < M0()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.mw3
    public final void a0() {
        this.B.n();
        q0();
    }

    public final void a1() {
        if (this.t == 1 || !S0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.mw3
    public final void b0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final int b1(int i, hm2 hm2Var, yw3 yw3Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, yw3Var);
        p72 p72Var = this.v;
        int iH0 = H0(hm2Var, p72Var, yw3Var);
        if (p72Var.b >= iH0) {
            i = i < 0 ? -iH0 : iH0;
        }
        this.r.q(-i);
        this.D = this.x;
        p72Var.b = 0;
        X0(hm2Var, p72Var);
        return i;
    }

    @Override // defpackage.mw3
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.mw3
    public final void c0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final void c1(int i) {
        p72 p72Var = this.v;
        p72Var.e = i;
        p72Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.mw3
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.mw3
    public final void d0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void d1(int i, yw3 yw3Var) {
        int iN;
        int iN2;
        int i2;
        p72 p72Var = this.v;
        boolean z = false;
        p72Var.b = 0;
        p72Var.c = i;
        db2 db2Var = this.e;
        qz0 qz0Var = this.r;
        if (db2Var == null || !db2Var.e || (i2 = yw3Var.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = qz0Var.n();
                iN2 = 0;
            } else {
                iN2 = qz0Var.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.u) {
            p72Var.g = qz0Var.h() + iN;
            p72Var.f = -iN2;
        } else {
            p72Var.f = qz0Var.m() - iN2;
            p72Var.g = qz0Var.i() + iN;
        }
        p72Var.h = false;
        p72Var.a = true;
        if (qz0Var.k() == 0 && qz0Var.h() == 0) {
            z = true;
        }
        p72Var.i = z;
    }

    @Override // defpackage.mw3
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.mw3
    public final void e0(hm2 hm2Var, yw3 yw3Var) {
        U0(hm2Var, yw3Var, true);
    }

    public final void e1(fg4 fg4Var, int i, int i2) {
        int i3 = fg4Var.d;
        int i4 = fg4Var.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = fg4Var.c;
            if (i5 == Integer.MIN_VALUE) {
                fg4Var.b();
                i5 = fg4Var.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = fg4Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) fg4Var.f).get(0);
            ok4 ok4Var = (ok4) view.getLayoutParams();
            fg4Var.b = ((StaggeredGridLayoutManager) fg4Var.g).r.g(view);
            ok4Var.getClass();
            i6 = fg4Var.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.mw3
    public final boolean f(nw3 nw3Var) {
        return nw3Var instanceof ok4;
    }

    @Override // defpackage.mw3
    public final void f0(yw3 yw3Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.mw3
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof qk4) {
            qk4 qk4Var = (qk4) parcelable;
            this.F = qk4Var;
            if (this.z != -1) {
                qk4Var.n = -1;
                qk4Var.o = -1;
                qk4Var.q = null;
                qk4Var.p = 0;
                qk4Var.r = 0;
                qk4Var.s = null;
                qk4Var.t = null;
            }
            q0();
        }
    }

    @Override // defpackage.mw3
    public final void h(int i, int i2, yw3 yw3Var, b30 b30Var) {
        p72 p72Var;
        int iH;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, yw3Var);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            p72Var = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = p72Var.d;
            fg4[] fg4VarArr = this.q;
            if (i6 == -1) {
                int i7 = p72Var.f;
                iH = i7 - fg4VarArr[i4].k(i7);
            } else {
                iH = fg4VarArr[i4].h(p72Var.g) - p72Var.g;
            }
            if (iH >= 0) {
                this.J[i5] = iH;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = p72Var.c;
            if (i9 < 0 || i9 >= yw3Var.b()) {
                return;
            }
            b30Var.b(p72Var.c, this.J[i8]);
            p72Var.c += p72Var.d;
        }
    }

    @Override // defpackage.mw3
    public final Parcelable h0() {
        int iK;
        int iM;
        int[] iArr;
        qk4 qk4Var = this.F;
        if (qk4Var != null) {
            qk4 qk4Var2 = new qk4();
            qk4Var2.p = qk4Var.p;
            qk4Var2.n = qk4Var.n;
            qk4Var2.o = qk4Var.o;
            qk4Var2.q = qk4Var.q;
            qk4Var2.r = qk4Var.r;
            qk4Var2.s = qk4Var.s;
            qk4Var2.u = qk4Var.u;
            qk4Var2.v = qk4Var.v;
            qk4Var2.w = qk4Var.w;
            qk4Var2.t = qk4Var.t;
            return qk4Var2;
        }
        qk4 qk4Var3 = new qk4();
        qk4Var3.u = this.w;
        qk4Var3.v = this.D;
        qk4Var3.w = this.E;
        xc5 xc5Var = this.B;
        if (xc5Var == null || (iArr = (int[]) xc5Var.o) == null) {
            qk4Var3.r = 0;
        } else {
            qk4Var3.s = iArr;
            qk4Var3.r = iArr.length;
            qk4Var3.t = (ArrayList) xc5Var.p;
        }
        if (v() <= 0) {
            qk4Var3.n = -1;
            qk4Var3.o = -1;
            qk4Var3.p = 0;
            return qk4Var3;
        }
        qk4Var3.n = this.D ? N0() : M0();
        View viewI0 = this.x ? I0(true) : J0(true);
        qk4Var3.o = viewI0 != null ? mw3.I(viewI0) : -1;
        int i = this.p;
        qk4Var3.p = i;
        qk4Var3.q = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.D;
            qz0 qz0Var = this.r;
            fg4[] fg4VarArr = this.q;
            if (z) {
                iK = fg4VarArr[i2].h(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iM = qz0Var.i();
                    iK -= iM;
                }
            } else {
                iK = fg4VarArr[i2].k(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iM = qz0Var.m();
                    iK -= iM;
                }
            }
            qk4Var3.q[i2] = iK;
        }
        return qk4Var3;
    }

    @Override // defpackage.mw3
    public final void i0(int i) {
        if (i == 0) {
            F0();
        }
    }

    @Override // defpackage.mw3
    public final int j(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e35.q(yw3Var, this.r, J0(z), I0(z), this, this.I);
    }

    @Override // defpackage.mw3
    public final int k(yw3 yw3Var) {
        return G0(yw3Var);
    }

    @Override // defpackage.mw3
    public final int l(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e35.s(yw3Var, this.r, J0(z), I0(z), this, this.I);
    }

    @Override // defpackage.mw3
    public final int m(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e35.q(yw3Var, this.r, J0(z), I0(z), this, this.I);
    }

    @Override // defpackage.mw3
    public final int n(yw3 yw3Var) {
        return G0(yw3Var);
    }

    @Override // defpackage.mw3
    public final int o(yw3 yw3Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e35.s(yw3Var, this.r, J0(z), I0(z), this, this.I);
    }

    @Override // defpackage.mw3
    public final nw3 r() {
        return this.t == 0 ? new ok4(-2, -1) : new ok4(-1, -2);
    }

    @Override // defpackage.mw3
    public final int r0(int i, hm2 hm2Var, yw3 yw3Var) {
        return b1(i, hm2Var, yw3Var);
    }

    @Override // defpackage.mw3
    public final nw3 s(Context context, AttributeSet attributeSet) {
        return new ok4(context, attributeSet);
    }

    @Override // defpackage.mw3
    public final void s0(int i) {
        qk4 qk4Var = this.F;
        if (qk4Var != null && qk4Var.n != i) {
            qk4Var.q = null;
            qk4Var.p = 0;
            qk4Var.n = -1;
            qk4Var.o = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        q0();
    }

    @Override // defpackage.mw3
    public final nw3 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ok4((ViewGroup.MarginLayoutParams) layoutParams) : new ok4(layoutParams);
    }

    @Override // defpackage.mw3
    public final int t0(int i, hm2 hm2Var, yw3 yw3Var) {
        return b1(i, hm2Var, yw3Var);
    }

    @Override // defpackage.mw3
    public final void w0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int iG3 = G() + F();
        int iE = E() + H();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + iE;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = j65.a;
            iG2 = mw3.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = mw3.g(i, (this.u * i4) + iG3, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iG3;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = j65.a;
            iG = mw3.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = mw3.g(i2, (this.u * i4) + iE, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.mw3
    public final int x(hm2 hm2Var, yw3 yw3Var) {
        if (this.t == 1) {
            return Math.min(this.p, yw3Var.b());
        }
        return -1;
    }
}
