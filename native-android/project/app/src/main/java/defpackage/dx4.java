package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dx4 implements Cloneable {
    public static final int[] H = {2, 1, 3, 4};
    public static final xi4 I = new xi4(23);
    public static final ThreadLocal J = new ThreadLocal();
    public cx F;
    public ArrayList x;
    public ArrayList y;
    public final String n = getClass().getName();
    public long o = -1;
    public long p = -1;
    public TimeInterpolator q = null;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public bq4 t = new bq4(12);
    public bq4 u = new bq4(12);
    public kx4 v = null;
    public final int[] w = H;
    public final ArrayList z = new ArrayList();
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public ArrayList D = null;
    public ArrayList E = new ArrayList();
    public xi4 G = I;

    public static void b(bq4 bq4Var, View view, mx4 mx4Var) {
        oi oiVar = (oi) bq4Var.n;
        oi oiVar2 = (oi) bq4Var.q;
        SparseArray sparseArray = (SparseArray) bq4Var.o;
        xe2 xe2Var = (xe2) bq4Var.p;
        oiVar.put(view, mx4Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = j65.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (oiVar2.containsKey(transitionName)) {
                oiVar2.put(transitionName, null);
            } else {
                oiVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (xe2Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    xe2Var.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) xe2Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    xe2Var.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static oi n() {
        ThreadLocal threadLocal = J;
        oi oiVar = (oi) threadLocal.get();
        if (oiVar != null) {
            return oiVar;
        }
        oi oiVar2 = new oi(0);
        threadLocal.set(oiVar2);
        return oiVar2;
    }

    public static boolean s(mx4 mx4Var, mx4 mx4Var2, String str) {
        Object obj = mx4Var.a.get(str);
        Object obj2 = mx4Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(xi4 xi4Var) {
        if (xi4Var == null) {
            this.G = I;
        } else {
            this.G = xi4Var;
        }
    }

    public void B(cx cxVar) {
        this.F = cxVar;
    }

    public void C(long j) {
        this.o = j;
    }

    public final void D() {
        if (this.A == 0) {
            ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((bx4) arrayList2.get(i)).a(this);
                }
            }
            this.C = false;
        }
        this.A++;
    }

    public String E(String str) {
        StringBuilder sbI = xa3.i(str);
        sbI.append(getClass().getSimpleName());
        sbI.append("@");
        sbI.append(Integer.toHexString(hashCode()));
        sbI.append(": ");
        String string = sbI.toString();
        if (this.p != -1) {
            string = b11.p(b11.s(string, "dur("), this.p, ") ");
        }
        if (this.o != -1) {
            string = b11.p(b11.s(string, "dly("), this.o, ") ");
        }
        if (this.q != null) {
            StringBuilder sbS = b11.s(string, "interp(");
            sbS.append(this.q);
            sbS.append(") ");
            string = sbS.toString();
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        ArrayList arrayList2 = this.s;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strConcat = string.concat("tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbI2 = xa3.i(strConcat);
                sbI2.append(arrayList.get(i));
                strConcat = sbI2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbI3 = xa3.i(strConcat);
                sbI3.append(arrayList2.get(i2));
                strConcat = sbI3.toString();
            }
        }
        return strConcat.concat(")");
    }

    public void a(bx4 bx4Var) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(bx4Var);
    }

    public abstract void c(mx4 mx4Var);

    public void cancel() {
        ArrayList arrayList = this.z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.D;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.D.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((bx4) arrayList3.get(i)).d();
        }
    }

    public final void d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            mx4 mx4Var = new mx4(view);
            if (z) {
                f(mx4Var);
            } else {
                c(mx4Var);
            }
            mx4Var.c.add(this);
            e(mx4Var);
            if (z) {
                b(this.t, view, mx4Var);
            } else {
                b(this.u, view, mx4Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void e(mx4 mx4Var) {
        if (this.F != null) {
            HashMap map = mx4Var.a;
            if (map.isEmpty()) {
                return;
            }
            this.F.getClass();
            String[] strArr = cx.e;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.F.getClass();
                    View view = mx4Var.b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void f(mx4 mx4Var);

    public final void g(ViewGroup viewGroup, boolean z) {
        h(z);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        ArrayList arrayList2 = this.s;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                mx4 mx4Var = new mx4(viewFindViewById);
                if (z) {
                    f(mx4Var);
                } else {
                    c(mx4Var);
                }
                mx4Var.c.add(this);
                e(mx4Var);
                if (z) {
                    b(this.t, viewFindViewById, mx4Var);
                } else {
                    b(this.u, viewFindViewById, mx4Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            mx4 mx4Var2 = new mx4(view);
            if (z) {
                f(mx4Var2);
            } else {
                c(mx4Var2);
            }
            mx4Var2.c.add(this);
            e(mx4Var2);
            if (z) {
                b(this.t, view, mx4Var2);
            } else {
                b(this.u, view, mx4Var2);
            }
        }
    }

    public final void h(boolean z) {
        if (z) {
            ((oi) this.t.n).clear();
            ((SparseArray) this.t.o).clear();
            ((xe2) this.t.p).a();
        } else {
            ((oi) this.u.n).clear();
            ((SparseArray) this.u.o).clear();
            ((xe2) this.u.p).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public dx4 clone() {
        try {
            dx4 dx4Var = (dx4) super.clone();
            dx4Var.E = new ArrayList();
            dx4Var.t = new bq4(12);
            dx4Var.u = new bq4(12);
            dx4Var.x = null;
            dx4Var.y = null;
            return dx4Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, mx4 mx4Var, mx4 mx4Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x017c  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    public void k(ViewGroup viewGroup, bq4 bq4Var, bq4 bq4Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorJ;
        int i;
        int i2;
        View view;
        mx4 mx4Var;
        int i3;
        int iAbs;
        long jRound;
        int[] iArr;
        int[] iArr2;
        Integer num;
        Animator animator;
        mx4 mx4Var2;
        oi oiVarN = n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            mx4 mx4Var3 = (mx4) arrayList.get(i4);
            mx4 mx4Var4 = (mx4) arrayList2.get(i4);
            if (mx4Var3 != null && !mx4Var3.c.contains(this)) {
                mx4Var3 = null;
            }
            if (mx4Var4 != null && !mx4Var4.c.contains(this)) {
                mx4Var4 = null;
            }
            if (!(mx4Var3 == null && mx4Var4 == null) && ((mx4Var3 == null || mx4Var4 == null || q(mx4Var3, mx4Var4)) && (animatorJ = j(viewGroup, mx4Var3, mx4Var4)) != null)) {
                String str = this.n;
                if (mx4Var4 != null) {
                    i2 = 0;
                    view = mx4Var4.b;
                    String[] strArrO = o();
                    if (strArrO != null && strArrO.length > 0) {
                        mx4Var2 = new mx4(view);
                        i = i4;
                        mx4 mx4Var5 = (mx4) ((oi) bq4Var2.n).get(view);
                        if (mx4Var5 != null) {
                            int i5 = 0;
                            while (i5 < strArrO.length) {
                                String str2 = strArrO[i5];
                                mx4Var2.a.put(str2, mx4Var5.a.get(str2));
                                i5++;
                                mx4Var5 = mx4Var5;
                            }
                        }
                        int i6 = oiVarN.p;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                animator = animatorJ;
                                break;
                            }
                            ax4 ax4Var = (ax4) oiVarN.get((Animator) oiVarN.f(i7));
                            if (ax4Var.c != null && ax4Var.a == view && ax4Var.b.equals(str) && ax4Var.c.equals(mx4Var2)) {
                                animator = null;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        i = i4;
                        animator = animatorJ;
                        mx4Var2 = null;
                    }
                    animatorJ = animator;
                    mx4Var = mx4Var2;
                } else {
                    i = i4;
                    i2 = 0;
                    view = mx4Var3.b;
                    mx4Var = null;
                }
                if (animatorJ != null) {
                    cx cxVar = this.F;
                    if (cxVar != null) {
                        if (mx4Var3 == null && mx4Var4 == null) {
                            jRound = 0;
                        } else {
                            if (mx4Var4 == null) {
                                i3 = -1;
                            } else if (((mx4Var3 == null || (num = (Integer) mx4Var3.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                                i3 = -1;
                            } else {
                                i3 = 1;
                                mx4Var3 = mx4Var4;
                            }
                            int i8 = (mx4Var3 == null || (iArr2 = (int[]) mx4Var3.a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[i2];
                            int i9 = (mx4Var3 == null || (iArr = (int[]) mx4Var3.a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[1];
                            int[] iArr3 = new int[2];
                            viewGroup.getLocationOnScreen(iArr3);
                            int iRound = Math.round(viewGroup.getTranslationX()) + iArr3[i2];
                            int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr3[1];
                            int width = viewGroup.getWidth() + iRound;
                            int height = viewGroup.getHeight() + iRound2;
                            int i10 = (iRound + width) / 2;
                            int i11 = (iRound2 + height) / 2;
                            int i12 = cxVar.a;
                            int i13 = i9;
                            if (i12 == 8388611) {
                                WeakHashMap weakHashMap = j65.a;
                                if (viewGroup.getLayoutDirection() == 1) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                            } else if (i12 == 8388613) {
                                WeakHashMap weakHashMap2 = j65.a;
                                if (viewGroup.getLayoutDirection() == 1) {
                                    i12 = 3;
                                } else {
                                    i12 = 5;
                                }
                            }
                            if (i12 == 3) {
                                iAbs = (width - i8) + Math.abs(i11 - i13);
                            } else if (i12 == 5) {
                                iAbs = Math.abs(i11 - i13) + (i8 - iRound);
                            } else if (i12 != 48) {
                                iAbs = i12 != 80 ? i2 : Math.abs(i10 - i8) + (i13 - iRound2);
                            } else {
                                iAbs = Math.abs(i10 - i8) + (height - i13);
                            }
                            float f = iAbs;
                            int i14 = cxVar.a;
                            float width2 = f / ((i14 == 3 || i14 == 5 || i14 == 8388611 || i14 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                            long j = this.p;
                            if (j < 0) {
                                j = 300;
                            }
                            jRound = Math.round(((j * ((long) i3)) / 3.0f) * width2);
                        }
                        sparseIntArray.put(this.E.size(), (int) jRound);
                        jMin = Math.min(jRound, jMin);
                    }
                    f85 f85Var = d85.a;
                    ja5 ja5Var = new ja5(viewGroup);
                    ax4 ax4Var2 = new ax4();
                    ax4Var2.a = view;
                    ax4Var2.b = str;
                    ax4Var2.c = mx4Var;
                    ax4Var2.d = ja5Var;
                    ax4Var2.e = this;
                    oiVarN.put(animatorJ, ax4Var2);
                    this.E.add(animatorJ);
                }
            } else {
                size = size;
                i = i4;
            }
            i4 = i + 1;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.E.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - jMin));
            }
        }
    }

    public final void l() {
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bx4) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < ((xe2) this.t.p).h(); i3++) {
                View view = (View) ((xe2) this.t.p).i(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = j65.a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((xe2) this.u.p).h(); i4++) {
                View view2 = (View) ((xe2) this.u.p).i(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = j65.a;
                    view2.setHasTransientState(false);
                }
            }
            this.C = true;
        }
    }

    public final mx4 m(View view, boolean z) {
        kx4 kx4Var = this.v;
        if (kx4Var != null) {
            return kx4Var.m(view, z);
        }
        ArrayList arrayList = z ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            mx4 mx4Var = (mx4) arrayList.get(i);
            if (mx4Var == null) {
                return null;
            }
            if (mx4Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (mx4) (z ? this.y : this.x).get(i);
        }
        return null;
    }

    public String[] o() {
        return null;
    }

    public final mx4 p(View view, boolean z) {
        kx4 kx4Var = this.v;
        if (kx4Var != null) {
            return kx4Var.p(view, z);
        }
        return (mx4) ((oi) (z ? this.t : this.u).n).get(view);
    }

    public boolean q(mx4 mx4Var, mx4 mx4Var2) {
        if (mx4Var != null && mx4Var2 != null) {
            String[] strArrO = o();
            if (strArrO != null) {
                for (String str : strArrO) {
                    if (s(mx4Var, mx4Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = mx4Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (s(mx4Var, mx4Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean r(View view) {
        int id = view.getId();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        ArrayList arrayList2 = this.s;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void t(View view) {
        if (this.C) {
            return;
        }
        ArrayList arrayList = this.z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.D;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.D.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((bx4) arrayList3.get(i)).b();
            }
        }
        this.B = true;
    }

    public final String toString() {
        return E("");
    }

    public void u(bx4 bx4Var) {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bx4Var);
        if (this.D.size() == 0) {
            this.D = null;
        }
    }

    public void v(View view) {
        if (this.B) {
            if (!this.C) {
                ArrayList arrayList = this.z;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.D;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.D.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((bx4) arrayList3.get(i)).e();
                    }
                }
            }
            this.B = false;
        }
    }

    public void w() {
        D();
        oi oiVarN = n();
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (oiVarN.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new kw0(this, oiVarN));
                    long j = this.p;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.o;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.q;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l4(14, this));
                    animator.start();
                }
            }
        }
        this.E.clear();
        l();
    }

    public void x(long j) {
        this.p = j;
    }

    public void y(hw hwVar) {
    }

    public void z(TimeInterpolator timeInterpolator) {
        this.q = timeInterpolator;
    }
}
