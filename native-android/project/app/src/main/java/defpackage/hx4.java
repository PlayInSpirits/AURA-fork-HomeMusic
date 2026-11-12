package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hx4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public dx4 n;
    public ViewGroup o;

    /* JADX WARN: Code duplicated, block: B:101:0x0216  */
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e0 A[EDGE_INSN: B:133:0x01e0->B:89:0x01e0 BREAK  A[LOOP:1: B:18:0x0084->B:88:0x01d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0208  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        bq4 bq4Var;
        bq4 bq4Var2;
        oi oiVar;
        oi oiVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        oi oiVarN;
        int i5;
        Animator animator;
        ax4 ax4Var;
        View view;
        mx4 mx4Var;
        mx4 mx4Var2;
        int i6;
        boolean z2;
        int i7;
        View view2;
        mx4 mx4Var3;
        oi oiVar3;
        int i8;
        int i9;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i10;
        View view5;
        View view6;
        xe2 xe2Var;
        int iH;
        int i11;
        View view7;
        boolean z3;
        int size2;
        int i12;
        dx4 dx4Var = this.n;
        ViewGroup viewGroup = this.o;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!ix4.c.remove(viewGroup)) {
            return true;
        }
        oi oiVarB = ix4.b();
        ArrayList arrayList2 = (ArrayList) oiVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(dx4Var);
            dx4Var.a(new gx4(this, oiVarB));
            i = 0;
            dx4Var.g(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((dx4) obj).v(viewGroup);
                }
            }
            dx4Var.x = new ArrayList();
            dx4Var.y = new ArrayList();
            bq4Var = dx4Var.t;
            bq4Var2 = dx4Var.u;
            oiVar = new oi((oi) bq4Var.n);
            oiVar2 = new oi((oi) bq4Var2.n);
            i2 = 0;
            while (true) {
                iArr = dx4Var.w;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = oiVar.p - 1; i7 >= 0; i7--) {
                        view2 = (View) oiVar.f(i7);
                        if (view2 == null && dx4Var.r(view2) && (mx4Var3 = (mx4) oiVar2.remove(view2)) != null && dx4Var.r(mx4Var3.b)) {
                            dx4Var.x.add((mx4) oiVar.h(i7));
                            dx4Var.y.add(mx4Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    oiVar3 = (oi) bq4Var.q;
                    oi oiVar4 = (oi) bq4Var2.q;
                    i8 = oiVar3.p;
                    for (i9 = 0; i9 < i8; i9++) {
                        view3 = (View) oiVar3.j(i9);
                        if (view3 == null && dx4Var.r(view3) && (view4 = (View) oiVar4.get(oiVar3.f(i9))) != null && dx4Var.r(view4)) {
                            mx4 mx4Var4 = (mx4) oiVar.get(view3);
                            mx4 mx4Var5 = (mx4) oiVar2.get(view4);
                            if (mx4Var4 != null && mx4Var5 != null) {
                                dx4Var.x.add(mx4Var4);
                                dx4Var.y.add(mx4Var5);
                                oiVar.remove(view3);
                                oiVar2.remove(view4);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        xe2Var = (xe2) bq4Var.p;
                        xe2 xe2Var2 = (xe2) bq4Var2.p;
                        iH = xe2Var.h();
                        i11 = i;
                        while (i11 < iH) {
                            view7 = (View) xe2Var.i(i11);
                            if (view7 == null && dx4Var.r(view7)) {
                                boolean z5 = z4;
                                View view8 = (View) xe2Var2.b(xe2Var.e(i11));
                                if (view8 == null || !dx4Var.r(view8)) {
                                    z3 = z5;
                                } else {
                                    mx4 mx4Var6 = (mx4) oiVar.get(view7);
                                    mx4 mx4Var7 = (mx4) oiVar2.get(view8);
                                    if (mx4Var6 == null || mx4Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        dx4Var.x.add(mx4Var6);
                                        dx4Var.y.add(mx4Var7);
                                        oiVar.remove(view7);
                                        oiVar2.remove(view8);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) bq4Var.o;
                    SparseArray sparseArray2 = (SparseArray) bq4Var2.o;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view5 = (View) sparseArray.valueAt(i10);
                        if (view5 == null && dx4Var.r(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && dx4Var.r(view6)) {
                            mx4 mx4Var8 = (mx4) oiVar.get(view5);
                            mx4 mx4Var9 = (mx4) oiVar2.get(view6);
                            if (mx4Var8 != null && mx4Var9 != null) {
                                dx4Var.x.add(mx4Var8);
                                dx4Var.y.add(mx4Var9);
                                oiVar.remove(view5);
                                oiVar2.remove(view6);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < oiVar.p; i3++) {
                mx4Var2 = (mx4) oiVar.j(i3);
                if (dx4Var.r(mx4Var2.b)) {
                    dx4Var.x.add(mx4Var2);
                    dx4Var.y.add(null);
                }
            }
            for (i4 = 0; i4 < oiVar2.p; i4++) {
                mx4Var = (mx4) oiVar2.j(i4);
                if (dx4Var.r(mx4Var.b)) {
                    dx4Var.y.add(mx4Var);
                    dx4Var.x.add(null);
                }
            }
            oiVarN = dx4.n();
            int i13 = oiVarN.p;
            f85 f85Var = d85.a;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) oiVarN.f(i5);
                if (animator == null && (ax4Var = (ax4) oiVarN.get(animator)) != null && (view = ax4Var.a) != null && ax4Var.d.a.equals(windowId)) {
                    mx4 mx4Var10 = ax4Var.c;
                    boolean z6 = z;
                    mx4 mx4VarP = dx4Var.p(view, z6);
                    mx4 mx4VarM = dx4Var.m(view, z6);
                    if (mx4VarP == null && mx4VarM == null) {
                        mx4VarM = (mx4) ((oi) dx4Var.u.n).get(view);
                    }
                    if ((mx4VarP != null || mx4VarM != null) && ax4Var.e.q(mx4Var10, mx4VarM)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            oiVarN.remove(animator);
                        }
                    }
                }
                i5--;
                z = true;
            }
            dx4Var.k(viewGroup, dx4Var.t, dx4Var.u, dx4Var.x, dx4Var.y);
            dx4Var.w();
            return true;
        }
        arrayList2 = new ArrayList();
        oiVarB.put(viewGroup, arrayList2);
        arrayList2.add(dx4Var);
        dx4Var.a(new gx4(this, oiVarB));
        i = 0;
        dx4Var.g(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                ((dx4) obj2).v(viewGroup);
            }
        }
        dx4Var.x = new ArrayList();
        dx4Var.y = new ArrayList();
        bq4Var = dx4Var.t;
        bq4Var2 = dx4Var.u;
        oiVar = new oi((oi) bq4Var.n);
        oiVar2 = new oi((oi) bq4Var2.n);
        i2 = 0;
        while (true) {
            iArr = dx4Var.w;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view2 = (View) oiVar.f(i7);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                oiVar3 = (oi) bq4Var.q;
                oi oiVar5 = (oi) bq4Var2.q;
                i8 = oiVar3.p;
                while (i9 < i8) {
                    view3 = (View) oiVar3.j(i9);
                    if (view3 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    xe2Var = (xe2) bq4Var.p;
                    xe2 xe2Var3 = (xe2) bq4Var2.p;
                    iH = xe2Var.h();
                    i11 = i;
                    while (i11 < iH) {
                        view7 = (View) xe2Var.i(i11);
                        if (view7 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) bq4Var.o;
                SparseArray sparseArray3 = (SparseArray) bq4Var2.o;
                size = sparseArray.size();
                while (i10 < size) {
                    view5 = (View) sparseArray.valueAt(i10);
                    if (view5 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < oiVar.p) {
            mx4Var2 = (mx4) oiVar.j(i3);
            if (dx4Var.r(mx4Var2.b)) {
                dx4Var.x.add(mx4Var2);
                dx4Var.y.add(null);
            }
        }
        while (i4 < oiVar2.p) {
            mx4Var = (mx4) oiVar2.j(i4);
            if (dx4Var.r(mx4Var.b)) {
                dx4Var.y.add(mx4Var);
                dx4Var.x.add(null);
            }
        }
        oiVarN = dx4.n();
        int i14 = oiVarN.p;
        f85 f85Var2 = d85.a;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) oiVarN.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        dx4Var.k(viewGroup, dx4Var.t, dx4Var.u, dx4Var.x, dx4Var.y);
        dx4Var.w();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.o;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ix4.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) ix4.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((dx4) obj).v(viewGroup);
            }
        }
        this.n.h(true);
    }
}
