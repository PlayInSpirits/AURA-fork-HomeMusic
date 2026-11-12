package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf3 extends v1 implements Collection, y32 {
    public y1 n;
    public Object[] o;
    public Object[] p;
    public int q;
    public tv1 r = new tv1();
    public Object[] s;
    public Object[] t;
    public int u;

    public xf3(y1 y1Var, Object[] objArr, Object[] objArr2, int i) {
        this.n = y1Var;
        this.o = objArr;
        this.p = objArr2;
        this.q = i;
        this.s = objArr;
        this.t = objArr2;
        this.u = y1Var.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, t3 t3Var) {
        int iT = uc5.t(i2, i);
        if (i == 0) {
            Object obj = objArr[iT];
            Object[] objArrL = l(objArr);
            ti.Z(iT, iT + 1, 32, objArr, objArrL);
            objArrL[31] = t3Var.a;
            t3Var.a = obj;
            return objArrL;
        }
        int iT2 = objArr[31] == null ? uc5.t(C() - 1, i) : 31;
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        int i4 = iT + 1;
        if (i4 <= iT2) {
            while (true) {
                Object obj2 = objArrL2[iT2];
                obj2.getClass();
                objArrL2[iT2] = A((Object[]) obj2, i3, 0, t3Var);
                if (iT2 == i4) {
                    break;
                }
                iT2--;
            }
        }
        Object obj3 = objArrL2[iT];
        obj3.getClass();
        objArrL2[iT] = A((Object[]) obj3, i3, i2, t3Var);
        return objArrL2;
    }

    public final Object B(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.u - i;
        Object[] objArr2 = this.t;
        if (i4 == 1) {
            Object obj = objArr2[0];
            r(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrL = l(objArr2);
        ti.Z(i3, i3 + 1, i4, objArr2, objArrL);
        objArrL[i4 - 1] = null;
        this.s = objArr;
        this.t = objArrL;
        this.u = (i + i4) - 1;
        this.q = i2;
        return obj2;
    }

    public final int C() {
        int i = this.u;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        int iT = uc5.t(i2, i);
        Object[] objArrL = l(objArr);
        if (i != 0) {
            Object obj2 = objArrL[iT];
            obj2.getClass();
            objArrL[iT] = D((Object[]) obj2, i - 5, i2, obj, t3Var);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        t3Var.a = objArrL[iT];
        objArrL[iT] = obj;
        return objArrL;
    }

    public final void E(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrN;
        if (i3 < 1) {
            oo3.a("requires at least one nullBuffer");
        }
        Object[] objArrL = l(objArr);
        objArr2[0] = objArrL;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ti.Z(size + 1, i4, i2, objArrL, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = n();
                i3--;
                objArr2[i3] = objArrN;
            }
            int i7 = i2 - i6;
            ti.Z(0, i7, i2, objArrL, objArr3);
            ti.Z(size + 1, i4, i7, objArrL, objArrN);
            objArr3 = objArrN;
        }
        Iterator it = collection.iterator();
        e(objArrL, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrN2 = n();
            e(objArrN2, 0, it);
            objArr2[i8] = objArrN2;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i = this.u;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.v1
    public final int a() {
        return this.u;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        uo.i(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            i(i - iC, obj, this.s);
            return;
        }
        t3 t3Var = new t3(null);
        Object[] objArr = this.s;
        objArr.getClass();
        i(0, t3Var.a, h(objArr, this.q, i, obj, t3Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrN;
        uo.i(i, this.u);
        if (i == this.u) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.u - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.t;
            Object[] objArrL = l(objArr);
            ti.Z(size2 + 1, i3, F(), objArr, objArrL);
            e(objArrL, i3, collection.iterator());
            this.t = objArrL;
            this.u = collection.size() + this.u;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iF = F();
        int size3 = collection.size() + this.u;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            objArrN = n();
            collection2 = collection;
            E(collection2, i, this.t, iF, objArr2, size, objArrN);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.t;
            if (size3 > iF) {
                int i4 = size3 - iF;
                Object[] objArrM = m(i4, objArr3);
                g(collection2, i, i4, objArr2, size, objArrM);
                objArr2 = objArr2;
                objArrN = objArrM;
            } else {
                objArrN = n();
                int i5 = iF - size3;
                ti.Z(0, i5, iF, objArr3, objArrN);
                int i6 = 32 - i5;
                Object[] objArrM2 = m(i6, this.t);
                int i7 = size - 1;
                objArr2[i7] = objArrM2;
                g(collection2, i, i6, objArr2, i7, objArrM2);
                collection2 = collection2;
            }
        }
        this.s = t(this.s, i2, objArr2);
        this.t = objArrN;
        this.u = collection2.size() + this.u;
        return true;
    }

    @Override // defpackage.v1
    public final Object b(int i) {
        uo.e(i, a());
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            return B(this.s, iC, this.q, i - iC);
        }
        t3 t3Var = new t3(this.t[0]);
        Object[] objArr = this.s;
        objArr.getClass();
        B(A(objArr, this.q, i, t3Var), iC, this.q, 0);
        return t3Var.a;
    }

    public final y1 d() {
        y1 wf3Var;
        Object[] objArr = this.s;
        if (objArr == this.o && this.t == this.p) {
            wf3Var = this.n;
        } else {
            this.r = new tv1();
            this.o = objArr;
            Object[] objArr2 = this.t;
            this.p = objArr2;
            if (objArr == null) {
                wf3Var = objArr2.length == 0 ? og4.o : new og4(Arrays.copyOf(objArr2, this.u));
            } else {
                wf3Var = new wf3(objArr, objArr2, this.u, this.q);
            }
        }
        this.n = wf3Var;
        return wf3Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.s == null) {
            kf2.o("root is null");
            return;
        }
        int i4 = i >> 5;
        b1 b1VarK = k(C() >> 5);
        int i5 = i3;
        Object[] objArrM = objArr2;
        while (b1VarK.n - 1 != i4) {
            Object[] objArr3 = (Object[]) b1VarK.previous();
            ti.Z(0, 32 - i2, 32, objArr3, objArrM);
            objArrM = m(i2, objArr3);
            i5--;
            objArr[i5] = objArrM;
        }
        Object[] objArr4 = (Object[]) b1VarK.previous();
        int iC = i3 - (((C() >> 5) - 1) - i4);
        if (iC < i3) {
            objArr2 = objArr[iC];
            objArr2.getClass();
        }
        E(collection, i, objArr4, 32, objArr, iC, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        uo.e(i, a());
        if (C() <= i) {
            objArr = this.t;
        } else {
            Object[] objArr2 = this.s;
            objArr2.getClass();
            for (int i2 = this.q; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uc5.t(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        Object obj2;
        int iT = uc5.t(i2, i);
        if (i == 0) {
            t3Var.a = objArr[31];
            Object[] objArrL = l(objArr);
            ti.Z(iT + 1, iT, 31, objArr, objArrL);
            objArrL[iT] = obj;
            return objArrL;
        }
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        Object obj3 = objArrL2[iT];
        obj3.getClass();
        objArrL2[iT] = h((Object[]) obj3, i3, i2, obj, t3Var);
        while (true) {
            iT++;
            if (iT >= 32 || (obj2 = objArrL2[iT]) == null) {
                break;
            }
            objArrL2[iT] = h((Object[]) obj2, i3, 0, t3Var.a, t3Var);
        }
        return objArrL2;
    }

    public final void i(int i, Object obj, Object[] objArr) {
        int iF = F();
        Object[] objArrL = l(this.t);
        Object[] objArr2 = this.t;
        if (iF >= 32) {
            Object obj2 = objArr2[31];
            ti.Z(i + 1, i, 31, objArr2, objArrL);
            objArrL[i] = obj;
            u(objArr, objArrL, o(obj2));
            return;
        }
        ti.Z(i + 1, i, iF, objArr2, objArrL);
        objArrL[i] = obj;
        this.s = objArr;
        this.t = objArrL;
        this.u++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.r;
    }

    public final b1 k(int i) {
        Object[] objArr = this.s;
        if (objArr == null) {
            kf2.o("Invalid root");
            return null;
        }
        int iC = C() >> 5;
        uo.i(i, iC);
        int i2 = this.q;
        return i2 == 0 ? new vv(i, objArr) : new wx4(objArr, i, iC, i2 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] objArrN = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ti.c0(0, length, 6, objArr, objArrN);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        uo.i(i, this.u);
        return new zf3(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            ti.Z(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrN = n();
        ti.Z(i, 0, 32 - i, objArr, objArrN);
        return objArrN;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.r;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.r;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            oo3.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iT = uc5.t(i, i2);
        Object obj = objArr[iT];
        obj.getClass();
        Object objP = p((Object[]) obj, i, i2 - 5);
        if (iT < 31) {
            int i3 = iT + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrN = n();
                ti.Z(0, 0, i3, objArr, objArrN);
                objArr = objArrN;
            }
        }
        if (objP == objArr[iT]) {
            return objArr;
        }
        Object[] objArrL = l(objArr);
        objArrL[iT] = objP;
        return objArrL;
    }

    public final Object[] q(Object[] objArr, int i, int i2, t3 t3Var) {
        Object[] objArrQ;
        int iT = uc5.t(i2 - 1, i);
        if (i == 5) {
            t3Var.a = objArr[iT];
            objArrQ = null;
        } else {
            Object obj = objArr[iT];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, t3Var);
        }
        if (objArrQ == null && iT == 0) {
            return null;
        }
        Object[] objArrL = l(objArr);
        objArrL[iT] = objArrQ;
        return objArrL;
    }

    public final void r(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.s = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.t = objArr;
            this.u = i;
            this.q = i2;
            return;
        }
        t3 t3Var = new t3(null);
        objArr.getClass();
        Object[] objArrQ = q(objArr, i2, i, t3Var);
        objArrQ.getClass();
        Object obj = t3Var.a;
        obj.getClass();
        this.t = (Object[]) obj;
        this.u = i;
        if (objArrQ[1] == null) {
            this.s = (Object[]) objArrQ[0];
            this.q = i2 - 5;
        } else {
            this.s = objArrQ;
            this.q = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new x1(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            oo3.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            oo3.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrL = l(objArr);
        int iT = uc5.t(i, i2);
        int i3 = i2 - 5;
        objArrL[iT] = s((Object[]) objArrL[iT], i, i3, it);
        while (true) {
            iT++;
            if (iT >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iT] = s((Object[]) objArrL[iT], 0, i3, it);
        }
        return objArrL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        uo.e(i, a());
        if (C() > i) {
            t3 t3Var = new t3(null);
            Object[] objArr = this.s;
            objArr.getClass();
            this.s = D(objArr, this.q, i, obj, t3Var);
            return t3Var.a;
        }
        Object[] objArrL = l(this.t);
        if (objArrL != this.t) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrL[i2];
        objArrL[i2] = obj;
        this.t = objArrL;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        x0 x0Var = new x0(objArr2);
        int i2 = i >> 5;
        int i3 = this.q;
        Object[] objArrS = i2 < (1 << i3) ? s(objArr, i, i3, x0Var) : l(objArr);
        while (x0Var.hasNext()) {
            this.q += 5;
            objArrS = o(objArrS);
            int i4 = this.q;
            s(objArrS, 1 << i4, i4, x0Var);
        }
        return objArrS;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.u;
        int i2 = i >> 5;
        int i3 = this.q;
        if (i2 > (1 << i3)) {
            this.s = v(this.q + 5, o(objArr), objArr2);
            this.t = objArr3;
            this.q += 5;
            this.u++;
            return;
        }
        if (objArr == null) {
            this.s = objArr2;
            this.t = objArr3;
            this.u = i + 1;
        } else {
            this.s = v(i3, objArr, objArr2);
            this.t = objArr3;
            this.u++;
        }
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        int iT = uc5.t(a() - 1, i);
        Object[] objArrL = l(objArr);
        if (i == 5) {
            objArrL[iT] = objArr2;
            return objArrL;
        }
        objArrL[iT] = v(i - 5, (Object[]) objArrL[iT], objArr2);
        return objArrL;
    }

    public final int w(if1 if1Var, Object[] objArr, int i, int i2, t3 t3Var, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = t3Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrN = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) if1Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrN = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArrN[i2] = obj2;
                i2++;
            }
        }
        t3Var.a = objArrN;
        if (objArr2 != objArrN) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int x(if1 if1Var, Object[] objArr, int i, t3 t3Var) {
        Object[] objArrL = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) if1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrL = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrL[i2] = obj;
                i2++;
            }
        }
        t3Var.a = objArrL;
        return i2;
    }

    public final int y(if1 if1Var, int i, t3 t3Var) {
        int iX = x(if1Var, this.t, i, t3Var);
        Object obj = t3Var.a;
        if (iX == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iX, i, (Object) null);
        this.t = objArr;
        this.u -= i - iX;
        return iX;
    }

    public final boolean z(if1 if1Var) {
        int i;
        if1 if1Var2 = if1Var;
        int iF = F();
        Object[] objArrP = null;
        t3 t3Var = new t3(null);
        boolean z = false;
        if (this.s != null) {
            b1 b1VarK = k(0);
            int iX = 32;
            while (iX == 32 && b1VarK.hasNext()) {
                iX = x(if1Var2, (Object[]) b1VarK.next(), 32, t3Var);
            }
            if (iX == 32) {
                int iY = y(if1Var2, iF, t3Var);
                if (iY == 0) {
                    r(this.s, this.u, this.q);
                }
                if (iY != iF) {
                }
            } else {
                int i2 = (b1VarK.n - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iW = iX;
                while (b1VarK.hasNext()) {
                    iW = w(if1Var2, (Object[]) b1VarK.next(), 32, iW, t3Var, arrayList2, arrayList);
                    if1Var2 = if1Var;
                }
                int iW2 = w(if1Var, this.t, iF, iW, t3Var, arrayList2, arrayList);
                Object obj = t3Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iW2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrS = this.s;
                if (zIsEmpty) {
                    objArrS.getClass();
                } else {
                    objArrS = s(objArrS, i2, this.q, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    oo3.a("invalid size");
                }
                if (size == 0) {
                    this.q = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.q;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.q = i - 5;
                        Object[] objArr2 = objArrS[0];
                        objArr2.getClass();
                        objArrS = objArr2;
                    }
                    objArrP = p(objArrS, i3, i);
                }
                this.s = objArrP;
                this.t = objArr;
                this.u = size + iW2;
            }
            z = true;
        } else if (y(if1Var2, iF, t3Var) != iF) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iF = F();
        if (iF < 32) {
            Object[] objArrL = l(this.t);
            objArrL[iF] = obj;
            this.t = objArrL;
            this.u = a() + 1;
        } else {
            u(this.s, this.t, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        Iterator it = collection.iterator();
        if (32 - iF >= collection.size()) {
            Object[] objArrL = l(this.t);
            e(objArrL, iF, it);
            this.t = objArrL;
            this.u = collection.size() + this.u;
            return true;
        }
        int size = ((collection.size() + iF) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrL2 = l(this.t);
        e(objArrL2, iF, it);
        objArr[0] = objArrL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrN = n();
            e(objArrN, 0, it);
            objArr[i] = objArrN;
        }
        this.s = t(this.s, C(), objArr);
        Object[] objArrN2 = n();
        e(objArrN2, 0, it);
        this.t = objArrN2;
        this.u = collection.size() + this.u;
        return true;
    }
}
