package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wf3 extends y1 {
    public final Object[] n;
    public final Object[] o;
    public final int p;
    public final int q;

    public wf3(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.n = objArr;
        this.o = objArr2;
        this.p = i;
        this.q = i2;
        if (!(a() > 32)) {
            oo3.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        int iT = uc5.t(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iT == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ti.Z(iT + 1, iT, 31, objArr, objArrCopyOf);
            t3Var.a = objArr[31];
            objArrCopyOf[iT] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iT];
        obj2.getClass();
        objArrCopyOf2[iT] = j((Object[]) obj2, i3, i2, obj, t3Var);
        while (true) {
            iT++;
            if (iT >= 32 || objArrCopyOf2[iT] == null) {
                break;
            }
            Object obj3 = objArr[iT];
            obj3.getClass();
            objArrCopyOf2[iT] = j((Object[]) obj3, i3, 0, t3Var.a, t3Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] l(Object[] objArr, int i, int i2, t3 t3Var) {
        Object[] objArrL;
        int iT = uc5.t(i2, i);
        if (i == 5) {
            t3Var.a = objArr[iT];
            objArrL = null;
        } else {
            Object obj = objArr[iT];
            obj.getClass();
            objArrL = l((Object[]) obj, i - 5, i2, t3Var);
        }
        if (objArrL == null && iT == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iT] = objArrL;
        return objArrCopyOf;
    }

    public static Object[] r(int i, int i2, Object obj, Object[] objArr) {
        int iT = uc5.t(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iT] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iT];
        obj2.getClass();
        objArrCopyOf[iT] = r(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // defpackage.y1
    public final y1 b(int i, Object obj) {
        int i2 = this.p;
        uo.i(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int iQ = q();
        Object[] objArr = this.n;
        if (i >= iQ) {
            return k(i - iQ, obj, objArr);
        }
        t3 t3Var = new t3(null);
        return k(0, t3Var.a, j(objArr, this.q, i, obj, t3Var));
    }

    @Override // defpackage.y1
    public final y1 d(Object obj) {
        int iQ = q();
        int i = this.p;
        int i2 = i - iQ;
        Object[] objArr = this.n;
        Object[] objArr2 = this.o;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new wf3(objArr, objArrCopyOf, i + 1, this.q);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m(objArr, objArr2, objArr3);
    }

    @Override // defpackage.y1
    public final xf3 f() {
        return new xf3(this, this.n, this.o, this.q);
    }

    @Override // defpackage.y1
    public final y1 g(x1 x1Var) {
        xf3 xf3Var = new xf3(this, this.n, this.o, this.q);
        xf3Var.z(x1Var);
        return xf3Var.d();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        uo.e(i, a());
        if (q() <= i) {
            objArr = this.o;
        } else {
            Object[] objArr2 = this.n;
            for (int i2 = this.q; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uc5.t(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.y1
    public final y1 h(int i) {
        uo.e(i, a());
        int iQ = q();
        int i2 = this.q;
        Object[] objArr = this.n;
        return i >= iQ ? p(objArr, iQ, i2, i - iQ) : p(o(objArr, i2, i, new t3(this.o[0])), iQ, i2, 0);
    }

    @Override // defpackage.y1
    public final y1 i(int i, Object obj) {
        int i2 = this.p;
        uo.e(i, i2);
        int iQ = q();
        Object[] objArr = this.n;
        Object[] objArr2 = this.o;
        int i3 = this.q;
        if (iQ > i) {
            return new wf3(r(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new wf3(objArr, objArrCopyOf, i2, i3);
    }

    public final wf3 k(int i, Object obj, Object[] objArr) {
        int iQ = q();
        int i2 = this.p;
        int i3 = i2 - iQ;
        Object[] objArr2 = this.o;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            ti.Z(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new wf3(objArr, objArrCopyOf, i2 + 1, this.q);
        }
        Object obj2 = objArr2[31];
        ti.Z(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, objArrCopyOf, objArr3);
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator(int i) {
        uo.i(i, this.p);
        return new yf3(i, this.p, (this.q / 5) + 1, this.n, this.o);
    }

    public final wf3 m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.p;
        int i2 = i >> 5;
        int i3 = this.q;
        if (i2 <= (1 << i3)) {
            return new wf3(n(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new wf3(n(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] n(int i, Object[] objArr, Object[] objArr2) {
        int iT = uc5.t(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iT] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iT] = n(i - 5, (Object[]) objArrCopyOf[iT], objArr2);
        return objArrCopyOf;
    }

    public final Object[] o(Object[] objArr, int i, int i2, t3 t3Var) {
        int iT = uc5.t(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iT == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ti.Z(iT, iT + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = t3Var.a;
            t3Var.a = objArr[iT];
            return objArrCopyOf;
        }
        int iT2 = objArr[31] == null ? uc5.t(q() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iT + 1;
        if (i4 <= iT2) {
            while (true) {
                Object obj = objArrCopyOf2[iT2];
                obj.getClass();
                objArrCopyOf2[iT2] = o((Object[]) obj, i3, 0, t3Var);
                if (iT2 == i4) {
                    break;
                }
                iT2--;
            }
        }
        Object obj2 = objArrCopyOf2[iT];
        obj2.getClass();
        objArrCopyOf2[iT] = o((Object[]) obj2, i3, i2, t3Var);
        return objArrCopyOf2;
    }

    public final y1 p(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.p - i;
        if (i4 != 1) {
            Object[] objArr2 = this.o;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                ti.Z(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new wf3(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new og4(objArr);
        }
        t3 t3Var = new t3(null);
        Object[] objArrL = l(objArr, i2, i - 1, t3Var);
        objArrL.getClass();
        Object obj = t3Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrL[1] != null) {
            return new wf3(objArrL, objArr3, i, i2);
        }
        Object obj2 = objArrL[0];
        obj2.getClass();
        return new wf3((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int q() {
        return (this.p - 1) & (-32);
    }
}
